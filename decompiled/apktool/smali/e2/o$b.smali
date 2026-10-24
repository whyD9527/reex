.class final Le2/o$b;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lq1/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le2/o;->m(Lz0/j;Lz0/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/l;",
        "Lq1/p<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        "Lg1/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic e:Le2/o;


# direct methods
.method constructor <init>(Le2/o;)V
    .locals 0

    iput-object p1, p0, Le2/o$b;->e:Le2/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le2/o$b;->e:Le2/o;

    invoke-static {v0}, Le2/o;->a(Le2/o;)Lz0/k;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "channel"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1, p2}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Le2/o$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Lg1/q;->a:Lg1/q;

    return-object p1
.end method
