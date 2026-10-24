package n0;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import q0.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static a f3841e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f3842f;

    /* renamed from: a, reason: collision with root package name */
    private d f3843a;

    /* renamed from: b, reason: collision with root package name */
    private p0.a f3844b;

    /* renamed from: c, reason: collision with root package name */
    private FlutterJNI.c f3845c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f3846d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private d f3847a;

        /* renamed from: b, reason: collision with root package name */
        private p0.a f3848b;

        /* renamed from: c, reason: collision with root package name */
        private FlutterJNI.c f3849c;

        /* renamed from: d, reason: collision with root package name */
        private ExecutorService f3850d;

        /* renamed from: n0.a$b$a, reason: collision with other inner class name */
        private class ThreadFactoryC0058a implements ThreadFactory {

            /* renamed from: a, reason: collision with root package name */
            private int f3851a;

            private ThreadFactoryC0058a() {
                this.f3851a = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i2 = this.f3851a;
                this.f3851a = i2 + 1;
                sb.append(i2);
                thread.setName(sb.toString());
                return thread;
            }
        }

        private void b() {
            if (this.f3849c == null) {
                this.f3849c = new FlutterJNI.c();
            }
            if (this.f3850d == null) {
                this.f3850d = Executors.newCachedThreadPool(new ThreadFactoryC0058a());
            }
            if (this.f3847a == null) {
                this.f3847a = new d(this.f3849c.a(), this.f3850d);
            }
        }

        public a a() {
            b();
            return new a(this.f3847a, this.f3848b, this.f3849c, this.f3850d);
        }
    }

    private a(d dVar, p0.a aVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f3843a = dVar;
        this.f3844b = aVar;
        this.f3845c = cVar;
        this.f3846d = executorService;
    }

    public static a e() {
        f3842f = true;
        if (f3841e == null) {
            f3841e = new b().a();
        }
        return f3841e;
    }

    public p0.a a() {
        return this.f3844b;
    }

    public ExecutorService b() {
        return this.f3846d;
    }

    public d c() {
        return this.f3843a;
    }

    public FlutterJNI.c d() {
        return this.f3845c;
    }
}
