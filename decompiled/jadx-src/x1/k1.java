package x1;

import j1.g;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public interface k1 extends g.b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f4420d = b.f4421e;

    public static final class a {
        public static /* synthetic */ void a(k1 k1Var, CancellationException cancellationException, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i2 & 1) != 0) {
                cancellationException = null;
            }
            k1Var.n(cancellationException);
        }

        public static <R> R b(k1 k1Var, R r2, q1.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(k1Var, r2, pVar);
        }

        public static <E extends g.b> E c(k1 k1Var, g.c<E> cVar) {
            return (E) g.b.a.b(k1Var, cVar);
        }

        public static /* synthetic */ t0 d(k1 k1Var, boolean z2, boolean z3, q1.l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            if ((i2 & 2) != 0) {
                z3 = true;
            }
            return k1Var.k(z2, z3, lVar);
        }

        public static j1.g e(k1 k1Var, g.c<?> cVar) {
            return g.b.a.c(k1Var, cVar);
        }

        public static j1.g f(k1 k1Var, j1.g gVar) {
            return g.b.a.d(k1Var, gVar);
        }
    }

    public static final class b implements g.c<k1> {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ b f4421e = new b();

        private b() {
        }
    }

    boolean b();

    r g(t tVar);

    CancellationException j();

    t0 k(boolean z2, boolean z3, q1.l<? super Throwable, g1.q> lVar);

    void n(CancellationException cancellationException);

    boolean start();
}
