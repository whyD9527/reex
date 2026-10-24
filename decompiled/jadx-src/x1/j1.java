package x1;

/* loaded from: classes.dex */
final class j1 extends q1 {

    /* renamed from: i, reason: collision with root package name */
    private final q1.l<Throwable, g1.q> f4413i;

    /* JADX WARN: Multi-variable type inference failed */
    public j1(q1.l<? super Throwable, g1.q> lVar) {
        this.f4413i = lVar;
    }

    @Override // q1.l
    public /* bridge */ /* synthetic */ g1.q invoke(Throwable th) {
        y(th);
        return g1.q.f2865a;
    }

    @Override // x1.b0
    public void y(Throwable th) {
        this.f4413i.invoke(th);
    }
}
