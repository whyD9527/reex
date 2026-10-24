.class public Lh0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/os/Vibrator;


# direct methods
.method constructor <init>(Landroid/os/Vibrator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/c;->a:Landroid/os/Vibrator;

    return-void
.end method


# virtual methods
.method a()Landroid/os/Vibrator;
    .locals 1

    iget-object v0, p0, Lh0/c;->a:Landroid/os/Vibrator;

    return-object v0
.end method

.method b(JI)V
    .locals 2

    iget-object v0, p0, Lh0/c;->a:Landroid/os/Vibrator;

    invoke-virtual {v0}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lh0/c;->a:Landroid/os/Vibrator;

    invoke-static {v0}, Lh0/a;->a(Landroid/os/Vibrator;)Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh0/c;->a:Landroid/os/Vibrator;

    invoke-static {p1, p2, p3}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    move-result-object p1

    new-instance p2, Landroid/media/AudioAttributes$Builder;

    invoke-direct {p2}, Landroid/media/AudioAttributes$Builder;-><init>()V

    invoke-virtual {p2, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p2

    invoke-virtual {p2}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p2

    invoke-static {v0, p1, p2}, Lh0/b;->a(Landroid/os/Vibrator;Landroid/os/VibrationEffect;Landroid/media/AudioAttributes;)V

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lh0/c;->a:Landroid/os/Vibrator;

    const/4 v0, -0x1

    invoke-static {p1, p2, v0}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    move-result-object p1

    new-instance p2, Landroid/media/AudioAttributes$Builder;

    invoke-direct {p2}, Landroid/media/AudioAttributes$Builder;-><init>()V

    invoke-virtual {p2, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p2

    invoke-virtual {p2}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p2

    invoke-static {p3, p1, p2}, Lh0/b;->a(Landroid/os/Vibrator;Landroid/os/VibrationEffect;Landroid/media/AudioAttributes;)V

    goto :goto_0

    :cond_1
    iget-object p3, p0, Lh0/c;->a:Landroid/os/Vibrator;

    invoke-virtual {p3, p1, p2}, Landroid/os/Vibrator;->vibrate(J)V

    :cond_2
    :goto_0
    return-void
.end method

.method c(Ljava/util/List;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [J

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v3, v3

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lh0/c;->a:Landroid/os/Vibrator;

    invoke-virtual {p1}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result p1

    if-eqz p1, :cond_2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_1

    iget-object p1, p0, Lh0/c;->a:Landroid/os/Vibrator;

    invoke-static {v1, p2}, Landroid/os/VibrationEffect;->createWaveform([JI)Landroid/os/VibrationEffect;

    move-result-object p2

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lh0/b;->a(Landroid/os/Vibrator;Landroid/os/VibrationEffect;Landroid/media/AudioAttributes;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lh0/c;->a:Landroid/os/Vibrator;

    invoke-virtual {p1, v1, p2}, Landroid/os/Vibrator;->vibrate([JI)V

    :cond_2
    :goto_1
    return-void
.end method

.method d(Ljava/util/List;ILjava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [J

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    new-array v3, v2, [I

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v0, :cond_0

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    int-to-long v6, v6

    aput-wide v6, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v4, v2, :cond_1

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aput p1, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lh0/c;->a:Landroid/os/Vibrator;

    invoke-virtual {p1}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result p1

    if-eqz p1, :cond_4

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    if-lt p1, p3, :cond_3

    iget-object p1, p0, Lh0/c;->a:Landroid/os/Vibrator;

    invoke-static {p1}, Lh0/a;->a(Landroid/os/Vibrator;)Z

    move-result p1

    const/4 p3, 0x4

    if-eqz p1, :cond_2

    iget-object p1, p0, Lh0/c;->a:Landroid/os/Vibrator;

    invoke-static {v1, v3, p2}, Landroid/os/VibrationEffect;->createWaveform([J[II)Landroid/os/VibrationEffect;

    move-result-object p2

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    invoke-virtual {v0, p3}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p3

    invoke-virtual {p3}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lh0/b;->a(Landroid/os/Vibrator;Landroid/os/VibrationEffect;Landroid/media/AudioAttributes;)V

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lh0/c;->a:Landroid/os/Vibrator;

    invoke-static {v1, p2}, Landroid/os/VibrationEffect;->createWaveform([JI)Landroid/os/VibrationEffect;

    move-result-object p2

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    invoke-virtual {v0, p3}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p3

    invoke-virtual {p3}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lh0/b;->a(Landroid/os/Vibrator;Landroid/os/VibrationEffect;Landroid/media/AudioAttributes;)V

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lh0/c;->a:Landroid/os/Vibrator;

    invoke-virtual {p1, v1, p2}, Landroid/os/Vibrator;->vibrate([JI)V

    :cond_4
    :goto_2
    return-void
.end method
