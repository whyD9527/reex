package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f3142b;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f3143a = new HashMap();

    b() {
    }

    public static b b() {
        if (f3142b == null) {
            f3142b = new b();
        }
        return f3142b;
    }

    public a a(String str) {
        return this.f3143a.get(str);
    }

    public void c(String str, a aVar) {
        if (aVar != null) {
            this.f3143a.put(str, aVar);
        } else {
            this.f3143a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
