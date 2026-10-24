package c;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.o1;
import androidx.core.app.l0;
import g.b;

/* loaded from: classes.dex */
public class b extends androidx.fragment.app.c implements c, l0.a {

    /* renamed from: u, reason: collision with root package name */
    private d f2393u;

    /* renamed from: v, reason: collision with root package name */
    private Resources f2394v;

    private boolean B(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public boolean A() {
        Intent d3 = d();
        if (d3 == null) {
            return false;
        }
        if (!D(d3)) {
            C(d3);
            return true;
        }
        l0 d4 = l0.d(this);
        w(d4);
        y(d4);
        d4.e();
        try {
            androidx.core.app.b.n(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void C(Intent intent) {
        androidx.core.app.h.e(this, intent);
    }

    public boolean D(Intent intent) {
        return androidx.core.app.h.f(this, intent);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(u().f(context));
    }

    @Override // c.c
    public void b(g.b bVar) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a v2 = v();
        if (getWindow().hasFeature(0)) {
            if (v2 == null || !v2.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.l0.a
    public Intent d() {
        return androidx.core.app.h.a(this);
    }

    @Override // androidx.core.app.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a v2 = v();
        if (keyCode == 82 && v2 != null && v2.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // c.c
    public g.b e(b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) u().i(i2);
    }

    @Override // c.c
    public void g(g.b bVar) {
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return u().l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f2394v == null && o1.b()) {
            this.f2394v = new o1(this, super.getResources());
        }
        Resources resources = this.f2394v;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        u().o();
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2394v != null) {
            this.f2394v.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        u().p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        z();
    }

    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        d u2 = u();
        u2.n();
        u2.q(bundle);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        u().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (B(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a v2 = v();
        if (menuItem.getItemId() != 16908332 || v2 == null || (v2.i() & 4) == 0) {
            return false;
        }
        return A();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        u().s(bundle);
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        u().t();
    }

    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        u().u(bundle);
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    protected void onStart() {
        super.onStart();
        u().v();
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    protected void onStop() {
        super.onStop();
        u().w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        u().E(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a v2 = v();
        if (getWindow().hasFeature(0)) {
            if (v2 == null || !v2.p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        u().A(i2);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        u().B(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        u().C(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        u().D(i2);
    }

    @Override // androidx.fragment.app.c
    public void t() {
        u().o();
    }

    public d u() {
        if (this.f2393u == null) {
            this.f2393u = d.g(this, this);
        }
        return this.f2393u;
    }

    public a v() {
        return u().m();
    }

    public void w(l0 l0Var) {
        l0Var.b(this);
    }

    protected void x(int i2) {
    }

    public void y(l0 l0Var) {
    }

    @Deprecated
    public void z() {
    }
}
