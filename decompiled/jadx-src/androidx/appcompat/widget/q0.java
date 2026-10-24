package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class q0 extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    private boolean f842e;

    /* renamed from: f, reason: collision with root package name */
    private int f843f;

    /* renamed from: g, reason: collision with root package name */
    private int f844g;

    /* renamed from: h, reason: collision with root package name */
    private int f845h;

    /* renamed from: i, reason: collision with root package name */
    private int f846i;

    /* renamed from: j, reason: collision with root package name */
    private int f847j;

    /* renamed from: k, reason: collision with root package name */
    private float f848k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f849l;

    /* renamed from: m, reason: collision with root package name */
    private int[] f850m;

    /* renamed from: n, reason: collision with root package name */
    private int[] f851n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f852o;

    /* renamed from: p, reason: collision with root package name */
    private int f853p;

    /* renamed from: q, reason: collision with root package name */
    private int f854q;

    /* renamed from: r, reason: collision with root package name */
    private int f855r;

    /* renamed from: s, reason: collision with root package name */
    private int f856s;

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public float f857a;

        /* renamed from: b, reason: collision with root package name */
        public int f858b;

        public a(int i2, int i3) {
            super(i2, i3);
            this.f858b = -1;
            this.f857a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f858b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.j.f2325l1);
            this.f857a = obtainStyledAttributes.getFloat(b.j.f2331n1, 0.0f);
            this.f858b = obtainStyledAttributes.getInt(b.j.f2328m1, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f858b = -1;
        }
    }

    public q0(Context context) {
        this(context, null);
    }

    public q0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public q0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f842e = true;
        this.f843f = -1;
        this.f844g = 0;
        this.f846i = 8388659;
        int[] iArr = b.j.f2291b1;
        i1 u2 = i1.u(context, attributeSet, iArr, i2, 0);
        androidx.core.view.f0.F(this, context, iArr, attributeSet, u2.q(), i2, 0);
        int j2 = u2.j(b.j.f2299d1, -1);
        if (j2 >= 0) {
            setOrientation(j2);
        }
        int j3 = u2.j(b.j.f2295c1, -1);
        if (j3 >= 0) {
            setGravity(j3);
        }
        boolean a3 = u2.a(b.j.f2303e1, true);
        if (!a3) {
            setBaselineAligned(a3);
        }
        this.f848k = u2.h(b.j.f2310g1, -1.0f);
        this.f843f = u2.j(b.j.f2307f1, -1);
        this.f849l = u2.a(b.j.f2319j1, false);
        setDividerDrawable(u2.f(b.j.f2313h1));
        this.f855r = u2.j(b.j.f2322k1, 0);
        this.f856s = u2.e(b.j.f2316i1, 0);
        u2.v();
    }

    private void g(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View o2 = o(i4);
            if (o2.getVisibility() != 8) {
                a aVar = (a) o2.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = o2.getMeasuredWidth();
                    measureChildWithMargins(o2, i3, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i5;
                }
            }
        }
    }

    private void h(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View o2 = o(i4);
            if (o2.getVisibility() != 8) {
                a aVar = (a) o2.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = o2.getMeasuredHeight();
                    measureChildWithMargins(o2, makeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                }
            }
        }
    }

    private void w(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    void c(Canvas canvas) {
        int right;
        int left;
        int i2;
        int virtualChildCount = getVirtualChildCount();
        boolean b3 = p1.b(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View o2 = o(i3);
            if (o2 != null && o2.getVisibility() != 8 && p(i3)) {
                a aVar = (a) o2.getLayoutParams();
                f(canvas, b3 ? o2.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (o2.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f853p);
            }
        }
        if (p(virtualChildCount)) {
            View o3 = o(virtualChildCount - 1);
            if (o3 != null) {
                a aVar2 = (a) o3.getLayoutParams();
                if (b3) {
                    left = o3.getLeft();
                    i2 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    right = (left - i2) - this.f853p;
                } else {
                    right = o3.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (b3) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i2 = getPaddingRight();
                right = (left - i2) - this.f853p;
            }
            f(canvas, right);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void d(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View o2 = o(i2);
            if (o2 != null && o2.getVisibility() != 8 && p(i2)) {
                e(canvas, (o2.getTop() - ((ViewGroup.MarginLayoutParams) ((a) o2.getLayoutParams())).topMargin) - this.f854q);
            }
        }
        if (p(virtualChildCount)) {
            View o3 = o(virtualChildCount - 1);
            e(canvas, o3 == null ? (getHeight() - getPaddingBottom()) - this.f854q : o3.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) o3.getLayoutParams())).bottomMargin);
        }
    }

    void e(Canvas canvas, int i2) {
        this.f852o.setBounds(getPaddingLeft() + this.f856s, i2, (getWidth() - getPaddingRight()) - this.f856s, this.f854q + i2);
        this.f852o.draw(canvas);
    }

    void f(Canvas canvas, int i2) {
        this.f852o.setBounds(i2, getPaddingTop() + this.f856s, this.f853p + i2, (getHeight() - getPaddingBottom()) - this.f856s);
        this.f852o.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f843f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f843f;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f843f == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i4 = this.f844g;
        if (this.f845h == 1 && (i2 = this.f846i & 112) != 48) {
            if (i2 == 16) {
                i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f847j) / 2;
            } else if (i2 == 80) {
                i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f847j;
            }
        }
        return i4 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f843f;
    }

    public Drawable getDividerDrawable() {
        return this.f852o;
    }

    public int getDividerPadding() {
        return this.f856s;
    }

    public int getDividerWidth() {
        return this.f853p;
    }

    public int getGravity() {
        return this.f846i;
    }

    public int getOrientation() {
        return this.f845h;
    }

    public int getShowDividers() {
        return this.f855r;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f848k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i2 = this.f845h;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    int l(View view, int i2) {
        return 0;
    }

    int m(View view) {
        return 0;
    }

    int n(View view) {
        return 0;
    }

    View o(int i2) {
        return getChildAt(i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f852o == null) {
            return;
        }
        if (this.f845h == 1) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.f845h == 1) {
            r(i2, i3, i4, i5);
        } else {
            q(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f845h == 1) {
            v(i2, i3);
        } else {
            t(i2, i3);
        }
    }

    protected boolean p(int i2) {
        if (i2 == 0) {
            return (this.f855r & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f855r & 4) != 0;
        }
        if ((this.f855r & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void q(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean b3 = p1.b(this);
        int paddingTop = getPaddingTop();
        int i15 = i5 - i3;
        int paddingBottom = i15 - getPaddingBottom();
        int paddingBottom2 = (i15 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i16 = this.f846i;
        int i17 = i16 & 112;
        boolean z3 = this.f842e;
        int[] iArr = this.f850m;
        int[] iArr2 = this.f851n;
        int a3 = androidx.core.view.e.a(8388615 & i16, androidx.core.view.f0.n(this));
        boolean z4 = true;
        int paddingLeft = a3 != 1 ? a3 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.f847j : getPaddingLeft() + (((i4 - i2) - this.f847j) / 2);
        if (b3) {
            i6 = virtualChildCount - 1;
            i7 = -1;
        } else {
            i6 = 0;
            i7 = 1;
        }
        int i18 = 0;
        while (i18 < virtualChildCount) {
            int i19 = i6 + (i7 * i18);
            View o2 = o(i19);
            if (o2 == null) {
                paddingLeft += u(i19);
                z2 = z4;
                i8 = paddingTop;
                i9 = virtualChildCount;
                i10 = i17;
            } else if (o2.getVisibility() != 8) {
                int measuredWidth = o2.getMeasuredWidth();
                int measuredHeight = o2.getMeasuredHeight();
                a aVar = (a) o2.getLayoutParams();
                int i20 = i18;
                if (z3) {
                    i9 = virtualChildCount;
                    if (((ViewGroup.MarginLayoutParams) aVar).height != -1) {
                        i11 = o2.getBaseline();
                        i12 = aVar.f858b;
                        if (i12 < 0) {
                            i12 = i17;
                        }
                        i13 = i12 & 112;
                        i10 = i17;
                        if (i13 == 16) {
                            if (i13 == 48) {
                                i14 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + paddingTop;
                                if (i11 != -1) {
                                    z2 = true;
                                    i14 += iArr[1] - i11;
                                }
                            } else if (i13 != 80) {
                                i14 = paddingTop;
                            } else {
                                i14 = (paddingBottom - measuredHeight) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                                if (i11 != -1) {
                                    i14 -= iArr2[2] - (o2.getMeasuredHeight() - i11);
                                }
                            }
                            z2 = true;
                        } else {
                            z2 = true;
                            i14 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + ((ViewGroup.MarginLayoutParams) aVar).topMargin) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        }
                        if (p(i19)) {
                            paddingLeft += this.f853p;
                        }
                        int i21 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                        i8 = paddingTop;
                        w(o2, i21 + m(o2), i14, measuredWidth, measuredHeight);
                        int n2 = i21 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + n(o2);
                        i18 = i20 + l(o2, i19);
                        paddingLeft = n2;
                        i18++;
                        virtualChildCount = i9;
                        i17 = i10;
                        z4 = z2;
                        paddingTop = i8;
                    }
                } else {
                    i9 = virtualChildCount;
                }
                i11 = -1;
                i12 = aVar.f858b;
                if (i12 < 0) {
                }
                i13 = i12 & 112;
                i10 = i17;
                if (i13 == 16) {
                }
                if (p(i19)) {
                }
                int i212 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                i8 = paddingTop;
                w(o2, i212 + m(o2), i14, measuredWidth, measuredHeight);
                int n22 = i212 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + n(o2);
                i18 = i20 + l(o2, i19);
                paddingLeft = n22;
                i18++;
                virtualChildCount = i9;
                i17 = i10;
                z4 = z2;
                paddingTop = i8;
            } else {
                i8 = paddingTop;
                i9 = virtualChildCount;
                i10 = i17;
                z2 = true;
            }
            i18++;
            virtualChildCount = i9;
            i17 = i10;
            z4 = z2;
            paddingTop = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void r(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i4 - i2;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.f846i;
        int i11 = i10 & 112;
        int i12 = i10 & 8388615;
        int paddingTop = i11 != 16 ? i11 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f847j : getPaddingTop() + (((i5 - i3) - this.f847j) / 2);
        int i13 = 0;
        while (i13 < virtualChildCount) {
            View o2 = o(i13);
            if (o2 == null) {
                paddingTop += u(i13);
            } else if (o2.getVisibility() != 8) {
                int measuredWidth = o2.getMeasuredWidth();
                int measuredHeight = o2.getMeasuredHeight();
                a aVar = (a) o2.getLayoutParams();
                int i14 = aVar.f858b;
                if (i14 < 0) {
                    i14 = i12;
                }
                int a3 = androidx.core.view.e.a(i14, androidx.core.view.f0.n(this)) & 7;
                if (a3 == 1) {
                    i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                } else if (a3 != 5) {
                    i7 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                    int i15 = i7;
                    if (p(i13)) {
                        paddingTop += this.f854q;
                    }
                    int i16 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                    w(o2, i15, i16 + m(o2), measuredWidth, measuredHeight);
                    int n2 = i16 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + n(o2);
                    i13 += l(o2, i13);
                    paddingTop = n2;
                    i8 = 1;
                    i13 += i8;
                } else {
                    i6 = paddingRight - measuredWidth;
                }
                i7 = i6 - ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                int i152 = i7;
                if (p(i13)) {
                }
                int i162 = paddingTop + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                w(o2, i152, i162 + m(o2), measuredWidth, measuredHeight);
                int n22 = i162 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + n(o2);
                i13 += l(o2, i13);
                paddingTop = n22;
                i8 = 1;
                i13 += i8;
            }
            i8 = 1;
            i13 += i8;
        }
    }

    void s(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    public void setBaselineAligned(boolean z2) {
        this.f842e = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f843f = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f852o) {
            return;
        }
        this.f852o = drawable;
        if (drawable != null) {
            this.f853p = drawable.getIntrinsicWidth();
            this.f854q = drawable.getIntrinsicHeight();
        } else {
            this.f853p = 0;
            this.f854q = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f856s = i2;
    }

    public void setGravity(int i2) {
        if (this.f846i != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f846i = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f846i;
        if ((8388615 & i4) != i3) {
            this.f846i = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f849l = z2;
    }

    public void setOrientation(int i2) {
        if (this.f845h != i2) {
            this.f845h = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f855r) {
            requestLayout();
        }
        this.f855r = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f846i;
        if ((i4 & 112) != i3) {
            this.f846i = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f848k = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x03a4, code lost:
    
        if (r8 > 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03b1, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03b2, code lost:
    
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03af, code lost:
    
        if (r8 < 0) goto L169;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void t(int i2, int i3) {
        int[] iArr;
        int i4;
        int max;
        int i5;
        int i6;
        int max2;
        int i7;
        int i8;
        int i9;
        float f2;
        int i10;
        boolean z2;
        int baseline;
        int i11;
        int i12;
        int i13;
        char c3;
        int i14;
        int i15;
        boolean z3;
        boolean z4;
        View view;
        int max3;
        int i16;
        boolean z5;
        int measuredHeight;
        int l2;
        int baseline2;
        int i17;
        this.f847j = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (this.f850m == null || this.f851n == null) {
            this.f850m = new int[4];
            this.f851n = new int[4];
        }
        int[] iArr2 = this.f850m;
        int[] iArr3 = this.f851n;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z6 = this.f842e;
        boolean z7 = this.f849l;
        int i18 = 1073741824;
        boolean z8 = mode == 1073741824;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z9 = false;
        int i24 = 0;
        boolean z10 = false;
        boolean z11 = true;
        float f3 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (i19 >= virtualChildCount) {
                break;
            }
            View o2 = o(i19);
            if (o2 == null) {
                this.f847j += u(i19);
            } else if (o2.getVisibility() == 8) {
                i19 += l(o2, i19);
            } else {
                if (p(i19)) {
                    this.f847j += this.f853p;
                }
                a aVar = (a) o2.getLayoutParams();
                float f4 = aVar.f857a;
                float f5 = f3 + f4;
                if (mode == i18 && ((ViewGroup.MarginLayoutParams) aVar).width == 0 && f4 > 0.0f) {
                    int i25 = this.f847j;
                    this.f847j = z8 ? i25 + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : Math.max(i25, ((ViewGroup.MarginLayoutParams) aVar).leftMargin + i25 + ((ViewGroup.MarginLayoutParams) aVar).rightMargin);
                    if (z6) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        o2.measure(makeMeasureSpec, makeMeasureSpec);
                        i15 = i19;
                        z3 = z7;
                        z4 = z6;
                        view = o2;
                    } else {
                        i15 = i19;
                        z3 = z7;
                        z4 = z6;
                        view = o2;
                        z9 = true;
                        i16 = 1073741824;
                        if (mode2 == i16 && ((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                            z5 = true;
                            z10 = true;
                        } else {
                            z5 = false;
                        }
                        int i26 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i26;
                        i24 = View.combineMeasuredStates(i24, view.getMeasuredState());
                        if (z4 && (baseline2 = view.getBaseline()) != -1) {
                            i17 = aVar.f858b;
                            if (i17 < 0) {
                                i17 = this.f846i;
                            }
                            int i27 = (((i17 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i27] = Math.max(iArr2[i27], baseline2);
                            iArr[i27] = Math.max(iArr[i27], measuredHeight - baseline2);
                        }
                        i21 = Math.max(i21, measuredHeight);
                        z11 = !z11 && ((ViewGroup.MarginLayoutParams) aVar).height == -1;
                        if (aVar.f857a <= 0.0f) {
                            if (!z5) {
                                i26 = measuredHeight;
                            }
                            i23 = Math.max(i23, i26);
                        } else {
                            int i28 = i23;
                            if (!z5) {
                                i26 = measuredHeight;
                            }
                            i22 = Math.max(i22, i26);
                            i23 = i28;
                        }
                        int i29 = i15;
                        l2 = l(view, i29) + i29;
                        f3 = f5;
                        int i30 = l2 + 1;
                        iArr3 = iArr;
                        z7 = z3;
                        z6 = z4;
                        i18 = i16;
                        i19 = i30;
                    }
                } else {
                    if (((ViewGroup.MarginLayoutParams) aVar).width != 0 || f4 <= 0.0f) {
                        c3 = 65534;
                        i14 = Integer.MIN_VALUE;
                    } else {
                        c3 = 65534;
                        ((ViewGroup.MarginLayoutParams) aVar).width = -2;
                        i14 = 0;
                    }
                    i15 = i19;
                    int i31 = i14;
                    z3 = z7;
                    z4 = z6;
                    s(o2, i15, i2, f5 == 0.0f ? this.f847j : 0, i3, 0);
                    if (i31 != Integer.MIN_VALUE) {
                        ((ViewGroup.MarginLayoutParams) aVar).width = i31;
                    }
                    int measuredWidth = o2.getMeasuredWidth();
                    if (z8) {
                        view = o2;
                        max3 = this.f847j + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + n(view);
                    } else {
                        view = o2;
                        int i32 = this.f847j;
                        max3 = Math.max(i32, i32 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + n(view));
                    }
                    this.f847j = max3;
                    if (z3) {
                        i20 = Math.max(measuredWidth, i20);
                    }
                }
                i16 = 1073741824;
                if (mode2 == i16) {
                }
                z5 = false;
                int i262 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                measuredHeight = view.getMeasuredHeight() + i262;
                i24 = View.combineMeasuredStates(i24, view.getMeasuredState());
                if (z4) {
                    i17 = aVar.f858b;
                    if (i17 < 0) {
                    }
                    int i272 = (((i17 & 112) >> 4) & (-2)) >> 1;
                    iArr2[i272] = Math.max(iArr2[i272], baseline2);
                    iArr[i272] = Math.max(iArr[i272], measuredHeight - baseline2);
                }
                i21 = Math.max(i21, measuredHeight);
                if (z11) {
                }
                if (aVar.f857a <= 0.0f) {
                }
                int i292 = i15;
                l2 = l(view, i292) + i292;
                f3 = f5;
                int i302 = l2 + 1;
                iArr3 = iArr;
                z7 = z3;
                z6 = z4;
                i18 = i16;
                i19 = i302;
            }
            z3 = z7;
            z4 = z6;
            int i33 = i18;
            l2 = i19;
            i16 = i33;
            int i3022 = l2 + 1;
            iArr3 = iArr;
            z7 = z3;
            z6 = z4;
            i18 = i16;
            i19 = i3022;
        }
        boolean z12 = z7;
        boolean z13 = z6;
        int i34 = i21;
        int i35 = i22;
        int i36 = i23;
        int i37 = i24;
        if (this.f847j > 0 && p(virtualChildCount)) {
            this.f847j += this.f853p;
        }
        int i38 = iArr2[1];
        if (i38 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
            max = i34;
            i4 = i37;
        } else {
            i4 = i37;
            max = Math.max(i34, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i38, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z12 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f847j = 0;
            int i39 = 0;
            while (i39 < virtualChildCount) {
                View o3 = o(i39);
                if (o3 == null) {
                    this.f847j += u(i39);
                } else if (o3.getVisibility() == 8) {
                    i39 += l(o3, i39);
                } else {
                    a aVar2 = (a) o3.getLayoutParams();
                    int i40 = this.f847j;
                    if (z8) {
                        this.f847j = i40 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + i20 + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + n(o3);
                    } else {
                        i13 = max;
                        this.f847j = Math.max(i40, i40 + i20 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + n(o3));
                        i39++;
                        max = i13;
                    }
                }
                i13 = max;
                i39++;
                max = i13;
            }
        }
        int i41 = max;
        int paddingLeft = this.f847j + getPaddingLeft() + getPaddingRight();
        this.f847j = paddingLeft;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, 0);
        int i42 = (16777215 & resolveSizeAndState) - this.f847j;
        if (z9 || (i42 != 0 && f3 > 0.0f)) {
            float f6 = this.f848k;
            if (f6 > 0.0f) {
                f3 = f6;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f847j = 0;
            int i43 = i35;
            int i44 = -1;
            int i45 = i4;
            int i46 = 0;
            while (i46 < virtualChildCount) {
                View o4 = o(i46);
                if (o4 == null || o4.getVisibility() == 8) {
                    i8 = i42;
                    i9 = virtualChildCount;
                } else {
                    a aVar3 = (a) o4.getLayoutParams();
                    float f7 = aVar3.f857a;
                    if (f7 > 0.0f) {
                        int i47 = (int) ((i42 * f7) / f3);
                        float f8 = f3 - f7;
                        int i48 = i42 - i47;
                        i9 = virtualChildCount;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin, ((ViewGroup.MarginLayoutParams) aVar3).height);
                        if (((ViewGroup.MarginLayoutParams) aVar3).width == 0) {
                            i12 = 1073741824;
                            if (mode == 1073741824) {
                            }
                        } else {
                            i12 = 1073741824;
                        }
                        i47 = o4.getMeasuredWidth() + i47;
                    } else {
                        i8 = i42;
                        i9 = virtualChildCount;
                    }
                    int i49 = this.f847j;
                    if (z8) {
                        this.f847j = i49 + o4.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + n(o4);
                        f2 = f3;
                    } else {
                        f2 = f3;
                        this.f847j = Math.max(i49, o4.getMeasuredWidth() + i49 + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + n(o4));
                    }
                    boolean z14 = mode2 != 1073741824 && ((ViewGroup.MarginLayoutParams) aVar3).height == -1;
                    int i50 = ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = o4.getMeasuredHeight() + i50;
                    i44 = Math.max(i44, measuredHeight2);
                    if (!z14) {
                        i50 = measuredHeight2;
                    }
                    int max4 = Math.max(i43, i50);
                    if (z11) {
                        i10 = -1;
                        if (((ViewGroup.MarginLayoutParams) aVar3).height == -1) {
                            z2 = true;
                            if (z13 && (baseline = o4.getBaseline()) != i10) {
                                i11 = aVar3.f858b;
                                if (i11 < 0) {
                                    i11 = this.f846i;
                                }
                                int i51 = (((i11 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i51] = Math.max(iArr2[i51], baseline);
                                iArr[i51] = Math.max(iArr[i51], measuredHeight2 - baseline);
                            }
                            z11 = z2;
                            i43 = max4;
                            f3 = f2;
                        }
                    } else {
                        i10 = -1;
                    }
                    z2 = false;
                    if (z13) {
                        i11 = aVar3.f858b;
                        if (i11 < 0) {
                        }
                        int i512 = (((i11 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i512] = Math.max(iArr2[i512], baseline);
                        iArr[i512] = Math.max(iArr[i512], measuredHeight2 - baseline);
                    }
                    z11 = z2;
                    i43 = max4;
                    f3 = f2;
                }
                i46++;
                i42 = i8;
                virtualChildCount = i9;
            }
            i5 = i3;
            i6 = virtualChildCount;
            this.f847j += getPaddingLeft() + getPaddingRight();
            int i52 = iArr2[1];
            max2 = (i52 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i44 : Math.max(i44, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i52, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            i7 = i43;
            i4 = i45;
        } else {
            i7 = Math.max(i35, i36);
            if (z12 && mode != 1073741824) {
                for (int i53 = 0; i53 < virtualChildCount; i53++) {
                    View o5 = o(i53);
                    if (o5 != null && o5.getVisibility() != 8 && ((a) o5.getLayoutParams()).f857a > 0.0f) {
                        o5.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(o5.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i5 = i3;
            i6 = virtualChildCount;
            max2 = i41;
        }
        if (z11 || mode2 == 1073741824) {
            i7 = max2;
        }
        setMeasuredDimension(resolveSizeAndState | (i4 & (-16777216)), View.resolveSizeAndState(Math.max(i7 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, i4 << 16));
        if (z10) {
            g(i6, i2);
        }
    }

    int u(int i2) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x02cf, code lost:
    
        if (r15 > 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02dc, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02dd, code lost:
    
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02da, code lost:
    
        if (r15 < 0) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void v(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int max;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        View view;
        int max2;
        boolean z3;
        int max3;
        this.f847j = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i20 = this.f843f;
        boolean z4 = this.f849l;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z5 = false;
        boolean z6 = false;
        float f2 = 0.0f;
        boolean z7 = true;
        while (true) {
            int i27 = 8;
            int i28 = i24;
            if (i26 >= virtualChildCount) {
                int i29 = i21;
                int i30 = i23;
                int i31 = i25;
                int i32 = virtualChildCount;
                int i33 = mode2;
                int i34 = i22;
                if (this.f847j > 0) {
                    i4 = i32;
                    if (p(i4)) {
                        this.f847j += this.f854q;
                    }
                } else {
                    i4 = i32;
                }
                if (z4 && (i33 == Integer.MIN_VALUE || i33 == 0)) {
                    this.f847j = 0;
                    int i35 = 0;
                    while (i35 < i4) {
                        View o2 = o(i35);
                        if (o2 == null) {
                            max = this.f847j + u(i35);
                        } else if (o2.getVisibility() == i27) {
                            i35 += l(o2, i35);
                            i35++;
                            i27 = 8;
                        } else {
                            a aVar = (a) o2.getLayoutParams();
                            int i36 = this.f847j;
                            max = Math.max(i36, i36 + i30 + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + n(o2));
                        }
                        this.f847j = max;
                        i35++;
                        i27 = 8;
                    }
                }
                int paddingTop = this.f847j + getPaddingTop() + getPaddingBottom();
                this.f847j = paddingTop;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, 0);
                int i37 = (16777215 & resolveSizeAndState) - this.f847j;
                if (z5 || (i37 != 0 && f2 > 0.0f)) {
                    float f3 = this.f848k;
                    if (f3 > 0.0f) {
                        f2 = f3;
                    }
                    this.f847j = 0;
                    int i38 = i37;
                    int i39 = i31;
                    i5 = i29;
                    int i40 = 0;
                    while (i40 < i4) {
                        View o3 = o(i40);
                        if (o3.getVisibility() == 8) {
                            i8 = i38;
                        } else {
                            a aVar2 = (a) o3.getLayoutParams();
                            float f4 = aVar2.f857a;
                            if (f4 > 0.0f) {
                                int i41 = (int) ((i38 * f4) / f2);
                                float f5 = f2 - f4;
                                i8 = i38 - i41;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin, ((ViewGroup.MarginLayoutParams) aVar2).width);
                                if (((ViewGroup.MarginLayoutParams) aVar2).height == 0) {
                                    i11 = 1073741824;
                                    if (i33 == 1073741824) {
                                    }
                                } else {
                                    i11 = 1073741824;
                                }
                                i41 = o3.getMeasuredHeight() + i41;
                            } else {
                                i8 = i38;
                            }
                            int i42 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                            int measuredWidth = o3.getMeasuredWidth() + i42;
                            i34 = Math.max(i34, measuredWidth);
                            float f6 = f2;
                            if (mode != 1073741824) {
                                i9 = i5;
                                i10 = -1;
                                if (((ViewGroup.MarginLayoutParams) aVar2).width == -1) {
                                    z2 = true;
                                    if (!z2) {
                                        i42 = measuredWidth;
                                    }
                                    int max4 = Math.max(i39, i42);
                                    boolean z8 = !z7 && ((ViewGroup.MarginLayoutParams) aVar2).width == i10;
                                    int i43 = this.f847j;
                                    this.f847j = Math.max(i43, o3.getMeasuredHeight() + i43 + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin + n(o3));
                                    z7 = z8;
                                    i5 = i9;
                                    i39 = max4;
                                    f2 = f6;
                                }
                            } else {
                                i9 = i5;
                                i10 = -1;
                            }
                            z2 = false;
                            if (!z2) {
                            }
                            int max42 = Math.max(i39, i42);
                            if (z7) {
                            }
                            int i432 = this.f847j;
                            this.f847j = Math.max(i432, o3.getMeasuredHeight() + i432 + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin + n(o3));
                            z7 = z8;
                            i5 = i9;
                            i39 = max42;
                            f2 = f6;
                        }
                        i40++;
                        i38 = i8;
                    }
                    i6 = i2;
                    this.f847j += getPaddingTop() + getPaddingBottom();
                    i7 = i39;
                } else {
                    i7 = Math.max(i31, i28);
                    if (z4 && i33 != 1073741824) {
                        for (int i44 = 0; i44 < i4; i44++) {
                            View o4 = o(i44);
                            if (o4 != null && o4.getVisibility() != 8 && ((a) o4.getLayoutParams()).f857a > 0.0f) {
                                o4.measure(View.MeasureSpec.makeMeasureSpec(o4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i30, 1073741824));
                            }
                        }
                    }
                    i6 = i2;
                    i5 = i29;
                }
                if (z7 || mode == 1073741824) {
                    i7 = i34;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i7 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i6, i5), resolveSizeAndState);
                if (z6) {
                    h(i4, i3);
                    return;
                }
                return;
            }
            View o5 = o(i26);
            if (o5 == null) {
                this.f847j += u(i26);
                i15 = virtualChildCount;
                i16 = mode2;
                i24 = i28;
            } else {
                int i45 = i21;
                if (o5.getVisibility() == 8) {
                    i26 += l(o5, i26);
                    i15 = virtualChildCount;
                    i24 = i28;
                    i21 = i45;
                    i16 = mode2;
                } else {
                    if (p(i26)) {
                        this.f847j += this.f854q;
                    }
                    a aVar3 = (a) o5.getLayoutParams();
                    float f7 = aVar3.f857a;
                    float f8 = f2 + f7;
                    if (mode2 == 1073741824 && ((ViewGroup.MarginLayoutParams) aVar3).height == 0 && f7 > 0.0f) {
                        int i46 = this.f847j;
                        this.f847j = Math.max(i46, ((ViewGroup.MarginLayoutParams) aVar3).topMargin + i46 + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin);
                        max2 = i23;
                        view = o5;
                        i18 = i25;
                        z5 = true;
                        i13 = i45;
                        i14 = i22;
                        i15 = virtualChildCount;
                        i16 = mode2;
                        i17 = i28;
                        i19 = i26;
                    } else {
                        int i47 = i22;
                        if (((ViewGroup.MarginLayoutParams) aVar3).height != 0 || f7 <= 0.0f) {
                            i12 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = -2;
                            i12 = 0;
                        }
                        i13 = i45;
                        int i48 = i12;
                        i14 = i47;
                        int i49 = i23;
                        i15 = virtualChildCount;
                        i16 = mode2;
                        i17 = i28;
                        i18 = i25;
                        i19 = i26;
                        s(o5, i26, i2, 0, i3, f8 == 0.0f ? this.f847j : 0);
                        if (i48 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = i48;
                        }
                        int measuredHeight = o5.getMeasuredHeight();
                        int i50 = this.f847j;
                        view = o5;
                        this.f847j = Math.max(i50, i50 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin + n(view));
                        max2 = z4 ? Math.max(measuredHeight, i49) : i49;
                    }
                    if (i20 >= 0 && i20 == i19 + 1) {
                        this.f844g = this.f847j;
                    }
                    if (i19 < i20 && aVar3.f857a > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((ViewGroup.MarginLayoutParams) aVar3).width != -1) {
                        z3 = false;
                    } else {
                        z3 = true;
                        z6 = true;
                    }
                    int i51 = ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i51;
                    int max5 = Math.max(i14, measuredWidth2);
                    int combineMeasuredStates = View.combineMeasuredStates(i13, view.getMeasuredState());
                    z7 = z7 && ((ViewGroup.MarginLayoutParams) aVar3).width == -1;
                    if (aVar3.f857a > 0.0f) {
                        if (!z3) {
                            i51 = measuredWidth2;
                        }
                        i24 = Math.max(i17, i51);
                        max3 = i18;
                    } else {
                        if (!z3) {
                            i51 = measuredWidth2;
                        }
                        max3 = Math.max(i18, i51);
                        i24 = i17;
                    }
                    int l2 = l(view, i19) + i19;
                    i23 = max2;
                    f2 = f8;
                    i25 = max3;
                    i21 = combineMeasuredStates;
                    i26 = l2;
                    i22 = max5;
                }
            }
            i26++;
            mode2 = i16;
            virtualChildCount = i15;
        }
    }
}
