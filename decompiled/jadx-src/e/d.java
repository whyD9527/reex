package e;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import e.b;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
class d extends b {

    /* renamed from: q, reason: collision with root package name */
    private a f2626q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2627r;

    static class a extends b.c {
        int[][] J;

        a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[f()][];
            }
        }

        int A(int[] iArr) {
            int[][] iArr2 = this.J;
            int h2 = h();
            for (int i2 = 0; i2 < h2; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }

        @Override // e.b.c
        public void o(int i2, int i3) {
            super.o(i2, i3);
            int[][] iArr = new int[i3][];
            System.arraycopy(this.J, 0, iArr, 0, i2);
            this.J = iArr;
        }

        @Override // e.b.c
        void r() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.J[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.J = iArr2;
        }

        int z(int[] iArr, Drawable drawable) {
            int a3 = a(drawable);
            this.J[a3] = iArr;
            return a3;
        }
    }

    d(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }

    d(a aVar, Resources resources) {
        h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // e.b
    void h(b.c cVar) {
        super.h(cVar);
        if (cVar instanceof a) {
            this.f2626q = (a) cVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // e.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a b() {
        return new a(this.f2626q, this, null);
    }

    int[] k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i2 = 0;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i3);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i4 = i2 + 1;
                if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i2] = attributeNameResource;
                i2 = i4;
            }
        }
        return StateSet.trimStateSet(iArr, i2);
    }

    @Override // e.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2627r && super.mutate() == this) {
            this.f2626q.r();
            this.f2627r = true;
        }
        return this;
    }

    @Override // e.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A = this.f2626q.A(iArr);
        if (A < 0) {
            A = this.f2626q.A(StateSet.WILD_CARD);
        }
        return g(A) || onStateChange;
    }
}
