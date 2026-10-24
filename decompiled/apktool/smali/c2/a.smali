.class public final Lc2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lj1/d;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lc2/a;->b(Lj1/d;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final b(Lj1/d;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/d<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    sget-object v0, Lg1/k;->e:Lg1/k$a;

    invoke-static {p1}, Lg1/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lg1/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Lj1/d;->resumeWith(Ljava/lang/Object;)V

    throw p1
.end method

.method public static final c(Lj1/d;Lj1/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/d<",
            "-",
            "Lg1/q;",
            ">;",
            "Lj1/d<",
            "*>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0}, Lk1/b;->b(Lj1/d;)Lj1/d;

    move-result-object p0

    sget-object v0, Lg1/k;->e:Lg1/k$a;

    sget-object v0, Lg1/q;->a:Lg1/q;

    invoke-static {v0}, Lg1/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Lkotlinx/coroutines/internal/g;->c(Lj1/d;Ljava/lang/Object;Lq1/l;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Lc2/a;->a(Lj1/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final d(Lq1/p;Ljava/lang/Object;Lj1/d;Lq1/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lq1/p<",
            "-TR;-",
            "Lj1/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lj1/d<",
            "-TT;>;",
            "Lq1/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lg1/q;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p1, p2}, Lk1/b;->a(Lq1/p;Ljava/lang/Object;Lj1/d;)Lj1/d;

    move-result-object p0

    invoke-static {p0}, Lk1/b;->b(Lj1/d;)Lj1/d;

    move-result-object p0

    sget-object p1, Lg1/k;->e:Lg1/k$a;

    sget-object p1, Lg1/q;->a:Lg1/q;

    invoke-static {p1}, Lg1/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, p3}, Lkotlinx/coroutines/internal/g;->b(Lj1/d;Ljava/lang/Object;Lq1/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p2, p0}, Lc2/a;->a(Lj1/d;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic e(Lq1/p;Ljava/lang/Object;Lj1/d;Lq1/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lc2/a;->d(Lq1/p;Ljava/lang/Object;Lj1/d;Lq1/l;)V

    return-void
.end method
