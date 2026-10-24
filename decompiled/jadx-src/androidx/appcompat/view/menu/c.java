package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    Context f308e;

    /* renamed from: f, reason: collision with root package name */
    LayoutInflater f309f;

    /* renamed from: g, reason: collision with root package name */
    e f310g;

    /* renamed from: h, reason: collision with root package name */
    ExpandedMenuView f311h;

    /* renamed from: i, reason: collision with root package name */
    int f312i;

    /* renamed from: j, reason: collision with root package name */
    int f313j;

    /* renamed from: k, reason: collision with root package name */
    int f314k;

    /* renamed from: l, reason: collision with root package name */
    private j.a f315l;

    /* renamed from: m, reason: collision with root package name */
    a f316m;

    private class a extends BaseAdapter {

        /* renamed from: e, reason: collision with root package name */
        private int f317e = -1;

        public a() {
            a();
        }

        void a() {
            g v2 = c.this.f310g.v();
            if (v2 != null) {
                ArrayList<g> z2 = c.this.f310g.z();
                int size = z2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (z2.get(i2) == v2) {
                        this.f317e = i2;
                        return;
                    }
                }
            }
            this.f317e = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i2) {
            ArrayList<g> z2 = c.this.f310g.z();
            int i3 = i2 + c.this.f312i;
            int i4 = this.f317e;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return z2.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f310g.z().size() - c.this.f312i;
            return this.f317e < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f309f.inflate(cVar.f314k, viewGroup, false);
            }
            ((k.a) view).d(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i2, int i3) {
        this.f314k = i2;
        this.f313j = i3;
    }

    public c(Context context, int i2) {
        this(i2, 0);
        this.f308e = context;
        this.f309f = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f316m == null) {
            this.f316m = new a();
        }
        return this.f316m;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z2) {
        j.a aVar = this.f315l;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    public k c(ViewGroup viewGroup) {
        if (this.f311h == null) {
            this.f311h = (ExpandedMenuView) this.f309f.inflate(b.g.f2255g, viewGroup, false);
            if (this.f316m == null) {
                this.f316m = new a();
            }
            this.f311h.setAdapter((ListAdapter) this.f316m);
            this.f311h.setOnItemClickListener(this);
        }
        return this.f311h;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(Context context, e eVar) {
        LayoutInflater from;
        a aVar;
        if (this.f313j == 0) {
            if (this.f308e != null) {
                this.f308e = context;
                if (this.f309f == null) {
                    from = LayoutInflater.from(context);
                }
            }
            this.f310g = eVar;
            aVar = this.f316m;
            if (aVar == null) {
                aVar.notifyDataSetChanged();
                return;
            }
            return;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f313j);
        this.f308e = contextThemeWrapper;
        from = LayoutInflater.from(contextThemeWrapper);
        this.f309f = from;
        this.f310g = eVar;
        aVar = this.f316m;
        if (aVar == null) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).d(null);
        j.a aVar = this.f315l;
        if (aVar == null) {
            return true;
        }
        aVar.c(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z2) {
        a aVar = this.f316m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(j.a aVar) {
        this.f315l = aVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f310g.M(this.f316m.getItem(i2), this, 0);
    }
}
