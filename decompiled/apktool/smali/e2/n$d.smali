.class public final Le2/n$d;
.super Landroid/support/v4/media/session/MediaSessionCompat$b;
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
.field final synthetic f:Le2/n;


# direct methods
.method constructor <init>(Le2/n;)V
    .locals 0

    iput-object p1, p0, Le2/n$d;->f:Le2/n;

    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$b;-><init>()V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 3

    iget-object v0, p0, Le2/n$d;->f:Le2/n;

    invoke-virtual {v0}, Le2/n;->e()Lq1/p;

    move-result-object v0

    const-string v1, "onSkipToPrevious"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lq1/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public h()V
    .locals 3

    iget-object v0, p0, Le2/n$d;->f:Le2/n;

    invoke-virtual {v0}, Le2/n;->e()Lq1/p;

    move-result-object v0

    const-string v1, "onPause"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lq1/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public i()V
    .locals 3

    iget-object v0, p0, Le2/n$d;->f:Le2/n;

    invoke-virtual {v0}, Le2/n;->e()Lq1/p;

    move-result-object v0

    const-string v1, "onPlay"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lq1/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public s(J)V
    .locals 1

    iget-object v0, p0, Le2/n$d;->f:Le2/n;

    invoke-virtual {v0}, Le2/n;->e()Lq1/p;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "onSeekTo"

    invoke-interface {v0, p2, p1}, Lq1/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public u(F)V
    .locals 2

    iget-object v0, p0, Le2/n$d;->f:Le2/n;

    invoke-virtual {v0}, Le2/n;->e()Lq1/p;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const-string v1, "onSetPlaybackSpeed"

    invoke-interface {v0, v1, p1}, Lq1/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public z()V
    .locals 3

    iget-object v0, p0, Le2/n$d;->f:Le2/n;

    invoke-virtual {v0}, Le2/n;->e()Lq1/p;

    move-result-object v0

    const-string v1, "onSkipToNext"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lq1/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
