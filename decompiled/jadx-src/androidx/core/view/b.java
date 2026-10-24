package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1548a;

    /* renamed from: b, reason: collision with root package name */
    private a f1549b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0026b f1550c;

    public interface a {
    }

    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0026b {
        void onActionProviderVisibilityChanged(boolean z2);
    }

    public b(Context context) {
        this.f1548a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f1550c = null;
        this.f1549b = null;
    }

    public void i(a aVar) {
        this.f1549b = aVar;
    }

    public void j(InterfaceC0026b interfaceC0026b) {
        if (this.f1550c != null && interfaceC0026b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f1550c = interfaceC0026b;
    }
}
