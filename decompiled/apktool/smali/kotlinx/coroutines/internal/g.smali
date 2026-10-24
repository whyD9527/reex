.class public final Lkotlinx/coroutines/internal/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lkotlinx/coroutines/internal/x;

.field public static final b:Lkotlinx/coroutines/internal/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/internal/x;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/x;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/g;->a:Lkotlinx/coroutines/internal/x;

    new-instance v0, Lkotlinx/coroutines/internal/x;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/x;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/g;->b:Lkotlinx/coroutines/internal/x;

    return-void
.end method

.method public static final synthetic a()Lkotlinx/coroutines/internal/x;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/internal/g;->a:Lkotlinx/coroutines/internal/x;

    return-object v0
.end method

.method public static final b(Lj1/d;Ljava/lang/Object;Lq1/l;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj1/d<",
            "-TT;>;",
            "Ljava/lang/Object;",
            "Lq1/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lg1/q;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p0, Lkotlinx/coroutines/internal/f;

    if-eqz v0, :cond_8

    check-cast p0, Lkotlinx/coroutines/internal/f;

    invoke-static {p1, p2}, Lx1/d0;->b(Ljava/lang/Object;Lq1/l;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lkotlinx/coroutines/internal/f;->h:Lx1/f0;

    invoke-virtual {p0}, Lkotlinx/coroutines/internal/f;->getContext()Lj1/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/f0;->o(Lj1/g;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-object p2, p0, Lkotlinx/coroutines/internal/f;->j:Ljava/lang/Object;

    iput v1, p0, Lx1/p0;->g:I

    iget-object p1, p0, Lkotlinx/coroutines/internal/f;->h:Lx1/f0;

    invoke-virtual {p0}, Lkotlinx/coroutines/internal/f;->getContext()Lj1/g;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Lx1/f0;->i(Lj1/g;Ljava/lang/Runnable;)V

    goto/16 :goto_4

    :cond_0
    sget-object v0, Lx1/b2;->a:Lx1/b2;

    invoke-virtual {v0}, Lx1/b2;->a()Lx1/v0;

    move-result-object v0

    invoke-virtual {v0}, Lx1/v0;->v()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-object p2, p0, Lkotlinx/coroutines/internal/f;->j:Ljava/lang/Object;

    iput v1, p0, Lx1/p0;->g:I

    invoke-virtual {v0, p0}, Lx1/v0;->r(Lx1/p0;)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v0, v1}, Lx1/v0;->t(Z)V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lkotlinx/coroutines/internal/f;->getContext()Lj1/g;

    move-result-object v3

    sget-object v4, Lx1/k1;->d:Lx1/k1$b;

    invoke-interface {v3, v4}, Lj1/g;->get(Lj1/g$c;)Lj1/g$b;

    move-result-object v3

    check-cast v3, Lx1/k1;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lx1/k1;->b()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, Lx1/k1;->j()Ljava/util/concurrent/CancellationException;

    move-result-object v3

    invoke-virtual {p0, p2, v3}, Lkotlinx/coroutines/internal/f;->b(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object p2, Lg1/k;->e:Lg1/k$a;

    invoke-static {v3}, Lg1/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lg1/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p2}, Lj1/d;->resumeWith(Ljava/lang/Object;)V

    move p2, v1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_7

    iget-object p2, p0, Lkotlinx/coroutines/internal/f;->i:Lj1/d;

    iget-object v3, p0, Lkotlinx/coroutines/internal/f;->k:Ljava/lang/Object;

    invoke-interface {p2}, Lj1/d;->getContext()Lj1/g;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlinx/coroutines/internal/b0;->c(Lj1/g;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lkotlinx/coroutines/internal/b0;->a:Lkotlinx/coroutines/internal/x;

    if-eq v3, v5, :cond_3

    invoke-static {p2, v4, v3}, Lx1/e0;->e(Lj1/d;Lj1/g;Ljava/lang/Object;)Lx1/d2;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    :try_start_1
    iget-object v5, p0, Lkotlinx/coroutines/internal/f;->i:Lj1/d;

    invoke-interface {v5, p1}, Lj1/d;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lg1/q;->a:Lg1/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_4

    :try_start_2
    invoke-virtual {p2}, Lx1/d2;->x0()Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_4
    invoke-static {v4, v3}, Lkotlinx/coroutines/internal/b0;->a(Lj1/g;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lx1/d2;->x0()Z

    move-result p2

    if-eqz p2, :cond_6

    :cond_5
    invoke-static {v4, v3}, Lkotlinx/coroutines/internal/b0;->a(Lj1/g;Ljava/lang/Object;)V

    :cond_6
    throw p1

    :cond_7
    :goto_2
    invoke-virtual {v0}, Lx1/v0;->x()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez p1, :cond_7

    goto :goto_3

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {p0, p1, v2}, Lx1/p0;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_3
    invoke-virtual {v0, v1}, Lx1/v0;->p(Z)V

    goto :goto_4

    :catchall_2
    move-exception p0

    invoke-virtual {v0, v1}, Lx1/v0;->p(Z)V

    throw p0

    :cond_8
    invoke-interface {p0, p1}, Lj1/d;->resumeWith(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public static synthetic c(Lj1/d;Ljava/lang/Object;Lq1/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lkotlinx/coroutines/internal/g;->b(Lj1/d;Ljava/lang/Object;Lq1/l;)V

    return-void
.end method
