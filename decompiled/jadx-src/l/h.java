package l;

/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: i, reason: collision with root package name */
    private static final Object f3819i = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f3820e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f3821f;

    /* renamed from: g, reason: collision with root package name */
    private Object[] f3822g;

    /* renamed from: h, reason: collision with root package name */
    private int f3823h;

    public h() {
        this(10);
    }

    public h(int i2) {
        this.f3820e = false;
        if (i2 == 0) {
            this.f3821f = c.f3781a;
            this.f3822g = c.f3783c;
        } else {
            int e3 = c.e(i2);
            this.f3821f = new int[e3];
            this.f3822g = new Object[e3];
        }
    }

    private void d() {
        int i2 = this.f3823h;
        int[] iArr = this.f3821f;
        Object[] objArr = this.f3822g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f3819i) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f3820e = false;
        this.f3823h = i3;
    }

    public void a(int i2, E e3) {
        int i3 = this.f3823h;
        if (i3 != 0 && i2 <= this.f3821f[i3 - 1]) {
            h(i2, e3);
            return;
        }
        if (this.f3820e && i3 >= this.f3821f.length) {
            d();
        }
        int i4 = this.f3823h;
        if (i4 >= this.f3821f.length) {
            int e4 = c.e(i4 + 1);
            int[] iArr = new int[e4];
            Object[] objArr = new Object[e4];
            int[] iArr2 = this.f3821f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f3822g;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f3821f = iArr;
            this.f3822g = objArr;
        }
        this.f3821f[i4] = i2;
        this.f3822g[i4] = e3;
        this.f3823h = i4 + 1;
    }

    public void b() {
        int i2 = this.f3823h;
        Object[] objArr = this.f3822g;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f3823h = 0;
        this.f3820e = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f3821f = (int[]) this.f3821f.clone();
            hVar.f3822g = (Object[]) this.f3822g.clone();
            return hVar;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    public E e(int i2) {
        return f(i2, null);
    }

    public E f(int i2, E e3) {
        E e4;
        int a3 = c.a(this.f3821f, this.f3823h, i2);
        return (a3 < 0 || (e4 = (E) this.f3822g[a3]) == f3819i) ? e3 : e4;
    }

    public int g(int i2) {
        if (this.f3820e) {
            d();
        }
        return this.f3821f[i2];
    }

    public void h(int i2, E e3) {
        int a3 = c.a(this.f3821f, this.f3823h, i2);
        if (a3 >= 0) {
            this.f3822g[a3] = e3;
            return;
        }
        int i3 = ~a3;
        int i4 = this.f3823h;
        if (i3 < i4) {
            Object[] objArr = this.f3822g;
            if (objArr[i3] == f3819i) {
                this.f3821f[i3] = i2;
                objArr[i3] = e3;
                return;
            }
        }
        if (this.f3820e && i4 >= this.f3821f.length) {
            d();
            i3 = ~c.a(this.f3821f, this.f3823h, i2);
        }
        int i5 = this.f3823h;
        if (i5 >= this.f3821f.length) {
            int e4 = c.e(i5 + 1);
            int[] iArr = new int[e4];
            Object[] objArr2 = new Object[e4];
            int[] iArr2 = this.f3821f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3822g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3821f = iArr;
            this.f3822g = objArr2;
        }
        int i6 = this.f3823h;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f3821f;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f3822g;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f3823h - i3);
        }
        this.f3821f[i3] = i2;
        this.f3822g[i3] = e3;
        this.f3823h++;
    }

    public void i(int i2) {
        int a3 = c.a(this.f3821f, this.f3823h, i2);
        if (a3 >= 0) {
            Object[] objArr = this.f3822g;
            Object obj = objArr[a3];
            Object obj2 = f3819i;
            if (obj != obj2) {
                objArr[a3] = obj2;
                this.f3820e = true;
            }
        }
    }

    public int j() {
        if (this.f3820e) {
            d();
        }
        return this.f3823h;
    }

    public E k(int i2) {
        if (this.f3820e) {
            d();
        }
        return (E) this.f3822g[i2];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3823h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3823h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(g(i2));
            sb.append('=');
            E k2 = k(i2);
            if (k2 != this) {
                sb.append(k2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
