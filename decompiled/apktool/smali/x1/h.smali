.class final synthetic Lx1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx1/i0;Lj1/g;Lx1/k0;Lq1/p;)Lx1/k1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/i0;",
            "Lj1/g;",
            "Lx1/k0;",
            "Lq1/p<",
            "-",
            "Lx1/i0;",
            "-",
            "Lj1/d<",
            "-",
            "Lg1/q;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lx1/k1;"
        }
    .end annotation

    invoke-static {p0, p1}, Lx1/e0;->c(Lx1/i0;Lj1/g;)Lj1/g;

    move-result-object p0

    invoke-virtual {p2}, Lx1/k0;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lx1/t1;

    invoke-direct {p1, p0, p3}, Lx1/t1;-><init>(Lj1/g;Lq1/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lx1/z1;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lx1/z1;-><init>(Lj1/g;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lx1/a;->v0(Lx1/k0;Ljava/lang/Object;Lq1/p;)V

    return-object p1
.end method

.method public static synthetic b(Lx1/i0;Lj1/g;Lx1/k0;Lq1/p;ILjava/lang/Object;)Lx1/k1;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lj1/h;->e:Lj1/h;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, Lx1/k0;->e:Lx1/k0;

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lx1/g;->a(Lx1/i0;Lj1/g;Lx1/k0;Lq1/p;)Lx1/k1;

    move-result-object p0

    return-object p0
.end method
