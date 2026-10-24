.class Lq/j;
.super Lq/p;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lp/e;)V
    .locals 1

    invoke-direct {p0, p1}, Lq/p;-><init>(Lp/e;)V

    iget-object v0, p1, Lp/e;->e:Lq/l;

    invoke-virtual {v0}, Lq/l;->f()V

    iget-object v0, p1, Lp/e;->f:Lq/n;

    invoke-virtual {v0}, Lq/n;->f()V

    check-cast p1, Lp/g;

    invoke-virtual {p1}, Lp/g;->b1()I

    move-result p1

    iput p1, p0, Lq/p;->f:I

    return-void
.end method

.method private q(Lq/f;)V
    .locals 1

    iget-object v0, p0, Lq/p;->h:Lq/f;

    iget-object v0, v0, Lq/f;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Lq/f;->l:Ljava/util/List;

    iget-object v0, p0, Lq/p;->h:Lq/f;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(Lq/d;)V
    .locals 2

    iget-object p1, p0, Lq/p;->h:Lq/f;

    iget-boolean v0, p1, Lq/f;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p1, Lq/f;->j:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p1, Lq/f;->l:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq/f;

    iget-object v0, p0, Lq/p;->b:Lp/e;

    check-cast v0, Lp/g;

    const/high16 v1, 0x3f000000    # 0.5f

    iget p1, p1, Lq/f;->g:I

    int-to-float p1, p1

    invoke-virtual {v0}, Lp/g;->e1()F

    move-result v0

    mul-float/2addr p1, v0

    add-float/2addr p1, v1

    float-to-int p1, p1

    iget-object v0, p0, Lq/p;->h:Lq/f;

    invoke-virtual {v0, p1}, Lq/f;->d(I)V

    return-void
.end method

