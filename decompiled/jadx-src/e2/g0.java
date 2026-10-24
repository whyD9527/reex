package e2;

/* loaded from: classes.dex */
final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f2663a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2664b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2665c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2666d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2667e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2668f;

    /* renamed from: g, reason: collision with root package name */
    private final long f2669g;

    public g0(String contentUri, long j2, String displayName, String relativePath, String volumeName, String realPath, long j3) {
        kotlin.jvm.internal.k.e(contentUri, "contentUri");
        kotlin.jvm.internal.k.e(displayName, "displayName");
        kotlin.jvm.internal.k.e(relativePath, "relativePath");
        kotlin.jvm.internal.k.e(volumeName, "volumeName");
        kotlin.jvm.internal.k.e(realPath, "realPath");
        this.f2663a = contentUri;
        this.f2664b = j2;
        this.f2665c = displayName;
        this.f2666d = relativePath;
        this.f2667e = volumeName;
        this.f2668f = realPath;
        this.f2669g = j3;
    }

    public final String a() {
        return this.f2663a;
    }

    public final String b() {
        return this.f2665c;
    }

    public final long c() {
        return this.f2669g;
    }

    public final String d() {
        return this.f2668f;
    }

    public final String e() {
        return this.f2666d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return kotlin.jvm.internal.k.a(this.f2663a, g0Var.f2663a) && this.f2664b == g0Var.f2664b && kotlin.jvm.internal.k.a(this.f2665c, g0Var.f2665c) && kotlin.jvm.internal.k.a(this.f2666d, g0Var.f2666d) && kotlin.jvm.internal.k.a(this.f2667e, g0Var.f2667e) && kotlin.jvm.internal.k.a(this.f2668f, g0Var.f2668f) && this.f2669g == g0Var.f2669g;
    }

    public final long f() {
        return this.f2664b;
    }

    public final String g() {
        return this.f2667e;
    }

    public int hashCode() {
        return (((((((((((this.f2663a.hashCode() * 31) + d2.a.a(this.f2664b)) * 31) + this.f2665c.hashCode()) * 31) + this.f2666d.hashCode()) * 31) + this.f2667e.hashCode()) * 31) + this.f2668f.hashCode()) * 31) + d2.a.a(this.f2669g);
    }

    public String toString() {
        return "MediaStoreFile(contentUri=" + this.f2663a + ", size=" + this.f2664b + ", displayName=" + this.f2665c + ", relativePath=" + this.f2666d + ", volumeName=" + this.f2667e + ", realPath=" + this.f2668f + ", modifiedTime=" + this.f2669g + ')';
    }
}
