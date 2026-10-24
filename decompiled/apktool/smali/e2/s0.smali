.class public final Le2/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;


# instance fields
.field private a:Lz0/k;

.field private b:Landroid/content/Context;

.field private c:Le2/r0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public h(Ls0/a$b;)V
    .locals 3

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object v1

    const-string v2, "xyz.re.player.ex/SystemVideoPopupView"

    invoke-direct {v0, v1, v2}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;)V

    iput-object v0, p0, Le2/s0;->a:Lz0/k;

    invoke-virtual {v0, p0}, Lz0/k;->e(Lz0/k$c;)V

    invoke-virtual {p1}, Ls0/a$b;->a()Landroid/content/Context;

    move-result-object p1

    const-string v0, "binding.applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/s0;->b:Landroid/content/Context;

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/s0;->c:Le2/r0;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le2/r0;->m()V

    :cond_0
    iget-object p1, p0, Le2/s0;->a:Lz0/k;

    const/4 v0, 0x0

    if-nez p1, :cond_1

    const-string p1, "channel"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1, v0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public m(Lz0/j;Lz0/k$d;)V
    .locals 13

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lz0/j;->a:Ljava/lang/String;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, "context"

    const-string v3, "duration"

    const-string v4, "position"

    const/4 v5, 0x0

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string p1, "dispose"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object p1, p0, Le2/s0;->c:Le2/r0;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le2/r0;->m()V

    iput-object v5, p0, Le2/s0;->c:Le2/r0;

    goto/16 :goto_1

    :sswitch_1
    const-string v1, "setProgress"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
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

    iget-object v1, p0, Le2/s0;->c:Le2/r0;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v1, v0, p1}, Le2/r0;->y(II)V

    goto/16 :goto_1

    :sswitch_2
    const-string v1, "show"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v0, "aspectRatio"

    invoke-virtual {p1, v0}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-virtual {p1, v4}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-virtual {p1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v10

    const-string v0, "thumbColor"

    invoke-virtual {p1, v0}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v11

    const-string v0, "progressColor"

    invoke-virtual {p1, v0}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v12

    iget-object v6, p0, Le2/s0;->c:Le2/r0;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual/range {v6 .. v12}, Le2/r0;->z(DIIII)V

    goto/16 :goto_1

    :sswitch_3
    const-string p1, "init"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    iget-object p1, p0, Le2/s0;->c:Le2/r0;

    if-nez p1, :cond_8

    new-instance p1, Le2/r0;

    iget-object v0, p0, Le2/s0;->b:Landroid/content/Context;

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v0, v5

    :cond_4
    iget-object v1, p0, Le2/s0;->a:Lz0/k;

    if-nez v1, :cond_5

    const-string v1, "channel"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v1, v5

    :cond_5
    invoke-direct {p1, v0, v1}, Le2/r0;-><init>(Landroid/content/Context;Lz0/k;)V

    iput-object p1, p0, Le2/s0;->c:Le2/r0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le2/r0;->r()V

    goto :goto_1

    :sswitch_4
    const-string p1, "canDrawOverlays"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Le2/s0;->b:Landroid/content/Context;

    if-nez p1, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    move-object v5, p1

    :goto_0
    invoke-static {v5}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_3

    :sswitch_5
    const-string v1, "setAspectRatio"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iget-object p1, p0, Le2/s0;->c:Le2/r0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {p1, v0, v1}, Le2/r0;->x(D)V

    :cond_8
    :goto_1
    invoke-interface {p2, v5}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_3

    :cond_9
    :goto_2
    invoke-interface {p2}, Lz0/k$d;->b()V

    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4eab032f -> :sswitch_5
        -0x36b61089 -> :sswitch_4
        0x316510 -> :sswitch_3
        0x35dafd -> :sswitch_2
        0x3ae760af -> :sswitch_1
        0x63a5261f -> :sswitch_0
    .end sparse-switch
.end method
