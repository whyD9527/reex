package a;

import a.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    final boolean f2e = false;

    /* renamed from: f, reason: collision with root package name */
    final Handler f3f = null;

    /* renamed from: g, reason: collision with root package name */
    a.a f4g;

    class a implements Parcelable.Creator<b> {
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

    /* renamed from: a.b$b, reason: collision with other inner class name */
    class BinderC0002b extends a.AbstractBinderC0000a {
        BinderC0002b() {
        }

        @Override // a.a
        public void g0(int i2, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f3f;
            if (handler != null) {
                handler.post(bVar.new c(i2, bundle));
            } else {
                bVar.a(i2, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final int f6e;

        /* renamed from: f, reason: collision with root package name */
        final Bundle f7f;

        c(int i2, Bundle bundle) {
            this.f6e = i2;
            this.f7f = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f6e, this.f7f);
        }
    }

    b(Parcel parcel) {
        this.f4g = a.AbstractBinderC0000a.j0(parcel.readStrongBinder());
    }

    protected void a(int i2, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f4g == null) {
                this.f4g = new BinderC0002b();
            }
            parcel.writeStrongBinder(this.f4g.asBinder());
        }
    }
}
