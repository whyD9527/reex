package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class x0 extends u0 implements v0 {
    private static Method O;
    private v0 N;

    public static class a extends n0 {

        /* renamed from: s, reason: collision with root package name */
        final int f928s;

        /* renamed from: t, reason: collision with root package name */
        final int f929t;

        /* renamed from: u, reason: collision with root package name */
        private v0 f930u;

        /* renamed from: v, reason: collision with root package name */
        private MenuItem f931v;

        public a(Context context, boolean z2) {
            super(context, z2);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f928s = 21;
                this.f929t = 22;
            } else {
                this.f928s = 22;
                this.f929t = 21;
            }
        }

        @Override // androidx.appcompat.widget.n0
        public /* bridge */ /* synthetic */ int d(int i2, int i3, int i4, int i5, int i6) {
            return super.d(i2, i3, i4, i5, i6);
        }

        @Override // androidx.appcompat.widget.n0
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i2) {
            return super.e(motionEvent, i2);
        }

        @Override // androidx.appcompat.widget.n0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.n0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i2;
            int pointToPosition;
            int i3;
            if (this.f930u != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                }
                androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) adapter;
                androidx.appcompat.view.menu.g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < dVar.getCount()) {
                    gVar = dVar.getItem(i3);
                }
                MenuItem menuItem = this.f931v;
                if (menuItem != gVar) {
                    androidx.appcompat.view.menu.e b3 = dVar.b();
                    if (menuItem != null) {
                        this.f930u.e(b3, menuItem);
                    }
                    this.f931v = gVar;
                    if (gVar != null) {
                        this.f930u.b(b3, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.f928s) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i2 != this.f929t) {
                return super.onKeyDown(i2, keyEvent);
            }
            setSelection(-1);
            ((androidx.appcompat.view.menu.d) getAdapter()).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.n0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(v0 v0Var) {
            this.f930u = v0Var;
        }

        @Override // androidx.appcompat.widget.n0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                O = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public x0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public void N(Object obj) {
        this.J.setEnterTransition((Transition) obj);
    }

    public void O(Object obj) {
        this.J.setExitTransition((Transition) obj);
    }

    public void P(v0 v0Var) {
        this.N = v0Var;
    }

    public void Q(boolean z2) {
        if (Build.VERSION.SDK_INT > 28) {
            this.J.setTouchModal(z2);
            return;
        }
        Method method = O;
        if (method != null) {
            try {
                method.invoke(this.J, Boolean.valueOf(z2));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.v0
    public void b(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        v0 v0Var = this.N;
        if (v0Var != null) {
            v0Var.b(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.v0
    public void e(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        v0 v0Var = this.N;
        if (v0Var != null) {
            v0Var.e(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.u0
    n0 s(Context context, boolean z2) {
        a aVar = new a(context, z2);
        aVar.setHoverListener(this);
        return aVar;
    }
}
