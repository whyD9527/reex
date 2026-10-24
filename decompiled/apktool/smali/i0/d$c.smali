.class public final Li0/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/net/nsd/NsdManager$ResolveListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/d;->n(Ljava/lang/String;)Li0/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Li0/d;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Li0/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Li0/d$c;->a:Li0/d;

    iput-object p2, p0, Li0/d$c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResolveFailed(Landroid/net/nsd/NsdServiceInfo;I)V
    .locals 1

    const-string v0, "serviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li0/d$c;->b:Ljava/lang/String;

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

    iget-object p2, p0, Li0/d$c;->a:Li0/d;

    invoke-static {p2}, Li0/d;->e(Li0/d;)Ljava/util/HashMap;

    move-result-object p2

    iget-object v0, p0, Li0/d$c;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Li0/d$c;->a:Li0/d;

    invoke-static {p2}, Li0/d;->f(Li0/d;)Ljava/util/concurrent/Semaphore;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/Semaphore;->release()V

    iget-object p2, p0, Li0/d$c;->a:Li0/d;

    const-string v0, "onResolveFailed"

    invoke-static {p2, v0, p1}, Li0/d;->g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onServiceResolved(Landroid/net/nsd/NsdServiceInfo;)V
    .locals 2

    const-string v0, "serviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li0/d$c;->a:Li0/d;

    invoke-static {v0}, Li0/d;->e(Li0/d;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Li0/d$c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Li0/d$c;->b:Ljava/lang/String;

    invoke-static {v0}, Li0/g;->o(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Li0/g;->p(Landroid/net/nsd/NsdServiceInfo;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, p1}, Lh1/x;->h(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Li0/d$c;->a:Li0/d;

    invoke-static {v0}, Li0/d;->f(Li0/d;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    iget-object v0, p0, Li0/d$c;->a:Li0/d;

    const-string v1, "onResolveSuccessful"

    invoke-static {v0, v1, p1}, Li0/d;->g(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
