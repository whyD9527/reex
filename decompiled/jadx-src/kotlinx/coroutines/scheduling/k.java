package kotlinx.coroutines.scheduling;

import x1.m0;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f3756g;

    public k(Runnable runnable, long j2, j jVar) {
        super(j2, jVar);
        this.f3756g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f3756g.run();
        } finally {
            this.f3755f.a();
        }
    }

    public String toString() {
        return "Task[" + m0.a(this.f3756g) + '@' + m0.b(this.f3756g) + ", " + this.f3754e + ", " + this.f3755f + ']';
    }
}
