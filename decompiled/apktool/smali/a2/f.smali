.class final La2/f;
.super La2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "La2/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lq1/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq1/p<",
            "La2/c<",
            "-TT;>;",
            "Lj1/d<",
            "-",
            "Lg1/q;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq1/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq1/p<",
            "-",
            "La2/c<",
            "-TT;>;-",
            "Lj1/d<",
            "-",
            "Lg1/q;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, La2/a;-><init>()V

    iput-object p1, p0, La2/f;->a:Lq1/p;

    return-void
.end method


# virtual methods
.method public b(La2/c;Lj1/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/c<",
            "-TT;>;",
            "Lj1/d<",
            "-",
            "Lg1/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, La2/f;->a:Lq1/p;

    invoke-interface {v0, p1, p2}, Lq1/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lk1/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lg1/q;->a:Lg1/q;

    return-object p1
.end method
