.class final Lx1/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/g$b;
.implements Lj1/g$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj1/g$b;",
        "Lj1/g$c<",
        "Lx1/e2;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lx1/e2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx1/e2;

    invoke-direct {v0}, Lx1/e2;-><init>()V

    sput-object v0, Lx1/e2;->e:Lx1/e2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public fold(Ljava/lang/Object;Lq1/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lq1/p<",
            "-TR;-",
            "Lj1/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lj1/g$b$a;->a(Lj1/g$b;Ljava/lang/Object;Lq1/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Lj1/g$c;)Lj1/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lj1/g$b;",
            ">(",
            "Lj1/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lj1/g$b$a;->b(Lj1/g$b;Lj1/g$c;)Lj1/g$b;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lj1/g$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj1/g$c<",
            "*>;"
        }
    .end annotation

    return-object p0
.end method

.method public minusKey(Lj1/g$c;)Lj1/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/g$c<",
            "*>;)",
            "Lj1/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Lj1/g$b$a;->c(Lj1/g$b;Lj1/g$c;)Lj1/g;

    move-result-object p1

    return-object p1
.end method

.method public plus(Lj1/g;)Lj1/g;
    .locals 0

    invoke-static {p0, p1}, Lj1/g$b$a;->d(Lj1/g$b;Lj1/g;)Lj1/g;

    move-result-object p1

    return-object p1
.end method
