package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class e extends j {

    /* renamed from: b, reason: collision with root package name */
    private static Class<?> f1440b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Constructor<?> f1441c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f1442d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f1443e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f1444f = false;

    e() {
    }

    private static boolean h(Object obj, String str, int i2, boolean z2) {
        k();
        try {
            return ((Boolean) f1442d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static Typeface i(Object obj) {
        k();
        try {
            Object newInstance = Array.newInstance(f1440b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1443e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1444f) {
            return;
        }
        f1444f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f1441c = constructor;
        f1440b = cls;
        f1442d = method2;
        f1443e = method;
    }

    private static Object l() {
        k();
        try {
            return f1441c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // androidx.core.graphics.j
    public Typeface a(Context context, e.c cVar, Resources resources, int i2) {
        Object l2 = l();
        for (e.d dVar : cVar.a()) {
            File e3 = k.e(context);
            if (e3 == null) {
                return null;
            }
            try {
                if (!k.c(e3, resources, dVar.b())) {
                    return null;
                }
                if (!h(l2, e3.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e3.delete();
            }
        }
        return i(l2);
    }

    @Override // androidx.core.graphics.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i2) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File j2 = j(openFileDescriptor);
                if (j2 != null && j2.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(j2);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface c3 = super.c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c3;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
