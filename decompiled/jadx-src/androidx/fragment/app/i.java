package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.view.d0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.lifecycle.d;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
final class i extends androidx.fragment.app.h implements LayoutInflater.Factory2 {
    static boolean L = false;
    static final Interpolator M = new DecelerateInterpolator(2.5f);
    static final Interpolator N = new DecelerateInterpolator(1.5f);
    boolean A;
    boolean B;
    boolean C;
    ArrayList<androidx.fragment.app.a> D;
    ArrayList<Boolean> E;
    ArrayList<Fragment> F;
    ArrayList<l> I;
    private androidx.fragment.app.k J;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<k> f1779g;

    /* renamed from: h, reason: collision with root package name */
    boolean f1780h;

    /* renamed from: l, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f1784l;

    /* renamed from: m, reason: collision with root package name */
    ArrayList<Fragment> f1785m;

    /* renamed from: n, reason: collision with root package name */
    private OnBackPressedDispatcher f1786n;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f1788p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList<Integer> f1789q;

    /* renamed from: r, reason: collision with root package name */
    ArrayList<h.a> f1790r;

    /* renamed from: u, reason: collision with root package name */
    androidx.fragment.app.g f1793u;

    /* renamed from: v, reason: collision with root package name */
    androidx.fragment.app.d f1794v;

    /* renamed from: w, reason: collision with root package name */
    Fragment f1795w;

    /* renamed from: x, reason: collision with root package name */
    Fragment f1796x;

    /* renamed from: y, reason: collision with root package name */
    boolean f1797y;

    /* renamed from: z, reason: collision with root package name */
    boolean f1798z;

    /* renamed from: i, reason: collision with root package name */
    int f1781i = 0;

    /* renamed from: j, reason: collision with root package name */
    final ArrayList<Fragment> f1782j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    final HashMap<String, Fragment> f1783k = new HashMap<>();

    /* renamed from: o, reason: collision with root package name */
    private final androidx.activity.b f1787o = new a(false);

    /* renamed from: s, reason: collision with root package name */
    private final CopyOnWriteArrayList<C0028i> f1791s = new CopyOnWriteArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    int f1792t = 0;
    Bundle G = null;
    SparseArray<Parcelable> H = null;
    Runnable K = new b();

    class a extends androidx.activity.b {
        a(boolean z2) {
            super(z2);
        }

        @Override // androidx.activity.b
        public void b() {
            i.this.w0();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f0();
        }
    }

