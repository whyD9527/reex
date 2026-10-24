package o0;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import o0.c;
import z0.c;

/* loaded from: classes.dex */
class c implements z0.c, o0.f {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f3972a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, f> f3973b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<b>> f3974c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f3975d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f3976e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Integer, c.b> f3977f;

    /* renamed from: g, reason: collision with root package name */
    private int f3978g;

    /* renamed from: h, reason: collision with root package name */
    private final d f3979h;

    /* renamed from: i, reason: collision with root package name */
    private WeakHashMap<c.InterfaceC0078c, d> f3980i;

    /* renamed from: j, reason: collision with root package name */
    private i f3981j;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f3982a;

        /* renamed from: b, reason: collision with root package name */
        int f3983b;

        /* renamed from: c, reason: collision with root package name */
        long f3984c;

        b(ByteBuffer byteBuffer, int i2, long j2) {
            this.f3982a = byteBuffer;
            this.f3983b = i2;
            this.f3984c = j2;
        }
    }

    /* renamed from: o0.c$c, reason: collision with other inner class name */
    static class C0061c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final ExecutorService f3985a;

        C0061c(ExecutorService executorService) {
            this.f3985a = executorService;
        }

        @Override // o0.c.d
        public void a(Runnable runnable) {
            this.f3985a.execute(runnable);
        }
    }

    interface d {
        void a(Runnable runnable);
    }

    private static class e implements i {

        /* renamed from: a, reason: collision with root package name */
        ExecutorService f3986a = n0.a.e().b();

        e() {
        }

        @Override // o0.c.i
        public d a(c.d dVar) {
            return dVar.a() ? new h(this.f3986a) : new C0061c(this.f3986a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class f {

        /* renamed from: a, reason: collision with root package name */
        public final c.a f3987a;

        /* renamed from: b, reason: collision with root package name */
        public final d f3988b;

        f(c.a aVar, d dVar) {
            this.f3987a = aVar;
            this.f3988b = dVar;
        }
    }

    static class g implements c.b {

        /* renamed from: a, reason: collision with root package name */
        private final FlutterJNI f3989a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3990b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f3991c = new AtomicBoolean(false);

        g(FlutterJNI flutterJNI, int i2) {
            this.f3989a = flutterJNI;
            this.f3990b = i2;
        }

        @Override // z0.c.b
        public void a(ByteBuffer byteBuffer) {
            if (this.f3991c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f3989a.invokePlatformMessageEmptyResponseCallback(this.f3990b);
            } else {
                this.f3989a.invokePlatformMessageResponseCallback(this.f3990b, byteBuffer, byteBuffer.position());
            }
        }
    }

    static class h implements d {

        /* renamed from: a, reason: collision with root package name */
        private final ExecutorService f3992a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue<Runnable> f3993b = new ConcurrentLinkedQueue<>();

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f3994c = new AtomicBoolean(false);

        h(ExecutorService executorService) {
            this.f3992a = executorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void f() {
            if (this.f3994c.compareAndSet(false, true)) {
                try {
                    Runnable poll = this.f3993b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.f3994c.set(false);
                    if (!this.f3993b.isEmpty()) {
                        this.f3992a.execute(new Runnable() { // from class: o0.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                c.h.this.f();
                            }
                        });
                    }
                }
            }
        }

        @Override // o0.c.d
        public void a(Runnable runnable) {
            this.f3993b.add(runnable);
            this.f3992a.execute(new Runnable() { // from class: o0.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.h.this.e();
                }
            });
        }
    }

    interface i {
        d a(c.d dVar);
    }

    private static class j implements c.InterfaceC0078c {
        private j() {
        }
    }

    c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }

    c(FlutterJNI flutterJNI, i iVar) {
        this.f3973b = new HashMap();
        this.f3974c = new HashMap();
        this.f3975d = new Object();
        this.f3976e = new AtomicBoolean(false);
        this.f3977f = new HashMap();
        this.f3978g = 1;
        this.f3979h = new o0.g();
        this.f3980i = new WeakHashMap<>();
        this.f3972a = flutterJNI;
        this.f3981j = iVar;
    }

    private void j(final String str, final f fVar, final ByteBuffer byteBuffer, final int i2, final long j2) {
        d dVar = fVar != null ? fVar.f3988b : null;
        f1.f.b("PlatformChannel ScheduleHandler on " + str, i2);
        Runnable runnable = new Runnable() { // from class: o0.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.m(str, i2, fVar, byteBuffer, j2);
            }
        };
        if (dVar == null) {
            dVar = this.f3979h;
        }
        dVar.a(runnable);
    }

    private static void k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    private void l(f fVar, ByteBuffer byteBuffer, int i2) {
        if (fVar != null) {
            try {
                n0.b.f("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f3987a.a(byteBuffer, new g(this.f3972a, i2));
                return;
            } catch (Error e3) {
                k(e3);
                return;
            } catch (Exception e4) {
                n0.b.c("DartMessenger", "Uncaught exception in binary message listener", e4);
            }
        } else {
            n0.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f3972a.invokePlatformMessageEmptyResponseCallback(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, int i2, f fVar, ByteBuffer byteBuffer, long j2) {
        f1.f.e("PlatformChannel ScheduleHandler on " + str, i2);
        try {
            f1.f f2 = f1.f.f("DartMessenger#handleMessageFromDart on " + str);
            try {
                l(fVar, byteBuffer, i2);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                if (f2 != null) {
                    f2.close();
                }
            } finally {
            }
        } finally {
            this.f3972a.cleanupMessageData(j2);
        }
    }

    @Override // z0.c
    public c.InterfaceC0078c a(c.d dVar) {
        d a3 = this.f3981j.a(dVar);
        j jVar = new j();
        this.f3980i.put(jVar, a3);
        return jVar;
    }

    @Override // z0.c
    public /* synthetic */ c.InterfaceC0078c b() {
        return z0.b.a(this);
    }

    @Override // z0.c
    public void c(String str, c.a aVar) {
        e(str, aVar, null);
    }

    @Override // z0.c
    public void d(String str, ByteBuffer byteBuffer, c.b bVar) {
        f1.f f2 = f1.f.f("DartMessenger#send on " + str);
        try {
            n0.b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i2 = this.f3978g;
            this.f3978g = i2 + 1;
            if (bVar != null) {
                this.f3977f.put(Integer.valueOf(i2), bVar);
            }
            if (byteBuffer == null) {
                this.f3972a.dispatchEmptyPlatformMessage(str, i2);
            } else {
                this.f3972a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i2);
            }
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // z0.c
    public void e(String str, c.a aVar, c.InterfaceC0078c interfaceC0078c) {
        if (aVar == null) {
            n0.b.f("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f3975d) {
                this.f3973b.remove(str);
            }
            return;
        }
        d dVar = null;
        if (interfaceC0078c != null && (dVar = this.f3980i.get(interfaceC0078c)) == null) {
            throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
        }
        n0.b.f("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.f3975d) {
            this.f3973b.put(str, new f(aVar, dVar));
            List<b> remove = this.f3974c.remove(str);
            if (remove == null) {
                return;
            }
            for (b bVar : remove) {
                j(str, this.f3973b.get(str), bVar.f3982a, bVar.f3983b, bVar.f3984c);
            }
        }
    }

    @Override // z0.c
    public void f(String str, ByteBuffer byteBuffer) {
        n0.b.f("DartMessenger", "Sending message over channel '" + str + "'");
        d(str, byteBuffer, null);
    }

    @Override // o0.f
    public void g(int i2, ByteBuffer byteBuffer) {
        n0.b.f("DartMessenger", "Received message reply from Dart.");
        c.b remove = this.f3977f.remove(Integer.valueOf(i2));
        if (remove != null) {
            try {
                n0.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e3) {
                k(e3);
            } catch (Exception e4) {
                n0.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e4);
            }
        }
    }

    @Override // o0.f
    public void h(String str, ByteBuffer byteBuffer, int i2, long j2) {
        f fVar;
        boolean z2;
        n0.b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f3975d) {
            fVar = this.f3973b.get(str);
            z2 = this.f3976e.get() && fVar == null;
            if (z2) {
                if (!this.f3974c.containsKey(str)) {
                    this.f3974c.put(str, new LinkedList());
                }
                this.f3974c.get(str).add(new b(byteBuffer, i2, j2));
            }
        }
        if (z2) {
            return;
        }
        j(str, fVar, byteBuffer, i2, j2);
    }
}
