package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1430a = aVar.p(iconCompat.f1430a, 1);
        iconCompat.f1432c = aVar.j(iconCompat.f1432c, 2);
        iconCompat.f1433d = aVar.r(iconCompat.f1433d, 3);
        iconCompat.f1434e = aVar.p(iconCompat.f1434e, 4);
        iconCompat.f1435f = aVar.p(iconCompat.f1435f, 5);
        iconCompat.f1436g = (ColorStateList) aVar.r(iconCompat.f1436g, 6);
        iconCompat.f1438i = aVar.t(iconCompat.f1438i, 7);
        iconCompat.f1439j = aVar.t(iconCompat.f1439j, 8);
        iconCompat.m();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.n(aVar.f());
        int i2 = iconCompat.f1430a;
        if (-1 != i2) {
            aVar.F(i2, 1);
        }
        byte[] bArr = iconCompat.f1432c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1433d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i3 = iconCompat.f1434e;
        if (i3 != 0) {
            aVar.F(i3, 4);
        }
        int i4 = iconCompat.f1435f;
        if (i4 != 0) {
            aVar.F(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f1436g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f1438i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f1439j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
