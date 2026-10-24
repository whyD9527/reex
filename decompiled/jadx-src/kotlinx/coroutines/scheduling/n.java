package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3763b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3764c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3765d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3766e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray<i> f3767a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ i b(n nVar, i iVar, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return nVar.a(iVar, z2);
    }

    private final i c(i iVar) {
        if (iVar.f3755f.e() == 1) {
            f3766e.incrementAndGet(this);
        }
        if (e() == 127) {
            return iVar;
        }
        int i2 = this.producerIndex & 127;
        while (this.f3767a.get(i2) != null) {
            Thread.yield();
        }
        this.f3767a.lazySet(i2, iVar);
        f3764c.incrementAndGet(this);
        return null;
    }

    private final void d(i iVar) {
        if (iVar != null) {
            if (iVar.f3755f.e() == 1) {
                f3766e.decrementAndGet(this);
            }
        }
    }

    private final i i() {
        i andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f3765d.compareAndSet(this, i2, i2 + 1) && (andSet = this.f3767a.getAndSet(i3, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        i i2 = i();
        if (i2 == null) {
            return false;
        }
        dVar.a(i2);
        return true;
    }

    private final long m(n nVar, boolean z2) {
        i iVar;
        do {
            iVar = (i) nVar.lastScheduledTask;
            if (iVar == null) {
                return -2L;
            }
            if (z2) {
                if (!(iVar.f3755f.e() == 1)) {
                    return -2L;
                }
            }
            long a3 = l.f3762f.a() - iVar.f3754e;
            long j2 = l.f3757a;
            if (a3 < j2) {
                return j2 - a3;
            }
        } while (!x1.l.a(f3763b, nVar, iVar, null));
        b(this, iVar, false, 2, null);
        return -1L;
    }

    public final i a(i iVar, boolean z2) {
        if (z2) {
            return c(iVar);
        }
        i iVar2 = (i) f3763b.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return c(iVar2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(d dVar) {
        i iVar = (i) f3763b.getAndSet(this, null);
        if (iVar != null) {
            dVar.a(iVar);
        }
        while (j(dVar)) {
        }
    }

    public final i h() {
        i iVar = (i) f3763b.getAndSet(this, null);
        return iVar == null ? i() : iVar;
    }

    public final long k(n nVar) {
        int i2 = nVar.consumerIndex;
        int i3 = nVar.producerIndex;
        AtomicReferenceArray<i> atomicReferenceArray = nVar.f3767a;
        while (true) {
            if (i2 == i3) {
                break;
            }
            int i4 = i2 & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            i iVar = atomicReferenceArray.get(i4);
            if (iVar != null) {
                if ((iVar.f3755f.e() == 1) && m.a(atomicReferenceArray, i4, iVar, null)) {
                    f3766e.decrementAndGet(nVar);
                    b(this, iVar, false, 2, null);
                    return -1L;
                }
            }
            i2++;
        }
        return m(nVar, true);
    }

    public final long l(n nVar) {
        i i2 = nVar.i();
        if (i2 == null) {
            return m(nVar, false);
        }
        b(this, i2, false, 2, null);
        return -1L;
    }
}
