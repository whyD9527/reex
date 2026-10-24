package t1;

import kotlin.jvm.internal.g;

/* loaded from: classes.dex */
public final class c extends t1.a {

    /* renamed from: i, reason: collision with root package name */
    public static final a f4312i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final c f4313j = new c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a() {
            return c.f4313j;
        }
    }

    public c(int i2, int i3) {
        super(i2, i3, 1);
    }

    @Override // t1.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (a() != cVar.a() || b() != cVar.b()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean f(int i2) {
        return a() <= i2 && i2 <= b();
    }

    public Integer g() {
        return Integer.valueOf(b());
    }

    public Integer h() {
        return Integer.valueOf(a());
    }

    @Override // t1.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // t1.a
    public boolean isEmpty() {
        return a() > b();
    }

    @Override // t1.a
    public String toString() {
        return a() + ".." + b();
    }
}
