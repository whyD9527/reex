package g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import g.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f2805a;

    /* renamed from: b, reason: collision with root package name */
    final b f2806b;

    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f2807a;

        /* renamed from: b, reason: collision with root package name */
        final Context f2808b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f2809c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final l.g<Menu, Menu> f2810d = new l.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f2808b = context;
            this.f2807a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f2810d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            h.d dVar = new h.d(this.f2808b, (s.a) menu);
            this.f2810d.put(menu, dVar);
            return dVar;
        }

        @Override // g.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f2807a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // g.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f2807a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // g.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f2807a.onActionItemClicked(e(bVar), new h.c(this.f2808b, (s.b) menuItem));
        }

        @Override // g.b.a
        public void d(b bVar) {
            this.f2807a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f2809c.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.f2809c.get(i2);
                if (fVar != null && fVar.f2806b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f2808b, bVar);
            this.f2809c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f2805a = context;
        this.f2806b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f2806b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f2806b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new h.d(this.f2805a, (s.a) this.f2806b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f2806b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f2806b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f2806b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f2806b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f2806b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f2806b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f2806b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f2806b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.f2806b.n(i2);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f2806b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f2806b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.f2806b.q(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f2806b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z2) {
        this.f2806b.s(z2);
    }
}
