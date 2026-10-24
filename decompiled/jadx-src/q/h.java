package q;

import java.util.ArrayList;
import java.util.Iterator;
import p.d;
import p.e;
import q.b;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static b.a f4156a = new b.a();

    private static boolean a(p.e eVar) {
        e.b y2 = eVar.y();
        e.b O = eVar.O();
        p.f fVar = eVar.I() != null ? (p.f) eVar.I() : null;
        if (fVar != null) {
            fVar.y();
            e.b bVar = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.O();
            e.b bVar2 = e.b.FIXED;
        }
        e.b bVar3 = e.b.FIXED;
        boolean z2 = y2 == bVar3 || y2 == e.b.WRAP_CONTENT || (y2 == e.b.MATCH_CONSTRAINT && eVar.f4070p == 0 && eVar.W == 0.0f && eVar.V(0)) || eVar.e0();
        boolean z3 = O == bVar3 || O == e.b.WRAP_CONTENT || (O == e.b.MATCH_CONSTRAINT && eVar.f4072q == 0 && eVar.W == 0.0f && eVar.V(1)) || eVar.f0();
        if (eVar.W <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    private static void b(p.e eVar, b.InterfaceC0062b interfaceC0062b, boolean z2) {
        p.d dVar;
        p.d dVar2;
        p.d dVar3;
        p.d dVar4;
        p.d dVar5;
        if (!(eVar instanceof p.f) && eVar.d0() && a(eVar)) {
            p.f.A1(eVar, interfaceC0062b, new b.a(), b.a.f4110k);
        }
        p.d m2 = eVar.m(d.b.LEFT);
        p.d m3 = eVar.m(d.b.RIGHT);
        int d3 = m2.d();
        int d4 = m3.d();
        if (m2.c() != null && m2.m()) {
            Iterator<p.d> it = m2.c().iterator();
            while (it.hasNext()) {
                p.d next = it.next();
                p.e eVar2 = next.f4023d;
                boolean a3 = a(eVar2);
                if (eVar2.d0() && a3) {
                    p.f.A1(eVar2, interfaceC0062b, new b.a(), b.a.f4110k);
                }
                e.b y2 = eVar2.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (y2 != bVar || a3) {
                    if (!eVar2.d0()) {
                        p.d dVar6 = eVar2.H;
                        if (next == dVar6 && eVar2.J.f4025f == null) {
                            int e3 = dVar6.e() + d3;
                            eVar2.p0(e3, eVar2.R() + e3);
                        } else {
                            p.d dVar7 = eVar2.J;
                            if (next == dVar7 && dVar6.f4025f == null) {
                                int e4 = d3 - dVar7.e();
                                eVar2.p0(e4 - eVar2.R(), e4);
                            } else if (next == dVar6 && (dVar3 = dVar7.f4025f) != null && dVar3.m() && !eVar2.Z()) {
                                d(interfaceC0062b, eVar2, z2);
                            }
                        }
                        b(eVar2, interfaceC0062b, z2);
                    }
                } else if (eVar2.y() == bVar && eVar2.f4078t >= 0 && eVar2.f4076s >= 0 && (eVar2.Q() == 8 || (eVar2.f4070p == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.Z() && !eVar2.c0()) {
                        if (((next == eVar2.H && (dVar5 = eVar2.J.f4025f) != null && dVar5.m()) || (next == eVar2.J && (dVar4 = eVar2.H.f4025f) != null && dVar4.m())) && !eVar2.Z()) {
                            e(eVar, interfaceC0062b, eVar2, z2);
                        }
                    }
                }
            }
        }
        if ((eVar instanceof p.g) || m3.c() == null || !m3.m()) {
            return;
        }
        Iterator<p.d> it2 = m3.c().iterator();
        while (it2.hasNext()) {
            p.d next2 = it2.next();
            p.e eVar3 = next2.f4023d;
            boolean a4 = a(eVar3);
            if (eVar3.d0() && a4) {
                p.f.A1(eVar3, interfaceC0062b, new b.a(), b.a.f4110k);
            }
            boolean z3 = (next2 == eVar3.H && (dVar2 = eVar3.J.f4025f) != null && dVar2.m()) || (next2 == eVar3.J && (dVar = eVar3.H.f4025f) != null && dVar.m());
            e.b y3 = eVar3.y();
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (y3 != bVar2 || a4) {
                if (!eVar3.d0()) {
                    p.d dVar8 = eVar3.H;
                    if (next2 == dVar8 && eVar3.J.f4025f == null) {
                        int e5 = dVar8.e() + d4;
                        eVar3.p0(e5, eVar3.R() + e5);
                    } else {
                        p.d dVar9 = eVar3.J;
                        if (next2 == dVar9 && dVar8.f4025f == null) {
                            int e6 = d4 - dVar9.e();
                            eVar3.p0(e6 - eVar3.R(), e6);
                        } else if (z3 && !eVar3.Z()) {
                            d(interfaceC0062b, eVar3, z2);
                        }
                    }
                    b(eVar3, interfaceC0062b, z2);
                }
            } else if (eVar3.y() == bVar2 && eVar3.f4078t >= 0 && eVar3.f4076s >= 0 && (eVar3.Q() == 8 || (eVar3.f4070p == 0 && eVar3.t() == 0.0f))) {
                if (!eVar3.Z() && !eVar3.c0() && z3 && !eVar3.Z()) {
                    e(eVar, interfaceC0062b, eVar3, z2);
                }
            }
        }
    }

    private static void c(p.a aVar, b.InterfaceC0062b interfaceC0062b, int i2, boolean z2) {
        if (aVar.c1()) {
            if (i2 == 0) {
                b(aVar, interfaceC0062b, z2);
            } else {
                i(aVar, interfaceC0062b);
            }
        }
    }

    private static void d(b.InterfaceC0062b interfaceC0062b, p.e eVar, boolean z2) {
        float w2 = eVar.w();
        int d3 = eVar.H.f4025f.d();
        int d4 = eVar.J.f4025f.d();
        int e3 = eVar.H.e() + d3;
        int e4 = d4 - eVar.J.e();
        if (d3 == d4) {
            w2 = 0.5f;
        } else {
            d3 = e3;
            d4 = e4;
        }
        int R = eVar.R();
        int i2 = (d4 - d3) - R;
        if (d3 > d4) {
            i2 = (d3 - d4) - R;
        }
        int i3 = ((int) ((w2 * i2) + 0.5f)) + d3;
        int i4 = i3 + R;
        if (d3 > d4) {
            i4 = i3 - R;
        }
        eVar.p0(i3, i4);
        b(eVar, interfaceC0062b, z2);
    }

    private static void e(p.e eVar, b.InterfaceC0062b interfaceC0062b, p.e eVar2, boolean z2) {
        float w2 = eVar2.w();
        int d3 = eVar2.H.f4025f.d() + eVar2.H.e();
        int d4 = eVar2.J.f4025f.d() - eVar2.J.e();
        if (d4 >= d3) {
            int R = eVar2.R();
            if (eVar2.Q() != 8) {
                int i2 = eVar2.f4070p;
                if (i2 == 2) {
                    if (!(eVar instanceof p.f)) {
                        eVar = eVar.I();
                    }
                    R = (int) (eVar2.w() * 0.5f * eVar.R());
                } else if (i2 == 0) {
                    R = d4 - d3;
                }
                R = Math.max(eVar2.f4076s, R);
                int i3 = eVar2.f4078t;
                if (i3 > 0) {
                    R = Math.min(i3, R);
                }
            }
            int i4 = d3 + ((int) ((w2 * ((d4 - d3) - R)) + 0.5f));
            eVar2.p0(i4, R + i4);
            b(eVar2, interfaceC0062b, z2);
        }
    }

    private static void f(b.InterfaceC0062b interfaceC0062b, p.e eVar) {
        float M = eVar.M();
        int d3 = eVar.I.f4025f.d();
        int d4 = eVar.K.f4025f.d();
        int e3 = eVar.I.e() + d3;
        int e4 = d4 - eVar.K.e();
        if (d3 == d4) {
            M = 0.5f;
        } else {
            d3 = e3;
            d4 = e4;
        }
        int v2 = eVar.v();
        int i2 = (d4 - d3) - v2;
        if (d3 > d4) {
            i2 = (d3 - d4) - v2;
        }
        int i3 = (int) ((M * i2) + 0.5f);
        int i4 = d3 + i3;
        int i5 = i4 + v2;
        if (d3 > d4) {
            i4 = d3 - i3;
            i5 = i4 - v2;
        }
        eVar.s0(i4, i5);
        i(eVar, interfaceC0062b);
    }

    private static void g(p.e eVar, b.InterfaceC0062b interfaceC0062b, p.e eVar2) {
        float M = eVar2.M();
        int d3 = eVar2.I.f4025f.d() + eVar2.I.e();
        int d4 = eVar2.K.f4025f.d() - eVar2.K.e();
        if (d4 >= d3) {
            int v2 = eVar2.v();
            if (eVar2.Q() != 8) {
                int i2 = eVar2.f4072q;
                if (i2 == 2) {
                    if (!(eVar instanceof p.f)) {
                        eVar = eVar.I();
                    }
                    v2 = (int) (M * 0.5f * eVar.v());
                } else if (i2 == 0) {
                    v2 = d4 - d3;
                }
                v2 = Math.max(eVar2.f4082v, v2);
                int i3 = eVar2.f4084w;
                if (i3 > 0) {
                    v2 = Math.min(i3, v2);
                }
            }
            int i4 = d3 + ((int) ((M * ((d4 - d3) - v2)) + 0.5f));
            eVar2.s0(i4, v2 + i4);
            i(eVar2, interfaceC0062b);
        }
    }

    public static void h(p.f fVar, b.InterfaceC0062b interfaceC0062b) {
        int e12;
        int e13;
        e.b y2 = fVar.y();
        e.b O = fVar.O();
        fVar.i0();
        ArrayList<p.e> a12 = fVar.a1();
        int size = a12.size();
        for (int i2 = 0; i2 < size; i2++) {
            a12.get(i2).i0();
        }
        boolean x12 = fVar.x1();
        if (y2 == e.b.FIXED) {
            fVar.p0(0, fVar.R());
        } else {
            fVar.q0(0);
        }
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            p.e eVar = a12.get(i3);
            if (eVar instanceof p.g) {
                p.g gVar = (p.g) eVar;
                if (gVar.b1() == 1) {
                    if (gVar.c1() != -1) {
                        e13 = gVar.c1();
                    } else if (gVar.d1() == -1 || !fVar.e0()) {
                        if (fVar.e0()) {
                            e13 = (int) ((gVar.e1() * fVar.R()) + 0.5f);
                        }
                        z2 = true;
                    } else {
                        e13 = fVar.R() - gVar.d1();
                    }
                    gVar.f1(e13);
                    z2 = true;
                }
            } else if ((eVar instanceof p.a) && ((p.a) eVar).g1() == 0) {
                z3 = true;
            }
        }
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                p.e eVar2 = a12.get(i4);
                if (eVar2 instanceof p.g) {
                    p.g gVar2 = (p.g) eVar2;
                    if (gVar2.b1() == 1) {
                        b(gVar2, interfaceC0062b, x12);
                    }
                }
            }
        }
        b(fVar, interfaceC0062b, x12);
        if (z3) {
            for (int i5 = 0; i5 < size; i5++) {
                p.e eVar3 = a12.get(i5);
                if (eVar3 instanceof p.a) {
                    p.a aVar = (p.a) eVar3;
                    if (aVar.g1() == 0) {
                        c(aVar, interfaceC0062b, 0, x12);
                    }
                }
            }
        }
        if (O == e.b.FIXED) {
            fVar.s0(0, fVar.v());
        } else {
            fVar.r0(0);
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            p.e eVar4 = a12.get(i6);
            if (eVar4 instanceof p.g) {
                p.g gVar3 = (p.g) eVar4;
                if (gVar3.b1() == 0) {
                    if (gVar3.c1() != -1) {
                        e12 = gVar3.c1();
                    } else if (gVar3.d1() == -1 || !fVar.f0()) {
                        if (fVar.f0()) {
                            e12 = (int) ((gVar3.e1() * fVar.v()) + 0.5f);
                        }
                        z4 = true;
                    } else {
                        e12 = fVar.v() - gVar3.d1();
                    }
                    gVar3.f1(e12);
                    z4 = true;
                }
            } else if ((eVar4 instanceof p.a) && ((p.a) eVar4).g1() == 1) {
                z5 = true;
            }
        }
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                p.e eVar5 = a12.get(i7);
                if (eVar5 instanceof p.g) {
                    p.g gVar4 = (p.g) eVar5;
                    if (gVar4.b1() == 0) {
                        i(gVar4, interfaceC0062b);
                    }
                }
            }
        }
        i(fVar, interfaceC0062b);
        if (z5) {
            for (int i8 = 0; i8 < size; i8++) {
                p.e eVar6 = a12.get(i8);
                if (eVar6 instanceof p.a) {
                    p.a aVar2 = (p.a) eVar6;
                    if (aVar2.g1() == 1) {
                        c(aVar2, interfaceC0062b, 1, x12);
                    }
                }
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            p.e eVar7 = a12.get(i9);
            if (eVar7.d0() && a(eVar7)) {
                p.f.A1(eVar7, interfaceC0062b, f4156a, b.a.f4110k);
                b(eVar7, interfaceC0062b, x12);
                i(eVar7, interfaceC0062b);
            }
        }
    }

    private static void i(p.e eVar, b.InterfaceC0062b interfaceC0062b) {
        p.d dVar;
        p.d dVar2;
        p.d dVar3;
        p.d dVar4;
        p.d dVar5;
        if (!(eVar instanceof p.f) && eVar.d0() && a(eVar)) {
            p.f.A1(eVar, interfaceC0062b, new b.a(), b.a.f4110k);
        }
        p.d m2 = eVar.m(d.b.TOP);
        p.d m3 = eVar.m(d.b.BOTTOM);
        int d3 = m2.d();
        int d4 = m3.d();
        if (m2.c() != null && m2.m()) {
            Iterator<p.d> it = m2.c().iterator();
            while (it.hasNext()) {
                p.d next = it.next();
                p.e eVar2 = next.f4023d;
                boolean a3 = a(eVar2);
                if (eVar2.d0() && a3) {
                    p.f.A1(eVar2, interfaceC0062b, new b.a(), b.a.f4110k);
                }
                e.b O = eVar2.O();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (O != bVar || a3) {
                    if (!eVar2.d0()) {
                        p.d dVar6 = eVar2.I;
                        if (next == dVar6 && eVar2.K.f4025f == null) {
                            int e3 = dVar6.e() + d3;
                            eVar2.s0(e3, eVar2.v() + e3);
                        } else {
                            p.d dVar7 = eVar2.K;
                            if (next == dVar7 && dVar7.f4025f == null) {
                                int e4 = d3 - dVar7.e();
                                eVar2.s0(e4 - eVar2.v(), e4);
                            } else if (next == dVar6 && (dVar3 = dVar7.f4025f) != null && dVar3.m()) {
                                f(interfaceC0062b, eVar2);
                            }
                        }
                        i(eVar2, interfaceC0062b);
                    }
                } else if (eVar2.O() == bVar && eVar2.f4084w >= 0 && eVar2.f4082v >= 0 && (eVar2.Q() == 8 || (eVar2.f4072q == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.b0() && !eVar2.c0()) {
                        if (((next == eVar2.I && (dVar5 = eVar2.K.f4025f) != null && dVar5.m()) || (next == eVar2.K && (dVar4 = eVar2.I.f4025f) != null && dVar4.m())) && !eVar2.b0()) {
                            g(eVar, interfaceC0062b, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof p.g) {
            return;
        }
        if (m3.c() != null && m3.m()) {
            Iterator<p.d> it2 = m3.c().iterator();
            while (it2.hasNext()) {
                p.d next2 = it2.next();
                p.e eVar3 = next2.f4023d;
                boolean a4 = a(eVar3);
                if (eVar3.d0() && a4) {
                    p.f.A1(eVar3, interfaceC0062b, new b.a(), b.a.f4110k);
                }
                boolean z2 = (next2 == eVar3.I && (dVar2 = eVar3.K.f4025f) != null && dVar2.m()) || (next2 == eVar3.K && (dVar = eVar3.I.f4025f) != null && dVar.m());
                e.b O2 = eVar3.O();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (O2 != bVar2 || a4) {
                    if (!eVar3.d0()) {
                        p.d dVar8 = eVar3.I;
                        if (next2 == dVar8 && eVar3.K.f4025f == null) {
                            int e5 = dVar8.e() + d4;
                            eVar3.s0(e5, eVar3.v() + e5);
                        } else {
                            p.d dVar9 = eVar3.K;
                            if (next2 == dVar9 && dVar8.f4025f == null) {
                                int e6 = d4 - dVar9.e();
                                eVar3.s0(e6 - eVar3.v(), e6);
                            } else if (z2 && !eVar3.b0()) {
                                f(interfaceC0062b, eVar3);
                            }
                        }
                        i(eVar3, interfaceC0062b);
                    }
                } else if (eVar3.O() == bVar2 && eVar3.f4084w >= 0 && eVar3.f4082v >= 0 && (eVar3.Q() == 8 || (eVar3.f4072q == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.b0() && !eVar3.c0() && z2 && !eVar3.b0()) {
                        g(eVar, interfaceC0062b, eVar3);
                    }
                }
            }
        }
        p.d m4 = eVar.m(d.b.BASELINE);
        if (m4.c() == null || !m4.m()) {
            return;
        }
        int d5 = m4.d();
        Iterator<p.d> it3 = m4.c().iterator();
        while (it3.hasNext()) {
            p.d next3 = it3.next();
            p.e eVar4 = next3.f4023d;
            boolean a5 = a(eVar4);
            if (eVar4.d0() && a5) {
                p.f.A1(eVar4, interfaceC0062b, new b.a(), b.a.f4110k);
            }
            if (eVar4.O() != e.b.MATCH_CONSTRAINT || a5) {
                if (!eVar4.d0() && next3 == eVar4.L) {
                    eVar4.o0(d5);
                    i(eVar4, interfaceC0062b);
                }
            }
        }
    }
}
