package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f945a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f946b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f947c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f948d;

    /* renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0014a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f949a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f950b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f951c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f952d;

        public a a() {
            return new a(this.f949a, this.f950b, this.f951c, this.f952d);
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f945a = num;
        this.f946b = num2;
        this.f947c = num3;
        this.f948d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f945a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f946b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f947c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f948d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
