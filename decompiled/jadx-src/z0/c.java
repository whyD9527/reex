package z0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface c {

    public interface a {
        void a(ByteBuffer byteBuffer, b bVar);
    }

    public interface b {
        void a(ByteBuffer byteBuffer);
    }

    /* renamed from: z0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0078c {
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private boolean f4740a = true;

        public boolean a() {
            return this.f4740a;
        }
    }

    InterfaceC0078c a(d dVar);

    InterfaceC0078c b();

    void c(String str, a aVar);

    void d(String str, ByteBuffer byteBuffer, b bVar);

    void e(String str, a aVar, InterfaceC0078c interfaceC0078c);

    void f(String str, ByteBuffer byteBuffer);
}
