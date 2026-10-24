.class public abstract Lz1/a;
.super Lz1/c;
.source "SourceFile"

# interfaces
.implements Lz1/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz1/a$c;,
        Lz1/a$a;,
        Lz1/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lz1/c<",
        "TE;>;",
        "Lz1/f<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lq1/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq1/l<",
            "-TE;",
            "Lg1/q;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lz1/c;-><init>(Lq1/l;)V

    return-void
.end method

.method public static final synthetic n(Lz1/a;Lz1/o;)Z
    .locals 0

    invoke-direct {p0, p1}, Lz1/a;->p(Lz1/o;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic o(Lz1/a;Lx1/k;Lz1/o;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz1/a;->w(Lx1/k;Lz1/o;)V

    return-void
.end method

.method private final p(Lz1/o;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz1/o<",
            "-TE;>;)Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lz1/a;->q(Lz1/o;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lz1/a;->u()V

    :cond_0
    return p1
.end method

.method private final w(Lx1/k;Lz1/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/k<",
            "*>;",
            "Lz1/o<",
            "*>;)V"
        }
    .end annotation

    new-instance v0, Lz1/a$c;

    invoke-direct {v0, p0, p2}, Lz1/a$c;-><init>(Lz1/a;Lz1/o;)V

    invoke-interface {p1, v0}, Lx1/k;->i(Lq1/l;)V

    return-void
.end method


# virtual methods
.method public final iterator()Lz1/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz1/g<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lz1/a$a;

    invoke-direct {v0, p0}, Lz1/a$a;-><init>(Lz1/a;)V

    return-object v0
.end method

.method protected l()Lz1/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz1/q<",
            "TE;>;"
        }
    .end annotation

    invoke-super {p0}, Lz1/c;->l()Lz1/q;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lz1/j;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lz1/a;->t()V

    :cond_0
    return-object v0
.end method

.method protected q(Lz1/o;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz1/o<",
            "-TE;>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lz1/a;->r()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lz1/c;->e()Lkotlinx/coroutines/internal/k;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/m;->q()Lkotlinx/coroutines/internal/m;

    move-result-object v3

    instance-of v4, v3, Lz1/s;

    xor-int/2addr v4, v2

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v3, p1, v0}, Lkotlinx/coroutines/internal/m;->j(Lkotlinx/coroutines/internal/m;Lkotlinx/coroutines/internal/m;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lz1/c;->e()Lkotlinx/coroutines/internal/k;

    move-result-object v0

    new-instance v3, Lz1/a$d;

    invoke-direct {v3, p1, p0}, Lz1/a$d;-><init>(Lkotlinx/coroutines/internal/m;Lz1/a;)V

    :goto_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/m;->q()Lkotlinx/coroutines/internal/m;

    move-result-object v4

    instance-of v5, v4, Lz1/s;

    xor-int/2addr v5, v2

    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v4, p1, v0, v3}, Lkotlinx/coroutines/internal/m;->x(Lkotlinx/coroutines/internal/m;Lkotlinx/coroutines/internal/m;Lkotlinx/coroutines/internal/m$a;)I

    move-result v4

    if-eq v4, v2, :cond_4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_5

    goto :goto_0

    :cond_4
    :goto_1
    move v1, v2

    :cond_5
    :goto_2
    return v1
.end method

.method protected abstract r()Z
.end method

.method protected abstract s()Z
.end method

.method protected t()V
    .locals 0

    return-void
.end method

.method protected u()V
    .locals 0

    return-void
.end method

.method protected v()Ljava/lang/Object;
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lz1/c;->m()Lz1/s;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lz1/b;->d:Lkotlinx/coroutines/internal/x;

    return-object v0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lz1/s;->A(Lkotlinx/coroutines/internal/m$b;)Lkotlinx/coroutines/internal/x;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lz1/s;->y()V

    invoke-virtual {v0}, Lz1/s;->z()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {v0}, Lz1/s;->B()V

    goto :goto_0
.end method
