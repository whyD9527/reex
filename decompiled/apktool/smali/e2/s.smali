.class public final Le2/s;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/d$d;


# instance fields
.field private a:Lz0/d;

.field private b:Landroid/content/Context;

.field private c:Lz0/d$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lz0/d$b;)V
    .locals 0

    iput-object p2, p0, Le2/s;->c:Lz0/d$b;

    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string p2, "android.intent.action.HEADSET_PLUG"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string p2, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object p2, p0, Le2/s;->b:Landroid/content/Context;

    if-nez p2, :cond_0

    const-string p2, "applicationContext"

    invoke-static {p2}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p2, p0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    const/4 p1, 0x0

    iput-object p1, p0, Le2/s;->c:Lz0/d$b;

    iget-object v0, p0, Le2/s;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    const-string v0, "applicationContext"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

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

    iput-object v0, p0, Le2/s;->b:Landroid/content/Context;

    new-instance v0, Lz0/d;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object p1

    const-string v1, "xyz.re.player.ex/HeadsetPlugChannel"

    invoke-direct {v0, p1, v1}, Lz0/d;-><init>(Lz0/c;Ljava/lang/String;)V

    iput-object v0, p0, Le2/s;->a:Lz0/d;

    invoke-virtual {v0, p0}, Lz0/d;->d(Lz0/d$d;)V

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/s;->a:Lz0/d;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "eventChannel"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1, v0}, Lz0/d;->d(Lz0/d$d;)V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x63ecb970

    const/4 v2, -0x1

    if-eq v0, v1, :cond_4

    const v1, 0x2083ec2d

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "android.bluetooth.profile.extra.STATE"

    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-eqz p1, :cond_3

    const/4 p2, 0x2

    if-eq p1, p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p0, Le2/s;->c:Lz0/d$b;

    if-eqz p1, :cond_6

    const/4 p2, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Le2/s;->c:Lz0/d$b;

    if-eqz p1, :cond_6

    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Lz0/d$b;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    const-string v0, "android.intent.action.HEADSET_PLUG"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    const-string p1, "state"

    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-eq p1, v2, :cond_6

    iget-object p2, p0, Le2/s;->c:Lz0/d$b;

    if-eqz p2, :cond_6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lz0/d$b;->a(Ljava/lang/Object;)V

    :cond_6
    :goto_1
    return-void
.end method
