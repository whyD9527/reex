.class public final Le2/n$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le2/n;-><init>(Landroid/content/Context;Lq1/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Le2/n;


# direct methods
.method constructor <init>(Le2/n;)V
    .locals 0

    iput-object p1, p0, Le2/n$b;->a:Le2/n;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/n$b;->a:Le2/n;

    invoke-virtual {p1}, Le2/n;->f()Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object p1

    invoke-static {p1, p2}, Ld0/a;->b(Landroid/support/v4/media/session/MediaSessionCompat;Landroid/content/Intent;)Landroid/view/KeyEvent;

    return-void
.end method
