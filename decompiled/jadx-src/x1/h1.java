package x1;

/* loaded from: classes.dex */
final class h1 extends i {

    /* renamed from: e, reason: collision with root package name */
    private final q1.l<Throwable, g1.q> f4410e;

    /* JADX WARN: Multi-variable type inference failed */
    public h1(q1.l<? super Throwable, g1.q> lVar) {
        this.f4410e = lVar;
    }

    @Override // x1.j
    public void a(Throwable th) {
        this.f4410e.invoke(th);
    }

    @Override // q1.l
    public /* bridge */ /* synthetic */ g1.q invoke(Throwable th) {
        a(th);
        return g1.q.f2865a;
    }

    public String toString() {
        return "InvokeOnCancel[" + m0.a(this.f4410e) + '@' + m0.b(this) + ']';
    }
}
