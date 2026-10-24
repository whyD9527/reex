package io.flutter.embedding.engine;

import android.content.Intent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private Set<String> f3179a;

    public g(List<String> list) {
        this.f3179a = new HashSet(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g a(Intent intent) {
        StringBuilder sb;
        String stringExtra;
        int intExtra;
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra("trace-startup", false)) {
            arrayList.add("--trace-startup");
        }
        if (intent.getBooleanExtra("start-paused", false)) {
            arrayList.add("--start-paused");
        }
        int intExtra2 = intent.getIntExtra("vm-service-port", 0);
        if (intExtra2 <= 0) {
            intExtra2 = intent.getIntExtra("observatory-port", 0);
            if (intExtra2 > 0) {
                sb = new StringBuilder();
            }
            if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
                arrayList.add("--disable-service-auth-codes");
            }
            if (intent.getBooleanExtra("endless-trace-buffer", false)) {
                arrayList.add("--endless-trace-buffer");
            }
            if (intent.getBooleanExtra("use-test-fonts", false)) {
                arrayList.add("--use-test-fonts");
            }
            if (intent.getBooleanExtra("enable-dart-profiling", false)) {
                arrayList.add("--enable-dart-profiling");
            }
            if (intent.getBooleanExtra("enable-software-rendering", false)) {
                arrayList.add("--enable-software-rendering");
            }
            if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
                arrayList.add("--skia-deterministic-rendering");
            }
            if (intent.getBooleanExtra("trace-skia", false)) {
                arrayList.add("--trace-skia");
            }
            stringExtra = intent.getStringExtra("trace-skia-allowlist");
            if (stringExtra != null) {
                arrayList.add("--trace-skia-allowlist=" + stringExtra);
            }
            if (intent.getBooleanExtra("trace-systrace", false)) {
                arrayList.add("--trace-systrace");
            }
            if (intent.hasExtra("trace-to-file")) {
                arrayList.add("--trace-to-file=" + intent.getStringExtra("trace-to-file"));
            }
            if (intent.getBooleanExtra("enable-impeller", false)) {
                arrayList.add("--enable-impeller");
            }
            if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
                arrayList.add("--enable-vulkan-validation");
            }
            if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
                arrayList.add("--dump-skp-on-shader-compilation");
            }
            if (intent.getBooleanExtra("cache-sksl", false)) {
                arrayList.add("--cache-sksl");
            }
            if (intent.getBooleanExtra("purge-persistent-cache", false)) {
                arrayList.add("--purge-persistent-cache");
            }
            if (intent.getBooleanExtra("verbose-logging", false)) {
                arrayList.add("--verbose-logging");
            }
            intExtra = intent.getIntExtra("msaa-samples", 0);
            if (intExtra > 1) {
                arrayList.add("--msaa-samples=" + Integer.toString(intExtra));
            }
            if (intent.hasExtra("dart-flags")) {
                arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
            }
            return new g(arrayList);
        }
        sb = new StringBuilder();
        sb.append("--vm-service-port=");
        sb.append(Integer.toString(intExtra2));
        arrayList.add(sb.toString());
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
        }
        stringExtra = intent.getStringExtra("trace-skia-allowlist");
        if (stringExtra != null) {
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
        }
        if (intent.hasExtra("trace-to-file")) {
        }
        if (intent.getBooleanExtra("enable-impeller", false)) {
        }
        if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
        }
        if (intent.getBooleanExtra("purge-persistent-cache", false)) {
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
        }
        intExtra = intent.getIntExtra("msaa-samples", 0);
        if (intExtra > 1) {
        }
        if (intent.hasExtra("dart-flags")) {
        }
        return new g(arrayList);
    }

    public String[] b() {
        return (String[]) this.f3179a.toArray(new String[this.f3179a.size()]);
    }
}
