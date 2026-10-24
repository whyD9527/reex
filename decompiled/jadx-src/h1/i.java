package h1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class i {
    public static final <T> Object[] a(T[] tArr, boolean z2) {
        kotlin.jvm.internal.k.e(tArr, "<this>");
        if (z2 && kotlin.jvm.internal.k.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.k.d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static final <T> List<T> b(T t2) {
        List<T> singletonList = Collections.singletonList(t2);
        kotlin.jvm.internal.k.d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
