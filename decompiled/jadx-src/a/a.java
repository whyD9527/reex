package a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String f0a = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0000a extends Binder implements a {

        /* renamed from: a.a$a$a, reason: collision with other inner class name */
        private static class C0001a implements a {

            /* renamed from: b, reason: collision with root package name */
            private IBinder f1b;

            C0001a(IBinder iBinder) {
                this.f1b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1b;
            }
        }

        public AbstractBinderC0000a() {
            attachInterface(this, a.f0a);
        }

        public static a j0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f0a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0001a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = a.f0a;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            g0(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void g0(int i2, Bundle bundle);
}
