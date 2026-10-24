package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class<?> f1263a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f1264b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f1265c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f1266d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f1267e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f1268f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f1269g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f1270e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f1271f;

        a(d dVar, Object obj) {
            this.f1270e = dVar;
            this.f1271f = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1270e.f1276a = this.f1271f;
        }
    }

    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Application f1272e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f1273f;

        b(Application application, d dVar) {
            this.f1272e = application;
            this.f1273f = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1272e.unregisterActivityLifecycleCallbacks(this.f1273f);
        }
    }

    /* renamed from: androidx.core.app.c$c, reason: collision with other inner class name */
    class RunnableC0018c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f1274e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f1275f;

        RunnableC0018c(Object obj, Object obj2) {
            this.f1274e = obj;
            this.f1275f = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = c.f1266d;
                if (method != null) {
                    method.invoke(this.f1274e, this.f1275f, Boolean.FALSE, "AppCompat recreation");
                } else {
                    c.f1267e.invoke(this.f1274e, this.f1275f, Boolean.FALSE);
                }
            } catch (RuntimeException e3) {
                if (e3.getClass() == RuntimeException.class && e3.getMessage() != null && e3.getMessage().startsWith("Unable to stop")) {
                    throw e3;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        Object f1276a;

        /* renamed from: b, reason: collision with root package name */
        private Activity f1277b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1278c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1279d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f1280e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f1281f = false;

        d(Activity activity) {
            this.f1277b = activity;
            this.f1278c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1277b == activity) {
                this.f1277b = null;
                this.f1280e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f1280e || this.f1281f || this.f1279d || !c.h(this.f1276a, this.f1278c, activity)) {
                return;
            }
            this.f1281f = true;
            this.f1276a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1277b == activity) {
                this.f1279d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a3 = a();
        f1263a = a3;
        f1264b = b();
        f1265c = f();
        f1266d = d(a3);
        f1267e = c(a3);
        f1268f = e(a3);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    protected static boolean h(Object obj, int i2, Activity activity) {
        try {
            Object obj2 = f1265c.get(activity);
            if (obj2 == obj && activity.hashCode() == i2) {
                f1269g.postAtFrontOfQueue(new RunnableC0018c(f1264b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f1268f == null) {
            return false;
        }
        if (f1267e == null && f1266d == null) {
            return false;
        }
        try {
            Object obj2 = f1265c.get(activity);
            if (obj2 == null || (obj = f1264b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f1269g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f1268f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f1269g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
