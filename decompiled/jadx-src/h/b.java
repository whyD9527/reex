package h;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import l.g;

/* loaded from: classes.dex */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    final Context f2886a;

    /* renamed from: b, reason: collision with root package name */
    private g<s.b, MenuItem> f2887b;

    /* renamed from: c, reason: collision with root package name */
    private g<s.c, SubMenu> f2888c;

    b(Context context) {
        this.f2886a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof s.b)) {
            return menuItem;
        }
        s.b bVar = (s.b) menuItem;
        if (this.f2887b == null) {
            this.f2887b = new g<>();
        }
        MenuItem menuItem2 = this.f2887b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f2886a, bVar);
        this.f2887b.put(bVar, cVar);
        return cVar;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof s.c)) {
            return subMenu;
        }
        s.c cVar = (s.c) subMenu;
        if (this.f2888c == null) {
            this.f2888c = new g<>();
        }
        SubMenu subMenu2 = this.f2888c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        f fVar = new f(this.f2886a, cVar);
        this.f2888c.put(cVar, fVar);
        return fVar;
    }

    final void e() {
        g<s.b, MenuItem> gVar = this.f2887b;
        if (gVar != null) {
            gVar.clear();
        }
        g<s.c, SubMenu> gVar2 = this.f2888c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    final void f(int i2) {
        if (this.f2887b == null) {
            return;
        }
        int i3 = 0;
        while (i3 < this.f2887b.size()) {
            if (this.f2887b.i(i3).getGroupId() == i2) {
                this.f2887b.j(i3);
                i3--;
            }
            i3++;
        }
    }

    final void g(int i2) {
        if (this.f2887b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f2887b.size(); i3++) {
            if (this.f2887b.i(i3).getItemId() == i2) {
                this.f2887b.j(i3);
                return;
            }
        }
    }
}
