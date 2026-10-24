package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements e {

    /* renamed from: a, reason: collision with root package name */
    private final c[] f1942a;

    CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f1942a = cVarArr;
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        k kVar = new k();
        for (c cVar : this.f1942a) {
            cVar.a(gVar, bVar, false, kVar);
        }
        for (c cVar2 : this.f1942a) {
            cVar2.a(gVar, bVar, true, kVar);
        }
    }
}
