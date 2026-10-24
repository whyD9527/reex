package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* loaded from: classes.dex */
public class s extends RadioButton {

    /* renamed from: e, reason: collision with root package name */
    private final i f862e;

    /* renamed from: f, reason: collision with root package name */
    private final e f863f;

    /* renamed from: g, reason: collision with root package name */
    private final e0 f864g;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.E);
    }

    public s(Context context, AttributeSet attributeSet, int i2) {
        super(f1.b(context), attributeSet, i2);
        d1.a(this, getContext());
        i iVar = new i(this);
        this.f862e = iVar;
        iVar.e(attributeSet, i2);
        e eVar = new e(this);
        this.f863f = eVar;
        eVar.e(attributeSet, i2);
        e0 e0Var = new e0(this);
        this.f864g = e0Var;
        e0Var.m(attributeSet, i2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f863f;
        if (eVar != null) {
            eVar.b();
        }
        e0 e0Var = this.f864g;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f862e;
        return iVar != null ? iVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f863f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f863f;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f862e;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f862e;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f863f;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f863f;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(d.a.b(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f862e;
        if (iVar != null) {
            iVar.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f863f;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f863f;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f862e;
        if (iVar != null) {
            iVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f862e;
        if (iVar != null) {
            iVar.h(mode);
        }
    }
}
