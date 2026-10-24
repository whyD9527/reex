package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class f extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    e f1155e;

    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;

        /* renamed from: p0, reason: collision with root package name */
        public float f1156p0;

        /* renamed from: q0, reason: collision with root package name */
        public boolean f1157q0;

        /* renamed from: r0, reason: collision with root package name */
        public float f1158r0;

        /* renamed from: s0, reason: collision with root package name */
        public float f1159s0;

        /* renamed from: t0, reason: collision with root package name */
        public float f1160t0;

        /* renamed from: u0, reason: collision with root package name */
        public float f1161u0;

        /* renamed from: v0, reason: collision with root package name */
        public float f1162v0;

        /* renamed from: w0, reason: collision with root package name */
        public float f1163w0;

        /* renamed from: x0, reason: collision with root package name */
        public float f1164x0;

        /* renamed from: y0, reason: collision with root package name */
        public float f1165y0;

        /* renamed from: z0, reason: collision with root package name */
        public float f1166z0;

        public a(int i2, int i3) {
            super(i2, i3);
            this.f1156p0 = 1.0f;
            this.f1157q0 = false;
            this.f1158r0 = 0.0f;
            this.f1159s0 = 0.0f;
            this.f1160t0 = 0.0f;
            this.f1161u0 = 0.0f;
            this.f1162v0 = 1.0f;
            this.f1163w0 = 1.0f;
            this.f1164x0 = 0.0f;
            this.f1165y0 = 0.0f;
            this.f1166z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1156p0 = 1.0f;
            this.f1157q0 = false;
            this.f1158r0 = 0.0f;
            this.f1159s0 = 0.0f;
            this.f1160t0 = 0.0f;
            this.f1161u0 = 0.0f;
            this.f1162v0 = 1.0f;
            this.f1163w0 = 1.0f;
            this.f1164x0 = 0.0f;
            this.f1165y0 = 0.0f;
            this.f1166z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.p2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.q2) {
                    this.f1156p0 = obtainStyledAttributes.getFloat(index, this.f1156p0);
                } else if (index == k.B2) {
                    this.f1158r0 = obtainStyledAttributes.getFloat(index, this.f1158r0);
                    this.f1157q0 = true;
                } else if (index == k.y2) {
                    this.f1160t0 = obtainStyledAttributes.getFloat(index, this.f1160t0);
                } else if (index == k.z2) {
                    this.f1161u0 = obtainStyledAttributes.getFloat(index, this.f1161u0);
                } else if (index == k.x2) {
                    this.f1159s0 = obtainStyledAttributes.getFloat(index, this.f1159s0);
                } else if (index == k.v2) {
                    this.f1162v0 = obtainStyledAttributes.getFloat(index, this.f1162v0);
                } else if (index == k.w2) {
                    this.f1163w0 = obtainStyledAttributes.getFloat(index, this.f1163w0);
                } else if (index == k.r2) {
                    this.f1164x0 = obtainStyledAttributes.getFloat(index, this.f1164x0);
                } else if (index == k.s2) {
                    this.f1165y0 = obtainStyledAttributes.getFloat(index, this.f1165y0);
                } else if (index == k.t2) {
                    this.f1166z0 = obtainStyledAttributes.getFloat(index, this.f1166z0);
                } else if (index == k.u2) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == k.A2) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public e getConstraintSet() {
        if (this.f1155e == null) {
            this.f1155e = new e();
        }
        this.f1155e.f(this);
        return this.f1155e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }
}
