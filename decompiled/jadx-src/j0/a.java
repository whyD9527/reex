package j0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.WindowManager;
import s0.a;
import z0.k;

/* loaded from: classes.dex */
public final class a implements s0.a {

    /* renamed from: a, reason: collision with root package name */
    private k f3599a;

    private final void a(z0.c cVar, Context context) {
        this.f3599a = new k(cVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.k.d(packageManager, "context.packageManager");
        Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        c cVar2 = new c(packageManager, (WindowManager) systemService);
        k kVar = this.f3599a;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("methodChannel");
            kVar = null;
        }
        kVar.e(cVar2);
    }

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.c b3 = binding.b();
        kotlin.jvm.internal.k.d(b3, "binding.binaryMessenger");
        Context a3 = binding.a();
        kotlin.jvm.internal.k.d(a3, "binding.applicationContext");
        a(b3, a3);
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        k kVar = this.f3599a;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("methodChannel");
            kVar = null;
        }
        kVar.e(null);
    }
}
