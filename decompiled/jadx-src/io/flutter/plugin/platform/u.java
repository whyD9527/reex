package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.flutter.embedding.android.c0;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.u;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import y0.l;

/* loaded from: classes.dex */
public class u implements o {

    /* renamed from: w, reason: collision with root package name */
    private static Class[] f3375w = {SurfaceView.class};

    /* renamed from: x, reason: collision with root package name */
    private static boolean f3376x = true;

    /* renamed from: y, reason: collision with root package name */
    private static boolean f3377y = false;

    /* renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.android.c f3379b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3380c;

    /* renamed from: d, reason: collision with root package name */
    private io.flutter.embedding.android.s f3381d;

    /* renamed from: e, reason: collision with root package name */
    private TextureRegistry f3382e;

    /* renamed from: f, reason: collision with root package name */
    private io.flutter.plugin.editing.m f3383f;

    /* renamed from: g, reason: collision with root package name */
    private y0.l f3384g;

    /* renamed from: o, reason: collision with root package name */
    private int f3392o = 0;

    /* renamed from: p, reason: collision with root package name */
    private boolean f3393p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f3394q = true;

    /* renamed from: u, reason: collision with root package name */
    private boolean f3398u = false;

    /* renamed from: v, reason: collision with root package name */
    private final l.g f3399v = new a();

    /* renamed from: a, reason: collision with root package name */
    private final l f3378a = new l();

    /* renamed from: i, reason: collision with root package name */
    final HashMap<Integer, y> f3386i = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final io.flutter.plugin.platform.a f3385h = new io.flutter.plugin.platform.a();

    /* renamed from: j, reason: collision with root package name */
    final HashMap<Context, View> f3387j = new HashMap<>();

    /* renamed from: m, reason: collision with root package name */
    private final SparseArray<c> f3390m = new SparseArray<>();

    /* renamed from: r, reason: collision with root package name */
    private final HashSet<Integer> f3395r = new HashSet<>();

    /* renamed from: s, reason: collision with root package name */
    private final HashSet<Integer> f3396s = new HashSet<>();

    /* renamed from: n, reason: collision with root package name */
    private final SparseArray<n> f3391n = new SparseArray<>();

    /* renamed from: k, reason: collision with root package name */
    private final SparseArray<i> f3388k = new SparseArray<>();

    /* renamed from: l, reason: collision with root package name */
    private final SparseArray<r0.a> f3389l = new SparseArray<>();

    /* renamed from: t, reason: collision with root package name */
    private final c0 f3397t = c0.a();

    class a implements l.g {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(y yVar, float f2, l.b bVar) {
            u.this.x0(yVar);
            if (u.this.f3380c != null) {
                f2 = u.this.V();
            }
            bVar.a(new l.c(u.this.u0(yVar.e(), f2), u.this.u0(yVar.d(), f2)));
        }

        @Override // y0.l.g
        public void a(boolean z2) {
            u.this.f3394q = z2;
        }

        @Override // y0.l.g
        public void b(l.f fVar) {
            int i2 = fVar.f4623a;
            float f2 = u.this.f3380c.getResources().getDisplayMetrics().density;
            if (u.this.b(i2)) {
                u.this.f3386i.get(Integer.valueOf(i2)).b(u.this.v0(f2, fVar, true));
                return;
            }
            i iVar = (i) u.this.f3388k.get(i2);
            if (iVar == null) {
                n0.b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
                return;
            }
            View c3 = iVar.c();
            if (c3 != null) {
                c3.dispatchTouchEvent(u.this.v0(f2, fVar, false));
                return;
            }
            n0.b.b("PlatformViewsController", "Sending touch to a null view with id: " + i2);
        }

        @Override // y0.l.g
        public void c(int i2, double d3, double d4) {
            if (u.this.b(i2)) {
                return;
            }
            n nVar = (n) u.this.f3391n.get(i2);
            if (nVar == null) {
                n0.b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
                return;
            }
            int w02 = u.this.w0(d3);
            int w03 = u.this.w0(d4);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nVar.getLayoutParams();
            layoutParams.topMargin = w02;
            layoutParams.leftMargin = w03;
            nVar.setLayoutParams(layoutParams);
        }

