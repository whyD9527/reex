.class public abstract Lx1/a;
.super Lx1/r1;
.source "SourceFile"

# interfaces
.implements Lj1/d;
.implements Lx1/i0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lx1/r1;",
        "Lj1/d<",
        "TT;>;",
        "Lx1/i0;"
    }
.end annotation


# instance fields
.field private final f:Lj1/g;


# direct methods
.method public constructor <init>(Lj1/g;ZZ)V
    .locals 0

    invoke-direct {p0, p3}, Lx1/r1;-><init>(Z)V

    if-eqz p2, :cond_0

    sget-object p2, Lx1/k1;->d:Lx1/k1$b;

    invoke-interface {p1, p2}, Lj1/g;->get(Lj1/g$c;)Lj1/g$b;

    move-result-object p2

    check-cast p2, Lx1/k1;

    invoke-virtual {p0, p2}, Lx1/r1;->R(Lx1/k1;)V

    :cond_0
    invoke-interface {p1, p0}, Lj1/g;->plus(Lj1/g;)Lj1/g;

    move-result-object p1

    iput-object p1, p0, Lx1/a;->f:Lj1/g;

    return-void
.end method


# virtual methods
.method protected B()Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lx1/m0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, " was cancelled"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Q(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lx1/a;->f:Lj1/g;

    invoke-static {v0, p1}, Lx1/h0;->a(Lj1/g;Ljava/lang/Throwable;)V

    return-void
.end method

.method public X()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lx1/a;->f:Lj1/g;

    invoke-static {v0}, Lx1/e0;->b(Lj1/g;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lx1/r1;->X()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lx1/r1;->X()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    invoke-super {p0}, Lx1/r1;->b()Z

    move-result v0

    return v0
.end method

.method protected final c0(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Lx1/z;

    if-eqz v0, :cond_0

    check-cast p1, Lx1/z;

    iget-object v0, p1, Lx1/z;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, Lx1/z;->a()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Lx1/a;->t0(Ljava/lang/Throwable;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lx1/a;->u0(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public e()Lj1/g;
    .locals 1

    iget-object v0, p0, Lx1/a;->f:Lj1/g;

    return-object v0
.end method

.method public final getContext()Lj1/g;
    .locals 1

    iget-object v0, p0, Lx1/a;->f:Lj1/g;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lx1/d0;->d(Ljava/lang/Object;Lq1/l;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx1/r1;->V(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lx1/s1;->b:Lkotlinx/coroutines/internal/x;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lx1/a;->s0(Ljava/lang/Object;)V

    return-void
.end method

.method protected s0(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lx1/r1;->w(Ljava/lang/Object;)V

    return-void
.end method

.method protected t0(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method protected u0(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public final v0(Lx1/k0;Ljava/lang/Object;Lq1/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lx1/k0;",
            "TR;",
            "Lq1/p<",
            "-TR;-",
            "Lj1/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1, p3, p2, p0}, Lx1/k0;->b(Lq1/p;Ljava/lang/Object;Lj1/d;)V

    return-void
.end method
