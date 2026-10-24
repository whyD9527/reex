package i;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a extends d {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f2911c;

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f2912d = new ExecutorC0042a();

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f2913e = new b();

    /* renamed from: a, reason: collision with root package name */
    private d f2914a;

    /* renamed from: b, reason: collision with root package name */
    private d f2915b;

    /* renamed from: i.a$a, reason: collision with other inner class name */
    static class ExecutorC0042a implements Executor {
        ExecutorC0042a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().c(runnable);
        }
    }

    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().a(runnable);
        }
    }

    private a() {
        c cVar = new c();
        this.f2915b = cVar;
        this.f2914a = cVar;
    }

    public static a d() {
        if (f2911c != null) {
            return f2911c;
        }
        synchronized (a.class) {
            if (f2911c == null) {
                f2911c = new a();
            }
        }
        return f2911c;
    }

    @Override // i.d
    public void a(Runnable runnable) {
        this.f2914a.a(runnable);
    }

    @Override // i.d
    public boolean b() {
        return this.f2914a.b();
    }

    @Override // i.d
    public void c(Runnable runnable) {
        this.f2914a.c(runnable);
    }
}
