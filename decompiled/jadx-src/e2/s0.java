package e2;

import android.content.Context;
import android.provider.Settings;
import s0.a;
import z0.k;

/* loaded from: classes.dex */
public final class s0 implements s0.a, k.c {

    /* renamed from: a, reason: collision with root package name */
    private z0.k f2749a;

    /* renamed from: b, reason: collision with root package name */
    private Context f2750b;

    /* renamed from: c, reason: collision with root package name */
    private r0 f2751c;

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.k kVar = new z0.k(binding.b(), "xyz.re.player.ex/SystemVideoPopupView");
        this.f2749a = kVar;
        kVar.e(this);
        Context a3 = binding.a();
        kotlin.jvm.internal.k.d(a3, "binding.applicationContext");
        this.f2750b = a3;
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        r0 r0Var = this.f2751c;
        if (r0Var != null) {
            kotlin.jvm.internal.k.b(r0Var);
            r0Var.m();
        }
        z0.k kVar = this.f2749a;
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
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        String str = call.f4754a;
        if (str != null) {
            Context context = null;
            switch (str.hashCode()) {
                case -1319830319:
                    if (str.equals("setAspectRatio")) {
                        Object b3 = call.b();
                        kotlin.jvm.internal.k.b(b3);
                        double doubleValue = ((Number) b3).doubleValue();
                        r0 r0Var = this.f2751c;
                        kotlin.jvm.internal.k.b(r0Var);
                        r0Var.x(doubleValue);
                        break;
                    }
                    break;
                case -917901449:
                    if (str.equals("canDrawOverlays")) {
                        Context context2 = this.f2750b;
                        if (context2 == null) {
                            kotlin.jvm.internal.k.o("context");
                        } else {
                            context = context2;
                        }
                        result.a(Boolean.valueOf(Settings.canDrawOverlays(context)));
                        return;
                    }
                    break;
                case 3237136:
                    if (str.equals("init")) {
                        if (this.f2751c == null) {
                            Context context3 = this.f2750b;
                            if (context3 == null) {
                                kotlin.jvm.internal.k.o("context");
                                context3 = null;
                            }
                            z0.k kVar = this.f2749a;
                            if (kVar == null) {
                                kotlin.jvm.internal.k.o("channel");
                                kVar = null;
                            }
                            r0 r0Var2 = new r0(context3, kVar);
                            this.f2751c = r0Var2;
                            kotlin.jvm.internal.k.b(r0Var2);
                            r0Var2.r();
                            break;
                        }
                    }
                    break;
                case 3529469:
                    if (str.equals("show")) {
                        Object a3 = call.a("aspectRatio");
                        kotlin.jvm.internal.k.b(a3);
                        double doubleValue2 = ((Number) a3).doubleValue();
                        Object a4 = call.a("position");
                        kotlin.jvm.internal.k.b(a4);
                        int intValue = ((Number) a4).intValue();
                        Object a5 = call.a("duration");
                        kotlin.jvm.internal.k.b(a5);
                        int intValue2 = ((Number) a5).intValue();
                        Object a6 = call.a("thumbColor");
                        kotlin.jvm.internal.k.b(a6);
                        int intValue3 = ((Number) a6).intValue();
                        Object a7 = call.a("progressColor");
                        kotlin.jvm.internal.k.b(a7);
                        int intValue4 = ((Number) a7).intValue();
                        r0 r0Var3 = this.f2751c;
                        kotlin.jvm.internal.k.b(r0Var3);
                        r0Var3.z(doubleValue2, intValue, intValue2, intValue3, intValue4);
                        break;
                    }
                    break;
                case 988242095:
                    if (str.equals("setProgress")) {
                        Object a8 = call.a("position");
                        kotlin.jvm.internal.k.b(a8);
                        int intValue5 = ((Number) a8).intValue();
                        Object a9 = call.a("duration");
                        kotlin.jvm.internal.k.b(a9);
                        int intValue6 = ((Number) a9).intValue();
                        r0 r0Var4 = this.f2751c;
                        kotlin.jvm.internal.k.b(r0Var4);
                        r0Var4.y(intValue5, intValue6);
                        break;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        r0 r0Var5 = this.f2751c;
                        if (r0Var5 != null) {
                            kotlin.jvm.internal.k.b(r0Var5);
                            r0Var5.m();
                            this.f2751c = null;
                            break;
                        }
                    }
                    break;
            }
            result.a(null);
            return;
        }
        result.b();
    }
}
