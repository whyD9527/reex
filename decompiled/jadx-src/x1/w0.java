package x1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class w0 extends x0 {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4468i = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_queue");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f4469j = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    public static abstract class a implements Runnable, Comparable<a>, t0, kotlinx.coroutines.internal.d0 {

        /* renamed from: e, reason: collision with root package name */
        public long f4470e;

        /* renamed from: f, reason: collision with root package name */
        private Object f4471f;

        /* renamed from: g, reason: collision with root package name */
        private int f4472g;

        @Override // x1.t0
        public final synchronized void a() {
            kotlinx.coroutines.internal.x xVar;
            kotlinx.coroutines.internal.x xVar2;
            Object obj = this.f4471f;
            xVar = z0.f4482a;
            if (obj == xVar) {
                return;
            }
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar != null) {
                bVar.g(this);
            }
            xVar2 = z0.f4482a;
            this.f4471f = xVar2;
        }

        @Override // kotlinx.coroutines.internal.d0
        public void b(int i2) {
            this.f4472g = i2;
        }

        @Override // kotlinx.coroutines.internal.d0
        public void c(kotlinx.coroutines.internal.c0<?> c0Var) {
            kotlinx.coroutines.internal.x xVar;
            Object obj = this.f4471f;
            xVar = z0.f4482a;
            if (!(obj != xVar)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f4471f = c0Var;
        }

        @Override // kotlinx.coroutines.internal.d0
        public int d() {
            return this.f4472g;
        }

        @Override // kotlinx.coroutines.internal.d0
        public kotlinx.coroutines.internal.c0<?> e() {
            Object obj = this.f4471f;
            if (obj instanceof kotlinx.coroutines.internal.c0) {
                return (kotlinx.coroutines.internal.c0) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            long j2 = this.f4470e - aVar.f4470e;
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:11:0x000d, B:19:0x0021, B:20:0x0037, B:22:0x0040, B:23:0x0042, B:27:0x0024, B:30:0x002e), top: B:10:0x000d, outer: #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized int h(long j2, b bVar, w0 w0Var) {
            kotlinx.coroutines.internal.x xVar;
            long j3;
            long j4;
            int i2;
            Object obj = this.f4471f;
            xVar = z0.f4482a;
            if (obj == xVar) {
                i2 = 2;
            } else {
                synchronized (bVar) {
                    a b3 = bVar.b();
                    if (w0Var.G()) {
                        return 1;
                    }
                    if (b3 != null) {
                        long j5 = b3.f4470e;
                        if (j5 - j2 < 0) {
                            j2 = j5;
                        }
                        if (j2 - bVar.f4473b > 0) {
                        }
                        j3 = this.f4470e;
                        j4 = bVar.f4473b;
                        if (j3 - j4 < 0) {
                            this.f4470e = j4;
                        }
                        bVar.a(this);
                        i2 = 0;
                    }
                    bVar.f4473b = j2;
                    j3 = this.f4470e;
                    j4 = bVar.f4473b;
                    if (j3 - j4 < 0) {
                    }
                    bVar.a(this);
                    i2 = 0;
                }
            }
            return i2;
        }

        public final boolean i(long j2) {
            return j2 - this.f4470e >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f4470e + ']';
        }
    }

    public static final class b extends kotlinx.coroutines.internal.c0<a> {

        /* renamed from: b, reason: collision with root package name */
        public long f4473b;

        public b(long j2) {
            this.f4473b = j2;
        }
    }

    private final void C() {
        kotlinx.coroutines.internal.x xVar;
        kotlinx.coroutines.internal.x xVar2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4468i;
                xVar = z0.f4483b;
                if (l.a(atomicReferenceFieldUpdater, this, null, xVar)) {
                    return;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.internal.o) {
                    ((kotlinx.coroutines.internal.o) obj).d();
                    return;
                }
                xVar2 = z0.f4483b;
                if (obj == xVar2) {
                    return;
                }
                kotlinx.coroutines.internal.o oVar = new kotlinx.coroutines.internal.o(8, true);
                oVar.a((Runnable) obj);
                if (l.a(f4468i, this, obj, oVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable D() {
        kotlinx.coroutines.internal.x xVar;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.o) {
                kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) obj;
                Object j2 = oVar.j();
                if (j2 != kotlinx.coroutines.internal.o.f3690h) {
                    return (Runnable) j2;
                }
                l.a(f4468i, this, obj, oVar.i());
            } else {
                xVar = z0.f4483b;
                if (obj == xVar) {
                    return null;
                }
                if (l.a(f4468i, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean F(Runnable runnable) {
        kotlinx.coroutines.internal.x xVar;
        while (true) {
            Object obj = this._queue;
            if (G()) {
                return false;
            }
            if (obj == null) {
                if (l.a(f4468i, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.o) {
                kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) obj;
                int a3 = oVar.a(runnable);
                if (a3 == 0) {
                    return true;
                }
                if (a3 == 1) {
                    l.a(f4468i, this, obj, oVar.i());
                } else if (a3 == 2) {
                    return false;
                }
            } else {
                xVar = z0.f4483b;
                if (obj == xVar) {
                    return false;
                }
                kotlinx.coroutines.internal.o oVar2 = new kotlinx.coroutines.internal.o(8, true);
                oVar2.a((Runnable) obj);
                oVar2.a(runnable);
                if (l.a(f4468i, this, obj, oVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean G() {
        return this._isCompleted;
    }

    private final void J() {
        c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            a i2 = bVar == null ? null : bVar.i();
            if (i2 == null) {
                return;
            } else {
                z(nanoTime, i2);
            }
        }
    }

    private final int M(long j2, a aVar) {
        if (G()) {
            return 1;
        }
        b bVar = (b) this._delayed;
        if (bVar == null) {
            l.a(f4469j, this, null, new b(j2));
            Object obj = this._delayed;
            kotlin.jvm.internal.k.b(obj);
            bVar = (b) obj;
        }
        return aVar.h(j2, bVar, this);
    }

    private final void N(boolean z2) {
        this._isCompleted = z2 ? 1 : 0;
    }

    private final boolean O(a aVar) {
        b bVar = (b) this._delayed;
        return (bVar == null ? null : bVar.e()) == aVar;
    }

    public final void E(Runnable runnable) {
        if (F(runnable)) {
            A();
        } else {
            n0.f4429k.E(runnable);
        }
    }

    protected boolean H() {
        kotlinx.coroutines.internal.x xVar;
        if (!w()) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.o) {
                return ((kotlinx.coroutines.internal.o) obj).g();
            }
            xVar = z0.f4483b;
            if (obj != xVar) {
                return false;
            }
        }
        return true;
    }

    public long I() {
        a aVar;
        if (x()) {
            return 0L;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.d()) {
            c.a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (bVar) {
                    a b3 = bVar.b();
                    aVar = null;
                    if (b3 != null) {
                        a aVar2 = b3;
                        if (aVar2.i(nanoTime) ? F(aVar2) : false) {
                            aVar = bVar.h(0);
                        }
                    }
                }
            } while (aVar != null);
        }
        Runnable D = D();
        if (D == null) {
            return s();
        }
        D.run();
        return 0L;
    }

    protected final void K() {
        this._queue = null;
        this._delayed = null;
    }

    public final void L(long j2, a aVar) {
        int M = M(j2, aVar);
        if (M == 0) {
            if (O(aVar)) {
                A();
            }
        } else if (M == 1) {
            z(j2, aVar);
        } else if (M != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // x1.f0
    public final void i(j1.g gVar, Runnable runnable) {
        E(runnable);
    }

    @Override // x1.v0
    protected long s() {
        long b3;
        kotlinx.coroutines.internal.x xVar;
        if (super.s() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.o)) {
                xVar = z0.f4483b;
                return obj == xVar ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.o) obj).g()) {
                return 0L;
            }
        }
        b bVar = (b) this._delayed;
        a e3 = bVar == null ? null : bVar.e();
        if (e3 == null) {
            return Long.MAX_VALUE;
        }
        long j2 = e3.f4470e;
        c.a();
        b3 = t1.f.b(j2 - System.nanoTime(), 0L);
        return b3;
    }

    @Override // x1.v0
    protected void shutdown() {
        b2.f4393a.b();
        N(true);
        C();
        while (I() <= 0) {
        }
        J();
    }
}
