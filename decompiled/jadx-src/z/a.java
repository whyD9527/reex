package z;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: e, reason: collision with root package name */
    private final Parcelable f4729e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f4728f = new C0075a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: z.a$a, reason: collision with other inner class name */
    static class C0075a extends a {
        C0075a() {
            super((C0075a) null);
        }
    }

    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f4728f;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    private a() {
        this.f4729e = null;
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f4729e = readParcelable == null ? f4728f : readParcelable;
    }

    protected a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f4729e = parcelable == f4728f ? null : parcelable;
    }

    /* synthetic */ a(C0075a c0075a) {
        this();
    }

    public final Parcelable a() {
        return this.f4729e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f4729e, i2);
    }
}
