package p;

import java.util.ArrayList;
import p.e;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f3998a;

    /* renamed from: b, reason: collision with root package name */
    protected e f3999b;

    /* renamed from: c, reason: collision with root package name */
    protected e f4000c;

    /* renamed from: d, reason: collision with root package name */
    protected e f4001d;

    /* renamed from: e, reason: collision with root package name */
    protected e f4002e;

    /* renamed from: f, reason: collision with root package name */
    protected e f4003f;

    /* renamed from: g, reason: collision with root package name */
    protected e f4004g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f4005h;

    /* renamed from: i, reason: collision with root package name */
    protected int f4006i;

    /* renamed from: j, reason: collision with root package name */
    protected int f4007j;

    /* renamed from: k, reason: collision with root package name */
    protected float f4008k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f4009l;

    /* renamed from: m, reason: collision with root package name */
    int f4010m;

    /* renamed from: n, reason: collision with root package name */
    int f4011n;

    /* renamed from: o, reason: collision with root package name */
    boolean f4012o;

    /* renamed from: p, reason: collision with root package name */
    private int f4013p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4014q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f4015r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f4016s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f4017t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f4018u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f4019v;

    public c(e eVar, int i2, boolean z2) {
        this.f3998a = eVar;
        this.f4013p = i2;
        this.f4014q = z2;
    }

    private void b() {
        int i2 = this.f4013p * 2;
        e eVar = this.f3998a;
        this.f4012o = true;
        e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f4006i++;
            e[] eVarArr = eVar.f4087x0;
            int i3 = this.f4013p;
            e eVar3 = null;
            eVarArr[i3] = null;
            eVar.f4085w0[i3] = null;
            if (eVar.Q() != 8) {
                this.f4009l++;
                e.b s2 = eVar.s(this.f4013p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s2 != bVar) {
                    this.f4010m += eVar.C(this.f4013p);
                }
                int e3 = this.f4010m + eVar.P[i2].e();
                this.f4010m = e3;
                int i4 = i2 + 1;
                this.f4010m = e3 + eVar.P[i4].e();
                int e4 = this.f4011n + eVar.P[i2].e();
                this.f4011n = e4;
                this.f4011n = e4 + eVar.P[i4].e();
                if (this.f3999b == null) {
                    this.f3999b = eVar;
                }
                this.f4001d = eVar;
                e.b[] bVarArr = eVar.S;
                int i5 = this.f4013p;
                if (bVarArr[i5] == bVar) {
                    int i6 = eVar.f4074r[i5];
                    if (i6 == 0 || i6 == 3 || i6 == 2) {
                        this.f4007j++;
                        float f2 = eVar.f4083v0[i5];
                        if (f2 > 0.0f) {
                            this.f4008k += f2;
                        }
                        if (c(eVar, i5)) {
                            if (f2 < 0.0f) {
                                this.f4015r = true;
                            } else {
                                this.f4016s = true;
                            }
                            if (this.f4005h == null) {
                                this.f4005h = new ArrayList<>();
                            }
                            this.f4005h.add(eVar);
                        }
                        if (this.f4003f == null) {
                            this.f4003f = eVar;
                        }
                        e eVar4 = this.f4004g;
                        if (eVar4 != null) {
                            eVar4.f4085w0[this.f4013p] = eVar;
                        }
                        this.f4004g = eVar;
                    }
                    if (this.f4013p != 0 ? !(eVar.f4072q == 0 && eVar.f4082v == 0 && eVar.f4084w == 0) : !(eVar.f4070p == 0 && eVar.f4076s == 0 && eVar.f4078t == 0)) {
                        this.f4012o = false;
                    }
                    if (eVar.W != 0.0f) {
                        this.f4012o = false;
                        this.f4018u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f4087x0[this.f4013p] = eVar;
            }
            d dVar = eVar.P[i2 + 1].f4025f;
            if (dVar != null) {
                e eVar5 = dVar.f4023d;
                d dVar2 = eVar5.P[i2].f4025f;
                if (dVar2 != null && dVar2.f4023d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f3999b;
        if (eVar6 != null) {
            this.f4010m -= eVar6.P[i2].e();
        }
        e eVar7 = this.f4001d;
        if (eVar7 != null) {
            this.f4010m -= eVar7.P[i2 + 1].e();
        }
        this.f4000c = eVar;
        if (this.f4013p == 0 && this.f4014q) {
            this.f4002e = eVar;
        } else {
            this.f4002e = this.f3998a;
        }
        this.f4017t = this.f4016s && this.f4015r;
    }

    private static boolean c(e eVar, int i2) {
        int i3;
        return eVar.Q() != 8 && eVar.S[i2] == e.b.MATCH_CONSTRAINT && ((i3 = eVar.f4074r[i2]) == 0 || i3 == 3);
    }

    public void a() {
        if (!this.f4019v) {
            b();
        }
        this.f4019v = true;
    }
}
