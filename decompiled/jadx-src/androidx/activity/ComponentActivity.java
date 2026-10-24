package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.g;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
public class ComponentActivity extends g implements t, androidx.savedstate.b, c {

    /* renamed from: i, reason: collision with root package name */
    private s f141i;

    /* renamed from: k, reason: collision with root package name */
    private int f143k;

    /* renamed from: g, reason: collision with root package name */
    private final h f139g = new h(this);

    /* renamed from: h, reason: collision with root package name */
    private final androidx.savedstate.a f140h = androidx.savedstate.a.a(this);

    /* renamed from: j, reason: collision with root package name */
    private final OnBackPressedDispatcher f142j = new OnBackPressedDispatcher(new a());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        Object f147a;

        /* renamed from: b, reason: collision with root package name */
        s f148b;

        b() {
        }
    }

    public ComponentActivity() {
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i2 = Build.VERSION.SDK_INT;
        a().a(new e() { // from class: androidx.activity.ComponentActivity.2
            @Override // androidx.lifecycle.e
            public void d(androidx.lifecycle.g gVar, d.b bVar) {
                if (bVar == d.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        a().a(new e() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.e
            public void d(androidx.lifecycle.g gVar, d.b bVar) {
                if (bVar != d.b.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.f().a();
            }
        });
        if (i2 <= 23) {
            a().a(new ImmLeaksCleaner(this));
        }
    }

    @Override // androidx.lifecycle.g
    public d a() {
        return this.f139g;
    }

    @Override // androidx.lifecycle.t
    public s f() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f141i == null) {
            b bVar = (b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this.f141i = bVar.f148b;
            }
            if (this.f141i == null) {
                this.f141i = new s();
            }
        }
        return this.f141i;
    }

    @Deprecated
    public Object i() {
        return null;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher j() {
        return this.f142j;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry k() {
        return this.f140h.b();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f142j.c();
    }

    @Override // androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f140h.c(bundle);
        o.f(this);
        int i2 = this.f143k;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object i2 = i();
        s sVar = this.f141i;
        if (sVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            sVar = bVar.f148b;
        }
        if (sVar == null && i2 == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f147a = i2;
        bVar2.f148b = sVar;
        return bVar2;
    }

    @Override // androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        d a3 = a();
        if (a3 instanceof h) {
            ((h) a3).o(d.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f140h.d(bundle);
    }
}
