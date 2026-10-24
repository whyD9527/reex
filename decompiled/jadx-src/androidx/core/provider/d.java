package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<byte[]> f1466a = new Comparator() { // from class: androidx.core.provider.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g2;
            g2 = d.g((byte[]) obj, (byte[]) obj2);
            return g2;
        }
    };

    static class a {
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : androidx.core.content.res.e.c(resources, eVar.c());
    }

    static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) {
        ProviderInfo f2 = f(context.getPackageManager(), eVar, context.getResources());
        return f2 == null ? g.a.a(1, null) : g.a.a(0, h(context, eVar, f2.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        String e3 = eVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e3, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e3);
        }
        if (!resolveContentProvider.packageName.equals(eVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + e3 + ", but package was not " + eVar.f());
        }
        List<byte[]> b3 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(b3, f1466a);
        List<List<byte[]>> d3 = d(eVar, resources);
        for (int i2 = 0; i2 < d3.size(); i2++) {
            ArrayList arrayList = new ArrayList(d3.get(i2));
            Collections.sort(arrayList, f1466a);
            if (c(b3, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b3 = bArr[i2];
            byte b4 = bArr2[i2];
            if (b3 != b4) {
                return b3 - b4;
            }
        }
        return 0;
    }

    static g.b[] h(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        int i2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i3 = 0;
            cursor = a.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i4 = columnIndex != -1 ? cursor.getInt(columnIndex) : i3;
                    int i5 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i3;
                    int i6 = i4;
                    Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    int i7 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i2 = i6;
                        z2 = false;
                    } else {
                        i2 = i6;
                        z2 = true;
                    }
                    arrayList2.add(g.b.a(withAppendedId, i5, i7, z2, i2));
                    i3 = 0;
                }
                arrayList = arrayList2;
            }
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
