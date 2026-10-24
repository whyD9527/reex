package x1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class c1 extends b1 {

    /* renamed from: g, reason: collision with root package name */
    private final Executor f4395g;

    public c1(Executor executor) {
        this.f4395g = executor;
        kotlinx.coroutines.internal.d.a(q());
    }

    private final void p(j1.g gVar, RejectedExecutionException rejectedExecutionException) {
        o1.c(gVar, a1.a("The task was rejected", rejectedExecutionException));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor q2 = q();
        ExecutorService executorService = q2 instanceof ExecutorService ? (ExecutorService) q2 : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    public boolean equals(Object obj) {
        return (obj instanceof c1) && ((c1) obj).q() == q();
    }

    public int hashCode() {
        return System.identityHashCode(q());
    }

    @Override // x1.f0
    public void i(j1.g gVar, Runnable runnable) {
        try {
            Executor q2 = q();
            c.a();
            q2.execute(runnable);
        } catch (RejectedExecutionException e3) {
            c.a();
            p(gVar, e3);
            s0.b().i(gVar, runnable);
        }
    }

    public Executor q() {
        return this.f4395g;
    }

    @Override // x1.f0
    public String toString() {
        return q().toString();
    }
}
