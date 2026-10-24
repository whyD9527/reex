package y0;

import java.util.HashMap;
import java.util.Map;
import z0.k;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4644a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f4645b;

    /* renamed from: c, reason: collision with root package name */
    private z0.k f4646c;

    /* renamed from: d, reason: collision with root package name */
    private k.d f4647d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4648e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4649f;

    /* renamed from: g, reason: collision with root package name */
    private final k.c f4650g;

    class a implements k.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f4651a;

        a(byte[] bArr) {
            this.f4651a = bArr;
        }

        @Override // z0.k.d
        public void a(Object obj) {
            n.this.f4645b = this.f4651a;
        }

        @Override // z0.k.d
        public void b() {
        }

        @Override // z0.k.d
        public void c(String str, String str2, Object obj) {
            n0.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }
    }

    class b implements k.c {
        b() {
        }

        @Override // z0.k.c
        public void m(z0.j jVar, k.d dVar) {
            Map i2;
            String str = jVar.f4754a;
            Object obj = jVar.f4755b;
            str.hashCode();
            if (str.equals("get")) {
                n.this.f4649f = true;
                if (!n.this.f4648e) {
                    n nVar = n.this;
                    if (nVar.f4644a) {
                        nVar.f4647d = dVar;
                        return;
                    }
                }
                n nVar2 = n.this;
                i2 = nVar2.i(nVar2.f4645b);
            } else if (!str.equals("put")) {
                dVar.b();
                return;
            } else {
                n.this.f4645b = (byte[]) obj;
                i2 = null;
            }
            dVar.a(i2);
        }
    }

    public n(o0.a aVar, boolean z2) {
        this(new z0.k(aVar, "flutter/restoration", z0.r.f4769b), z2);
    }

    n(z0.k kVar, boolean z2) {
        this.f4648e = false;
        this.f4649f = false;
        b bVar = new b();
        this.f4650g = bVar;
        this.f4646c = kVar;
        this.f4644a = z2;
        kVar.e(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void g() {
        this.f4645b = null;
    }

    public byte[] h() {
        return this.f4645b;
    }

    public void j(byte[] bArr) {
        this.f4648e = true;
        k.d dVar = this.f4647d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.f4647d = null;
        } else if (this.f4649f) {
            this.f4646c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f4645b = bArr;
    }
}
