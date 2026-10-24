package x1;

import j1.e;
import j1.g;

/* loaded from: classes.dex */
public abstract class f0 extends j1.a implements j1.e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f4404e = new a(null);

    public static final class a extends j1.b<j1.e, f0> {

        /* renamed from: x1.f0$a$a, reason: collision with other inner class name */
        static final class C0070a extends kotlin.jvm.internal.l implements q1.l<g.b, f0> {

            /* renamed from: e, reason: collision with root package name */
            public static final C0070a f4405e = new C0070a();

            C0070a() {
                super(1);
            }

            @Override // q1.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f0 invoke(g.b bVar) {
                if (bVar instanceof f0) {
                    return (f0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(j1.e.f3607b, C0070a.f4405e);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public f0() {
        super(j1.e.f3607b);
    }

    @Override // j1.e
    public final void d(j1.d<?> dVar) {
        ((kotlinx.coroutines.internal.f) dVar).n();
    }

    @Override // j1.a, j1.g.b, j1.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    public abstract void i(j1.g gVar, Runnable runnable);

    @Override // j1.e
    public final <T> j1.d<T> l(j1.d<? super T> dVar) {
        return new kotlinx.coroutines.internal.f(this, dVar);
    }

    @Override // j1.a, j1.g
    public j1.g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public boolean o(j1.g gVar) {
        return true;
    }

    public String toString() {
        return m0.a(this) + '@' + m0.b(this);
    }
}
