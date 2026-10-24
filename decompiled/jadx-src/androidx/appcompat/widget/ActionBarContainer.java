package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private boolean f419e;

    /* renamed from: f, reason: collision with root package name */
    private View f420f;

    /* renamed from: g, reason: collision with root package name */
    private View f421g;

    /* renamed from: h, reason: collision with root package name */
    private View f422h;

    /* renamed from: i, reason: collision with root package name */
    Drawable f423i;

    /* renamed from: j, reason: collision with root package name */
    Drawable f424j;

    /* renamed from: k, reason: collision with root package name */
    Drawable f425k;

    /* renamed from: l, reason: collision with root package name */
    boolean f426l;

    /* renamed from: m, reason: collision with root package name */
    boolean f427m;

    /* renamed from: n, reason: collision with root package name */
    private int f428n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.f0.I(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.j.f2285a);
        this.f423i = obtainStyledAttributes.getDrawable(b.j.f2289b);
        this.f424j = obtainStyledAttributes.getDrawable(b.j.f2297d);
        this.f428n = obtainStyledAttributes.getDimensionPixelSize(b.j.f2317j, -1);
        boolean z2 = true;
        if (getId() == b.f.H) {
            this.f426l = true;
            this.f425k = obtainStyledAttributes.getDrawable(b.j.f2293c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f426l ? this.f423i != null || this.f424j != null : this.f425k != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f423i;
        if (drawable != null && drawable.isStateful()) {
            this.f423i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f424j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f424j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f425k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f425k.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f420f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f423i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f424j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f425k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f421g = findViewById(b.f.f2223a);
        this.f422h = findViewById(b.f.f2228f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f419e || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z2, i2, i3, i4, i5);
        View view2 = this.f420f;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i6 = layoutParams.bottomMargin;
            view2.layout(i2, measuredHeight2 - i6, i4, measuredHeight - i6);
        }
        if (this.f426l) {
            Drawable drawable3 = this.f425k;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z3 = z4;
        } else {
            if (this.f423i != null) {
                if (this.f421g.getVisibility() == 0) {
                    drawable2 = this.f423i;
                    left = this.f421g.getLeft();
                    top = this.f421g.getTop();
                    right = this.f421g.getRight();
                    view = this.f421g;
                } else {
                    View view3 = this.f422h;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f423i.setBounds(0, 0, 0, 0);
                        z4 = true;
                    } else {
                        drawable2 = this.f423i;
                        left = this.f422h.getLeft();
                        top = this.f422h.getTop();
                        right = this.f422h.getRight();
                        view = this.f422h;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z4 = true;
            }
            this.f427m = z5;
            if (z5 && (drawable = this.f424j) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
            z3 = z4;
        }
        if (z3) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        int i4;
        View view;
        int i5;
        if (this.f421g == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i5 = this.f428n) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f421g == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        View view2 = this.f420f;
        if (view2 == null || view2.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!b(this.f421g)) {
            view = this.f421g;
        } else {
            if (b(this.f422h)) {
                i4 = 0;
                setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + a(this.f420f), mode != Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
            }
            view = this.f422h;
        }
        i4 = a(view);
        setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + a(this.f420f), mode != Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f423i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f423i);
        }
        this.f423i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f421g;
            if (view != null) {
                this.f423i.setBounds(view.getLeft(), this.f421g.getTop(), this.f421g.getRight(), this.f421g.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f426l ? this.f423i != null || this.f424j != null : this.f425k != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f425k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f425k);
        }
        this.f425k = drawable;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f426l && (drawable2 = this.f425k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f426l ? !(this.f423i != null || this.f424j != null) : this.f425k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f424j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f424j);
        }
        this.f424j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f427m && (drawable2 = this.f424j) != null) {
                drawable2.setBounds(this.f420f.getLeft(), this.f420f.getTop(), this.f420f.getRight(), this.f420f.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f426l ? this.f423i != null || this.f424j != null : this.f425k != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(b1 b1Var) {
        View view = this.f420f;
        if (view != null) {
            removeView(view);
        }
        this.f420f = b1Var;
        if (b1Var != null) {
            addView(b1Var);
            ViewGroup.LayoutParams layoutParams = b1Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            b1Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z2) {
        this.f419e = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f423i;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f424j;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f425k;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f423i && !this.f426l) || (drawable == this.f424j && this.f427m) || ((drawable == this.f425k && this.f426l) || super.verifyDrawable(drawable));
    }
}