        @Override // y0.l.g
        @TargetApi(17)
        public void d(int i2, int i3) {
            View c3;
            StringBuilder sb;
            String str;
            if (!u.y0(i3)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
            }
            if (u.this.b(i2)) {
                c3 = u.this.f3386i.get(Integer.valueOf(i2)).f();
            } else {
                i iVar = (i) u.this.f3388k.get(i2);
                if (iVar == null) {
                    sb = new StringBuilder();
                    str = "Setting direction to an unknown view with id: ";
                    sb.append(str);
                    sb.append(i2);
                    n0.b.b("PlatformViewsController", sb.toString());
                }
                c3 = iVar.c();
            }
            if (c3 != null) {
                c3.setLayoutDirection(i3);
                return;
            }
            sb = new StringBuilder();
            str = "Setting direction to a null view with id: ";
            sb.append(str);
            sb.append(i2);
            n0.b.b("PlatformViewsController", sb.toString());
        }

        @Override // y0.l.g
        public void e(int i2) {
            View c3;
            StringBuilder sb;
            String str;
            if (u.this.b(i2)) {
                c3 = u.this.f3386i.get(Integer.valueOf(i2)).f();
            } else {
                i iVar = (i) u.this.f3388k.get(i2);
                if (iVar == null) {
                    sb = new StringBuilder();
                    str = "Clearing focus on an unknown view with id: ";
                    sb.append(str);
                    sb.append(i2);
                    n0.b.b("PlatformViewsController", sb.toString());
                }
                c3 = iVar.c();
            }
            if (c3 != null) {
                c3.clearFocus();
                return;
            }
            sb = new StringBuilder();
            str = "Clearing focus on a null view with id: ";
            sb.append(str);
            sb.append(i2);
            n0.b.b("PlatformViewsController", sb.toString());
        }

