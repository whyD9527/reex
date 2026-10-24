package e;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.y0;
import androidx.core.content.res.l;
import e.b;
import e.d;
import l.h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class a extends e.d {

    /* renamed from: x, reason: collision with root package name */
    private static final String f2572x = a.class.getSimpleName();

    /* renamed from: s, reason: collision with root package name */
    private c f2573s;

    /* renamed from: t, reason: collision with root package name */
    private g f2574t;

    /* renamed from: u, reason: collision with root package name */
    private int f2575u;

    /* renamed from: v, reason: collision with root package name */
    private int f2576v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f2577w;

    private static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        private final Animatable f2578a;

        b(Animatable animatable) {
            super();
            this.f2578a = animatable;
        }

        @Override // e.a.g
        public void c() {
            this.f2578a.start();
        }

        @Override // e.a.g
        public void d() {
            this.f2578a.stop();
        }
    }

    static class c extends d.a {
        l.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            h<Integer> hVar;
            if (cVar != null) {
                this.K = cVar.K;
                hVar = cVar.L;
            } else {
                this.K = new l.d<>();
                hVar = new h<>();
            }
            this.L = hVar;
        }

        private static long D(int i2, int i3) {
            return i3 | (i2 << 32);
        }

        int B(int[] iArr, Drawable drawable, int i2) {
            int z2 = super.z(iArr, drawable);
            this.L.h(z2, Integer.valueOf(i2));
            return z2;
        }

        int C(int i2, int i3, Drawable drawable, boolean z2) {
            int a3 = super.a(drawable);
            long D = D(i2, i3);
            long j2 = z2 ? 8589934592L : 0L;
            long j3 = a3;
            this.K.a(D, Long.valueOf(j3 | j2));
            if (z2) {
                this.K.a(D(i3, i2), Long.valueOf(4294967296L | j3 | j2));
            }
            return a3;
        }

        int E(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.L.f(i2, 0).intValue();
        }

        int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        int G(int i2, int i3) {
            return (int) this.K.f(D(i2, i3), -1L).longValue();
        }

        boolean H(int i2, int i3) {
            return (this.K.f(D(i2, i3), -1L).longValue() & 4294967296L) != 0;
        }

        boolean I(int i2, int i3) {
            return (this.K.f(D(i2, i3), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // e.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // e.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        @Override // e.d.a, e.b.c
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    private static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.b f2579a;

        d(androidx.vectordrawable.graphics.drawable.b bVar) {
            super();
            this.f2579a = bVar;
        }

        @Override // e.a.g
        public void c() {
            this.f2579a.start();
        }

        @Override // e.a.g
        public void d() {
            this.f2579a.stop();
        }
    }

    private static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f2580a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2581b;

        e(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z2 ? numberOfFrames - 1 : 0;
            int i3 = z2 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z2);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f2581b = z3;
            this.f2580a = ofInt;
        }

        @Override // e.a.g
        public boolean a() {
            return this.f2581b;
        }

        @Override // e.a.g
        public void b() {
            this.f2580a.reverse();
        }

        @Override // e.a.g
        public void c() {
            this.f2580a.start();
        }

        @Override // e.a.g
        public void d() {
            this.f2580a.cancel();
        }
    }

    private static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        private int[] f2582a;

        /* renamed from: b, reason: collision with root package name */
        private int f2583b;

        /* renamed from: c, reason: collision with root package name */
        private int f2584c;

        f(AnimationDrawable animationDrawable, boolean z2) {
            b(animationDrawable, z2);
        }

        int a() {
            return this.f2584c;
        }

        int b(AnimationDrawable animationDrawable, boolean z2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f2583b = numberOfFrames;
            int[] iArr = this.f2582a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f2582a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f2582a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z2 ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f2584c = i2;
            return i2;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * this.f2584c) + 0.5f);
            int i3 = this.f2583b;
            int[] iArr = this.f2582a;
            int i4 = 0;
            while (i4 < i3) {
                int i5 = iArr[i4];
                if (i2 < i5) {
                    break;
                }
                i2 -= i5;
                i4++;
            }
            return (i4 / i3) + (i4 < i3 ? i2 / this.f2584c : 0.0f);
        }
    }

    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(c cVar, Resources resources) {
        super(null);
        this.f2575u = -1;
        this.f2576v = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k2 = l.k(resources, theme, attributeSet, f.b.f2774h);
        int resourceId = k2.getResourceId(f.b.f2775i, 0);
        int resourceId2 = k2.getResourceId(f.b.f2776j, -1);
        Drawable j2 = resourceId2 > 0 ? y0.h().j(context, resourceId2) : null;
        k2.recycle();
        int[] k3 = k(attributeSet);
        if (j2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j2 = xmlPullParser.getName().equals("vector") ? androidx.vectordrawable.graphics.drawable.g.c(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (j2 != null) {
            return this.f2573s.B(k3, j2, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k2 = l.k(resources, theme, attributeSet, f.b.f2777k);
        int resourceId = k2.getResourceId(f.b.f2780n, -1);
        int resourceId2 = k2.getResourceId(f.b.f2779m, -1);
        int resourceId3 = k2.getResourceId(f.b.f2778l, -1);
        Drawable j2 = resourceId3 > 0 ? y0.h().j(context, resourceId3) : null;
        boolean z2 = k2.getBoolean(f.b.f2781o, false);
        k2.recycle();
        if (j2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j2 = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.b.a(context, resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (j2 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f2573s.C(resourceId, resourceId2, j2, z2);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    private boolean s(int i2) {
        int c3;
        int G;
        g bVar;
        g gVar = this.f2574t;
        if (gVar == null) {
            c3 = c();
        } else {
            if (i2 == this.f2575u) {
                return true;
            }
            if (i2 == this.f2576v && gVar.a()) {
                gVar.b();
                this.f2575u = this.f2576v;
                this.f2576v = i2;
                return true;
            }
            c3 = this.f2575u;
            gVar.d();
        }
        this.f2574t = null;
        this.f2576v = -1;
        this.f2575u = -1;
        c cVar = this.f2573s;
        int E = cVar.E(c3);
        int E2 = cVar.E(i2);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.b)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((androidx.vectordrawable.graphics.drawable.b) current);
        }
        bVar.c();
        this.f2574t = bVar;
        this.f2576v = c3;
        this.f2575u = i2;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.f2573s;
        cVar.f2602d |= typedArray.getChangingConfigurations();
        cVar.x(typedArray.getBoolean(f.b.f2770d, cVar.f2607i));
        cVar.t(typedArray.getBoolean(f.b.f2771e, cVar.f2610l));
        cVar.u(typedArray.getInt(f.b.f2772f, cVar.A));
        cVar.v(typedArray.getInt(f.b.f2773g, cVar.B));
        setDither(typedArray.getBoolean(f.b.f2768b, cVar.f2622x));
    }

    @Override // e.d, e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // e.d, e.b
    void h(b.c cVar) {
        super.h(cVar);
        if (cVar instanceof c) {
            this.f2573s = (c) cVar;
        }
    }

    @Override // e.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // e.d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f2574t;
        if (gVar != null) {
            gVar.d();
            this.f2574t = null;
            g(this.f2575u);
            this.f2575u = -1;
            this.f2576v = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // e.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.f2573s, this, null);
    }

    @Override // e.d, e.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2577w && super.mutate() == this) {
            this.f2573s.r();
            this.f2577w = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k2 = l.k(resources, theme, attributeSet, f.b.f2767a);
        setVisible(k2.getBoolean(f.b.f2769c, true), true);
        t(k2);
        i(resources);
        k2.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i2) {
        return super.onLayoutDirectionChanged(i2);
    }

    @Override // e.d, e.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int F = this.f2573s.F(iArr);
        boolean z2 = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z2 | current.setState(iArr) : z2;
    }

    @Override // e.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        super.scheduleDrawable(drawable, runnable, j2);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i2) {
        super.setAlpha(i2);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z2) {
        super.setAutoMirrored(z2);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z2) {
        super.setDither(z2);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        g gVar = this.f2574t;
        if (gVar != null && (visible || z3)) {
            if (z2) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // e.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
