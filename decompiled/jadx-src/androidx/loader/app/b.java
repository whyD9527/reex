package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import l.h;

/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f2002c = false;

    /* renamed from: a, reason: collision with root package name */
    private final g f2003a;

    /* renamed from: b, reason: collision with root package name */
    private final C0030b f2004b;

    public static class a<D> extends l<D> {

        /* renamed from: k, reason: collision with root package name */
        private final int f2005k;

        /* renamed from: l, reason: collision with root package name */
        private final Bundle f2006l;

        /* renamed from: m, reason: collision with root package name */
        private g f2007m;

        @Override // androidx.lifecycle.LiveData
        protected void d() {
            if (b.f2002c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void e() {
            if (b.f2002c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void f(m<? super D> mVar) {
            super.f(mVar);
            this.f2007m = null;
        }

        @Override // androidx.lifecycle.l, androidx.lifecycle.LiveData
        public void g(D d3) {
            super.g(d3);
        }

        a0.a<D> h(boolean z2) {
            if (b.f2002c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2005k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2006l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        void j() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2005k);
            sb.append(" : ");
            androidx.core.util.b.a(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0030b extends q {

        /* renamed from: e, reason: collision with root package name */
        private static final r.a f2008e = new a();

        /* renamed from: c, reason: collision with root package name */
        private h<a> f2009c = new h<>();

        /* renamed from: d, reason: collision with root package name */
        private boolean f2010d = false;

        /* renamed from: androidx.loader.app.b$b$a */
        static class a implements r.a {
            a() {
            }

            @Override // androidx.lifecycle.r.a
            public <T extends q> T a(Class<T> cls) {
                return new C0030b();
            }
        }

        C0030b() {
        }

        static C0030b e(s sVar) {
            return (C0030b) new r(sVar, f2008e).a(C0030b.class);
        }

        @Override // androidx.lifecycle.q
        protected void c() {
            super.c();
            int j2 = this.f2009c.j();
            for (int i2 = 0; i2 < j2; i2++) {
                this.f2009c.k(i2).h(true);
            }
            this.f2009c.b();
        }

        public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2009c.j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f2009c.j(); i2++) {
                    a k2 = this.f2009c.k(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2009c.g(i2));
                    printWriter.print(": ");
                    printWriter.println(k2.toString());
                    k2.i(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            int j2 = this.f2009c.j();
            for (int i2 = 0; i2 < j2; i2++) {
                this.f2009c.k(i2).j();
            }
        }
    }

    b(g gVar, s sVar) {
        this.f2003a = gVar;
        this.f2004b = C0030b.e(sVar);
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2004b.d(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f2004b.f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.b.a(this.f2003a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
