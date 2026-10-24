.class public final Lxyz/re/player/ex/MainActivity;
.super Lio/flutter/embedding/android/e;
.source "SourceFile"


# instance fields
.field private final j:Le2/o0;

.field private k:Lio/flutter/embedding/engine/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lio/flutter/embedding/android/e;-><init>()V

    new-instance v0, Le2/o0;

    invoke-direct {v0}, Le2/o0;-><init>()V

    iput-object v0, p0, Lxyz/re/player/ex/MainActivity;->j:Le2/o0;

    return-void
.end method

.method public static synthetic R(Lio/flutter/embedding/engine/a;)V
    .locals 0

    invoke-static {p0}, Lxyz/re/player/ex/MainActivity;->S(Lio/flutter/embedding/engine/a;)V

    return-void
.end method

.method private static final S(Lio/flutter/embedding/engine/a;)V
    .locals 1

    const-string v0, "$engine"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->g()V

    return-void
.end method


# virtual methods
.method public B(Landroid/content/Context;)Lio/flutter/embedding/engine/a;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxyz/re/player/ex/MainActivity;->k:Lio/flutter/embedding/engine/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lio/flutter/embedding/engine/a;

    invoke-virtual {p0}, Lio/flutter/embedding/android/e;->y()Lio/flutter/embedding/engine/g;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/embedding/engine/g;->b()[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0}, Lio/flutter/embedding/android/e;->q()Z

    move-result v3

    invoke-direct {v0, p1, v1, v2, v3}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;[Ljava/lang/String;ZZ)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object p1

    new-instance v1, Le2/e;

    invoke-direct {v1}, Le2/e;-><init>()V

    invoke-interface {p1, v1}, Ls0/b;->i(Ls0/a;)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object p1

    new-instance v1, Le2/s0;

    invoke-direct {v1}, Le2/s0;-><init>()V

    invoke-interface {p1, v1}, Ls0/b;->i(Ls0/a;)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object p1

    iget-object v1, p0, Lxyz/re/player/ex/MainActivity;->j:Le2/o0;

    invoke-interface {p1, v1}, Ls0/b;->i(Ls0/a;)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object p1

    new-instance v1, Lxyz/re/player/ex/AudioManagerChannel;

    invoke-direct {v1}, Lxyz/re/player/ex/AudioManagerChannel;-><init>()V

    invoke-interface {p1, v1}, Ls0/b;->i(Ls0/a;)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object p1

    new-instance v1, Le2/f0;

    invoke-direct {v1}, Le2/f0;-><init>()V

    invoke-interface {p1, v1}, Ls0/b;->i(Ls0/a;)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object p1

    new-instance v1, Le2/s;

    invoke-direct {v1}, Le2/s;-><init>()V

    invoke-interface {p1, v1}, Ls0/b;->i(Ls0/a;)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object p1

    new-instance v1, Le2/p;

    invoke-direct {v1}, Le2/p;-><init>()V

    invoke-interface {p1, v1}, Ls0/b;->i(Ls0/a;)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object p1

    new-instance v1, Le2/q;

    invoke-direct {v1}, Le2/q;-><init>()V

    invoke-interface {p1, v1}, Ls0/b;->i(Ls0/a;)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object p1

    new-instance v1, Le2/i0;

    invoke-direct {v1}, Le2/i0;-><init>()V

    invoke-interface {p1, v1}, Ls0/b;->i(Ls0/a;)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object p1

    new-instance v1, Le2/o;

    invoke-direct {v1}, Le2/o;-><init>()V

    invoke-interface {p1, v1}, Ls0/b;->i(Ls0/a;)V

    invoke-virtual {v0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object p1

    new-instance v1, Le2/j0;

    invoke-direct {v1}, Le2/j0;-><init>()V

    invoke-interface {p1, v1}, Ls0/b;->i(Ls0/a;)V

    iput-object v0, p0, Lxyz/re/player/ex/MainActivity;->k:Lio/flutter/embedding/engine/a;

    return-object v0
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    sget-object v0, Lv/c;->b:Lv/c$a;

    invoke-virtual {v0, p0}, Lv/c$a;->a(Landroid/app/Activity;)Lv/c;

    invoke-super {p0, p1}, Lio/flutter/embedding/android/e;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 5

    invoke-super {p0}, Lio/flutter/embedding/android/e;->onDestroy()V

    iget-object v0, p0, Lxyz/re/player/ex/MainActivity;->k:Lio/flutter/embedding/engine/a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lxyz/re/player/ex/MainActivity;->k:Lio/flutter/embedding/engine/a;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Le2/t;

    invoke-direct {v2, v0}, Le2/t;-><init>(Lio/flutter/embedding/engine/a;)V

    const-wide/16 v3, 0x12c

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 1

    const-string v0, "newConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V

    iget-object p2, p0, Lxyz/re/player/ex/MainActivity;->j:Le2/o0;

    invoke-virtual {p2, p1}, Le2/o0;->c(Z)V

    return-void
.end method
