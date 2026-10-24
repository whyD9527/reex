package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f2130d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f2131e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2132f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2133g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2134h;

    /* renamed from: i, reason: collision with root package name */
    private int f2135i;

    /* renamed from: j, reason: collision with root package name */
    private int f2136j;

    /* renamed from: k, reason: collision with root package name */
    private int f2137k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l.a(), new l.a(), new l.a());
    }

    private b(Parcel parcel, int i2, int i3, String str, l.a<String, Method> aVar, l.a<String, Method> aVar2, l.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2130d = new SparseIntArray();
        this.f2135i = -1;
        this.f2137k = -1;
        this.f2131e = parcel;
        this.f2132f = i2;
        this.f2133g = i3;
        this.f2136j = i2;
        this.f2134h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f2131e.writeInt(-1);
        } else {
            this.f2131e.writeInt(bArr.length);
            this.f2131e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2131e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i2) {
        this.f2131e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f2131e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f2131e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i2 = this.f2135i;
        if (i2 >= 0) {
            int i3 = this.f2130d.get(i2);
            int dataPosition = this.f2131e.dataPosition();
            this.f2131e.setDataPosition(i3);
            this.f2131e.writeInt(dataPosition - i3);
            this.f2131e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f2131e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f2136j;
        if (i2 == this.f2132f) {
            i2 = this.f2133g;
        }
        return new b(parcel, dataPosition, i2, this.f2134h + "  ", this.f2127a, this.f2128b, this.f2129c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f2131e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f2131e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2131e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2131e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i2) {
        while (this.f2136j < this.f2133g) {
            int i3 = this.f2137k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f2131e.setDataPosition(this.f2136j);
            int readInt = this.f2131e.readInt();
            this.f2137k = this.f2131e.readInt();
            this.f2136j += readInt;
        }
        return this.f2137k == i2;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f2131e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f2131e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f2131e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i2) {
        a();
        this.f2135i = i2;
        this.f2130d.put(i2, this.f2131e.dataPosition());
        E(0);
        E(i2);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z2) {
        this.f2131e.writeInt(z2 ? 1 : 0);
    }
}
