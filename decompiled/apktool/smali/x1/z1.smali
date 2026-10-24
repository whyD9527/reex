.class Lx1/z1;
.super Lx1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/a<",
        "Lg1/q;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lj1/g;Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Lx1/a;-><init>(Lj1/g;ZZ)V

    return-void
.end method


# virtual methods
.method protected P(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lx1/a;->getContext()Lj1/g;

    move-result-object v0

    invoke-static {v0, p1}, Lx1/h0;->a(Lj1/g;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
