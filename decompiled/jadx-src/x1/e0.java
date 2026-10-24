package x1;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f4400a;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r0.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r0.equals("") != false) goto L21;
     */
    static {
        boolean z2;
        String d3 = kotlinx.coroutines.internal.y.d("kotlinx.coroutines.scheduler");
        if (d3 != null) {
            int hashCode = d3.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3551) {
                    z2 = (hashCode == 109935 && d3.equals("off")) ? false : true;
                }
                throw new IllegalStateException(("System property 'kotlinx.coroutines.scheduler' has unrecognized value '" + ((Object) d3) + '\'').toString());
            }
            f4400a = z2;
        }
        f4400a = z2;
    }

    public static final f0 a() {
        return f4400a ? kotlinx.coroutines.scheduling.b.f3738l : w.f4465g;
    }

    public static final String b(j1.g gVar) {
        return null;
    }

    public static final j1.g c(i0 i0Var, j1.g gVar) {
        j1.g plus = i0Var.e().plus(gVar);
        return (plus == s0.a() || plus.get(j1.e.f3607b) != null) ? plus : plus.plus(s0.a());
    }

    public static final d2<?> d(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof o0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof d2) {
                return (d2) eVar;
            }
        }
        return null;
    }

    public static final d2<?> e(j1.d<?> dVar, j1.g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (!(gVar.get(e2.f4402e) != null)) {
            return null;
        }
        d2<?> d3 = d((kotlin.coroutines.jvm.internal.e) dVar);
        if (d3 != null) {
            d3.y0(gVar, obj);
        }
        return d3;
    }
}
