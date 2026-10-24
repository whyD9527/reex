package l;

/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: i, reason: collision with root package name */
    private static final Object f3784i = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f3785e;

    /* renamed from: f, reason: collision with root package name */
    private long[] f3786f;

    /* renamed from: g, reason: collision with root package name */
    private Object[] f3787g;

    /* renamed from: h, reason: collision with root package name */
    private int f3788h;

    public d() {
        this(10);
    }

    public d(int i2) {
        this.f3785e = false;
        if (i2 == 0) {
            this.f3786f = c.f3782b;
            this.f3787g = c.f3783c;
        } else {
            int f2 = c.f(i2);
            this.f3786f = new long[f2];
            this.f3787g = new Object[f2];
        }
    }

    private void d() {
        int i2 = this.f3788h;
        long[] jArr = this.f3786f;
        Object[] objArr = this.f3787g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f3784i) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f3785e = false;
        this.f3788h = i3;
    }

    public void a(long j2, E e3) {
        int i2 = this.f3788h;
        if (i2 != 0 && j2 <= this.f3786f[i2 - 1]) {
            h(j2, e3);
            return;
        }
        if (this.f3785e && i2 >= this.f3786f.length) {
            d();
        }
        int i3 = this.f3788h;
        if (i3 >= this.f3786f.length) {
            int f2 = c.f(i3 + 1);
            long[] jArr = new long[f2];
            Object[] objArr = new Object[f2];
            long[] jArr2 = this.f3786f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f3787g;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f3786f = jArr;
            this.f3787g = objArr;
        }
        this.f3786f[i3] = j2;
        this.f3787g[i3] = e3;
        this.f3788h = i3 + 1;
    }

    public void b() {
        int i2 = this.f3788h;
        Object[] objArr = this.f3787g;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f3788h = 0;
        this.f3785e = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f3786f = (long[]) this.f3786f.clone();
            dVar.f3787g = (Object[]) this.f3787g.clone();
            return dVar;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    public E e(long j2) {
        return f(j2, null);
    }

    public E f(long j2, E e3) {
        E e4;
        int b3 = c.b(this.f3786f, this.f3788h, j2);
        return (b3 < 0 || (e4 = (E) this.f3787g[b3]) == f3784i) ? e3 : e4;
    }

    public long g(int i2) {
        if (this.f3785e) {
            d();
        }
        return this.f3786f[i2];
    }

    public void h(long j2, E e3) {
        int b3 = c.b(this.f3786f, this.f3788h, j2);
        if (b3 >= 0) {
            this.f3787g[b3] = e3;
            return;
        }
        int i2 = ~b3;
        int i3 = this.f3788h;
        if (i2 < i3) {
            Object[] objArr = this.f3787g;
            if (objArr[i2] == f3784i) {
                this.f3786f[i2] = j2;
                objArr[i2] = e3;
                return;
            }
        }
        if (this.f3785e && i3 >= this.f3786f.length) {
            d();
            i2 = ~c.b(this.f3786f, this.f3788h, j2);
        }
        int i4 = this.f3788h;
        if (i4 >= this.f3786f.length) {
            int f2 = c.f(i4 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f3786f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3787g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3786f = jArr;
            this.f3787g = objArr2;
        }
        int i5 = this.f3788h;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f3786f;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f3787g;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f3788h - i2);
        }
        this.f3786f[i2] = j2;
        this.f3787g[i2] = e3;
        this.f3788h++;
    }

    public void i(long j2) {
        int b3 = c.b(this.f3786f, this.f3788h, j2);
        if (b3 >= 0) {
            Object[] objArr = this.f3787g;
            Object obj = objArr[b3];
            Object obj2 = f3784i;
            if (obj != obj2) {
                objArr[b3] = obj2;
                this.f3785e = true;
            }
        }
    }

    public int j() {
        if (this.f3785e) {
            d();
        }
        return this.f3788h;
    }

    public E k(int i2) {
        if (this.f3785e) {
            d();
        }
        return (E) this.f3787g[i2];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3788h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3788h; i2++) {
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