    class c implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1801a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f1802b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f1802b.l() != null) {
                    c.this.f1802b.a1(null);
                    c cVar = c.this;
                    i iVar = i.this;
                    Fragment fragment = cVar.f1802b;
                    iVar.M0(fragment, fragment.G(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.f1801a = viewGroup;
            this.f1802b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f1801a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1806b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f1807c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1805a = viewGroup;
            this.f1806b = view;
            this.f1807c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1805a.endViewTransition(this.f1806b);
            Animator m2 = this.f1807c.m();
            this.f1807c.b1(null);
            if (m2 == null || this.f1805a.indexOfChild(this.f1806b) >= 0) {
                return;
            }
            i iVar = i.this;
            Fragment fragment = this.f1807c;
            iVar.M0(fragment, fragment.G(), 0, 0, false);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1809a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1810b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f1811c;

        e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1809a = viewGroup;
            this.f1810b = view;
            this.f1811c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1809a.endViewTransition(this.f1810b);
            animator.removeListener(this);
            Fragment fragment = this.f1811c;
            View view = fragment.K;
            if (view == null || !fragment.C) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class f extends androidx.fragment.app.f {
        f() {
        }

        @Override // androidx.fragment.app.f
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.g gVar = i.this.f1793u;
            return gVar.b(gVar.g(), str, null);
        }
    }

    private static class g {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f1814a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f1815b;

        g(Animator animator) {
            this.f1814a = null;
            this.f1815b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f1814a = animation;
            this.f1815b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class h extends AnimationSet implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final ViewGroup f1816e;

        /* renamed from: f, reason: collision with root package name */
        private final View f1817f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f1818g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f1819h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f1820i;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1820i = true;
            this.f1816e = viewGroup;
            this.f1817f = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
            this.f1820i = true;
            if (this.f1818g) {
                return !this.f1819h;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f1818g = true;
                d0.a(this.f1816e, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f1820i = true;
            if (this.f1818g) {
                return !this.f1819h;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f1818g = true;
                d0.a(this.f1816e, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1818g || !this.f1820i) {
                this.f1816e.endViewTransition(this.f1817f);
                this.f1819h = true;
            } else {
                this.f1820i = false;
                this.f1816e.post(this);
            }
        }
    }

    /* renamed from: androidx.fragment.app.i$i, reason: collision with other inner class name */
    private static final class C0028i {

        /* renamed from: a, reason: collision with root package name */
        final boolean f1821a;
    }

    static class j {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f1822a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    interface k {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    static class l implements Fragment.f {

        /* renamed from: a, reason: collision with root package name */
        final boolean f1823a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f1824b;

        /* renamed from: c, reason: collision with root package name */
        private int f1825c;

        l(androidx.fragment.app.a aVar, boolean z2) {
            this.f1823a = z2;
            this.f1824b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            int i2 = this.f1825c - 1;
            this.f1825c = i2;
            if (i2 != 0) {
                return;
            }
            this.f1824b.f1742s.c1();
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            this.f1825c++;
        }

        public void c() {
            androidx.fragment.app.a aVar = this.f1824b;
            aVar.f1742s.q(aVar, this.f1823a, false, false);
        }

        public void d() {
            boolean z2 = this.f1825c > 0;
            i iVar = this.f1824b.f1742s;
            int size = iVar.f1782j.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = iVar.f1782j.get(i2);
                fragment.g1(null);
                if (z2 && fragment.O()) {
                    fragment.i1();
                }
            }
            androidx.fragment.app.a aVar = this.f1824b;
            aVar.f1742s.q(aVar, this.f1823a, !z2, true);
        }

        public boolean e() {
            return this.f1825c == 0;
        }
    }

    i() {
    }

    static g F0(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(N);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g H0(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(M);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(N);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void I0(l.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment h2 = bVar.h(i2);
            if (!h2.f1709o) {
                View X0 = h2.X0();
                h2.S = X0.getAlpha();
                X0.setAlpha(0.0f);
            }
        }
    }

    private boolean P0(String str, int i2, int i3) {
        f0();
        d0(true);
        Fragment fragment = this.f1796x;
        if (fragment != null && i2 < 0 && str == null && fragment.n().d()) {
            return true;
        }
        boolean Q0 = Q0(this.D, this.E, str, i2, i3);
        if (Q0) {
            this.f1780h = true;
            try {
                U0(this.D, this.E);
            } finally {
                p();
            }
        }
        k1();
        b0();
        m();
        return Q0;
    }

    private int R0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, l.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.m() && !aVar.k(arrayList, i5 + 1, i3)) {
                if (this.I == null) {
                    this.I = new ArrayList<>();
                }
                l lVar = new l(aVar, booleanValue);
                this.I.add(lVar);
                aVar.o(lVar);
                if (booleanValue) {
                    aVar.f();
                } else {
                    aVar.g(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                f(bVar);
            }
        }
        return i4;
    }

    private void S(Fragment fragment) {
        if (fragment == null || this.f1783k.get(fragment.f1703i) != fragment) {
            return;
        }
        fragment.Q0();
    }

    private void U0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        i0(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f1868q) {
                if (i3 != i2) {
                    h0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f1868q) {
                        i3++;
                    }
                }
                h0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            h0(arrayList, arrayList2, i3, size);
        }
    }

    public static int Y0(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void Z(int i2) {
        try {
            this.f1780h = true;
            K0(i2, false);
            this.f1780h = false;
            f0();
        } catch (Throwable th) {
            this.f1780h = false;
            throw th;
        }
    }

    private void c0() {
        for (Fragment fragment : this.f1783k.values()) {
            if (fragment != null) {
                if (fragment.l() != null) {
                    int G = fragment.G();
                    View l2 = fragment.l();
                    Animation animation = l2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        l2.clearAnimation();
                    }
                    fragment.a1(null);
                    M0(fragment, G, 0, 0, false);
                } else if (fragment.m() != null) {
                    fragment.m().end();
                }
            }
        }
    }

    private void d0(boolean z2) {
        if (this.f1780h) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1793u == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f1793u.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2) {
            o();
        }
        if (this.D == null) {
            this.D = new ArrayList<>();
            this.E = new ArrayList<>();
        }
        this.f1780h = true;
        try {
            i0(null, null);
        } finally {
            this.f1780h = false;
        }
    }

    private void f(l.b<Fragment> bVar) {
        int i2 = this.f1792t;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 3);
        int size = this.f1782j.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f1782j.get(i3);
            if (fragment.f1699e < min) {
                M0(fragment, min, fragment.w(), fragment.x(), false);
                if (fragment.K != null && !fragment.C && fragment.Q) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private static void g0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.c(-1);
                aVar.g(i2 == i3 + (-1));
            } else {
                aVar.c(1);
                aVar.f();
            }
            i2++;
        }
    }

    private void h0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        boolean z2 = arrayList.get(i6).f1868q;
        ArrayList<Fragment> arrayList3 = this.F;
        if (arrayList3 == null) {
            this.F = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.F.addAll(this.f1782j);
        Fragment u02 = u0();
        boolean z3 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            androidx.fragment.app.a aVar = arrayList.get(i7);
            u02 = !arrayList2.get(i7).booleanValue() ? aVar.h(this.F, u02) : aVar.p(this.F, u02);
            z3 = z3 || aVar.f1859h;
        }
        this.F.clear();
        if (!z2) {
            n.B(this, arrayList, arrayList2, i2, i3, false);
        }
        g0(arrayList, arrayList2, i2, i3);
        if (z2) {
            l.b<Fragment> bVar = new l.b<>();
            f(bVar);
            int R0 = R0(arrayList, arrayList2, i2, i3, bVar);
            I0(bVar);
            i4 = R0;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z2) {
            n.B(this, arrayList, arrayList2, i2, i4, true);
            K0(this.f1792t, true);
        }
        while (i6 < i3) {
            androidx.fragment.app.a aVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = aVar2.f1744u) >= 0) {
                o0(i5);
                aVar2.f1744u = -1;
            }
            aVar2.n();
            i6++;
        }
        if (z3) {
            W0();
        }
    }

    private void i0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<l> arrayList3 = this.I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            l lVar = this.I.get(i2);
            if (arrayList == null || lVar.f1823a || (indexOf2 = arrayList.indexOf(lVar.f1824b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (lVar.e() || (arrayList != null && lVar.f1824b.k(arrayList, 0, arrayList.size()))) {
                    this.I.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || lVar.f1823a || (indexOf = arrayList.indexOf(lVar.f1824b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        lVar.d();
                    }
                }
                i2++;
            } else {
                this.I.remove(i2);
                i2--;
                size--;
            }
            lVar.c();
            i2++;
        }
    }

    private void i1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new androidx.core.util.c("FragmentManager"));
        androidx.fragment.app.g gVar = this.f1793u;
        try {
            if (gVar != null) {
                gVar.l("  ", null, printWriter, new String[0]);
            } else {
                a("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    private void j(Fragment fragment, g gVar, int i2) {
        View view = fragment.K;
        ViewGroup viewGroup = fragment.J;
        viewGroup.startViewTransition(view);
        fragment.h1(i2);
        if (gVar.f1814a != null) {
            h hVar = new h(gVar.f1814a, viewGroup, view);
            fragment.a1(fragment.K);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.K.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f1815b;
        fragment.b1(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.K);
        animator.start();
    }

    public static int j1(int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? 1 : 2;
        }
        if (i2 == 4099) {
            return z2 ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z2 ? 3 : 4;
    }

    private void k1() {
        ArrayList<k> arrayList = this.f1779g;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f1787o.f(q0() > 0 && A0(this.f1795w));
        } else {
            this.f1787o.f(true);
        }
    }

    private void m() {
        this.f1783k.values().removeAll(Collections.singleton(null));
    }

    private Fragment m0(Fragment fragment) {
        ViewGroup viewGroup = fragment.J;
        View view = fragment.K;
        if (viewGroup != null && view != null) {
            for (int indexOf = this.f1782j.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f1782j.get(indexOf);
                if (fragment2.J == viewGroup && fragment2.K != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void n0() {
        if (this.I != null) {
            while (!this.I.isEmpty()) {
                this.I.remove(0).d();
            }
        }
    }

    private void o() {
        if (C0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void p() {
        this.f1780h = false;
        this.E.clear();
        this.D.clear();
    }

    private boolean p0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<k> arrayList3 = this.f1779g;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int size = this.f1779g.size();
                boolean z2 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    z2 |= this.f1779g.get(i2).a(arrayList, arrayList2);
                }
                this.f1779g.clear();
                this.f1793u.h().removeCallbacks(this.K);
                return z2;
            }
            return false;
        }
    }

    private boolean z0(Fragment fragment) {
        return (fragment.G && fragment.H) || fragment.f1718x.n();
    }

    public void A() {
        for (int i2 = 0; i2 < this.f1782j.size(); i2++) {
            Fragment fragment = this.f1782j.get(i2);
            if (fragment != null) {
                fragment.J0();
            }
        }
    }

    boolean A0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        i iVar = fragment.f1716v;
        return fragment == iVar.u0() && A0(iVar.f1795w);
    }

    public void B(boolean z2) {
        for (int size = this.f1782j.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1782j.get(size);
            if (fragment != null) {
                fragment.K0(z2);
            }
        }
    }

    boolean B0(int i2) {
        return this.f1792t >= i2;
    }

    void C(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).C(fragment, bundle, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    public boolean C0() {
        return this.f1798z || this.A;
    }

    void D(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).D(fragment, context, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    g D0(Fragment fragment, int i2, boolean z2, int i3) {
        int j12;
        int w2 = fragment.w();
        boolean z3 = false;
        fragment.e1(0);
        ViewGroup viewGroup = fragment.J;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation Y = fragment.Y(i2, z2, w2);
        if (Y != null) {
            return new g(Y);
        }
        Animator Z = fragment.Z(i2, z2, w2);
        if (Z != null) {
            return new g(Z);
        }
        if (w2 != 0) {
            boolean equals = "anim".equals(this.f1793u.g().getResources().getResourceTypeName(w2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f1793u.g(), w2);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e3) {
                    throw e3;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f1793u.g(), w2);
                    if (loadAnimator != null) {
                        return new g(loadAnimator);
                    }
                } catch (RuntimeException e4) {
                    if (equals) {
                        throw e4;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f1793u.g(), w2);
                    if (loadAnimation2 != null) {
                        return new g(loadAnimation2);
                    }
                }
            }
        }
        if (i2 == 0 || (j12 = j1(i2, z2)) < 0) {
            return null;
        }
        switch (j12) {
            case 1:
                return H0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return H0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return H0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return H0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return F0(0.0f, 1.0f);
            case 6:
                return F0(1.0f, 0.0f);
            default:
                if (i3 == 0 && this.f1793u.p()) {
                    this.f1793u.o();
                }
                return null;
        }
    }

    void E(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).E(fragment, bundle, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    void E0(Fragment fragment) {
        if (this.f1783k.get(fragment.f1703i) != null) {
            return;
        }
        this.f1783k.put(fragment.f1703i, fragment);
        if (fragment.F) {
            if (fragment.E) {
                i(fragment);
            } else {
                V0(fragment);
            }
            fragment.F = false;
        }
        if (L) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    void F(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).F(fragment, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    void G(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).G(fragment, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    void G0(Fragment fragment) {
        if (this.f1783k.get(fragment.f1703i) == null) {
            return;
        }
        if (L) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
        for (Fragment fragment2 : this.f1783k.values()) {
            if (fragment2 != null && fragment.f1703i.equals(fragment2.f1706l)) {
                fragment2.f1705k = fragment;
                fragment2.f1706l = null;
            }
        }
        this.f1783k.put(fragment.f1703i, null);
        V0(fragment);
        String str = fragment.f1706l;
        if (str != null) {
            fragment.f1705k = this.f1783k.get(str);
        }
        fragment.K();
    }

    void H(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).H(fragment, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    void I(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).I(fragment, context, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    void J(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).J(fragment, bundle, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    void J0(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (!this.f1783k.containsKey(fragment.f1703i)) {
            if (L) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f1792t + "since it is not added to " + this);
                return;
            }
            return;
        }
        int i2 = this.f1792t;
        if (fragment.f1710p) {
            i2 = fragment.N() ? Math.min(i2, 1) : Math.min(i2, 0);
        }
        M0(fragment, i2, fragment.x(), fragment.y(), false);
        if (fragment.K != null) {
            Fragment m02 = m0(fragment);
            if (m02 != null) {
                View view = m02.K;
                ViewGroup viewGroup = fragment.J;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.K);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.K, indexOfChild);
                }
            }
            if (fragment.Q && fragment.J != null) {
                float f2 = fragment.S;
                if (f2 > 0.0f) {
                    fragment.K.setAlpha(f2);
                }
                fragment.S = 0.0f;
                fragment.Q = false;
                g D0 = D0(fragment, fragment.x(), true, fragment.y());
                if (D0 != null) {
                    Animation animation = D0.f1814a;
                    if (animation != null) {
                        fragment.K.startAnimation(animation);
                    } else {
                        D0.f1815b.setTarget(fragment.K);
                        D0.f1815b.start();
                    }
                }
            }
        }
        if (fragment.R) {
            r(fragment);
        }
    }

    void K(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).K(fragment, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    void K0(int i2, boolean z2) {
        androidx.fragment.app.g gVar;
        if (this.f1793u == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f1792t) {
            this.f1792t = i2;
            int size = this.f1782j.size();
            for (int i3 = 0; i3 < size; i3++) {
                J0(this.f1782j.get(i3));
            }
            for (Fragment fragment : this.f1783k.values()) {
                if (fragment != null && (fragment.f1710p || fragment.D)) {
                    if (!fragment.Q) {
                        J0(fragment);
                    }
                }
            }
            h1();
            if (this.f1797y && (gVar = this.f1793u) != null && this.f1792t == 4) {
                gVar.r();
                this.f1797y = false;
            }
        }
    }

    void L(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).L(fragment, bundle, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    void L0(Fragment fragment) {
        M0(fragment, this.f1792t, 0, 0, false);
    }

    void M(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).M(fragment, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void M0(Fragment fragment, int i2, int i3, int i4, boolean z2) {
        int i5;
        Fragment fragment2;
        int i6;
        ViewGroup viewGroup;
        int i7;
        String str;
        String str2;
        int i8;
        ViewGroup viewGroup2;
        String str3;
        int i9;
        int i10;
        int i11 = 1;
        boolean isChangingConfigurations = true;
        if (!fragment.f1709o || fragment.D) {
            i5 = i2;
            if (i5 > 1) {
                i5 = 1;
            }
        } else {
            i5 = i2;
        }
        if (fragment.f1710p && i5 > (i10 = fragment.f1699e)) {
            i5 = (i10 == 0 && fragment.N()) ? 1 : fragment.f1699e;
        }
        if (fragment.M && fragment.f1699e < 3 && i5 > 2) {
            i5 = 2;
        }
        d.c cVar = fragment.V;
        int min = cVar == d.c.CREATED ? Math.min(i5, 1) : Math.min(i5, cVar.ordinal());
        int i12 = fragment.f1699e;
        if (i12 <= min) {
            if (fragment.f1711q && !fragment.f1712r) {
                return;
            }
            if (fragment.l() != null || fragment.m() != null) {
                fragment.a1(null);
                fragment.b1(null);
                M0(fragment, fragment.G(), 0, 0, true);
            }
            int i13 = fragment.f1699e;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        i8 = 2;
                        if (min > i8) {
                            if (L) {
                                Log.v("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.T0();
                            M(fragment, false);
                        }
                        i9 = 3;
                        if (min > i9) {
                        }
                    } else if (i13 == 3) {
                        i9 = 3;
                        if (min > i9) {
                            if (L) {
                                Log.v("FragmentManager", "moveto RESUMED: " + fragment);
                            }
                            fragment.R0();
                            K(fragment, false);
                            fragment.f1700f = null;
                            fragment.f1701g = null;
                        }
                    }
                }
            } else if (min > 0) {
                if (L) {
                    Log.v("FragmentManager", "moveto CREATED: " + fragment);
                }
                Bundle bundle = fragment.f1700f;
                if (bundle != null) {
                    bundle.setClassLoader(this.f1793u.g().getClassLoader());
                    fragment.f1701g = fragment.f1700f.getSparseParcelableArray("android:view_state");
                    Fragment s02 = s0(fragment.f1700f, "android:target_state");
                    String str4 = s02 != null ? s02.f1703i : null;
                    fragment.f1706l = str4;
                    if (str4 != null) {
                        fragment.f1707m = fragment.f1700f.getInt("android:target_req_state", 0);
                    }
                    Boolean bool = fragment.f1702h;
                    if (bool != null) {
                        fragment.N = bool.booleanValue();
                        fragment.f1702h = null;
                    } else {
                        fragment.N = fragment.f1700f.getBoolean("android:user_visible_hint", true);
                    }
                    if (!fragment.N) {
                        fragment.M = true;
                        if (min > 2) {
                            min = 2;
                        }
                    }
                }
                androidx.fragment.app.g gVar = this.f1793u;
                fragment.f1717w = gVar;
                Fragment fragment3 = this.f1795w;
                fragment.f1719y = fragment3;
                fragment.f1716v = fragment3 != null ? fragment3.f1718x : gVar.f1776i;
                Fragment fragment4 = fragment.f1705k;
                if (fragment4 != null) {
                    Fragment fragment5 = this.f1783k.get(fragment4.f1703i);
                    Fragment fragment6 = fragment.f1705k;
                    if (fragment5 != fragment6) {
                        throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.f1705k + " that does not belong to this FragmentManager!");
                    }
                    if (fragment6.f1699e < 1) {
                        str = "Fragment ";
                        str2 = " declared target fragment ";
                        M0(fragment6, 1, 0, 0, true);
                    } else {
                        str = "Fragment ";
                        str2 = " declared target fragment ";
                    }
                    fragment.f1706l = fragment.f1705k.f1703i;
                    fragment.f1705k = null;
                } else {
                    str = "Fragment ";
                    str2 = " declared target fragment ";
                }
                String str5 = fragment.f1706l;
                if (str5 != null) {
                    Fragment fragment7 = this.f1783k.get(str5);
                    if (fragment7 == null) {
                        throw new IllegalStateException(str + fragment + str2 + fragment.f1706l + " that does not belong to this FragmentManager!");
                    }
                    if (fragment7.f1699e < 1) {
                        M0(fragment7, 1, 0, 0, true);
                    }
                }
                I(fragment, this.f1793u.g(), false);
                fragment.z0();
                Fragment fragment8 = fragment.f1719y;
                if (fragment8 == null) {
                    this.f1793u.i(fragment);
                } else {
                    fragment8.V(fragment);
                }
                D(fragment, this.f1793u.g(), false);
                if (fragment.U) {
                    fragment.Y0(fragment.f1700f);
                    fragment.f1699e = 1;
                } else {
                    J(fragment, fragment.f1700f, false);
                    fragment.C0(fragment.f1700f);
                    E(fragment, fragment.f1700f, false);
                }
            }
            if (min > 0) {
                e0(fragment);
            }
            if (min > 1) {
                if (L) {
                    Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
                }
                if (!fragment.f1711q) {
                    int i14 = fragment.A;
                    if (i14 != 0) {
                        if (i14 == -1) {
                            i1(new IllegalArgumentException("Cannot create fragment " + fragment + " for a container view with no id"));
                        }
                        viewGroup2 = (ViewGroup) this.f1794v.c(fragment.A);
                        if (viewGroup2 == null && !fragment.f1713s) {
                            try {
                                str3 = fragment.B().getResourceName(fragment.A);
                            } catch (Resources.NotFoundException unused) {
                                str3 = "unknown";
                            }
                            i1(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.A) + " (" + str3 + ") for fragment " + fragment));
                        }
                    } else {
                        viewGroup2 = null;
                    }
                    fragment.J = viewGroup2;
                    fragment.E0(fragment.I0(fragment.f1700f), viewGroup2, fragment.f1700f);
                    View view = fragment.K;
                    if (view != null) {
                        fragment.L = view;
                        view.setSaveFromParentEnabled(false);
                        if (viewGroup2 != null) {
                            viewGroup2.addView(fragment.K);
                        }
                        if (fragment.C) {
                            fragment.K.setVisibility(8);
                        }
                        fragment.w0(fragment.K, fragment.f1700f);
                        O(fragment, fragment.K, fragment.f1700f, false);
                        fragment.Q = fragment.K.getVisibility() == 0 && fragment.J != null;
                    } else {
                        fragment.L = null;
                    }
                }
                fragment.y0(fragment.f1700f);
                C(fragment, fragment.f1700f, false);
                if (fragment.K != null) {
                    fragment.Z0(fragment.f1700f);
                }
                fragment.f1700f = null;
            }
            i8 = 2;
            if (min > i8) {
            }
            i9 = 3;
            if (min > i9) {
            }
        } else if (i12 > min) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        i7 = 3;
                    } else if (i12 == 4) {
                        if (min < 4) {
                            if (L) {
                                Log.v("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.N0();
                            H(fragment, false);
                        }
                        i7 = 3;
                    }
                    if (min < i7) {
                        if (L) {
                            Log.v("FragmentManager", "movefrom STARTED: " + fragment);
                        }
                        fragment.U0();
                        N(fragment, false);
                    }
                    i6 = 2;
                } else {
                    i6 = 2;
                }
                if (min < i6) {
                    if (L) {
                        Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                    }
                    if (fragment.K != null && this.f1793u.q(fragment) && fragment.f1701g == null) {
                        b1(fragment);
                    }
                    fragment.G0();
                    P(fragment, false);
                    View view2 = fragment.K;
                    if (view2 != null && (viewGroup = fragment.J) != null) {
                        viewGroup.endViewTransition(view2);
                        fragment.K.clearAnimation();
                        if (fragment.z() == null || !fragment.z().f1710p) {
                            g D0 = (this.f1792t <= 0 || this.B || fragment.K.getVisibility() != 0 || fragment.S < 0.0f) ? null : D0(fragment, i3, false, i4);
                            fragment.S = 0.0f;
                            if (D0 != null) {
                                j(fragment, D0, min);
                            }
                            fragment.J.removeView(fragment.K);
                        }
                    }
                    fragment.J = null;
                    fragment.K = null;
                    fragment.X = null;
                    fragment.Y.g(null);
                    fragment.L = null;
                    fragment.f1712r = false;
                }
            }
            if (min < 1) {
                if (this.B) {
                    if (fragment.l() != null) {
                        View l2 = fragment.l();
                        fragment.a1(null);
                        l2.clearAnimation();
                    } else if (fragment.m() != null) {
                        Animator m2 = fragment.m();
                        fragment.b1(null);
                        m2.cancel();
                    }
                }
                if (fragment.l() != null || fragment.m() != null) {
                    fragment.h1(min);
                    if (fragment.f1699e == i11) {
                        Log.w("FragmentManager", "moveToState: Fragment state for " + fragment + " not updated inline; expected state " + i11 + " found " + fragment.f1699e);
                        fragment.f1699e = i11;
                        return;
                    }
                    return;
                }
                if (L) {
                    Log.v("FragmentManager", "movefrom CREATED: " + fragment);
                }
                Object[] objArr = fragment.f1710p && !fragment.N();
                if (objArr == true || this.J.l(fragment)) {
                    androidx.fragment.app.g gVar2 = this.f1793u;
                    if (gVar2 instanceof t) {
                        isChangingConfigurations = this.J.j();
                    } else if (gVar2.g() instanceof Activity) {
                        isChangingConfigurations = true ^ ((Activity) this.f1793u.g()).isChangingConfigurations();
                    }
                    if (objArr != false || isChangingConfigurations) {
                        this.J.e(fragment);
                    }
                    fragment.F0();
                    F(fragment, false);
                } else {
                    fragment.f1699e = 0;
                }
                fragment.H0();
                G(fragment, false);
                if (!z2) {
                    if (objArr == true || this.J.l(fragment)) {
                        G0(fragment);
                    } else {
                        fragment.f1717w = null;
                        fragment.f1719y = null;
                        fragment.f1716v = null;
                        String str6 = fragment.f1706l;
                        if (str6 != null && (fragment2 = this.f1783k.get(str6)) != null && fragment2.C()) {
                            fragment.f1705k = fragment2;
                        }
                    }
                }
            }
        }
        i11 = min;
        if (fragment.f1699e == i11) {
        }
    }

    void N(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).N(fragment, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    public void N0() {
        this.f1798z = false;
        this.A = false;
        int size = this.f1782j.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f1782j.get(i2);
            if (fragment != null) {
                fragment.Q();
            }
        }
    }

    void O(Fragment fragment, View view, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).O(fragment, view, bundle, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    public void O0(Fragment fragment) {
        if (fragment.M) {
            if (this.f1780h) {
                this.C = true;
            } else {
                fragment.M = false;
                M0(fragment, this.f1792t, 0, 0, false);
            }
        }
    }

    void P(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f1795w;
        if (fragment2 != null) {
            androidx.fragment.app.h t2 = fragment2.t();
            if (t2 instanceof i) {
                ((i) t2).P(fragment, true);
            }
        }
        Iterator<C0028i> it = this.f1791s.iterator();
        while (it.hasNext()) {
            C0028i next = it.next();
            if (!z2 || next.f1821a) {
                next.getClass();
                throw null;
            }
        }
    }

    public boolean Q(MenuItem menuItem) {
        if (this.f1792t < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1782j.size(); i2++) {
            Fragment fragment = this.f1782j.get(i2);
            if (fragment != null && fragment.L0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean Q0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1784l;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1784l.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f1784l.get(size2);
                    if ((str != null && str.equals(aVar.i())) || (i2 >= 0 && i2 == aVar.f1744u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f1784l.get(size2);
                        if (str == null || !str.equals(aVar2.i())) {
                            if (i2 < 0 || i2 != aVar2.f1744u) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f1784l.size() - 1) {
                return false;
            }
            for (int size3 = this.f1784l.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f1784l.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void R(Menu menu) {
        if (this.f1792t < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.f1782j.size(); i2++) {
            Fragment fragment = this.f1782j.get(i2);
            if (fragment != null) {
                fragment.M0(menu);
            }
        }
    }

    public void S0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f1716v != this) {
            i1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f1703i);
    }

    public void T() {
        Z(3);
    }

    public void T0(Fragment fragment) {
        if (L) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f1715u);
        }
        boolean z2 = !fragment.N();
        if (!fragment.D || z2) {
            synchronized (this.f1782j) {
                this.f1782j.remove(fragment);
            }
            if (z0(fragment)) {
                this.f1797y = true;
            }
            fragment.f1709o = false;
            fragment.f1710p = true;
        }
    }

    public void U(boolean z2) {
        for (int size = this.f1782j.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1782j.get(size);
            if (fragment != null) {
                fragment.O0(z2);
            }
        }
    }

    public boolean V(Menu menu) {
        if (this.f1792t < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f1782j.size(); i2++) {
            Fragment fragment = this.f1782j.get(i2);
            if (fragment != null && fragment.P0(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    void V0(Fragment fragment) {
        if (C0()) {
            if (L) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.J.k(fragment) && L) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void W() {
        k1();
        S(this.f1796x);
    }

    void W0() {
        if (this.f1790r != null) {
            for (int i2 = 0; i2 < this.f1790r.size(); i2++) {
                this.f1790r.get(i2).onBackStackChanged();
            }
        }
    }

    public void X() {
        this.f1798z = false;
        this.A = false;
        Z(4);
    }

    void X0(Parcelable parcelable) {
        androidx.fragment.app.l lVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.j jVar = (androidx.fragment.app.j) parcelable;
        if (jVar.f1826e == null) {
            return;
        }
        for (Fragment fragment : this.J.h()) {
            if (L) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
            }
            Iterator<androidx.fragment.app.l> it = jVar.f1826e.iterator();
            while (true) {
                if (it.hasNext()) {
                    lVar = it.next();
                    if (lVar.f1839f.equals(fragment.f1703i)) {
                        break;
                    }
                } else {
                    lVar = null;
                    break;
                }
            }
            if (lVar == null) {
                if (L) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + jVar.f1826e);
                }
                M0(fragment, 1, 0, 0, false);
                fragment.f1710p = true;
                M0(fragment, 0, 0, 0, false);
            } else {
                lVar.f1851r = fragment;
                fragment.f1701g = null;
                fragment.f1715u = 0;
                fragment.f1712r = false;
                fragment.f1709o = false;
                Fragment fragment2 = fragment.f1705k;
                fragment.f1706l = fragment2 != null ? fragment2.f1703i : null;
                fragment.f1705k = null;
                Bundle bundle = lVar.f1850q;
                if (bundle != null) {
                    bundle.setClassLoader(this.f1793u.g().getClassLoader());
                    fragment.f1701g = lVar.f1850q.getSparseParcelableArray("android:view_state");
                    fragment.f1700f = lVar.f1850q;
                }
            }
        }
        this.f1783k.clear();
        Iterator<androidx.fragment.app.l> it2 = jVar.f1826e.iterator();
        while (it2.hasNext()) {
            androidx.fragment.app.l next = it2.next();
            if (next != null) {
                Fragment a3 = next.a(this.f1793u.g().getClassLoader(), b());
                a3.f1716v = this;
                if (L) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + a3.f1703i + "): " + a3);
                }
                this.f1783k.put(a3.f1703i, a3);
                next.f1851r = null;
            }
        }
        this.f1782j.clear();
        ArrayList<String> arrayList = jVar.f1827f;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                Fragment fragment3 = this.f1783k.get(next2);
                if (fragment3 == null) {
                    i1(new IllegalStateException("No instantiated fragment for (" + next2 + ")"));
                }
                fragment3.f1709o = true;
                if (L) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + fragment3);
                }
                if (this.f1782j.contains(fragment3)) {
                    throw new IllegalStateException("Already added " + fragment3);
                }
                synchronized (this.f1782j) {
                    this.f1782j.add(fragment3);
                }
            }
        }
        if (jVar.f1828g != null) {
            this.f1784l = new ArrayList<>(jVar.f1828g.length);
            int i2 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = jVar.f1828g;
                if (i2 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a a4 = bVarArr[i2].a(this);
                if (L) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a4.f1744u + "): " + a4);
                    PrintWriter printWriter = new PrintWriter(new androidx.core.util.c("FragmentManager"));
                    a4.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1784l.add(a4);
                int i3 = a4.f1744u;
                if (i3 >= 0) {
                    d1(i3, a4);
                }
                i2++;
            }
        } else {
            this.f1784l = null;
        }
        String str = jVar.f1829h;
        if (str != null) {
            Fragment fragment4 = this.f1783k.get(str);
            this.f1796x = fragment4;
            S(fragment4);
        }
        this.f1781i = jVar.f1830i;
    }

    public void Y() {
        this.f1798z = false;
        this.A = false;
        Z(3);
    }

    Parcelable Z0() {
        ArrayList<String> arrayList;
        int size;
        n0();
        c0();
        f0();
        this.f1798z = true;
        androidx.fragment.app.b[] bVarArr = null;
        if (this.f1783k.isEmpty()) {
            return null;
        }
        ArrayList<androidx.fragment.app.l> arrayList2 = new ArrayList<>(this.f1783k.size());
        boolean z2 = false;
        for (Fragment fragment : this.f1783k.values()) {
            if (fragment != null) {
                if (fragment.f1716v != this) {
                    i1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                }
                androidx.fragment.app.l lVar = new androidx.fragment.app.l(fragment);
                arrayList2.add(lVar);
                if (fragment.f1699e <= 0 || lVar.f1850q != null) {
                    lVar.f1850q = fragment.f1700f;
                } else {
                    lVar.f1850q = a1(fragment);
                    String str = fragment.f1706l;
                    if (str != null) {
                        Fragment fragment2 = this.f1783k.get(str);
                        if (fragment2 == null) {
                            i1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f1706l));
                        }
                        if (lVar.f1850q == null) {
                            lVar.f1850q = new Bundle();
                        }
                        S0(lVar.f1850q, "android:target_state", fragment2);
                        int i2 = fragment.f1707m;
                        if (i2 != 0) {
                            lVar.f1850q.putInt("android:target_req_state", i2);
                        }
                    }
                }
                if (L) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + lVar.f1850q);
                }
                z2 = true;
            }
        }
        if (!z2) {
            if (L) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f1782j.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.f1782j.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f1703i);
                if (next.f1716v != this) {
                    i1(new IllegalStateException("Failure saving state: active " + next + " was removed from the FragmentManager"));
                }
                if (L) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f1703i + "): " + next);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1784l;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i3 = 0; i3 < size; i3++) {
                bVarArr[i3] = new androidx.fragment.app.b(this.f1784l.get(i3));
                if (L) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f1784l.get(i3));
                }
            }
        }
        androidx.fragment.app.j jVar = new androidx.fragment.app.j();
        jVar.f1826e = arrayList2;
        jVar.f1827f = arrayList;
        jVar.f1828g = bVarArr;
        Fragment fragment3 = this.f1796x;
        if (fragment3 != null) {
            jVar.f1829h = fragment3.f1703i;
        }
        jVar.f1830i = this.f1781i;
        return jVar;
    }

    @Override // androidx.fragment.app.h
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.f1783k.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f1783k.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.c(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f1782j.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                Fragment fragment2 = this.f1782j.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f1785m;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                Fragment fragment3 = this.f1785m.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f1784l;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                androidx.fragment.app.a aVar = this.f1784l.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.d(str2, printWriter);
            }
        }
        synchronized (this) {
            ArrayList<androidx.fragment.app.a> arrayList3 = this.f1788p;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = (androidx.fragment.app.a) this.f1788p.get(i5);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            ArrayList<Integer> arrayList4 = this.f1789q;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f1789q.toArray()));
            }
        }
        ArrayList<k> arrayList5 = this.f1779g;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                Object obj2 = (k) this.f1779g.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1793u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1794v);
        if (this.f1795w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1795w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1792t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1798z);
        printWriter.print(" mStopped=");
        printWriter.print(this.A);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.B);
        if (this.f1797y) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1797y);
        }
    }

    public void a0() {
        this.A = true;
        Z(2);
    }

    Bundle a1(Fragment fragment) {
        if (this.G == null) {
            this.G = new Bundle();
        }
        fragment.S0(this.G);
        L(fragment, this.G, false);
        Bundle bundle = null;
        if (!this.G.isEmpty()) {
            Bundle bundle2 = this.G;
            this.G = null;
            bundle = bundle2;
        }
        if (fragment.K != null) {
            b1(fragment);
        }
        if (fragment.f1701g != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f1701g);
        }
        if (!fragment.N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.N);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.h
    public androidx.fragment.app.f b() {
        if (super.b() == androidx.fragment.app.h.f1777f) {
            Fragment fragment = this.f1795w;
            if (fragment != null) {
                return fragment.f1716v.b();
            }
            e(new f());
        }
        return super.b();
    }

    void b0() {
        if (this.C) {
            this.C = false;
            h1();
        }
    }

    void b1(Fragment fragment) {
        if (fragment.L == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.H;
        if (sparseArray == null) {
            this.H = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.L.saveHierarchyState(this.H);
        if (this.H.size() > 0) {
            fragment.f1701g = this.H;
            this.H = null;
        }
    }

    @Override // androidx.fragment.app.h
    public List<Fragment> c() {
        List<Fragment> list;
        if (this.f1782j.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1782j) {
            list = (List) this.f1782j.clone();
        }
        return list;
    }

    void c1() {
        synchronized (this) {
            ArrayList<l> arrayList = this.I;
            boolean z2 = false;
            boolean z3 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList<k> arrayList2 = this.f1779g;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.f1793u.h().removeCallbacks(this.K);
                this.f1793u.h().post(this.K);
                k1();
            }
        }
    }

    @Override // androidx.fragment.app.h
    public boolean d() {
        o();
        return P0(null, -1, 0);
    }

    public void d1(int i2, androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.f1788p == null) {
                this.f1788p = new ArrayList<>();
            }
            int size = this.f1788p.size();
            if (i2 < size) {
                if (L) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + aVar);
                }
                this.f1788p.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.f1788p.add(null);
                    if (this.f1789q == null) {
                        this.f1789q = new ArrayList<>();
                    }
                    if (L) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f1789q.add(Integer.valueOf(size));
                    size++;
                }
                if (L) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + aVar);
                }
                this.f1788p.add(aVar);
            }
        }
    }

    void e0(Fragment fragment) {
        if (!fragment.f1711q || fragment.f1714t) {
            return;
        }
        fragment.E0(fragment.I0(fragment.f1700f), null, fragment.f1700f);
        View view = fragment.K;
        if (view == null) {
            fragment.L = null;
            return;
        }
        fragment.L = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.C) {
            fragment.K.setVisibility(8);
        }
        fragment.w0(fragment.K, fragment.f1700f);
        O(fragment, fragment.K, fragment.f1700f, false);
    }

    public void e1(Fragment fragment, d.c cVar) {
        if (this.f1783k.get(fragment.f1703i) == fragment && (fragment.f1717w == null || fragment.t() == this)) {
            fragment.V = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public boolean f0() {
        d0(true);
        boolean z2 = false;
        while (p0(this.D, this.E)) {
            this.f1780h = true;
            try {
                U0(this.D, this.E);
                p();
                z2 = true;
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        k1();
        b0();
        m();
        return z2;
    }

    public void f1(Fragment fragment) {
        if (fragment == null || (this.f1783k.get(fragment.f1703i) == fragment && (fragment.f1717w == null || fragment.t() == this))) {
            Fragment fragment2 = this.f1796x;
            this.f1796x = fragment;
            S(fragment2);
            S(this.f1796x);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void g(androidx.fragment.app.a aVar) {
        if (this.f1784l == null) {
            this.f1784l = new ArrayList<>();
        }
        this.f1784l.add(aVar);
    }

    public void g1(Fragment fragment) {
        if (L) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.C) {
            fragment.C = false;
            fragment.R = !fragment.R;
        }
    }

    public void h(Fragment fragment, boolean z2) {
        if (L) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        E0(fragment);
        if (fragment.D) {
            return;
        }
        if (this.f1782j.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f1782j) {
            this.f1782j.add(fragment);
        }
        fragment.f1709o = true;
        fragment.f1710p = false;
        if (fragment.K == null) {
            fragment.R = false;
        }
        if (z0(fragment)) {
            this.f1797y = true;
        }
        if (z2) {
            L0(fragment);
        }
    }

    void h1() {
        for (Fragment fragment : this.f1783k.values()) {
            if (fragment != null) {
                O0(fragment);
            }
        }
    }

    void i(Fragment fragment) {
        if (C0()) {
            if (L) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.J.d(fragment) && L) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public Fragment j0(int i2) {
        for (int size = this.f1782j.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1782j.get(size);
            if (fragment != null && fragment.f1720z == i2) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f1783k.values()) {
            if (fragment2 != null && fragment2.f1720z == i2) {
                return fragment2;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(androidx.fragment.app.g gVar, androidx.fragment.app.d dVar, Fragment fragment) {
        if (this.f1793u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1793u = gVar;
        this.f1794v = dVar;
        this.f1795w = fragment;
        if (fragment != null) {
            k1();
        }
        if (gVar instanceof androidx.activity.c) {
            androidx.activity.c cVar = (androidx.activity.c) gVar;
            OnBackPressedDispatcher j2 = cVar.j();
            this.f1786n = j2;
            androidx.lifecycle.g gVar2 = cVar;
            if (fragment != null) {
                gVar2 = fragment;
            }
            j2.a(gVar2, this.f1787o);
        }
        this.J = fragment != null ? fragment.f1716v.r0(fragment) : gVar instanceof t ? androidx.fragment.app.k.g(((t) gVar).f()) : new androidx.fragment.app.k(false);
    }

    public Fragment k0(String str) {
        if (str != null) {
            for (int size = this.f1782j.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1782j.get(size);
                if (fragment != null && str.equals(fragment.B)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.f1783k.values()) {
            if (fragment2 != null && str.equals(fragment2.B)) {
                return fragment2;
            }
        }
        return null;
    }

    public void l(Fragment fragment) {
        if (L) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.D) {
            fragment.D = false;
            if (fragment.f1709o) {
                return;
            }
            if (this.f1782j.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (L) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            synchronized (this.f1782j) {
                this.f1782j.add(fragment);
            }
            fragment.f1709o = true;
            if (z0(fragment)) {
                this.f1797y = true;
            }
        }
    }

    public Fragment l0(String str) {
        Fragment e3;
        for (Fragment fragment : this.f1783k.values()) {
            if (fragment != null && (e3 = fragment.e(str)) != null) {
                return e3;
            }
        }
        return null;
    }

    boolean n() {
        boolean z2 = false;
        for (Fragment fragment : this.f1783k.values()) {
            if (fragment != null) {
                z2 = z0(fragment);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public void o0(int i2) {
        synchronized (this) {
            this.f1788p.set(i2, null);
            if (this.f1789q == null) {
                this.f1789q = new ArrayList<>();
            }
            if (L) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.f1789q.add(Integer.valueOf(i2));
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f1822a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 == null || !androidx.fragment.app.f.b(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment j02 = resourceId != -1 ? j0(resourceId) : null;
        if (j02 == null && string != null) {
            j02 = k0(string);
        }
        if (j02 == null && id != -1) {
            j02 = j0(id);
        }
        if (L) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + j02);
        }
        if (j02 == null) {
            j02 = b().a(context.getClassLoader(), str2);
            j02.f1711q = true;
            j02.f1720z = resourceId != 0 ? resourceId : id;
            j02.A = id;
            j02.B = string;
            j02.f1712r = true;
            j02.f1716v = this;
            androidx.fragment.app.g gVar = this.f1793u;
            j02.f1717w = gVar;
            j02.j0(gVar.g(), attributeSet, j02.f1700f);
            h(j02, true);
        } else {
            if (j02.f1712r) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            j02.f1712r = true;
            androidx.fragment.app.g gVar2 = this.f1793u;
            j02.f1717w = gVar2;
            j02.j0(gVar2.g(), attributeSet, j02.f1700f);
        }
        Fragment fragment = j02;
        if (this.f1792t >= 1 || !fragment.f1711q) {
            L0(fragment);
        } else {
            M0(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.K;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.K.getTag() == null) {
                fragment.K.setTag(string);
            }
            return fragment.K;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    void q(androidx.fragment.app.a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.g(z4);
        } else {
            aVar.f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            n.B(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            K0(this.f1792t, true);
        }
        for (Fragment fragment : this.f1783k.values()) {
            if (fragment != null && fragment.K != null && fragment.Q && aVar.j(fragment.A)) {
                float f2 = fragment.S;
                if (f2 > 0.0f) {
                    fragment.K.setAlpha(f2);
                }
                if (z4) {
                    fragment.S = 0.0f;
                } else {
                    fragment.S = -1.0f;
                    fragment.Q = false;
                }
            }
        }
    }

    public int q0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f1784l;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void r(Fragment fragment) {
        Animator animator;
        if (fragment.K != null) {
            g D0 = D0(fragment, fragment.x(), !fragment.C, fragment.y());
            if (D0 == null || (animator = D0.f1815b) == null) {
                if (D0 != null) {
                    fragment.K.startAnimation(D0.f1814a);
                    D0.f1814a.start();
                }
                fragment.K.setVisibility((!fragment.C || fragment.M()) ? 0 : 8);
                if (fragment.M()) {
                    fragment.d1(false);
                }
            } else {
                animator.setTarget(fragment.K);
                if (!fragment.C) {
                    fragment.K.setVisibility(0);
                } else if (fragment.M()) {
                    fragment.d1(false);
                } else {
                    ViewGroup viewGroup = fragment.J;
                    View view = fragment.K;
                    viewGroup.startViewTransition(view);
                    D0.f1815b.addListener(new e(viewGroup, view, fragment));
                }
                D0.f1815b.start();
            }
        }
        if (fragment.f1709o && z0(fragment)) {
            this.f1797y = true;
        }
        fragment.R = false;
        fragment.h0(fragment.C);
    }

    androidx.fragment.app.k r0(Fragment fragment) {
        return this.J.f(fragment);
    }

    public void s(Fragment fragment) {
        if (L) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.D) {
            return;
        }
        fragment.D = true;
        if (fragment.f1709o) {
            if (L) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            synchronized (this.f1782j) {
                this.f1782j.remove(fragment);
            }
            if (z0(fragment)) {
                this.f1797y = true;
            }
            fragment.f1709o = false;
        }
    }

    public Fragment s0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.f1783k.get(string);
        if (fragment == null) {
            i1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    public void t() {
        this.f1798z = false;
        this.A = false;
        Z(2);
    }

    LayoutInflater.Factory2 t0() {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f1795w;
        if (obj == null) {
            obj = this.f1793u;
        }
        androidx.core.util.b.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public void u(Configuration configuration) {
        for (int i2 = 0; i2 < this.f1782j.size(); i2++) {
            Fragment fragment = this.f1782j.get(i2);
            if (fragment != null) {
                fragment.A0(configuration);
            }
        }
    }

    public Fragment u0() {
        return this.f1796x;
    }

    public boolean v(MenuItem menuItem) {
        if (this.f1792t < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1782j.size(); i2++) {
            Fragment fragment = this.f1782j.get(i2);
            if (fragment != null && fragment.B0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    s v0(Fragment fragment) {
        return this.J.i(fragment);
    }

    public void w() {
        this.f1798z = false;
        this.A = false;
        Z(1);
    }

    void w0() {
        f0();
        if (this.f1787o.c()) {
            d();
        } else {
            this.f1786n.c();
        }
    }

    public boolean x(Menu menu, MenuInflater menuInflater) {
        if (this.f1792t < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f1782j.size(); i2++) {
            Fragment fragment = this.f1782j.get(i2);
            if (fragment != null && fragment.D0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.f1785m != null) {
            for (int i3 = 0; i3 < this.f1785m.size(); i3++) {
                Fragment fragment2 = this.f1785m.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.d0();
                }
            }
        }
        this.f1785m = arrayList;
        return z2;
    }

    public void x0(Fragment fragment) {
        if (L) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.C) {
            return;
        }
        fragment.C = true;
        fragment.R = true ^ fragment.R;
    }

    public void y() {
        this.B = true;
        f0();
        Z(0);
        this.f1793u = null;
        this.f1794v = null;
        this.f1795w = null;
        if (this.f1786n != null) {
            this.f1787o.d();
            this.f1786n = null;
        }
    }

    public boolean y0() {
        return this.B;
    }

    public void z() {
        Z(1);
    }
}
