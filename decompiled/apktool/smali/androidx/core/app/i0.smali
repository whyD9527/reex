.class public Landroidx/core/app/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/app/i0$b;,
        Landroidx/core/app/i0$a;
    }
.end annotation


# instance fields
.field a:Ljava/lang/CharSequence;

.field b:Landroidx/core/graphics/drawable/IconCompat;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Z

.field f:Z


# direct methods
.method constructor <init>(Landroidx/core/app/i0$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Landroidx/core/app/i0$b;->a:Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/core/app/i0;->a:Ljava/lang/CharSequence;

    iget-object v0, p1, Landroidx/core/app/i0$b;->b:Landroidx/core/graphics/drawable/IconCompat;

    iput-object v0, p0, Landroidx/core/app/i0;->b:Landroidx/core/graphics/drawable/IconCompat;

    iget-object v0, p1, Landroidx/core/app/i0$b;->c:Ljava/lang/String;

    iput-object v0, p0, Landroidx/core/app/i0;->c:Ljava/lang/String;

    iget-object v0, p1, Landroidx/core/app/i0$b;->d:Ljava/lang/String;

    iput-object v0, p0, Landroidx/core/app/i0;->d:Ljava/lang/String;

    iget-boolean v0, p1, Landroidx/core/app/i0$b;->e:Z

    iput-boolean v0, p0, Landroidx/core/app/i0;->e:Z

    iget-boolean p1, p1, Landroidx/core/app/i0$b;->f:Z

    iput-boolean p1, p0, Landroidx/core/app/i0;->f:Z

    return-void
.end method


# virtual methods
.method public a()Landroidx/core/graphics/drawable/IconCompat;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/i0;->b:Landroidx/core/graphics/drawable/IconCompat;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/i0;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/i0;->a:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/i0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/core/app/i0;->e:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/core/app/i0;->f:Z

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Landroidx/core/app/i0;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/core/app/i0;->a:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "name:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/core/app/i0;->a:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public h()Landroid/app/Person;
    .locals 1

    invoke-static {p0}, Landroidx/core/app/i0$a;->b(Landroidx/core/app/i0;)Landroid/app/Person;

    move-result-object v0

    return-object v0
.end method
