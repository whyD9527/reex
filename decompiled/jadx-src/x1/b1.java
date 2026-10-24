package x1;

import j1.g;
import java.io.Closeable;

/* loaded from: classes.dex */
public abstract class b1 extends f0 implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final a f4391f = new a(null);

    public static final class a extends j1.b<f0, b1> {

        /* renamed from: x1.b1$a$a, reason: collision with other inner class name */
        static final class C0069a extends kotlin.jvm.internal.l implements q1.l<g.b, b1> {

            /* renamed from: e, reason: collision with root package name */
            public static final C0069a f4392e = new C0069a();

            C0069a() {
                super(1);
            }

            @Override // q1.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b1 invoke(g.b bVar) {
                if (bVar instanceof b1) {
                    return (b1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(f0.f4404e, C0069a.f4392e);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }
}
