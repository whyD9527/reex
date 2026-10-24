.class public final Li0/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/net/nsd/NsdManager$DiscoveryListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/d;->j(Ljava/lang/String;)Li0/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/net/nsd/NsdServiceInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Li0/d;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Li0/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Li0/d$a;->b:Li0/d;

    iput-object p2, p0, Li0/d$a;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Li0/d$a;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public onDiscoveryStarted(Ljava/lang/String;)V
    .locals 2

    const-string v0, "serviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li0/d$a;->b:Li0/d;

    iget-object v0, p0, Li0/d$a;->c:Ljava/lang/String;

    invoke-static {v0}, Li0/g;->o(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "onDiscoveryStartSuccessful"

    invoke-static {p1, v1, v0}, Li0/d;->g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onDiscoveryStopped(Ljava/lang/String;)V
    .locals 2

    const-string v0, "serviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li0/d$a;->b:Li0/d;

    invoke-static {p1}, Li0/d;->b(Li0/d;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Li0/d$a;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Li0/d$a;->b:Li0/d;

    iget-object v0, p0, Li0/d$a;->c:Ljava/lang/String;

    invoke-static {v0}, Li0/g;->o(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "onDiscoveryStopSuccessful"

    invoke-static {p1, v1, v0}, Li0/d;->g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onServiceFound(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 4

    const-string v0, "serviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li0/d$a;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Li0/d$a;->b:Li0/d;

    instance-of v2, v0, Ljava/util/Collection;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/nsd/NsdServiceInfo;

    invoke-static {v1, v2, p1}, Li0/d;->i(Li0/d;Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdServiceInfo;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x0

    :cond_2
    :goto_0
    if-eqz v3, :cond_3

    iget-object v0, p0, Li0/d$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Li0/d$a;->c:Ljava/lang/String;

    invoke-static {v0}, Li0/g;->o(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Li0/g;->p(Landroid/net/nsd/NsdServiceInfo;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, p1}, Lh1/x;->h(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Li0/d$a;->b:Li0/d;

    const-string v1, "onServiceDiscovered"

    invoke-static {v0, v1, p1}, Li0/d;->g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public onServiceLost(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 4

    const-string v0, "serviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li0/d$a;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Li0/d$a;->b:Li0/d;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/net/nsd/NsdServiceInfo;

    invoke-static {v1, v3, p1}, Li0/d;->i(Li0/d;Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdServiceInfo;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Landroid/net/nsd/NsdServiceInfo;

    if-eqz v2, :cond_2

    iget-object p1, p0, Li0/d$a;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Li0/d$a;->c:Ljava/lang/String;

    invoke-static {p1}, Li0/g;->o(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v2}, Li0/g;->p(Landroid/net/nsd/NsdServiceInfo;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p1, v0}, Lh1/x;->h(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Li0/d$a;->b:Li0/d;

    const-string v1, "onServiceLost"

    invoke-static {v0, v1, p1}, Li0/d;->g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public onStartDiscoveryFailed(Ljava/lang/String;I)V
    .locals 1

    const-string v0, "serviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li0/d$a;->b:Li0/d;

    invoke-static {p1}, Li0/d;->b(Li0/d;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Li0/d$a;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Li0/d$a;->c:Ljava/lang/String;

    invoke-static {p1}, Li0/g;->o(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p2}, Li0/f;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Li0/g;->m(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p1, v0}, Lh1/x;->h(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p2}, Li0/f;->b(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Li0/g;->n(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lh1/x;->h(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Li0/d$a;->b:Li0/d;

    const-string v0, "onDiscoveryStartFailed"

    invoke-static {p2, v0, p1}, Li0/d;->g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onStopDiscoveryFailed(Ljava/lang/String;I)V
    .locals 1

    const-string v0, "serviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li0/d$a;->b:Li0/d;

    invoke-static {p1}, Li0/d;->b(Li0/d;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Li0/d$a;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Li0/d$a;->c:Ljava/lang/String;

    invoke-static {p1}, Li0/g;->o(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p2}, Li0/f;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Li0/g;->m(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p1, v0}, Lh1/x;->h(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p2}, Li0/f;->b(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Li0/g;->n(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lh1/x;->h(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Li0/d$a;->b:Li0/d;

    const-string v0, "onDiscoveryStopFailed"

    invoke-static {p2, v0, p1}, Li0/d;->g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
