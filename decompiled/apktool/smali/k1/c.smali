.class Lk1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lq1/p;Ljava/lang/Object;Lj1/d;)Lj1/d;
    .locals 2
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
            "-TT;>;)",
            "Lj1/d<",
            "Lg1/q;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->a(Lj1/d;)Lj1/d;

    move-result-object p2

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/a;

    if-eqz v0, :cond_0

    check-cast p0, Lkotlin/coroutines/jvm/internal/a;

    invoke-virtual {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/a;->create(Ljava/lang/Object;Lj1/d;)Lj1/d;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lj1/d;->getContext()Lj1/g;

    move-result-object v0

    sget-object v1, Lj1/h;->e:Lj1/h;

    if-ne v0, v1, :cond_1

    new-instance v0, Lk1/c$a;

    invoke-direct {v0, p2, p0, p1}, Lk1/c$a;-><init>(Lj1/d;Lq1/p;Ljava/lang/Object;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v1, Lk1/c$b;

    invoke-direct {v1, p2, v0, p0, p1}, Lk1/c$b;-><init>(Lj1/d;Lj1/g;Lq1/p;Ljava/lang/Object;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static b(Lj1/d;)Lj1/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj1/d<",
            "-TT;>;)",
            "Lj1/d<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/jvm/internal/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lkotlin/coroutines/jvm/internal/d;->intercepted()Lj1/d;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method
