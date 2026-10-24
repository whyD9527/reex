.class public Lq0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq0/d$c;,
        Lq0/d$b;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Lq0/d$c;

.field private c:J

.field private d:Lq0/b;

.field private e:Lio/flutter/embedding/engine/FlutterJNI;

.field private f:Ljava/util/concurrent/ExecutorService;

.field g:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Lq0/d$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Ln0/a;->e()Ln0/a;

    move-result-object v0

    invoke-virtual {v0}, Ln0/a;->d()Lio/flutter/embedding/engine/FlutterJNI$c;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI$c;->a()Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v0

    invoke-direct {p0, v0}, Lq0/d;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/FlutterJNI;)V
    .locals 1

    invoke-static {}, Ln0/a;->e()Ln0/a;

    move-result-object v0

    invoke-virtual {v0}, Ln0/a;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lq0/d;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/FlutterJNI;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq0/d;->a:Z

    iput-object p1, p0, Lq0/d;->e:Lio/flutter/embedding/engine/FlutterJNI;

    iput-object p2, p0, Lq0/d;->f:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic a(Lq0/d;Landroid/content/Context;)Lq0/e;
    .locals 0

    invoke-direct {p0, p1}, Lq0/d;->h(Landroid/content/Context;)Lq0/e;

    const/4 p0, 0x0

    return-object p0
.end method

.method static synthetic b(Lq0/d;)Lio/flutter/embedding/engine/FlutterJNI;
    .locals 0

    iget-object p0, p0, Lq0/d;->e:Lio/flutter/embedding/engine/FlutterJNI;

    return-object p0
.end method

