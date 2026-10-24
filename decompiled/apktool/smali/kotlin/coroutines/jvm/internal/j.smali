.class public abstract Lkotlin/coroutines/jvm/internal/j;
.super Lkotlin/coroutines/jvm/internal/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lj1/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/a;-><init>(Lj1/d;)V

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lj1/d;->getContext()Lj1/g;

    move-result-object p1

    sget-object v0, Lj1/h;->e:Lj1/h;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public getContext()Lj1/g;
    .locals 1

    sget-object v0, Lj1/h;->e:Lj1/h;

    return-object v0
.end method
