package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    static final l.e<String, Typeface> f1473a = new l.e<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f1474b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f1475c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final l.g<String, ArrayList<androidx.core.util.a<e>>> f1476d = new l.g<>();

    class a implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1477a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f1478b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f1479c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1480d;

        a(String str, Context context, androidx.core.provider.e eVar, int i2) {
            this.f1477a = str;
            this.f1478b = context;
            this.f1479c = eVar;
            this.f1480d = i2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f1477a, this.f1478b, this.f1479c, this.f1480d);
        }
    }

    class b implements androidx.core.util.a<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f1481a;

        b(androidx.core.provider.a aVar) {
            this.f1481a = aVar;
        }

        @Override // androidx.core.util.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f1481a.b(eVar);
        }
    }

    class c implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1482a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f1483b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f1484c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1485d;

        c(String str, Context context, androidx.core.provider.e eVar, int i2) {
            this.f1482a = str;
            this.f1483b = context;
            this.f1484c = eVar;
            this.f1485d = i2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f1482a, this.f1483b, this.f1484c, this.f1485d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements androidx.core.util.a<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1486a;

        d(String str) {
            this.f1486a = str;
        }

        @Override // androidx.core.util.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f1475c) {
                l.g<String, ArrayList<androidx.core.util.a<e>>> gVar = f.f1476d;
                ArrayList<androidx.core.util.a<e>> arrayList = gVar.get(this.f1486a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f1486a);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList.get(i2).accept(eVar);
                }
            }
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f1487a;

        /* renamed from: b, reason: collision with root package name */
        final int f1488b;

        e(int i2) {
            this.f1487a = null;
            this.f1488b = i2;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f1487a = typeface;
            this.f1488b = 0;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.f1488b == 0;
        }
    }

    private static String a(androidx.core.provider.e eVar, int i2) {
        return eVar.d() + "-" + i2;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(g.a aVar) {
        int i2 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b3 = aVar.b();
        if (b3 != null && b3.length != 0) {
            i2 = 0;
            for (g.b bVar : b3) {
                int b4 = bVar.b();
                if (b4 != 0) {
                    if (b4 < 0) {
                        return -3;
                    }
                    return b4;
                }
            }
        }
        return i2;
    }

    static e c(String str, Context context, androidx.core.provider.e eVar, int i2) {
        l.e<String, Typeface> eVar2 = f1473a;
        Typeface c3 = eVar2.c(str);
        if (c3 != null) {
            return new e(c3);
        }
        try {
            g.a e3 = androidx.core.provider.d.e(context, eVar, null);
            int b3 = b(e3);
            if (b3 != 0) {
                return new e(b3);
            }
            Typeface b4 = androidx.core.graphics.d.b(context, null, e3.b(), i2);
            if (b4 == null) {
                return new e(-3);
            }
            eVar2.d(str, b4);
            return new e(b4);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, androidx.core.provider.e eVar, int i2, Executor executor, androidx.core.provider.a aVar) {
        String a3 = a(eVar, i2);
        Typeface c3 = f1473a.c(a3);
        if (c3 != null) {
            aVar.b(new e(c3));
            return c3;
        }
        b bVar = new b(aVar);
        synchronized (f1475c) {
            l.g<String, ArrayList<androidx.core.util.a<e>>> gVar = f1476d;
            ArrayList<androidx.core.util.a<e>> arrayList = gVar.get(a3);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<androidx.core.util.a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(a3, arrayList2);
            c cVar = new c(a3, context, eVar, i2);
            if (executor == null) {
                executor = f1474b;
            }
            h.b(executor, cVar, new d(a3));
            return null;
        }
    }

    static Typeface e(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i2, int i3) {
        String a3 = a(eVar, i2);
        Typeface c3 = f1473a.c(a3);
        if (c3 != null) {
            aVar.b(new e(c3));
            return c3;
        }
        if (i3 == -1) {
            e c4 = c(a3, context, eVar, i2);
            aVar.b(c4);
            return c4.f1487a;
        }
        try {
            e eVar2 = (e) h.c(f1474b, new a(a3, context, eVar, i2), i3);
            aVar.b(eVar2);
            return eVar2.f1487a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }
}
