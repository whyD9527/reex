package x1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class z {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4480b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4481a;

    public z(Throwable th, boolean z2) {
        this.f4481a = th;
        this._handled = z2 ? 1 : 0;
    }

    public /* synthetic */ z(Throwable th, boolean z2, int i2, kotlin.jvm.internal.g gVar) {
        this(th, (i2 & 2) != 0 ? false : z2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f4480b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return m0.a(this) + '[' + this.f4481a + ']';
    }
}
