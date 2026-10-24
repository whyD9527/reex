package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f485e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f486f;

    /* renamed from: g, reason: collision with root package name */
    private TypedValue f487g;

    /* renamed from: h, reason: collision with root package name */
    private TypedValue f488h;

    /* renamed from: i, reason: collision with root package name */
    private TypedValue f489i;

    /* renamed from: j, reason: collision with root package name */
    private TypedValue f490j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f491k;

    /* renamed from: l, reason: collision with root package name */
    private a f492l;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f491k = new Rect();
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.f491k.set(i2, i3, i4, i5);
        if (androidx.core.view.f0.w(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f489i == null) {
            this.f489i = new TypedValue();
        }
        return this.f489i;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f490j == null) {
            this.f490j = new TypedValue();
        }
        return this.f490j;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f487g == null) {
            this.f487g = new TypedValue();
        }
        return this.f487g;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f488h == null) {
            this.f488h = new TypedValue();
        }
        return this.f488h;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f485e == null) {
            this.f485e = new TypedValue();
        }
        return this.f485e;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f486f == null) {
            this.f486f = new TypedValue();
        }
        return this.f486f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f492l;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f492l;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i2, int i3) {
        boolean z2;
        int measuredWidth;
        TypedValue typedValue;
        int i4;
        int i5;
        float fraction;
        int i6;
        int i7;
        float fraction2;
        int i8;
        int i9;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z4 ? this.f488h : this.f487g;
            if (typedValue2 != null && (i8 = typedValue2.type) != 0) {
                if (i8 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i8 == 6) {
                    int i10 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i10, i10);
                } else {
                    i9 = 0;
                    if (i9 > 0) {
                        Rect rect = this.f491k;
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect.left + rect.right), View.MeasureSpec.getSize(i2)), 1073741824);
                        z2 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z4 ? this.f489i : this.f490j;
                            if (typedValue3 != null && (i6 = typedValue3.type) != 0) {
                                if (i6 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i6 == 6) {
                                    int i11 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i11, i11);
                                } else {
                                    i7 = 0;
                                    if (i7 > 0) {
                                        Rect rect2 = this.f491k;
                                        i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i7 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i3)), 1073741824);
                                    }
                                }
                                i7 = (int) fraction2;
                                if (i7 > 0) {
                                }
                            }
                        }
                        super.onMeasure(i2, i3);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z2 && mode == Integer.MIN_VALUE) {
                            typedValue = !z4 ? this.f486f : this.f485e;
                            if (typedValue != null && (i4 = typedValue.type) != 0) {
                                if (i4 != 5) {
                                    fraction = typedValue.getDimension(displayMetrics);
                                } else if (i4 == 6) {
                                    int i12 = displayMetrics.widthPixels;
                                    fraction = typedValue.getFraction(i12, i12);
                                } else {
                                    i5 = 0;
                                    if (i5 > 0) {
                                        Rect rect3 = this.f491k;
                                        i5 -= rect3.left + rect3.right;
                                    }
                                    if (measuredWidth < i5) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                        if (z3) {
                                            super.onMeasure(makeMeasureSpec, i3);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i5 = (int) fraction;
                                if (i5 > 0) {
                                }
                                if (measuredWidth < i5) {
                                }
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                    }
                }
                i9 = (int) fraction3;
                if (i9 > 0) {
                }
            }
        }
        z2 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        super.onMeasure(i2, i3);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z2) {
            if (!z4) {
            }
            if (typedValue != null) {
                if (i4 != 5) {
                }
                i5 = (int) fraction;
                if (i5 > 0) {
                }
                if (measuredWidth < i5) {
                }
            }
        }
        z3 = false;
        if (z3) {
        }
    }

    public void setAttachListener(a aVar) {
        this.f492l = aVar;
    }
}
