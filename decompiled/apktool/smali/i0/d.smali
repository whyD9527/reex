.class public final Li0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;


# instance fields
.field private a:Landroid/net/nsd/NsdManager;

.field private b:Landroid/net/wifi/WifiManager;

.field private c:Lz0/k;

.field private d:Landroid/net/wifi/WifiManager$MulticastLock;

.field private final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/net/nsd/NsdManager$DiscoveryListener;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/net/nsd/NsdManager$ResolveListener;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Landroid/net/nsd/NsdManager$RegistrationListener;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/concurrent/Semaphore;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li0/d;->e:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li0/d;->f:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li0/d;->g:Ljava/util/HashMap;

    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Li0/d;->h:Ljava/util/concurrent/Semaphore;

    return-void
.end method

.method public static synthetic a(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Li0/d;->p(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic b(Li0/d;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Li0/d;->e:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic c(Li0/d;)Landroid/net/nsd/NsdManager;
    .locals 0

    iget-object p0, p0, Li0/d;->a:Landroid/net/nsd/NsdManager;

    return-object p0
.end method

.method public static final synthetic d(Li0/d;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Li0/d;->g:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic e(Li0/d;)Ljava/util/HashMap;
    .locals 0

    iget-object p0, p0, Li0/d;->f:Ljava/util/HashMap;

    return-object p0
.end method

.method public static final synthetic f(Li0/d;)Ljava/util/concurrent/Semaphore;
    .locals 0

    iget-object p0, p0, Li0/d;->h:Ljava/util/concurrent/Semaphore;

    return-object p0
.end method

.method public static final synthetic g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li0/d;->o(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic i(Li0/d;Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdServiceInfo;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Li0/d;->q(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdServiceInfo;)Z

    move-result p0

    return p0
.end method

.method private final j(Ljava/lang/String;)Li0/d$a;
    .locals 1

    new-instance v0, Li0/d$a;

    invoke-direct {v0, p0, p1}, Li0/d$a;-><init>(Li0/d;Ljava/lang/String;)V

    return-object v0
.end method

.method private final k(Ljava/lang/String;)Li0/d$b;
    .locals 1

    new-instance v0, Li0/d$b;

    invoke-direct {v0, p1, p0}, Li0/d$b;-><init>(Ljava/lang/String;Li0/d;)V

    return-object v0
.end method

.method private final n(Ljava/lang/String;)Li0/d$c;
    .locals 1

    new-instance v0, Li0/d$c;

    invoke-direct {v0, p0, p1}, Li0/d$c;-><init>(Li0/d;Ljava/lang/String;)V

    return-object v0
.end method

.method private final o(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Li0/c;

    invoke-direct {v1, p0, p1, p2}, Li0/c;-><init>(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final p(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Li0/d;->c:Lz0/k;

    if-nez p0, :cond_0

    const-string p0, "methodChannel"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final q(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdServiceInfo;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/net/nsd/NsdServiceInfo;->getServiceType()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final r(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "android.permission.CHANGE_WIFI_MULTICAST_STATE"

    invoke-static {p1, v0}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final s(Lz0/j;Lz0/k$d;)V
    .locals 4

    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Li0/g;->e(Ljava/util/Map;)Landroid/net/nsd/NsdServiceInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/net/nsd/NsdServiceInfo;->getServiceType()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/net/nsd/NsdServiceInfo;->getPort()I

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Li0/g;->c(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Li0/d;->k(Ljava/lang/String;)Li0/d$b;

    move-result-object v1

    iget-object v2, p0, Li0/d;->g:Ljava/util/HashMap;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Li0/d;->a:Landroid/net/nsd/NsdManager;

    const/4 v2, 0x0

    if-nez p1, :cond_0

    const-string p1, "nsdManager"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v2

    :cond_0
    const/4 v3, 0x1

    invoke-virtual {p1, v0, v3, v1}, Landroid/net/nsd/NsdManager;->registerService(Landroid/net/nsd/NsdServiceInfo;ILandroid/net/nsd/NsdManager$RegistrationListener;)V

    invoke-interface {p2, v2}, Lz0/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Li0/e;

    sget-object p2, Li0/a;->f:Li0/a;

    const-string v0, "Cannot register service: expected handle"

    invoke-direct {p1, p2, v0}, Li0/e;-><init>(Li0/a;Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Li0/e;

    sget-object p2, Li0/a;->f:Li0/a;

    const-string v0, "Cannot register service: expected service info with service name, type and port"

    invoke-direct {p1, p2, v0}, Li0/e;-><init>(Li0/a;Ljava/lang/String;)V

    throw p1
.end method

.method private final t(Lz0/j;Lz0/k$d;)V
    .locals 10

    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Li0/g;->e(Ljava/util/Map;)Landroid/net/nsd/NsdServiceInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/net/nsd/NsdServiceInfo;->getServiceType()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Li0/g;->c(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Li0/d;->n(Ljava/lang/String;)Li0/d$c;

    move-result-object v1

    iget-object v2, p0, Li0/d;->f:Ljava/util/HashMap;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, Li0/d$d;

    invoke-direct {v7, p0, v0, v1}, Li0/d$d;-><init>(Li0/d;Landroid/net/nsd/NsdServiceInfo;Li0/d$c;)V

    const/16 v8, 0x1f

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Li1/a;->b(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILq1/a;ILjava/lang/Object;)Ljava/lang/Thread;

    return-void

    :cond_0
    new-instance p1, Li0/e;

    sget-object p2, Li0/a;->f:Li0/a;

    const-string v0, "Cannot resolve service: expected handle"

    invoke-direct {p1, p2, v0}, Li0/e;-><init>(Li0/a;Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Li0/e;

    sget-object p2, Li0/a;->f:Li0/a;

    const-string v0, "Cannot resolve service: expected service info with service name, type"

    invoke-direct {p1, p2, v0}, Li0/e;-><init>(Li0/a;Ljava/lang/String;)V

    throw p1
.end method

.method private final u(Lz0/j;Lz0/k$d;)V
    .locals 4

    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Li0/g;->i(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Li0/g;->c(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Li0/d;->d:Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz v1, :cond_3

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$MulticastLock;->acquire()V

    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Li0/d;->j(Ljava/lang/String;)Li0/d$a;

    move-result-object v1

    iget-object v2, p0, Li0/d;->e:Ljava/util/HashMap;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Li0/d;->a:Landroid/net/nsd/NsdManager;

    const/4 v2, 0x0

    if-nez p1, :cond_1

    const-string p1, "nsdManager"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v2

    :cond_1
    const/4 v3, 0x1

    invoke-virtual {p1, v0, v3, v1}, Landroid/net/nsd/NsdManager;->discoverServices(Ljava/lang/String;ILandroid/net/nsd/NsdManager$DiscoveryListener;)V

    invoke-interface {p2, v2}, Lz0/k$d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Li0/d;->d:Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V

    :cond_2
    throw p1

    :cond_3
    new-instance p1, Li0/e;

    sget-object p2, Li0/a;->j:Li0/a;

    const-string v0, "Missing required permission CHANGE_WIFI_MULTICAST_STATE"

    invoke-direct {p1, p2, v0}, Li0/e;-><init>(Li0/a;Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Li0/e;

    sget-object p2, Li0/a;->f:Li0/a;

    const-string v0, "Cannot start discovery: expected handle"

    invoke-direct {p1, p2, v0}, Li0/e;-><init>(Li0/a;Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Li0/e;

    sget-object p2, Li0/a;->f:Li0/a;

    const-string v0, "Cannot start discovery: expected service type"

    invoke-direct {p1, p2, v0}, Li0/e;-><init>(Li0/a;Ljava/lang/String;)V

    throw p1
.end method

.method private final v(Lz0/j;Lz0/k$d;)V
    .locals 3

    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Li0/g;->c(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Li0/d;->d:Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz v0, :cond_2

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V

    :cond_0
    iget-object v0, p0, Li0/d;->a:Landroid/net/nsd/NsdManager;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const-string v0, "nsdManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    iget-object v2, p0, Li0/d;->e:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/nsd/NsdManager$DiscoveryListener;

    invoke-virtual {v0, p1}, Landroid/net/nsd/NsdManager;->stopServiceDiscovery(Landroid/net/nsd/NsdManager$DiscoveryListener;)V

    invoke-interface {p2, v1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p1, Li0/e;

    sget-object p2, Li0/a;->j:Li0/a;

    const-string v0, "Missing required permission CHANGE_WIFI_MULTICAST_STATE"

    invoke-direct {p1, p2, v0}, Li0/e;-><init>(Li0/a;Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Li0/e;

    sget-object p2, Li0/a;->f:Li0/a;

    const-string v0, "Cannot stop discovery: expected handle"

    invoke-direct {p1, p2, v0}, Li0/e;-><init>(Li0/a;Ljava/lang/String;)V

    throw p1
.end method

.method private final w(Lz0/j;Lz0/k$d;)V
    .locals 2

    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Li0/g;->c(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Li0/d;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/nsd/NsdManager$RegistrationListener;

    iget-object v0, p0, Li0/d;->a:Landroid/net/nsd/NsdManager;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "nsdManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/net/nsd/NsdManager;->unregisterService(Landroid/net/nsd/NsdManager$RegistrationListener;)V

    invoke-interface {p2, v1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Li0/e;

    sget-object p2, Li0/a;->f:Li0/a;

    const-string v0, "Cannot unregister service: handle expected"

    invoke-direct {p1, p2, v0}, Li0/e;-><init>(Li0/a;Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public h(Ls0/a$b;)V
    .locals 2

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ls0/a$b;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "flutterPluginBinding.applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v1, Landroid/net/nsd/NsdManager;

    invoke-static {v0, v1}, Landroidx/core/content/a;->g(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v1, Landroid/net/nsd/NsdManager;

    iput-object v1, p0, Li0/d;->a:Landroid/net/nsd/NsdManager;

    const-class v1, Landroid/net/wifi/WifiManager;

    invoke-static {v0, v1}, Landroidx/core/content/a;->g(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v1, Landroid/net/wifi/WifiManager;

    iput-object v1, p0, Li0/d;->b:Landroid/net/wifi/WifiManager;

    invoke-direct {p0, v0}, Li0/d;->r(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Li0/d;->b:Landroid/net/wifi/WifiManager;

    if-nez v0, :cond_0

    const-string v0, "wifiManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    const-string v1, "nsdMulticastLock"

    invoke-virtual {v0, v1}, Landroid/net/wifi/WifiManager;->createMulticastLock(Ljava/lang/String;)Landroid/net/wifi/WifiManager$MulticastLock;

    move-result-object v0

    iput-object v0, p0, Li0/d;->d:Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/net/wifi/WifiManager$MulticastLock;->setReferenceCounted(Z)V

    :cond_1
    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object p1

    const-string v1, "com.haberey/nsd"

    invoke-direct {v0, p1, v1}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;)V

    iput-object v0, p0, Li0/d;->c:Lz0/k;

    invoke-virtual {v0, p0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li0/d;->c:Lz0/k;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "methodChannel"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1, v0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public m(Lz0/j;Lz0/k$d;)V
    .locals 4

    const-string v0, "methodCall"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lz0/j;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "resolve"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2}, Li0/d;->t(Lz0/j;Lz0/k$d;)V

    goto/16 :goto_1

    :sswitch_1
    const-string v2, "unregister"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p2}, Li0/d;->w(Lz0/j;Lz0/k$d;)V

    goto :goto_1

    :sswitch_2
    const-string v2, "startDiscovery"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1, p2}, Li0/d;->u(Lz0/j;Lz0/k$d;)V

    goto :goto_1

    :sswitch_3
    const-string v2, "register"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-direct {p0, p1, p2}, Li0/d;->s(Lz0/j;Lz0/k$d;)V

    goto :goto_1

    :sswitch_4
    const-string v2, "stopDiscovery"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    invoke-direct {p0, p1, p2}, Li0/d;->v(Lz0/j;Lz0/k$d;)V

    goto :goto_1

    :cond_5
    :goto_0
    invoke-interface {p2}, Lz0/k$d;->b()V
    :try_end_0
    .catch Li0/e; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    sget-object v2, Li0/a;->i:Li0/a;

    invoke-virtual {v2}, Li0/a;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v2, p1, v1}, Lz0/k$d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Li0/e;->a()Li0/a;

    move-result-object v0

    invoke-virtual {v0}, Li0/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Li0/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1, v1}, Lz0/k$d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f218032 -> :sswitch_4
        -0x2923d15d -> :sswitch_3
        -0x1c585092 -> :sswitch_2
        0x31d4943c -> :sswitch_1
        0x416881ec -> :sswitch_0
    .end sparse-switch
.end method
