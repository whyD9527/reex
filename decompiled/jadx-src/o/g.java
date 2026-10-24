package o;

/* loaded from: classes.dex */
class g<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f3903a;

    /* renamed from: b, reason: collision with root package name */
    private int f3904b;

    g(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3903a = new Object[i2];
    }

    @Override // o.f
    public void a(T[] tArr, int i2) {
        if (i2 > tArr.length) {
            i2 = tArr.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            T t2 = tArr[i3];
            int i4 = this.f3904b;
            Object[] objArr = this.f3903a;
            if (i4 < objArr.length) {
                objArr[i4] = t2;
                this.f3904b = i4 + 1;
            }
        }
    }

    @Override // o.f
    public boolean b(T t2) {
        int i2 = this.f3904b;
        Object[] objArr = this.f3903a;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = t2;
        this.f3904b = i2 + 1;
        return true;
    }

    @Override // o.f
    public T c() {
        int i2 = this.f3904b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f3903a;
        T t2 = (T) objArr[i3];
        objArr[i3] = null;
        this.f3904b = i2 - 1;
        return t2;
    }
}
