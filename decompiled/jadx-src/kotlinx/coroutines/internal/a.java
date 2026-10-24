package kotlinx.coroutines.internal;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f3650a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    private int f3651b;

    /* renamed from: c, reason: collision with root package name */
    private int f3652c;

    private final void b() {
        Object[] objArr = this.f3650a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        h1.e.c(objArr, objArr2, 0, this.f3651b, 0, 10, null);
        Object[] objArr3 = this.f3650a;
        int length2 = objArr3.length;
        int i2 = this.f3651b;
        h1.e.c(objArr3, objArr2, length2 - i2, 0, i2, 4, null);
        this.f3650a = objArr2;
        this.f3651b = 0;
        this.f3652c = length;
    }

    public final void a(T t2) {
        Object[] objArr = this.f3650a;
        int i2 = this.f3652c;
        objArr[i2] = t2;
        int length = (objArr.length - 1) & (i2 + 1);
        this.f3652c = length;
        if (length == this.f3651b) {
            b();
        }
    }

    public final boolean c() {
        return this.f3651b == this.f3652c;
    }

    public final T d() {
        int i2 = this.f3651b;
        if (i2 == this.f3652c) {
            return null;
        }
        Object[] objArr = this.f3650a;
        T t2 = (T) objArr[i2];
        objArr[i2] = null;
        this.f3651b = (i2 + 1) & (objArr.length - 1);
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
