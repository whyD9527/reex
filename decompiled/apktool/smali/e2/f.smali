.class public final Le2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)Ljava/util/HashMap;
    .locals 0

    invoke-static/range {p0 .. p5}, Le2/f;->b(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)Ljava/util/HashMap;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZ",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x6

    new-array v0, v0, [Lg1/j;

    const-string v1, "path"

    invoke-static {v1, p0}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object p0

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "description"

    invoke-static {p0, p1}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object p0

    const/4 p1, 0x1

    aput-object p0, v0, p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string p1, "isEmulated"

    invoke-static {p1, p0}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object p0

    const/4 p1, 0x2

    aput-object p0, v0, p1

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string p1, "isPrimary"

    invoke-static {p1, p0}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object p0

    const/4 p1, 0x3

    aput-object p0, v0, p1

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string p1, "isRemovable"

    invoke-static {p1, p0}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object p0

    const/4 p1, 0x4

    aput-object p0, v0, p1

    const-string p0, "state"

    invoke-static {p0, p5}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object p0

    const/4 p1, 0x5

    aput-object p0, v0, p1

    invoke-static {v0}, Lh1/x;->e([Lg1/j;)Ljava/util/HashMap;

    move-result-object p0

    return-object p0
.end method
