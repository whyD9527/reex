package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* loaded from: classes.dex */
public class k extends EditText {

    /* renamed from: e, reason: collision with root package name */
    private final e f772e;

    /* renamed from: f, reason: collision with root package name */
    private final e0 f773f;

    /* renamed from: g, reason: collision with root package name */
    private final x f774g;

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.A);
    }

    public k(Context context, AttributeSet attributeSet, int i2) {
        super(f1.b(context), attributeSet, i2);
        d1.a(this, getContext());
        e eVar = new e(this);
        this.f772e = eVar;
        eVar.e(attributeSet, i2);
        e0 e0Var = new e0(this);
        this.f773f = e0Var;
        e0Var.m(attributeSet, i2);
        e0Var.b();
        this.f774g = new x(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f772e;
        if (eVar != null) {
            eVar.b();
        }
        e0 e0Var = this.f773f;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f772e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f772e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.f774g) == null) ? super.getTextClassifier() : xVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f772e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f772e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.m(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f772e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f772e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        e0 e0Var = this.f773f;
        if (e0Var != null) {
            e0Var.q(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f774g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.b(textClassifier);
        }
    }
}
