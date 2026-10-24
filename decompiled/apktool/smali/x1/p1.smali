.class final synthetic Lx1/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx1/k1;)Lx1/x;
    .locals 1

    new-instance v0, Lx1/n1;

    invoke-direct {v0, p0}, Lx1/n1;-><init>(Lx1/k1;)V

    return-object v0
.end method

.method public static synthetic b(Lx1/k1;ILjava/lang/Object;)Lx1/x;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lx1/o1;->a(Lx1/k1;)Lx1/x;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lj1/g;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, Lx1/k1;->d:Lx1/k1$b;

    invoke-interface {p0, v0}, Lj1/g;->get(Lj1/g$c;)Lj1/g$b;

    move-result-object p0

    check-cast p0, Lx1/k1;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Lx1/k1;->n(Ljava/util/concurrent/CancellationException;)V

    :goto_0
    return-void
.end method

.method public static final d(Lj1/g;)V
    .locals 1

    sget-object v0, Lx1/k1;->d:Lx1/k1$b;

    invoke-interface {p0, v0}, Lj1/g;->get(Lj1/g$c;)Lj1/g$b;

    move-result-object p0

    check-cast p0, Lx1/k1;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lx1/o1;->e(Lx1/k1;)V

    :goto_0
    return-void
.end method

.method public static final e(Lx1/k1;)V
    .locals 1

    invoke-interface {p0}, Lx1/k1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Lx1/k1;->j()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0
.end method
