package x1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class o0<T> extends kotlinx.coroutines.internal.v<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4432h = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    private final boolean x0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f4432h.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // kotlinx.coroutines.internal.v, x1.a
    protected void s0(Object obj) {
        j1.d b3;
        if (x0()) {
            return;
        }
        b3 = k1.c.b(this.f3706g);
        kotlinx.coroutines.internal.g.c(b3, d0.a(obj, this.f3706g), null, 2, null);
    }

    @Override // kotlinx.coroutines.internal.v, x1.r1
    protected void w(Object obj) {
        s0(obj);
    }
}
