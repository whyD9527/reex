package kotlinx.coroutines.internal;

import x1.u1;

/* loaded from: classes.dex */
final class r extends u1 {

    /* renamed from: f, reason: collision with root package name */
    private final Throwable f3700f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3701g;

    public r(Throwable th, String str) {
        this.f3700f = th;
        this.f3701g = str;
    }

    private final Void s() {
        String j2;
        if (this.f3700f == null) {
            q.c();
            throw new g1.d();
        }
        String str = this.f3701g;
        String str2 = "";
        if (str != null && (j2 = kotlin.jvm.internal.k.j(". ", str)) != null) {
            str2 = j2;
        }
        throw new IllegalStateException(kotlin.jvm.internal.k.j("Module with the Main dispatcher had failed to initialize", str2), this.f3700f);
    }

    @Override // x1.f0
    public boolean o(j1.g gVar) {
        s();
        throw new g1.d();
    }

    @Override // x1.u1
    public u1 p() {
        return this;
    }

    @Override // x1.f0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Void i(j1.g gVar, Runnable runnable) {
        s();
        throw new g1.d();
    }

    @Override // x1.u1, x1.f0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f3700f;
        sb.append(th != null ? kotlin.jvm.internal.k.j(", cause=", th) : "");
        sb.append(']');
        return sb.toString();
    }
}
