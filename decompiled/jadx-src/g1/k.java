package g1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class k<T> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f2859e = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        public final Throwable f2860e;

        public b(Throwable exception) {
            kotlin.jvm.internal.k.e(exception, "exception");
            this.f2860e = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.k.a(this.f2860e, ((b) obj).f2860e);
        }

        public int hashCode() {
            return this.f2860e.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f2860e + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f2860e;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
