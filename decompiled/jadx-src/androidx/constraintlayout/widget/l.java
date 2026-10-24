package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class l extends c {

    /* renamed from: n, reason: collision with root package name */
    private boolean f1253n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1254o;

    @Override // androidx.constraintlayout.widget.c
    protected void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f1172a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.f1180c1) {
                    this.f1253n = true;
                } else if (index == k.f1198h1) {
                    this.f1254o = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o(p.k kVar, int i2, int i3) {
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f1253n || this.f1254o) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f1057f; i2++) {
                View h2 = constraintLayout.h(this.f1056e[i2]);
                if (h2 != null) {
                    if (this.f1253n) {
                        h2.setVisibility(visibility);
                    }
                    if (this.f1254o && elevation > 0.0f) {
                        h2.setTranslationZ(h2.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        d();
    }
}
