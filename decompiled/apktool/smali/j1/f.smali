.class public final Lj1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lq1/p;Ljava/lang/Object;Lj1/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lq1/p<",
            "-TR;-",
            "Lj1/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lj1/d<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lk1/b;->a(Lq1/p;Ljava/lang/Object;Lj1/d;)Lj1/d;

    move-result-object p0

    invoke-static {p0}, Lk1/b;->b(Lj1/d;)Lj1/d;

    move-result-object p0

    sget-object p1, Lg1/k;->e:Lg1/k$a;

    sget-object p1, Lg1/q;->a:Lg1/q;

    invoke-static {p1}, Lg1/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lj1/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
