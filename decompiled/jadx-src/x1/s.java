package x1;

/* loaded from: classes.dex */
public final class s extends m1 implements r {

    /* renamed from: i, reason: collision with root package name */
    public final t f4447i;

    public s(t tVar) {
        this.f4447i = tVar;
    }

    @Override // x1.r
    public boolean f(Throwable th) {
        return z().C(th);
    }

    @Override // x1.r
    public k1 getParent() {
        return z();
    }

    @Override // q1.l
    public /* bridge */ /* synthetic */ g1.q invoke(Throwable th) {
        y(th);
        return g1.q.f2865a;
    }

    @Override // x1.b0
    public void y(Throwable th) {
        this.f4447i.f(z());
    }
}
