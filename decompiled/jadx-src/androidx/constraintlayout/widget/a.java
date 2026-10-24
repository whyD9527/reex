package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: n, reason: collision with root package name */
    private int f1037n;

    /* renamed from: o, reason: collision with root package name */
    private int f1038o;

    /* renamed from: p, reason: collision with root package name */
    private p.a f1039p;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x000f, code lost:
    
        if (r6 == 6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (r6 == 6) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void p(p.e eVar, int i2, boolean z2) {
        this.f1038o = i2;
        if (z2) {
            int i3 = this.f1037n;
            if (i3 != 5) {
            }
            this.f1038o = 1;
        } else {
            int i4 = this.f1037n;
            if (i4 != 5) {
            }
            this.f1038o = 0;
        }
        if (eVar instanceof p.a) {
            ((p.a) eVar).j1(this.f1038o);
        }
    }

    public int getMargin() {
        return this.f1039p.f1();
    }

    public int getType() {
        return this.f1037n;
    }

    @Override // androidx.constraintlayout.widget.c
    protected void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f1039p = new p.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f1172a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.f1204j1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == k.f1201i1) {
                    this.f1039p.i1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == k.f1207k1) {
                    this.f1039p.k1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1059h = this.f1039p;
        n();
    }

    @Override // androidx.constraintlayout.widget.c
    public void i(p.e eVar, boolean z2) {
        p(eVar, this.f1037n, z2);
    }

    public boolean o() {
        return this.f1039p.d1();
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f1039p.i1(z2);
    }

    public void setDpMargin(int i2) {
        this.f1039p.k1((int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i2) {
        this.f1039p.k1(i2);
    }

    public void setType(int i2) {
        this.f1037n = i2;
    }
}
