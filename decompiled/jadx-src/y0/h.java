package y0;

import java.util.HashMap;
import z0.k;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final z0.k f4543a;

    /* renamed from: b, reason: collision with root package name */
    private b f4544b;

    /* renamed from: c, reason: collision with root package name */
    private final k.c f4545c;

    class a implements k.c {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
        
            return;
         */
        @Override // z0.k.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m(z0.j jVar, k.d dVar) {
            if (h.this.f4544b == null) {
                return;
            }
            String str = jVar.f4754a;
            n0.b.f("MouseCursorChannel", "Received '" + str + "' message.");
            char c3 = 65535;
            try {
                if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                    c3 = 0;
                }
                try {
                    h.this.f4544b.a((String) ((HashMap) jVar.f4755b).get("kind"));
                    dVar.a(Boolean.TRUE);
                } catch (Exception e3) {
                    dVar.c("error", "Error when setting cursors: " + e3.getMessage(), null);
                }
            } catch (Exception e4) {
                dVar.c("error", "Unhandled error: " + e4.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public h(o0.a aVar) {
        a aVar2 = new a();
        this.f4545c = aVar2;
        z0.k kVar = new z0.k(aVar, "flutter/mousecursor", z0.r.f4769b);
        this.f4543a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f4544b = bVar;
    }
}
