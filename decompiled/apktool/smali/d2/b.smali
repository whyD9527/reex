.class public final Ld2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld2/b$a;
    }
.end annotation


# instance fields
.field private a:Lz0/k;

.field private b:Lio/flutter/view/TextureRegistry;

.field private final c:Ll/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/d<",
            "Ld2/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll/d;

    invoke-direct {v0}, Ll/d;-><init>()V

    iput-object v0, p0, Ld2/b;->c:Ll/d;

    return-void
.end method


# virtual methods
.method public h(Ls0/a$b;)V
    .locals 3

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mpvclient"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const-string v0, "mpv"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    sget-object v0, Lxyz/lhtls/mpv_client/MPVJniUtils;->a:Lxyz/lhtls/mpv_client/MPVJniUtils;

    invoke-virtual {v0}, Lxyz/lhtls/mpv_client/MPVJniUtils;->avJniSetJavaVM()V

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object v1

    const-string v2, "xyz.lhtls.mpv_client"

    invoke-direct {v0, v1, v2}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;)V

    iput-object v0, p0, Ld2/b;->a:Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->c()Lio/flutter/view/TextureRegistry;

    move-result-object p1

    const-string v0, "flutterPluginBinding.textureRegistry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ld2/b;->b:Lio/flutter/view/TextureRegistry;

    iget-object p1, p0, Ld2/b;->a:Lz0/k;

    if-nez p1, :cond_0

    const-string p1, "channel"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1, p0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ld2/b;->a:Lz0/k;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "channel"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1, v0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public m(Lz0/j;Lz0/k$d;)V
    .locals 6

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lz0/j;->a:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x4b0fa2a3

    const/4 v3, 0x0

    if-eq v1, v2, :cond_5

    const v2, -0x1b50971a

    if-eq v1, v2, :cond_2

    const v2, 0x26bd97aa

    if-eq v1, v2, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v1, "SurfaceTextureEntry.setDefaultBufferSize"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-string v2, "width"

    invoke-virtual {p1, v2}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v4, "height"

    invoke-virtual {p1, v4}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v4, p0, Ld2/b;->c:Ll/d;

    invoke-virtual {v4, v0, v1}, Ll/d;->e(J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ld2/b$a;

    invoke-virtual {v0}, Ld2/b$a;->a()Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    move-result-object v0

    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-virtual {v0, v2, p1}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    goto/16 :goto_1

    :cond_2
    const-string p1, "SurfaceTextureEntry.create"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_2

    :cond_3
    iget-object p1, p0, Ld2/b;->b:Lio/flutter/view/TextureRegistry;

    if-nez p1, :cond_4

    const-string p1, "textureRegistry"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v3, p1

    :goto_0
    invoke-interface {v3}, Lio/flutter/view/TextureRegistry;->c()Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    move-result-object p1

    const-string v0, "textureRegistry.createSurfaceTexture()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/view/Surface;

    invoke-interface {p1}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    sget-object v1, Lxyz/lhtls/mpv_client/MPVJniUtils;->a:Lxyz/lhtls/mpv_client/MPVJniUtils;

    invoke-virtual {v1, v0}, Lxyz/lhtls/mpv_client/MPVJniUtils;->newGlobalNativePtr(Ljava/lang/Object;)J

    move-result-wide v0

    new-instance v2, Ld2/b$a;

    invoke-direct {v2, p1, v0, v1}, Ld2/b$a;-><init>(Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;J)V

    iget-object v3, p0, Ld2/b;->c:Ll/d;

    invoke-interface {p1}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->id()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5, v2}, Ll/d;->h(JLjava/lang/Object;)V

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Long;

    const/4 v3, 0x0

    invoke-interface {p1}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->id()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    aput-object p1, v2, v3

    const/4 p1, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v2, p1

    invoke-static {v2}, Lh1/h;->e([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    const-string v1, "SurfaceTextureEntry.release"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Ld2/b;->c:Ll/d;

    invoke-virtual {p1, v0, v1}, Ll/d;->e(J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ld2/b$a;

    sget-object v2, Lxyz/lhtls/mpv_client/MPVJniUtils;->a:Lxyz/lhtls/mpv_client/MPVJniUtils;

    invoke-virtual {p1}, Ld2/b$a;->b()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lxyz/lhtls/mpv_client/MPVJniUtils;->deleteGlobalNativePtr(J)V

    iget-object p1, p0, Ld2/b;->c:Ll/d;

    invoke-virtual {p1, v0, v1}, Ll/d;->i(J)V

    :goto_1
    invoke-interface {p2, v3}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    :goto_2
    invoke-interface {p2}, Lz0/k$d;->b()V

    :goto_3
    return-void
.end method
