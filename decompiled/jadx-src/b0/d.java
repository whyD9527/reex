package b0;

import android.text.TextUtils;

/* loaded from: classes.dex */
class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private String f2370a;

    /* renamed from: b, reason: collision with root package name */
    private int f2371b;

    /* renamed from: c, reason: collision with root package name */
    private int f2372c;

    d(String str, int i2, int i3) {
        this.f2370a = str;
        this.f2371b = i2;
        this.f2372c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return (this.f2371b < 0 || dVar.f2371b < 0) ? TextUtils.equals(this.f2370a, dVar.f2370a) && this.f2372c == dVar.f2372c : TextUtils.equals(this.f2370a, dVar.f2370a) && this.f2371b == dVar.f2371b && this.f2372c == dVar.f2372c;
    }

    public int hashCode() {
        return androidx.core.util.d.b(this.f2370a, Integer.valueOf(this.f2372c));
    }
}
