package y1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import g1.k;
import g1.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4727a;
    private static volatile Choreographer choreographer;

    static {
        Object a3;
        try {
            k.a aVar = k.f2859e;
            a3 = k.a(new a(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            k.a aVar2 = k.f2859e;
            a3 = k.a(l.a(th));
        }
        f4727a = (b) (k.c(a3) ? null : a3);
    }

    public static final Handler a(Looper looper, boolean z2) {
        if (!z2) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (invoke != null) {
            return (Handler) invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }
}
