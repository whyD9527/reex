.class public final Lx1/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/concurrent/Executor;)Lx1/f0;
    .locals 1

    instance-of v0, p0, Lx1/r0;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lx1/r0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Lx1/c1;

    invoke-direct {v0, p0}, Lx1/c1;-><init>(Ljava/util/concurrent/Executor;)V

    goto :goto_1

    :cond_1
    iget-object v0, v0, Lx1/r0;->e:Lx1/f0;

    :goto_1
    return-object v0
.end method
