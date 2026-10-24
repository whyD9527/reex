package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class a extends m implements i.k {

    /* renamed from: s, reason: collision with root package name */
    final i f1742s;

    /* renamed from: t, reason: collision with root package name */
    boolean f1743t;

    /* renamed from: u, reason: collision with root package name */
    int f1744u = -1;

    public a(i iVar) {
        this.f1742s = iVar;
    }

    private static boolean l(m.a aVar) {
        Fragment fragment = aVar.f1871b;
        return (fragment == null || !fragment.f1709o || fragment.K == null || fragment.D || fragment.C || !fragment.O()) ? false : true;
    }

    @Override // androidx.fragment.app.i.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (i.L) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1859h) {
            return true;
        }
        this.f1742s.g(this);
        return true;
    }

    void c(int i2) {
        if (this.f1859h) {
            if (i.L) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f1852a.size();
            for (int i3 = 0; i3 < size; i3++) {
                m.a aVar = this.f1852a.get(i3);
                Fragment fragment = aVar.f1871b;
                if (fragment != null) {
                    fragment.f1715u += i2;
                    if (i.L) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1871b + " to " + aVar.f1871b.f1715u);
                    }
                }
            }
        }
    }

    public void d(String str, PrintWriter printWriter) {
        e(str, printWriter, true);
    }

    public void e(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1861j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1744u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1743t);
            if (this.f1857f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1857f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1858g));
            }
            if (this.f1853b != 0 || this.f1854c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1853b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1854c));
            }
            if (this.f1855d != 0 || this.f1856e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1855d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1856e));
            }
            if (this.f1862k != 0 || this.f1863l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1862k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1863l);
            }
            if (this.f1864m != 0 || this.f1865n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1864m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1865n);
            }
        }
        if (this.f1852a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f1852a.size();
        for (int i2 = 0; i2 < size; i2++) {
            m.a aVar = this.f1852a.get(i2);
            switch (aVar.f1870a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f1870a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f1871b);
            if (z2) {
                if (aVar.f1872c != 0 || aVar.f1873d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1872c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1873d));
                }
                if (aVar.f1874e != 0 || aVar.f1875f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1874e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1875f));
                }
            }
        }
    }

    void f() {
        int size = this.f1852a.size();
        for (int i2 = 0; i2 < size; i2++) {
            m.a aVar = this.f1852a.get(i2);
            Fragment fragment = aVar.f1871b;
            if (fragment != null) {
                fragment.f1(this.f1857f, this.f1858g);
            }
            switch (aVar.f1870a) {
                case 1:
                    fragment.e1(aVar.f1872c);
                    this.f1742s.h(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1870a);
                case 3:
                    fragment.e1(aVar.f1873d);
                    this.f1742s.T0(fragment);
                    break;
                case 4:
                    fragment.e1(aVar.f1873d);
                    this.f1742s.x0(fragment);
                    break;
                case 5:
                    fragment.e1(aVar.f1872c);
                    this.f1742s.g1(fragment);
                    break;
                case 6:
                    fragment.e1(aVar.f1873d);
                    this.f1742s.s(fragment);
                    break;
                case 7:
                    fragment.e1(aVar.f1872c);
                    this.f1742s.l(fragment);
                    break;
                case 8:
                    this.f1742s.f1(fragment);
                    break;
                case 9:
                    this.f1742s.f1(null);
                    break;
                case 10:
                    this.f1742s.e1(fragment, aVar.f1877h);
                    break;
            }
            if (!this.f1868q && aVar.f1870a != 1 && fragment != null) {
                this.f1742s.J0(fragment);
            }
        }
        if (this.f1868q) {
            return;
        }
        i iVar = this.f1742s;
        iVar.K0(iVar.f1792t, true);
    }

    void g(boolean z2) {
        for (int size = this.f1852a.size() - 1; size >= 0; size--) {
            m.a aVar = this.f1852a.get(size);
            Fragment fragment = aVar.f1871b;
            if (fragment != null) {
                fragment.f1(i.Y0(this.f1857f), this.f1858g);
            }
            switch (aVar.f1870a) {
                case 1:
                    fragment.e1(aVar.f1875f);
                    this.f1742s.T0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1870a);
                case 3:
                    fragment.e1(aVar.f1874e);
                    this.f1742s.h(fragment, false);
                    break;
                case 4:
                    fragment.e1(aVar.f1874e);
                    this.f1742s.g1(fragment);
                    break;
                case 5:
                    fragment.e1(aVar.f1875f);
                    this.f1742s.x0(fragment);
                    break;
                case 6:
                    fragment.e1(aVar.f1874e);
                    this.f1742s.l(fragment);
                    break;
                case 7:
                    fragment.e1(aVar.f1875f);
                    this.f1742s.s(fragment);
                    break;
                case 8:
                    this.f1742s.f1(null);
                    break;
                case 9:
                    this.f1742s.f1(fragment);
                    break;
                case 10:
                    this.f1742s.e1(fragment, aVar.f1876g);
                    break;
            }
            if (!this.f1868q && aVar.f1870a != 3 && fragment != null) {
                this.f1742s.J0(fragment);
            }
        }
        if (this.f1868q || !z2) {
            return;
        }
        i iVar = this.f1742s;
        iVar.K0(iVar.f1792t, true);
    }

    Fragment h(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.f1852a.size()) {
            m.a aVar = this.f1852a.get(i2);
            int i3 = aVar.f1870a;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = aVar.f1871b;
                    int i4 = fragment3.A;
                    boolean z2 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.A == i4) {
                            if (fragment4 == fragment3) {
                                z2 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f1852a.add(i2, new m.a(9, fragment4));
                                    i2++;
                                    fragment2 = null;
                                }
                                m.a aVar2 = new m.a(3, fragment4);
                                aVar2.f1872c = aVar.f1872c;
                                aVar2.f1874e = aVar.f1874e;
                                aVar2.f1873d = aVar.f1873d;
                                aVar2.f1875f = aVar.f1875f;
                                this.f1852a.add(i2, aVar2);
                                arrayList.remove(fragment4);
                                i2++;
                            }
                        }
                    }
                    if (z2) {
                        this.f1852a.remove(i2);
                        i2--;
                    } else {
                        aVar.f1870a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList.remove(aVar.f1871b);
                    Fragment fragment5 = aVar.f1871b;
                    if (fragment5 == fragment2) {
                        this.f1852a.add(i2, new m.a(9, fragment5));
                        i2++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.f1852a.add(i2, new m.a(9, fragment2));
                        i2++;
                        fragment2 = aVar.f1871b;
                    }
                }
                i2++;
            }
            arrayList.add(aVar.f1871b);
            i2++;
        }
        return fragment2;
    }

    public String i() {
        return this.f1861j;
    }

    boolean j(int i2) {
        int size = this.f1852a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f1852a.get(i3).f1871b;
            int i4 = fragment != null ? fragment.A : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    boolean k(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f1852a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.f1852a.get(i5).f1871b;
            int i6 = fragment != null ? fragment.A : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.f1852a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.f1852a.get(i8).f1871b;
                        if ((fragment2 != null ? fragment2.A : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    boolean m() {
        for (int i2 = 0; i2 < this.f1852a.size(); i2++) {
            if (l(this.f1852a.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public void n() {
        if (this.f1869r != null) {
            for (int i2 = 0; i2 < this.f1869r.size(); i2++) {
                this.f1869r.get(i2).run();
            }
            this.f1869r = null;
        }
    }

    void o(Fragment.f fVar) {
        for (int i2 = 0; i2 < this.f1852a.size(); i2++) {
            m.a aVar = this.f1852a.get(i2);
            if (l(aVar)) {
                aVar.f1871b.g1(fVar);
            }
        }
    }

    Fragment p(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f1852a.size() - 1; size >= 0; size--) {
            m.a aVar = this.f1852a.get(size);
            int i2 = aVar.f1870a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f1871b;
                            break;
                        case 10:
                            aVar.f1877h = aVar.f1876g;
                            break;
                    }
                }
                arrayList.add(aVar.f1871b);
            }
            arrayList.remove(aVar.f1871b);
        }
        return fragment;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1744u >= 0) {
            sb.append(" #");
            sb.append(this.f1744u);
        }
        if (this.f1861j != null) {
            sb.append(" ");
            sb.append(this.f1861j);
        }
        sb.append("}");
        return sb.toString();
    }
}
