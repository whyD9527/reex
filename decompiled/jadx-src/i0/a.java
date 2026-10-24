package i0;

/* loaded from: classes.dex */
public enum a {
    ILLEGAL_ARGUMENT("illegalArgument"),
    ALREADY_ACTIVE("alreadyActive"),
    MAX_LIMIT("maxLimit"),
    INTERNAL_ERROR("internalError"),
    SECURITY_ISSUE("securityIssue");


    /* renamed from: e, reason: collision with root package name */
    private final String f2927e;

    a(String str) {
        this.f2927e = str;
    }

    public final String b() {
        return this.f2927e;
    }
}
