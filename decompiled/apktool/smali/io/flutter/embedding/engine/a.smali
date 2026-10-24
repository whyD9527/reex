.class public Lio/flutter/embedding/engine/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/i$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/engine/a$b;
    }
.end annotation


# instance fields
.field private final a:Lio/flutter/embedding/engine/FlutterJNI;

.field private final b:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

.field private final c:Lo0/a;

.field private final d:Lio/flutter/embedding/engine/c;

.field private final e:La1/b;

.field private final f:Ly0/a;

.field private final g:Ly0/b;

.field private final h:Ly0/f;

.field private final i:Ly0/g;

.field private final j:Ly0/h;

.field private final k:Ly0/i;

.field private final l:Ly0/n;

.field private final m:Ly0/j;

.field private final n:Ly0/m;

.field private final o:Ly0/o;

.field private final p:Ly0/p;

.field private final q:Ly0/q;

.field private final r:Ly0/r;

.field private final s:Lio/flutter/plugin/platform/u;

.field private final t:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/flutter/embedding/engine/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Lio/flutter/embedding/engine/a$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lq0/d;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/u;[Ljava/lang/String;ZZ)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Lq0/d;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/u;[Ljava/lang/String;ZZLio/flutter/embedding/engine/d;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lq0/d;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/u;[Ljava/lang/String;ZZLio/flutter/embedding/engine/d;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->t:Ljava/util/Set;

    new-instance v0, Lio/flutter/embedding/engine/a$a;

    invoke-direct {v0, p0}, Lio/flutter/embedding/engine/a$a;-><init>(Lio/flutter/embedding/engine/a;)V

    iput-object v0, p0, Lio/flutter/embedding/engine/a;->u:Lio/flutter/embedding/engine/a$b;

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    :goto_0
    invoke-static {}, Ln0/a;->e()Ln0/a;

    move-result-object v1

    if-nez p3, :cond_0

    invoke-virtual {v1}, Ln0/a;->d()Lio/flutter/embedding/engine/FlutterJNI$c;

    move-result-object p3

    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI$c;->a()Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    new-instance v2, Lo0/a;

    invoke-direct {v2, p3, v0}, Lo0/a;-><init>(Lio/flutter/embedding/engine/FlutterJNI;Landroid/content/res/AssetManager;)V

    iput-object v2, p0, Lio/flutter/embedding/engine/a;->c:Lo0/a;

    invoke-virtual {v2}, Lo0/a;->m()V

    invoke-static {}, Ln0/a;->e()Ln0/a;

    move-result-object v0

    invoke-virtual {v0}, Ln0/a;->a()Lp0/a;

    move-result-object v0

    new-instance v3, Ly0/a;

    invoke-direct {v3, v2, p3}, Ly0/a;-><init>(Lo0/a;Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->f:Ly0/a;

    new-instance v3, Ly0/b;

    invoke-direct {v3, v2}, Ly0/b;-><init>(Lo0/a;)V

    iput-object v3, p0, Lio/flutter/embedding/engine/a;->g:Ly0/b;

    new-instance v4, Ly0/f;

    invoke-direct {v4, v2}, Ly0/f;-><init>(Lo0/a;)V

    iput-object v4, p0, Lio/flutter/embedding/engine/a;->h:Ly0/f;

    new-instance v4, Ly0/g;

    invoke-direct {v4, v2}, Ly0/g;-><init>(Lo0/a;)V

    iput-object v4, p0, Lio/flutter/embedding/engine/a;->i:Ly0/g;

    new-instance v5, Ly0/h;

    invoke-direct {v5, v2}, Ly0/h;-><init>(Lo0/a;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->j:Ly0/h;

    new-instance v5, Ly0/i;

    invoke-direct {v5, v2}, Ly0/i;-><init>(Lo0/a;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->k:Ly0/i;

    new-instance v5, Ly0/j;

    invoke-direct {v5, v2}, Ly0/j;-><init>(Lo0/a;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->m:Ly0/j;

    new-instance v5, Ly0/m;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    invoke-direct {v5, v2, v6}, Ly0/m;-><init>(Lo0/a;Landroid/content/pm/PackageManager;)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->n:Ly0/m;

    new-instance v5, Ly0/n;

    invoke-direct {v5, v2, p7}, Ly0/n;-><init>(Lo0/a;Z)V

    iput-object v5, p0, Lio/flutter/embedding/engine/a;->l:Ly0/n;

    new-instance p7, Ly0/o;

    invoke-direct {p7, v2}, Ly0/o;-><init>(Lo0/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->o:Ly0/o;

    new-instance p7, Ly0/p;

    invoke-direct {p7, v2}, Ly0/p;-><init>(Lo0/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->p:Ly0/p;

    new-instance p7, Ly0/q;

    invoke-direct {p7, v2}, Ly0/q;-><init>(Lo0/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->q:Ly0/q;

    new-instance p7, Ly0/r;

    invoke-direct {p7, v2}, Ly0/r;-><init>(Lo0/a;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->r:Ly0/r;

    if-eqz v0, :cond_1

    invoke-interface {v0, v3}, Lp0/a;->d(Ly0/b;)V

    :cond_1
    new-instance p7, La1/b;

    invoke-direct {p7, p1, v4}, La1/b;-><init>(Landroid/content/Context;Ly0/g;)V

    iput-object p7, p0, Lio/flutter/embedding/engine/a;->e:La1/b;

    if-nez p2, :cond_2

    invoke-virtual {v1}, Ln0/a;->c()Lq0/d;

    move-result-object p2

    :cond_2
    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0}, Lq0/d;->k(Landroid/content/Context;)V

    invoke-virtual {p2, p1, p5}, Lq0/d;->f(Landroid/content/Context;[Ljava/lang/String;)V

    :cond_3
    iget-object p5, p0, Lio/flutter/embedding/engine/a;->u:Lio/flutter/embedding/engine/a$b;

    invoke-virtual {p3, p5}, Lio/flutter/embedding/engine/FlutterJNI;->addEngineLifecycleListener(Lio/flutter/embedding/engine/a$b;)V

    invoke-virtual {p3, p4}, Lio/flutter/embedding/engine/FlutterJNI;->setPlatformViewsController(Lio/flutter/plugin/platform/u;)V

    invoke-virtual {p3, p7}, Lio/flutter/embedding/engine/FlutterJNI;->setLocalizationPlugin(La1/b;)V

    invoke-virtual {v1}, Ln0/a;->a()Lp0/a;

    move-result-object p5

    invoke-virtual {p3, p5}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lp0/a;)V

    invoke-virtual {p3}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result p5

    if-nez p5, :cond_4

    invoke-direct {p0}, Lio/flutter/embedding/engine/a;->f()V

    :cond_4
    new-instance p5, Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    invoke-direct {p5, p3}, Lio/flutter/embedding/engine/renderer/FlutterRenderer;-><init>(Lio/flutter/embedding/engine/FlutterJNI;)V

    iput-object p5, p0, Lio/flutter/embedding/engine/a;->b:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    iput-object p4, p0, Lio/flutter/embedding/engine/a;->s:Lio/flutter/plugin/platform/u;

    invoke-virtual {p4}, Lio/flutter/plugin/platform/u;->g0()V

    new-instance p3, Lio/flutter/embedding/engine/c;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p4

    invoke-direct {p3, p4, p0, p2, p8}, Lio/flutter/embedding/engine/c;-><init>(Landroid/content/Context;Lio/flutter/embedding/engine/a;Lq0/d;Lio/flutter/embedding/engine/d;)V

    iput-object p3, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    invoke-virtual {p4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p4

    invoke-virtual {p7, p4}, La1/b;->d(Landroid/content/res/Configuration;)V

    if-eqz p6, :cond_5

    invoke-virtual {p2}, Lq0/d;->e()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {p0}, Lx0/a;->a(Lio/flutter/embedding/engine/a;)V

    :cond_5
    invoke-static {p1, p0}, Lf1/i;->c(Landroid/content/Context;Lf1/i$a;)V

    new-instance p1, Lc1/a;

    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->r()Ly0/m;

    move-result-object p2

    invoke-direct {p1, p2}, Lc1/a;-><init>(Ly0/m;)V

    invoke-virtual {p3, p1}, Lio/flutter/embedding/engine/c;->i(Ls0/a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;ZZ)V
    .locals 8

    new-instance v4, Lio/flutter/plugin/platform/u;

    invoke-direct {v4}, Lio/flutter/plugin/platform/u;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Lq0/d;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/u;[Ljava/lang/String;ZZ)V

    return-void
.end method

.method static synthetic b(Lio/flutter/embedding/engine/a;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/a;->t:Ljava/util/Set;

    return-object p0
.end method

.method static synthetic c(Lio/flutter/embedding/engine/a;)Lio/flutter/plugin/platform/u;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/a;->s:Lio/flutter/plugin/platform/u;

    return-object p0
.end method

.method static synthetic d(Lio/flutter/embedding/engine/a;)Ly0/n;
    .locals 0

    iget-object p0, p0, Lio/flutter/embedding/engine/a;->l:Ly0/n;

    return-object p0
.end method

.method private f()V
    .locals 2

    const-string v0, "FlutterEngine"

    const-string v1, "Attaching to JNI."

    invoke-static {v0, v1}, Ln0/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->attachToNative()V

    invoke-direct {p0}, Lio/flutter/embedding/engine/a;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "FlutterEngine failed to attach to its native Object reference."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private y()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->isAttached()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(FFF)V
    .locals 2

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2, p3}, Lio/flutter/embedding/engine/FlutterJNI;->updateDisplayMetrics(IFFF)V

    return-void
.end method

.method public e(Lio/flutter/embedding/engine/a$b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->t:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g()V
    .locals 2

    const-string v0, "FlutterEngine"

    const-string v1, "Destroying."

    invoke-static {v0, v1}, Ln0/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->t:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/embedding/engine/a$b;

    invoke-interface {v1}, Lio/flutter/embedding/engine/a$b;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/c;->l()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->s:Lio/flutter/plugin/platform/u;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/u;->i0()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->c:Lo0/a;

    invoke-virtual {v0}, Lo0/a;->n()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    iget-object v1, p0, Lio/flutter/embedding/engine/a;->u:Lio/flutter/embedding/engine/a$b;

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->removeEngineLifecycleListener(Lio/flutter/embedding/engine/a$b;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setDeferredComponentManager(Lp0/a;)V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->detachFromNativeAndReleaseResources()V

    invoke-static {}, Ln0/a;->e()Ln0/a;

    move-result-object v0

    invoke-virtual {v0}, Ln0/a;->a()Lp0/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Ln0/a;->e()Ln0/a;

    move-result-object v0

    invoke-virtual {v0}, Ln0/a;->a()Lp0/a;

    move-result-object v0

    invoke-interface {v0}, Lp0/a;->destroy()V

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->g:Ly0/b;

    invoke-virtual {v0, v1}, Ly0/b;->c(Lp0/a;)V

    :cond_1
    return-void
.end method

.method public h()Ly0/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->f:Ly0/a;

    return-object v0
.end method

.method public i()Lt0/b;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    return-object v0
.end method

.method public j()Lo0/a;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->c:Lo0/a;

    return-object v0
.end method

.method public k()Ly0/f;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->h:Ly0/f;

    return-object v0
.end method

.method public l()La1/b;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->e:La1/b;

    return-object v0
.end method

.method public m()Ly0/h;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->j:Ly0/h;

    return-object v0
.end method

.method public n()Ly0/i;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->k:Ly0/i;

    return-object v0
.end method

.method public o()Ly0/j;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->m:Ly0/j;

    return-object v0
.end method

.method public p()Lio/flutter/plugin/platform/u;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->s:Lio/flutter/plugin/platform/u;

    return-object v0
.end method

.method public q()Ls0/b;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->d:Lio/flutter/embedding/engine/c;

    return-object v0
.end method

.method public r()Ly0/m;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->n:Ly0/m;

    return-object v0
.end method

.method public s()Lio/flutter/embedding/engine/renderer/FlutterRenderer;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->b:Lio/flutter/embedding/engine/renderer/FlutterRenderer;

    return-object v0
.end method

.method public t()Ly0/n;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->l:Ly0/n;

    return-object v0
.end method

.method public u()Ly0/o;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->o:Ly0/o;

    return-object v0
.end method

.method public v()Ly0/p;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->p:Ly0/p;

    return-object v0
.end method

.method public w()Ly0/q;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->q:Ly0/q;

    return-object v0
.end method

.method public x()Ly0/r;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/a;->r:Ly0/r;

    return-object v0
.end method

.method z(Landroid/content/Context;Lo0/a$b;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugin/platform/u;ZZ)Lio/flutter/embedding/engine/a;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lo0/a$b;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/flutter/plugin/platform/u;",
            "ZZ)",
            "Lio/flutter/embedding/engine/a;"
        }
    .end annotation

    move-object v0, p2

    invoke-direct {p0}, Lio/flutter/embedding/engine/a;->y()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, p0

    iget-object v2, v1, Lio/flutter/embedding/engine/a;->a:Lio/flutter/embedding/engine/FlutterJNI;

    iget-object v3, v0, Lo0/a$b;->c:Ljava/lang/String;

    iget-object v0, v0, Lo0/a$b;->b:Ljava/lang/String;

    move-object v4, p3

    move-object/from16 v5, p4

    invoke-virtual {v2, v3, v0, p3, v5}, Lio/flutter/embedding/engine/FlutterJNI;->spawn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v7

    new-instance v0, Lio/flutter/embedding/engine/a;

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p1

    move-object/from16 v8, p5

    move/from16 v10, p6

    move/from16 v11, p7

    invoke-direct/range {v4 .. v11}, Lio/flutter/embedding/engine/a;-><init>(Landroid/content/Context;Lq0/d;Lio/flutter/embedding/engine/FlutterJNI;Lio/flutter/plugin/platform/u;[Ljava/lang/String;ZZ)V

    return-object v0

    :cond_0
    move-object v1, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Spawn can only be called on a fully constructed FlutterEngine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
