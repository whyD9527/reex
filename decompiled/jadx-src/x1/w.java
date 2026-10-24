package x1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class w extends b1 {

    /* renamed from: g, reason: collision with root package name */
    public static final w f4465g = new w();

    /* renamed from: h, reason: collision with root package name */
    private static final int f4466h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f4467i;
    private static volatile Executor pool;

    static {
        String str;
        Integer f2;
        int intValue;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            intValue = -1;
        } else {
            f2 = w1.m.f(str);
            if (f2 == null || f2.intValue() < 1) {
                throw new IllegalStateException(kotlin.jvm.internal.k.j("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            intValue = f2.intValue();
        }
        f4466h = intValue;
    }

    private w() {
    }

    private final ExecutorService r() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return Executors.newFixedThreadPool(v(), new ThreadFactory() { // from class: x1.u
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread s2;
                s2 = w.s(atomicInteger, runnable);
                return s2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread s(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, kotlin.jvm.internal.k.j("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ExecutorService t() {
        Class<?> cls;
        ExecutorService executorService;
        Object invoke;
        if (System.getSecurityManager() != null) {
            return r();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return r();
        }
        if (!f4467i && f4466h < 0) {
            try {
                invoke = cls.getMethod("commonPool", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused2) {
            }
            if (invoke instanceof ExecutorService) {
                executorService = (ExecutorService) invoke;
                if (executorService != null) {
                    if (!f4465g.w(cls, executorService)) {
                        executorService = null;
                    }
                    if (executorService != null) {
                        return executorService;
                    }
                }
            }
            executorService = null;
            if (executorService != null) {
            }
        }
        try {
            Object newInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(f4465g.v()));
            if (newInstance instanceof ExecutorService) {
                executorService2 = (ExecutorService) newInstance;
            }
        } catch (Throwable unused3) {
        }
        return executorService2 == null ? r() : executorService2;
    }

    private final synchronized Executor u() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = t();
            pool = executor;
        }
        return executor;
    }

    private final int v() {
        int a3;
        Integer valueOf = Integer.valueOf(f4466h);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        a3 = t1.f.a(Runtime.getRuntime().availableProcessors() - 1, 1);
        return a3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // x1.f0
    public void i(j1.g gVar, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = u();
            }
            c.a();
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            c.a();
            n0.f4429k.E(runnable);
        }
    }

    @Override // x1.f0
    public String toString() {
        return "CommonPool";
    }

    public final boolean w(Class<?> cls, ExecutorService executorService) {
        executorService.submit(new Runnable() { // from class: x1.v
            @Override // java.lang.Runnable
            public final void run() {
                w.x();
            }
        });
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (invoke instanceof Integer) {
                num = (Integer) invoke;
            }
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }
}
