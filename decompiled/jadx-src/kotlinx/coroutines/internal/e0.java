package kotlinx.coroutines.internal;

import x1.a2;

/* loaded from: classes.dex */
final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final j1.g f3666a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f3667b;

    /* renamed from: c, reason: collision with root package name */
    private final a2<Object>[] f3668c;

    /* renamed from: d, reason: collision with root package name */
    private int f3669d;

    public e0(j1.g gVar, int i2) {
        this.f3666a = gVar;
        this.f3667b = new Object[i2];
        this.f3668c = new a2[i2];
    }

    public final void a(a2<?> a2Var, Object obj) {
        Object[] objArr = this.f3667b;
        int i2 = this.f3669d;
        objArr[i2] = obj;
        a2<Object>[] a2VarArr = this.f3668c;
        this.f3669d = i2 + 1;
        a2VarArr[i2] = a2Var;
    }

    public final void b(j1.g gVar) {
        int length = this.f3668c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            a2<Object> a2Var = this.f3668c[length];
            kotlin.jvm.internal.k.b(a2Var);
            a2Var.m(gVar, this.f3667b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }
}
