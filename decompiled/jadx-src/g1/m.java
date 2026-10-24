package g1;

import java.io.Serializable;

/* loaded from: classes.dex */
final class m<T> implements e<T>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private q1.a<? extends T> f2861e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f2862f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f2863g;

    public m(q1.a<? extends T> initializer, Object obj) {
        kotlin.jvm.internal.k.e(initializer, "initializer");
        this.f2861e = initializer;
        this.f2862f = o.f2864a;
        this.f2863g = obj == null ? this : obj;
    }

    public /* synthetic */ m(q1.a aVar, Object obj, int i2, kotlin.jvm.internal.g gVar) {
        this(aVar, (i2 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f2862f != o.f2864a;
    }

    @Override // g1.e
    public T getValue() {
        T t2;
        T t3 = (T) this.f2862f;
        o oVar = o.f2864a;
        if (t3 != oVar) {
            return t3;
        }
        synchronized (this.f2863g) {
            t2 = (T) this.f2862f;
            if (t2 == oVar) {
                q1.a<? extends T> aVar = this.f2861e;
                kotlin.jvm.internal.k.b(aVar);
                t2 = aVar.invoke();
                this.f2862f = t2;
                this.f2861e = null;
            }
        }
        return t2;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
