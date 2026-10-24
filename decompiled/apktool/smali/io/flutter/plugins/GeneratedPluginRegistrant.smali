.class public final Lio/flutter/plugins/GeneratedPluginRegistrant;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "GeneratedPluginRegistrant"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static registerWith(Lio/flutter/embedding/engine/a;)V
    .locals 3

    const-string v0, "GeneratedPluginRegistrant"

    :try_start_0
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object v1

    new-instance v2, Lj0/a;

    invoke-direct {v2}, Lj0/a;-><init>()V

    invoke-interface {v1, v2}, Ls0/b;->i(Ls0/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin"

    invoke-static {v0, v2, v1}, Ln0/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object v1

    new-instance v2, Lg0/b;

    invoke-direct {v2}, Lg0/b;-><init>()V

    invoke-interface {v1, v2}, Ls0/b;->i(Ls0/a;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    const-string v2, "Error registering plugin flutter_displaymode, com.ajinasokan.flutterdisplaymode.DisplayModePlugin"

    invoke-static {v0, v2, v1}, Ln0/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    :try_start_2
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object v1

    new-instance v2, Ld2/b;

    invoke-direct {v2}, Ld2/b;-><init>()V

    invoke-interface {v1, v2}, Ls0/b;->i(Ls0/a;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    const-string v2, "Error registering plugin mpv_client, xyz.lhtls.mpv_client.MpvClientPlugin"

    invoke-static {v0, v2, v1}, Ln0/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    :try_start_3
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object v1

    new-instance v2, Li0/d;

    invoke-direct {v2}, Li0/d;-><init>()V

    invoke-interface {v1, v2}, Ls0/b;->i(Ls0/a;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v1

    const-string v2, "Error registering plugin nsd_android, com.haberey.flutter.nsd_android.NsdAndroidPlugin"

    invoke-static {v0, v2, v1}, Ln0/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    :try_start_4
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object v1

    new-instance v2, Lk0/c;

    invoke-direct {v2}, Lk0/c;-><init>()V

    invoke-interface {v1, v2}, Ls0/b;->i(Ls0/a;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception v1

    const-string v2, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin"

    invoke-static {v0, v2, v1}, Ln0/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_4
    :try_start_5
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object v1

    new-instance v2, Ld1/j;

    invoke-direct {v2}, Ld1/j;-><init>()V

    invoke-interface {v1, v2}, Ls0/b;->i(Ls0/a;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_5

    :catch_5
    move-exception v1

    const-string v2, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin"

    invoke-static {v0, v2, v1}, Ln0/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    :try_start_6
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object v1

    new-instance v2, Lm0/a;

    invoke-direct {v2}, Lm0/a;-><init>()V

    invoke-interface {v1, v2}, Ls0/b;->i(Ls0/a;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_6

    :catch_6
    move-exception v1

    const-string v2, "Error registering plugin sqlite3_flutter_libs, eu.simonbinder.sqlite3_flutter_libs.Sqlite3FlutterLibsPlugin"

    invoke-static {v0, v2, v1}, Ln0/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_6
    :try_start_7
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object v1

    new-instance v2, Ll0/a;

    invoke-direct {v2}, Ll0/a;-><init>()V

    invoke-interface {v1, v2}, Ls0/b;->i(Ls0/a;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_7

    :catch_7
    move-exception v1

    const-string v2, "Error registering plugin storage_access, dev.lntls.storage_access.StorageAccessPlugin"

    invoke-static {v0, v2, v1}, Ln0/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_7
    :try_start_8
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object v1

    new-instance v2, Le1/j;

    invoke-direct {v2}, Le1/j;-><init>()V

    invoke-interface {v1, v2}, Ls0/b;->i(Ls0/a;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_8

    :catch_8
    move-exception v1

    const-string v2, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin"

    invoke-static {v0, v2, v1}, Ln0/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_8
    :try_start_9
    invoke-virtual {p0}, Lio/flutter/embedding/engine/a;->q()Ls0/b;

    move-result-object p0

    new-instance v1, Lh0/e;

    invoke-direct {v1}, Lh0/e;-><init>()V

    invoke-interface {p0, v1}, Ls0/b;->i(Ls0/a;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_9

    :catch_9
    move-exception p0

    const-string v1, "Error registering plugin vibration, com.benjaminabel.vibration.VibrationPlugin"

    invoke-static {v0, v1, p0}, Ln0/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_9
    return-void
.end method
