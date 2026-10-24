package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, e.c> f1456a = new ConcurrentHashMap<>();

    class a implements b<g.b> {
        a() {
        }

        @Override // androidx.core.graphics.j.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(g.b bVar) {
            return bVar.e();
        }

        @Override // androidx.core.graphics.j.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    private interface b<T> {
        int a(T t2);

        boolean b(T t2);
    }

    j() {
    }

    private static <T> T e(T[] tArr, int i2, b<T> bVar) {
        return (T) f(tArr, (i2 & 1) == 0 ? 400 : 700, (i2 & 2) != 0, bVar);
    }

    private static <T> T f(T[] tArr, int i2, boolean z2, b<T> bVar) {
        T t2 = null;
        int i3 = Integer.MAX_VALUE;
        for (T t3 : tArr) {
            int abs = (Math.abs(bVar.a(t3) - i2) * 2) + (bVar.b(t3) == z2 ? 0 : 1);
            if (t2 == null || i3 > abs) {
                t2 = t3;
                i3 = abs;
            }
        }
        return t2;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i2) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i2) {
        throw null;
    }

    protected Typeface c(Context context, InputStream inputStream) {
        File e3 = k.e(context);
        if (e3 == null) {
            return null;
        }
        try {
            if (k.d(e3, inputStream)) {
                return Typeface.createFromFile(e3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e3.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        File e3 = k.e(context);
        if (e3 == null) {
            return null;
        }
        try {
            if (k.c(e3, resources, i2)) {
                return Typeface.createFromFile(e3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e3.delete();
        }
    }

    protected g.b g(g.b[] bVarArr, int i2) {
        return (g.b) e(bVarArr, i2, new a());
    }
}
