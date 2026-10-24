package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.k0;
import androidx.lifecycle.d;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.g, t, androidx.savedstate.b {

    /* renamed from: b0, reason: collision with root package name */
    static final Object f1697b0 = new Object();
    int A;
    String B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    private boolean I;
    ViewGroup J;
    View K;
    View L;
    boolean M;
    d O;
    boolean Q;
    boolean R;
    float S;
    LayoutInflater T;
    boolean U;
    androidx.lifecycle.h W;
    q X;
    androidx.savedstate.a Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f1698a0;

    /* renamed from: f, reason: collision with root package name */
    Bundle f1700f;

    /* renamed from: g, reason: collision with root package name */
    SparseArray<Parcelable> f1701g;

    /* renamed from: h, reason: collision with root package name */
    Boolean f1702h;

    /* renamed from: j, reason: collision with root package name */
    Bundle f1704j;

    /* renamed from: k, reason: collision with root package name */
    Fragment f1705k;

    /* renamed from: m, reason: collision with root package name */
    int f1707m;

    /* renamed from: o, reason: collision with root package name */
    boolean f1709o;

    /* renamed from: p, reason: collision with root package name */
    boolean f1710p;

    /* renamed from: q, reason: collision with root package name */
    boolean f1711q;

    /* renamed from: r, reason: collision with root package name */
    boolean f1712r;

    /* renamed from: s, reason: collision with root package name */
    boolean f1713s;

    /* renamed from: t, reason: collision with root package name */
    boolean f1714t;

    /* renamed from: u, reason: collision with root package name */
    int f1715u;

    /* renamed from: v, reason: collision with root package name */
    i f1716v;

    /* renamed from: w, reason: collision with root package name */
    g f1717w;

    /* renamed from: y, reason: collision with root package name */
    Fragment f1719y;

    /* renamed from: z, reason: collision with root package name */
    int f1720z;

    /* renamed from: e, reason: collision with root package name */
    int f1699e = 0;

    /* renamed from: i, reason: collision with root package name */
    String f1703i = UUID.randomUUID().toString();

    /* renamed from: l, reason: collision with root package name */
    String f1706l = null;

    /* renamed from: n, reason: collision with root package name */
    private Boolean f1708n = null;

    /* renamed from: x, reason: collision with root package name */
    i f1718x = new i();
    boolean H = true;
    boolean N = true;
    Runnable P = new a();
    d.c V = d.c.RESUMED;
    androidx.lifecycle.l<androidx.lifecycle.g> Y = new androidx.lifecycle.l<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.i1();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.b();
        }
    }

    class c extends androidx.fragment.app.d {
        c() {
        }

        @Override // androidx.fragment.app.d
        public View c(int i2) {
            View view = Fragment.this.K;
            if (view != null) {
                return view.findViewById(i2);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.d
        public boolean d() {
            return Fragment.this.K != null;
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        View f1725a;

        /* renamed from: b, reason: collision with root package name */
        Animator f1726b;

        /* renamed from: c, reason: collision with root package name */
        int f1727c;

        /* renamed from: d, reason: collision with root package name */
        int f1728d;

        /* renamed from: e, reason: collision with root package name */
        int f1729e;

        /* renamed from: f, reason: collision with root package name */
        int f1730f;

        /* renamed from: g, reason: collision with root package name */
        Object f1731g = null;

        /* renamed from: h, reason: collision with root package name */
        Object f1732h;

        /* renamed from: i, reason: collision with root package name */
        Object f1733i;

        /* renamed from: j, reason: collision with root package name */
        Object f1734j;

        /* renamed from: k, reason: collision with root package name */
        Object f1735k;

        /* renamed from: l, reason: collision with root package name */
        Object f1736l;

        /* renamed from: m, reason: collision with root package name */
        Boolean f1737m;

        /* renamed from: n, reason: collision with root package name */
        Boolean f1738n;

        /* renamed from: o, reason: collision with root package name */
        boolean f1739o;

        /* renamed from: p, reason: collision with root package name */
        f f1740p;

        /* renamed from: q, reason: collision with root package name */
        boolean f1741q;

        d() {
            Object obj = Fragment.f1697b0;
            this.f1732h = obj;
            this.f1733i = null;
            this.f1734j = obj;
            this.f1735k = null;
            this.f1736l = obj;
        }
    }

    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface f {
        void a();

        void b();
    }

    public Fragment() {
        J();
    }

    private void J() {
        this.W = new androidx.lifecycle.h(this);
        this.Z = androidx.savedstate.a.a(this);
        this.W.a(new androidx.lifecycle.e() { // from class: androidx.fragment.app.Fragment.2
            @Override // androidx.lifecycle.e
            public void d(androidx.lifecycle.g gVar, d.b bVar) {
                View view;
                if (bVar != d.b.ON_STOP || (view = Fragment.this.K) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
    }

    @Deprecated
    public static Fragment L(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = androidx.fragment.app.f.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.c1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e3) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    private d d() {
        if (this.O == null) {
            this.O = new d();
        }
        return this.O;
    }

    public Object A() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1734j;
        return obj == f1697b0 ? r() : obj;
    }

    void A0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f1718x.u(configuration);
    }

    public final Resources B() {
        return W0().getResources();
    }

    boolean B0(MenuItem menuItem) {
        if (this.C) {
            return false;
        }
        return W(menuItem) || this.f1718x.v(menuItem);
    }

    public final boolean C() {
        return this.E;
    }

    void C0(Bundle bundle) {
        this.f1718x.N0();
        this.f1699e = 1;
        this.I = false;
        this.Z.c(bundle);
        X(bundle);
        this.U = true;
        if (this.I) {
            this.W.h(d.b.ON_CREATE);
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onCreate()");
    }

    public Object D() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1732h;
        return obj == f1697b0 ? p() : obj;
    }

    boolean D0(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            z2 = true;
            a0(menu, menuInflater);
        }
        return z2 | this.f1718x.x(menu, menuInflater);
    }

    public Object E() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1735k;
    }

    void E0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1718x.N0();
        this.f1714t = true;
        this.X = new q();
        View b02 = b0(layoutInflater, viewGroup, bundle);
        this.K = b02;
        if (b02 != null) {
            this.X.c();
            this.Y.g(this.X);
        } else {
            if (this.X.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.X = null;
        }
    }

    public Object F() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1736l;
        return obj == f1697b0 ? E() : obj;
    }

    void F0() {
        this.f1718x.y();
        this.W.h(d.b.ON_DESTROY);
        this.f1699e = 0;
        this.I = false;
        this.U = false;
        c0();
        if (this.I) {
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onDestroy()");
    }

    int G() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1727c;
    }

    void G0() {
        this.f1718x.z();
        if (this.K != null) {
            this.X.b(d.b.ON_DESTROY);
        }
        this.f1699e = 1;
        this.I = false;
        e0();
        if (this.I) {
            androidx.loader.app.a.b(this).c();
            this.f1714t = false;
        } else {
            throw new r("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final Fragment H() {
        String str;
        Fragment fragment = this.f1705k;
        if (fragment != null) {
            return fragment;
        }
        i iVar = this.f1716v;
        if (iVar == null || (str = this.f1706l) == null) {
            return null;
        }
        return iVar.f1783k.get(str);
    }

    void H0() {
        this.I = false;
        f0();
        this.T = null;
        if (this.I) {
            if (this.f1718x.y0()) {
                return;
            }
            this.f1718x.y();
            this.f1718x = new i();
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onDetach()");
    }

    public View I() {
        return this.K;
    }

    LayoutInflater I0(Bundle bundle) {
        LayoutInflater g02 = g0(bundle);
        this.T = g02;
        return g02;
    }

    void J0() {
        onLowMemory();
        this.f1718x.A();
    }

    void K() {
        J();
        this.f1703i = UUID.randomUUID().toString();
        this.f1709o = false;
        this.f1710p = false;
        this.f1711q = false;
        this.f1712r = false;
        this.f1713s = false;
        this.f1715u = 0;
        this.f1716v = null;
        this.f1718x = new i();
        this.f1717w = null;
        this.f1720z = 0;
        this.A = 0;
        this.B = null;
        this.C = false;
        this.D = false;
    }

    void K0(boolean z2) {
        k0(z2);
        this.f1718x.B(z2);
    }

    boolean L0(MenuItem menuItem) {
        if (this.C) {
            return false;
        }
        return (this.G && this.H && l0(menuItem)) || this.f1718x.Q(menuItem);
    }

    boolean M() {
        d dVar = this.O;
        if (dVar == null) {
            return false;
        }
        return dVar.f1741q;
    }

    void M0(Menu menu) {
        if (this.C) {
            return;
        }
        if (this.G && this.H) {
            m0(menu);
        }
        this.f1718x.R(menu);
    }

    final boolean N() {
        return this.f1715u > 0;
    }

    void N0() {
        this.f1718x.T();
        if (this.K != null) {
            this.X.b(d.b.ON_PAUSE);
        }
        this.W.h(d.b.ON_PAUSE);
        this.f1699e = 3;
        this.I = false;
        n0();
        if (this.I) {
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onPause()");
    }

    boolean O() {
        d dVar = this.O;
        if (dVar == null) {
            return false;
        }
        return dVar.f1739o;
    }

    void O0(boolean z2) {
        o0(z2);
        this.f1718x.U(z2);
    }

    public final boolean P() {
        i iVar = this.f1716v;
        if (iVar == null) {
            return false;
        }
        return iVar.C0();
    }

    boolean P0(Menu menu) {
        boolean z2 = false;
        if (this.C) {
            return false;
        }
        if (this.G && this.H) {
            z2 = true;
            p0(menu);
        }
        return z2 | this.f1718x.V(menu);
    }

    void Q() {
        this.f1718x.N0();
    }

    void Q0() {
        boolean A0 = this.f1716v.A0(this);
        Boolean bool = this.f1708n;
        if (bool == null || bool.booleanValue() != A0) {
            this.f1708n = Boolean.valueOf(A0);
            q0(A0);
            this.f1718x.W();
        }
    }

    public void R(Bundle bundle) {
        this.I = true;
    }

    void R0() {
        this.f1718x.N0();
        this.f1718x.f0();
        this.f1699e = 4;
        this.I = false;
        s0();
        if (!this.I) {
            throw new r("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.h hVar = this.W;
        d.b bVar = d.b.ON_RESUME;
        hVar.h(bVar);
        if (this.K != null) {
            this.X.b(bVar);
        }
        this.f1718x.X();
        this.f1718x.f0();
    }

    public void S(int i2, int i3, Intent intent) {
    }

    void S0(Bundle bundle) {
        t0(bundle);
        this.Z.d(bundle);
        Parcelable Z0 = this.f1718x.Z0();
        if (Z0 != null) {
            bundle.putParcelable("android:support:fragments", Z0);
        }
    }

    @Deprecated
    public void T(Activity activity) {
        this.I = true;
    }

    void T0() {
        this.f1718x.N0();
        this.f1718x.f0();
        this.f1699e = 3;
        this.I = false;
        u0();
        if (!this.I) {
            throw new r("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.h hVar = this.W;
        d.b bVar = d.b.ON_START;
        hVar.h(bVar);
        if (this.K != null) {
            this.X.b(bVar);
        }
        this.f1718x.Y();
    }

    public void U(Context context) {
        this.I = true;
        g gVar = this.f1717w;
        Activity e3 = gVar == null ? null : gVar.e();
        if (e3 != null) {
            this.I = false;
            T(e3);
        }
    }

    void U0() {
        this.f1718x.a0();
        if (this.K != null) {
            this.X.b(d.b.ON_STOP);
        }
        this.W.h(d.b.ON_STOP);
        this.f1699e = 2;
        this.I = false;
        v0();
        if (this.I) {
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onStop()");
    }

    public void V(Fragment fragment) {
    }

    public final androidx.fragment.app.c V0() {
        androidx.fragment.app.c g2 = g();
        if (g2 != null) {
            return g2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public boolean W(MenuItem menuItem) {
        return false;
    }

    public final Context W0() {
        Context o2 = o();
        if (o2 != null) {
            return o2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void X(Bundle bundle) {
        this.I = true;
        Y0(bundle);
        if (this.f1718x.B0(1)) {
            return;
        }
        this.f1718x.w();
    }

    public final View X0() {
        View I = I();
        if (I != null) {
            return I;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Animation Y(int i2, boolean z2, int i3) {
        return null;
    }

    void Y0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f1718x.X0(parcelable);
        this.f1718x.w();
    }

    public Animator Z(int i2, boolean z2, int i3) {
        return null;
    }

    final void Z0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1701g;
        if (sparseArray != null) {
            this.L.restoreHierarchyState(sparseArray);
            this.f1701g = null;
        }
        this.I = false;
        x0(bundle);
        if (this.I) {
            if (this.K != null) {
                this.X.b(d.b.ON_CREATE);
            }
        } else {
            throw new r("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        return this.W;
    }

    public void a0(Menu menu, MenuInflater menuInflater) {
    }

    void a1(View view) {
        d().f1725a = view;
    }

    void b() {
        d dVar = this.O;
        f fVar = null;
        if (dVar != null) {
            dVar.f1739o = false;
            f fVar2 = dVar.f1740p;
            dVar.f1740p = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public View b0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.f1698a0;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    void b1(Animator animator) {
        d().f1726b = animator;
    }

    public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1720z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mTag=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1699e);
        printWriter.print(" mWho=");
        printWriter.print(this.f1703i);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1715u);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1709o);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1710p);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1711q);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1712r);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.C);
        printWriter.print(" mDetached=");
        printWriter.print(this.D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.N);
        if (this.f1716v != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1716v);
        }
        if (this.f1717w != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1717w);
        }
        if (this.f1719y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1719y);
        }
        if (this.f1704j != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1704j);
        }
        if (this.f1700f != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1700f);
        }
        if (this.f1701g != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1701g);
        }
        Fragment H = H();
        if (H != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(H);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1707m);
        }
        if (w() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(w());
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.K);
        }
        if (l() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(l());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(G());
        }
        if (o() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f1718x + ":");
        this.f1718x.a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void c0() {
        this.I = true;
    }

    public void c1(Bundle bundle) {
        if (this.f1716v != null && P()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1704j = bundle;
    }

    public void d0() {
    }

    void d1(boolean z2) {
        d().f1741q = z2;
    }

    Fragment e(String str) {
        return str.equals(this.f1703i) ? this : this.f1718x.l0(str);
    }

    public void e0() {
        this.I = true;
    }

    void e1(int i2) {
        if (this.O == null && i2 == 0) {
            return;
        }
        d().f1728d = i2;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.lifecycle.t
    public s f() {
        i iVar = this.f1716v;
        if (iVar != null) {
            return iVar.v0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void f0() {
        this.I = true;
    }

    void f1(int i2, int i3) {
        if (this.O == null && i2 == 0 && i3 == 0) {
            return;
        }
        d();
        d dVar = this.O;
        dVar.f1729e = i2;
        dVar.f1730f = i3;
    }

    public final androidx.fragment.app.c g() {
        g gVar = this.f1717w;
        if (gVar == null) {
            return null;
        }
        return (androidx.fragment.app.c) gVar.e();
    }

    public LayoutInflater g0(Bundle bundle) {
        return v(bundle);
    }

    void g1(f fVar) {
        d();
        d dVar = this.O;
        f fVar2 = dVar.f1740p;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (dVar.f1739o) {
            dVar.f1740p = fVar;
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    public boolean h() {
        Boolean bool;
        d dVar = this.O;
        if (dVar == null || (bool = dVar.f1738n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void h0(boolean z2) {
    }

    void h1(int i2) {
        d().f1727c = i2;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public boolean i() {
        Boolean bool;
        d dVar = this.O;
        if (dVar == null || (bool = dVar.f1737m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void i0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
    }

    public void i1() {
        i iVar = this.f1716v;
        if (iVar == null || iVar.f1793u == null) {
            d().f1739o = false;
        } else if (Looper.myLooper() != this.f1716v.f1793u.h().getLooper()) {
            this.f1716v.f1793u.h().postAtFrontOfQueue(new b());
        } else {
            b();
        }
    }

    public void j0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.I = true;
        g gVar = this.f1717w;
        Activity e3 = gVar == null ? null : gVar.e();
        if (e3 != null) {
            this.I = false;
            i0(e3, attributeSet, bundle);
        }
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry k() {
        return this.Z.b();
    }

    public void k0(boolean z2) {
    }

    View l() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1725a;
    }

    public boolean l0(MenuItem menuItem) {
        return false;
    }

    Animator m() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1726b;
    }

    public void m0(Menu menu) {
    }

    public final h n() {
        if (this.f1717w != null) {
            return this.f1718x;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void n0() {
        this.I = true;
    }

    public Context o() {
        g gVar = this.f1717w;
        if (gVar == null) {
            return null;
        }
        return gVar.g();
    }

    public void o0(boolean z2) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.I = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        V0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.I = true;
    }

    public Object p() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1731g;
    }

    public void p0(Menu menu) {
    }

    k0 q() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        dVar.getClass();
        return null;
    }

    public void q0(boolean z2) {
    }

    public Object r() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1733i;
    }

    public void r0(int i2, String[] strArr, int[] iArr) {
    }

    k0 s() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        dVar.getClass();
        return null;
    }

    public void s0() {
        this.I = true;
    }

    public final h t() {
        return this.f1716v;
    }

    public void t0(Bundle bundle) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        androidx.core.util.b.a(this, sb);
        sb.append(" (");
        sb.append(this.f1703i);
        sb.append(")");
        if (this.f1720z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1720z));
        }
        if (this.B != null) {
            sb.append(" ");
            sb.append(this.B);
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object u() {
        g gVar = this.f1717w;
        if (gVar == null) {
            return null;
        }
        return gVar.m();
    }

    public void u0() {
        this.I = true;
    }

    @Deprecated
    public LayoutInflater v(Bundle bundle) {
        g gVar = this.f1717w;
        if (gVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater n2 = gVar.n();
        androidx.core.view.g.a(n2, this.f1718x.t0());
        return n2;
    }

    public void v0() {
        this.I = true;
    }

    int w() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1728d;
    }

    public void w0(View view, Bundle bundle) {
    }

    int x() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1729e;
    }

    public void x0(Bundle bundle) {
        this.I = true;
    }

    int y() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1730f;
    }

    void y0(Bundle bundle) {
        this.f1718x.N0();
        this.f1699e = 2;
        this.I = false;
        R(bundle);
        if (this.I) {
            this.f1718x.t();
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public final Fragment z() {
        return this.f1719y;
    }

    void z0() {
        this.f1718x.k(this.f1717w, new c(), this);
        this.I = false;
        U(this.f1717w.g());
        if (this.I) {
            return;
        }
        throw new r("Fragment " + this + " did not call through to super.onAttach()");
    }
}
