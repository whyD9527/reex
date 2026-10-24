package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f1356g = {"_display_name", "_size"};

    /* renamed from: h, reason: collision with root package name */
    private static final File f1357h = new File("/");

    /* renamed from: i, reason: collision with root package name */
    private static final HashMap<String, b> f1358i = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private b f1359e;

    /* renamed from: f, reason: collision with root package name */
    private int f1360f = 0;

    static class a {
        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    interface b {
        File a(Uri uri);
    }

    static class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final String f1361a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap<String, File> f1362b = new HashMap<>();

        c(String str) {
            this.f1361a = str;
        }

        @Override // androidx.core.content.FileProvider.b
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f1362b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        void b(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f1362b.put(str, file.getCanonicalFile());
            } catch (IOException e3) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e3);
            }
        }
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] b(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        return objArr2;
    }

    private static String[] c(String[] strArr, int i2) {
        String[] strArr2 = new String[i2];
        System.arraycopy(strArr, 0, strArr2, 0, i2);
        return strArr2;
    }

    static XmlResourceParser d(Context context, String str, ProviderInfo providerInfo, int i2) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i2 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i2);
        }
        XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private static b e(Context context, String str, int i2) {
        b bVar;
        HashMap<String, b> hashMap = f1358i;
        synchronized (hashMap) {
            bVar = hashMap.get(str);
            if (bVar == null) {
                try {
                    try {
                        bVar = g(context, str, i2);
                        hashMap.put(str, bVar);
                    } catch (XmlPullParserException e3) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                    }
                } catch (IOException e4) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
                }
            }
        }
        return bVar;
    }

    private static int f(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private static b g(Context context, String str, int i2) {
        c cVar = new c(str);
        XmlResourceParser d3 = d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i2);
        while (true) {
            int next = d3.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = d3.getName();
                File file = null;
                String attributeValue = d3.getAttributeValue(null, "name");
                String attributeValue2 = d3.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f1357h;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] e3 = androidx.core.content.a.e(context, null);
                    if (e3.length > 0) {
                        file = e3[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] d4 = androidx.core.content.a.d(context);
                    if (d4.length > 0) {
                        file = d4[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] a3 = a.a(context);
                    if (a3.length > 0) {
                        file = a3[0];
                    }
                }
                if (file != null) {
                    cVar.b(attributeValue, a(file, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap<String, b> hashMap = f1358i;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
        this.f1359e = e(context, str, this.f1360f);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f1359e.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File a3 = this.f1359e.a(uri);
        int lastIndexOf = a3.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a3.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.f1359e.a(uri), f(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        File a3 = this.f1359e.a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f1356g;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i3 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i2 = i3 + 1;
                objArr[i3] = queryParameter == null ? a3.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i2 = i3 + 1;
                objArr[i3] = Long.valueOf(a3.length());
            }
            i3 = i2;
        }
        String[] c3 = c(strArr3, i3);
        Object[] b3 = b(objArr, i3);
        MatrixCursor matrixCursor = new MatrixCursor(c3, 1);
        matrixCursor.addRow(b3);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
