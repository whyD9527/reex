package p;

import p.e;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f4106a = new boolean[3];

    static void a(f fVar, o.d dVar, e eVar) {
        eVar.f4066n = -1;
        eVar.f4068o = -1;
        e.b bVar = fVar.S[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.S[0] == e.b.MATCH_PARENT) {
            int i2 = eVar.H.f4026g;
            int R = fVar.R() - eVar.J.f4026g;
            d dVar2 = eVar.H;
            dVar2.f4028i = dVar.q(dVar2);
            d dVar3 = eVar.J;
            dVar3.f4028i = dVar.q(dVar3);
            dVar.f(eVar.H.f4028i, i2);
            dVar.f(eVar.J.f4028i, R);
            eVar.f4066n = 2;
            eVar.y0(i2, R);
        }
        if (fVar.S[1] == bVar2 || eVar.S[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i3 = eVar.I.f4026g;
        int v2 = fVar.v() - eVar.K.f4026g;
        d dVar4 = eVar.I;
        dVar4.f4028i = dVar.q(dVar4);
        d dVar5 = eVar.K;
        dVar5.f4028i = dVar.q(dVar5);
        dVar.f(eVar.I.f4028i, i3);
        dVar.f(eVar.K.f4028i, v2);
        if (eVar.f4049e0 > 0 || eVar.Q() == 8) {
            d dVar6 = eVar.L;
            dVar6.f4028i = dVar.q(dVar6);
            dVar.f(eVar.L.f4028i, eVar.f4049e0 + i3);
        }
        eVar.f4068o = 2;
        eVar.P0(i3, v2);
    }

    public static final boolean b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
