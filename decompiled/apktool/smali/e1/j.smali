.class public final Le1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lt0/a;


# instance fields
.field private a:Le1/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    iget-object v0, p0, Le1/j;->a:Le1/i;

    if-nez v0, :cond_0

    const-string v0, "UrlLauncherPlugin"

    const-string v1, "urlLauncher was never set."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le1/i;->l(Landroid/app/Activity;)V

    return-void
.end method

.method public h(Ls0/a$b;)V
    .locals 2

    new-instance v0, Le1/i;

    invoke-virtual {p1}, Ls0/a$b;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Le1/i;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Le1/j;->a:Le1/i;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object p1

    iget-object v0, p0, Le1/j;->a:Le1/i;

    invoke-static {p1, v0}, Le1/g;->g(Lz0/c;Le1/a$c;)V

    return-void
.end method

.method public i(Lt0/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Le1/j;->j(Lt0/c;)V

    return-void
.end method

.method public j(Lt0/c;)V
    .locals 1

    iget-object v0, p0, Le1/j;->a:Le1/i;

    if-nez v0, :cond_0

    const-string p1, "UrlLauncherPlugin"

    const-string v0, "urlLauncher was never set."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-interface {p1}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Le1/i;->l(Landroid/app/Activity;)V

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    iget-object v0, p0, Le1/j;->a:Le1/i;

    if-nez v0, :cond_0

    const-string p1, "UrlLauncherPlugin"

    const-string v0, "Already detached from the engine."

    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Le1/g;->g(Lz0/c;Le1/a$c;)V

    iput-object v0, p0, Le1/j;->a:Le1/i;

    return-void
.end method

.method public n()V
    .locals 0

    invoke-virtual {p0}, Le1/j;->e()V

    return-void
.end method
