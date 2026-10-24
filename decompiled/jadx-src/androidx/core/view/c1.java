package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f1554a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f1555b = null;

    /* renamed from: c, reason: collision with root package name */
    Runnable f1556c = null;

    /* renamed from: d, reason: collision with root package name */
    int f1557d = -1;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d1 f1558a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1559b;

        a(d1 d1Var, View view) {
            this.f1558a = d1Var;
            this.f1559b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1558a.a(this.f1559b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1558a.b(this.f1559b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1558a.c(this.f1559b);
        }
    }

    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    c1(View view) {
        this.f1554a = new WeakReference<>(view);
    }

    private void i(View view, d1 d1Var) {
        if (d1Var != null) {
            view.animate().setListener(new a(d1Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public c1 b(float f2) {
        View view = this.f1554a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void c() {
        View view = this.f1554a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f1554a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public c1 f(long j2) {
        View view = this.f1554a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public c1 g(Interpolator interpolator) {
        View view = this.f1554a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public c1 h(d1 d1Var) {
        View view = this.f1554a.get();
        if (view != null) {
            i(view, d1Var);
        }
        return this;
    }

    public c1 j(long j2) {
        View view = this.f1554a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public c1 k(final f1 f1Var) {
        final View view = this.f1554a.get();
        if (view != null) {
            b.a(view.animate(), f1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.b1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    f1.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = this.f1554a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public c1 m(float f2) {
        View view = this.f1554a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
