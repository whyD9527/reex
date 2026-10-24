.class final Li0/d$d;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lq1/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/d;->t(Lz0/j;Lz0/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/l;",
        "Lq1/a<",
        "Lg1/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic e:Li0/d;

.field final synthetic f:Landroid/net/nsd/NsdServiceInfo;

.field final synthetic g:Li0/d$c;


# direct methods
.method constructor <init>(Li0/d;Landroid/net/nsd/NsdServiceInfo;Li0/d$c;)V
    .locals 0

    iput-object p1, p0, Li0/d$d;->e:Li0/d;

    iput-object p2, p0, Li0/d$d;->f:Landroid/net/nsd/NsdServiceInfo;

    iput-object p3, p0, Li0/d$d;->g:Li0/d$c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Li0/d$d;->e:Li0/d;

    invoke-static {v0}, Li0/d;->f(Li0/d;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V

    iget-object v0, p0, Li0/d$d;->e:Li0/d;

    invoke-static {v0}, Li0/d;->c(Li0/d;)Landroid/net/nsd/NsdManager;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "nsdManager"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Li0/d$d;->f:Landroid/net/nsd/NsdServiceInfo;

    iget-object v2, p0, Li0/d$d;->g:Li0/d$c;

    invoke-virtual {v0, v1, v2}, Landroid/net/nsd/NsdManager;->resolveService(Landroid/net/nsd/NsdServiceInfo;Landroid/net/nsd/NsdManager$ResolveListener;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li0/d$d;->a()V

    sget-object v0, Lg1/q;->a:Lg1/q;

    return-object v0
.end method
