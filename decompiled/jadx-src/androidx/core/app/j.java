package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class j {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f1303a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f1304b;

        /* renamed from: c, reason: collision with root package name */
        private final j0[] f1305c;

        /* renamed from: d, reason: collision with root package name */
        private final j0[] f1306d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f1307e;

        /* renamed from: f, reason: collision with root package name */
        boolean f1308f;

        /* renamed from: g, reason: collision with root package name */
        private final int f1309g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f1310h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f1311i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f1312j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f1313k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f1314l;

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.g(null, "", i2) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, j0[] j0VarArr, j0[] j0VarArr2, boolean z2, int i2, boolean z3, boolean z4, boolean z5) {
            this.f1308f = true;
            this.f1304b = iconCompat;
            if (iconCompat != null && iconCompat.j() == 2) {
                this.f1311i = iconCompat.h();
            }
            this.f1312j = c.e(charSequence);
            this.f1313k = pendingIntent;
            this.f1303a = bundle == null ? new Bundle() : bundle;
            this.f1305c = j0VarArr;
            this.f1306d = j0VarArr2;
            this.f1307e = z2;
            this.f1309g = i2;
            this.f1308f = z3;
            this.f1310h = z4;
            this.f1314l = z5;
        }

        public PendingIntent a() {
            return this.f1313k;
        }

        public boolean b() {
            return this.f1307e;
        }

        public Bundle c() {
            return this.f1303a;
        }

        public IconCompat d() {
            int i2;
            if (this.f1304b == null && (i2 = this.f1311i) != 0) {
                this.f1304b = IconCompat.g(null, "", i2);
            }
            return this.f1304b;
        }

        public j0[] e() {
            return this.f1305c;
        }

        public int f() {
            return this.f1309g;
        }

        public boolean g() {
            return this.f1308f;
        }

        public CharSequence h() {
            return this.f1312j;
        }

        public boolean i() {
            return this.f1314l;
        }

        public boolean j() {
            return this.f1310h;
        }
    }

    public static final class b {
        public static Notification.BubbleMetadata a(b bVar) {
            return null;
        }
    }

    public static class c {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        String M;
        long N;
        boolean Q;
        Notification R;
        boolean S;
        Object T;

        @Deprecated
        public ArrayList<String> U;

        /* renamed from: a, reason: collision with root package name */
        public Context f1315a;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f1319e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f1320f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f1321g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f1322h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f1323i;

        /* renamed from: j, reason: collision with root package name */
        Bitmap f1324j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f1325k;

        /* renamed from: l, reason: collision with root package name */
        int f1326l;

        /* renamed from: m, reason: collision with root package name */
        int f1327m;

        /* renamed from: o, reason: collision with root package name */
        boolean f1329o;

        /* renamed from: p, reason: collision with root package name */
        d f1330p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f1331q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f1332r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f1333s;

        /* renamed from: t, reason: collision with root package name */
        int f1334t;

        /* renamed from: u, reason: collision with root package name */
        int f1335u;

        /* renamed from: v, reason: collision with root package name */
        boolean f1336v;

        /* renamed from: w, reason: collision with root package name */
        String f1337w;

        /* renamed from: x, reason: collision with root package name */
        boolean f1338x;

        /* renamed from: y, reason: collision with root package name */
        String f1339y;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f1316b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<i0> f1317c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        ArrayList<a> f1318d = new ArrayList<>();

        /* renamed from: n, reason: collision with root package name */
        boolean f1328n = true;

        /* renamed from: z, reason: collision with root package name */
        boolean f1340z = false;
        int E = 0;
        int F = 0;
        int L = 0;
        int O = 0;
        int P = 0;

        public c(Context context, String str) {
            Notification notification = new Notification();
            this.R = notification;
            this.f1315a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f1327m = 0;
            this.U = new ArrayList<>();
            this.Q = true;
        }

        protected static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap f(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f1315a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(r.b.f4230b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(r.b.f4229a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        public c a(a aVar) {
            if (aVar != null) {
                this.f1316b.add(aVar);
            }
            return this;
        }

        public Notification b() {
            return new k(this).c();
        }

        public c c() {
            this.f1316b.clear();
            return this;
        }

        public Bundle d() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public c g(boolean z2) {
            this.A = z2;
            this.B = true;
            return this;
        }

        public c h(PendingIntent pendingIntent) {
            this.f1321g = pendingIntent;
            return this;
        }

        public c i(CharSequence charSequence) {
            this.f1320f = e(charSequence);
            return this;
        }

        public c j(CharSequence charSequence) {
            this.f1319e = e(charSequence);
            return this;
        }

        public c k(Bitmap bitmap) {
            this.f1324j = f(bitmap);
            return this;
        }

        public c l(int i2) {
            this.f1327m = i2;
            return this;
        }

        public c m(int i2) {
            this.R.icon = i2;
            return this;
        }

        public c n(d dVar) {
            if (this.f1330p != dVar) {
                this.f1330p = dVar;
                if (dVar != null) {
                    dVar.g(this);
                }
            }
            return this;
        }
    }

    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        protected c f1341a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f1342b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f1343c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1344d = false;

        public void a(Bundle bundle) {
            if (this.f1344d) {
                bundle.putCharSequence("android.summaryText", this.f1343c);
            }
            CharSequence charSequence = this.f1342b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c3 = c();
            if (c3 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c3);
            }
        }

        public abstract void b(i iVar);

        protected String c() {
            return null;
        }

        public abstract RemoteViews d(i iVar);

        public abstract RemoteViews e(i iVar);

        public RemoteViews f(i iVar) {
            return null;
        }

        public void g(c cVar) {
            if (this.f1341a != cVar) {
                this.f1341a = cVar;
                if (cVar != null) {
                    cVar.n(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
