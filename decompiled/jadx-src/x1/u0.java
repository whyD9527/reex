package x1;

/* loaded from: classes.dex */
final class u0 implements f1 {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4461e;

    public u0(boolean z2) {
        this.f4461e = z2;
    }

    @Override // x1.f1
    public boolean b() {
        return this.f4461e;
    }

    @Override // x1.f1
    public v1 h() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
