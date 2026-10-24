package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: m, reason: collision with root package name */
    private CharSequence f429m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f430n;

    /* renamed from: o, reason: collision with root package name */
    private View f431o;

    /* renamed from: p, reason: collision with root package name */
    private View f432p;

    /* renamed from: q, reason: collision with root package name */
    private LinearLayout f433q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f434r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f435s;

    /* renamed from: t, reason: collision with root package name */
    private int f436t;

    /* renamed from: u, reason: collision with root package name */
    private int f437u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f438v;

    /* renamed from: w, reason: collision with root package name */
    private int f439w;

    class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g.b f440e;

        a(g.b bVar) {
            this.f440e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f440e.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.f2159j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        i1 u2 = i1.u(context, attributeSet, b.j.f2362y, i2, 0);
        androidx.core.view.f0.I(this, u2.f(b.j.f2365z));
        this.f436t = u2.m(b.j.D, 0);
        this.f437u = u2.m(b.j.C, 0);
        this.f588i = u2.l(b.j.B, 0);
        this.f439w = u2.m(b.j.A, b.g.f2252d);
        u2.v();
    }

    private void i() {
        if (this.f433q == null) {
            LayoutInflater.from(getContext()).inflate(b.g.f2249a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f433q = linearLayout;
            this.f434r = (TextView) linearLayout.findViewById(b.f.f2227e);
            this.f435s = (TextView) this.f433q.findViewById(b.f.f2226d);
            if (this.f436t != 0) {
                this.f434r.setTextAppearance(getContext(), this.f436t);
            }
            if (this.f437u != 0) {
                this.f435s.setTextAppearance(getContext(), this.f437u);
            }
        }
        this.f434r.setText(this.f429m);
        this.f435s.setText(this.f430n);
        boolean z2 = !TextUtils.isEmpty(this.f429m);
        boolean z3 = !TextUtils.isEmpty(this.f430n);
        int i2 = 0;
        this.f435s.setVisibility(z3 ? 0 : 8);
        LinearLayout linearLayout2 = this.f433q;
        if (!z2 && !z3) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f433q.getParent() == null) {
            addView(this.f433q);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ androidx.core.view.c1 f(int i2, long j2) {
        return super.f(i2, j2);
    }

    public void g() {
        if (this.f431o == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f430n;
    }

    public CharSequence getTitle() {
        return this.f429m;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(g.b bVar) {
        View view;
        c cVar;
        View view2 = this.f431o;
        if (view2 != null) {
            if (view2.getParent() == null) {
                view = this.f431o;
            }
            this.f431o.findViewById(b.f.f2231i).setOnClickListener(new a(bVar));
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
            cVar = this.f587h;
            if (cVar != null) {
                cVar.y();
            }
            c cVar2 = new c(getContext());
            this.f587h = cVar2;
            cVar2.J(true);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            eVar.c(this.f587h, this.f585f);
            ActionMenuView actionMenuView = (ActionMenuView) this.f587h.o(this);
            this.f586g = actionMenuView;
            androidx.core.view.f0.I(actionMenuView, null);
            addView(this.f586g, layoutParams);
        }
        view = LayoutInflater.from(getContext()).inflate(this.f439w, (ViewGroup) this, false);
        this.f431o = view;
        addView(view);
        this.f431o.findViewById(b.f.f2231i).setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar2 = (androidx.appcompat.view.menu.e) bVar.e();
        cVar = this.f587h;
        if (cVar != null) {
        }
        c cVar22 = new c(getContext());
        this.f587h = cVar22;
        cVar22.J(true);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        eVar2.c(this.f587h, this.f585f);
        ActionMenuView actionMenuView2 = (ActionMenuView) this.f587h.o(this);
        this.f586g = actionMenuView2;
        androidx.core.view.f0.I(actionMenuView2, null);
        addView(this.f586g, layoutParams2);
    }

    public boolean j() {
        return this.f438v;
    }

    public void k() {
        removeAllViews();
        this.f432p = null;
        this.f586g = null;
    }

    public boolean l() {
        c cVar = this.f587h;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f587h;
        if (cVar != null) {
            cVar.B();
            this.f587h.C();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f429m);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean b3 = p1.b(this);
        int paddingRight = b3 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f431o;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f431o.getLayoutParams();
            int i6 = b3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = b3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d3 = androidx.appcompat.widget.a.d(paddingRight, i6, b3);
            paddingRight = androidx.appcompat.widget.a.d(d3 + e(this.f431o, d3, paddingTop, paddingTop2, b3), i7, b3);
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.f433q;
        if (linearLayout != null && this.f432p == null && linearLayout.getVisibility() != 8) {
            i8 += e(this.f433q, i8, paddingTop, paddingTop2, b3);
        }
        int i9 = i8;
        View view2 = this.f432p;
        if (view2 != null) {
            e(view2, i9, paddingTop, paddingTop2, b3);
        }
        int paddingLeft = b3 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f586g;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b3);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.f588i;
        if (i4 <= 0) {
            i4 = View.MeasureSpec.getSize(i3);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i5 = i4 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        View view = this.f431o;
        if (view != null) {
            int c3 = c(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f431o.getLayoutParams();
            paddingLeft = c3 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f586g;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f586g, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f433q;
        if (linearLayout != null && this.f432p == null) {
            if (this.f438v) {
                this.f433q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f433q.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f433q.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f432p;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                i5 = Math.min(i8, i5);
            }
            this.f432p.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i9));
        }
        if (this.f588i > 0) {
            setMeasuredDimension(size, i4);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i2) {
        this.f588i = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f432p;
        if (view2 != null) {
            removeView(view2);
        }
        this.f432p = view;
        if (view != null && (linearLayout = this.f433q) != null) {
            removeView(linearLayout);
            this.f433q = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f430n = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f429m = charSequence;
        i();
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f438v) {
            requestLayout();
        }
        this.f438v = z2;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
