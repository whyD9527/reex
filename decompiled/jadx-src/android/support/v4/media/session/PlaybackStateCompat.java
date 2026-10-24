package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    final int f107e;

    /* renamed from: f, reason: collision with root package name */
    final long f108f;

    /* renamed from: g, reason: collision with root package name */
    final long f109g;

    /* renamed from: h, reason: collision with root package name */
    final float f110h;

    /* renamed from: i, reason: collision with root package name */
    final long f111i;

    /* renamed from: j, reason: collision with root package name */
    final int f112j;

    /* renamed from: k, reason: collision with root package name */
    final CharSequence f113k;

    /* renamed from: l, reason: collision with root package name */
    final long f114l;

    /* renamed from: m, reason: collision with root package name */
    List<CustomAction> f115m;

    /* renamed from: n, reason: collision with root package name */
    final long f116n;

    /* renamed from: o, reason: collision with root package name */
    final Bundle f117o;

    /* renamed from: p, reason: collision with root package name */
    private PlaybackState f118p;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        private final String f119e;

        /* renamed from: f, reason: collision with root package name */
        private final CharSequence f120f;

        /* renamed from: g, reason: collision with root package name */
        private final int f121g;

        /* renamed from: h, reason: collision with root package name */
        private final Bundle f122h;

        /* renamed from: i, reason: collision with root package name */
        private PlaybackState.CustomAction f123i;

        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        CustomAction(Parcel parcel) {
            this.f119e = parcel.readString();
            this.f120f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f121g = parcel.readInt();
            this.f122h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
            this.f119e = str;
            this.f120f = charSequence;
            this.f121g = i2;
            this.f122h = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle extras = customAction.getExtras();
            MediaSessionCompat.b(extras);
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
            customAction2.f123i = customAction;
            return customAction2;
        }

        public Object b() {
            PlaybackState.CustomAction customAction = this.f123i;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(this.f119e, this.f120f, this.f121g);
            builder.setExtras(this.f122h);
            return builder.build();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f120f) + ", mIcon=" + this.f121g + ", mExtras=" + this.f122h;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f119e);
            TextUtils.writeToParcel(this.f120f, parcel, i2);
            parcel.writeInt(this.f121g);
            parcel.writeBundle(this.f122h);
        }
    }

    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<CustomAction> f124a;

        /* renamed from: b, reason: collision with root package name */
        private int f125b;

        /* renamed from: c, reason: collision with root package name */
        private long f126c;

        /* renamed from: d, reason: collision with root package name */
        private long f127d;

        /* renamed from: e, reason: collision with root package name */
        private float f128e;

        /* renamed from: f, reason: collision with root package name */
        private long f129f;

        /* renamed from: g, reason: collision with root package name */
        private int f130g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f131h;

        /* renamed from: i, reason: collision with root package name */
        private long f132i;

        /* renamed from: j, reason: collision with root package name */
        private long f133j;

        /* renamed from: k, reason: collision with root package name */
        private Bundle f134k;

        public b() {
            this.f124a = new ArrayList();
            this.f133j = -1L;
        }

        public b(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f124a = arrayList;
            this.f133j = -1L;
            this.f125b = playbackStateCompat.f107e;
            this.f126c = playbackStateCompat.f108f;
            this.f128e = playbackStateCompat.f110h;
            this.f132i = playbackStateCompat.f114l;
            this.f127d = playbackStateCompat.f109g;
            this.f129f = playbackStateCompat.f111i;
            this.f130g = playbackStateCompat.f112j;
            this.f131h = playbackStateCompat.f113k;
            List<CustomAction> list = playbackStateCompat.f115m;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f133j = playbackStateCompat.f116n;
            this.f134k = playbackStateCompat.f117o;
        }

        public PlaybackStateCompat a() {
            return new PlaybackStateCompat(this.f125b, this.f126c, this.f127d, this.f128e, this.f129f, this.f130g, this.f131h, this.f132i, this.f124a, this.f133j, this.f134k);
        }

        public b b(long j2) {
            this.f129f = j2;
            return this;
        }

        public b c(int i2, long j2, float f2) {
            return d(i2, j2, f2, SystemClock.elapsedRealtime());
        }

        public b d(int i2, long j2, float f2, long j3) {
            this.f125b = i2;
            this.f126c = j2;
            this.f132i = j3;
            this.f128e = f2;
            return this;
        }
    }

    PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.f107e = i2;
        this.f108f = j2;
        this.f109g = j3;
        this.f110h = f2;
        this.f111i = j4;
        this.f112j = i3;
        this.f113k = charSequence;
        this.f114l = j5;
        this.f115m = new ArrayList(list);
        this.f116n = j6;
        this.f117o = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f107e = parcel.readInt();
        this.f108f = parcel.readLong();
        this.f110h = parcel.readFloat();
        this.f114l = parcel.readLong();
        this.f109g = parcel.readLong();
        this.f111i = parcel.readLong();
        this.f113k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f115m = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f116n = parcel.readLong();
        this.f117o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f112j = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            Iterator<PlaybackState.CustomAction> it = customActions.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.a(it.next()));
            }
        }
        Bundle extras = playbackState.getExtras();
        MediaSessionCompat.b(extras);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras);
        playbackStateCompat.f118p = playbackState;
        return playbackStateCompat;
    }

    public static int h(long j2) {
        if (j2 == 4) {
            return 126;
        }
        if (j2 == 2) {
            return 127;
        }
        if (j2 == 32) {
            return 87;
        }
        if (j2 == 16) {
            return 88;
        }
        if (j2 == 1) {
            return 86;
        }
        if (j2 == 64) {
            return 90;
        }
        if (j2 == 8) {
            return 89;
        }
        return j2 == 512 ? 85 : 0;
    }

    public long b() {
        return this.f111i;
    }

    public long c() {
        return this.f114l;
    }

    public float d() {
        return this.f110h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object e() {
        if (this.f118p == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(this.f107e, this.f108f, this.f110h, this.f114l);
            builder.setBufferedPosition(this.f109g);
            builder.setActions(this.f111i);
            builder.setErrorMessage(this.f113k);
            Iterator<CustomAction> it = this.f115m.iterator();
            while (it.hasNext()) {
                builder.addCustomAction((PlaybackState.CustomAction) it.next().b());
            }
            builder.setActiveQueueItemId(this.f116n);
            builder.setExtras(this.f117o);
            this.f118p = builder.build();
        }
        return this.f118p;
    }

    public long f() {
        return this.f108f;
    }

    public int g() {
        return this.f107e;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f107e + ", position=" + this.f108f + ", buffered position=" + this.f109g + ", speed=" + this.f110h + ", updated=" + this.f114l + ", actions=" + this.f111i + ", error code=" + this.f112j + ", error message=" + this.f113k + ", custom actions=" + this.f115m + ", active item id=" + this.f116n + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f107e);
        parcel.writeLong(this.f108f);
        parcel.writeFloat(this.f110h);
        parcel.writeLong(this.f114l);
        parcel.writeLong(this.f109g);
        parcel.writeLong(this.f111i);
        TextUtils.writeToParcel(this.f113k, parcel, i2);
        parcel.writeTypedList(this.f115m);
        parcel.writeLong(this.f116n);
        parcel.writeBundle(this.f117o);
        parcel.writeInt(this.f112j);
    }
}
