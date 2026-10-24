package e1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.c;
import e1.a;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
final class i implements a.c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2644a;

    /* renamed from: b, reason: collision with root package name */
    private final a f2645b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f2646c;

    interface a {
        String a(Intent intent);
    }

    i(final Context context) {
        this(context, new a() { // from class: e1.h
            @Override // e1.i.a
            public final String a(Intent intent) {
                String j2;
                j2 = i.j(context, intent);
                return j2;
            }
        });
    }

    i(Context context, a aVar) {
        this.f2644a = context;
        this.f2645b = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static boolean g(Map<String, String> map) {
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            char c3 = 0;
            if (!it.hasNext()) {
                return false;
            }
            String lowerCase = it.next().toLowerCase(Locale.US);
            lowerCase.hashCode();
            switch (lowerCase.hashCode()) {
                case -1423461112:
                    if (lowerCase.equals("accept")) {
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1229727188:
                    if (lowerCase.equals("content-language")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 785670158:
                    if (lowerCase.equals("content-type")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 802785917:
                    if (lowerCase.equals("accept-language")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                case 1:
                case 2:
                case 3:
                default:
                    return true;
            }
        }
    }

    private void h() {
        if (this.f2646c == null) {
            throw new a.b("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        }
    }

    private static Bundle i(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j(Context context, Intent intent) {
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return null;
        }
        return resolveActivity.toShortString();
    }

    private static boolean k(Context context, Uri uri, Bundle bundle, a.C0040a c0040a) {
        androidx.browser.customtabs.c a3 = new c.b().d(c0040a.b().booleanValue()).a();
        a3.f953a.putExtra("com.android.browser.headers", bundle);
        try {
            a3.a(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    @Override // e1.a.c
    public Boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return this.f2645b.a(intent) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    @Override // e1.a.c
    public void b() {
        this.f2644a.sendBroadcast(new Intent("close action"));
    }

    @Override // e1.a.c
    public Boolean c(String str, Map<String, String> map) {
        h();
        try {
            this.f2646c.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", i(map)));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // e1.a.c
    public Boolean d() {
        return Boolean.valueOf(androidx.browser.customtabs.b.a(this.f2644a, Collections.emptyList()) != null);
    }

    @Override // e1.a.c
    public Boolean e(String str, Boolean bool, a.e eVar, a.C0040a c0040a) {
        h();
        Bundle i2 = i(eVar.d());
        if (bool.booleanValue() && !g(eVar.d())) {
            if (k(this.f2646c, Uri.parse(str), i2, c0040a)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.f2646c.startActivity(WebViewActivity.a(this.f2646c, str, eVar.c().booleanValue(), eVar.b().booleanValue(), i2));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    void l(Activity activity) {
        this.f2646c = activity;
    }
}
