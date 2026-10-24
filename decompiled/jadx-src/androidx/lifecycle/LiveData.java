package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: j, reason: collision with root package name */
    static final Object f1947j = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f1948a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private j.b<m<? super T>, LiveData<T>.b> f1949b = new j.b<>();

    /* renamed from: c, reason: collision with root package name */
    int f1950c = 0;

    /* renamed from: d, reason: collision with root package name */
    private volatile Object f1951d;

    /* renamed from: e, reason: collision with root package name */
    volatile Object f1952e;

    /* renamed from: f, reason: collision with root package name */
    private int f1953f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1954g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1955h;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f1956i;

    class LifecycleBoundObserver extends LiveData<T>.b implements e {

        /* renamed from: e, reason: collision with root package name */
        final g f1957e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LiveData f1958f;

        @Override // androidx.lifecycle.e
        public void d(g gVar, d.b bVar) {
            if (this.f1957e.a().b() == d.c.DESTROYED) {
                this.f1958f.f(this.f1960a);
            } else {
                e(i());
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        void h() {
            this.f1957e.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean i() {
            return this.f1957e.a().b().a(d.c.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f1948a) {
                obj = LiveData.this.f1952e;
                LiveData.this.f1952e = LiveData.f1947j;
            }
            LiveData.this.g(obj);
        }
    }

    private abstract class b {

        /* renamed from: a, reason: collision with root package name */
        final m<? super T> f1960a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1961b;

        /* renamed from: c, reason: collision with root package name */
        int f1962c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LiveData f1963d;

        void e(boolean z2) {
            if (z2 == this.f1961b) {
                return;
            }
            this.f1961b = z2;
            LiveData liveData = this.f1963d;
            int i2 = liveData.f1950c;
            boolean z3 = i2 == 0;
            liveData.f1950c = i2 + (z2 ? 1 : -1);
            if (z3 && z2) {
                liveData.d();
            }
            LiveData liveData2 = this.f1963d;
            if (liveData2.f1950c == 0 && !this.f1961b) {
                liveData2.e();
            }
            if (this.f1961b) {
                this.f1963d.c(this);
            }
        }

        void h() {
        }

        abstract boolean i();
    }

    public LiveData() {
        Object obj = f1947j;
        this.f1951d = obj;
        this.f1952e = obj;
        this.f1953f = -1;
        this.f1956i = new a();
    }

    private static void a(String str) {
        if (i.a.d().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void b(LiveData<T>.b bVar) {
        if (bVar.f1961b) {
            if (!bVar.i()) {
                bVar.e(false);
                return;
            }
            int i2 = bVar.f1962c;
            int i3 = this.f1953f;
            if (i2 >= i3) {
                return;
            }
            bVar.f1962c = i3;
            bVar.f1960a.a((Object) this.f1951d);
        }
    }

    void c(LiveData<T>.b bVar) {
        if (this.f1954g) {
            this.f1955h = true;
            return;
        }
        this.f1954g = true;
        do {
            this.f1955h = false;
            if (bVar != null) {
                b(bVar);
                bVar = null;
            } else {
                j.b<m<? super T>, LiveData<T>.b>.d c3 = this.f1949b.c();
                while (c3.hasNext()) {
                    b((b) c3.next().getValue());
                    if (this.f1955h) {
                        break;
                    }
                }
            }
        } while (this.f1955h);
        this.f1954g = false;
    }

    protected void d() {
    }

    protected void e() {
    }

    public void f(m<? super T> mVar) {
        a("removeObserver");
        LiveData<T>.b f2 = this.f1949b.f(mVar);
        if (f2 == null) {
            return;
        }
        f2.h();
        f2.e(false);
    }

    protected void g(T t2) {
        a("setValue");
        this.f1953f++;
        this.f1951d = t2;
        c(null);
    }
}
