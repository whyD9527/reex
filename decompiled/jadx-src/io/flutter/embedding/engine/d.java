package io.flutter.embedding.engine;

import android.content.Context;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.u;
import java.util.ArrayList;
import java.util.List;
import o0.a;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    final List<io.flutter.embedding.engine.a> f3166a = new ArrayList();

    class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.flutter.embedding.engine.a f3167a;

        a(io.flutter.embedding.engine.a aVar) {
            this.f3167a = aVar;
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
            d.this.f3166a.remove(this.f3167a);
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private Context f3169a;

        /* renamed from: b, reason: collision with root package name */
        private a.b f3170b;

        /* renamed from: c, reason: collision with root package name */
        private String f3171c;

        /* renamed from: d, reason: collision with root package name */
        private List<String> f3172d;

        /* renamed from: e, reason: collision with root package name */
        private u f3173e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f3174f = true;

        /* renamed from: g, reason: collision with root package name */
        private boolean f3175g = false;

        public b(Context context) {
            this.f3169a = context;
        }

        public boolean a() {
            return this.f3174f;
        }

        public Context b() {
            return this.f3169a;
        }

        public a.b c() {
            return this.f3170b;
        }

        public List<String> d() {
            return this.f3172d;
        }

        public String e() {
            return this.f3171c;
        }

        public u f() {
            return this.f3173e;
        }

        public boolean g() {
            return this.f3175g;
        }

        public b h(boolean z2) {
            this.f3174f = z2;
            return this;
        }

        public b i(a.b bVar) {
            this.f3170b = bVar;
            return this;
        }

        public b j(List<String> list) {
            this.f3172d = list;
            return this;
        }

        public b k(String str) {
            this.f3171c = str;
            return this;
        }

        public b l(boolean z2) {
            this.f3175g = z2;
            return this;
        }
    }

    public d(Context context, String[] strArr) {
        q0.d c3 = n0.a.e().c();
        if (c3.i()) {
            return;
        }
        c3.k(context.getApplicationContext());
        c3.f(context.getApplicationContext(), strArr);
    }

    public io.flutter.embedding.engine.a a(b bVar) {
        io.flutter.embedding.engine.a z2;
        Context b3 = bVar.b();
        a.b c3 = bVar.c();
        String e3 = bVar.e();
        List<String> d3 = bVar.d();
        u f2 = bVar.f();
        if (f2 == null) {
            f2 = new u();
        }
        u uVar = f2;
        boolean a3 = bVar.a();
        boolean g2 = bVar.g();
        a.b a4 = c3 == null ? a.b.a() : c3;
        if (this.f3166a.size() == 0) {
            z2 = b(b3, uVar, a3, g2);
            if (e3 != null) {
                z2.n().c(e3);
            }
            z2.j().j(a4, d3);
        } else {
            z2 = this.f3166a.get(0).z(b3, a4, e3, d3, uVar, a3, g2);
        }
        this.f3166a.add(z2);
        z2.e(new a(z2));
        return z2;
    }

    io.flutter.embedding.engine.a b(Context context, u uVar, boolean z2, boolean z3) {
        return new io.flutter.embedding.engine.a(context, null, null, uVar, null, z2, z3, this);
    }
}
