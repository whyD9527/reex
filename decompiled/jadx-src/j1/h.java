package j1;

import j1.g;
import java.io.Serializable;
import kotlin.jvm.internal.k;
import q1.p;

/* loaded from: classes.dex */
public final class h implements g, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final h f3610e = new h();

    private h() {
    }

    @Override // j1.g
    public <R> R fold(R r2, p<? super R, ? super g.b, ? extends R> operation) {
        k.e(operation, "operation");
        return r2;
    }

    @Override // j1.g
    public <E extends g.b> E get(g.c<E> key) {
        k.e(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // j1.g
    public g minusKey(g.c<?> key) {
        k.e(key, "key");
        return this;
    }

    @Override // j1.g
    public g plus(g context) {
        k.e(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
