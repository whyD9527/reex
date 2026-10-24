.class public final Ll0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;
.implements Lt0/a;


# instance fields
.field private a:Lz0/k;

.field private b:Lt0/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Ll0/a;)Lt0/c;
    .locals 0

    iget-object p0, p0, Ll0/a;->b:Lt0/c;

    return-object p0
.end method


# virtual methods
.method public e()V
    .locals 0

    return-void
.end method

.method public h(Ls0/a$b;)V
    .locals 2

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object p1

    const-string v1, "storage_access"

    invoke-direct {v0, p1, v1}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;)V

    iput-object v0, p0, Ll0/a;->a:Lz0/k;

    invoke-virtual {v0, p0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public i(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll0/a;->b:Lt0/c;

    return-void
.end method

.method public j(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll0/a;->b:Lt0/c;

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ll0/a;->a:Lz0/k;

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

    const-string v1, "openFileSelector"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "android.intent.category.OPENABLE"

    const-string v3, "activityBinding"

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    const-string v0, "mimeTypes"

    invoke-virtual {p1, v0}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const-string v1, "allowMultiple"

    invoke-virtual {p1, v1}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    new-instance v1, Landroid/content/Intent;

    const-string v5, "android.intent.action.OPEN_DOCUMENT"

    invoke-direct {v1, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v5, "*/*"

    invoke-virtual {v1, v5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.extra.ALLOW_MULTIPLE"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Ljava/lang/String;

    const-string v0, "android.intent.extra.MIME_TYPES"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    new-instance p1, Ll0/a$a;

    invoke-direct {p1, p2, p0}, Ll0/a$a;-><init>(Lz0/k$d;Ll0/a;)V

    iget-object v0, p0, Ll0/a;->b:Lt0/c;

    if-nez v0, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v0, v4

    :cond_1
    invoke-interface {v0, p1}, Lt0/c;->e(Lz0/m;)V

    :try_start_0
    iget-object v0, p0, Ll0/a;->b:Lt0/c;

    if-nez v0, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v0, v4

    :cond_2
    invoke-interface {v0}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object v0

    const v2, 0x185e3

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0, v4, v4}, Lz0/k$d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p2, p0, Ll0/a;->b:Lt0/c;

    if-nez p2, :cond_6

    goto :goto_0

    :cond_3
    const-string v1, "openFileCreator"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "mimeType"

    invoke-virtual {p1, v0}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "title"

    invoke-virtual {p1, v1}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v1, Landroid/content/Intent;

    const-string v5, "android.intent.action.CREATE_DOCUMENT"

    invoke-direct {v1, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.extra.TITLE"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    new-instance p1, Ll0/a$b;

    invoke-direct {p1, p2, p0}, Ll0/a$b;-><init>(Lz0/k$d;Ll0/a;)V

    iget-object v0, p0, Ll0/a;->b:Lt0/c;

    if-nez v0, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v0, v4

    :cond_4
    invoke-interface {v0, p1}, Lt0/c;->e(Lz0/m;)V

    :try_start_1
    iget-object v0, p0, Ll0/a;->b:Lt0/c;

    if-nez v0, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v0, v4

    :cond_5
    invoke-interface {v0}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object v0

    const v2, 0x185e4

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0, v4, v4}, Lz0/k$d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p2, p0, Ll0/a;->b:Lt0/c;

    if-nez p2, :cond_6

    :goto_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    move-object v4, p2

    :goto_1
    invoke-interface {v4, p1}, Lt0/c;->a(Lz0/m;)V

    goto :goto_2

    :cond_7
    invoke-interface {p2}, Lz0/k$d;->b()V

    :goto_2
    return-void
.end method

.method public n()V
    .locals 0

    return-void
.end method
