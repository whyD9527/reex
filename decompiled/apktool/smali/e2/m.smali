.class public final synthetic Le2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Landroid/support/v4/media/session/MediaSessionCompat;

.field public final synthetic f:Le2/n;


# direct methods
.method public synthetic constructor <init>(Landroid/support/v4/media/session/MediaSessionCompat;Le2/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le2/m;->e:Landroid/support/v4/media/session/MediaSessionCompat;

    iput-object p2, p0, Le2/m;->f:Le2/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le2/m;->e:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object v1, p0, Le2/m;->f:Le2/n;

    invoke-static {v0, v1}, Le2/n;->a(Landroid/support/v4/media/session/MediaSessionCompat;Le2/n;)V

    return-void
.end method
