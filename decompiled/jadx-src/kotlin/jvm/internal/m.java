package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class m implements d {

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f3644e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3645f;

    public m(Class<?> jClass, String moduleName) {
        k.e(jClass, "jClass");
        k.e(moduleName, "moduleName");
        this.f3644e = jClass;
        this.f3645f = moduleName;
    }

    @Override // kotlin.jvm.internal.d
    public Class<?> b() {
        return this.f3644e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && k.a(b(), ((m) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
