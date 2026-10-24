.class final Lx1/j1;
.super Lx1/q1;
.source "SourceFile"


# instance fields
.field private final i:Lq1/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq1/l<",
            "Ljava/lang/Throwable;",
            "Lg1/q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq1/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq1/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lg1/q;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lx1/q1;-><init>()V

    iput-object p1, p0, Lx1/j1;->i:Lq1/l;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lx1/j1;->y(Ljava/lang/Throwable;)V

    sget-object p1, Lg1/q;->a:Lg1/q;

    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lx1/j1;->i:Lq1/l;

    invoke-interface {v0, p1}, Lq1/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
