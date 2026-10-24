package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class g1 {

    /* renamed from: b, reason: collision with root package name */
    public static final g1 f1589b;

    /* renamed from: a, reason: collision with root package name */
    private final l f1590a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Field f1591a;

        /* renamed from: b, reason: collision with root package name */
        private static Field f1592b;

        /* renamed from: c, reason: collision with root package name */
        private static Field f1593c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f1594d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f1591a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f1592b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f1593c = declaredField3;
                declaredField3.setAccessible(true);
                f1594d = true;
            } catch (ReflectiveOperationException e3) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e3.getMessage(), e3);
            }
        }

        public static g1 a(View view) {
            if (f1594d && view.isAttachedToWindow()) {
                try {
                    Object obj = f1591a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f1592b.get(obj);
                        Rect rect2 = (Rect) f1593c.get(obj);
                        if (rect != null && rect2 != null) {
                            g1 a3 = new b().b(androidx.core.graphics.b.c(rect)).c(androidx.core.graphics.b.c(rect2)).a();
                            a3.r(a3);
                            a3.d(view.getRootView());
                            return a3;
                        }
                    }
                } catch (IllegalAccessException e3) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e3.getMessage(), e3);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f1595a;

        public b() {
            int i2 = Build.VERSION.SDK_INT;
            this.f1595a = i2 >= 30 ? new e() : i2 >= 29 ? new d() : new c();
        }

        public b(g1 g1Var) {
            int i2 = Build.VERSION.SDK_INT;
            this.f1595a = i2 >= 30 ? new e(g1Var) : i2 >= 29 ? new d(g1Var) : new c(g1Var);
        }

        public g1 a() {
            return this.f1595a.b();
        }

        @Deprecated
        public b b(androidx.core.graphics.b bVar) {
            this.f1595a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.b bVar) {
            this.f1595a.f(bVar);
            return this;
        }
    }

    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private static Field f1596e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f1597f = false;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f1598g = null;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f1599h = false;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f1600c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.b f1601d;

        c() {
            this.f1600c = h();
        }

        c(g1 g1Var) {
            super(g1Var);
            this.f1600c = g1Var.t();
        }

        private static WindowInsets h() {
            if (!f1597f) {
                try {
                    f1596e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
                }
                f1597f = true;
            }
            Field field = f1596e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
                }
            }
            if (!f1599h) {
                try {
                    f1598g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
                }
                f1599h = true;
            }
            Constructor<WindowInsets> constructor = f1598g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e6) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
                }
            }
            return null;
        }

        @Override // androidx.core.view.g1.f
        g1 b() {
            a();
            g1 u2 = g1.u(this.f1600c);
            u2.p(this.f1604b);
            u2.s(this.f1601d);
            return u2;
        }

        @Override // androidx.core.view.g1.f
        void d(androidx.core.graphics.b bVar) {
            this.f1601d = bVar;
        }

        @Override // androidx.core.view.g1.f
        void f(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f1600c;
            if (windowInsets != null) {
                this.f1600c = windowInsets.replaceSystemWindowInsets(bVar.f1418a, bVar.f1419b, bVar.f1420c, bVar.f1421d);
            }
        }
    }

    private static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets$Builder f1602c;

        d() {
            this.f1602c = new WindowInsets$Builder();
        }

        d(g1 g1Var) {
            super(g1Var);
            WindowInsets t2 = g1Var.t();
            this.f1602c = t2 != null ? new WindowInsets$Builder(t2) : new WindowInsets$Builder();
        }

        @Override // androidx.core.view.g1.f
        g1 b() {
            a();
            g1 u2 = g1.u(this.f1602c.build());
            u2.p(this.f1604b);
            return u2;
        }

        @Override // androidx.core.view.g1.f
        void c(androidx.core.graphics.b bVar) {
            this.f1602c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.g1.f
        void d(androidx.core.graphics.b bVar) {
            this.f1602c.setStableInsets(bVar.e());
        }

        @Override // androidx.core.view.g1.f
        void e(androidx.core.graphics.b bVar) {
            this.f1602c.setSystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.g1.f
        void f(androidx.core.graphics.b bVar) {
            this.f1602c.setSystemWindowInsets(bVar.e());
        }

        @Override // androidx.core.view.g1.f
        void g(androidx.core.graphics.b bVar) {
            this.f1602c.setTappableElementInsets(bVar.e());
        }
    }

    private static class e extends d {
        e() {
        }

        e(g1 g1Var) {
            super(g1Var);
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private final g1 f1603a;

        /* renamed from: b, reason: collision with root package name */
        androidx.core.graphics.b[] f1604b;

        f() {
            this(new g1((g1) null));
        }

        f(g1 g1Var) {
            this.f1603a = g1Var;
        }

        protected final void a() {
            androidx.core.graphics.b[] bVarArr = this.f1604b;
            if (bVarArr != null) {
                androidx.core.graphics.b bVar = bVarArr[m.b(1)];
                androidx.core.graphics.b bVar2 = this.f1604b[m.b(2)];
                if (bVar2 == null) {
                    bVar2 = this.f1603a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f1603a.f(1);
                }
                f(androidx.core.graphics.b.a(bVar, bVar2));
                androidx.core.graphics.b bVar3 = this.f1604b[m.b(16)];
                if (bVar3 != null) {
                    e(bVar3);
                }
                androidx.core.graphics.b bVar4 = this.f1604b[m.b(32)];
                if (bVar4 != null) {
                    c(bVar4);
                }
                androidx.core.graphics.b bVar5 = this.f1604b[m.b(64)];
                if (bVar5 != null) {
                    g(bVar5);
                }
            }
        }

        g1 b() {
            throw null;
        }

        void c(androidx.core.graphics.b bVar) {
        }

        void d(androidx.core.graphics.b bVar) {
            throw null;
        }

        void e(androidx.core.graphics.b bVar) {
        }

        void f(androidx.core.graphics.b bVar) {
            throw null;
        }

        void g(androidx.core.graphics.b bVar) {
        }
    }

    private static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f1605h = false;

        /* renamed from: i, reason: collision with root package name */
        private static Method f1606i;

        /* renamed from: j, reason: collision with root package name */
        private static Class<?> f1607j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f1608k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f1609l;

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets f1610c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.b[] f1611d;

        /* renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.b f1612e;

        /* renamed from: f, reason: collision with root package name */
        private g1 f1613f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.graphics.b f1614g;

        g(g1 g1Var, WindowInsets windowInsets) {
            super(g1Var);
            this.f1612e = null;
            this.f1610c = windowInsets;
        }

        g(g1 g1Var, g gVar) {
            this(g1Var, new WindowInsets(gVar.f1610c));
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.b u(int i2, boolean z2) {
            androidx.core.graphics.b bVar = androidx.core.graphics.b.f1417e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    bVar = androidx.core.graphics.b.a(bVar, v(i3, z2));
                }
            }
            return bVar;
        }

        private androidx.core.graphics.b w() {
            g1 g1Var = this.f1613f;
            return g1Var != null ? g1Var.g() : androidx.core.graphics.b.f1417e;
        }

        private androidx.core.graphics.b x(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f1605h) {
                z();
            }
            Method method = f1606i;
            if (method != null && f1607j != null && f1608k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f1608k.get(f1609l.get(invoke));
                    if (rect != null) {
                        return androidx.core.graphics.b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e3) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void z() {
            try {
                f1606i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f1607j = cls;
                f1608k = cls.getDeclaredField("mVisibleInsets");
                f1609l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f1608k.setAccessible(true);
                f1609l.setAccessible(true);
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
            f1605h = true;
        }

        @Override // androidx.core.view.g1.l
        void d(View view) {
            androidx.core.graphics.b x2 = x(view);
            if (x2 == null) {
                x2 = androidx.core.graphics.b.f1417e;
            }
            r(x2);
        }

        @Override // androidx.core.view.g1.l
        void e(g1 g1Var) {
            g1Var.r(this.f1613f);
            g1Var.q(this.f1614g);
        }

        @Override // androidx.core.view.g1.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f1614g, ((g) obj).f1614g);
            }
            return false;
        }

        @Override // androidx.core.view.g1.l
        public androidx.core.graphics.b g(int i2) {
            return u(i2, false);
        }

        @Override // androidx.core.view.g1.l
        final androidx.core.graphics.b k() {
            if (this.f1612e == null) {
                this.f1612e = androidx.core.graphics.b.b(this.f1610c.getSystemWindowInsetLeft(), this.f1610c.getSystemWindowInsetTop(), this.f1610c.getSystemWindowInsetRight(), this.f1610c.getSystemWindowInsetBottom());
            }
            return this.f1612e;
        }

        @Override // androidx.core.view.g1.l
        g1 m(int i2, int i3, int i4, int i5) {
            b bVar = new b(g1.u(this.f1610c));
            bVar.c(g1.m(k(), i2, i3, i4, i5));
            bVar.b(g1.m(i(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // androidx.core.view.g1.l
        boolean o() {
            return this.f1610c.isRound();
        }

        @Override // androidx.core.view.g1.l
        @SuppressLint({"WrongConstant"})
        boolean p(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0 && !y(i3)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.g1.l
        public void q(androidx.core.graphics.b[] bVarArr) {
            this.f1611d = bVarArr;
        }

        @Override // androidx.core.view.g1.l
        void r(androidx.core.graphics.b bVar) {
            this.f1614g = bVar;
        }

        @Override // androidx.core.view.g1.l
        void s(g1 g1Var) {
            this.f1613f = g1Var;
        }

        protected androidx.core.graphics.b v(int i2, boolean z2) {
            androidx.core.graphics.b g2;
            int i3;
            if (i2 == 1) {
                return z2 ? androidx.core.graphics.b.b(0, Math.max(w().f1419b, k().f1419b), 0, 0) : androidx.core.graphics.b.b(0, k().f1419b, 0, 0);
            }
            if (i2 == 2) {
                if (z2) {
                    androidx.core.graphics.b w2 = w();
                    androidx.core.graphics.b i4 = i();
                    return androidx.core.graphics.b.b(Math.max(w2.f1418a, i4.f1418a), 0, Math.max(w2.f1420c, i4.f1420c), Math.max(w2.f1421d, i4.f1421d));
                }
                androidx.core.graphics.b k2 = k();
                g1 g1Var = this.f1613f;
                g2 = g1Var != null ? g1Var.g() : null;
                int i5 = k2.f1421d;
                if (g2 != null) {
                    i5 = Math.min(i5, g2.f1421d);
                }
                return androidx.core.graphics.b.b(k2.f1418a, 0, k2.f1420c, i5);
            }
            if (i2 != 8) {
                if (i2 == 16) {
                    return j();
                }
                if (i2 == 32) {
                    return h();
                }
                if (i2 == 64) {
                    return l();
                }
                if (i2 != 128) {
                    return androidx.core.graphics.b.f1417e;
                }
                g1 g1Var2 = this.f1613f;
                androidx.core.view.c e3 = g1Var2 != null ? g1Var2.e() : f();
                return e3 != null ? androidx.core.graphics.b.b(e3.b(), e3.d(), e3.c(), e3.a()) : androidx.core.graphics.b.f1417e;
            }
            androidx.core.graphics.b[] bVarArr = this.f1611d;
            g2 = bVarArr != null ? bVarArr[m.b(8)] : null;
            if (g2 != null) {
                return g2;
            }
            androidx.core.graphics.b k3 = k();
            androidx.core.graphics.b w3 = w();
            int i6 = k3.f1421d;
            if (i6 > w3.f1421d) {
                return androidx.core.graphics.b.b(0, 0, 0, i6);
            }
            androidx.core.graphics.b bVar = this.f1614g;
            return (bVar == null || bVar.equals(androidx.core.graphics.b.f1417e) || (i3 = this.f1614g.f1421d) <= w3.f1421d) ? androidx.core.graphics.b.f1417e : androidx.core.graphics.b.b(0, 0, 0, i3);
        }

        protected boolean y(int i2) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 8 && i2 != 128) {
                    return true;
                }
            }
            return !v(i2, false).equals(androidx.core.graphics.b.f1417e);
        }
    }

    private static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.b f1615m;

        h(g1 g1Var, WindowInsets windowInsets) {
            super(g1Var, windowInsets);
            this.f1615m = null;
        }

        h(g1 g1Var, h hVar) {
            super(g1Var, hVar);
            this.f1615m = null;
            this.f1615m = hVar.f1615m;
        }

        @Override // androidx.core.view.g1.l
        g1 b() {
            return g1.u(this.f1610c.consumeStableInsets());
        }

        @Override // androidx.core.view.g1.l
        g1 c() {
            return g1.u(this.f1610c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.g1.l
        final androidx.core.graphics.b i() {
            if (this.f1615m == null) {
                this.f1615m = androidx.core.graphics.b.b(this.f1610c.getStableInsetLeft(), this.f1610c.getStableInsetTop(), this.f1610c.getStableInsetRight(), this.f1610c.getStableInsetBottom());
            }
            return this.f1615m;
        }

        @Override // androidx.core.view.g1.l
        boolean n() {
            return this.f1610c.isConsumed();
        }

        @Override // androidx.core.view.g1.l
        public void t(androidx.core.graphics.b bVar) {
            this.f1615m = bVar;
        }
    }

    private static class i extends h {
        i(g1 g1Var, WindowInsets windowInsets) {
            super(g1Var, windowInsets);
        }

        i(g1 g1Var, i iVar) {
            super(g1Var, iVar);
        }

        @Override // androidx.core.view.g1.l
        g1 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f1610c.consumeDisplayCutout();
            return g1.u(consumeDisplayCutout);
        }

        @Override // androidx.core.view.g1.g, androidx.core.view.g1.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f1610c, iVar.f1610c) && Objects.equals(this.f1614g, iVar.f1614g);
        }

        @Override // androidx.core.view.g1.l
        androidx.core.view.c f() {
            DisplayCutout displayCutout;
            displayCutout = this.f1610c.getDisplayCutout();
            return androidx.core.view.c.e(displayCutout);
        }

        @Override // androidx.core.view.g1.l
        public int hashCode() {
            return this.f1610c.hashCode();
        }
    }

    private static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.b f1616n;

        /* renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.b f1617o;

        /* renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.b f1618p;

        j(g1 g1Var, WindowInsets windowInsets) {
            super(g1Var, windowInsets);
            this.f1616n = null;
            this.f1617o = null;
            this.f1618p = null;
        }

        j(g1 g1Var, j jVar) {
            super(g1Var, jVar);
            this.f1616n = null;
            this.f1617o = null;
            this.f1618p = null;
        }

        @Override // androidx.core.view.g1.l
        androidx.core.graphics.b h() {
            Insets mandatorySystemGestureInsets;
            if (this.f1617o == null) {
                mandatorySystemGestureInsets = this.f1610c.getMandatorySystemGestureInsets();
                this.f1617o = androidx.core.graphics.b.d(mandatorySystemGestureInsets);
            }
            return this.f1617o;
        }

        @Override // androidx.core.view.g1.l
        androidx.core.graphics.b j() {
            Insets systemGestureInsets;
            if (this.f1616n == null) {
                systemGestureInsets = this.f1610c.getSystemGestureInsets();
                this.f1616n = androidx.core.graphics.b.d(systemGestureInsets);
            }
            return this.f1616n;
        }

        @Override // androidx.core.view.g1.l
        androidx.core.graphics.b l() {
            Insets tappableElementInsets;
            if (this.f1618p == null) {
                tappableElementInsets = this.f1610c.getTappableElementInsets();
                this.f1618p = androidx.core.graphics.b.d(tappableElementInsets);
            }
            return this.f1618p;
        }

        @Override // androidx.core.view.g1.g, androidx.core.view.g1.l
        g1 m(int i2, int i3, int i4, int i5) {
            WindowInsets inset;
            inset = this.f1610c.inset(i2, i3, i4, i5);
            return g1.u(inset);
        }

        @Override // androidx.core.view.g1.h, androidx.core.view.g1.l
        public void t(androidx.core.graphics.b bVar) {
        }
    }

    private static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        static final g1 f1619q = g1.u(WindowInsets.CONSUMED);

        k(g1 g1Var, WindowInsets windowInsets) {
            super(g1Var, windowInsets);
        }

        k(g1 g1Var, k kVar) {
            super(g1Var, kVar);
        }

        @Override // androidx.core.view.g1.g, androidx.core.view.g1.l
        final void d(View view) {
        }

        @Override // androidx.core.view.g1.g, androidx.core.view.g1.l
        public androidx.core.graphics.b g(int i2) {
            Insets insets;
            insets = this.f1610c.getInsets(n.a(i2));
            return androidx.core.graphics.b.d(insets);
        }

        @Override // androidx.core.view.g1.g, androidx.core.view.g1.l
        public boolean p(int i2) {
            boolean isVisible;
            isVisible = this.f1610c.isVisible(n.a(i2));
            return isVisible;
        }
    }

    private static class l {

        /* renamed from: b, reason: collision with root package name */
        static final g1 f1620b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final g1 f1621a;

        l(g1 g1Var) {
            this.f1621a = g1Var;
        }

        g1 a() {
            return this.f1621a;
        }

        g1 b() {
            return this.f1621a;
        }

        g1 c() {
            return this.f1621a;
        }

        void d(View view) {
        }

        void e(g1 g1Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && androidx.core.util.d.a(k(), lVar.k()) && androidx.core.util.d.a(i(), lVar.i()) && androidx.core.util.d.a(f(), lVar.f());
        }

        androidx.core.view.c f() {
            return null;
        }

        androidx.core.graphics.b g(int i2) {
            return androidx.core.graphics.b.f1417e;
        }

        androidx.core.graphics.b h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.d.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        androidx.core.graphics.b i() {
            return androidx.core.graphics.b.f1417e;
        }

        androidx.core.graphics.b j() {
            return k();
        }

        androidx.core.graphics.b k() {
            return androidx.core.graphics.b.f1417e;
        }

        androidx.core.graphics.b l() {
            return k();
        }

        g1 m(int i2, int i3, int i4, int i5) {
            return f1620b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        boolean p(int i2) {
            return true;
        }

        public void q(androidx.core.graphics.b[] bVarArr) {
        }

        void r(androidx.core.graphics.b bVar) {
        }

        void s(g1 g1Var) {
        }

        public void t(androidx.core.graphics.b bVar) {
        }
    }

    public static final class m {
        public static int a() {
            return 8;
        }

        static int b(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
        }
    }

    private static final class n {
        static int a(int i2) {
            int statusBars;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        statusBars = WindowInsets$Type.statusBars();
                    } else if (i4 == 2) {
                        statusBars = WindowInsets$Type.navigationBars();
                    } else if (i4 == 4) {
                        statusBars = WindowInsets$Type.captionBar();
                    } else if (i4 == 8) {
                        statusBars = WindowInsets$Type.ime();
                    } else if (i4 == 16) {
                        statusBars = WindowInsets$Type.systemGestures();
                    } else if (i4 == 32) {
                        statusBars = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        statusBars = WindowInsets$Type.tappableElement();
                    } else if (i4 == 128) {
                        statusBars = WindowInsets$Type.displayCutout();
                    }
                    i3 |= statusBars;
                }
            }
            return i3;
        }
    }

    static {
        f1589b = Build.VERSION.SDK_INT >= 30 ? k.f1619q : l.f1620b;
    }

    private g1(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        this.f1590a = i2 >= 30 ? new k(this, windowInsets) : i2 >= 29 ? new j(this, windowInsets) : i2 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public g1(g1 g1Var) {
        if (g1Var == null) {
            this.f1590a = new l(this);
            return;
        }
        l lVar = g1Var.f1590a;
        int i2 = Build.VERSION.SDK_INT;
        this.f1590a = (i2 < 30 || !(lVar instanceof k)) ? (i2 < 29 || !(lVar instanceof j)) ? (i2 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    static androidx.core.graphics.b m(androidx.core.graphics.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.f1418a - i2);
        int max2 = Math.max(0, bVar.f1419b - i3);
        int max3 = Math.max(0, bVar.f1420c - i4);
        int max4 = Math.max(0, bVar.f1421d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : androidx.core.graphics.b.b(max, max2, max3, max4);
    }

    public static g1 u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static g1 v(WindowInsets windowInsets, View view) {
        g1 g1Var = new g1((WindowInsets) androidx.core.util.e.b(windowInsets));
        if (view != null && f0.v(view)) {
            g1Var.r(f0.p(view));
            g1Var.d(view.getRootView());
        }
        return g1Var;
    }

    @Deprecated
    public g1 a() {
        return this.f1590a.a();
    }

    @Deprecated
    public g1 b() {
        return this.f1590a.b();
    }

    @Deprecated
    public g1 c() {
        return this.f1590a.c();
    }

    void d(View view) {
        this.f1590a.d(view);
    }

    public androidx.core.view.c e() {
        return this.f1590a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g1) {
            return androidx.core.util.d.a(this.f1590a, ((g1) obj).f1590a);
        }
        return false;
    }

    public androidx.core.graphics.b f(int i2) {
        return this.f1590a.g(i2);
    }

    @Deprecated
    public androidx.core.graphics.b g() {
        return this.f1590a.i();
    }

    @Deprecated
    public int h() {
        return this.f1590a.k().f1421d;
    }

    public int hashCode() {
        l lVar = this.f1590a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f1590a.k().f1418a;
    }

    @Deprecated
    public int j() {
        return this.f1590a.k().f1420c;
    }

    @Deprecated
    public int k() {
        return this.f1590a.k().f1419b;
    }

    public g1 l(int i2, int i3, int i4, int i5) {
        return this.f1590a.m(i2, i3, i4, i5);
    }

    public boolean n(int i2) {
        return this.f1590a.p(i2);
    }

    @Deprecated
    public g1 o(int i2, int i3, int i4, int i5) {
        return new b(this).c(androidx.core.graphics.b.b(i2, i3, i4, i5)).a();
    }

    void p(androidx.core.graphics.b[] bVarArr) {
        this.f1590a.q(bVarArr);
    }

    void q(androidx.core.graphics.b bVar) {
        this.f1590a.r(bVar);
    }

    void r(g1 g1Var) {
        this.f1590a.s(g1Var);
    }

    void s(androidx.core.graphics.b bVar) {
        this.f1590a.t(bVar);
    }

    public WindowInsets t() {
        l lVar = this.f1590a;
        if (lVar instanceof g) {
            return ((g) lVar).f1610c;
        }
        return null;
    }
}
