package androidx.core.util;

import java.util.Objects;

/* loaded from: classes.dex */
public class d {

    static class a {
        static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return a.a(obj, obj2);
    }

    public static int b(Object... objArr) {
        return a.b(objArr);
    }

    public static <T> T c(T t2) {
        t2.getClass();
        return t2;
    }

    public static <T> T d(T t2, String str) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(str);
    }
}
