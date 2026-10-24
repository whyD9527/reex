package h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class a implements s.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f2866a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2867b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2868c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f2869d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f2870e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f2871f;

    /* renamed from: g, reason: collision with root package name */
    private char f2872g;

    /* renamed from: i, reason: collision with root package name */
    private char f2874i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f2876k;

    /* renamed from: l, reason: collision with root package name */
    private Context f2877l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f2878m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f2879n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f2880o;

    /* renamed from: h, reason: collision with root package name */
    private int f2873h = 4096;

    /* renamed from: j, reason: collision with root package name */
    private int f2875j = 4096;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f2881p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f2882q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2883r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f2884s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f2885t = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f2877l = context;
        this.f2866a = i3;
        this.f2867b = i2;
        this.f2868c = i5;
        this.f2869d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f2876k;
        if (drawable != null) {
            if (this.f2883r || this.f2884s) {
                Drawable p2 = androidx.core.graphics.drawable.a.p(drawable);
                this.f2876k = p2;
                Drawable mutate = p2.mutate();
                this.f2876k = mutate;
                if (this.f2883r) {
                    androidx.core.graphics.drawable.a.n(mutate, this.f2881p);
                }
                if (this.f2884s) {
                    androidx.core.graphics.drawable.a.o(this.f2876k, this.f2882q);
                }
            }
        }
    }

    @Override // s.b
    public s.b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // s.b
    public androidx.core.view.b b() {
        return null;
    }

    @Override // s.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // s.b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public s.b setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // s.b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public s.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // s.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // s.b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public s.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // s.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // s.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2875j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2874i;
    }

    @Override // s.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2879n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2867b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f2876k;
    }

    @Override // s.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2881p;
    }

    @Override // s.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2882q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2871f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2866a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // s.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2873h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2872g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2868c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2869d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2870e;
        return charSequence != null ? charSequence : this.f2869d;
    }

    @Override // s.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2880o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // s.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2885t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2885t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2885t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f2885t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3) {
        this.f2874i = Character.toLowerCase(c3);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3, int i2) {
        this.f2874i = Character.toLowerCase(c3);
        this.f2875j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.f2885t = (z2 ? 1 : 0) | (this.f2885t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.f2885t = (z2 ? 2 : 0) | (this.f2885t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public s.b setContentDescription(CharSequence charSequence) {
        this.f2879n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f2885t = (z2 ? 16 : 0) | (this.f2885t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f2876k = androidx.core.content.a.c(this.f2877l, i2);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2876k = drawable;
        c();
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2881p = colorStateList;
        this.f2883r = true;
        c();
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2882q = mode;
        this.f2884s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2871f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c3) {
        this.f2872g = c3;
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c3, int i2) {
        this.f2872g = c3;
        this.f2873h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2878m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4) {
        this.f2872g = c3;
        this.f2874i = Character.toLowerCase(c4);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4, int i2, int i3) {
        this.f2872g = c3;
        this.f2873h = KeyEvent.normalizeMetaState(i2);
        this.f2874i = Character.toLowerCase(c4);
        this.f2875j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f2869d = this.f2877l.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2869d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2870e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public s.b setTooltipText(CharSequence charSequence) {
        this.f2880o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        this.f2885t = (this.f2885t & 8) | (z2 ? 0 : 8);
        return this;
    }
}
