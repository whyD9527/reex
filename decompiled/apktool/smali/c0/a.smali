.class public Lc0/a;
.super Landroidx/core/app/j$d;
.source "SourceFile"


# instance fields
.field e:[I

.field f:Landroid/support/v4/media/session/MediaSessionCompat$Token;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/core/app/j$d;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lc0/a;->e:[I

    return-void
.end method


# virtual methods
.method public b(Landroidx/core/app/i;)V
    .locals 1

    invoke-interface {p1}, Landroidx/core/app/i;->a()Landroid/app/Notification$Builder;

    move-result-object p1

    new-instance v0, Landroid/app/Notification$MediaStyle;

    invoke-direct {v0}, Landroid/app/Notification$MediaStyle;-><init>()V

    invoke-virtual {p0, v0}, Lc0/a;->h(Landroid/app/Notification$MediaStyle;)Landroid/app/Notification$MediaStyle;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    return-void
.end method

.method public d(Landroidx/core/app/i;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public e(Landroidx/core/app/i;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method h(Landroid/app/Notification$MediaStyle;)Landroid/app/Notification$MediaStyle;
    .locals 1

    iget-object v0, p0, Lc0/a;->e:[I

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/app/Notification$MediaStyle;->setShowActionsInCompactView([I)Landroid/app/Notification$MediaStyle;

    :cond_0
    iget-object v0, p0, Lc0/a;->f:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/session/MediaSession$Token;

    invoke-virtual {p1, v0}, Landroid/app/Notification$MediaStyle;->setMediaSession(Landroid/media/session/MediaSession$Token;)Landroid/app/Notification$MediaStyle;

    :cond_1
    return-object p1
.end method

.method public i(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Lc0/a;
    .locals 0

    iput-object p1, p0, Lc0/a;->f:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    return-object p0
.end method

.method public varargs j([I)Lc0/a;
    .locals 0

    iput-object p1, p0, Lc0/a;->e:[I

    return-object p0
.end method
