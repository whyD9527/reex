package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class o1 extends Resources {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f823b = false;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f824a;

    public o1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f824a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f823b;
    }

    public static boolean b() {
        a();
        return false;
    }

    final Drawable c(int i2) {
        return super.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Context context = this.f824a.get();
        return context != null ? y0.h().t(context, this, i2) : super.getDrawable(i2);
    }
}
