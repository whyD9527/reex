.class Landroid/support/v4/media/session/MediaSessionCompat$e;
.super Landroid/support/v4/media/session/MediaSessionCompat$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/MediaSessionCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# direct methods
.method constructor <init>(Landroid/media/session/MediaSession;Lf0/b;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/media/session/MediaSessionCompat$d;-><init>(Landroid/media/session/MediaSession;Lf0/b;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public b(Lb0/a;)V
    .locals 0

    return-void
.end method

.method public final k()Lb0/a;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$d;->a:Landroid/media/session/MediaSession;

    invoke-static {v0}, Landroid/support/v4/media/session/c;->a(Landroid/media/session/MediaSession;)Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    move-result-object v0

    new-instance v1, Lb0/a;

    invoke-direct {v1, v0}, Lb0/a;-><init>(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)V

    return-object v1
.end method
