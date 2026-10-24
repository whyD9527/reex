package q;

import p.d;
import p.e;
import q.f;
import q.p;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f4167k;

    /* renamed from: l, reason: collision with root package name */
    g f4168l;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4169a;

        static {
            int[] iArr = new int[p.b.values().length];
            f4169a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4169a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4169a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(p.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f4167k = fVar;
        this.f4168l = null;
        this.f4192h.f4138e = f.a.TOP;
        this.f4193i.f4138e = f.a.BOTTOM;
        fVar.f4138e = f.a.BASELINE;
        this.f4190f = 1;
    }

    @Override // q.p, q.d
    public void a(d dVar) {
        int i2;
        float t2;
        int i3 = a.f4169a[this.f4194j.ordinal()];
        if (i3 == 1) {
            p(dVar);
        } else if (i3 == 2) {
            o(dVar);
        } else if (i3 == 3) {
            p.e eVar = this.f4186b;
            n(dVar, eVar.I, eVar.K, 1);
            return;
        }
        g gVar = this.f4189e;
        if (gVar.f4136c && !gVar.f4143j && this.f4188d == e.b.MATCH_CONSTRAINT) {
            p.e eVar2 = this.f4186b;
            int i4 = eVar2.f4072q;
            if (i4 == 2) {
                p.e I = eVar2.I();
                if (I != null) {
                    if (I.f4050f.f4189e.f4143j) {
                        i2 = (int) ((r7.f4140g * this.f4186b.f4086x) + 0.5f);
                        this.f4189e.d(i2);
                    }
                }
            } else if (i4 == 3 && eVar2.f4048e.f4189e.f4143j) {
                int u2 = eVar2.u();
                if (u2 != -1) {
                    if (u2 == 0) {
                        t2 = r7.f4048e.f4189e.f4140g * this.f4186b.t();
                        i2 = (int) (t2 + 0.5f);
                        this.f4189e.d(i2);
                    } else if (u2 != 1) {
                        i2 = 0;
                        this.f4189e.d(i2);
                    }
                }
                t2 = r7.f4048e.f4189e.f4140g / this.f4186b.t();
                i2 = (int) (t2 + 0.5f);
                this.f4189e.d(i2);
            }
        }
        f fVar = this.f4192h;
        if (fVar.f4136c) {
            f fVar2 = this.f4193i;
            if (fVar2.f4136c) {
                if (fVar.f4143j && fVar2.f4143j && this.f4189e.f4143j) {
                    return;
                }
                if (!this.f4189e.f4143j && this.f4188d == e.b.MATCH_CONSTRAINT) {
                    p.e eVar3 = this.f4186b;
                    if (eVar3.f4070p == 0 && !eVar3.b0()) {
                        f fVar3 = this.f4192h.f4145l.get(0);
                        f fVar4 = this.f4193i.f4145l.get(0);
                        int i5 = fVar3.f4140g;
                        f fVar5 = this.f4192h;
                        int i6 = i5 + fVar5.f4139f;
                        int i7 = fVar4.f4140g + this.f4193i.f4139f;
                        fVar5.d(i6);
                        this.f4193i.d(i7);
                        this.f4189e.d(i7 - i6);
                        return;
                    }
                }
                if (!this.f4189e.f4143j && this.f4188d == e.b.MATCH_CONSTRAINT && this.f4185a == 1 && this.f4192h.f4145l.size() > 0 && this.f4193i.f4145l.size() > 0) {
                    f fVar6 = this.f4192h.f4145l.get(0);
                    int i8 = (this.f4193i.f4145l.get(0).f4140g + this.f4193i.f4139f) - (fVar6.f4140g + this.f4192h.f4139f);
                    g gVar2 = this.f4189e;
                    int i9 = gVar2.f4155m;
                    if (i8 < i9) {
                        gVar2.d(i8);
                    } else {
                        gVar2.d(i9);
                    }
                }
                if (this.f4189e.f4143j && this.f4192h.f4145l.size() > 0 && this.f4193i.f4145l.size() > 0) {
                    f fVar7 = this.f4192h.f4145l.get(0);
                    f fVar8 = this.f4193i.f4145l.get(0);
                    int i10 = fVar7.f4140g + this.f4192h.f4139f;
                    int i11 = fVar8.f4140g + this.f4193i.f4139f;
                    float M = this.f4186b.M();
                    if (fVar7 == fVar8) {
                        i10 = fVar7.f4140g;
                        i11 = fVar8.f4140g;
                        M = 0.5f;
                    }
                    this.f4192h.d((int) (i10 + 0.5f + (((i11 - i10) - this.f4189e.f4140g) * M)));
                    this.f4193i.d(this.f4192h.f4140g + this.f4189e.f4140g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02d9, code lost:
    
        if (r10.f4186b.U() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02db, code lost:
    
        r0 = r10.f4167k;
        r1 = r10.f4192h;
        r2 = r10.f4168l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x032e, code lost:
    
        if (r0.f4188d == r1) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03d5, code lost:
    
        r0.f4189e.f4144k.add(r10.f4189e);
        r10.f4189e.f4145l.add(r10.f4186b.f4048e.f4189e);
        r10.f4189e.f4134a = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x035e, code lost:
    
        if (r10.f4186b.U() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03d3, code lost:
    
        if (r0.f4188d == r1) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    @Override // q.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void d() {
        p.e I;
        l lVar;
        f fVar;
        f fVar2;
        g gVar;
        p pVar;
        f fVar3;
        f fVar4;
        int i2;
        p.e I2;
        p.e eVar = this.f4186b;
        if (eVar.f4040a) {
            this.f4189e.d(eVar.v());
        }
        if (!this.f4189e.f4143j) {
            this.f4188d = this.f4186b.O();
            if (this.f4186b.U()) {
                this.f4168l = new q.a(this);
            }
            e.b bVar = this.f4188d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (I2 = this.f4186b.I()) != null && I2.O() == e.b.FIXED) {
                    int v2 = (I2.v() - this.f4186b.I.e()) - this.f4186b.K.e();
                    b(this.f4192h, I2.f4050f.f4192h, this.f4186b.I.e());
                    b(this.f4193i, I2.f4050f.f4193i, -this.f4186b.K.e());
                    this.f4189e.d(v2);
                    return;
                }
                if (this.f4188d == e.b.FIXED) {
                    this.f4189e.d(this.f4186b.v());
                }
            }
        } else if (this.f4188d == e.b.MATCH_PARENT && (I = this.f4186b.I()) != null && I.O() == e.b.FIXED) {
            b(this.f4192h, I.f4050f.f4192h, this.f4186b.I.e());
            b(this.f4193i, I.f4050f.f4193i, -this.f4186b.K.e());
            return;
        }
        g gVar2 = this.f4189e;
        boolean z2 = gVar2.f4143j;
        if (z2) {
            p.e eVar2 = this.f4186b;
            if (eVar2.f4040a) {
                p.d[] dVarArr = eVar2.P;
                p.d dVar = dVarArr[2];
                p.d dVar2 = dVar.f4025f;
                if (dVar2 != null && dVarArr[3].f4025f != null) {
                    if (eVar2.b0()) {
                        this.f4192h.f4139f = this.f4186b.P[2].e();
                        this.f4193i.f4139f = -this.f4186b.P[3].e();
                    } else {
                        f h2 = h(this.f4186b.P[2]);
                        if (h2 != null) {
                            b(this.f4192h, h2, this.f4186b.P[2].e());
                        }
                        f h3 = h(this.f4186b.P[3]);
                        if (h3 != null) {
                            b(this.f4193i, h3, -this.f4186b.P[3].e());
                        }
                        this.f4192h.f4135b = true;
                        this.f4193i.f4135b = true;
                    }
                    if (!this.f4186b.U()) {
                        return;
                    }
                } else if (dVar2 != null) {
                    f h4 = h(dVar);
                    if (h4 == null) {
                        return;
                    }
                    b(this.f4192h, h4, this.f4186b.P[2].e());
                    b(this.f4193i, this.f4192h, this.f4189e.f4140g);
                    if (!this.f4186b.U()) {
                        return;
                    }
                } else {
                    p.d dVar3 = dVarArr[3];
                    if (dVar3.f4025f != null) {
                        f h5 = h(dVar3);
                        if (h5 != null) {
                            b(this.f4193i, h5, -this.f4186b.P[3].e());
                            b(this.f4192h, this.f4193i, -this.f4189e.f4140g);
                        }
                        if (!this.f4186b.U()) {
                            return;
                        }
                    } else {
                        p.d dVar4 = dVarArr[4];
                        if (dVar4.f4025f != null) {
                            f h6 = h(dVar4);
                            if (h6 != null) {
                                b(this.f4167k, h6, 0);
                                b(this.f4192h, this.f4167k, -this.f4186b.n());
                                fVar3 = this.f4193i;
                                fVar4 = this.f4192h;
                                i2 = this.f4189e.f4140g;
                                b(fVar3, fVar4, i2);
                                return;
                            }
                            return;
                        }
                        if ((eVar2 instanceof p.h) || eVar2.I() == null || this.f4186b.m(d.b.CENTER).f4025f != null) {
                            return;
                        }
                        b(this.f4192h, this.f4186b.I().f4050f.f4192h, this.f4186b.T());
                        b(this.f4193i, this.f4192h, this.f4189e.f4140g);
                        if (!this.f4186b.U()) {
                            return;
                        }
                    }
                }
                fVar3 = this.f4167k;
                fVar4 = this.f4192h;
                i2 = this.f4186b.n();
                b(fVar3, fVar4, i2);
                return;
            }
        }
        if (z2 || this.f4188d != e.b.MATCH_CONSTRAINT) {
            gVar2.b(this);
        } else {
            p.e eVar3 = this.f4186b;
            int i3 = eVar3.f4072q;
            if (i3 == 2) {
                p.e I3 = eVar3.I();
                if (I3 != null) {
                    pVar = I3.f4050f;
                    g gVar3 = pVar.f4189e;
                    this.f4189e.f4145l.add(gVar3);
                    gVar3.f4144k.add(this.f4189e);
                    g gVar4 = this.f4189e;
                    gVar4.f4135b = true;
                    gVar4.f4144k.add(this.f4192h);
                    this.f4189e.f4144k.add(this.f4193i);
                }
            } else if (i3 == 3 && !eVar3.b0()) {
                p.e eVar4 = this.f4186b;
                if (eVar4.f4070p != 3) {
                    pVar = eVar4.f4048e;
                    g gVar32 = pVar.f4189e;
                    this.f4189e.f4145l.add(gVar32);
                    gVar32.f4144k.add(this.f4189e);
                    g gVar42 = this.f4189e;
                    gVar42.f4135b = true;
                    gVar42.f4144k.add(this.f4192h);
                    this.f4189e.f4144k.add(this.f4193i);
                }
            }
        }
        p.e eVar5 = this.f4186b;
        p.d[] dVarArr2 = eVar5.P;
        p.d dVar5 = dVarArr2[2];
        p.d dVar6 = dVar5.f4025f;
        if (dVar6 == null || dVarArr2[3].f4025f == null) {
            if (dVar6 != null) {
                f h7 = h(dVar5);
                if (h7 != null) {
                    b(this.f4192h, h7, this.f4186b.P[2].e());
                    c(this.f4193i, this.f4192h, 1, this.f4189e);
                    if (this.f4186b.U()) {
                        c(this.f4167k, this.f4192h, 1, this.f4168l);
                    }
                    e.b bVar2 = this.f4188d;
                    e.b bVar3 = e.b.MATCH_CONSTRAINT;
                    if (bVar2 == bVar3 && this.f4186b.t() > 0.0f) {
                        lVar = this.f4186b.f4048e;
                    }
                }
            } else {
                p.d dVar7 = dVarArr2[3];
                if (dVar7.f4025f != null) {
                    f h8 = h(dVar7);
                    if (h8 != null) {
                        b(this.f4193i, h8, -this.f4186b.P[3].e());
                        c(this.f4192h, this.f4193i, -1, this.f4189e);
                    }
                } else {
                    p.d dVar8 = dVarArr2[4];
                    if (dVar8.f4025f != null) {
                        f h9 = h(dVar8);
                        if (h9 != null) {
                            b(this.f4167k, h9, 0);
                            c(this.f4192h, this.f4167k, -1, this.f4168l);
                            fVar = this.f4193i;
                            fVar2 = this.f4192h;
                            gVar = this.f4189e;
                        }
                    } else if (!(eVar5 instanceof p.h) && eVar5.I() != null) {
                        b(this.f4192h, this.f4186b.I().f4050f.f4192h, this.f4186b.T());
                        c(this.f4193i, this.f4192h, 1, this.f4189e);
                        if (this.f4186b.U()) {
                            c(this.f4167k, this.f4192h, 1, this.f4168l);
                        }
                        e.b bVar4 = this.f4188d;
                        e.b bVar5 = e.b.MATCH_CONSTRAINT;
                        if (bVar4 == bVar5 && this.f4186b.t() > 0.0f) {
                            lVar = this.f4186b.f4048e;
                        }
                    }
                }
            }
            if (this.f4189e.f4145l.size() != 0) {
                this.f4189e.f4136c = true;
                return;
            }
            return;
        }
        if (eVar5.b0()) {
            this.f4192h.f4139f = this.f4186b.P[2].e();
            this.f4193i.f4139f = -this.f4186b.P[3].e();
        } else {
            f h10 = h(this.f4186b.P[2]);
            f h11 = h(this.f4186b.P[3]);
            h10.b(this);
            h11.b(this);
            this.f4194j = p.b.CENTER;
        }
        c(fVar, fVar2, 1, gVar);
        if (this.f4189e.f4145l.size() != 0) {
        }
    }

    @Override // q.p
    public void e() {
        f fVar = this.f4192h;
        if (fVar.f4143j) {
            this.f4186b.W0(fVar.f4140g);
        }
    }

    @Override // q.p
    void f() {
        this.f4187c = null;
        this.f4192h.c();
        this.f4193i.c();
        this.f4167k.c();
        this.f4189e.c();
        this.f4191g = false;
    }

    @Override // q.p
    boolean m() {
        return this.f4188d != e.b.MATCH_CONSTRAINT || this.f4186b.f4072q == 0;
    }

    void q() {
        this.f4191g = false;
        this.f4192h.c();
        this.f4192h.f4143j = false;
        this.f4193i.c();
        this.f4193i.f4143j = false;
        this.f4167k.c();
        this.f4167k.f4143j = false;
        this.f4189e.f4143j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f4186b.r();
    }
}
