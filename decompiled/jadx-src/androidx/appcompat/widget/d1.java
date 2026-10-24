package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f664a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f665b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f666c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f667d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f668e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f669f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f670g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f671h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f672i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f673j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.j.f2366z0);
        try {
            if (!obtainStyledAttributes.hasValue(b.j.E0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList e3 = e(context, i2);
        if (e3 != null && e3.isStateful()) {
            return e3.getColorForState(f665b, e3.getDefaultColor());
        }
        TypedValue f2 = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, f2, true);
        return d(context, i2, f2.getFloat());
    }

    public static int c(Context context, int i2) {
        int[] iArr = f673j;
        iArr[0] = i2;
        i1 t2 = i1.t(context, null, iArr);
        try {
            return t2.b(0, 0);
        } finally {
            t2.v();
        }
    }

    static int d(Context context, int i2, float f2) {
        return androidx.core.graphics.a.f(c(context, i2), Math.round(Color.alpha(r0) * f2));
    }

    public static ColorStateList e(Context context, int i2) {
        int[] iArr = f673j;
        iArr[0] = i2;
        i1 t2 = i1.t(context, null, iArr);
        try {
            return t2.c(0);
        } finally {
            t2.v();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f664a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
