package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class p0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    private final float f828e;

    /* renamed from: f, reason: collision with root package name */
    private final int f829f;

    /* renamed from: g, reason: collision with root package name */
    private final int f830g;

    /* renamed from: h, reason: collision with root package name */
    final View f831h;

    /* renamed from: i, reason: collision with root package name */
    private Runnable f832i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f833j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f834k;

    /* renamed from: l, reason: collision with root package name */
    private int f835l;

    /* renamed from: m, reason: collision with root package name */
    private final int[] f836m = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = p0.this.f831h.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.e();
        }
    }

    public p0(View view) {
        this.f831h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f828e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f829f = tapTimeout;
        this.f830g = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f833j;
        if (runnable != null) {
            this.f831h.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f832i;
        if (runnable2 != null) {
            this.f831h.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        n0 n0Var;
        View view = this.f831h;
        h.e b3 = b();
        if (b3 == null || !b3.c() || (n0Var = (n0) b3.g()) == null || !n0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(n0Var, obtainNoHistory);
        boolean e3 = n0Var.e(obtainNoHistory, this.f835l);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e3 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f831h;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f835l);
                    if (findPointerIndex >= 0 && !h(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f828e)) {
                        a();
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            }
            a();
        } else {
            this.f835l = motionEvent.getPointerId(0);
            if (this.f832i == null) {
                this.f832i = new a();
            }
            view.postDelayed(this.f832i, this.f829f);
            if (this.f833j == null) {
                this.f833j = new b();
            }
            view.postDelayed(this.f833j, this.f830g);
        }
        return false;
    }

    private static boolean h(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f836m);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f836m);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract h.e b();

    protected abstract boolean c();

    protected boolean d() {
        h.e b3 = b();
        if (b3 == null || !b3.c()) {
            return true;
        }
        b3.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f831h;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f834k = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        boolean z3 = this.f834k;
        if (z3) {
            z2 = f(motionEvent) || !d();
        } else {
            z2 = g(motionEvent) && c();
            if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f831h.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f834k = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f834k = false;
        this.f835l = -1;
        Runnable runnable = this.f832i;
        if (runnable != null) {
            this.f831h.removeCallbacks(runnable);
        }
    }
}
