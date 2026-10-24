.class public Ly0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lz0/k;

.field private b:Lp0/a;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lz0/k$d;",
            ">;>;"
        }
    .end annotation
.end field

.field final d:Lz0/k$c;


# direct methods
.method public constructor <init>(Lo0/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly0/b$a;

    invoke-direct {v0, p0}, Ly0/b$a;-><init>(Ly0/b;)V

    iput-object v0, p0, Ly0/b;->d:Lz0/k$c;

    new-instance v1, Lz0/k;

    sget-object v2, Lz0/r;->b:Lz0/r;

    const-string v3, "flutter/deferredcomponent"

    invoke-direct {v1, p1, v3, v2}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;Lz0/l;)V

    iput-object v1, p0, Ly0/b;->a:Lz0/k;

    invoke-virtual {v1, v0}, Lz0/k;->e(Lz0/k$c;)V

    invoke-static {}, Ln0/a;->e()Ln0/a;

    move-result-object p1

    invoke-virtual {p1}, Ln0/a;->a()Lp0/a;

    move-result-object p1

    iput-object p1, p0, Ly0/b;->b:Lp0/a;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ly0/b;->c:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Ly0/b;)Lp0/a;
    .locals 0

    iget-object p0, p0, Ly0/b;->b:Lp0/a;

    return-object p0
.end method

.method static synthetic b(Ly0/b;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ly0/b;->c:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public c(Lp0/a;)V
    .locals 0

    iput-object p1, p0, Ly0/b;->b:Lp0/a;

    return-void
.end method
