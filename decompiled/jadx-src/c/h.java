package c;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f;
import g.b;

/* loaded from: classes.dex */
public class h extends Dialog implements c {

    /* renamed from: e, reason: collision with root package name */
    private d f2465e;

    /* renamed from: f, reason: collision with root package name */
    private final f.a f2466f;

    class a implements f.a {
        a() {
        }

        @Override // androidx.core.view.f.a
        public boolean c(KeyEvent keyEvent) {
            return h.this.d(keyEvent);
        }
    }

    public h(Context context, int i2) {
        super(context, c(context, i2));
        this.f2466f = new a();
        d a3 = a();
        a3.D(c(context, i2));
        a3.q(null);
    }

    private static int c(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(b.a.f2174y, typedValue, true);
        return typedValue.resourceId;
    }

    public d a() {
        if (this.f2465e == null) {
            this.f2465e = d.h(this, this);
        }
        return this.f2465e;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    @Override // c.c
    public void b(g.b bVar) {
    }

    boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.f.e(this.f2466f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // c.c
    public g.b e(b.a aVar) {
        return null;
    }

    public boolean f(int i2) {
        return a().z(i2);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) a().i(i2);
    }

    @Override // c.c
    public void g(g.b bVar) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().o();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().n();
        super.onCreate(bundle);
        a().q(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        a().A(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        a().E(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().E(charSequence);
    }
}
