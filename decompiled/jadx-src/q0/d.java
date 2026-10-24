package q0;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import f1.f;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import q0.d;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4213a;

    /* renamed from: b, reason: collision with root package name */
    private c f4214b;

    /* renamed from: c, reason: collision with root package name */
    private long f4215c;

    /* renamed from: d, reason: collision with root package name */
    private q0.b f4216d;

    /* renamed from: e, reason: collision with root package name */
    private FlutterJNI f4217e;

    /* renamed from: f, reason: collision with root package name */
    private ExecutorService f4218f;

    /* renamed from: g, reason: collision with root package name */
    Future<b> f4219g;

    class a implements Callable<b> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f4220a;

        a(Context context) {
            this.f4220a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            d.this.f4217e.prefetchDefaultFontManager();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b call() {
            f f2 = f.f("FlutterLoader initTask");
            try {
                d.a(d.this, this.f4220a);
                d.this.f4217e.loadLibrary();
                d.this.f4217e.updateRefreshRate();
                d.this.f4218f.execute(new Runnable() { // from class: q0.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a.this.c();
                    }
                });
                b bVar = new b(f1.c.d(this.f4220a), f1.c.a(this.f4220a), f1.c.c(this.f4220a), null);
                if (f2 != null) {
                    f2.close();
                }
                return bVar;
            } catch (Throwable th) {
                if (f2 != null) {
                    try {
                        f2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final String f4222a;

        /* renamed from: b, reason: collision with root package name */
        final String f4223b;

        /* renamed from: c, reason: collision with root package name */
        final String f4224c;

        private b(String str, String str2, String str3) {
            this.f4222a = str;
            this.f4223b = str2;
            this.f4224c = str3;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private String f4225a;

        public String a() {
            return this.f4225a;
        }
    }

    public d() {
        this(n0.a.e().d().a());
    }

    public d(FlutterJNI flutterJNI) {
        this(flutterJNI, n0.a.e().b());
    }

    public d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f4213a = false;
        this.f4217e = flutterJNI;
        this.f4218f = executorService;
    }

    static /* synthetic */ e a(d dVar, Context context) {
        dVar.h(context);
        return null;
    }

    private static boolean d() {
        return false;
    }

    private e h(Context context) {
        return null;
    }

    private static boolean j(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean e() {
        return this.f4216d.f4211g;
    }

    public void f(Context context, String[] strArr) {
        if (this.f4213a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f4214b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            f f2 = f.f("FlutterLoader#ensureInitializationComplete");
            try {
                b bVar = this.f4219g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb = new StringBuilder();
                sb.append("--icu-native-lib-path=");
                sb.append(this.f4216d.f4210f);
                String str = File.separator;
                sb.append(str);
                sb.append("libflutter.so");
                arrayList.add(sb.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=" + this.f4216d.f4205a);
                arrayList.add("--aot-shared-library-name=" + this.f4216d.f4210f + str + this.f4216d.f4205a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--cache-dir-path=");
                sb2.append(bVar.f4223b);
                arrayList.add(sb2.toString());
                if (this.f4216d.f4209e != null) {
                    arrayList.add("--domain-network-policy=" + this.f4216d.f4209e);
                }
                if (this.f4214b.a() != null) {
                    arrayList.add("--log-tag=" + this.f4214b.a());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i2 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i2 == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i2 = (int) ((r6.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i2);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 12 * 4));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                        arrayList.add("--enable-impeller");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", d())) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                }
                arrayList.add("--leak-vm=" + (j(bundle) ? "true" : "false"));
                this.f4217e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f4222a, bVar.f4223b, SystemClock.uptimeMillis() - this.f4215c);
                this.f4213a = true;
                if (f2 != null) {
                    f2.close();
                }
            } finally {
            }
        } catch (Exception e3) {
            n0.b.c("FlutterLoader", "Flutter initialization failed.", e3);
            throw new RuntimeException(e3);
        }
    }

    public String g() {
        return this.f4216d.f4208d;
    }

    public boolean i() {
        return this.f4213a;
    }

    public void k(Context context) {
        l(context, new c());
    }

    public void l(Context context, c cVar) {
        if (this.f4214b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        f f2 = f.f("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f4214b = cVar;
            this.f4215c = SystemClock.uptimeMillis();
            this.f4216d = q0.a.e(applicationContext);
            p.f((DisplayManager) applicationContext.getSystemService("display"), this.f4217e).g();
            this.f4219g = this.f4218f.submit(new a(applicationContext));
            if (f2 != null) {
                f2.close();
            }
        } catch (Throwable th) {
            if (f2 != null) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
