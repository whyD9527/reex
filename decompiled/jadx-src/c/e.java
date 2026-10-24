package c;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.o1;
import androidx.appcompat.widget.p1;
import androidx.core.content.res.h;
import androidx.core.view.b0;
import androidx.core.view.c1;
import androidx.core.view.e1;
import androidx.core.view.f;
import androidx.core.view.f0;
import androidx.core.view.g1;
import androidx.lifecycle.d;
import g.b;
import g.f;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class e extends c.d implements e.a, LayoutInflater.Factory2 {

    /* renamed from: e0, reason: collision with root package name */
    private static final l.g<String, Integer> f2398e0 = new l.g<>();

    /* renamed from: f0, reason: collision with root package name */
    private static final boolean f2399f0 = false;

    /* renamed from: g0, reason: collision with root package name */
    private static final int[] f2400g0 = {R.attr.windowBackground};

    /* renamed from: h0, reason: collision with root package name */
    private static final boolean f2401h0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: i0, reason: collision with root package name */
    private static final boolean f2402i0 = true;
    private TextView A;
    private View B;
    private boolean C;
    private boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    private boolean J;
    private q[] K;
    private q L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    boolean Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private j V;
    private j W;
    boolean X;
    int Y;
    private final Runnable Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f2403a0;

    /* renamed from: b0, reason: collision with root package name */
    private Rect f2404b0;

    /* renamed from: c0, reason: collision with root package name */
    private Rect f2405c0;

    /* renamed from: d0, reason: collision with root package name */
    private c.i f2406d0;

    /* renamed from: h, reason: collision with root package name */
    final Object f2407h;

    /* renamed from: i, reason: collision with root package name */
    final Context f2408i;

    /* renamed from: j, reason: collision with root package name */
    Window f2409j;

    /* renamed from: k, reason: collision with root package name */
    private h f2410k;

    /* renamed from: l, reason: collision with root package name */
    final c.c f2411l;

    /* renamed from: m, reason: collision with root package name */
    c.a f2412m;

    /* renamed from: n, reason: collision with root package name */
    MenuInflater f2413n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f2414o;

    /* renamed from: p, reason: collision with root package name */
    private k0 f2415p;

    /* renamed from: q, reason: collision with root package name */
    private f f2416q;

    /* renamed from: r, reason: collision with root package name */
    private r f2417r;

    /* renamed from: s, reason: collision with root package name */
    g.b f2418s;

    /* renamed from: t, reason: collision with root package name */
    ActionBarContextView f2419t;

    /* renamed from: u, reason: collision with root package name */
    PopupWindow f2420u;

    /* renamed from: v, reason: collision with root package name */
    Runnable f2421v;

    /* renamed from: w, reason: collision with root package name */
    c1 f2422w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f2423x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f2424y;

    /* renamed from: z, reason: collision with root package name */
    ViewGroup f2425z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if ((eVar.Y & 1) != 0) {
                eVar.U(0);
            }
            e eVar2 = e.this;
            if ((eVar2.Y & 4096) != 0) {
                eVar2.U(androidx.constraintlayout.widget.k.Y0);
            }
            e eVar3 = e.this;
            eVar3.X = false;
            eVar3.Y = 0;
        }
    }

    class b implements b0 {
        b() {
        }

        @Override // androidx.core.view.b0
        public g1 a(View view, g1 g1Var) {
            int k2 = g1Var.k();
            int L0 = e.this.L0(g1Var, null);
            if (k2 != L0) {
                g1Var = g1Var.o(g1Var.i(), L0, g1Var.j(), g1Var.h());
            }
            return f0.z(view, g1Var);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            e.this.S();
        }
    }

    class d implements Runnable {

        class a extends e1 {
            a() {
            }

            @Override // androidx.core.view.d1
            public void b(View view) {
                e.this.f2419t.setAlpha(1.0f);
                e.this.f2422w.h(null);
                e.this.f2422w = null;
            }

            @Override // androidx.core.view.e1, androidx.core.view.d1
            public void c(View view) {
                e.this.f2419t.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f2420u.showAtLocation(eVar.f2419t, 55, 0, 0);
            e.this.V();
            if (!e.this.D0()) {
                e.this.f2419t.setAlpha(1.0f);
                e.this.f2419t.setVisibility(0);
            } else {
                e.this.f2419t.setAlpha(0.0f);
                e eVar2 = e.this;
                eVar2.f2422w = f0.b(eVar2.f2419t).b(1.0f);
                e.this.f2422w.h(new a());
            }
        }
    }

    /* renamed from: c.e$e, reason: collision with other inner class name */
    class C0036e extends e1 {
        C0036e() {
        }

        @Override // androidx.core.view.d1
        public void b(View view) {
            e.this.f2419t.setAlpha(1.0f);
            e.this.f2422w.h(null);
            e.this.f2422w = null;
        }

        @Override // androidx.core.view.e1, androidx.core.view.d1
        public void c(View view) {
            e.this.f2419t.setVisibility(0);
            e.this.f2419t.sendAccessibilityEvent(32);
            if (e.this.f2419t.getParent() instanceof View) {
                f0.E((View) e.this.f2419t.getParent());
            }
        }
    }

    private final class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
            e.this.L(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback f02 = e.this.f0();
            if (f02 == null) {
                return true;
            }
            f02.onMenuOpened(androidx.constraintlayout.widget.k.Y0, eVar);
            return true;
        }
    }

    class g implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f2433a;

        class a extends e1 {
            a() {
            }

            @Override // androidx.core.view.d1
            public void b(View view) {
                e.this.f2419t.setVisibility(8);
                e eVar = e.this;
                PopupWindow popupWindow = eVar.f2420u;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.f2419t.getParent() instanceof View) {
                    f0.E((View) e.this.f2419t.getParent());
                }
                e.this.f2419t.removeAllViews();
                e.this.f2422w.h(null);
                e eVar2 = e.this;
                eVar2.f2422w = null;
                f0.E(eVar2.f2425z);
            }
        }

        public g(b.a aVar) {
            this.f2433a = aVar;
        }

        @Override // g.b.a
        public boolean a(g.b bVar, Menu menu) {
            f0.E(e.this.f2425z);
            return this.f2433a.a(bVar, menu);
        }

        @Override // g.b.a
        public boolean b(g.b bVar, Menu menu) {
            return this.f2433a.b(bVar, menu);
        }

        @Override // g.b.a
        public boolean c(g.b bVar, MenuItem menuItem) {
            return this.f2433a.c(bVar, menuItem);
        }

        @Override // g.b.a
        public void d(g.b bVar) {
            this.f2433a.d(bVar);
            e eVar = e.this;
            if (eVar.f2420u != null) {
                eVar.f2409j.getDecorView().removeCallbacks(e.this.f2421v);
            }
            e eVar2 = e.this;
            if (eVar2.f2419t != null) {
                eVar2.V();
                e eVar3 = e.this;
                eVar3.f2422w = f0.b(eVar3.f2419t).b(0.0f);
                e.this.f2422w.h(new a());
            }
            e eVar4 = e.this;
            c.c cVar = eVar4.f2411l;
            if (cVar != null) {
                cVar.b(eVar4.f2418s);
            }
            e eVar5 = e.this;
            eVar5.f2418s = null;
            f0.E(eVar5.f2425z);
        }
    }

    class h extends g.k {
        h(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(e.this.f2408i, callback);
            g.b F0 = e.this.F0(aVar);
            if (F0 != null) {
                return aVar.e(F0);
            }
            return null;
        }

        @Override // g.k, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // g.k, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // g.k, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // g.k, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            e.this.u0(i2);
            return true;
        }

        @Override // g.k, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            e.this.v0(i2);
        }

        @Override // g.k, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i2 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i2, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return onPreparePanel;
        }

        @Override // g.k, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            androidx.appcompat.view.menu.e eVar;
            q d02 = e.this.d0(0, true);
            if (d02 == null || (eVar = d02.f2454j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i2);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // g.k, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return (e.this.m0() && i2 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i2);
        }
    }

    private class i extends j {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f2437c;

        i(Context context) {
            super();
            this.f2437c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // c.e.j
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // c.e.j
        public int c() {
            return this.f2437c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // c.e.j
        public void d() {
            e.this.F();
        }
    }

    abstract class j {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f2439a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        j() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f2439a;
            if (broadcastReceiver != null) {
                try {
                    e.this.f2408i.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f2439a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b3 = b();
            if (b3 == null || b3.countActions() == 0) {
                return;
            }
            if (this.f2439a == null) {
                this.f2439a = new a();
            }
            e.this.f2408i.registerReceiver(this.f2439a, b3);
        }
    }

    private class k extends j {

        /* renamed from: c, reason: collision with root package name */
        private final c.l f2442c;

        k(c.l lVar) {
            super();
            this.f2442c = lVar;
        }

        @Override // c.e.j
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // c.e.j
        public int c() {
            return this.f2442c.d() ? 2 : 1;
        }

        @Override // c.e.j
        public void d() {
            e.this.F();
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.densityDpi;
            int i3 = configuration2.densityDpi;
            if (i2 != i3) {
                configuration3.densityDpi = i3;
            }
        }
    }

    static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    static class n {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.colorMode & 3;
            int i3 = configuration2.colorMode;
            if (i2 != (i3 & 3)) {
                configuration3.colorMode |= i3 & 3;
            }
            int i4 = configuration.colorMode & 12;
            int i5 = configuration2.colorMode;
            if (i4 != (i5 & 12)) {
                configuration3.colorMode |= i5 & 12;
            }
        }
    }

    private static class o {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class p extends ContentFrameLayout {
        public p(Context context) {
            super(context);
        }

        private boolean b(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            e.this.N(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(d.a.b(getContext(), i2));
        }
    }

    protected static final class q {

        /* renamed from: a, reason: collision with root package name */
        int f2445a;

        /* renamed from: b, reason: collision with root package name */
        int f2446b;

        /* renamed from: c, reason: collision with root package name */
        int f2447c;

        /* renamed from: d, reason: collision with root package name */
        int f2448d;

        /* renamed from: e, reason: collision with root package name */
        int f2449e;

        /* renamed from: f, reason: collision with root package name */
        int f2450f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f2451g;

        /* renamed from: h, reason: collision with root package name */
        View f2452h;

        /* renamed from: i, reason: collision with root package name */
        View f2453i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f2454j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f2455k;

        /* renamed from: l, reason: collision with root package name */
        Context f2456l;

        /* renamed from: m, reason: collision with root package name */
        boolean f2457m;

        /* renamed from: n, reason: collision with root package name */
        boolean f2458n;

        /* renamed from: o, reason: collision with root package name */
        boolean f2459o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f2460p;

        /* renamed from: q, reason: collision with root package name */
        boolean f2461q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f2462r;

        /* renamed from: s, reason: collision with root package name */
        Bundle f2463s;

        q(int i2) {
            this.f2445a = i2;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f2454j == null) {
                return null;
            }
            if (this.f2455k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f2456l, b.g.f2258j);
                this.f2455k = cVar;
                cVar.k(aVar);
                this.f2454j.b(this.f2455k);
            }
            return this.f2455k.c(this.f2451g);
        }

        public boolean b() {
            if (this.f2452h == null) {
                return false;
            }
            return this.f2453i != null || this.f2455k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f2454j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f2455k);
            }
            this.f2454j = eVar;
            if (eVar == null || (cVar = this.f2455k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(b.a.f2150a, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(b.a.D, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                i3 = b.i.f2282b;
            }
            newTheme.applyStyle(i3, true);
            g.d dVar = new g.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f2456l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(b.j.f2366z0);
            this.f2446b = obtainStyledAttributes.getResourceId(b.j.C0, 0);
            this.f2450f = obtainStyledAttributes.getResourceId(b.j.B0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private final class r implements j.a {
        r() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z3 = D != eVar;
            e eVar2 = e.this;
            if (z3) {
                eVar = D;
            }
            q Y = eVar2.Y(eVar);
            if (Y != null) {
                if (!z3) {
                    e.this.O(Y, z2);
                } else {
                    e.this.K(Y.f2445a, Y, D);
                    e.this.O(Y, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback f02;
            if (eVar != eVar.D()) {
                return true;
            }
            e eVar2 = e.this;
            if (!eVar2.E || (f02 = eVar2.f0()) == null || e.this.Q) {
                return true;
            }
            f02.onMenuOpened(androidx.constraintlayout.widget.k.Y0, eVar);
            return true;
        }
    }

    e(Activity activity, c.c cVar) {
        this(activity, null, cVar, activity);
    }

    e(Dialog dialog, c.c cVar) {
        this(dialog.getContext(), dialog.getWindow(), cVar, dialog);
    }

    private e(Context context, Window window, c.c cVar, Object obj) {
        l.g<String, Integer> gVar;
        Integer num;
        c.b I0;
        this.f2422w = null;
        this.f2423x = true;
        this.R = -100;
        this.Z = new a();
        this.f2408i = context;
        this.f2411l = cVar;
        this.f2407h = obj;
        if (this.R == -100 && (obj instanceof Dialog) && (I0 = I0()) != null) {
            this.R = I0.u().k();
        }
        if (this.R == -100 && (num = (gVar = f2398e0).get(obj.getClass().getName())) != null) {
            this.R = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            I(window);
        }
        androidx.appcompat.widget.j.h();
    }

    private boolean A0(q qVar, KeyEvent keyEvent) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        if (this.Q) {
            return false;
        }
        if (qVar.f2457m) {
            return true;
        }
        q qVar2 = this.L;
        if (qVar2 != null && qVar2 != qVar) {
            O(qVar2, false);
        }
        Window.Callback f02 = f0();
        if (f02 != null) {
            qVar.f2453i = f02.onCreatePanelView(qVar.f2445a);
        }
        int i2 = qVar.f2445a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (k0Var3 = this.f2415p) != null) {
            k0Var3.c();
        }
        if (qVar.f2453i == null) {
            if (z2) {
                y0();
            }
            androidx.appcompat.view.menu.e eVar = qVar.f2454j;
            if (eVar == null || qVar.f2462r) {
                if (eVar == null && (!j0(qVar) || qVar.f2454j == null)) {
                    return false;
                }
                if (z2 && this.f2415p != null) {
                    if (this.f2416q == null) {
                        this.f2416q = new f();
                    }
                    this.f2415p.a(qVar.f2454j, this.f2416q);
                }
                qVar.f2454j.d0();
                if (!f02.onCreatePanelMenu(qVar.f2445a, qVar.f2454j)) {
                    qVar.c(null);
                    if (z2 && (k0Var = this.f2415p) != null) {
                        k0Var.a(null, this.f2416q);
                    }
                    return false;
                }
                qVar.f2462r = false;
            }
            qVar.f2454j.d0();
            Bundle bundle = qVar.f2463s;
            if (bundle != null) {
                qVar.f2454j.P(bundle);
                qVar.f2463s = null;
            }
            if (!f02.onPreparePanel(0, qVar.f2453i, qVar.f2454j)) {
                if (z2 && (k0Var2 = this.f2415p) != null) {
                    k0Var2.a(null, this.f2416q);
                }
                qVar.f2454j.c0();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            qVar.f2460p = z3;
            qVar.f2454j.setQwertyMode(z3);
            qVar.f2454j.c0();
        }
        qVar.f2457m = true;
        qVar.f2458n = false;
        this.L = qVar;
        return true;
    }

    private void B0(boolean z2) {
        k0 k0Var = this.f2415p;
        if (k0Var == null || !k0Var.g() || (ViewConfiguration.get(this.f2408i).hasPermanentMenuKey() && !this.f2415p.d())) {
            q d02 = d0(0, true);
            d02.f2461q = true;
            O(d02, false);
            x0(d02, null);
            return;
        }
        Window.Callback f02 = f0();
        if (this.f2415p.b() && z2) {
            this.f2415p.e();
            if (this.Q) {
                return;
            }
            f02.onPanelClosed(androidx.constraintlayout.widget.k.Y0, d0(0, true).f2454j);
            return;
        }
        if (f02 == null || this.Q) {
            return;
        }
        if (this.X && (this.Y & 1) != 0) {
            this.f2409j.getDecorView().removeCallbacks(this.Z);
            this.Z.run();
        }
        q d03 = d0(0, true);
        androidx.appcompat.view.menu.e eVar = d03.f2454j;
        if (eVar == null || d03.f2462r || !f02.onPreparePanel(0, d03.f2453i, eVar)) {
            return;
        }
        f02.onMenuOpened(androidx.constraintlayout.widget.k.Y0, d03.f2454j);
        this.f2415p.f();
    }

    private int C0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return androidx.constraintlayout.widget.k.Y0;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return androidx.constraintlayout.widget.k.Z0;
    }

    private boolean E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f2409j.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || f0.v((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean G(boolean z2) {
        if (this.Q) {
            return false;
        }
        int J = J();
        boolean J0 = J0(n0(this.f2408i, J), z2);
        if (J == 0) {
            c0(this.f2408i).e();
        } else {
            j jVar = this.V;
            if (jVar != null) {
                jVar.a();
            }
        }
        if (J == 3) {
            b0(this.f2408i).e();
        } else {
            j jVar2 = this.W;
            if (jVar2 != null) {
                jVar2.a();
            }
        }
        return J0;
    }

    private void H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f2425z.findViewById(R.id.content);
        View decorView = this.f2409j.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f2408i.obtainStyledAttributes(b.j.f2366z0);
        obtainStyledAttributes.getValue(b.j.L0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(b.j.M0, contentFrameLayout.getMinWidthMinor());
        int i2 = b.j.J0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = b.j.K0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = b.j.H0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = b.j.I0;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void H0() {
        if (this.f2424y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void I(Window window) {
        if (this.f2409j != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof h) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        h hVar = new h(callback);
        this.f2410k = hVar;
        window.setCallback(hVar);
        i1 t2 = i1.t(this.f2408i, null, f2400g0);
        Drawable g2 = t2.g(0);
        if (g2 != null) {
            window.setBackgroundDrawable(g2);
        }
        t2.v();
        this.f2409j = window;
    }

    private c.b I0() {
        for (Context context = this.f2408i; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof c.b) {
                return (c.b) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private int J() {
        int i2 = this.R;
        return i2 != -100 ? i2 : c.d.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean J0(int i2, boolean z2) {
        boolean z3;
        Configuration P = P(this.f2408i, i2, null);
        boolean l02 = l0();
        int i3 = this.f2408i.getResources().getConfiguration().uiMode & 48;
        int i4 = P.uiMode & 48;
        boolean z4 = true;
        if (i3 != i4 && z2 && !l02 && this.N && (f2401h0 || this.O)) {
            Object obj = this.f2407h;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                androidx.core.app.b.q((Activity) this.f2407h);
                z3 = true;
                if (!z3 || i3 == i4) {
                    z4 = z3;
                } else {
                    K0(i4, l02, null);
                }
                if (z4) {
                    Object obj2 = this.f2407h;
                    if (obj2 instanceof c.b) {
                        ((c.b) obj2).x(i2);
                    }
                }
                return z4;
            }
        }
        z3 = false;
        if (z3) {
        }
        z4 = z3;
        if (z4) {
        }
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(int i2, boolean z2, Configuration configuration) {
        Resources resources = this.f2408i.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            c.j.a(resources);
        }
        int i3 = this.S;
        if (i3 != 0) {
            this.f2408i.setTheme(i3);
            this.f2408i.getTheme().applyStyle(this.S, true);
        }
        if (z2) {
            Object obj = this.f2407h;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.g) {
                    if (!((androidx.lifecycle.g) activity).a().b().a(d.c.STARTED)) {
                        return;
                    }
                } else if (!this.P) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    private void M() {
        j jVar = this.V;
        if (jVar != null) {
            jVar.a();
        }
        j jVar2 = this.W;
        if (jVar2 != null) {
            jVar2.a();
        }
    }

    private void M0(View view) {
        Context context;
        int i2;
        if ((f0.s(view) & 8192) != 0) {
            context = this.f2408i;
            i2 = b.c.f2178b;
        } else {
            context = this.f2408i;
            i2 = b.c.f2177a;
        }
        view.setBackgroundColor(androidx.core.content.a.b(context, i2));
    }

    private Configuration P(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup Q() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f2408i.obtainStyledAttributes(b.j.f2366z0);
        int i2 = b.j.E0;
        if (!obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(b.j.N0, false)) {
            z(1);
        } else if (obtainStyledAttributes.getBoolean(i2, false)) {
            z(androidx.constraintlayout.widget.k.Y0);
        }
        if (obtainStyledAttributes.getBoolean(b.j.F0, false)) {
            z(androidx.constraintlayout.widget.k.Z0);
        }
        if (obtainStyledAttributes.getBoolean(b.j.G0, false)) {
            z(10);
        }
        this.H = obtainStyledAttributes.getBoolean(b.j.A0, false);
        obtainStyledAttributes.recycle();
        X();
        this.f2409j.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f2408i);
        if (this.I) {
            viewGroup = (ViewGroup) from.inflate(this.G ? b.g.f2263o : b.g.f2262n, (ViewGroup) null);
        } else if (this.H) {
            viewGroup = (ViewGroup) from.inflate(b.g.f2254f, (ViewGroup) null);
            this.F = false;
            this.E = false;
        } else if (this.E) {
            TypedValue typedValue = new TypedValue();
            this.f2408i.getTheme().resolveAttribute(b.a.f2155f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new g.d(this.f2408i, typedValue.resourceId) : this.f2408i).inflate(b.g.f2264p, (ViewGroup) null);
            k0 k0Var = (k0) viewGroup.findViewById(b.f.f2238p);
            this.f2415p = k0Var;
            k0Var.setWindowCallback(f0());
            if (this.F) {
                this.f2415p.k(androidx.constraintlayout.widget.k.Z0);
            }
            if (this.C) {
                this.f2415p.k(2);
            }
            if (this.D) {
                this.f2415p.k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.E + ", windowActionBarOverlay: " + this.F + ", android:windowIsFloating: " + this.H + ", windowActionModeOverlay: " + this.G + ", windowNoTitle: " + this.I + " }");
        }
        f0.N(viewGroup, new b());
        if (this.f2415p == null) {
            this.A = (TextView) viewGroup.findViewById(b.f.M);
        }
        p1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(b.f.f2224b);
        ViewGroup viewGroup2 = (ViewGroup) this.f2409j.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f2409j.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void W() {
        if (this.f2424y) {
            return;
        }
        this.f2425z = Q();
        CharSequence e02 = e0();
        if (!TextUtils.isEmpty(e02)) {
            k0 k0Var = this.f2415p;
            if (k0Var != null) {
                k0Var.setWindowTitle(e02);
            } else if (y0() != null) {
                y0().s(e02);
            } else {
                TextView textView = this.A;
                if (textView != null) {
                    textView.setText(e02);
                }
            }
        }
        H();
        w0(this.f2425z);
        this.f2424y = true;
        q d02 = d0(0, false);
        if (this.Q) {
            return;
        }
        if (d02 == null || d02.f2454j == null) {
            k0(androidx.constraintlayout.widget.k.Y0);
        }
    }

    private void X() {
        if (this.f2409j == null) {
            Object obj = this.f2407h;
            if (obj instanceof Activity) {
                I(((Activity) obj).getWindow());
            }
        }
        if (this.f2409j == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                m.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.d.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                n.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            l.a(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private j b0(Context context) {
        if (this.W == null) {
            this.W = new i(context);
        }
        return this.W;
    }

    private j c0(Context context) {
        if (this.V == null) {
            this.V = new k(c.l.a(context));
        }
        return this.V;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void g0() {
        c.m mVar;
        c.a aVar;
        W();
        if (!this.E || this.f2412m != null) {
            return;
        }
        Object obj = this.f2407h;
        if (!(obj instanceof Activity)) {
            if (obj instanceof Dialog) {
                mVar = new c.m((Dialog) this.f2407h);
            }
            aVar = this.f2412m;
            if (aVar == null) {
                aVar.q(this.f2403a0);
                return;
            }
            return;
        }
        mVar = new c.m((Activity) this.f2407h, this.F);
        this.f2412m = mVar;
        aVar = this.f2412m;
        if (aVar == null) {
        }
    }

    private boolean h0(q qVar) {
        View view = qVar.f2453i;
        if (view != null) {
            qVar.f2452h = view;
            return true;
        }
        if (qVar.f2454j == null) {
            return false;
        }
        if (this.f2417r == null) {
            this.f2417r = new r();
        }
        View view2 = (View) qVar.a(this.f2417r);
        qVar.f2452h = view2;
        return view2 != null;
    }

    private boolean i0(q qVar) {
        qVar.d(a0());
        qVar.f2451g = new p(qVar.f2456l);
        qVar.f2447c = 81;
        return true;
    }

    private boolean j0(q qVar) {
        Context context = this.f2408i;
        int i2 = qVar.f2445a;
        if ((i2 == 0 || i2 == 108) && this.f2415p != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(b.a.f2155f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(b.a.f2156g, typedValue, true);
            } else {
                theme.resolveAttribute(b.a.f2156g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                g.d dVar = new g.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        qVar.c(eVar);
        return true;
    }

    private void k0(int i2) {
        this.Y = (1 << i2) | this.Y;
        if (this.X) {
            return;
        }
        f0.C(this.f2409j.getDecorView(), this.Z);
        this.X = true;
    }

    private boolean l0() {
        if (!this.U && (this.f2407h instanceof Activity)) {
            PackageManager packageManager = this.f2408i.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f2408i, this.f2407h.getClass()), i2 >= 29 ? 269221888 : i2 >= 24 ? 786432 : 0);
                this.T = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e3) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e3);
                this.T = false;
            }
        }
        this.U = true;
        return this.T;
    }

    private boolean q0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        q d02 = d0(i2, true);
        if (d02.f2459o) {
            return false;
        }
        return A0(d02, keyEvent);
    }

    private boolean t0(int i2, KeyEvent keyEvent) {
        boolean z2;
        k0 k0Var;
        if (this.f2418s != null) {
            return false;
        }
        boolean z3 = true;
        q d02 = d0(i2, true);
        if (i2 != 0 || (k0Var = this.f2415p) == null || !k0Var.g() || ViewConfiguration.get(this.f2408i).hasPermanentMenuKey()) {
            boolean z4 = d02.f2459o;
            if (z4 || d02.f2458n) {
                O(d02, true);
                z3 = z4;
            } else {
                if (d02.f2457m) {
                    if (d02.f2462r) {
                        d02.f2457m = false;
                        z2 = A0(d02, keyEvent);
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        x0(d02, keyEvent);
                    }
                }
                z3 = false;
            }
        } else if (this.f2415p.b()) {
            z3 = this.f2415p.e();
        } else {
            if (!this.Q && A0(d02, keyEvent)) {
                z3 = this.f2415p.f();
            }
            z3 = false;
        }
        if (z3) {
            AudioManager audioManager = (AudioManager) this.f2408i.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z3;
    }

    private void x0(q qVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (qVar.f2459o || this.Q) {
            return;
        }
        if (qVar.f2445a == 0) {
            if ((this.f2408i.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback f02 = f0();
        if (f02 != null && !f02.onMenuOpened(qVar.f2445a, qVar.f2454j)) {
            O(qVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2408i.getSystemService("window");
        if (windowManager != null && A0(qVar, keyEvent)) {
            ViewGroup viewGroup = qVar.f2451g;
            if (viewGroup == null || qVar.f2461q) {
                if (viewGroup == null) {
                    if (!i0(qVar) || qVar.f2451g == null) {
                        return;
                    }
                } else if (qVar.f2461q && viewGroup.getChildCount() > 0) {
                    qVar.f2451g.removeAllViews();
                }
                if (!h0(qVar) || !qVar.b()) {
                    qVar.f2461q = true;
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = qVar.f2452h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                qVar.f2451g.setBackgroundResource(qVar.f2446b);
                ViewParent parent = qVar.f2452h.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(qVar.f2452h);
                }
                qVar.f2451g.addView(qVar.f2452h, layoutParams2);
                if (!qVar.f2452h.hasFocus()) {
                    qVar.f2452h.requestFocus();
                }
            } else {
                View view = qVar.f2453i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                    qVar.f2458n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, qVar.f2448d, qVar.f2449e, 1002, 8519680, -3);
                    layoutParams3.gravity = qVar.f2447c;
                    layoutParams3.windowAnimations = qVar.f2450f;
                    windowManager.addView(qVar.f2451g, layoutParams3);
                    qVar.f2459o = true;
                }
            }
            i2 = -2;
            qVar.f2458n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, qVar.f2448d, qVar.f2449e, 1002, 8519680, -3);
            layoutParams32.gravity = qVar.f2447c;
            layoutParams32.windowAnimations = qVar.f2450f;
            windowManager.addView(qVar.f2451g, layoutParams32);
            qVar.f2459o = true;
        }
    }

    private boolean z0(q qVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f2457m || A0(qVar, keyEvent)) && (eVar = qVar.f2454j) != null) {
            z2 = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.f2415p == null) {
            O(qVar, true);
        }
        return z2;
    }

    @Override // c.d
    public void A(int i2) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.f2425z.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2408i).inflate(i2, viewGroup);
        this.f2410k.a().onContentChanged();
    }

    @Override // c.d
    public void B(View view) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.f2425z.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2410k.a().onContentChanged();
    }

    @Override // c.d
    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.f2425z.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2410k.a().onContentChanged();
    }

    @Override // c.d
    public void D(int i2) {
        this.S = i2;
    }

    final boolean D0() {
        ViewGroup viewGroup;
        return this.f2424y && (viewGroup = this.f2425z) != null && f0.w(viewGroup);
    }

    @Override // c.d
    public final void E(CharSequence charSequence) {
        this.f2414o = charSequence;
        k0 k0Var = this.f2415p;
        if (k0Var != null) {
            k0Var.setWindowTitle(charSequence);
            return;
        }
        if (y0() != null) {
            y0().s(charSequence);
            return;
        }
        TextView textView = this.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean F() {
        return G(true);
    }

    public g.b F0(b.a aVar) {
        c.c cVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        g.b bVar = this.f2418s;
        if (bVar != null) {
            bVar.c();
        }
        g gVar = new g(aVar);
        c.a m2 = m();
        if (m2 != null) {
            g.b t2 = m2.t(gVar);
            this.f2418s = t2;
            if (t2 != null && (cVar = this.f2411l) != null) {
                cVar.g(t2);
            }
        }
        if (this.f2418s == null) {
            this.f2418s = G0(gVar);
        }
        return this.f2418s;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    g.b G0(b.a aVar) {
        g.b bVar;
        Context context;
        g.b bVar2;
        c.c cVar;
        V();
        g.b bVar3 = this.f2418s;
        if (bVar3 != null) {
            bVar3.c();
        }
        if (!(aVar instanceof g)) {
            aVar = new g(aVar);
        }
        c.c cVar2 = this.f2411l;
        if (cVar2 != null && !this.Q) {
            try {
                bVar = cVar2.e(aVar);
            } catch (AbstractMethodError unused) {
            }
            if (bVar == null) {
                this.f2418s = bVar;
            } else {
                if (this.f2419t == null) {
                    if (this.H) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.f2408i.getTheme();
                        theme.resolveAttribute(b.a.f2155f, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.f2408i.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new g.d(this.f2408i, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = this.f2408i;
                        }
                        this.f2419t = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, b.a.f2158i);
                        this.f2420u = popupWindow;
                        androidx.core.widget.j.b(popupWindow, 2);
                        this.f2420u.setContentView(this.f2419t);
                        this.f2420u.setWidth(-1);
                        context.getTheme().resolveAttribute(b.a.f2151b, typedValue, true);
                        this.f2419t.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f2420u.setHeight(-2);
                        this.f2421v = new d();
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f2425z.findViewById(b.f.f2230h);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(a0()));
                            this.f2419t = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.f2419t != null) {
                    V();
                    this.f2419t.k();
                    g.e eVar = new g.e(this.f2419t.getContext(), this.f2419t, aVar, this.f2420u == null);
                    if (aVar.b(eVar, eVar.e())) {
                        eVar.k();
                        this.f2419t.h(eVar);
                        this.f2418s = eVar;
                        if (D0()) {
                            this.f2419t.setAlpha(0.0f);
                            c1 b3 = f0.b(this.f2419t).b(1.0f);
                            this.f2422w = b3;
                            b3.h(new C0036e());
                        } else {
                            this.f2419t.setAlpha(1.0f);
                            this.f2419t.setVisibility(0);
                            this.f2419t.sendAccessibilityEvent(32);
                            if (this.f2419t.getParent() instanceof View) {
                                f0.E((View) this.f2419t.getParent());
                            }
                        }
                        if (this.f2420u != null) {
                            this.f2409j.getDecorView().post(this.f2421v);
                        }
                    } else {
                        this.f2418s = null;
                    }
                }
            }
            bVar2 = this.f2418s;
            if (bVar2 != null && (cVar = this.f2411l) != null) {
                cVar.g(bVar2);
            }
            return this.f2418s;
        }
        bVar = null;
        if (bVar == null) {
        }
        bVar2 = this.f2418s;
        if (bVar2 != null) {
            cVar.g(bVar2);
        }
        return this.f2418s;
    }

    void K(int i2, q qVar, Menu menu) {
        if (menu == null) {
            if (qVar == null && i2 >= 0) {
                q[] qVarArr = this.K;
                if (i2 < qVarArr.length) {
                    qVar = qVarArr[i2];
                }
            }
            if (qVar != null) {
                menu = qVar.f2454j;
            }
        }
        if ((qVar == null || qVar.f2459o) && !this.Q) {
            this.f2410k.a().onPanelClosed(i2, menu);
        }
    }

    void L(androidx.appcompat.view.menu.e eVar) {
        if (this.J) {
            return;
        }
        this.J = true;
        this.f2415p.l();
        Window.Callback f02 = f0();
        if (f02 != null && !this.Q) {
            f02.onPanelClosed(androidx.constraintlayout.widget.k.Y0, eVar);
        }
        this.J = false;
    }

    final int L0(g1 g1Var, Rect rect) {
        boolean z2;
        boolean z3;
        int k2 = g1Var != null ? g1Var.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f2419t;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2419t.getLayoutParams();
            if (this.f2419t.isShown()) {
                if (this.f2404b0 == null) {
                    this.f2404b0 = new Rect();
                    this.f2405c0 = new Rect();
                }
                Rect rect2 = this.f2404b0;
                Rect rect3 = this.f2405c0;
                if (g1Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(g1Var.i(), g1Var.k(), g1Var.j(), g1Var.h());
                }
                p1.a(this.f2425z, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                g1 p2 = f0.p(this.f2425z);
                int i5 = p2 == null ? 0 : p2.i();
                int j2 = p2 == null ? 0 : p2.j();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z3 = true;
                }
                if (i2 <= 0 || this.B != null) {
                    View view = this.B;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != i5 || marginLayoutParams2.rightMargin != j2) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = i5;
                            marginLayoutParams2.rightMargin = j2;
                            this.B.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f2408i);
                    this.B = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i5;
                    layoutParams.rightMargin = j2;
                    this.f2425z.addView(this.B, -1, layoutParams);
                }
                View view3 = this.B;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    M0(this.B);
                }
                if (!this.G && r5) {
                    k2 = 0;
                }
                z2 = r5;
                r5 = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                r5 = false;
            }
            if (r5) {
                this.f2419t.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.B;
        if (view4 != null) {
            view4.setVisibility(z2 ? 0 : 8);
        }
        return k2;
    }

    void N(int i2) {
        O(d0(i2, true), true);
    }

    void O(q qVar, boolean z2) {
        ViewGroup viewGroup;
        k0 k0Var;
        if (z2 && qVar.f2445a == 0 && (k0Var = this.f2415p) != null && k0Var.b()) {
            L(qVar.f2454j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2408i.getSystemService("window");
        if (windowManager != null && qVar.f2459o && (viewGroup = qVar.f2451g) != null) {
            windowManager.removeView(viewGroup);
            if (z2) {
                K(qVar.f2445a, qVar, null);
            }
        }
        qVar.f2457m = false;
        qVar.f2458n = false;
        qVar.f2459o = false;
        qVar.f2452h = null;
        qVar.f2461q = true;
        if (this.L == qVar) {
            this.L = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View R(View view, String str, Context context, AttributeSet attributeSet) {
        c.i iVar;
        boolean z2 = false;
        if (this.f2406d0 == null) {
            String string = this.f2408i.obtainStyledAttributes(b.j.f2366z0).getString(b.j.D0);
            if (string == null) {
                iVar = new c.i();
            } else {
                try {
                    this.f2406d0 = (c.i) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    iVar = new c.i();
                }
            }
            this.f2406d0 = iVar;
        }
        boolean z3 = f2399f0;
        if (z3) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = E0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
        }
        return this.f2406d0.q(view, str, context, attributeSet, z2, z3, true, o1.b());
    }

    void S() {
        androidx.appcompat.view.menu.e eVar;
        k0 k0Var = this.f2415p;
        if (k0Var != null) {
            k0Var.l();
        }
        if (this.f2420u != null) {
            this.f2409j.getDecorView().removeCallbacks(this.f2421v);
            if (this.f2420u.isShowing()) {
                try {
                    this.f2420u.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f2420u = null;
        }
        V();
        q d02 = d0(0, false);
        if (d02 == null || (eVar = d02.f2454j) == null) {
            return;
        }
        eVar.close();
    }

    boolean T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f2407h;
        if (((obj instanceof f.a) || (obj instanceof c.h)) && (decorView = this.f2409j.getDecorView()) != null && androidx.core.view.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f2410k.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? p0(keyCode, keyEvent) : s0(keyCode, keyEvent);
    }

    void U(int i2) {
        q d02;
        q d03 = d0(i2, true);
        if (d03.f2454j != null) {
            Bundle bundle = new Bundle();
            d03.f2454j.Q(bundle);
            if (bundle.size() > 0) {
                d03.f2463s = bundle;
            }
            d03.f2454j.d0();
            d03.f2454j.clear();
        }
        d03.f2462r = true;
        d03.f2461q = true;
        if ((i2 != 108 && i2 != 0) || this.f2415p == null || (d02 = d0(0, false)) == null) {
            return;
        }
        d02.f2457m = false;
        A0(d02, null);
    }

    void V() {
        c1 c1Var = this.f2422w;
        if (c1Var != null) {
            c1Var.c();
        }
    }

    q Y(Menu menu) {
        q[] qVarArr = this.K;
        int length = qVarArr != null ? qVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            q qVar = qVarArr[i2];
            if (qVar != null && qVar.f2454j == menu) {
                return qVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        q Y;
        Window.Callback f02 = f0();
        if (f02 == null || this.Q || (Y = Y(eVar.D())) == null) {
            return false;
        }
        return f02.onMenuItemSelected(Y.f2445a, menuItem);
    }

    final Context a0() {
        c.a m2 = m();
        Context j2 = m2 != null ? m2.j() : null;
        return j2 == null ? this.f2408i : j2;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        B0(true);
    }

    @Override // c.d
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ((ViewGroup) this.f2425z.findViewById(R.id.content)).addView(view, layoutParams);
        this.f2410k.a().onContentChanged();
    }

    protected q d0(int i2, boolean z2) {
        q[] qVarArr = this.K;
        if (qVarArr == null || qVarArr.length <= i2) {
            q[] qVarArr2 = new q[i2 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.K = qVarArr2;
            qVarArr = qVarArr2;
        }
        q qVar = qVarArr[i2];
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(i2);
        qVarArr[i2] = qVar2;
        return qVar2;
    }

    final CharSequence e0() {
        Object obj = this.f2407h;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2414o;
    }

    @Override // c.d
    public Context f(Context context) {
        this.N = true;
        int n02 = n0(context, J());
        if (f2402i0 && (context instanceof ContextThemeWrapper)) {
            try {
                o.a((ContextThemeWrapper) context, P(context, n02, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof g.d) {
            try {
                ((g.d) context).a(P(context, n02, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f2401h0) {
            return super.f(context);
        }
        try {
            Configuration configuration = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration2 = context.getResources().getConfiguration();
            Configuration P = P(context, n02, configuration.equals(configuration2) ? null : Z(configuration, configuration2));
            g.d dVar = new g.d(context, b.i.f2283c);
            dVar.a(P);
            boolean z2 = false;
            try {
                z2 = context.getTheme() != null;
            } catch (NullPointerException unused3) {
            }
            if (z2) {
                h.c.a(dVar.getTheme());
            }
            return super.f(dVar);
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("Application failed to obtain resources from itself", e3);
        }
    }

    final Window.Callback f0() {
        return this.f2409j.getCallback();
    }

    @Override // c.d
    public <T extends View> T i(int i2) {
        W();
        return (T) this.f2409j.findViewById(i2);
    }

    @Override // c.d
    public int k() {
        return this.R;
    }

    @Override // c.d
    public MenuInflater l() {
        if (this.f2413n == null) {
            g0();
            c.a aVar = this.f2412m;
            this.f2413n = new g.g(aVar != null ? aVar.j() : this.f2408i);
        }
        return this.f2413n;
    }

    @Override // c.d
    public c.a m() {
        g0();
        return this.f2412m;
    }

    public boolean m0() {
        return this.f2423x;
    }

    @Override // c.d
    public void n() {
        LayoutInflater from = LayoutInflater.from(this.f2408i);
        if (from.getFactory() == null) {
            androidx.core.view.g.a(from, this);
        } else {
            if (from.getFactory2() instanceof e) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    int n0(Context context, int i2) {
        j c02;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    c02 = b0(context);
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                }
                c02 = c0(context);
            }
            return c02.c();
        }
        return i2;
    }

    @Override // c.d
    public void o() {
        c.a m2 = m();
        if (m2 == null || !m2.k()) {
            k0(0);
        }
    }

    boolean o0() {
        g.b bVar = this.f2418s;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        c.a m2 = m();
        return m2 != null && m2.g();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // c.d
    public void p(Configuration configuration) {
        c.a m2;
        if (this.E && this.f2424y && (m2 = m()) != null) {
            m2.l(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f2408i);
        G(false);
    }

    boolean p0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.M = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // c.d
    public void q(Bundle bundle) {
        this.N = true;
        G(false);
        X();
        Object obj = this.f2407h;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                c.a y02 = y0();
                if (y02 == null) {
                    this.f2403a0 = true;
                } else {
                    y02.q(true);
                }
            }
            c.d.c(this);
        }
        this.O = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    @Override // c.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        c.a aVar;
        if (this.f2407h instanceof Activity) {
            c.d.x(this);
        }
        if (this.X) {
            this.f2409j.getDecorView().removeCallbacks(this.Z);
        }
        this.P = false;
        this.Q = true;
        if (this.R != -100) {
            Object obj = this.f2407h;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2398e0.put(this.f2407h.getClass().getName(), Integer.valueOf(this.R));
                aVar = this.f2412m;
                if (aVar != null) {
                    aVar.m();
                }
                M();
            }
        }
        f2398e0.remove(this.f2407h.getClass().getName());
        aVar = this.f2412m;
        if (aVar != null) {
        }
        M();
    }

    boolean r0(int i2, KeyEvent keyEvent) {
        c.a m2 = m();
        if (m2 != null && m2.n(i2, keyEvent)) {
            return true;
        }
        q qVar = this.L;
        if (qVar != null && z0(qVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            q qVar2 = this.L;
            if (qVar2 != null) {
                qVar2.f2458n = true;
            }
            return true;
        }
        if (this.L == null) {
            q d02 = d0(0, true);
            A0(d02, keyEvent);
            boolean z02 = z0(d02, keyEvent.getKeyCode(), keyEvent, 1);
            d02.f2457m = false;
            if (z02) {
                return true;
            }
        }
        return false;
    }

    @Override // c.d
    public void s(Bundle bundle) {
        W();
    }

    boolean s0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z2 = this.M;
            this.M = false;
            q d02 = d0(0, false);
            if (d02 != null && d02.f2459o) {
                if (!z2) {
                    O(d02, true);
                }
                return true;
            }
            if (o0()) {
                return true;
            }
        } else if (i2 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // c.d
    public void t() {
        c.a m2 = m();
        if (m2 != null) {
            m2.r(true);
        }
    }

    @Override // c.d
    public void u(Bundle bundle) {
    }

    void u0(int i2) {
        c.a m2;
        if (i2 != 108 || (m2 = m()) == null) {
            return;
        }
        m2.h(true);
    }

    @Override // c.d
    public void v() {
        this.P = true;
        F();
    }

    void v0(int i2) {
        if (i2 == 108) {
            c.a m2 = m();
            if (m2 != null) {
                m2.h(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            q d02 = d0(i2, true);
            if (d02.f2459o) {
                O(d02, false);
            }
        }
    }

    @Override // c.d
    public void w() {
        this.P = false;
        c.a m2 = m();
        if (m2 != null) {
            m2.r(false);
        }
    }

    void w0(ViewGroup viewGroup) {
    }

    final c.a y0() {
        return this.f2412m;
    }

    @Override // c.d
    public boolean z(int i2) {
        int C0 = C0(i2);
        if (this.I && C0 == 108) {
            return false;
        }
        if (this.E && C0 == 1) {
            this.E = false;
        }
        if (C0 == 1) {
            H0();
            this.I = true;
            return true;
        }
        if (C0 == 2) {
            H0();
            this.C = true;
            return true;
        }
        if (C0 == 5) {
            H0();
            this.D = true;
            return true;
        }
        if (C0 == 10) {
            H0();
            this.G = true;
            return true;
        }
        if (C0 == 108) {
            H0();
            this.E = true;
            return true;
        }
        if (C0 != 109) {
            return this.f2409j.requestFeature(C0);
        }
        H0();
        this.F = true;
        return true;
    }
}
