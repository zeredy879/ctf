package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo14702d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo14703d2 = {"<anonymous>", "", "Lkotlin/UShort;", "invoke"}, mo14704k = 3, mo14705mv = {1, 6, 0}, mo14707xi = 48)
/* compiled from: _UArrays.kt */
final class UArraysKt___UArraysKt$withIndex$4 extends Lambda implements Function0<Iterator<? extends UShort>> {
    final /* synthetic */ short[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$4(short[] sArr) {
        super(0);
        this.$this_withIndex = sArr;
    }

    public final Iterator<UShort> invoke() {
        return UShortArray.m411iteratorimpl(this.$this_withIndex);
    }
}
