package x1;

import j1.g;

/* loaded from: classes.dex */
final class e2 implements g.b, g.c<e2> {

    /* renamed from: e, reason: collision with root package name */
    public static final e2 f4402e = new e2();

    private e2() {
    }

    @Override // j1.g
    public <R> R fold(R r2, q1.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r2, pVar);
    }

    @Override // j1.g.b, j1.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // j1.g.b
    public g.c<?> getKey() {
        return this;
    }

    @Override // j1.g
    public j1.g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // j1.g
    public j1.g plus(j1.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
