package o0;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import z0.c;
import z0.s;

/* loaded from: classes.dex */
public class a implements z0.c {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f3953a;

    /* renamed from: b, reason: collision with root package name */
    private final AssetManager f3954b;

    /* renamed from: c, reason: collision with root package name */
    private final o0.c f3955c;

    /* renamed from: d, reason: collision with root package name */
    private final z0.c f3956d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3957e;

    /* renamed from: f, reason: collision with root package name */
    private String f3958f;

    /* renamed from: g, reason: collision with root package name */
    private d f3959g;

    /* renamed from: h, reason: collision with root package name */
    private final c.a f3960h;

    /* renamed from: o0.a$a, reason: collision with other inner class name */
    class C0060a implements c.a {
        C0060a() {
        }

        @Override // z0.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            a.this.f3958f = s.f4772b.b(byteBuffer);
            if (a.this.f3959g != null) {
                a.this.f3959g.a(a.this.f3958f);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f3962a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3963b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3964c;

        public b(String str, String str2) {
            this.f3962a = str;
            this.f3963b = null;
            this.f3964c = str2;
        }

        public b(String str, String str2, String str3) {
            this.f3962a = str;
            this.f3963b = str2;
            this.f3964c = str3;
        }

        public static b a() {
            q0.d c3 = n0.a.e().c();
            if (c3.i()) {
                return new b(c3.g(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f3962a.equals(bVar.f3962a)) {
                return this.f3964c.equals(bVar.f3964c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f3962a.hashCode() * 31) + this.f3964c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f3962a + ", function: " + this.f3964c + " )";
        }
    }

    private static class c implements z0.c {

        /* renamed from: a, reason: collision with root package name */
        private final o0.c f3965a;

        private c(o0.c cVar) {
            this.f3965a = cVar;
        }

        /* synthetic */ c(o0.c cVar, C0060a c0060a) {
            this(cVar);
        }

        @Override // z0.c
        public c.InterfaceC0078c a(c.d dVar) {
            return this.f3965a.a(dVar);
        }

        @Override // z0.c
        public /* synthetic */ c.InterfaceC0078c b() {
            return z0.b.a(this);
        }

        @Override // z0.c
        public void c(String str, c.a aVar) {
            this.f3965a.c(str, aVar);
        }

        @Override // z0.c
        public void d(String str, ByteBuffer byteBuffer, c.b bVar) {
            this.f3965a.d(str, byteBuffer, bVar);
        }

        @Override // z0.c
        public void e(String str, c.a aVar, c.InterfaceC0078c interfaceC0078c) {
            this.f3965a.e(str, aVar, interfaceC0078c);
        }

        @Override // z0.c
        public void f(String str, ByteBuffer byteBuffer) {
            this.f3965a.d(str, byteBuffer, null);
        }
    }

    public interface d {
        void a(String str);
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f3957e = false;
        C0060a c0060a = new C0060a();
        this.f3960h = c0060a;
        this.f3953a = flutterJNI;
        this.f3954b = assetManager;
        o0.c cVar = new o0.c(flutterJNI);
        this.f3955c = cVar;
        cVar.c("flutter/isolate", c0060a);
        this.f3956d = new c(cVar, null);
        if (flutterJNI.isAttached()) {
            this.f3957e = true;
        }
    }

    @Override // z0.c
    @Deprecated
    public c.InterfaceC0078c a(c.d dVar) {
        return this.f3956d.a(dVar);
    }

    @Override // z0.c
    public /* synthetic */ c.InterfaceC0078c b() {
        return z0.b.a(this);
    }

    @Override // z0.c
    @Deprecated
    public void c(String str, c.a aVar) {
        this.f3956d.c(str, aVar);
    }

    @Override // z0.c
    @Deprecated
    public void d(String str, ByteBuffer byteBuffer, c.b bVar) {
        this.f3956d.d(str, byteBuffer, bVar);
    }

    @Override // z0.c
    @Deprecated
    public void e(String str, c.a aVar, c.InterfaceC0078c interfaceC0078c) {
        this.f3956d.e(str, aVar, interfaceC0078c);
    }

    @Override // z0.c
    @Deprecated
    public void f(String str, ByteBuffer byteBuffer) {
        this.f3956d.f(str, byteBuffer);
    }

    public void j(b bVar, List<String> list) {
        if (this.f3957e) {
            n0.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        f1.f f2 = f1.f.f("DartExecutor#executeDartEntrypoint");
        try {
            n0.b.f("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.f3953a.runBundleAndSnapshotFromLibrary(bVar.f3962a, bVar.f3964c, bVar.f3963b, this.f3954b, list);
            this.f3957e = true;
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

    public boolean k() {
        return this.f3957e;
    }

    public void l() {
        if (this.f3953a.isAttached()) {
            this.f3953a.notifyLowMemoryWarning();
        }
    }

    public void m() {
        n0.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f3953a.setPlatformMessageHandler(this.f3955c);
    }

    public void n() {
        n0.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f3953a.setPlatformMessageHandler(null);
    }
}
