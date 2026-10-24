package c;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private static Field f2477a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f2478b;

    /* renamed from: c, reason: collision with root package name */
    private static Class<?> f2479c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f2480d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f2481e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f2482f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f2483g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f2484h;

    static void a(Resources resources) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return;
        }
        if (i2 >= 24) {
            c(resources);
        } else {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        if (!f2478b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2477a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e3);
            }
            f2478b = true;
        }
        Object obj = null;
        Field field = f2477a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e4);
            }
        }
        if (obj == null) {
            return;
        }
        d(obj);
    }

    private static void c(Resources resources) {
        Object obj;
        if (!f2484h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f2483g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e3);
            }
            f2484h = true;
        }
        Field field = f2483g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e4);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f2478b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f2477a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e5);
            }
            f2478b = true;
        }
        Field field2 = f2477a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e6) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e6);
            }
        }
        if (obj2 != null) {
            d(obj2);
        }
    }

    private static void d(Object obj) {
        if (!f2480d) {
            try {
                f2479c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e3) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e3);
            }
            f2480d = true;
        }
        Class<?> cls = f2479c;
        if (cls == null) {
            return;
        }
        if (!f2482f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f2481e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e4);
            }
            f2482f = true;
        }
        Field field = f2481e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e5) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e5);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
