package e0;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f2628a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f2629b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f2630c;

    @SuppressLint({"NewApi"})
    public static void a(String str, int i2) {
        try {
            if (f2629b == null) {
                e.a(str, i2);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i2);
    }

    private static void b(String str, int i2) {
        try {
            if (f2629b == null) {
                f2629b = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f2629b.invoke(null, Long.valueOf(f2628a), str, Integer.valueOf(i2));
        } catch (Exception e3) {
            g("asyncTraceBegin", e3);
        }
    }

    public static void c(String str) {
        b.a(str);
    }

    @SuppressLint({"NewApi"})
    public static void d(String str, int i2) {
        try {
            if (f2630c == null) {
                e.b(str, i2);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i2);
    }

    private static void e(String str, int i2) {
        try {
            if (f2630c == null) {
                f2630c = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f2630c.invoke(null, Long.valueOf(f2628a), str, Integer.valueOf(i2));
        } catch (Exception e3) {
            g("asyncTraceEnd", e3);
        }
    }

    public static void f() {
        b.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }
}
