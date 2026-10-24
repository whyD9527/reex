package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1964a;

    /* renamed from: b, reason: collision with root package name */
    private final a.C0029a f1965b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1964a = obj;
        this.f1965b = a.f1967c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        this.f1965b.a(gVar, bVar, this.f1964a);
    }
}
