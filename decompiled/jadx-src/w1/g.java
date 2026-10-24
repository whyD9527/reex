package w1;

import h1.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends f {

    static final class a extends kotlin.jvm.internal.l implements q1.l<String, String> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f4382e = new a();

        a() {
            super(1);
        }

        @Override // q1.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            kotlin.jvm.internal.k.e(line, "line");
            return line;
        }
    }

    static final class b extends kotlin.jvm.internal.l implements q1.l<String, String> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f4383e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f4383e = str;
        }

        @Override // q1.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            kotlin.jvm.internal.k.e(line, "line");
            return this.f4383e + line;
        }
    }

    private static final q1.l<String, String> b(String str) {
        return str.length() == 0 ? a.f4382e : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (!w1.a.c(str.charAt(i2))) {
                break;
            }
            i2++;
        }
        return i2 == -1 ? str.length() : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String d(String str, String newIndent) {
        int i2;
        Comparable o2;
        int d3;
        boolean l2;
        String b02;
        String invoke;
        boolean l3;
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(newIndent, "newIndent");
        List<String> I = o.I(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : I) {
            l3 = n.l((String) obj);
            if (!l3) {
                arrayList.add(obj);
            }
        }
        i2 = h1.k.i(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(i2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        o2 = r.o(arrayList2);
        Integer num = (Integer) o2;
        int i3 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * I.size());
        q1.l<String, String> b3 = b(newIndent);
        d3 = h1.j.d(I);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : I) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                h1.j.h();
            }
            String str2 = (String) obj2;
            if (i3 == 0 || i3 == d3) {
                l2 = n.l(str2);
                if (l2) {
                    str2 = null;
                    if (str2 == null) {
                        arrayList3.add(str2);
                    }
                    i3 = i4;
                }
            }
            b02 = q.b0(str2, intValue);
            if (b02 != null && (invoke = b3.invoke(b02)) != null) {
                str2 = invoke;
            }
            if (str2 == null) {
            }
            i3 = i4;
        }
        String sb = ((StringBuilder) h1.h.l(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, b.j.N0, null)).toString();
        kotlin.jvm.internal.k.d(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static String e(String str) {
        kotlin.jvm.internal.k.e(str, "<this>");
        return d(str, "");
    }
}
