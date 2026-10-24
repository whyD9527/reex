package g;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f2790a;

    private a(Context context) {
        this.f2790a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f2790a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f2790a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f2790a.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600) {
            return 5;
        }
        if (i2 > 960 && i3 > 720) {
            return 5;
        }
        if (i2 > 720 && i3 > 960) {
            return 5;
        }
        if (i2 >= 500) {
            return 4;
        }
        if (i2 > 640 && i3 > 480) {
            return 4;
        }
        if (i2 <= 480 || i3 <= 640) {
            return i2 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f2790a.getResources().getDimensionPixelSize(b.d.f2186b);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f2790a.obtainStyledAttributes(null, b.j.f2285a, b.a.f2152c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(b.j.f2317j, 0);
        Resources resources = this.f2790a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(b.d.f2185a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f2790a.getResources().getBoolean(b.b.f2176a);
    }

    public boolean h() {
        return true;
    }
}
