.class public final Lb2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb2/a$a;
    }
.end annotation


# static fields
.field public static final g:Lb2/a$a;


# instance fields
.field public final e:Ljava/lang/Throwable;

.field private final f:Lj1/g$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj1/g$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb2/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lb2/a;->g:Lb2/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/a;->e:Ljava/lang/Throwable;

    sget-object p1, Lb2/a;->g:Lb2/a$a;

    iput-object p1, p0, Lb2/a;->f:Lj1/g$c;

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
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj1/g$c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lb2/a;->f:Lj1/g$c;

    return-object v0
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
