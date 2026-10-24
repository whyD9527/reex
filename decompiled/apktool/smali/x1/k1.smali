.class public interface abstract Lx1/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/k1$b;,
        Lx1/k1$a;
    }
.end annotation


# static fields
.field public static final d:Lx1/k1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lx1/k1$b;->e:Lx1/k1$b;

    sput-object v0, Lx1/k1;->d:Lx1/k1$b;

    return-void
.end method


# virtual methods
.method public abstract b()Z
.end method

.method public abstract g(Lx1/t;)Lx1/r;
.end method

.method public abstract j()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract k(ZZLq1/l;)Lx1/t0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lq1/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lg1/q;",
            ">;)",
            "Lx1/t0;"
        }
    .end annotation
.end method

.method public abstract n(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract start()Z
.end method
