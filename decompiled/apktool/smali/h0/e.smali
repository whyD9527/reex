.class public Lh0/e;
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

.method private a(Lz0/c;Landroid/content/Context;)V
    .locals 2

    const-string v0, "vibrator"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Vibrator;

    new-instance v0, Lh0/d;

    new-instance v1, Lh0/c;

    invoke-direct {v1, p2}, Lh0/c;-><init>(Landroid/os/Vibrator;)V

    invoke-direct {v0, v1}, Lh0/d;-><init>(Lh0/c;)V

    new-instance p2, Lz0/k;

    const-string v1, "vibration"

    invoke-direct {p2, p1, v1}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;)V

    iput-object p2, p0, Lh0/e;->a:Lz0/k;

    invoke-virtual {p2, v0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lh0/e;->a:Lz0/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lz0/k;->e(Lz0/k$c;)V

    iput-object v1, p0, Lh0/e;->a:Lz0/k;

    return-void
.end method


# virtual methods
.method public h(Ls0/a$b;)V
    .locals 1

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object v0

    invoke-virtual {p1}, Ls0/a$b;->a()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lh0/e;->a(Lz0/c;Landroid/content/Context;)V

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 0

    invoke-direct {p0}, Lh0/e;->b()V

    return-void
.end method
