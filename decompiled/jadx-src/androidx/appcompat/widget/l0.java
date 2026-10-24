package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.j;

/* loaded from: classes.dex */
public interface l0 {
    void a(Menu menu, j.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(int i2);

    void j(b1 b1Var);

    ViewGroup k();

    void l(boolean z2);

    boolean m();

    void n(int i2);

    int o();

    void p(int i2);

    int q();

    androidx.core.view.c1 r(int i2, long j2);

    void s();

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t();

    void u(boolean z2);
}
