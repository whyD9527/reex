.class public final Le2/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;
.implements Lt0/a;


# instance fields
.field public a:Landroid/content/Context;

.field private b:Lz0/k;

.field private c:Lt0/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Le2/j0;)Lt0/c;
    .locals 0

    iget-object p0, p0, Le2/j0;->c:Lt0/c;

    return-object p0
.end method


# virtual methods
.method public final b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Le2/j0;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "context"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c(Landroid/content/Context;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/j0;->a:Landroid/content/Context;

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public h(Ls0/a$b;)V
    .locals 2

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ls0/a$b;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "binding.applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Le2/j0;->c(Landroid/content/Context;)V

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object p1

    const-string v1, "xyz.re.player.ex/PermissionChannel"

    invoke-direct {v0, p1, v1}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;)V

    iput-object v0, p0, Le2/j0;->b:Lz0/k;

    invoke-virtual {v0, p0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public i(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/j0;->c:Lt0/c;

    return-void
.end method

.method public j(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/j0;->c:Lt0/c;

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/j0;->b:Lz0/k;

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
    .locals 12

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lz0/j;->a:Ljava/lang/String;

    if-eqz p1, :cond_19

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1e

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    const-string v3, "android.permission.READ_MEDIA_VIDEO"

    const-string v4, "android.permission.READ_MEDIA_AUDIO"

    const/16 v5, 0x1d

    const/16 v6, 0x21

    const/4 v7, 0x1

    const/4 v8, 0x0

    const-string v9, "android.permission.READ_EXTERNAL_STORAGE"

    const-string v10, "activityBinding"

    const/4 v11, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_8

    :sswitch_0
    const-string v0, "checkMediaPermission"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_8

    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v6, :cond_1

    invoke-virtual {p0}, Le2/j0;->b()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v4}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_10

    invoke-virtual {p0}, Le2/j0;->b()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v3}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_4

    :cond_1
    if-le p1, v5, :cond_2

    invoke-virtual {p0}, Le2/j0;->b()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v9}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_4

    :cond_2
    invoke-virtual {p0}, Le2/j0;->b()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v9}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_10

    invoke-virtual {p0}, Le2/j0;->b()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v2}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_4

    :sswitch_1
    const-string v0, "requestMediaPermission"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_8

    :cond_3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v6, :cond_4

    filled-new-array {v4, v3}, [Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_4
    if-le p1, v5, :cond_5

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_5
    filled-new-array {v9, v2}, [Ljava/lang/String;

    move-result-object p1

    :goto_0
    new-instance v0, Le2/j0$a;

    invoke-direct {v0, p2, p0}, Le2/j0$a;-><init>(Lz0/k$d;Le2/j0;)V

    iget-object v1, p0, Le2/j0;->c:Lt0/c;

    if-nez v1, :cond_6

    invoke-static {v10}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v1, v11

    :cond_6
    invoke-interface {v1, v0}, Lt0/c;->f(Lz0/o;)V

    :try_start_0
    iget-object v1, p0, Le2/j0;->c:Lt0/c;

    if-nez v1, :cond_7

    invoke-static {v10}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v1, v11

    :cond_7
    invoke-interface {v1}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object v1

    const/16 v2, 0x54f

    invoke-virtual {v1, p1, v2}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_9

    :catch_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Le2/j0;->c:Lt0/c;

    if-nez p1, :cond_8

    invoke-static {v10}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    move-object v11, p1

    :goto_1
    invoke-interface {v11, v0}, Lt0/c;->c(Lz0/o;)V

    goto/16 :goto_9

    :sswitch_2
    const-string v0, "requestManualExternalStorage"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_8

    :cond_9
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v1, :cond_d

    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v0, Le2/j0$b;

    invoke-direct {v0, p2, p0}, Le2/j0$b;-><init>(Lz0/k$d;Le2/j0;)V

    iget-object v1, p0, Le2/j0;->c:Lt0/c;

    if-nez v1, :cond_a

    invoke-static {v10}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v1, v11

    :cond_a
    invoke-interface {v1, v0}, Lt0/c;->e(Lz0/m;)V

    :try_start_1
    iget-object v1, p0, Le2/j0;->c:Lt0/c;

    if-nez v1, :cond_b

    invoke-static {v10}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v1, v11

    :cond_b
    invoke-interface {v1}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object v1

    const/16 v2, 0x550

    invoke-virtual {v1, p1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_9

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1, v11, v11}, Lz0/k$d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Le2/j0;->c:Lt0/c;

    if-nez p1, :cond_c

    invoke-static {v10}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_2

    :cond_c
    move-object v11, p1

    :goto_2
    invoke-interface {v11, v0}, Lt0/c;->a(Lz0/m;)V

    goto/16 :goto_9

    :cond_d
    invoke-interface {p2, v11}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_9

    :sswitch_3
    const-string v0, "checkManualExternalStorage"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto/16 :goto_8

    :cond_e
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v1, :cond_f

    invoke-static {}, Le2/a;->a()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_3
    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_f
    invoke-virtual {p0}, Le2/j0;->b()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v9}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_10

    goto :goto_4

    :cond_10
    move v7, v8

    :goto_4
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_3

    :sswitch_4
    const-string v0, "shouldShowRequestMediaPermissionRationale"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto/16 :goto_8

    :cond_11
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v6, :cond_14

    iget-object p1, p0, Le2/j0;->c:Lt0/c;

    if-nez p1, :cond_12

    invoke-static {v10}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v11

    :cond_12
    invoke-interface {p1}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_10

    iget-object p1, p0, Le2/j0;->c:Lt0/c;

    if-nez p1, :cond_13

    invoke-static {v10}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_5

    :cond_13
    move-object v11, p1

    :goto_5
    invoke-interface {v11}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_10

    goto :goto_4

    :cond_14
    if-le p1, v5, :cond_16

    iget-object p1, p0, Le2/j0;->c:Lt0/c;

    if-nez p1, :cond_15

    invoke-static {v10}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_6

    :cond_15
    move-object v11, p1

    :goto_6
    invoke-interface {v11}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1, v9}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v7

    goto :goto_4

    :cond_16
    iget-object p1, p0, Le2/j0;->c:Lt0/c;

    if-nez p1, :cond_17

    invoke-static {v10}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v11

    :cond_17
    invoke-interface {p1}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1, v9}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_10

    iget-object p1, p0, Le2/j0;->c:Lt0/c;

    if-nez p1, :cond_18

    invoke-static {v10}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_7

    :cond_18
    move-object v11, p1

    :goto_7
    invoke-interface {v11}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_10

    goto :goto_4

    :cond_19
    :goto_8
    invoke-interface {p2}, Lz0/k$d;->b()V

    :goto_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6c15865d -> :sswitch_4
        -0x51bc689e -> :sswitch_3
        -0x4987ebc5 -> :sswitch_2
        0x5653fa44 -> :sswitch_1
        0x612ea6ab -> :sswitch_0
    .end sparse-switch
.end method

.method public n()V
    .locals 0

    return-void
.end method
