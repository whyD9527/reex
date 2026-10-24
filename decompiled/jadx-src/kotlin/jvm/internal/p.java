package kotlin.jvm.internal;

import q1.q;
import q1.r;
import q1.s;
import q1.t;
import q1.u;
import q1.v;
import q1.w;

/* loaded from: classes.dex */
public class p {
    public static Object a(Object obj, int i2) {
        if (obj != null && !c(obj, i2)) {
            f(obj, "kotlin.jvm.functions.Function" + i2);
        }
        return obj;
    }

    public static int b(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).getArity();
        }
        if (obj instanceof q1.a) {
            return 0;
        }
        if (obj instanceof q1.l) {
            return 1;
        }
        if (obj instanceof q1.p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof q1.b) {
            return 10;
        }
        if (obj instanceof q1.c) {
            return 11;
        }
        if (obj instanceof q1.d) {
            return 12;
        }
        if (obj instanceof q1.e) {
            return 13;
        }
        if (obj instanceof q1.f) {
            return 14;
        }
        if (obj instanceof q1.g) {
            return 15;
        }
        if (obj instanceof q1.h) {
            return 16;
        }
        if (obj instanceof q1.i) {
            return 17;
        }
        if (obj instanceof q1.j) {
            return 18;
        }
        if (obj instanceof q1.k) {
            return 19;
        }
        if (obj instanceof q1.m) {
            return 20;
        }
        if (obj instanceof q1.n) {
            return 21;
        }
        return obj instanceof q1.o ? 22 : -1;
    }

    public static boolean c(Object obj, int i2) {
        return (obj instanceof g1.c) && b(obj) == i2;
    }

    private static <T extends Throwable> T d(T t2) {
        return (T) k.i(t2, p.class.getName());
    }

    public static ClassCastException e(ClassCastException classCastException) {
        throw ((ClassCastException) d(classCastException));
    }

    public static void f(Object obj, String str) {
        g((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void g(String str) {
        throw e(new ClassCastException(str));
    }
}
