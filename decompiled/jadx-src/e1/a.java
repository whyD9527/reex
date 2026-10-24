package e1;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import z0.q;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e1.a$a, reason: collision with other inner class name */
    public static final class C0040a {

        /* renamed from: a, reason: collision with root package name */
        private Boolean f2631a;

        C0040a() {
        }

        static C0040a a(ArrayList<Object> arrayList) {
            C0040a c0040a = new C0040a();
            c0040a.c((Boolean) arrayList.get(0));
            return c0040a;
        }

        public Boolean b() {
            return this.f2631a;
        }

        public void c(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            this.f2631a = bool;
        }

        ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f2631a);
            return arrayList;
        }
    }

    public static class b extends RuntimeException {

        /* renamed from: e, reason: collision with root package name */
        public final String f2632e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f2633f;

        public b(String str, String str2, Object obj) {
            super(str2);
            this.f2632e = str;
            this.f2633f = obj;
        }
    }

    public interface c {
        Boolean a(String str);

        void b();

        Boolean c(String str, Map<String, String> map);

        Boolean d();

        Boolean e(String str, Boolean bool, e eVar, C0040a c0040a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d extends q {

        /* renamed from: d, reason: collision with root package name */
        public static final d f2634d = new d();

        private d() {
        }

        @Override // z0.q
        protected Object g(byte b3, ByteBuffer byteBuffer) {
            return b3 != Byte.MIN_VALUE ? b3 != -127 ? super.g(b3, byteBuffer) : e.a((ArrayList) f(byteBuffer)) : C0040a.a((ArrayList) f(byteBuffer));
        }

        @Override // z0.q
        protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> h2;
            if (obj instanceof C0040a) {
                byteArrayOutputStream.write(128);
                h2 = ((C0040a) obj).d();
            } else if (!(obj instanceof e)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                h2 = ((e) obj).h();
            }
            p(byteArrayOutputStream, h2);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private Boolean f2635a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f2636b;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, String> f2637c;

        e() {
        }

        static e a(ArrayList<Object> arrayList) {
            e eVar = new e();
            eVar.f((Boolean) arrayList.get(0));
            eVar.e((Boolean) arrayList.get(1));
            eVar.g((Map) arrayList.get(2));
            return eVar;
        }

        public Boolean b() {
            return this.f2636b;
        }

        public Boolean c() {
            return this.f2635a;
        }

        public Map<String, String> d() {
            return this.f2637c;
        }

        public void e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            this.f2636b = bool;
        }

        public void f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
            }
            this.f2635a = bool;
        }

        public void g(Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            this.f2637c = map;
        }

        ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f2635a);
            arrayList.add(this.f2636b);
            arrayList.add(this.f2637c);
            return arrayList;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof b) {
            b bVar = (b) th;
            arrayList.add(bVar.f2632e);
            arrayList.add(bVar.getMessage());
            obj = bVar.f2633f;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
