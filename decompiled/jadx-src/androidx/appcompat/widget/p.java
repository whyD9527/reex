package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public class p extends MultiAutoCompleteTextView {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f825g = {R.attr.popupBackground};

    /* renamed from: e, reason: collision with root package name */
    private final e f826e;

    /* renamed from: f, reason: collision with root package name */
    private final e0 f827f;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.f2165p);
    }

    public p(Context context, AttributeSet attributeSet, int i2) {
        super(f1.b(context), attributeSet, i2);
        d1.a(this, getContext());
        i1 u2 = i1.u(getContext(), attributeSet, f825g, i2, 0);
        if (u2.r(0)) {
            setDropDownBackgroundDrawable(u2.f(0));
        }
        u2.v();
        e eVar = new e(this);
        this.f826e = eVar;
        eVar.e(attributeSet, i2);
        e0 e0Var = new e0(this);
        this.f827f = e0Var;
        e0Var.m(attributeSet, i2);
        e0Var.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f826e;
        if (eVar != null) {
            eVar.b();
        }
        e0 e0Var = this.f827f;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f826e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f826e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f826e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f826e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(d.a.b(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f826e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f826e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        e0 e0Var = this.f827f;
        if (e0Var != null) {
            e0Var.q(context, i2);
        }
    }
}
