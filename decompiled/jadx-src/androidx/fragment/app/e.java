package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.t;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final g<?> f1770a;

    private e(g<?> gVar) {
        this.f1770a = gVar;
    }

    public static e b(g<?> gVar) {
        return new e((g) androidx.core.util.e.c(gVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        g<?> gVar = this.f1770a;
        gVar.f1776i.k(gVar, gVar, fragment);
    }

    public void c() {
        this.f1770a.f1776i.t();
    }

    public void d(Configuration configuration) {
        this.f1770a.f1776i.u(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f1770a.f1776i.v(menuItem);
    }

    public void f() {
        this.f1770a.f1776i.w();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f1770a.f1776i.x(menu, menuInflater);
    }

    public void h() {
        this.f1770a.f1776i.y();
    }

    public void i() {
        this.f1770a.f1776i.A();
    }

    public void j(boolean z2) {
        this.f1770a.f1776i.B(z2);
    }

    public boolean k(MenuItem menuItem) {
        return this.f1770a.f1776i.Q(menuItem);
    }

    public void l(Menu menu) {
        this.f1770a.f1776i.R(menu);
    }

    public void m() {
        this.f1770a.f1776i.T();
    }

    public void n(boolean z2) {
        this.f1770a.f1776i.U(z2);
    }

    public boolean o(Menu menu) {
        return this.f1770a.f1776i.V(menu);
    }

    public void p() {
        this.f1770a.f1776i.X();
    }

    public void q() {
        this.f1770a.f1776i.Y();
    }

    public void r() {
        this.f1770a.f1776i.a0();
    }

    public boolean s() {
        return this.f1770a.f1776i.f0();
    }

    public Fragment t(String str) {
        return this.f1770a.f1776i.l0(str);
    }

    public h u() {
        return this.f1770a.f1776i;
    }

    public void v() {
        this.f1770a.f1776i.N0();
    }

    public View w(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1770a.f1776i.onCreateView(view, str, context, attributeSet);
    }

    public void x(Parcelable parcelable) {
        g<?> gVar = this.f1770a;
        if (!(gVar instanceof t)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        gVar.f1776i.X0(parcelable);
    }

    public Parcelable y() {
        return this.f1770a.f1776i.Z0();
    }
}
