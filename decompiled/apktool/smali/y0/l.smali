.class public Ly0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/l$g;,
        Ly0/l$f;,
        Ly0/l$b;,
        Ly0/l$c;,
        Ly0/l$e;,
        Ly0/l$d;
    }
.end annotation


# instance fields
.field private final a:Lz0/k;

.field private b:Ly0/l$g;

.field private final c:Lz0/k$c;


# direct methods
.method public constructor <init>(Lo0/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly0/l$a;

    invoke-direct {v0, p0}, Ly0/l$a;-><init>(Ly0/l;)V

    iput-object v0, p0, Ly0/l;->c:Lz0/k$c;

    new-instance v1, Lz0/k;

    sget-object v2, Lz0/r;->b:Lz0/r;

    const-string v3, "flutter/platform_views"

    invoke-direct {v1, p1, v3, v2}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;Lz0/l;)V

    iput-object v1, p0, Ly0/l;->a:Lz0/k;

    invoke-virtual {v1, v0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method static synthetic a(Ly0/l;)Ly0/l$g;
    .locals 0

    iget-object p0, p0, Ly0/l;->b:Ly0/l$g;

    return-object p0
.end method

.method static synthetic b(Ljava/lang/Exception;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ly0/l;->c(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static c(Ljava/lang/Exception;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ln0/b;->d(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d(I)V
    .locals 2

    iget-object v0, p0, Ly0/l;->a:Lz0/k;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v1, "viewFocused"

    invoke-virtual {v0, v1, p1}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Ly0/l$g;)V
    .locals 0

    iput-object p1, p0, Ly0/l;->b:Ly0/l$g;

    return-void
.end method
