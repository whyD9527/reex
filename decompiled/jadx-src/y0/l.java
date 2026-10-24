package y0;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y0.l;
import z0.k;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final z0.k f4601a;

    /* renamed from: b, reason: collision with root package name */
    private g f4602b;

    /* renamed from: c, reason: collision with root package name */
    private final k.c f4603c;

    class a implements k.c {
        a() {
        }

        private void b(z0.j jVar, k.d dVar) {
            try {
                l.this.f4602b.e(((Integer) jVar.b()).intValue());
                dVar.a(null);
            } catch (IllegalStateException e3) {
                dVar.c("error", l.c(e3), null);
            }
        }

        private void c(z0.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            boolean z2 = true;
            boolean z3 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z3) {
                    l.this.f4602b.g(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, wrap));
                } else {
                    if (!map.containsKey("hybridFallback") || !((Boolean) map.get("hybridFallback")).booleanValue()) {
                        z2 = false;
                    }
                    long h2 = l.this.f4602b.h(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z2 ? d.a.TEXTURE_WITH_HYBRID_FALLBACK : d.a.TEXTURE_WITH_VIRTUAL_FALLBACK, wrap));
                    if (h2 != -2) {
                        dVar.a(Long.valueOf(h2));
                        return;
                    } else if (!z2) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                }
                dVar.a(null);
            } catch (IllegalStateException e3) {
                dVar.c("error", l.c(e3), null);
            }
        }

        private void d(z0.j jVar, k.d dVar) {
            try {
                l.this.f4602b.i(((Integer) ((Map) jVar.b()).get("id")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e3) {
                dVar.c("error", l.c(e3), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(k.d dVar, c cVar) {
            if (cVar == null) {
                dVar.c("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(cVar.f4605a));
            hashMap.put("height", Double.valueOf(cVar.f4606b));
            dVar.a(hashMap);
        }

        private void f(z0.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                l.this.f4602b.c(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a(null);
            } catch (IllegalStateException e3) {
                dVar.c("error", l.c(e3), null);
            }
        }

        private void g(z0.j jVar, final k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                l.this.f4602b.f(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: y0.k
                    @Override // y0.l.b
                    public final void a(l.c cVar) {
                        l.a.e(k.d.this, cVar);
                    }
                });
            } catch (IllegalStateException e3) {
                dVar.c("error", l.c(e3), null);
            }
        }

        private void h(z0.j jVar, k.d dVar) {
            Map map = (Map) jVar.b();
            try {
                l.this.f4602b.d(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e3) {
                dVar.c("error", l.c(e3), null);
            }
        }

        private void i(z0.j jVar, k.d dVar) {
            try {
                l.this.f4602b.a(((Boolean) jVar.b()).booleanValue());
                dVar.a(null);
            } catch (IllegalStateException e3) {
                dVar.c("error", l.c(e3), null);
            }
        }

        private void j(z0.j jVar, k.d dVar) {
            k.d dVar2;
            List list = (List) jVar.b();
            try {
                l.this.f4602b.b(new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e3) {
                e = e3;
                dVar2 = dVar;
            }
            try {
                dVar2.a(null);
            } catch (IllegalStateException e4) {
                e = e4;
                dVar2.c("error", l.c(e), null);
            }
        }

        @Override // z0.k.c
        public void m(z0.j jVar, k.d dVar) {
            if (l.this.f4602b == null) {
            }
            n0.b.f("PlatformViewsChannel", "Received '" + jVar.f4754a + "' message.");
            String str = jVar.f4754a;
            str.hashCode();
            switch (str) {
                case "create":
                    c(jVar, dVar);
                    break;
                case "offset":
                    f(jVar, dVar);
                    break;
                case "resize":
                    g(jVar, dVar);
                    break;
                case "clearFocus":
                    b(jVar, dVar);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    i(jVar, dVar);
                    break;
                case "touch":
                    j(jVar, dVar);
                    break;
                case "setDirection":
                    h(jVar, dVar);
                    break;
                case "dispose":
                    d(jVar, dVar);
                    break;
                default:
                    dVar.b();
                    break;
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f4605a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4606b;

        public c(int i2, int i3) {
            this.f4605a = i2;
            this.f4606b = i3;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f4607a;

        /* renamed from: b, reason: collision with root package name */
        public final String f4608b;

        /* renamed from: c, reason: collision with root package name */
        public final double f4609c;

        /* renamed from: d, reason: collision with root package name */
        public final double f4610d;

        /* renamed from: e, reason: collision with root package name */
        public final double f4611e;

        /* renamed from: f, reason: collision with root package name */
        public final double f4612f;

        /* renamed from: g, reason: collision with root package name */
        public final int f4613g;

        /* renamed from: h, reason: collision with root package name */
        public final a f4614h;

        /* renamed from: i, reason: collision with root package name */
        public final ByteBuffer f4615i;

        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i2, String str, double d3, double d4, double d5, double d6, int i3, a aVar, ByteBuffer byteBuffer) {
            this.f4607a = i2;
            this.f4608b = str;
            this.f4611e = d3;
            this.f4612f = d4;
            this.f4609c = d5;
            this.f4610d = d6;
            this.f4613g = i3;
            this.f4614h = aVar;
            this.f4615i = byteBuffer;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f4620a;

        /* renamed from: b, reason: collision with root package name */
        public final double f4621b;

        /* renamed from: c, reason: collision with root package name */
        public final double f4622c;

        public e(int i2, double d3, double d4) {
            this.f4620a = i2;
            this.f4621b = d3;
            this.f4622c = d4;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f4623a;

        /* renamed from: b, reason: collision with root package name */
        public final Number f4624b;

        /* renamed from: c, reason: collision with root package name */
        public final Number f4625c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4626d;

        /* renamed from: e, reason: collision with root package name */
        public final int f4627e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f4628f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f4629g;

        /* renamed from: h, reason: collision with root package name */
        public final int f4630h;

        /* renamed from: i, reason: collision with root package name */
        public final int f4631i;

        /* renamed from: j, reason: collision with root package name */
        public final float f4632j;

        /* renamed from: k, reason: collision with root package name */
        public final float f4633k;

        /* renamed from: l, reason: collision with root package name */
        public final int f4634l;

        /* renamed from: m, reason: collision with root package name */
        public final int f4635m;

        /* renamed from: n, reason: collision with root package name */
        public final int f4636n;

        /* renamed from: o, reason: collision with root package name */
        public final int f4637o;

        /* renamed from: p, reason: collision with root package name */
        public final long f4638p;

        public f(int i2, Number number, Number number2, int i3, int i4, Object obj, Object obj2, int i5, int i6, float f2, float f3, int i7, int i8, int i9, int i10, long j2) {
            this.f4623a = i2;
            this.f4624b = number;
            this.f4625c = number2;
            this.f4626d = i3;
            this.f4627e = i4;
            this.f4628f = obj;
            this.f4629g = obj2;
            this.f4630h = i5;
            this.f4631i = i6;
            this.f4632j = f2;
            this.f4633k = f3;
            this.f4634l = i7;
            this.f4635m = i8;
            this.f4636n = i9;
            this.f4637o = i10;
            this.f4638p = j2;
        }
    }

    public interface g {
        void a(boolean z2);

        void b(f fVar);

        void c(int i2, double d3, double d4);

        void d(int i2, int i3);

        void e(int i2);

        void f(e eVar, b bVar);

        void g(d dVar);

        long h(d dVar);

        void i(int i2);
    }

    public l(o0.a aVar) {
        a aVar2 = new a();
        this.f4603c = aVar2;
        z0.k kVar = new z0.k(aVar, "flutter/platform_views", z0.r.f4769b);
        this.f4601a = kVar;
        kVar.e(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Exception exc) {
        return n0.b.d(exc);
    }

    public void d(int i2) {
        z0.k kVar = this.f4601a;
        if (kVar == null) {
            return;
        }
        kVar.c("viewFocused", Integer.valueOf(i2));
    }

    public void e(g gVar) {
        this.f4602b = gVar;
    }
}
