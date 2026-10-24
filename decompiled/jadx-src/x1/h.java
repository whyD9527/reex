package x1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class h {
    public static final k1 a(i0 i0Var, j1.g gVar, k0 k0Var, q1.p<? super i0, ? super j1.d<? super g1.q>, ? extends Object> pVar) {
        j1.g c3 = e0.c(i0Var, gVar);
        a t1Var = k0Var.c() ? new t1(c3, pVar) : new z1(c3, true);
        t1Var.v0(k0Var, t1Var, pVar);
        return t1Var;
    }

    public static /* synthetic */ k1 b(i0 i0Var, j1.g gVar, k0 k0Var, q1.p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = j1.h.f3610e;
        }
        if ((i2 & 2) != 0) {
            k0Var = k0.DEFAULT;
        }
        return g.a(i0Var, gVar, k0Var, pVar);
    }
}
