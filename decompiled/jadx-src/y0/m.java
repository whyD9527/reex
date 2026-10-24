package y0;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Map;
import z0.k;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final z0.k f4639a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageManager f4640b;

    /* renamed from: c, reason: collision with root package name */
    private b f4641c;

    /* renamed from: d, reason: collision with root package name */
    public final k.c f4642d;

    class a implements k.c {
        a() {
        }

        @Override // z0.k.c
        public void m(z0.j jVar, k.d dVar) {
            if (m.this.f4641c == null) {
                return;
            }
            String str = jVar.f4754a;
            Object obj = jVar.f4755b;
            str.hashCode();
            try {
                if (str.equals("ProcessText.processTextAction")) {
                    ArrayList arrayList = (ArrayList) obj;
                    m.this.f4641c.b((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), dVar);
                } else {
                    if (!str.equals("ProcessText.queryTextActions")) {
                        dVar.b();
                        return;
                    }
                    dVar.a(m.this.f4641c.c());
                }
            } catch (IllegalStateException e3) {
                dVar.c("error", e3.getMessage(), null);
            }
        }
    }

    public interface b {
        void b(String str, String str2, boolean z2, k.d dVar);

        Map<String, String> c();
    }

    public m(o0.a aVar, PackageManager packageManager) {
        a aVar2 = new a();
        this.f4642d = aVar2;
        this.f4640b = packageManager;
        z0.k kVar = new z0.k(aVar, "flutter/processtext", z0.r.f4769b);
        this.f4639a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f4641c = bVar;
    }
}
