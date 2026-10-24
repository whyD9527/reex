package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class u extends SeekBar {

    /* renamed from: e, reason: collision with root package name */
    private final v f866e;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.H);
    }

    public u(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d1.a(this, getContext());
        v vVar = new v(this);
        this.f866e = vVar;
        vVar.c(attributeSet, i2);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f866e.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f866e.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f866e.g(canvas);
    }
}
