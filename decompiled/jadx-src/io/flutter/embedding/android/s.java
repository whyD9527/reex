package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import b1.b;
import io.flutter.embedding.android.a0;
import io.flutter.embedding.android.k;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import y0.o;

/* loaded from: classes.dex */
public class s extends FrameLayout implements b.c, a0.e {
    private final androidx.core.util.a<WindowLayoutInfo> A;

    /* renamed from: e, reason: collision with root package name */
    private l f3051e;

    /* renamed from: f, reason: collision with root package name */
    private m f3052f;

    /* renamed from: g, reason: collision with root package name */
    private k f3053g;

    /* renamed from: h, reason: collision with root package name */
    io.flutter.embedding.engine.renderer.b f3054h;

    /* renamed from: i, reason: collision with root package name */
    private io.flutter.embedding.engine.renderer.b f3055i;

    /* renamed from: j, reason: collision with root package name */
    private final Set<io.flutter.embedding.engine.renderer.a> f3056j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3057k;

    /* renamed from: l, reason: collision with root package name */
    private io.flutter.embedding.engine.a f3058l;

    /* renamed from: m, reason: collision with root package name */
    private final Set<f> f3059m;

    /* renamed from: n, reason: collision with root package name */
    private b1.b f3060n;

    /* renamed from: o, reason: collision with root package name */
    private io.flutter.plugin.editing.m f3061o;

    /* renamed from: p, reason: collision with root package name */
    private io.flutter.plugin.editing.f f3062p;

    /* renamed from: q, reason: collision with root package name */
    private a1.b f3063q;

    /* renamed from: r, reason: collision with root package name */
    private a0 f3064r;

    /* renamed from: s, reason: collision with root package name */
    private io.flutter.embedding.android.c f3065s;

    /* renamed from: t, reason: collision with root package name */
    private io.flutter.view.f f3066t;

    /* renamed from: u, reason: collision with root package name */
    private TextServicesManager f3067u;

    /* renamed from: v, reason: collision with root package name */
    private f0 f3068v;

    /* renamed from: w, reason: collision with root package name */
    private final FlutterRenderer.g f3069w;

    /* renamed from: x, reason: collision with root package name */
    private final f.k f3070x;

    /* renamed from: y, reason: collision with root package name */
    private final ContentObserver f3071y;

