package q;

import java.util.List;
import p.d;
import p.e;
import q.f;
import q.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f4157k = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4158a;

        static {
            int[] iArr = new int[p.b.values().length];
            f4158a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4158a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4158a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(p.e eVar) {
        super(eVar);
        this.f4192h.f4138e = f.a.LEFT;
        this.f4193i.f4138e = f.a.RIGHT;
        this.f4190f = 0;
    }

    private void q(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0292, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // q.p, q.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(d dVar) {
        int i2;
        int g2;
        int g3;
        float f2;
        g gVar;
        int g4;
        int g5;
        float f3;
        float t2;
        int i3 = a.f4158a[this.f4194j.ordinal()];
        if (i3 == 1) {
            p(dVar);
        } else if (i3 == 2) {
            o(dVar);
        } else if (i3 == 3) {
            p.e eVar = this.f4186b;
            n(dVar, eVar.H, eVar.J, 0);
            return;
        }
        if (!this.f4189e.f4143j && this.f4188d == e.b.MATCH_CONSTRAINT) {
            p.e eVar2 = this.f4186b;
            int i4 = eVar2.f4070p;
            if (i4 == 2) {
                p.e I = eVar2.I();
                if (I != null) {
                    if (I.f4048e.f4189e.f4143j) {
                        i2 = (int) ((r0.f4140g * this.f4186b.f4080u) + 0.5f);
                        this.f4189e.d(i2);
                    }
                }
            } else if (i4 == 3) {
                int i5 = eVar2.f4072q;
                if (i5 == 0 || i5 == 3) {
                    n nVar = eVar2.f4050f;
                    f fVar = nVar.f4192h;
                    f fVar2 = nVar.f4193i;
                    boolean z2 = eVar2.H.f4025f != null;
                    boolean z3 = eVar2.I.f4025f != null;
                    boolean z4 = eVar2.J.f4025f != null;
                    boolean z5 = eVar2.K.f4025f != null;
                    int u2 = eVar2.u();
                    if (z2 && z3 && z4 && z5) {
                        float t3 = this.f4186b.t();
                        if (fVar.f4143j && fVar2.f4143j) {
                            f fVar3 = this.f4192h;
                            if (fVar3.f4136c && this.f4193i.f4136c) {
                                q(f4157k, fVar3.f4145l.get(0).f4140g + this.f4192h.f4139f, this.f4193i.f4145l.get(0).f4140g - this.f4193i.f4139f, fVar.f4140g + fVar.f4139f, fVar2.f4140g - fVar2.f4139f, t3, u2);
                                this.f4189e.d(f4157k[0]);
                                this.f4186b.f4050f.f4189e.d(f4157k[1]);
                                return;
                            }
                            return;
                        }
                        f fVar4 = this.f4192h;
                        if (fVar4.f4143j) {
                            f fVar5 = this.f4193i;
                            if (fVar5.f4143j) {
                                if (!fVar.f4136c || !fVar2.f4136c) {
                                    return;
                                }
                                q(f4157k, fVar4.f4140g + fVar4.f4139f, fVar5.f4140g - fVar5.f4139f, fVar.f4145l.get(0).f4140g + fVar.f4139f, fVar2.f4145l.get(0).f4140g - fVar2.f4139f, t3, u2);
                                this.f4189e.d(f4157k[0]);
                                this.f4186b.f4050f.f4189e.d(f4157k[1]);
                            }
                        }
                        f fVar6 = this.f4192h;
                        if (!fVar6.f4136c || !this.f4193i.f4136c || !fVar.f4136c || !fVar2.f4136c) {
                            return;
                        }
                        q(f4157k, fVar6.f4145l.get(0).f4140g + this.f4192h.f4139f, this.f4193i.f4145l.get(0).f4140g - this.f4193i.f4139f, fVar.f4145l.get(0).f4140g + fVar.f4139f, fVar2.f4145l.get(0).f4140g - fVar2.f4139f, t3, u2);
                        this.f4189e.d(f4157k[0]);
                        gVar = this.f4186b.f4050f.f4189e;
                        g2 = f4157k[1];
                    } else if (z2 && z4) {
                        if (!this.f4192h.f4136c || !this.f4193i.f4136c) {
                            return;
                        }
                        float t4 = this.f4186b.t();
                        int i6 = this.f4192h.f4145l.get(0).f4140g + this.f4192h.f4139f;
                        int i7 = this.f4193i.f4145l.get(0).f4140g - this.f4193i.f4139f;
                        if (u2 == -1 || u2 == 0) {
                            g4 = g(i7 - i6, 0);
                            int i8 = (int) ((g4 * t4) + 0.5f);
                            g5 = g(i8, 1);
                            if (i8 != g5) {
                                f3 = g5 / t4;
                                g4 = (int) (f3 + 0.5f);
                            }
                            this.f4189e.d(g4);
                            this.f4186b.f4050f.f4189e.d(g5);
                        } else if (u2 == 1) {
                            g4 = g(i7 - i6, 0);
                            int i9 = (int) ((g4 / t4) + 0.5f);
                            g5 = g(i9, 1);
                            if (i9 != g5) {
                                f3 = g5 * t4;
                                g4 = (int) (f3 + 0.5f);
                            }
                            this.f4189e.d(g4);
                            this.f4186b.f4050f.f4189e.d(g5);
                        }
                    } else if (z3 && z5) {
                        if (!fVar.f4136c || !fVar2.f4136c) {
                            return;
                        }
                        float t5 = this.f4186b.t();
                        int i10 = fVar.f4145l.get(0).f4140g + fVar.f4139f;
                        int i11 = fVar2.f4145l.get(0).f4140g - fVar2.f4139f;
                        if (u2 != -1) {
                            if (u2 == 0) {
                                g2 = g(i11 - i10, 1);
                                int i12 = (int) ((g2 * t5) + 0.5f);
                                g3 = g(i12, 0);
                                if (i12 != g3) {
                                    f2 = g3 / t5;
                                    g2 = (int) (f2 + 0.5f);
                                }
                                this.f4189e.d(g3);
                                gVar = this.f4186b.f4050f.f4189e;
                            }
                        }
                        g2 = g(i11 - i10, 1);
                        int i13 = (int) ((g2 / t5) + 0.5f);
                        g3 = g(i13, 0);
                        if (i13 != g3) {
                            f2 = g3 * t5;
                            g2 = (int) (f2 + 0.5f);
                        }
                        this.f4189e.d(g3);
                        gVar = this.f4186b.f4050f.f4189e;
                    }
                    gVar.d(g2);
                } else {
                    int u3 = eVar2.u();
                    if (u3 != -1) {
                        if (u3 == 0) {
                            t2 = r0.f4050f.f4189e.f4140g / this.f4186b.t();
                            i2 = (int) (t2 + 0.5f);
                            this.f4189e.d(i2);
                        } else if (u3 != 1) {
                            i2 = 0;
                            this.f4189e.d(i2);
                        }
                    }
                    t2 = r0.f4050f.f4189e.f4140g * this.f4186b.t();
                    i2 = (int) (t2 + 0.5f);
                    this.f4189e.d(i2);
                }
            }
        }
        f fVar7 = this.f4192h;
        if (fVar7.f4136c) {
            f fVar8 = this.f4193i;
            if (fVar8.f4136c) {
                if (fVar7.f4143j && fVar8.f4143j && this.f4189e.f4143j) {
                    return;
                }
                if (!this.f4189e.f4143j && this.f4188d == e.b.MATCH_CONSTRAINT) {
                    p.e eVar3 = this.f4186b;
                    if (eVar3.f4070p == 0 && !eVar3.Z()) {
                        f fVar9 = this.f4192h.f4145l.get(0);
                        f fVar10 = this.f4193i.f4145l.get(0);
                        int i14 = fVar9.f4140g;
                        f fVar11 = this.f4192h;
                        int i15 = i14 + fVar11.f4139f;
                        int i16 = fVar10.f4140g + this.f4193i.f4139f;
                        fVar11.d(i15);
                        this.f4193i.d(i16);
                        this.f4189e.d(i16 - i15);
                        return;
                    }
                }
                if (!this.f4189e.f4143j && this.f4188d == e.b.MATCH_CONSTRAINT && this.f4185a == 1 && this.f4192h.f4145l.size() > 0 && this.f4193i.f4145l.size() > 0) {
                    int min = Math.min((this.f4193i.f4145l.get(0).f4140g + this.f4193i.f4139f) - (this.f4192h.f4145l.get(0).f4140g + this.f4192h.f4139f), this.f4189e.f4155m);
                    p.e eVar4 = this.f4186b;
                    int i17 = eVar4.f4078t;
                    int max = Math.max(eVar4.f4076s, min);
                    if (i17 > 0) {
                        max = Math.min(i17, max);
                    }
                    this.f4189e.d(max);
                }
                if (this.f4189e.f4143j) {
                    f fVar12 = this.f4192h.f4145l.get(0);
                    f fVar13 = this.f4193i.f4145l.get(0);
                    int i18 = fVar12.f4140g + this.f4192h.f4139f;
                    int i19 = fVar13.f4140g + this.f4193i.f4139f;
                    float w2 = this.f4186b.w();
                    if (fVar12 == fVar13) {
                        i18 = fVar12.f4140g;
                        i19 = fVar13.f4140g;
                        w2 = 0.5f;
                    }
                    this.f4192h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f4189e.f4140g) * w2)));
                    this.f4193i.d(this.f4192h.f4140g + this.f4189e.f4140g);
                }
            }
        }
    }

    @Override // q.p
    void d() {
        p.e I;
        f fVar;
        f fVar2;
        int S;
        f fVar3;
        p.d dVar;
        List<d> list;
        d dVar2;
        f fVar4;
        f fVar5;
        f fVar6;
        int S2;
        f fVar7;
        f fVar8;
        int i2;
        p.e I2;
        p.e eVar = this.f4186b;
        if (eVar.f4040a) {
            this.f4189e.d(eVar.R());
        }
        if (this.f4189e.f4143j) {
            e.b bVar = this.f4188d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((I = this.f4186b.I()) != null && I.y() == e.b.FIXED) || I.y() == bVar2)) {
                b(this.f4192h, I.f4048e.f4192h, this.f4186b.H.e());
                b(this.f4193i, I.f4048e.f4193i, -this.f4186b.J.e());
                return;
            }
        } else {
            e.b y2 = this.f4186b.y();
            this.f4188d = y2;
            if (y2 != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (y2 == bVar3 && (((I2 = this.f4186b.I()) != null && I2.y() == e.b.FIXED) || I2.y() == bVar3)) {
                    int R = (I2.R() - this.f4186b.H.e()) - this.f4186b.J.e();
                    b(this.f4192h, I2.f4048e.f4192h, this.f4186b.H.e());
                    b(this.f4193i, I2.f4048e.f4193i, -this.f4186b.J.e());
                    this.f4189e.d(R);
                    return;
                }
                if (this.f4188d == e.b.FIXED) {
                    this.f4189e.d(this.f4186b.R());
                }
            }
        }
        g gVar = this.f4189e;
        if (gVar.f4143j) {
            p.e eVar2 = this.f4186b;
            if (eVar2.f4040a) {
                p.d[] dVarArr = eVar2.P;
                p.d dVar3 = dVarArr[0];
                p.d dVar4 = dVar3.f4025f;
                if (dVar4 != null && dVarArr[1].f4025f != null) {
                    if (eVar2.Z()) {
                        this.f4192h.f4139f = this.f4186b.P[0].e();
                        fVar3 = this.f4193i;
                        dVar = this.f4186b.P[1];
                        fVar3.f4139f = -dVar.e();
                        return;
                    }
                    f h2 = h(this.f4186b.P[0]);
                    if (h2 != null) {
                        b(this.f4192h, h2, this.f4186b.P[0].e());
                    }
                    f h3 = h(this.f4186b.P[1]);
                    if (h3 != null) {
                        b(this.f4193i, h3, -this.f4186b.P[1].e());
                    }
                    this.f4192h.f4135b = true;
                    this.f4193i.f4135b = true;
                    return;
                }
                if (dVar4 != null) {
                    fVar5 = h(dVar3);
                    if (fVar5 == null) {
                        return;
                    }
                    fVar6 = this.f4192h;
                    S2 = this.f4186b.P[0].e();
                } else {
                    p.d dVar5 = dVarArr[1];
                    if (dVar5.f4025f != null) {
                        f h4 = h(dVar5);
                        if (h4 != null) {
                            b(this.f4193i, h4, -this.f4186b.P[1].e());
                            fVar7 = this.f4192h;
                            fVar8 = this.f4193i;
                            i2 = -this.f4189e.f4140g;
                            b(fVar7, fVar8, i2);
                            return;
                        }
                        return;
                    }
                    if ((eVar2 instanceof p.h) || eVar2.I() == null || this.f4186b.m(d.b.CENTER).f4025f != null) {
                        return;
                    }
                    fVar5 = this.f4186b.I().f4048e.f4192h;
                    fVar6 = this.f4192h;
                    S2 = this.f4186b.S();
                }
                b(fVar6, fVar5, S2);
                fVar7 = this.f4193i;
                fVar8 = this.f4192h;
                i2 = this.f4189e.f4140g;
                b(fVar7, fVar8, i2);
                return;
            }
        }
        if (this.f4188d == e.b.MATCH_CONSTRAINT) {
            p.e eVar3 = this.f4186b;
            int i3 = eVar3.f4070p;
            if (i3 == 2) {
                p.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f4050f.f4189e;
                    this.f4189e.f4145l.add(gVar2);
                    gVar2.f4144k.add(this.f4189e);
                    g gVar3 = this.f4189e;
                    gVar3.f4135b = true;
                    gVar3.f4144k.add(this.f4192h);
                    list = this.f4189e.f4144k;
                    dVar2 = this.f4193i;
                    list.add(dVar2);
                }
            } else if (i3 == 3) {
                if (eVar3.f4072q == 3) {
                    this.f4192h.f4134a = this;
                    this.f4193i.f4134a = this;
                    n nVar = eVar3.f4050f;
                    nVar.f4192h.f4134a = this;
                    nVar.f4193i.f4134a = this;
                    gVar.f4134a = this;
                    if (eVar3.b0()) {
                        this.f4189e.f4145l.add(this.f4186b.f4050f.f4189e);
                        this.f4186b.f4050f.f4189e.f4144k.add(this.f4189e);
                        n nVar2 = this.f4186b.f4050f;
                        nVar2.f4189e.f4134a = this;
                        this.f4189e.f4145l.add(nVar2.f4192h);
                        this.f4189e.f4145l.add(this.f4186b.f4050f.f4193i);
                        this.f4186b.f4050f.f4192h.f4144k.add(this.f4189e);
                        list = this.f4186b.f4050f.f4193i.f4144k;
                        dVar2 = this.f4189e;
                        list.add(dVar2);
                    } else if (this.f4186b.Z()) {
                        this.f4186b.f4050f.f4189e.f4145l.add(this.f4189e);
                        list = this.f4189e.f4144k;
                        dVar2 = this.f4186b.f4050f.f4189e;
                        list.add(dVar2);
                    } else {
                        fVar4 = this.f4186b.f4050f.f4189e;
                    }
                } else {
                    g gVar4 = eVar3.f4050f.f4189e;
                    gVar.f4145l.add(gVar4);
                    gVar4.f4144k.add(this.f4189e);
                    this.f4186b.f4050f.f4192h.f4144k.add(this.f4189e);
                    this.f4186b.f4050f.f4193i.f4144k.add(this.f4189e);
                    g gVar5 = this.f4189e;
                    gVar5.f4135b = true;
                    gVar5.f4144k.add(this.f4192h);
                    this.f4189e.f4144k.add(this.f4193i);
                    this.f4192h.f4145l.add(this.f4189e);
                    fVar4 = this.f4193i;
                }
                list = fVar4.f4145l;
                dVar2 = this.f4189e;
                list.add(dVar2);
            }
            fVar3.f4139f = -dVar.e();
            return;
        }
        p.e eVar4 = this.f4186b;
        p.d[] dVarArr2 = eVar4.P;
        p.d dVar6 = dVarArr2[0];
        p.d dVar7 = dVar6.f4025f;
        if (dVar7 != null && dVarArr2[1].f4025f != null) {
            if (eVar4.Z()) {
                this.f4192h.f4139f = this.f4186b.P[0].e();
                fVar3 = this.f4193i;
                dVar = this.f4186b.P[1];
                fVar3.f4139f = -dVar.e();
                return;
            }
            f h5 = h(this.f4186b.P[0]);
            f h6 = h(this.f4186b.P[1]);
            h5.b(this);
            h6.b(this);
            this.f4194j = p.b.CENTER;
            return;
        }
        if (dVar7 != null) {
            fVar = h(dVar6);
            if (fVar == null) {
                return;
            }
            fVar2 = this.f4192h;
            S = this.f4186b.P[0].e();
        } else {
            p.d dVar8 = dVarArr2[1];
            if (dVar8.f4025f != null) {
                f h7 = h(dVar8);
                if (h7 != null) {
                    b(this.f4193i, h7, -this.f4186b.P[1].e());
                    c(this.f4192h, this.f4193i, -1, this.f4189e);
                    return;
                }
                return;
            }
            if ((eVar4 instanceof p.h) || eVar4.I() == null) {
                return;
            }
            fVar = this.f4186b.I().f4048e.f4192h;
            fVar2 = this.f4192h;
            S = this.f4186b.S();
        }
        b(fVar2, fVar, S);
        c(this.f4193i, this.f4192h, 1, this.f4189e);
    }

    @Override // q.p
    public void e() {
        f fVar = this.f4192h;
        if (fVar.f4143j) {
            this.f4186b.V0(fVar.f4140g);
        }
    }

    @Override // q.p
    void f() {
        this.f4187c = null;
        this.f4192h.c();
        this.f4193i.c();
        this.f4189e.c();
        this.f4191g = false;
    }

    @Override // q.p
    boolean m() {
        return this.f4188d != e.b.MATCH_CONSTRAINT || this.f4186b.f4070p == 0;
    }

    void r() {
        this.f4191g = false;
        this.f4192h.c();
        this.f4192h.f4143j = false;
        this.f4193i.c();
        this.f4193i.f4143j = false;
        this.f4189e.f4143j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f4186b.r();
    }
}
