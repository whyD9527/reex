package x1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
final class i1 extends m1 {

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4411j = AtomicIntegerFieldUpdater.newUpdater(i1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: i, reason: collision with root package name */
    private final q1.l<Throwable, g1.q> f4412i;

    /* JADX WARN: Multi-variable type inference failed */
    public i1(q1.l<? super Throwable, g1.q> lVar) {
        this.f4412i = lVar;
    }

    @Override // q1.l
    public /* bridge */ /* synthetic */ g1.q invoke(Throwable th) {
        y(th);
        return g1.q.f2865a;
    }

    @Override // x1.b0
    public void y(Throwable th) {
        if (f4411j.compareAndSet(this, 0, 1)) {
            this.f4412i.invoke(th);
        }
    }
}
