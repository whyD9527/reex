.class Lq0/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq0/d;->l(Landroid/content/Context;Lq0/d$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lq0/d$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lq0/d;


# direct methods
.method constructor <init>(Lq0/d;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lq0/d$a;->b:Lq0/d;

    iput-object p2, p0, Lq0/d$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lq0/d$a;)V
    .locals 0

    invoke-direct {p0}, Lq0/d$a;->c()V

    return-void
.end method

.method private synthetic c()V
    .locals 1

    iget-object v0, p0, Lq0/d$a;->b:Lq0/d;

    invoke-static {v0}, Lq0/d;->b(Lq0/d;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v0

    invoke-virtual {v0}, Lio/flutter/embedding/engine/FlutterJNI;->prefetchDefaultFontManager()V

    return-void
.end method


# virtual methods
.method public b()Lq0/d$b;
    .locals 6

    const-string v0, "FlutterLoader initTask"

    invoke-static {v0}, Lf1/f;->f(Ljava/lang/String;)Lf1/f;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lq0/d$a;->b:Lq0/d;

    iget-object v2, p0, Lq0/d$a;->a:Landroid/content/Context;

    invoke-static {v1, v2}, Lq0/d;->a(Lq0/d;Landroid/content/Context;)Lq0/e;

    iget-object v1, p0, Lq0/d$a;->b:Lq0/d;

    invoke-static {v1}, Lq0/d;->b(Lq0/d;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterJNI;->loadLibrary()V

    iget-object v1, p0, Lq0/d$a;->b:Lq0/d;

    invoke-static {v1}, Lq0/d;->b(Lq0/d;)Lio/flutter/embedding/engine/FlutterJNI;

    move-result-object v1

    invoke-virtual {v1}, Lio/flutter/embedding/engine/FlutterJNI;->updateRefreshRate()V

    iget-object v1, p0, Lq0/d$a;->b:Lq0/d;

    invoke-static {v1}, Lq0/d;->c(Lq0/d;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lq0/c;

    invoke-direct {v2, p0}, Lq0/c;-><init>(Lq0/d$a;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance v1, Lq0/d$b;

    iget-object v2, p0, Lq0/d$a;->a:Landroid/content/Context;

    invoke-static {v2}, Lf1/c;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lq0/d$a;->a:Landroid/content/Context;

    invoke-static {v3}, Lf1/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lq0/d$a;->a:Landroid/content/Context;

    invoke-static {v4}, Lf1/c;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lq0/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq0/d$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf1/f;->close()V

    :cond_0
    return-object v1

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0}, Lf1/f;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq0/d$a;->b()Lq0/d$b;

    move-result-object v0

    return-object v0
.end method
