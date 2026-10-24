package android.os.storage;

import android.content.Context;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final /* synthetic */ class StorageVolume implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ String getDescription(Context context);

    public native /* synthetic */ String getState();

    public native /* synthetic */ boolean isEmulated();

    public native /* synthetic */ boolean isPrimary();

    public native /* synthetic */ boolean isRemovable();
}
