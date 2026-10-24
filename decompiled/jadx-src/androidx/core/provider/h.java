package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class h {

    private static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private String f1496a;

        /* renamed from: b, reason: collision with root package name */
        private int f1497b;

        /* renamed from: androidx.core.provider.h$a$a, reason: collision with other inner class name */
        private static class C0024a extends Thread {

            /* renamed from: e, reason: collision with root package name */
            private final int f1498e;

            C0024a(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.f1498e = i2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f1498e);
                super.run();
            }
        }

        a(String str, int i2) {
            this.f1496a = str;
            this.f1497b = i2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0024a(runnable, this.f1496a, this.f1497b);
        }
    }

    private static class b<T> implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private Callable<T> f1499e;

        /* renamed from: f, reason: collision with root package name */
        private androidx.core.util.a<T> f1500f;

        /* renamed from: g, reason: collision with root package name */
        private Handler f1501g;

        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f1502e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f1503f;

            a(androidx.core.util.a aVar, Object obj) {
                this.f1502e = aVar;
                this.f1503f = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f1502e.accept(this.f1503f);
            }
        }

        b(Handler handler, Callable<T> callable, androidx.core.util.a<T> aVar) {
            this.f1499e = callable;
            this.f1500f = aVar;
            this.f1501g = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t2;
            try {
                t2 = this.f1499e.call();
            } catch (Exception unused) {
                t2 = null;
            }
            this.f1501g.post(new a(this.f1500f, t2));
        }
    }

    static ThreadPoolExecutor a(String str, int i2, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void b(Executor executor, Callable<T> callable, androidx.core.util.a<T> aVar) {
        executor.execute(new b(androidx.core.provider.b.a(), callable, aVar));
    }

    static <T> T c(ExecutorService executorService, Callable<T> callable, int i2) {
        try {
            return executorService.submit(callable).get(i2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            throw e3;
        } catch (ExecutionException e4) {
            throw new RuntimeException(e4);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
