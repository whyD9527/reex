package z1;

import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.x;
import x1.m0;

/* loaded from: classes.dex */
public final class j<E> extends s implements q<E> {

    /* renamed from: h, reason: collision with root package name */
    public final Throwable f4807h;

    @Override // z1.s
    public x A(m.b bVar) {
        return x1.n.f4428a;
    }

    @Override // z1.q
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public j<E> e() {
        return this;
    }

    @Override // z1.s
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public j<E> z() {
        return this;
    }

    public final Throwable E() {
        Throwable th = this.f4807h;
        return th == null ? new k("Channel was closed") : th;
    }

    public final Throwable F() {
        Throwable th = this.f4807h;
        return th == null ? new l("Channel was closed") : th;
    }

    @Override // z1.q
    public void c(E e3) {
    }

    @Override // z1.q
    public x g(E e3, m.b bVar) {
        return x1.n.f4428a;
    }

    @Override // kotlinx.coroutines.internal.m
    public String toString() {
        return "Closed@" + m0.b(this) + '[' + this.f4807h + ']';
    }

    @Override // z1.s
    public void y() {
    }
}
