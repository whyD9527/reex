package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.g1;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements k0, androidx.core.view.y, androidx.core.view.z {
    static final int[] J = {b.a.f2151b, R.attr.windowContentOverlay};
    private androidx.core.view.g1 A;
    private androidx.core.view.g1 B;
    private d C;
    private OverScroller D;
    ViewPropertyAnimator E;
    final AnimatorListenerAdapter F;
    private final Runnable G;
    private final Runnable H;
    private final androidx.core.view.a0 I;

    /* renamed from: e, reason: collision with root package name */
    private int f442e;

    /* renamed from: f, reason: collision with root package name */
    private int f443f;

    /* renamed from: g, reason: collision with root package name */
    private ContentFrameLayout f444g;

    /* renamed from: h, reason: collision with root package name */
    ActionBarContainer f445h;

    /* renamed from: i, reason: collision with root package name */
    private l0 f446i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f447j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f448k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f449l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f450m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f451n;

    /* renamed from: o, reason: collision with root package name */
    boolean f452o;

    /* renamed from: p, reason: collision with root package name */
    private int f453p;

    /* renamed from: q, reason: collision with root package name */
    private int f454q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f455r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f456s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f457t;

    /* renamed from: u, reason: collision with root package name */
    private final Rect f458u;

    /* renamed from: v, reason: collision with root package name */
    private final Rect f459v;

    /* renamed from: w, reason: collision with root package name */
    private final Rect f460w;

    /* renamed from: x, reason: collision with root package name */
    private final Rect f461x;

    /* renamed from: y, reason: collision with root package name */
    private androidx.core.view.g1 f462y;

    /* renamed from: z, reason: collision with root package name */
    private androidx.core.view.g1 f463z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.f452o = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.f452o = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = actionBarOverlayLayout.f445h.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.F);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = actionBarOverlayLayout.f445h.animate().translationY(-ActionBarOverlayLayout.this.f445h.getHeight()).setListener(ActionBarOverlayLayout.this.F);
        }
    }

    public interface d {
        void a();

        void b();

        void c();

        void d(boolean z2);

        void e();

        void onWindowVisibilityChanged(int i2);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f443f = 0;
        this.f455r = new Rect();
        this.f456s = new Rect();
        this.f457t = new Rect();
        this.f458u = new Rect();
        this.f459v = new Rect();
        this.f460w = new Rect();
        this.f461x = new Rect();
        androidx.core.view.g1 g1Var = androidx.core.view.g1.f1589b;
        this.f462y = g1Var;
        this.f463z = g1Var;
        this.A = g1Var;
        this.B = g1Var;
        this.F = new a();
        this.G = new b();
        this.H = new c();
        v(context);
        this.I = new androidx.core.view.a0(this);
    }

    private void A() {
        u();
        this.G.run();
    }

    private boolean B(float f2) {
        this.D.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.D.getFinalY() > this.f445h.getHeight();
    }

    private void p() {
        u();
        this.H.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean q(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        e eVar = (e) view.getLayoutParams();
        if (z2) {
            int i2 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i3 = rect.left;
            if (i2 != i3) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i3;
                z6 = true;
                if (z3) {
                    int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                    int i5 = rect.top;
                    if (i4 != i5) {
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = i5;
                        z6 = true;
                    }
                }
                if (z5) {
                    int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                    int i7 = rect.right;
                    if (i6 != i7) {
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i7;
                        z6 = true;
                    }
                }
                if (z4) {
                    int i8 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    int i9 = rect.bottom;
                    if (i8 != i9) {
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i9;
                        return true;
                    }
                }
                return z6;
            }
        }
        z6 = false;
        if (z3) {
        }
        if (z5) {
        }
        if (z4) {
        }
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l0 t(View view) {
        if (view instanceof l0) {
            return (l0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(J);
        this.f442e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f447j = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f448k = context.getApplicationInfo().targetSdkVersion < 19;
        this.D = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.H, 600L);
    }

    private void y() {
        u();
        postDelayed(this.G, 600L);
    }

    @Override // androidx.appcompat.widget.k0
    public void a(Menu menu, j.a aVar) {
        z();
        this.f446i.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.k0
    public boolean b() {
        z();
        return this.f446i.b();
    }

    @Override // androidx.appcompat.widget.k0
    public void c() {
        z();
        this.f446i.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.k0
    public boolean d() {
        z();
        return this.f446i.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f447j == null || this.f448k) {
            return;
        }
        int bottom = this.f445h.getVisibility() == 0 ? (int) (this.f445h.getBottom() + this.f445h.getTranslationY() + 0.5f) : 0;
        this.f447j.setBounds(0, bottom, getWidth(), this.f447j.getIntrinsicHeight() + bottom);
        this.f447j.draw(canvas);
    }

    @Override // androidx.appcompat.widget.k0
    public boolean e() {
        z();
        return this.f446i.e();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean f() {
        z();
        return this.f446i.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.k0
    public boolean g() {
        z();
        return this.f446i.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f445h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.I.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f446i.getTitle();
    }

    @Override // androidx.core.view.y
    public void h(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // androidx.core.view.y
    public void i(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.y
    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void k(int i2) {
        z();
        if (i2 == 2) {
            this.f446i.s();
        } else if (i2 == 5) {
            this.f446i.t();
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void l() {
        z();
        this.f446i.h();
    }

    @Override // androidx.core.view.z
    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        n(view, i2, i3, i4, i5, i6);
    }

    @Override // androidx.core.view.y
    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // androidx.core.view.y
    public boolean o(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        androidx.core.view.g1 u2 = androidx.core.view.g1.u(windowInsets);
        boolean q2 = q(this.f445h, new Rect(u2.i(), u2.k(), u2.j(), u2.h()), true, true, false, true);
        androidx.core.view.f0.c(this, u2, this.f455r);
        Rect rect = this.f455r;
        androidx.core.view.g1 l2 = u2.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f462y = l2;
        boolean z2 = true;
        if (!this.f463z.equals(l2)) {
            this.f463z = this.f462y;
            q2 = true;
        }
        if (this.f456s.equals(this.f455r)) {
            z2 = q2;
        } else {
            this.f456s.set(this.f455r);
        }
        if (z2) {
            requestLayout();
        }
        return u2.a().c().b().t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.f0.E(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredHeight;
        androidx.core.view.g1 a3;
        z();
        measureChildWithMargins(this.f445h, i2, 0, i3, 0);
        e eVar = (e) this.f445h.getLayoutParams();
        int max = Math.max(0, this.f445h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f445h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f445h.getMeasuredState());
        boolean z2 = (androidx.core.view.f0.s(this) & 256) != 0;
        if (z2) {
            measuredHeight = this.f442e;
            if (this.f450m && this.f445h.getTabContainer() != null) {
                measuredHeight += this.f442e;
            }
        } else {
            measuredHeight = this.f445h.getVisibility() != 8 ? this.f445h.getMeasuredHeight() : 0;
        }
        this.f457t.set(this.f455r);
        androidx.core.view.g1 g1Var = this.f462y;
        this.A = g1Var;
        if (this.f449l || z2) {
            a3 = new g1.b(this.A).c(androidx.core.graphics.b.b(g1Var.i(), this.A.k() + measuredHeight, this.A.j(), this.A.h() + 0)).a();
        } else {
            Rect rect = this.f457t;
            rect.top += measuredHeight;
            rect.bottom += 0;
            a3 = g1Var.l(0, measuredHeight, 0, 0);
        }
        this.A = a3;
        q(this.f444g, this.f457t, true, true, true, true);
        if (!this.B.equals(this.A)) {
            androidx.core.view.g1 g1Var2 = this.A;
            this.B = g1Var2;
            androidx.core.view.f0.d(this.f444g, g1Var2);
        }
        measureChildWithMargins(this.f444g, i2, 0, i3, 0);
        e eVar2 = (e) this.f444g.getLayoutParams();
        int max3 = Math.max(max, this.f444g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f444g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f444g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f451n || !z2) {
            return false;
        }
        if (B(f3)) {
            p();
        } else {
            A();
        }
        this.f452o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f453p + i3;
        this.f453p = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.I.b(view, view2, i2);
        this.f453p = getActionBarHideOffset();
        u();
        d dVar = this.C;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f445h.getVisibility() != 0) {
            return false;
        }
        return this.f451n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f451n && !this.f452o) {
            if (this.f453p <= this.f445h.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        z();
        int i3 = this.f454q ^ i2;
        this.f454q = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        d dVar = this.C;
        if (dVar != null) {
            dVar.d(!z3);
            if (z2 || !z3) {
                this.C.a();
            } else {
                this.C.e();
            }
        }
        if ((i3 & 256) == 0 || this.C == null) {
            return;
        }
        androidx.core.view.f0.E(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f443f = i2;
        d dVar = this.C;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        u();
        this.f445h.setTranslationY(-Math.max(0, Math.min(i2, this.f445h.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.C = dVar;
        if (getWindowToken() != null) {
            this.C.onWindowVisibilityChanged(this.f443f);
            int i2 = this.f454q;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                androidx.core.view.f0.E(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f450m = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f451n) {
            this.f451n = z2;
            if (z2) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        z();
        this.f446i.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f446i.setIcon(drawable);
    }

    public void setLogo(int i2) {
        z();
        this.f446i.p(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.f449l = z2;
        this.f448k = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.k0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f446i.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.k0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f446i.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.G);
        removeCallbacks(this.H);
        ViewPropertyAnimator viewPropertyAnimator = this.E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f449l;
    }

    void z() {
        if (this.f444g == null) {
            this.f444g = (ContentFrameLayout) findViewById(b.f.f2224b);
            this.f445h = (ActionBarContainer) findViewById(b.f.f2225c);
            this.f446i = t(findViewById(b.f.f2223a));
        }
    }
}
