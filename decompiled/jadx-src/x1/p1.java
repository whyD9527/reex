package x1;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final /* synthetic */ class p1 {
    public static final x a(k1 k1Var) {
        return new n1(k1Var);
    }

    public static /* synthetic */ x b(k1 k1Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            k1Var = null;
        }
        return o1.a(k1Var);
    }

    public static final void c(j1.g gVar, CancellationException cancellationException) {
        k1 k1Var = (k1) gVar.get(k1.f4420d);
        if (k1Var == null) {
            return;
        }
        k1Var.n(cancellationException);
    }

    public static final void d(j1.g gVar) {
        k1 k1Var = (k1) gVar.get(k1.f4420d);
        if (k1Var == null) {
            return;
        }
        o1.e(k1Var);
    }

    public static final void e(k1 k1Var) {
        if (!k1Var.b()) {
            throw k1Var.j();
        }
    }
}
