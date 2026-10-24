.class final Lx1/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final e:Lx1/f0;


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lx1/r0;->e:Lx1/f0;

    sget-object v1, Lj1/h;->e:Lj1/h;

    invoke-virtual {v0, v1, p1}, Lx1/f0;->i(Lj1/g;Ljava/lang/Runnable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx1/r0;->e:Lx1/f0;

    invoke-virtual {v0}, Lx1/f0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
