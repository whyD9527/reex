.class Lh0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/k$c;


# instance fields
.field private final a:Lh0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lh0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/d;->a:Lh0/c;

    return-void
.end method


# virtual methods
.method public m(Lz0/j;Lz0/k$d;)V
    .locals 6

    iget-object v0, p1, Lz0/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "hasCustomVibrationsSupport"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_1
    const-string v1, "vibrate"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_2
    const-string v1, "hasAmplitudeControl"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_3
    const-string v1, "cancel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    const/4 v0, 0x0

    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Lz0/k$d;->b()V

    goto/16 :goto_3

    :pswitch_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_1
    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_1
    const-string v1, "duration"

    invoke-virtual {p1, v1}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "pattern"

    invoke-virtual {p1, v2}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const-string v3, "repeat"

    invoke-virtual {p1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "intensities"

    invoke-virtual {p1, v4}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    const-string v5, "amplitude"

    invoke-virtual {p1, v5}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_4

    iget-object p1, p0, Lh0/d;->a:Lh0/c;

    invoke-virtual {p1, v2, v3, v4}, Lh0/c;->d(Ljava/util/List;ILjava/util/List;)V

    goto :goto_2

    :cond_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_5

    iget-object p1, p0, Lh0/d;->a:Lh0/c;

    invoke-virtual {p1, v2, v3}, Lh0/c;->c(Ljava/util/List;I)V

    goto :goto_2

    :cond_5
    iget-object v2, p0, Lh0/d;->a:Lh0/c;

    int-to-long v3, v1

    invoke-virtual {v2, v3, v4, p1}, Lh0/c;->b(JI)V

    goto :goto_2

    :pswitch_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-lt p1, v0, :cond_6

    iget-object p1, p0, Lh0/d;->a:Lh0/c;

    invoke-virtual {p1}, Lh0/c;->a()Landroid/os/Vibrator;

    move-result-object p1

    invoke-static {p1}, Lh0/a;->a(Landroid/os/Vibrator;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_1

    :cond_6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :pswitch_3
    iget-object p1, p0, Lh0/d;->a:Lh0/c;

    invoke-virtual {p1}, Lh0/c;->a()Landroid/os/Vibrator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Vibrator;->cancel()V

    :goto_2
    invoke-interface {p2, v0}, Lz0/k$d;->a(Ljava/lang/Object;)V

    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5185d186 -> :sswitch_3
        0x5223a14 -> :sswitch_2
        0x1ae6756f -> :sswitch_1
        0x35175d03 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
