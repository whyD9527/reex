.class Lg1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lq1/a;)Lg1/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lq1/a<",
            "+TT;>;)",
            "Lg1/e<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg1/m;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Lg1/m;-><init>(Lq1/a;Ljava/lang/Object;ILkotlin/jvm/internal/g;)V

    return-object v0
.end method
