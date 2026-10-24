package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    private final int f44e;

    /* renamed from: f, reason: collision with root package name */
    private final float f45f;

    /* renamed from: g, reason: collision with root package name */
    private Object f46g;

    class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i2) {
            return new RatingCompat[i2];
        }
    }

    RatingCompat(int i2, float f2) {
        this.f44e = i2;
        this.f45f = f2;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = b(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = e(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = d(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = c(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = f(ratingStyle);
            }
            ratingCompat.f46g = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat b(boolean z2) {
        return new RatingCompat(1, z2 ? 1.0f : 0.0f);
    }

    public static RatingCompat c(float f2) {
        if (f2 >= 0.0f && f2 <= 100.0f) {
            return new RatingCompat(6, f2);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat d(int i2, float f2) {
        float f3;
        String str;
        if (i2 == 3) {
            f3 = 3.0f;
        } else if (i2 == 4) {
            f3 = 4.0f;
        } else {
            if (i2 != 5) {
                str = "Invalid rating style (" + i2 + ") for a star rating";
                Log.e("Rating", str);
                return null;
            }
            f3 = 5.0f;
        }
        if (f2 >= 0.0f && f2 <= f3) {
            return new RatingCompat(i2, f2);
        }
        str = "Trying to set out of range star-based rating";
        Log.e("Rating", str);
        return null;
    }

    public static RatingCompat e(boolean z2) {
        return new RatingCompat(2, z2 ? 1.0f : 0.0f);
    }

    public static RatingCompat f(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i2, -1.0f);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f44e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f44e);
        sb.append(" rating=");
        float f2 = this.f45f;
        sb.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f44e);
        parcel.writeFloat(this.f45f);
    }
}
