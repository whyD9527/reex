package o;

import java.util.ArrayList;
import o.d;
import o.i;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f3871e;

    /* renamed from: a, reason: collision with root package name */
    i f3867a = null;

    /* renamed from: b, reason: collision with root package name */
    float f3868b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f3869c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<i> f3870d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    boolean f3872f = false;

    public interface a {
        float a(int i2);

        void b(i iVar, float f2, boolean z2);

        void c(i iVar, float f2);

        void clear();

        int d();

        boolean e(i iVar);

        float f(b bVar, boolean z2);

        float g(i iVar);

        i h(int i2);

        void i(float f2);

        float j(i iVar, boolean z2);

        void k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f3871e = new o.a(this, cVar);
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f3928m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int d3 = this.f3871e.d();
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < d3; i2++) {
            float a3 = this.f3871e.a(i2);
            if (a3 < 0.0f) {
                i h2 = this.f3871e.h(i2);
                if ((zArr == null || !zArr[h2.f3918c]) && h2 != iVar && (((aVar = h2.f3925j) == i.a.SLACK || aVar == i.a.ERROR) && a3 < f2)) {
                    f2 = a3;
                    iVar2 = h2;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z2) {
        if (iVar.f3922g) {
            this.f3868b += iVar.f3921f * this.f3871e.g(iVar);
            this.f3871e.j(iVar, z2);
            if (z2) {
                iVar.c(this);
            }
            if (d.f3879t && this.f3871e.d() == 0) {
                this.f3872f = true;
                dVar.f3885a = true;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z2) {
        this.f3868b += bVar.f3868b * this.f3871e.f(bVar, z2);
        if (z2) {
            bVar.f3867a.c(this);
        }
        if (d.f3879t && this.f3867a != null && this.f3871e.d() == 0) {
            this.f3872f = true;
            dVar.f3885a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z2) {
        if (iVar.f3929n) {
            float g2 = this.f3871e.g(iVar);
            this.f3868b += iVar.f3931p * g2;
            this.f3871e.j(iVar, z2);
            if (z2) {
                iVar.c(this);
            }
            this.f3871e.b(dVar.f3898n.f3876d[iVar.f3930o], g2, z2);
            if (d.f3879t && this.f3871e.d() == 0) {
                this.f3872f = true;
                dVar.f3885a = true;
            }
        }
    }

    public void D(d dVar) {
        if (dVar.f3891g.length == 0) {
            return;
        }
        boolean z2 = false;
        while (!z2) {
            int d3 = this.f3871e.d();
            for (int i2 = 0; i2 < d3; i2++) {
                i h2 = this.f3871e.h(i2);
                if (h2.f3919d != -1 || h2.f3922g || h2.f3929n) {
                    this.f3870d.add(h2);
                }
            }
            int size = this.f3870d.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar = this.f3870d.get(i3);
                    if (iVar.f3922g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f3929n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f3891g[iVar.f3919d], true);
                    }
                }
                this.f3870d.clear();
            } else {
                z2 = true;
            }
        }
        if (d.f3879t && this.f3867a != null && this.f3871e.d() == 0) {
            this.f3872f = true;
            dVar.f3885a = true;
        }
    }

    @Override // o.d.a
    public void a(i iVar) {
        int i2 = iVar.f3920e;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f3871e.c(iVar, f2);
    }

    @Override // o.d.a
    public i b(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // o.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f3867a = null;
            this.f3871e.clear();
            for (int i2 = 0; i2 < bVar.f3871e.d(); i2++) {
                this.f3871e.b(bVar.f3871e.h(i2), bVar.f3871e.a(i2), true);
            }
        }
    }

    @Override // o.d.a
    public void clear() {
        this.f3871e.clear();
        this.f3867a = null;
        this.f3868b = 0.0f;
    }

    public b d(d dVar, int i2) {
        this.f3871e.c(dVar.o(i2, "ep"), 1.0f);
        this.f3871e.c(dVar.o(i2, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i2) {
        this.f3871e.c(iVar, i2);
        return this;
    }

    boolean f(d dVar) {
        boolean z2;
        i g2 = g(dVar);
        if (g2 == null) {
            z2 = true;
        } else {
            x(g2);
            z2 = false;
        }
        if (this.f3871e.d() == 0) {
            this.f3872f = true;
        }
        return z2;
    }

    i g(d dVar) {
        int d3 = this.f3871e.d();
        i iVar = null;
        boolean z2 = false;
        boolean z3 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        i iVar2 = null;
        for (int i2 = 0; i2 < d3; i2++) {
            float a3 = this.f3871e.a(i2);
            i h2 = this.f3871e.h(i2);
            if (h2.f3925j == i.a.UNRESTRICTED) {
                if (iVar == null || f2 > a3) {
                    z2 = u(h2, dVar);
                    f2 = a3;
                    iVar = h2;
                } else if (!z2 && u(h2, dVar)) {
                    f2 = a3;
                    iVar = h2;
                    z2 = true;
                }
            } else if (iVar == null && a3 < 0.0f) {
                if (iVar2 == null || f3 > a3) {
                    z3 = u(h2, dVar);
                    f3 = a3;
                    iVar2 = h2;
                } else if (!z3 && u(h2, dVar)) {
                    f3 = a3;
                    iVar2 = h2;
                    z3 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // o.d.a
    public i getKey() {
        return this.f3867a;
    }

    b h(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3) {
        float f3;
        int i4;
        if (iVar2 == iVar3) {
            this.f3871e.c(iVar, 1.0f);
            this.f3871e.c(iVar4, 1.0f);
            this.f3871e.c(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f3871e.c(iVar, 1.0f);
            this.f3871e.c(iVar2, -1.0f);
            this.f3871e.c(iVar3, -1.0f);
            this.f3871e.c(iVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                i4 = (-i2) + i3;
                f3 = i4;
            }
            return this;
        }
        if (f2 <= 0.0f) {
            this.f3871e.c(iVar, -1.0f);
            this.f3871e.c(iVar2, 1.0f);
            f3 = i2;
        } else {
            if (f2 < 1.0f) {
                float f4 = 1.0f - f2;
                this.f3871e.c(iVar, f4 * 1.0f);
                this.f3871e.c(iVar2, f4 * (-1.0f));
                this.f3871e.c(iVar3, (-1.0f) * f2);
                this.f3871e.c(iVar4, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    f3 = ((-i2) * f4) + (i3 * f2);
                }
                return this;
            }
            this.f3871e.c(iVar4, -1.0f);
            this.f3871e.c(iVar3, 1.0f);
            i4 = -i3;
            f3 = i4;
        }
        this.f3868b = f3;
        return this;
    }

    b i(i iVar, int i2) {
        this.f3867a = iVar;
        float f2 = i2;
        iVar.f3921f = f2;
        this.f3868b = f2;
        this.f3872f = true;
        return this;
    }

    @Override // o.d.a
    public boolean isEmpty() {
        return this.f3867a == null && this.f3868b == 0.0f && this.f3871e.d() == 0;
    }

    b j(i iVar, i iVar2, float f2) {
        this.f3871e.c(iVar, -1.0f);
        this.f3871e.c(iVar2, f2);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f3871e.c(iVar, -1.0f);
        this.f3871e.c(iVar2, 1.0f);
        this.f3871e.c(iVar3, f2);
        this.f3871e.c(iVar4, -f2);
        return this;
    }

    public b l(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f3868b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f3871e.c(iVar, 1.0f);
            this.f3871e.c(iVar2, -1.0f);
            this.f3871e.c(iVar4, 1.0f);
            this.f3871e.c(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f3871e.c(iVar, 1.0f);
            this.f3871e.c(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f3871e.c(iVar3, 1.0f);
            this.f3871e.c(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f3871e.c(iVar, 1.0f);
            this.f3871e.c(iVar2, -1.0f);
            this.f3871e.c(iVar4, f5);
            this.f3871e.c(iVar3, -f5);
        }
        return this;
    }

    public b m(i iVar, int i2) {
        a aVar;
        float f2;
        if (i2 < 0) {
            this.f3868b = i2 * (-1);
            aVar = this.f3871e;
            f2 = 1.0f;
        } else {
            this.f3868b = i2;
            aVar = this.f3871e;
            f2 = -1.0f;
        }
        aVar.c(iVar, f2);
        return this;
    }

    public b n(i iVar, i iVar2, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f3868b = i2;
        }
        if (z2) {
            this.f3871e.c(iVar, 1.0f);
            this.f3871e.c(iVar2, -1.0f);
        } else {
            this.f3871e.c(iVar, -1.0f);
            this.f3871e.c(iVar2, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f3868b = i2;
        }
        if (z2) {
            this.f3871e.c(iVar, 1.0f);
            this.f3871e.c(iVar2, -1.0f);
            this.f3871e.c(iVar3, -1.0f);
        } else {
            this.f3871e.c(iVar, -1.0f);
            this.f3871e.c(iVar2, 1.0f);
            this.f3871e.c(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f3868b = i2;
        }
        if (z2) {
            this.f3871e.c(iVar, 1.0f);
            this.f3871e.c(iVar2, -1.0f);
            this.f3871e.c(iVar3, 1.0f);
        } else {
            this.f3871e.c(iVar, -1.0f);
            this.f3871e.c(iVar2, 1.0f);
            this.f3871e.c(iVar3, -1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f3871e.c(iVar3, 0.5f);
        this.f3871e.c(iVar4, 0.5f);
        this.f3871e.c(iVar, -0.5f);
        this.f3871e.c(iVar2, -0.5f);
        this.f3868b = -f2;
        return this;
    }

    void r() {
        float f2 = this.f3868b;
        if (f2 < 0.0f) {
            this.f3868b = f2 * (-1.0f);
            this.f3871e.k();
        }
    }

    boolean s() {
        i iVar = this.f3867a;
        return iVar != null && (iVar.f3925j == i.a.UNRESTRICTED || this.f3868b >= 0.0f);
    }

    boolean t(i iVar) {
        return this.f3871e.e(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f3867a;
        if (iVar2 != null) {
            this.f3871e.c(iVar2, -1.0f);
            this.f3867a.f3919d = -1;
            this.f3867a = null;
        }
        float j2 = this.f3871e.j(iVar, true) * (-1.0f);
        this.f3867a = iVar;
        if (j2 == 1.0f) {
            return;
        }
        this.f3868b /= j2;
        this.f3871e.i(j2);
    }

    public void y() {
        this.f3867a = null;
        this.f3871e.clear();
        this.f3868b = 0.0f;
        this.f3872f = false;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    java.lang.String z() {
        /*
            r10 = this;
            o.i r0 = r10.f3867a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            o.i r1 = r10.f3867a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f3868b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f3868b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L53
        L52:
            r1 = r3
        L53:
            o.b$a r5 = r10.f3871e
            int r5 = r5.d()
        L59:
            if (r3 >= r5) goto Ld1
            o.b$a r6 = r10.f3871e
            o.i r6 = r6.h(r3)
            if (r6 != 0) goto L64
            goto Lce
        L64:
            o.b$a r7 = r10.f3871e
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L6f
            goto Lce
        L6f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L86
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto Laa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La2
        L86:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L9a
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Laa
        L9a:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La2:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        Laa:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc3
        Lb6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc3:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        Lce:
            int r3 = r3 + 1
            goto L59
        Ld1:
            if (r1 != 0) goto Le4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b.z():java.lang.String");
    }
}
