package y;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import y.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: e, reason: collision with root package name */
    protected boolean f4495e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f4496f;

    /* renamed from: g, reason: collision with root package name */
    protected Cursor f4497g;

    /* renamed from: h, reason: collision with root package name */
    protected Context f4498h;

    /* renamed from: i, reason: collision with root package name */
    protected int f4499i;

    /* renamed from: j, reason: collision with root package name */
    protected C0071a f4500j;

    /* renamed from: k, reason: collision with root package name */
    protected DataSetObserver f4501k;

    /* renamed from: l, reason: collision with root package name */
    protected y.b f4502l;

    /* renamed from: y.a$a, reason: collision with other inner class name */
    private class C0071a extends ContentObserver {
        C0071a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            a.this.h();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f4495e = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f4495e = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z2) {
        e(context, cursor, z2 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor i2 = i(cursor);
        if (i2 != null) {
            i2.close();
        }
    }

    @Override // y.b.a
    public Cursor b() {
        return this.f4497g;
    }

    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    void e(Context context, Cursor cursor, int i2) {
        b bVar;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f4496f = true;
        } else {
            this.f4496f = false;
        }
        boolean z2 = cursor != null;
        this.f4497g = cursor;
        this.f4495e = z2;
        this.f4498h = context;
        this.f4499i = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f4500j = new C0071a();
            bVar = new b();
        } else {
            bVar = null;
            this.f4500j = null;
        }
        this.f4501k = bVar;
        if (z2) {
            C0071a c0071a = this.f4500j;
            if (c0071a != null) {
                cursor.registerContentObserver(c0071a);
            }
            DataSetObserver dataSetObserver = this.f4501k;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f4495e || (cursor = this.f4497g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f4495e) {
            return null;
        }
        this.f4497g.moveToPosition(i2);
        if (view == null) {
            view = f(this.f4498h, this.f4497g, viewGroup);
        }
        d(view, this.f4498h, this.f4497g);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f4502l == null) {
            this.f4502l = new y.b(this);
        }
        return this.f4502l;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f4495e || (cursor = this.f4497g) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f4497g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (this.f4495e && (cursor = this.f4497g) != null && cursor.moveToPosition(i2)) {
            return this.f4497g.getLong(this.f4499i);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f4495e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f4497g.moveToPosition(i2)) {
            if (view == null) {
                view = g(this.f4498h, this.f4497g, viewGroup);
            }
            d(view, this.f4498h, this.f4497g);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i2);
    }

    protected void h() {
        Cursor cursor;
        if (!this.f4496f || (cursor = this.f4497g) == null || cursor.isClosed()) {
            return;
        }
        this.f4495e = this.f4497g.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f4497g;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0071a c0071a = this.f4500j;
            if (c0071a != null) {
                cursor2.unregisterContentObserver(c0071a);
            }
            DataSetObserver dataSetObserver = this.f4501k;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f4497g = cursor;
        if (cursor != null) {
            C0071a c0071a2 = this.f4500j;
            if (c0071a2 != null) {
                cursor.registerContentObserver(c0071a2);
            }
            DataSetObserver dataSetObserver2 = this.f4501k;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f4499i = cursor.getColumnIndexOrThrow("_id");
            this.f4495e = true;
            notifyDataSetChanged();
        } else {
            this.f4499i = -1;
            this.f4495e = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
