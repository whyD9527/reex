package androidx.core.provider;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f1467a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1468b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1469c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f1470d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1471e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final String f1472f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1467a = (String) androidx.core.util.e.b(str);
        this.f1468b = (String) androidx.core.util.e.b(str2);
        this.f1469c = (String) androidx.core.util.e.b(str3);
        this.f1470d = (List) androidx.core.util.e.b(list);
        this.f1472f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f1470d;
    }

    public int c() {
        return this.f1471e;
    }

    String d() {
        return this.f1472f;
    }

    public String e() {
        return this.f1467a;
    }

    public String f() {
        return this.f1468b;
    }

    public String g() {
        return this.f1469c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1467a + ", mProviderPackage: " + this.f1468b + ", mQuery: " + this.f1469c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f1470d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f1470d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1471e);
        return sb.toString();
    }
}
