package e2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import s0.a;
import z0.k;

/* loaded from: classes.dex */
public final class j0 implements s0.a, k.c, t0.a {

    /* renamed from: a, reason: collision with root package name */
    public Context f2674a;

    /* renamed from: b, reason: collision with root package name */
    private z0.k f2675b;

    /* renamed from: c, reason: collision with root package name */
    private t0.c f2676c;

    public static final class a implements z0.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f2677a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f2678b;

        a(k.d dVar, j0 j0Var) {
            this.f2677a = dVar;
            this.f2678b = j0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
        @Override // z0.o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean b(int i2, String[] permissions, int[] grantResults) {
            k.d dVar;
            Boolean bool;
            t0.c cVar;
            boolean f2;
            kotlin.jvm.internal.k.e(permissions, "permissions");
            kotlin.jvm.internal.k.e(grantResults, "grantResults");
            if (i2 != 1359) {
                return false;
            }
            if (!(grantResults.length == 0)) {
                f2 = h1.f.f(grantResults, -1);
                if (!f2) {
                    dVar = this.f2677a;
                    bool = Boolean.TRUE;
                    dVar.a(bool);
                    cVar = this.f2678b.f2676c;
                    if (cVar == null) {
                        kotlin.jvm.internal.k.o("activityBinding");
                        cVar = null;
                    }
                    cVar.c(this);
                    return true;
                }
            }
            dVar = this.f2677a;
            bool = Boolean.FALSE;
            dVar.a(bool);
            cVar = this.f2678b.f2676c;
            if (cVar == null) {
            }
            cVar.c(this);
            return true;
        }
    }

    public static final class b implements z0.m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f2679a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f2680b;

        b(k.d dVar, j0 j0Var) {
            this.f2679a = dVar;
            this.f2680b = j0Var;
        }

        @Override // z0.m
        public boolean a(int i2, int i3, Intent intent) {
            if (i2 != 1360) {
                return false;
            }
            t0.c cVar = null;
            this.f2679a.a(null);
            t0.c cVar2 = this.f2680b.f2676c;
            if (cVar2 == null) {
                kotlin.jvm.internal.k.o("activityBinding");
            } else {
                cVar = cVar2;
            }
            cVar.a(this);
            return true;
        }
    }

    public final Context b() {
        Context context = this.f2674a;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.k.o("context");
        return null;
    }

    public final void c(Context context) {
        kotlin.jvm.internal.k.e(context, "<set-?>");
        this.f2674a = context;
    }

    @Override // t0.a
    public void e() {
    }

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        Context a3 = binding.a();
        kotlin.jvm.internal.k.d(a3, "binding.applicationContext");
        c(a3);
        z0.k kVar = new z0.k(binding.b(), "xyz.re.player.ex/PermissionChannel");
        this.f2675b = kVar;
        kVar.e(this);
    }

    @Override // t0.a
    public void i(t0.c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        this.f2676c = binding;
    }

    @Override // t0.a
    public void j(t0.c binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        this.f2676c = binding;
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        z0.k kVar = this.f2675b;
        if (kVar == null) {
            kotlin.jvm.internal.k.o("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b0, code lost:
    
        if (r11.d().shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE") != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013c, code lost:
    
        if (androidx.core.content.a.a(b(), "android.permission.READ_EXTERNAL_STORAGE") == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0176, code lost:
    
        if (r11.d().shouldShowRequestPermissionRationale("android.permission.READ_MEDIA_VIDEO") != false) goto L81;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // z0.k.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(z0.j call, k.d result) {
        boolean isExternalStorageManager;
        Boolean valueOf;
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        String str = call.f4754a;
        if (str != null) {
            boolean z2 = true;
            t0.c cVar = null;
            switch (str.hashCode()) {
                case -1813349981:
                    if (str.equals("shouldShowRequestMediaPermissionRationale")) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 33) {
                            t0.c cVar2 = this.f2676c;
                            if (cVar2 == null) {
                                kotlin.jvm.internal.k.o("activityBinding");
                                cVar2 = null;
                            }
                            if (cVar2.d().shouldShowRequestPermissionRationale("android.permission.READ_MEDIA_AUDIO")) {
                                t0.c cVar3 = this.f2676c;
                                if (cVar3 == null) {
                                    kotlin.jvm.internal.k.o("activityBinding");
                                } else {
                                    cVar = cVar3;
                                }
                                break;
                            }
                            z2 = false;
                            valueOf = Boolean.valueOf(z2);
                            result.a(valueOf);
                            break;
                        } else {
                            if (i2 > 29) {
                                t0.c cVar4 = this.f2676c;
                                if (cVar4 == null) {
                                    kotlin.jvm.internal.k.o("activityBinding");
                                } else {
                                    cVar = cVar4;
                                }
                                z2 = cVar.d().shouldShowRequestPermissionRationale("android.permission.READ_EXTERNAL_STORAGE");
                            } else {
                                t0.c cVar5 = this.f2676c;
                                if (cVar5 == null) {
                                    kotlin.jvm.internal.k.o("activityBinding");
                                    cVar5 = null;
                                }
                                if (cVar5.d().shouldShowRequestPermissionRationale("android.permission.READ_EXTERNAL_STORAGE")) {
                                    t0.c cVar6 = this.f2676c;
                                    if (cVar6 == null) {
                                        kotlin.jvm.internal.k.o("activityBinding");
                                    } else {
                                        cVar = cVar6;
                                    }
                                    break;
                                }
                                z2 = false;
                            }
                            valueOf = Boolean.valueOf(z2);
                            result.a(valueOf);
                        }
                    }
                    break;
                case -1371302046:
                    if (str.equals("checkManualExternalStorage")) {
                        if (Build.VERSION.SDK_INT < 30) {
                            break;
                        } else {
                            isExternalStorageManager = Environment.isExternalStorageManager();
                            valueOf = Boolean.valueOf(isExternalStorageManager);
                            result.a(valueOf);
                            break;
                        }
                    }
                    break;
                case -1233644485:
                    if (str.equals("requestManualExternalStorage")) {
                        if (Build.VERSION.SDK_INT < 30) {
                            result.a(null);
                            break;
                        } else {
                            Intent intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                            b bVar = new b(result, this);
                            t0.c cVar7 = this.f2676c;
                            if (cVar7 == null) {
                                kotlin.jvm.internal.k.o("activityBinding");
                                cVar7 = null;
                            }
                            cVar7.e(bVar);
                            try {
                                t0.c cVar8 = this.f2676c;
                                if (cVar8 == null) {
                                    kotlin.jvm.internal.k.o("activityBinding");
                                    cVar8 = null;
                                }
                                cVar8.d().startActivityForResult(intent, 1360);
                                break;
                            } catch (ActivityNotFoundException e3) {
                                result.c(e3.toString(), null, null);
                                t0.c cVar9 = this.f2676c;
                                if (cVar9 == null) {
                                    kotlin.jvm.internal.k.o("activityBinding");
                                } else {
                                    cVar = cVar9;
                                }
                                cVar.a(bVar);
                                return;
                            }
                        }
                    }
                    break;
                case 1448344132:
                    if (str.equals("requestMediaPermission")) {
                        int i3 = Build.VERSION.SDK_INT;
                        String[] strArr = i3 >= 33 ? new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VIDEO"} : i3 > 29 ? new String[]{"android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
                        a aVar = new a(result, this);
                        t0.c cVar10 = this.f2676c;
                        if (cVar10 == null) {
                            kotlin.jvm.internal.k.o("activityBinding");
                            cVar10 = null;
                        }
                        cVar10.f(aVar);
                        try {
                            t0.c cVar11 = this.f2676c;
                            if (cVar11 == null) {
                                kotlin.jvm.internal.k.o("activityBinding");
                                cVar11 = null;
                            }
                            cVar11.d().requestPermissions(strArr, 1359);
                            break;
                        } catch (Exception unused) {
                            result.a(Boolean.FALSE);
                            t0.c cVar12 = this.f2676c;
                            if (cVar12 == null) {
                                kotlin.jvm.internal.k.o("activityBinding");
                            } else {
                                cVar = cVar12;
                            }
                            cVar.c(aVar);
                            return;
                        }
                    }
                    break;
                case 1630447275:
                    if (str.equals("checkMediaPermission")) {
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 33) {
                            z2 = false;
                            valueOf = Boolean.valueOf(z2);
                            result.a(valueOf);
                            break;
                        } else {
                            z2 = false;
                            valueOf = Boolean.valueOf(z2);
                            result.a(valueOf);
                            break;
                        }
                    }
                    break;
            }
        }
        result.b();
    }

    @Override // t0.a
    public void n() {
    }
}
