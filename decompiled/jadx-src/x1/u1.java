package x1;

/* loaded from: classes.dex */
public abstract class u1 extends f0 {
    public abstract u1 p();

    protected final String q() {
        u1 u1Var;
        u1 c3 = s0.c();
        if (this == c3) {
            return "Dispatchers.Main";
        }
        try {
            u1Var = c3.p();
        } catch (UnsupportedOperationException unused) {
            u1Var = null;
        }
        if (this == u1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // x1.f0
    public String toString() {
        String q2 = q();
        if (q2 != null) {
            return q2;
        }
        return m0.a(this) + '@' + m0.b(this);
    }
}
