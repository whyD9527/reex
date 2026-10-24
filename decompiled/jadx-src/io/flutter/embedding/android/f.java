package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import io.flutter.embedding.engine.d;
import io.flutter.plugin.platform.g;
import java.util.Arrays;
import java.util.List;
import o0.a;

/* loaded from: classes.dex */
class f implements d<Activity> {

    /* renamed from: a, reason: collision with root package name */
    private c f3008a;

    /* renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.engine.a f3009b;

    /* renamed from: c, reason: collision with root package name */
    s f3010c;

    /* renamed from: d, reason: collision with root package name */
    private io.flutter.plugin.platform.g f3011d;

    /* renamed from: e, reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f3012e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3013f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3014g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3015h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3016i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f3017j;

    /* renamed from: k, reason: collision with root package name */
    private io.flutter.embedding.engine.d f3018k;

    /* renamed from: l, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.a f3019l;

    class a implements io.flutter.embedding.engine.renderer.a {
        a() {
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void c() {
            f.this.f3008a.c();
            f.this.f3014g = false;
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void f() {
            f.this.f3008a.f();
            f.this.f3014g = true;
            f.this.f3015h = true;
        }
    }

    class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s f3021e;

        b(s sVar) {
            this.f3021e = sVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (f.this.f3014g && f.this.f3012e != null) {
                this.f3021e.getViewTreeObserver().removeOnPreDrawListener(this);
                f.this.f3012e = null;
            }
            return f.this.f3014g;
        }
    }

    interface c extends g.d {
        boolean A();

        io.flutter.embedding.engine.a B(Context context);

        e0 C();

        void D(m mVar);

        void E(io.flutter.embedding.engine.a aVar);

        androidx.lifecycle.d a();

        void c();

        Activity d();

        void e();

        void f();

        Context getContext();

        String h();

        String i();

        List<String> l();

        boolean m();

        boolean n();

        boolean o();

        String p();

        boolean q();

        String r();

        void s(io.flutter.embedding.engine.a aVar);

        String t();

        io.flutter.plugin.platform.g u(Activity activity, io.flutter.embedding.engine.a aVar);

        void v(l lVar);

        String w();

        boolean x();

        io.flutter.embedding.engine.g y();

        d0 z();
    }

    f(c cVar) {
        this(cVar, null);
    }

    f(c cVar, io.flutter.embedding.engine.d dVar) {
        this.f3019l = new a();
        this.f3008a = cVar;
        this.f3015h = false;
        this.f3018k = dVar;
    }

    private d.b g(d.b bVar) {
        String w2 = this.f3008a.w();
        if (w2 == null || w2.isEmpty()) {
            w2 = n0.a.e().c().g();
        }
        a.b bVar2 = new a.b(w2, this.f3008a.r());
        String i2 = this.f3008a.i();
        if (i2 == null && (i2 = o(this.f3008a.d().getIntent())) == null) {
            i2 = "/";
        }
        return bVar.i(bVar2).k(i2).j(this.f3008a.l());
    }

    private void h(s sVar) {
        if (this.f3008a.z() != d0.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f3012e != null) {
            sVar.getViewTreeObserver().removeOnPreDrawListener(this.f3012e);
        }
        this.f3012e = new b(sVar);
        sVar.getViewTreeObserver().addOnPreDrawListener(this.f3012e);
    }

    private void i() {
        String str;
        if (this.f3008a.p() == null && !this.f3009b.j().k()) {
            String i2 = this.f3008a.i();
            if (i2 == null && (i2 = o(this.f3008a.d().getIntent())) == null) {
                i2 = "/";
            }
            String t2 = this.f3008a.t();
            if (("Executing Dart entrypoint: " + this.f3008a.r() + ", library uri: " + t2) == null) {
                str = "\"\"";
            } else {
                str = t2 + ", and sending initial route: " + i2;
            }
            n0.b.f("FlutterActivityAndFragmentDelegate", str);
            this.f3009b.n().c(i2);
            String w2 = this.f3008a.w();
            if (w2 == null || w2.isEmpty()) {
                w2 = n0.a.e().c().g();
            }
            this.f3009b.j().j(t2 == null ? new a.b(w2, this.f3008a.r()) : new a.b(w2, t2, this.f3008a.r()), this.f3008a.l());
        }
    }

    private void j() {
        if (this.f3008a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String o(Intent intent) {
        Uri data;
        if (!this.f3008a.x() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    void A() {
        io.flutter.embedding.engine.a aVar;
        n0.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        j();
        if (!this.f3008a.o() || (aVar = this.f3009b) == null) {
            return;
        }
        aVar.k().e();
    }

    void B(Bundle bundle) {
        n0.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        j();
        if (this.f3008a.q()) {
            bundle.putByteArray("framework", this.f3009b.t().h());
        }
        if (this.f3008a.m()) {
            Bundle bundle2 = new Bundle();
            this.f3009b.i().e(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    void C() {
        n0.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        j();
        i();
        Integer num = this.f3017j;
        if (num != null) {
            this.f3010c.setVisibility(num.intValue());
        }
    }

    void D() {
        io.flutter.embedding.engine.a aVar;
        n0.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        j();
        if (this.f3008a.o() && (aVar = this.f3009b) != null) {
            aVar.k().d();
        }
        this.f3017j = Integer.valueOf(this.f3010c.getVisibility());
        this.f3010c.setVisibility(8);
    }

    void E(int i2) {
        j();
        io.flutter.embedding.engine.a aVar = this.f3009b;
        if (aVar != null) {
            if (this.f3015h && i2 >= 10) {
                aVar.j().l();
                this.f3009b.w().a();
            }
            this.f3009b.s().q(i2);
        }
    }

    void F() {
        j();
        if (this.f3009b == null) {
            n0.b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            n0.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f3009b.i().f();
        }
    }

    void G(boolean z2) {
        io.flutter.embedding.engine.a aVar;
        j();
        StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        sb.append(z2 ? "true" : "false");
        n0.b.f("FlutterActivityAndFragmentDelegate", sb.toString());
        if (!this.f3008a.o() || (aVar = this.f3009b) == null) {
            return;
        }
        if (z2) {
            aVar.k().a();
        } else {
            aVar.k().f();
        }
    }

    void H() {
        this.f3008a = null;
        this.f3009b = null;
        this.f3010c = null;
        this.f3011d = null;
    }

    void I() {
        io.flutter.embedding.engine.d dVar;
        d.b l2;
        n0.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String p2 = this.f3008a.p();
        if (p2 != null) {
            io.flutter.embedding.engine.a a3 = io.flutter.embedding.engine.b.b().a(p2);
            this.f3009b = a3;
            this.f3013f = true;
            if (a3 != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + p2 + "'");
        }
        c cVar = this.f3008a;
        io.flutter.embedding.engine.a B = cVar.B(cVar.getContext());
        this.f3009b = B;
        if (B != null) {
            this.f3013f = true;
            return;
        }
        String h2 = this.f3008a.h();
        if (h2 != null) {
            dVar = io.flutter.embedding.engine.e.b().a(h2);
            if (dVar == null) {
                throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + h2 + "'");
            }
            l2 = new d.b(this.f3008a.getContext());
        } else {
            n0.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            dVar = this.f3018k;
            if (dVar == null) {
                dVar = new io.flutter.embedding.engine.d(this.f3008a.getContext(), this.f3008a.y().b());
            }
            l2 = new d.b(this.f3008a.getContext()).h(false).l(this.f3008a.q());
        }
        this.f3009b = dVar.a(g(l2));
        this.f3013f = false;
    }

    void J() {
        io.flutter.plugin.platform.g gVar = this.f3011d;
        if (gVar != null) {
            gVar.E();
        }
    }

    @Override // io.flutter.embedding.android.d
    public void e() {
        if (!this.f3008a.n()) {
            this.f3008a.e();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f3008a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    @Override // io.flutter.embedding.android.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Activity f() {
        Activity d3 = this.f3008a.d();
        if (d3 != null) {
            return d3;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    io.flutter.embedding.engine.a l() {
        return this.f3009b;
    }

    boolean m() {
        return this.f3016i;
    }

    boolean n() {
        return this.f3013f;
    }

    void p(int i2, int i3, Intent intent) {
        j();
        if (this.f3009b == null) {
            n0.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        n0.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i2 + "\nresultCode: " + i3 + "\ndata: " + intent);
        this.f3009b.i().a(i2, i3, intent);
    }

    void q(Context context) {
        j();
        if (this.f3009b == null) {
            I();
        }
        if (this.f3008a.m()) {
            n0.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f3009b.i().g(this, this.f3008a.a());
        }
        c cVar = this.f3008a;
        this.f3011d = cVar.u(cVar.d(), this.f3009b);
        this.f3008a.E(this.f3009b);
        this.f3016i = true;
    }

    void r() {
        j();
        if (this.f3009b == null) {
            n0.b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            n0.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f3009b.n().a();
        }
    }

    View s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i2, boolean z2) {
        s sVar;
        n0.b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        j();
        if (this.f3008a.z() == d0.surface) {
            l lVar = new l(this.f3008a.getContext(), this.f3008a.C() == e0.transparent);
            this.f3008a.v(lVar);
            sVar = new s(this.f3008a.getContext(), lVar);
        } else {
            m mVar = new m(this.f3008a.getContext());
            mVar.setOpaque(this.f3008a.C() == e0.opaque);
            this.f3008a.D(mVar);
            sVar = new s(this.f3008a.getContext(), mVar);
        }
        this.f3010c = sVar;
        this.f3010c.l(this.f3019l);
        if (this.f3008a.A()) {
            n0.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.f3010c.n(this.f3009b);
        }
        this.f3010c.setId(i2);
        if (z2) {
            h(this.f3010c);
        }
        return this.f3010c;
    }

    void t() {
        n0.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        j();
        if (this.f3012e != null) {
            this.f3010c.getViewTreeObserver().removeOnPreDrawListener(this.f3012e);
            this.f3012e = null;
        }
        s sVar = this.f3010c;
        if (sVar != null) {
            sVar.s();
            this.f3010c.y(this.f3019l);
        }
    }

    void u() {
        io.flutter.embedding.engine.a aVar;
        if (this.f3016i) {
            n0.b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
            j();
            this.f3008a.s(this.f3009b);
            if (this.f3008a.m()) {
                n0.b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
                if (this.f3008a.d().isChangingConfigurations()) {
                    this.f3009b.i().h();
                } else {
                    this.f3009b.i().j();
                }
            }
            io.flutter.plugin.platform.g gVar = this.f3011d;
            if (gVar != null) {
                gVar.q();
                this.f3011d = null;
            }
            if (this.f3008a.o() && (aVar = this.f3009b) != null) {
                aVar.k().b();
            }
            if (this.f3008a.n()) {
                this.f3009b.g();
                if (this.f3008a.p() != null) {
                    io.flutter.embedding.engine.b.b().d(this.f3008a.p());
                }
                this.f3009b = null;
            }
            this.f3016i = false;
        }
    }

    void v(Intent intent) {
        j();
        if (this.f3009b == null) {
            n0.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        n0.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.f3009b.i().c(intent);
        String o2 = o(intent);
        if (o2 == null || o2.isEmpty()) {
            return;
        }
        this.f3009b.n().b(o2);
    }

    void w() {
        io.flutter.embedding.engine.a aVar;
        n0.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        j();
        if (!this.f3008a.o() || (aVar = this.f3009b) == null) {
            return;
        }
        aVar.k().c();
    }

    void x() {
        n0.b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        j();
        if (this.f3009b != null) {
            J();
        } else {
            n0.b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    void y(int i2, String[] strArr, int[] iArr) {
        j();
        if (this.f3009b == null) {
            n0.b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        n0.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i2 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f3009b.i().b(i2, strArr, iArr);
    }

    void z(Bundle bundle) {
        Bundle bundle2;
        n0.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        j();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f3008a.q()) {
            this.f3009b.t().j(bArr);
        }
        if (this.f3008a.m()) {
            this.f3009b.i().d(bundle2);
        }
    }
}
