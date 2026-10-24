package d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.y0;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f2540a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<Object>> f2541b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f2542c = new Object();

    public static ColorStateList a(Context context, int i2) {
        return context.getColorStateList(i2);
    }

    public static Drawable b(Context context, int i2) {
        return y0.h().j(context, i2);
    }
}
