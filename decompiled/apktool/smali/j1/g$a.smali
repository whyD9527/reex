.class public final Lj1/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lj1/g;Lj1/g;)Lj1/g;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/h;->e:Lj1/h;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lj1/g$a$a;->e:Lj1/g$a$a;

    invoke-interface {p1, p0, v0}, Lj1/g;->fold(Ljava/lang/Object;Lq1/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj1/g;

    :goto_0
    return-object p0
.end method
