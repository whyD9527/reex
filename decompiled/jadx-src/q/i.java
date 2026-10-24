package q;

import java.util.ArrayList;
import java.util.Iterator;
import p.d;
import p.e;
import q.b;

/* loaded from: classes.dex */
public class i {
    public static o a(p.e eVar, int i2, ArrayList<o> arrayList, o oVar) {
        p.d dVar;
        int b12;
        int i3 = i2 == 0 ? eVar.A0 : eVar.B0;
        if (i3 != -1 && (oVar == null || i3 != oVar.f4172b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i4);
                if (oVar2.c() == i3) {
                    if (oVar != null) {
                        oVar.g(i2, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof p.i) && (b12 = ((p.i) eVar).b1(i2)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i5);
                    if (oVar3.c() == b12) {
                        oVar = oVar3;
                        break;
                    }
                    i5++;
                }
            }
            if (oVar == null) {
                oVar = new o(i2);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof p.g) {
                p.g gVar = (p.g) eVar;
                gVar.a1().b(gVar.b1() == 0 ? 1 : 0, arrayList, oVar);
            }
            int c3 = oVar.c();
            if (i2 == 0) {
                eVar.A0 = c3;
                eVar.H.b(i2, arrayList, oVar);
                dVar = eVar.J;
            } else {
                eVar.B0 = c3;
                eVar.I.b(i2, arrayList, oVar);
                eVar.L.b(i2, arrayList, oVar);
                dVar = eVar.K;
            }
            dVar.b(i2, arrayList, oVar);
            eVar.O.b(i2, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = arrayList.get(i3);
            if (i2 == oVar.f4172b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x037d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0379  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(p.f fVar, b.InterfaceC0062b interfaceC0062b) {
        o oVar;
        boolean z2;
        o oVar2;
        p.i iVar;
        ArrayList<p.e> a12 = fVar.a1();
        int size = a12.size();
        for (int i2 = 0; i2 < size; i2++) {
            p.e eVar = a12.get(i2);
            if (!d(fVar.y(), fVar.O(), eVar.y(), eVar.O())) {
                return false;
            }
        }
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        for (int i3 = 0; i3 < size; i3++) {
            p.e eVar2 = a12.get(i3);
            if (!d(fVar.y(), fVar.O(), eVar2.y(), eVar2.O())) {
                p.f.A1(eVar2, interfaceC0062b, fVar.f4104f1, b.a.f4110k);
            }
            boolean z3 = eVar2 instanceof p.g;
            if (z3) {
                p.g gVar = (p.g) eVar2;
                if (gVar.b1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(gVar);
                }
                if (gVar.b1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(gVar);
                }
            }
            if (eVar2 instanceof p.i) {
                if (eVar2 instanceof p.a) {
                    p.a aVar = (p.a) eVar2;
                    if (aVar.g1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    int g12 = aVar.g1();
                    iVar = aVar;
                    if (g12 == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            iVar = aVar;
                        }
                    }
                } else {
                    p.i iVar2 = (p.i) eVar2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(iVar2);
                    iVar = iVar2;
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        iVar = iVar2;
                    }
                }
                arrayList4.add(iVar);
            }
            if (eVar2.H.f4025f == null && eVar2.J.f4025f == null && !z3 && !(eVar2 instanceof p.a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(eVar2);
            }
            if (eVar2.I.f4025f == null && eVar2.K.f4025f == null && eVar2.L.f4025f == null && !z3 && !(eVar2 instanceof p.a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(eVar2);
            }
        }
        ArrayList<o> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((p.g) it.next(), 0, arrayList7, null);
            }
        }
        int i4 = 0;
        o oVar3 = null;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                p.i iVar3 = (p.i) it2.next();
                o a3 = a(iVar3, i4, arrayList7, oVar3);
                iVar3.a1(arrayList7, i4, a3);
                a3.b(arrayList7);
                i4 = 0;
                oVar3 = null;
            }
        }
        p.d m2 = fVar.m(d.b.LEFT);
        if (m2.c() != null) {
            Iterator<p.d> it3 = m2.c().iterator();
            while (it3.hasNext()) {
                a(it3.next().f4023d, 0, arrayList7, null);
            }
        }
        p.d m3 = fVar.m(d.b.RIGHT);
        if (m3.c() != null) {
            Iterator<p.d> it4 = m3.c().iterator();
            while (it4.hasNext()) {
                a(it4.next().f4023d, 0, arrayList7, null);
            }
        }
        p.d m4 = fVar.m(d.b.CENTER);
        if (m4.c() != null) {
            Iterator<p.d> it5 = m4.c().iterator();
            while (it5.hasNext()) {
                a(it5.next().f4023d, 0, arrayList7, null);
            }
        }
        o oVar4 = null;
        if (arrayList5 != null) {
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                a((p.e) it6.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                a((p.g) it7.next(), 1, arrayList7, null);
            }
        }
        if (arrayList4 != null) {
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                p.i iVar4 = (p.i) it8.next();
                o a4 = a(iVar4, 1, arrayList7, oVar4);
                iVar4.a1(arrayList7, 1, a4);
                a4.b(arrayList7);
                oVar4 = null;
            }
        }
        p.d m5 = fVar.m(d.b.TOP);
        if (m5.c() != null) {
            Iterator<p.d> it9 = m5.c().iterator();
            while (it9.hasNext()) {
                a(it9.next().f4023d, 1, arrayList7, null);
            }
        }
        p.d m6 = fVar.m(d.b.BASELINE);
        if (m6.c() != null) {
            Iterator<p.d> it10 = m6.c().iterator();
            while (it10.hasNext()) {
                a(it10.next().f4023d, 1, arrayList7, null);
            }
        }
        p.d m7 = fVar.m(d.b.BOTTOM);
        if (m7.c() != null) {
            Iterator<p.d> it11 = m7.c().iterator();
            while (it11.hasNext()) {
                a(it11.next().f4023d, 1, arrayList7, null);
            }
        }
        p.d m8 = fVar.m(d.b.CENTER);
        if (m8.c() != null) {
            Iterator<p.d> it12 = m8.c().iterator();
            while (it12.hasNext()) {
                a(it12.next().f4023d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it13 = arrayList6.iterator();
            while (it13.hasNext()) {
                a((p.e) it13.next(), 1, arrayList7, null);
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            p.e eVar3 = a12.get(i5);
            if (eVar3.g0()) {
                o b3 = b(arrayList7, eVar3.A0);
                o b4 = b(arrayList7, eVar3.B0);
                if (b3 != null && b4 != null) {
                    b3.g(0, b4);
                    b4.i(2);
                    arrayList7.remove(b3);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (fVar.y() == e.b.WRAP_CONTENT) {
            Iterator<o> it14 = arrayList7.iterator();
            oVar = null;
            int i6 = 0;
            while (it14.hasNext()) {
                o next = it14.next();
                if (next.d() != 1) {
                    next.h(false);
                    int f2 = next.f(fVar.t1(), 0);
                    if (f2 > i6) {
                        oVar = next;
                        i6 = f2;
                    }
                }
            }
            if (oVar != null) {
                fVar.z0(e.b.FIXED);
                fVar.U0(i6);
                oVar.h(true);
                if (fVar.O() != e.b.WRAP_CONTENT) {
                    Iterator<o> it15 = arrayList7.iterator();
                    o oVar5 = null;
                    int i7 = 0;
                    while (it15.hasNext()) {
                        o next2 = it15.next();
                        if (next2.d() != 0) {
                            next2.h(false);
                            int f3 = next2.f(fVar.t1(), 1);
                            if (f3 > i7) {
                                oVar5 = next2;
                                i7 = f3;
                            }
                        }
                    }
                    z2 = false;
                    if (oVar5 != null) {
                        fVar.Q0(e.b.FIXED);
                        fVar.v0(i7);
                        oVar5.h(true);
                        oVar2 = oVar5;
                        if (oVar == null || oVar2 != null) {
                            return true;
                        }
                        return z2;
                    }
                } else {
                    z2 = false;
                }
                oVar2 = null;
                if (oVar == null) {
                }
                return true;
            }
        }
        oVar = null;
        if (fVar.O() != e.b.WRAP_CONTENT) {
        }
        oVar2 = null;
        if (oVar == null) {
        }
        return true;
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
