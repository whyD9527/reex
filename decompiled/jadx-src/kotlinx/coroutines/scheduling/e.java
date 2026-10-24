package kotlinx.coroutines.scheduling;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x1.b1;

/* loaded from: classes.dex */
final class e extends b1 implements j, Executor {

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3745l = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");

    /* renamed from: g, reason: collision with root package name */
    private final c f3746g;

    /* renamed from: h, reason: collision with root package name */
    private final int f3747h;

    /* renamed from: i, reason: collision with root package name */
    private final String f3748i;

    /* renamed from: j, reason: collision with root package name */
    private final int f3749j;

    /* renamed from: k, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f3750k = new ConcurrentLinkedQueue<>();
    private volatile /* synthetic */ int inFlightTasks = 0;

    public e(c cVar, int i2, String str, int i3) {
        this.f3746g = cVar;
        this.f3747h = i2;
        this.f3748i = str;
        this.f3749j = i3;
    }

    private final void p(Runnable runnable, boolean z2) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3745l;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f3747h) {
                this.f3746g.q(runnable, this, z2);
                return;
            }
            this.f3750k.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f3747h) {
                return;
            } else {
                runnable = this.f3750k.poll();
            }
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.scheduling.j
    public void a() {
        Runnable poll = this.f3750k.poll();
        if (poll != null) {
            this.f3746g.q(poll, this, true);
            return;
        }
        f3745l.decrementAndGet(this);
        Runnable poll2 = this.f3750k.poll();
        if (poll2 == null) {
            return;
        }
        p(poll2, true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // kotlinx.coroutines.scheduling.j
    public int e() {
        return this.f3749j;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        p(runnable, false);
    }

    @Override // x1.f0
    public void i(j1.g gVar, Runnable runnable) {
        p(runnable, false);
    }

    @Override // x1.f0
    public String toString() {
        String str = this.f3748i;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f3746g + ']';
    }
}
