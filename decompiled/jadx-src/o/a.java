package o;

import java.util.Arrays;
import o.b;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f3855l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f3857b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f3858c;

    /* renamed from: a, reason: collision with root package name */
    int f3856a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f3859d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f3860e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f3861f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f3862g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f3863h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f3864i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f3865j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3866k = false;

    a(b bVar, c cVar) {
        this.f3857b = bVar;
        this.f3858c = cVar;
    }

    @Override // o.b.a
    public float a(int i2) {
        int i3 = this.f3864i;
        for (int i4 = 0; i3 != -1 && i4 < this.f3856a; i4++) {
            if (i4 == i2) {
                return this.f3863h[i3];
            }
            i3 = this.f3862g[i3];
        }
        return 0.0f;
    }

    @Override // o.b.a
    public void b(i iVar, float f2, boolean z2) {
        float f3 = f3855l;
        if (f2 <= (-f3) || f2 >= f3) {
            int i2 = this.f3864i;
            if (i2 == -1) {
                this.f3864i = 0;
                this.f3863h[0] = f2;
                this.f3861f[0] = iVar.f3918c;
                this.f3862g[0] = -1;
                iVar.f3928m++;
                iVar.a(this.f3857b);
                this.f3856a++;
                if (this.f3866k) {
                    return;
                }
                int i3 = this.f3865j + 1;
                this.f3865j = i3;
                int[] iArr = this.f3861f;
                if (i3 >= iArr.length) {
                    this.f3866k = true;
                    this.f3865j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f3856a; i5++) {
                int i6 = this.f3861f[i2];
                int i7 = iVar.f3918c;
                if (i6 == i7) {
                    float[] fArr = this.f3863h;
                    float f4 = fArr[i2] + f2;
                    float f5 = f3855l;
                    if (f4 > (-f5) && f4 < f5) {
                        f4 = 0.0f;
                    }
                    fArr[i2] = f4;
                    if (f4 == 0.0f) {
                        if (i2 == this.f3864i) {
                            this.f3864i = this.f3862g[i2];
                        } else {
                            int[] iArr2 = this.f3862g;
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z2) {
                            iVar.c(this.f3857b);
                        }
                        if (this.f3866k) {
                            this.f3865j = i2;
                        }
                        iVar.f3928m--;
                        this.f3856a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.f3862g[i2];
            }
            int i8 = this.f3865j;
            int i9 = i8 + 1;
            if (this.f3866k) {
                int[] iArr3 = this.f3861f;
                if (iArr3[i8] != -1) {
                    i8 = iArr3.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr4 = this.f3861f;
            if (i8 >= iArr4.length && this.f3856a < iArr4.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr5 = this.f3861f;
                    if (i10 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i10] == -1) {
                        i8 = i10;
                        break;
                    }
                    i10++;
                }
            }
            int[] iArr6 = this.f3861f;
            if (i8 >= iArr6.length) {
                i8 = iArr6.length;
                int i11 = this.f3859d * 2;
                this.f3859d = i11;
                this.f3866k = false;
                this.f3865j = i8 - 1;
                this.f3863h = Arrays.copyOf(this.f3863h, i11);
                this.f3861f = Arrays.copyOf(this.f3861f, this.f3859d);
                this.f3862g = Arrays.copyOf(this.f3862g, this.f3859d);
            }
            this.f3861f[i8] = iVar.f3918c;
            this.f3863h[i8] = f2;
            int[] iArr7 = this.f3862g;
            if (i4 != -1) {
                iArr7[i8] = iArr7[i4];
                iArr7[i4] = i8;
            } else {
                iArr7[i8] = this.f3864i;
                this.f3864i = i8;
            }
            iVar.f3928m++;
            iVar.a(this.f3857b);
            this.f3856a++;
            if (!this.f3866k) {
                this.f3865j++;
            }
            int i12 = this.f3865j;
            int[] iArr8 = this.f3861f;
            if (i12 >= iArr8.length) {
                this.f3866k = true;
                this.f3865j = iArr8.length - 1;
            }
        }
    }

    @Override // o.b.a
    public final void c(i iVar, float f2) {
        if (f2 == 0.0f) {
            j(iVar, true);
            return;
        }
        int i2 = this.f3864i;
        if (i2 == -1) {
            this.f3864i = 0;
            this.f3863h[0] = f2;
            this.f3861f[0] = iVar.f3918c;
            this.f3862g[0] = -1;
            iVar.f3928m++;
            iVar.a(this.f3857b);
            this.f3856a++;
            if (this.f3866k) {
                return;
            }
            int i3 = this.f3865j + 1;
            this.f3865j = i3;
            int[] iArr = this.f3861f;
            if (i3 >= iArr.length) {
                this.f3866k = true;
                this.f3865j = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f3856a; i5++) {
            int i6 = this.f3861f[i2];
            int i7 = iVar.f3918c;
            if (i6 == i7) {
                this.f3863h[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f3862g[i2];
        }
        int i8 = this.f3865j;
        int i9 = i8 + 1;
        if (this.f3866k) {
            int[] iArr2 = this.f3861f;
            if (iArr2[i8] != -1) {
                i8 = iArr2.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr3 = this.f3861f;
        if (i8 >= iArr3.length && this.f3856a < iArr3.length) {
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.f3861f;
                if (i10 >= iArr4.length) {
                    break;
                }
                if (iArr4[i10] == -1) {
                    i8 = i10;
                    break;
                }
                i10++;
            }
        }
        int[] iArr5 = this.f3861f;
        if (i8 >= iArr5.length) {
            i8 = iArr5.length;
            int i11 = this.f3859d * 2;
            this.f3859d = i11;
            this.f3866k = false;
            this.f3865j = i8 - 1;
            this.f3863h = Arrays.copyOf(this.f3863h, i11);
            this.f3861f = Arrays.copyOf(this.f3861f, this.f3859d);
            this.f3862g = Arrays.copyOf(this.f3862g, this.f3859d);
        }
        this.f3861f[i8] = iVar.f3918c;
        this.f3863h[i8] = f2;
        int[] iArr6 = this.f3862g;
        if (i4 != -1) {
            iArr6[i8] = iArr6[i4];
            iArr6[i4] = i8;
        } else {
            iArr6[i8] = this.f3864i;
            this.f3864i = i8;
        }
        iVar.f3928m++;
        iVar.a(this.f3857b);
        int i12 = this.f3856a + 1;
        this.f3856a = i12;
        if (!this.f3866k) {
            this.f3865j++;
        }
        int[] iArr7 = this.f3861f;
        if (i12 >= iArr7.length) {
            this.f3866k = true;
        }
        if (this.f3865j >= iArr7.length) {
            this.f3866k = true;
            this.f3865j = iArr7.length - 1;
        }
    }

    @Override // o.b.a
    public final void clear() {
        int i2 = this.f3864i;
        for (int i3 = 0; i2 != -1 && i3 < this.f3856a; i3++) {
            i iVar = this.f3858c.f3876d[this.f3861f[i2]];
            if (iVar != null) {
                iVar.c(this.f3857b);
            }
            i2 = this.f3862g[i2];
        }
        this.f3864i = -1;
        this.f3865j = -1;
        this.f3866k = false;
        this.f3856a = 0;
    }

    @Override // o.b.a
    public int d() {
        return this.f3856a;
    }

    @Override // o.b.a
    public boolean e(i iVar) {
        int i2 = this.f3864i;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f3856a; i3++) {
            if (this.f3861f[i2] == iVar.f3918c) {
                return true;
            }
            i2 = this.f3862g[i2];
        }
        return false;
    }

    @Override // o.b.a
    public float f(b bVar, boolean z2) {
        float g2 = g(bVar.f3867a);
        j(bVar.f3867a, z2);
        b.a aVar = bVar.f3871e;
        int d3 = aVar.d();
        for (int i2 = 0; i2 < d3; i2++) {
            i h2 = aVar.h(i2);
            b(h2, aVar.g(h2) * g2, z2);
        }
        return g2;
    }

    @Override // o.b.a
    public final float g(i iVar) {
        int i2 = this.f3864i;
        for (int i3 = 0; i2 != -1 && i3 < this.f3856a; i3++) {
            if (this.f3861f[i2] == iVar.f3918c) {
                return this.f3863h[i2];
            }
            i2 = this.f3862g[i2];
        }
        return 0.0f;
    }

    @Override // o.b.a
    public i h(int i2) {
        int i3 = this.f3864i;
        for (int i4 = 0; i3 != -1 && i4 < this.f3856a; i4++) {
            if (i4 == i2) {
                return this.f3858c.f3876d[this.f3861f[i3]];
            }
            i3 = this.f3862g[i3];
        }
        return null;
    }

    @Override // o.b.a
    public void i(float f2) {
        int i2 = this.f3864i;
        for (int i3 = 0; i2 != -1 && i3 < this.f3856a; i3++) {
            float[] fArr = this.f3863h;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f3862g[i2];
        }
    }

    @Override // o.b.a
    public final float j(i iVar, boolean z2) {
        if (this.f3860e == iVar) {
            this.f3860e = null;
        }
        int i2 = this.f3864i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f3856a) {
            if (this.f3861f[i2] == iVar.f3918c) {
                if (i2 == this.f3864i) {
                    this.f3864i = this.f3862g[i2];
                } else {
                    int[] iArr = this.f3862g;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    iVar.c(this.f3857b);
                }
                iVar.f3928m--;
                this.f3856a--;
                this.f3861f[i2] = -1;
                if (this.f3866k) {
                    this.f3865j = i2;
                }
                return this.f3863h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f3862g[i2];
        }
        return 0.0f;
    }

    @Override // o.b.a
    public void k() {
        int i2 = this.f3864i;
        for (int i3 = 0; i2 != -1 && i3 < this.f3856a; i3++) {
            float[] fArr = this.f3863h;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f3862g[i2];
        }
    }

    public String toString() {
        int i2 = this.f3864i;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f3856a; i3++) {
            str = ((str + " -> ") + this.f3863h[i2] + " : ") + this.f3858c.f3876d[this.f3861f[i2]];
            i2 = this.f3862g[i2];
        }
        return str;
    }
}