        @Override // y0.l.g
        public void f(l.e eVar, final l.b bVar) {
            int w02 = u.this.w0(eVar.f4621b);
            int w03 = u.this.w0(eVar.f4622c);
            int i2 = eVar.f4620a;
            if (u.this.b(i2)) {
                final float V = u.this.V();
                final y yVar = u.this.f3386i.get(Integer.valueOf(i2));
                u.this.d0(yVar);
                yVar.i(w02, w03, new Runnable() { // from class: io.flutter.plugin.platform.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.k(yVar, V, bVar);
                    }
                });
                return;
            }
            i iVar = (i) u.this.f3388k.get(i2);
            n nVar = (n) u.this.f3391n.get(i2);
            if (iVar == null || nVar == null) {
                n0.b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i2);
                return;
            }
            if (w02 > nVar.getRenderTargetWidth() || w03 > nVar.getRenderTargetHeight()) {
                nVar.b(w02, w03);
            }
            ViewGroup.LayoutParams layoutParams = nVar.getLayoutParams();
            layoutParams.width = w02;
            layoutParams.height = w03;
            nVar.setLayoutParams(layoutParams);
            View c3 = iVar.c();
            if (c3 != null) {
                ViewGroup.LayoutParams layoutParams2 = c3.getLayoutParams();
                layoutParams2.width = w02;
                layoutParams2.height = w03;
                c3.setLayoutParams(layoutParams2);
            }
            bVar.a(new l.c(u.this.t0(nVar.getRenderTargetWidth()), u.this.t0(nVar.getRenderTargetHeight())));
        }

        @Override // y0.l.g
        @TargetApi(19)
        public void g(l.d dVar) {
            u.this.S(19);
            u.this.T(dVar);
            u.this.H(u.this.M(dVar, false), dVar);
        }

        @Override // y0.l.g
        @TargetApi(20)
        public long h(l.d dVar) {
            u.this.T(dVar);
            int i2 = dVar.f4607a;
            if (u.this.f3391n.get(i2) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i2);
            }
            if (u.this.f3382e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i2);
            }
            if (u.this.f3381d == null) {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i2);
            }
            i M = u.this.M(dVar, true);
            View c3 = M.c();
            if (c3.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            if (!(f1.i.g(c3, u.f3375w) ? false : true)) {
                if (dVar.f4614h == l.d.a.TEXTURE_WITH_HYBRID_FALLBACK) {
                    u.this.H(M, dVar);
                    return -2L;
                }
                if (!u.this.f3398u) {
                    return u.this.J(M, dVar);
                }
            }
            return u.this.I(M, dVar);
        }

        @Override // y0.l.g
        public void i(int i2) {
            i iVar = (i) u.this.f3388k.get(i2);
            if (iVar == null) {
                n0.b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
                return;
            }
            if (iVar.c() != null) {
                View c3 = iVar.c();
                ViewGroup viewGroup = (ViewGroup) c3.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(c3);
                }
            }
            u.this.f3388k.remove(i2);
            try {
                iVar.a();
            } catch (RuntimeException e3) {
                n0.b.c("PlatformViewsController", "Disposing platform view threw an exception", e3);
            }
            if (u.this.b(i2)) {
                y yVar = u.this.f3386i.get(Integer.valueOf(i2));
                View f2 = yVar.f();
                if (f2 != null) {
                    u.this.f3387j.remove(f2.getContext());
                }
                yVar.c();
                u.this.f3386i.remove(Integer.valueOf(i2));
                return;
            }
            n nVar = (n) u.this.f3391n.get(i2);
            if (nVar != null) {
                nVar.removeAllViews();
                nVar.a();
                nVar.c();
                ViewGroup viewGroup2 = (ViewGroup) nVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(nVar);
                }
                u.this.f3391n.remove(i2);
                return;
            }
            r0.a aVar = (r0.a) u.this.f3389l.get(i2);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup viewGroup3 = (ViewGroup) aVar.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(aVar);
                }
                u.this.f3389l.remove(i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(i iVar, l.d dVar) {
        S(19);
        n0.b.e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f4607a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long J(i iVar, final l.d dVar) {
        S(20);
        n0.b.e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + dVar.f4607a);
        m e02 = e0(this.f3382e);
        y a3 = y.a(this.f3380c, this.f3385h, iVar, e02, w0(dVar.f4609c), w0(dVar.f4610d), dVar.f4607a, null, new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.s
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                u.this.a0(dVar, view, z2);
            }
        });
        if (a3 != null) {
            this.f3386i.put(Integer.valueOf(dVar.f4607a), a3);
            View c3 = iVar.c();
            this.f3387j.put(c3.getContext(), c3);
            return e02.getId();
        }
        throw new IllegalStateException("Failed creating virtual display for a " + dVar.f4608b + " with id: " + dVar.f4607a);
    }

    private void R() {
        while (this.f3388k.size() > 0) {
            this.f3399v.i(this.f3388k.keyAt(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= i2) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i3 + ", required API level is: " + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(l.d dVar) {
        if (y0(dVar.f4613g)) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f4613g + "(view id: " + dVar.f4607a + ")");
    }

    private void U(boolean z2) {
        for (int i2 = 0; i2 < this.f3390m.size(); i2++) {
            int keyAt = this.f3390m.keyAt(i2);
            c valueAt = this.f3390m.valueAt(i2);
            if (this.f3395r.contains(Integer.valueOf(keyAt))) {
                this.f3381d.m(valueAt);
                z2 &= valueAt.e();
            } else {
                if (!this.f3393p) {
                    valueAt.a();
                }
                valueAt.setVisibility(8);
                this.f3381d.removeView(valueAt);
            }
        }
        for (int i3 = 0; i3 < this.f3389l.size(); i3++) {
            int keyAt2 = this.f3389l.keyAt(i3);
            r0.a aVar = this.f3389l.get(keyAt2);
            if (!this.f3396s.contains(Integer.valueOf(keyAt2)) || (!z2 && this.f3394q)) {
                aVar.setVisibility(8);
            } else {
                aVar.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float V() {
        return this.f3380c.getResources().getDisplayMetrics().density;
    }

    private void Y() {
        if (!this.f3394q || this.f3393p) {
            return;
        }
        this.f3381d.p();
        this.f3393p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(l.d dVar, View view, boolean z2) {
        if (z2) {
            this.f3384g.d(dVar.f4607a);
            return;
        }
        io.flutter.plugin.editing.m mVar = this.f3383f;
        if (mVar != null) {
            mVar.l(dVar.f4607a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(l.d dVar, View view, boolean z2) {
        if (z2) {
            this.f3384g.d(dVar.f4607a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(int i2, View view, boolean z2) {
        if (z2) {
            this.f3384g.d(i2);
            return;
        }
        io.flutter.plugin.editing.m mVar = this.f3383f;
        if (mVar != null) {
            mVar.l(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0() {
        U(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(y yVar) {
        io.flutter.plugin.editing.m mVar = this.f3383f;
        if (mVar == null) {
            return;
        }
        mVar.u();
        yVar.g();
    }

    private static m e0(TextureRegistry textureRegistry) {
        if (f3377y && Build.VERSION.SDK_INT >= 33) {
            TextureRegistry.SurfaceProducer b3 = textureRegistry.b();
            n0.b.e("PlatformViewsController", "PlatformView is using SurfaceProducer backend");
            return new v(b3);
        }
        if (!f3376x || Build.VERSION.SDK_INT < 33) {
            TextureRegistry.SurfaceTextureEntry c3 = textureRegistry.c();
            n0.b.e("PlatformViewsController", "PlatformView is using SurfaceTexture backend");
            return new x(c3);
        }
        TextureRegistry.ImageTextureEntry a3 = textureRegistry.a();
        n0.b.e("PlatformViewsController", "PlatformView is using ImageReader backend");
        return new b(a3);
    }

    private void f0(i iVar) {
        io.flutter.embedding.android.s sVar = this.f3381d;
        if (sVar == null) {
            n0.b.e("PlatformViewsController", "null flutterView");
        } else {
            iVar.d(sVar);
        }
    }

    private static MotionEvent.PointerCoords n0(Object obj, float f2) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d3 = f2;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d3);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d3);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d3);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d3);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d3);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d3);
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> o0(Object obj, float f2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(n0(it.next(), f2));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties p0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> q0(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(p0(it.next()));
        }
        return arrayList;
    }

    private void r0() {
        if (this.f3381d == null) {
            n0.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i2 = 0; i2 < this.f3390m.size(); i2++) {
            this.f3381d.removeView(this.f3390m.valueAt(i2));
        }
        this.f3390m.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int t0(double d3) {
        return u0(d3, V());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u0(double d3, float f2) {
        return (int) Math.round(d3 / f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int w0(double d3) {
        return (int) Math.round(d3 * V());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(y yVar) {
        io.flutter.plugin.editing.m mVar = this.f3383f;
        if (mVar == null) {
            return;
        }
        mVar.H();
        yVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean y0(int i2) {
        return i2 == 0 || i2 == 1;
    }

    public void C(Context context, TextureRegistry textureRegistry, o0.a aVar) {
        if (this.f3380c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f3380c = context;
        this.f3382e = textureRegistry;
        y0.l lVar = new y0.l(aVar);
        this.f3384g = lVar;
        lVar.e(this.f3399v);
    }

    public void D(io.flutter.plugin.editing.m mVar) {
        this.f3383f = mVar;
    }

    public void E(FlutterRenderer flutterRenderer) {
        this.f3379b = new io.flutter.embedding.android.c(flutterRenderer, true);
    }

    public void F(io.flutter.embedding.android.s sVar) {
        this.f3381d = sVar;
        for (int i2 = 0; i2 < this.f3391n.size(); i2++) {
            this.f3381d.addView(this.f3391n.valueAt(i2));
        }
        for (int i3 = 0; i3 < this.f3389l.size(); i3++) {
            this.f3381d.addView(this.f3389l.valueAt(i3));
        }
        for (int i4 = 0; i4 < this.f3388k.size(); i4++) {
            this.f3388k.valueAt(i4).d(this.f3381d);
        }
    }

    public boolean G(View view) {
        if (view == null || !this.f3387j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.f3387j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @TargetApi(23)
    public long I(i iVar, final l.d dVar) {
        n nVar;
        long j2;
        S(23);
        n0.b.e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + dVar.f4607a);
        int w02 = w0(dVar.f4609c);
        int w03 = w0(dVar.f4610d);
        if (this.f3398u) {
            nVar = new n(this.f3380c);
            j2 = -1;
        } else {
            m e02 = e0(this.f3382e);
            n nVar2 = new n(this.f3380c, e02);
            long id = e02.getId();
            nVar = nVar2;
            j2 = id;
        }
        nVar.setTouchProcessor(this.f3379b);
        nVar.b(w02, w03);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(w02, w03);
        int w04 = w0(dVar.f4611e);
        int w05 = w0(dVar.f4612f);
        layoutParams.topMargin = w04;
        layoutParams.leftMargin = w05;
        nVar.setLayoutParams(layoutParams);
        View c3 = iVar.c();
        c3.setLayoutParams(new FrameLayout.LayoutParams(w02, w03));
        c3.setImportantForAccessibility(4);
        nVar.addView(c3);
        nVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.r
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                u.this.Z(dVar, view, z2);
            }
        });
        this.f3381d.addView(nVar);
        this.f3391n.append(dVar.f4607a, nVar);
        f0(iVar);
        return j2;
    }

    @TargetApi(19)
    public FlutterOverlaySurface K() {
        return L(new c(this.f3381d.getContext(), this.f3381d.getWidth(), this.f3381d.getHeight(), this.f3385h));
    }

    @TargetApi(19)
    public FlutterOverlaySurface L(c cVar) {
        int i2 = this.f3392o;
        this.f3392o = i2 + 1;
        this.f3390m.put(i2, cVar);
        return new FlutterOverlaySurface(i2, cVar.getSurface());
    }

    @TargetApi(19)
    public i M(l.d dVar, boolean z2) {
        j a3 = this.f3378a.a(dVar.f4608b);
        if (a3 == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f4608b);
        }
        i a4 = a3.a(z2 ? new MutableContextWrapper(this.f3380c) : this.f3380c, dVar.f4607a, dVar.f4615i != null ? a3.b().b(dVar.f4615i) : null);
        View c3 = a4.c();
        if (c3 == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        c3.setLayoutDirection(dVar.f4613g);
        this.f3388k.put(dVar.f4607a, a4);
        f0(a4);
        return a4;
    }

    public void N() {
        for (int i2 = 0; i2 < this.f3390m.size(); i2++) {
            c valueAt = this.f3390m.valueAt(i2);
            valueAt.a();
            valueAt.g();
        }
    }

    public void O() {
        y0.l lVar = this.f3384g;
        if (lVar != null) {
            lVar.e(null);
        }
        N();
        this.f3384g = null;
        this.f3380c = null;
        this.f3382e = null;
    }

    public void P() {
        for (int i2 = 0; i2 < this.f3391n.size(); i2++) {
            this.f3381d.removeView(this.f3391n.valueAt(i2));
        }
        for (int i3 = 0; i3 < this.f3389l.size(); i3++) {
            this.f3381d.removeView(this.f3389l.valueAt(i3));
        }
        N();
        r0();
        this.f3381d = null;
        this.f3393p = false;
        for (int i4 = 0; i4 < this.f3388k.size(); i4++) {
            this.f3388k.valueAt(i4).e();
        }
    }

    public void Q() {
        this.f3383f = null;
    }

    public k W() {
        return this.f3378a;
    }

    @TargetApi(19)
    void X(final int i2) {
        i iVar = this.f3388k.get(i2);
        if (iVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
        if (this.f3389l.get(i2) != null) {
            return;
        }
        View c3 = iVar.c();
        if (c3 == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (c3.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f3380c;
        r0.a aVar = new r0.a(context, context.getResources().getDisplayMetrics().density, this.f3379b);
        aVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.p
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                u.this.b0(i2, view, z2);
            }
        });
        this.f3389l.put(i2, aVar);
        c3.setImportantForAccessibility(4);
        aVar.addView(c3);
        this.f3381d.addView(aVar);
    }

    @Override // io.flutter.plugin.platform.o
    public void a(io.flutter.view.f fVar) {
        this.f3385h.c(fVar);
    }

    @Override // io.flutter.plugin.platform.o
    public boolean b(int i2) {
        return this.f3386i.containsKey(Integer.valueOf(i2));
    }

    @Override // io.flutter.plugin.platform.o
    public View c(int i2) {
        if (b(i2)) {
            return this.f3386i.get(Integer.valueOf(i2)).f();
        }
        i iVar = this.f3388k.get(i2);
        if (iVar == null) {
            return null;
        }
        return iVar.c();
    }

    @Override // io.flutter.plugin.platform.o
    public void d() {
        this.f3385h.c(null);
    }

    public void g0() {
    }

    public void h0() {
        this.f3395r.clear();
        this.f3396s.clear();
    }

    public void i0() {
        R();
    }

    public void j0(int i2, int i3, int i4, int i5, int i6) {
        if (this.f3390m.get(i2) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i2 + ") doesn't exist");
        }
        Y();
        c cVar = this.f3390m.get(i2);
        if (cVar.getParent() == null) {
            this.f3381d.addView(cVar);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        cVar.setLayoutParams(layoutParams);
        cVar.setVisibility(0);
        cVar.bringToFront();
        this.f3395r.add(Integer.valueOf(i2));
    }

    public void k0(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        Y();
        X(i2);
        r0.a aVar = this.f3389l.get(i2);
        aVar.a(flutterMutatorsStack, i3, i4, i5, i6);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
        View c3 = this.f3388k.get(i2).c();
        if (c3 != null) {
            c3.setLayoutParams(layoutParams);
            c3.bringToFront();
        }
        this.f3396s.add(Integer.valueOf(i2));
    }

    public void l0() {
        boolean z2 = false;
        if (this.f3393p && this.f3396s.isEmpty()) {
            this.f3393p = false;
            this.f3381d.A(new Runnable() { // from class: io.flutter.plugin.platform.q
                @Override // java.lang.Runnable
                public final void run() {
                    u.this.c0();
                }
            });
        } else {
            if (this.f3393p && this.f3381d.k()) {
                z2 = true;
            }
            U(z2);
        }
    }

    public void m0() {
        R();
    }

    public void s0(boolean z2) {
        this.f3398u = z2;
    }

    public MotionEvent v0(float f2, l.f fVar, boolean z2) {
        MotionEvent b3 = this.f3397t.b(c0.a.c(fVar.f4638p));
        if (!z2 && b3 != null) {
            return b3;
        }
        return MotionEvent.obtain(fVar.f4624b.longValue(), fVar.f4625c.longValue(), fVar.f4626d, fVar.f4627e, (MotionEvent.PointerProperties[]) q0(fVar.f4628f).toArray(new MotionEvent.PointerProperties[fVar.f4627e]), (MotionEvent.PointerCoords[]) o0(fVar.f4629g, f2).toArray(new MotionEvent.PointerCoords[fVar.f4627e]), fVar.f4630h, fVar.f4631i, fVar.f4632j, fVar.f4633k, fVar.f4634l, fVar.f4635m, fVar.f4636n, fVar.f4637o);
    }
}
