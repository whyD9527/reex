package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public class g {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f1489a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f1490b;

        @Deprecated
        public a(int i2, b[] bVarArr) {
            this.f1489a = i2;
            this.f1490b = bVarArr;
        }

        static a a(int i2, b[] bVarArr) {
            return new a(i2, bVarArr);
        }

        public b[] b() {
            return this.f1490b;
        }

        public int c() {
            return this.f1489a;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f1491a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1492b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1493c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1494d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1495e;

        @Deprecated
        public b(Uri uri, int i2, int i3, boolean z2, int i4) {
            this.f1491a = (Uri) androidx.core.util.e.b(uri);
            this.f1492b = i2;
            this.f1493c = i3;
            this.f1494d = z2;
            this.f1495e = i4;
        }

        static b a(Uri uri, int i2, int i3, boolean z2, int i4) {
            return new b(uri, i2, i3, z2, i4);
        }

        public int b() {
            return this.f1495e;
        }

        public int c() {
            return this.f1492b;
        }

        public Uri d() {
            return this.f1491a;
        }

        public int e() {
            return this.f1493c;
        }

        public boolean f() {
            return this.f1494d;
        }
    }

    public static class c {
        public void a(int i2) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, e eVar, int i2, boolean z2, int i3, Handler handler, c cVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(cVar, handler);
        return z2 ? f.e(context, eVar, aVar, i2, i3) : f.d(context, eVar, i2, null, aVar);
    }
}
