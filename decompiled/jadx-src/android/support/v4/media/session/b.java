package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.k;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        private static class C0008a implements b {

            /* renamed from: c, reason: collision with root package name */
            public static b f137c;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f138b;

            C0008a(IBinder iBinder) {
                this.f138b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f138b;
            }

            @Override // android.support.v4.media.session.b
            public void g(android.support.v4.media.session.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f138b.transact(3, obtain, obtain2, 0) || a.k0() == null) {
                        obtain2.readException();
                    } else {
                        a.k0().g(aVar);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean i0(KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f138b.transact(2, obtain, obtain2, 0) && a.k0() != null) {
                        return a.k0().i0(keyEvent);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static b j0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0008a(iBinder) : (b) queryLocalInterface;
        }

        public static b k0() {
            return C0008a.f137c;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    G(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean i02 = i0(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(i02 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    g(a.AbstractBinderC0006a.j0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    P(a.AbstractBinderC0006a.j0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean t2 = t();
                    parcel2.writeNoException();
                    parcel2.writeInt(t2 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String c02 = c0();
                    parcel2.writeNoException();
                    parcel2.writeString(c02);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String l2 = l();
                    parcel2.writeNoException();
                    parcel2.writeString(l2);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent v2 = v();
                    parcel2.writeNoException();
                    if (v2 != null) {
                        parcel2.writeInt(1);
                        v2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long R = R();
                    parcel2.writeNoException();
                    parcel2.writeLong(R);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ParcelableVolumeInfo W = W();
                    parcel2.writeNoException();
                    if (W != null) {
                        parcel2.writeInt(1);
                        W.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    f(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    p(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    F();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Q(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    V(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Y(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    T(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    X();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    K();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Z(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    o(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    e(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaMetadataCompat M = M();
                    parcel2.writeNoException();
                    if (M != null) {
                        parcel2.writeInt(1);
                        M.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat a3 = a();
                    parcel2.writeNoException();
                    if (a3 != null) {
                        parcel2.writeInt(1);
                        a3.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    List<MediaSessionCompat.QueueItem> H = H();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(H);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence L = L();
                    parcel2.writeNoException();
                    if (L != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(L, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case k.T /* 31 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle extras = getExtras();
                    parcel2.writeNoException();
                    if (extras != null) {
                        parcel2.writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case k.U /* 32 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int y2 = y();
                    parcel2.writeNoException();
                    parcel2.writeInt(y2);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    B();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    N(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case k.B3 /* 35 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    z(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case k.C3 /* 36 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    q(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case k.D3 /* 37 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int S = S();
                    parcel2.writeNoException();
                    parcel2.writeInt(S);
                    return true;
                case k.E3 /* 38 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean m2 = m();
                    parcel2.writeNoException();
                    parcel2.writeInt(m2 ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    J(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    U(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    u(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    j(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    s(parcel.readInt() != 0 ? MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    x(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean A = A();
                    parcel2.writeNoException();
                    parcel2.writeInt(A ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int w2 = w();
                    parcel2.writeNoException();
                    parcel2.writeInt(w2);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    a0(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    f0(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle O = O();
                    parcel2.writeNoException();
                    if (O != null) {
                        parcel2.writeInt(1);
                        O.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    h(parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    boolean A();

    void B();

    void F();

    void G(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    List<MediaSessionCompat.QueueItem> H();

    void J(int i2);

    void K();

    CharSequence L();

    MediaMetadataCompat M();

    void N(String str, Bundle bundle);

    Bundle O();

    void P(android.support.v4.media.session.a aVar);

    void Q(String str, Bundle bundle);

    long R();

    int S();

    void T(long j2);

    void U(boolean z2);

    void V(String str, Bundle bundle);

    ParcelableVolumeInfo W();

    void X();

    void Y(Uri uri, Bundle bundle);

    void Z(long j2);

    PlaybackStateCompat a();

    void a0(int i2);

    void b();

    String c0();

    void e(String str, Bundle bundle);

    void f(int i2, int i3, String str);

    void f0(float f2);

    void g(android.support.v4.media.session.a aVar);

    Bundle getExtras();

    void h(RatingCompat ratingCompat, Bundle bundle);

    boolean i0(KeyEvent keyEvent);

    void j(MediaDescriptionCompat mediaDescriptionCompat, int i2);

    String l();

    boolean m();

    void n(boolean z2);

    void next();

    void o(RatingCompat ratingCompat);

    void p(int i2, int i3, String str);

    void previous();

    void q(Uri uri, Bundle bundle);

    void s(MediaDescriptionCompat mediaDescriptionCompat);

    void stop();

    boolean t();

    void u(MediaDescriptionCompat mediaDescriptionCompat);

    PendingIntent v();

    int w();

    void x(int i2);

    int y();

    void z(String str, Bundle bundle);
}
