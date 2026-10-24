package e2;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import s0.a;
import z0.k;

/* loaded from: classes.dex */
public final class q implements s0.a, k.c, t0.a {

    /* renamed from: a, reason: collision with root package name */
    private Context f2714a;

    /* renamed from: b, reason: collision with root package name */
    private t0.c f2715b;

    /* renamed from: c, reason: collision with root package name */
    private z0.k f2716c;

    public static final class a implements z0.m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f2717a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f2718b;

        a(k.d dVar, q qVar) {
            this.f2717a = dVar;
            this.f2718b = qVar;
        }

        @Override // z0.m
        public boolean a(int i2, int i3, Intent intent) {
            Uri data;
            if (i2 != 7889425) {
                return false;
            }
            t0.c cVar = null;
            this.f2717a.a((i3 != -1 || intent == null || (data = intent.getData()) == null) ? null : data.toString());
            t0.c cVar2 = this.f2718b.f2715b;
            if (cVar2 == null) {
                kotlin.jvm.internal.k.o("activityBinding");
            } else {
                cVar = cVar2;
            }
            cVar.a(this);
            return true;
        }
    }

    @Override // t0.a
    public void e() {
    }

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        Context a3 = binding.a();
        kotlin.jvm.internal.k.d(a3, "binding.applicationContext");
        this.f2714a = a3;
        z0.k kVar = new z0.k(binding.b(), "xyz.re.player.ex/DocumentTreeChannel", z0.r.f4769b, binding.b().b());
        this.f2716c = kVar;
        kVar.e(this);
    }

    @Override // t0.a
    public void i(t0.c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        this.f2715b = binding;
    }

    @Override // t0.a
    public void j(t0.c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        this.f2715b = binding;
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.k kVar = this.f2716c;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    @Override // z0.k.c
    public void m(z0.j call, k.d result) {
        ArrayList arrayList;
        int i2;
        String[] strArr;
        Cursor query;
        Throwable th;
        boolean z2;
        HashMap b3;
        t0.c cVar;
        HashMap b4;
        q qVar = this;
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        String str = call.f4754a;
        if (str != null) {
            int hashCode = str.hashCode();
            int i3 = 24;
            if (hashCode != -1110964691) {
                if (hashCode != 1095692943) {
                    if (hashCode == 1345231674 && str.equals("listFile")) {
                        Object b5 = call.b();
                        kotlin.jvm.internal.k.b(b5);
                        Uri parse = Uri.parse((String) b5);
                        arrayList = new ArrayList();
                        Context context = qVar.f2714a;
                        if (context == null) {
                            kotlin.jvm.internal.k.o("context");
                            context = null;
                        }
                        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(parse, DocumentsContract.isDocumentUri(context, parse) ? DocumentsContract.getDocumentId(parse) : DocumentsContract.getTreeDocumentId(parse));
                        String[] strArr2 = {"document_id", "mime_type", "_display_name", "_size", "flags"};
                        try {
                            Context context2 = qVar.f2714a;
                            if (context2 == null) {
                                kotlin.jvm.internal.k.o("context");
                                context2 = null;
                            }
                            Cursor query2 = context2.getContentResolver().query(buildChildDocumentsUriUsingTree, strArr2, null, null, null);
                            if (query2 != null) {
                                try {
                                    int columnIndexOrThrow = query2.getColumnIndexOrThrow("document_id");
                                    int columnIndexOrThrow2 = query2.getColumnIndexOrThrow("mime_type");
                                    int columnIndexOrThrow3 = query2.getColumnIndexOrThrow("_display_name");
                                    int columnIndexOrThrow4 = query2.getColumnIndexOrThrow("_size");
                                    int columnIndexOrThrow5 = query2.getColumnIndexOrThrow("flags");
                                    while (query2.moveToNext()) {
                                        String string = query2.getString(columnIndexOrThrow);
                                        String string2 = query2.getString(columnIndexOrThrow2);
                                        String string3 = query2.getString(columnIndexOrThrow3);
                                        long j2 = query2.getLong(columnIndexOrThrow4);
                                        int i4 = query2.getInt(columnIndexOrThrow5);
                                        Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(parse, string);
                                        Uri uri = parse;
                                        boolean z3 = Build.VERSION.SDK_INT >= i3 && i4 == 512;
                                        String uri2 = buildDocumentUriUsingTree.toString();
                                        boolean a3 = kotlin.jvm.internal.k.a(string2, "vnd.android.document/directory");
                                        kotlin.jvm.internal.k.d(uri2, "toString()");
                                        b4 = r.b(uri2, string3, string2, a3, z3, j2);
                                        arrayList.add(b4);
                                        parse = uri;
                                        i3 = 24;
                                    }
                                    g1.q qVar2 = g1.q.f2865a;
                                    o1.b.a(query2, null);
                                } finally {
                                }
                            }
                            return;
                        } finally {
                            result.a(arrayList);
                        }
                    }
                } else if (str.equals("request")) {
                    Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                    t0.c cVar2 = qVar.f2715b;
                    if (cVar2 == null) {
                        kotlin.jvm.internal.k.o("activityBinding");
                        cVar2 = null;
                    }
                    cVar2.e(new a(result, qVar));
                    t0.c cVar3 = qVar.f2715b;
                    if (cVar3 == null) {
                        kotlin.jvm.internal.k.o("activityBinding");
                        cVar = null;
                    } else {
                        cVar = cVar3;
                    }
                    cVar.d().startActivityForResult(intent, 7889425);
                    return;
                }
            } else if (str.equals("queryTreeUris")) {
                Object b6 = call.b();
                kotlin.jvm.internal.k.b(b6);
                List list = (List) b6;
                arrayList = new ArrayList();
                String[] strArr3 = {"mime_type", "_display_name", "_size", "flags"};
                i2 = h1.k.i(list, 10);
                ArrayList<Uri> arrayList2 = new ArrayList(i2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Uri.parse((String) it.next()));
                }
                for (Uri uri3 : arrayList2) {
                    Context context3 = qVar.f2714a;
                    if (context3 == null) {
                        kotlin.jvm.internal.k.o("context");
                        context3 = null;
                    }
                    try {
                        Uri buildDocumentUriUsingTree2 = DocumentsContract.buildDocumentUriUsingTree(uri3, DocumentsContract.isDocumentUri(context3, uri3) ? DocumentsContract.getDocumentId(uri3) : DocumentsContract.getTreeDocumentId(uri3));
                        Context context4 = qVar.f2714a;
                        if (context4 == null) {
                            kotlin.jvm.internal.k.o("context");
                            context4 = null;
                        }
                        query = context4.getContentResolver().query(buildDocumentUriUsingTree2, strArr3, null, null, null);
                    } catch (Exception unused) {
                        strArr = strArr3;
                    }
                    if (query != null) {
                        try {
                            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("mime_type");
                            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("_display_name");
                            int columnIndexOrThrow8 = query.getColumnIndexOrThrow("_size");
                            strArr = strArr3;
                            try {
                                int columnIndexOrThrow9 = query.getColumnIndexOrThrow("flags");
                                if (query.moveToNext()) {
                                    try {
                                        String string4 = query.getString(columnIndexOrThrow6);
                                        String string5 = query.getString(columnIndexOrThrow7);
                                        long j3 = query.getLong(columnIndexOrThrow8);
                                        int i5 = query.getInt(columnIndexOrThrow9);
                                        try {
                                            if (Build.VERSION.SDK_INT >= 24 && i5 == 512) {
                                                z2 = true;
                                                String uri4 = uri3.toString();
                                                boolean a4 = kotlin.jvm.internal.k.a(string4, "vnd.android.document/directory");
                                                kotlin.jvm.internal.k.d(uri4, "toString()");
                                                b3 = r.b(uri4, string5, string4, a4, z2, j3);
                                                arrayList.add(b3);
                                            }
                                            String uri42 = uri3.toString();
                                            boolean a42 = kotlin.jvm.internal.k.a(string4, "vnd.android.document/directory");
                                            kotlin.jvm.internal.k.d(uri42, "toString()");
                                            b3 = r.b(uri42, string5, string4, a42, z2, j3);
                                            arrayList.add(b3);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            th = th;
                                            try {
                                                throw th;
                                            } catch (Throwable th3) {
                                                o1.b.a(query, th);
                                                throw th3;
                                            }
                                        }
                                        z2 = false;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                }
                                try {
                                    g1.q qVar3 = g1.q.f2865a;
                                    try {
                                        o1.b.a(query, null);
                                    } catch (Exception unused2) {
                                    }
                                    qVar = this;
                                    strArr3 = strArr;
                                } catch (Throwable th5) {
                                    th = th5;
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            strArr = strArr3;
                        }
                    } else {
                        qVar = this;
                    }
                }
                return;
            }
        }
        result.b();
    }

    @Override // t0.a
    public void n() {
    }
}
