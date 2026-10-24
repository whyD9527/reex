.class final Lkotlinx/coroutines/internal/s$a;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lq1/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/internal/s;->a(Lq1/l;Ljava/lang/Object;Lj1/g;)Lq1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/l;",
        "Lq1/l<",
        "Ljava/lang/Throwable;",
        "Lg1/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic e:Lq1/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq1/l<",
            "TE;",
            "Lg1/q;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field final synthetic g:Lj1/g;


# direct methods
.method constructor <init>(Lq1/l;Ljava/lang/Object;Lj1/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq1/l<",
            "-TE;",
            "Lg1/q;",
            ">;TE;",
            "Lj1/g;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/internal/s$a;->e:Lq1/l;

    iput-object p2, p0, Lkotlinx/coroutines/internal/s$a;->f:Ljava/lang/Object;

    iput-object p3, p0, Lkotlinx/coroutines/internal/s$a;->g:Lj1/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lkotlinx/coroutines/internal/s$a;->e:Lq1/l;

    iget-object v0, p0, Lkotlinx/coroutines/internal/s$a;->f:Ljava/lang/Object;

    iget-object v1, p0, Lkotlinx/coroutines/internal/s$a;->g:Lj1/g;

    invoke-static {p1, v0, v1}, Lkotlinx/coroutines/internal/s;->b(Lq1/l;Ljava/lang/Object;Lj1/g;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/internal/s$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lg1/q;->a:Lg1/q;

    return-object p1
.end method
