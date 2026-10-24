package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class n0 extends ListView {

    /* renamed from: e, reason: collision with root package name */
    private final Rect f798e;

    /* renamed from: f, reason: collision with root package name */
    private int f799f;

    /* renamed from: g, reason: collision with root package name */
    private int f800g;

    /* renamed from: h, reason: collision with root package name */
    private int f801h;

    /* renamed from: i, reason: collision with root package name */
    private int f802i;

    /* renamed from: j, reason: collision with root package name */
    private int f803j;

    /* renamed from: k, reason: collision with root package name */
    private Field f804k;

    /* renamed from: l, reason: collision with root package name */
    private a f805l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f806m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f807n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f808o;

    /* renamed from: p, reason: collision with root package name */
    private androidx.core.view.c1 f809p;

    /* renamed from: q, reason: collision with root package name */
    private androidx.core.widget.h f810q;

    /* renamed from: r, reason: collision with root package name */
    b f811r;

    private static class a extends e.c {

        /* renamed from: f, reason: collision with root package name */
        private boolean f812f;

        a(Drawable drawable) {
            super(drawable);
            this.f812f = true;
        }

        void c(boolean z2) {
            this.f812f = z2;
        }

        @Override // e.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f812f) {
                super.draw(canvas);
            }
        }

        @Override // e.c, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f812f) {
                super.setHotspot(f2, f3);
            }
        }

        @Override // e.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f812f) {
                super.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        @Override // e.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f812f) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // e.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z2, boolean z3) {
            if (this.f812f) {
                return super.setVisible(z2, z3);
            }
            return false;
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void a() {
            n0 n0Var = n0.this;
            n0Var.f811r = null;
            n0Var.removeCallbacks(this);
        }

        public void b() {
            n0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            n0 n0Var = n0.this;
            n0Var.f811r = null;
            n0Var.drawableStateChanged();
        }
    }

    n0(Context context, boolean z2) {
        super(context, null, b.a.f2175z);
        this.f798e = new Rect();
        this.f799f = 0;
        this.f800g = 0;
        this.f801h = 0;
        this.f802i = 0;
        this.f807n = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f804k = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
    }

    private void a() {
        this.f808o = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f803j - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.c1 c1Var = this.f809p;
        if (c1Var != null) {
            c1Var.c();
            this.f809p = null;
        }
    }

    private void b(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f798e.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f798e);
        selector.draw(canvas);
    }

    private void f(int i2, View view) {
        Rect rect = this.f798e;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f799f;
        rect.top -= this.f800g;
        rect.right += this.f801h;
        rect.bottom += this.f802i;
        try {
            boolean z2 = this.f804k.getBoolean(this);
            if (view.isEnabled() != z2) {
                this.f804k.set(this, Boolean.valueOf(!z2));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
        }
    }

    private void g(int i2, View view) {
        Drawable selector = getSelector();
        boolean z2 = (selector == null || i2 == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        f(i2, view);
        if (z2) {
            Rect rect = this.f798e;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.j(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i2, View view, float f2, float f3) {
        g(i2, view);
        Drawable selector = getSelector();
        if (selector == null || i2 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.j(selector, f2, f3);
    }

    private void i(View view, int i2, float f2, float f3) {
        View childAt;
        this.f808o = true;
        drawableHotspotChanged(f2, f3);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f803j;
        if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f803j = i2;
        view.drawableHotspotChanged(f2 - view.getLeft(), f3 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i2, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return this.f808o;
    }

    private void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z2) {
        a aVar = this.f805l;
        if (aVar != null) {
            aVar.c(z2);
        }
    }

    public int d(int i2, int i3, int i4, int i5, int i6) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i7 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i7;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        View view = null;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i2, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i5) {
                return (i6 < 0 || i8 <= i6 || i10 <= 0 || i7 == i5) ? i5 : i10;
            }
            if (i6 >= 0 && i8 >= i6) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f811r != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(MotionEvent motionEvent, int i2) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z2 = false;
        } else if (actionMasked == 2) {
            z2 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        if (findPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(findPointerIndex);
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x2, y2);
            if (pointToPosition != -1) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                i(childAt, pointToPosition, x2, y2);
                if (actionMasked == 1) {
                    b(childAt, pointToPosition);
                }
                z3 = false;
                z2 = true;
                if (z2) {
                }
                a();
                if (z2) {
                }
                return z2;
            }
            z3 = true;
            if (z2 || z3) {
                a();
            }
            if (z2) {
                if (this.f810q == null) {
                    this.f810q = new androidx.core.widget.h(this);
                }
                this.f810q.m(true);
                this.f810q.onTouch(this, motionEvent);
            } else {
                androidx.core.widget.h hVar = this.f810q;
                if (hVar != null) {
                    hVar.m(false);
                }
            }
            return z2;
        }
        z3 = false;
        z2 = false;
        if (z2) {
        }
        a();
        if (z2) {
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f807n || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f807n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f807n || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f807n && this.f806m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f811r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f811r == null) {
            b bVar = new b();
            this.f811r = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f803j = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f811r;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z2) {
        this.f806m = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f805l = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f799f = rect.left;
        this.f800g = rect.top;
        this.f801h = rect.right;
        this.f802i = rect.bottom;
    }
}
