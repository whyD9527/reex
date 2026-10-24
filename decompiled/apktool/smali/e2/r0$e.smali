.class final Le2/r0$e;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lq1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le2/r0;-><init>(Landroid/content/Context;Lz0/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/l;",
        "Lq1/a<",
        "Landroid/view/WindowManager;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic e:Le2/r0;


# direct methods
.method constructor <init>(Le2/r0;)V
    .locals 0

    iput-object p1, p0, Le2/r0$e;->e:Le2/r0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/view/WindowManager;
    .locals 2

    iget-object v0, p0, Le2/r0$e;->e:Le2/r0;

    invoke-virtual {v0}, Le2/r0;->o()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/WindowManager;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le2/r0$e;->a()Landroid/view/WindowManager;

    move-result-object v0

    return-object v0
.end method
