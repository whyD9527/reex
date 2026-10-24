package x1;

/* loaded from: classes.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4475a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4476b;

    /* renamed from: c, reason: collision with root package name */
    public final q1.l<Throwable, g1.q> f4477c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4478d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f4479e;

    /* JADX WARN: Multi-variable type inference failed */
    public y(Object obj, i iVar, q1.l<? super Throwable, g1.q> lVar, Object obj2, Throwable th) {
        this.f4475a = obj;
        this.f4476b = iVar;
        this.f4477c = lVar;
        this.f4478d = obj2;
        this.f4479e = th;
    }

    public /* synthetic */ y(Object obj, i iVar, q1.l lVar, Object obj2, Throwable th, int i2, kotlin.jvm.internal.g gVar) {
        this(obj, (i2 & 2) != 0 ? null : iVar, (i2 & 4) != 0 ? null : lVar, (i2 & 8) != 0 ? null : obj2, (i2 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ y b(y yVar, Object obj, i iVar, q1.l lVar, Object obj2, Throwable th, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = yVar.f4475a;
        }
        if ((i2 & 2) != 0) {
            iVar = yVar.f4476b;
        }
        i iVar2 = iVar;
        if ((i2 & 4) != 0) {
            lVar = yVar.f4477c;
        }
        q1.l lVar2 = lVar;
        if ((i2 & 8) != 0) {
            obj2 = yVar.f4478d;
        }
        Object obj4 = obj2;
        if ((i2 & 16) != 0) {
            th = yVar.f4479e;
        }
        return yVar.a(obj, iVar2, lVar2, obj4, th);
    }

    public final y a(Object obj, i iVar, q1.l<? super Throwable, g1.q> lVar, Object obj2, Throwable th) {
        return new y(obj, iVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f4479e != null;
    }

    public final void d(m<?> mVar, Throwable th) {
        i iVar = this.f4476b;
        if (iVar != null) {
            mVar.k(iVar, th);
        }
        q1.l<Throwable, g1.q> lVar = this.f4477c;
        if (lVar == null) {
            return;
        }
        mVar.l(lVar, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.k.a(this.f4475a, yVar.f4475a) && kotlin.jvm.internal.k.a(this.f4476b, yVar.f4476b) && kotlin.jvm.internal.k.a(this.f4477c, yVar.f4477c) && kotlin.jvm.internal.k.a(this.f4478d, yVar.f4478d) && kotlin.jvm.internal.k.a(this.f4479e, yVar.f4479e);
    }

    public int hashCode() {
        Object obj = this.f4475a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        i iVar = this.f4476b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        q1.l<Throwable, g1.q> lVar = this.f4477c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f4478d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4479e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f4475a + ", cancelHandler=" + this.f4476b + ", onCancellation=" + this.f4477c + ", idempotentResume=" + this.f4478d + ", cancelCause=" + this.f4479e + ')';
    }
}
