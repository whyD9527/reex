package kotlin.jvm.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public class k {
    private k() {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            k();
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            l(str);
        }
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) h(new NullPointerException(str + " must not be null")));
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            m(str);
        }
    }

    public static int f(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    private static String g(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = k.class.getName();
        int i2 = 0;
        while (!stackTrace[i2].getClassName().equals(name)) {
            i2++;
        }
        while (stackTrace[i2].getClassName().equals(name)) {
            i2++;
        }
        StackTraceElement stackTraceElement = stackTrace[i2];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static <T extends Throwable> T h(T t2) {
        return (T) i(t2, k.class.getName());
    }

    static <T extends Throwable> T i(T t2, String str) {
        StackTraceElement[] stackTrace = t2.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t2;
    }

    public static String j(String str, Object obj) {
        return str + obj;
    }

    public static void k() {
        throw ((NullPointerException) h(new NullPointerException()));
    }

    public static void l(String str) {
        throw ((NullPointerException) h(new NullPointerException(str)));
    }

    private static void m(String str) {
        throw ((NullPointerException) h(new NullPointerException(g(str))));
    }

    public static void n(String str) {
        throw ((g1.p) h(new g1.p(str)));
    }

    public static void o(String str) {
        n("lateinit property " + str + " has not been initialized");
    }
}
