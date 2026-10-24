package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: g, reason: collision with root package name */
    protected final Class<?> f1449g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor<?> f1450h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f1451i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f1452j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f1453k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f1454l;

    /* renamed from: m, reason: collision with root package name */
    protected final Method f1455m;

    public g() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> v2 = v();
            constructor = w(v2);
            method2 = s(v2);
            method3 = t(v2);
            method4 = x(v2);
            method5 = r(v2);
            method = u(v2);
            cls = v2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e3.getClass().getName(), e3);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f1449g = cls;
        this.f1450h = constructor;
        this.f1451i = method2;
        this.f1452j = method3;
        this.f1453k = method4;
        this.f1454l = method5;
        this.f1455m = method;
    }

    private Object l() {
        try {
            return this.f1450h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) {
        try {
            this.f1454l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1451i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f1452j.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.f1453k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f1451i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1451i != null;
    }

    @Override // androidx.core.graphics.e, androidx.core.graphics.j
    public Typeface a(Context context, e.c cVar, Resources resources, int i2) {
        if (!q()) {
            return super.a(context, cVar, resources, i2);
        }
        Object l2 = l();
        if (l2 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!n(context, l2, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                m(l2);
                return null;
            }
        }
        if (p(l2)) {
            return i(l2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [android.graphics.Typeface$Builder] */
    @Override // androidx.core.graphics.e, androidx.core.graphics.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i2) {
        Typeface i3;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!q()) {
            g.b g2 = g(bVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g2.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    final FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                    Typeface build = new Object(fileDescriptor) { // from class: android.graphics.Typeface$Builder
                        static {
                            throw new NoClassDefFoundError();
                        }

                        public native /* synthetic */ Typeface build();

                        public native /* synthetic */ Typeface$Builder setItalic(boolean z2);

                        public native /* synthetic */ Typeface$Builder setWeight(int i4);
                    }.setWeight(g2.e()).setItalic(g2.f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> h2 = k.h(context, bVarArr, cancellationSignal);
        Object l2 = l();
        if (l2 == null) {
            return null;
        }
        boolean z2 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = h2.get(bVar.d());
            if (byteBuffer != null) {
                if (!o(l2, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    m(l2);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            m(l2);
            return null;
        }
        if (p(l2) && (i3 = i(l2)) != null) {
            return Typeface.create(i3, i2);
        }
        return null;
    }

    @Override // androidx.core.graphics.j
    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        if (!q()) {
            return super.d(context, resources, i2, str, i3);
        }
        Object l2 = l();
        if (l2 == null) {
            return null;
        }
        if (!n(context, l2, str, 0, -1, -1, null)) {
            m(l2);
            return null;
        }
        if (p(l2)) {
            return i(l2);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1449g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1455m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method r(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method s(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method t(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method u(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> v() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> w(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    protected Method x(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
