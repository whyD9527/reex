package x1;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4389a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.l<Throwable, g1.q> f4390b;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(Object obj, q1.l<? super Throwable, g1.q> lVar) {
        this.f4389a = obj;
        this.f4390b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.k.a(this.f4389a, a0Var.f4389a) && kotlin.jvm.internal.k.a(this.f4390b, a0Var.f4390b);
    }

    public int hashCode() {
        Object obj = this.f4389a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f4390b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f4389a + ", onCancellation=" + this.f4390b + ')';
    }
}
