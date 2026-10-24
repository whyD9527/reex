package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;

/* loaded from: classes.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f737a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f738b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f739c;

    private i1(Context context, TypedArray typedArray) {
        this.f737a = context;
        this.f738b = typedArray;
    }

    public static i1 s(Context context, int i2, int[] iArr) {
        return new i1(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static i1 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new i1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static i1 u(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new i1(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z2) {
        return this.f738b.getBoolean(i2, z2);
    }

    public int b(int i2, int i3) {
        return this.f738b.getColor(i2, i3);
    }

    public ColorStateList c(int i2) {
        int resourceId;
        ColorStateList a3;
        return (!this.f738b.hasValue(i2) || (resourceId = this.f738b.getResourceId(i2, 0)) == 0 || (a3 = d.a.a(this.f737a, resourceId)) == null) ? this.f738b.getColorStateList(i2) : a3;
    }

    public int d(int i2, int i3) {
        return this.f738b.getDimensionPixelOffset(i2, i3);
    }

    public int e(int i2, int i3) {
        return this.f738b.getDimensionPixelSize(i2, i3);
    }

    public Drawable f(int i2) {
        int resourceId;
        return (!this.f738b.hasValue(i2) || (resourceId = this.f738b.getResourceId(i2, 0)) == 0) ? this.f738b.getDrawable(i2) : d.a.b(this.f737a, resourceId);
    }

    public Drawable g(int i2) {
        int resourceId;
        if (!this.f738b.hasValue(i2) || (resourceId = this.f738b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f737a, resourceId, true);
    }

    public float h(int i2, float f2) {
        return this.f738b.getFloat(i2, f2);
    }

    public Typeface i(int i2, int i3, h.b bVar) {
        int resourceId = this.f738b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f739c == null) {
            this.f739c = new TypedValue();
        }
        return androidx.core.content.res.h.b(this.f737a, resourceId, this.f739c, i3, bVar);
    }

    public int j(int i2, int i3) {
        return this.f738b.getInt(i2, i3);
    }

    public int k(int i2, int i3) {
        return this.f738b.getInteger(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.f738b.getLayoutDimension(i2, i3);
    }

    public int m(int i2, int i3) {
        return this.f738b.getResourceId(i2, i3);
    }

    public String n(int i2) {
        return this.f738b.getString(i2);
    }

    public CharSequence o(int i2) {
        return this.f738b.getText(i2);
    }

    public CharSequence[] p(int i2) {
        return this.f738b.getTextArray(i2);
    }

    public TypedArray q() {
        return this.f738b;
    }

    public boolean r(int i2) {
        return this.f738b.hasValue(i2);
    }

    public void v() {
        this.f738b.recycle();
    }
}
