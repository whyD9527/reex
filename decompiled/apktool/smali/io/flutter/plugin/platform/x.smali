.class public Lio/flutter/plugin/platform/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/platform/m;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1a
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicLong;

.field private final b:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

.field private c:Landroid/graphics/SurfaceTexture;

.field private d:Landroid/view/Surface;

.field private e:I

.field private f:I

.field private final g:Lio/flutter/view/TextureRegistry$a;

.field private h:Z

.field private final i:Lio/flutter/view/TextureRegistry$b;


# direct methods
.method public constructor <init>(Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lio/flutter/plugin/platform/x;->a:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v0, 0x0

    iput v0, p0, Lio/flutter/plugin/platform/x;->e:I

    iput v0, p0, Lio/flutter/plugin/platform/x;->f:I

    new-instance v1, Lio/flutter/plugin/platform/x$a;

    invoke-direct {v1, p0}, Lio/flutter/plugin/platform/x$a;-><init>(Lio/flutter/plugin/platform/x;)V

    iput-object v1, p0, Lio/flutter/plugin/platform/x;->g:Lio/flutter/view/TextureRegistry$a;

    iput-boolean v0, p0, Lio/flutter/plugin/platform/x;->h:Z

    new-instance v0, Lio/flutter/plugin/platform/x$b;

    invoke-direct {v0, p0}, Lio/flutter/plugin/platform/x$b;-><init>(Lio/flutter/plugin/platform/x;)V

    iput-object v0, p0, Lio/flutter/plugin/platform/x;->i:Lio/flutter/view/TextureRegistry$b;

    iput-object p1, p0, Lio/flutter/plugin/platform/x;->b:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-interface {p1}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->surfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v2

    iput-object v2, p0, Lio/flutter/plugin/platform/x;->c:Landroid/graphics/SurfaceTexture;

    invoke-interface {p1, v1}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->setOnFrameConsumedListener(Lio/flutter/view/TextureRegistry$a;)V

    invoke-interface {p1, v0}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->setOnTrimMemoryListener(Lio/flutter/view/TextureRegistry$b;)V

    invoke-direct {p0}, Lio/flutter/plugin/platform/x;->e()V

    return-void
.end method

.method static synthetic b(Lio/flutter/plugin/platform/x;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0

    iget-object p0, p0, Lio/flutter/plugin/platform/x;->a:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method static synthetic c(Lio/flutter/plugin/platform/x;Z)Z
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugin/platform/x;->h:Z

    return p1
.end method

.method private e()V
    .locals 3

    iget v0, p0, Lio/flutter/plugin/platform/x;->e:I

    if-lez v0, :cond_0

    iget v1, p0, Lio/flutter/plugin/platform/x;->f:I

    if-lez v1, :cond_0

    iget-object v2, p0, Lio/flutter/plugin/platform/x;->c:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/x;->d:Landroid/view/Surface;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugin/platform/x;->d:Landroid/view/Surface;

    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugin/platform/x;->d()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugin/platform/x;->d:Landroid/view/Surface;

    invoke-virtual {p0}, Lio/flutter/plugin/platform/x;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lio/flutter/plugin/platform/x;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {p0, v0}, Lio/flutter/plugin/platform/x;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    throw v1
.end method

.method private f()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/platform/x;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    :cond_0
    return-void
.end method

.method private g()V
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugin/platform/x;->h:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/x;->d:Landroid/view/Surface;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugin/platform/x;->d:Landroid/view/Surface;

    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugin/platform/x;->d()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugin/platform/x;->d:Landroid/view/Surface;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugin/platform/x;->h:Z

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 1

    iput p1, p0, Lio/flutter/plugin/platform/x;->e:I

    iput p2, p0, Lio/flutter/plugin/platform/x;->f:I

    iget-object v0, p0, Lio/flutter/plugin/platform/x;->c:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    :cond_0
    return-void
.end method

.method protected d()Landroid/view/Surface;
    .locals 2

    new-instance v0, Landroid/view/Surface;

    iget-object v1, p0, Lio/flutter/plugin/platform/x;->c:Landroid/graphics/SurfaceTexture;

    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lio/flutter/plugin/platform/x;->f:I

    return v0
.end method

.method public getId()J
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/x;->b:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-interface {v0}, Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;->id()J

    move-result-wide v0

    return-wide v0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    invoke-direct {p0}, Lio/flutter/plugin/platform/x;->g()V

    iget-object v0, p0, Lio/flutter/plugin/platform/x;->d:Landroid/view/Surface;

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lio/flutter/plugin/platform/x;->e:I

    return v0
.end method

.method public lockHardwareCanvas()Landroid/graphics/Canvas;
    .locals 6

    invoke-direct {p0}, Lio/flutter/plugin/platform/x;->g()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1d

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/platform/x;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/x;->c:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lio/flutter/plugin/platform/w;->a(Landroid/graphics/SurfaceTexture;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lio/flutter/plugin/platform/x;->f()V

    iget-object v0, p0, Lio/flutter/plugin/platform/x;->d:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_0
    const-string v0, "SurfaceTexturePlatformViewRenderTarget"

    const-string v2, "Invalid RenderTarget: null or already released SurfaceTexture"

    invoke-static {v0, v2}, Ln0/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public release()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugin/platform/x;->c:Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Lio/flutter/plugin/platform/x;->d:Landroid/view/Surface;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    iput-object v0, p0, Lio/flutter/plugin/platform/x;->d:Landroid/view/Surface;

    :cond_0
    return-void
.end method

.method public unlockCanvasAndPost(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/x;->d:Landroid/view/Surface;

    invoke-virtual {v0, p1}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    return-void
.end method
