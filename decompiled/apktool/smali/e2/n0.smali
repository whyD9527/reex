.class final Le2/n0;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le2/n0$a;
    }
.end annotation


# static fields
.field public static final e:Le2/n0$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/app/Activity;

.field private final c:Lz0/k;

.field private final d:Landroid/app/PictureInPictureParams$Builder;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le2/n0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le2/n0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Le2/n0;->e:Le2/n0$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lz0/k;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p1, p0, Le2/n0;->a:Landroid/content/Context;

    iput-object p2, p0, Le2/n0;->b:Landroid/app/Activity;

    iput-object p3, p0, Le2/n0;->c:Lz0/k;

    new-instance p1, Landroid/app/PictureInPictureParams$Builder;

    invoke-direct {p1}, Landroid/app/PictureInPictureParams$Builder;-><init>()V

    iput-object p1, p0, Le2/n0;->d:Landroid/app/PictureInPictureParams$Builder;

    return-void
.end method

.method private final c()Landroid/app/RemoteAction;
    .locals 5

    iget-object v0, p0, Le2/n0;->a:Landroid/content/Context;

    const v1, 0x7f060061

    invoke-static {v0, v1}, Landroid/graphics/drawable/Icon;->createWithResource(Landroid/content/Context;I)Landroid/graphics/drawable/Icon;

    move-result-object v0

    const-string v1, "createWithResource(conte\u2026R.drawable.forward_round)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-string v2, "xyz.re.player.ex/SystemVideoPipMode/action"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "action"

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v2, p0, Le2/n0;->a:Landroid/content/Context;

    const/high16 v4, 0x4000000

    invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    new-instance v2, Landroid/app/RemoteAction;

    const-string v3, "Forward"

    invoke-direct {v2, v0, v3, v3, v1}, Landroid/app/RemoteAction;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    return-object v2
.end method

.method private final d()Landroid/app/RemoteAction;
    .locals 5

    iget-object v0, p0, Le2/n0;->a:Landroid/content/Context;

    const v1, 0x7f060079

    invoke-static {v0, v1}, Landroid/graphics/drawable/Icon;->createWithResource(Landroid/content/Context;I)Landroid/graphics/drawable/Icon;

    move-result-object v0

    const-string v1, "createWithResource(conte\u2026, R.drawable.pause_round)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-string v2, "xyz.re.player.ex/SystemVideoPipMode/action"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "action"

    const/4 v3, 0x2

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v2, p0, Le2/n0;->a:Landroid/content/Context;

    const/high16 v4, 0x4000000

    invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    new-instance v2, Landroid/app/RemoteAction;

    const-string v3, "Pause"

    invoke-direct {v2, v0, v3, v3, v1}, Landroid/app/RemoteAction;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    return-object v2
.end method

.method private final e()Landroid/app/RemoteAction;
    .locals 5

    iget-object v0, p0, Le2/n0;->a:Landroid/content/Context;

    const v1, 0x7f06007a

    invoke-static {v0, v1}, Landroid/graphics/drawable/Icon;->createWithResource(Landroid/content/Context;I)Landroid/graphics/drawable/Icon;

    move-result-object v0

    const-string v1, "createWithResource(context, R.drawable.play_round)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-string v2, "xyz.re.player.ex/SystemVideoPipMode/action"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "action"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v2, p0, Le2/n0;->a:Landroid/content/Context;

    const/high16 v4, 0x4000000

    invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    new-instance v2, Landroid/app/RemoteAction;

    const-string v3, "Play"

    invoke-direct {v2, v0, v3, v3, v1}, Landroid/app/RemoteAction;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    return-object v2
.end method

