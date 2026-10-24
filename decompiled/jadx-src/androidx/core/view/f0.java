package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.f0;
import androidx.core.view.g1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: c, reason: collision with root package name */
    private static Field f1572c;

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f1570a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private static WeakHashMap<View, c1> f1571b = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f1573d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f1574e = {r.c.f4232b, r.c.f4233c, r.c.f4244n, r.c.f4255y, r.c.B, r.c.C, r.c.D, r.c.E, r.c.F, r.c.G, r.c.f4234d, r.c.f4235e, r.c.f4236f, r.c.f4237g, r.c.f4238h, r.c.f4239i, r.c.f4240j, r.c.f4241k, r.c.f4242l, r.c.f4243m, r.c.f4245o, r.c.f4246p, r.c.f4247q, r.c.f4248r, r.c.f4249s, r.c.f4250t, r.c.f4251u, r.c.f4252v, r.c.f4253w, r.c.f4254x, r.c.f4256z, r.c.A};

    /* renamed from: f, reason: collision with root package name */
    private static final c0 f1575f = new c0() { // from class: androidx.core.view.e0
    };

    /* renamed from: g, reason: collision with root package name */
    private static final e f1576g = new e();

    class a extends f<Boolean> {
        a(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f0.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(n.d(view));
        }
    }

    class b extends f<CharSequence> {
        b(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f0.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }
    }

    class c extends f<CharSequence> {
        c(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f0.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return p.a(view);
        }
    }

    class d extends f<Boolean> {
        d(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.f0.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(n.c(view));
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: e, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f1577e = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z2) {
            boolean z3 = view.isShown() && view.getWindowVisibility() == 0;
            if (z2 != z3) {
                f0.y(view, z3 ? 16 : 32);
                this.f1577e.put(view, Boolean.valueOf(z3));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f1577e.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {

        /* renamed from: a, reason: collision with root package name */
        private final int f1578a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<T> f1579b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1580c;

        /* renamed from: d, reason: collision with root package name */
        private final int f1581d;

        f(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        f(int i2, Class<T> cls, int i3, int i4) {
            this.f1578a = i2;
            this.f1579b = cls;
            this.f1581d = i3;
            this.f1580c = i4;
        }

        private boolean a() {
            return true;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f1580c;
        }

        abstract T c(View view);

        T d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            T t2 = (T) view.getTag(this.f1578a);
            if (this.f1579b.isInstance(t2)) {
                return t2;
            }
            return null;
        }
    }

    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i2, Bundle bundle) {
            return view.performAccessibilityAction(i2, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i2, int i3, int i4, int i5) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j2) {
            view.postOnAnimationDelayed(runnable, j2);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z2) {
            view.setHasTransientState(z2);
        }

        static void s(View view, int i2) {
            view.setImportantForAccessibility(i2);
        }
    }

    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i2) {
            view.setLabelFor(i2);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i2) {
            view.setLayoutDirection(i2);
        }

        static void k(View view, int i2, int i3, int i4, int i5) {
            view.setPaddingRelative(i2, i3, i4, i5);
        }
    }

    static class j {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
        }

        static void f(View view, int i2) {
            view.setAccessibilityLiveRegion(i2);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setContentChangeTypes(i2);
        }
    }

    static class k {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class l {

        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            g1 f1582a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f1583b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b0 f1584c;

            a(View view, b0 b0Var) {
                this.f1583b = view;
                this.f1584c = b0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                g1 v2 = g1.v(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    l.a(windowInsets, this.f1583b);
                    if (v2.equals(this.f1582a)) {
                        return this.f1584c.a(view, v2).t();
                    }
                }
                this.f1582a = v2;
                g1 a3 = this.f1584c.a(view, v2);
                if (i2 >= 30) {
                    return a3.t();
                }
                f0.E(view);
                return a3.t();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(r.c.Q);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static g1 b(View view, g1 g1Var, Rect rect) {
            WindowInsets t2 = g1Var.t();
            if (t2 != null) {
                return g1.v(view.computeSystemWindowInsets(t2, rect), view);
            }
            rect.setEmpty();
            return g1Var;
        }

        static boolean c(View view, float f2, float f3, boolean z2) {
            return view.dispatchNestedFling(f2, f3, z2);
        }

        static boolean d(View view, float f2, float f3) {
            return view.dispatchNestedPreFling(f2, f3);
        }

        static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
        }

        static boolean f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
            return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static g1 j(View view) {
            return g1.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f2) {
            view.setElevation(f2);
        }

        static void t(View view, boolean z2) {
            view.setNestedScrollingEnabled(z2);
        }

        static void u(View view, b0 b0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(r.c.L, b0Var);
            }
            if (b0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(r.c.Q));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, b0Var));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f2) {
            view.setTranslationZ(f2);
        }

        static void x(View view, float f2) {
            view.setZ(f2);
        }

        static boolean y(View view, int i2) {
            return view.startNestedScroll(i2);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class m {
        public static g1 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            g1 u2 = g1.u(rootWindowInsets);
            u2.r(u2);
            u2.d(view.getRootView());
            return u2;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i2) {
            view.setScrollIndicators(i2);
        }

        static void d(View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }
    }

    static class n {
        static void a(View view, final q qVar) {
            int i2 = r.c.P;
            l.g gVar = (l.g) view.getTag(i2);
            if (gVar == null) {
                gVar = new l.g();
                view.setTag(i2, gVar);
            }
            Objects.requireNonNull(qVar);
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener = new View$OnUnhandledKeyEventListener() { // from class: androidx.core.view.p0
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return f0.q.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(qVar, view$OnUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        static boolean c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        static boolean d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        static void e(View view, q qVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            l.g gVar = (l.g) view.getTag(r.c.P);
            if (gVar == null || (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) gVar.get(qVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i2) {
            KeyEvent.Callback requireViewById;
            requireViewById = view.requireViewById(i2);
            return (T) requireViewById;
        }

        static void g(View view, boolean z2) {
            view.setAccessibilityHeading(z2);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z2) {
            view.setScreenReaderFocusable(z2);
        }
    }

    private static class o {
        static View.AccessibilityDelegate a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        static List<Rect> b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class p {
        static CharSequence a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public interface q {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class r {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f1585d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f1586a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f1587b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f1588c = null;

        r() {
        }

        static r a(View view) {
            int i2 = r.c.O;
            r rVar = (r) view.getTag(i2);
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r();
            view.setTag(i2, rVar2);
            return rVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f1586a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c3 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c3 != null) {
                            return c3;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f1587b == null) {
                this.f1587b = new SparseArray<>();
            }
            return this.f1587b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(r.c.P);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((q) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f1586a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f1585d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f1586a == null) {
                    this.f1586a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f1585d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f1586a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f1586a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c3 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c3));
                }
            }
            return c3 != null;
        }

        boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f1588c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f1588c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> d3 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d3.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d3.valueAt(indexOfKey);
                d3.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d3.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && f0.v(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    private static f<CharSequence> A() {
        return new b(r.c.K, CharSequence.class, 8, 28);
    }

    public static void B(View view) {
        h.k(view);
    }

    public static void C(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    @SuppressLint({"LambdaLast"})
    public static void D(View view, Runnable runnable, long j2) {
        h.n(view, runnable, j2);
    }

    public static void E(View view) {
        k.c(view);
    }

    public static void F(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            o.c(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    private static f<Boolean> G() {
        return new a(r.c.M, Boolean.class, 28);
    }

    public static void H(View view, androidx.core.view.a aVar) {
        if (aVar == null && (g(view) instanceof a.C0025a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void I(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static void J(View view, ColorStateList colorStateList) {
        l.q(view, colorStateList);
    }

    public static void K(View view, PorterDuff.Mode mode) {
        l.r(view, mode);
    }

    public static void L(View view, float f2) {
        l.s(view, f2);
    }

    public static void M(View view, int i2) {
        h.s(view, i2);
    }

    public static void N(View view, b0 b0Var) {
        l.u(view, b0Var);
    }

    public static void O(View view, int i2, int i3) {
        m.d(view, i2, i3);
    }

    public static void P(View view, String str) {
        l.v(view, str);
    }

    private static void Q(View view) {
        if (m(view) == 0) {
            M(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m((View) parent) == 4) {
                M(view, 2);
                return;
            }
        }
    }

    private static f<CharSequence> R() {
        return new c(r.c.N, CharSequence.class, 64, 30);
    }

    public static void S(View view) {
        l.z(view);
    }

    private static f<Boolean> a() {
        return new d(r.c.J, Boolean.class, 28);
    }

    public static c1 b(View view) {
        if (f1571b == null) {
            f1571b = new WeakHashMap<>();
        }
        c1 c1Var = f1571b.get(view);
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1Var2 = new c1(view);
        f1571b.put(view, c1Var2);
        return c1Var2;
    }

    public static g1 c(View view, g1 g1Var, Rect rect) {
        return l.b(view, g1Var, rect);
    }

    public static g1 d(View view, g1 g1Var) {
        WindowInsets t2 = g1Var.t();
        if (t2 != null) {
            WindowInsets a3 = k.a(view, t2);
            if (!a3.equals(t2)) {
                return g1.v(a3, view);
            }
        }
        return g1Var;
    }

    static boolean e(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).b(view, keyEvent);
    }

    static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).f(keyEvent);
    }

    private static View.AccessibilityDelegate g(View view) {
        return Build.VERSION.SDK_INT >= 29 ? o.a(view) : h(view);
    }

    private static View.AccessibilityDelegate h(View view) {
        if (f1573d) {
            return null;
        }
        if (f1572c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1572c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1573d = true;
                return null;
            }
        }
        try {
            Object obj = f1572c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f1573d = true;
            return null;
        }
    }

    public static int i(View view) {
        return j.a(view);
    }

    public static CharSequence j(View view) {
        return A().d(view);
    }

    public static ColorStateList k(View view) {
        return l.g(view);
    }

    public static PorterDuff.Mode l(View view) {
        return l.h(view);
    }

    public static int m(View view) {
        return h.c(view);
    }

    public static int n(View view) {
        return i.d(view);
    }

    public static int o(View view) {
        return h.d(view);
    }

    public static g1 p(View view) {
        return m.a(view);
    }

    public static CharSequence q(View view) {
        return R().d(view);
    }

    public static String r(View view) {
        return l.k(view);
    }

    @Deprecated
    public static int s(View view) {
        return h.g(view);
    }

    public static boolean t(View view) {
        return g.a(view);
    }

    public static boolean u(View view) {
        Boolean d3 = a().d(view);
        return d3 != null && d3.booleanValue();
    }

    public static boolean v(View view) {
        return j.b(view);
    }

    public static boolean w(View view) {
        return j.c(view);
    }

    public static boolean x(View view) {
        Boolean d3 = G().d(view);
        return d3 != null && d3.booleanValue();
    }

    static void y(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = j(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (i(view) != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z2 ? 32 : 2048);
                j.g(obtain, i2);
                if (z2) {
                    obtain.getText().add(j(view));
                    Q(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                j.g(obtain2, i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(j(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    j.e(view.getParent(), view, view, i2);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e3);
                }
            }
        }
    }

    public static g1 z(View view, g1 g1Var) {
        WindowInsets t2 = g1Var.t();
        if (t2 != null) {
            WindowInsets b3 = k.b(view, t2);
            if (!b3.equals(t2)) {
                return g1.v(b3, view);
            }
        }
        return g1Var;
    }
}
