package e2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriPermission;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s0.a;
import z0.k;

/* loaded from: classes.dex */
public final class p implements s0.a, k.c {

    /* renamed from: a, reason: collision with root package name */
    private Context f2711a;

    /* renamed from: b, reason: collision with root package name */
    private z0.k f2712b;

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        Context a3 = binding.a();
        kotlin.jvm.internal.k.d(a3, "binding.applicationContext");
        this.f2711a = a3;
        z0.k kVar = new z0.k(binding.b(), "xyz.re.player.ex/ContentResolverChannel", z0.r.f4769b, binding.b().b());
        this.f2712b = kVar;
        kVar.e(this);
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.k kVar = this.f2712b;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    /* JADX WARN: Finally extract failed */
    @Override // z0.k.c
    public void m(z0.j call, k.d result) {
        Object obj;
        Object c3;
        String message;
        String str;
        Object valueOf;
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        String str2 = call.f4754a;
        if (str2 != null) {
            Context context = null;
            switch (str2.hashCode()) {
                case -1491525334:
                    if (str2.equals("takePersistableUriReadPermission")) {
                        Uri parse = Uri.parse((String) call.b());
                        try {
                            Context context2 = this.f2711a;
                            if (context2 == null) {
                                kotlin.jvm.internal.k.o("applicationContext");
                            } else {
                                context = context2;
                            }
                            context.getContentResolver().takePersistableUriPermission(parse, 1);
                            result.a(Boolean.TRUE);
                            return;
                        } catch (Exception unused) {
                            obj = Boolean.FALSE;
                            break;
                        }
                    } else {
                        return;
                    }
                case -1335458389:
                    if (str2.equals("delete")) {
                        List list = (List) call.a("uriStringList");
                        kotlin.jvm.internal.k.b(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Uri parse2 = Uri.parse((String) it.next());
                            Context context3 = this.f2711a;
                            if (context3 == null) {
                                kotlin.jvm.internal.k.o("applicationContext");
                                context3 = null;
                            }
                            context3.getContentResolver().delete(parse2, null, null);
                        }
                        result.a(null);
                        return;
                    }
                    return;
                case -1296313174:
                    if (str2.equals("releasePersistableUriReadPermission")) {
                        Uri parse3 = Uri.parse((String) call.b());
                        Context context4 = this.f2711a;
                        if (context4 == null) {
                            kotlin.jvm.internal.k.o("applicationContext");
                            context4 = null;
                        }
                        context4.getContentResolver().releasePersistableUriPermission(parse3, 1);
                        result.a(null);
                        return;
                    }
                    return;
                case -1140063115:
                    if (str2.equals("readBytes")) {
                        String str3 = (String) call.a("uriString");
                        kotlin.jvm.internal.k.b(str3);
                        Uri parse4 = Uri.parse(str3);
                        try {
                            Context context5 = this.f2711a;
                            if (context5 == null) {
                                kotlin.jvm.internal.k.o("applicationContext");
                                context5 = null;
                            }
                            InputStream openInputStream = context5.getContentResolver().openInputStream(parse4);
                            if (openInputStream != null) {
                                try {
                                    c3 = o1.a.c(openInputStream);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        o1.b.a(openInputStream, th);
                                        throw th2;
                                    }
                                }
                            } else {
                                c3 = null;
                            }
                            result.a(c3);
                            g1.q qVar = g1.q.f2865a;
                            o1.b.a(openInputStream, null);
                            return;
                        } catch (FileNotFoundException | Exception unused2) {
                            break;
                        }
                    } else {
                        return;
                    }
                case -903364921:
                    if (str2.equals("isDocumentUri")) {
                        String str4 = (String) call.a("uriString");
                        Context context6 = this.f2711a;
                        if (context6 == null) {
                            kotlin.jvm.internal.k.o("applicationContext");
                        } else {
                            context = context6;
                        }
                        obj = Boolean.valueOf(DocumentsContract.isDocumentUri(context, Uri.parse(str4)));
                        result.a(obj);
                        return;
                    }
                    return;
                case -662729780:
                    if (str2.equals("writeBytes")) {
                        String str5 = (String) call.a("uriString");
                        byte[] bArr = (byte[]) call.a("bytes");
                        kotlin.jvm.internal.k.b(str5);
                        Uri parse5 = Uri.parse(str5);
                        Context context7 = this.f2711a;
                        if (context7 == null) {
                            kotlin.jvm.internal.k.o("applicationContext");
                            context7 = null;
                        }
                        OutputStream openOutputStream = context7.getContentResolver().openOutputStream(parse5);
                        if (openOutputStream == null) {
                            result.a(Boolean.FALSE);
                            return;
                        }
                        try {
                            openOutputStream.write(bArr);
                            openOutputStream.flush();
                            g1.q qVar2 = g1.q.f2865a;
                            o1.b.a(openOutputStream, null);
                            obj = Boolean.TRUE;
                            result.a(obj);
                            return;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                o1.b.a(openOutputStream, th3);
                                throw th4;
                            }
                        }
                    }
                    return;
                case -30661899:
                    if (str2.equals("openFileDescriptor")) {
                        String str6 = (String) call.a("uriString");
                        String str7 = (String) call.a("mode");
                        kotlin.jvm.internal.k.b(str6);
                        Uri parse6 = Uri.parse(str6);
                        try {
                            Context context8 = this.f2711a;
                            if (context8 == null) {
                                kotlin.jvm.internal.k.o("applicationContext");
                                context8 = null;
                            }
                            ContentResolver contentResolver = context8.getContentResolver();
                            kotlin.jvm.internal.k.b(str7);
                            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse6, str7);
                            if (openFileDescriptor != null) {
                                try {
                                    valueOf = Integer.valueOf(openFileDescriptor.detachFd());
                                    o1.b.a(openFileDescriptor, null);
                                } finally {
                                }
                            } else {
                                valueOf = null;
                            }
                            result.a(valueOf);
                            return;
                        } catch (Exception e3) {
                            message = e3.getMessage();
                            str = "FileNotFound";
                            result.c(str, message, null);
                            return;
                        }
                    }
                    return;
                case 1406660511:
                    if (str2.equals("getPersistedUriReadPermissions")) {
                        try {
                            Context context9 = this.f2711a;
                            if (context9 == null) {
                                kotlin.jvm.internal.k.o("applicationContext");
                                context9 = null;
                            }
                            List<UriPermission> persistedUriPermissions = context9.getContentResolver().getPersistedUriPermissions();
                            kotlin.jvm.internal.k.d(persistedUriPermissions, "applicationContext.conte…r.persistedUriPermissions");
                            ArrayList arrayList = new ArrayList();
                            for (UriPermission uriPermission : persistedUriPermissions) {
                                if (uriPermission.isReadPermission()) {
                                    arrayList.add(uriPermission.getUri().toString());
                                }
                            }
                            result.a(arrayList);
                            return;
                        } catch (Exception e4) {
                            str = e4.getClass().getName();
                            message = e4.getMessage();
                            result.c(str, message, null);
                            return;
                        }
                    }
                    return;
                case 1645254789:
                    if (str2.equals("queryDisplayName")) {
                        String str8 = (String) call.a("uriString");
                        kotlin.jvm.internal.k.b(str8);
                        Uri parse7 = Uri.parse(str8);
                        Context context10 = this.f2711a;
                        if (context10 == null) {
                            kotlin.jvm.internal.k.o("applicationContext");
                            context10 = null;
                        }
                        Cursor query = context10.getContentResolver().query(parse7, null, null, null, null, null);
                        if (query == null) {
                            result.a(null);
                            return;
                        }
                        try {
                            int columnIndex = query.getColumnIndex("_display_name");
                            if (query.moveToNext()) {
                                result.a(query.getString(columnIndex));
                            } else {
                                result.a(null);
                            }
                            g1.q qVar3 = g1.q.f2865a;
                            o1.b.a(query, null);
                            return;
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                o1.b.a(query, th5);
                                throw th6;
                            }
                        }
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
