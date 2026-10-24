package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    protected final C0012a f584e;

    /* renamed from: f, reason: collision with root package name */
    protected final Context f585f;

    /* renamed from: g, reason: collision with root package name */
    protected ActionMenuView f586g;

    /* renamed from: h, reason: collision with root package name */
    protected c f587h;

    /* renamed from: i, reason: collision with root package name */
    protected int f588i;

    /* renamed from: j, reason: collision with root package name */
    protected androidx.core.view.c1 f589j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f590k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f591l;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0012a implements androidx.core.view.d1 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f592a = false;

        /* renamed from: b, reason: collision with root package name */
        int f593b;

        protected C0012a() {
        }

        @Override // androidx.core.view.d1
        public void a(View view) {
            this.f592a = true;
        }

        @Override // androidx.core.view.d1
        public void b(View view) {
            if (this.f592a) {
                return;
            }
            a aVar = a.this;
            aVar.f589j = null;
            a.super.setVisibility(this.f593b);
        }

        @Override // androidx.core.view.d1
        public void c(View view) {
            a.super.setVisibility(0);
            this.f592a = false;
        }

        public C0012a d(androidx.core.view.c1 c1Var, int i2) {
            a.this.f589j = c1Var;
            this.f593b = i2;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f584e = new C0012a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(b.a.f2150a, typedValue, true) || typedValue.resourceId == 0) {
            this.f585f = context;
        } else {
            this.f585f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i2, int i3, boolean z2) {
        return z2 ? i2 - i3 : i2 + i3;
    }

    protected int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    protected int e(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.c1 f(int i2, long j2) {
        androidx.core.view.c1 b3;
        androidx.core.view.c1 c1Var = this.f589j;
        if (c1Var != null) {
            c1Var.c();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b3 = androidx.core.view.f0.b(this).b(1.0f);
        } else {
            b3 = androidx.core.view.f0.b(this).b(0.0f);
        }
        b3.f(j2);
        b3.h(this.f584e.d(b3, i2));
        return b3;
    }

    public int getAnimatedVisibility() {
        return this.f589j != null ? this.f584e.f593b : getVisibility();
    }

    public int getContentHeight() {
        return this.f588i;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, b.j.f2285a, b.a.f2152c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(b.j.f2317j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f587h;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f591l = false;
        }
        if (!this.f591l) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f591l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f591l = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f590k = false;
        }
        if (!this.f590k) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f590k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f590k = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f588i = i2;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            androidx.core.view.c1 c1Var = this.f589j;
            if (c1Var != null) {
                c1Var.c();
            }
            super.setVisibility(i2);
        }
    }
}
