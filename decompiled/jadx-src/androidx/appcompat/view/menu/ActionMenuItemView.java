package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.l1;
import androidx.appcompat.widget.p0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends f0 implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: i, reason: collision with root package name */
    g f235i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f236j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f237k;

    /* renamed from: l, reason: collision with root package name */
    e.b f238l;

    /* renamed from: m, reason: collision with root package name */
    private p0 f239m;

    /* renamed from: n, reason: collision with root package name */
    b f240n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f241o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f242p;

    /* renamed from: q, reason: collision with root package name */
    private int f243q;

    /* renamed from: r, reason: collision with root package name */
    private int f244r;

    /* renamed from: s, reason: collision with root package name */
    private int f245s;

    private class a extends p0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.p0
        public h.e b() {
            b bVar = ActionMenuItemView.this.f240n;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.p0
        protected boolean c() {
            h.e b3;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f238l;
            return bVar != null && bVar.a(actionMenuItemView.f235i) && (b3 = b()) != null && b3.c();
        }
    }

    public static abstract class b {
        public abstract h.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.f241o = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.j.f2353v, i2, 0);
        this.f243q = obtainStyledAttributes.getDimensionPixelSize(b.j.f2356w, 0);
        obtainStyledAttributes.recycle();
        this.f245s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f244r = -1;
        setSaveEnabled(false);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f236j);
        if (this.f237k != null && (!this.f235i.B() || (!this.f241o && !this.f242p))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f236j : null);
        CharSequence contentDescription = this.f235i.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z4 ? null : this.f235i.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f235i.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            l1.a(this, z4 ? null : this.f235i.getTitle());
        } else {
            l1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean a() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return f() && this.f235i.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i2) {
        this.f235i = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f239m == null) {
            this.f239m = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f235i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f238l;
        if (bVar != null) {
            bVar.a(this.f235i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f241o = g();
        h();
    }

    @Override // androidx.appcompat.widget.f0, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        boolean f2 = f();
        if (f2 && (i4 = this.f244r) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f243q) : this.f243q;
        if (mode != 1073741824 && this.f243q > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (f2 || this.f237k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f237k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        p0 p0Var;
        if (this.f235i.hasSubMenu() && (p0Var = this.f239m) != null && p0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f242p != z2) {
            this.f242p = z2;
            g gVar = this.f235i;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f237k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f245s;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f238l = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f244r = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f240n = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f236j = charSequence;
        h();
    }
}
