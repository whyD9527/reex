package g;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import g.b;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: g, reason: collision with root package name */
    private Context f2798g;

    /* renamed from: h, reason: collision with root package name */
    private ActionBarContextView f2799h;

    /* renamed from: i, reason: collision with root package name */
    private b.a f2800i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<View> f2801j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2802k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2803l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f2804m;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z2) {
        this.f2798g = context;
        this.f2799h = actionBarContextView;
        this.f2800i = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f2804m = S;
        S.R(this);
        this.f2803l = z2;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f2800i.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f2799h.l();
    }

    @Override // g.b
    public void c() {
        if (this.f2802k) {
            return;
        }
        this.f2802k = true;
        this.f2799h.sendAccessibilityEvent(32);
        this.f2800i.d(this);
    }

    @Override // g.b
    public View d() {
        WeakReference<View> weakReference = this.f2801j;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // g.b
    public Menu e() {
        return this.f2804m;
    }

    @Override // g.b
    public MenuInflater f() {
        return new g(this.f2799h.getContext());
    }

    @Override // g.b
    public CharSequence g() {
        return this.f2799h.getSubtitle();
    }

    @Override // g.b
    public CharSequence i() {
        return this.f2799h.getTitle();
    }

    @Override // g.b
    public void k() {
        this.f2800i.a(this, this.f2804m);
    }

    @Override // g.b
    public boolean l() {
        return this.f2799h.j();
    }

    @Override // g.b
    public void m(View view) {
        this.f2799h.setCustomView(view);
        this.f2801j = view != null ? new WeakReference<>(view) : null;
    }

    @Override // g.b
    public void n(int i2) {
        o(this.f2798g.getString(i2));
    }

    @Override // g.b
    public void o(CharSequence charSequence) {
        this.f2799h.setSubtitle(charSequence);
    }

    @Override // g.b
    public void q(int i2) {
        r(this.f2798g.getString(i2));
    }

    @Override // g.b
    public void r(CharSequence charSequence) {
        this.f2799h.setTitle(charSequence);
    }

    @Override // g.b
    public void s(boolean z2) {
        super.s(z2);
        this.f2799h.setTitleOptional(z2);
    }
}
