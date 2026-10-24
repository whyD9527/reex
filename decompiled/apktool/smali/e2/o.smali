.class public final Le2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le2/o$a;
    }
.end annotation


# static fields
.field public static final d:Le2/o$a;


# instance fields
.field private a:Lz0/k;

.field private b:Landroid/content/Context;

.field private c:Le2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le2/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le2/o$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Le2/o;->d:Le2/o$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Le2/o;)Lz0/k;
    .locals 0

    iget-object p0, p0, Le2/o;->a:Lz0/k;

    return-object p0
.end method


# virtual methods
.method public h(Ls0/a$b;)V
    .locals 5

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object v1

    sget-object v2, Lz0/r;->b:Lz0/r;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object v3

    invoke-interface {v3}, Lz0/c;->b()Lz0/c$c;

    move-result-object v3

    const-string v4, "xyz.re.player.ex/BackgroundServiceChannel"

    invoke-direct {v0, v1, v4, v2, v3}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;Lz0/l;Lz0/c$c;)V

    iput-object v0, p0, Le2/o;->a:Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->a()Landroid/content/Context;

    move-result-object p1

    const-string v0, "binding.applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/o;->b:Landroid/content/Context;

    iget-object p1, p0, Le2/o;->a:Lz0/k;

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

    iget-object p1, p0, Le2/o;->a:Lz0/k;

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
    .locals 3

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lz0/j;->a:Ljava/lang/String;

    const-string v1, "create"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object p1, p0, Le2/o;->c:Le2/n;

    if-nez p1, :cond_1

    new-instance p1, Le2/n;

    iget-object v0, p0, Le2/o;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    const-string v0, "context"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    new-instance v0, Le2/o$b;

    invoke-direct {v0, p0}, Le2/o$b;-><init>(Le2/o;)V

    invoke-direct {p1, v2, v0}, Le2/n;-><init>(Landroid/content/Context;Lq1/p;)V

    iput-object p1, p0, Le2/o;->c:Le2/n;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    const-string v1, "dispose"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p0, Le2/o;->c:Le2/n;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Le2/n;->b()V

    :cond_3
    iput-object v2, p0, Le2/o;->c:Le2/n;

    invoke-interface {p2, v2}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Le2/o;->c:Le2/n;

    if-nez v0, :cond_5

    invoke-interface {p2}, Lz0/k$d;->b()V

    goto :goto_2

    :cond_5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Le2/n;->g(Lz0/j;Lz0/k$d;)V

    :goto_2
    return-void
.end method
