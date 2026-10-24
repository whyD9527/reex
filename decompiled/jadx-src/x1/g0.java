package x1;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<CoroutineExceptionHandler> f4408a;

    static {
        v1.b a3;
        List<CoroutineExceptionHandler> e3;
        a3 = v1.f.a(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator());
        e3 = v1.h.e(a3);
        f4408a = e3;
    }

    public static final void a(j1.g gVar, Throwable th) {
        Iterator<CoroutineExceptionHandler> it = f4408a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, h0.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
