package q;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p.e;
import q.b;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private p.f f4125a;

    /* renamed from: d, reason: collision with root package name */
    private p.f f4128d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4126b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4127c = true;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<p> f4129e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<m> f4130f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private b.InterfaceC0062b f4131g = null;

    /* renamed from: h, reason: collision with root package name */
    private b.a f4132h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<m> f4133i = new ArrayList<>();

    public e(p.f fVar) {
        this.f4125a = fVar;
        this.f4128d = fVar;
    }

    private void a(f fVar, int i2, int i3, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f4137d;
        if (pVar.f4187c == null) {
            p.f fVar3 = this.f4125a;
            if (pVar == fVar3.f4048e || pVar == fVar3.f4050f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i3);
                arrayList.add(mVar);
            }
            pVar.f4187c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f4192h.f4144k) {
                if (dVar instanceof f) {
                    a((f) dVar, i2, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f4193i.f4144k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i2, 1, fVar2, arrayList, mVar);
                }
            }
            if (i2 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f4167k.f4144k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i2, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f4192h.f4145l) {
                if (fVar4 == fVar2) {
                    mVar.f4161b = true;
                }
                a(fVar4, i2, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f4193i.f4145l) {
                if (fVar5 == fVar2) {
                    mVar.f4161b = true;
                }
                a(fVar5, i2, 1, fVar2, arrayList, mVar);
            }
            if (i2 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f4167k.f4145l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i2, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if (r2.f4072q == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b(p.f fVar) {
        int i2;
        e.b bVar;
        int i3;
        e.b bVar2;
        e eVar;
        p.e eVar2;
        e.b[] bVarArr;
        e.b bVar3;
        g gVar;
        int v2;
        e.b bVar4;
        e.b bVar5;
        Iterator<p.e> it = fVar.D0.iterator();
        while (it.hasNext()) {
            p.e next = it.next();
            e.b[] bVarArr2 = next.S;
            e.b bVar6 = bVarArr2[0];
            e.b bVar7 = bVarArr2[1];
            if (next.Q() != 8) {
                if (next.f4080u < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    next.f4070p = 2;
                }
                if (next.f4086x < 1.0f && bVar7 == e.b.MATCH_CONSTRAINT) {
                    next.f4072q = 2;
                }
                if (next.t() > 0.0f) {
                    e.b bVar8 = e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == e.b.WRAP_CONTENT || bVar7 == e.b.FIXED)) {
                        next.f4070p = 3;
                    } else {
                        if (bVar7 != bVar8 || (bVar6 != e.b.WRAP_CONTENT && bVar6 != e.b.FIXED)) {
                            if (bVar6 == bVar8 && bVar7 == bVar8) {
                                if (next.f4070p == 0) {
                                    next.f4070p = 3;
                                }
                            }
                        }
                        next.f4072q = 3;
                    }
                }
                e.b bVar9 = e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && next.f4070p == 1 && (next.H.f4025f == null || next.J.f4025f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                if (bVar7 == bVar9 && next.f4072q == 1 && (next.I.f4025f == null || next.K.f4025f == null)) {
                    bVar7 = e.b.WRAP_CONTENT;
                }
                e.b bVar11 = bVar7;
                l lVar = next.f4048e;
                lVar.f4188d = bVar10;
                int i4 = next.f4070p;
                lVar.f4185a = i4;
                n nVar = next.f4050f;
                nVar.f4188d = bVar11;
                int i5 = next.f4072q;
                nVar.f4185a = i5;
                e.b bVar12 = e.b.MATCH_PARENT;
                if ((bVar10 == bVar12 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT) && (bVar11 == bVar12 || bVar11 == e.b.FIXED || bVar11 == e.b.WRAP_CONTENT)) {
                    int R = next.R();
                    if (bVar10 == bVar12) {
                        i2 = (fVar.R() - next.H.f4026g) - next.J.f4026g;
                        bVar = e.b.FIXED;
                    } else {
                        i2 = R;
                        bVar = bVar10;
                    }
                    int v3 = next.v();
                    if (bVar11 == bVar12) {
                        i3 = (fVar.v() - next.I.f4026g) - next.K.f4026g;
                        bVar2 = e.b.FIXED;
                    } else {
                        i3 = v3;
                        bVar2 = bVar11;
                    }
                    eVar = this;
                    eVar2 = next;
                } else {
                    if (bVar10 == bVar9 && (bVar11 == (bVar5 = e.b.WRAP_CONTENT) || bVar11 == e.b.FIXED)) {
                        if (i4 == 3) {
                            if (bVar11 == bVar5) {
                                l(next, bVar5, 0, bVar5, 0);
                            }
                            i3 = next.v();
                            i2 = (int) ((i3 * next.W) + 0.5f);
                            bVar2 = e.b.FIXED;
                            eVar = this;
                            eVar2 = next;
                            bVar = bVar2;
                        } else if (i4 == 1) {
                            l(next, bVar5, 0, bVar11, 0);
                            gVar = next.f4048e.f4189e;
                            v2 = next.R();
                            gVar.f4155m = v2;
                        } else if (i4 == 2) {
                            e.b bVar13 = fVar.S[0];
                            bVar5 = e.b.FIXED;
                            if (bVar13 == bVar5 || bVar13 == bVar12) {
                                i2 = (int) ((next.f4080u * fVar.R()) + 0.5f);
                                i3 = next.v();
                                eVar = this;
                                eVar2 = next;
                                bVar = bVar5;
                                bVar2 = bVar11;
                            }
                        } else {
                            p.d[] dVarArr = next.P;
                            if (dVarArr[0].f4025f == null || dVarArr[1].f4025f == null) {
                                i2 = 0;
                                i3 = 0;
                                eVar = this;
                                eVar2 = next;
                                bVar = bVar5;
                                bVar2 = bVar11;
                            }
                        }
                    }
                    if (bVar11 == bVar9 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i5 == 3) {
                            if (bVar10 == bVar4) {
                                l(next, bVar4, 0, bVar4, 0);
                            }
                            i2 = next.R();
                            float f2 = next.W;
                            if (next.u() == -1) {
                                f2 = 1.0f / f2;
                            }
                            i3 = (int) ((i2 * f2) + 0.5f);
                            bVar2 = e.b.FIXED;
                            eVar = this;
                            eVar2 = next;
                            bVar = bVar2;
                        } else if (i5 == 1) {
                            l(next, bVar10, 0, bVar4, 0);
                            gVar = next.f4050f.f4189e;
                            v2 = next.v();
                            gVar.f4155m = v2;
                        } else if (i5 == 2) {
                            e.b bVar14 = fVar.S[1];
                            bVar2 = e.b.FIXED;
                            if (bVar14 == bVar2 || bVar14 == bVar12) {
                                float f3 = next.f4086x;
                                i2 = next.R();
                                eVar = this;
                                eVar2 = next;
                                bVar = bVar10;
                                i3 = (int) ((f3 * fVar.v()) + 0.5f);
                            }
                        } else {
                            p.d[] dVarArr2 = next.P;
                            if (dVarArr2[2].f4025f == null || dVarArr2[3].f4025f == null) {
                                i2 = 0;
                                i3 = 0;
                                eVar = this;
                                eVar2 = next;
                                bVar = bVar4;
                                bVar2 = bVar11;
                            }
                        }
                    }
                    if (bVar10 == bVar9 && bVar11 == bVar9) {
                        if (i4 == 1 || i5 == 1) {
                            e.b bVar15 = e.b.WRAP_CONTENT;
                            l(next, bVar15, 0, bVar15, 0);
                            next.f4048e.f4189e.f4155m = next.R();
                            gVar = next.f4050f.f4189e;
                            v2 = next.v();
                            gVar.f4155m = v2;
                        } else if (i5 == 2 && i4 == 2 && ((bVar3 = (bVarArr = fVar.S)[0]) == (bVar2 = e.b.FIXED) || bVar3 == bVar2)) {
                            e.b bVar16 = bVarArr[1];
                            if (bVar16 == bVar2 || bVar16 == bVar2) {
                                float f4 = next.f4080u;
                                i2 = (int) ((f4 * fVar.R()) + 0.5f);
                                i3 = (int) ((next.f4086x * fVar.v()) + 0.5f);
                                eVar = this;
                                eVar2 = next;
                                bVar = bVar2;
                            }
                        }
                    }
                }
                eVar.l(eVar2, bVar, i2, bVar2, i3);
                next.f4048e.f4189e.d(next.R());
                next.f4050f.f4189e.d(next.v());
            }
            next.f4040a = true;
        }
        return false;
    }

    private int e(p.f fVar, int i2) {
        int size = this.f4133i.size();
        long j2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j2 = Math.max(j2, this.f4133i.get(i3).b(fVar, i2));
        }
        return (int) j2;
    }

    private void i(p pVar, int i2, ArrayList<m> arrayList) {
        for (d dVar : pVar.f4192h.f4144k) {
            if (dVar instanceof f) {
                a((f) dVar, i2, 0, pVar.f4193i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f4192h, i2, 0, pVar.f4193i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f4193i.f4144k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, 1, pVar.f4192h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f4193i, i2, 1, pVar.f4192h, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (d dVar3 : ((n) pVar).f4167k.f4144k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(p.e eVar, e.b bVar, int i2, e.b bVar2, int i3) {
        b.a aVar = this.f4132h;
        aVar.f4113a = bVar;
        aVar.f4114b = bVar2;
        aVar.f4115c = i2;
        aVar.f4116d = i3;
        this.f4131g.b(eVar, aVar);
        eVar.U0(this.f4132h.f4117e);
        eVar.v0(this.f4132h.f4118f);
        eVar.u0(this.f4132h.f4120h);
        eVar.k0(this.f4132h.f4119g);
    }

    public void c() {
        d(this.f4129e);
        this.f4133i.clear();
        m.f4159h = 0;
        i(this.f4125a.f4048e, 0, this.f4133i);
        i(this.f4125a.f4050f, 1, this.f4133i);
        this.f4126b = false;
    }

    public void d(ArrayList<p> arrayList) {
        p jVar;
        arrayList.clear();
        this.f4128d.f4048e.f();
        this.f4128d.f4050f.f();
        arrayList.add(this.f4128d.f4048e);
        arrayList.add(this.f4128d.f4050f);
        Iterator<p.e> it = this.f4128d.D0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            p.e next = it.next();
            if (next instanceof p.g) {
                jVar = new j(next);
            } else {
                if (next.Z()) {
                    if (next.f4044c == null) {
                        next.f4044c = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f4044c);
                } else {
                    arrayList.add(next.f4048e);
                }
                if (next.b0()) {
                    if (next.f4046d == null) {
                        next.f4046d = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f4046d);
                } else {
                    arrayList.add(next.f4050f);
                }
                if (next instanceof p.i) {
                    jVar = new k(next);
                }
            }
            arrayList.add(jVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f4186b != this.f4128d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = z2 & true;
        if (this.f4126b || this.f4127c) {
            Iterator<p.e> it = this.f4125a.D0.iterator();
            while (it.hasNext()) {
                p.e next = it.next();
                next.l();
                next.f4040a = false;
                next.f4048e.r();
                next.f4050f.q();
            }
            this.f4125a.l();
            p.f fVar = this.f4125a;
            fVar.f4040a = false;
            fVar.f4048e.r();
            this.f4125a.f4050f.q();
            this.f4127c = false;
        }
        if (b(this.f4128d)) {
            return false;
        }
        this.f4125a.V0(0);
        this.f4125a.W0(0);
        e.b s2 = this.f4125a.s(0);
        e.b s3 = this.f4125a.s(1);
        if (this.f4126b) {
            c();
        }
        int S = this.f4125a.S();
        int T = this.f4125a.T();
        this.f4125a.f4048e.f4192h.d(S);
        this.f4125a.f4050f.f4192h.d(T);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s2 == bVar || s3 == bVar) {
            if (z5) {
                Iterator<p> it2 = this.f4129e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().m()) {
                        z5 = false;
                        break;
                    }
                }
            }
            if (z5 && s2 == e.b.WRAP_CONTENT) {
                this.f4125a.z0(e.b.FIXED);
                p.f fVar2 = this.f4125a;
                fVar2.U0(e(fVar2, 0));
                p.f fVar3 = this.f4125a;
                fVar3.f4048e.f4189e.d(fVar3.R());
            }
            if (z5 && s3 == e.b.WRAP_CONTENT) {
                this.f4125a.Q0(e.b.FIXED);
                p.f fVar4 = this.f4125a;
                fVar4.v0(e(fVar4, 1));
                p.f fVar5 = this.f4125a;
                fVar5.f4050f.f4189e.d(fVar5.v());
            }
        }
        p.f fVar6 = this.f4125a;
        e.b bVar2 = fVar6.S[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int R = fVar6.R() + S;
            this.f4125a.f4048e.f4193i.d(R);
            this.f4125a.f4048e.f4189e.d(R - S);
            m();
            p.f fVar7 = this.f4125a;
            e.b bVar4 = fVar7.S[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int v2 = fVar7.v() + T;
                this.f4125a.f4050f.f4193i.d(v2);
                this.f4125a.f4050f.f4189e.d(v2 - T);
            }
            m();
            z3 = true;
        } else {
            z3 = false;
        }
        Iterator<p> it3 = this.f4129e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f4186b != this.f4125a || next2.f4191g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f4129e.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (z3 || next3.f4186b != this.f4125a) {
                if (!next3.f4192h.f4143j || ((!next3.f4193i.f4143j && !(next3 instanceof j)) || (!next3.f4189e.f4143j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z4 = false;
                    break;
                }
            }
        }
        this.f4125a.z0(s2);
        this.f4125a.Q0(s3);
        return z4;
    }

    public boolean g(boolean z2) {
        if (this.f4126b) {
            Iterator<p.e> it = this.f4125a.D0.iterator();
            while (it.hasNext()) {
                p.e next = it.next();
                next.l();
                next.f4040a = false;
                l lVar = next.f4048e;
                lVar.f4189e.f4143j = false;
                lVar.f4191g = false;
                lVar.r();
                n nVar = next.f4050f;
                nVar.f4189e.f4143j = false;
                nVar.f4191g = false;
                nVar.q();
            }
            this.f4125a.l();
            p.f fVar = this.f4125a;
            fVar.f4040a = false;
            l lVar2 = fVar.f4048e;
            lVar2.f4189e.f4143j = false;
            lVar2.f4191g = false;
            lVar2.r();
            n nVar2 = this.f4125a.f4050f;
            nVar2.f4189e.f4143j = false;
            nVar2.f4191g = false;
            nVar2.q();
            c();
        }
        if (b(this.f4128d)) {
            return false;
        }
        this.f4125a.V0(0);
        this.f4125a.W0(0);
        this.f4125a.f4048e.f4192h.d(0);
        this.f4125a.f4050f.f4192h.d(0);
        return true;
    }

    public boolean h(boolean z2, int i2) {
        boolean z3;
        e.b bVar;
        g gVar;
        int v2;
        boolean z4 = true;
        boolean z5 = z2 & true;
        e.b s2 = this.f4125a.s(0);
        e.b s3 = this.f4125a.s(1);
        int S = this.f4125a.S();
        int T = this.f4125a.T();
        if (z5 && (s2 == (bVar = e.b.WRAP_CONTENT) || s3 == bVar)) {
            Iterator<p> it = this.f4129e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f4190f == i2 && !next.m()) {
                    z5 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z5 && s2 == e.b.WRAP_CONTENT) {
                    this.f4125a.z0(e.b.FIXED);
                    p.f fVar = this.f4125a;
                    fVar.U0(e(fVar, 0));
                    p.f fVar2 = this.f4125a;
                    gVar = fVar2.f4048e.f4189e;
                    v2 = fVar2.R();
                    gVar.d(v2);
                }
            } else if (z5 && s3 == e.b.WRAP_CONTENT) {
                this.f4125a.Q0(e.b.FIXED);
                p.f fVar3 = this.f4125a;
                fVar3.v0(e(fVar3, 1));
                p.f fVar4 = this.f4125a;
                gVar = fVar4.f4050f.f4189e;
                v2 = fVar4.v();
                gVar.d(v2);
            }
        }
        p.f fVar5 = this.f4125a;
        if (i2 == 0) {
            e.b bVar2 = fVar5.S[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int R = fVar5.R() + S;
                this.f4125a.f4048e.f4193i.d(R);
                this.f4125a.f4048e.f4189e.d(R - S);
                z3 = true;
            }
            z3 = false;
        } else {
            e.b bVar3 = fVar5.S[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int v3 = fVar5.v() + T;
                this.f4125a.f4050f.f4193i.d(v3);
                this.f4125a.f4050f.f4189e.d(v3 - T);
                z3 = true;
            }
            z3 = false;
        }
        m();
        Iterator<p> it2 = this.f4129e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f4190f == i2 && (next2.f4186b != this.f4125a || next2.f4191g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f4129e.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f4190f == i2 && (z3 || next3.f4186b != this.f4125a)) {
                if (!next3.f4192h.f4143j || !next3.f4193i.f4143j || (!(next3 instanceof c) && !next3.f4189e.f4143j)) {
                    z4 = false;
                    break;
                }
            }
        }
        this.f4125a.z0(s2);
        this.f4125a.Q0(s3);
        return z4;
    }

    public void j() {
        this.f4126b = true;
    }

    public void k() {
        this.f4127c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m() {
        g gVar;
        int R;
        g gVar2;
        int R2;
        g gVar3;
        Iterator<p.e> it = this.f4125a.D0.iterator();
        while (it.hasNext()) {
            p.e next = it.next();
            if (!next.f4040a) {
                e.b[] bVarArr = next.S;
                boolean z2 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i2 = next.f4070p;
                int i3 = next.f4072q;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z3 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i2 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i3 == 1)) {
                    z2 = true;
                }
                g gVar4 = next.f4048e.f4189e;
                boolean z4 = gVar4.f4143j;
                g gVar5 = next.f4050f.f4189e;
                boolean z5 = gVar5.f4143j;
                if (z4 && z5) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar4.f4140g, bVar4, gVar5.f4140g);
                } else if (z4 && z2) {
                    l(next, e.b.FIXED, gVar4.f4140g, bVar3, gVar5.f4140g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        gVar2 = next.f4050f.f4189e;
                        R2 = next.v();
                        gVar2.f4155m = R2;
                        if (!next.f4040a) {
                            gVar3.d(next.n());
                        }
                    } else {
                        gVar = next.f4050f.f4189e;
                        R = next.v();
                        gVar.d(R);
                    }
                } else {
                    if (z5 && z3) {
                        l(next, bVar3, gVar4.f4140g, e.b.FIXED, gVar5.f4140g);
                        if (bVar == e.b.MATCH_CONSTRAINT) {
                            gVar2 = next.f4048e.f4189e;
                            R2 = next.R();
                            gVar2.f4155m = R2;
                        } else {
                            gVar = next.f4048e.f4189e;
                            R = next.R();
                            gVar.d(R);
                        }
                    }
                    if (!next.f4040a && (gVar3 = next.f4050f.f4168l) != null) {
                        gVar3.d(next.n());
                    }
                }
                next.f4040a = true;
                if (!next.f4040a) {
                }
            }
        }
    }

    public void n(b.InterfaceC0062b interfaceC0062b) {
        this.f4131g = interfaceC0062b;
    }
}
