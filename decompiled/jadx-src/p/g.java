package p;

import p.d;
import p.e;

/* loaded from: classes.dex */
public class g extends e {
    protected float D0 = -1.0f;
    protected int E0 = -1;
    protected int F0 = -1;
    private d G0 = this.I;
    private int H0 = 0;
    private int I0 = 0;
    private boolean J0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4105a;

        static {
            int[] iArr = new int[d.b.values().length];
            f4105a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4105a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4105a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4105a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4105a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4105a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4105a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4105a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4105a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.Q.clear();
        this.Q.add(this.G0);
        int length = this.P.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.P[i2] = this.G0;
        }
    }

    @Override // p.e
    public void Z0(o.d dVar, boolean z2) {
        if (I() == null) {
            return;
        }
        int x2 = dVar.x(this.G0);
        if (this.H0 == 1) {
            V0(x2);
            W0(0);
            v0(I().v());
            U0(0);
            return;
        }
        V0(0);
        W0(x2);
        U0(I().R());
        v0(0);
    }

    public d a1() {
        return this.G0;
    }

    public int b1() {
        return this.H0;
    }

    public int c1() {
        return this.E0;
    }

    public int d1() {
        return this.F0;
    }

    @Override // p.e
    public boolean e0() {
        return this.J0;
    }

    public float e1() {
        return this.D0;
    }

    @Override // p.e
    public boolean f0() {
        return this.J0;
    }

    public void f1(int i2) {
        this.G0.s(i2);
        this.J0 = true;
    }

    @Override // p.e
    public void g(o.d dVar, boolean z2) {
        f fVar = (f) I();
        if (fVar == null) {
            return;
        }
        d m2 = fVar.m(d.b.LEFT);
        d m3 = fVar.m(d.b.RIGHT);
        e eVar = this.T;
        boolean z3 = eVar != null && eVar.S[0] == e.b.WRAP_CONTENT;
        if (this.H0 == 0) {
            m2 = fVar.m(d.b.TOP);
            m3 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.T;
            z3 = eVar2 != null && eVar2.S[1] == e.b.WRAP_CONTENT;
        }
        if (this.J0 && this.G0.m()) {
            o.i q2 = dVar.q(this.G0);
            dVar.f(q2, this.G0.d());
            if (this.E0 != -1) {
                if (z3) {
                    dVar.h(dVar.q(m3), q2, 0, 5);
                }
            } else if (this.F0 != -1 && z3) {
                o.i q3 = dVar.q(m3);
                dVar.h(q2, dVar.q(m2), 0, 5);
                dVar.h(q3, q2, 0, 5);
            }
            this.J0 = false;
            return;
        }
        if (this.E0 != -1) {
            o.i q4 = dVar.q(this.G0);
            dVar.e(q4, dVar.q(m2), this.E0, 8);
            if (z3) {
                dVar.h(dVar.q(m3), q4, 0, 5);
                return;
            }
            return;
        }
        if (this.F0 == -1) {
            if (this.D0 != -1.0f) {
                dVar.d(o.d.s(dVar, dVar.q(this.G0), dVar.q(m3), this.D0));
                return;
            }
            return;
        }
        o.i q5 = dVar.q(this.G0);
        o.i q6 = dVar.q(m3);
        dVar.e(q5, q6, -this.F0, 8);
        if (z3) {
            dVar.h(q5, dVar.q(m2), 0, 5);
            dVar.h(q6, q5, 0, 5);
        }
    }

    public void g1(int i2) {
        if (i2 > -1) {
            this.D0 = -1.0f;
            this.E0 = i2;
            this.F0 = -1;
        }
    }

    @Override // p.e
    public boolean h() {
        return true;
    }

    public void h1(int i2) {
        if (i2 > -1) {
            this.D0 = -1.0f;
            this.E0 = -1;
            this.F0 = i2;
        }
    }

    public void i1(float f2) {
        if (f2 > -1.0f) {
            this.D0 = f2;
            this.E0 = -1;
            this.F0 = -1;
        }
    }

    public void j1(int i2) {
        if (this.H0 == i2) {
            return;
        }
        this.H0 = i2;
        this.Q.clear();
        this.G0 = this.H0 == 1 ? this.H : this.I;
        this.Q.add(this.G0);
        int length = this.P.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.P[i3] = this.G0;
        }
    }

    @Override // p.e
    public d m(d.b bVar) {
        switch (a.f4105a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.H0 == 1) {
                    return this.G0;
                }
                break;
            case 3:
            case 4:
                if (this.H0 == 0) {
                    return this.G0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
