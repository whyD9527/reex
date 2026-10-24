package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static volatile e f3176b;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, d> f3177a = new HashMap();

    e() {
    }

    public static e b() {
        if (f3176b == null) {
            synchronized (e.class) {
                if (f3176b == null) {
                    f3176b = new e();
                }
            }
        }
        return f3176b;
    }

    public d a(String str) {
        return this.f3177a.get(str);
    }
}
