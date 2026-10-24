package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: b, reason: collision with root package name */
    private j.a<f, a> f1983b;

    /* renamed from: c, reason: collision with root package name */
    private d.c f1984c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<g> f1985d;

    /* renamed from: e, reason: collision with root package name */
    private int f1986e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1987f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1988g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<d.c> f1989h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f1990i;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        d.c f1991a;

        /* renamed from: b, reason: collision with root package name */
        e f1992b;

        a(f fVar, d.c cVar) {
            this.f1992b = j.f(fVar);
            this.f1991a = cVar;
        }

        void a(g gVar, d.b bVar) {
            d.c b3 = bVar.b();
            this.f1991a = h.k(this.f1991a, b3);
            this.f1992b.d(gVar, bVar);
            this.f1991a = b3;
        }
    }

    public h(g gVar) {
        this(gVar, true);
    }

    private h(g gVar, boolean z2) {
        this.f1983b = new j.a<>();
        this.f1986e = 0;
        this.f1987f = false;
        this.f1988g = false;
        this.f1989h = new ArrayList<>();
        this.f1985d = new WeakReference<>(gVar);
        this.f1984c = d.c.INITIALIZED;
        this.f1990i = z2;
    }

    private void d(g gVar) {
        Iterator<Map.Entry<f, a>> descendingIterator = this.f1983b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f1988g) {
            Map.Entry<f, a> next = descendingIterator.next();
            a value = next.getValue();
            while (value.f1991a.compareTo(this.f1984c) > 0 && !this.f1988g && this.f1983b.contains(next.getKey())) {
                d.b a3 = d.b.a(value.f1991a);
                if (a3 == null) {
                    throw new IllegalStateException("no event down from " + value.f1991a);
                }
                n(a3.b());
                value.a(gVar, a3);
                m();
            }
        }
    }

    private d.c e(f fVar) {
        Map.Entry<f, a> g2 = this.f1983b.g(fVar);
        d.c cVar = null;
        d.c cVar2 = g2 != null ? g2.getValue().f1991a : null;
        if (!this.f1989h.isEmpty()) {
            cVar = this.f1989h.get(r0.size() - 1);
        }
        return k(k(this.f1984c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    private void f(String str) {
        if (!this.f1990i || i.a.d().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(g gVar) {
        j.b<f, a>.d c3 = this.f1983b.c();
        while (c3.hasNext() && !this.f1988g) {
            Map.Entry next = c3.next();
            a aVar = (a) next.getValue();
            while (aVar.f1991a.compareTo(this.f1984c) < 0 && !this.f1988g && this.f1983b.contains(next.getKey())) {
                n(aVar.f1991a);
                d.b c4 = d.b.c(aVar.f1991a);
                if (c4 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f1991a);
                }
                aVar.a(gVar, c4);
                m();
            }
        }
    }

    private boolean i() {
        if (this.f1983b.size() == 0) {
            return true;
        }
        d.c cVar = this.f1983b.a().getValue().f1991a;
        d.c cVar2 = this.f1983b.d().getValue().f1991a;
        return cVar == cVar2 && this.f1984c == cVar2;
    }

    static d.c k(d.c cVar, d.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(d.c cVar) {
        if (this.f1984c == cVar) {
            return;
        }
        this.f1984c = cVar;
        if (this.f1987f || this.f1986e != 0) {
            this.f1988g = true;
            return;
        }
        this.f1987f = true;
        p();
        this.f1987f = false;
    }

    private void m() {
        this.f1989h.remove(r0.size() - 1);
    }

    private void n(d.c cVar) {
        this.f1989h.add(cVar);
    }

    private void p() {
        g gVar = this.f1985d.get();
        if (gVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean i2 = i();
            this.f1988g = false;
            if (i2) {
                return;
            }
            if (this.f1984c.compareTo(this.f1983b.a().getValue().f1991a) < 0) {
                d(gVar);
            }
            Map.Entry<f, a> d3 = this.f1983b.d();
            if (!this.f1988g && d3 != null && this.f1984c.compareTo(d3.getValue().f1991a) > 0) {
                g(gVar);
            }
        }
    }

    @Override // androidx.lifecycle.d
    public void a(f fVar) {
        g gVar;
        f("addObserver");
        d.c cVar = this.f1984c;
        d.c cVar2 = d.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = d.c.INITIALIZED;
        }
        a aVar = new a(fVar, cVar2);
        if (this.f1983b.h(fVar, aVar) == null && (gVar = this.f1985d.get()) != null) {
            boolean z2 = this.f1986e != 0 || this.f1987f;
            d.c e3 = e(fVar);
            this.f1986e++;
            while (aVar.f1991a.compareTo(e3) < 0 && this.f1983b.contains(fVar)) {
                n(aVar.f1991a);
                d.b c3 = d.b.c(aVar.f1991a);
                if (c3 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f1991a);
                }
                aVar.a(gVar, c3);
                m();
                e3 = e(fVar);
            }
            if (!z2) {
                p();
            }
            this.f1986e--;
        }
    }

    @Override // androidx.lifecycle.d
    public d.c b() {
        return this.f1984c;
    }

    @Override // androidx.lifecycle.d
    public void c(f fVar) {
        f("removeObserver");
        this.f1983b.f(fVar);
    }

    public void h(d.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.b());
    }

    @Deprecated
    public void j(d.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(d.c cVar) {
        f("setCurrentState");
        l(cVar);
    }
}
