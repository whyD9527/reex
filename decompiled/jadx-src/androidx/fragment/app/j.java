package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    ArrayList<l> f1826e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<String> f1827f;

    /* renamed from: g, reason: collision with root package name */
    b[] f1828g;

    /* renamed from: h, reason: collision with root package name */
    String f1829h;

    /* renamed from: i, reason: collision with root package name */
    int f1830i;

    static class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i2) {
            return new j[i2];
        }
    }

    public j() {
        this.f1829h = null;
    }

    public j(Parcel parcel) {
        this.f1829h = null;
        this.f1826e = parcel.createTypedArrayList(l.CREATOR);
        this.f1827f = parcel.createStringArrayList();
        this.f1828g = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1829h = parcel.readString();
        this.f1830i = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f1826e);
        parcel.writeStringList(this.f1827f);
        parcel.writeTypedArray(this.f1828g, i2);
        parcel.writeString(this.f1829h);
        parcel.writeInt(this.f1830i);
    }
}
