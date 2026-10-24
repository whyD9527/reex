package q0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4201a = d.class.getName() + ".aot-shared-library-name";

    /* renamed from: b, reason: collision with root package name */
    public static final String f4202b = d.class.getName() + ".vm-snapshot-data";

    /* renamed from: c, reason: collision with root package name */
    public static final String f4203c = d.class.getName() + ".isolate-snapshot-data";

    /* renamed from: d, reason: collision with root package name */
    public static final String f4204d = d.class.getName() + ".flutter-assets-dir";

    private static ApplicationInfo a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static boolean b(Bundle bundle, String str, boolean z2) {
        return bundle == null ? z2 : bundle.getBoolean(str, z2);
    }

    private static String c(ApplicationInfo applicationInfo, Context context) {
        int i2;
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i2 = bundle.getInt("io.flutter.network-policy", 0)) <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            XmlResourceParser xml = context.getResources().getXml(i2);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    if (xml.getName().equals("domain-config")) {
                        g(xml, jSONArray, false);
                    }
                }
            }
            return jSONArray.toString();
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    private static String d(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, null);
    }

    public static b e(Context context) {
        ApplicationInfo a3 = a(context);
        return new b(d(a3.metaData, f4201a), d(a3.metaData, f4202b), d(a3.metaData, f4203c), d(a3.metaData, f4204d), c(a3, context), a3.nativeLibraryDir, b(a3.metaData, "io.flutter.automatically-register-plugins", true));
    }

    private static void f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z2) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 4) {
            throw new IllegalStateException("Expected text");
        }
        String trim = xmlResourceParser.getText().trim();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(trim);
        jSONArray2.put(attributeBooleanValue);
        jSONArray2.put(z2);
        jSONArray.put(jSONArray2);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 3) {
            throw new IllegalStateException("Expected end of domain tag");
        }
    }

    private static void g(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z2) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z2);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    f(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    g(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    h(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    private static void h(XmlResourceParser xmlResourceParser) {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlResourceParser.getName() == name) {
                return;
            } else {
                eventType = xmlResourceParser.next();
            }
        }
    }
}
