package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.d0;
import androidx.core.view.f0;
import androidx.core.view.z0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class p {

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1929e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f1930f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f1931g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ArrayList f1932h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ArrayList f1933i;

        a(int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f1929e = i2;
            this.f1930f = arrayList;
            this.f1931g = arrayList2;
            this.f1932h = arrayList3;
            this.f1933i = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i2 = 0; i2 < this.f1929e; i2++) {
                f0.P((View) this.f1930f.get(i2), (String) this.f1931g.get(i2));
                f0.P((View) this.f1932h.get(i2), (String) this.f1933i.get(i2));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f1935e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f1936f;

        b(ArrayList arrayList, Map map) {
            this.f1935e = arrayList;
            this.f1936f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1935e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f1935e.get(i2);
                String r2 = f0.r(view);
                if (r2 != null) {
                    f0.P(view, p.i(this.f1936f, r2));
                }
            }
        }
    }

    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f1938e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f1939f;

        c(ArrayList arrayList, Map map) {
            this.f1938e = arrayList;
            this.f1939f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1938e.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f1938e.get(i2);
                f0.P(view, (String) this.f1939f.get(f0.r(view)));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract Object A(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z2 = view instanceof ViewGroup;
            View view2 = view;
            if (z2) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean a3 = z0.a(viewGroup);
                view2 = viewGroup;
                if (!a3) {
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        f(arrayList, viewGroup.getChildAt(i2));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    public abstract Object g(Object obj);

    void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String r2 = f0.r(view);
            if (r2 != null) {
                map.put(r2, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    j(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    protected void k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        rect.set(i2, iArr[1], view.getWidth() + i2, iArr[1] + view.getHeight());
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            arrayList2.add(f0.r(view));
            f0.P(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        d0.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    void w(View view, ArrayList<View> arrayList, Map<String, String> map) {
        d0.a(view, new b(arrayList, map));
    }

    void x(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            String r2 = f0.r(view2);
            arrayList4.add(r2);
            if (r2 != null) {
                f0.P(view2, null);
                String str = map.get(r2);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i3))) {
                        f0.P(arrayList2.get(i3), r2);
                        break;
                    }
                    i3++;
                }
            }
        }
        d0.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void y(Object obj, View view, ArrayList<View> arrayList);

    public abstract void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
