package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.d;
import io.flutter.embedding.android.f;
import java.util.List;

/* loaded from: classes.dex */
public class e extends Activity implements f.c, androidx.lifecycle.g {

    /* renamed from: i, reason: collision with root package name */
    public static final int f2999i = f1.i.e(61938);

    /* renamed from: e, reason: collision with root package name */
    private boolean f3000e = false;

    /* renamed from: f, reason: collision with root package name */
    protected f f3001f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.lifecycle.h f3002g;

    /* renamed from: h, reason: collision with root package name */
    private final OnBackInvokedCallback f3003h;

    class a implements OnBackInvokedCallback {
        a() {
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            e.this.onBackPressed();
        }
    }

    public e() {
        this.f3003h = Build.VERSION.SDK_INT >= 33 ? new a() : null;
        this.f3002g = new androidx.lifecycle.h(this);
    }

    private void F() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void G() {
        if (I() == g.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View H() {
        return this.f3001f.s(null, null, null, f2999i, z() == d0.surface);
    }

    private boolean L() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private boolean O(String str) {
        StringBuilder sb;
        String str2;
        f fVar = this.f3001f;
        if (fVar == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after release.";
        } else {
            if (fVar.m()) {
                return true;
            }
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after detach.";
        }
        sb.append(str2);
        n0.b.g("FlutterActivity", sb.toString());
        return false;
    }

    private void P() {
        try {
            Bundle K = K();
            if (K != null) {
                int i2 = K.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i2 != -1) {
                    setTheme(i2);
                }
            } else {
                n0.b.f("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            n0.b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean A() {
        return true;
    }

    @Override // io.flutter.embedding.android.f.c
    public io.flutter.embedding.engine.a B(Context context) {
        return null;
    }

    @Override // io.flutter.embedding.android.f.c
    public e0 C() {
        return I() == g.opaque ? e0.opaque : e0.transparent;
    }

    @Override // io.flutter.embedding.android.f.c
    public void D(m mVar) {
    }

    @Override // io.flutter.embedding.android.f.c
    public void E(io.flutter.embedding.engine.a aVar) {
        if (this.f3001f.n()) {
            return;
        }
        x0.a.a(aVar);
    }

    protected g I() {
        return getIntent().hasExtra("background_mode") ? g.valueOf(getIntent().getStringExtra("background_mode")) : g.opaque;
    }

    protected io.flutter.embedding.engine.a J() {
        return this.f3001f.l();
    }

    protected Bundle K() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public void M() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f3003h);
            this.f3000e = true;
        }
    }

    public void N() {
        Q();
        f fVar = this.f3001f;
        if (fVar != null) {
            fVar.H();
            this.f3001f = null;
        }
    }

    public void Q() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f3003h);
            this.f3000e = false;
        }
    }

    @Override // io.flutter.embedding.android.f.c, androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        return this.f3002g;
    }

    @Override // io.flutter.plugin.platform.g.d
    public boolean b() {
        return false;
    }

    @Override // io.flutter.embedding.android.f.c
    public void c() {
    }

    @Override // io.flutter.embedding.android.f.c
    public Activity d() {
        return this;
    }

    @Override // io.flutter.embedding.android.f.c
    public void e() {
        n0.b.g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + J() + " evicted by another attaching activity");
        f fVar = this.f3001f;
        if (fVar != null) {
            fVar.t();
            this.f3001f.u();
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public void f() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.plugin.platform.g.d
    public void g(boolean z2) {
        if (z2 && !this.f3000e) {
            M();
        } else {
            if (z2 || !this.f3000e) {
                return;
            }
            Q();
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public Context getContext() {
        return this;
    }

    @Override // io.flutter.embedding.android.f.c
    public String h() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // io.flutter.embedding.android.f.c
    public String i() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle K = K();
            if (K != null) {
                return K.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public List<String> l() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean m() {
        return true;
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean n() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (p() != null || this.f3001f.n()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean o() {
        return true;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (O("onActivityResult")) {
            this.f3001f.p(i2, i3, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (O("onBackPressed")) {
            this.f3001f.r();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        P();
        super.onCreate(bundle);
        f fVar = new f(this);
        this.f3001f = fVar;
        fVar.q(this);
        this.f3001f.z(bundle);
        this.f3002g.h(d.b.ON_CREATE);
        G();
        setContentView(H());
        F();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (O("onDestroy")) {
            this.f3001f.t();
            this.f3001f.u();
        }
        N();
        this.f3002g.h(d.b.ON_DESTROY);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (O("onNewIntent")) {
            this.f3001f.v(intent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (O("onPause")) {
            this.f3001f.w();
        }
        this.f3002g.h(d.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (O("onPostResume")) {
            this.f3001f.x();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (O("onRequestPermissionsResult")) {
            this.f3001f.y(i2, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f3002g.h(d.b.ON_RESUME);
        if (O("onResume")) {
            this.f3001f.A();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (O("onSaveInstanceState")) {
            this.f3001f.B(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f3002g.h(d.b.ON_START);
        if (O("onStart")) {
            this.f3001f.C();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (O("onStop")) {
            this.f3001f.D();
        }
        this.f3002g.h(d.b.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (O("onTrimMemory")) {
            this.f3001f.E(i2);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (O("onUserLeaveHint")) {
            this.f3001f.F();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (O("onWindowFocusChanged")) {
            this.f3001f.G(z2);
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public String p() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean q() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : p() == null;
    }

    @Override // io.flutter.embedding.android.f.c
    public String r() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle K = K();
            String string = K != null ? K.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public void s(io.flutter.embedding.engine.a aVar) {
    }

    @Override // io.flutter.embedding.android.f.c
    public String t() {
        try {
            Bundle K = K();
            if (K != null) {
                return K.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public io.flutter.plugin.platform.g u(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new io.flutter.plugin.platform.g(d(), aVar.o(), this);
    }

    @Override // io.flutter.embedding.android.f.c
    public void v(l lVar) {
    }

    @Override // io.flutter.embedding.android.f.c
    public String w() {
        String dataString;
        if (L() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean x() {
        try {
            Bundle K = K();
            if (K != null) {
                return K.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public io.flutter.embedding.engine.g y() {
        return io.flutter.embedding.engine.g.a(getIntent());
    }

    @Override // io.flutter.embedding.android.f.c
    public d0 z() {
        return I() == g.opaque ? d0.surface : d0.texture;
    }
}
