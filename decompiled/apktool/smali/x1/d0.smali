.class public final Lx1/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Object;Lj1/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lj1/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p0, Lx1/z;

    if-eqz p1, :cond_0

    sget-object p1, Lg1/k;->e:Lg1/k$a;

    check-cast p0, Lx1/z;

    iget-object p0, p0, Lx1/z;->a:Ljava/lang/Throwable;

    invoke-static {p0}, Lg1/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    :cond_0
    invoke-static {p0}, Lg1/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Object;Lq1/l;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lq1/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lg1/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0}, Lg1/k;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_1

    new-instance v0, Lx1/a0;

    invoke-direct {v0, p0, p1}, Lx1/a0;-><init>(Ljava/lang/Object;Lq1/l;)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    new-instance p0, Lx1/z;

    const/4 p1, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lx1/z;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static final c(Ljava/lang/Object;Lx1/k;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lx1/k<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0}, Lg1/k;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lx1/z;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Lx1/z;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    :goto_0
    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lq1/l;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lx1/d0;->b(Ljava/lang/Object;Lq1/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
