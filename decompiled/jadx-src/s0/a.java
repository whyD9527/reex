package s0;

import android.content.Context;
import io.flutter.embedding.engine.d;
import io.flutter.plugin.platform.k;
import io.flutter.view.TextureRegistry;
import z0.c;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: s0.a$a, reason: collision with other inner class name */
    public interface InterfaceC0064a {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4297a;

        /* renamed from: b, reason: collision with root package name */
        private final io.flutter.embedding.engine.a f4298b;

        /* renamed from: c, reason: collision with root package name */
        private final c f4299c;

        /* renamed from: d, reason: collision with root package name */
        private final TextureRegistry f4300d;

        /* renamed from: e, reason: collision with root package name */
        private final k f4301e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC0064a f4302f;

        /* renamed from: g, reason: collision with root package name */
        private final d f4303g;

        public b(Context context, io.flutter.embedding.engine.a aVar, c cVar, TextureRegistry textureRegistry, k kVar, InterfaceC0064a interfaceC0064a, d dVar) {
            this.f4297a = context;
            this.f4298b = aVar;
            this.f4299c = cVar;
            this.f4300d = textureRegistry;
            this.f4301e = kVar;
            this.f4302f = interfaceC0064a;
            this.f4303g = dVar;
        }

        public Context a() {
            return this.f4297a;
        }

        public c b() {
            return this.f4299c;
        }

        public TextureRegistry c() {
            return this.f4300d;
        }
    }

    void h(b bVar);

    void l(b bVar);
}
