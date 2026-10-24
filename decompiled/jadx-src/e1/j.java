package e1;

import android.util.Log;
import s0.a;

/* loaded from: classes.dex */
public final class j implements s0.a, t0.a {

    /* renamed from: a, reason: collision with root package name */
    private i f2647a;

    @Override // t0.a
    public void e() {
        i iVar = this.f2647a;
        if (iVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            iVar.l(null);
        }
    }

    @Override // s0.a
    public void h(a.b bVar) {
        this.f2647a = new i(bVar.a());
        g.g(bVar.b(), this.f2647a);
    }

    @Override // t0.a
    public void i(t0.c cVar) {
        j(cVar);
    }

    @Override // t0.a
    public void j(t0.c cVar) {
        i iVar = this.f2647a;
        if (iVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            iVar.l(cVar.d());
        }
    }

    @Override // s0.a
    public void l(a.b bVar) {
        if (this.f2647a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            g.g(bVar.b(), null);
            this.f2647a = null;
        }
    }

    @Override // t0.a
    public void n() {
        e();
    }
}
