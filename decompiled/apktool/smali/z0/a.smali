.class public final Lz0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz0/a$e;,
        Lz0/a$c;,
        Lz0/a$b;,
        Lz0/a$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lz0/c;

.field private final b:Ljava/lang/String;

.field private final c:Lz0/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz0/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final d:Lz0/c$c;


# direct methods
.method public constructor <init>(Lz0/c;Ljava/lang/String;Lz0/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz0/c;",
            "Ljava/lang/String;",
            "Lz0/i<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lz0/a;-><init>(Lz0/c;Ljava/lang/String;Lz0/i;Lz0/c$c;)V

    return-void
.end method

.method public constructor <init>(Lz0/c;Ljava/lang/String;Lz0/i;Lz0/c$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz0/c;",
            "Ljava/lang/String;",
            "Lz0/i<",
            "TT;>;",
            "Lz0/c$c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz0/a;->a:Lz0/c;

    iput-object p2, p0, Lz0/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lz0/a;->c:Lz0/i;

    iput-object p4, p0, Lz0/a;->d:Lz0/c$c;

    return-void
.end method

.method static synthetic a(Lz0/a;)Lz0/i;
    .locals 0

    iget-object p0, p0, Lz0/a;->c:Lz0/i;

    return-object p0
.end method

.method static synthetic b(Lz0/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lz0/a;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lz0/a;->d(Ljava/lang/Object;Lz0/a$e;)V

    return-void
.end method

.method public d(Ljava/lang/Object;Lz0/a$e;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lz0/a$e<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lz0/a;->a:Lz0/c;

    iget-object v1, p0, Lz0/a;->b:Ljava/lang/String;

    iget-object v2, p0, Lz0/a;->c:Lz0/i;

    invoke-interface {v2, p1}, Lz0/i;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    const/4 v2, 0x0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Lz0/a$c;

    invoke-direct {v3, p0, p2, v2}, Lz0/a$c;-><init>(Lz0/a;Lz0/a$e;Lz0/a$a;)V

    move-object v2, v3

    :goto_0
    invoke-interface {v0, v1, p1, v2}, Lz0/c;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;Lz0/c$b;)V

    return-void
.end method

.method public e(Lz0/a$d;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz0/a$d<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lz0/a;->d:Lz0/c$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz0/a;->a:Lz0/c;

    iget-object v2, p0, Lz0/a;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Lz0/a$b;

    invoke-direct {v3, p0, p1, v1}, Lz0/a$b;-><init>(Lz0/a;Lz0/a$d;Lz0/a$a;)V

    move-object v1, v3

    :goto_0
    iget-object p1, p0, Lz0/a;->d:Lz0/c$c;

    invoke-interface {v0, v2, v1, p1}, Lz0/c;->e(Ljava/lang/String;Lz0/c$a;Lz0/c$c;)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lz0/a;->a:Lz0/c;

    iget-object v2, p0, Lz0/a;->b:Ljava/lang/String;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v3, Lz0/a$b;

    invoke-direct {v3, p0, p1, v1}, Lz0/a$b;-><init>(Lz0/a;Lz0/a$d;Lz0/a$a;)V

    move-object v1, v3

    :goto_1
    invoke-interface {v0, v2, v1}, Lz0/c;->c(Ljava/lang/String;Lz0/c$a;)V

    :goto_2
    return-void
.end method
