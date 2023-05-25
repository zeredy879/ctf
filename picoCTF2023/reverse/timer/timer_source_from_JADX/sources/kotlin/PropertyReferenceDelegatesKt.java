package kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;

@Metadata(mo14702d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\n¢\u0006\u0002\u0010\u0007\u001a>\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00010\t2\u0006\u0010\u0003\u001a\u0002H\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\n¢\u0006\u0002\u0010\n\u001a<\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000e\u001a\u0002H\u0001H\n¢\u0006\u0002\u0010\u000f\u001aF\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00010\u00102\u0006\u0010\u0003\u001a\u0002H\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000e\u001a\u0002H\u0001H\n¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, mo14703d2 = {"getValue", "V", "Lkotlin/reflect/KProperty0;", "thisRef", "", "property", "Lkotlin/reflect/KProperty;", "(Lkotlin/reflect/KProperty0;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "T", "Lkotlin/reflect/KProperty1;", "(Lkotlin/reflect/KProperty1;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "Lkotlin/reflect/KMutableProperty0;", "value", "(Lkotlin/reflect/KMutableProperty0;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Lkotlin/reflect/KMutableProperty1;", "(Lkotlin/reflect/KMutableProperty1;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo14704k = 2, mo14705mv = {1, 6, 0}, mo14707xi = 48)
/* compiled from: PropertyReferenceDelegates.kt */
public final class PropertyReferenceDelegatesKt {
    private static final <V> V getValue(KProperty0<? extends V> $this$getValue, Object thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter($this$getValue, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return $this$getValue.get();
    }

    private static final <V> void setValue(KMutableProperty0<V> $this$setValue, Object thisRef, KProperty<?> property, V value) {
        Intrinsics.checkNotNullParameter($this$setValue, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        $this$setValue.set(value);
    }

    private static final <T, V> V getValue(KProperty1<T, ? extends V> $this$getValue, T thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter($this$getValue, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return $this$getValue.get(thisRef);
    }

    private static final <T, V> void setValue(KMutableProperty1<T, V> $this$setValue, T thisRef, KProperty<?> property, V value) {
        Intrinsics.checkNotNullParameter($this$setValue, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        $this$setValue.set(thisRef, value);
    }
}