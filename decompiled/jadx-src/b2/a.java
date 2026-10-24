package b2;

import j1.g;
import q1.p;

/* loaded from: classes.dex */
public final class a implements g.b {

    /* renamed from: g, reason: collision with root package name */
    public static final C0034a f2378g = new C0034a(null);

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f2379e;

    /* renamed from: f, reason: collision with root package name */
    private final g.c<?> f2380f = f2378g;

    /* renamed from: b2.a$a, reason: collision with other inner class name */
    public static final class C0034a implements g.c<a> {
        private C0034a() {
        }

        public /* synthetic */ C0034a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public a(Throwable th) {
        this.f2379e = th;
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
        return this.f2380f;
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
