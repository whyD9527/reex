package xyz.lhtls.mpv_client;

/* loaded from: classes.dex */
public final class MPVJniUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final MPVJniUtils f4484a = new MPVJniUtils();

    private MPVJniUtils() {
    }

    public final native void avJniSetJavaVM();

    public final native void deleteGlobalNativePtr(long j2);

    public final native long newGlobalNativePtr(Object obj);
}
