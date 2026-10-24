package x1;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class h0 {
    public static final void a(j1.g gVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.f3648c);
            if (coroutineExceptionHandler == null) {
                g0.a(gVar, th);
            } else {
                coroutineExceptionHandler.handleException(gVar, th);
            }
        } catch (Throwable th2) {
            g0.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        g1.b.a(runtimeException, th);
        return runtimeException;
    }
}
