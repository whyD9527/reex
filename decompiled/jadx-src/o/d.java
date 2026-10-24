package o;

import java.util.Arrays;
import java.util.HashMap;
import o.i;
import p.d;

/* loaded from: classes.dex */
public class d {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f3877r = false;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f3878s = true;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f3879t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f3880u = true;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f3881v = false;

    /* renamed from: w, reason: collision with root package name */
    private static int f3882w = 1000;

    /* renamed from: x, reason: collision with root package name */
    public static long f3883x;

    /* renamed from: y, reason: collision with root package name */
    public static long f3884y;

    /* renamed from: d, reason: collision with root package name */
    private a f3888d;

    /* renamed from: g, reason: collision with root package name */
    o.b[] f3891g;

    /* renamed from: n, reason: collision with root package name */
    final c f3898n;

    /* renamed from: q, reason: collision with root package name */
    private a f3901q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3885a = false;

    /* renamed from: b, reason: collision with root package name */
    int f3886b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, i> f3887c = null;

    /* renamed from: e, reason: collision with root package name */
    private int f3889e = 32;

    /* renamed from: f, reason: collision with root package name */
    private int f3890f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3892h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3893i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean[] f3894j = new boolean[32];

    /* renamed from: k, reason: collision with root package name */
    int f3895k = 1;

    /* renamed from: l, reason: collision with root package name */
    int f3896l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f3897m = 32;

    /* renamed from: o, reason: collision with root package name */
    private i[] f3899o = new i[f3882w];

    /* renamed from: p, reason: collision with root package name */
    private int f3900p = 0;

    interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    class b extends o.b {
        public b(c cVar) {
            this.f3871e = new j(this, cVar);
        }
    }

    public d() {
        this.f3891g = null;
        this.f3891g = new o.b[32];
        C();
        c cVar = new c();
        this.f3898n = cVar;
        this.f3888d = new h(cVar);
        this.f3901q = f3881v ? new b(cVar) : new o.b(cVar);
    }

