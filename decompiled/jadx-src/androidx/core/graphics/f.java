package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
class f extends j {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f1445b;

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor<?> f1446c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f1447d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f1448e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi24Impl", e3.getClass().getName(), e3);
            cls = null;
            method = null;
            method2 = null;
        }
        f1446c = constructor;
        f1445b = cls;
        f1447d = method2;
        f1448e = method;
    }

    f() {
    }

    private static boolean h(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f1447d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f1445b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1448e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean j() {
        Method method = f1447d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object k() {
        try {
            return f1446c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.j
    public Typeface a(Context context, e.c cVar, Resources resources, int i2) {
        Object k2 = k();
        if (k2 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            ByteBuffer b3 = k.b(context, resources, dVar.b());
            if (b3 == null || !h(k2, b3, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return i(k2);
    }

    @Override // androidx.core.graphics.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i2) {
        Object k2 = k();
        if (k2 == null) {
            return null;
        }
        l.g gVar = new l.g();
        for (g.b bVar : bVarArr) {
            Uri d3 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d3);
            if (byteBuffer == null) {
                byteBuffer = k.f(context, cancellationSignal, d3);
                gVar.put(d3, byteBuffer);
            }
            if (byteBuffer == null || !h(k2, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface i3 = i(k2);
        if (i3 == null) {
            return null;
        }
        return Typeface.create(i3, i2);
    }
}
