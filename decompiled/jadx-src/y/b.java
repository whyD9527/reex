package y;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    a f4505a;

    interface a {
        void a(Cursor cursor);

        Cursor b();

        Cursor c(CharSequence charSequence);

        CharSequence convertToString(Cursor cursor);
    }

    b(a aVar) {
        this.f4505a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f4505a.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c3 = this.f4505a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c3 != null) {
            filterResults.count = c3.getCount();
        } else {
            filterResults.count = 0;
            c3 = null;
        }
        filterResults.values = c3;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b3 = this.f4505a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == b3) {
            return;
        }
        this.f4505a.a((Cursor) obj);
    }
}
