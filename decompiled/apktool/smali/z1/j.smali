.class public final Lz1/j;
.super Lz1/s;
.source "SourceFile"

# interfaces
.implements Lz1/q;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lz1/s;",
        "Lz1/q<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final h:Ljava/lang/Throwable;


# virtual methods
.method public A(Lkotlinx/coroutines/internal/m$b;)Lkotlinx/coroutines/internal/x;
    .locals 0

    sget-object p1, Lx1/n;->a:Lkotlinx/coroutines/internal/x;

    return-object p1
.end method

.method public C()Lz1/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz1/j<",
            "TE;>;"
        }
    .end annotation

    return-object p0
.end method

.method public D()Lz1/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz1/j<",
            "TE;>;"
        }
    .end annotation

    return-object p0
.end method

.method public final E()Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Lz1/j;->h:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    new-instance v0, Lz1/k;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, Lz1/k;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final F()Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Lz1/j;->h:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    new-instance v0, Lz1/l;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, Lz1/l;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public c(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    return-void
.end method

.method public bridge synthetic e()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz1/j;->C()Lz1/j;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/Object;Lkotlinx/coroutines/internal/m$b;)Lkotlinx/coroutines/internal/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lkotlinx/coroutines/internal/m$b;",
            ")",
            "Lkotlinx/coroutines/internal/x;"
        }
    .end annotation

    sget-object p1, Lx1/n;->a:Lkotlinx/coroutines/internal/x;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Closed@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lx1/m0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz1/j;->h:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public y()V
    .locals 0

    return-void
.end method

.method public bridge synthetic z()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz1/j;->D()Lz1/j;

    move-result-object v0

    return-object v0
.end method
