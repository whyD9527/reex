package y0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import z0.a;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    private static final a f4654b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final z0.a<Object> f4655a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final ConcurrentLinkedQueue<b> f4656a = new ConcurrentLinkedQueue<>();

        /* renamed from: b, reason: collision with root package name */
        private b f4657b;

        /* renamed from: c, reason: collision with root package name */
        private b f4658c;

        /* renamed from: y0.o$a$a, reason: collision with other inner class name */
        class C0074a implements a.e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f4659a;

            C0074a(b bVar) {
                this.f4659a = bVar;
            }

            @Override // z0.a.e
            public void a(Object obj) {
                a.this.f4656a.remove(this.f4659a);
                if (a.this.f4656a.isEmpty()) {
                    return;
                }
                n0.b.b("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(this.f4659a.f4662a));
            }
        }

        public static class b {

            /* renamed from: c, reason: collision with root package name */
            private static int f4661c = Integer.MIN_VALUE;

            /* renamed from: a, reason: collision with root package name */
            public final int f4662a;

            /* renamed from: b, reason: collision with root package name */
            private final DisplayMetrics f4663b;

            public b(DisplayMetrics displayMetrics) {
                int i2 = f4661c;
                f4661c = i2 + 1;
                this.f4662a = i2;
                this.f4663b = displayMetrics;
            }
        }

        public a.e b(b bVar) {
            this.f4656a.add(bVar);
            b bVar2 = this.f4658c;
            this.f4658c = bVar;
            if (bVar2 == null) {
                return null;
            }
            return new C0074a(bVar2);
        }

        public b c(int i2) {
            b bVar;
            StringBuilder sb;
            String valueOf;
            if (this.f4657b == null) {
                this.f4657b = this.f4656a.poll();
            }
            while (true) {
                bVar = this.f4657b;
                if (bVar == null || bVar.f4662a >= i2) {
                    break;
                }
                this.f4657b = this.f4656a.poll();
            }
            if (bVar == null) {
                sb = new StringBuilder();
                sb.append("Cannot find config with generation: ");
                sb.append(String.valueOf(i2));
                valueOf = ", after exhausting the queue.";
            } else {
                if (bVar.f4662a == i2) {
                    return bVar;
                }
                sb = new StringBuilder();
                sb.append("Cannot find config with generation: ");
                sb.append(String.valueOf(i2));
                sb.append(", the oldest config is now: ");
                valueOf = String.valueOf(this.f4657b.f4662a);
            }
            sb.append(valueOf);
            n0.b.b("SettingsChannel", sb.toString());
            return null;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final z0.a<Object> f4664a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, Object> f4665b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private DisplayMetrics f4666c;

        b(z0.a<Object> aVar) {
            this.f4664a = aVar;
        }

        public void a() {
            n0.b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f4665b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f4665b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f4665b.get("platformBrightness"));
            DisplayMetrics displayMetrics = this.f4666c;
            if (!o.c() || displayMetrics == null) {
                this.f4664a.c(this.f4665b);
                return;
            }
            a.b bVar = new a.b(displayMetrics);
            a.e<Object> b3 = o.f4654b.b(bVar);
            this.f4665b.put("configurationId", Integer.valueOf(bVar.f4662a));
            this.f4664a.d(this.f4665b, b3);
        }

        public b b(boolean z2) {
            this.f4665b.put("brieflyShowPassword", Boolean.valueOf(z2));
            return this;
        }

        public b c(DisplayMetrics displayMetrics) {
            this.f4666c = displayMetrics;
            return this;
        }

        public b d(boolean z2) {
            this.f4665b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
            return this;
        }

        public b e(c cVar) {
            this.f4665b.put("platformBrightness", cVar.f4670e);
            return this;
        }

        public b f(float f2) {
            this.f4665b.put("textScaleFactor", Float.valueOf(f2));
            return this;
        }

        public b g(boolean z2) {
            this.f4665b.put("alwaysUse24HourFormat", Boolean.valueOf(z2));
            return this;
        }
    }

    public enum c {
        light("light"),
        dark("dark");


        /* renamed from: e, reason: collision with root package name */
        public String f4670e;

        c(String str) {
            this.f4670e = str;
        }
    }

    public o(o0.a aVar) {
        this.f4655a = new z0.a<>(aVar, "flutter/settings", z0.f.f4752a);
    }

    public static DisplayMetrics b(int i2) {
        a.b c3 = f4654b.c(i2);
        if (c3 == null) {
            return null;
        }
        return c3.f4663b;
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public b d() {
        return new b(this.f4655a);
    }
}
