package o0;

import android.os.Handler;
import android.os.Looper;
import o0.c;

/* loaded from: classes.dex */
public class g implements c.d {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f3997a = f1.a.a(Looper.getMainLooper());

    @Override // o0.c.d
    public void a(Runnable runnable) {
        this.f3997a.post(runnable);
    }
}
