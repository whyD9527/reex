package c;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.l0;
import androidx.core.view.c1;
import androidx.core.view.d1;
import androidx.core.view.e1;
import androidx.core.view.f0;
import androidx.core.view.f1;
import c.a;
import g.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class m extends c.a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;

    /* renamed from: a, reason: collision with root package name */
    Context f2499a;

    /* renamed from: b, reason: collision with root package name */
    private Context f2500b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f2501c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f2502d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f2503e;

    /* renamed from: f, reason: collision with root package name */
    l0 f2504f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f2505g;

    /* renamed from: h, reason: collision with root package name */
    View f2506h;

    /* renamed from: i, reason: collision with root package name */
    b1 f2507i;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2510l;

    /* renamed from: m, reason: collision with root package name */
    d f2511m;

    /* renamed from: n, reason: collision with root package name */
    g.b f2512n;

    /* renamed from: o, reason: collision with root package name */
    b.a f2513o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f2514p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2516r;

    /* renamed from: u, reason: collision with root package name */
    boolean f2519u;

    /* renamed from: v, reason: collision with root package name */
    boolean f2520v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f2521w;

    /* renamed from: y, reason: collision with root package name */
    g.h f2523y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f2524z;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<Object> f2508j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private int f2509k = -1;

    /* renamed from: q, reason: collision with root package name */
    private ArrayList<a.b> f2515q = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    private int f2517s = 0;

    /* renamed from: t, reason: collision with root package name */
    boolean f2518t = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f2522x = true;
    final d1 B = new a();
    final d1 C = new b();
    final f1 D = new c();

    class a extends e1 {
        a() {
        }

        @Override // androidx.core.view.d1
        public void b(View view) {
            View view2;
            m mVar = m.this;
            if (mVar.f2518t && (view2 = mVar.f2506h) != null) {
                view2.setTranslationY(0.0f);
                m.this.f2503e.setTranslationY(0.0f);
            }
            m.this.f2503e.setVisibility(8);
            m.this.f2503e.setTransitioning(false);
            m mVar2 = m.this;
            mVar2.f2523y = null;
            mVar2.w();
            ActionBarOverlayLayout actionBarOverlayLayout = m.this.f2502d;
            if (actionBarOverlayLayout != null) {
                f0.E(actionBarOverlayLayout);
            }
        }
    }

    class b extends e1 {
        b() {
        }

        @Override // androidx.core.view.d1
        public void b(View view) {
            m mVar = m.this;
            mVar.f2523y = null;
            mVar.f2503e.requestLayout();
        }
    }

    class c implements f1 {
        c() {
        }

        @Override // androidx.core.view.f1
        public void a(View view) {
            ((View) m.this.f2503e.getParent()).invalidate();
        }
    }

    public class d extends g.b implements e.a {

        /* renamed from: g, reason: collision with root package name */
        private final Context f2528g;

        /* renamed from: h, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f2529h;

        /* renamed from: i, reason: collision with root package name */
        private b.a f2530i;

        /* renamed from: j, reason: collision with root package name */
        private WeakReference<View> f2531j;

        public d(Context context, b.a aVar) {
            this.f2528g = context;
            this.f2530i = aVar;
            androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(context).S(1);
            this.f2529h = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f2530i;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f2530i == null) {
                return;
            }
            k();
            m.this.f2505g.l();
        }

        @Override // g.b
        public void c() {
            m mVar = m.this;
            if (mVar.f2511m != this) {
                return;
            }
            if (m.v(mVar.f2519u, mVar.f2520v, false)) {
                this.f2530i.d(this);
            } else {
                m mVar2 = m.this;
                mVar2.f2512n = this;
                mVar2.f2513o = this.f2530i;
            }
            this.f2530i = null;
            m.this.u(false);
            m.this.f2505g.g();
            m.this.f2504f.k().sendAccessibilityEvent(32);
            m mVar3 = m.this;
            mVar3.f2502d.setHideOnContentScrollEnabled(mVar3.A);
            m.this.f2511m = null;
        }

        @Override // g.b
        public View d() {
            WeakReference<View> weakReference = this.f2531j;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // g.b
        public Menu e() {
            return this.f2529h;
        }

        @Override // g.b
        public MenuInflater f() {
            return new g.g(this.f2528g);
        }

        @Override // g.b
        public CharSequence g() {
            return m.this.f2505g.getSubtitle();
        }

        @Override // g.b
        public CharSequence i() {
            return m.this.f2505g.getTitle();
        }

        @Override // g.b
        public void k() {
            if (m.this.f2511m != this) {
                return;
            }
            this.f2529h.d0();
            try {
                this.f2530i.a(this, this.f2529h);
            } finally {
                this.f2529h.c0();
            }
        }

        @Override // g.b
        public boolean l() {
            return m.this.f2505g.j();
        }

        @Override // g.b
        public void m(View view) {
            m.this.f2505g.setCustomView(view);
            this.f2531j = new WeakReference<>(view);
        }

        @Override // g.b
        public void n(int i2) {
            o(m.this.f2499a.getResources().getString(i2));
        }

        @Override // g.b
        public void o(CharSequence charSequence) {
            m.this.f2505g.setSubtitle(charSequence);
        }

        @Override // g.b
        public void q(int i2) {
            r(m.this.f2499a.getResources().getString(i2));
        }

        @Override // g.b
        public void r(CharSequence charSequence) {
            m.this.f2505g.setTitle(charSequence);
        }

        @Override // g.b
        public void s(boolean z2) {
            super.s(z2);
            m.this.f2505g.setTitleOptional(z2);
        }

        public boolean t() {
            this.f2529h.d0();
            try {
                return this.f2530i.b(this, this.f2529h);
            } finally {
                this.f2529h.c0();
            }
        }
    }

    public m(Activity activity, boolean z2) {
        this.f2501c = activity;
        View decorView = activity.getWindow().getDecorView();
        C(decorView);
        if (z2) {
            return;
        }
        this.f2506h = decorView.findViewById(R.id.content);
    }

    public m(Dialog dialog) {
        C(dialog.getWindow().getDecorView());
    }

    private void B() {
        if (this.f2521w) {
            this.f2521w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2502d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            L(false);
        }
    }

    private void C(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(b.f.f2238p);
        this.f2502d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f2504f = z(view.findViewById(b.f.f2223a));
        this.f2505g = (ActionBarContextView) view.findViewById(b.f.f2228f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(b.f.f2225c);
        this.f2503e = actionBarContainer;
        l0 l0Var = this.f2504f;
        if (l0Var == null || this.f2505g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f2499a = l0Var.getContext();
        boolean z2 = (this.f2504f.o() & 4) != 0;
        if (z2) {
            this.f2510l = true;
        }
        g.a b3 = g.a.b(this.f2499a);
        I(b3.a() || z2);
        G(b3.g());
        TypedArray obtainStyledAttributes = this.f2499a.obtainStyledAttributes(null, b.j.f2285a, b.a.f2152c, 0);
        if (obtainStyledAttributes.getBoolean(b.j.f2320k, false)) {
            H(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b.j.f2314i, 0);
        if (dimensionPixelSize != 0) {
            F(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void G(boolean z2) {
        this.f2516r = z2;
        if (z2) {
            this.f2503e.setTabContainer(null);
            this.f2504f.j(this.f2507i);
        } else {
            this.f2504f.j(null);
            this.f2503e.setTabContainer(this.f2507i);
        }
        boolean z3 = A() == 2;
        b1 b1Var = this.f2507i;
        if (b1Var != null) {
            if (z3) {
                b1Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2502d;
                if (actionBarOverlayLayout != null) {
                    f0.E(actionBarOverlayLayout);
                }
            } else {
                b1Var.setVisibility(8);
            }
        }
        this.f2504f.u(!this.f2516r && z3);
        this.f2502d.setHasNonEmbeddedTabs(!this.f2516r && z3);
    }

    private boolean J() {
        return f0.w(this.f2503e);
    }

    private void K() {
        if (this.f2521w) {
            return;
        }
        this.f2521w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2502d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        L(false);
    }

    private void L(boolean z2) {
        if (v(this.f2519u, this.f2520v, this.f2521w)) {
            if (this.f2522x) {
                return;
            }
            this.f2522x = true;
            y(z2);
            return;
        }
        if (this.f2522x) {
            this.f2522x = false;
            x(z2);
        }
    }

    static boolean v(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return (z2 || z3) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l0 z(View view) {
        if (view instanceof l0) {
            return (l0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public int A() {
        return this.f2504f.q();
    }

    public void D(boolean z2) {
        E(z2 ? 4 : 0, 4);
    }

    public void E(int i2, int i3) {
        int o2 = this.f2504f.o();
        if ((i3 & 4) != 0) {
            this.f2510l = true;
        }
        this.f2504f.n((i2 & i3) | ((~i3) & o2));
    }

    public void F(float f2) {
        f0.L(this.f2503e, f2);
    }

    public void H(boolean z2) {
        if (z2 && !this.f2502d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z2;
        this.f2502d.setHideOnContentScrollEnabled(z2);
    }

    public void I(boolean z2) {
        this.f2504f.l(z2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f2520v) {
            this.f2520v = false;
            L(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        g.h hVar = this.f2523y;
        if (hVar != null) {
            hVar.a();
            this.f2523y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(boolean z2) {
        this.f2518t = z2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (this.f2520v) {
            return;
        }
        this.f2520v = true;
        L(true);
    }

    @Override // c.a
    public boolean g() {
        l0 l0Var = this.f2504f;
        if (l0Var == null || !l0Var.m()) {
            return false;
        }
        this.f2504f.collapseActionView();
        return true;
    }

    @Override // c.a
    public void h(boolean z2) {
        if (z2 == this.f2514p) {
            return;
        }
        this.f2514p = z2;
        int size = this.f2515q.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2515q.get(i2).onMenuVisibilityChanged(z2);
        }
    }

    @Override // c.a
    public int i() {
        return this.f2504f.o();
    }

    @Override // c.a
    public Context j() {
        if (this.f2500b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2499a.getTheme().resolveAttribute(b.a.f2156g, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f2500b = new ContextThemeWrapper(this.f2499a, i2);
            } else {
                this.f2500b = this.f2499a;
            }
        }
        return this.f2500b;
    }

    @Override // c.a
    public void l(Configuration configuration) {
        G(g.a.b(this.f2499a).g());
    }

    @Override // c.a
    public boolean n(int i2, KeyEvent keyEvent) {
        Menu e3;
        d dVar = this.f2511m;
        if (dVar == null || (e3 = dVar.e()) == null) {
            return false;
        }
        e3.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e3.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i2) {
        this.f2517s = i2;
    }

    @Override // c.a
    public void q(boolean z2) {
        if (this.f2510l) {
            return;
        }
        D(z2);
    }

    @Override // c.a
    public void r(boolean z2) {
        g.h hVar;
        this.f2524z = z2;
        if (z2 || (hVar = this.f2523y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // c.a
    public void s(CharSequence charSequence) {
        this.f2504f.setWindowTitle(charSequence);
    }

    @Override // c.a
    public g.b t(b.a aVar) {
        d dVar = this.f2511m;
        if (dVar != null) {
            dVar.c();
        }
        this.f2502d.setHideOnContentScrollEnabled(false);
        this.f2505g.k();
        d dVar2 = new d(this.f2505g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f2511m = dVar2;
        dVar2.k();
        this.f2505g.h(dVar2);
        u(true);
        this.f2505g.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void u(boolean z2) {
        c1 r2;
        c1 f2;
        if (z2) {
            K();
        } else {
            B();
        }
        if (!J()) {
            if (z2) {
                this.f2504f.i(4);
                this.f2505g.setVisibility(0);
                return;
            } else {
                this.f2504f.i(0);
                this.f2505g.setVisibility(8);
                return;
            }
        }
        if (z2) {
            f2 = this.f2504f.r(4, 100L);
            r2 = this.f2505g.f(0, 200L);
        } else {
            r2 = this.f2504f.r(0, 200L);
            f2 = this.f2505g.f(8, 100L);
        }
        g.h hVar = new g.h();
        hVar.d(f2, r2);
        hVar.h();
    }

    void w() {
        b.a aVar = this.f2513o;
        if (aVar != null) {
            aVar.d(this.f2512n);
            this.f2512n = null;
            this.f2513o = null;
        }
    }

    public void x(boolean z2) {
        View view;
        g.h hVar = this.f2523y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f2517s != 0 || (!this.f2524z && !z2)) {
            this.B.b(null);
            return;
        }
        this.f2503e.setAlpha(1.0f);
        this.f2503e.setTransitioning(true);
        g.h hVar2 = new g.h();
        float f2 = -this.f2503e.getHeight();
        if (z2) {
            this.f2503e.getLocationInWindow(new int[]{0, 0});
            f2 -= r5[1];
        }
        c1 m2 = f0.b(this.f2503e).m(f2);
        m2.k(this.D);
        hVar2.c(m2);
        if (this.f2518t && (view = this.f2506h) != null) {
            hVar2.c(f0.b(view).m(f2));
        }
        hVar2.f(E);
        hVar2.e(250L);
        hVar2.g(this.B);
        this.f2523y = hVar2;
        hVar2.h();
    }

    public void y(boolean z2) {
        View view;
        View view2;
        g.h hVar = this.f2523y;
        if (hVar != null) {
            hVar.a();
        }
        this.f2503e.setVisibility(0);
        if (this.f2517s == 0 && (this.f2524z || z2)) {
            this.f2503e.setTranslationY(0.0f);
            float f2 = -this.f2503e.getHeight();
            if (z2) {
                this.f2503e.getLocationInWindow(new int[]{0, 0});
                f2 -= r5[1];
            }
            this.f2503e.setTranslationY(f2);
            g.h hVar2 = new g.h();
            c1 m2 = f0.b(this.f2503e).m(0.0f);
            m2.k(this.D);
            hVar2.c(m2);
            if (this.f2518t && (view2 = this.f2506h) != null) {
                view2.setTranslationY(f2);
                hVar2.c(f0.b(this.f2506h).m(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f2523y = hVar2;
            hVar2.h();
        } else {
            this.f2503e.setAlpha(1.0f);
            this.f2503e.setTranslationY(0.0f);
            if (this.f2518t && (view = this.f2506h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2502d;
        if (actionBarOverlayLayout != null) {
            f0.E(actionBarOverlayLayout);
        }
    }
}
