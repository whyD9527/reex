package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.f0;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: v, reason: collision with root package name */
    private static final int f1659v = ViewConfiguration.getTapTimeout();

    /* renamed from: g, reason: collision with root package name */
    final View f1662g;

    /* renamed from: h, reason: collision with root package name */
    private Runnable f1663h;

    /* renamed from: k, reason: collision with root package name */
    private int f1666k;

    /* renamed from: l, reason: collision with root package name */
    private int f1667l;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1671p;

    /* renamed from: q, reason: collision with root package name */
    boolean f1672q;

    /* renamed from: r, reason: collision with root package name */
    boolean f1673r;

    /* renamed from: s, reason: collision with root package name */
    boolean f1674s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1675t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1676u;

    /* renamed from: e, reason: collision with root package name */
    final C0027a f1660e = new C0027a();

    /* renamed from: f, reason: collision with root package name */
    private final Interpolator f1661f = new AccelerateInterpolator();

    /* renamed from: i, reason: collision with root package name */
    private float[] f1664i = {0.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    private float[] f1665j = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m, reason: collision with root package name */
    private float[] f1668m = {0.0f, 0.0f};

    /* renamed from: n, reason: collision with root package name */
    private float[] f1669n = {0.0f, 0.0f};

    /* renamed from: o, reason: collision with root package name */
    private float[] f1670o = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0027a {

        /* renamed from: a, reason: collision with root package name */
        private int f1677a;

        /* renamed from: b, reason: collision with root package name */
        private int f1678b;

        /* renamed from: c, reason: collision with root package name */
        private float f1679c;

        /* renamed from: d, reason: collision with root package name */
        private float f1680d;

        /* renamed from: j, reason: collision with root package name */
        private float f1686j;

        /* renamed from: k, reason: collision with root package name */
        private int f1687k;

        /* renamed from: e, reason: collision with root package name */
        private long f1681e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f1685i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f1682f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f1683g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f1684h = 0;

        C0027a() {
        }

        private float e(long j2) {
            if (j2 < this.f1681e) {
                return 0.0f;
            }
            long j3 = this.f1685i;
            if (j3 < 0 || j2 < j3) {
                return a.e((j2 - r0) / this.f1677a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f1686j;
            return (1.0f - f2) + (f2 * a.e((j2 - j3) / this.f1687k, 0.0f, 1.0f));
        }

        private float g(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f1682f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g2 = g(e(currentAnimationTimeMillis));
            long j2 = currentAnimationTimeMillis - this.f1682f;
            this.f1682f = currentAnimationTimeMillis;
            float f2 = j2 * g2;
            this.f1683g = (int) (this.f1679c * f2);
            this.f1684h = (int) (f2 * this.f1680d);
        }

        public int b() {
            return this.f1683g;
        }

        public int c() {
            return this.f1684h;
        }

        public int d() {
            float f2 = this.f1679c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f1680d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.f1685i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1685i + ((long) this.f1687k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1687k = a.f((int) (currentAnimationTimeMillis - this.f1681e), 0, this.f1678b);
            this.f1686j = e(currentAnimationTimeMillis);
            this.f1685i = currentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.f1678b = i2;
        }

        public void k(int i2) {
            this.f1677a = i2;
        }

        public void l(float f2, float f3) {
            this.f1679c = f2;
            this.f1680d = f3;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1681e = currentAnimationTimeMillis;
            this.f1685i = -1L;
            this.f1682f = currentAnimationTimeMillis;
            this.f1686j = 0.5f;
            this.f1683g = 0;
            this.f1684h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f1674s) {
                if (aVar.f1672q) {
                    aVar.f1672q = false;
                    aVar.f1660e.m();
                }
                C0027a c0027a = a.this.f1660e;
                if (c0027a.h() || !a.this.u()) {
                    a.this.f1674s = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f1673r) {
                    aVar2.f1673r = false;
                    aVar2.c();
                }
                c0027a.a();
                a.this.j(c0027a.b(), c0027a.c());
                f0.C(a.this.f1662g, this);
            }
        }
    }

    public a(View view) {
        this.f1662g = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (int) ((1575.0f * f2) + 0.5f);
        o(f3, f3);
        float f4 = (int) ((f2 * 315.0f) + 0.5f);
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f1659v);
        r(500);
        q(500);
    }

    private float d(int i2, float f2, float f3, float f4) {
        float h2 = h(this.f1664i[i2], f3, this.f1665j[i2], f2);
        if (h2 == 0.0f) {
            return 0.0f;
        }
        float f5 = this.f1668m[i2];
        float f6 = this.f1669n[i2];
        float f7 = this.f1670o[i2];
        float f8 = f5 * f4;
        return h2 > 0.0f ? e(h2 * f8, f6, f7) : -e((-h2) * f8, f6, f7);
    }

    static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f1666k;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f1674s && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    private float h(float f2, float f3, float f4, float f5) {
        float interpolation;
        float e3 = e(f2 * f3, 0.0f, f4);
        float g2 = g(f3 - f5, e3) - g(f5, e3);
        if (g2 < 0.0f) {
            interpolation = -this.f1661f.getInterpolation(-g2);
        } else {
            if (g2 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1661f.getInterpolation(g2);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f1672q) {
            this.f1674s = false;
        } else {
            this.f1660e.i();
        }
    }

    private void v() {
        int i2;
        if (this.f1663h == null) {
            this.f1663h = new b();
        }
        this.f1674s = true;
        this.f1672q = true;
        if (this.f1671p || (i2 = this.f1667l) <= 0) {
            this.f1663h.run();
        } else {
            f0.D(this.f1662g, this.f1663h, i2);
        }
        this.f1671p = true;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1662g.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i2, int i3);

    public a k(int i2) {
        this.f1667l = i2;
        return this;
    }

    public a l(int i2) {
        this.f1666k = i2;
        return this;
    }

    public a m(boolean z2) {
        if (this.f1675t && !z2) {
            i();
        }
        this.f1675t = z2;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.f1665j;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.f1670o;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f1675t) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            i();
            return this.f1676u && this.f1674s;
        }
        this.f1673r = true;
        this.f1671p = false;
        this.f1660e.l(d(0, motionEvent.getX(), view.getWidth(), this.f1662g.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f1662g.getHeight()));
        if (!this.f1674s && u()) {
            v();
        }
        if (this.f1676u) {
            return false;
        }
    }

    public a p(float f2, float f3) {
        float[] fArr = this.f1669n;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i2) {
        this.f1660e.j(i2);
        return this;
    }

    public a r(int i2) {
        this.f1660e.k(i2);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.f1664i;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.f1668m;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    boolean u() {
        C0027a c0027a = this.f1660e;
        int f2 = c0027a.f();
        int d3 = c0027a.d();
        return (f2 != 0 && b(f2)) || (d3 != 0 && a(d3));
    }
}
