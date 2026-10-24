.class Ly0/n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly0/n;


# direct methods
.method constructor <init>(Ly0/n;)V
    .locals 0

    iput-object p1, p0, Ly0/n$b;->a:Ly0/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m(Lz0/j;Lz0/k$d;)V
    .locals 2

    iget-object v0, p1, Lz0/j;->a:Ljava/lang/String;

    iget-object p1, p1, Lz0/j;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const-string v1, "get"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "put"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Lz0/k$d;->b()V

    goto :goto_2

    :cond_0
    iget-object v0, p0, Ly0/n$b;->a:Ly0/n;

    check-cast p1, [B

    invoke-static {v0, p1}, Ly0/n;->b(Ly0/n;[B)[B

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    iget-object p1, p0, Ly0/n$b;->a:Ly0/n;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ly0/n;->c(Ly0/n;Z)Z

    iget-object p1, p0, Ly0/n$b;->a:Ly0/n;

    invoke-static {p1}, Ly0/n;->d(Ly0/n;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Ly0/n$b;->a:Ly0/n;

    iget-boolean v0, p1, Ly0/n;->a:Z

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1, p2}, Ly0/n;->f(Ly0/n;Lz0/k$d;)Lz0/k$d;

    goto :goto_2

    :cond_3
    :goto_1
    iget-object p1, p0, Ly0/n$b;->a:Ly0/n;

    invoke-static {p1}, Ly0/n;->a(Ly0/n;)[B

    move-result-object v0

    invoke-static {p1, v0}, Ly0/n;->e(Ly0/n;[B)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :goto_2
    return-void
.end method
