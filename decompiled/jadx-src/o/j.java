package o;

import java.util.Arrays;
import o.b;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f3939n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f3940a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f3941b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f3942c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f3943d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f3944e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f3945f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f3946g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f3947h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f3948i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f3949j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f3950k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f3951l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f3952m;

    j(b bVar, c cVar) {
        this.f3951l = bVar;
        this.f3952m = cVar;
        clear();
    }

    private void l(i iVar, int i2) {
        int[] iArr;
        int i3 = iVar.f3918c % this.f3942c;
        int[] iArr2 = this.f3943d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f3944e;
                int i5 = iArr[i4];
                if (i5 == -1) {
                    break;
                } else {
                    i4 = i5;
                }
            }
            iArr[i4] = i2;
        }
        this.f3944e[i2] = -1;
    }

    private void m(int i2, i iVar, float f2) {
        this.f3945f[i2] = iVar.f3918c;
        this.f3946g[i2] = f2;
        this.f3947h[i2] = -1;
        this.f3948i[i2] = -1;
        iVar.a(this.f3951l);
        iVar.f3928m++;
        this.f3949j++;
    }

    private int n() {
        for (int i2 = 0; i2 < this.f3941b; i2++) {
            if (this.f3945f[i2] == -1) {
                return i2;
            }
        }
        return -1;
    }

    private void o() {
        int i2 = this.f3941b * 2;
        this.f3945f = Arrays.copyOf(this.f3945f, i2);
        this.f3946g = Arrays.copyOf(this.f3946g, i2);
        this.f3947h = Arrays.copyOf(this.f3947h, i2);
        this.f3948i = Arrays.copyOf(this.f3948i, i2);
        this.f3944e = Arrays.copyOf(this.f3944e, i2);
        for (int i3 = this.f3941b; i3 < i2; i3++) {
            this.f3945f[i3] = -1;
            this.f3944e[i3] = -1;
        }
        this.f3941b = i2;
    }

    private void q(int i2, i iVar, float f2) {
        int n2 = n();
        m(n2, iVar, f2);
        if (i2 != -1) {
            this.f3947h[n2] = i2;
            int[] iArr = this.f3948i;
            iArr[n2] = iArr[i2];
            iArr[i2] = n2;
        } else {
            this.f3947h[n2] = -1;
            if (this.f3949j > 0) {
                this.f3948i[n2] = this.f3950k;
                this.f3950k = n2;
            } else {
                this.f3948i[n2] = -1;
            }
        }
        int i3 = this.f3948i[n2];
        if (i3 != -1) {
            this.f3947h[i3] = n2;
        }
        l(iVar, n2);
    }

    private void r(i iVar) {
        int[] iArr;
        int i2;
        int i3 = iVar.f3918c;
        int i4 = i3 % this.f3942c;
        int[] iArr2 = this.f3943d;
        int i5 = iArr2[i4];
        if (i5 == -1) {
            return;
        }
        if (this.f3945f[i5] == i3) {
            int[] iArr3 = this.f3944e;
            iArr2[i4] = iArr3[i5];
            iArr3[i5] = -1;
            return;
        }
        while (true) {
            iArr = this.f3944e;
            i2 = iArr[i5];
            if (i2 == -1 || this.f3945f[i2] == i3) {
                break;
            } else {
                i5 = i2;
            }
        }
        if (i2 == -1 || this.f3945f[i2] != i3) {
            return;
        }
        iArr[i5] = iArr[i2];
        iArr[i2] = -1;
    }

    @Override // o.b.a
    public float a(int i2) {
        int i3 = this.f3949j;
        int i4 = this.f3950k;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f3946g[i4];
            }
            i4 = this.f3948i[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // o.b.a
    public void b(i iVar, float f2, boolean z2) {
        float f3 = f3939n;
        if (f2 <= (-f3) || f2 >= f3) {
            int p2 = p(iVar);
            if (p2 == -1) {
                c(iVar, f2);
                return;
            }
            float[] fArr = this.f3946g;
            float f4 = fArr[p2] + f2;
            fArr[p2] = f4;
            float f5 = f3939n;
            if (f4 <= (-f5) || f4 >= f5) {
                return;
            }
            fArr[p2] = 0.0f;
            j(iVar, z2);
        }
    }

    @Override // o.b.a
    public void c(i iVar, float f2) {
        float f3 = f3939n;
        if (f2 > (-f3) && f2 < f3) {
            j(iVar, true);
            return;
        }
        if (this.f3949j == 0) {
            m(0, iVar, f2);
            l(iVar, 0);
            this.f3950k = 0;
            return;
        }
        int p2 = p(iVar);
        if (p2 != -1) {
            this.f3946g[p2] = f2;
            return;
        }
        if (this.f3949j + 1 >= this.f3941b) {
            o();
        }
        int i2 = this.f3949j;
        int i3 = this.f3950k;
        int i4 = -1;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = this.f3945f[i3];
            int i7 = iVar.f3918c;
            if (i6 == i7) {
                this.f3946g[i3] = f2;
                return;
            }
            if (i6 < i7) {
                i4 = i3;
            }
            i3 = this.f3948i[i3];
            if (i3 == -1) {
                break;
            }
        }
        q(i4, iVar, f2);
    }

    @Override // o.b.a
    public void clear() {
        int i2 = this.f3949j;
        for (int i3 = 0; i3 < i2; i3++) {
            i h2 = h(i3);
            if (h2 != null) {
                h2.c(this.f3951l);
            }
        }
        for (int i4 = 0; i4 < this.f3941b; i4++) {
            this.f3945f[i4] = -1;
            this.f3944e[i4] = -1;
        }
        for (int i5 = 0; i5 < this.f3942c; i5++) {
            this.f3943d[i5] = -1;
        }
        this.f3949j = 0;
        this.f3950k = -1;
    }

    @Override // o.b.a
    public int d() {
        return this.f3949j;
    }

    @Override // o.b.a
    public boolean e(i iVar) {
        return p(iVar) != -1;
    }

    @Override // o.b.a
    public float f(b bVar, boolean z2) {
        float g2 = g(bVar.f3867a);
        j(bVar.f3867a, z2);
        j jVar = (j) bVar.f3871e;
        int d3 = jVar.d();
        int i2 = 0;
        int i3 = 0;
        while (i2 < d3) {
            int i4 = jVar.f3945f[i3];
            if (i4 != -1) {
                b(this.f3952m.f3876d[i4], jVar.f3946g[i3] * g2, z2);
                i2++;
            }
            i3++;
        }
        return g2;
    }

    @Override // o.b.a
    public float g(i iVar) {
        int p2 = p(iVar);
        if (p2 != -1) {
            return this.f3946g[p2];
        }
        return 0.0f;
    }

    @Override // o.b.a
    public i h(int i2) {
        int i3 = this.f3949j;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f3950k;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.f3952m.f3876d[this.f3945f[i4]];
            }
            i4 = this.f3948i[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // o.b.a
    public void i(float f2) {
        int i2 = this.f3949j;
        int i3 = this.f3950k;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f3946g;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f3948i[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // o.b.a
    public float j(i iVar, boolean z2) {
        int p2 = p(iVar);
        if (p2 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f2 = this.f3946g[p2];
        if (this.f3950k == p2) {
            this.f3950k = this.f3948i[p2];
        }
        this.f3945f[p2] = -1;
        int[] iArr = this.f3947h;
        int i2 = iArr[p2];
        if (i2 != -1) {
            int[] iArr2 = this.f3948i;
            iArr2[i2] = iArr2[p2];
        }
        int i3 = this.f3948i[p2];
        if (i3 != -1) {
            iArr[i3] = iArr[p2];
        }
        this.f3949j--;
        iVar.f3928m--;
        if (z2) {
            iVar.c(this.f3951l);
        }
        return f2;
    }

    @Override // o.b.a
    public void k() {
        int i2 = this.f3949j;
        int i3 = this.f3950k;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f3946g;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f3948i[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        if (this.f3949j != 0 && iVar != null) {
            int i2 = iVar.f3918c;
            int i3 = this.f3943d[i2 % this.f3942c];
            if (i3 == -1) {
                return -1;
            }
            if (this.f3945f[i3] == i2) {
                return i3;
            }
            do {
                i3 = this.f3944e[i3];
                if (i3 == -1) {
                    break;
                }
            } while (this.f3945f[i3] != i2);
            if (i3 != -1 && this.f3945f[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i2 = this.f3949j;
        for (int i3 = 0; i3 < i2; i3++) {
            i h2 = h(i3);
            if (h2 != null) {
                String str2 = str + h2 + " = " + a(i3) + " ";
                int p2 = p(h2);
                String str3 = str2 + "[p: ";
                if (this.f3947h[p2] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.f3952m.f3876d[this.f3945f[this.f3947h[p2]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f3948i[p2] != -1 ? str4 + this.f3952m.f3876d[this.f3945f[this.f3948i[p2]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