    private final int B(a aVar, boolean z2) {
        for (int i2 = 0; i2 < this.f3895k; i2++) {
            this.f3894j[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            i3++;
            if (i3 >= this.f3895k * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.f3894j[aVar.getKey().f3918c] = true;
            }
            i b3 = aVar.b(this, this.f3894j);
            if (b3 != null) {
                boolean[] zArr = this.f3894j;
                int i4 = b3.f3918c;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (b3 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f3896l; i6++) {
                    o.b bVar = this.f3891g[i6];
                    if (bVar.f3867a.f3925j != i.a.UNRESTRICTED && !bVar.f3872f && bVar.t(b3)) {
                        float g2 = bVar.f3871e.g(b3);
                        if (g2 < 0.0f) {
                            float f3 = (-bVar.f3868b) / g2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    o.b bVar2 = this.f3891g[i5];
                    bVar2.f3867a.f3919d = -1;
                    bVar2.x(b3);
                    i iVar = bVar2.f3867a;
                    iVar.f3919d = i5;
                    iVar.g(this, bVar2);
                }
            } else {
                z3 = true;
            }
        }
        return i3;
    }

    private void C() {
        int i2 = 0;
        if (f3881v) {
            while (i2 < this.f3896l) {
                o.b bVar = this.f3891g[i2];
                if (bVar != null) {
                    this.f3898n.f3873a.b(bVar);
                }
                this.f3891g[i2] = null;
                i2++;
            }
            return;
        }
        while (i2 < this.f3896l) {
            o.b bVar2 = this.f3891g[i2];
            if (bVar2 != null) {
                this.f3898n.f3874b.b(bVar2);
            }
            this.f3891g[i2] = null;
            i2++;
        }
    }

    private i a(i.a aVar, String str) {
        i c3 = this.f3898n.f3875c.c();
        if (c3 == null) {
            c3 = new i(aVar, str);
        } else {
            c3.d();
        }
        c3.f(aVar, str);
        int i2 = this.f3900p;
        int i3 = f3882w;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f3882w = i4;
            this.f3899o = (i[]) Arrays.copyOf(this.f3899o, i4);
        }
        i[] iVarArr = this.f3899o;
        int i5 = this.f3900p;
        this.f3900p = i5 + 1;
        iVarArr[i5] = c3;
        return c3;
    }

    private final void l(o.b bVar) {
        int i2;
        if (f3879t && bVar.f3872f) {
            bVar.f3867a.e(this, bVar.f3868b);
        } else {
            o.b[] bVarArr = this.f3891g;
            int i3 = this.f3896l;
            bVarArr[i3] = bVar;
            i iVar = bVar.f3867a;
            iVar.f3919d = i3;
            this.f3896l = i3 + 1;
            iVar.g(this, bVar);
        }
        if (f3879t && this.f3885a) {
            int i4 = 0;
            while (i4 < this.f3896l) {
                if (this.f3891g[i4] == null) {
                    System.out.println("WTF");
                }
                o.b bVar2 = this.f3891g[i4];
                if (bVar2 != null && bVar2.f3872f) {
                    bVar2.f3867a.e(this, bVar2.f3868b);
                    (f3881v ? this.f3898n.f3873a : this.f3898n.f3874b).b(bVar2);
                    this.f3891g[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f3896l;
                        if (i5 >= i2) {
                            break;
                        }
                        o.b[] bVarArr2 = this.f3891g;
                        int i7 = i5 - 1;
                        o.b bVar3 = bVarArr2[i5];
                        bVarArr2[i7] = bVar3;
                        i iVar2 = bVar3.f3867a;
                        if (iVar2.f3919d == i5) {
                            iVar2.f3919d = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f3891g[i6] = null;
                    }
                    this.f3896l = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f3885a = false;
        }
    }

    private void n() {
        for (int i2 = 0; i2 < this.f3896l; i2++) {
            o.b bVar = this.f3891g[i2];
            bVar.f3867a.f3921f = bVar.f3868b;
        }
    }

    public static o.b s(d dVar, i iVar, i iVar2, float f2) {
        return dVar.r().j(iVar, iVar2, f2);
    }

    private int u(a aVar) {
        boolean z2;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f3896l) {
                z2 = false;
                break;
            }
            o.b bVar = this.f3891g[i2];
            if (bVar.f3867a.f3925j != i.a.UNRESTRICTED && bVar.f3868b < 0.0f) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (!z2) {
            return 0;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            i3++;
            float f2 = Float.MAX_VALUE;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f3896l; i7++) {
                o.b bVar2 = this.f3891g[i7];
                if (bVar2.f3867a.f3925j != i.a.UNRESTRICTED && !bVar2.f3872f && bVar2.f3868b < 0.0f) {
                    int i8 = 9;
                    if (f3880u) {
                        int d3 = bVar2.f3871e.d();
                        int i9 = 0;
                        while (i9 < d3) {
                            i h2 = bVar2.f3871e.h(i9);
                            float g2 = bVar2.f3871e.g(h2);
                            if (g2 > 0.0f) {
                                int i10 = 0;
                                while (i10 < i8) {
                                    float f3 = h2.f3923h[i10] / g2;
                                    if ((f3 < f2 && i10 == i6) || i10 > i6) {
                                        i5 = h2.f3918c;
                                        i6 = i10;
                                        i4 = i7;
                                        f2 = f3;
                                    }
                                    i10++;
                                    i8 = 9;
                                }
                            }
                            i9++;
                            i8 = 9;
                        }
                    } else {
                        for (int i11 = 1; i11 < this.f3895k; i11++) {
                            i iVar = this.f3898n.f3876d[i11];
                            float g3 = bVar2.f3871e.g(iVar);
                            if (g3 > 0.0f) {
                                for (int i12 = 0; i12 < 9; i12++) {
                                    float f4 = iVar.f3923h[i12] / g3;
                                    if ((f4 < f2 && i12 == i6) || i12 > i6) {
                                        i5 = i11;
                                        i4 = i7;
                                        i6 = i12;
                                        f2 = f4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i4 != -1) {
                o.b bVar3 = this.f3891g[i4];
                bVar3.f3867a.f3919d = -1;
                bVar3.x(this.f3898n.f3876d[i5]);
                i iVar2 = bVar3.f3867a;
                iVar2.f3919d = i4;
                iVar2.g(this, bVar3);
            } else {
                z3 = true;
            }
            if (i3 > this.f3895k / 2) {
                z3 = true;
            }
        }
        return i3;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i2 = this.f3889e * 2;
        this.f3889e = i2;
        this.f3891g = (o.b[]) Arrays.copyOf(this.f3891g, i2);
        c cVar = this.f3898n;
        cVar.f3876d = (i[]) Arrays.copyOf(cVar.f3876d, this.f3889e);
        int i3 = this.f3889e;
        this.f3894j = new boolean[i3];
        this.f3890f = i3;
        this.f3897m = i3;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.f3898n;
            i[] iVarArr = cVar.f3876d;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.d();
            }
            i2++;
        }
        cVar.f3875c.a(this.f3899o, this.f3900p);
        this.f3900p = 0;
        Arrays.fill(this.f3898n.f3876d, (Object) null);
        HashMap<String, i> hashMap = this.f3887c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f3886b = 0;
        this.f3888d.clear();
        this.f3895k = 1;
        for (int i3 = 0; i3 < this.f3896l; i3++) {
            o.b bVar = this.f3891g[i3];
            if (bVar != null) {
                bVar.f3869c = false;
            }
        }
        C();
        this.f3896l = 0;
        this.f3901q = f3881v ? new b(this.f3898n) : new o.b(this.f3898n);
    }

    public void b(p.e eVar, p.e eVar2, float f2, int i2) {
        d.b bVar = d.b.LEFT;
        i q2 = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q3 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q4 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q5 = q(eVar.m(bVar4));
        i q6 = q(eVar2.m(bVar));
        i q7 = q(eVar2.m(bVar2));
        i q8 = q(eVar2.m(bVar3));
        i q9 = q(eVar2.m(bVar4));
        o.b r2 = r();
        double d3 = f2;
        double d4 = i2;
        r2.q(q3, q5, q7, q9, (float) (Math.sin(d3) * d4));
        d(r2);
        o.b r3 = r();
        r3.q(q2, q4, q6, q8, (float) (Math.cos(d3) * d4));
        d(r3);
    }

    public void c(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        o.b r2 = r();
        r2.h(iVar, iVar2, i2, f2, iVar3, iVar4, i3);
        if (i4 != 8) {
            r2.d(this, i4);
        }
        d(r2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(o.b bVar) {
        i v2;
        if (bVar == null) {
            return;
        }
        boolean z2 = true;
        if (this.f3896l + 1 >= this.f3897m || this.f3895k + 1 >= this.f3890f) {
            y();
        }
        boolean z3 = false;
        if (!bVar.f3872f) {
            bVar.D(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i p2 = p();
                bVar.f3867a = p2;
                int i2 = this.f3896l;
                l(bVar);
                if (this.f3896l == i2 + 1) {
                    this.f3901q.c(bVar);
                    B(this.f3901q, true);
                    if (p2.f3919d == -1) {
                        if (bVar.f3867a == p2 && (v2 = bVar.v(p2)) != null) {
                            bVar.x(v2);
                        }
                        if (!bVar.f3872f) {
                            bVar.f3867a.g(this, bVar);
                        }
                        (f3881v ? this.f3898n.f3873a : this.f3898n.f3874b).b(bVar);
                        this.f3896l--;
                    }
                    if (bVar.s()) {
                        return;
                    } else {
                        z3 = z2;
                    }
                }
            }
            z2 = false;
            if (bVar.s()) {
            }
        }
        if (z3) {
            return;
        }
        l(bVar);
    }

    public o.b e(i iVar, i iVar2, int i2, int i3) {
        if (f3878s && i3 == 8 && iVar2.f3922g && iVar.f3919d == -1) {
            iVar.e(this, iVar2.f3921f + i2);
            return null;
        }
        o.b r2 = r();
        r2.n(iVar, iVar2, i2);
        if (i3 != 8) {
            r2.d(this, i3);
        }
        d(r2);
        return r2;
    }

    public void f(i iVar, int i2) {
        o.b r2;
        if (f3878s && iVar.f3919d == -1) {
            float f2 = i2;
            iVar.e(this, f2);
            for (int i3 = 0; i3 < this.f3886b + 1; i3++) {
                i iVar2 = this.f3898n.f3876d[i3];
                if (iVar2 != null && iVar2.f3929n && iVar2.f3930o == iVar.f3918c) {
                    iVar2.e(this, iVar2.f3931p + f2);
                }
            }
            return;
        }
        int i4 = iVar.f3919d;
        if (i4 != -1) {
            o.b bVar = this.f3891g[i4];
            if (!bVar.f3872f) {
                if (bVar.f3871e.d() == 0) {
                    bVar.f3872f = true;
                } else {
                    r2 = r();
                    r2.m(iVar, i2);
                }
            }
            bVar.f3868b = i2;
            return;
        }
        r2 = r();
        r2.i(iVar, i2);
        d(r2);
    }

    public void g(i iVar, i iVar2, int i2, boolean z2) {
        o.b r2 = r();
        i t2 = t();
        t2.f3920e = 0;
        r2.o(iVar, iVar2, t2, i2);
        d(r2);
    }

    public void h(i iVar, i iVar2, int i2, int i3) {
        o.b r2 = r();
        i t2 = t();
        t2.f3920e = 0;
        r2.o(iVar, iVar2, t2, i2);
        if (i3 != 8) {
            m(r2, (int) (r2.f3871e.g(t2) * (-1.0f)), i3);
        }
        d(r2);
    }

    public void i(i iVar, i iVar2, int i2, boolean z2) {
        o.b r2 = r();
        i t2 = t();
        t2.f3920e = 0;
        r2.p(iVar, iVar2, t2, i2);
        d(r2);
    }

    public void j(i iVar, i iVar2, int i2, int i3) {
        o.b r2 = r();
        i t2 = t();
        t2.f3920e = 0;
        r2.p(iVar, iVar2, t2, i2);
        if (i3 != 8) {
            m(r2, (int) (r2.f3871e.g(t2) * (-1.0f)), i3);
        }
        d(r2);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i2) {
        o.b r2 = r();
        r2.k(iVar, iVar2, iVar3, iVar4, f2);
        if (i2 != 8) {
            r2.d(this, i2);
        }
        d(r2);
    }

    void m(o.b bVar, int i2, int i3) {
        bVar.e(o(i3, null), i2);
    }

    public i o(int i2, String str) {
        if (this.f3895k + 1 >= this.f3890f) {
            y();
        }
        i a3 = a(i.a.ERROR, str);
        int i3 = this.f3886b + 1;
        this.f3886b = i3;
        this.f3895k++;
        a3.f3918c = i3;
        a3.f3920e = i2;
        this.f3898n.f3876d[i3] = a3;
        this.f3888d.a(a3);
        return a3;
    }

    public i p() {
        if (this.f3895k + 1 >= this.f3890f) {
            y();
        }
        i a3 = a(i.a.SLACK, null);
        int i2 = this.f3886b + 1;
        this.f3886b = i2;
        this.f3895k++;
        a3.f3918c = i2;
        this.f3898n.f3876d[i2] = a3;
        return a3;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f3895k + 1 >= this.f3890f) {
            y();
        }
        if (obj instanceof p.d) {
            p.d dVar = (p.d) obj;
            iVar = dVar.h();
            if (iVar == null) {
                dVar.r(this.f3898n);
                iVar = dVar.h();
            }
            int i2 = iVar.f3918c;
            if (i2 == -1 || i2 > this.f3886b || this.f3898n.f3876d[i2] == null) {
                if (i2 != -1) {
                    iVar.d();
                }
                int i3 = this.f3886b + 1;
                this.f3886b = i3;
                this.f3895k++;
                iVar.f3918c = i3;
                iVar.f3925j = i.a.UNRESTRICTED;
                this.f3898n.f3876d[i3] = iVar;
            }
        }
        return iVar;
    }

    public o.b r() {
        o.b c3;
        if (f3881v) {
            c3 = this.f3898n.f3873a.c();
            if (c3 == null) {
                c3 = new b(this.f3898n);
                f3884y++;
            }
            c3.y();
        } else {
            c3 = this.f3898n.f3874b.c();
            if (c3 == null) {
                c3 = new o.b(this.f3898n);
                f3883x++;
            }
            c3.y();
        }
        i.b();
        return c3;
    }

    public i t() {
        if (this.f3895k + 1 >= this.f3890f) {
            y();
        }
        i a3 = a(i.a.SLACK, null);
        int i2 = this.f3886b + 1;
        this.f3886b = i2;
        this.f3895k++;
        a3.f3918c = i2;
        this.f3898n.f3876d[i2] = a3;
        return a3;
    }

    public c v() {
        return this.f3898n;
    }

    public int x(Object obj) {
        i h2 = ((p.d) obj).h();
        if (h2 != null) {
            return (int) (h2.f3921f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f3888d.isEmpty()) {
            n();
            return;
        }
        if (this.f3892h || this.f3893i) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f3896l) {
                    z2 = true;
                    break;
                } else if (!this.f3891g[i2].f3872f) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                n();
                return;
            }
        }
        A(this.f3888d);
    }
}
