package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import c.h;

/* loaded from: classes.dex */
public class a extends h {

    /* renamed from: g, reason: collision with root package name */
    final AlertController f232g;

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0010a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.b f233a;

        /* renamed from: b, reason: collision with root package name */
        private final int f234b;

        public C0010a(Context context) {
            this(context, a.i(context, 0));
        }

        public C0010a(Context context, int i2) {
            this.f233a = new AlertController.b(new ContextThemeWrapper(context, a.i(context, i2)));
            this.f234b = i2;
        }

        public a a() {
            a aVar = new a(this.f233a.f193a, this.f234b);
            this.f233a.a(aVar.f232g);
            aVar.setCancelable(this.f233a.f210r);
            if (this.f233a.f210r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f233a.f211s);
            aVar.setOnDismissListener(this.f233a.f212t);
            DialogInterface.OnKeyListener onKeyListener = this.f233a.f213u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.f233a.f193a;
        }

        public C0010a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f233a;
            bVar.f215w = listAdapter;
            bVar.f216x = onClickListener;
            return this;
        }

        public C0010a d(View view) {
            this.f233a.f199g = view;
            return this;
        }

        public C0010a e(Drawable drawable) {
            this.f233a.f196d = drawable;
            return this;
        }

        public C0010a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f233a.f213u = onKeyListener;
            return this;
        }

        public C0010a g(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f233a;
            bVar.f215w = listAdapter;
            bVar.f216x = onClickListener;
            bVar.I = i2;
            bVar.H = true;
            return this;
        }

        public C0010a h(CharSequence charSequence) {
            this.f233a.f198f = charSequence;
            return this;
        }
    }

    protected a(Context context, int i2) {
        super(context, i(context, i2));
        this.f232g = new AlertController(getContext(), this, getWindow());
    }

    static int i(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(b.a.f2164o, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView h() {
        return this.f232g.d();
    }

    @Override // c.h, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f232g.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.f232g.f(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.f232g.g(i2, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // c.h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f232g.p(charSequence);
    }
}
