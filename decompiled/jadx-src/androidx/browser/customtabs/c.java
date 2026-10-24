package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import androidx.core.app.f;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f953a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f954b;

    private static class a {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private ArrayList<Bundle> f957c;

        /* renamed from: d, reason: collision with root package name */
        private Bundle f958d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList<Bundle> f959e;

        /* renamed from: f, reason: collision with root package name */
        private SparseArray<Bundle> f960f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f961g;

        /* renamed from: a, reason: collision with root package name */
        private final Intent f955a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        private final a.C0014a f956b = new a.C0014a();

        /* renamed from: h, reason: collision with root package name */
        private int f962h = 0;

        /* renamed from: i, reason: collision with root package name */
        private boolean f963i = true;

        private void b() {
            String a3 = a.a();
            if (TextUtils.isEmpty(a3)) {
                return;
            }
            Bundle bundleExtra = this.f955a.hasExtra("com.android.browser.headers") ? this.f955a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a3);
            this.f955a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            f.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f955a.putExtras(bundle);
        }

        public c a() {
            if (!this.f955a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<Bundle> arrayList = this.f957c;
            if (arrayList != null) {
                this.f955a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f959e;
            if (arrayList2 != null) {
                this.f955a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f955a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f963i);
            this.f955a.putExtras(this.f956b.a().a());
            Bundle bundle = this.f961g;
            if (bundle != null) {
                this.f955a.putExtras(bundle);
            }
            if (this.f960f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f960f);
                this.f955a.putExtras(bundle2);
            }
            this.f955a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f962h);
            if (Build.VERSION.SDK_INT >= 24) {
                b();
            }
            return new c(this.f955a, this.f958d);
        }

        public b d(boolean z2) {
            this.f955a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z2 ? 1 : 0);
            return this;
        }
    }

    c(Intent intent, Bundle bundle) {
        this.f953a = intent;
        this.f954b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f953a.setData(uri);
        androidx.core.content.a.l(context, this.f953a, this.f954b);
    }
}
