package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class u0 implements h.e {
    private static Method K;
    private static Method L;
    private static Method M;
    final g A;
    private final f B;
    private final e C;
    private final c D;
    private Runnable E;
    final Handler F;
    private final Rect G;
    private Rect H;
    private boolean I;
    PopupWindow J;

    /* renamed from: e, reason: collision with root package name */
    private Context f867e;

    /* renamed from: f, reason: collision with root package name */
    private ListAdapter f868f;

    /* renamed from: g, reason: collision with root package name */
    n0 f869g;

    /* renamed from: h, reason: collision with root package name */
    private int f870h;

    /* renamed from: i, reason: collision with root package name */
    private int f871i;

    /* renamed from: j, reason: collision with root package name */
    private int f872j;

    /* renamed from: k, reason: collision with root package name */
    private int f873k;

    /* renamed from: l, reason: collision with root package name */
    private int f874l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f875m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f876n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f877o;

    /* renamed from: p, reason: collision with root package name */
    private int f878p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f879q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f880r;

    /* renamed from: s, reason: collision with root package name */
    int f881s;

    /* renamed from: t, reason: collision with root package name */
    private View f882t;

    /* renamed from: u, reason: collision with root package name */
    private int f883u;

    /* renamed from: v, reason: collision with root package name */
    private DataSetObserver f884v;

    /* renamed from: w, reason: collision with root package name */
    private View f885w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f886x;

    /* renamed from: y, reason: collision with root package name */
    private AdapterView.OnItemClickListener f887y;

    /* renamed from: z, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f888z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t2 = u0.this.t();
            if (t2 == null || t2.getWindowToken() == null) {
                return;
            }
            u0.this.a();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            n0 n0Var;
            if (i2 == -1 || (n0Var = u0.this.f869g) == null) {
                return;
            }
            n0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.r();
        }
    }

    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (u0.this.c()) {
                u0.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            u0.this.dismiss();
        }
    }

    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || u0.this.w() || u0.this.J.getContentView() == null) {
                return;
            }
            u0 u0Var = u0.this;
            u0Var.F.removeCallbacks(u0Var.A);
            u0.this.A.run();
        }
    }

    private class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = u0.this.J) != null && popupWindow.isShowing() && x2 >= 0 && x2 < u0.this.J.getWidth() && y2 >= 0 && y2 < u0.this.J.getHeight()) {
                u0 u0Var = u0.this;
                u0Var.F.postDelayed(u0Var.A, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            u0 u0Var2 = u0.this;
            u0Var2.F.removeCallbacks(u0Var2.A);
            return false;
        }
    }

    private class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n0 n0Var = u0.this.f869g;
            if (n0Var == null || !androidx.core.view.f0.v(n0Var) || u0.this.f869g.getCount() <= u0.this.f869g.getChildCount()) {
                return;
            }
            int childCount = u0.this.f869g.getChildCount();
            u0 u0Var = u0.this;
            if (childCount <= u0Var.f881s) {
                u0Var.J.setInputMethodMode(2);
                u0.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                K = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                L = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public u0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public u0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f870h = -2;
        this.f871i = -2;
        this.f874l = 1002;
        this.f878p = 0;
        this.f879q = false;
        this.f880r = false;
        this.f881s = Integer.MAX_VALUE;
        this.f883u = 0;
        this.A = new g();
        this.B = new f();
        this.C = new e();
        this.D = new c();
        this.G = new Rect();
        this.f867e = context;
        this.F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.j.f2334o1, i2, i3);
        this.f872j = obtainStyledAttributes.getDimensionPixelOffset(b.j.f2337p1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(b.j.f2340q1, 0);
        this.f873k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f875m = true;
        }
        obtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i2, i3);
        this.J = qVar;
        qVar.setInputMethodMode(1);
    }

    private void J(boolean z2) {
        if (Build.VERSION.SDK_INT > 28) {
            this.J.setIsClippedToScreen(z2);
            return;
        }
        Method method = K;
        if (method != null) {
            try {
                method.invoke(this.J, Boolean.valueOf(z2));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int q() {
        int i2;
        int i3;
        int makeMeasureSpec;
        int d3;
        int i4;
        int i5 = Integer.MIN_VALUE;
        if (this.f869g == null) {
            Context context = this.f867e;
            this.E = new a();
            n0 s2 = s(context, !this.I);
            this.f869g = s2;
            Drawable drawable = this.f886x;
            if (drawable != null) {
                s2.setSelector(drawable);
            }
            this.f869g.setAdapter(this.f868f);
            this.f869g.setOnItemClickListener(this.f887y);
            this.f869g.setFocusable(true);
            this.f869g.setFocusableInTouchMode(true);
            this.f869g.setOnItemSelectedListener(new b());
            this.f869g.setOnScrollListener(this.C);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f888z;
            if (onItemSelectedListener != null) {
                this.f869g.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f869g;
            View view2 = this.f882t;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i6 = this.f883u;
                if (i6 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i6 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f883u);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i7 = this.f871i;
                if (i7 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i7 = 0;
                    i4 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i7, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i2 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i2 = 0;
            }
            this.J.setContentView(view);
        } else {
            View view3 = this.f882t;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i2 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.J.getBackground();
        if (background != null) {
            background.getPadding(this.G);
            Rect rect = this.G;
            int i8 = rect.top;
            i3 = rect.bottom + i8;
            if (!this.f875m) {
                this.f873k = -i8;
            }
        } else {
            this.G.setEmpty();
            i3 = 0;
        }
        int u2 = u(t(), this.f873k, this.J.getInputMethodMode() == 2);
        if (this.f879q || this.f870h == -1) {
            return u2 + i3;
        }
        int i9 = this.f871i;
        if (i9 != -2) {
            i5 = 1073741824;
            if (i9 != -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                d3 = this.f869g.d(makeMeasureSpec, 0, -1, u2 - i2, -1);
                if (d3 > 0) {
                    i2 += i3 + this.f869g.getPaddingTop() + this.f869g.getPaddingBottom();
                }
                return d3 + i2;
            }
        }
        int i10 = this.f867e.getResources().getDisplayMetrics().widthPixels;
        Rect rect2 = this.G;
        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect2.left + rect2.right), i5);
        d3 = this.f869g.d(makeMeasureSpec, 0, -1, u2 - i2, -1);
        if (d3 > 0) {
        }
        return d3 + i2;
    }

    private int u(View view, int i2, boolean z2) {
        int maxAvailableHeight;
        if (Build.VERSION.SDK_INT > 23) {
            maxAvailableHeight = this.J.getMaxAvailableHeight(view, i2, z2);
            return maxAvailableHeight;
        }
        Method method = L;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.J, view, Integer.valueOf(i2), Boolean.valueOf(z2))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.J.getMaxAvailableHeight(view, i2);
    }

    private void y() {
        View view = this.f882t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f882t);
            }
        }
    }

    public void A(int i2) {
        this.J.setAnimationStyle(i2);
    }

    public void B(int i2) {
        Drawable background = this.J.getBackground();
        if (background == null) {
            M(i2);
            return;
        }
        background.getPadding(this.G);
        Rect rect = this.G;
        this.f871i = rect.left + rect.right + i2;
    }

    public void C(int i2) {
        this.f878p = i2;
    }

    public void D(Rect rect) {
        this.H = rect != null ? new Rect(rect) : null;
    }

    public void E(int i2) {
        this.J.setInputMethodMode(i2);
    }

    public void F(boolean z2) {
        this.I = z2;
        this.J.setFocusable(z2);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.J.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.f887y = onItemClickListener;
    }

    public void I(boolean z2) {
        this.f877o = true;
        this.f876n = z2;
    }

    public void K(int i2) {
        this.f883u = i2;
    }

    public void L(int i2) {
        n0 n0Var = this.f869g;
        if (!c() || n0Var == null) {
            return;
        }
        n0Var.setListSelectionHidden(false);
        n0Var.setSelection(i2);
        if (n0Var.getChoiceMode() != 0) {
            n0Var.setItemChecked(i2, true);
        }
    }

    public void M(int i2) {
        this.f871i = i2;
    }

    @Override // h.e
    public void a() {
        int q2 = q();
        boolean w2 = w();
        androidx.core.widget.j.b(this.J, this.f874l);
        if (this.J.isShowing()) {
            if (androidx.core.view.f0.v(t())) {
                int i2 = this.f871i;
                if (i2 == -1) {
                    i2 = -1;
                } else if (i2 == -2) {
                    i2 = t().getWidth();
                }
                int i3 = this.f870h;
                if (i3 == -1) {
                    if (!w2) {
                        q2 = -1;
                    }
                    if (w2) {
                        this.J.setWidth(this.f871i == -1 ? -1 : 0);
                        this.J.setHeight(0);
                    } else {
                        this.J.setWidth(this.f871i == -1 ? -1 : 0);
                        this.J.setHeight(-1);
                    }
                } else if (i3 != -2) {
                    q2 = i3;
                }
                this.J.setOutsideTouchable((this.f880r || this.f879q) ? false : true);
                this.J.update(t(), this.f872j, this.f873k, i2 < 0 ? -1 : i2, q2 < 0 ? -1 : q2);
                return;
            }
            return;
        }
        int i4 = this.f871i;
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = t().getWidth();
        }
        int i5 = this.f870h;
        if (i5 == -1) {
            q2 = -1;
        } else if (i5 != -2) {
            q2 = i5;
        }
        this.J.setWidth(i4);
        this.J.setHeight(q2);
        J(true);
        this.J.setOutsideTouchable((this.f880r || this.f879q) ? false : true);
        this.J.setTouchInterceptor(this.B);
        if (this.f877o) {
            androidx.core.widget.j.a(this.J, this.f876n);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = M;
            if (method != null) {
                try {
                    method.invoke(this.J, this.H);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            this.J.setEpicenterBounds(this.H);
        }
        androidx.core.widget.j.c(this.J, t(), this.f872j, this.f873k, this.f878p);
        this.f869g.setSelection(-1);
        if (!this.I || this.f869g.isInTouchMode()) {
            r();
        }
        if (this.I) {
            return;
        }
        this.F.post(this.D);
    }

    @Override // h.e
    public boolean c() {
        return this.J.isShowing();
    }

    public int d() {
        return this.f872j;
    }

    @Override // h.e
    public void dismiss() {
        this.J.dismiss();
        y();
        this.J.setContentView(null);
        this.f869g = null;
        this.F.removeCallbacks(this.A);
    }

    public Drawable f() {
        return this.J.getBackground();
    }

    @Override // h.e
    public ListView g() {
        return this.f869g;
    }

    public void i(Drawable drawable) {
        this.J.setBackgroundDrawable(drawable);
    }

    public void j(int i2) {
        this.f873k = i2;
        this.f875m = true;
    }

    public void l(int i2) {
        this.f872j = i2;
    }

    public int n() {
        if (this.f875m) {
            return this.f873k;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f884v;
        if (dataSetObserver == null) {
            this.f884v = new d();
        } else {
            ListAdapter listAdapter2 = this.f868f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f868f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f884v);
        }
        n0 n0Var = this.f869g;
        if (n0Var != null) {
            n0Var.setAdapter(this.f868f);
        }
    }

    public void r() {
        n0 n0Var = this.f869g;
        if (n0Var != null) {
            n0Var.setListSelectionHidden(true);
            n0Var.requestLayout();
        }
    }

    n0 s(Context context, boolean z2) {
        return new n0(context, z2);
    }

    public View t() {
        return this.f885w;
    }

    public int v() {
        return this.f871i;
    }

    public boolean w() {
        return this.J.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.I;
    }

    public void z(View view) {
        this.f885w = view;
    }
}
