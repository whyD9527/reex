package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.e;
import androidx.core.content.res.h;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1395a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Object, SparseArray<Object>> f1396b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1397c = new Object();

    static class a {
        static Drawable a(Resources resources, int i2, Resources.Theme theme) {
            return resources.getDrawable(i2, theme);
        }

        static Drawable b(Resources resources, int i2, int i3, Resources.Theme theme) {
            return resources.getDrawableForDensity(i2, i3, theme);
        }
    }

    public static abstract class b {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i2, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.f(i2);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.this.g(typeface);
                }
            });
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i2);

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(Typeface typeface);
    }

    public static final class c {

        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f1398a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f1399b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f1400c;

            @SuppressLint({"BanUncheckedReflection"})
            static void a(Resources.Theme theme) {
                synchronized (f1398a) {
                    if (!f1400c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f1399b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e3) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e3);
                        }
                        f1400c = true;
                    }
                    Method method = f1399b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e4) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e4);
                            f1399b = null;
                        }
                    }
                }
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    public static Drawable a(Resources resources, int i2, Resources.Theme theme) {
        return a.a(resources, i2, theme);
    }

    public static Typeface b(Context context, int i2, TypedValue typedValue, int i3, b bVar) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i2, typedValue, i3, bVar, null, true, false);
    }

    private static Typeface c(Context context, int i2, TypedValue typedValue, int i3, b bVar, Handler handler, boolean z2, boolean z3) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface d3 = d(context, resources, typedValue, i2, i3, bVar, handler, z2, z3);
        if (d3 != null || bVar != null || z3) {
            return d3;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface d(Context context, Resources resources, TypedValue typedValue, int i2, int i3, b bVar, Handler handler, boolean z2, boolean z3) {
        StringBuilder sb;
        String str;
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i2) + "\" (" + Integer.toHexString(i2) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        if (!charSequence2.startsWith("res/")) {
            if (bVar != null) {
                bVar.c(-3, handler);
            }
            return null;
        }
        Typeface f2 = androidx.core.graphics.d.f(resources, i2, charSequence2, typedValue.assetCookie, i3);
        if (f2 != null) {
            if (bVar != null) {
                bVar.d(f2, handler);
            }
            return f2;
        }
        if (z3) {
            return null;
        }
        try {
            if (!charSequence2.toLowerCase().endsWith(".xml")) {
                Typeface d3 = androidx.core.graphics.d.d(context, resources, i2, charSequence2, typedValue.assetCookie, i3);
                if (bVar != null) {
                    if (d3 != null) {
                        bVar.d(d3, handler);
                    } else {
                        bVar.c(-3, handler);
                    }
                }
                return d3;
            }
            e.b b3 = e.b(resources.getXml(i2), resources);
            if (b3 != null) {
                return androidx.core.graphics.d.c(context, b3, resources, i2, charSequence2, typedValue.assetCookie, i3, bVar, handler, z2);
            }
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (bVar != null) {
                bVar.c(-3, handler);
            }
            return null;
        } catch (IOException e3) {
            e = e3;
            sb = new StringBuilder();
            str = "Failed to read xml resource ";
            sb.append(str);
            sb.append(charSequence2);
            Log.e("ResourcesCompat", sb.toString(), e);
            if (bVar != null) {
                bVar.c(-3, handler);
            }
            return null;
        } catch (XmlPullParserException e4) {
            e = e4;
            sb = new StringBuilder();
            str = "Failed to parse xml resource ";
            sb.append(str);
            sb.append(charSequence2);
            Log.e("ResourcesCompat", sb.toString(), e);
            if (bVar != null) {
            }
            return null;
        }
    }
}
