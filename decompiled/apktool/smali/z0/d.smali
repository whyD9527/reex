.class public final Lz0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz0/d$c;,
        Lz0/d$d;,
        Lz0/d$b;
    }
.end annotation


# instance fields
.field private final a:Lz0/c;

.field private final b:Ljava/lang/String;

.field private final c:Lz0/l;

.field private final d:Lz0/c$c;


# direct methods
.method public constructor <init>(Lz0/c;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lz0/r;->b:Lz0/r;

    invoke-direct {p0, p1, p2, v0}, Lz0/d;-><init>(Lz0/c;Ljava/lang/String;Lz0/l;)V

    return-void
.end method

.method public constructor <init>(Lz0/c;Ljava/lang/String;Lz0/l;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lz0/d;-><init>(Lz0/c;Ljava/lang/String;Lz0/l;Lz0/c$c;)V

    return-void
.end method

.method public constructor <init>(Lz0/c;Ljava/lang/String;Lz0/l;Lz0/c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz0/d;->a:Lz0/c;

    iput-object p2, p0, Lz0/d;->b:Ljava/lang/String;

    iput-object p3, p0, Lz0/d;->c:Lz0/l;

    iput-object p4, p0, Lz0/d;->d:Lz0/c$c;

    return-void
.end method

.method static synthetic a(Lz0/d;)Lz0/l;
    .locals 0

    iget-object p0, p0, Lz0/d;->c:Lz0/l;

    return-object p0
.end method

.method static synthetic b(Lz0/d;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lz0/d;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lz0/d;)Lz0/c;
    .locals 0

    iget-object p0, p0, Lz0/d;->a:Lz0/c;

    return-object p0
.end method


# virtual methods
.method public d(Lz0/d$d;)V
    .locals 3

    iget-object v0, p0, Lz0/d;->d:Lz0/c$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz0/d;->a:Lz0/c;

    iget-object v2, p0, Lz0/d;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lz0/d$c;

    invoke-direct {v1, p0, p1}, Lz0/d$c;-><init>(Lz0/d;Lz0/d$d;)V

    :goto_0
    iget-object p1, p0, Lz0/d;->d:Lz0/c$c;

    invoke-interface {v0, v2, v1, p1}, Lz0/c;->e(Ljava/lang/String;Lz0/c$a;Lz0/c$c;)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lz0/d;->a:Lz0/c;

    iget-object v2, p0, Lz0/d;->b:Ljava/lang/String;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Lz0/d$c;

    invoke-direct {v1, p0, p1}, Lz0/d$c;-><init>(Lz0/d;Lz0/d$d;)V

    :goto_1
    invoke-interface {v0, v2, v1}, Lz0/c;->c(Ljava/lang/String;Lz0/c$a;)V

    :goto_2
    return-void
.end method
