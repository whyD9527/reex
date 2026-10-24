package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class j0 extends ToggleButton {

    /* renamed from: e, reason: collision with root package name */
    private final e0 f749e;

    public j0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public j0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d1.a(this, getContext());
        e0 e0Var = new e0(this);
        this.f749e = e0Var;
        e0Var.m(attributeSet, i2);
    }
}
