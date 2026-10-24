package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
class c extends androidx.appcompat.view.menu.a implements b.a {
    private int A;
    private final SparseBooleanArray B;
    e C;
    a D;
    RunnableC0013c E;
    private b F;
    final f G;
    int H;

    /* renamed from: o, reason: collision with root package name */
    d f624o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f625p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f626q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f627r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f628s;

    /* renamed from: t, reason: collision with root package name */
    private int f629t;

    /* renamed from: u, reason: collision with root package name */
    private int f630u;

    /* renamed from: v, reason: collision with root package name */
    private int f631v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f632w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f633x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f634y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f635z;

    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, b.a.f2161l);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f624o;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f275m : view2);
            }
            j(c.this.G);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.D = null;
            cVar.H = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public h.e a() {
            a aVar = c.this.D;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0013c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private e f638e;

        public RunnableC0013c(e eVar) {
            this.f638e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f269g != null) {
                ((androidx.appcompat.view.menu.a) c.this).f269g.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f275m;
            if (view != null && view.getWindowToken() != null && this.f638e.m()) {
                c.this.C = this.f638e;
            }
            c.this.E = null;
        }
    }

    private class d extends o implements ActionMenuView.a {

        class a extends p0 {

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ c f641n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f641n = cVar;
            }

            @Override // androidx.appcompat.widget.p0
            public h.e b() {
                e eVar = c.this.C;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.p0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.p0
            public boolean d() {
                c cVar = c.this;
                if (cVar.E != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, b.a.f2160k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            l1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z2) {
            super(context, eVar, view, z2, b.a.f2161l);
            h(8388613);
            j(c.this.G);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f269g != null) {
                ((androidx.appcompat.view.menu.a) c.this).f269g.close();
            }
            c.this.C = null;
            super.e();
        }
    }

    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a m2 = c.this.m();
            if (m2 != null) {
                m2.b(eVar, z2);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) c.this).f269g) {
                return false;
            }
            c.this.H = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a m2 = c.this.m();
            if (m2 != null) {
                return m2.c(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, b.g.f2251c, b.g.f2250b);
        this.B = new SparseBooleanArray();
        this.G = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f275m;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f624o;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f626q) {
            return this.f625p;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0013c runnableC0013c = this.E;
        if (runnableC0013c != null && (obj = this.f275m) != null) {
            ((View) obj).removeCallbacks(runnableC0013c);
            this.E = null;
            return true;
        }
        e eVar = this.C;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.D;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.E != null || E();
    }

    public boolean E() {
        e eVar = this.C;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f632w) {
            this.f631v = g.a.b(this.f268f).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f269g;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z2) {
        this.f635z = z2;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f275m = actionMenuView;
        actionMenuView.b(this.f269g);
    }

    public void I(Drawable drawable) {
        d dVar = this.f624o;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f626q = true;
            this.f625p = drawable;
        }
    }

    public void J(boolean z2) {
        this.f627r = z2;
        this.f628s = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f627r || E() || (eVar = this.f269g) == null || this.f275m == null || this.E != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0013c runnableC0013c = new RunnableC0013c(new e(this.f268f, this.f269g, this.f624o, true));
        this.E = runnableC0013c;
        ((View) this.f275m).post(runnableC0013c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
        y();
        super.b(eVar, z2);
    }

    @Override // androidx.appcompat.view.menu.a
    public void c(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.d(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f275m);
        if (this.F == null) {
            this.F = new b();
        }
        actionMenuItemView.setPopupCallback(this.F);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void d(Context context, androidx.appcompat.view.menu.e eVar) {
        super.d(context, eVar);
        Resources resources = context.getResources();
        g.a b3 = g.a.b(context);
        if (!this.f628s) {
            this.f627r = b3.h();
        }
        if (!this.f634y) {
            this.f629t = b3.c();
        }
        if (!this.f632w) {
            this.f631v = b3.d();
        }
        int i2 = this.f629t;
        if (this.f627r) {
            if (this.f624o == null) {
                d dVar = new d(this.f267e);
                this.f624o = dVar;
                if (this.f626q) {
                    dVar.setImageDrawable(this.f625p);
                    this.f625p = null;
                    this.f626q = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f624o.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.f624o.getMeasuredWidth();
        } else {
            this.f624o = null;
        }
        this.f630u = i2;
        this.A = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean e(androidx.appcompat.view.menu.m mVar) {
        boolean z2 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.e0() != this.f269g) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.e0();
        }
        View z3 = z(mVar2.getItem());
        if (z3 == null) {
            return false;
        }
        this.H = mVar.getItem().getItemId();
        int size = mVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        a aVar = new a(this.f268f, mVar, z3);
        this.D = aVar;
        aVar.g(z2);
        this.D.k();
        super.e(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void f(boolean z2) {
        super.f(z2);
        ((View) this.f275m).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f269g;
        boolean z3 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> s2 = eVar.s();
            int size = s2.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.core.view.b b3 = s2.get(i2).b();
                if (b3 != null) {
                    b3.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f269g;
        ArrayList<androidx.appcompat.view.menu.g> z4 = eVar2 != null ? eVar2.z() : null;
        if (this.f627r && z4 != null) {
            int size2 = z4.size();
            if (size2 == 1) {
                z3 = !z4.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        d dVar = this.f624o;
        if (z3) {
            if (dVar == null) {
                this.f624o = new d(this.f267e);
            }
            ViewGroup viewGroup = (ViewGroup) this.f624o.getParent();
            if (viewGroup != this.f275m) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f624o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f275m;
                actionMenuView.addView(this.f624o, actionMenuView.B());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f275m;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f624o);
            }
        }
        ((ActionMenuView) this.f275m).setOverflowReserved(this.f627r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        ArrayList<androidx.appcompat.view.menu.g> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f269g;
        View view = null;
        ?? r3 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i6 = cVar.f631v;
        int i7 = cVar.f630u;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f275m;
        boolean z3 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i2; i10++) {
            androidx.appcompat.view.menu.g gVar = arrayList.get(i10);
            if (gVar.o()) {
                i8++;
            } else if (gVar.n()) {
                i9++;
            } else {
                z3 = true;
            }
            if (cVar.f635z && gVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (cVar.f627r && (z3 || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = cVar.B;
        sparseBooleanArray.clear();
        if (cVar.f633x) {
            int i12 = cVar.A;
            i4 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i4);
        } else {
            i3 = 0;
            i4 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i2) {
            androidx.appcompat.view.menu.g gVar2 = arrayList.get(i13);
            if (gVar2.o()) {
                View n2 = cVar.n(gVar2, view, viewGroup);
                if (cVar.f633x) {
                    i4 -= ActionMenuView.H(n2, i3, i4, makeMeasureSpec, r3);
                } else {
                    n2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n2.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z2 = r3;
                i5 = i2;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i11 > 0 || z4) && i7 > 0 && (!cVar.f633x || i4 > 0);
                boolean z6 = z5;
                i5 = i2;
                if (z5) {
                    View n3 = cVar.n(gVar2, null, viewGroup);
                    if (cVar.f633x) {
                        int H = ActionMenuView.H(n3, i3, i4, makeMeasureSpec, 0);
                        i4 -= H;
                        if (H == 0) {
                            z6 = false;
                        }
                    } else {
                        n3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z7 = z6;
                    int measuredWidth2 = n3.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z5 = z7 & (!cVar.f633x ? i7 + i14 <= 0 : i7 < 0);
                }
                if (z5 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayList.get(i15);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i11++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z5) {
                    i11--;
                }
                gVar2.u(z5);
                z2 = false;
            } else {
                z2 = r3;
                i5 = i2;
                gVar2.u(z2);
            }
            i13++;
            r3 = z2;
            i2 = i5;
            view = null;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.f624o) {
            return false;
        }
        return super.l(viewGroup, i2);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f275m;
        androidx.appcompat.view.menu.k o2 = super.o(viewGroup);
        if (kVar != o2) {
            ((ActionMenuView) o2).setPresenter(this);
        }
        return o2;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i2, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
