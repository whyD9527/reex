package h1;

import java.util.Set;

/* loaded from: classes.dex */
class f0 extends e0 {
    public static <T> Set<T> b() {
        return v.f2910e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> c(Set<? extends T> set) {
        Set<T> b3;
        kotlin.jvm.internal.k.e(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : e0.a(set.iterator().next());
        }
        b3 = b();
        return b3;
    }
}
