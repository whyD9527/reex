.class public final Li0/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/net/nsd/NsdManager$RegistrationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/d;->k(Ljava/lang/String;)Li0/d$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Li0/d;


# direct methods
.method constructor <init>(Ljava/lang/String;Li0/d;)V
    .locals 0

    iput-object p1, p0, Li0/d$b;->a:Ljava/lang/String;

    iput-object p2, p0, Li0/d$b;->b:Li0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRegistrationFailed(Landroid/net/nsd/NsdServiceInfo;I)V
    .locals 1

    const-string v0, "serviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li0/d$b;->b:Li0/d;

    invoke-static {p1}, Li0/d;->d(Li0/d;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Li0/d$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Li0/d$b;->a:Ljava/lang/String;

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

    iget-object p2, p0, Li0/d$b;->b:Li0/d;

    const-string v0, "onRegistrationFailed"

    invoke-static {p2, v0, p1}, Li0/d;->g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onServiceRegistered(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 2

    const-string v0, "registeredServiceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li0/d$b;->a:Ljava/lang/String;

    invoke-static {v0}, Li0/g;->o(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Li0/g;->q(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, p1}, Lh1/x;->h(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Li0/d$b;->b:Li0/d;

    const-string v1, "onRegistrationSuccessful"

    invoke-static {v0, v1, p1}, Li0/d;->g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onServiceUnregistered(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 2

    const-string v0, "serviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li0/d$b;->b:Li0/d;

    invoke-static {p1}, Li0/d;->d(Li0/d;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Li0/d$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Li0/d$b;->b:Li0/d;

    iget-object v0, p0, Li0/d$b;->a:Ljava/lang/String;

    invoke-static {v0}, Li0/g;->o(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "onUnregistrationSuccessful"

    invoke-static {p1, v1, v0}, Li0/d;->g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onUnregistrationFailed(Landroid/net/nsd/NsdServiceInfo;I)V
    .locals 1

    const-string v0, "serviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li0/d$b;->b:Li0/d;

    invoke-static {p1}, Li0/d;->d(Li0/d;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Li0/d$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Li0/d$b;->a:Ljava/lang/String;

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

    iget-object p2, p0, Li0/d$b;->b:Li0/d;

    const-string v0, "onUnregistratioFailed"

    invoke-static {p2, v0, p1}, Li0/d;->g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