    /* renamed from: z, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.a f3072z;

    class a implements f.k {
        a() {
        }

        @Override // io.flutter.view.f.k
        public void a(boolean z2, boolean z3) {
            s.this.z(z2, z3);
        }
    }

    class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            super.onChange(z2);
            if (s.this.f3058l == null) {
                return;
            }
            n0.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
            s.this.B();
        }
    }

    class c implements io.flutter.embedding.engine.renderer.a {
        c() {
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void c() {
            s.this.f3057k = false;
            Iterator it = s.this.f3056j.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.a) it.next()).c();
            }
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void f() {
            s.this.f3057k = true;
            Iterator it = s.this.f3056j.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.a) it.next()).f();
            }
        }
    }

    class d implements androidx.core.util.a<WindowLayoutInfo> {
        d() {
        }

        @Override // androidx.core.util.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            s.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    class e implements io.flutter.embedding.engine.renderer.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FlutterRenderer f3077a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f3078b;

        e(FlutterRenderer flutterRenderer, Runnable runnable) {
            this.f3077a = flutterRenderer;
            this.f3078b = runnable;
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void c() {
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void f() {
            this.f3077a.u(this);
            this.f3078b.run();
            s sVar = s.this;
            if ((sVar.f3054h instanceof k) || sVar.f3053g == null) {
                return;
            }
            s.this.f3053g.a();
            s.this.x();
        }
    }

    public interface f {
        void a();

        void b(io.flutter.embedding.engine.a aVar);
    }

    private enum g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private s(Context context, AttributeSet attributeSet, l lVar) {
        super(context, attributeSet);
        this.f3056j = new HashSet();
        this.f3059m = new HashSet();
        this.f3069w = new FlutterRenderer.g();
        this.f3070x = new a();
        this.f3071y = new b(new Handler(Looper.getMainLooper()));
        this.f3072z = new c();
        this.A = new d();
        this.f3051e = lVar;
        this.f3054h = lVar;
        u();
    }

    private s(Context context, AttributeSet attributeSet, m mVar) {
        super(context, attributeSet);
        this.f3056j = new HashSet();
        this.f3059m = new HashSet();
        this.f3069w = new FlutterRenderer.g();
        this.f3070x = new a();
        this.f3071y = new b(new Handler(Looper.getMainLooper()));
        this.f3072z = new c();
        this.A = new d();
        this.f3052f = mVar;
        this.f3054h = mVar;
        u();
    }

    public s(Context context, l lVar) {
        this(context, (AttributeSet) null, lVar);
    }

    public s(Context context, m mVar) {
        this(context, (AttributeSet) null, mVar);
    }

    private void C() {
        if (!v()) {
            n0.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f3069w.f3230a = getResources().getDisplayMetrics().density;
        this.f3069w.f3245p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f3058l.s().x(this.f3069w);
    }

    private g o() {
        Context context = getContext();
        int i2 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i2 == 2) {
            if (rotation == 1) {
                return g.RIGHT;
            }
            if (rotation == 3) {
                return g.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return g.BOTH;
            }
        }
        return g.NONE;
    }

    @TargetApi(20)
    private int t(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void u() {
        View view;
        n0.b.f("FlutterView", "Initializing FlutterView");
        if (this.f3051e != null) {
            n0.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f3051e;
        } else if (this.f3052f != null) {
            n0.b.f("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f3052f;
        } else {
            n0.b.f("FlutterView", "Internally using a FlutterImageView.");
            view = this.f3053g;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean w(SpellCheckerInfo spellCheckerInfo) {
        return spellCheckerInfo.getPackageName().equals("com.google.android.inputmethod.latin");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        k kVar = this.f3053g;
        if (kVar != null) {
            kVar.g();
            removeView(this.f3053g);
            this.f3053g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(boolean z2, boolean z3) {
        boolean z4 = false;
        if (!this.f3058l.s().o() && !z2 && !z3) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    public void A(Runnable runnable) {
        if (this.f3053g == null) {
            n0.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        io.flutter.embedding.engine.renderer.b bVar = this.f3055i;
        if (bVar == null) {
            n0.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f3054h = bVar;
        this.f3055i = null;
        FlutterRenderer s2 = this.f3058l.s();
        if (this.f3058l != null && s2 != null) {
            this.f3054h.c();
            s2.j(new e(s2, runnable));
        } else {
            this.f3053g.a();
            x();
            runnable.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void B() {
        boolean z2;
        List enabledSpellCheckerInfos;
        Stream stream;
        boolean isSpellCheckerEnabled;
        o.c cVar = (getResources().getConfiguration().uiMode & 48) == 32 ? o.c.dark : o.c.light;
        TextServicesManager textServicesManager = this.f3067u;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                stream = enabledSpellCheckerInfos.stream();
                boolean anyMatch = stream.anyMatch(new Predicate() { // from class: io.flutter.embedding.android.r
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        boolean w2;
                        w2 = s.w((SpellCheckerInfo) obj);
                        return w2;
                    }
                });
                isSpellCheckerEnabled = this.f3067u.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z2 = true;
            this.f3058l.u().d().f(getResources().getConfiguration().fontScale).c(getResources().getDisplayMetrics()).d(z2).b(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1).g(DateFormat.is24HourFormat(getContext())).e(cVar).a();
        }
        z2 = false;
        this.f3058l.u().d().f(getResources().getConfiguration().fontScale).c(getResources().getDisplayMetrics()).d(z2).b(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1).g(DateFormat.is24HourFormat(getContext())).e(cVar).a();
    }

    @Override // io.flutter.embedding.android.a0.e
    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.f3061o.j(sparseArray);
    }

    @Override // b1.b.c
    @TargetApi(24)
    public PointerIcon b(int i2) {
        return PointerIcon.getSystemIcon(getContext(), i2);
    }

    @Override // io.flutter.embedding.android.a0.e
    public boolean c(KeyEvent keyEvent) {
        return this.f3061o.r(keyEvent);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f3058l;
        return aVar != null ? aVar.p().G(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (v() && this.f3064r.b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.f fVar = this.f3066t;
        if (fVar == null || !fVar.C()) {
            return null;
        }
        return this.f3066t;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f3058l;
    }

    @Override // io.flutter.embedding.android.a0.e
    public z0.c getBinaryMessenger() {
        return this.f3058l.j();
    }

    public k getCurrentImageSurface() {
        return this.f3053g;
    }

    public boolean k() {
        k kVar = this.f3053g;
        if (kVar != null) {
            return kVar.e();
        }
        return false;
    }

    public void l(io.flutter.embedding.engine.renderer.a aVar) {
        this.f3056j.add(aVar);
    }

    public void m(k kVar) {
        io.flutter.embedding.engine.a aVar = this.f3058l;
        if (aVar != null) {
            kVar.d(aVar.s());
        }
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        n0.b.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (v()) {
            if (aVar == this.f3058l) {
                n0.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                n0.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                s();
            }
        }
        this.f3058l = aVar;
        FlutterRenderer s2 = aVar.s();
        this.f3057k = s2.n();
        this.f3054h.d(s2);
        s2.j(this.f3072z);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3060n = new b1.b(this, this.f3058l.m());
        }
        this.f3061o = new io.flutter.plugin.editing.m(this, this.f3058l.x(), this.f3058l.p());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f3067u = textServicesManager;
            this.f3062p = new io.flutter.plugin.editing.f(textServicesManager, this.f3058l.v());
        } catch (Exception unused) {
            n0.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f3063q = this.f3058l.l();
        this.f3064r = new a0(this);
        this.f3065s = new io.flutter.embedding.android.c(this.f3058l.s(), false);
        io.flutter.view.f fVar = new io.flutter.view.f(this, aVar.h(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f3058l.p());
        this.f3066t = fVar;
        fVar.a0(this.f3070x);
        z(this.f3066t.C(), this.f3066t.E());
        this.f3058l.p().a(this.f3066t);
        this.f3058l.p().E(this.f3058l.s());
        this.f3061o.q().restartInput(this);
        B();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f3071y);
        C();
        aVar.p().F(this);
        Iterator<f> it = this.f3059m.iterator();
        while (it.hasNext()) {
            it.next().b(aVar);
        }
        if (this.f3057k) {
            this.f3072z.f();
        }
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Insets insets;
        Insets insets2;
        Insets insets3;
        DisplayCutout displayCutout;
        Insets waterfallInsets;
        Insets systemGestureInsets;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            FlutterRenderer.g gVar = this.f3069w;
            gVar.f3241l = systemGestureInsets.top;
            gVar.f3242m = systemGestureInsets.right;
            gVar.f3243n = systemGestureInsets.bottom;
            gVar.f3244o = systemGestureInsets.left;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i2 >= 30) {
            int navigationBars = z3 ? 0 | WindowInsets$Type.navigationBars() : 0;
            if (z2) {
                navigationBars |= WindowInsets$Type.statusBars();
            }
            insets = windowInsets.getInsets(navigationBars);
            FlutterRenderer.g gVar2 = this.f3069w;
            gVar2.f3233d = insets.top;
            gVar2.f3234e = insets.right;
            gVar2.f3235f = insets.bottom;
            gVar2.f3236g = insets.left;
            insets2 = windowInsets.getInsets(WindowInsets$Type.ime());
            FlutterRenderer.g gVar3 = this.f3069w;
            gVar3.f3237h = insets2.top;
            gVar3.f3238i = insets2.right;
            gVar3.f3239j = insets2.bottom;
            gVar3.f3240k = insets2.left;
            insets3 = windowInsets.getInsets(WindowInsets$Type.systemGestures());
            FlutterRenderer.g gVar4 = this.f3069w;
            gVar4.f3241l = insets3.top;
            gVar4.f3242m = insets3.right;
            gVar4.f3243n = insets3.bottom;
            gVar4.f3244o = insets3.left;
            displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                waterfallInsets = displayCutout.getWaterfallInsets();
                FlutterRenderer.g gVar5 = this.f3069w;
                gVar5.f3233d = Math.max(Math.max(gVar5.f3233d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                FlutterRenderer.g gVar6 = this.f3069w;
                gVar6.f3234e = Math.max(Math.max(gVar6.f3234e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                FlutterRenderer.g gVar7 = this.f3069w;
                gVar7.f3235f = Math.max(Math.max(gVar7.f3235f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                FlutterRenderer.g gVar8 = this.f3069w;
                gVar8.f3236g = Math.max(Math.max(gVar8.f3236g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            g gVar9 = g.NONE;
            if (!z3) {
                gVar9 = o();
            }
            this.f3069w.f3233d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f3069w.f3234e = (gVar9 == g.RIGHT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f3069w.f3235f = (z3 && t(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.f3069w.f3236g = (gVar9 == g.LEFT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.g gVar10 = this.f3069w;
            gVar10.f3237h = 0;
            gVar10.f3238i = 0;
            gVar10.f3239j = t(windowInsets);
            this.f3069w.f3240k = 0;
        }
        n0.b.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f3069w.f3233d + ", Left: " + this.f3069w.f3236g + ", Right: " + this.f3069w.f3234e + "\nKeyboard insets: Bottom: " + this.f3069w.f3239j + ", Left: " + this.f3069w.f3240k + ", Right: " + this.f3069w.f3238i + "System Gesture Insets - Left: " + this.f3069w.f3244o + ", Top: " + this.f3069w.f3241l + ", Right: " + this.f3069w.f3242m + ", Bottom: " + this.f3069w.f3239j);
        C();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3068v = r();
        Activity f2 = f1.i.f(getContext());
        f0 f0Var = this.f3068v;
        if (f0Var == null || f2 == null) {
            return;
        }
        f0Var.a(f2, androidx.core.content.a.f(getContext()), this.A);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f3058l != null) {
            n0.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f3063q.d(configuration);
            B();
            f1.i.c(getContext(), this.f3058l);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !v() ? super.onCreateInputConnection(editorInfo) : this.f3061o.o(this, this.f3064r, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        f0 f0Var = this.f3068v;
        if (f0Var != null) {
            f0Var.b(this.A);
        }
        this.f3068v = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (v() && this.f3065s.j(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !v() ? super.onHoverEvent(motionEvent) : this.f3066t.L(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        this.f3061o.A(viewStructure, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        n0.b.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i4 + " x " + i5 + ", it is now " + i2 + " x " + i3);
        FlutterRenderer.g gVar = this.f3069w;
        gVar.f3231b = i2;
        gVar.f3232c = i3;
        C();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!v()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.f3065s.k(motionEvent);
    }

    public void p() {
        this.f3054h.b();
        k kVar = this.f3053g;
        if (kVar == null) {
            k q2 = q();
            this.f3053g = q2;
            addView(q2);
        } else {
            kVar.k(getWidth(), getHeight());
        }
        this.f3055i = this.f3054h;
        k kVar2 = this.f3053g;
        this.f3054h = kVar2;
        io.flutter.embedding.engine.a aVar = this.f3058l;
        if (aVar != null) {
            kVar2.d(aVar.s());
        }
    }

    public k q() {
        return new k(getContext(), getWidth(), getHeight(), k.b.background);
    }

    protected f0 r() {
        try {
            return new f0(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void s() {
        n0.b.f("FlutterView", "Detaching from a FlutterEngine: " + this.f3058l);
        if (!v()) {
            n0.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator<f> it = this.f3059m.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f3071y);
        this.f3058l.p().P();
        this.f3058l.p().d();
        this.f3066t.S();
        this.f3066t = null;
        this.f3061o.q().restartInput(this);
        this.f3061o.p();
        this.f3064r.d();
        io.flutter.plugin.editing.f fVar = this.f3062p;
        if (fVar != null) {
            fVar.b();
        }
        b1.b bVar = this.f3060n;
        if (bVar != null) {
            bVar.c();
        }
        FlutterRenderer s2 = this.f3058l.s();
        this.f3057k = false;
        s2.u(this.f3072z);
        s2.z();
        s2.w(false);
        io.flutter.embedding.engine.renderer.b bVar2 = this.f3055i;
        if (bVar2 != null && this.f3054h == this.f3053g) {
            this.f3054h = bVar2;
        }
        this.f3054h.a();
        x();
        this.f3055i = null;
        this.f3058l = null;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        io.flutter.embedding.engine.renderer.b bVar = this.f3054h;
        if (bVar instanceof l) {
            ((l) bVar).setVisibility(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        r7 = r7.getDisplayCutout();
     */
    @TargetApi(28)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        DisplayCutout displayCutout;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature displayFeature : displayFeatures) {
            n0.b.f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + displayFeature.getBounds().toString() + " and type = " + displayFeature.getClass().getSimpleName());
            if (displayFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) displayFeature;
                arrayList.add(new FlutterRenderer.b(displayFeature.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? FlutterRenderer.d.HINGE : FlutterRenderer.d.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? FlutterRenderer.c.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? FlutterRenderer.c.POSTURE_HALF_OPENED : FlutterRenderer.c.UNKNOWN));
            } else {
                arrayList.add(new FlutterRenderer.b(displayFeature.getBounds(), FlutterRenderer.d.UNKNOWN, FlutterRenderer.c.UNKNOWN));
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && (r7 = getRootWindowInsets()) != null && displayCutout != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                n0.b.f("FlutterView", "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new FlutterRenderer.b(rect, FlutterRenderer.d.CUTOUT));
            }
        }
        this.f3069w.f3246q = arrayList;
        C();
    }

    public boolean v() {
        io.flutter.embedding.engine.a aVar = this.f3058l;
        return aVar != null && aVar.s() == this.f3054h.getAttachedRenderer();
    }

    public void y(io.flutter.embedding.engine.renderer.a aVar) {
        this.f3056j.remove(aVar);
    }
}
