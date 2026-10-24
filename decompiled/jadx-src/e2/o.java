package e2;

import android.content.Context;
import s0.a;
import z0.k;

/* loaded from: classes.dex */
public final class o implements s0.a, k.c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2702d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private z0.k f2703a;

    /* renamed from: b, reason: collision with root package name */
    private Context f2704b;

    /* renamed from: c, reason: collision with root package name */
    private n f2705c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    static final class b extends kotlin.jvm.internal.l implements q1.p<String, Object, g1.q> {
        b() {
            super(2);
        }

        public final void a(String name, Object obj) {
            kotlin.jvm.internal.k.e(name, "name");
            z0.k kVar = o.this.f2703a;
            if (kVar == null) {
                kotlin.jvm.internal.k.o("channel");
                kVar = null;
            }
            kVar.c(name, obj);
        }

        @Override // q1.p
        public /* bridge */ /* synthetic */ g1.q invoke(String str, Object obj) {
            a(str, obj);
            return g1.q.f2865a;
        }
    }

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        this.f2703a = new z0.k(binding.b(), "xyz.re.player.ex/BackgroundServiceChannel", z0.r.f4769b, binding.b().b());
        Context a3 = binding.a();
        kotlin.jvm.internal.k.d(a3, "binding.applicationContext");
        this.f2704b = a3;
        z0.k kVar = this.f2703a;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(this);
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.k kVar = this.f2703a;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    @Override // z0.k.c
    public void m(z0.j call, k.d result) {
        Boolean bool;
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        String str = call.f4754a;
        Context context = null;
        if (kotlin.jvm.internal.k.a(str, "create")) {
            if (this.f2705c == null) {
                Context context2 = this.f2704b;
                if (context2 == null) {
                    kotlin.jvm.internal.k.o("context");
                } else {
                    context = context2;
                }
                this.f2705c = new n(context, new b());
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            result.a(bool);
            return;
        }
        if (kotlin.jvm.internal.k.a(str, "dispose")) {
            n nVar = this.f2705c;
            if (nVar != null) {
                nVar.b();
            }
            this.f2705c = null;
            result.a(null);
            return;
        }
        n nVar2 = this.f2705c;
        if (nVar2 == null) {
            result.b();
        } else {
            kotlin.jvm.internal.k.b(nVar2);
            nVar2.g(call, result);
        }
    }
}
