package c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: e, reason: collision with root package name */
    private static int f2395e = -100;

    /* renamed from: f, reason: collision with root package name */
    private static final l.b<WeakReference<d>> f2396f = new l.b<>();

    /* renamed from: g, reason: collision with root package name */
    private static final Object f2397g = new Object();

    d() {
    }

    static void c(d dVar) {
        synchronized (f2397g) {
            y(dVar);
            f2396f.add(new WeakReference<>(dVar));
        }
    }

    public static d g(Activity activity, c cVar) {
        return new e(activity, cVar);
    }

    public static d h(Dialog dialog, c cVar) {
        return new e(dialog, cVar);
    }

    public static int j() {
        return f2395e;
    }

    static void x(d dVar) {
        synchronized (f2397g) {
            y(dVar);
        }
    }

    private static void y(d dVar) {
        synchronized (f2397g) {
            Iterator<WeakReference<d>> it = f2396f.iterator();
            while (it.hasNext()) {
                d dVar2 = it.next().get();
                if (dVar2 == dVar || dVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(int i2);

    public abstract void B(View view);

    public abstract void C(View view, ViewGroup.LayoutParams layoutParams);

    public void D(int i2) {
    }

    public abstract void E(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void e(Context context) {
    }

    public Context f(Context context) {
        e(context);
        return context;
    }

    public abstract <T extends View> T i(int i2);

    public int k() {
        return -100;
    }

    public abstract MenuInflater l();

    public abstract a m();

    public abstract void n();

    public abstract void o();

    public abstract void p(Configuration configuration);

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public abstract boolean z(int i2);
}
