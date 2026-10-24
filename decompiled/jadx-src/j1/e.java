package j1;

import j1.g;
import kotlin.jvm.internal.k;

/* loaded from: classes.dex */
public interface e extends g.b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f3607b = b.f3608e;

    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> key) {
            k.e(key, "key");
            if (!(key instanceof j1.b)) {
                if (e.f3607b != key) {
                    return null;
                }
                k.c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            j1.b bVar = (j1.b) key;
            if (!bVar.a(eVar.getKey())) {
                return null;
            }
            E e3 = (E) bVar.b(eVar);
            if (e3 instanceof g.b) {
                return e3;
            }
            return null;
        }

        public static g b(e eVar, g.c<?> key) {
            k.e(key, "key");
            if (!(key instanceof j1.b)) {
                return e.f3607b == key ? h.f3610e : eVar;
            }
            j1.b bVar = (j1.b) key;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f3610e;
        }
    }

    public static final class b implements g.c<e> {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ b f3608e = new b();

        private b() {
        }
    }

    void d(d<?> dVar);

    <T> d<T> l(d<? super T> dVar);
}
