package h0;

import android.content.Context;
import android.os.Vibrator;
import s0.a;
import z0.k;

/* loaded from: classes.dex */
public class e implements s0.a {

    /* renamed from: a, reason: collision with root package name */
    private k f2904a;

    private void a(z0.c cVar, Context context) {
        d dVar = new d(new c((Vibrator) context.getSystemService("vibrator")));
        k kVar = new k(cVar, "vibration");
        this.f2904a = kVar;
        kVar.e(dVar);
    }

    private void b() {
        this.f2904a.e(null);
        this.f2904a = null;
    }

    @Override // s0.a
    public void h(a.b bVar) {
        a(bVar.b(), bVar.a());
    }

    @Override // s0.a
    public void l(a.b bVar) {
        b();
    }
}
