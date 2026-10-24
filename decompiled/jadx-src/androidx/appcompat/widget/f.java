package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class f extends Button implements androidx.core.widget.b, androidx.core.widget.o {

    /* renamed from: e, reason: collision with root package name */
    private final e f697e;

    /* renamed from: f, reason: collision with root package name */
    private final e0 f698f;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.f2166q);
    }

    public f(Context context, AttributeSet attributeSet, int i2) {
        super(f1.b(context), attributeSet, i2);
        d1.a(this, getContext());
        e eVar = new e(this);
        this.f697e = eVar;
        eVar.e(attributeSet, i2);
        e0 e0Var = new e0(this);
        this.f698f = e0Var;
        e0Var.m(attributeSet, i2);
        e0Var.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f697e;
        if (eVar != null) {
            eVar.b();
        }
        e0 e0Var = this.f698f;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f1689a) {
            return super.getAutoSizeMaxTextSize();
        }
        e0 e0Var = this.f698f;
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
        e0 e0Var = this.f698f;
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
        e0 e0Var = this.f698f;
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
        e0 e0Var = this.f698f;
        return e0Var != null ? e0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f1689a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        e0 e0Var = this.f698f;
        if (e0Var != null) {
            return e0Var.i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f697e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f697e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f698f.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f698f.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        e0 e0Var = this.f698f;
        if (e0Var != null) {
            e0Var.o(z2, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        e0 e0Var = this.f698f;
        if (e0Var == null || androidx.core.widget.b.f1689a || !e0Var.l()) {
            return;
        }
        this.f698f.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.b.f1689a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        e0 e0Var = this.f698f;
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
        e0 e0Var = this.f698f;
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
        e0 e0Var = this.f698f;
        if (e0Var != null) {
            e0Var.u(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f697e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f697e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.m(this, callback));
    }

    public void setSupportAllCaps(boolean z2) {
        e0 e0Var = this.f698f;
        if (e0Var != null) {
            e0Var.r(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f697e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f697e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.o
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f698f.v(colorStateList);
        this.f698f.b();
    }

    @Override // androidx.core.widget.o
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f698f.w(mode);
        this.f698f.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        e0 e0Var = this.f698f;
        if (e0Var != null) {
            e0Var.q(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        if (androidx.core.widget.b.f1689a) {
            super.setTextSize(i2, f2);
            return;
        }
        e0 e0Var = this.f698f;
        if (e0Var != null) {
            e0Var.z(i2, f2);
        }
    }
}
