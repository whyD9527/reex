.class public abstract Lkotlin/coroutines/jvm/internal/d;
.super Lkotlin/coroutines/jvm/internal/a;
.source "SourceFile"


# instance fields
.field private final _context:Lj1/g;

.field private transient intercepted:Lj1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj1/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


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

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lj1/d;->getContext()Lj1/g;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lj1/d;Lj1/g;)V

    return-void
.end method

.method public constructor <init>(Lj1/d;Lj1/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/d<",
            "Ljava/lang/Object;",
            ">;",
            "Lj1/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/a;-><init>(Lj1/d;)V

    iput-object p2, p0, Lkotlin/coroutines/jvm/internal/d;->_context:Lj1/g;

    return-void
.end method


# virtual methods
.method public getContext()Lj1/g;
    .locals 1

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->_context:Lj1/g;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final intercepted()Lj1/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj1/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lj1/d;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/d;->getContext()Lj1/g;

    move-result-object v0

    sget-object v1, Lj1/e;->b:Lj1/e$b;

    invoke-interface {v0, v1}, Lj1/g;->get(Lj1/g$c;)Lj1/g$b;

    move-result-object v0

    check-cast v0, Lj1/e;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lj1/e;->l(Lj1/d;)Lj1/d;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    :cond_1
    iput-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lj1/d;

    :cond_2
    return-object v0
.end method

.method protected releaseIntercepted()V
    .locals 3

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lj1/d;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/d;->getContext()Lj1/g;

    move-result-object v1

    sget-object v2, Lj1/e;->b:Lj1/e$b;

    invoke-interface {v1, v2}, Lj1/g;->get(Lj1/g$c;)Lj1/g$b;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v1, Lj1/e;

    invoke-interface {v1, v0}, Lj1/e;->d(Lj1/d;)V

    :cond_0
    sget-object v0, Lkotlin/coroutines/jvm/internal/c;->e:Lkotlin/coroutines/jvm/internal/c;

    iput-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lj1/d;

    return-void
.end method