.method d()V
    .locals 5

    iget-object v0, p0, Lq/p;->b:Lp/e;

    check-cast v0, Lp/g;

    invoke-virtual {v0}, Lp/g;->c1()I

    move-result v1

    invoke-virtual {v0}, Lp/g;->d1()I

    move-result v2

    invoke-virtual {v0}, Lp/g;->e1()F

    invoke-virtual {v0}, Lp/g;->b1()I

    move-result v0

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lq/p;->h:Lq/f;

    if-eq v1, v4, :cond_0

    iget-object v0, v0, Lq/f;->l:Ljava/util/List;

    iget-object v2, p0, Lq/p;->b:Lp/e;

    iget-object v2, v2, Lp/e;->T:Lp/e;

    iget-object v2, v2, Lp/e;->e:Lq/l;

    iget-object v2, v2, Lq/p;->h:Lq/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/p;->b:Lp/e;

    iget-object v0, v0, Lp/e;->T:Lp/e;

    iget-object v0, v0, Lp/e;->e:Lq/l;

    iget-object v0, v0, Lq/p;->h:Lq/f;

    iget-object v0, v0, Lq/f;->k:Ljava/util/List;

    iget-object v2, p0, Lq/p;->h:Lq/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/p;->h:Lq/f;

    :goto_0
    iput v1, v0, Lq/f;->f:I

    goto :goto_1

    :cond_0
    if-eq v2, v4, :cond_1

    iget-object v0, v0, Lq/f;->l:Ljava/util/List;

    iget-object v1, p0, Lq/p;->b:Lp/e;

    iget-object v1, v1, Lp/e;->T:Lp/e;

    iget-object v1, v1, Lp/e;->e:Lq/l;

    iget-object v1, v1, Lq/p;->i:Lq/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/p;->b:Lp/e;

    iget-object v0, v0, Lp/e;->T:Lp/e;

    iget-object v0, v0, Lp/e;->e:Lq/l;

    iget-object v0, v0, Lq/p;->i:Lq/f;

    iget-object v0, v0, Lq/f;->k:Ljava/util/List;

    iget-object v1, p0, Lq/p;->h:Lq/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/p;->h:Lq/f;

    neg-int v1, v2

    goto :goto_0

    :cond_1
    iput-boolean v3, v0, Lq/f;->b:Z

    iget-object v0, v0, Lq/f;->l:Ljava/util/List;

    iget-object v1, p0, Lq/p;->b:Lp/e;

    iget-object v1, v1, Lp/e;->T:Lp/e;

    iget-object v1, v1, Lp/e;->e:Lq/l;

    iget-object v1, v1, Lq/p;->i:Lq/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/p;->b:Lp/e;

    iget-object v0, v0, Lp/e;->T:Lp/e;

    iget-object v0, v0, Lp/e;->e:Lq/l;

    iget-object v0, v0, Lq/p;->i:Lq/f;

    iget-object v0, v0, Lq/f;->k:Ljava/util/List;

    iget-object v1, p0, Lq/p;->h:Lq/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, Lq/p;->b:Lp/e;

    iget-object v0, v0, Lp/e;->e:Lq/l;

    iget-object v0, v0, Lq/p;->h:Lq/f;

    invoke-direct {p0, v0}, Lq/j;->q(Lq/f;)V

    iget-object v0, p0, Lq/p;->b:Lp/e;

    iget-object v0, v0, Lp/e;->e:Lq/l;

    goto :goto_4

    :cond_2
    iget-object v0, p0, Lq/p;->h:Lq/f;

    if-eq v1, v4, :cond_3

    iget-object v0, v0, Lq/f;->l:Ljava/util/List;

    iget-object v2, p0, Lq/p;->b:Lp/e;

    iget-object v2, v2, Lp/e;->T:Lp/e;

    iget-object v2, v2, Lp/e;->f:Lq/n;

    iget-object v2, v2, Lq/p;->h:Lq/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/p;->b:Lp/e;

    iget-object v0, v0, Lp/e;->T:Lp/e;

    iget-object v0, v0, Lp/e;->f:Lq/n;

    iget-object v0, v0, Lq/p;->h:Lq/f;

    iget-object v0, v0, Lq/f;->k:Ljava/util/List;

    iget-object v2, p0, Lq/p;->h:Lq/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/p;->h:Lq/f;

    :goto_2
    iput v1, v0, Lq/f;->f:I

    goto :goto_3

    :cond_3
    if-eq v2, v4, :cond_4

    iget-object v0, v0, Lq/f;->l:Ljava/util/List;

    iget-object v1, p0, Lq/p;->b:Lp/e;

    iget-object v1, v1, Lp/e;->T:Lp/e;

    iget-object v1, v1, Lp/e;->f:Lq/n;

    iget-object v1, v1, Lq/p;->i:Lq/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/p;->b:Lp/e;

    iget-object v0, v0, Lp/e;->T:Lp/e;

    iget-object v0, v0, Lp/e;->f:Lq/n;

    iget-object v0, v0, Lq/p;->i:Lq/f;

    iget-object v0, v0, Lq/f;->k:Ljava/util/List;

    iget-object v1, p0, Lq/p;->h:Lq/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/p;->h:Lq/f;

    neg-int v1, v2

    goto :goto_2

    :cond_4
    iput-boolean v3, v0, Lq/f;->b:Z

    iget-object v0, v0, Lq/f;->l:Ljava/util/List;

    iget-object v1, p0, Lq/p;->b:Lp/e;

    iget-object v1, v1, Lp/e;->T:Lp/e;

    iget-object v1, v1, Lp/e;->f:Lq/n;

    iget-object v1, v1, Lq/p;->i:Lq/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/p;->b:Lp/e;

    iget-object v0, v0, Lp/e;->T:Lp/e;

    iget-object v0, v0, Lp/e;->f:Lq/n;

    iget-object v0, v0, Lq/p;->i:Lq/f;

    iget-object v0, v0, Lq/f;->k:Ljava/util/List;

    iget-object v1, p0, Lq/p;->h:Lq/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    iget-object v0, p0, Lq/p;->b:Lp/e;

    iget-object v0, v0, Lp/e;->f:Lq/n;

    iget-object v0, v0, Lq/p;->h:Lq/f;

    invoke-direct {p0, v0}, Lq/j;->q(Lq/f;)V

    iget-object v0, p0, Lq/p;->b:Lp/e;

    iget-object v0, v0, Lp/e;->f:Lq/n;

    :goto_4
    iget-object v0, v0, Lq/p;->i:Lq/f;

    invoke-direct {p0, v0}, Lq/j;->q(Lq/f;)V

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lq/p;->b:Lp/e;

    check-cast v0, Lp/g;

    invoke-virtual {v0}, Lp/g;->b1()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lq/p;->b:Lp/e;

    iget-object v1, p0, Lq/p;->h:Lq/f;

    iget v1, v1, Lq/f;->g:I

    invoke-virtual {v0, v1}, Lp/e;->V0(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lq/p;->b:Lp/e;

    iget-object v1, p0, Lq/p;->h:Lq/f;

    iget v1, v1, Lq/f;->g:I

    invoke-virtual {v0, v1}, Lp/e;->W0(I)V

    :goto_0
    return-void
.end method

.method f()V
    .locals 1

    iget-object v0, p0, Lq/p;->h:Lq/f;

    invoke-virtual {v0}, Lq/f;->c()V

    return-void
.end method

.method m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
