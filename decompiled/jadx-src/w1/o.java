package w1;

import h1.r;
import h1.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o extends n {

    static final class a extends kotlin.jvm.internal.l implements q1.p<CharSequence, Integer, g1.j<? extends Integer, ? extends Integer>> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<String> f4384e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f4385f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, boolean z2) {
            super(2);
            this.f4384e = list;
            this.f4385f = z2;
        }

        public final g1.j<Integer, Integer> a(CharSequence $receiver, int i2) {
            kotlin.jvm.internal.k.e($receiver, "$this$$receiver");
            g1.j s2 = o.s($receiver, this.f4384e, i2, this.f4385f, false);
            if (s2 != null) {
                return g1.n.a(s2.c(), Integer.valueOf(((String) s2.d()).length()));
            }
            return null;
        }

        @Override // q1.p
        public /* bridge */ /* synthetic */ g1.j<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    static final class b extends kotlin.jvm.internal.l implements q1.l<t1.c, String> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CharSequence f4386e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence) {
            super(1);
            this.f4386e = charSequence;
        }

        @Override // q1.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(t1.c it) {
            kotlin.jvm.internal.k.e(it, "it");
            return o.P(this.f4386e, it);
        }
    }

    public static /* synthetic */ int A(CharSequence charSequence, String str, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return w(charSequence, str, i2, z2);
    }

    public static final int B(CharSequence charSequence, char[] chars, int i2, boolean z2) {
        int a3;
        boolean z3;
        char k2;
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        kotlin.jvm.internal.k.e(chars, "chars");
        if (!z2 && chars.length == 1 && (charSequence instanceof String)) {
            k2 = h1.f.k(chars);
            return ((String) charSequence).indexOf(k2, i2);
        }
        a3 = t1.f.a(i2, 0);
        w it = new t1.c(a3, u(charSequence)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            int length = chars.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z3 = false;
                    break;
                }
                if (w1.b.d(chars[i3], charAt, z2)) {
                    z3 = true;
                    break;
                }
                i3++;
            }
            if (z3) {
                return nextInt;
            }
        }
        return -1;
    }

    public static final int C(CharSequence charSequence, char c3, int i2, boolean z2) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? G(charSequence, new char[]{c3}, i2, z2) : ((String) charSequence).lastIndexOf(c3, i2);
    }

    public static final int D(CharSequence charSequence, String string, int i2, boolean z2) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        kotlin.jvm.internal.k.e(string, "string");
        return (z2 || !(charSequence instanceof String)) ? x(charSequence, string, i2, 0, z2, true) : ((String) charSequence).lastIndexOf(string, i2);
    }

    public static /* synthetic */ int E(CharSequence charSequence, char c3, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = u(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return C(charSequence, c3, i2, z2);
    }

    public static /* synthetic */ int F(CharSequence charSequence, String str, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = u(charSequence);
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return D(charSequence, str, i2, z2);
    }

    public static final int G(CharSequence charSequence, char[] chars, int i2, boolean z2) {
        int d3;
        char k2;
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        kotlin.jvm.internal.k.e(chars, "chars");
        if (!z2 && chars.length == 1 && (charSequence instanceof String)) {
            k2 = h1.f.k(chars);
            return ((String) charSequence).lastIndexOf(k2, i2);
        }
        for (d3 = t1.f.d(i2, u(charSequence)); -1 < d3; d3--) {
            char charAt = charSequence.charAt(d3);
            int length = chars.length;
            boolean z3 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (w1.b.d(chars[i3], charAt, z2)) {
                    z3 = true;
                    break;
                }
                i3++;
            }
            if (z3) {
                return d3;
            }
        }
        return -1;
    }

    public static final v1.b<String> H(CharSequence charSequence) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        return O(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> I(CharSequence charSequence) {
        List<String> e3;
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        e3 = v1.h.e(H(charSequence));
        return e3;
    }

    private static final v1.b<t1.c> J(CharSequence charSequence, String[] strArr, int i2, boolean z2, int i3) {
        List a3;
        M(i3);
        a3 = h1.e.a(strArr);
        return new d(charSequence, i2, i3, new a(a3, z2));
    }

    static /* synthetic */ v1.b K(CharSequence charSequence, String[] strArr, int i2, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return J(charSequence, strArr, i2, z2, i3);
    }

    public static final boolean L(CharSequence charSequence, int i2, CharSequence other, int i3, int i4, boolean z2) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        kotlin.jvm.internal.k.e(other, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > other.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!w1.b.d(charSequence.charAt(i2 + i5), other.charAt(i3 + i5), z2)) {
                return false;
            }
        }
        return true;
    }

    public static final void M(int i2) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2).toString());
    }

    public static final v1.b<String> N(CharSequence charSequence, String[] delimiters, boolean z2, int i2) {
        v1.b<String> c3;
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        kotlin.jvm.internal.k.e(delimiters, "delimiters");
        c3 = v1.h.c(K(charSequence, delimiters, 0, z2, i2, 2, null), new b(charSequence));
        return c3;
    }

    public static /* synthetic */ v1.b O(CharSequence charSequence, String[] strArr, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return N(charSequence, strArr, z2, i2);
    }

    public static final String P(CharSequence charSequence, t1.c range) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        kotlin.jvm.internal.k.e(range, "range");
        return charSequence.subSequence(range.h().intValue(), range.g().intValue() + 1).toString();
    }

    public static final String Q(String str, char c3, String missingDelimiterValue) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(missingDelimiterValue, "missingDelimiterValue");
        int z2 = z(str, c3, 0, false, 6, null);
        if (z2 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(z2 + 1, str.length());
        kotlin.jvm.internal.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String R(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(delimiter, "delimiter");
        kotlin.jvm.internal.k.e(missingDelimiterValue, "missingDelimiterValue");
        int A = A(str, delimiter, 0, false, 6, null);
        if (A == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(A + delimiter.length(), str.length());
        kotlin.jvm.internal.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String S(String str, char c3, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return Q(str, c3, str2);
    }

    public static /* synthetic */ String T(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return R(str, str2, str3);
    }

    public static final String U(String str, char c3, String missingDelimiterValue) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(missingDelimiterValue, "missingDelimiterValue");
        int E = E(str, c3, 0, false, 6, null);
        if (E == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(E + 1, str.length());
        kotlin.jvm.internal.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String V(String str, char c3, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return U(str, c3, str2);
    }

    public static final String W(String str, char c3, String missingDelimiterValue) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(missingDelimiterValue, "missingDelimiterValue");
        int z2 = z(str, c3, 0, false, 6, null);
        if (z2 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, z2);
        kotlin.jvm.internal.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String X(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.k.e(str, "<this>");
        kotlin.jvm.internal.k.e(delimiter, "delimiter");
        kotlin.jvm.internal.k.e(missingDelimiterValue, "missingDelimiterValue");
        int A = A(str, delimiter, 0, false, 6, null);
        if (A == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, A);
        kotlin.jvm.internal.k.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String Y(String str, char c3, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return W(str, c3, str2);
    }

    public static /* synthetic */ String Z(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return X(str, str2, str3);
    }

    public static CharSequence a0(CharSequence charSequence) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean c3 = w1.a.c(charSequence.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!c3) {
                    break;
                }
                length--;
            } else if (c3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final boolean q(CharSequence charSequence, CharSequence other, boolean z2) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        kotlin.jvm.internal.k.e(other, "other");
        if (other instanceof String) {
            if (A(charSequence, (String) other, 0, z2, 2, null) >= 0) {
                return true;
            }
        } else if (y(charSequence, other, 0, charSequence.length(), z2, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean r(CharSequence charSequence, CharSequence charSequence2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return q(charSequence, charSequence2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        return g1.n.a(java.lang.Integer.valueOf(r12), r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final g1.j<Integer, String> s(CharSequence charSequence, Collection<String> collection, int i2, boolean z2, boolean z3) {
        int d3;
        t1.a g2;
        int a3;
        Object obj;
        String str;
        Object obj2;
        int a4;
        Object p2;
        if (!z2 && collection.size() == 1) {
            p2 = r.p(collection);
            String str2 = (String) p2;
            int A = !z3 ? A(charSequence, str2, i2, false, 4, null) : F(charSequence, str2, i2, false, 4, null);
            if (A < 0) {
                return null;
            }
            return g1.n.a(Integer.valueOf(A), str2);
        }
        if (z3) {
            d3 = t1.f.d(i2, u(charSequence));
            g2 = t1.f.g(d3, 0);
        } else {
            a4 = t1.f.a(i2, 0);
            g2 = new t1.c(a4, charSequence.length());
        }
        if (charSequence instanceof String) {
            a3 = g2.a();
            int b3 = g2.b();
            int c3 = g2.c();
            if ((c3 > 0 && a3 <= b3) || (c3 < 0 && b3 <= a3)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str3 = (String) obj2;
                        if (n.m(str3, 0, (String) charSequence, a3, str3.length(), z2)) {
                            break;
                        }
                    }
                    str = (String) obj2;
                    if (str == null) {
                        if (a3 == b3) {
                            break;
                        }
                        a3 += c3;
                    } else {
                        break;
                    }
                }
            }
            return null;
        }
        a3 = g2.a();
        int b4 = g2.b();
        int c4 = g2.c();
        if ((c4 > 0 && a3 <= b4) || (c4 < 0 && b4 <= a3)) {
            while (true) {
                Iterator<T> it2 = collection.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    String str4 = (String) obj;
                    if (L(str4, 0, charSequence, a3, str4.length(), z2)) {
                        break;
                    }
                }
                str = (String) obj;
                if (str == null) {
                    if (a3 == b4) {
                        break;
                    }
                    a3 += c4;
                } else {
                    break;
                }
            }
        }
        return null;
    }

    public static final t1.c t(CharSequence charSequence) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        return new t1.c(0, charSequence.length() - 1);
    }

    public static final int u(CharSequence charSequence) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int v(CharSequence charSequence, char c3, int i2, boolean z2) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        return (z2 || !(charSequence instanceof String)) ? B(charSequence, new char[]{c3}, i2, z2) : ((String) charSequence).indexOf(c3, i2);
    }

    public static final int w(CharSequence charSequence, String string, int i2, boolean z2) {
        kotlin.jvm.internal.k.e(charSequence, "<this>");
        kotlin.jvm.internal.k.e(string, "string");
        return (z2 || !(charSequence instanceof String)) ? y(charSequence, string, i2, charSequence.length(), z2, false, 16, null) : ((String) charSequence).indexOf(string, i2);
    }

    private static final int x(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3) {
        int d3;
        int a3;
        t1.a g2;
        int a4;
        int d4;
        if (z3) {
            d3 = t1.f.d(i2, u(charSequence));
            a3 = t1.f.a(i3, 0);
            g2 = t1.f.g(d3, a3);
        } else {
            a4 = t1.f.a(i2, 0);
            d4 = t1.f.d(i3, charSequence.length());
            g2 = new t1.c(a4, d4);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int a5 = g2.a();
            int b3 = g2.b();
            int c3 = g2.c();
            if ((c3 <= 0 || a5 > b3) && (c3 >= 0 || b3 > a5)) {
                return -1;
            }
            while (!n.m((String) charSequence2, 0, (String) charSequence, a5, charSequence2.length(), z2)) {
                if (a5 == b3) {
                    return -1;
                }
                a5 += c3;
            }
            return a5;
        }
        int a6 = g2.a();
        int b4 = g2.b();
        int c4 = g2.c();
        if ((c4 <= 0 || a6 > b4) && (c4 >= 0 || b4 > a6)) {
            return -1;
        }
        while (!L(charSequence2, 0, charSequence, a6, charSequence2.length(), z2)) {
            if (a6 == b4) {
                return -1;
            }
            a6 += c4;
        }
        return a6;
    }

    static /* synthetic */ int y(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z2, boolean z3, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z3 = false;
        }
        return x(charSequence, charSequence2, i2, i3, z2, z3);
    }

    public static /* synthetic */ int z(CharSequence charSequence, char c3, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return v(charSequence, c3, i2, z2);
    }
}
