package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.l;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class b extends f implements Animatable {

    /* renamed from: f, reason: collision with root package name */
    private C0031b f2041f;

    /* renamed from: g, reason: collision with root package name */
    private Context f2042g;

    /* renamed from: h, reason: collision with root package name */
    private ArgbEvaluator f2043h;

    /* renamed from: i, reason: collision with root package name */
    private Animator.AnimatorListener f2044i;

    /* renamed from: j, reason: collision with root package name */
    ArrayList<Object> f2045j;

    /* renamed from: k, reason: collision with root package name */
    final Drawable.Callback f2046k;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            b.this.scheduleSelf(runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$b, reason: collision with other inner class name */
    private static class C0031b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f2048a;

        /* renamed from: b, reason: collision with root package name */
        g f2049b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f2050c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f2051d;

        /* renamed from: e, reason: collision with root package name */
        l.a<Animator, String> f2052e;

        public C0031b(Context context, C0031b c0031b, Drawable.Callback callback, Resources resources) {
            if (c0031b != null) {
                this.f2048a = c0031b.f2048a;
                g gVar = c0031b.f2049b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    this.f2049b = (g) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    g gVar2 = (g) this.f2049b.mutate();
                    this.f2049b = gVar2;
                    gVar2.setCallback(callback);
                    this.f2049b.setBounds(c0031b.f2049b.getBounds());
                    this.f2049b.h(false);
                }
                ArrayList<Animator> arrayList = c0031b.f2051d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f2051d = new ArrayList<>(size);
                    this.f2052e = new l.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = c0031b.f2051d.get(i2);
                        Animator clone = animator.clone();
                        String str = c0031b.f2052e.get(animator);
                        clone.setTarget(this.f2049b.d(str));
                        this.f2051d.add(clone);
                        this.f2052e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f2050c == null) {
                this.f2050c = new AnimatorSet();
            }
            this.f2050c.playTogether(this.f2051d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2048a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f2053a;

        public c(Drawable.ConstantState constantState) {
            this.f2053a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2053a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2053a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f2053a.newDrawable();
            bVar.f2056e = newDrawable;
            newDrawable.setCallback(bVar.f2046k);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f2053a.newDrawable(resources);
            bVar.f2056e = newDrawable;
            newDrawable.setCallback(bVar.f2046k);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f2053a.newDrawable(resources, theme);
            bVar.f2056e = newDrawable;
            newDrawable.setCallback(bVar.f2046k);
            return bVar;
        }
    }

    b() {
        this(null, null, null);
    }

    private b(Context context) {
        this(context, null, null);
    }

    private b(Context context, C0031b c0031b, Resources resources) {
        this.f2043h = null;
        this.f2044i = null;
        this.f2045j = null;
        a aVar = new a();
        this.f2046k = aVar;
        this.f2042g = context;
        if (c0031b != null) {
            this.f2041f = c0031b;
        } else {
            this.f2041f = new C0031b(context, c0031b, aVar, resources);
        }
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f2041f.f2049b.d(str));
        C0031b c0031b = this.f2041f;
        if (c0031b.f2051d == null) {
            c0031b.f2051d = new ArrayList<>();
            this.f2041f.f2052e = new l.a<>();
        }
        this.f2041f.f2051d.add(animator);
        this.f2041f.f2052e.put(animator, str);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f2041f.f2049b.draw(canvas);
        if (this.f2041f.f2050c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2056e;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2041f.f2049b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2056e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2041f.f2048a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2056e;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2041f.f2049b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2056e == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f2056e.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2056e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2041f.f2049b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2056e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2041f.f2049b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2056e;
        return drawable != null ? drawable.getOpacity() : this.f2041f.f2049b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = l.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2033e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g b3 = g.b(resources, resourceId, theme);
                        b3.h(false);
                        b3.setCallback(this.f2046k);
                        g gVar = this.f2041f.f2049b;
                        if (gVar != null) {
                            gVar.setCallback(null);
                        }
                        this.f2041f.f2049b = b3;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f2034f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2042g;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, d.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f2041f.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2056e;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f2041f.f2049b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f2056e;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2041f.f2050c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f2056e;
        return drawable != null ? drawable.isStateful() : this.f2041f.f2049b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2041f.f2049b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f2056e;
        return drawable != null ? drawable.setLevel(i2) : this.f2041f.f2049b.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2056e;
        return drawable != null ? drawable.setState(iArr) : this.f2041f.f2049b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f2041f.f2049b.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z2);
        } else {
            this.f2041f.f2049b.setAutoMirrored(z2);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2041f.f2049b.setColorFilter(colorFilter);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z2) {
        super.setFilterBitmap(z2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i2);
        } else {
            this.f2041f.f2049b.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
        } else {
            this.f2041f.f2049b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
        } else {
            this.f2041f.f2049b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f2041f.f2049b.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f2041f.f2050c.isStarted()) {
                return;
            }
            this.f2041f.f2050c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f2056e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2041f.f2050c.end();
        }
    }
}
