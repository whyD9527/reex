package e2;

import android.content.Intent;
import s0.a;
import z0.k;

/* loaded from: classes.dex */
public final class i0 implements s0.a, k.c, t0.a, z0.n {

    /* renamed from: a, reason: collision with root package name */
    private z0.k f2671a;

    /* renamed from: b, reason: collision with root package name */
    private t0.c f2672b;

    @Override // z0.n
    public boolean c(Intent intent) {
        kotlin.jvm.internal.k.e(intent, "intent");
        if (!kotlin.jvm.internal.k.a(intent.getAction(), "android.intent.action.VIEW")) {
            return false;
        }
        if (intent.getDataString() == null) {
            return true;
        }
        z0.k kVar = this.f2671a;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.c("onNewPlaylistItem", t0.a(intent));
        return true;
    }

    @Override // t0.a
    public void e() {
    }

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.k kVar = new z0.k(binding.b(), "xyz.re.player.ex/NewPlaylistItemChannel");
        this.f2671a = kVar;
        kVar.e(this);
    }

    @Override // t0.a
    public void i(t0.c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        j(binding);
    }

    @Override // t0.a
    public void j(t0.c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        this.f2672b = binding;
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.k kVar = this.f2671a;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    @Override // z0.k.c
    public void m(z0.j call, k.d result) {
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        String str = call.f4754a;
        t0.c cVar = null;
        if (kotlin.jvm.internal.k.a(str, "start")) {
            t0.c cVar2 = this.f2672b;
            if (cVar2 == null) {
                kotlin.jvm.internal.k.o("binding");
            } else {
                cVar = cVar2;
            }
            cVar.g(this);
            return;
        }
        if (kotlin.jvm.internal.k.a(str, "stop")) {
            t0.c cVar3 = this.f2672b;
            if (cVar3 == null) {
                kotlin.jvm.internal.k.o("binding");
            } else {
                cVar = cVar3;
            }
            cVar.b(this);
        }
    }

    @Override // t0.a
    public void n() {
        e();
    }
}
