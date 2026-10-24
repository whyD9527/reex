package g;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: e, reason: collision with root package name */
    private Object f2791e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2792f;

    public interface a {
        boolean a(b bVar, Menu menu);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, MenuItem menuItem);

        void d(b bVar);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f2791e;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f2792f;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i2);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f2791e = obj;
    }

    public abstract void q(int i2);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z2) {
        this.f2792f = z2;
    }
}
