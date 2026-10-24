.class public final Le2/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;
.implements Lt0/a;


# instance fields
.field private a:Lz0/k;

.field private b:Landroid/content/Context;

.field private c:Landroid/app/Activity;

.field private d:Le2/n0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Le2/o0;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    const-string v0, "context"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.software.picture_in_picture"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final b()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Le2/o0;->c:Landroid/app/Activity;

    if-nez v0, :cond_0

    const-string v0, "activity"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0}, Le2/l0;->a(Landroid/app/Activity;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final c(Z)V
    .locals 2

    iget-object v0, p0, Le2/o0;->d:Le2/n0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Le2/o0;->a:Lz0/k;

    if-nez v0, :cond_0

    const-string v0, "channel"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "onPictureInPictureModeChanged"

    invoke-virtual {v0, v1, p1}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public h(Ls0/a$b;)V
    .locals 3

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object v1

    const-string v2, "xyz.re.player.ex/SystemVideoPipMode"

    invoke-direct {v0, v1, v2}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;)V

    iput-object v0, p0, Le2/o0;->a:Lz0/k;

    invoke-virtual {v0, p0}, Lz0/k;->e(Lz0/k$c;)V

    invoke-virtual {p1}, Ls0/a$b;->a()Landroid/content/Context;

    move-result-object p1

    const-string v0, "binding.applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/o0;->b:Landroid/content/Context;

    return-void
.end method

.method public i(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Le2/o0;->j(Lt0/c;)V

    return-void
.end method

.method public j(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object p1

    const-string v0, "binding.activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/o0;->c:Landroid/app/Activity;

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/o0;->d:Le2/n0;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le2/n0;->a()V

    iput-object v0, p0, Le2/o0;->d:Le2/n0;

    :cond_0
    iget-object p1, p0, Le2/o0;->a:Lz0/k;

    if-nez p1, :cond_1

    const-string p1, "channel"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1, v0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public m(Lz0/j;Lz0/k$d;)V
    .locals 5

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1a

    if-ge v0, v2, :cond_0

    const-string p1, "Unsupported this Android version."

    invoke-interface {p2, p1, v1, v1}, Lz0/k$d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p1, Lz0/j;->a:Ljava/lang/String;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const-string v3, "denominator"

    const-string v4, "numerator"

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string p1, "dispose"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-object p1, p0, Le2/o0;->d:Le2/n0;

    if-eqz p1, :cond_b

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le2/n0;->a()V

    iput-object v1, p0, Le2/o0;->d:Le2/n0;

    goto/16 :goto_1

    :sswitch_1
    const-string p1, "hasPipMode"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-direct {p0}, Le2/o0;->a()Z

    move-result p1

    goto/16 :goto_0

    :sswitch_2
    const-string v2, "setIsPlaying"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_2

    :cond_3
    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Le2/o0;->d:Le2/n0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Le2/n0;->i(Z)V

    goto/16 :goto_1

    :sswitch_3
    const-string v1, "enter"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v0, "isPlaying"

    invoke-virtual {p1, v0}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v4}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

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

    iget-object v2, p0, Le2/o0;->d:Le2/n0;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, v0, v1, p1}, Le2/n0;->b(ZII)Z

    move-result p1

    goto :goto_0

    :sswitch_4
    const-string p1, "init"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_2

    :cond_5
    iget-object p1, p0, Le2/o0;->d:Le2/n0;

    if-nez p1, :cond_b

    new-instance p1, Le2/n0;

    iget-object v0, p0, Le2/o0;->b:Landroid/content/Context;

    if-nez v0, :cond_6

    const-string v0, "context"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v0, v1

    :cond_6
    iget-object v2, p0, Le2/o0;->c:Landroid/app/Activity;

    if-nez v2, :cond_7

    const-string v2, "activity"

    invoke-static {v2}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v2, v1

    :cond_7
    iget-object v3, p0, Le2/o0;->a:Lz0/k;

    if-nez v3, :cond_8

    const-string v3, "channel"

    invoke-static {v3}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v3, v1

    :cond_8
    invoke-direct {p1, v0, v2, v3}, Le2/n0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lz0/k;)V

    iput-object p1, p0, Le2/o0;->d:Le2/n0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le2/n0;->g()V

    goto :goto_1

    :sswitch_5
    const-string p1, "isInPipMode"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_2

    :cond_9
    invoke-direct {p0}, Le2/o0;->b()Z

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_3

    :sswitch_6
    const-string v2, "setAspectRatio"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_2

    :cond_a
    invoke-virtual {p1, v4}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v2, p0, Le2/o0;->d:Le2/n0;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, v0, p1}, Le2/n0;->h(II)V

    :cond_b
    :goto_1
    invoke-interface {p2, v1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_3

    :cond_c
    :goto_2
    invoke-interface {p2}, Lz0/k$d;->b()V

    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4eab032f -> :sswitch_6
        -0x5819b15 -> :sswitch_5
        0x316510 -> :sswitch_4
        0x5c306d8 -> :sswitch_3
        0x1bc74962 -> :sswitch_2
        0x57597fe0 -> :sswitch_1
        0x63a5261f -> :sswitch_0
    .end sparse-switch
.end method

.method public n()V
    .locals 0

    return-void
.end method