.method private final f()Landroid/app/RemoteAction;
    .locals 5

    iget-object v0, p0, Le2/n0;->a:Landroid/content/Context;

    const v1, 0x7f06007d

    invoke-static {v0, v1}, Landroid/graphics/drawable/Icon;->createWithResource(Landroid/content/Context;I)Landroid/graphics/drawable/Icon;

    move-result-object v0

    const-string v1, "createWithResource(conte\u2026 R.drawable.rewind_round)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-string v2, "xyz.re.player.ex/SystemVideoPipMode/action"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "action"

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v2, p0, Le2/n0;->a:Landroid/content/Context;

    const/high16 v4, 0x4000000

    invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    new-instance v2, Landroid/app/RemoteAction;

    const-string v3, "Rewind"

    invoke-direct {v2, v0, v3, v3, v1}, Landroid/app/RemoteAction;-><init>(Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    return-object v2
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Le2/n0;->a:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public final b(ZII)Z
    .locals 5

    iget-object v0, p0, Le2/n0;->b:Landroid/app/Activity;

    invoke-static {v0}, Le2/l0;->a(Landroid/app/Activity;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Le2/n0;->d:Landroid/app/PictureInPictureParams$Builder;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x3

    if-eqz p1, :cond_1

    new-array p1, v4, [Landroid/app/RemoteAction;

    invoke-direct {p0}, Le2/n0;->f()Landroid/app/RemoteAction;

    move-result-object v4

    aput-object v4, p1, v3

    invoke-direct {p0}, Le2/n0;->d()Landroid/app/RemoteAction;

    move-result-object v3

    aput-object v3, p1, v1

    invoke-direct {p0}, Le2/n0;->c()Landroid/app/RemoteAction;

    move-result-object v1

    aput-object v1, p1, v2

    invoke-static {p1}, Lh1/h;->f([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-array p1, v4, [Landroid/app/RemoteAction;

    invoke-direct {p0}, Le2/n0;->f()Landroid/app/RemoteAction;

    move-result-object v4

    aput-object v4, p1, v3

    invoke-direct {p0}, Le2/n0;->e()Landroid/app/RemoteAction;

    move-result-object v3

    aput-object v3, p1, v1

    invoke-direct {p0}, Le2/n0;->c()Landroid/app/RemoteAction;

    move-result-object v1

    aput-object v1, p1, v2

    invoke-static {p1}, Lh1/h;->f([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/app/PictureInPictureParams$Builder;->setActions(Ljava/util/List;)Landroid/app/PictureInPictureParams$Builder;

    new-instance p1, Landroid/util/Rational;

    invoke-direct {p1, p2, p3}, Landroid/util/Rational;-><init>(II)V

    invoke-virtual {v0, p1}, Landroid/app/PictureInPictureParams$Builder;->setAspectRatio(Landroid/util/Rational;)Landroid/app/PictureInPictureParams$Builder;

    invoke-virtual {v0}, Landroid/app/PictureInPictureParams$Builder;->build()Landroid/app/PictureInPictureParams;

    move-result-object p1

    iget-object p2, p0, Le2/n0;->b:Landroid/app/Activity;

    invoke-static {p2, p1}, Le2/m0;->a(Landroid/app/Activity;Landroid/app/PictureInPictureParams;)Z

    move-result p1

    return p1
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Le2/n0;->a:Landroid/content/Context;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "xyz.re.player.ex/SystemVideoPipMode/action"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public final h(II)V
    .locals 2

    iget-object v0, p0, Le2/n0;->d:Landroid/app/PictureInPictureParams$Builder;

    new-instance v1, Landroid/util/Rational;

    invoke-direct {v1, p1, p2}, Landroid/util/Rational;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/app/PictureInPictureParams$Builder;->setAspectRatio(Landroid/util/Rational;)Landroid/app/PictureInPictureParams$Builder;

    invoke-virtual {v0}, Landroid/app/PictureInPictureParams$Builder;->build()Landroid/app/PictureInPictureParams;

    move-result-object p1

    iget-object p2, p0, Le2/n0;->b:Landroid/app/Activity;

    invoke-static {p2, p1}, Le2/k0;->a(Landroid/app/Activity;Landroid/app/PictureInPictureParams;)V

    return-void
.end method

.method public final i(Z)V
    .locals 5

    iget-object v0, p0, Le2/n0;->d:Landroid/app/PictureInPictureParams$Builder;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x3

    if-eqz p1, :cond_0

    new-array p1, v4, [Landroid/app/RemoteAction;

    invoke-direct {p0}, Le2/n0;->f()Landroid/app/RemoteAction;

    move-result-object v4

    aput-object v4, p1, v3

    invoke-direct {p0}, Le2/n0;->d()Landroid/app/RemoteAction;

    move-result-object v3

    aput-object v3, p1, v2

    invoke-direct {p0}, Le2/n0;->c()Landroid/app/RemoteAction;

    move-result-object v2

    aput-object v2, p1, v1

    invoke-static {p1}, Lh1/h;->f([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-array p1, v4, [Landroid/app/RemoteAction;

    invoke-direct {p0}, Le2/n0;->f()Landroid/app/RemoteAction;

    move-result-object v4

    aput-object v4, p1, v3

    invoke-direct {p0}, Le2/n0;->e()Landroid/app/RemoteAction;

    move-result-object v3

    aput-object v3, p1, v2

    invoke-direct {p0}, Le2/n0;->c()Landroid/app/RemoteAction;

    move-result-object v2

    aput-object v2, p1, v1

    invoke-static {p1}, Lh1/h;->f([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/app/PictureInPictureParams$Builder;->setActions(Ljava/util/List;)Landroid/app/PictureInPictureParams$Builder;

    invoke-virtual {v0}, Landroid/app/PictureInPictureParams$Builder;->build()Landroid/app/PictureInPictureParams;

    move-result-object p1

    iget-object v0, p0, Le2/n0;->b:Landroid/app/Activity;

    invoke-static {v0, p1}, Le2/k0;->a(Landroid/app/Activity;Landroid/app/PictureInPictureParams;)V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "action"

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-eq p1, p2, :cond_3

    const/4 p2, 0x2

    if-eq p1, p2, :cond_2

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    const/4 p2, 0x4

    if-eq p1, p2, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Le2/n0;->c:Lz0/k;

    const-string p2, "onRewind"

    goto :goto_0

    :cond_1
    iget-object p1, p0, Le2/n0;->c:Lz0/k;

    const-string p2, "onForward"

    goto :goto_0

    :cond_2
    iget-object p1, p0, Le2/n0;->c:Lz0/k;

    const-string p2, "onPause"

    goto :goto_0

    :cond_3
    iget-object p1, p0, Le2/n0;->c:Lz0/k;

    const-string p2, "onPlay"

    :goto_0
    invoke-virtual {p1, p2, v0}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
