.class public final Lx1/s;
.super Lx1/m1;
.source "SourceFile"

# interfaces
.implements Lx1/r;


# instance fields
.field public final i:Lx1/t;


# direct methods
.method public constructor <init>(Lx1/t;)V
    .locals 0

    invoke-direct {p0}, Lx1/m1;-><init>()V

    iput-object p1, p0, Lx1/s;->i:Lx1/t;

    return-void
.end method


# virtual methods
.method public f(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lx1/q1;->z()Lx1/r1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx1/r1;->C(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public getParent()Lx1/k1;
    .locals 1

    invoke-virtual {p0}, Lx1/q1;->z()Lx1/r1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lx1/s;->y(Ljava/lang/Throwable;)V

    sget-object p1, Lg1/q;->a:Lg1/q;

    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lx1/s;->i:Lx1/t;

    invoke-virtual {p0}, Lx1/q1;->z()Lx1/r1;

    move-result-object v0

    invoke-interface {p1, v0}, Lx1/t;->f(Lx1/y1;)V

    return-void
.end method
