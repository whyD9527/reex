package t1;

import h1.w;
import kotlin.jvm.internal.g;

/* loaded from: classes.dex */
public class a implements Iterable<Integer> {

    /* renamed from: h, reason: collision with root package name */
    public static final C0065a f4304h = new C0065a(null);

    /* renamed from: e, reason: collision with root package name */
    private final int f4305e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4306f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4307g;

    /* renamed from: t1.a$a, reason: collision with other inner class name */
    public static final class C0065a {
        private C0065a() {
        }

        public /* synthetic */ C0065a(g gVar) {
            this();
        }

        public final a a(int i2, int i3, int i4) {
            return new a(i2, i3, i4);
        }
    }

    public a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4305e = i2;
        this.f4306f = l1.c.b(i2, i3, i4);
        this.f4307g = i4;
    }

    public final int a() {
        return this.f4305e;
    }

    public final int b() {
        return this.f4306f;
    }

    public final int c() {
        return this.f4307g;
    }

    @Override // java.lang.Iterable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public w iterator() {
        return new b(this.f4305e, this.f4306f, this.f4307g);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f4305e != aVar.f4305e || this.f4306f != aVar.f4306f || this.f4307g != aVar.f4307g) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f4305e * 31) + this.f4306f) * 31) + this.f4307g;
    }

    public boolean isEmpty() {
        if (this.f4307g > 0) {
            if (this.f4305e > this.f4306f) {
                return true;
            }
        } else if (this.f4305e < this.f4306f) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f4307g > 0) {
            sb = new StringBuilder();
            sb.append(this.f4305e);
            sb.append("..");
            sb.append(this.f4306f);
            sb.append(" step ");
            i2 = this.f4307g;
        } else {
            sb = new StringBuilder();
            sb.append(this.f4305e);
            sb.append(" downTo ");
            sb.append(this.f4306f);
            sb.append(" step ");
            i2 = -this.f4307g;
        }
        sb.append(i2);
        return sb.toString();
    }
}
