package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: e, reason: collision with root package name */
    protected int[] f1056e;

    /* renamed from: f, reason: collision with root package name */
    protected int f1057f;

    /* renamed from: g, reason: collision with root package name */
    protected Context f1058g;

    /* renamed from: h, reason: collision with root package name */
    protected p.h f1059h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f1060i;

    /* renamed from: j, reason: collision with root package name */
    protected String f1061j;

    /* renamed from: k, reason: collision with root package name */
    protected String f1062k;

    /* renamed from: l, reason: collision with root package name */
    private View[] f1063l;

    /* renamed from: m, reason: collision with root package name */
    private HashMap<Integer, String> f1064m;

    public c(Context context) {
        super(context);
        this.f1056e = new int[32];
        this.f1060i = false;
        this.f1063l = null;
        this.f1064m = new HashMap<>();
        this.f1058g = context;
        h(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f1058g == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int g2 = g(trim);
        if (g2 != 0) {
            this.f1064m.put(Integer.valueOf(g2), trim);
            b(g2);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f1057f + 1;
        int[] iArr = this.f1056e;
        if (i3 > iArr.length) {
            this.f1056e = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1056e;
        int i4 = this.f1057f;
        iArr2[i4] = i2;
        this.f1057f = i4 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f1058g == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).V)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1058g.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int g(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i2 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f2 = constraintLayout.f(0, str);
            if (f2 instanceof Integer) {
                i2 = ((Integer) f2).intValue();
            }
        }
        if (i2 == 0 && constraintLayout != null) {
            i2 = f(constraintLayout, str);
        }
        if (i2 == 0) {
            try {
                i2 = j.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i2 == 0 ? this.f1058g.getResources().getIdentifier(str, "id", this.f1058g.getPackageName()) : i2;
    }

    protected void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f1057f; i2++) {
            View h2 = constraintLayout.h(this.f1056e[i2]);
            if (h2 != null) {
                h2.setVisibility(visibility);
                if (elevation > 0.0f) {
                    h2.setTranslationZ(h2.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1056e, this.f1057f);
    }

    protected void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f1172a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == k.f1213m1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1061j = string;
                    setIds(string);
                } else if (index == k.f1216n1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1062k = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void i(p.e eVar, boolean z2) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
        String str;
        int f2;
        if (isInEditMode()) {
            setIds(this.f1061j);
        }
        p.h hVar = this.f1059h;
        if (hVar == null) {
            return;
        }
        hVar.b();
        for (int i2 = 0; i2 < this.f1057f; i2++) {
            int i3 = this.f1056e[i2];
            View h2 = constraintLayout.h(i3);
            if (h2 == null && (f2 = f(constraintLayout, (str = this.f1064m.get(Integer.valueOf(i3))))) != 0) {
                this.f1056e[i2] = f2;
                this.f1064m.put(Integer.valueOf(f2), str);
                h2 = constraintLayout.h(f2);
            }
            if (h2 != null) {
                this.f1059h.c(constraintLayout.i(h2));
            }
        }
        this.f1059h.a(constraintLayout.f966g);
    }

    public void n() {
        if (this.f1059h == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f1014n0 = (p.e) this.f1059h;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1061j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1062k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f1060i) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f1061j = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f1057f = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                a(str.substring(i2));
                return;
            } else {
                a(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f1062k = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f1057f = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                c(str.substring(i2));
                return;
            } else {
                c(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1061j = null;
        this.f1057f = 0;
        for (int i2 : iArr) {
            b(i2);
        }
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f1061j == null) {
            b(i2);
        }
    }
}
