package androidx.core.util;

/* loaded from: classes.dex */
public final class e {
    public static int a(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T b(T t2) {
        t2.getClass();
        return t2;
    }

    public static <T> T c(T t2, Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
