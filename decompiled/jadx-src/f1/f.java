package f1;

import android.annotation.TargetApi;
import b.j;

@TargetApi(19)
/* loaded from: classes.dex */
public final class f implements AutoCloseable {
    private f(String str) {
        a(str);
    }

    public static void a(String str) {
        e0.a.c(c(str));
    }

    public static void b(String str, int i2) {
        e0.a.a(c(str), i2);
    }

    private static String c(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, j.N0) + "...";
    }

    public static void d() {
        e0.a.f();
    }

    public static void e(String str, int i2) {
        e0.a.d(c(str), i2);
    }

    public static f f(String str) {
        return new f(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        d();
    }
}
