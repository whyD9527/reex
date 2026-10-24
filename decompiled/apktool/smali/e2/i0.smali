.class public final Le2/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;
.implements Lt0/a;
.implements Lz0/n;


# instance fields
.field private a:Lz0/k;

.field private b:Lt0/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Intent;)Z
    .locals 2

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.VIEW"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Le2/i0;->a:Lz0/k;

    if-nez v0, :cond_1

    const-string v0, "channel"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    invoke-static {p1}, Le2/t0;->a(Landroid/content/Intent;)Ljava/util/HashMap;

    move-result-object p1

    const-string v1, "onNewPlaylistItem"

    invoke-virtual {v0, v1, p1}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public h(Ls0/a$b;)V
    .locals 2

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object p1

    const-string v1, "xyz.re.player.ex/NewPlaylistItemChannel"

    invoke-direct {v0, p1, v1}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;)V

    iput-object v0, p0, Le2/i0;->a:Lz0/k;

    invoke-virtual {v0, p0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public i(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Le2/i0;->j(Lt0/c;)V

    return-void
.end method

.method public j(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/i0;->b:Lt0/c;

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/i0;->a:Lz0/k;

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
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lz0/j;->a:Ljava/lang/String;

    const-string p2, "start"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    const-string v1, "binding"

    if-eqz p2, :cond_1

    iget-object p1, p0, Le2/i0;->b:Lt0/c;

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-interface {v0, p0}, Lt0/c;->g(Lz0/n;)V

    goto :goto_2

    :cond_1
    const-string p2, "stop"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Le2/i0;->b:Lt0/c;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v0, p1

    :goto_1
    invoke-interface {v0, p0}, Lt0/c;->b(Lz0/n;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public n()V
    .locals 0

    invoke-virtual {p0}, Le2/i0;->e()V

    return-void
.end method
