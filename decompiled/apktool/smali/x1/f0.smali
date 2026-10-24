.class public abstract Lx1/f0;
.super Lj1/a;
.source "SourceFile"

# interfaces
.implements Lj1/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/f0$a;
    }
.end annotation


# static fields
.field public static final e:Lx1/f0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/f0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx1/f0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lx1/f0;->e:Lx1/f0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lj1/e;->b:Lj1/e$b;

    invoke-direct {p0, v0}, Lj1/a;-><init>(Lj1/g$c;)V

    return-void
.end method


# virtual methods
.method public final d(Lj1/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/d<",
            "*>;)V"
        }
    .end annotation

    check-cast p1, Lkotlinx/coroutines/internal/f;

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/f;->n()V

    return-void
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

    invoke-static {p0, p1}, Lj1/e$a;->a(Lj1/e;Lj1/g$c;)Lj1/g$b;

    move-result-object p1

    return-object p1
.end method

.method public abstract i(Lj1/g;Ljava/lang/Runnable;)V
.end method

.method public final l(Lj1/d;)Lj1/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj1/d<",
            "-TT;>;)",
            "Lj1/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/internal/f;

    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/internal/f;-><init>(Lx1/f0;Lj1/d;)V

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

    invoke-static {p0, p1}, Lj1/e$a;->b(Lj1/e;Lj1/g$c;)Lj1/g;

    move-result-object p1

    return-object p1
.end method

.method public o(Lj1/g;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lx1/m0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lx1/m0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
