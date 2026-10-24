package j1;

import j1.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import q1.p;

/* loaded from: classes.dex */
public interface g {

    public static final class a {

        /* renamed from: j1.g$a$a, reason: collision with other inner class name */
        static final class C0050a extends l implements p<g, b, g> {

            /* renamed from: e, reason: collision with root package name */
            public static final C0050a f3609e = new C0050a();

            C0050a() {
                super(2);
            }

            @Override // q1.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(g acc, b element) {
                j1.c cVar;
                k.e(acc, "acc");
                k.e(element, "element");
                g minusKey = acc.minusKey(element.getKey());
                h hVar = h.f3610e;
                if (minusKey == hVar) {
                    return element;
                }
                e.b bVar = e.f3607b;
                e eVar = (e) minusKey.get(bVar);
                if (eVar == null) {
                    cVar = new j1.c(minusKey, element);
                } else {
                    g minusKey2 = minusKey.minusKey(bVar);
                    if (minusKey2 == hVar) {
                        return new j1.c(element, eVar);
                    }
                    cVar = new j1.c(new j1.c(minusKey2, element), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g context) {
            k.e(context, "context");
            return context == h.f3610e ? gVar : (g) context.fold(gVar, C0050a.f3609e);
        }
    }

    public interface b extends g {

        public static final class a {
            public static <R> R a(b bVar, R r2, p<? super R, ? super b, ? extends R> operation) {
                k.e(operation, "operation");
                return operation.invoke(r2, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> key) {
                k.e(key, "key");
                if (!k.a(bVar.getKey(), key)) {
                    return null;
                }
                k.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c<?> key) {
                k.e(key, "key");
                return k.a(bVar.getKey(), key) ? h.f3610e : bVar;
            }

            public static g d(b bVar, g context) {
                k.e(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // j1.g
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <R> R fold(R r2, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
