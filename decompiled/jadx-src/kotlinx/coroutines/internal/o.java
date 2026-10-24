package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class o<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int f3691a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3692b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3693c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ AtomicReferenceArray f3694d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f3687e = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final x f3690h = new x("REMOVE_FROZEN");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3688f = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f3689g = AtomicLongFieldUpdater.newUpdater(o.class, "_state");

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int a(long j2) {
            return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j2, int i2) {
            return d(j2, 1073741823L) | (i2 << 0);
        }

        public final long c(long j2, int i2) {
            return d(j2, 1152921503533105152L) | (i2 << 30);
        }

        public final long d(long j2, long j3) {
            return j2 & (~j3);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3695a;

        public b(int i2) {
            this.f3695a = i2;
        }
    }

    public o(int i2, boolean z2) {
        this.f3691a = i2;
        this.f3692b = z2;
        int i3 = i2 - 1;
        this.f3693c = i3;
        this.f3694d = new AtomicReferenceArray(i2);
        if (!(i3 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i2 & i3) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final o<E> b(long j2) {
        o<E> oVar = new o<>(this.f3691a * 2, this.f3692b);
        int i2 = (int) ((1073741823 & j2) >> 0);
        int i3 = (int) ((1152921503533105152L & j2) >> 30);
        while (true) {
            int i4 = this.f3693c;
            if ((i2 & i4) == (i3 & i4)) {
                oVar._state = f3687e.d(j2, 1152921504606846976L);
                return oVar;
            }
            Object obj = this.f3694d.get(i4 & i2);
            if (obj == null) {
                obj = new b(i2);
            }
            oVar.f3694d.set(oVar.f3693c & i2, obj);
            i2++;
        }
    }

    private final o<E> c(long j2) {
        while (true) {
            o<E> oVar = (o) this._next;
            if (oVar != null) {
                return oVar;
            }
            x1.l.a(f3688f, this, null, b(j2));
        }
    }

    private final o<E> e(int i2, E e3) {
        Object obj = this.f3694d.get(this.f3693c & i2);
        if (!(obj instanceof b) || ((b) obj).f3695a != i2) {
            return null;
        }
        this.f3694d.set(i2 & this.f3693c, e3);
        return this;
    }

    private final long h() {
        long j2;
        long j3;
        do {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return j2;
            }
            j3 = j2 | 1152921504606846976L;
        } while (!f3689g.compareAndSet(this, j2, j3));
        return j3;
    }

    private final o<E> k(int i2, int i3) {
        long j2;
        int i4;
        do {
            j2 = this._state;
            i4 = (int) ((1073741823 & j2) >> 0);
            if ((1152921504606846976L & j2) != 0) {
                return i();
            }
        } while (!f3689g.compareAndSet(this, j2, f3687e.b(j2, i3)));
        this.f3694d.set(i4 & this.f3693c, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(E e3) {
        while (true) {
            long j2 = this._state;
            if ((3458764513820540928L & j2) != 0) {
                return f3687e.a(j2);
            }
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.f3693c;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            if (!this.f3692b && this.f3694d.get(i3 & i4) != null) {
                int i5 = this.f3691a;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    break;
                }
            } else if (f3689g.compareAndSet(this, j2, f3687e.c(j2, (i3 + 1) & 1073741823))) {
                this.f3694d.set(i3 & i4, e3);
                o<E> oVar = this;
                while ((oVar._state & 1152921504606846976L) != 0 && (oVar = oVar.i().e(i3, e3)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean d() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f3689g.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j2 = this._state;
        return (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0))) & 1073741823;
    }

    public final boolean g() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    public final o<E> i() {
        return c(h());
    }

    public final Object j() {
        while (true) {
            long j2 = this._state;
            if ((1152921504606846976L & j2) != 0) {
                return f3690h;
            }
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = this.f3693c;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i3) == (i2 & i3)) {
                return null;
            }
            Object obj = this.f3694d.get(i3 & i2);
            if (obj == null) {
                if (this.f3692b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i4 = (i2 + 1) & 1073741823;
                if (f3689g.compareAndSet(this, j2, f3687e.b(j2, i4))) {
                    this.f3694d.set(this.f3693c & i2, null);
                    return obj;
                }
                if (this.f3692b) {
                    o<E> oVar = this;
                    do {
                        oVar = oVar.k(i2, i4);
                    } while (oVar != null);
                    return obj;
                }
            }
        }
    }
}
