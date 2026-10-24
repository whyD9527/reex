package kotlinx.coroutines.scheduling;

import java.util.concurrent.RejectedExecutionException;
import x1.b1;
import x1.n0;

/* loaded from: classes.dex */
public class c extends b1 {

    /* renamed from: g, reason: collision with root package name */
    private final int f3740g;

    /* renamed from: h, reason: collision with root package name */
    private final int f3741h;

    /* renamed from: i, reason: collision with root package name */
    private final long f3742i;

    /* renamed from: j, reason: collision with root package name */
    private final String f3743j;

    /* renamed from: k, reason: collision with root package name */
    private a f3744k;

    public c(int i2, int i3, long j2, String str) {
        this.f3740g = i2;
        this.f3741h = i3;
        this.f3742i = j2;
        this.f3743j = str;
        this.f3744k = p();
    }

    public c(int i2, int i3, String str) {
        this(i2, i3, l.f3761e, str);
    }

    public /* synthetic */ c(int i2, int i3, String str, int i4, kotlin.jvm.internal.g gVar) {
        this((i4 & 1) != 0 ? l.f3759c : i2, (i4 & 2) != 0 ? l.f3760d : i3, (i4 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    private final a p() {
        return new a(this.f3740g, this.f3741h, this.f3742i, this.f3743j);
    }

    @Override // x1.f0
    public void i(j1.g gVar, Runnable runnable) {
        try {
            a.f(this.f3744k, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            n0.f4429k.i(gVar, runnable);
        }
    }

    public final void q(Runnable runnable, j jVar, boolean z2) {
        try {
            this.f3744k.e(runnable, jVar, z2);
        } catch (RejectedExecutionException unused) {
            n0.f4429k.E(this.f3744k.c(runnable, jVar));
        }
    }
}
