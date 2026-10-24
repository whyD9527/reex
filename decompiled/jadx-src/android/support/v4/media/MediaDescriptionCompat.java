package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    private final String f20e;

    /* renamed from: f, reason: collision with root package name */
    private final CharSequence f21f;

    /* renamed from: g, reason: collision with root package name */
    private final CharSequence f22g;

    /* renamed from: h, reason: collision with root package name */
    private final CharSequence f23h;

    /* renamed from: i, reason: collision with root package name */
    private final Bitmap f24i;

    /* renamed from: j, reason: collision with root package name */
    private final Uri f25j;

    /* renamed from: k, reason: collision with root package name */
    private final Bundle f26k;

    /* renamed from: l, reason: collision with root package name */
    private final Uri f27l;

    /* renamed from: m, reason: collision with root package name */
    private MediaDescription f28m;

    class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f29a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f30b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f31c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f32d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f33e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f34f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f35g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f36h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f29a, this.f30b, this.f31c, this.f32d, this.f33e, this.f34f, this.f35g, this.f36h);
        }

        public b b(CharSequence charSequence) {
            this.f32d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f35g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f33e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f34f = uri;
            return this;
        }

        public b f(String str) {
            this.f29a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f36h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f31c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f30b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f20e = str;
        this.f21f = charSequence;
        this.f22g = charSequence2;
        this.f23h = charSequence3;
        this.f24i = bitmap;
        this.f25j = uri;
        this.f26k = bundle;
        this.f27l = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        b bVar = new b();
        MediaDescription mediaDescription = (MediaDescription) obj;
        bVar.f(mediaDescription.getMediaId());
        bVar.i(mediaDescription.getTitle());
        bVar.h(mediaDescription.getSubtitle());
        bVar.b(mediaDescription.getDescription());
        bVar.d(mediaDescription.getIconBitmap());
        bVar.e(mediaDescription.getIconUri());
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            extras = MediaSessionCompat.k(extras);
        }
        Uri uri = extras != null ? (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri != null) {
            if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
                extras.remove("android.support.v4.media.description.MEDIA_URI");
                extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            }
            bVar.c(bundle);
            if (uri == null) {
                bVar.g(uri);
            } else {
                bVar.g(mediaDescription.getMediaUri());
            }
            MediaDescriptionCompat a3 = bVar.a();
            a3.f28m = mediaDescription;
            return a3;
        }
        bundle = extras;
        bVar.c(bundle);
        if (uri == null) {
        }
        MediaDescriptionCompat a32 = bVar.a();
        a32.f28m = mediaDescription;
        return a32;
    }

    public Object b() {
        MediaDescription mediaDescription = this.f28m;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f20e);
        builder.setTitle(this.f21f);
        builder.setSubtitle(this.f22g);
        builder.setDescription(this.f23h);
        builder.setIconBitmap(this.f24i);
        builder.setIconUri(this.f25j);
        builder.setExtras(this.f26k);
        builder.setMediaUri(this.f27l);
        MediaDescription build = builder.build();
        this.f28m = build;
        return build;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f21f) + ", " + ((Object) this.f22g) + ", " + ((Object) this.f23h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        ((MediaDescription) b()).writeToParcel(parcel, i2);
    }
}
