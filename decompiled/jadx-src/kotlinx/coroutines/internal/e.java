package kotlinx.coroutines.internal;

import x1.i0;

/* loaded from: classes.dex */
public final class e implements i0 {

    /* renamed from: e, reason: collision with root package name */
    private final j1.g f3665e;

    public e(j1.g gVar) {
        this.f3665e = gVar;
    }

    @Override // x1.i0
    public j1.g e() {
        return this.f3665e;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + e() + ')';
    }
}
