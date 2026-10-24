package z1;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.x;

/* loaded from: classes.dex */
public class d<E> extends z1.a<E> {

    /* renamed from: e, reason: collision with root package name */
    private final int f4791e;

    /* renamed from: f, reason: collision with root package name */
    private final e f4792f;

    /* renamed from: g, reason: collision with root package name */
    private final ReentrantLock f4793g;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f4794h;

    /* renamed from: i, reason: collision with root package name */
    private int f4795i;
    private volatile /* synthetic */ int size;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4796a;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.SUSPEND.ordinal()] = 1;
            iArr[e.DROP_LATEST.ordinal()] = 2;
            iArr[e.DROP_OLDEST.ordinal()] = 3;
            f4796a = iArr;
        }
    }

    public d(int i2, e eVar, q1.l<? super E, g1.q> lVar) {
        super(lVar);
        this.f4791e = i2;
        this.f4792f = eVar;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
        this.f4793g = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i2, 8)];
        h1.e.e(objArr, b.f4781a, 0, 0, 6, null);
        g1.q qVar = g1.q.f2865a;
        this.f4794h = objArr;
        this.size = 0;
    }

    private final void x(int i2, E e3) {
        if (i2 < this.f4791e) {
            y(i2);
            Object[] objArr = this.f4794h;
            objArr[(this.f4795i + i2) % objArr.length] = e3;
        } else {
            Object[] objArr2 = this.f4794h;
            int i3 = this.f4795i;
            objArr2[i3 % objArr2.length] = null;
            objArr2[(i2 + i3) % objArr2.length] = e3;
            this.f4795i = (i3 + 1) % objArr2.length;
        }
    }

    private final void y(int i2) {
        Object[] objArr = this.f4794h;
        if (i2 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f4791e);
            Object[] objArr2 = new Object[min];
            if (i2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    Object[] objArr3 = this.f4794h;
                    objArr2[i3] = objArr3[(this.f4795i + i3) % objArr3.length];
                    if (i4 >= i2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            h1.e.d(objArr2, b.f4781a, i2, min);
            this.f4794h = objArr2;
            this.f4795i = 0;
        }
    }

    private final x z(int i2) {
        if (i2 < this.f4791e) {
            this.size = i2 + 1;
            return null;
        }
        int i3 = a.f4796a[this.f4792f.ordinal()];
        if (i3 == 1) {
            return b.f4783c;
        }
        if (i3 == 2) {
            return b.f4782b;
        }
        if (i3 == 3) {
            return null;
        }
        throw new g1.i();
    }

    @Override // z1.c
    protected String c() {
        return "(buffer:capacity=" + this.f4791e + ",size=" + this.size + ')';
    }

    @Override // z1.c
    protected Object i(E e3) {
        q<E> l2;
        ReentrantLock reentrantLock = this.f4793g;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            j<?> d3 = d();
            if (d3 != null) {
                return d3;
            }
            x z2 = z(i2);
            if (z2 != null) {
                return z2;
            }
            if (i2 == 0) {
                do {
                    l2 = l();
                    if (l2 != null) {
                        if (l2 instanceof j) {
                            this.size = i2;
                            return l2;
                        }
                    }
                } while (l2.g(e3, null) == null);
                this.size = i2;
                g1.q qVar = g1.q.f2865a;
                reentrantLock.unlock();
                l2.c(e3);
                return l2.e();
            }
            x(i2, e3);
            return b.f4782b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // z1.a
    protected boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f4793g;
        reentrantLock.lock();
        try {
            return super.q(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // z1.a
    protected final boolean r() {
        return false;
    }

    @Override // z1.a
    protected final boolean s() {
        return this.size == 0;
    }

    @Override // z1.a
    protected Object v() {
        ReentrantLock reentrantLock = this.f4793g;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object d3 = d();
                if (d3 == null) {
                    d3 = b.f4784d;
                }
                return d3;
            }
            Object[] objArr = this.f4794h;
            int i3 = this.f4795i;
            Object obj = objArr[i3];
            s sVar = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            Object obj2 = b.f4784d;
            boolean z2 = false;
            if (i2 == this.f4791e) {
                s sVar2 = null;
                while (true) {
                    s m2 = m();
                    if (m2 == null) {
                        sVar = sVar2;
                        break;
                    }
                    if (m2.A(null) != null) {
                        obj2 = m2.z();
                        z2 = true;
                        sVar = m2;
                        break;
                    }
                    m2.B();
                    sVar2 = m2;
                }
            }
            if (obj2 != b.f4784d && !(obj2 instanceof j)) {
                this.size = i2;
                Object[] objArr2 = this.f4794h;
                objArr2[(this.f4795i + i2) % objArr2.length] = obj2;
            }
            this.f4795i = (this.f4795i + 1) % this.f4794h.length;
            g1.q qVar = g1.q.f2865a;
            if (z2) {
                kotlin.jvm.internal.k.b(sVar);
                sVar.y();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
