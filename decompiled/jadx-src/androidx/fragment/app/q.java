package androidx.fragment.app;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
class q implements androidx.lifecycle.g {

    /* renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.h f1941e = null;

    q() {
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        c();
        return this.f1941e;
    }

    void b(d.b bVar) {
        this.f1941e.h(bVar);
    }

    void c() {
        if (this.f1941e == null) {
            this.f1941e = new androidx.lifecycle.h(this);
        }
    }

    boolean d() {
        return this.f1941e != null;
    }
}
