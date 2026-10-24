package android.os;

import android.annotation.NonNull;
import android.annotation.Nullable;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class LocaleList implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ LocaleList forLanguageTags(@Nullable String str);

    @NonNull
    public static native /* synthetic */ LocaleList getAdjustedDefault();

    public native /* synthetic */ boolean equals(@Nullable Object obj);

    public native /* synthetic */ Locale get(int i2);

    public native /* synthetic */ int size();
}
