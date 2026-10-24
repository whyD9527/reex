.class public final Le2/r0$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le2/r0$d;->surfaceDestroyed(Landroid/view/SurfaceHolder;)V
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

    iput-object p1, p0, Le2/r0$d$a;->a:Le2/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    sget-object p1, Lxyz/lhtls/mpv_client/MPVJniUtils;->a:Lxyz/lhtls/mpv_client/MPVJniUtils;

    iget-object v0, p0, Le2/r0$d$a;->a:Le2/r0;

    invoke-static {v0}, Le2/r0;->f(Le2/r0;)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lxyz/lhtls/mpv_client/MPVJniUtils;->deleteGlobalNativePtr(J)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    const-string p2, "errorCode"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
