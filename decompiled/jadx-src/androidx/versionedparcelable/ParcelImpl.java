package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    private final f0.b f2126e;

    static class a implements Parcelable.Creator<ParcelImpl> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i2) {
            return new ParcelImpl[i2];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f2126e = new b(parcel).u();
    }

    public ParcelImpl(f0.b bVar) {
        this.f2126e = bVar;
    }

    public <T extends f0.b> T a() {
        return (T) this.f2126e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        new b(parcel).L(this.f2126e);
    }
}
