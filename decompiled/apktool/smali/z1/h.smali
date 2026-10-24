.class public final Lz1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ILz1/e;Lq1/l;)Lz1/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I",
            "Lz1/e;",
            "Lq1/l<",
            "-TE;",
            "Lg1/q;",
            ">;)",
            "Lz1/f<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, -0x2

    const/4 v1, 0x1

    if-eq p0, v0, :cond_7

    const/4 v0, -0x1

    if-eq p0, v0, :cond_4

    if-eqz p0, :cond_2

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_1

    if-ne p0, v1, :cond_0

    sget-object v0, Lz1/e;->f:Lz1/e;

    if-ne p1, v0, :cond_0

    new-instance p0, Lz1/m;

    invoke-direct {p0, p2}, Lz1/m;-><init>(Lq1/l;)V

    goto :goto_1

    :cond_0
    new-instance v0, Lz1/d;

    invoke-direct {v0, p0, p1, p2}, Lz1/d;-><init>(ILz1/e;Lq1/l;)V

    move-object p0, v0

    goto :goto_1

    :cond_1
    new-instance p0, Lz1/n;

    invoke-direct {p0, p2}, Lz1/n;-><init>(Lq1/l;)V

    goto :goto_1

    :cond_2
    sget-object p0, Lz1/e;->e:Lz1/e;

    if-ne p1, p0, :cond_3

    new-instance p0, Lz1/r;

    invoke-direct {p0, p2}, Lz1/r;-><init>(Lq1/l;)V

    goto :goto_1

    :cond_3
    new-instance p0, Lz1/d;

    invoke-direct {p0, v1, p1, p2}, Lz1/d;-><init>(ILz1/e;Lq1/l;)V

    goto :goto_1

    :cond_4
    sget-object p0, Lz1/e;->e:Lz1/e;

    if-ne p1, p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_6

    new-instance p0, Lz1/m;

    invoke-direct {p0, p2}, Lz1/m;-><init>(Lq1/l;)V

    goto :goto_1

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    new-instance p0, Lz1/d;

    sget-object v0, Lz1/e;->e:Lz1/e;

    if-ne p1, v0, :cond_8

    sget-object v0, Lz1/f;->a:Lz1/f$a;

    invoke-virtual {v0}, Lz1/f$a;->a()I

    move-result v1

    :cond_8
    invoke-direct {p0, v1, p1, p2}, Lz1/d;-><init>(ILz1/e;Lq1/l;)V

    :goto_1
    return-object p0
.end method

.method public static synthetic b(ILz1/e;Lq1/l;ILjava/lang/Object;)Lz1/f;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p0, 0x0

    :cond_0
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_1

    sget-object p1, Lz1/e;->e:Lz1/e;

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    const/4 p2, 0x0

    :cond_2
    invoke-static {p0, p1, p2}, Lz1/h;->a(ILz1/e;Lq1/l;)Lz1/f;

    move-result-object p0

    return-object p0
.end method
