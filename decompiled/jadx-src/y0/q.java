package y0;

import java.util.HashMap;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final z0.a<Object> f4675a;

    public q(o0.a aVar) {
        this.f4675a = new z0.a<>(aVar, "flutter/system", z0.f.f4752a);
    }

    public void a() {
        n0.b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f4675a.c(hashMap);
    }
}
