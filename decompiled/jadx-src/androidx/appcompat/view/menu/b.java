package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.v0;
import androidx.appcompat.widget.x0;
import androidx.core.view.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int F = b.g.f2253e;
    private boolean A;
    private j.a B;
    ViewTreeObserver C;
    private PopupWindow.OnDismissListener D;
    boolean E;

    /* renamed from: f, reason: collision with root package name */
    private final Context f277f;

    /* renamed from: g, reason: collision with root package name */
    private final int f278g;

    /* renamed from: h, reason: collision with root package name */
    private final int f279h;

    /* renamed from: i, reason: collision with root package name */
    private final int f280i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f281j;

    /* renamed from: k, reason: collision with root package name */
    final Handler f282k;

    /* renamed from: s, reason: collision with root package name */
    private View f290s;

    /* renamed from: t, reason: collision with root package name */
    View f291t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f293v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f294w;

    /* renamed from: x, reason: collision with root package name */
    private int f295x;

    /* renamed from: y, reason: collision with root package name */
    private int f296y;

    /* renamed from: l, reason: collision with root package name */
    private final List<e> f283l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    final List<d> f284m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f285n = new a();

    /* renamed from: o, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f286o = new ViewOnAttachStateChangeListenerC0011b();

    /* renamed from: p, reason: collision with root package name */
    private final v0 f287p = new c();

    /* renamed from: q, reason: collision with root package name */
    private int f288q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f289r = 0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f297z = false;

    /* renamed from: u, reason: collision with root package name */
    private int f292u = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.c() || b.this.f284m.size() <= 0 || b.this.f284m.get(0).f305a.x()) {
                return;
            }
            View view = b.this.f291t;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f284m.iterator();
            while (it.hasNext()) {
                it.next().f305a.a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0011b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0011b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.C = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.C.removeGlobalOnLayoutListener(bVar.f285n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements v0 {

        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ d f301e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ MenuItem f302f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ e f303g;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f301e = dVar;
                this.f302f = menuItem;
                this.f303g = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f301e;
                if (dVar != null) {
                    b.this.E = true;
                    dVar.f306b.e(false);
                    b.this.E = false;
                }
                if (this.f302f.isEnabled() && this.f302f.hasSubMenu()) {
                    this.f303g.L(this.f302f, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.v0
        public void b(e eVar, MenuItem menuItem) {
            b.this.f282k.removeCallbacksAndMessages(null);
            int size = b.this.f284m.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (eVar == b.this.f284m.get(i2).f306b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            b.this.f282k.postAtTime(new a(i3 < b.this.f284m.size() ? b.this.f284m.get(i3) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.v0
        public void e(e eVar, MenuItem menuItem) {
            b.this.f282k.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final x0 f305a;

        /* renamed from: b, reason: collision with root package name */
        public final e f306b;

        /* renamed from: c, reason: collision with root package name */
        public final int f307c;

        public d(x0 x0Var, e eVar, int i2) {
            this.f305a = x0Var;
            this.f306b = eVar;
            this.f307c = i2;
        }

        public ListView a() {
            return this.f305a.g();
        }
    }

    public b(Context context, View view, int i2, int i3, boolean z2) {
        this.f277f = context;
        this.f290s = view;
        this.f279h = i2;
        this.f280i = i3;
        this.f281j = z2;
        Resources resources = context.getResources();
        this.f278g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b.d.f2188d));
        this.f282k = new Handler();
    }

    private int A(e eVar) {
        int size = this.f284m.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (eVar == this.f284m.get(i2).f306b) {
                return i2;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = eVar.getItem(i2);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i2;
        int firstVisiblePosition;
        MenuItem B = B(dVar.f306b, eVar);
        if (B == null) {
            return null;
        }
        ListView a3 = dVar.a();
        ListAdapter adapter = a3.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i2 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            }
            if (B == dVar2.getItem(i3)) {
                break;
            }
            i3++;
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - a3.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a3.getChildCount()) {
            return a3.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return f0.n(this.f290s) == 1 ? 0 : 1;
    }

    private int E(int i2) {
        List<d> list = this.f284m;
        ListView a3 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a3.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f291t.getWindowVisibleDisplayFrame(rect);
        return this.f292u == 1 ? (iArr[0] + a3.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View view;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.f277f);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f281j, F);
        if (!c() && this.f297z) {
            dVar2.d(true);
        } else if (c()) {
            dVar2.d(h.x(eVar));
        }
        int o2 = h.o(dVar2, null, this.f277f, this.f278g);
        x0 z2 = z();
        z2.p(dVar2);
        z2.B(o2);
        z2.C(this.f289r);
        if (this.f284m.size() > 0) {
            List<d> list = this.f284m;
            dVar = list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z2.Q(false);
            z2.N(null);
            int E = E(o2);
            boolean z3 = E == 1;
            this.f292u = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z2.z(view);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.f290s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f289r & 7) == 5) {
                    iArr[0] = iArr[0] + this.f290s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.f289r & 5) == 5) {
                if (!z3) {
                    o2 = view.getWidth();
                    i4 = i2 - o2;
                }
                i4 = i2 + o2;
            } else {
                if (z3) {
                    o2 = view.getWidth();
                    i4 = i2 + o2;
                }
                i4 = i2 - o2;
            }
            z2.l(i4);
            z2.I(true);
            z2.j(i3);
        } else {
            if (this.f293v) {
                z2.l(this.f295x);
            }
            if (this.f294w) {
                z2.j(this.f296y);
            }
            z2.D(n());
        }
        this.f284m.add(new d(z2, eVar, this.f292u));
        z2.a();
        ListView g2 = z2.g();
        g2.setOnKeyListener(this);
        if (dVar == null && this.A && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(b.g.f2260l, (ViewGroup) g2, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            g2.addHeaderView(frameLayout, null, false);
            z2.a();
        }
    }

    private x0 z() {
        x0 x0Var = new x0(this.f277f, null, this.f279h, this.f280i);
        x0Var.P(this.f287p);
        x0Var.H(this);
        x0Var.G(this);
        x0Var.z(this.f290s);
        x0Var.C(this.f289r);
        x0Var.F(true);
        x0Var.E(2);
        return x0Var;
    }

    @Override // h.e
    public void a() {
        if (c()) {
            return;
        }
        Iterator<e> it = this.f283l.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.f283l.clear();
        View view = this.f290s;
        this.f291t = view;
        if (view != null) {
            boolean z2 = this.C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.C = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f285n);
            }
            this.f291t.addOnAttachStateChangeListener(this.f286o);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z2) {
        int A = A(eVar);
        if (A < 0) {
            return;
        }
        int i2 = A + 1;
        if (i2 < this.f284m.size()) {
            this.f284m.get(i2).f306b.e(false);
        }
        d remove = this.f284m.remove(A);
        remove.f306b.O(this);
        if (this.E) {
            remove.f305a.O(null);
            remove.f305a.A(0);
        }
        remove.f305a.dismiss();
        int size = this.f284m.size();
        this.f292u = size > 0 ? this.f284m.get(size - 1).f307c : D();
        if (size != 0) {
            if (z2) {
                this.f284m.get(0).f306b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.B;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.C.removeGlobalOnLayoutListener(this.f285n);
            }
            this.C = null;
        }
        this.f291t.removeOnAttachStateChangeListener(this.f286o);
        this.D.onDismiss();
    }

    @Override // h.e
    public boolean c() {
        return this.f284m.size() > 0 && this.f284m.get(0).f305a.c();
    }

    @Override // h.e
    public void dismiss() {
        int size = this.f284m.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f284m.toArray(new d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d dVar = dVarArr[i2];
                if (dVar.f305a.c()) {
                    dVar.f305a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        for (d dVar : this.f284m) {
            if (mVar == dVar.f306b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.B;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z2) {
        Iterator<d> it = this.f284m.iterator();
        while (it.hasNext()) {
            h.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // h.e
    public ListView g() {
        if (this.f284m.isEmpty()) {
            return null;
        }
        return this.f284m.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.B = aVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f277f);
        if (c()) {
            F(eVar);
        } else {
            this.f283l.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f284m.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f284m.get(i2);
            if (!dVar.f305a.c()) {
                break;
            } else {
                i2++;
            }
        }
        if (dVar != null) {
            dVar.f306b.e(false);
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
        if (this.f290s != view) {
            this.f290s = view;
            this.f289r = androidx.core.view.e.a(this.f288q, f0.n(view));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z2) {
        this.f297z = z2;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i2) {
        if (this.f288q != i2) {
            this.f288q = i2;
            this.f289r = androidx.core.view.e.a(i2, f0.n(this.f290s));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i2) {
        this.f293v = true;
        this.f295x = i2;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z2) {
        this.A = z2;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i2) {
        this.f294w = true;
        this.f296y = i2;
    }
}
