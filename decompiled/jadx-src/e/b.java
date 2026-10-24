package e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;

/* loaded from: classes.dex */
class b extends Drawable implements Drawable.Callback {

    /* renamed from: e, reason: collision with root package name */
    private c f2585e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f2586f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f2587g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f2588h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2590j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2592l;

    /* renamed from: m, reason: collision with root package name */
    private Runnable f2593m;

    /* renamed from: n, reason: collision with root package name */
    private long f2594n;

    /* renamed from: o, reason: collision with root package name */
    private long f2595o;

    /* renamed from: p, reason: collision with root package name */
    private C0039b f2596p;

    /* renamed from: i, reason: collision with root package name */
    private int f2589i = 255;

    /* renamed from: k, reason: collision with root package name */
    private int f2591k = -1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: e.b$b, reason: collision with other inner class name */
    static class C0039b implements Drawable.Callback {

        /* renamed from: e, reason: collision with root package name */
        private Drawable.Callback f2598e;

        C0039b() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f2598e;
            this.f2598e = null;
            return callback;
        }

        public C0039b b(Drawable.Callback callback) {
            this.f2598e = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f2598e;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f2598e;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static abstract class c extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a, reason: collision with root package name */
        final b f2599a;

        /* renamed from: b, reason: collision with root package name */
        Resources f2600b;

        /* renamed from: c, reason: collision with root package name */
        int f2601c;

        /* renamed from: d, reason: collision with root package name */
        int f2602d;

        /* renamed from: e, reason: collision with root package name */
        int f2603e;

        /* renamed from: f, reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f2604f;

        /* renamed from: g, reason: collision with root package name */
        Drawable[] f2605g;

        /* renamed from: h, reason: collision with root package name */
        int f2606h;

        /* renamed from: i, reason: collision with root package name */
        boolean f2607i;

        /* renamed from: j, reason: collision with root package name */
        boolean f2608j;

        /* renamed from: k, reason: collision with root package name */
        Rect f2609k;

        /* renamed from: l, reason: collision with root package name */
        boolean f2610l;

        /* renamed from: m, reason: collision with root package name */
        boolean f2611m;

        /* renamed from: n, reason: collision with root package name */
        int f2612n;

        /* renamed from: o, reason: collision with root package name */
        int f2613o;

        /* renamed from: p, reason: collision with root package name */
        int f2614p;

        /* renamed from: q, reason: collision with root package name */
        int f2615q;

        /* renamed from: r, reason: collision with root package name */
        boolean f2616r;

        /* renamed from: s, reason: collision with root package name */
        int f2617s;

        /* renamed from: t, reason: collision with root package name */
        boolean f2618t;

        /* renamed from: u, reason: collision with root package name */
        boolean f2619u;

        /* renamed from: v, reason: collision with root package name */
        boolean f2620v;

        /* renamed from: w, reason: collision with root package name */
        boolean f2621w;

        /* renamed from: x, reason: collision with root package name */
        boolean f2622x;

        /* renamed from: y, reason: collision with root package name */
        boolean f2623y;

        /* renamed from: z, reason: collision with root package name */
        int f2624z;

        c(c cVar, b bVar, Resources resources) {
            this.f2601c = 160;
            this.f2607i = false;
            this.f2610l = false;
            this.f2622x = true;
            this.A = 0;
            this.B = 0;
            this.f2599a = bVar;
            this.f2600b = resources != null ? resources : cVar != null ? cVar.f2600b : null;
            int f2 = b.f(resources, cVar != null ? cVar.f2601c : 0);
            this.f2601c = f2;
            if (cVar == null) {
                this.f2605g = new Drawable[10];
                this.f2606h = 0;
                return;
            }
            this.f2602d = cVar.f2602d;
            this.f2603e = cVar.f2603e;
            this.f2620v = true;
            this.f2621w = true;
            this.f2607i = cVar.f2607i;
            this.f2610l = cVar.f2610l;
            this.f2622x = cVar.f2622x;
            this.f2623y = cVar.f2623y;
            this.f2624z = cVar.f2624z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            this.D = cVar.D;
            this.E = cVar.E;
            this.F = cVar.F;
            this.G = cVar.G;
            this.H = cVar.H;
            this.I = cVar.I;
            if (cVar.f2601c == f2) {
                if (cVar.f2608j) {
                    this.f2609k = new Rect(cVar.f2609k);
                    this.f2608j = true;
                }
                if (cVar.f2611m) {
                    this.f2612n = cVar.f2612n;
                    this.f2613o = cVar.f2613o;
                    this.f2614p = cVar.f2614p;
                    this.f2615q = cVar.f2615q;
                    this.f2611m = true;
                }
            }
            if (cVar.f2616r) {
                this.f2617s = cVar.f2617s;
                this.f2616r = true;
            }
            if (cVar.f2618t) {
                this.f2619u = cVar.f2619u;
                this.f2618t = true;
            }
            Drawable[] drawableArr = cVar.f2605g;
            this.f2605g = new Drawable[drawableArr.length];
            this.f2606h = cVar.f2606h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f2604f;
            this.f2604f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f2606h);
            int i2 = this.f2606h;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f2604f.put(i3, constantState);
                    } else {
                        this.f2605g[i3] = drawableArr[i3];
                    }
                }
            }
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f2604f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f2605g[this.f2604f.keyAt(i2)] = s(this.f2604f.valueAt(i2).newDrawable(this.f2600b));
                }
                this.f2604f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            drawable.setLayoutDirection(this.f2624z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f2599a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f2606h;
            if (i2 >= this.f2605g.length) {
                o(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f2599a);
            this.f2605g[i2] = drawable;
            this.f2606h++;
            this.f2603e = drawable.getChangingConfigurations() | this.f2603e;
            p();
            this.f2609k = null;
            this.f2608j = false;
            this.f2611m = false;
            this.f2620v = false;
            return i2;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i2 = this.f2606h;
                Drawable[] drawableArr = this.f2605g;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null && drawable.canApplyTheme()) {
                        drawableArr[i3].applyTheme(theme);
                        this.f2603e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                y(theme.getResources());
            }
        }

        public synchronized boolean c() {
            if (this.f2620v) {
                return this.f2621w;
            }
            e();
            this.f2620v = true;
            int i2 = this.f2606h;
            Drawable[] drawableArr = this.f2605g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.f2621w = false;
                    return false;
                }
            }
            this.f2621w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i2 = this.f2606h;
            Drawable[] drawableArr = this.f2605g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f2604f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f2611m = true;
            e();
            int i2 = this.f2606h;
            Drawable[] drawableArr = this.f2605g;
            this.f2613o = -1;
            this.f2612n = -1;
            this.f2615q = 0;
            this.f2614p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f2612n) {
                    this.f2612n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f2613o) {
                    this.f2613o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f2614p) {
                    this.f2614p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f2615q) {
                    this.f2615q = minimumHeight;
                }
            }
        }

        final int f() {
            return this.f2605g.length;
        }

        public final Drawable g(int i2) {
            int indexOfKey;
            Drawable drawable = this.f2605g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f2604f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable s2 = s(this.f2604f.valueAt(indexOfKey).newDrawable(this.f2600b));
            this.f2605g[i2] = s2;
            this.f2604f.removeAt(indexOfKey);
            if (this.f2604f.size() == 0) {
                this.f2604f = null;
            }
            return s2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2602d | this.f2603e;
        }

        public final int h() {
            return this.f2606h;
        }

        public final int i() {
            if (!this.f2611m) {
                d();
            }
            return this.f2613o;
        }

        public final int j() {
            if (!this.f2611m) {
                d();
            }
            return this.f2615q;
        }

        public final int k() {
            if (!this.f2611m) {
                d();
            }
            return this.f2614p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f2607i) {
                return null;
            }
            Rect rect2 = this.f2609k;
            if (rect2 != null || this.f2608j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i2 = this.f2606h;
            Drawable[] drawableArr = this.f2605g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect3.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect3.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect3.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect3.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.f2608j = true;
            this.f2609k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f2611m) {
                d();
            }
            return this.f2612n;
        }

        public final int n() {
            if (this.f2616r) {
                return this.f2617s;
            }
            e();
            int i2 = this.f2606h;
            Drawable[] drawableArr = this.f2605g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.f2617s = opacity;
            this.f2616r = true;
            return opacity;
        }

        public void o(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            System.arraycopy(this.f2605g, 0, drawableArr, 0, i2);
            this.f2605g = drawableArr;
        }

        void p() {
            this.f2616r = false;
            this.f2618t = false;
        }

        public final boolean q() {
            return this.f2610l;
        }

        abstract void r();

        public final void t(boolean z2) {
            this.f2610l = z2;
        }

        public final void u(int i2) {
            this.A = i2;
        }

        public final void v(int i2) {
            this.B = i2;
        }

        final boolean w(int i2, int i3) {
            int i4 = this.f2606h;
            Drawable[] drawableArr = this.f2605g;
            boolean z2 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    boolean layoutDirection = drawable.setLayoutDirection(i2);
                    if (i5 == i3) {
                        z2 = layoutDirection;
                    }
                }
            }
            this.f2624z = i2;
            return z2;
        }

        public final void x(boolean z2) {
            this.f2607i = z2;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f2600b = resources;
                int f2 = b.f(resources, this.f2601c);
                int i2 = this.f2601c;
                this.f2601c = f2;
                if (i2 != f2) {
                    this.f2611m = false;
                    this.f2608j = false;
                }
            }
        }
    }

    b() {
    }

    private void d(Drawable drawable) {
        if (this.f2596p == null) {
            this.f2596p = new C0039b();
        }
        drawable.setCallback(this.f2596p.b(drawable.getCallback()));
        try {
            if (this.f2585e.A <= 0 && this.f2590j) {
                drawable.setAlpha(this.f2589i);
            }
            c cVar = this.f2585e;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    androidx.core.graphics.drawable.a.n(drawable, cVar.F);
                }
                c cVar2 = this.f2585e;
                if (cVar2.I) {
                    androidx.core.graphics.drawable.a.o(drawable, cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2585e.f2622x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f2585e.C);
            Rect rect = this.f2586f;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f2596p.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    static int f(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void a(boolean z2) {
        boolean z3;
        Drawable drawable;
        boolean z4 = true;
        this.f2590j = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f2587g;
        if (drawable2 != null) {
            long j2 = this.f2594n;
            if (j2 != 0) {
                if (j2 <= uptimeMillis) {
                    drawable2.setAlpha(this.f2589i);
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - uptimeMillis) * 255)) / this.f2585e.A)) * this.f2589i) / 255);
                    z3 = true;
                    drawable = this.f2588h;
                    if (drawable != null) {
                        long j3 = this.f2595o;
                        if (j3 != 0) {
                            if (j3 > uptimeMillis) {
                                drawable.setAlpha(((((int) ((j3 - uptimeMillis) * 255)) / this.f2585e.B) * this.f2589i) / 255);
                                if (z2 && z4) {
                                    scheduleSelf(this.f2593m, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                            drawable.setVisible(false, false);
                            this.f2588h = null;
                        }
                        z4 = z3;
                        if (z2) {
                            return;
                        } else {
                            return;
                        }
                    }
                    this.f2595o = 0L;
                    z4 = z3;
                    if (z2) {
                    }
                }
            }
            z3 = false;
            drawable = this.f2588h;
            if (drawable != null) {
            }
            this.f2595o = 0L;
            z4 = z3;
            if (z2) {
            }
        }
        this.f2594n = 0L;
        z3 = false;
        drawable = this.f2588h;
        if (drawable != null) {
        }
        this.f2595o = 0L;
        z4 = z3;
        if (z2) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f2585e.b(theme);
    }

    c b() {
        throw null;
    }

    int c() {
        return this.f2591k;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f2585e.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2587g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2588h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean g(int i2) {
        Runnable runnable;
        if (i2 == this.f2591k) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f2585e.B > 0) {
            Drawable drawable = this.f2588h;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f2587g;
            if (drawable2 != null) {
                this.f2588h = drawable2;
                this.f2595o = this.f2585e.B + uptimeMillis;
            } else {
                this.f2588h = null;
                this.f2595o = 0L;
            }
        } else {
            Drawable drawable3 = this.f2587g;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i2 >= 0) {
            c cVar = this.f2585e;
            if (i2 < cVar.f2606h) {
                Drawable g2 = cVar.g(i2);
                this.f2587g = g2;
                this.f2591k = i2;
                if (g2 != null) {
                    int i3 = this.f2585e.A;
                    if (i3 > 0) {
                        this.f2594n = uptimeMillis + i3;
                    }
                    d(g2);
                }
                if (this.f2594n == 0 || this.f2595o != 0) {
                    runnable = this.f2593m;
                    if (runnable != null) {
                        this.f2593m = new a();
                    } else {
                        unscheduleSelf(runnable);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.f2587g = null;
        this.f2591k = -1;
        if (this.f2594n == 0) {
        }
        runnable = this.f2593m;
        if (runnable != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2589i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2585e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f2585e.c()) {
            return null;
        }
        this.f2585e.f2602d = getChangingConfigurations();
        return this.f2585e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2587g;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2586f;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f2585e.q()) {
            return this.f2585e.i();
        }
        Drawable drawable = this.f2587g;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f2585e.q()) {
            return this.f2585e.m();
        }
        Drawable drawable = this.f2587g;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f2585e.q()) {
            return this.f2585e.j();
        }
        Drawable drawable = this.f2587g;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f2585e.q()) {
            return this.f2585e.k();
        }
        Drawable drawable = this.f2587g;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2587g;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f2585e.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f2587g;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l2 = this.f2585e.l();
        if (l2 != null) {
            rect.set(l2);
            padding = (l2.right | ((l2.left | l2.top) | l2.bottom)) != 0;
        } else {
            Drawable drawable = this.f2587g;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return padding;
    }

    void h(c cVar) {
        this.f2585e = cVar;
        int i2 = this.f2591k;
        if (i2 >= 0) {
            Drawable g2 = cVar.g(i2);
            this.f2587g = g2;
            if (g2 != null) {
                d(g2);
            }
        }
        this.f2588h = null;
    }

    final void i(Resources resources) {
        this.f2585e.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f2585e;
        if (cVar != null) {
            cVar.p();
        }
        if (drawable != this.f2587g || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f2585e.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f2588h;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2588h = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f2587g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2590j) {
                this.f2587g.setAlpha(this.f2589i);
            }
        }
        if (this.f2595o != 0) {
            this.f2595o = 0L;
            z2 = true;
        }
        if (this.f2594n != 0) {
            this.f2594n = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2592l && super.mutate() == this) {
            c b3 = b();
            b3.r();
            h(b3);
            this.f2592l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2588h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2587g;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return this.f2585e.w(i2, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f2588h;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f2587g;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2588h;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f2587g;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f2587g || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f2590j && this.f2589i == i2) {
            return;
        }
        this.f2590j = true;
        this.f2589i = i2;
        Drawable drawable = this.f2587g;
        if (drawable != null) {
            if (this.f2594n == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        c cVar = this.f2585e;
        if (cVar.C != z2) {
            cVar.C = z2;
            Drawable drawable = this.f2587g;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.i(drawable, z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f2585e;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f2587g;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        c cVar = this.f2585e;
        if (cVar.f2622x != z2) {
            cVar.f2622x = z2;
            Drawable drawable = this.f2587g;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f2587g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f2586f;
        if (rect == null) {
            this.f2586f = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f2587g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f2585e;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            androidx.core.graphics.drawable.a.n(this.f2587g, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f2585e;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            androidx.core.graphics.drawable.a.o(this.f2587g, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f2588h;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f2587g;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f2587g || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
