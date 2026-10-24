package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public class b extends androidx.core.content.a {

    /* renamed from: c, reason: collision with root package name */
    private static InterfaceC0017b f1262c;

    static class a {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i2, Bundle bundle) {
            activity.startActivityForResult(intent, i2, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        }
    }

    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    public interface InterfaceC0017b {
        boolean a(Activity activity, int i2, int i3, Intent intent);
    }

    public static void n(Activity activity) {
        a.a(activity);
    }

    public static InterfaceC0017b o() {
        return f1262c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Activity activity) {
        if (activity.isFinishing() || c.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void q(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.p(activity);
                }
            });
        }
    }
}
