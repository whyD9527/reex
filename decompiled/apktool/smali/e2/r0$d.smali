.class public final Le2/r0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le2/r0;-><init>(Landroid/content/Context;Lz0/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Le2/r0;


# direct methods
.method constructor <init>(Le2/r0;)V
    .locals 0

    iput-object p1, p0, Le2/r0$d;->a:Le2/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    const-string p2, "holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x2

    new-array p1, p1, [Lg1/j;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p3, "width"

    invoke-static {p3, p2}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object p2

    const/4 p3, 0x0

    aput-object p2, p1, p3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p3, "height"

    invoke-static {p3, p2}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, p1, p3

    invoke-static {p1}, Lh1/x;->e([Lg1/j;)Ljava/util/HashMap;

    move-result-object p1

    iget-object p2, p0, Le2/r0$d;->a:Le2/r0;

    invoke-virtual {p2}, Le2/r0;->n()Lz0/k;

    move-result-object p2

    const-string p3, "onSurfaceChanged"

    invoke-virtual {p2, p3, p1}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le2/r0$d;->a:Le2/r0;

    sget-object v1, Lxyz/lhtls/mpv_client/MPVJniUtils;->a:Lxyz/lhtls/mpv_client/MPVJniUtils;

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    const-string v2, "holder.surface"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lxyz/lhtls/mpv_client/MPVJniUtils;->newGlobalNativePtr(Ljava/lang/Object;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Le2/r0;->j(Le2/r0;J)V

    iget-object p1, p0, Le2/r0$d;->a:Le2/r0;

    invoke-virtual {p1}, Le2/r0;->n()Lz0/k;

    move-result-object p1

    iget-object v0, p0, Le2/r0$d;->a:Le2/r0;

    invoke-static {v0}, Le2/r0;->f(Le2/r0;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "onSurfaceCreated"

    invoke-virtual {p1, v1, v0}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/r0$d;->a:Le2/r0;

    invoke-virtual {p1}, Le2/r0;->n()Lz0/k;

    move-result-object p1

    new-instance v0, Le2/r0$d$a;

    iget-object v1, p0, Le2/r0$d;->a:Le2/r0;

    invoke-direct {v0, v1}, Le2/r0$d$a;-><init>(Le2/r0;)V

    const-string v1, "onSurfaceDestroyed"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Lz0/k;->d(Ljava/lang/String;Ljava/lang/Object;Lz0/k$d;)V

    return-void
.end method
