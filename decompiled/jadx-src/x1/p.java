package x1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class p extends z {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4433c = AtomicIntegerFieldUpdater.newUpdater(p.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(j1.d<?> dVar, Throwable th, boolean z2) {
        super(th, z2);
        if (th == null) {
            th = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        this._resumed = 0;
    }

    public final boolean c() {
        return f4433c.compareAndSet(this, 0, 1);
    }
}
