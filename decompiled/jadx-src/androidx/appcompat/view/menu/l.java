package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.x0;
import androidx.core.view.f0;

/* loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: z, reason: collision with root package name */
    private static final int f396z = b.g.f2261m;

    /* renamed from: f, reason: collision with root package name */
    private final Context f397f;

    /* renamed from: g, reason: collision with root package name */
    private final e f398g;

    /* renamed from: h, reason: collision with root package name */
    private final d f399h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f400i;

    /* renamed from: j, reason: collision with root package name */
    private final int f401j;

    /* renamed from: k, reason: collision with root package name */
    private final int f402k;

    /* renamed from: l, reason: collision with root package name */
    private final int f403l;

    /* renamed from: m, reason: collision with root package name */
    final x0 f404m;

    /* renamed from: p, reason: collision with root package name */
    private PopupWindow.OnDismissListener f407p;

    /* renamed from: q, reason: collision with root package name */
    private View f408q;

    /* renamed from: r, reason: collision with root package name */
    View f409r;

    /* renamed from: s, reason: collision with root package name */
    private j.a f410s;

    /* renamed from: t, reason: collision with root package name */
    ViewTreeObserver f411t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f412u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f413v;

    /* renamed from: w, reason: collision with root package name */
    private int f414w;

    /* renamed from: y, reason: collision with root package name */
    private boolean f416y;

    /* renamed from: n, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f405n = new a();

    /* renamed from: o, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f406o = new b();

    /* renamed from: x, reason: collision with root package name */
    private int f415x = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.c() || l.this.f404m.x()) {
                return;
            }
            View view = l.this.f409r;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f404m.a();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f411t;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f411t = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f411t.removeGlobalOnLayoutListener(lVar.f405n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i2, int i3, boolean z2) {
        this.f397f = context;
        this.f398g = eVar;
        this.f400i = z2;
        this.f399h = new d(eVar, LayoutInflater.from(context), z2, f396z);
        this.f402k = i2;
        this.f403l = i3;
        Resources resources = context.getResources();
        this.f401j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b.d.f2188d));
        this.f408q = view;
        this.f404m = new x0(context, null, i2, i3);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (c()) {
            return true;
        }
        if (this.f412u || (view = this.f408q) == null) {
            return false;
        }
        this.f409r = view;
        this.f404m.G(this);
        this.f404m.H(this);
        this.f404m.F(true);
        View view2 = this.f409r;
        boolean z2 = this.f411t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f411t = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f405n);
        }
        view2.addOnAttachStateChangeListener(this.f406o);
        this.f404m.z(view2);
        this.f404m.C(this.f415x);
        if (!this.f413v) {
            this.f414w = h.o(this.f399h, null, this.f397f, this.f401j);
            this.f413v = true;
        }
        this.f404m.B(this.f414w);
        this.f404m.E(2);
        this.f404m.D(n());
        this.f404m.a();
        ListView g2 = this.f404m.g();
        g2.setOnKeyListener(this);
        if (this.f416y && this.f398g.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f397f).inflate(b.g.f2260l, (ViewGroup) g2, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f398g.x());
            }
            frameLayout.setEnabled(false);
            g2.addHeaderView(frameLayout, null, false);
        }
        this.f404m.p(this.f399h);
        this.f404m.a();
        return true;
    }

    @Override // h.e
    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z2) {
        if (eVar != this.f398g) {
            return;
        }
        dismiss();
        j.a aVar = this.f410s;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    @Override // h.e
    public boolean c() {
        return !this.f412u && this.f404m.c();
    }

    @Override // h.e
    public void dismiss() {
        if (c()) {
            this.f404m.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f397f, mVar, this.f409r, this.f400i, this.f402k, this.f403l);
            iVar.j(this.f410s);
            iVar.g(h.x(mVar));
            iVar.i(this.f407p);
            this.f407p = null;
            this.f398g.e(false);
            int d3 = this.f404m.d();
            int n2 = this.f404m.n();
            if ((Gravity.getAbsoluteGravity(this.f415x, f0.n(this.f408q)) & 7) == 5) {
                d3 += this.f408q.getWidth();
            }
            if (iVar.n(d3, n2)) {
                j.a aVar = this.f410s;
                if (aVar == null) {
                    return true;
                }
                aVar.c(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z2) {
        this.f413v = false;
        d dVar = this.f399h;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // h.e
    public ListView g() {
        return this.f404m.g();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.f410s = aVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f412u = true;
        this.f398g.close();
        ViewTreeObserver viewTreeObserver = this.f411t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f411t = this.f409r.getViewTreeObserver();
            }
            this.f411t.removeGlobalOnLayoutListener(this.f405n);
            this.f411t = null;
        }
        this.f409r.removeOnAttachStateChangeListener(this.f406o);
        PopupWindow.OnDismissListener onDismissListener = this.f407p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        this.f408q = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z2) {
        this.f399h.d(z2);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i2) {
        this.f415x = i2;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i2) {
        this.f404m.l(i2);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f407p = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z2) {
        this.f416y = z2;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i2) {
        this.f404m.j(i2);
    }
}
