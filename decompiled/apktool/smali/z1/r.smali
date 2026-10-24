.class public Lz1/r;
.super Lz1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lz1/a<",
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

    invoke-direct {p0, p1}, Lz1/a;-><init>(Lq1/l;)V

    return-void
.end method


# virtual methods
.method protected final r()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected final s()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
