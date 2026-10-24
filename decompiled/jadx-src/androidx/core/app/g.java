package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.f;
import androidx.lifecycle.d;

/* loaded from: classes.dex */
public class g extends Activity implements androidx.lifecycle.g, f.a {

    /* renamed from: e, reason: collision with root package name */
    private l.g<Class<Object>, Object> f1284e = new l.g<>();

    /* renamed from: f, reason: collision with root package name */
    private androidx.lifecycle.h f1285f = new androidx.lifecycle.h(this);

    @Override // androidx.core.view.f.a
    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.f.d(decorView, keyEvent)) {
            return androidx.core.view.f.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.f.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.o.f(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f1285f.j(d.c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
