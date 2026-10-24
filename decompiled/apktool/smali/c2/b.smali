.class public final Lc2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lq1/p;Ljava/lang/Object;Lj1/d;)V
    .locals 3
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
            "-TT;>;)V"
        }
    .end annotation

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->a(Lj1/d;)Lj1/d;

    move-result-object v0

    :try_start_0
    invoke-interface {p2}, Lj1/d;->getContext()Lj1/g;

    move-result-object p2

    const/4 v1, 0x0

    invoke-static {p2, v1}, Lkotlinx/coroutines/internal/b0;->c(Lj1/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p0, :cond_0

    const/4 v2, 0x2

    :try_start_1
    invoke-static {p0, v2}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq1/p;

    invoke-interface {p0, p1, v0}, Lq1/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p2, v1}, Lkotlinx/coroutines/internal/b0;->a(Lj1/g;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, Lk1/b;->c()Ljava/lang/Object;

    move-result-object p1

    if-eq p0, p1, :cond_1

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    :try_start_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    :try_start_4
    invoke-static {p2, v1}, Lkotlinx/coroutines/internal/b0;->a(Lj1/g;Ljava/lang/Object;)V

    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p0

    sget-object p1, Lg1/k;->e:Lg1/k$a;

    invoke-static {p0}, Lg1/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Lg1/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Lj1/d;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
