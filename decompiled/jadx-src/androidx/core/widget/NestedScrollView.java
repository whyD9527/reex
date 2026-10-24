package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.a0;
import androidx.core.view.accessibility.f;
import androidx.core.view.f0;
import androidx.core.view.w;
import androidx.core.view.x;
import androidx.core.view.z;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements z {
    private static final float F = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a G = new a();
    private static final int[] H = {R.attr.fillViewport};
    private d A;
    private final a0 B;
    private final x C;
    private float D;
    private c E;

    /* renamed from: e, reason: collision with root package name */
    private final float f1636e;

    /* renamed from: f, reason: collision with root package name */
    private long f1637f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f1638g;

    /* renamed from: h, reason: collision with root package name */
    private OverScroller f1639h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f1640i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f1641j;

    /* renamed from: k, reason: collision with root package name */
    private int f1642k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1643l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1644m;

    /* renamed from: n, reason: collision with root package name */
    private View f1645n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1646o;

    /* renamed from: p, reason: collision with root package name */
    private VelocityTracker f1647p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1648q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1649r;

    /* renamed from: s, reason: collision with root package name */
    private int f1650s;

    /* renamed from: t, reason: collision with root package name */
    private int f1651t;

    /* renamed from: u, reason: collision with root package name */
    private int f1652u;

    /* renamed from: v, reason: collision with root package name */
    private int f1653v;

    /* renamed from: w, reason: collision with root package name */
    private final int[] f1654w;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f1655x;

    /* renamed from: y, reason: collision with root package name */
    private int f1656y;

    /* renamed from: z, reason: collision with root package name */
    private int f1657z;

    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            androidx.core.view.accessibility.h.a(accessibilityEvent, nestedScrollView.getScrollX());
            androidx.core.view.accessibility.h.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.f fVar) {
            int scrollRange;
            super.g(view, fVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            fVar.I(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            fVar.M(true);
            if (nestedScrollView.getScrollY() > 0) {
                fVar.a(f.a.f1533r);
                fVar.a(f.a.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                fVar.a(f.a.f1532q);
                fVar.a(f.a.E);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i2, Bundle bundle) {
            if (super.j(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.V(0, max, true);
                    return true;
                }
                if (i2 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.V(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public int f1658e;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        d(Parcel parcel) {
            super(parcel);
            this.f1658e = parcel.readInt();
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1658e + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1658e);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r.a.f4228c);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1638g = new Rect();
        this.f1643l = true;
        this.f1644m = false;
        this.f1645n = null;
        this.f1646o = false;
        this.f1649r = true;
        this.f1653v = -1;
        this.f1654w = new int[2];
        this.f1655x = new int[2];
        this.f1640i = androidx.core.widget.d.a(context, attributeSet);
        this.f1641j = androidx.core.widget.d.a(context, attributeSet);
        this.f1636e = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H, i2, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.B = new a0(this);
        this.C = new x(this);
        setNestedScrollingEnabled(true);
        f0.H(this, G);
    }

    private void A() {
        this.f1639h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1650s = viewConfiguration.getScaledTouchSlop();
        this.f1651t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1652u = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void B() {
        if (this.f1647p == null) {
            this.f1647p = VelocityTracker.obtain();
        }
    }

    private void C(int i2, int i3) {
        this.f1642k = i2;
        this.f1653v = i3;
        W(2, 0);
    }

    private boolean D(View view) {
        return !F(view, 0, getHeight());
    }

    private static boolean E(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && E((View) parent, view2);
    }

    private boolean F(View view, int i2, int i3) {
        view.getDrawingRect(this.f1638g);
        offsetDescendantRectToMyCoords(view, this.f1638g);
        return this.f1638g.bottom + i2 >= getScrollY() && this.f1638g.top - i2 <= getScrollY() + i3;
    }

    private void G(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.C.d(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    private void H(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1653v) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1642k = (int) motionEvent.getY(i2);
            this.f1653v = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1647p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void K() {
        VelocityTracker velocityTracker = this.f1647p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1647p = null;
        }
    }

    private int L(int i2, float f2) {
        float d3;
        EdgeEffect edgeEffect;
        float width = f2 / getWidth();
        float height = i2 / getHeight();
        float f3 = 0.0f;
        if (androidx.core.widget.d.b(this.f1640i) != 0.0f) {
            d3 = -androidx.core.widget.d.d(this.f1640i, -height, width);
            if (androidx.core.widget.d.b(this.f1640i) == 0.0f) {
                edgeEffect = this.f1640i;
                edgeEffect.onRelease();
            }
            f3 = d3;
        } else if (androidx.core.widget.d.b(this.f1641j) != 0.0f) {
            d3 = androidx.core.widget.d.d(this.f1641j, height, 1.0f - width);
            if (androidx.core.widget.d.b(this.f1641j) == 0.0f) {
                edgeEffect = this.f1641j;
                edgeEffect.onRelease();
            }
            f3 = d3;
        }
        int round = Math.round(f3 * getHeight());
        if (round != 0) {
            invalidate();
        }
        return round;
    }

    private void M(boolean z2) {
        if (z2) {
            W(2, 1);
        } else {
            Y(1);
        }
        this.f1657z = getScrollY();
        f0.B(this);
    }

    private boolean N(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        boolean z3 = i2 == 33;
        View t2 = t(z3, i3, i4);
        if (t2 == null) {
            t2 = this;
        }
        if (i3 < scrollY || i4 > i5) {
            O(z3 ? i3 - scrollY : i4 - i5, 0, 1, true);
            z2 = true;
        }
        if (t2 != findFocus()) {
            t2.requestFocus(i2);
        }
        return z2;
    }

    private int O(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        EdgeEffect edgeEffect;
        if (i4 == 1) {
            W(2, i4);
        }
        boolean z3 = false;
        if (k(0, i2, this.f1655x, this.f1654w, i4)) {
            i5 = i2 - this.f1655x[1];
            i6 = this.f1654w[1] + 0;
        } else {
            i5 = i2;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z4 = c() && !z2;
        boolean z5 = I(0, i5, 0, scrollY, 0, scrollRange, 0, 0, true) && !x(i4);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f1655x;
        iArr[1] = 0;
        l(0, scrollY2, 0, i5 - scrollY2, this.f1654w, i4, iArr);
        int i7 = i6 + this.f1654w[1];
        int i8 = i5 - this.f1655x[1];
        int i9 = scrollY + i8;
        if (i9 < 0) {
            if (z4) {
                androidx.core.widget.d.d(this.f1640i, (-i8) / getHeight(), i3 / getWidth());
                if (!this.f1641j.isFinished()) {
                    edgeEffect = this.f1641j;
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            androidx.core.widget.d.d(this.f1641j, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!this.f1640i.isFinished()) {
                edgeEffect = this.f1640i;
                edgeEffect.onRelease();
            }
        }
        if (this.f1640i.isFinished() && this.f1641j.isFinished()) {
            z3 = z5;
        } else {
            f0.B(this);
        }
        if (z3 && i4 == 0) {
            this.f1647p.clear();
        }
        if (i4 == 1) {
            Y(i4);
            this.f1640i.onRelease();
            this.f1641j.onRelease();
        }
        return i7;
    }

    private void P(View view) {
        view.getDrawingRect(this.f1638g);
        offsetDescendantRectToMyCoords(view, this.f1638g);
        int f2 = f(this.f1638g);
        if (f2 != 0) {
            scrollBy(0, f2);
        }
    }

    private boolean Q(Rect rect, boolean z2) {
        int f2 = f(rect);
        boolean z3 = f2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, f2);
            } else {
                S(0, f2);
            }
        }
        return z3;
    }

    private boolean R(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        return w(-i2) < androidx.core.widget.d.b(edgeEffect) * ((float) getHeight());
    }

    private void T(int i2, int i3, int i4, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1637f > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1639h.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, i4);
            M(z2);
        } else {
            if (!this.f1639h.isFinished()) {
                a();
            }
            scrollBy(i2, i3);
        }
        this.f1637f = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean X(MotionEvent motionEvent) {
        boolean z2;
        if (androidx.core.widget.d.b(this.f1640i) != 0.0f) {
            androidx.core.widget.d.d(this.f1640i, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        if (androidx.core.widget.d.b(this.f1641j) == 0.0f) {
            return z2;
        }
        androidx.core.widget.d.d(this.f1641j, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f1639h.abortAnimation();
        Y(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int e(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.D = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.D;
    }

    private void p(int i2) {
        if (i2 != 0) {
            if (this.f1649r) {
                S(0, i2);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    private boolean q(int i2) {
        EdgeEffect edgeEffect;
        if (androidx.core.widget.d.b(this.f1640i) != 0.0f) {
            if (R(this.f1640i, i2)) {
                edgeEffect = this.f1640i;
                edgeEffect.onAbsorb(i2);
            } else {
                i2 = -i2;
                u(i2);
            }
        } else {
            if (androidx.core.widget.d.b(this.f1641j) == 0.0f) {
                return false;
            }
            i2 = -i2;
            if (R(this.f1641j, i2)) {
                edgeEffect = this.f1641j;
                edgeEffect.onAbsorb(i2);
            }
            u(i2);
        }
        return true;
    }

    private void r() {
        this.f1653v = -1;
        this.f1646o = false;
        K();
        Y(0);
        this.f1640i.onRelease();
        this.f1641j.onRelease();
    }

    private View t(boolean z2, int i2, int i3) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = focusables.get(i4);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float w(int i2) {
        double log = Math.log((Math.abs(i2) * 0.35f) / (this.f1636e * 0.015f));
        float f2 = F;
        return (float) (this.f1636e * 0.015f * Math.exp((f2 / (f2 - 1.0d)) * log));
    }

    private boolean y(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i3 >= childAt.getTop() - scrollY && i3 < childAt.getBottom() - scrollY && i2 >= childAt.getLeft() && i2 < childAt.getRight();
    }

    private void z() {
        VelocityTracker velocityTracker = this.f1647p;
        if (velocityTracker == null) {
            this.f1647p = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    boolean I(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        boolean z3;
        boolean z4;
        int overScrollMode = getOverScrollMode();
        boolean z5 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z6 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        boolean z8 = overScrollMode == 0 || (overScrollMode == 1 && z6);
        int i10 = i4 + i2;
        int i11 = !z7 ? 0 : i8;
        int i12 = i5 + i3;
        int i13 = !z8 ? 0 : i9;
        int i14 = -i11;
        int i15 = i11 + i6;
        int i16 = -i13;
        int i17 = i13 + i7;
        if (i10 > i15) {
            i10 = i15;
            z3 = true;
        } else if (i10 < i14) {
            z3 = true;
            i10 = i14;
        } else {
            z3 = false;
        }
        if (i12 > i17) {
            i12 = i17;
            z4 = true;
        } else if (i12 < i16) {
            z4 = true;
            i12 = i16;
        } else {
            z4 = false;
        }
        if (z4 && !x(1)) {
            this.f1639h.springBack(i10, i12, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i10, i12, z3, z4);
        return z3 || z4;
    }

    public boolean J(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        if (z2) {
            this.f1638g.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1638g;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1638g.top = getScrollY() - height;
            Rect rect2 = this.f1638g;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1638g;
        int i3 = rect3.top;
        int i4 = height + i3;
        rect3.bottom = i4;
        return N(i2, i3, i4);
    }

    public final void S(int i2, int i3) {
        T(i2, i3, 250, false);
    }

    void U(int i2, int i3, int i4, boolean z2) {
        T(i2 - getScrollX(), i3 - getScrollY(), i4, z2);
    }

    void V(int i2, int i3, boolean z2) {
        U(i2, i3, 250, z2);
    }

    public boolean W(int i2, int i3) {
        return this.C.m(i2, i3);
    }

    public void Y(int i2) {
        this.C.n(i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean b(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !F(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            O(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f1638g);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1638g);
            O(f(this.f1638g), 0, 1, true);
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && D(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f1639h.isFinished()) {
            return;
        }
        this.f1639h.computeScrollOffset();
        int currY = this.f1639h.getCurrY();
        int g2 = g(currY - this.f1657z);
        this.f1657z = currY;
        int[] iArr = this.f1655x;
        boolean z2 = false;
        iArr[1] = 0;
        k(0, g2, iArr, null, 1);
        int i2 = g2 - this.f1655x[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            I(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.f1655x;
            iArr2[1] = 0;
            l(0, scrollY2, 0, i3, this.f1654w, 1, iArr2);
            i2 = i3 - this.f1655x[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z2 = true;
            }
            if (z2) {
                if (i2 < 0) {
                    if (this.f1640i.isFinished()) {
                        edgeEffect = this.f1640i;
                        edgeEffect.onAbsorb((int) this.f1639h.getCurrVelocity());
                    }
                } else if (this.f1641j.isFinished()) {
                    edgeEffect = this.f1641j;
                    edgeEffect.onAbsorb((int) this.f1639h.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f1639h.isFinished()) {
            Y(1);
        } else {
            f0.B(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.C.a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.C.b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return k(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.C.e(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i3 = 0;
        if (!this.f1640i.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft() + 0;
            } else {
                i2 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i2, min);
            this.f1640i.setSize(width, height);
            if (this.f1640i.draw(canvas)) {
                f0.B(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f1641j.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i3 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i3 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f1641j.setSize(width2, height2);
        if (this.f1641j.draw(canvas)) {
            f0.B(this);
        }
        canvas.restoreToCount(save2);
    }

    protected int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    int g(int i2) {
        int height = getHeight();
        if (i2 > 0 && androidx.core.widget.d.b(this.f1640i) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * androidx.core.widget.d.d(this.f1640i, ((-i2) * 4.0f) / height, 0.5f));
            if (round != i2) {
                this.f1640i.finish();
            }
            return i2 - round;
        }
        if (i2 >= 0 || androidx.core.widget.d.b(this.f1641j) == 0.0f) {
            return i2;
        }
        float f2 = height;
        int round2 = Math.round((f2 / 4.0f) * androidx.core.widget.d.d(this.f1641j, (i2 * 4.0f) / f2, 0.5f));
        if (round2 != i2) {
            this.f1641j.finish();
        }
        return i2 - round2;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // androidx.core.view.y
    public void h(View view, View view2, int i2, int i3) {
        this.B.c(view, view2, i2, i3);
        W(2, i3);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    @Override // androidx.core.view.y
    public void i(View view, int i2) {
        this.B.d(view, i2);
        Y(i2);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.C.j();
    }

    @Override // androidx.core.view.y
    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        k(i2, i3, iArr, null, i4);
    }

    public boolean k(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.C.c(i2, i3, iArr, iArr2, i4);
    }

    public void l(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        this.C.d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    @Override // androidx.core.view.z
    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        G(i5, i6, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i2, int i3) {
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.y
    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        G(i5, i6, null);
    }

    @Override // androidx.core.view.y
    public boolean o(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1644m = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        float f2;
        if (motionEvent.getAction() != 8 || this.f1646o) {
            return false;
        }
        if (w.a(motionEvent, 2)) {
            f2 = motionEvent.getAxisValue(9);
            i2 = (int) motionEvent.getX();
        } else if (w.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i2 = getWidth() / 2;
            f2 = axisValue;
        } else {
            i2 = 0;
            f2 = 0.0f;
        }
        if (f2 == 0.0f) {
            return false;
        }
        O(-((int) (f2 * getVerticalScrollFactorCompat())), i2, 1, w.a(motionEvent, 8194));
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f1646o) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.f1653v;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y2 - this.f1642k) > this.f1650s && (2 & getNestedScrollAxes()) == 0) {
                                this.f1646o = true;
                                this.f1642k = y2;
                                B();
                                this.f1647p.addMovement(motionEvent);
                                this.f1656y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        H(motionEvent);
                    }
                }
            }
            this.f1646o = false;
            this.f1653v = -1;
            K();
            if (this.f1639h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                f0.B(this);
            }
            Y(0);
        } else {
            int y3 = (int) motionEvent.getY();
            if (y((int) motionEvent.getX(), y3)) {
                this.f1642k = y3;
                this.f1653v = motionEvent.getPointerId(0);
                z();
                this.f1647p.addMovement(motionEvent);
                this.f1639h.computeScrollOffset();
                if (!X(motionEvent) && this.f1639h.isFinished()) {
                    z2 = false;
                }
                this.f1646o = z2;
                W(2, 0);
            } else {
                if (!X(motionEvent) && this.f1639h.isFinished()) {
                    z2 = false;
                }
                this.f1646o = z2;
                K();
            }
        }
        return this.f1646o;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f1643l = false;
        View view = this.f1645n;
        if (view != null && E(view, this)) {
            P(this.f1645n);
        }
        this.f1645n = null;
        if (!this.f1644m) {
            if (this.A != null) {
                scrollTo(getScrollX(), this.A.f1658e);
                this.A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e3 = e(scrollY, paddingTop, i6);
            if (e3 != scrollY) {
                scrollTo(getScrollX(), e3);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1644m = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1648q && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        u((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        j(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        G(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        h(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i2) : focusFinder.findNextFocusFromRect(this, rect, i2);
        if (findNextFocus == null || D(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.A = dVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f1658e = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        c cVar = this.E;
        if (cVar != null) {
            cVar.a(this, i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !F(findFocus, 0, i5)) {
            return;
        }
        findFocus.getDrawingRect(this.f1638g);
        offsetDescendantRectToMyCoords(findFocus, this.f1638g);
        p(f(this.f1638g));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return o(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r12.f1639h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        androidx.core.view.f0.B(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (r12.f1639h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L25;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        B();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1656y = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f1656y);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1647p;
                velocityTracker.computeCurrentVelocity(1000, this.f1652u);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1653v);
                if (Math.abs(yVelocity) >= this.f1651t) {
                    if (!q(yVelocity)) {
                        int i2 = -yVelocity;
                        float f2 = i2;
                        if (!dispatchNestedPreFling(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            u(i2);
                        }
                    }
                }
                r();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1653v);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1653v + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.f1642k - y2;
                    int L = i3 - L(i3, motionEvent.getX(findPointerIndex));
                    if (!this.f1646o && Math.abs(L) > this.f1650s) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1646o = true;
                        int i4 = this.f1650s;
                        L = L > 0 ? L - i4 : L + i4;
                    }
                    if (this.f1646o) {
                        int O = O(L, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f1642k = y2 - O;
                        this.f1656y += O;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1646o) {
                    if (getChildCount() > 0) {
                    }
                }
                r();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1642k = (int) motionEvent.getY(actionIndex);
                this.f1653v = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                H(motionEvent);
                this.f1642k = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1653v));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1646o && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1639h.isFinished()) {
                a();
            }
            C((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f1647p;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1643l) {
            this.f1645n = view2;
        } else {
            P(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return Q(rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            K();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1643l = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.f1638g.setEmpty();
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? b(33) : v(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? b(130) : v(130);
        }
        if (keyCode != 62) {
            return false;
        }
        J(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int e3 = e(i2, width, width2);
            int e4 = e(i3, height, height2);
            if (e3 == getScrollX() && e4 == getScrollY()) {
                return;
            }
            super.scrollTo(e3, e4);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1648q) {
            this.f1648q = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        this.C.k(z2);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.E = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1649r = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return W(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Y(0);
    }

    public void u(int i2) {
        if (getChildCount() > 0) {
            this.f1639h.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            M(true);
        }
    }

    public boolean v(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1638g;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1638g.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1638g;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1638g;
        return N(i2, rect3.top, rect3.bottom);
    }

    public boolean x(int i2) {
        return this.C.i(i2);
    }
}