.method static synthetic c(Lq0/d;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    iget-object p0, p0, Lq0/d;->f:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method private static d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private h(Landroid/content/Context;)Lq0/e;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method private static j(Landroid/os/Bundle;)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, "io.flutter.embedding.android.LeakVM"

    invoke-virtual {p0, v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public e()Z
    .locals 1

    iget-object v0, p0, Lq0/d;->d:Lq0/b;

    iget-boolean v0, v0, Lq0/b;->g:Z

    return v0
.end method

.method public f(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 10

    const-string v0, "--aot-shared-library-name="

    iget-boolean v1, p0, Lq0/d;->a:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_e

    iget-object v1, p0, Lq0/d;->b:Lq0/d$c;

    if-eqz v1, :cond_d

    :try_start_0
    const-string v1, "FlutterLoader#ensureInitializationComplete"

    invoke-static {v1}, Lf1/f;->f(Ljava/lang/String;)Lf1/f;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lq0/d;->g:Ljava/util/concurrent/Future;

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq0/d$b;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "--icu-symbol-prefix=_binary_icudtl_dat"

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "--icu-native-lib-path="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lq0/d;->d:Lq0/b;

    iget-object v5, v5, Lq0/b;->f:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "libflutter.so"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p2, :cond_1

    invoke-static {v3, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    :cond_1
    const/4 p2, 0x0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lq0/d;->d:Lq0/b;

    iget-object v6, v6, Lq0/b;->a:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lq0/d;->d:Lq0/b;

    iget-object v0, v0, Lq0/b;->f:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lq0/d;->d:Lq0/b;

    iget-object v0, v0, Lq0/b;->a:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "--cache-dir-path="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v2, Lq0/d$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq0/d;->d:Lq0/b;

    iget-object v0, v0, Lq0/b;->e:Ljava/lang/String;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "--domain-network-policy="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lq0/d;->d:Lq0/b;

    iget-object v4, v4, Lq0/b;->e:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, Lq0/d;->b:Lq0/d$c;

    invoke-virtual {v0}, Lq0/d$c;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "--log-tag="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lq0/d;->b:Lq0/d$c;

    invoke-virtual {v4}, Lq0/d$c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x80

    invoke-virtual {v0, v4, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    const-string v5, "io.flutter.embedding.android.OldGenHeapSize"

    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v5

    goto :goto_0

    :cond_4
    move v5, v4

    :goto_0
    if-nez v5, :cond_5

    const-string v5, "activity"

    invoke-virtual {p1, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/app/ActivityManager;

    new-instance v6, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v6}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    invoke-virtual {v5, v6}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    iget-wide v5, v6, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    long-to-double v5, v5

    const-wide v7, 0x412e848000000000L    # 1000000.0

    div-double/2addr v5, v7

    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    div-double/2addr v5, v7

    double-to-int v5, v5

    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "--old-gen-heap-size="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v6, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    mul-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0xc

    mul-int/lit8 v6, v6, 0x4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "--resource-cache-max-bytes-threshold="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v5, "--prefetched-default-font-manager"

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_9

    const-string v5, "io.flutter.embedding.android.EnableImpeller"

    invoke-virtual {v0, v5, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_6

    const-string v5, "--enable-impeller"

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    const-string v5, "io.flutter.embedding.android.EnableVulkanValidation"

    invoke-static {}, Lq0/d;->d()Z

    move-result v6

    invoke-virtual {v0, v5, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_7

    const-string v5, "--enable-vulkan-validation"

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    const-string v5, "io.flutter.embedding.android.EnableOpenGLGPUTracing"

    invoke-virtual {v0, v5, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_8

    const-string v5, "--enable-opengl-gpu-tracing"

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    const-string v5, "io.flutter.embedding.android.ImpellerBackend"

    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_9

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "--impeller-backend="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-static {v0}, Lq0/d;->j(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "true"

    goto :goto_1

    :cond_a
    const-string v0, "false"

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "--leak-vm="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    iget-wide v7, p0, Lq0/d;->c:J

    sub-long v8, v5, v7

    iget-object v0, p0, Lq0/d;->e:Lio/flutter/embedding/engine/FlutterJNI;

    new-array v4, v4, [Ljava/lang/String;

    invoke-interface {v3, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, [Ljava/lang/String;

    iget-object v6, v2, Lq0/d$b;->a:Ljava/lang/String;

    iget-object v7, v2, Lq0/d$b;->b:Ljava/lang/String;

    move-object v2, v0

    move-object v3, p1

    move-object v5, p2

    invoke-virtual/range {v2 .. v9}, Lio/flutter/embedding/engine/FlutterJNI;->init(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lq0/d;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_b

    :try_start_2
    invoke-virtual {v1}, Lf1/f;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_b
    return-void

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_c

    :try_start_3
    invoke-virtual {v1}, Lf1/f;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_c
    :goto_2
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    const-string p2, "FlutterLoader"

    const-string v0, "Flutter initialization failed."

    invoke-static {p2, v0, p1}, Ln0/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ensureInitializationComplete must be called after startInitialization"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ensureInitializationComplete must be called on the main thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq0/d;->d:Lq0/b;

    iget-object v0, v0, Lq0/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lq0/d;->a:Z

    return v0
.end method

.method public k(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lq0/d$c;

    invoke-direct {v0}, Lq0/d$c;-><init>()V

    invoke-virtual {p0, p1, v0}, Lq0/d;->l(Landroid/content/Context;Lq0/d$c;)V

    return-void
.end method

.method public l(Landroid/content/Context;Lq0/d$c;)V
    .locals 3

    iget-object v0, p0, Lq0/d;->b:Lq0/d$c;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_3

    const-string v0, "FlutterLoader#startInitialization"

    invoke-static {v0}, Lf1/f;->f(Ljava/lang/String;)Lf1/f;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p2, p0, Lq0/d;->b:Lq0/d$c;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lq0/d;->c:J

    invoke-static {p1}, Lq0/a;->e(Landroid/content/Context;)Lq0/b;

    move-result-object p2

    iput-object p2, p0, Lq0/d;->d:Lq0/b;

    const-string p2, "display"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/display/DisplayManager;

    iget-object v1, p0, Lq0/d;->e:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-static {p2, v1}, Lio/flutter/view/p;->f(Landroid/hardware/display/DisplayManager;Lio/flutter/embedding/engine/FlutterJNI;)Lio/flutter/view/p;

    move-result-object p2

    invoke-virtual {p2}, Lio/flutter/view/p;->g()V

    new-instance p2, Lq0/d$a;

    invoke-direct {p2, p0, p1}, Lq0/d$a;-><init>(Lq0/d;Landroid/content/Context;)V

    iget-object p1, p0, Lq0/d;->f:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    iput-object p1, p0, Lq0/d;->g:Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lf1/f;->close()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_2

    :try_start_1
    invoke-virtual {v0}, Lf1/f;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "startInitialization must be called on the main thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
