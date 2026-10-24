package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class n<E> {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3686a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public n(boolean z2) {
        this._cur = new o(8, z2);
    }

    public final boolean a(E e3) {
        while (true) {
            o oVar = (o) this._cur;
            int a3 = oVar.a(e3);
            if (a3 == 0) {
                return true;
            }
            if (a3 == 1) {
                x1.l.a(f3686a, this, oVar, oVar.i());
            } else if (a3 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            o oVar = (o) this._cur;
            if (oVar.d()) {
                return;
            } else {
                x1.l.a(f3686a, this, oVar, oVar.i());
            }
        }
    }

    public final int c() {
        return ((o) this._cur).f();
    }

    public final E d() {
        while (true) {
            o oVar = (o) this._cur;
            E e3 = (E) oVar.j();
            if (e3 != o.f3690h) {
                return e3;
            }
            x1.l.a(f3686a, this, oVar, oVar.i());
        }
    }
}
