package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class g<E> extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Activity f1772e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f1773f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f1774g;

    /* renamed from: h, reason: collision with root package name */
    private final int f1775h;

    /* renamed from: i, reason: collision with root package name */
    final i f1776i;

    g(Activity activity, Context context, Handler handler, int i2) {
        this.f1776i = new i();
        this.f1772e = activity;
        this.f1773f = (Context) androidx.core.util.e.c(context, "context == null");
        this.f1774g = (Handler) androidx.core.util.e.c(handler, "handler == null");
        this.f1775h = i2;
    }

    g(c cVar) {
        this(cVar, cVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.d
    public View c(int i2) {
        return null;
    }

    @Override // androidx.fragment.app.d
    public boolean d() {
        return true;
    }

    Activity e() {
        return this.f1772e;
    }

    Context g() {
        return this.f1773f;
    }

    Handler h() {
        return this.f1774g;
    }

    void i(Fragment fragment) {
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.f1773f);
    }

    public int o() {
        return this.f1775h;
    }

    public boolean p() {
        return true;
    }

    public boolean q(Fragment fragment) {
        return true;
    }

    public void r() {
    }
}
