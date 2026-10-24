package h1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends i {
    public static <T> List<T> c() {
        return t.f2908e;
    }

    public static <T> int d(List<? extends T> list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> e(T... elements) {
        List<T> a3;
        kotlin.jvm.internal.k.e(elements, "elements");
        if (elements.length <= 0) {
            return c();
        }
        a3 = e.a(elements);
        return a3;
    }

    public static <T> List<T> f(T... elements) {
        kotlin.jvm.internal.k.e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new a(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> g(List<? extends T> list) {
        kotlin.jvm.internal.k.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : i.b(list.get(0)) : c();
    }

    public static void h() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
