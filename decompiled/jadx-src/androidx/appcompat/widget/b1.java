package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.q0;
import c.a;

/* loaded from: classes.dex */
public class b1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: n, reason: collision with root package name */
    private static final Interpolator f604n = new DecelerateInterpolator();

    /* renamed from: e, reason: collision with root package name */
    Runnable f605e;

    /* renamed from: f, reason: collision with root package name */
    private c f606f;

    /* renamed from: g, reason: collision with root package name */
    q0 f607g;

    /* renamed from: h, reason: collision with root package name */
    private Spinner f608h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f609i;

    /* renamed from: j, reason: collision with root package name */
    int f610j;

    /* renamed from: k, reason: collision with root package name */
    int f611k;

    /* renamed from: l, reason: collision with root package name */
    private int f612l;

    /* renamed from: m, reason: collision with root package name */
    private int f613m;

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f614e;

        a(View view) {
            this.f614e = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            b1.this.smoothScrollTo(this.f614e.getLeft() - ((b1.this.getWidth() - this.f614e.getWidth()) / 2), 0);
            b1.this.f605e = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return b1.this.f607g.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((d) b1.this.f607g.getChildAt(i2)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return b1.this.c((a.c) getItem(i2), true);
            }
            ((d) view).a((a.c) getItem(i2));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = b1.this.f607g.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = b1.this.f607g.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* renamed from: e, reason: collision with root package name */
        private final int[] f618e;

        /* renamed from: f, reason: collision with root package name */
        private a.c f619f;

        /* renamed from: g, reason: collision with root package name */
        private TextView f620g;

        /* renamed from: h, reason: collision with root package name */
        private ImageView f621h;

        /* renamed from: i, reason: collision with root package name */
        private View f622i;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(Context context, a.c cVar, boolean z2) {
            super(context, null, r5);
            int i2 = b.a.f2153d;
            int[] iArr = {R.attr.background};
            this.f618e = iArr;
            this.f619f = cVar;
            i1 u2 = i1.u(context, null, iArr, i2, 0);
            if (u2.r(0)) {
                setBackgroundDrawable(u2.f(0));
            }
            u2.v();
            if (z2) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f619f = cVar;
            c();
        }

        public a.c b() {
            return this.f619f;
        }

        public void c() {
            a.c cVar = this.f619f;
            View b3 = cVar.b();
            if (b3 != null) {
                ViewParent parent = b3.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b3);
                    }
                    addView(b3);
                }
                this.f622i = b3;
                TextView textView = this.f620g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f621h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f621h.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f622i;
            if (view != null) {
                removeView(view);
                this.f622i = null;
            }
            Drawable c3 = cVar.c();
            CharSequence d3 = cVar.d();
            if (c3 != null) {
                if (this.f621h == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f621h = oVar;
                }
                this.f621h.setImageDrawable(c3);
                this.f621h.setVisibility(0);
            } else {
                ImageView imageView2 = this.f621h;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f621h.setImageDrawable(null);
                }
            }
            boolean z2 = !TextUtils.isEmpty(d3);
            if (z2) {
                if (this.f620g == null) {
                    f0 f0Var = new f0(getContext(), null, b.a.f2154e);
                    f0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    f0Var.setLayoutParams(layoutParams2);
                    addView(f0Var);
                    this.f620g = f0Var;
                }
                this.f620g.setText(d3);
                this.f620g.setVisibility(0);
            } else {
                TextView textView2 = this.f620g;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f620g.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f621h;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            l1.a(this, z2 ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (b1.this.f610j > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = b1.this.f610j;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z2) {
            boolean z3 = isSelected() != z2;
            super.setSelected(z2);
            if (z3 && z2) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        w wVar = new w(getContext(), null, b.a.f2157h);
        wVar.setLayoutParams(new q0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean d() {
        Spinner spinner = this.f608h;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f608h == null) {
            this.f608h = b();
        }
        removeView(this.f607g);
        addView(this.f608h, new ViewGroup.LayoutParams(-2, -1));
        if (this.f608h.getAdapter() == null) {
            this.f608h.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f605e;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f605e = null;
        }
        this.f608h.setSelection(this.f613m);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f608h);
        addView(this.f607g, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f608h.getSelectedItemPosition());
        return false;
    }

    public void a(int i2) {
        View childAt = this.f607g.getChildAt(i2);
        Runnable runnable = this.f605e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f605e = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z2) {
        d dVar = new d(getContext(), cVar, z2);
        if (z2) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f612l));
        } else {
            dVar.setFocusable(true);
            if (this.f606f == null) {
                this.f606f = new c();
            }
            dVar.setOnClickListener(this.f606f);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f605e;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g.a b3 = g.a.b(getContext());
        setContentHeight(b3.f());
        this.f611k = b3.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f605e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f607g.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i4 = -1;
        } else {
            if (childCount > 2) {
                this.f610j = (int) (View.MeasureSpec.getSize(i2) * 0.4f);
            } else {
                this.f610j = View.MeasureSpec.getSize(i2) / 2;
            }
            i4 = Math.min(this.f610j, this.f611k);
        }
        this.f610j = i4;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f612l, 1073741824);
        if (!z2 && this.f609i) {
            this.f607g.measure(0, makeMeasureSpec);
            if (this.f607g.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i2, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f613m);
                return;
            }
        }
        f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z2) {
        this.f609i = z2;
    }

    public void setContentHeight(int i2) {
        this.f612l = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.f613m = i2;
        int childCount = this.f607g.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f607g.getChildAt(i3);
            boolean z2 = i3 == i2;
            childAt.setSelected(z2);
            if (z2) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f608h;
        if (spinner == null || i2 < 0) {
            return;
        }
        spinner.setSelection(i2);
    }
}
