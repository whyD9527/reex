package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: i, reason: collision with root package name */
    private static y0 f933i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, l.h<ColorStateList>> f935a;

    /* renamed from: b, reason: collision with root package name */
    private l.g<String, d> f936b;

    /* renamed from: c, reason: collision with root package name */
    private l.h<String> f937c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, l.d<WeakReference<Drawable.ConstantState>>> f938d = new WeakHashMap<>(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f939e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f940f;

    /* renamed from: g, reason: collision with root package name */
    private e f941g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f932h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final c f934j = new c(6);

    static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.y0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e3) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e3);
                return null;
            }
        }
    }

    private static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.y0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e3) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e3);
                return null;
            }
        }
    }

    private static class c extends l.e<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }

        private static int h(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter i(int i2, PorterDuff.Mode mode) {
            return c(Integer.valueOf(h(i2, mode)));
        }

        PorterDuffColorFilter j(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(h(i2, mode)), porterDuffColorFilter);
        }
    }

    private interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    interface e {
        boolean a(Context context, int i2, Drawable drawable);

        PorterDuff.Mode b(int i2);

        Drawable c(y0 y0Var, Context context, int i2);

        ColorStateList d(Context context, int i2);

        boolean e(Context context, int i2, Drawable drawable);
    }

    private static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.y0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.g.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e3) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e3);
                return null;
            }
        }
    }

    private void a(String str, d dVar) {
        if (this.f936b == null) {
            this.f936b = new l.g<>();
        }
        this.f936b.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        boolean z2;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            l.d<WeakReference<Drawable.ConstantState>> dVar = this.f938d.get(context);
            if (dVar == null) {
                dVar = new l.d<>();
                this.f938d.put(context, dVar);
            }
            dVar.h(j2, new WeakReference<>(constantState));
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    private void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.f935a == null) {
            this.f935a = new WeakHashMap<>();
        }
        l.h<ColorStateList> hVar = this.f935a.get(context);
        if (hVar == null) {
            hVar = new l.h<>();
            this.f935a.put(context, hVar);
        }
        hVar.a(i2, colorStateList);
    }

    private void d(Context context) {
        if (this.f940f) {
            return;
        }
        this.f940f = true;
        Drawable j2 = j(context, f.a.f2766a);
        if (j2 == null || !q(j2)) {
            this.f940f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i2) {
        if (this.f939e == null) {
            this.f939e = new TypedValue();
        }
        TypedValue typedValue = this.f939e;
        context.getResources().getValue(i2, typedValue, true);
        long e3 = e(typedValue);
        Drawable i3 = i(context, e3);
        if (i3 != null) {
            return i3;
        }
        e eVar = this.f941g;
        Drawable c3 = eVar == null ? null : eVar.c(this, context, i2);
        if (c3 != null) {
            c3.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e3, c3);
        }
        return c3;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized y0 h() {
        y0 y0Var;
        synchronized (y0.class) {
            if (f933i == null) {
                y0 y0Var2 = new y0();
                f933i = y0Var2;
                p(y0Var2);
            }
            y0Var = f933i;
        }
        return y0Var;
    }

    private synchronized Drawable i(Context context, long j2) {
        l.d<WeakReference<Drawable.ConstantState>> dVar = this.f938d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> e3 = dVar.e(j2);
        if (e3 != null) {
            Drawable.ConstantState constantState = e3.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.i(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter i3;
        synchronized (y0.class) {
            c cVar = f934j;
            i3 = cVar.i(i2, mode);
            if (i3 == null) {
                i3 = new PorterDuffColorFilter(i2, mode);
                cVar.j(i2, mode, i3);
            }
        }
        return i3;
    }

    private ColorStateList n(Context context, int i2) {
        l.h<ColorStateList> hVar;
        WeakHashMap<Context, l.h<ColorStateList>> weakHashMap = this.f935a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.e(i2);
    }

    private static void p(y0 y0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            y0Var.a("vector", new f());
            y0Var.a("animated-vector", new b());
            y0Var.a("animated-selector", new a());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i2) {
        int next;
        l.g<String, d> gVar = this.f936b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        l.h<String> hVar = this.f937c;
        if (hVar != null) {
            String e3 = hVar.e(i2);
            if ("appcompat_skip_skip".equals(e3) || (e3 != null && this.f936b.get(e3) == null)) {
                return null;
            }
        } else {
            this.f937c = new l.h<>();
        }
        if (this.f939e == null) {
            this.f939e = new TypedValue();
        }
        TypedValue typedValue = this.f939e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long e4 = e(typedValue);
        Drawable i3 = i(context, e4);
        if (i3 != null) {
            return i3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f937c.a(i2, name);
                d dVar = this.f936b.get(name);
                if (dVar != null) {
                    i3 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i3 != null) {
                    i3.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e4, i3);
                }
            } catch (Exception e5) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e5);
            }
        }
        if (i3 == null) {
            this.f937c.a(i2, "appcompat_skip_skip");
        }
        return i3;
    }

    private Drawable v(Context context, int i2, boolean z2, Drawable drawable) {
        ColorStateList m2 = m(context, i2);
        if (m2 == null) {
            e eVar = this.f941g;
            if ((eVar == null || !eVar.e(context, i2, drawable)) && !x(context, i2, drawable) && z2) {
                return null;
            }
            return drawable;
        }
        if (m0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable p2 = androidx.core.graphics.drawable.a.p(drawable);
        androidx.core.graphics.drawable.a.n(p2, m2);
        PorterDuff.Mode o2 = o(i2);
        if (o2 == null) {
            return p2;
        }
        androidx.core.graphics.drawable.a.o(p2, o2);
        return p2;
    }

    static void w(Drawable drawable, g1 g1Var, int[] iArr) {
        if (m0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = g1Var.f727d;
        if (z2 || g1Var.f726c) {
            drawable.setColorFilter(g(z2 ? g1Var.f724a : null, g1Var.f726c ? g1Var.f725b : f932h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    synchronized Drawable k(Context context, int i2, boolean z2) {
        Drawable r2;
        d(context);
        r2 = r(context, i2);
        if (r2 == null) {
            r2 = f(context, i2);
        }
        if (r2 == null) {
            r2 = androidx.core.content.a.c(context, i2);
        }
        if (r2 != null) {
            r2 = v(context, i2, z2, r2);
        }
        if (r2 != null) {
            m0.b(r2);
        }
        return r2;
    }

    synchronized ColorStateList m(Context context, int i2) {
        ColorStateList n2;
        n2 = n(context, i2);
        if (n2 == null) {
            e eVar = this.f941g;
            n2 = eVar == null ? null : eVar.d(context, i2);
            if (n2 != null) {
                c(context, i2, n2);
            }
        }
        return n2;
    }

    PorterDuff.Mode o(int i2) {
        e eVar = this.f941g;
        if (eVar == null) {
            return null;
        }
        return eVar.b(i2);
    }

    public synchronized void s(Context context) {
        l.d<WeakReference<Drawable.ConstantState>> dVar = this.f938d.get(context);
        if (dVar != null) {
            dVar.b();
        }
    }

    synchronized Drawable t(Context context, o1 o1Var, int i2) {
        Drawable r2 = r(context, i2);
        if (r2 == null) {
            r2 = o1Var.c(i2);
        }
        if (r2 == null) {
            return null;
        }
        return v(context, i2, false, r2);
    }

    public synchronized void u(e eVar) {
        this.f941g = eVar;
    }

    boolean x(Context context, int i2, Drawable drawable) {
        e eVar = this.f941g;
        return eVar != null && eVar.a(context, i2, drawable);
    }
}
