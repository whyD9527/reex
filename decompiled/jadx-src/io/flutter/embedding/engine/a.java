package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import f1.i;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.u;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o0.a;
import y0.h;
import y0.j;
import y0.m;
import y0.n;
import y0.o;
import y0.p;
import y0.q;
import y0.r;

/* loaded from: classes.dex */
public class a implements i.a {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f3120a;

    /* renamed from: b, reason: collision with root package name */
    private final FlutterRenderer f3121b;

    /* renamed from: c, reason: collision with root package name */
    private final o0.a f3122c;

    /* renamed from: d, reason: collision with root package name */
    private final c f3123d;

    /* renamed from: e, reason: collision with root package name */
    private final a1.b f3124e;

    /* renamed from: f, reason: collision with root package name */
    private final y0.a f3125f;

    /* renamed from: g, reason: collision with root package name */
    private final y0.b f3126g;

    /* renamed from: h, reason: collision with root package name */
    private final y0.f f3127h;

    /* renamed from: i, reason: collision with root package name */
    private final y0.g f3128i;

    /* renamed from: j, reason: collision with root package name */
    private final h f3129j;

    /* renamed from: k, reason: collision with root package name */
    private final y0.i f3130k;

    /* renamed from: l, reason: collision with root package name */
    private final n f3131l;

    /* renamed from: m, reason: collision with root package name */
    private final j f3132m;

    /* renamed from: n, reason: collision with root package name */
    private final m f3133n;

    /* renamed from: o, reason: collision with root package name */
    private final o f3134o;

    /* renamed from: p, reason: collision with root package name */
    private final p f3135p;

    /* renamed from: q, reason: collision with root package name */
    private final q f3136q;

    /* renamed from: r, reason: collision with root package name */
    private final r f3137r;

    /* renamed from: s, reason: collision with root package name */
    private final u f3138s;

    /* renamed from: t, reason: collision with root package name */
    private final Set<b> f3139t;

    /* renamed from: u, reason: collision with root package name */
    private final b f3140u;

    /* renamed from: io.flutter.embedding.engine.a$a, reason: collision with other inner class name */
    class C0045a implements b {
        C0045a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            n0.b.f("FlutterEngine", "onPreEngineRestart()");
            Iterator it = a.this.f3139t.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b();
            }
            a.this.f3138s.m0();
            a.this.f3131l.g();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context, q0.d dVar, FlutterJNI flutterJNI, u uVar, String[] strArr, boolean z2, boolean z3) {
        this(context, dVar, flutterJNI, uVar, strArr, z2, z3, null);
    }

    public a(Context context, q0.d dVar, FlutterJNI flutterJNI, u uVar, String[] strArr, boolean z2, boolean z3, d dVar2) {
        AssetManager assets;
        this.f3139t = new HashSet();
        this.f3140u = new C0045a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        n0.a e3 = n0.a.e();
        flutterJNI = flutterJNI == null ? e3.d().a() : flutterJNI;
        this.f3120a = flutterJNI;
        o0.a aVar = new o0.a(flutterJNI, assets);
        this.f3122c = aVar;
        aVar.m();
        p0.a a3 = n0.a.e().a();
        this.f3125f = new y0.a(aVar, flutterJNI);
        y0.b bVar = new y0.b(aVar);
        this.f3126g = bVar;
        this.f3127h = new y0.f(aVar);
        y0.g gVar = new y0.g(aVar);
        this.f3128i = gVar;
        this.f3129j = new h(aVar);
        this.f3130k = new y0.i(aVar);
        this.f3132m = new j(aVar);
        this.f3133n = new m(aVar, context.getPackageManager());
        this.f3131l = new n(aVar, z3);
        this.f3134o = new o(aVar);
        this.f3135p = new p(aVar);
        this.f3136q = new q(aVar);
        this.f3137r = new r(aVar);
        if (a3 != null) {
            a3.d(bVar);
        }
        a1.b bVar2 = new a1.b(context, gVar);
        this.f3124e = bVar2;
        dVar = dVar == null ? e3.c() : dVar;
        if (!flutterJNI.isAttached()) {
            dVar.k(context.getApplicationContext());
            dVar.f(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f3140u);
        flutterJNI.setPlatformViewsController(uVar);
        flutterJNI.setLocalizationPlugin(bVar2);
        flutterJNI.setDeferredComponentManager(e3.a());
        if (!flutterJNI.isAttached()) {
            f();
        }
        this.f3121b = new FlutterRenderer(flutterJNI);
        this.f3138s = uVar;
        uVar.g0();
        c cVar = new c(context.getApplicationContext(), this, dVar, dVar2);
        this.f3123d = cVar;
        bVar2.d(context.getResources().getConfiguration());
        if (z2 && dVar.e()) {
            x0.a.a(this);
        }
        i.c(context, this);
        cVar.i(new c1.a(r()));
    }

    public a(Context context, String[] strArr, boolean z2, boolean z3) {
        this(context, null, null, new u(), strArr, z2, z3);
    }

    private void f() {
        n0.b.f("FlutterEngine", "Attaching to JNI.");
        this.f3120a.attachToNative();
        if (!y()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean y() {
        return this.f3120a.isAttached();
    }

    @Override // f1.i.a
    public void a(float f2, float f3, float f4) {
        this.f3120a.updateDisplayMetrics(0, f2, f3, f4);
    }

    public void e(b bVar) {
        this.f3139t.add(bVar);
    }

    public void g() {
        n0.b.f("FlutterEngine", "Destroying.");
        Iterator<b> it = this.f3139t.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f3123d.l();
        this.f3138s.i0();
        this.f3122c.n();
        this.f3120a.removeEngineLifecycleListener(this.f3140u);
        this.f3120a.setDeferredComponentManager(null);
        this.f3120a.detachFromNativeAndReleaseResources();
        if (n0.a.e().a() != null) {
            n0.a.e().a().destroy();
            this.f3126g.c(null);
        }
    }

    public y0.a h() {
        return this.f3125f;
    }

    public t0.b i() {
        return this.f3123d;
    }

    public o0.a j() {
        return this.f3122c;
    }

    public y0.f k() {
        return this.f3127h;
    }

    public a1.b l() {
        return this.f3124e;
    }

    public h m() {
        return this.f3129j;
    }

    public y0.i n() {
        return this.f3130k;
    }

    public j o() {
        return this.f3132m;
    }

    public u p() {
        return this.f3138s;
    }

    public s0.b q() {
        return this.f3123d;
    }

    public m r() {
        return this.f3133n;
    }

    public FlutterRenderer s() {
        return this.f3121b;
    }

    public n t() {
        return this.f3131l;
    }

    public o u() {
        return this.f3134o;
    }

    public p v() {
        return this.f3135p;
    }

    public q w() {
        return this.f3136q;
    }

    public r x() {
        return this.f3137r;
    }

    a z(Context context, a.b bVar, String str, List<String> list, u uVar, boolean z2, boolean z3) {
        if (y()) {
            return new a(context, null, this.f3120a.spawn(bVar.f3964c, bVar.f3963b, str, list), uVar, null, z2, z3);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }
}
