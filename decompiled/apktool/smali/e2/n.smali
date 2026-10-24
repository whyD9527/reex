.class final Le2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le2/n$a;
    }
.end annotation


# static fields
.field public static final k:Le2/n$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lq1/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq1/p<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Lg1/q;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lg1/e;

.field private final d:Landroid/os/Handler;

.field private final e:Le2/n$d;

.field private final f:Le2/n$b;

.field private final g:Landroid/support/v4/media/session/MediaSessionCompat;

.field private h:Landroid/support/v4/media/MediaMetadataCompat$b;

.field private i:Landroid/support/v4/media/session/PlaybackStateCompat$b;

.field private final j:Landroidx/core/app/j$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le2/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le2/n$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Le2/n;->k:Le2/n$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lq1/p;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lq1/p<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Lg1/q;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le2/n;->a:Landroid/content/Context;

    iput-object p2, p0, Le2/n;->b:Lq1/p;

    new-instance p2, Le2/n$c;

    invoke-direct {p2, p0}, Le2/n$c;-><init>(Le2/n;)V

    invoke-static {p2}, Lg1/f;->a(Lq1/a;)Lg1/e;

    move-result-object p2

    iput-object p2, p0, Le2/n;->c:Lg1/e;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Le2/n;->d:Landroid/os/Handler;

    new-instance v0, Le2/n$d;

    invoke-direct {v0, p0}, Le2/n$d;-><init>(Le2/n;)V

    iput-object v0, p0, Le2/n;->e:Le2/n$d;

    new-instance v0, Le2/n$b;

    invoke-direct {v0, p0}, Le2/n$b;-><init>(Le2/n;)V

    iput-object v0, p0, Le2/n;->f:Le2/n$b;

    new-instance v1, Landroid/support/v4/media/session/MediaSessionCompat;

    const-string v2, "Reex"

    invoke-direct {v1, p1, v2}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v2, Le2/m;

    invoke-direct {v2, v1, p0}, Le2/m;-><init>(Landroid/support/v4/media/session/MediaSessionCompat;Le2/n;)V

    invoke-virtual {p2, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iput-object v1, p0, Le2/n;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    new-instance p2, Landroid/support/v4/media/MediaMetadataCompat$b;

    invoke-direct {p2}, Landroid/support/v4/media/MediaMetadataCompat$b;-><init>()V

    iput-object p2, p0, Le2/n;->h:Landroid/support/v4/media/MediaMetadataCompat$b;

    new-instance p2, Landroid/support/v4/media/session/PlaybackStateCompat$b;

    invoke-direct {p2}, Landroid/support/v4/media/session/PlaybackStateCompat$b;-><init>()V

    iput-object p2, p0, Le2/n;->i:Landroid/support/v4/media/session/PlaybackStateCompat$b;

    new-instance p2, Landroidx/core/app/j$c;

    const-string v2, "ReexPlaybackService"

    invoke-direct {p2, p1, v2}, Landroidx/core/app/j$c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const v3, 0x7f06007c

    invoke-virtual {p2, v3}, Landroidx/core/app/j$c;->m(I)Landroidx/core/app/j$c;

    new-instance v3, Landroid/content/Intent;

    const-class v4, Lxyz/re/player/ex/MainActivity;

    invoke-direct {v3, p1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v4, 0x0

    const/high16 v5, 0x4000000

    invoke-static {p1, v4, v3, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {p2, v3}, Landroidx/core/app/j$c;->h(Landroid/app/PendingIntent;)Landroidx/core/app/j$c;

    const/4 v3, -0x1

    invoke-virtual {p2, v3}, Landroidx/core/app/j$c;->l(I)Landroidx/core/app/j$c;

    const/4 v3, 0x1

    invoke-virtual {p2, v3}, Landroidx/core/app/j$c;->g(Z)Landroidx/core/app/j$c;

    new-instance v3, Lc0/a;

    invoke-direct {v3}, Lc0/a;-><init>()V

    invoke-virtual {v1}, Landroid/support/v4/media/session/MediaSessionCompat;->d()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v1

    invoke-virtual {v3, v1}, Lc0/a;->i(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Lc0/a;

    invoke-virtual {p2, v3}, Landroidx/core/app/j$c;->n(Landroidx/core/app/j$d;)Landroidx/core/app/j$c;

    iput-object p2, p0, Le2/n;->j:Landroidx/core/app/j$c;

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v3, "android.intent.action.MEDIA_BUTTON"

    invoke-virtual {v1, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    new-instance v3, Landroid/app/NotificationChannel;

    const/4 v4, 0x2

    invoke-direct {v3, v2, v2, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-direct {p0}, Le2/n;->d()Landroid/app/NotificationManager;

    move-result-object v2

    invoke-static {v2, v3}, Le2/k;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    :cond_0
    sget-object v2, Lxyz/re/player/ex/ReexPlaybackService;->e:Lxyz/re/player/ex/ReexPlaybackService$a;

    invoke-virtual {p2}, Landroidx/core/app/j$c;->b()Landroid/app/Notification;

    move-result-object p2

    invoke-virtual {v2, p2}, Lxyz/re/player/ex/ReexPlaybackService$a;->a(Landroid/app/Notification;)V

    new-instance p2, Landroid/content/Intent;

    const-class v2, Lxyz/re/player/ex/ReexPlaybackService;

    invoke-direct {p2, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    if-lt v0, v1, :cond_1

    invoke-static {p1, p2}, Landroidx/core/content/c;->a(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :goto_0
    return-void
.end method

.method public static synthetic a(Landroid/support/v4/media/session/MediaSessionCompat;Le2/n;)V
    .locals 0

    invoke-static {p0, p1}, Le2/n;->h(Landroid/support/v4/media/session/MediaSessionCompat;Le2/n;)V

    return-void
.end method

.method private final d()Landroid/app/NotificationManager;
    .locals 1

    iget-object v0, p0, Le2/n;->c:Lg1/e;

    invoke-interface {v0}, Lg1/e;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    return-object v0
.end method

.method private static final h(Landroid/support/v4/media/session/MediaSessionCompat;Le2/n;)V
    .locals 1

    const-string v0, "$this_apply"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Le2/n;->e:Le2/n$d;

    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat;->g(Landroid/support/v4/media/session/MediaSessionCompat$b;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Le2/n;->a:Landroid/content/Context;

    iget-object v1, p0, Le2/n;->f:Le2/n$b;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Le2/n;->a:Landroid/content/Context;

    const-class v2, Lxyz/re/player/ex/ReexPlaybackService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Le2/n;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Le2/n;->d()Landroid/app/NotificationManager;

    move-result-object v0

    const-string v1, "ReexPlaybackService"

    invoke-static {v0, v1}, Le2/l;->a(Landroid/app/NotificationManager;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final c()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Le2/n;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final e()Lq1/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq1/p<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Lg1/q;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le2/n;->b:Lq1/p;

    return-object v0
.end method

.method public final f()Landroid/support/v4/media/session/MediaSessionCompat;
    .locals 1

    iget-object v0, p0, Le2/n;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    return-object v0
.end method

.method public final g(Lz0/j;Lz0/k$d;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "call"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "result"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lz0/j;->a:Ljava/lang/String;

    if-eqz v3, :cond_13

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const-wide/16 v5, 0x20

    const-wide/16 v11, 0x10

    const-string v13, "canSkipToNext"

    const-string v14, "canSkipToPrevious"

    const-string v15, "isPlaying"

    const/4 v10, 0x2

    const/4 v9, 0x0

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_7

    :sswitch_0
    const-string v4, "setMediaMetadata"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v3, v0, Le2/n;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object v4, v0, Le2/n;->h:Landroid/support/v4/media/MediaMetadataCompat$b;

    const-string v5, "duration"

    invoke-virtual {v1, v5}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    const-string v7, "android.media.metadata.DURATION"

    invoke-virtual {v4, v7, v5, v6}, Landroid/support/v4/media/MediaMetadataCompat$b;->b(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat$b;

    const-string v5, "title"

    invoke-virtual {v1, v5}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "android.media.metadata.TITLE"

    invoke-virtual {v4, v6, v5}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    const-string v5, "album"

    invoke-virtual {v1, v5}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "android.media.metadata.ALBUM"

    invoke-virtual {v4, v6, v5}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    const-string v5, "artist"

    invoke-virtual {v1, v5}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "android.media.metadata.ARTIST"

    invoke-virtual {v4, v6, v5}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    const-string v5, "albumArtist"

    invoke-virtual {v1, v5}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "android.media.metadata.ALBUM_ARTIST"

    invoke-virtual {v4, v6, v5}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    const-string v5, "displayIconUri"

    invoke-virtual {v1, v5}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v5, "android.media.metadata.DISPLAY_ICON_URI"

    invoke-virtual {v4, v5, v1}, Landroid/support/v4/media/MediaMetadataCompat$b;->c(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$b;

    invoke-virtual {v4}, Landroid/support/v4/media/MediaMetadataCompat$b;->a()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->i(Landroid/support/v4/media/MediaMetadataCompat;)V

    invoke-interface {v2, v9}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_8

    :sswitch_1
    const-string v4, "setPlaybackState"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_7

    :cond_1
    iget-object v3, v0, Le2/n;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object v4, v0, Le2/n;->i:Landroid/support/v4/media/session/PlaybackStateCompat$b;

    invoke-virtual {v1, v15}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v15, Ljava/lang/Boolean;

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    invoke-virtual {v1, v14}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    invoke-virtual {v1, v13}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-eqz v15, :cond_2

    const/4 v10, 0x3

    :cond_2
    const-string v7, "position"

    invoke-virtual {v1, v7}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    const-string v9, "playbackSpeed"

    invoke-virtual {v1, v9}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v4, v10, v7, v8, v1}, Landroid/support/v4/media/session/PlaybackStateCompat$b;->c(IJF)Landroid/support/v4/media/session/PlaybackStateCompat$b;

    if-eqz v15, :cond_3

    const-wide/16 v7, 0x2

    goto :goto_0

    :cond_3
    const-wide/16 v7, 0x4

    :goto_0
    const-wide/16 v9, 0x100

    or-long/2addr v7, v9

    const-wide/32 v9, 0x400000

    or-long/2addr v7, v9

    if-eqz v14, :cond_4

    or-long/2addr v7, v11

    :cond_4
    if-eqz v13, :cond_5

    or-long/2addr v7, v5

    :cond_5
    invoke-virtual {v4, v7, v8}, Landroid/support/v4/media/session/PlaybackStateCompat$b;->b(J)Landroid/support/v4/media/session/PlaybackStateCompat$b;

    invoke-virtual {v4}, Landroid/support/v4/media/session/PlaybackStateCompat$b;->a()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->j(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    goto/16 :goto_6

    :sswitch_2
    const-string v4, "setActive"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_7

    :cond_6
    iget-object v3, v0, Le2/n;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual/range {p1 .. p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v3, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->f(Z)V

    const/4 v4, 0x0

    goto :goto_1

    :sswitch_3
    move-object v4, v9

    const-string v1, "updateNotification"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_7

    :cond_7
    invoke-direct/range {p0 .. p0}, Le2/n;->d()Landroid/app/NotificationManager;

    move-result-object v1

    const v3, 0x2c37c723

    iget-object v5, v0, Le2/n;->j:Landroidx/core/app/j$c;

    invoke-virtual {v5}, Landroidx/core/app/j$c;->b()Landroid/app/Notification;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    goto :goto_1

    :sswitch_4
    move-object v4, v9

    const-string v5, "setNotificationTitle"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto/16 :goto_7

    :cond_8
    iget-object v3, v0, Le2/n;->j:Landroidx/core/app/j$c;

    invoke-virtual/range {p1 .. p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v3, v1}, Landroidx/core/app/j$c;->j(Ljava/lang/CharSequence;)Landroidx/core/app/j$c;

    goto :goto_1

    :sswitch_5
    move-object v4, v9

    const-string v5, "setNotificationText"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_7

    :cond_9
    iget-object v3, v0, Le2/n;->j:Landroidx/core/app/j$c;

    invoke-virtual/range {p1 .. p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v3, v1}, Landroidx/core/app/j$c;->i(Ljava/lang/CharSequence;)Landroidx/core/app/j$c;

    :goto_1
    invoke-interface {v2, v4}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_8

    :sswitch_6
    const-string v4, "setNotificationIcon"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto/16 :goto_7

    :cond_a
    invoke-virtual/range {p1 .. p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    if-eqz v1, :cond_b

    iget-object v3, v0, Le2/n;->j:Landroidx/core/app/j$c;

    sget-object v4, Le2/n;->k:Le2/n$a;

    iget-object v5, v0, Le2/n;->a:Landroid/content/Context;

    invoke-static {v4, v5, v1}, Le2/n$a;->b(Le2/n$a;Landroid/content/Context;[B)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroidx/core/app/j$c;->k(Landroid/graphics/Bitmap;)Landroidx/core/app/j$c;

    const/4 v3, 0x0

    goto :goto_2

    :cond_b
    iget-object v1, v0, Le2/n;->j:Landroidx/core/app/j$c;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroidx/core/app/j$c;->k(Landroid/graphics/Bitmap;)Landroidx/core/app/j$c;

    :goto_2
    invoke-interface {v2, v3}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_8

    :sswitch_7
    const-string v4, "setNotificationActions"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto/16 :goto_7

    :cond_c
    iget-object v3, v0, Le2/n;->j:Landroidx/core/app/j$c;

    invoke-virtual {v1, v15}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v1, v14}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    invoke-virtual {v1, v13}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v3}, Landroidx/core/app/j$c;->c()Landroidx/core/app/j$c;

    const/4 v8, 0x1

    if-eqz v7, :cond_d

    new-instance v7, Landroidx/core/app/j$a;

    const v9, 0x7f06007b

    sget-object v13, Le2/n;->k:Le2/n$a;

    iget-object v14, v0, Le2/n;->a:Landroid/content/Context;

    invoke-static {v13, v14, v11, v12}, Le2/n$a;->a(Le2/n$a;Landroid/content/Context;J)Landroid/app/PendingIntent;

    move-result-object v11

    const-string v12, "previous"

    invoke-direct {v7, v9, v12, v11}, Landroidx/core/app/j$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v3, v7}, Landroidx/core/app/j$c;->a(Landroidx/core/app/j$a;)Landroidx/core/app/j$c;

    move v7, v10

    goto :goto_3

    :cond_d
    move v7, v8

    :goto_3
    if-eqz v4, :cond_e

    new-instance v4, Landroidx/core/app/j$a;

    const v9, 0x7f060079

    sget-object v11, Le2/n;->k:Le2/n$a;

    iget-object v12, v0, Le2/n;->a:Landroid/content/Context;

    const-wide/16 v13, 0x2

    invoke-static {v11, v12, v13, v14}, Le2/n$a;->a(Le2/n$a;Landroid/content/Context;J)Landroid/app/PendingIntent;

    move-result-object v11

    const-string v12, "pause"

    invoke-direct {v4, v9, v12, v11}, Landroidx/core/app/j$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    goto :goto_4

    :cond_e
    new-instance v4, Landroidx/core/app/j$a;

    const v9, 0x7f06007a

    sget-object v11, Le2/n;->k:Le2/n$a;

    iget-object v12, v0, Le2/n;->a:Landroid/content/Context;

    const-wide/16 v13, 0x4

    invoke-static {v11, v12, v13, v14}, Le2/n$a;->a(Le2/n$a;Landroid/content/Context;J)Landroid/app/PendingIntent;

    move-result-object v11

    const-string v12, "play"

    invoke-direct {v4, v9, v12, v11}, Landroidx/core/app/j$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    :goto_4
    invoke-virtual {v3, v4}, Landroidx/core/app/j$c;->a(Landroidx/core/app/j$a;)Landroidx/core/app/j$c;

    if-eqz v1, :cond_f

    add-int/lit8 v7, v7, 0x1

    new-instance v1, Landroidx/core/app/j$a;

    const v4, 0x7f06006c

    sget-object v9, Le2/n;->k:Le2/n$a;

    iget-object v11, v0, Le2/n;->a:Landroid/content/Context;

    invoke-static {v9, v11, v5, v6}, Le2/n$a;->a(Le2/n$a;Landroid/content/Context;J)Landroid/app/PendingIntent;

    move-result-object v5

    const-string v6, "next"

    invoke-direct {v1, v4, v6, v5}, Landroidx/core/app/j$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v3, v1}, Landroidx/core/app/j$c;->a(Landroidx/core/app/j$a;)Landroidx/core/app/j$c;

    :cond_f
    new-instance v1, Lc0/a;

    invoke-direct {v1}, Lc0/a;-><init>()V

    iget-object v4, v0, Le2/n;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v4}, Landroid/support/v4/media/session/MediaSessionCompat;->d()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v4

    invoke-virtual {v1, v4}, Lc0/a;->i(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Lc0/a;

    if-eq v7, v8, :cond_12

    if-eq v7, v10, :cond_11

    const/4 v4, 0x3

    if-eq v7, v4, :cond_10

    goto :goto_5

    :cond_10
    new-array v4, v4, [I

    fill-array-data v4, :array_0

    invoke-virtual {v1, v4}, Lc0/a;->j([I)Lc0/a;

    goto :goto_5

    :cond_11
    new-array v4, v10, [I

    fill-array-data v4, :array_1

    invoke-virtual {v1, v4}, Lc0/a;->j([I)Lc0/a;

    goto :goto_5

    :cond_12
    new-array v4, v8, [I

    const/4 v5, 0x0

    aput v5, v4, v5

    invoke-virtual {v1, v4}, Lc0/a;->j([I)Lc0/a;

    :goto_5
    invoke-virtual {v3, v1}, Landroidx/core/app/j$c;->n(Landroidx/core/app/j$d;)Landroidx/core/app/j$c;

    :goto_6
    const/4 v1, 0x0

    invoke-interface {v2, v1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_8

    :cond_13
    :goto_7
    invoke-interface/range {p2 .. p2}, Lz0/k$d;->b()V

    :goto_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x60c1da30 -> :sswitch_7
        -0x5422377a -> :sswitch_6
        -0x541d2ec6 -> :sswitch_5
        -0x2f86e815 -> :sswitch_4
        -0x166dcfac -> :sswitch_3
        0x37bd608 -> :sswitch_2
        0x18c4b9f4 -> :sswitch_1
        0x59814df1 -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 4
        0x0
        0x1
        0x2
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x1
    .end array-data
.end method
