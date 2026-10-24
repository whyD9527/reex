package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public class j1 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f750a;

    /* renamed from: b, reason: collision with root package name */
    private int f751b;

    /* renamed from: c, reason: collision with root package name */
    private View f752c;

    /* renamed from: d, reason: collision with root package name */
    private View f753d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f754e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f755f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f756g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f757h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f758i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f759j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f760k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f761l;

    /* renamed from: m, reason: collision with root package name */
    boolean f762m;

    /* renamed from: n, reason: collision with root package name */
    private c f763n;

    /* renamed from: o, reason: collision with root package name */
    private int f764o;

    /* renamed from: p, reason: collision with root package name */
    private int f765p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f766q;

    class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        final h.a f767e;

        a() {
            this.f767e = new h.a(j1.this.f750a.getContext(), 0, R.id.home, 0, 0, j1.this.f758i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j1 j1Var = j1.this;
            Window.Callback callback = j1Var.f761l;
            if (callback == null || !j1Var.f762m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f767e);
        }
    }

    class b extends androidx.core.view.e1 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f769a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f770b;

        b(int i2) {
            this.f770b = i2;
        }

        @Override // androidx.core.view.e1, androidx.core.view.d1
        public void a(View view) {
            this.f769a = true;
        }

        @Override // androidx.core.view.d1
        public void b(View view) {
            if (this.f769a) {
                return;
            }
            j1.this.f750a.setVisibility(this.f770b);
        }

        @Override // androidx.core.view.e1, androidx.core.view.d1
        public void c(View view) {
            j1.this.f750a.setVisibility(0);
        }
    }

    public j1(Toolbar toolbar, boolean z2) {
        this(toolbar, z2, b.h.f2269a, b.e.f2210n);
    }

    public j1(Toolbar toolbar, boolean z2, int i2, int i3) {
        Drawable drawable;
        this.f764o = 0;
        this.f765p = 0;
        this.f750a = toolbar;
        this.f758i = toolbar.getTitle();
        this.f759j = toolbar.getSubtitle();
        this.f757h = this.f758i != null;
        this.f756g = toolbar.getNavigationIcon();
        i1 u2 = i1.u(toolbar.getContext(), null, b.j.f2285a, b.a.f2152c, 0);
        this.f766q = u2.f(b.j.f2323l);
        if (z2) {
            CharSequence o2 = u2.o(b.j.f2341r);
            if (!TextUtils.isEmpty(o2)) {
                D(o2);
            }
            CharSequence o3 = u2.o(b.j.f2335p);
            if (!TextUtils.isEmpty(o3)) {
                C(o3);
            }
            Drawable f2 = u2.f(b.j.f2329n);
            if (f2 != null) {
                y(f2);
            }
            Drawable f3 = u2.f(b.j.f2326m);
            if (f3 != null) {
                setIcon(f3);
            }
            if (this.f756g == null && (drawable = this.f766q) != null) {
                B(drawable);
            }
            n(u2.j(b.j.f2311h, 0));
            int m2 = u2.m(b.j.f2308g, 0);
            if (m2 != 0) {
                w(LayoutInflater.from(this.f750a.getContext()).inflate(m2, (ViewGroup) this.f750a, false));
                n(this.f751b | 16);
            }
            int l2 = u2.l(b.j.f2317j, 0);
            if (l2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f750a.getLayoutParams();
                layoutParams.height = l2;
                this.f750a.setLayoutParams(layoutParams);
            }
            int d3 = u2.d(b.j.f2305f, -1);
            int d4 = u2.d(b.j.f2301e, -1);
            if (d3 >= 0 || d4 >= 0) {
                this.f750a.H(Math.max(d3, 0), Math.max(d4, 0));
            }
            int m3 = u2.m(b.j.f2344s, 0);
            if (m3 != 0) {
                Toolbar toolbar2 = this.f750a;
                toolbar2.K(toolbar2.getContext(), m3);
            }
            int m4 = u2.m(b.j.f2338q, 0);
            if (m4 != 0) {
                Toolbar toolbar3 = this.f750a;
                toolbar3.J(toolbar3.getContext(), m4);
            }
            int m5 = u2.m(b.j.f2332o, 0);
            if (m5 != 0) {
                this.f750a.setPopupTheme(m5);
            }
        } else {
            this.f751b = v();
        }
        u2.v();
        x(i2);
        this.f760k = this.f750a.getNavigationContentDescription();
        this.f750a.setNavigationOnClickListener(new a());
    }

    private void E(CharSequence charSequence) {
        this.f758i = charSequence;
        if ((this.f751b & 8) != 0) {
            this.f750a.setTitle(charSequence);
        }
    }

    private void F() {
        if ((this.f751b & 4) != 0) {
            if (TextUtils.isEmpty(this.f760k)) {
                this.f750a.setNavigationContentDescription(this.f765p);
            } else {
                this.f750a.setNavigationContentDescription(this.f760k);
            }
        }
    }

    private void G() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f751b & 4) != 0) {
            toolbar = this.f750a;
            drawable = this.f756g;
            if (drawable == null) {
                drawable = this.f766q;
            }
        } else {
            toolbar = this.f750a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void H() {
        Drawable drawable;
        int i2 = this.f751b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f755f) == null) {
            drawable = this.f754e;
        }
        this.f750a.setLogo(drawable);
    }

    private int v() {
        if (this.f750a.getNavigationIcon() == null) {
            return 11;
        }
        this.f766q = this.f750a.getNavigationIcon();
        return 15;
    }

    public void A(CharSequence charSequence) {
        this.f760k = charSequence;
        F();
    }

    public void B(Drawable drawable) {
        this.f756g = drawable;
        G();
    }

    public void C(CharSequence charSequence) {
        this.f759j = charSequence;
        if ((this.f751b & 8) != 0) {
            this.f750a.setSubtitle(charSequence);
        }
    }

    public void D(CharSequence charSequence) {
        this.f757h = true;
        E(charSequence);
    }

    @Override // androidx.appcompat.widget.l0
    public void a(Menu menu, j.a aVar) {
        if (this.f763n == null) {
            c cVar = new c(this.f750a.getContext());
            this.f763n = cVar;
            cVar.p(b.f.f2229g);
        }
        this.f763n.k(aVar);
        this.f750a.I((androidx.appcompat.view.menu.e) menu, this.f763n);
    }

    @Override // androidx.appcompat.widget.l0
    public boolean b() {
        return this.f750a.A();
    }

    @Override // androidx.appcompat.widget.l0
    public void c() {
        this.f762m = true;
    }

    @Override // androidx.appcompat.widget.l0
    public void collapseActionView() {
        this.f750a.e();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean d() {
        return this.f750a.z();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean e() {
        return this.f750a.w();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean f() {
        return this.f750a.N();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean g() {
        return this.f750a.d();
    }

    @Override // androidx.appcompat.widget.l0
    public Context getContext() {
        return this.f750a.getContext();
    }

    @Override // androidx.appcompat.widget.l0
    public CharSequence getTitle() {
        return this.f750a.getTitle();
    }

    @Override // androidx.appcompat.widget.l0
    public void h() {
        this.f750a.f();
    }

    @Override // androidx.appcompat.widget.l0
    public void i(int i2) {
        this.f750a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.l0
    public void j(b1 b1Var) {
        View view = this.f752c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f750a;
            if (parent == toolbar) {
                toolbar.removeView(this.f752c);
            }
        }
        this.f752c = b1Var;
        if (b1Var == null || this.f764o != 2) {
            return;
        }
        this.f750a.addView(b1Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f752c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f2392a = 8388691;
        b1Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.l0
    public ViewGroup k() {
        return this.f750a;
    }

    @Override // androidx.appcompat.widget.l0
    public void l(boolean z2) {
    }

    @Override // androidx.appcompat.widget.l0
    public boolean m() {
        return this.f750a.v();
    }

    @Override // androidx.appcompat.widget.l0
    public void n(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.f751b ^ i2;
        this.f751b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    F();
                }
                G();
            }
            if ((i3 & 3) != 0) {
                H();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f750a.setTitle(this.f758i);
                    toolbar = this.f750a;
                    charSequence = this.f759j;
                } else {
                    charSequence = null;
                    this.f750a.setTitle((CharSequence) null);
                    toolbar = this.f750a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) == 0 || (view = this.f753d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.f750a.addView(view);
            } else {
                this.f750a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.l0
    public int o() {
        return this.f751b;
    }

    @Override // androidx.appcompat.widget.l0
    public void p(int i2) {
        y(i2 != 0 ? d.a.b(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.l0
    public int q() {
        return this.f764o;
    }

    @Override // androidx.appcompat.widget.l0
    public androidx.core.view.c1 r(int i2, long j2) {
        return androidx.core.view.f0.b(this.f750a).b(i2 == 0 ? 1.0f : 0.0f).f(j2).h(new b(i2));
    }

    @Override // androidx.appcompat.widget.l0
    public void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.l0
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? d.a.b(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.l0
    public void setIcon(Drawable drawable) {
        this.f754e = drawable;
        H();
    }

    @Override // androidx.appcompat.widget.l0
    public void setWindowCallback(Window.Callback callback) {
        this.f761l = callback;
    }

    @Override // androidx.appcompat.widget.l0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f757h) {
            return;
        }
        E(charSequence);
    }

    @Override // androidx.appcompat.widget.l0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.l0
    public void u(boolean z2) {
        this.f750a.setCollapsible(z2);
    }

    public void w(View view) {
        View view2 = this.f753d;
        if (view2 != null && (this.f751b & 16) != 0) {
            this.f750a.removeView(view2);
        }
        this.f753d = view;
        if (view == null || (this.f751b & 16) == 0) {
            return;
        }
        this.f750a.addView(view);
    }

    public void x(int i2) {
        if (i2 == this.f765p) {
            return;
        }
        this.f765p = i2;
        if (TextUtils.isEmpty(this.f750a.getNavigationContentDescription())) {
            z(this.f765p);
        }
    }

    public void y(Drawable drawable) {
        this.f755f = drawable;
        H();
    }

    public void z(int i2) {
        A(i2 == 0 ? null : getContext().getString(i2));
    }
}
