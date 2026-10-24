package u;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f4314a;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f4315b;

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f4316c;

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f4317d;

    /* renamed from: u.a$a, reason: collision with other inner class name */
    private static final class C0066a {

        /* renamed from: a, reason: collision with root package name */
        static final int f4318a = SdkExtensions.getExtensionVersion(30);

        /* renamed from: b, reason: collision with root package name */
        static final int f4319b = SdkExtensions.getExtensionVersion(31);

        /* renamed from: c, reason: collision with root package name */
        static final int f4320c = SdkExtensions.getExtensionVersion(33);

        /* renamed from: d, reason: collision with root package name */
        static final int f4321d = SdkExtensions.getExtensionVersion(1000000);
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f4314a = i2 >= 30 ? C0066a.f4318a : 0;
        f4315b = i2 >= 30 ? C0066a.f4319b : 0;
        f4316c = i2 >= 30 ? C0066a.f4320c : 0;
        f4317d = i2 >= 30 ? C0066a.f4321d : 0;
    }

    protected static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean c() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 33 || (i2 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}
