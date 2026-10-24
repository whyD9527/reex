package androidx.core.widget;

import android.widget.ListView;

/* loaded from: classes.dex */
public final class i {

    static class a {
        static boolean a(ListView listView, int i2) {
            return listView.canScrollList(i2);
        }

        static void b(ListView listView, int i2) {
            listView.scrollListBy(i2);
        }
    }

    public static void a(ListView listView, int i2) {
        a.b(listView, i2);
    }
}
