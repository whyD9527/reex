package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final g.c f1458a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f1459b;

    /* renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    class RunnableC0023a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g.c f1460e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Typeface f1461f;

        RunnableC0023a(g.c cVar, Typeface typeface) {
            this.f1460e = cVar;
            this.f1461f = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1460e.b(this.f1461f);
        }
    }

    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g.c f1463e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1464f;

        b(g.c cVar, int i2) {
            this.f1463e = cVar;
            this.f1464f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1463e.a(this.f1464f);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f1458a = cVar;
        this.f1459b = handler;
    }

    private void a(int i2) {
        this.f1459b.post(new b(this.f1458a, i2));
    }

    private void c(Typeface typeface) {
        this.f1459b.post(new RunnableC0023a(this.f1458a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f1487a);
        } else {
            a(eVar.f1488b);
        }
    }
}
