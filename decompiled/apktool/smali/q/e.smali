.class public Lq/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lp/f;

.field private b:Z

.field private c:Z

.field private d:Lp/f;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lq/p;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lq/m;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lq/b$b;

.field private h:Lq/b$a;

.field i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lq/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq/e;->b:Z

    iput-boolean v0, p0, Lq/e;->c:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq/e;->e:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq/e;->f:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Lq/e;->g:Lq/b$b;

    new-instance v0, Lq/b$a;

    invoke-direct {v0}, Lq/b$a;-><init>()V

    iput-object v0, p0, Lq/e;->h:Lq/b$a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lq/e;->i:Ljava/util/ArrayList;

    iput-object p1, p0, Lq/e;->a:Lp/f;

    iput-object p1, p0, Lq/e;->d:Lp/f;

    return-void
.end method

.method private a(Lq/f;IILq/f;Ljava/util/ArrayList;Lq/m;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq/f;",
            "II",
            "Lq/f;",
            "Ljava/util/ArrayList<",
            "Lq/m;",
            ">;",
            "Lq/m;",
            ")V"
        }
    .end annotation

    iget-object p1, p1, Lq/f;->d:Lq/p;

    iget-object v0, p1, Lq/p;->c:Lq/m;

    if-nez v0, :cond_c

    iget-object v0, p0, Lq/e;->a:Lp/f;

    iget-object v1, v0, Lp/e;->e:Lq/l;

    if-eq p1, v1, :cond_c

    iget-object v0, v0, Lp/e;->f:Lq/n;

    if-ne p1, v0, :cond_0

    goto/16 :goto_6

    :cond_0
    if-nez p6, :cond_1

    new-instance p6, Lq/m;

    invoke-direct {p6, p1, p3}, Lq/m;-><init>(Lq/p;I)V

    invoke-virtual {p5, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iput-object p6, p1, Lq/p;->c:Lq/m;

    invoke-virtual {p6, p1}, Lq/m;->a(Lq/p;)V

    iget-object p3, p1, Lq/p;->h:Lq/f;

    iget-object p3, p3, Lq/f;->k:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_2
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/d;

    instance-of v1, v0, Lq/f;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Lq/f;

    const/4 v3, 0x0

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lq/e;->a(Lq/f;IILq/f;Ljava/util/ArrayList;Lq/m;)V

    goto :goto_0

    :cond_3
    iget-object p3, p1, Lq/p;->i:Lq/f;

    iget-object p3, p3, Lq/f;->k:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_4
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/d;

    instance-of v1, v0, Lq/f;

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Lq/f;

    const/4 v3, 0x1

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lq/e;->a(Lq/f;IILq/f;Ljava/util/ArrayList;Lq/m;)V

    goto :goto_1

    :cond_5
    const/4 p3, 0x1

    if-ne p2, p3, :cond_7

    instance-of v0, p1, Lq/n;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Lq/n;

    iget-object v0, v0, Lq/n;->k:Lq/f;

    iget-object v0, v0, Lq/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_6
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/d;

    instance-of v1, v0, Lq/f;

    if-eqz v1, :cond_6

    move-object v1, v0

    check-cast v1, Lq/f;

    const/4 v3, 0x2

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lq/e;->a(Lq/f;IILq/f;Ljava/util/ArrayList;Lq/m;)V

    goto :goto_2

    :cond_7
    iget-object v0, p1, Lq/p;->h:Lq/f;

    iget-object v0, v0, Lq/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lq/f;

    if-ne v1, p4, :cond_8

    iput-boolean p3, p6, Lq/m;->b:Z

    :cond_8
    const/4 v3, 0x0

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lq/e;->a(Lq/f;IILq/f;Ljava/util/ArrayList;Lq/m;)V

    goto :goto_3

    :cond_9
    iget-object v0, p1, Lq/p;->i:Lq/f;

    iget-object v0, v0, Lq/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lq/f;

    if-ne v1, p4, :cond_a

    iput-boolean p3, p6, Lq/m;->b:Z

    :cond_a
    const/4 v3, 0x1

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lq/e;->a(Lq/f;IILq/f;Ljava/util/ArrayList;Lq/m;)V

    goto :goto_4

    :cond_b
    if-ne p2, p3, :cond_c

    instance-of p3, p1, Lq/n;

    if-eqz p3, :cond_c

    check-cast p1, Lq/n;

    iget-object p1, p1, Lq/n;->k:Lq/f;

    iget-object p1, p1, Lq/f;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v1, p3

    check-cast v1, Lq/f;

    const/4 v3, 0x2

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    :try_start_0
    invoke-direct/range {v0 .. v6}, Lq/e;->a(Lq/f;IILq/f;Ljava/util/ArrayList;Lq/m;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :cond_c
    :goto_6
    return-void

    :catchall_0
    move-exception p1

    throw p1
.end method

.method private b(Lp/f;)Z
    .locals 16

    move-object/from16 v0, p1

    iget-object v1, v0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_28

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp/e;

    iget-object v4, v2, Lp/e;->S:[Lp/e$b;

    aget-object v5, v4, v3

    const/4 v10, 0x1

    aget-object v4, v4, v10

    invoke-virtual {v2}, Lp/e;->Q()I

    move-result v6

    const/16 v7, 0x8

    if-ne v6, v7, :cond_1

    :goto_1
    iput-boolean v10, v2, Lp/e;->a:Z

    goto :goto_0

    :cond_1
    iget v6, v2, Lp/e;->u:F

    const/high16 v11, 0x3f800000    # 1.0f

    cmpg-float v6, v6, v11

    const/4 v7, 0x2

    if-gez v6, :cond_2

    sget-object v6, Lp/e$b;->g:Lp/e$b;

    if-ne v5, v6, :cond_2

    iput v7, v2, Lp/e;->p:I

    :cond_2
    iget v6, v2, Lp/e;->x:F

    cmpg-float v6, v6, v11

    if-gez v6, :cond_3

    sget-object v6, Lp/e$b;->g:Lp/e$b;

    if-ne v4, v6, :cond_3

    iput v7, v2, Lp/e;->q:I

    :cond_3
    invoke-virtual {v2}, Lp/e;->t()F

    move-result v6

    const/4 v8, 0x0

    cmpl-float v6, v6, v8

    const/4 v8, 0x3

    if-lez v6, :cond_9

    sget-object v6, Lp/e$b;->g:Lp/e$b;

    if-ne v5, v6, :cond_5

    sget-object v9, Lp/e$b;->f:Lp/e$b;

    if-eq v4, v9, :cond_4

    sget-object v9, Lp/e$b;->e:Lp/e$b;

    if-ne v4, v9, :cond_5

    :cond_4
    iput v8, v2, Lp/e;->p:I

    goto :goto_3

    :cond_5
    if-ne v4, v6, :cond_7

    sget-object v9, Lp/e$b;->f:Lp/e$b;

    if-eq v5, v9, :cond_6

    sget-object v9, Lp/e$b;->e:Lp/e$b;

    if-ne v5, v9, :cond_7

    :cond_6
    :goto_2
    iput v8, v2, Lp/e;->q:I

    goto :goto_3

    :cond_7
    if-ne v5, v6, :cond_9

    if-ne v4, v6, :cond_9

    iget v6, v2, Lp/e;->p:I

    if-nez v6, :cond_8

    iput v8, v2, Lp/e;->p:I

    :cond_8
    iget v6, v2, Lp/e;->q:I

    if-nez v6, :cond_9

    goto :goto_2

    :cond_9
    :goto_3
    sget-object v6, Lp/e$b;->g:Lp/e$b;

    if-ne v5, v6, :cond_b

    iget v9, v2, Lp/e;->p:I

    if-ne v9, v10, :cond_b

    iget-object v9, v2, Lp/e;->H:Lp/d;

    iget-object v9, v9, Lp/d;->f:Lp/d;

    if-eqz v9, :cond_a

    iget-object v9, v2, Lp/e;->J:Lp/d;

    iget-object v9, v9, Lp/d;->f:Lp/d;

    if-nez v9, :cond_b

    :cond_a
    sget-object v5, Lp/e$b;->f:Lp/e$b;

    :cond_b
    move-object v9, v5

    if-ne v4, v6, :cond_d

    iget v5, v2, Lp/e;->q:I

    if-ne v5, v10, :cond_d

    iget-object v5, v2, Lp/e;->I:Lp/d;

    iget-object v5, v5, Lp/d;->f:Lp/d;

    if-eqz v5, :cond_c

    iget-object v5, v2, Lp/e;->K:Lp/d;

    iget-object v5, v5, Lp/d;->f:Lp/d;

    if-nez v5, :cond_d

    :cond_c
    sget-object v4, Lp/e$b;->f:Lp/e$b;

    :cond_d
    move-object v12, v4

    iget-object v4, v2, Lp/e;->e:Lq/l;

    iput-object v9, v4, Lq/p;->d:Lp/e$b;

    iget v5, v2, Lp/e;->p:I

    iput v5, v4, Lq/p;->a:I

    iget-object v4, v2, Lp/e;->f:Lq/n;

    iput-object v12, v4, Lq/p;->d:Lp/e$b;

    iget v13, v2, Lp/e;->q:I

    iput v13, v4, Lq/p;->a:I

    sget-object v4, Lp/e$b;->h:Lp/e$b;

    if-eq v9, v4, :cond_e

    sget-object v14, Lp/e$b;->e:Lp/e$b;

    if-eq v9, v14, :cond_e

    sget-object v14, Lp/e$b;->f:Lp/e$b;

    if-ne v9, v14, :cond_f

    :cond_e
    if-eq v12, v4, :cond_25

    sget-object v14, Lp/e$b;->e:Lp/e$b;

    if-eq v12, v14, :cond_25

    sget-object v14, Lp/e$b;->f:Lp/e$b;

    if-ne v12, v14, :cond_f

    goto/16 :goto_b

    :cond_f
    const/high16 v14, 0x3f000000    # 0.5f

    if-ne v9, v6, :cond_17

    sget-object v15, Lp/e$b;->f:Lp/e$b;

    if-eq v12, v15, :cond_10

    sget-object v11, Lp/e$b;->e:Lp/e$b;

    if-ne v12, v11, :cond_17

    :cond_10
    if-ne v5, v8, :cond_12

    if-ne v12, v15, :cond_11

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v15

    move-object v8, v15

    invoke-direct/range {v4 .. v9}, Lq/e;->l(Lp/e;Lp/e$b;ILp/e$b;I)V

    :cond_11
    invoke-virtual {v2}, Lp/e;->v()I

    move-result v9

    int-to-float v3, v9

    iget v4, v2, Lp/e;->W:F

    mul-float/2addr v3, v4

    add-float/2addr v3, v14

    float-to-int v7, v3

    :goto_4
    sget-object v8, Lp/e$b;->e:Lp/e$b;

    :goto_5
    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v8

    goto/16 :goto_e

    :cond_12
    if-ne v5, v10, :cond_13

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v15

    move-object v8, v12

    invoke-direct/range {v4 .. v9}, Lq/e;->l(Lp/e;Lp/e$b;ILp/e$b;I)V

    iget-object v3, v2, Lp/e;->e:Lq/l;

    iget-object v3, v3, Lq/p;->e:Lq/g;

    invoke-virtual {v2}, Lp/e;->R()I

    move-result v2

    :goto_6
    iput v2, v3, Lq/g;->m:I

    goto/16 :goto_0

    :cond_13
    if-ne v5, v7, :cond_15

    iget-object v11, v0, Lp/e;->S:[Lp/e$b;

    aget-object v11, v11, v3

    sget-object v15, Lp/e$b;->e:Lp/e$b;

    if-eq v11, v15, :cond_14

    if-ne v11, v4, :cond_17

    :cond_14
    iget v3, v2, Lp/e;->u:F

    invoke-virtual/range {p1 .. p1}, Lp/e;->R()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    add-float/2addr v3, v14

    float-to-int v7, v3

    invoke-virtual {v2}, Lp/e;->v()I

    move-result v9

    goto :goto_7

    :cond_15
    iget-object v11, v2, Lp/e;->P:[Lp/d;

    aget-object v7, v11, v3

    iget-object v7, v7, Lp/d;->f:Lp/d;

    if-eqz v7, :cond_16

    aget-object v7, v11, v10

    iget-object v7, v7, Lp/d;->f:Lp/d;

    if-nez v7, :cond_17

    :cond_16
    const/4 v7, 0x0

    const/4 v9, 0x0

    :goto_7
    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v15

    :goto_8
    move-object v8, v12

    goto/16 :goto_e

    :cond_17
    if-ne v12, v6, :cond_20

    sget-object v11, Lp/e$b;->f:Lp/e$b;

    if-eq v9, v11, :cond_18

    sget-object v7, Lp/e$b;->e:Lp/e$b;

    if-ne v9, v7, :cond_20

    :cond_18
    if-ne v13, v8, :cond_1b

    if-ne v9, v11, :cond_19

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v11

    move-object v8, v11

    invoke-direct/range {v4 .. v9}, Lq/e;->l(Lp/e;Lp/e$b;ILp/e$b;I)V

    :cond_19
    invoke-virtual {v2}, Lp/e;->R()I

    move-result v7

    iget v3, v2, Lp/e;->W:F

    invoke-virtual {v2}, Lp/e;->u()I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1a

    const/high16 v4, 0x3f800000    # 1.0f

    div-float v3, v4, v3

    :cond_1a
    int-to-float v4, v7

    mul-float/2addr v4, v3

    add-float/2addr v4, v14

    float-to-int v9, v4

    goto :goto_4

    :cond_1b
    if-ne v13, v10, :cond_1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v9

    move-object v8, v11

    move v9, v3

    invoke-direct/range {v4 .. v9}, Lq/e;->l(Lp/e;Lp/e$b;ILp/e$b;I)V

    goto/16 :goto_a

    :cond_1c
    const/4 v7, 0x2

    if-ne v13, v7, :cond_1e

    iget-object v7, v0, Lp/e;->S:[Lp/e$b;

    aget-object v7, v7, v10

    sget-object v8, Lp/e$b;->e:Lp/e$b;

    if-eq v7, v8, :cond_1d

    if-ne v7, v4, :cond_20

    :cond_1d
    iget v3, v2, Lp/e;->x:F

    invoke-virtual {v2}, Lp/e;->R()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lp/e;->v()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    add-float/2addr v3, v14

    float-to-int v3, v3

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v9

    move v9, v3

    goto/16 :goto_e

    :cond_1e
    iget-object v4, v2, Lp/e;->P:[Lp/d;

    const/4 v7, 0x2

    aget-object v15, v4, v7

    iget-object v7, v15, Lp/d;->f:Lp/d;

    if-eqz v7, :cond_1f

    aget-object v4, v4, v8

    iget-object v4, v4, Lp/d;->f:Lp/d;

    if-nez v4, :cond_20

    :cond_1f
    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v11

    goto :goto_8

    :cond_20
    if-ne v9, v6, :cond_0

    if-ne v12, v6, :cond_0

    if-eq v5, v10, :cond_24

    if-ne v13, v10, :cond_21

    goto :goto_9

    :cond_21
    const/4 v4, 0x2

    if-ne v13, v4, :cond_0

    if-ne v5, v4, :cond_0

    iget-object v4, v0, Lp/e;->S:[Lp/e$b;

    aget-object v3, v4, v3

    sget-object v8, Lp/e$b;->e:Lp/e$b;

    if-eq v3, v8, :cond_22

    if-ne v3, v8, :cond_0

    :cond_22
    aget-object v3, v4, v10

    if-eq v3, v8, :cond_23

    if-ne v3, v8, :cond_0

    :cond_23
    iget v3, v2, Lp/e;->u:F

    iget v4, v2, Lp/e;->x:F

    invoke-virtual/range {p1 .. p1}, Lp/e;->R()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v3, v5

    add-float/2addr v3, v14

    float-to-int v7, v3

    invoke-virtual/range {p1 .. p1}, Lp/e;->v()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v4, v3

    add-float/2addr v4, v14

    float-to-int v9, v4

    goto/16 :goto_5

    :cond_24
    :goto_9
    sget-object v8, Lp/e$b;->f:Lp/e$b;

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v8

    invoke-direct/range {v4 .. v9}, Lq/e;->l(Lp/e;Lp/e$b;ILp/e$b;I)V

    iget-object v3, v2, Lp/e;->e:Lq/l;

    iget-object v3, v3, Lq/p;->e:Lq/g;

    invoke-virtual {v2}, Lp/e;->R()I

    move-result v4

    iput v4, v3, Lq/g;->m:I

    :goto_a
    iget-object v3, v2, Lp/e;->f:Lq/n;

    iget-object v3, v3, Lq/p;->e:Lq/g;

    invoke-virtual {v2}, Lp/e;->v()I

    move-result v2

    goto/16 :goto_6

    :cond_25
    :goto_b
    invoke-virtual {v2}, Lp/e;->R()I

    move-result v3

    if-ne v9, v4, :cond_26

    invoke-virtual/range {p1 .. p1}, Lp/e;->R()I

    move-result v3

    iget-object v5, v2, Lp/e;->H:Lp/d;

    iget v5, v5, Lp/d;->g:I

    sub-int/2addr v3, v5

    iget-object v5, v2, Lp/e;->J:Lp/d;

    iget v5, v5, Lp/d;->g:I

    sub-int/2addr v3, v5

    sget-object v5, Lp/e$b;->e:Lp/e$b;

    move v7, v3

    move-object v6, v5

    goto :goto_c

    :cond_26
    move v7, v3

    move-object v6, v9

    :goto_c
    invoke-virtual {v2}, Lp/e;->v()I

    move-result v3

    if-ne v12, v4, :cond_27

    invoke-virtual/range {p1 .. p1}, Lp/e;->v()I

    move-result v3

    iget-object v4, v2, Lp/e;->I:Lp/d;

    iget v4, v4, Lp/d;->g:I

    sub-int/2addr v3, v4

    iget-object v4, v2, Lp/e;->K:Lp/d;

    iget v4, v4, Lp/d;->g:I

    sub-int/2addr v3, v4

    sget-object v4, Lp/e$b;->e:Lp/e$b;

    move v9, v3

    move-object v8, v4

    goto :goto_d

    :cond_27
    move v9, v3

    move-object v8, v12

    :goto_d
    move-object/from16 v4, p0

    move-object v5, v2

    :goto_e
    invoke-direct/range {v4 .. v9}, Lq/e;->l(Lp/e;Lp/e$b;ILp/e$b;I)V

    iget-object v3, v2, Lp/e;->e:Lq/l;

    iget-object v3, v3, Lq/p;->e:Lq/g;

    invoke-virtual {v2}, Lp/e;->R()I

    move-result v4

    invoke-virtual {v3, v4}, Lq/g;->d(I)V

    iget-object v3, v2, Lp/e;->f:Lq/n;

    iget-object v3, v3, Lq/p;->e:Lq/g;

    invoke-virtual {v2}, Lp/e;->v()I

    move-result v4

    invoke-virtual {v3, v4}, Lq/g;->d(I)V

    goto/16 :goto_1

    :cond_28
    return v3
.end method

.method private e(Lp/f;I)I
    .locals 6

    iget-object v0, p0, Lq/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Lq/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq/m;

    invoke-virtual {v4, p1, p2}, Lq/m;->b(Lp/f;I)J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    long-to-int p1, v1

    return p1
.end method

.method private i(Lq/p;ILjava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq/p;",
            "I",
            "Ljava/util/ArrayList<",
            "Lq/m;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p1, Lq/p;->h:Lq/f;

    iget-object v0, v0, Lq/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq/d;

    instance-of v2, v1, Lq/f;

    if-eqz v2, :cond_1

    move-object v4, v1

    check-cast v4, Lq/f;

    const/4 v6, 0x0

    iget-object v7, p1, Lq/p;->i:Lq/f;

    const/4 v9, 0x0

    move-object v3, p0

    move v5, p2

    move-object v8, p3

    invoke-direct/range {v3 .. v9}, Lq/e;->a(Lq/f;IILq/f;Ljava/util/ArrayList;Lq/m;)V

    goto :goto_0

    :cond_1
    instance-of v2, v1, Lq/p;

    if-eqz v2, :cond_0

    check-cast v1, Lq/p;

    iget-object v3, v1, Lq/p;->h:Lq/f;

    const/4 v5, 0x0

    iget-object v6, p1, Lq/p;->i:Lq/f;

    const/4 v8, 0x0

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v8}, Lq/e;->a(Lq/f;IILq/f;Ljava/util/ArrayList;Lq/m;)V

    goto :goto_0

    :cond_2
    iget-object v0, p1, Lq/p;->i:Lq/f;

    iget-object v0, v0, Lq/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq/d;

    instance-of v2, v1, Lq/f;

    if-eqz v2, :cond_4

    move-object v4, v1

    check-cast v4, Lq/f;

    const/4 v6, 0x1

    iget-object v7, p1, Lq/p;->h:Lq/f;

    const/4 v9, 0x0

    move-object v3, p0

    move v5, p2

    move-object v8, p3

    invoke-direct/range {v3 .. v9}, Lq/e;->a(Lq/f;IILq/f;Ljava/util/ArrayList;Lq/m;)V

    goto :goto_1

    :cond_4
    instance-of v2, v1, Lq/p;

    if-eqz v2, :cond_3

    check-cast v1, Lq/p;

    iget-object v3, v1, Lq/p;->i:Lq/f;

    const/4 v5, 0x1

    iget-object v6, p1, Lq/p;->h:Lq/f;

    const/4 v8, 0x0

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v8}, Lq/e;->a(Lq/f;IILq/f;Ljava/util/ArrayList;Lq/m;)V

    goto :goto_1

    :cond_5
    const/4 v0, 0x1

    if-ne p2, v0, :cond_7

    check-cast p1, Lq/n;

    iget-object p1, p1, Lq/n;->k:Lq/f;

    iget-object p1, p1, Lq/f;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/d;

    instance-of v1, v0, Lq/f;

    if-eqz v1, :cond_6

    move-object v3, v0

    check-cast v3, Lq/f;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v8}, Lq/e;->a(Lq/f;IILq/f;Ljava/util/ArrayList;Lq/m;)V

    goto :goto_2

    :cond_7
    return-void
.end method

.method private l(Lp/e;Lp/e$b;ILp/e$b;I)V
    .locals 1

    iget-object v0, p0, Lq/e;->h:Lq/b$a;

    iput-object p2, v0, Lq/b$a;->a:Lp/e$b;

    iput-object p4, v0, Lq/b$a;->b:Lp/e$b;

    iput p3, v0, Lq/b$a;->c:I

    iput p5, v0, Lq/b$a;->d:I

    iget-object p2, p0, Lq/e;->g:Lq/b$b;

    invoke-interface {p2, p1, v0}, Lq/b$b;->b(Lp/e;Lq/b$a;)V

    iget-object p2, p0, Lq/e;->h:Lq/b$a;

    iget p2, p2, Lq/b$a;->e:I

    invoke-virtual {p1, p2}, Lp/e;->U0(I)V

    iget-object p2, p0, Lq/e;->h:Lq/b$a;

    iget p2, p2, Lq/b$a;->f:I

    invoke-virtual {p1, p2}, Lp/e;->v0(I)V

    iget-object p2, p0, Lq/e;->h:Lq/b$a;

    iget-boolean p2, p2, Lq/b$a;->h:Z

    invoke-virtual {p1, p2}, Lp/e;->u0(Z)V

    iget-object p2, p0, Lq/e;->h:Lq/b$a;

    iget p2, p2, Lq/b$a;->g:I

    invoke-virtual {p1, p2}, Lp/e;->k0(I)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 4

    iget-object v0, p0, Lq/e;->e:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lq/e;->d(Ljava/util/ArrayList;)V

    iget-object v0, p0, Lq/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    sput v0, Lq/m;->h:I

    iget-object v1, p0, Lq/e;->a:Lp/f;

    iget-object v1, v1, Lp/e;->e:Lq/l;

    iget-object v2, p0, Lq/e;->i:Ljava/util/ArrayList;

    invoke-direct {p0, v1, v0, v2}, Lq/e;->i(Lq/p;ILjava/util/ArrayList;)V

    iget-object v1, p0, Lq/e;->a:Lp/f;

    iget-object v1, v1, Lp/e;->f:Lq/n;

    iget-object v2, p0, Lq/e;->i:Ljava/util/ArrayList;

    const/4 v3, 0x1

    invoke-direct {p0, v1, v3, v2}, Lq/e;->i(Lq/p;ILjava/util/ArrayList;)V

    iput-boolean v0, p0, Lq/e;->b:Z

    return-void
.end method

.method public d(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lq/p;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lq/e;->d:Lp/f;

    iget-object v0, v0, Lp/e;->e:Lq/l;

    invoke-virtual {v0}, Lq/l;->f()V

    iget-object v0, p0, Lq/e;->d:Lp/f;

    iget-object v0, v0, Lp/e;->f:Lq/n;

    invoke-virtual {v0}, Lq/n;->f()V

    iget-object v0, p0, Lq/e;->d:Lp/f;

    iget-object v0, v0, Lp/e;->e:Lq/l;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/e;->d:Lp/f;

    iget-object v0, v0, Lp/e;->f:Lq/n;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/e;->d:Lp/f;

    iget-object v0, v0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp/e;

    instance-of v3, v2, Lp/g;

    if-eqz v3, :cond_1

    new-instance v3, Lq/j;

    invoke-direct {v3, v2}, Lq/j;-><init>(Lp/e;)V

    :goto_1
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lp/e;->Z()Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, v2, Lp/e;->c:Lq/c;

    if-nez v3, :cond_2

    new-instance v3, Lq/c;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, Lq/c;-><init>(Lp/e;I)V

    iput-object v3, v2, Lp/e;->c:Lq/c;

    :cond_2
    if-nez v1, :cond_3

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    :cond_3
    iget-object v3, v2, Lp/e;->c:Lq/c;

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    iget-object v3, v2, Lp/e;->e:Lq/l;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    invoke-virtual {v2}, Lp/e;->b0()Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v3, v2, Lp/e;->d:Lq/c;

    if-nez v3, :cond_5

    new-instance v3, Lq/c;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Lq/c;-><init>(Lp/e;I)V

    iput-object v3, v2, Lp/e;->d:Lq/c;

    :cond_5
    if-nez v1, :cond_6

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    :cond_6
    iget-object v3, v2, Lp/e;->d:Lq/c;

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    iget-object v3, v2, Lp/e;->f:Lq/n;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    instance-of v3, v2, Lp/i;

    if-eqz v3, :cond_0

    new-instance v3, Lq/k;

    invoke-direct {v3, v2}, Lq/k;-><init>(Lp/e;)V

    goto :goto_1

    :cond_8
    if-eqz v1, :cond_9

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq/p;

    invoke-virtual {v1}, Lq/p;->f()V

    goto :goto_4

    :cond_a
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq/p;

    iget-object v1, v0, Lq/p;->b:Lp/e;

    iget-object v2, p0, Lq/e;->d:Lp/f;

    if-ne v1, v2, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v0}, Lq/p;->d()V

    goto :goto_5

    :cond_c
    return-void
.end method

.method public f(Z)Z
    .locals 9

    const/4 v0, 0x1

    and-int/2addr p1, v0

    iget-boolean v1, p0, Lq/e;->b:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lq/e;->c:Z

    if-eqz v1, :cond_2

    :cond_0
    iget-object v1, p0, Lq/e;->a:Lp/f;

    iget-object v1, v1, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp/e;

    invoke-virtual {v3}, Lp/e;->l()V

    iput-boolean v2, v3, Lp/e;->a:Z

    iget-object v4, v3, Lp/e;->e:Lq/l;

    invoke-virtual {v4}, Lq/l;->r()V

    iget-object v3, v3, Lp/e;->f:Lq/n;

    invoke-virtual {v3}, Lq/n;->q()V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lq/e;->a:Lp/f;

    invoke-virtual {v1}, Lp/e;->l()V

    iget-object v1, p0, Lq/e;->a:Lp/f;

    iput-boolean v2, v1, Lp/e;->a:Z

    iget-object v1, v1, Lp/e;->e:Lq/l;

    invoke-virtual {v1}, Lq/l;->r()V

    iget-object v1, p0, Lq/e;->a:Lp/f;

    iget-object v1, v1, Lp/e;->f:Lq/n;

    invoke-virtual {v1}, Lq/n;->q()V

    iput-boolean v2, p0, Lq/e;->c:Z

    :cond_2
    iget-object v1, p0, Lq/e;->d:Lp/f;

    invoke-direct {p0, v1}, Lq/e;->b(Lp/f;)Z

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lq/e;->a:Lp/f;

    invoke-virtual {v1, v2}, Lp/e;->V0(I)V

    iget-object v1, p0, Lq/e;->a:Lp/f;

    invoke-virtual {v1, v2}, Lp/e;->W0(I)V

    iget-object v1, p0, Lq/e;->a:Lp/f;

    invoke-virtual {v1, v2}, Lp/e;->s(I)Lp/e$b;

    move-result-object v1

    iget-object v3, p0, Lq/e;->a:Lp/f;

    invoke-virtual {v3, v0}, Lp/e;->s(I)Lp/e$b;

    move-result-object v3

    iget-boolean v4, p0, Lq/e;->b:Z

    if-eqz v4, :cond_4

    invoke-virtual {p0}, Lq/e;->c()V

    :cond_4
    iget-object v4, p0, Lq/e;->a:Lp/f;

    invoke-virtual {v4}, Lp/e;->S()I

    move-result v4

    iget-object v5, p0, Lq/e;->a:Lp/f;

    invoke-virtual {v5}, Lp/e;->T()I

    move-result v5

    iget-object v6, p0, Lq/e;->a:Lp/f;

    iget-object v6, v6, Lp/e;->e:Lq/l;

    iget-object v6, v6, Lq/p;->h:Lq/f;

    invoke-virtual {v6, v4}, Lq/f;->d(I)V

    iget-object v6, p0, Lq/e;->a:Lp/f;

    iget-object v6, v6, Lp/e;->f:Lq/n;

    iget-object v6, v6, Lq/p;->h:Lq/f;

    invoke-virtual {v6, v5}, Lq/f;->d(I)V

    invoke-virtual {p0}, Lq/e;->m()V

    sget-object v6, Lp/e$b;->f:Lp/e$b;

    if-eq v1, v6, :cond_5

    if-ne v3, v6, :cond_9

    :cond_5
    if-eqz p1, :cond_7

    iget-object v6, p0, Lq/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq/p;

    invoke-virtual {v7}, Lq/p;->m()Z

    move-result v7

    if-nez v7, :cond_6

    move p1, v2

    :cond_7
    if-eqz p1, :cond_8

    sget-object v6, Lp/e$b;->f:Lp/e$b;

    if-ne v1, v6, :cond_8

    iget-object v6, p0, Lq/e;->a:Lp/f;

    sget-object v7, Lp/e$b;->e:Lp/e$b;

    invoke-virtual {v6, v7}, Lp/e;->z0(Lp/e$b;)V

    iget-object v6, p0, Lq/e;->a:Lp/f;

    invoke-direct {p0, v6, v2}, Lq/e;->e(Lp/f;I)I

    move-result v7

    invoke-virtual {v6, v7}, Lp/e;->U0(I)V

    iget-object v6, p0, Lq/e;->a:Lp/f;

    iget-object v7, v6, Lp/e;->e:Lq/l;

    iget-object v7, v7, Lq/p;->e:Lq/g;

    invoke-virtual {v6}, Lp/e;->R()I

    move-result v6

    invoke-virtual {v7, v6}, Lq/g;->d(I)V

    :cond_8
    if-eqz p1, :cond_9

    sget-object p1, Lp/e$b;->f:Lp/e$b;

    if-ne v3, p1, :cond_9

    iget-object p1, p0, Lq/e;->a:Lp/f;

    sget-object v6, Lp/e$b;->e:Lp/e$b;

    invoke-virtual {p1, v6}, Lp/e;->Q0(Lp/e$b;)V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    invoke-direct {p0, p1, v0}, Lq/e;->e(Lp/f;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lp/e;->v0(I)V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    iget-object v6, p1, Lp/e;->f:Lq/n;

    iget-object v6, v6, Lq/p;->e:Lq/g;

    invoke-virtual {p1}, Lp/e;->v()I

    move-result p1

    invoke-virtual {v6, p1}, Lq/g;->d(I)V

    :cond_9
    iget-object p1, p0, Lq/e;->a:Lp/f;

    iget-object v6, p1, Lp/e;->S:[Lp/e$b;

    aget-object v6, v6, v2

    sget-object v7, Lp/e$b;->e:Lp/e$b;

    if-eq v6, v7, :cond_b

    sget-object v8, Lp/e$b;->h:Lp/e$b;

    if-ne v6, v8, :cond_a

    goto :goto_1

    :cond_a
    move p1, v2

    goto :goto_2

    :cond_b
    :goto_1
    invoke-virtual {p1}, Lp/e;->R()I

    move-result p1

    add-int/2addr p1, v4

    iget-object v6, p0, Lq/e;->a:Lp/f;

    iget-object v6, v6, Lp/e;->e:Lq/l;

    iget-object v6, v6, Lq/p;->i:Lq/f;

    invoke-virtual {v6, p1}, Lq/f;->d(I)V

    iget-object v6, p0, Lq/e;->a:Lp/f;

    iget-object v6, v6, Lp/e;->e:Lq/l;

    iget-object v6, v6, Lq/p;->e:Lq/g;

    sub-int/2addr p1, v4

    invoke-virtual {v6, p1}, Lq/g;->d(I)V

    invoke-virtual {p0}, Lq/e;->m()V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    iget-object v4, p1, Lp/e;->S:[Lp/e$b;

    aget-object v4, v4, v0

    if-eq v4, v7, :cond_c

    sget-object v6, Lp/e$b;->h:Lp/e$b;

    if-ne v4, v6, :cond_d

    :cond_c
    invoke-virtual {p1}, Lp/e;->v()I

    move-result p1

    add-int/2addr p1, v5

    iget-object v4, p0, Lq/e;->a:Lp/f;

    iget-object v4, v4, Lp/e;->f:Lq/n;

    iget-object v4, v4, Lq/p;->i:Lq/f;

    invoke-virtual {v4, p1}, Lq/f;->d(I)V

    iget-object v4, p0, Lq/e;->a:Lp/f;

    iget-object v4, v4, Lp/e;->f:Lq/n;

    iget-object v4, v4, Lq/p;->e:Lq/g;

    sub-int/2addr p1, v5

    invoke-virtual {v4, p1}, Lq/g;->d(I)V

    :cond_d
    invoke-virtual {p0}, Lq/e;->m()V

    move p1, v0

    :goto_2
    iget-object v4, p0, Lq/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq/p;

    iget-object v6, v5, Lq/p;->b:Lp/e;

    iget-object v7, p0, Lq/e;->a:Lp/f;

    if-ne v6, v7, :cond_e

    iget-boolean v6, v5, Lq/p;->g:Z

    if-nez v6, :cond_e

    goto :goto_3

    :cond_e
    invoke-virtual {v5}, Lq/p;->e()V

    goto :goto_3

    :cond_f
    iget-object v4, p0, Lq/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_10
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq/p;

    if-nez p1, :cond_11

    iget-object v6, v5, Lq/p;->b:Lp/e;

    iget-object v7, p0, Lq/e;->a:Lp/f;

    if-ne v6, v7, :cond_11

    goto :goto_4

    :cond_11
    iget-object v6, v5, Lq/p;->h:Lq/f;

    iget-boolean v6, v6, Lq/f;->j:Z

    if-nez v6, :cond_12

    :goto_5
    move v0, v2

    goto :goto_6

    :cond_12
    iget-object v6, v5, Lq/p;->i:Lq/f;

    iget-boolean v6, v6, Lq/f;->j:Z

    if-nez v6, :cond_13

    instance-of v6, v5, Lq/j;

    if-nez v6, :cond_13

    goto :goto_5

    :cond_13
    iget-object v6, v5, Lq/p;->e:Lq/g;

    iget-boolean v6, v6, Lq/f;->j:Z

    if-nez v6, :cond_10

    instance-of v6, v5, Lq/c;

    if-nez v6, :cond_10

    instance-of v5, v5, Lq/j;

    if-nez v5, :cond_10

    goto :goto_5

    :cond_14
    :goto_6
    iget-object p1, p0, Lq/e;->a:Lp/f;

    invoke-virtual {p1, v1}, Lp/e;->z0(Lp/e$b;)V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    invoke-virtual {p1, v3}, Lp/e;->Q0(Lp/e$b;)V

    return v0
.end method

.method public g(Z)Z
    .locals 4

    iget-boolean p1, p0, Lq/e;->b:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lq/e;->a:Lp/f;

    iget-object p1, p1, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/e;

    invoke-virtual {v1}, Lp/e;->l()V

    iput-boolean v0, v1, Lp/e;->a:Z

    iget-object v2, v1, Lp/e;->e:Lq/l;

    iget-object v3, v2, Lq/p;->e:Lq/g;

    iput-boolean v0, v3, Lq/f;->j:Z

    iput-boolean v0, v2, Lq/p;->g:Z

    invoke-virtual {v2}, Lq/l;->r()V

    iget-object v1, v1, Lp/e;->f:Lq/n;

    iget-object v2, v1, Lq/p;->e:Lq/g;

    iput-boolean v0, v2, Lq/f;->j:Z

    iput-boolean v0, v1, Lq/p;->g:Z

    invoke-virtual {v1}, Lq/n;->q()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lq/e;->a:Lp/f;

    invoke-virtual {p1}, Lp/e;->l()V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    iput-boolean v0, p1, Lp/e;->a:Z

    iget-object p1, p1, Lp/e;->e:Lq/l;

    iget-object v1, p1, Lq/p;->e:Lq/g;

    iput-boolean v0, v1, Lq/f;->j:Z

    iput-boolean v0, p1, Lq/p;->g:Z

    invoke-virtual {p1}, Lq/l;->r()V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    iget-object p1, p1, Lp/e;->f:Lq/n;

    iget-object v1, p1, Lq/p;->e:Lq/g;

    iput-boolean v0, v1, Lq/f;->j:Z

    iput-boolean v0, p1, Lq/p;->g:Z

    invoke-virtual {p1}, Lq/n;->q()V

    invoke-virtual {p0}, Lq/e;->c()V

    :cond_1
    iget-object p1, p0, Lq/e;->d:Lp/f;

    invoke-direct {p0, p1}, Lq/e;->b(Lp/f;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    iget-object p1, p0, Lq/e;->a:Lp/f;

    invoke-virtual {p1, v0}, Lp/e;->V0(I)V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    invoke-virtual {p1, v0}, Lp/e;->W0(I)V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    iget-object p1, p1, Lp/e;->e:Lq/l;

    iget-object p1, p1, Lq/p;->h:Lq/f;

    invoke-virtual {p1, v0}, Lq/f;->d(I)V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    iget-object p1, p1, Lp/e;->f:Lq/n;

    iget-object p1, p1, Lq/p;->h:Lq/f;

    invoke-virtual {p1, v0}, Lq/f;->d(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public h(ZI)Z
    .locals 9

    const/4 v0, 0x1

    and-int/2addr p1, v0

    iget-object v1, p0, Lq/e;->a:Lp/f;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp/e;->s(I)Lp/e$b;

    move-result-object v1

    iget-object v3, p0, Lq/e;->a:Lp/f;

    invoke-virtual {v3, v0}, Lp/e;->s(I)Lp/e$b;

    move-result-object v3

    iget-object v4, p0, Lq/e;->a:Lp/f;

    invoke-virtual {v4}, Lp/e;->S()I

    move-result v4

    iget-object v5, p0, Lq/e;->a:Lp/f;

    invoke-virtual {v5}, Lp/e;->T()I

    move-result v5

    if-eqz p1, :cond_4

    sget-object v6, Lp/e$b;->f:Lp/e$b;

    if-eq v1, v6, :cond_0

    if-ne v3, v6, :cond_4

    :cond_0
    iget-object v6, p0, Lq/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq/p;

    iget v8, v7, Lq/p;->f:I

    if-ne v8, p2, :cond_1

    invoke-virtual {v7}, Lq/p;->m()Z

    move-result v7

    if-nez v7, :cond_1

    move p1, v2

    :cond_2
    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    sget-object p1, Lp/e$b;->f:Lp/e$b;

    if-ne v1, p1, :cond_4

    iget-object p1, p0, Lq/e;->a:Lp/f;

    sget-object v6, Lp/e$b;->e:Lp/e$b;

    invoke-virtual {p1, v6}, Lp/e;->z0(Lp/e$b;)V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    invoke-direct {p0, p1, v2}, Lq/e;->e(Lp/f;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lp/e;->U0(I)V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    iget-object v6, p1, Lp/e;->e:Lq/l;

    iget-object v6, v6, Lq/p;->e:Lq/g;

    invoke-virtual {p1}, Lp/e;->R()I

    move-result p1

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    sget-object p1, Lp/e$b;->f:Lp/e$b;

    if-ne v3, p1, :cond_4

    iget-object p1, p0, Lq/e;->a:Lp/f;

    sget-object v6, Lp/e$b;->e:Lp/e$b;

    invoke-virtual {p1, v6}, Lp/e;->Q0(Lp/e$b;)V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    invoke-direct {p0, p1, v0}, Lq/e;->e(Lp/f;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lp/e;->v0(I)V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    iget-object v6, p1, Lp/e;->f:Lq/n;

    iget-object v6, v6, Lq/p;->e:Lq/g;

    invoke-virtual {p1}, Lp/e;->v()I

    move-result p1

    :goto_0
    invoke-virtual {v6, p1}, Lq/g;->d(I)V

    :cond_4
    iget-object p1, p0, Lq/e;->a:Lp/f;

    if-nez p2, :cond_6

    iget-object v5, p1, Lp/e;->S:[Lp/e$b;

    aget-object v5, v5, v2

    sget-object v6, Lp/e$b;->e:Lp/e$b;

    if-eq v5, v6, :cond_5

    sget-object v6, Lp/e$b;->h:Lp/e$b;

    if-ne v5, v6, :cond_7

    :cond_5
    invoke-virtual {p1}, Lp/e;->R()I

    move-result p1

    add-int/2addr p1, v4

    iget-object v5, p0, Lq/e;->a:Lp/f;

    iget-object v5, v5, Lp/e;->e:Lq/l;

    iget-object v5, v5, Lq/p;->i:Lq/f;

    invoke-virtual {v5, p1}, Lq/f;->d(I)V

    iget-object v5, p0, Lq/e;->a:Lp/f;

    iget-object v5, v5, Lp/e;->e:Lq/l;

    iget-object v5, v5, Lq/p;->e:Lq/g;

    sub-int/2addr p1, v4

    invoke-virtual {v5, p1}, Lq/g;->d(I)V

    goto :goto_2

    :cond_6
    iget-object v4, p1, Lp/e;->S:[Lp/e$b;

    aget-object v4, v4, v0

    sget-object v6, Lp/e$b;->e:Lp/e$b;

    if-eq v4, v6, :cond_8

    sget-object v6, Lp/e$b;->h:Lp/e$b;

    if-ne v4, v6, :cond_7

    goto :goto_1

    :cond_7
    move p1, v2

    goto :goto_3

    :cond_8
    :goto_1
    invoke-virtual {p1}, Lp/e;->v()I

    move-result p1

    add-int/2addr p1, v5

    iget-object v4, p0, Lq/e;->a:Lp/f;

    iget-object v4, v4, Lp/e;->f:Lq/n;

    iget-object v4, v4, Lq/p;->i:Lq/f;

    invoke-virtual {v4, p1}, Lq/f;->d(I)V

    iget-object v4, p0, Lq/e;->a:Lp/f;

    iget-object v4, v4, Lp/e;->f:Lq/n;

    iget-object v4, v4, Lq/p;->e:Lq/g;

    sub-int/2addr p1, v5

    invoke-virtual {v4, p1}, Lq/g;->d(I)V

    :goto_2
    move p1, v0

    :goto_3
    invoke-virtual {p0}, Lq/e;->m()V

    iget-object v4, p0, Lq/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq/p;

    iget v6, v5, Lq/p;->f:I

    if-eq v6, p2, :cond_9

    goto :goto_4

    :cond_9
    iget-object v6, v5, Lq/p;->b:Lp/e;

    iget-object v7, p0, Lq/e;->a:Lp/f;

    if-ne v6, v7, :cond_a

    iget-boolean v6, v5, Lq/p;->g:Z

    if-nez v6, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v5}, Lq/p;->e()V

    goto :goto_4

    :cond_b
    iget-object v4, p0, Lq/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_c
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq/p;

    iget v6, v5, Lq/p;->f:I

    if-eq v6, p2, :cond_d

    goto :goto_5

    :cond_d
    if-nez p1, :cond_e

    iget-object v6, v5, Lq/p;->b:Lp/e;

    iget-object v7, p0, Lq/e;->a:Lp/f;

    if-ne v6, v7, :cond_e

    goto :goto_5

    :cond_e
    iget-object v6, v5, Lq/p;->h:Lq/f;

    iget-boolean v6, v6, Lq/f;->j:Z

    if-nez v6, :cond_f

    :goto_6
    move v0, v2

    goto :goto_7

    :cond_f
    iget-object v6, v5, Lq/p;->i:Lq/f;

    iget-boolean v6, v6, Lq/f;->j:Z

    if-nez v6, :cond_10

    goto :goto_6

    :cond_10
    instance-of v6, v5, Lq/c;

    if-nez v6, :cond_c

    iget-object v5, v5, Lq/p;->e:Lq/g;

    iget-boolean v5, v5, Lq/f;->j:Z

    if-nez v5, :cond_c

    goto :goto_6

    :cond_11
    :goto_7
    iget-object p1, p0, Lq/e;->a:Lp/f;

    invoke-virtual {p1, v1}, Lp/e;->z0(Lp/e$b;)V

    iget-object p1, p0, Lq/e;->a:Lp/f;

    invoke-virtual {p1, v3}, Lp/e;->Q0(Lp/e$b;)V

    return v0
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq/e;->b:Z

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq/e;->c:Z

    return-void
.end method

.method public m()V
    .locals 12

    iget-object v0, p0, Lq/e;->a:Lp/f;

    iget-object v0, v0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/e;

    iget-boolean v2, v1, Lp/e;->a:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v1, Lp/e;->S:[Lp/e$b;

    const/4 v3, 0x0

    aget-object v8, v2, v3

    const/4 v9, 0x1

    aget-object v10, v2, v9

    iget v2, v1, Lp/e;->p:I

    iget v4, v1, Lp/e;->q:I

    sget-object v6, Lp/e$b;->f:Lp/e$b;

    if-eq v8, v6, :cond_3

    sget-object v5, Lp/e$b;->g:Lp/e$b;

    if-ne v8, v5, :cond_2

    if-ne v2, v9, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    goto :goto_2

    :cond_3
    :goto_1
    move v2, v9

    :goto_2
    if-eq v10, v6, :cond_4

    sget-object v5, Lp/e$b;->g:Lp/e$b;

    if-ne v10, v5, :cond_5

    if-ne v4, v9, :cond_5

    :cond_4
    move v3, v9

    :cond_5
    iget-object v4, v1, Lp/e;->e:Lq/l;

    iget-object v4, v4, Lq/p;->e:Lq/g;

    iget-boolean v5, v4, Lq/f;->j:Z

    iget-object v7, v1, Lp/e;->f:Lq/n;

    iget-object v7, v7, Lq/p;->e:Lq/g;

    iget-boolean v11, v7, Lq/f;->j:Z

    if-eqz v5, :cond_6

    if-eqz v11, :cond_6

    sget-object v6, Lp/e$b;->e:Lp/e$b;

    iget v5, v4, Lq/f;->g:I

    iget v7, v7, Lq/f;->g:I

    move-object v2, p0

    move-object v3, v1

    move-object v4, v6

    invoke-direct/range {v2 .. v7}, Lq/e;->l(Lp/e;Lp/e$b;ILp/e$b;I)V

    :goto_3
    iput-boolean v9, v1, Lp/e;->a:Z

    goto :goto_6

    :cond_6
    if-eqz v5, :cond_8

    if-eqz v3, :cond_8

    sget-object v5, Lp/e$b;->e:Lp/e$b;

    iget v8, v4, Lq/f;->g:I

    iget v7, v7, Lq/f;->g:I

    move-object v2, p0

    move-object v3, v1

    move-object v4, v5

    move v5, v8

    invoke-direct/range {v2 .. v7}, Lq/e;->l(Lp/e;Lp/e$b;ILp/e$b;I)V

    sget-object v2, Lp/e$b;->g:Lp/e$b;

    if-ne v10, v2, :cond_7

    iget-object v2, v1, Lp/e;->f:Lq/n;

    iget-object v2, v2, Lq/p;->e:Lq/g;

    invoke-virtual {v1}, Lp/e;->v()I

    move-result v3

    :goto_4
    iput v3, v2, Lq/g;->m:I

    goto :goto_6

    :cond_7
    iget-object v2, v1, Lp/e;->f:Lq/n;

    iget-object v2, v2, Lq/p;->e:Lq/g;

    invoke-virtual {v1}, Lp/e;->v()I

    move-result v3

    :goto_5
    invoke-virtual {v2, v3}, Lq/g;->d(I)V

    goto :goto_3

    :cond_8
    if-eqz v11, :cond_a

    if-eqz v2, :cond_a

    iget v5, v4, Lq/f;->g:I

    sget-object v10, Lp/e$b;->e:Lp/e$b;

    iget v7, v7, Lq/f;->g:I

    move-object v2, p0

    move-object v3, v1

    move-object v4, v6

    move-object v6, v10

    invoke-direct/range {v2 .. v7}, Lq/e;->l(Lp/e;Lp/e$b;ILp/e$b;I)V

    sget-object v2, Lp/e$b;->g:Lp/e$b;

    if-ne v8, v2, :cond_9

    iget-object v2, v1, Lp/e;->e:Lq/l;

    iget-object v2, v2, Lq/p;->e:Lq/g;

    invoke-virtual {v1}, Lp/e;->R()I

    move-result v3

    goto :goto_4

    :cond_9
    iget-object v2, v1, Lp/e;->e:Lq/l;

    iget-object v2, v2, Lq/p;->e:Lq/g;

    invoke-virtual {v1}, Lp/e;->R()I

    move-result v3

    goto :goto_5

    :cond_a
    :goto_6
    iget-boolean v2, v1, Lp/e;->a:Z

    if-eqz v2, :cond_0

    iget-object v2, v1, Lp/e;->f:Lq/n;

    iget-object v2, v2, Lq/n;->l:Lq/g;

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lp/e;->n()I

    move-result v1

    invoke-virtual {v2, v1}, Lq/g;->d(I)V

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method public n(Lq/b$b;)V
    .locals 0

    iput-object p1, p0, Lq/e;->g:Lq/b$b;

    return-void
.end method
