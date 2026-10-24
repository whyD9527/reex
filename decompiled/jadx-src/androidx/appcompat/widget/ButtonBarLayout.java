package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    private boolean f482e;

    /* renamed from: f, reason: collision with root package name */
    private int f483f;

    /* renamed from: g, reason: collision with root package name */
    private int f484g;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f483f = -1;
        this.f484g = 0;
        int[] iArr = b.j.O0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        androidx.core.view.f0.F(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f482e = obtainStyledAttributes.getBoolean(b.j.P0, true);
        obtainStyledAttributes.recycle();
    }

    private int a(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private boolean b() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z2) {
        setOrientation(z2 ? 1 : 0);
        setGravity(z2 ? 5 : 80);
        View findViewById = findViewById(b.f.G);
        if (findViewById != null) {
            findViewById.setVisibility(z2 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f484g, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int size = View.MeasureSpec.getSize(i2);
        int i5 = 0;
        if (this.f482e) {
            if (size > this.f483f && b()) {
                setStacked(false);
            }
            this.f483f = size;
        }
        if (b() || View.MeasureSpec.getMode(i2) != 1073741824) {
            i4 = i2;
            z2 = false;
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(i4, i3);
        if (this.f482e && !b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z2 = true;
            }
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int a3 = a(0);
        if (a3 >= 0) {
            View childAt = getChildAt(a3);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int a4 = a(a3 + 1);
                if (a4 >= 0) {
                    paddingTop += getChildAt(a4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i5 = paddingTop;
            } else {
                i5 = paddingTop + getPaddingBottom();
            }
        }
        if (androidx.core.view.f0.o(this) != i5) {
            setMinimumHeight(i5);
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f482e != z2) {
            this.f482e = z2;
            if (!z2 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
