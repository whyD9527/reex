package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class h1 extends z0 {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f730b;

    public h1(Context context, Resources resources) {
        super(resources);
        this.f730b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.z0, android.content.res.Resources
    public Drawable getDrawable(int i2) {
        Drawable drawable = super.getDrawable(i2);
        Context context = this.f730b.get();
        if (drawable != null && context != null) {
            y0.h().x(context, i2, drawable);
        }
        return drawable;
    }
}
