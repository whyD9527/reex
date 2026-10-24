.class public final Lxyz/re/player/ex/ReexPlaybackService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxyz/re/player/ex/ReexPlaybackService$a;
    }
.end annotation


# static fields
.field public static final e:Lxyz/re/player/ex/ReexPlaybackService$a;

.field private static f:Landroid/app/Notification;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxyz/re/player/ex/ReexPlaybackService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxyz/re/player/ex/ReexPlaybackService$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lxyz/re/player/ex/ReexPlaybackService;->e:Lxyz/re/player/ex/ReexPlaybackService$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method public static final synthetic a(Landroid/app/Notification;)V
    .locals 0

    sput-object p0, Lxyz/re/player/ex/ReexPlaybackService;->f:Landroid/app/Notification;

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    sget-object v0, Lxyz/re/player/ex/ReexPlaybackService;->f:Landroid/app/Notification;

    if-eqz v0, :cond_0

    const v1, 0x2c37c723

    invoke-virtual {p0, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    const/4 v0, 0x0

    sput-object v0, Lxyz/re/player/ex/ReexPlaybackService;->f:Landroid/app/Notification;

    :cond_0
    const-string v0, "ReexPlaybackService"

    const-string v1, "ReexPlaybackService create"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(I)V

    const-string v0, "ReexPlaybackService"

    const-string v1, "ReexPlaybackService destroy"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    const/4 p1, 0x2

    return p1
.end method
