.class final Lx1/t1;
.super Lx1/z1;
.source "SourceFile"


# instance fields
.field private final g:Lj1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj1/d<",
            "Lg1/q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj1/g;Lq1/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/g;",
            "Lq1/p<",
            "-",
            "Lx1/i0;",
            "-",
            "Lj1/d<",
            "-",
            "Lg1/q;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lx1/z1;-><init>(Lj1/g;Z)V

    invoke-static {p2, p0, p0}, Lk1/b;->a(Lq1/p;Ljava/lang/Object;Lj1/d;)Lj1/d;

    move-result-object p1

    iput-object p1, p0, Lx1/t1;->g:Lj1/d;

    return-void
.end method


# virtual methods
.method protected d0()V
    .locals 1

    iget-object v0, p0, Lx1/t1;->g:Lj1/d;

    invoke-static {v0, p0}, Lc2/a;->c(Lj1/d;Lj1/d;)V

    return-void
.end method
