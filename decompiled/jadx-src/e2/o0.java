package e2;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import s0.a;
import z0.k;

/* loaded from: classes.dex */
public final class o0 implements s0.a, k.c, t0.a {

    /* renamed from: a, reason: collision with root package name */
    private z0.k f2707a;

    /* renamed from: b, reason: collision with root package name */
    private Context f2708b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f2709c;

    /* renamed from: d, reason: collision with root package name */
    private n0 f2710d;

    private final boolean a() {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        Context context = this.f2708b;
        if (context == null) {
            kotlin.jvm.internal.k.o("context");
            context = null;
        }
        return context.getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    private final boolean b() {
        boolean isInPictureInPictureMode;
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        Activity activity = this.f2709c;
        if (activity == null) {
            kotlin.jvm.internal.k.o("activity");
            activity = null;
        }
        isInPictureInPictureMode = activity.isInPictureInPictureMode();
        return isInPictureInPictureMode;
    }

    public final void c(boolean z2) {
        if (this.f2710d != null) {
            z0.k kVar = this.f2707a;
            if (kVar == null) {
                kotlin.jvm.internal.k.o("channel");
                kVar = null;
            }
            kVar.c("onPictureInPictureModeChanged", Boolean.valueOf(z2));
        }
    }

    @Override // t0.a
    public void e() {
    }

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.k kVar = new z0.k(binding.b(), "xyz.re.player.ex/SystemVideoPipMode");
        this.f2707a = kVar;
        kVar.e(this);
        Context a3 = binding.a();
        kotlin.jvm.internal.k.d(a3, "binding.applicationContext");
        this.f2708b = a3;
    }

    @Override // t0.a
    public void i(t0.c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        j(binding);
    }

    @Override // t0.a
    public void j(t0.c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        Activity d3 = binding.d();
        kotlin.jvm.internal.k.d(d3, "binding.activity");
        this.f2709c = d3;
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        n0 n0Var = this.f2710d;
        if (n0Var != null) {
            kotlin.jvm.internal.k.b(n0Var);
            n0Var.a();
            this.f2710d = null;
        }
        z0.k kVar = this.f2707a;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // z0.k.c
    public void m(z0.j call, k.d result) {
        boolean b3;
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        if (Build.VERSION.SDK_INT < 26) {
            result.c("Unsupported this Android version.", null, null);
            return;
        }
        String str = call.f4754a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1319830319:
                    if (str.equals("setAspectRatio")) {
                        Object a3 = call.a("numerator");
                        kotlin.jvm.internal.k.b(a3);
                        int intValue = ((Number) a3).intValue();
                        Object a4 = call.a("denominator");
                        kotlin.jvm.internal.k.b(a4);
                        int intValue2 = ((Number) a4).intValue();
                        n0 n0Var = this.f2710d;
                        kotlin.jvm.internal.k.b(n0Var);
                        n0Var.h(intValue, intValue2);
                        result.a(null);
                        break;
                    }
                    break;
                case -92379925:
                    if (str.equals("isInPipMode")) {
                        b3 = b();
                        result.a(Boolean.valueOf(b3));
                        break;
                    }
                    break;
                case 3237136:
                    if (str.equals("init")) {
                        if (this.f2710d == null) {
                            Context context = this.f2708b;
                            if (context == null) {
                                kotlin.jvm.internal.k.o("context");
                                context = null;
                            }
                            Activity activity = this.f2709c;
                            if (activity == null) {
                                kotlin.jvm.internal.k.o("activity");
                                activity = null;
                            }
                            z0.k kVar = this.f2707a;
                            if (kVar == null) {
                                kotlin.jvm.internal.k.o("channel");
                                kVar = null;
                            }
                            n0 n0Var2 = new n0(context, activity, kVar);
                            this.f2710d = n0Var2;
                            kotlin.jvm.internal.k.b(n0Var2);
                            n0Var2.g();
                        }
                        result.a(null);
                        break;
                    }
                    break;
                case 96667352:
                    if (str.equals("enter")) {
                        Object a5 = call.a("isPlaying");
                        kotlin.jvm.internal.k.b(a5);
                        boolean booleanValue = ((Boolean) a5).booleanValue();
                        Object a6 = call.a("numerator");
                        kotlin.jvm.internal.k.b(a6);
                        int intValue3 = ((Number) a6).intValue();
                        Object a7 = call.a("denominator");
                        kotlin.jvm.internal.k.b(a7);
                        int intValue4 = ((Number) a7).intValue();
                        n0 n0Var3 = this.f2710d;
                        kotlin.jvm.internal.k.b(n0Var3);
                        b3 = n0Var3.b(booleanValue, intValue3, intValue4);
                        result.a(Boolean.valueOf(b3));
                        break;
                    }
                    break;
                case 466045282:
                    if (str.equals("setIsPlaying")) {
                        Object b4 = call.b();
                        kotlin.jvm.internal.k.b(b4);
                        boolean booleanValue2 = ((Boolean) b4).booleanValue();
                        n0 n0Var4 = this.f2710d;
                        kotlin.jvm.internal.k.b(n0Var4);
                        n0Var4.i(booleanValue2);
                        result.a(null);
                        break;
                    }
                    break;
                case 1465483232:
                    if (str.equals("hasPipMode")) {
                        b3 = a();
                        result.a(Boolean.valueOf(b3));
                        break;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        n0 n0Var5 = this.f2710d;
                        if (n0Var5 != null) {
                            kotlin.jvm.internal.k.b(n0Var5);
                            n0Var5.a();
                            this.f2710d = null;
                        }
                        result.a(null);
                        break;
                    }
                    break;
            }
            return;
        }
        result.b();
    }

    @Override // t0.a
    public void n() {
    }
}
