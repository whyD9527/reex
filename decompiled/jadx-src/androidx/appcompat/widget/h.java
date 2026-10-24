package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class h extends CheckedTextView {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f728f = {R.attr.checkMark};

    /* renamed from: e, reason: collision with root package name */
    private final e0 f729e;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public h(Context context, AttributeSet attributeSet, int i2) {
        super(f1.b(context), attributeSet, i2);
        d1.a(this, getContext());
        e0 e0Var = new e0(this);
        this.f729e = e0Var;
        e0Var.m(attributeSet, i2);
        e0Var.b();
        i1 u2 = i1.u(getContext(), attributeSet, f728f, i2, 0);
        setCheckMarkDrawable(u2.f(0));
        u2.v();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e0 e0Var = this.f729e;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(d.a.b(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.m(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        e0 e0Var = this.f729e;
        if (e0Var != null) {
            e0Var.q(context, i2);
        }
    }
}
