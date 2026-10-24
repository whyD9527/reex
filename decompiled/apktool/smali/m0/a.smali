.class public Lm0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;


# instance fields
.field private a:Lz0/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public h(Ls0/a$b;)V
    .locals 2

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object p1

    const-string v1, "sqlite3_flutter_libs"

    invoke-direct {v0, p1, v1}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;)V

    iput-object v0, p0, Lm0/a;->a:Lz0/k;

    new-instance p1, Lm0/a$a;

    invoke-direct {p1, p0}, Lm0/a$a;-><init>(Lm0/a;)V

    invoke-virtual {v0, p1}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    iget-object p1, p0, Lm0/a;->a:Lz0/k;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lz0/k;->e(Lz0/k$c;)V

    iput-object v0, p0, Lm0/a;->a:Lz0/k;

    :cond_0
    return-void
.end method
