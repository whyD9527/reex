package z1;

import g1.k;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.x;
import x1.k;
import x1.m0;

/* loaded from: classes.dex */
public abstract class a<E> extends z1.c<E> implements f<E> {

    /* renamed from: z1.a$a, reason: collision with other inner class name */
    private static final class C0081a<E> implements g<E> {

        /* renamed from: a, reason: collision with root package name */
        public final a<E> f4773a;

        /* renamed from: b, reason: collision with root package name */
        private Object f4774b = z1.b.f4784d;

        public C0081a(a<E> aVar) {
            this.f4773a = aVar;
        }

        private final boolean c(Object obj) {
            if (!(obj instanceof j)) {
                return true;
            }
            j jVar = (j) obj;
            if (jVar.f4807h == null) {
                return false;
            }
            throw w.a(jVar.E());
        }

        private final Object d(j1.d<? super Boolean> dVar) {
            j1.d b3;
            Object c3;
            Object a3;
            b3 = k1.c.b(dVar);
            x1.m a4 = x1.o.a(b3);
            b bVar = new b(this, a4);
            while (true) {
                if (this.f4773a.p(bVar)) {
                    this.f4773a.w(a4, bVar);
                    break;
                }
                Object v2 = this.f4773a.v();
                e(v2);
                if (v2 instanceof j) {
                    j jVar = (j) v2;
                    if (jVar.f4807h == null) {
                        a3 = kotlin.coroutines.jvm.internal.b.a(false);
                    } else {
                        Throwable E = jVar.E();
                        k.a aVar = g1.k.f2859e;
                        a3 = g1.l.a(E);
                    }
                    a4.resumeWith(g1.k.a(a3));
                } else if (v2 != z1.b.f4784d) {
                    Boolean a5 = kotlin.coroutines.jvm.internal.b.a(true);
                    q1.l<E, g1.q> lVar = this.f4773a.f4788b;
                    a4.r(a5, lVar == null ? null : kotlinx.coroutines.internal.s.a(lVar, v2, a4.getContext()));
                }
            }
            Object w2 = a4.w();
            c3 = k1.d.c();
            if (w2 == c3) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return w2;
        }

        @Override // z1.g
        public Object a(j1.d<? super Boolean> dVar) {
            Object b3 = b();
            x xVar = z1.b.f4784d;
            if (b3 == xVar) {
                e(this.f4773a.v());
                if (b() == xVar) {
                    return d(dVar);
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(c(b()));
        }

        public final Object b() {
            return this.f4774b;
        }

        public final void e(Object obj) {
            this.f4774b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // z1.g
        public E next() {
            E e3 = (E) this.f4774b;
            if (e3 instanceof j) {
                throw w.a(((j) e3).E());
            }
            x xVar = z1.b.f4784d;
            if (e3 == xVar) {
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            this.f4774b = xVar;
            return e3;
        }
    }

    private static class b<E> extends o<E> {

        /* renamed from: h, reason: collision with root package name */
        public final C0081a<E> f4775h;

        /* renamed from: i, reason: collision with root package name */
        public final x1.k<Boolean> f4776i;

        /* JADX WARN: Multi-variable type inference failed */
        public b(C0081a<E> c0081a, x1.k<? super Boolean> kVar) {
            this.f4775h = c0081a;
            this.f4776i = kVar;
        }

        public q1.l<Throwable, g1.q> A(E e3) {
            q1.l<E, g1.q> lVar = this.f4775h.f4773a.f4788b;
            if (lVar == null) {
                return null;
            }
            return kotlinx.coroutines.internal.s.a(lVar, e3, this.f4776i.getContext());
        }

        @Override // z1.q
        public void c(E e3) {
            this.f4775h.e(e3);
            this.f4776i.q(x1.n.f4428a);
        }

        @Override // z1.q
        public x g(E e3, m.b bVar) {
            if (this.f4776i.p(Boolean.TRUE, null, A(e3)) == null) {
                return null;
            }
            return x1.n.f4428a;
        }

        @Override // kotlinx.coroutines.internal.m
        public String toString() {
            return kotlin.jvm.internal.k.j("ReceiveHasNext@", m0.b(this));
        }

        @Override // z1.o
        public void z(j<?> jVar) {
            Object a3 = jVar.f4807h == null ? k.a.a(this.f4776i, Boolean.FALSE, null, 2, null) : this.f4776i.o(jVar.E());
            if (a3 != null) {
                this.f4775h.e(jVar);
                this.f4776i.q(a3);
            }
        }
    }

    private final class c extends x1.e {

        /* renamed from: e, reason: collision with root package name */
        private final o<?> f4777e;

        public c(o<?> oVar) {
            this.f4777e = oVar;
        }

        @Override // x1.j
        public void a(Throwable th) {
            if (this.f4777e.u()) {
                a.this.t();
            }
        }

        @Override // q1.l
        public /* bridge */ /* synthetic */ g1.q invoke(Throwable th) {
            a(th);
            return g1.q.f2865a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f4777e + ']';
        }
    }

    public static final class d extends m.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.internal.m f4779d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f4780e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.m mVar, a aVar) {
            super(mVar);
            this.f4779d = mVar;
            this.f4780e = aVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object g(kotlinx.coroutines.internal.m mVar) {
            if (this.f4780e.s()) {
                return null;
            }
            return kotlinx.coroutines.internal.l.a();
        }
    }

    public a(q1.l<? super E, g1.q> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(o<? super E> oVar) {
        boolean q2 = q(oVar);
        if (q2) {
            u();
        }
        return q2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(x1.k<?> kVar, o<?> oVar) {
        kVar.i(new c(oVar));
    }

    @Override // z1.p
    public final g<E> iterator() {
        return new C0081a(this);
    }

    @Override // z1.c
    protected q<E> l() {
        q<E> l2 = super.l();
        if (l2 != null && !(l2 instanceof j)) {
            t();
        }
        return l2;
    }

    protected boolean q(o<? super E> oVar) {
        int x2;
        kotlinx.coroutines.internal.m q2;
        if (!r()) {
            kotlinx.coroutines.internal.m e3 = e();
            d dVar = new d(oVar, this);
            do {
                kotlinx.coroutines.internal.m q3 = e3.q();
                if (!(!(q3 instanceof s))) {
                    return false;
                }
                x2 = q3.x(oVar, e3, dVar);
                if (x2 != 1) {
                }
            } while (x2 != 2);
            return false;
        }
        kotlinx.coroutines.internal.m e4 = e();
        do {
            q2 = e4.q();
            if (!(!(q2 instanceof s))) {
                return false;
            }
        } while (!q2.j(oVar, e4));
        return true;
    }

    protected abstract boolean r();

    protected abstract boolean s();

    protected void t() {
    }

    protected void u() {
    }

    protected Object v() {
        while (true) {
            s m2 = m();
            if (m2 == null) {
                return z1.b.f4784d;
            }
            if (m2.A(null) != null) {
                m2.y();
                return m2.z();
            }
            m2.B();
        }
    }
}
