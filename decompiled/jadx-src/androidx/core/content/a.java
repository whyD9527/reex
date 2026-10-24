package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.h0;
import java.io.File;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f1363a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f1364b = new Object();

    /* renamed from: androidx.core.content.a$a, reason: collision with other inner class name */
    static class C0020a {
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    static class b {
        static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    static class c {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int i2) {
            return context.getDrawable(i2);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    static class d {
        static int a(Context context, int i2) {
            return context.getColor(i2);
        }

        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    static class e {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
            Intent registerReceiver;
            if ((i2 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, a.h(context), handler);
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i2 & 1);
            return registerReceiver;
        }

        static ComponentName b(Context context, Intent intent) {
            ComponentName startForegroundService;
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
    }

    static class f {
        static Executor a(Context context) {
            Executor mainExecutor;
            mainExecutor = context.getMainExecutor();
            return mainExecutor;
        }
    }

    static class g {
        static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
            Intent registerReceiver;
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i2);
            return registerReceiver;
        }
    }

    public static int a(Context context, String str) {
        androidx.core.util.d.d(str, "permission must be non-null");
        return (u.a.c() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : h0.b(context).a() ? 0 : -1;
    }

    public static int b(Context context, int i2) {
        return d.a(context, i2);
    }

    public static Drawable c(Context context, int i2) {
        return c.b(context, i2);
    }

    public static File[] d(Context context) {
        return b.a(context);
    }

    public static File[] e(Context context, String str) {
        return b.b(context, str);
    }

    public static Executor f(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? f.a(context) : u.b.a(new Handler(context.getMainLooper()));
    }

    public static <T> T g(Context context, Class<T> cls) {
        return (T) d.b(context, cls);
    }

    static String h(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (androidx.core.content.e.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent i(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
        return j(context, broadcastReceiver, intentFilter, null, null, i2);
    }

    public static Intent j(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        int i3 = i2 & 1;
        if (i3 != 0 && (i2 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i3 != 0) {
            i2 |= 2;
        }
        int i4 = i2;
        int i5 = i4 & 2;
        if (i5 == 0 && (i4 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i5 == 0 || (i4 & 4) == 0) {
            return u.a.c() ? g.a(context, broadcastReceiver, intentFilter, str, handler, i4) : Build.VERSION.SDK_INT >= 26 ? e.a(context, broadcastReceiver, intentFilter, str, handler, i4) : ((i4 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, h(context), handler);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    public static boolean k(Context context, Intent[] intentArr, Bundle bundle) {
        C0020a.a(context, intentArr, bundle);
        return true;
    }

    public static void l(Context context, Intent intent, Bundle bundle) {
        C0020a.b(context, intent, bundle);
    }
}
