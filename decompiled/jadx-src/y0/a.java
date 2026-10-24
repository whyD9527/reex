package y0;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.f;
import java.util.HashMap;
import z0.a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final z0.a<Object> f4509a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f4510b;

    /* renamed from: c, reason: collision with root package name */
    private b f4511c;

    /* renamed from: d, reason: collision with root package name */
    public final a.d<Object> f4512d;

    /* renamed from: y0.a$a, reason: collision with other inner class name */
    class C0072a implements a.d<Object> {
        C0072a() {
        }

        @Override // z0.a.d
        public void a(Object obj, a.e<Object> eVar) {
            HashMap hashMap;
            HashMap hashMap2;
            if (a.this.f4511c == null) {
                eVar.a(null);
                return;
            }
            hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            hashMap2 = (HashMap) hashMap.get("data");
            n0.b.f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            switch (str) {
                case "tooltip":
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        a.this.f4511c.d(str2);
                        break;
                    }
                    break;
                case "announce":
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        a.this.f4511c.a(str3);
                        break;
                    }
                    break;
                case "tap":
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        a.this.f4511c.g(num.intValue());
                        break;
                    }
                    break;
                case "focus":
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        a.this.f4511c.e(num2.intValue());
                        break;
                    }
                    break;
                case "longPress":
                    Integer num3 = (Integer) hashMap.get("nodeId");
                    if (num3 != null) {
                        a.this.f4511c.f(num3.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    public interface b extends FlutterJNI.a {
        void a(String str);

        void d(String str);

        void e(int i2);

        void f(int i2);

        void g(int i2);
    }

    public a(o0.a aVar, FlutterJNI flutterJNI) {
        C0072a c0072a = new C0072a();
        this.f4512d = c0072a;
        z0.a<Object> aVar2 = new z0.a<>(aVar, "flutter/accessibility", z0.q.f4766a);
        this.f4509a = aVar2;
        aVar2.e(c0072a);
        this.f4510b = flutterJNI;
    }

    public void b(int i2, f.g gVar) {
        this.f4510b.dispatchSemanticsAction(i2, gVar);
    }

    public void c(int i2, f.g gVar, Object obj) {
        this.f4510b.dispatchSemanticsAction(i2, gVar, obj);
    }

    public void d() {
        this.f4510b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f4510b.setSemanticsEnabled(true);
    }

    public void f(int i2) {
        this.f4510b.setAccessibilityFeatures(i2);
    }

    public void g(b bVar) {
        this.f4511c = bVar;
        this.f4510b.setAccessibilityDelegate(bVar);
    }
}
