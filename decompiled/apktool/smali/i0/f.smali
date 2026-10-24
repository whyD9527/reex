.class public final Li0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    sget-object p0, Li0/a;->i:Li0/a;

    goto :goto_0

    :cond_0
    sget-object p0, Li0/a;->h:Li0/a;

    goto :goto_0

    :cond_1
    sget-object p0, Li0/a;->g:Li0/a;

    :goto_0
    invoke-virtual {p0}, Li0/a;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final b(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const-string p0, "Internal error"

    goto :goto_0

    :cond_0
    const-string p0, "Maximum outstanding requests reached"

    goto :goto_0

    :cond_1
    const-string p0, "Operation already active"

    :goto_0
    return-object p0
.end method
