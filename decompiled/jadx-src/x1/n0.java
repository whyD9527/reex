package x1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class n0 extends w0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k, reason: collision with root package name */
    public static final n0 f4429k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f4430l;

    static {
        Long l2;
        n0 n0Var = new n0();
        f4429k = n0Var;
        v0.u(n0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f4430l = timeUnit.toNanos(l2.longValue());
    }

    private n0() {
    }

    private final synchronized void P() {
        if (R()) {
            debugStatus = 3;
            K();
            notifyAll();
        }
    }

    private final synchronized Thread Q() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean R() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    private final synchronized boolean S() {
        if (R()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean H;
        b2.f4393a.c(this);
        c.a();
        try {
            if (!S()) {
                if (H) {
                    return;
                } else {
                    return;
                }
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long I = I();
                if (I == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = f4430l + nanoTime;
                    }
                    long j3 = j2 - nanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        P();
                        c.a();
                        if (H()) {
                            return;
                        }
                        y();
                        return;
                    }
                    I = t1.f.e(I, j3);
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (I > 0) {
                    if (R()) {
                        _thread = null;
                        P();
                        c.a();
                        if (H()) {
                            return;
                        }
                        y();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, I);
                }
            }
        } finally {
            _thread = null;
            P();
            c.a();
            if (!H()) {
                y();
            }
        }
    }

    @Override // x1.x0
    protected Thread y() {
        Thread thread = _thread;
        return thread == null ? Q() : thread;
    }
}
