package e2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import s0.a;
import z0.d;

/* loaded from: classes.dex */
public final class s extends BroadcastReceiver implements s0.a, d.InterfaceC0079d {

    /* renamed from: a, reason: collision with root package name */
    private z0.d f2746a;

    /* renamed from: b, reason: collision with root package name */
    private Context f2747b;

    /* renamed from: c, reason: collision with root package name */
    private d.b f2748c;

    @Override // z0.d.InterfaceC0079d
    public void a(Object obj, d.b bVar) {
        this.f2748c = bVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        Context context = this.f2747b;
        if (context == null) {
            kotlin.jvm.internal.k.o("applicationContext");
            context = null;
        }
        context.registerReceiver(this, intentFilter);
    }

    @Override // z0.d.InterfaceC0079d
    public void b(Object obj) {
        Context context = null;
        this.f2748c = null;
        Context context2 = this.f2747b;
        if (context2 == null) {
            kotlin.jvm.internal.k.o("applicationContext");
        } else {
            context = context2;
        }
        context.unregisterReceiver(this);
    }

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        Context a3 = binding.a();
        kotlin.jvm.internal.k.d(a3, "binding.applicationContext");
        this.f2747b = a3;
        z0.d dVar = new z0.d(binding.b(), "xyz.re.player.ex/HeadsetPlugChannel");
        this.f2746a = dVar;
        dVar.d(this);
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.d dVar = this.f2746a;
        if (dVar == null) {
            kotlin.jvm.internal.k.o("eventChannel");
            dVar = null;
        }
        dVar.d(null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra;
        d.b bVar;
        d.b bVar2;
        int i2;
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1676458352) {
                if (!action.equals("android.intent.action.HEADSET_PLUG") || (intExtra = intent.getIntExtra("state", -1)) == -1 || (bVar = this.f2748c) == null) {
                    return;
                }
                bVar.a(Integer.valueOf(intExtra));
                return;
            }
            if (hashCode == 545516589 && action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                if (intExtra2 == 0) {
                    bVar2 = this.f2748c;
                    if (bVar2 == null) {
                        return;
                    } else {
                        i2 = 0;
                    }
                } else if (intExtra2 != 2 || (bVar2 = this.f2748c) == null) {
                    return;
                } else {
                    i2 = 1;
                }
                bVar2.a(Integer.valueOf(i2));
            }
        }
    }
}
