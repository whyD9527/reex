package x1;

/* loaded from: classes.dex */
public class n1 extends r1 implements x {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4431f;

    public n1(k1 k1Var) {
        super(true);
        R(k1Var);
        this.f4431f = s0();
    }

    private final boolean s0() {
        r N = N();
        s sVar = N instanceof s ? (s) N : null;
        if (sVar == null) {
            return false;
        }
        do {
            r1 z2 = sVar.z();
            if (z2.K()) {
                return true;
            }
            r N2 = z2.N();
            sVar = N2 instanceof s ? (s) N2 : null;
        } while (sVar != null);
        return false;
    }

    @Override // x1.r1
    public boolean K() {
        return this.f4431f;
    }

    @Override // x1.r1
    public boolean L() {
        return true;
    }
}
