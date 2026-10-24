package d2;

import android.view.Surface;
import io.flutter.view.TextureRegistry;
import java.util.List;
import l.d;
import s0.a;
import xyz.lhtls.mpv_client.MPVJniUtils;
import z0.j;
import z0.k;

/* loaded from: classes.dex */
public final class b implements s0.a, k.c {

    /* renamed from: a, reason: collision with root package name */
    private k f2567a;

    /* renamed from: b, reason: collision with root package name */
    private TextureRegistry f2568b;

    /* renamed from: c, reason: collision with root package name */
    private final d<a> f2569c = new d<>();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TextureRegistry.SurfaceTextureEntry f2570a;

        /* renamed from: b, reason: collision with root package name */
        private final long f2571b;

        public a(TextureRegistry.SurfaceTextureEntry entry, long j2) {
            kotlin.jvm.internal.k.e(entry, "entry");
            this.f2570a = entry;
            this.f2571b = j2;
        }

        public final TextureRegistry.SurfaceTextureEntry a() {
            return this.f2570a;
        }

        public final long b() {
            return this.f2571b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.k.a(this.f2570a, aVar.f2570a) && this.f2571b == aVar.f2571b;
        }

        public int hashCode() {
            return (this.f2570a.hashCode() * 31) + d2.a.a(this.f2571b);
        }

        public String toString() {
            return "SurfaceTextureEntryData(entry=" + this.f2570a + ", surfacePtr=" + this.f2571b + ')';
        }
    }

    @Override // s0.a
    public void h(a.b flutterPluginBinding) {
        kotlin.jvm.internal.k.e(flutterPluginBinding, "flutterPluginBinding");
        System.loadLibrary("mpvclient");
        System.loadLibrary("mpv");
        MPVJniUtils.f4484a.avJniSetJavaVM();
        this.f2567a = new k(flutterPluginBinding.b(), "xyz.lhtls.mpv_client");
        TextureRegistry c3 = flutterPluginBinding.c();
        kotlin.jvm.internal.k.d(c3, "flutterPluginBinding.textureRegistry");
        this.f2568b = c3;
        k kVar = this.f2567a;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(this);
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        k kVar = this.f2567a;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    @Override // z0.k.c
    public void m(j call, k.d result) {
        List e3;
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        String str = call.f4754a;
        if (str != null) {
            int hashCode = str.hashCode();
            TextureRegistry textureRegistry = null;
            if (hashCode != -1259315875) {
                if (hashCode != -458266394) {
                    if (hashCode == 649959338 && str.equals("SurfaceTextureEntry.setDefaultBufferSize")) {
                        Object a3 = call.a("id");
                        kotlin.jvm.internal.k.b(a3);
                        long longValue = ((Number) a3).longValue();
                        Object a4 = call.a("width");
                        kotlin.jvm.internal.k.b(a4);
                        int intValue = ((Number) a4).intValue();
                        Object a5 = call.a("height");
                        kotlin.jvm.internal.k.b(a5);
                        int intValue2 = ((Number) a5).intValue();
                        a e4 = this.f2569c.e(longValue);
                        kotlin.jvm.internal.k.b(e4);
                        e4.a().surfaceTexture().setDefaultBufferSize(intValue, intValue2);
                        result.a(null);
                        return;
                    }
                } else if (str.equals("SurfaceTextureEntry.create")) {
                    TextureRegistry textureRegistry2 = this.f2568b;
                    if (textureRegistry2 == null) {
                        kotlin.jvm.internal.k.o("textureRegistry");
                    } else {
                        textureRegistry = textureRegistry2;
                    }
                    TextureRegistry.SurfaceTextureEntry c3 = textureRegistry.c();
                    kotlin.jvm.internal.k.d(c3, "textureRegistry.createSurfaceTexture()");
                    long newGlobalNativePtr = MPVJniUtils.f4484a.newGlobalNativePtr(new Surface(c3.surfaceTexture()));
                    this.f2569c.h(c3.id(), new a(c3, newGlobalNativePtr));
                    e3 = h1.j.e(Long.valueOf(c3.id()), Long.valueOf(newGlobalNativePtr));
                    result.a(e3);
                    return;
                }
            } else if (str.equals("SurfaceTextureEntry.release")) {
                Object b3 = call.b();
                kotlin.jvm.internal.k.b(b3);
                long longValue2 = ((Number) b3).longValue();
                a e5 = this.f2569c.e(longValue2);
                kotlin.jvm.internal.k.b(e5);
                MPVJniUtils.f4484a.deleteGlobalNativePtr(e5.b());
                this.f2569c.i(longValue2);
                result.a(null);
                return;
            }
        }
        result.b();
    }
}
