package androidx.activity;

import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f154a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque<b> f155b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements e, androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final d f156a;

        /* renamed from: b, reason: collision with root package name */
        private final b f157b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.activity.a f158c;

        LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.f156a = dVar;
            this.f157b = bVar;
            dVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f156a.c(this);
            this.f157b.e(this);
            androidx.activity.a aVar = this.f158c;
            if (aVar != null) {
                aVar.cancel();
                this.f158c = null;
            }
        }

        @Override // androidx.lifecycle.e
        public void d(g gVar, d.b bVar) {
            if (bVar == d.b.ON_START) {
                this.f158c = OnBackPressedDispatcher.this.b(this.f157b);
                return;
            }
            if (bVar != d.b.ON_STOP) {
                if (bVar == d.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f158c;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    private class a implements androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f160a;

        a(b bVar) {
            this.f160a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f155b.remove(this.f160a);
            this.f160a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f154a = runnable;
    }

    public void a(g gVar, b bVar) {
        d a3 = gVar.a();
        if (a3.b() == d.c.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(a3, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f155b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.f155b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f154a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
