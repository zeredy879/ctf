package kotlin.sequences;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo14702d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, mo14703d2 = {"sum", "Lkotlin/UInt;", "Lkotlin/sequences/Sequence;", "Lkotlin/UByte;", "sumOfUByte", "(Lkotlin/sequences/Sequence;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UShort;", "sumOfUShort", "kotlin-stdlib"}, mo14704k = 5, mo14705mv = {1, 6, 0}, mo14707xi = 49, mo14708xs = "kotlin/sequences/USequencesKt")
/* compiled from: _USequences.kt */
class USequencesKt___USequencesKt {
    public static final int sumOfUInt(Sequence<UInt> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        for (UInt r2 : $this$sum) {
            sum = UInt.m166constructorimpl(sum + r2.m217unboximpl());
        }
        return sum;
    }

    public static final long sumOfULong(Sequence<ULong> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        long sum = 0;
        for (ULong r3 : $this$sum) {
            sum = ULong.m244constructorimpl(sum + r3.m295unboximpl());
        }
        return sum;
    }

    public static final int sumOfUByte(Sequence<UByte> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        for (UByte r2 : $this$sum) {
            sum = UInt.m166constructorimpl(UInt.m166constructorimpl(r2.m139unboximpl() & UByte.MAX_VALUE) + sum);
        }
        return sum;
    }

    public static final int sumOfUShort(Sequence<UShort> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        for (UShort r2 : $this$sum) {
            sum = UInt.m166constructorimpl(UInt.m166constructorimpl(65535 & r2.m399unboximpl()) + sum);
        }
        return sum;
    }
}
