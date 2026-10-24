package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    public int f102e;

    /* renamed from: f, reason: collision with root package name */
    public int f103f;

    /* renamed from: g, reason: collision with root package name */
    public int f104g;

    /* renamed from: h, reason: collision with root package name */
    public int f105h;

    /* renamed from: i, reason: collision with root package name */
    public int f106i;

    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f102e = parcel.readInt();
        this.f104g = parcel.readInt();
        this.f105h = parcel.readInt();
        this.f106i = parcel.readInt();
        this.f103f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f102e);
        parcel.writeInt(this.f104g);
        parcel.writeInt(this.f105h);
        parcel.writeInt(this.f106i);
        parcel.writeInt(this.f103f);
    }
}
