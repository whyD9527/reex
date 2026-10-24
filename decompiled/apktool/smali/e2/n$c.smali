.class final Le2/n$c;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lq1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le2/n;-><init>(Landroid/content/Context;Lq1/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/l;",
        "Lq1/a<",
        "Landroid/app/NotificationManager;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic e:Le2/n;


# direct methods
.method constructor <init>(Le2/n;)V
    .locals 0

    iput-object p1, p0, Le2/n$c;->e:Le2/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/app/NotificationManager;
    .locals 2

    iget-object v0, p0, Le2/n$c;->e:Le2/n;

    invoke-virtual {v0}, Le2/n;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/NotificationManager;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Le2/n$c;->a()Landroid/app/NotificationManager;

    move-result-object v0

    return-object v0
.end method
