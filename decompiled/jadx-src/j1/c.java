package j1;

import j1.g;
import java.io.Serializable;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import q1.p;

/* loaded from: classes.dex */
public final class c implements g, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private final g f3604e;

    /* renamed from: f, reason: collision with root package name */
    private final g.b f3605f;

    static final class a extends l implements p<String, g.b, String> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f3606e = new a();

        a() {
            super(2);
        }

        @Override // q1.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, g.b element) {
            k.e(acc, "acc");
            k.e(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(g left, g.b element) {
        k.e(left, "left");
        k.e(element, "element");
        this.f3604e = left;
        this.f3605f = element;
    }

    private final boolean a(g.b bVar) {
        return k.a(get(bVar.getKey()), bVar);
    }

    private final boolean e(c cVar) {
        while (a(cVar.f3605f)) {
            g gVar = cVar.f3604e;
            if (!(gVar instanceof c)) {
                k.c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int i() {
        int i2 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f3604e;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.i() != i() || !cVar.e(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // j1.g
    public <R> R fold(R r2, p<? super R, ? super g.b, ? extends R> operation) {
        k.e(operation, "operation");
        return operation.invoke((Object) this.f3604e.fold(r2, operation), this.f3605f);
    }

    @Override // j1.g
    public <E extends g.b> E get(g.c<E> key) {
        k.e(key, "key");
        c cVar = this;
        while (true) {
            E e3 = (E) cVar.f3605f.get(key);
            if (e3 != null) {
                return e3;
            }
            g gVar = cVar.f3604e;
            if (!(gVar instanceof c)) {
                return (E) gVar.get(key);
            }
            cVar = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f3604e.hashCode() + this.f3605f.hashCode();
    }

    @Override // j1.g
    public g minusKey(g.c<?> key) {
        k.e(key, "key");
        if (this.f3605f.get(key) != null) {
            return this.f3604e;
        }
        g minusKey = this.f3604e.minusKey(key);
        return minusKey == this.f3604e ? this : minusKey == h.f3610e ? this.f3605f : new c(minusKey, this.f3605f);
    }

    @Override // j1.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f3606e)) + ']';
    }
}
