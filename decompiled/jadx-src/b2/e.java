package b2;

import j1.g;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.internal.v;
import q1.p;
import x1.k1;

/* loaded from: classes.dex */
public final class e {

    static final class a extends l implements p<Integer, g.b, Integer> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c<?> f2391e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<?> cVar) {
            super(2);
            this.f2391e = cVar;
        }

        public final Integer a(int i2, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b bVar2 = this.f2391e.f2384f.get(key);
            if (key != k1.f4420d) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i2 + 1);
            }
            k1 k1Var = (k1) bVar2;
            k1 b3 = e.b((k1) bVar, k1Var);
            if (b3 == k1Var) {
                if (k1Var != null) {
                    i2++;
                }
                return Integer.valueOf(i2);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b3 + ", expected child of " + k1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // q1.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(c<?> cVar, g gVar) {
        if (((Number) gVar.fold(0, new a(cVar))).intValue() == cVar.f2385g) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + cVar.f2384f + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final k1 b(k1 k1Var, k1 k1Var2) {
        while (k1Var != null) {
            if (k1Var == k1Var2 || !(k1Var instanceof v)) {
                return k1Var;
            }
            k1Var = ((v) k1Var).w0();
        }
        return null;
    }
}
