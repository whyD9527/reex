.class public final Lxyz/re/player/ex/AudioManagerChannel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;
.implements Lt0/a;
.implements Landroidx/lifecycle/f;


# instance fields
.field private a:Z

.field private b:Lz0/k;

.field private c:Landroid/content/Context;

.field private d:Landroid/media/AudioManager;

.field private e:Landroid/media/AudioFocusRequest;

.field private final f:Landroid/media/AudioManager$OnAudioFocusChangeListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le2/j;

    invoke-direct {v0, p0}, Le2/j;-><init>(Lxyz/re/player/ex/AudioManagerChannel;)V

    iput-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->f:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    return-void
.end method

.method public static synthetic o(Lxyz/re/player/ex/AudioManagerChannel;I)V
    .locals 0

    invoke-static {p0, p1}, Lxyz/re/player/ex/AudioManagerChannel;->q(Lxyz/re/player/ex/AudioManagerChannel;I)V

    return-void
.end method

.method private final p()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const-string v2, "audioManager"

    const/16 v3, 0x1a

    if-lt v0, v3, :cond_1

    iget-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->e:Landroid/media/AudioFocusRequest;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->d:Landroid/media/AudioManager;

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    iget-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->e:Landroid/media/AudioFocusRequest;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-static {v1, v0}, Le2/i;->a(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->d:Landroid/media/AudioManager;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    iget-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->f:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v1, v0}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    :cond_3
    :goto_2
    return-void
.end method

.method private static final q(Lxyz/re/player/ex/AudioManagerChannel;I)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->a:Z

    if-eqz v0, :cond_1

    iget-object p0, p0, Lxyz/re/player/ex/AudioManagerChannel;->b:Lz0/k;

    if-nez p0, :cond_0

    const-string p0, "channel"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "focusChange"

    invoke-virtual {p0, v0, p1}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
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

    iput-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->c:Landroid/content/Context;

    if-nez v0, :cond_0

    const-string v0, "applicationContext"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->d:Landroid/media/AudioManager;

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object p1

    const-string v1, "xyz.re.player.ex/AudioManagerChannel"

    invoke-direct {v0, p1, v1}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;)V

    iput-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->b:Lz0/k;

    invoke-virtual {v0, p0}, Lz0/k;->e(Lz0/k$c;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lxyz/re/player/ex/AudioManagerChannel;->a:Z

    return-void
.end method

.method public i(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public j(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lxyz/re/player/ex/AudioManagerChannel;->b:Lz0/k;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "channel"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1, v0}, Lz0/k;->e(Lz0/k$c;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lxyz/re/player/ex/AudioManagerChannel;->a:Z

    return-void
.end method

.method public m(Lz0/j;Lz0/k$d;)V
    .locals 6

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lz0/j;->a:Ljava/lang/String;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, "flags"

    const-string v3, "streamType"

    const-string v4, "audioManager"

    const/4 v5, 0x0

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_7

    :sswitch_0
    const-string p1, "abandonAudioFocus"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_7

    :cond_0
    invoke-direct {p0}, Lxyz/re/player/ex/AudioManagerChannel;->p()V

    :goto_0
    invoke-interface {p2, v5}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_7

    :sswitch_1
    const-string v1, "setStreamVolume"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_7

    :cond_1
    invoke-virtual {p1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const-string v1, "index"

    invoke-virtual {p1, v1}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p1, v2}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v2, p0, Lxyz/re/player/ex/AudioManagerChannel;->d:Landroid/media/AudioManager;

    if-nez v2, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v2, v5

    :cond_2
    invoke-virtual {v2, v0, v1, p1}, Landroid/media/AudioManager;->setStreamVolume(III)V

    goto :goto_0

    :sswitch_2
    const-string v1, "getStreamVolume"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_7

    :cond_3
    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->d:Landroid/media/AudioManager;

    if-nez v0, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v5, v0

    :goto_1
    invoke-virtual {v5, p1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result p1

    goto/16 :goto_6

    :sswitch_3
    const-string v1, "getStreamMinVolume"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_7

    :cond_5
    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_7

    iget-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->d:Landroid/media/AudioManager;

    if-nez v0, :cond_6

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    move-object v5, v0

    :goto_2
    invoke-static {v5, p1}, Le2/h;->a(Landroid/media/AudioManager;I)I

    move-result p1

    goto/16 :goto_6

    :cond_7
    const/4 p1, 0x0

    goto/16 :goto_6

    :sswitch_4
    const-string v1, "adjustStreamVolume"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_7

    :cond_8
    invoke-virtual {p1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const-string v1, "direction"

    invoke-virtual {p1, v1}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p1, v2}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v2, p0, Lxyz/re/player/ex/AudioManagerChannel;->d:Landroid/media/AudioManager;

    if-nez v2, :cond_9

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v2, v5

    :cond_9
    invoke-virtual {v2, v0, v1, p1}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "requestAudioFocus"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_7

    :cond_a
    const-string v0, "contentType"

    invoke-virtual {p1, v0}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const-string v1, "focusGain"

    invoke-virtual {p1, v1}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1a

    if-lt v2, v3, :cond_d

    iget-object p1, p0, Lxyz/re/player/ex/AudioManagerChannel;->e:Landroid/media/AudioFocusRequest;

    if-nez p1, :cond_b

    new-instance p1, Landroid/media/AudioFocusRequest$Builder;

    invoke-direct {p1, v1}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    iget-object v1, p0, Lxyz/re/player/ex/AudioManagerChannel;->f:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {p1, v1}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    new-instance v1, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    invoke-virtual {v1, v0}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    invoke-virtual {v1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/media/AudioFocusRequest$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    invoke-virtual {p1}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    move-result-object p1

    iput-object p1, p0, Lxyz/re/player/ex/AudioManagerChannel;->e:Landroid/media/AudioFocusRequest;

    :cond_b
    iget-object p1, p0, Lxyz/re/player/ex/AudioManagerChannel;->d:Landroid/media/AudioManager;

    if-nez p1, :cond_c

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_3

    :cond_c
    move-object v5, p1

    :goto_3
    iget-object p1, p0, Lxyz/re/player/ex/AudioManagerChannel;->e:Landroid/media/AudioFocusRequest;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-static {v5, p1}, Le2/g;->a(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    move-result p1

    goto :goto_6

    :cond_d
    iget-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->d:Landroid/media/AudioManager;

    if-nez v0, :cond_e

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_4

    :cond_e
    move-object v5, v0

    :goto_4
    iget-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->f:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v5, v0, p1, v1}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result p1

    goto :goto_6

    :sswitch_6
    const-string v1, "getStreamMaxVolume"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_7

    :cond_f
    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lxyz/re/player/ex/AudioManagerChannel;->d:Landroid/media/AudioManager;

    if-nez v0, :cond_10

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_5

    :cond_10
    move-object v5, v0

    :goto_5
    invoke-virtual {v5, p1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result p1

    :goto_6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    :cond_11
    :goto_7
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5e4f1038 -> :sswitch_6
        -0x59af196f -> :sswitch_5
        -0x4759d017 -> :sswitch_4
        -0x3043f9ca -> :sswitch_3
        0x107e1530 -> :sswitch_2
        0x46c7103c -> :sswitch_1
        0x50e69af7 -> :sswitch_0
    .end sparse-switch
.end method

.method public n()V
    .locals 0

    return-void
.end method
