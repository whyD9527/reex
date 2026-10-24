.class public final Lx1/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lj1/g;)Lx1/i0;
    .locals 3

    new-instance v0, Lkotlinx/coroutines/internal/e;

    sget-object v1, Lx1/k1;->d:Lx1/k1$b;

    invoke-interface {p0, v1}, Lj1/g;->get(Lj1/g$c;)Lj1/g$b;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, Lx1/o1;->b(Lx1/k1;ILjava/lang/Object;)Lx1/x;

    move-result-object v1

    invoke-interface {p0, v1}, Lj1/g;->plus(Lj1/g;)Lj1/g;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Lkotlinx/coroutines/internal/e;-><init>(Lj1/g;)V

    return-object v0
.end method
