package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.i1;
import androidx.core.view.f0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: e, reason: collision with root package name */
    private g f250e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f251f;

    /* renamed from: g, reason: collision with root package name */
    private RadioButton f252g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f253h;

    /* renamed from: i, reason: collision with root package name */
    private CheckBox f254i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f255j;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f256k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f257l;

    /* renamed from: m, reason: collision with root package name */
    private LinearLayout f258m;

    /* renamed from: n, reason: collision with root package name */
    private Drawable f259n;

    /* renamed from: o, reason: collision with root package name */
    private int f260o;

    /* renamed from: p, reason: collision with root package name */
    private Context f261p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f262q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f263r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f264s;

    /* renamed from: t, reason: collision with root package name */
    private LayoutInflater f265t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f266u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.C);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        i1 u2 = i1.u(getContext(), attributeSet, b.j.W1, i2, 0);
        this.f259n = u2.f(b.j.Y1);
        this.f260o = u2.m(b.j.X1, -1);
        this.f262q = u2.a(b.j.Z1, false);
        this.f261p = context;
        this.f263r = u2.f(b.j.f2288a2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, b.a.f2175z, 0);
        this.f264s = obtainStyledAttributes.hasValue(0);
        u2.v();
        obtainStyledAttributes.recycle();
    }

    private void b(View view) {
        c(view, -1);
    }

    private void c(View view, int i2) {
        LinearLayout linearLayout = this.f258m;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(b.g.f2256h, (ViewGroup) this, false);
        this.f254i = checkBox;
        b(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(b.g.f2257i, (ViewGroup) this, false);
        this.f251f = imageView;
        c(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(b.g.f2259k, (ViewGroup) this, false);
        this.f252g = radioButton;
        b(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f265t == null) {
            this.f265t = LayoutInflater.from(getContext());
        }
        return this.f265t;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f256k;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean a() {
        return false;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f257l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f257l.getLayoutParams();
        rect.top += this.f257l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i2) {
        this.f250e = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f250e;
    }

    public void h(boolean z2, char c3) {
        int i2 = (z2 && this.f250e.A()) ? 0 : 8;
        if (i2 == 0) {
            this.f255j.setText(this.f250e.h());
        }
        if (this.f255j.getVisibility() != i2) {
            this.f255j.setVisibility(i2);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        f0.I(this, this.f259n);
        TextView textView = (TextView) findViewById(b.f.M);
        this.f253h = textView;
        int i2 = this.f260o;
        if (i2 != -1) {
            textView.setTextAppearance(this.f261p, i2);
        }
        this.f255j = (TextView) findViewById(b.f.F);
        ImageView imageView = (ImageView) findViewById(b.f.I);
        this.f256k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f263r);
        }
        this.f257l = (ImageView) findViewById(b.f.f2240r);
        this.f258m = (LinearLayout) findViewById(b.f.f2234l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f251f != null && this.f262q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f251f.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f252g == null && this.f254i == null) {
            return;
        }
        if (this.f250e.m()) {
            if (this.f252g == null) {
                g();
            }
            compoundButton = this.f252g;
            view = this.f254i;
        } else {
            if (this.f254i == null) {
                e();
            }
            compoundButton = this.f254i;
            view = this.f252g;
        }
        if (z2) {
            compoundButton.setChecked(this.f250e.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f254i;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f252g;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if (this.f250e.m()) {
            if (this.f252g == null) {
                g();
            }
            compoundButton = this.f252g;
        } else {
            if (this.f254i == null) {
                e();
            }
            compoundButton = this.f254i;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f266u = z2;
        this.f262q = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f257l;
        if (imageView != null) {
            imageView.setVisibility((this.f264s || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z2 = this.f250e.z() || this.f266u;
        if (z2 || this.f262q) {
            ImageView imageView = this.f251f;
            if (imageView == null && drawable == null && !this.f262q) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f262q) {
                this.f251f.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f251f;
            if (!z2) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f251f.getVisibility() != 0) {
                this.f251f.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i2;
        TextView textView;
        if (charSequence != null) {
            this.f253h.setText(charSequence);
            if (this.f253h.getVisibility() == 0) {
                return;
            }
            textView = this.f253h;
            i2 = 0;
        } else {
            i2 = 8;
            if (this.f253h.getVisibility() == 8) {
                return;
            } else {
                textView = this.f253h;
            }
        }
        textView.setVisibility(i2);
    }
}
