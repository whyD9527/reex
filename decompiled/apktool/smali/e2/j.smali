.class public final synthetic Le2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# instance fields
.field public final synthetic a:Lxyz/re/player/ex/AudioManagerChannel;


# direct methods
.method public synthetic constructor <init>(Lxyz/re/player/ex/AudioManagerChannel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le2/j;->a:Lxyz/re/player/ex/AudioManagerChannel;

    return-void
.end method


# virtual methods
.method public final onAudioFocusChange(I)V
    .locals 1

    iget-object v0, p0, Le2/j;->a:Lxyz/re/player/ex/AudioManagerChannel;

    invoke-static {v0, p1}, Lxyz/re/player/ex/AudioManagerChannel;->o(Lxyz/re/player/ex/AudioManagerChannel;I)V

    return-void
.end method
