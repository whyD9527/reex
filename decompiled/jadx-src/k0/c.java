package k0;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import h1.f;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.jvm.internal.g;
import s0.a;
import z0.j;
import z0.k;

/* loaded from: classes.dex */
public final class c implements k.c, s0.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3613c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private Context f3614a;

    /* renamed from: b, reason: collision with root package name */
    private k f3615b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private final String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            cArr2[i4] = cArr[i3 >>> 4];
            cArr2[i4 + 1] = cArr[i3 & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if ((r5.length == 0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String b(PackageManager packageManager) {
        Object h2;
        Object h3;
        String e3;
        Object h4;
        Object h5;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f3614a;
                kotlin.jvm.internal.k.b(context);
                SigningInfo signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                if (signingInfo.hasMultipleSigners()) {
                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    kotlin.jvm.internal.k.d(apkContentsSigners, "signingInfo.apkContentsSigners");
                    h5 = f.h(apkContentsSigners);
                    byte[] byteArray = ((Signature) h5).toByteArray();
                    kotlin.jvm.internal.k.d(byteArray, "signingInfo.apkContentsS…ers.first().toByteArray()");
                    e3 = e(byteArray);
                } else {
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    kotlin.jvm.internal.k.d(signingCertificateHistory, "signingInfo.signingCertificateHistory");
                    h4 = f.h(signingCertificateHistory);
                    byte[] byteArray2 = ((Signature) h4).toByteArray();
                    kotlin.jvm.internal.k.d(byteArray2, "signingInfo.signingCerti…ory.first().toByteArray()");
                    e3 = e(byteArray2);
                }
            } else {
                Context context2 = this.f3614a;
                kotlin.jvm.internal.k.b(context2);
                Signature[] signatures = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                boolean z2 = false;
                if (signatures != null) {
                }
                z2 = true;
                if (z2) {
                    return null;
                }
                kotlin.jvm.internal.k.d(signatures, "packageInfo.signatures");
                h2 = f.h(signatures);
                if (h2 == null) {
                    return null;
                }
                kotlin.jvm.internal.k.d(signatures, "signatures");
                h3 = f.h(signatures);
                byte[] byteArray3 = ((Signature) h3).toByteArray();
                kotlin.jvm.internal.k.d(byteArray3, "signatures.first().toByteArray()");
                e3 = e(byteArray3);
            }
            return e3;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private final String c() {
        InstallSourceInfo installSourceInfo;
        Context context = this.f3614a;
        kotlin.jvm.internal.k.b(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.f3614a;
        kotlin.jvm.internal.k.b(context2);
        String packageName = context2.getPackageName();
        if (Build.VERSION.SDK_INT < 30) {
            return packageManager.getInstallerPackageName(packageName);
        }
        installSourceInfo = packageManager.getInstallSourceInfo(packageName);
        return installSourceInfo.getInitiatingPackageName();
    }

    private final long d(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return packageInfo.versionCode;
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return longVersionCode;
    }

    private final String e(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(bArr);
        byte[] hashText = messageDigest.digest();
        kotlin.jvm.internal.k.d(hashText, "hashText");
        return a(hashText);
    }

    @Override // s0.a
    public void h(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        this.f3614a = binding.a();
        k kVar = new k(binding.b(), "dev.fluttercommunity.plus/package_info");
        this.f3615b = kVar;
        kotlin.jvm.internal.k.b(kVar);
        kVar.e(this);
    }

    @Override // s0.a
    public void l(a.b binding) {
        kotlin.jvm.internal.k.e(binding, "binding");
        this.f3614a = null;
        k kVar = this.f3615b;
        kotlin.jvm.internal.k.b(kVar);
        kVar.e(null);
        this.f3615b = null;
    }

    @Override // z0.k.c
    public void m(j call, k.d result) {
        kotlin.jvm.internal.k.e(call, "call");
        kotlin.jvm.internal.k.e(result, "result");
        try {
            if (!kotlin.jvm.internal.k.a(call.f4754a, "getAll")) {
                result.b();
                return;
            }
            Context context = this.f3614a;
            kotlin.jvm.internal.k.b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f3614a;
            kotlin.jvm.internal.k.b(context2);
            PackageInfo info = packageManager.getPackageInfo(context2.getPackageName(), 0);
            kotlin.jvm.internal.k.d(packageManager, "packageManager");
            String b3 = b(packageManager);
            String c3 = c();
            HashMap hashMap = new HashMap();
            hashMap.put("appName", info.applicationInfo.loadLabel(packageManager).toString());
            Context context3 = this.f3614a;
            kotlin.jvm.internal.k.b(context3);
            hashMap.put("packageName", context3.getPackageName());
            hashMap.put("version", info.versionName);
            kotlin.jvm.internal.k.d(info, "info");
            hashMap.put("buildNumber", String.valueOf(d(info)));
            if (b3 != null) {
                hashMap.put("buildSignature", b3);
            }
            if (c3 != null) {
                hashMap.put("installerStore", c3);
            }
            result.a(hashMap);
        } catch (PackageManager.NameNotFoundException e3) {
            result.c("Name not found", e3.getMessage(), null);
        }
    }
}
