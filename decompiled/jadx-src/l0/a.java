package l0;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import s0.a;
import t0.c;
import z0.j;
import z0.k;
import z0.m;

/* loaded from: classes.dex */
public final class a implements s0.a, k.c, t0.a {

    /* renamed from: a, reason: collision with root package name */
    private k f3824a;

    /* renamed from: b, reason: collision with root package name */
    private c f3825b;

    /* renamed from: l0.a$a, reason: collision with other inner class name */
    public static final class C0053a implements m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f3826a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f3827b;

        C0053a(k.d dVar, a aVar) {
            this.f3826a = dVar;
            this.f3827b = aVar;
        }

        @Override // z0.m
        public boolean a(int i2, int i3, Intent intent) {
            if (i2 != 99811) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            c cVar = null;
            if (i3 == -1) {
                String dataString = intent != null ? intent.getDataString() : null;
                ClipData clipData = intent != null ? intent.getClipData() : null;
                if (dataString != null) {
                    arrayList.add(dataString);
                } else if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i4 = 0; i4 < itemCount; i4++) {
                        String uri = clipData.getItemAt(i4).getUri().toString();
                        kotlin.jvm.internal.k.d(uri, "clipData.getItemAt(index).uri.toString()");
                        arrayList.add(uri);
                    }
                }
            }
            this.f3826a.a(arrayList);
            c cVar2 = this.f3827b.f3825b;
            if (cVar2 == null) {
                kotlin.jvm.internal.k.o("activityBinding");
            } else {
                cVar = cVar2;
            }
            cVar.a(this);
            return true;
        }
    }

    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f3828a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f3829b;

        b(k.d dVar, a aVar) {
            this.f3828a = dVar;
            this.f3829b = aVar;
        }

        @Override // z0.m
        public boolean a(int i2, int i3, Intent intent) {
            Uri data;
            if (i2 != 99812) {
                return false;
            }
            c cVar = null;
            this.f3828a.a((i3 != -1 || intent == null || (data = intent.getData()) == null) ? null : data.toString());
            c cVar2 = this.f3829b.f3825b;
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
    public void h(a.b flutterPluginBinding) {
        kotlin.jvm.internal.k.e(flutterPluginBinding, "flutterPluginBinding");
        k kVar = new k(flutterPluginBinding.b(), "storage_access");
        this.f3824a = kVar;
        kVar.e(this);
    }

    @Override // t0.a
    public void i(c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        this.f3825b = binding;
    }

    @Override // t0.a
    public void j(c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        this.f3825b = binding;
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        k kVar = this.f3824a;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        if (r8 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e7, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e8, code lost:
    
        r4.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e3, code lost:
    
        kotlin.jvm.internal.k.o("activityBinding");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
    
        if (r8 != null) goto L35;
     */
    @Override // z0.k.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(j call, k.d result) {
        m bVar;
        c cVar;
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        String str = call.f4754a;
        c cVar2 = null;
        if (kotlin.jvm.internal.k.a(str, "openFileSelector")) {
            List list = (List) call.a("mimeTypes");
            Object a3 = call.a("allowMultiple");
            kotlin.jvm.internal.k.b(a3);
            boolean booleanValue = ((Boolean) a3).booleanValue();
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.setType("*/*");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", booleanValue);
            if (list != null) {
                Object[] array = list.toArray(new String[0]);
                kotlin.jvm.internal.k.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) array);
            }
            bVar = new C0053a(result, this);
            c cVar3 = this.f3825b;
            if (cVar3 == null) {
                kotlin.jvm.internal.k.o("activityBinding");
                cVar3 = null;
            }
            cVar3.e(bVar);
            try {
                c cVar4 = this.f3825b;
                if (cVar4 == null) {
                    kotlin.jvm.internal.k.o("activityBinding");
                    cVar4 = null;
                }
                cVar4.d().startActivityForResult(intent, 99811);
            } catch (ActivityNotFoundException e3) {
                result.c(e3.toString(), null, null);
                cVar = this.f3825b;
            }
        } else {
            if (!kotlin.jvm.internal.k.a(str, "openFileCreator")) {
                result.b();
                return;
            }
            String str2 = (String) call.a("mimeType");
            String str3 = (String) call.a("title");
            Intent intent2 = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent2.addCategory("android.intent.category.OPENABLE");
            intent2.setType(str2);
            intent2.putExtra("android.intent.extra.TITLE", str3);
            bVar = new b(result, this);
            c cVar5 = this.f3825b;
            if (cVar5 == null) {
                kotlin.jvm.internal.k.o("activityBinding");
                cVar5 = null;
            }
            cVar5.e(bVar);
            try {
                c cVar6 = this.f3825b;
                if (cVar6 == null) {
                    kotlin.jvm.internal.k.o("activityBinding");
                    cVar6 = null;
                }
                cVar6.d().startActivityForResult(intent2, 99812);
            } catch (ActivityNotFoundException e4) {
                result.c(e4.toString(), null, null);
                cVar = this.f3825b;
            }
        }
    }

    @Override // t0.a
    public void n() {
    }
}
