package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.d;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    final String f1838e;

    /* renamed from: f, reason: collision with root package name */
    final String f1839f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f1840g;

    /* renamed from: h, reason: collision with root package name */
    final int f1841h;

    /* renamed from: i, reason: collision with root package name */
    final int f1842i;

    /* renamed from: j, reason: collision with root package name */
    final String f1843j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f1844k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f1845l;

    /* renamed from: m, reason: collision with root package name */
    final boolean f1846m;

    /* renamed from: n, reason: collision with root package name */
    final Bundle f1847n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f1848o;

    /* renamed from: p, reason: collision with root package name */
    final int f1849p;

    /* renamed from: q, reason: collision with root package name */
    Bundle f1850q;

    /* renamed from: r, reason: collision with root package name */
    Fragment f1851r;

    static class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i2) {
            return new l[i2];
        }
    }

    l(Parcel parcel) {
        this.f1838e = parcel.readString();
        this.f1839f = parcel.readString();
        this.f1840g = parcel.readInt() != 0;
        this.f1841h = parcel.readInt();
        this.f1842i = parcel.readInt();
        this.f1843j = parcel.readString();
        this.f1844k = parcel.readInt() != 0;
        this.f1845l = parcel.readInt() != 0;
        this.f1846m = parcel.readInt() != 0;
        this.f1847n = parcel.readBundle();
        this.f1848o = parcel.readInt() != 0;
        this.f1850q = parcel.readBundle();
        this.f1849p = parcel.readInt();
    }

    l(Fragment fragment) {
        this.f1838e = fragment.getClass().getName();
        this.f1839f = fragment.f1703i;
        this.f1840g = fragment.f1711q;
        this.f1841h = fragment.f1720z;
        this.f1842i = fragment.A;
        this.f1843j = fragment.B;
        this.f1844k = fragment.E;
        this.f1845l = fragment.f1710p;
        this.f1846m = fragment.D;
        this.f1847n = fragment.f1704j;
        this.f1848o = fragment.C;
        this.f1849p = fragment.V.ordinal();
    }

    public Fragment a(ClassLoader classLoader, f fVar) {
        Fragment fragment;
        Bundle bundle;
        if (this.f1851r == null) {
            Bundle bundle2 = this.f1847n;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment a3 = fVar.a(classLoader, this.f1838e);
            this.f1851r = a3;
            a3.c1(this.f1847n);
            Bundle bundle3 = this.f1850q;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.f1851r;
                bundle = this.f1850q;
            } else {
                fragment = this.f1851r;
                bundle = new Bundle();
            }
            fragment.f1700f = bundle;
            Fragment fragment2 = this.f1851r;
            fragment2.f1703i = this.f1839f;
            fragment2.f1711q = this.f1840g;
            fragment2.f1713s = true;
            fragment2.f1720z = this.f1841h;
            fragment2.A = this.f1842i;
            fragment2.B = this.f1843j;
            fragment2.E = this.f1844k;
            fragment2.f1710p = this.f1845l;
            fragment2.D = this.f1846m;
            fragment2.C = this.f1848o;
            fragment2.V = d.c.values()[this.f1849p];
            if (i.L) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f1851r);
            }
        }
        return this.f1851r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1838e);
        sb.append(" (");
        sb.append(this.f1839f);
        sb.append(")}:");
        if (this.f1840g) {
            sb.append(" fromLayout");
        }
        if (this.f1842i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1842i));
        }
        String str = this.f1843j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1843j);
        }
        if (this.f1844k) {
            sb.append(" retainInstance");
        }
        if (this.f1845l) {
            sb.append(" removing");
        }
        if (this.f1846m) {
            sb.append(" detached");
        }
        if (this.f1848o) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1838e);
        parcel.writeString(this.f1839f);
        parcel.writeInt(this.f1840g ? 1 : 0);
        parcel.writeInt(this.f1841h);
        parcel.writeInt(this.f1842i);
        parcel.writeString(this.f1843j);
        parcel.writeInt(this.f1844k ? 1 : 0);
        parcel.writeInt(this.f1845l ? 1 : 0);
        parcel.writeInt(this.f1846m ? 1 : 0);
        parcel.writeBundle(this.f1847n);
        parcel.writeInt(this.f1848o ? 1 : 0);
        parcel.writeBundle(this.f1850q);
        parcel.writeInt(this.f1849p);
    }
}
