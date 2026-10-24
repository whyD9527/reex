package kotlinx.coroutines.scheduling;

import g1.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.x;
import x1.m0;

/* loaded from: classes.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: e, reason: collision with root package name */
    public final int f3716e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3717f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3718g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3719h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f3720i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f3721j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceArray<c> f3722k;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: l, reason: collision with root package name */
    public static final C0051a f3711l = new C0051a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final x f3715p = new x("NOT_IN_STACK");

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f3712m = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f3713n = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3714o = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: kotlinx.coroutines.scheduling.a$a, reason: collision with other inner class name */
    public static final class C0051a {
        private C0051a() {
        }

        public /* synthetic */ C0051a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3723a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f3723a = iArr;
        }
    }

    public final class c extends Thread {

        /* renamed from: l, reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f3724l = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: e, reason: collision with root package name */
        public final n f3725e;

        /* renamed from: f, reason: collision with root package name */
        public d f3726f;

        /* renamed from: g, reason: collision with root package name */
        private long f3727g;

        /* renamed from: h, reason: collision with root package name */
        private long f3728h;

        /* renamed from: i, reason: collision with root package name */
        private int f3729i;
        private volatile int indexInArray;

        /* renamed from: j, reason: collision with root package name */
        public boolean f3730j;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f3725e = new n();
            this.f3726f = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f3715p;
            this.f3729i = r1.c.f4295e.b();
        }

        public c(int i2) {
            this();
            n(i2);
        }

        private final void a(int i2) {
            if (i2 == 0) {
                return;
            }
            a.f3713n.addAndGet(a.this, -2097152L);
            if (this.f3726f != d.TERMINATED) {
                this.f3726f = d.DORMANT;
            }
        }

        private final void b(int i2) {
            if (i2 != 0 && r(d.BLOCKING)) {
                a.this.n();
            }
        }

        private final void c(i iVar) {
            int e3 = iVar.f3755f.e();
            h(e3);
            b(e3);
            a.this.k(iVar);
            a(e3);
        }

        private final i d(boolean z2) {
            i l2;
            i l3;
            if (z2) {
                boolean z3 = j(a.this.f3716e * 2) == 0;
                if (z3 && (l3 = l()) != null) {
                    return l3;
                }
                i h2 = this.f3725e.h();
                if (h2 != null) {
                    return h2;
                }
                if (!z3 && (l2 = l()) != null) {
                    return l2;
                }
            } else {
                i l4 = l();
                if (l4 != null) {
                    return l4;
                }
            }
            return s(false);
        }

        private final void h(int i2) {
            this.f3727g = 0L;
            if (this.f3726f == d.PARKING) {
                this.f3726f = d.BLOCKING;
            }
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f3715p;
        }

        private final void k() {
            if (this.f3727g == 0) {
                this.f3727g = System.nanoTime() + a.this.f3718g;
            }
            LockSupport.parkNanos(a.this.f3718g);
            if (System.nanoTime() - this.f3727g >= 0) {
                this.f3727g = 0L;
                t();
            }
        }

        private final i l() {
            kotlinx.coroutines.scheduling.d dVar;
            if (j(2) == 0) {
                i d3 = a.this.f3720i.d();
                if (d3 != null) {
                    return d3;
                }
                dVar = a.this.f3721j;
            } else {
                i d4 = a.this.f3721j.d();
                if (d4 != null) {
                    return d4;
                }
                dVar = a.this.f3720i;
            }
            return dVar.d();
        }

        private final void m() {
            loop0: while (true) {
                boolean z2 = false;
                while (!a.this.isTerminated() && this.f3726f != d.TERMINATED) {
                    i e3 = e(this.f3730j);
                    if (e3 != null) {
                        this.f3728h = 0L;
                        c(e3);
                    } else {
                        this.f3730j = false;
                        if (this.f3728h == 0) {
                            q();
                        } else if (z2) {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f3728h);
                            this.f3728h = 0L;
                        } else {
                            z2 = true;
                        }
                    }
                }
            }
            r(d.TERMINATED);
        }

        private final boolean p() {
            boolean z2;
            if (this.f3726f != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j2 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                        z2 = false;
                        break;
                    }
                    if (a.f3713n.compareAndSet(aVar, j2, j2 - 4398046511104L)) {
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    return false;
                }
                this.f3726f = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.i(this);
                return;
            }
            this.workerCtl = -1;
            while (i() && this.workerCtl == -1 && !a.this.isTerminated() && this.f3726f != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final i s(boolean z2) {
            int i2 = (int) (a.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int j2 = j(i2);
            a aVar = a.this;
            long j3 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                j2++;
                if (j2 > i2) {
                    j2 = 1;
                }
                c cVar = aVar.f3722k.get(j2);
                if (cVar != null && cVar != this) {
                    n nVar = this.f3725e;
                    n nVar2 = cVar.f3725e;
                    long k2 = z2 ? nVar.k(nVar2) : nVar.l(nVar2);
                    if (k2 == -1) {
                        return this.f3725e.h();
                    }
                    if (k2 > 0) {
                        j3 = Math.min(j3, k2);
                    }
                }
            }
            if (j3 == Long.MAX_VALUE) {
                j3 = 0;
            }
            this.f3728h = j3;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f3722k) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.f3716e) {
                    return;
                }
                if (f3724l.compareAndSet(this, -1, 1)) {
                    int f2 = f();
                    n(0);
                    aVar.j(this, f2, 0);
                    int andDecrement = (int) (a.f3713n.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != f2) {
                        c cVar = aVar.f3722k.get(andDecrement);
                        kotlin.jvm.internal.k.b(cVar);
                        c cVar2 = cVar;
                        aVar.f3722k.set(f2, cVar2);
                        cVar2.n(f2);
                        aVar.j(cVar2, andDecrement, f2);
                    }
                    aVar.f3722k.set(andDecrement, null);
                    q qVar = q.f2865a;
                    this.f3726f = d.TERMINATED;
                }
            }
        }

        public final i e(boolean z2) {
            i d3;
            if (p()) {
                return d(z2);
            }
            if (!z2 || (d3 = this.f3725e.h()) == null) {
                d3 = a.this.f3721j.d();
            }
            return d3 == null ? s(true) : d3;
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i2) {
            int i3 = this.f3729i;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f3729i = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        public final void n(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f3719h);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f3726f;
            boolean z2 = dVar2 == d.CPU_ACQUIRED;
            if (z2) {
                a.f3713n.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f3726f = dVar;
            }
            return z2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i2, int i3, long j2, String str) {
        this.f3716e = i2;
        this.f3717f = i3;
        this.f3718g = j2;
        this.f3719h = str;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (!(i3 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f3720i = new kotlinx.coroutines.scheduling.d();
        this.f3721j = new kotlinx.coroutines.scheduling.d();
        this.parkedWorkersStack = 0L;
        this.f3722k = new AtomicReferenceArray<>(i3 + 1);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    private final boolean a(i iVar) {
        return (iVar.f3755f.e() == 1 ? this.f3721j : this.f3720i).a(iVar);
    }

    private final int b() {
        int a3;
        int i2;
        synchronized (this.f3722k) {
            if (isTerminated()) {
                i2 = -1;
            } else {
                long j2 = this.controlState;
                int i3 = (int) (j2 & 2097151);
                a3 = t1.f.a(i3 - ((int) ((j2 & 4398044413952L) >> 21)), 0);
                if (a3 >= this.f3716e) {
                    return 0;
                }
                if (i3 >= this.f3717f) {
                    return 0;
                }
                int i4 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i4 > 0 && this.f3722k.get(i4) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(i4);
                this.f3722k.set(i4, cVar);
                if (!(i4 == ((int) (2097151 & f3713n.incrementAndGet(this))))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                cVar.start();
                i2 = a3 + 1;
            }
            return i2;
        }
    }

    private final c d() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar != null && kotlin.jvm.internal.k.a(a.this, this)) {
            return cVar;
        }
        return null;
    }

    public static /* synthetic */ void f(a aVar, Runnable runnable, j jVar, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jVar = g.f3752e;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        aVar.e(runnable, jVar, z2);
    }

    private final int g(c cVar) {
        int f2;
        do {
            Object g2 = cVar.g();
            if (g2 == f3715p) {
                return -1;
            }
            if (g2 == null) {
                return 0;
            }
            cVar = (c) g2;
            f2 = cVar.f();
        } while (f2 == 0);
        return f2;
    }

    private final c h() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            c cVar = this.f3722k.get((int) (2097151 & j2));
            if (cVar == null) {
                return null;
            }
            long j3 = (2097152 + j2) & (-2097152);
            int g2 = g(cVar);
            if (g2 >= 0 && f3712m.compareAndSet(this, j2, g2 | j3)) {
                cVar.o(f3715p);
                return cVar;
            }
        }
    }

    private final void m(boolean z2) {
        long addAndGet = f3713n.addAndGet(this, 2097152L);
        if (z2 || r() || p(addAndGet)) {
            return;
        }
        r();
    }

    private final i o(c cVar, i iVar, boolean z2) {
        if (cVar == null || cVar.f3726f == d.TERMINATED) {
            return iVar;
        }
        if (iVar.f3755f.e() == 0 && cVar.f3726f == d.BLOCKING) {
            return iVar;
        }
        cVar.f3730j = true;
        return cVar.f3725e.a(iVar, z2);
    }

    private final boolean p(long j2) {
        int a3;
        a3 = t1.f.a(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0);
        if (a3 < this.f3716e) {
            int b3 = b();
            if (b3 == 1 && this.f3716e > 1) {
                b();
            }
            if (b3 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean q(a aVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = aVar.controlState;
        }
        return aVar.p(j2);
    }

    private final boolean r() {
        c h2;
        do {
            h2 = h();
            if (h2 == null) {
                return false;
            }
        } while (!c.f3724l.compareAndSet(h2, -1, 0));
        LockSupport.unpark(h2);
        return true;
    }

    public final i c(Runnable runnable, j jVar) {
        long a3 = l.f3762f.a();
        if (!(runnable instanceof i)) {
            return new k(runnable, a3, jVar);
        }
        i iVar = (i) runnable;
        iVar.f3754e = a3;
        iVar.f3755f = jVar;
        return iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        l(10000L);
    }

    public final void e(Runnable runnable, j jVar, boolean z2) {
        x1.c.a();
        i c3 = c(runnable, jVar);
        c d3 = d();
        i o2 = o(d3, c3, z2);
        if (o2 != null && !a(o2)) {
            throw new RejectedExecutionException(kotlin.jvm.internal.k.j(this.f3719h, " was terminated"));
        }
        boolean z3 = z2 && d3 != null;
        if (c3.f3755f.e() != 0) {
            m(z3);
        } else {
            if (z3) {
                return;
            }
            n();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f(this, runnable, null, false, 6, null);
    }

    public final boolean i(c cVar) {
        long j2;
        int f2;
        if (cVar.g() != f3715p) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            f2 = cVar.f();
            cVar.o(this.f3722k.get((int) (2097151 & j2)));
        } while (!f3712m.compareAndSet(this, j2, ((2097152 + j2) & (-2097152)) | f2));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void j(c cVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                i4 = i3 == 0 ? g(cVar) : i3;
            }
            if (i4 >= 0 && f3712m.compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    public final void k(i iVar) {
        try {
            iVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void l(long j2) {
        int i2;
        if (f3714o.compareAndSet(this, 0, 1)) {
            c d3 = d();
            synchronized (this.f3722k) {
                i2 = (int) (this.controlState & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    int i4 = i3 + 1;
                    c cVar = this.f3722k.get(i3);
                    kotlin.jvm.internal.k.b(cVar);
                    c cVar2 = cVar;
                    if (cVar2 != d3) {
                        while (cVar2.isAlive()) {
                            LockSupport.unpark(cVar2);
                            cVar2.join(j2);
                        }
                        cVar2.f3725e.g(this.f3721j);
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            this.f3721j.b();
            this.f3720i.b();
            while (true) {
                i e3 = d3 == null ? null : d3.e(true);
                if (e3 == null && (e3 = this.f3720i.d()) == null && (e3 = this.f3721j.d()) == null) {
                    break;
                } else {
                    k(e3);
                }
            }
            if (d3 != null) {
                d3.r(d.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void n() {
        if (r() || q(this, 0L, 1, null)) {
            return;
        }
        r();
    }

    public String toString() {
        int i2;
        int i3;
        int i4;
        int i5;
        StringBuilder sb;
        char c3;
        ArrayList arrayList = new ArrayList();
        int length = this.f3722k.length();
        int i6 = 0;
        if (1 < length) {
            i3 = 0;
            int i7 = 0;
            i4 = 0;
            i5 = 0;
            int i8 = 1;
            while (true) {
                int i9 = i8 + 1;
                c cVar = this.f3722k.get(i8);
                if (cVar != null) {
                    int f2 = cVar.f3725e.f();
                    int i10 = b.f3723a[cVar.f3726f.ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i3++;
                            sb = new StringBuilder();
                            sb.append(f2);
                            c3 = 'b';
                        } else if (i10 == 3) {
                            i7++;
                            sb = new StringBuilder();
                            sb.append(f2);
                            c3 = 'c';
                        } else if (i10 == 4) {
                            i4++;
                            if (f2 > 0) {
                                sb = new StringBuilder();
                                sb.append(f2);
                                c3 = 'd';
                            }
                        } else if (i10 == 5) {
                            i5++;
                        }
                        sb.append(c3);
                        arrayList.add(sb.toString());
                    } else {
                        i6++;
                    }
                }
                if (i9 >= length) {
                    break;
                }
                i8 = i9;
            }
            i2 = i6;
            i6 = i7;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        long j2 = this.controlState;
        return this.f3719h + '@' + m0.b(this) + "[Pool Size {core = " + this.f3716e + ", max = " + this.f3717f + "}, Worker States {CPU = " + i6 + ", blocking = " + i3 + ", parked = " + i2 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f3720i.c() + ", global blocking queue size = " + this.f3721j.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.f3716e - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }
}
