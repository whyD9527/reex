package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import w.c;

/* loaded from: classes.dex */
public class f0 extends TextView implements androidx.core.widget.o, androidx.core.widget.b {

    /* renamed from: e, reason: collision with root package name */
    private final e f699e;

    /* renamed from: f, reason: collision with root package name */
    private final e0 f700f;

    /* renamed from: g, reason: collision with root package name */
    private final x f701g;

    /* renamed from: h, reason: collision with root package name */
    private Future<w.c> f702h;

    public f0(Context context) {
        this(context, null);
    }

    public f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public f0(Context context, AttributeSet attributeSet, int i2) {
        super(f1.b(context), attributeSet, i2);
        d1.a(this, getContext());
        e eVar = new e(this);
        this.f699e = eVar;
        eVar.e(attributeSet, i2);
        e0 e0Var = new e0(this);
        this.f700f = e0Var;
        e0Var.m(attributeSet, i2);
        e0Var.b();
        this.f701g = new x(this);
    }

    private void e() {
        Future<w.c> future = this.f702h;
        if (future != null) {
            try {
                this.f702h = null;
                androidx.core.widget.k.k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f699e;
        if (eVar != null) {
            eVar.b();
        }
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f1689a) {
            return super.getAutoSizeMaxTextSize();
        }
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            return e0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f1689a) {
            return super.getAutoSizeMinTextSize();
        }
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            return e0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f1689a) {
            return super.getAutoSizeStepGranularity();
        }
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            return e0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f1689a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        e0 e0Var = this.f700f;
        return e0Var != null ? e0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f1689a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            return e0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.k.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.k.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f699e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f699e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f700f.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f700f.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.f701g) == null) ? super.getTextClassifier() : xVar.a();
    }

    public c.a getTextMetricsParamsCompat() {
        return androidx.core.widget.k.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.o(z2, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        e();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        e0 e0Var = this.f700f;
        if (e0Var == null || androidx.core.widget.b.f1689a || !e0Var.l()) {
            return;
        }
        this.f700f.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.b.f1689a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.s(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (androidx.core.widget.b.f1689a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.t(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (androidx.core.widget.b.f1689a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.u(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f699e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f699e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? d.a.b(context, i2) : null, i3 != 0 ? d.a.b(context, i3) : null, i4 != 0 ? d.a.b(context, i4) : null, i5 != 0 ? d.a.b(context, i5) : null);
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? d.a.b(context, i2) : null, i3 != 0 ? d.a.b(context, i3) : null, i4 != 0 ? d.a.b(context, i4) : null, i5 != 0 ? d.a.b(context, i5) : null);
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.m(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            androidx.core.widget.k.h(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            androidx.core.widget.k.i(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        androidx.core.widget.k.j(this, i2);
    }

    public void setPrecomputedText(w.c cVar) {
        androidx.core.widget.k.k(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f699e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f699e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.o
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f700f.v(colorStateList);
        this.f700f.b();
    }

    @Override // androidx.core.widget.o
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f700f.w(mode);
        this.f700f.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.q(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f701g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<w.c> future) {
        this.f702h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        androidx.core.widget.k.l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        if (androidx.core.widget.b.f1689a) {
            super.setTextSize(i2, f2);
            return;
        }
        e0 e0Var = this.f700f;
        if (e0Var != null) {
            e0Var.z(i2, f2);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i2) {
        Typeface a3 = (typeface == null || i2 <= 0) ? null : androidx.core.graphics.d.a(getContext(), typeface, i2);
        if (a3 != null) {
            typeface = a3;
        }
        super.setTypeface(typeface, i2);
    }
}
