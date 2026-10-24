package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0006a extends Binder implements a {

        /* renamed from: android.support.v4.media.session.a$a$a, reason: collision with other inner class name */
        private static class C0007a implements a {

            /* renamed from: c, reason: collision with root package name */
            public static a f135c;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f136b;

            C0007a(IBinder iBinder) {
                this.f136b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f136b;
            }

            @Override // android.support.v4.media.session.a
            public void d0(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f136b.transact(3, obtain, null, 1) || AbstractBinderC0006a.k0() == null) {
                        return;
                    }
                    AbstractBinderC0006a.k0().d0(playbackStateCompat);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void i() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (this.f136b.transact(2, obtain, null, 1) || AbstractBinderC0006a.k0() == null) {
                        return;
                    }
                    AbstractBinderC0006a.k0().i();
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void k(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f136b.transact(4, obtain, null, 1) || AbstractBinderC0006a.k0() == null) {
                        return;
                    }
                    AbstractBinderC0006a.k0().k(mediaMetadataCompat);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0006a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static a j0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0007a(iBinder) : (a) queryLocalInterface;
        }

        public static a k0() {
            return C0007a.f135c;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    e0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    i();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    d0(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    k(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    I(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    d(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    E(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    h0(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    r(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    c(parcel.readInt() != 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    b0(parcel.readInt() != 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    C(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    D();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    void C(int i2);

    void D();

    void E(Bundle bundle);

    void I(List<MediaSessionCompat.QueueItem> list);

    void b0(boolean z2);

    void c(boolean z2);

    void d(CharSequence charSequence);

    void d0(PlaybackStateCompat playbackStateCompat);

    void e0(String str, Bundle bundle);

    void h0(ParcelableVolumeInfo parcelableVolumeInfo);

    void i();

    void k(MediaMetadataCompat mediaMetadataCompat);

    void r(int i2);
}
