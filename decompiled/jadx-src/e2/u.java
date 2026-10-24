package e2;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private final String f2753a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2754b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2755c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2756d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2757e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2758f;

    /* renamed from: g, reason: collision with root package name */
    private final long f2759g;

    /* renamed from: h, reason: collision with root package name */
    private final long f2760h;

    /* renamed from: i, reason: collision with root package name */
    private final String f2761i;

    /* renamed from: j, reason: collision with root package name */
    private final String f2762j;

    /* renamed from: k, reason: collision with root package name */
    private final String f2763k;

    /* renamed from: l, reason: collision with root package name */
    private final String f2764l;

    /* renamed from: m, reason: collision with root package name */
    private final String f2765m;

    public u(String contentUri, long j2, String displayName, String relativePath, String volumeName, String realPath, long j3, long j4, String str, String str2, String str3, String str4, String str5) {
        kotlin.jvm.internal.k.e(contentUri, "contentUri");
        kotlin.jvm.internal.k.e(displayName, "displayName");
        kotlin.jvm.internal.k.e(relativePath, "relativePath");
        kotlin.jvm.internal.k.e(volumeName, "volumeName");
        kotlin.jvm.internal.k.e(realPath, "realPath");
        this.f2753a = contentUri;
        this.f2754b = j2;
        this.f2755c = displayName;
        this.f2756d = relativePath;
        this.f2757e = volumeName;
        this.f2758f = realPath;
        this.f2759g = j3;
        this.f2760h = j4;
        this.f2761i = str;
        this.f2762j = str2;
        this.f2763k = str3;
        this.f2764l = str4;
        this.f2765m = str5;
    }

    public final String a() {
        return this.f2762j;
    }

    public final String b() {
        return this.f2764l;
    }

    public final String c() {
        return this.f2763k;
    }

    public final String d() {
        return this.f2761i;
    }

    public final String e() {
        return this.f2753a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.k.a(this.f2753a, uVar.f2753a) && this.f2754b == uVar.f2754b && kotlin.jvm.internal.k.a(this.f2755c, uVar.f2755c) && kotlin.jvm.internal.k.a(this.f2756d, uVar.f2756d) && kotlin.jvm.internal.k.a(this.f2757e, uVar.f2757e) && kotlin.jvm.internal.k.a(this.f2758f, uVar.f2758f) && this.f2759g == uVar.f2759g && this.f2760h == uVar.f2760h && kotlin.jvm.internal.k.a(this.f2761i, uVar.f2761i) && kotlin.jvm.internal.k.a(this.f2762j, uVar.f2762j) && kotlin.jvm.internal.k.a(this.f2763k, uVar.f2763k) && kotlin.jvm.internal.k.a(this.f2764l, uVar.f2764l) && kotlin.jvm.internal.k.a(this.f2765m, uVar.f2765m);
    }

    public final String f() {
        return this.f2755c;
    }

    public final long g() {
        return this.f2760h;
    }

    public final long h() {
        return this.f2759g;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f2753a.hashCode() * 31) + d2.a.a(this.f2754b)) * 31) + this.f2755c.hashCode()) * 31) + this.f2756d.hashCode()) * 31) + this.f2757e.hashCode()) * 31) + this.f2758f.hashCode()) * 31) + d2.a.a(this.f2759g)) * 31) + d2.a.a(this.f2760h)) * 31;
        String str = this.f2761i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2762j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2763k;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2764l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f2765m;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.f2758f;
    }

    public final String j() {
        return this.f2756d;
    }

    public final long k() {
        return this.f2754b;
    }

    public final String l() {
        return this.f2765m;
    }

    public final String m() {
        return this.f2757e;
    }

    public String toString() {
        return "MediaStoreAudio(contentUri=" + this.f2753a + ", size=" + this.f2754b + ", displayName=" + this.f2755c + ", relativePath=" + this.f2756d + ", volumeName=" + this.f2757e + ", realPath=" + this.f2758f + ", modifiedTime=" + this.f2759g + ", duration=" + this.f2760h + ", author=" + this.f2761i + ", album=" + this.f2762j + ", artist=" + this.f2763k + ", albumArtist=" + this.f2764l + ", title=" + this.f2765m + ')';
    }
}
