package q;

import java.util.ArrayList;
import p.d;
import p.e;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<p.e> f4107a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private a f4108b = new a();

    /* renamed from: c, reason: collision with root package name */
    private p.f f4109c;

    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static int f4110k = 0;

        /* renamed from: l, reason: collision with root package name */
        public static int f4111l = 1;

        /* renamed from: m, reason: collision with root package name */
        public static int f4112m = 2;

        /* renamed from: a, reason: collision with root package name */
        public e.b f4113a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f4114b;

        /* renamed from: c, reason: collision with root package name */
        public int f4115c;

        /* renamed from: d, reason: collision with root package name */
        public int f4116d;

        /* renamed from: e, reason: collision with root package name */
        public int f4117e;

        /* renamed from: f, reason: collision with root package name */
        public int f4118f;

        /* renamed from: g, reason: collision with root package name */
        public int f4119g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f4120h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f4121i;

        /* renamed from: j, reason: collision with root package name */
        public int f4122j;
    }

    /* renamed from: q.b$b, reason: collision with other inner class name */
    public interface InterfaceC0062b {
        void a();

        void b(p.e eVar, a aVar);
    }

    public b(p.f fVar) {
        this.f4109c = fVar;
    }

    private boolean a(InterfaceC0062b interfaceC0062b, p.e eVar, int i2) {
        this.f4108b.f4113a = eVar.y();
        this.f4108b.f4114b = eVar.O();
        this.f4108b.f4115c = eVar.R();
        this.f4108b.f4116d = eVar.v();
        a aVar = this.f4108b;
        aVar.f4121i = false;
        aVar.f4122j = i2;
        e.b bVar = aVar.f4113a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z2 = bVar == bVar2;
        boolean z3 = aVar.f4114b == bVar2;
        boolean z4 = z2 && eVar.W > 0.0f;
        boolean z5 = z3 && eVar.W > 0.0f;
        if (z4 && eVar.f4074r[0] == 4) {
            aVar.f4113a = e.b.FIXED;
        }
        if (z5 && eVar.f4074r[1] == 4) {
            aVar.f4114b = e.b.FIXED;
        }
        interfaceC0062b.b(eVar, aVar);
        eVar.U0(this.f4108b.f4117e);
        eVar.v0(this.f4108b.f4118f);
        eVar.u0(this.f4108b.f4120h);
        eVar.k0(this.f4108b.f4119g);
        a aVar2 = this.f4108b;
        aVar2.f4122j = a.f4110k;
        return aVar2.f4121i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        if (r8 != r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
    
        if (r5.W <= 0.0f) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(p.f fVar) {
        l lVar;
        n nVar;
        int size = fVar.D0.size();
        boolean B1 = fVar.B1(64);
        InterfaceC0062b r12 = fVar.r1();
        for (int i2 = 0; i2 < size; i2++) {
            p.e eVar = fVar.D0.get(i2);
            if (!(eVar instanceof p.g) && !(eVar instanceof p.a) && !eVar.c0() && (!B1 || (lVar = eVar.f4048e) == null || (nVar = eVar.f4050f) == null || !lVar.f4189e.f4143j || !nVar.f4189e.f4143j)) {
                e.b s2 = eVar.s(0);
                boolean z2 = true;
                e.b s3 = eVar.s(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z3 = s2 == bVar && eVar.f4070p != 1 && s3 == bVar && eVar.f4072q != 1;
                if (!z3 && fVar.B1(1) && !(eVar instanceof p.k)) {
                    if (s2 == bVar && eVar.f4070p == 0 && s3 != bVar && !eVar.Z()) {
                        z3 = true;
                    }
                    if (s3 == bVar && eVar.f4072q == 0 && s2 != bVar && !eVar.Z()) {
                        z3 = true;
                    }
                    if (s2 != bVar) {
                    }
                }
                z2 = z3;
                if (!z2) {
                    a(r12, eVar, a.f4110k);
                }
            }
        }
        r12.a();
    }

    private void c(p.f fVar, String str, int i2, int i3) {
        int G = fVar.G();
        int F = fVar.F();
        fVar.K0(0);
        fVar.J0(0);
        fVar.U0(i2);
        fVar.v0(i3);
        fVar.K0(G);
        fVar.J0(F);
        this.f4109c.b1();
    }

    public long d(p.f fVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean z2;
        int i11;
        int i12;
        p.f fVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i13;
        boolean z6;
        int i14;
        boolean z7;
        InterfaceC0062b r12 = fVar.r1();
        int size = fVar.D0.size();
        int R = fVar.R();
        int v2 = fVar.v();
        boolean b3 = p.j.b(i2, 128);
        boolean z8 = b3 || p.j.b(i2, 64);
        if (z8) {
            for (int i15 = 0; i15 < size; i15++) {
                p.e eVar = fVar.D0.get(i15);
                e.b y2 = eVar.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z9 = (y2 == bVar) && (eVar.O() == bVar) && eVar.t() > 0.0f;
                if ((eVar.Z() && z9) || ((eVar.b0() && z9) || (eVar instanceof p.k) || eVar.Z() || eVar.b0())) {
                    z8 = false;
                    break;
                }
            }
        }
        if (z8) {
            boolean z10 = o.d.f3877r;
        }
        boolean z11 = z8 & ((i5 == 1073741824 && i7 == 1073741824) || b3);
        int i16 = 2;
        if (z11) {
            int min = Math.min(fVar.E(), i6);
            int min2 = Math.min(fVar.D(), i8);
            if (i5 == 1073741824 && fVar.R() != min) {
                fVar.U0(min);
                fVar.u1();
            }
            if (i7 == 1073741824 && fVar.v() != min2) {
                fVar.v0(min2);
                fVar.u1();
            }
            if (i5 == 1073741824 && i7 == 1073741824) {
                z2 = fVar.o1(b3);
                i11 = 2;
            } else {
                boolean p12 = fVar.p1(b3);
                if (i5 == 1073741824) {
                    p12 &= fVar.q1(b3, 0);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i7 == 1073741824) {
                    z2 = fVar.q1(b3, 1) & p12;
                    i11++;
                } else {
                    z2 = p12;
                }
            }
            if (z2) {
                fVar.Y0(i5 == 1073741824, i7 == 1073741824);
            }
        } else {
            z2 = false;
            i11 = 0;
        }
        if (z2 && i11 == 2) {
            return 0L;
        }
        int s12 = fVar.s1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = this.f4107a.size();
        if (size > 0) {
            c(fVar, "First pass", R, v2);
        }
        if (size2 > 0) {
            e.b y3 = fVar.y();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z12 = y3 == bVar2;
            boolean z13 = fVar.O() == bVar2;
            int max = Math.max(fVar.R(), this.f4109c.G());
            int max2 = Math.max(fVar.v(), this.f4109c.F());
            int i17 = 0;
            boolean z14 = false;
            while (i17 < size2) {
                p.e eVar2 = this.f4107a.get(i17);
                if (eVar2 instanceof p.k) {
                    int R2 = eVar2.R();
                    i14 = s12;
                    int v3 = eVar2.v();
                    boolean a3 = a(r12, eVar2, a.f4111l) | z14;
                    int R3 = eVar2.R();
                    int v4 = eVar2.v();
                    if (R3 != R2) {
                        eVar2.U0(R3);
                        if (z12 && eVar2.K() > max) {
                            max = Math.max(max, eVar2.K() + eVar2.m(d.b.RIGHT).e());
                        }
                        z7 = true;
                    } else {
                        z7 = a3;
                    }
                    if (v4 != v3) {
                        eVar2.v0(v4);
                        if (z13 && eVar2.p() > max2) {
                            max2 = Math.max(max2, eVar2.p() + eVar2.m(d.b.BOTTOM).e());
                        }
                        z7 = true;
                    }
                    z14 = z7 | ((p.k) eVar2).d1();
                } else {
                    i14 = s12;
                }
                i17++;
                s12 = i14;
                i16 = 2;
            }
            i12 = s12;
            int i18 = i16;
            int i19 = 0;
            while (i19 < i18) {
                int i20 = 0;
                while (i20 < size2) {
                    p.e eVar3 = this.f4107a.get(i20);
                    if (((eVar3 instanceof p.h) && !(eVar3 instanceof p.k)) || (eVar3 instanceof p.g) || eVar3.Q() == 8 || ((z11 && eVar3.f4048e.f4189e.f4143j && eVar3.f4050f.f4189e.f4143j) || (eVar3 instanceof p.k))) {
                        z5 = z11;
                        i13 = size2;
                    } else {
                        int R4 = eVar3.R();
                        int v5 = eVar3.v();
                        z5 = z11;
                        int n2 = eVar3.n();
                        int i21 = a.f4111l;
                        i13 = size2;
                        if (i19 == 1) {
                            i21 = a.f4112m;
                        }
                        boolean a4 = a(r12, eVar3, i21) | z14;
                        int R5 = eVar3.R();
                        int v6 = eVar3.v();
                        if (R5 != R4) {
                            eVar3.U0(R5);
                            if (z12 && eVar3.K() > max) {
                                max = Math.max(max, eVar3.K() + eVar3.m(d.b.RIGHT).e());
                            }
                            z6 = true;
                        } else {
                            z6 = a4;
                        }
                        if (v6 != v5) {
                            eVar3.v0(v6);
                            if (z13 && eVar3.p() > max2) {
                                max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                            }
                            z6 = true;
                        }
                        z14 = (!eVar3.U() || n2 == eVar3.n()) ? z6 : true;
                    }
                    i20++;
                    size2 = i13;
                    z11 = z5;
                }
                boolean z15 = z11;
                int i22 = size2;
                if (!z14) {
                    break;
                }
                c(fVar, "intermediate pass", R, v2);
                i19++;
                size2 = i22;
                z11 = z15;
                i18 = 2;
                z14 = false;
            }
            fVar2 = fVar;
            if (z14) {
                c(fVar2, "2nd pass", R, v2);
                if (fVar.R() < max) {
                    fVar2.U0(max);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fVar.v() < max2) {
                    fVar2.v0(max2);
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (z4) {
                    c(fVar2, "3rd pass", R, v2);
                }
            }
        } else {
            i12 = s12;
            fVar2 = fVar;
        }
        fVar2.E1(i12);
        return 0L;
    }

    public void e(p.f fVar) {
        this.f4107a.clear();
        int size = fVar.D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            p.e eVar = fVar.D0.get(i2);
            e.b y2 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y2 == bVar || eVar.O() == bVar) {
                this.f4107a.add(eVar);
            }
        }
        fVar.u1();
    }
}
