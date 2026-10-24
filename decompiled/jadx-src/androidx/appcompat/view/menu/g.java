package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.b;

/* loaded from: classes.dex */
public final class g implements s.b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a, reason: collision with root package name */
    private final int f355a;

    /* renamed from: b, reason: collision with root package name */
    private final int f356b;

    /* renamed from: c, reason: collision with root package name */
    private final int f357c;

    /* renamed from: d, reason: collision with root package name */
    private final int f358d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f359e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f360f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f361g;

    /* renamed from: h, reason: collision with root package name */
    private char f362h;

    /* renamed from: j, reason: collision with root package name */
    private char f364j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f366l;

    /* renamed from: n, reason: collision with root package name */
    e f368n;

    /* renamed from: o, reason: collision with root package name */
    private m f369o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f370p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f371q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f372r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f373s;

    /* renamed from: z, reason: collision with root package name */
    private int f380z;

    /* renamed from: i, reason: collision with root package name */
    private int f363i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f365k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f367m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f374t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f375u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f376v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f377w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f378x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f379y = 16;
    private boolean D = false;

    class a implements b.InterfaceC0026b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0026b
        public void onActionProviderVisibilityChanged(boolean z2) {
            g gVar = g.this;
            gVar.f368n.J(gVar);
        }
    }

    g(e eVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f368n = eVar;
        this.f355a = i3;
        this.f356b = i2;
        this.f357c = i4;
        this.f358d = i5;
        this.f359e = charSequence;
        this.f380z = i6;
    }

    private static void d(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f378x && (this.f376v || this.f377w)) {
            drawable = androidx.core.graphics.drawable.a.p(drawable).mutate();
            if (this.f376v) {
                androidx.core.graphics.drawable.a.n(drawable, this.f374t);
            }
            if (this.f377w) {
                androidx.core.graphics.drawable.a.o(drawable, this.f375u);
            }
            this.f378x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f368n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f380z & 4) == 4;
    }

    @Override // s.b
    public s.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f368n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    @Override // s.b
    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f368n.I(this);
    }

    @Override // s.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f380z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f368n.f(this);
        }
        return false;
    }

    @Override // s.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f368n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f358d;
    }

    char g() {
        return this.f368n.G() ? this.f364j : this.f362h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // s.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View d3 = bVar.d(this);
        this.A = d3;
        return d3;
    }

    @Override // s.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f365k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f364j;
    }

    @Override // s.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f372r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f356b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f366l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f367m == 0) {
            return null;
        }
        Drawable b3 = d.a.b(this.f368n.u(), this.f367m);
        this.f367m = 0;
        this.f366l = b3;
        return e(b3);
    }

    @Override // s.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f374t;
    }

    @Override // s.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f375u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f361g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f355a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // s.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f363i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f362h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f357c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f369o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f359e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f360f;
        return charSequence != null ? charSequence : this.f359e;
    }

    @Override // s.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f373s;
    }

    String h() {
        int i2;
        char g2 = g();
        if (g2 == 0) {
            return "";
        }
        Resources resources = this.f368n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f368n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(b.h.f2279k));
        }
        int i3 = this.f368n.G() ? this.f365k : this.f363i;
        d(sb, i3, 65536, resources.getString(b.h.f2275g));
        d(sb, i3, 4096, resources.getString(b.h.f2271c));
        d(sb, i3, 2, resources.getString(b.h.f2270b));
        d(sb, i3, 1, resources.getString(b.h.f2276h));
        d(sb, i3, 4, resources.getString(b.h.f2278j));
        d(sb, i3, 8, resources.getString(b.h.f2274f));
        if (g2 == '\b') {
            i2 = b.h.f2272d;
        } else if (g2 == '\n') {
            i2 = b.h.f2273e;
        } else {
            if (g2 != ' ') {
                sb.append(g2);
                return sb.toString();
            }
            i2 = b.h.f2277i;
        }
        sb.append(resources.getString(i2));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f369o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    @Override // s.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f379y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f379y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f379y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.f379y & 8) == 0 : (this.f379y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f380z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f371q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f368n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f370p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f361g != null) {
            try {
                this.f368n.u().startActivity(this.f361g);
                return true;
            } catch (ActivityNotFoundException e3) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e3);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.f379y & 32) == 32;
    }

    public boolean m() {
        return (this.f379y & 4) != 0;
    }

    public boolean n() {
        return (this.f380z & 1) == 1;
    }

    public boolean o() {
        return (this.f380z & 2) == 2;
    }

    @Override // s.b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public s.b setActionView(int i2) {
        Context u2 = this.f368n.u();
        setActionView(LayoutInflater.from(u2).inflate(i2, (ViewGroup) new LinearLayout(u2), false));
        return this;
    }

    @Override // s.b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public s.b setActionView(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.f355a) > 0) {
            view.setId(i2);
        }
        this.f368n.I(this);
        return this;
    }

    public void r(boolean z2) {
        this.D = z2;
        this.f368n.K(false);
    }

    void s(boolean z2) {
        int i2 = this.f379y;
        int i3 = (z2 ? 2 : 0) | (i2 & (-3));
        this.f379y = i3;
        if (i2 != i3) {
            this.f368n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3) {
        if (this.f364j == c3) {
            return this;
        }
        this.f364j = Character.toLowerCase(c3);
        this.f368n.K(false);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3, int i2) {
        if (this.f364j == c3 && this.f365k == i2) {
            return this;
        }
        this.f364j = Character.toLowerCase(c3);
        this.f365k = KeyEvent.normalizeMetaState(i2);
        this.f368n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        int i2 = this.f379y;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f379y = i3;
        if (i2 != i3) {
            this.f368n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        if ((this.f379y & 4) != 0) {
            this.f368n.T(this);
        } else {
            s(z2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public s.b setContentDescription(CharSequence charSequence) {
        this.f372r = charSequence;
        this.f368n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f379y = z2 ? this.f379y | 16 : this.f379y & (-17);
        this.f368n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f366l = null;
        this.f367m = i2;
        this.f378x = true;
        this.f368n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f367m = 0;
        this.f366l = drawable;
        this.f378x = true;
        this.f368n.K(false);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f374t = colorStateList;
        this.f376v = true;
        this.f378x = true;
        this.f368n.K(false);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f375u = mode;
        this.f377w = true;
        this.f378x = true;
        this.f368n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f361g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c3) {
        if (this.f362h == c3) {
            return this;
        }
        this.f362h = c3;
        this.f368n.K(false);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c3, int i2) {
        if (this.f362h == c3 && this.f363i == i2) {
            return this;
        }
        this.f362h = c3;
        this.f363i = KeyEvent.normalizeMetaState(i2);
        this.f368n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f371q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4) {
        this.f362h = c3;
        this.f364j = Character.toLowerCase(c4);
        this.f368n.K(false);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4, int i2, int i3) {
        this.f362h = c3;
        this.f363i = KeyEvent.normalizeMetaState(i2);
        this.f364j = Character.toLowerCase(c4);
        this.f365k = KeyEvent.normalizeMetaState(i3);
        this.f368n.K(false);
        return this;
    }

    @Override // s.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f380z = i2;
        this.f368n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        return setTitle(this.f368n.u().getString(i2));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f359e = charSequence;
        this.f368n.K(false);
        m mVar = this.f369o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f360f = charSequence;
        this.f368n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public s.b setTooltipText(CharSequence charSequence) {
        this.f373s = charSequence;
        this.f368n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        if (y(z2)) {
            this.f368n.J(this);
        }
        return this;
    }

    public void t(boolean z2) {
        this.f379y = (z2 ? 4 : 0) | (this.f379y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f359e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z2) {
        this.f379y = z2 ? this.f379y | 32 : this.f379y & (-33);
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // s.b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public s.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public void x(m mVar) {
        this.f369o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z2) {
        int i2 = this.f379y;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f379y = i3;
        return i2 != i3;
    }

    public boolean z() {
        return this.f368n.A();
    }
}
