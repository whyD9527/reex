package y1;

import android.os.Handler;
import android.os.Looper;
import g1.q;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.k;
import x1.o1;
import x1.s0;

/* loaded from: classes.dex */
public final class a extends b {
    private volatile a _immediate;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f4723f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4724g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f4725h;

    /* renamed from: i, reason: collision with root package name */
    private final a f4726i;

    public a(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ a(Handler handler, String str, int i2, g gVar) {
        this(handler, (i2 & 2) != 0 ? null : str);
    }

    private a(Handler handler, String str, boolean z2) {
        super(null);
        this.f4723f = handler;
        this.f4724g = str;
        this.f4725h = z2;
        this._immediate = z2 ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
            q qVar = q.f2865a;
        }
        this.f4726i = aVar;
    }

    private final void r(j1.g gVar, Runnable runnable) {
        o1.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        s0.b().i(gVar, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f4723f == this.f4723f;
    }

    public int hashCode() {
        return System.identityHashCode(this.f4723f);
    }

    @Override // x1.f0
    public void i(j1.g gVar, Runnable runnable) {
        if (this.f4723f.post(runnable)) {
            return;
        }
        r(gVar, runnable);
    }

    @Override // x1.f0
    public boolean o(j1.g gVar) {
        return (this.f4725h && k.a(Looper.myLooper(), this.f4723f.getLooper())) ? false : true;
    }

    @Override // x1.u1
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public a p() {
        return this.f4726i;
    }

    @Override // x1.u1, x1.f0
    public String toString() {
        String q2 = q();
        if (q2 != null) {
            return q2;
        }
        String str = this.f4724g;
        if (str == null) {
            str = this.f4723f.toString();
        }
        return this.f4725h ? k.j(str, ".immediate") : str;
    }
}
