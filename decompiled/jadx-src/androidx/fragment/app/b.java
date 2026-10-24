package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.m;
import androidx.lifecycle.d;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    final int[] f1745e;

    /* renamed from: f, reason: collision with root package name */
    final ArrayList<String> f1746f;

    /* renamed from: g, reason: collision with root package name */
    final int[] f1747g;

    /* renamed from: h, reason: collision with root package name */
    final int[] f1748h;

    /* renamed from: i, reason: collision with root package name */
    final int f1749i;

    /* renamed from: j, reason: collision with root package name */
    final int f1750j;

    /* renamed from: k, reason: collision with root package name */
    final String f1751k;

    /* renamed from: l, reason: collision with root package name */
    final int f1752l;

    /* renamed from: m, reason: collision with root package name */
    final int f1753m;

    /* renamed from: n, reason: collision with root package name */
    final CharSequence f1754n;

    /* renamed from: o, reason: collision with root package name */
    final int f1755o;

    /* renamed from: p, reason: collision with root package name */
    final CharSequence f1756p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList<String> f1757q;

    /* renamed from: r, reason: collision with root package name */
    final ArrayList<String> f1758r;

    /* renamed from: s, reason: collision with root package name */
    final boolean f1759s;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(Parcel parcel) {
        this.f1745e = parcel.createIntArray();
        this.f1746f = parcel.createStringArrayList();
        this.f1747g = parcel.createIntArray();
        this.f1748h = parcel.createIntArray();
        this.f1749i = parcel.readInt();
        this.f1750j = parcel.readInt();
        this.f1751k = parcel.readString();
        this.f1752l = parcel.readInt();
        this.f1753m = parcel.readInt();
        this.f1754n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1755o = parcel.readInt();
        this.f1756p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1757q = parcel.createStringArrayList();
        this.f1758r = parcel.createStringArrayList();
        this.f1759s = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f1852a.size();
        this.f1745e = new int[size * 5];
        if (!aVar.f1859h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1746f = new ArrayList<>(size);
        this.f1747g = new int[size];
        this.f1748h = new int[size];
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            m.a aVar2 = aVar.f1852a.get(i2);
            int i4 = i3 + 1;
            this.f1745e[i3] = aVar2.f1870a;
            ArrayList<String> arrayList = this.f1746f;
            Fragment fragment = aVar2.f1871b;
            arrayList.add(fragment != null ? fragment.f1703i : null);
            int[] iArr = this.f1745e;
            int i5 = i4 + 1;
            iArr[i4] = aVar2.f1872c;
            int i6 = i5 + 1;
            iArr[i5] = aVar2.f1873d;
            int i7 = i6 + 1;
            iArr[i6] = aVar2.f1874e;
            iArr[i7] = aVar2.f1875f;
            this.f1747g[i2] = aVar2.f1876g.ordinal();
            this.f1748h[i2] = aVar2.f1877h.ordinal();
            i2++;
            i3 = i7 + 1;
        }
        this.f1749i = aVar.f1857f;
        this.f1750j = aVar.f1858g;
        this.f1751k = aVar.f1861j;
        this.f1752l = aVar.f1744u;
        this.f1753m = aVar.f1862k;
        this.f1754n = aVar.f1863l;
        this.f1755o = aVar.f1864m;
        this.f1756p = aVar.f1865n;
        this.f1757q = aVar.f1866o;
        this.f1758r = aVar.f1867p;
        this.f1759s = aVar.f1868q;
    }

    public androidx.fragment.app.a a(i iVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(iVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f1745e.length) {
            m.a aVar2 = new m.a();
            int i4 = i2 + 1;
            aVar2.f1870a = this.f1745e[i2];
            if (i.L) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f1745e[i4]);
            }
            String str = this.f1746f.get(i3);
            aVar2.f1871b = str != null ? iVar.f1783k.get(str) : null;
            aVar2.f1876g = d.c.values()[this.f1747g[i3]];
            aVar2.f1877h = d.c.values()[this.f1748h[i3]];
            int[] iArr = this.f1745e;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            aVar2.f1872c = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar2.f1873d = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar2.f1874e = i10;
            int i11 = iArr[i9];
            aVar2.f1875f = i11;
            aVar.f1853b = i6;
            aVar.f1854c = i8;
            aVar.f1855d = i10;
            aVar.f1856e = i11;
            aVar.b(aVar2);
            i3++;
            i2 = i9 + 1;
        }
        aVar.f1857f = this.f1749i;
        aVar.f1858g = this.f1750j;
        aVar.f1861j = this.f1751k;
        aVar.f1744u = this.f1752l;
        aVar.f1859h = true;
        aVar.f1862k = this.f1753m;
        aVar.f1863l = this.f1754n;
        aVar.f1864m = this.f1755o;
        aVar.f1865n = this.f1756p;
        aVar.f1866o = this.f1757q;
        aVar.f1867p = this.f1758r;
        aVar.f1868q = this.f1759s;
        aVar.c(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1745e);
        parcel.writeStringList(this.f1746f);
        parcel.writeIntArray(this.f1747g);
        parcel.writeIntArray(this.f1748h);
        parcel.writeInt(this.f1749i);
        parcel.writeInt(this.f1750j);
        parcel.writeString(this.f1751k);
        parcel.writeInt(this.f1752l);
        parcel.writeInt(this.f1753m);
        TextUtils.writeToParcel(this.f1754n, parcel, 0);
        parcel.writeInt(this.f1755o);
        TextUtils.writeToParcel(this.f1756p, parcel, 0);
        parcel.writeStringList(this.f1757q);
        parcel.writeStringList(this.f1758r);
        parcel.writeInt(this.f1759s ? 1 : 0);
    }
}
