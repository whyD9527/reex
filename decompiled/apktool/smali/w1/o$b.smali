.class final Lw1/o$b;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lq1/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw1/o;->N(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lv1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/l;",
        "Lq1/l<",
        "Lt1/c;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/CharSequence;


# direct methods
.method constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lw1/o$b;->e:Ljava/lang/CharSequence;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lt1/c;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lw1/o$b;->e:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Lw1/o;->P(Ljava/lang/CharSequence;Lt1/c;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt1/c;

    invoke-virtual {p0, p1}, Lw1/o$b;->a(Lt1/c;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
