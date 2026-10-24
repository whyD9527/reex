package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.b;
import androidx.lifecycle.d;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class c extends ComponentActivity {

    /* renamed from: n, reason: collision with root package name */
    boolean f1762n;

    /* renamed from: o, reason: collision with root package name */
    boolean f1763o;

    /* renamed from: q, reason: collision with root package name */
    boolean f1765q;

    /* renamed from: r, reason: collision with root package name */
    boolean f1766r;

    /* renamed from: s, reason: collision with root package name */
    int f1767s;

    /* renamed from: t, reason: collision with root package name */
    l.h<String> f1768t;

    /* renamed from: l, reason: collision with root package name */
    final e f1760l = e.b(new a());

    /* renamed from: m, reason: collision with root package name */
    final androidx.lifecycle.h f1761m = new androidx.lifecycle.h(this);

    /* renamed from: p, reason: collision with root package name */
    boolean f1764p = true;

    class a extends g<c> implements t, androidx.activity.c {
        public a() {
            super(c.this);
        }

        @Override // androidx.lifecycle.g
        public androidx.lifecycle.d a() {
            return c.this.f1761m;
        }

        @Override // androidx.fragment.app.g, androidx.fragment.app.d
        public View c(int i2) {
            return c.this.findViewById(i2);
        }

        @Override // androidx.fragment.app.g, androidx.fragment.app.d
        public boolean d() {
            Window window = c.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.t
        public s f() {
            return c.this.f();
        }

        @Override // androidx.fragment.app.g
        public void i(Fragment fragment) {
            c.this.q(fragment);
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher j() {
            return c.this.j();
        }

        @Override // androidx.fragment.app.g
        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            c.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.g
        public LayoutInflater n() {
            return c.this.getLayoutInflater().cloneInContext(c.this);
        }

        @Override // androidx.fragment.app.g
        public int o() {
            Window window = c.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.g
        public boolean p() {
            return c.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.g
        public boolean q(Fragment fragment) {
            return !c.this.isFinishing();
        }

        @Override // androidx.fragment.app.g
        public void r() {
            c.this.t();
        }

        @Override // androidx.fragment.app.g
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public c m() {
            return c.this;
        }
    }

    static void l(int i2) {
        if ((i2 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void o() {
        while (p(n(), d.c.CREATED)) {
        }
    }

    private static boolean p(h hVar, d.c cVar) {
        boolean z2 = false;
        for (Fragment fragment : hVar.c()) {
            if (fragment != null) {
                if (fragment.a().b().a(d.c.STARTED)) {
                    fragment.W.o(cVar);
                    z2 = true;
                }
                if (fragment.u() != null) {
                    z2 |= p(fragment.n(), cVar);
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1762n);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1763o);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1764p);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1760l.u().a(str, fileDescriptor, printWriter, strArr);
    }

    final View m(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1760l.w(view, str, context, attributeSet);
    }

    public h n() {
        return this.f1760l.u();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        this.f1760l.v();
        int i4 = i2 >> 16;
        if (i4 == 0) {
            b.InterfaceC0017b o2 = androidx.core.app.b.o();
            if (o2 == null || !o2.a(this, i2, i3, intent)) {
                super.onActivityResult(i2, i3, intent);
                return;
            }
            return;
        }
        int i5 = i4 - 1;
        String e3 = this.f1768t.e(i5);
        this.f1768t.i(i5);
        if (e3 == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment t2 = this.f1760l.t(e3);
        if (t2 != null) {
            t2.S(i2 & 65535, i3, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + e3);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1760l.v();
        this.f1760l.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f1760l.a(null);
        if (bundle != null) {
            this.f1760l.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f1767s = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f1768t = new l.h<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.f1768t.h(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.f1768t == null) {
            this.f1768t = new l.h<>();
            this.f1767s = 0;
        }
        super.onCreate(bundle);
        this.f1761m.h(d.b.ON_CREATE);
        this.f1760l.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.f1760l.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m2 = m(view, str, context, attributeSet);
        return m2 == null ? super.onCreateView(view, str, context, attributeSet) : m2;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m2 = m(null, str, context, attributeSet);
        return m2 == null ? super.onCreateView(str, context, attributeSet) : m2;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f1760l.h();
        this.f1761m.h(d.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f1760l.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f1760l.k(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f1760l.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2) {
        this.f1760l.j(z2);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f1760l.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f1760l.l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f1763o = false;
        this.f1760l.m();
        this.f1761m.h(d.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2) {
        this.f1760l.n(z2);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        s();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 == 0 ? r(view, menu) | this.f1760l.o(menu) : super.onPreparePanel(i2, view, menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f1760l.v();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String e3 = this.f1768t.e(i4);
            this.f1768t.i(i4);
            if (e3 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t2 = this.f1760l.t(e3);
            if (t2 != null) {
                t2.r0(i2 & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + e3);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f1763o = true;
        this.f1760l.v();
        this.f1760l.s();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        o();
        this.f1761m.h(d.b.ON_STOP);
        Parcelable y2 = this.f1760l.y();
        if (y2 != null) {
            bundle.putParcelable("android:support:fragments", y2);
        }
        if (this.f1768t.j() > 0) {
            bundle.putInt("android:support:next_request_index", this.f1767s);
            int[] iArr = new int[this.f1768t.j()];
            String[] strArr = new String[this.f1768t.j()];
            for (int i2 = 0; i2 < this.f1768t.j(); i2++) {
                iArr[i2] = this.f1768t.g(i2);
                strArr[i2] = this.f1768t.k(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f1764p = false;
        if (!this.f1762n) {
            this.f1762n = true;
            this.f1760l.c();
        }
        this.f1760l.v();
        this.f1760l.s();
        this.f1761m.h(d.b.ON_START);
        this.f1760l.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f1760l.v();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f1764p = true;
        o();
        this.f1760l.r();
        this.f1761m.h(d.b.ON_STOP);
    }

    public void q(Fragment fragment) {
    }

    @Deprecated
    protected boolean r(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void s() {
        this.f1761m.h(d.b.ON_RESUME);
        this.f1760l.p();
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        if (!this.f1766r && i2 != -1) {
            l(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (!this.f1766r && i2 != -1) {
            l(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (!this.f1765q && i2 != -1) {
            l(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (!this.f1765q && i2 != -1) {
            l(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Deprecated
    public void t() {
        invalidateOptionsMenu();
    }
}
