package j1;

import j1.g;
import kotlin.jvm.internal.k;
import q1.p;

/* loaded from: classes.dex */
public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> key) {
        k.e(key, "key");
        this.key = key;
    }

    @Override // j1.g
    public <R> R fold(R r2, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r2, pVar);
    }

    @Override // j1.g.b, j1.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // j1.g.b
    public g.c<?> getKey() {
        return this.key;
    }

    @Override // j1.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // j1.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
