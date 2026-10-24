.class public abstract Lz1/o;
.super Lkotlinx/coroutines/internal/m;
.source "SourceFile"

# interfaces
.implements Lz1/q;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/m;",
        "Lz1/q<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/m;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic e()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz1/o;->y()Lkotlinx/coroutines/internal/x;

    move-result-object v0

    return-object v0
.end method

.method public y()Lkotlinx/coroutines/internal/x;
    .locals 1

    sget-object v0, Lz1/b;->b:Lkotlinx/coroutines/internal/x;

    return-object v0
.end method

.method public abstract z(Lz1/j;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz1/j<",
            "*>;)V"
        }
    .end annotation
.end method
