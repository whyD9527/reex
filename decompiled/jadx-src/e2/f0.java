package e2;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s0.a;
import z0.k;

/* loaded from: classes.dex */
public final class f0 implements s0.a, k.c, t0.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2655d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private z0.k f2656a;

    /* renamed from: b, reason: collision with root package name */
    private t0.c f2657b;

    /* renamed from: c, reason: collision with root package name */
    private Context f2658c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b implements z0.m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f2659a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f2660b;

        b(k.d dVar, f0 f0Var) {
            this.f2659a = dVar;
            this.f2660b = f0Var;
        }

        @Override // z0.m
        public boolean a(int i2, int i3, Intent intent) {
            k.d dVar;
            Boolean bool;
            if (i2 != 7889426) {
                return false;
            }
            if (i3 == -1) {
                dVar = this.f2659a;
                bool = Boolean.TRUE;
            } else {
                dVar = this.f2659a;
                bool = Boolean.FALSE;
            }
            dVar.a(bool);
            t0.c cVar = this.f2660b.f2657b;
            if (cVar == null) {
                kotlin.jvm.internal.k.o("activityBinding");
                cVar = null;
            }
            cVar.a(this);
            return true;
        }
    }

    public static final class c implements z0.m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f2661a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f2662b;

        c(k.d dVar, f0 f0Var) {
            this.f2661a = dVar;
            this.f2662b = f0Var;
        }

        @Override // z0.m
        public boolean a(int i2, int i3, Intent intent) {
            k.d dVar;
            Boolean bool;
            if (i2 != 7889427) {
                return false;
            }
            if (i3 == -1) {
                dVar = this.f2661a;
                bool = Boolean.TRUE;
            } else {
                dVar = this.f2661a;
                bool = Boolean.FALSE;
            }
            dVar.a(bool);
            t0.c cVar = this.f2662b.f2657b;
            if (cVar == null) {
                kotlin.jvm.internal.k.o("activityBinding");
                cVar = null;
            }
            cVar.a(this);
            return true;
        }
    }

    private final Activity c() {
        t0.c cVar = this.f2657b;
        if (cVar == null) {
            kotlin.jvm.internal.k.o("activityBinding");
            cVar = null;
        }
        Activity d3 = cVar.d();
        kotlin.jvm.internal.k.d(d3, "activityBinding.activity");
        return d3;
    }

    private final ContentResolver d() {
        Context context = this.f2658c;
        if (context == null) {
            kotlin.jvm.internal.k.o("applicationContext");
            context = null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        kotlin.jvm.internal.k.d(contentResolver, "applicationContext.contentResolver");
        return contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Map map, List paths, k.d result, String path, Uri uri) {
        kotlin.jvm.internal.k.e(map, "$map");
        kotlin.jvm.internal.k.e(paths, "$paths");
        kotlin.jvm.internal.k.e(result, "$result");
        kotlin.jvm.internal.k.e(path, "path");
        map.put(path, uri != null ? uri.toString() : null);
        if (map.size() == paths.size()) {
            result.a(map);
        }
    }

    private final List<u> g(String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Uri contentUri;
        String string;
        long j2;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        long j3;
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"_id", "_display_name", "relative_path", "volume_name", "_size", "date_modified", "author", "album", "artist", "album_artist", "title", "duration", "_data"};
        Uri contentUri2 = MediaStore.Audio.Media.getContentUri(str);
        Context context = this.f2658c;
        if (context == null) {
            kotlin.jvm.internal.k.o("applicationContext");
            context = null;
        }
        Cursor query = context.getContentResolver().query(contentUri2, strArr, null, null, null);
        if (query != null) {
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("_display_name");
                int columnIndexOrThrow3 = query.getColumnIndexOrThrow("relative_path");
                int columnIndexOrThrow4 = query.getColumnIndexOrThrow("_size");
                int columnIndexOrThrow5 = query.getColumnIndexOrThrow("volume_name");
                int columnIndexOrThrow6 = query.getColumnIndexOrThrow("date_modified");
                int columnIndexOrThrow7 = query.getColumnIndexOrThrow("author");
                int columnIndexOrThrow8 = query.getColumnIndexOrThrow("album");
                int columnIndexOrThrow9 = query.getColumnIndexOrThrow("artist");
                int columnIndexOrThrow10 = query.getColumnIndexOrThrow("album_artist");
                int columnIndexOrThrow11 = query.getColumnIndexOrThrow("title");
                int columnIndexOrThrow12 = query.getColumnIndexOrThrow("duration");
                int columnIndexOrThrow13 = query.getColumnIndexOrThrow("_data");
                while (query.moveToNext()) {
                    ArrayList arrayList2 = arrayList;
                    try {
                        i4 = columnIndexOrThrow;
                    } catch (Error e3) {
                        e = e3;
                        i2 = columnIndexOrThrow13;
                        i3 = columnIndexOrThrow12;
                        i4 = columnIndexOrThrow;
                    }
                    try {
                        contentUri = MediaStore.Audio.Media.getContentUri(str, query.getLong(columnIndexOrThrow));
                        String uri = contentUri.toString();
                        kotlin.jvm.internal.k.d(uri, "getContentUri(volumeName, id).toString()");
                        long j4 = query.getLong(columnIndexOrThrow4);
                        String string8 = query.getString(columnIndexOrThrow2);
                        String string9 = query.getString(columnIndexOrThrow3);
                        i5 = columnIndexOrThrow2;
                        try {
                            string = query.getString(columnIndexOrThrow5);
                            j2 = query.getLong(columnIndexOrThrow6);
                            string2 = query.getString(columnIndexOrThrow7);
                            string3 = query.getString(columnIndexOrThrow8);
                            string4 = query.getString(columnIndexOrThrow9);
                            string5 = query.getString(columnIndexOrThrow10);
                            string6 = query.getString(columnIndexOrThrow11);
                            i6 = columnIndexOrThrow3;
                            try {
                                string7 = query.getString(columnIndexOrThrow13);
                                j3 = query.getLong(columnIndexOrThrow12);
                                i2 = columnIndexOrThrow13;
                            } catch (Error e4) {
                                e = e4;
                                i2 = columnIndexOrThrow13;
                            }
                        } catch (Error e5) {
                            e = e5;
                            i2 = columnIndexOrThrow13;
                            i3 = columnIndexOrThrow12;
                            i6 = columnIndexOrThrow3;
                            arrayList = arrayList2;
                            Log.v("MediaStoreChannel", "queryAudios: " + e);
                            columnIndexOrThrow = i4;
                            columnIndexOrThrow2 = i5;
                            columnIndexOrThrow3 = i6;
                            columnIndexOrThrow13 = i2;
                            columnIndexOrThrow12 = i3;
                        }
                        try {
                            i3 = columnIndexOrThrow12;
                        } catch (Error e6) {
                            e = e6;
                            i3 = columnIndexOrThrow12;
                            arrayList = arrayList2;
                            Log.v("MediaStoreChannel", "queryAudios: " + e);
                            columnIndexOrThrow = i4;
                            columnIndexOrThrow2 = i5;
                            columnIndexOrThrow3 = i6;
                            columnIndexOrThrow13 = i2;
                            columnIndexOrThrow12 = i3;
                        }
                        try {
                            kotlin.jvm.internal.k.d(string8, "getString(displayNameColumn)");
                            kotlin.jvm.internal.k.d(string9, "getString(pathColumn)");
                            kotlin.jvm.internal.k.d(string, "getString(volumeNameColumn)");
                            kotlin.jvm.internal.k.d(string7, "getString(dataColumn)");
                            u uVar = new u(uri, j4, string8, string9, string, string7, j2, j3, string2, string3, string4, string5, string6);
                            arrayList = arrayList2;
                            try {
                                arrayList.add(uVar);
                            } catch (Error e7) {
                                e = e7;
                                Log.v("MediaStoreChannel", "queryAudios: " + e);
                                columnIndexOrThrow = i4;
                                columnIndexOrThrow2 = i5;
                                columnIndexOrThrow3 = i6;
                                columnIndexOrThrow13 = i2;
                                columnIndexOrThrow12 = i3;
                            }
                        } catch (Error e8) {
                            e = e8;
                            arrayList = arrayList2;
                            Log.v("MediaStoreChannel", "queryAudios: " + e);
                            columnIndexOrThrow = i4;
                            columnIndexOrThrow2 = i5;
                            columnIndexOrThrow3 = i6;
                            columnIndexOrThrow13 = i2;
                            columnIndexOrThrow12 = i3;
                        }
                    } catch (Error e9) {
                        e = e9;
                        i2 = columnIndexOrThrow13;
                        i3 = columnIndexOrThrow12;
                        i5 = columnIndexOrThrow2;
                        i6 = columnIndexOrThrow3;
                        arrayList = arrayList2;
                        Log.v("MediaStoreChannel", "queryAudios: " + e);
                        columnIndexOrThrow = i4;
                        columnIndexOrThrow2 = i5;
                        columnIndexOrThrow3 = i6;
                        columnIndexOrThrow13 = i2;
                        columnIndexOrThrow12 = i3;
                    }
                    columnIndexOrThrow = i4;
                    columnIndexOrThrow2 = i5;
                    columnIndexOrThrow3 = i6;
                    columnIndexOrThrow13 = i2;
                    columnIndexOrThrow12 = i3;
                }
                g1.q qVar = g1.q.f2865a;
                o1.b.a(query, null);
            } finally {
            }
        }
        return arrayList;
    }

    private final List<g0> k(String str, Integer num, List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"_id", "_display_name", "relative_path", "_size", "volume_name", "_data", "date_modified"};
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        if (num != null) {
            sb.append("media_type = ?");
            arrayList2.add(num.toString());
        }
        if (list2 != null) {
            for (String str2 : list2) {
                if (sb.length() > 0) {
                    sb.append(" or ");
                }
                sb.append("relative_path = ?");
                arrayList2.add(str2);
            }
        }
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(it.next());
                if (mimeTypeFromExtension != null) {
                    if (sb.length() > 0) {
                        sb.append(" or ");
                    }
                    sb.append("mime_type = ?");
                    arrayList2.add(mimeTypeFromExtension);
                }
            }
        }
        Uri contentUri = MediaStore.Files.getContentUri(str);
        Context context = this.f2658c;
        if (context == null) {
            kotlin.jvm.internal.k.o("applicationContext");
            context = null;
        }
        Cursor query = context.getContentResolver().query(contentUri, strArr, sb.length() > 0 ? sb.toString() : null, arrayList2.isEmpty() ^ true ? (String[]) arrayList2.toArray(new String[0]) : null, null);
        if (query != null) {
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("_display_name");
                int columnIndexOrThrow3 = query.getColumnIndexOrThrow("relative_path");
                int columnIndexOrThrow4 = query.getColumnIndexOrThrow("_size");
                int columnIndexOrThrow5 = query.getColumnIndexOrThrow("volume_name");
                int columnIndexOrThrow6 = query.getColumnIndexOrThrow("_data");
                int columnIndexOrThrow7 = query.getColumnIndexOrThrow("date_modified");
                while (query.moveToNext()) {
                    try {
                        try {
                            Uri contentUri2 = MediaStore.Files.getContentUri(str, query.getLong(columnIndexOrThrow));
                            String string = query.getString(columnIndexOrThrow2);
                            String string2 = query.getString(columnIndexOrThrow3);
                            if (string != null && string2 != null) {
                                long j2 = query.getLong(columnIndexOrThrow4);
                                String string3 = query.getString(columnIndexOrThrow5);
                                if (string3 == null) {
                                    string3 = "Unknown";
                                } else {
                                    kotlin.jvm.internal.k.d(string3, "cursor.getString(volumeNameColumn) ?: \"Unknown\"");
                                }
                                String str3 = string3;
                                String uri = contentUri2.toString();
                                String string4 = query.getString(columnIndexOrThrow6);
                                long j3 = query.getLong(columnIndexOrThrow7);
                                kotlin.jvm.internal.k.d(uri, "toString()");
                                kotlin.jvm.internal.k.d(string4, "getString(dataColumn)");
                                arrayList.add(new g0(uri, j2, string, string2, str3, string4, j3));
                            }
                        } catch (Error e3) {
                            e = e3;
                            Log.v("MediaStoreChannel", "queryFiles: " + e);
                        }
                    } catch (Error e4) {
                        e = e4;
                    }
                }
                g1.q qVar = g1.q.f2865a;
                o1.b.a(query, null);
            } finally {
            }
        }
        return arrayList;
    }

    private final List<g0> o(String str, boolean z2, List<String> list) {
        Cursor query;
        Uri contentUri;
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"_id", "_display_name", "relative_path", "_data", "_size", "date_modified", "volume_name"};
        Bundle bundle = new Bundle();
        if (z2) {
            bundle.putInt("android:query-arg-match-trashed", 3);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            for (String str2 : list) {
                if (sb.length() > 0) {
                    sb.append(" or ");
                }
                sb.append("relative_path = ?");
                arrayList2.add(str2);
            }
        }
        if (sb.length() > 0) {
            bundle.putString("android:query-arg-sql-selection", sb.toString());
        }
        if (!arrayList2.isEmpty()) {
            bundle.putStringArray("android:query-arg-sql-selection-args", (String[]) arrayList2.toArray(new String[0]));
        }
        Uri contentUri2 = MediaStore.Video.Media.getContentUri(str);
        Context context = this.f2658c;
        if (context == null) {
            kotlin.jvm.internal.k.o("applicationContext");
            context = null;
        }
        query = context.getContentResolver().query(contentUri2, strArr, bundle, null);
        if (query != null) {
            try {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("_display_name");
                int columnIndexOrThrow3 = query.getColumnIndexOrThrow("relative_path");
                int columnIndexOrThrow4 = query.getColumnIndexOrThrow("_data");
                int columnIndexOrThrow5 = query.getColumnIndexOrThrow("_size");
                int columnIndexOrThrow6 = query.getColumnIndexOrThrow("date_modified");
                int columnIndexOrThrow7 = query.getColumnIndexOrThrow("volume_name");
                while (query.moveToNext()) {
                    try {
                    } catch (Error e3) {
                        e = e3;
                    }
                    try {
                        contentUri = MediaStore.Video.Media.getContentUri(str, query.getLong(columnIndexOrThrow));
                        kotlin.jvm.internal.k.d(contentUri, "getContentUri(volumeName, id)");
                        String string = query.getString(columnIndexOrThrow2);
                        String string2 = query.getString(columnIndexOrThrow3);
                        if (string != null && string2 != null) {
                            long j2 = query.getLong(columnIndexOrThrow5);
                            String string3 = query.getString(columnIndexOrThrow4);
                            String string4 = query.getString(columnIndexOrThrow7);
                            if (string4 == null) {
                                string4 = "Unknown";
                            } else {
                                kotlin.jvm.internal.k.d(string4, "cursor.getString(volumeNameColumn) ?: \"Unknown\"");
                            }
                            String str3 = string4;
                            long j3 = query.getLong(columnIndexOrThrow6);
                            String uri = contentUri.toString();
                            kotlin.jvm.internal.k.d(uri, "toString()");
                            kotlin.jvm.internal.k.d(string3, "getString(dataColumn)");
                            arrayList.add(new g0(uri, j2, string, string2, str3, string3, j3));
                        }
                    } catch (Error e4) {
                        e = e4;
                        Log.v("MediaStoreChannel", "queryVideos: " + e);
                    }
                }
                g1.q qVar = g1.q.f2865a;
                o1.b.a(query, null);
            } finally {
            }
        }
        return arrayList;
    }

    @Override // t0.a
    public void e() {
    }

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        Context a3 = binding.a();
        kotlin.jvm.internal.k.d(a3, "binding.applicationContext");
        this.f2658c = a3;
        z0.k kVar = new z0.k(binding.b(), "xyz.re.player.ex/MediaStoreChannel", new z0.r(new h0()), binding.b().b());
        this.f2656a = kVar;
        kVar.e(this);
    }

    @Override // t0.a
    public void i(t0.c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        j(binding);
    }

    @Override // t0.a
    public void j(t0.c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        this.f2657b = binding;
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.k kVar = this.f2656a;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0287, code lost:
    
        if (r0 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r0 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01e4, code lost:
    
        r19.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e0, code lost:
    
        r6 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01de, code lost:
    
        if (r0 != null) goto L90;
     */
    @Override // z0.k.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(z0.j call, final k.d result) {
        int i2;
        PendingIntent createDeleteRequest;
        Activity c3;
        IntentSender intentSender;
        int i3;
        Uri insert;
        String b3;
        OutputStream openOutputStream;
        Object obj;
        Set externalVolumeNames;
        int i4;
        PendingIntent createTrashRequest;
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        String str = call.f4754a;
        if (str != null) {
            t0.c cVar = null;
            Context context = null;
            r6 = null;
            t0.c cVar2 = null;
            Context context2 = null;
            r6 = null;
            String uri = null;
            switch (str.hashCode()) {
                case -1781897528:
                    if (str.equals("createDeleteRequest")) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            List list = (List) call.b();
                            kotlin.jvm.internal.k.b(list);
                            i2 = h1.k.i(list, 10);
                            ArrayList arrayList = new ArrayList(i2);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Uri.parse((String) it.next()));
                            }
                            createDeleteRequest = MediaStore.createDeleteRequest(d(), arrayList);
                            kotlin.jvm.internal.k.d(createDeleteRequest, "createDeleteRequest(resolver, uriList)");
                            t0.c cVar3 = this.f2657b;
                            if (cVar3 == null) {
                                kotlin.jvm.internal.k.o("activityBinding");
                            } else {
                                cVar = cVar3;
                            }
                            cVar.e(new b(result, this));
                            c3 = c();
                            intentSender = createDeleteRequest.getIntentSender();
                            i3 = 7889426;
                            c3.startIntentSenderForResult(intentSender, i3, null, 0, 0, 0);
                            return;
                        }
                        result.a(Boolean.FALSE);
                        return;
                    }
                    return;
                case -1775882683:
                    if (str.equals("queryAudios")) {
                        if (Build.VERSION.SDK_INT < 30) {
                            result.b();
                            return;
                        }
                        Object b4 = call.b();
                        kotlin.jvm.internal.k.b(b4);
                        try {
                            result.a(g((String) b4));
                        } catch (Exception e3) {
                            e = e3;
                            String name = e.getClass().getName();
                            String message = e.getMessage();
                            b3 = g1.b.b(e);
                            result.c(name, message, b3);
                            g1.q qVar = g1.q.f2865a;
                            return;
                        }
                        g1.q qVar2 = g1.q.f2865a;
                        return;
                    }
                    return;
                case -1461281067:
                    if (str.equals("scanFilePaths")) {
                        Object a3 = call.a("paths");
                        kotlin.jvm.internal.k.b(a3);
                        final List list2 = (List) a3;
                        List list3 = (List) call.a("mimeTypes");
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Context context3 = this.f2658c;
                        if (context3 == null) {
                            kotlin.jvm.internal.k.o("applicationContext");
                            context3 = null;
                        }
                        MediaScannerConnection.scanFile(context3, (String[]) list2.toArray(new String[0]), list3 != null ? (String[]) list3.toArray(new String[0]) : null, new MediaScannerConnection.OnScanCompletedListener() { // from class: e2.e0
                            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                            public final void onScanCompleted(String str2, Uri uri2) {
                                f0.f(linkedHashMap, list2, result, str2, uri2);
                            }
                        });
                        return;
                    }
                    return;
                case -1185756608:
                    if (str.equals("queryVideos")) {
                        if (Build.VERSION.SDK_INT < 30) {
                            result.b();
                            return;
                        }
                        Object a4 = call.a("volumeName");
                        kotlin.jvm.internal.k.b(a4);
                        String str2 = (String) a4;
                        Object a5 = call.a("trashed");
                        kotlin.jvm.internal.k.b(a5);
                        try {
                            result.a(o(str2, ((Boolean) a5).booleanValue(), (List) call.a("relativePaths")));
                        } catch (Exception e4) {
                            e = e4;
                            String name2 = e.getClass().getName();
                            String message2 = e.getMessage();
                            b3 = g1.b.b(e);
                            result.c(name2, message2, b3);
                            g1.q qVar22 = g1.q.f2865a;
                            return;
                        }
                        g1.q qVar222 = g1.q.f2865a;
                        return;
                    }
                    return;
                case -514107969:
                    if (str.equals("createImage")) {
                        String str3 = (String) call.a("displayName");
                        String str4 = (String) call.a("mimeType");
                        String str5 = (String) call.a("parentDirname");
                        int i5 = Build.VERSION.SDK_INT;
                        Uri contentUri = i5 >= 29 ? MediaStore.Images.Media.getContentUri("external_primary") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        ContentValues contentValues = new ContentValues();
                        if (i5 >= 29 && str5 != null) {
                            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + '/' + str5);
                        }
                        if (str4 != null) {
                            contentValues.put("mime_type", str4);
                            g1.q qVar3 = g1.q.f2865a;
                        }
                        contentValues.put("_display_name", str3);
                        g1.q qVar4 = g1.q.f2865a;
                        insert = d().insert(contentUri, contentValues);
                        break;
                    } else {
                        return;
                    }
                case -191566193:
                    if (str.equals("queryFiles")) {
                        if (Build.VERSION.SDK_INT < 30) {
                            result.b();
                            return;
                        }
                        Object a6 = call.a("volumeName");
                        kotlin.jvm.internal.k.b(a6);
                        try {
                            result.a(k((String) a6, (Integer) call.a("mediaType"), (List) call.a("extensions"), (List) call.a("relativePaths")));
                        } catch (Exception e5) {
                            e = e5;
                            String name22 = e.getClass().getName();
                            String message22 = e.getMessage();
                            b3 = g1.b.b(e);
                            result.c(name22, message22, b3);
                            g1.q qVar2222 = g1.q.f2865a;
                            return;
                        }
                        g1.q qVar22222 = g1.q.f2865a;
                        return;
                    }
                    return;
                case -133600997:
                    if (str.equals("getDocumentUri")) {
                        String str6 = (String) call.a("mediaUriString");
                        Context context4 = this.f2658c;
                        if (context4 == null) {
                            kotlin.jvm.internal.k.o("applicationContext");
                            context4 = null;
                        }
                        insert = MediaStore.getDocumentUri(context4, Uri.parse(str6));
                        break;
                    } else {
                        return;
                    }
                case 163601886:
                    if (str.equals("saveImage")) {
                        String str7 = (String) call.a("name");
                        byte[] bArr = (byte[]) call.a("byteArray");
                        String str8 = (String) call.a("mimeType");
                        String str9 = (String) call.a("parentDirname");
                        int i6 = Build.VERSION.SDK_INT;
                        Uri contentUri2 = i6 >= 29 ? MediaStore.Images.Media.getContentUri("external_primary") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        ContentValues contentValues2 = new ContentValues();
                        if (i6 >= 29 && str9 != null) {
                            contentValues2.put("relative_path", Environment.DIRECTORY_PICTURES + '/' + str9);
                        }
                        if (str8 != null) {
                            contentValues2.put("mime_type", str8);
                            g1.q qVar5 = g1.q.f2865a;
                        }
                        contentValues2.put("_display_name", str7);
                        g1.q qVar6 = g1.q.f2865a;
                        Uri insert2 = d().insert(contentUri2, contentValues2);
                        if (insert2 == null || (openOutputStream = d().openOutputStream(insert2)) == null) {
                            obj = Boolean.FALSE;
                        } else {
                            try {
                                openOutputStream.write(bArr);
                                openOutputStream.flush();
                                o1.b.a(openOutputStream, null);
                                obj = Boolean.TRUE;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    o1.b.a(openOutputStream, th);
                                    throw th2;
                                }
                            }
                        }
                        result.a(obj);
                        return;
                    }
                    return;
                case 171361357:
                    if (str.equals("getExternalVolumeNames")) {
                        if (Build.VERSION.SDK_INT < 29) {
                            result.b();
                            return;
                        }
                        Context context5 = this.f2658c;
                        if (context5 == null) {
                            kotlin.jvm.internal.k.o("applicationContext");
                        } else {
                            context2 = context5;
                        }
                        externalVolumeNames = MediaStore.getExternalVolumeNames(context2);
                        kotlin.jvm.internal.k.d(externalVolumeNames, "getExternalVolumeNames(applicationContext)");
                        obj = h1.r.s(externalVolumeNames);
                        result.a(obj);
                        return;
                    }
                    return;
                case 1134912339:
                    if (str.equals("createTrashRequest")) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            Boolean bool = (Boolean) call.a("isTrashed");
                            List list4 = (List) call.a("uriList");
                            kotlin.jvm.internal.k.b(list4);
                            i4 = h1.k.i(list4, 10);
                            ArrayList arrayList2 = new ArrayList(i4);
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(Uri.parse((String) it2.next()));
                            }
                            ContentResolver d3 = d();
                            kotlin.jvm.internal.k.b(bool);
                            createTrashRequest = MediaStore.createTrashRequest(d3, arrayList2, bool.booleanValue());
                            kotlin.jvm.internal.k.d(createTrashRequest, "createTrashRequest(resolver, uriList, isTrashed!!)");
                            t0.c cVar4 = this.f2657b;
                            if (cVar4 == null) {
                                kotlin.jvm.internal.k.o("activityBinding");
                            } else {
                                cVar2 = cVar4;
                            }
                            cVar2.e(new c(result, this));
                            c3 = c();
                            intentSender = createTrashRequest.getIntentSender();
                            i3 = 7889427;
                            c3.startIntentSenderForResult(intentSender, i3, null, 0, 0, 0);
                            return;
                        }
                        result.a(Boolean.FALSE);
                        return;
                    }
                    return;
                case 1177116766:
                    if (str.equals("getMediaUri")) {
                        String str10 = (String) call.a("documentUriString");
                        Context context6 = this.f2658c;
                        if (context6 == null) {
                            kotlin.jvm.internal.k.o("applicationContext");
                            context6 = null;
                        }
                        insert = MediaStore.getMediaUri(context6, Uri.parse(str10));
                        break;
                    } else {
                        return;
                    }
                case 1388468386:
                    if (str.equals("getVersion")) {
                        if (Build.VERSION.SDK_INT < 29) {
                            result.b();
                            return;
                        }
                        Object b5 = call.b();
                        kotlin.jvm.internal.k.b(b5);
                        String str11 = (String) b5;
                        Context context7 = this.f2658c;
                        if (context7 == null) {
                            kotlin.jvm.internal.k.o("applicationContext");
                        } else {
                            context = context7;
                        }
                        obj = MediaStore.getVersion(context, str11);
                        result.a(obj);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // t0.a
    public void n() {
    }
}
