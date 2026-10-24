package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import c.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private CharSequence B;
    private CharSequence C;
    private ColorStateList D;
    private ColorStateList E;
    private boolean F;
    private boolean G;
    private final ArrayList<View> H;
    private final ArrayList<View> I;
    private final int[] J;
    f K;
    private final ActionMenuView.e L;
    private j1 M;
    private androidx.appcompat.widget.c N;
    private d O;
    private j.a P;
    private e.a Q;
    private boolean R;
    private final Runnable S;

    /* renamed from: e, reason: collision with root package name */
    private ActionMenuView f548e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f549f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f550g;

    /* renamed from: h, reason: collision with root package name */
    private ImageButton f551h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f552i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f553j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f554k;

    /* renamed from: l, reason: collision with root package name */
    ImageButton f555l;

    /* renamed from: m, reason: collision with root package name */
    View f556m;

    /* renamed from: n, reason: collision with root package name */
    private Context f557n;

    /* renamed from: o, reason: collision with root package name */
    private int f558o;

    /* renamed from: p, reason: collision with root package name */
    private int f559p;

    /* renamed from: q, reason: collision with root package name */
    private int f560q;

    /* renamed from: r, reason: collision with root package name */
    int f561r;

    /* renamed from: s, reason: collision with root package name */
    private int f562s;

    /* renamed from: t, reason: collision with root package name */
    private int f563t;

    /* renamed from: u, reason: collision with root package name */
    private int f564u;

    /* renamed from: v, reason: collision with root package name */
    private int f565v;

    /* renamed from: w, reason: collision with root package name */
    private int f566w;

    /* renamed from: x, reason: collision with root package name */
    private a1 f567x;

    /* renamed from: y, reason: collision with root package name */
    private int f568y;

    /* renamed from: z, reason: collision with root package name */
    private int f569z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.K;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.N();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements androidx.appcompat.view.menu.j {

        /* renamed from: e, reason: collision with root package name */
        androidx.appcompat.view.menu.e f573e;

        /* renamed from: f, reason: collision with root package name */
        androidx.appcompat.view.menu.g f574f;

        d() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void d(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f573e;
            if (eVar2 != null && (gVar = this.f574f) != null) {
                eVar2.f(gVar);
            }
            this.f573e = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public void f(boolean z2) {
            if (this.f574f != null) {
                androidx.appcompat.view.menu.e eVar = this.f573e;
                boolean z3 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (this.f573e.getItem(i2) == this.f574f) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (z3) {
                    return;
                }
                i(this.f573e, this.f574f);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean h() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean i(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f556m;
            if (callback instanceof g.c) {
                ((g.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f556m);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f555l);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f556m = null;
            toolbar3.a();
            this.f574f = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean j(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f555l.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f555l);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f555l);
            }
            Toolbar.this.f556m = gVar.getActionView();
            this.f574f = gVar;
            ViewParent parent2 = Toolbar.this.f556m.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f556m);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f2392a = 8388611 | (toolbar4.f561r & 112);
                generateDefaultLayoutParams.f576b = 2;
                toolbar4.f556m.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f556m);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f556m;
            if (callback instanceof g.c) {
                ((g.c) callback).onActionViewExpanded();
            }
            return true;
        }
    }

    public static class e extends a.C0035a {

        /* renamed from: b, reason: collision with root package name */
        int f576b;

        public e(int i2, int i3) {
            super(i2, i3);
            this.f576b = 0;
            this.f2392a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f576b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f576b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f576b = 0;
            a(marginLayoutParams);
        }

        public e(e eVar) {
            super((a.C0035a) eVar);
            this.f576b = 0;
            this.f576b = eVar.f576b;
        }

        public e(a.C0035a c0035a) {
            super(c0035a);
            this.f576b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends z.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        int f577g;

        /* renamed from: h, reason: collision with root package name */
        boolean f578h;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f577g = parcel.readInt();
            this.f578h = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // z.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f577g);
            parcel.writeInt(this.f578h ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.L);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = 8388627;
        this.H = new ArrayList<>();
        this.I = new ArrayList<>();
        this.J = new int[2];
        this.L = new a();
        this.S = new b();
        Context context2 = getContext();
        int[] iArr = b.j.T2;
        i1 u2 = i1.u(context2, attributeSet, iArr, i2, 0);
        androidx.core.view.f0.F(this, context, iArr, attributeSet, u2.q(), i2, 0);
        this.f559p = u2.m(b.j.v3, 0);
        this.f560q = u2.m(b.j.m3, 0);
        this.A = u2.k(b.j.U2, this.A);
        this.f561r = u2.k(b.j.V2, 48);
        int d3 = u2.d(b.j.p3, 0);
        int i3 = b.j.u3;
        d3 = u2.r(i3) ? u2.d(i3, d3) : d3;
        this.f566w = d3;
        this.f565v = d3;
        this.f564u = d3;
        this.f563t = d3;
        int d4 = u2.d(b.j.s3, -1);
        if (d4 >= 0) {
            this.f563t = d4;
        }
        int d5 = u2.d(b.j.r3, -1);
        if (d5 >= 0) {
            this.f564u = d5;
        }
        int d6 = u2.d(b.j.t3, -1);
        if (d6 >= 0) {
            this.f565v = d6;
        }
        int d7 = u2.d(b.j.q3, -1);
        if (d7 >= 0) {
            this.f566w = d7;
        }
        this.f562s = u2.e(b.j.g3, -1);
        int d8 = u2.d(b.j.c3, Integer.MIN_VALUE);
        int d9 = u2.d(b.j.Y2, Integer.MIN_VALUE);
        int e3 = u2.e(b.j.a3, 0);
        int e4 = u2.e(b.j.b3, 0);
        h();
        this.f567x.e(e3, e4);
        if (d8 != Integer.MIN_VALUE || d9 != Integer.MIN_VALUE) {
            this.f567x.g(d8, d9);
        }
        this.f568y = u2.d(b.j.d3, Integer.MIN_VALUE);
        this.f569z = u2.d(b.j.Z2, Integer.MIN_VALUE);
        this.f553j = u2.f(b.j.X2);
        this.f554k = u2.o(b.j.W2);
        CharSequence o2 = u2.o(b.j.o3);
        if (!TextUtils.isEmpty(o2)) {
            setTitle(o2);
        }
        CharSequence o3 = u2.o(b.j.l3);
        if (!TextUtils.isEmpty(o3)) {
            setSubtitle(o3);
        }
        this.f557n = getContext();
        setPopupTheme(u2.m(b.j.k3, 0));
        Drawable f2 = u2.f(b.j.j3);
        if (f2 != null) {
            setNavigationIcon(f2);
        }
        CharSequence o4 = u2.o(b.j.i3);
        if (!TextUtils.isEmpty(o4)) {
            setNavigationContentDescription(o4);
        }
        Drawable f3 = u2.f(b.j.e3);
        if (f3 != null) {
            setLogo(f3);
        }
        CharSequence o5 = u2.o(b.j.f3);
        if (!TextUtils.isEmpty(o5)) {
            setLogoDescription(o5);
        }
        int i4 = b.j.w3;
        if (u2.r(i4)) {
            setTitleTextColor(u2.c(i4));
        }
        int i5 = b.j.n3;
        if (u2.r(i5)) {
            setSubtitleTextColor(u2.c(i5));
        }
        int i6 = b.j.h3;
        if (u2.r(i6)) {
            x(u2.m(i6, 0));
        }
        u2.v();
    }

    private int B(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int q2 = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q2, max + measuredWidth, view.getMeasuredHeight() + q2);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int q2 = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q2, max, view.getMeasuredHeight() + q2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void E(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.S);
        post(this.S);
    }

    private boolean L() {
        if (!this.R) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i2) {
        boolean z2 = androidx.core.view.f0.n(this) == 1;
        int childCount = getChildCount();
        int a3 = androidx.core.view.e.a(i2, androidx.core.view.f0.n(this));
        list.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f576b == 0 && M(childAt) && p(eVar.f2392a) == a3) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f576b == 0 && M(childAt2) && p(eVar2.f2392a) == a3) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f576b = 1;
        if (!z2 || this.f556m == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.I.add(view);
        }
    }

    private MenuInflater getMenuInflater() {
        return new g.g(getContext());
    }

    private void h() {
        if (this.f567x == null) {
            this.f567x = new a1();
        }
    }

    private void i() {
        if (this.f552i == null) {
            this.f552i = new o(getContext());
        }
    }

    private void j() {
        k();
        if (this.f548e.J() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f548e.getMenu();
            if (this.O == null) {
                this.O = new d();
            }
            this.f548e.setExpandedActionViewsExclusive(true);
            eVar.c(this.O, this.f557n);
        }
    }

    private void k() {
        if (this.f548e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f548e = actionMenuView;
            actionMenuView.setPopupTheme(this.f558o);
            this.f548e.setOnMenuItemClickListener(this.L);
            this.f548e.K(this.P, this.Q);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2392a = 8388613 | (this.f561r & 112);
            this.f548e.setLayoutParams(generateDefaultLayoutParams);
            c(this.f548e, false);
        }
    }

    private void l() {
        if (this.f551h == null) {
            this.f551h = new m(getContext(), null, b.a.K);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2392a = 8388611 | (this.f561r & 112);
            this.f551h.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i2) {
        int n2 = androidx.core.view.f0.n(this);
        int a3 = androidx.core.view.e.a(i2, n2) & 7;
        return (a3 == 1 || a3 == 3 || a3 == 5) ? a3 : n2 == 1 ? 5 : 3;
    }

    private int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int r2 = r(eVar.f2392a);
        if (r2 == 48) {
            return getPaddingTop() - i3;
        }
        if (r2 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    private int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.A & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.h.b(marginLayoutParams) + androidx.core.view.h.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            View view = list.get(i4);
            e eVar = (e) view.getLayoutParams();
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i2;
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            int max3 = Math.max(0, -i6);
            int max4 = Math.max(0, -i7);
            i5 += max + view.getMeasuredWidth() + max2;
            i4++;
            i3 = max4;
            i2 = max3;
        }
        return i5;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.I.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f548e;
        return actionMenuView != null && actionMenuView.F();
    }

    void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f576b != 2 && childAt != this.f548e) {
                removeViewAt(childCount);
                this.I.add(childAt);
            }
        }
    }

    public void H(int i2, int i3) {
        h();
        this.f567x.g(i2, i3);
    }

    public void I(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f548e == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e J = this.f548e.J();
        if (J == eVar) {
            return;
        }
        if (J != null) {
            J.O(this.N);
            J.O(this.O);
        }
        if (this.O == null) {
            this.O = new d();
        }
        cVar.G(true);
        if (eVar != null) {
            eVar.c(cVar, this.f557n);
            eVar.c(this.O, this.f557n);
        } else {
            cVar.d(this.f557n, null);
            this.O.d(this.f557n, null);
            cVar.f(true);
            this.O.f(true);
        }
        this.f548e.setPopupTheme(this.f558o);
        this.f548e.setPresenter(cVar);
        this.N = cVar;
    }

    public void J(Context context, int i2) {
        this.f560q = i2;
        TextView textView = this.f550g;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void K(Context context, int i2) {
        this.f559p = i2;
        TextView textView = this.f549f;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean N() {
        ActionMenuView actionMenuView = this.f548e;
        return actionMenuView != null && actionMenuView.L();
    }

    void a() {
        for (int size = this.I.size() - 1; size >= 0; size--) {
            addView(this.I.get(size));
        }
        this.I.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f548e) != null && actionMenuView.G();
    }

    public void e() {
        d dVar = this.O;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f574f;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f548e;
        if (actionMenuView != null) {
            actionMenuView.x();
        }
    }

    void g() {
        if (this.f555l == null) {
            m mVar = new m(getContext(), null, b.a.K);
            this.f555l = mVar;
            mVar.setImageDrawable(this.f553j);
            this.f555l.setContentDescription(this.f554k);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2392a = 8388611 | (this.f561r & 112);
            generateDefaultLayoutParams.f576b = 2;
            this.f555l.setLayoutParams(generateDefaultLayoutParams);
            this.f555l.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f555l;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f555l;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        a1 a1Var = this.f567x;
        if (a1Var != null) {
            return a1Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f569z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        a1 a1Var = this.f567x;
        if (a1Var != null) {
            return a1Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        a1 a1Var = this.f567x;
        if (a1Var != null) {
            return a1Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        a1 a1Var = this.f567x;
        if (a1Var != null) {
            return a1Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f568y;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e J;
        ActionMenuView actionMenuView = this.f548e;
        return actionMenuView != null && (J = actionMenuView.J()) != null && J.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f569z, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.f0.n(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.f0.n(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f568y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f552i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f552i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f548e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f551h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f551h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.N;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f548e.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f557n;
    }

    public int getPopupTheme() {
        return this.f558o;
    }

    public CharSequence getSubtitle() {
        return this.C;
    }

    final TextView getSubtitleTextView() {
        return this.f550g;
    }

    public CharSequence getTitle() {
        return this.B;
    }

    public int getTitleMarginBottom() {
        return this.f566w;
    }

    public int getTitleMarginEnd() {
        return this.f564u;
    }

    public int getTitleMarginStart() {
        return this.f563t;
    }

    public int getTitleMarginTop() {
        return this.f565v;
    }

    final TextView getTitleTextView() {
        return this.f549f;
    }

    public l0 getWrapper() {
        if (this.M == null) {
            this.M = new j1(this, true);
        }
        return this.M;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0035a ? new e((a.C0035a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0295 A[LOOP:0: B:46:0x0293->B:47:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b7 A[LOOP:1: B:50:0x02b5->B:51:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f0 A[LOOP:2: B:59:0x02ee->B:60:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        boolean M;
        boolean M2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int size;
        int i21;
        int size2;
        int i22;
        int i23;
        int size3;
        boolean z3 = androidx.core.view.f0.n(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i24 = width - paddingRight;
        int[] iArr = this.J;
        iArr[1] = 0;
        iArr[0] = 0;
        int o2 = androidx.core.view.f0.o(this);
        int min = o2 >= 0 ? Math.min(o2, i5 - i3) : 0;
        if (M(this.f551h)) {
            ImageButton imageButton = this.f551h;
            if (z3) {
                i7 = C(imageButton, i24, iArr, min);
                i6 = paddingLeft;
                if (M(this.f555l)) {
                    ImageButton imageButton2 = this.f555l;
                    if (z3) {
                        i7 = C(imageButton2, i7, iArr, min);
                    } else {
                        i6 = B(imageButton2, i6, iArr, min);
                    }
                }
                if (M(this.f548e)) {
                    ActionMenuView actionMenuView = this.f548e;
                    if (z3) {
                        i6 = B(actionMenuView, i6, iArr, min);
                    } else {
                        i7 = C(actionMenuView, i7, iArr, min);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i6);
                iArr[1] = Math.max(0, currentContentInsetRight - (i24 - i7));
                int max = Math.max(i6, currentContentInsetLeft);
                int min2 = Math.min(i7, i24 - currentContentInsetRight);
                if (M(this.f556m)) {
                    View view = this.f556m;
                    if (z3) {
                        min2 = C(view, min2, iArr, min);
                    } else {
                        max = B(view, max, iArr, min);
                    }
                }
                if (M(this.f552i)) {
                    ImageView imageView = this.f552i;
                    if (z3) {
                        min2 = C(imageView, min2, iArr, min);
                    } else {
                        max = B(imageView, max, iArr, min);
                    }
                }
                M = M(this.f549f);
                M2 = M(this.f550g);
                if (M) {
                    i8 = paddingRight;
                    i9 = 0;
                } else {
                    e eVar = (e) this.f549f.getLayoutParams();
                    i8 = paddingRight;
                    i9 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.f549f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin + 0;
                }
                if (M2) {
                    i10 = width;
                } else {
                    e eVar2 = (e) this.f550g.getLayoutParams();
                    i10 = width;
                    i9 += ((ViewGroup.MarginLayoutParams) eVar2).topMargin + this.f550g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin;
                }
                if (!M || M2) {
                    TextView textView = !M ? this.f549f : this.f550g;
                    TextView textView2 = !M2 ? this.f550g : this.f549f;
                    e eVar3 = (e) textView.getLayoutParams();
                    e eVar4 = (e) textView2.getLayoutParams();
                    boolean z4 = (!M && this.f549f.getMeasuredWidth() > 0) || (M2 && this.f550g.getMeasuredWidth() > 0);
                    i11 = this.A & 112;
                    i12 = paddingLeft;
                    if (i11 != 48) {
                        i13 = max;
                        i14 = min;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin + this.f565v;
                    } else if (i11 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i9) / 2;
                        int i26 = ((ViewGroup.MarginLayoutParams) eVar3).topMargin;
                        i14 = min;
                        int i27 = this.f565v;
                        i13 = max;
                        if (i25 < i26 + i27) {
                            i25 = i26 + i27;
                        } else {
                            int i28 = (((height - paddingBottom) - i9) - i25) - paddingTop2;
                            int i29 = ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin;
                            int i30 = this.f566w;
                            if (i28 < i29 + i30) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) eVar4).bottomMargin + i30) - i28));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        i13 = max;
                        i14 = min;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin) - this.f566w) - i9;
                    }
                    if (z3) {
                        if (z4) {
                            i16 = this.f563t;
                            i15 = 0;
                        } else {
                            i15 = 0;
                            i16 = 0;
                        }
                        int i31 = i16 - iArr[i15];
                        max = i13 + Math.max(i15, i31);
                        iArr[i15] = Math.max(i15, -i31);
                        if (M) {
                            e eVar5 = (e) this.f549f.getLayoutParams();
                            int measuredWidth = this.f549f.getMeasuredWidth() + max;
                            int measuredHeight = this.f549f.getMeasuredHeight() + paddingTop;
                            this.f549f.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i17 = measuredWidth + this.f564u;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin;
                        } else {
                            i17 = max;
                        }
                        if (M2) {
                            int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f550g.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f550g.getMeasuredWidth() + max;
                            this.f550g.layout(max, i32, measuredWidth2, this.f550g.getMeasuredHeight() + i32);
                            i18 = measuredWidth2 + this.f564u;
                        } else {
                            i18 = max;
                        }
                        if (z4) {
                            max = Math.max(i17, i18);
                        }
                        b(this.H, 3);
                        size = this.H.size();
                        for (i21 = i15; i21 < size; i21++) {
                            max = B(this.H.get(i21), max, iArr, i14);
                        }
                        int i33 = i14;
                        b(this.H, 5);
                        size2 = this.H.size();
                        for (i22 = i15; i22 < size2; i22++) {
                            min2 = C(this.H.get(i22), min2, iArr, i33);
                        }
                        b(this.H, 1);
                        int u2 = u(this.H, iArr);
                        i23 = (i12 + (((i10 - i12) - i8) / 2)) - (u2 / 2);
                        int i34 = u2 + i23;
                        if (i23 >= max) {
                            max = i34 > min2 ? i23 - (i34 - min2) : i23;
                        }
                        size3 = this.H.size();
                        while (i15 < size3) {
                            max = B(this.H.get(i15), max, iArr, i33);
                            i15++;
                        }
                        this.H.clear();
                        return;
                    }
                    int i35 = (z4 ? this.f563t : 0) - iArr[1];
                    min2 -= Math.max(0, i35);
                    iArr[1] = Math.max(0, -i35);
                    if (M) {
                        e eVar6 = (e) this.f549f.getLayoutParams();
                        int measuredWidth3 = min2 - this.f549f.getMeasuredWidth();
                        int measuredHeight2 = this.f549f.getMeasuredHeight() + paddingTop;
                        this.f549f.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                        i19 = measuredWidth3 - this.f564u;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin;
                    } else {
                        i19 = min2;
                    }
                    if (M2) {
                        int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f550g.getLayoutParams())).topMargin;
                        this.f550g.layout(min2 - this.f550g.getMeasuredWidth(), i36, min2, this.f550g.getMeasuredHeight() + i36);
                        i20 = min2 - this.f564u;
                    } else {
                        i20 = min2;
                    }
                    if (z4) {
                        min2 = Math.min(i19, i20);
                    }
                    max = i13;
                } else {
                    i12 = paddingLeft;
                    i14 = min;
                }
                i15 = 0;
                b(this.H, 3);
                size = this.H.size();
                while (i21 < size) {
                }
                int i332 = i14;
                b(this.H, 5);
                size2 = this.H.size();
                while (i22 < size2) {
                }
                b(this.H, 1);
                int u22 = u(this.H, iArr);
                i23 = (i12 + (((i10 - i12) - i8) / 2)) - (u22 / 2);
                int i342 = u22 + i23;
                if (i23 >= max) {
                }
                size3 = this.H.size();
                while (i15 < size3) {
                }
                this.H.clear();
                return;
            }
            i6 = B(imageButton, paddingLeft, iArr, min);
        } else {
            i6 = paddingLeft;
        }
        i7 = i24;
        if (M(this.f555l)) {
        }
        if (M(this.f548e)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i6);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i7));
        int max2 = Math.max(i6, currentContentInsetLeft2);
        int min22 = Math.min(i7, i24 - currentContentInsetRight2);
        if (M(this.f556m)) {
        }
        if (M(this.f552i)) {
        }
        M = M(this.f549f);
        M2 = M(this.f550g);
        if (M) {
        }
        if (M2) {
        }
        if (M) {
        }
        if (!M) {
        }
        if (!M2) {
        }
        e eVar32 = (e) textView.getLayoutParams();
        e eVar42 = (e) textView2.getLayoutParams();
        if (M) {
        }
        i11 = this.A & 112;
        i12 = paddingLeft;
        if (i11 != 48) {
        }
        if (z3) {
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.J;
        boolean b3 = p1.b(this);
        int i11 = !b3 ? 1 : 0;
        if (M(this.f551h)) {
            E(this.f551h, i2, 0, i3, 0, this.f562s);
            i4 = this.f551h.getMeasuredWidth() + s(this.f551h);
            i5 = Math.max(0, this.f551h.getMeasuredHeight() + t(this.f551h));
            i6 = View.combineMeasuredStates(0, this.f551h.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (M(this.f555l)) {
            E(this.f555l, i2, 0, i3, 0, this.f562s);
            i4 = this.f555l.getMeasuredWidth() + s(this.f555l);
            i5 = Math.max(i5, this.f555l.getMeasuredHeight() + t(this.f555l));
            i6 = View.combineMeasuredStates(i6, this.f555l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i4);
        iArr[b3 ? 1 : 0] = Math.max(0, currentContentInsetStart - i4);
        if (M(this.f548e)) {
            E(this.f548e, i2, max, i3, 0, this.f562s);
            i7 = this.f548e.getMeasuredWidth() + s(this.f548e);
            i5 = Math.max(i5, this.f548e.getMeasuredHeight() + t(this.f548e));
            i6 = View.combineMeasuredStates(i6, this.f548e.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[i11] = Math.max(0, currentContentInsetEnd - i7);
        if (M(this.f556m)) {
            max2 += D(this.f556m, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f556m.getMeasuredHeight() + t(this.f556m));
            i6 = View.combineMeasuredStates(i6, this.f556m.getMeasuredState());
        }
        if (M(this.f552i)) {
            max2 += D(this.f552i, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f552i.getMeasuredHeight() + t(this.f552i));
            i6 = View.combineMeasuredStates(i6, this.f552i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).f576b == 0 && M(childAt)) {
                max2 += D(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + t(childAt));
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i13 = this.f565v + this.f566w;
        int i14 = this.f563t + this.f564u;
        if (M(this.f549f)) {
            D(this.f549f, i2, max2 + i14, i3, i13, iArr);
            int measuredWidth = this.f549f.getMeasuredWidth() + s(this.f549f);
            i8 = this.f549f.getMeasuredHeight() + t(this.f549f);
            i9 = View.combineMeasuredStates(i6, this.f549f.getMeasuredState());
            i10 = measuredWidth;
        } else {
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        if (M(this.f550g)) {
            i10 = Math.max(i10, D(this.f550g, i2, max2 + i14, i3, i8 + i13, iArr));
            i8 += this.f550g.getMeasuredHeight() + t(this.f550g);
            i9 = View.combineMeasuredStates(i9, this.f550g.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i10 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, (-16777216) & i9), L() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i5, i8) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, i9 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f548e;
        androidx.appcompat.view.menu.e J = actionMenuView != null ? actionMenuView.J() : null;
        int i2 = gVar.f577g;
        if (i2 != 0 && this.O != null && J != null && (findItem = J.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (gVar.f578h) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        h();
        this.f567x.f(i2 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.O;
        if (dVar != null && (gVar = dVar.f574f) != null) {
            gVar2.f577g = gVar.getItemId();
        }
        gVar2.f578h = A();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = false;
        }
        if (!this.F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f555l;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(d.a.b(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f555l.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f555l;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f553j);
            }
        }
    }

    public void setCollapsible(boolean z2) {
        this.R = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f569z) {
            this.f569z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f568y) {
            this.f568y = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(d.a.b(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f552i)) {
                c(this.f552i, true);
            }
        } else {
            ImageView imageView = this.f552i;
            if (imageView != null && y(imageView)) {
                removeView(this.f552i);
                this.I.remove(this.f552i);
            }
        }
        ImageView imageView2 = this.f552i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f552i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f551h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(d.a.b(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f551h)) {
                c(this.f551h, true);
            }
        } else {
            ImageButton imageButton = this.f551h;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f551h);
                this.I.remove(this.f551h);
            }
        }
        ImageButton imageButton2 = this.f551h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f551h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.K = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f548e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f558o != i2) {
            this.f558o = i2;
            if (i2 == 0) {
                this.f557n = getContext();
            } else {
                this.f557n = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f550g;
            if (textView != null && y(textView)) {
                removeView(this.f550g);
                this.I.remove(this.f550g);
            }
        } else {
            if (this.f550g == null) {
                Context context = getContext();
                f0 f0Var = new f0(context);
                this.f550g = f0Var;
                f0Var.setSingleLine();
                this.f550g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f560q;
                if (i2 != 0) {
                    this.f550g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f550g.setTextColor(colorStateList);
                }
            }
            if (!y(this.f550g)) {
                c(this.f550g, true);
            }
        }
        TextView textView2 = this.f550g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        TextView textView = this.f550g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f549f;
            if (textView != null && y(textView)) {
                removeView(this.f549f);
                this.I.remove(this.f549f);
            }
        } else {
            if (this.f549f == null) {
                Context context = getContext();
                f0 f0Var = new f0(context);
                this.f549f = f0Var;
                f0Var.setSingleLine();
                this.f549f.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f559p;
                if (i2 != 0) {
                    this.f549f.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f549f.setTextColor(colorStateList);
                }
            }
            if (!y(this.f549f)) {
                c(this.f549f, true);
            }
        }
        TextView textView2 = this.f549f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.f566w = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f564u = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f563t = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f565v = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        TextView textView = this.f549f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        d dVar = this.O;
        return (dVar == null || dVar.f574f == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f548e;
        return actionMenuView != null && actionMenuView.D();
    }

    public void x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f548e;
        return actionMenuView != null && actionMenuView.E();
    }
}
