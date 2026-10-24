package e2;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
final class h0 extends z0.q {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2670d = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    @Override // z0.q
    protected void p(ByteArrayOutputStream stream, Object obj) {
        kotlin.jvm.internal.k.e(stream, "stream");
        if (obj instanceof g0) {
            stream.write(128);
            g0 g0Var = (g0) obj;
            p(stream, g0Var.a());
            p(stream, Long.valueOf(g0Var.f()));
            p(stream, g0Var.b());
            p(stream, g0Var.e());
            p(stream, g0Var.g());
            p(stream, g0Var.d());
            p(stream, Long.valueOf(g0Var.c()));
            return;
        }
        if (!(obj instanceof u)) {
            super.p(stream, obj);
            return;
        }
        stream.write(129);
        u uVar = (u) obj;
        p(stream, uVar.e());
        p(stream, Long.valueOf(uVar.k()));
        p(stream, uVar.f());
        p(stream, uVar.j());
        p(stream, uVar.m());
        p(stream, uVar.i());
        p(stream, Long.valueOf(uVar.h()));
        p(stream, Long.valueOf(uVar.g()));
        p(stream, uVar.d());
        p(stream, uVar.a());
        p(stream, uVar.c());
        p(stream, uVar.b());
        p(stream, uVar.l());
    }
}
