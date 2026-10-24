package x1;

import java.util.concurrent.locks.LockSupport;
import x1.w0;

/* loaded from: classes.dex */
public abstract class x0 extends v0 {
    protected final void A() {
        Thread y2 = y();
        if (Thread.currentThread() != y2) {
            c.a();
            LockSupport.unpark(y2);
        }
    }

    protected abstract Thread y();

    protected final void z(long j2, w0.a aVar) {
        n0.f4429k.L(j2, aVar);
    }
}
