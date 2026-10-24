package h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class c extends h.b implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final s.b f2889d;

    /* renamed from: e, reason: collision with root package name */
    private Method f2890e;

    private class a extends androidx.core.view.b {

        /* renamed from: d, reason: collision with root package name */
        final ActionProvider f2891d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f2891d = actionProvider;
        }

        @Override // androidx.core.view.b
        public boolean a() {
            return this.f2891d.hasSubMenu();
        }

        @Override // androidx.core.view.b
        public View c() {
            return this.f2891d.onCreateActionView();
        }

        @Override // androidx.core.view.b
        public boolean e() {
            return this.f2891d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        public void f(SubMenu subMenu) {
            this.f2891d.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f, reason: collision with root package name */
        private b.InterfaceC0026b f2893f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.b
        public boolean b() {
            return this.f2891d.isVisible();
        }

        @Override // androidx.core.view.b
        public View d(MenuItem menuItem) {
            return this.f2891d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        public boolean g() {
            return this.f2891d.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        public void j(b.InterfaceC0026b interfaceC0026b) {
            this.f2893f = interfaceC0026b;
            this.f2891d.setVisibilityListener(interfaceC0026b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z2) {
            b.InterfaceC0026b interfaceC0026b = this.f2893f;
            if (interfaceC0026b != null) {
                interfaceC0026b.onActionProviderVisibilityChanged(z2);
            }
        }
    }

    /* renamed from: h.c$c, reason: collision with other inner class name */
    static class C0041c extends FrameLayout implements g.c {

        /* renamed from: e, reason: collision with root package name */
        final CollapsibleActionView f2895e;

        /* JADX WARN: Multi-variable type inference failed */
        C0041c(View view) {
            super(view.getContext());
            this.f2895e = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f2895e;
        }

        @Override // g.c
        public void onActionViewCollapsed() {
            this.f2895e.onActionViewCollapsed();
        }

        @Override // g.c
        public void onActionViewExpanded() {
            this.f2895e.onActionViewExpanded();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f2896a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f2896a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f2896a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f2896a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f2898a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f2898a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f2898a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, s.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f2889d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f2889d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f2889d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b b3 = this.f2889d.b();
        if (b3 instanceof a) {
            return ((a) b3).f2891d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f2889d.getActionView();
        return actionView instanceof C0041c ? ((C0041c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2889d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2889d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2889d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2889d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f2889d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2889d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2889d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2889d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2889d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2889d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2889d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2889d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2889d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f2889d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2889d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f2889d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2889d.getTooltipText();
    }

    public void h(boolean z2) {
        try {
            if (this.f2890e == null) {
                this.f2890e = this.f2889d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f2890e.invoke(this.f2889d, Boolean.valueOf(z2));
        } catch (Exception e3) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f2889d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f2889d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f2889d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f2889d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f2889d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f2889d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f2886a, actionProvider);
        s.b bVar2 = this.f2889d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        this.f2889d.setActionView(i2);
        View actionView = this.f2889d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f2889d.setActionView(new C0041c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0041c(view);
        }
        this.f2889d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3) {
        this.f2889d.setAlphabeticShortcut(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3, int i2) {
        this.f2889d.setAlphabeticShortcut(c3, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.f2889d.setCheckable(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.f2889d.setChecked(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f2889d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f2889d.setEnabled(z2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f2889d.setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2889d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2889d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2889d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2889d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c3) {
        this.f2889d.setNumericShortcut(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c3, int i2) {
        this.f2889d.setNumericShortcut(c3, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2889d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2889d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4) {
        this.f2889d.setShortcut(c3, c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4, int i2, int i3) {
        this.f2889d.setShortcut(c3, c4, i2, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
        this.f2889d.setShowAsAction(i2);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        this.f2889d.setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f2889d.setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2889d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2889d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f2889d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        return this.f2889d.setVisible(z2);
    }
}
