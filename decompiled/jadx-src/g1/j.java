package g1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j<A, B> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private final A f2857e;

    /* renamed from: f, reason: collision with root package name */
    private final B f2858f;

    public j(A a3, B b3) {
        this.f2857e = a3;
        this.f2858f = b3;
    }

    public final A a() {
        return this.f2857e;
    }

    public final B b() {
        return this.f2858f;
    }

    public final A c() {
        return this.f2857e;
    }

    public final B d() {
        return this.f2858f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.k.a(this.f2857e, jVar.f2857e) && kotlin.jvm.internal.k.a(this.f2858f, jVar.f2858f);
    }

    public int hashCode() {
        A a3 = this.f2857e;
        int hashCode = (a3 == null ? 0 : a3.hashCode()) * 31;
        B b3 = this.f2858f;
        return hashCode + (b3 != null ? b3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f2857e + ", " + this.f2858f + ')';
    }
}
