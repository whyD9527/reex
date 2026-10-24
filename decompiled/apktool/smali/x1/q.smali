.class public final Lx1/q;
.super Lx1/m1;
.source "SourceFile"


# instance fields
.field public final i:Lx1/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/m<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx1/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/m<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lx1/m1;-><init>()V

    iput-object p1, p0, Lx1/q;->i:Lx1/m;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lx1/q;->y(Ljava/lang/Throwable;)V

    sget-object p1, Lg1/q;->a:Lg1/q;

    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lx1/q;->i:Lx1/m;

    invoke-virtual {p0}, Lx1/q1;->z()Lx1/r1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lx1/m;->v(Lx1/k1;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lx1/m;->E(Ljava/lang/Throwable;)V

    return-void
.end method
