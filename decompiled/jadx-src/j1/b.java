package j1;

import j1.g;
import j1.g.b;
import kotlin.jvm.internal.k;
import q1.l;

/* loaded from: classes.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: e, reason: collision with root package name */
    private final l<g.b, E> f3602e;

    /* renamed from: f, reason: collision with root package name */
    private final g.c<?> f3603f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [j1.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, q1.l<? super j1.g$b, ? extends E extends B>, q1.l<j1.g$b, E extends B>] */
    public b(g.c<B> baseKey, l<? super g.b, ? extends E> safeCast) {
        k.e(baseKey, "baseKey");
        k.e(safeCast, "safeCast");
        this.f3602e = safeCast;
        this.f3603f = baseKey instanceof b ? (g.c<B>) ((b) baseKey).f3603f : baseKey;
    }

    public final boolean a(g.c<?> key) {
        k.e(key, "key");
        return key == this || this.f3603f == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lj1/g$b;)TE; */
    public final g.b b(g.b element) {
        k.e(element, "element");
        return (g.b) this.f3602e.invoke(element);
    }
}
