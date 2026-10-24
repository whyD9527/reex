.class public final Le2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;
.implements Lt0/a;


# instance fields
.field private a:Lz0/k;

.field private b:Ls0/a$b;

.field private c:Lt0/c;

.field private d:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Landroid/content/Context;
    .locals 2

    iget-object v0, p0, Le2/e;->b:Ls0/a$b;

    if-nez v0, :cond_0

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Ls0/a$b;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "binding.applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public e()V
    .locals 0

    return-void
.end method

.method public h(Ls0/a$b;)V
    .locals 3

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object v1

    const-string v2, "xyz.re.player.ex/AndroidChannel"

    invoke-direct {v0, v1, v2}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;)V

    iput-object v0, p0, Le2/e;->a:Lz0/k;

    invoke-virtual {v0, p0}, Lz0/k;->e(Lz0/k$c;)V

    iput-object p1, p0, Le2/e;->b:Ls0/a$b;

    return-void
.end method

.method public i(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Le2/e;->j(Lt0/c;)V

    return-void
.end method

.method public j(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/e;->c:Lt0/c;

    invoke-interface {p1}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object p1

    const-string v0, "binding.activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/e;->d:Landroid/app/Activity;

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/e;->a:Lz0/k;

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
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "call"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "result"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lz0/j;->a:Ljava/lang/String;

    if-eqz v3, :cond_35

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v5, 0x0

    const/16 v6, 0x1e

    const-string v7, "activity"

    const/4 v8, 0x0

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_13

    :sswitch_0
    const-string v1, "getRequestedOrientation"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_13

    :cond_0
    iget-object v1, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v1, :cond_1

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v8, v1

    :goto_0
    invoke-virtual {v8}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result v1

    goto/16 :goto_3

    :sswitch_1
    const-string v1, "StartedIntentChannel.dataString"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_13

    :cond_2
    iget-object v1, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v1, :cond_3

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v8, v1

    :goto_1
    invoke-virtual {v8}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_c

    :sswitch_2
    const-string v1, "picturesDirPath"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_13

    :cond_4
    sget-object v1, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    invoke-static {v1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_c

    :sswitch_3
    const-string v1, "Environment.getExternalStorageDirectory"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_13

    :cond_5
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_6
    move-object v1, v8

    :goto_2
    invoke-interface {v2, v1}, Lz0/k$d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_14

    :sswitch_4
    const-string v1, "Environment.isExternalStorageManager"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_13

    :cond_7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v6, :cond_8

    invoke-static {}, Le2/a;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto/16 :goto_c

    :cond_8
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_c

    :sswitch_5
    const-string v1, "isTelevision"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_13

    :cond_9
    invoke-direct/range {p0 .. p0}, Le2/e;->a()Landroid/content/Context;

    move-result-object v1

    const-string v3, "uimode"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type android.app.UiModeManager"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/app/UiModeManager;

    invoke-virtual {v1}, Landroid/app/UiModeManager;->getCurrentModeType()I

    move-result v1

    const/4 v3, 0x4

    if-ne v1, v3, :cond_a

    const/4 v5, 0x1

    :cond_a
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto/16 :goto_c

    :sswitch_6
    const-string v4, "keepScreenOn"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_13

    :cond_b
    const-string v3, "keepOn"

    invoke-virtual {v1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/16 v3, 0x80

    if-eqz v1, :cond_d

    iget-object v1, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v1, :cond_c

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v1, v8

    :cond_c
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/view/Window;->addFlags(I)V

    goto/16 :goto_12

    :cond_d
    iget-object v1, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v1, :cond_e

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v1, v8

    :cond_e
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/view/Window;->clearFlags(I)V

    goto/16 :goto_12

    :sswitch_7
    const-string v1, "getDeviceApiLevel"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_13

    :cond_f
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_c

    :sswitch_8
    const-string v1, "getScreenBrightness"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_13

    :cond_10
    iget-object v1, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v1, :cond_11

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_4

    :cond_11
    move-object v8, v1

    :goto_4
    invoke-virtual {v8}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    const/4 v3, 0x0

    cmpg-float v3, v1, v3

    if-gez v3, :cond_12

    invoke-direct/range {p0 .. p0}, Le2/e;->a()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    :try_start_1
    const-string v4, "screen_brightness"

    invoke-static {v3, v4}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v1
    :try_end_1
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    int-to-float v1, v1

    const/high16 v3, 0x437f0000    # 255.0f

    div-float/2addr v1, v3

    :catch_0
    sget-object v3, Lg1/q;->a:Lg1/q;

    :cond_12
    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto/16 :goto_c

    :sswitch_9
    const-string v1, "StartedIntentChannel.type"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_13

    :cond_13
    iget-object v1, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v1, :cond_14

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_5

    :cond_14
    move-object v8, v1

    :goto_5
    invoke-virtual {v8}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_c

    :sswitch_a
    const-string v4, "StartedIntentChannel.getStringExtra"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    goto/16 :goto_13

    :cond_15
    invoke-virtual/range {p1 .. p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v3, :cond_16

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_6

    :cond_16
    move-object v8, v3

    :goto_6
    invoke-virtual {v8}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_c

    :sswitch_b
    const-string v4, "setRequestedOrientation"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    goto/16 :goto_13

    :cond_17
    invoke-virtual/range {p1 .. p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v3, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v3, :cond_18

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v3, v8

    :cond_18
    invoke-virtual {v3, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto/16 :goto_12

    :sswitch_c
    const-string v1, "showOverlayPermissionSettingScreen"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    goto/16 :goto_13

    :cond_19
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v3, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "package:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct/range {p0 .. p0}, Le2/e;->a()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    sget-object v3, Lg1/q;->a:Lg1/q;

    iget-object v3, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v3, :cond_31

    goto/16 :goto_10

    :sswitch_d
    const-string v1, "getStorageVolumes"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto/16 :goto_13

    :cond_1a
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v4, "mounted"

    const-string v7, "null cannot be cast to non-null type android.os.storage.StorageManager"

    const-string v9, "storage"

    if-lt v3, v6, :cond_1e

    invoke-direct/range {p0 .. p0}, Le2/e;->a()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/os/storage/StorageManager;

    invoke-static {v3}, Le2/b;->a(Landroid/os/storage/StorageManager;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1b
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/storage/StorageVolume;

    invoke-virtual {v5}, Landroid/os/storage/StorageVolume;->getState()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-static {v5}, Le2/c;->a(Landroid/os/storage/StorageVolume;)Ljava/io/File;

    move-result-object v6

    if-nez v6, :cond_1c

    goto :goto_7

    :cond_1c
    invoke-static {v5}, Le2/c;->a(Landroid/os/storage/StorageVolume;)Ljava/io/File;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v7

    const-string v6, "volume.directory!!.path"

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Le2/e;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/storage/StorageVolume;->getDescription(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    const-string v6, "volume.getDescription(applicationContext)"

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/os/storage/StorageVolume;->isEmulated()Z

    move-result v9

    invoke-virtual {v5}, Landroid/os/storage/StorageVolume;->isPrimary()Z

    move-result v10

    invoke-virtual {v5}, Landroid/os/storage/StorageVolume;->isRemovable()Z

    move-result v11

    invoke-virtual {v5}, Landroid/os/storage/StorageVolume;->getState()Ljava/lang/String;

    move-result-object v12

    const-string v5, "volume.state"

    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v7 .. v12}, Le2/f;->a(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)Ljava/util/HashMap;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_1d
    invoke-interface {v2, v1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_1e
    const/16 v6, 0x17

    const-string v10, "root.path"

    if-gt v3, v6, :cond_1f

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const-string v5, "External"

    const-string v9, "mounted"

    invoke-static/range {v4 .. v9}, Le2/f;->a(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)Ljava/util/HashMap;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-interface {v2, v1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_1f
    invoke-direct/range {p0 .. p0}, Le2/e;->a()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/os/storage/StorageManager;

    invoke-direct/range {p0 .. p0}, Le2/e;->a()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getExternalMediaDirs()[Ljava/io/File;

    move-result-object v6

    const-string v7, "applicationContext.externalMediaDirs"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v7, v6

    :goto_8
    if-ge v5, v7, :cond_27

    aget-object v9, v6, v5

    invoke-static {v3, v9}, Le2/d;->a(Landroid/os/storage/StorageManager;Ljava/io/File;)Landroid/os/storage/StorageVolume;

    move-result-object v11

    if-nez v11, :cond_20

    goto :goto_b

    :cond_20
    invoke-virtual {v11}, Landroid/os/storage/StorageVolume;->getState()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_21

    goto :goto_b

    :cond_21
    :goto_9
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v12

    if-eqz v12, :cond_22

    invoke-static {v3, v12}, Le2/d;->a(Landroid/os/storage/StorageManager;Ljava/io/File;)Landroid/os/storage/StorageVolume;

    move-result-object v12

    goto :goto_a

    :cond_22
    move-object v12, v8

    :goto_a
    invoke-static {v12, v11}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_23

    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v9

    goto :goto_9

    :cond_23
    invoke-virtual {v9}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Le2/e;->a()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v11, v9}, Landroid/os/storage/StorageVolume;->getDescription(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    const-string v9, "storageVolume.getDescription(applicationContext)"

    invoke-static {v13, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11}, Landroid/os/storage/StorageVolume;->isEmulated()Z

    move-result v14

    invoke-virtual {v11}, Landroid/os/storage/StorageVolume;->isPrimary()Z

    move-result v15

    invoke-virtual {v11}, Landroid/os/storage/StorageVolume;->isRemovable()Z

    move-result v16

    invoke-virtual {v11}, Landroid/os/storage/StorageVolume;->getState()Ljava/lang/String;

    move-result-object v9

    const-string v11, "storageVolume.state"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v9

    invoke-static/range {v12 .. v17}, Le2/f;->a(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;)Ljava/util/HashMap;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :goto_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :sswitch_e
    const-string v4, "setDisplayCutoutMode"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_24

    goto/16 :goto_13

    :cond_24
    invoke-virtual/range {p1 .. p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-lt v3, v4, :cond_34

    iget-object v3, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v3, :cond_25

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v3, v8

    :cond_25
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    iput v1, v3, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    goto/16 :goto_12

    :sswitch_f
    const-string v1, "canTouchScreen"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    goto/16 :goto_13

    :cond_26
    invoke-direct/range {p0 .. p0}, Le2/e;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v3, "android.hardware.touchscreen"

    invoke-virtual {v1, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_27
    :goto_c
    invoke-interface {v2, v1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_14

    :sswitch_10
    const-string v1, "StartedIntentChannel.scheme"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    goto/16 :goto_13

    :cond_28
    iget-object v1, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v1, :cond_29

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_d

    :cond_29
    move-object v8, v1

    :goto_d
    invoke-virtual {v8}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object v1

    goto :goto_c

    :sswitch_11
    const-string v1, "StartedIntentChannel.package"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    goto/16 :goto_13

    :cond_2a
    iget-object v1, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v1, :cond_2b

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_e

    :cond_2b
    move-object v8, v1

    :goto_e
    invoke-virtual {v8}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    move-result-object v1

    goto :goto_c

    :sswitch_12
    const-string v4, "setScreenBrightness"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2c

    goto/16 :goto_13

    :cond_2c
    const-string v3, "brightness"

    invoke-virtual {v1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    iget-object v3, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v3, :cond_2d

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v3, v8

    :cond_2d
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v4

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    double-to-float v1, v5

    iput v1, v4, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    sget-object v1, Lg1/q;->a:Lg1/q;

    goto :goto_11

    :sswitch_13
    const-string v1, "StartedIntentChannel.action"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    goto/16 :goto_13

    :cond_2e
    iget-object v1, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v1, :cond_2f

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_f

    :cond_2f
    move-object v8, v1

    :goto_f
    invoke-virtual {v8}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_c

    :sswitch_14
    const-string v1, "pushSystemHomeScreen"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    goto :goto_13

    :cond_30
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v3, "android.intent.action.MAIN"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "android.intent.category.HOME"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    sget-object v3, Lg1/q;->a:Lg1/q;

    iget-object v3, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v3, :cond_31

    :goto_10
    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v3, v8

    :cond_31
    invoke-virtual {v3, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :goto_11
    invoke-interface {v2, v8}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_15

    :sswitch_15
    const-string v1, "restartTextInput"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    goto :goto_13

    :cond_32
    invoke-direct/range {p0 .. p0}, Le2/e;->a()Landroid/content/Context;

    move-result-object v1

    const-string v3, "input_method"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    iget-object v3, v0, Le2/e;->d:Landroid/app/Activity;

    if-nez v3, :cond_33

    invoke-static {v7}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v3, v8

    :cond_33
    sget v4, Lio/flutter/embedding/android/e;->i:I

    invoke-virtual {v3, v4}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    :catch_1
    :cond_34
    :goto_12
    invoke-interface {v2, v8}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_14

    :cond_35
    :goto_13
    invoke-interface/range {p2 .. p2}, Lz0/k$d;->b()V

    :goto_14
    sget-object v1, Lg1/q;->a:Lg1/q;

    :goto_15
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6da9c6b2 -> :sswitch_15
        -0x58fda30c -> :sswitch_14
        -0x55b81ec2 -> :sswitch_13
        -0x5085d1a1 -> :sswitch_12
        -0x4c26cdc2 -> :sswitch_11
        -0x37066753 -> :sswitch_10
        -0x322ff965 -> :sswitch_f
        -0x2f352c51 -> :sswitch_e
        -0x276b916c -> :sswitch_d
        -0x221126c6 -> :sswitch_c
        -0xe405efc -> :sswitch_b
        -0x17337af -> :sswitch_a
        0x29c1442 -> :sswitch_9
        0xb7d9953 -> :sswitch_8
        0x14740af6 -> :sswitch_7
        0x1fb69a10 -> :sswitch_6
        0x32dfb4dc -> :sswitch_5
        0x63bf06c2 -> :sswitch_4
        0x6a0d6c18 -> :sswitch_3
        0x72428d5d -> :sswitch_2
        0x72bcf363 -> :sswitch_1
        0x776c71f8 -> :sswitch_0
    .end sparse-switch
.end method

.method public n()V
    .locals 0

    invoke-virtual {p0}, Le2/e;->e()V

    return-void
.end method
