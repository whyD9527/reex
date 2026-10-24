.class public Lp/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Lp/e;

.field protected b:Lp/e;

.field protected c:Lp/e;

.field protected d:Lp/e;

.field protected e:Lp/e;

.field protected f:Lp/e;

.field protected g:Lp/e;

.field protected h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lp/e;",
            ">;"
        }
    .end annotation
.end field

.field protected i:I

.field protected j:I

.field protected k:F

.field l:I

.field m:I

.field n:I

.field o:Z

.field private p:I

.field private q:Z

.field protected r:Z

.field protected s:Z

.field protected t:Z

.field protected u:Z

.field private v:Z


# direct methods
.method public constructor <init>(Lp/e;IZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lp/c;->k:F

    iput-object p1, p0, Lp/c;->a:Lp/e;

    iput p2, p0, Lp/c;->p:I

    iput-boolean p3, p0, Lp/c;->q:Z

    return-void
.end method

.method private b()V
    .locals 12

    iget v0, p0, Lp/c;->p:I

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lp/c;->a:Lp/e;

    const/4 v3, 0x1

    iput-boolean v3, p0, Lp/c;->o:Z

    const/4 v4, 0x0

    move-object v5, v2

    move v6, v4

    :goto_0
    if-nez v6, :cond_14

    iget v7, p0, Lp/c;->i:I

    add-int/2addr v7, v3

    iput v7, p0, Lp/c;->i:I

    iget-object v7, v2, Lp/e;->x0:[Lp/e;

    iget v8, p0, Lp/c;->p:I

    const/4 v9, 0x0

    aput-object v9, v7, v8

    iget-object v7, v2, Lp/e;->w0:[Lp/e;

    aput-object v9, v7, v8

    invoke-virtual {v2}, Lp/e;->Q()I

    move-result v7

    const/16 v8, 0x8

    if-eq v7, v8, :cond_f

    iget v7, p0, Lp/c;->l:I

    add-int/2addr v7, v3

    iput v7, p0, Lp/c;->l:I

    iget v7, p0, Lp/c;->p:I

    invoke-virtual {v2, v7}, Lp/e;->s(I)Lp/e$b;

    move-result-object v7

    sget-object v8, Lp/e$b;->g:Lp/e$b;

    if-eq v7, v8, :cond_0

    iget v7, p0, Lp/c;->m:I

    iget v10, p0, Lp/c;->p:I

    invoke-virtual {v2, v10}, Lp/e;->C(I)I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lp/c;->m:I

    :cond_0
    iget v7, p0, Lp/c;->m:I

    iget-object v10, v2, Lp/e;->P:[Lp/d;

    aget-object v10, v10, v0

    invoke-virtual {v10}, Lp/d;->e()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lp/c;->m:I

    iget-object v10, v2, Lp/e;->P:[Lp/d;

    add-int/lit8 v11, v0, 0x1

    aget-object v10, v10, v11

    invoke-virtual {v10}, Lp/d;->e()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lp/c;->m:I

    iget v7, p0, Lp/c;->n:I

    iget-object v10, v2, Lp/e;->P:[Lp/d;

    aget-object v10, v10, v0

    invoke-virtual {v10}, Lp/d;->e()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lp/c;->n:I

    iget-object v10, v2, Lp/e;->P:[Lp/d;

    aget-object v10, v10, v11

    invoke-virtual {v10}, Lp/d;->e()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lp/c;->n:I

    iget-object v7, p0, Lp/c;->b:Lp/e;

    if-nez v7, :cond_1

    iput-object v2, p0, Lp/c;->b:Lp/e;

    :cond_1
    iput-object v2, p0, Lp/c;->d:Lp/e;

    iget-object v7, v2, Lp/e;->S:[Lp/e$b;

    iget v10, p0, Lp/c;->p:I

    aget-object v7, v7, v10

    if-ne v7, v8, :cond_f

    iget-object v7, v2, Lp/e;->r:[I

    aget v7, v7, v10

    const/4 v8, 0x0

    if-eqz v7, :cond_2

    const/4 v11, 0x3

    if-eq v7, v11, :cond_2

    if-ne v7, v1, :cond_9

    :cond_2
    iget v7, p0, Lp/c;->j:I

    add-int/2addr v7, v3

    iput v7, p0, Lp/c;->j:I

    iget-object v7, v2, Lp/e;->v0:[F

    aget v7, v7, v10

    cmpl-float v11, v7, v8

    if-lez v11, :cond_3

    iget v11, p0, Lp/c;->k:F

    add-float/2addr v11, v7

    iput v11, p0, Lp/c;->k:F

    :cond_3
    invoke-static {v2, v10}, Lp/c;->c(Lp/e;I)Z

    move-result v10

    if-eqz v10, :cond_6

    cmpg-float v7, v7, v8

    if-gez v7, :cond_4

    iput-boolean v3, p0, Lp/c;->r:Z

    goto :goto_1

    :cond_4
    iput-boolean v3, p0, Lp/c;->s:Z

    :goto_1
    iget-object v7, p0, Lp/c;->h:Ljava/util/ArrayList;

    if-nez v7, :cond_5

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lp/c;->h:Ljava/util/ArrayList;

    :cond_5
    iget-object v7, p0, Lp/c;->h:Ljava/util/ArrayList;

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    iget-object v7, p0, Lp/c;->f:Lp/e;

    if-nez v7, :cond_7

    iput-object v2, p0, Lp/c;->f:Lp/e;

    :cond_7
    iget-object v7, p0, Lp/c;->g:Lp/e;

    if-eqz v7, :cond_8

    iget-object v7, v7, Lp/e;->w0:[Lp/e;

    iget v10, p0, Lp/c;->p:I

    aput-object v2, v7, v10

    :cond_8
    iput-object v2, p0, Lp/c;->g:Lp/e;

    :cond_9
    iget v7, p0, Lp/c;->p:I

    if-nez v7, :cond_b

    iget v7, v2, Lp/e;->p:I

    if-eqz v7, :cond_a

    goto :goto_2

    :cond_a
    iget v7, v2, Lp/e;->s:I

    if-nez v7, :cond_c

    iget v7, v2, Lp/e;->t:I

    if-eqz v7, :cond_e

    goto :goto_2

    :cond_b
    iget v7, v2, Lp/e;->q:I

    if-eqz v7, :cond_d

    :cond_c
    :goto_2
    iput-boolean v4, p0, Lp/c;->o:Z

    goto :goto_3

    :cond_d
    iget v7, v2, Lp/e;->v:I

    if-nez v7, :cond_c

    iget v7, v2, Lp/e;->w:I

    if-eqz v7, :cond_e

    goto :goto_2

    :cond_e
    :goto_3
    iget v7, v2, Lp/e;->W:F

    cmpl-float v7, v7, v8

    if-eqz v7, :cond_f

    iput-boolean v4, p0, Lp/c;->o:Z

    iput-boolean v3, p0, Lp/c;->u:Z

    :cond_f
    if-eq v5, v2, :cond_10

    iget-object v5, v5, Lp/e;->x0:[Lp/e;

    iget v7, p0, Lp/c;->p:I

    aput-object v2, v5, v7

    :cond_10
    iget-object v5, v2, Lp/e;->P:[Lp/d;

    add-int/lit8 v7, v0, 0x1

    aget-object v5, v5, v7

    iget-object v5, v5, Lp/d;->f:Lp/d;

    if-eqz v5, :cond_12

    iget-object v5, v5, Lp/d;->d:Lp/e;

    iget-object v7, v5, Lp/e;->P:[Lp/d;

    aget-object v7, v7, v0

    iget-object v7, v7, Lp/d;->f:Lp/d;

    if-eqz v7, :cond_12

    iget-object v7, v7, Lp/d;->d:Lp/e;

    if-eq v7, v2, :cond_11

    goto :goto_4

    :cond_11
    move-object v9, v5

    :cond_12
    :goto_4
    if-eqz v9, :cond_13

    goto :goto_5

    :cond_13
    move-object v9, v2

    move v6, v3

    :goto_5
    move-object v5, v2

    move-object v2, v9

    goto/16 :goto_0

    :cond_14
    iget-object v1, p0, Lp/c;->b:Lp/e;

    if-eqz v1, :cond_15

    iget v5, p0, Lp/c;->m:I

    iget-object v1, v1, Lp/e;->P:[Lp/d;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lp/d;->e()I

    move-result v1

    sub-int/2addr v5, v1

    iput v5, p0, Lp/c;->m:I

    :cond_15
    iget-object v1, p0, Lp/c;->d:Lp/e;

    if-eqz v1, :cond_16

    iget v5, p0, Lp/c;->m:I

    iget-object v1, v1, Lp/e;->P:[Lp/d;

    add-int/2addr v0, v3

    aget-object v0, v1, v0

    invoke-virtual {v0}, Lp/d;->e()I

    move-result v0

    sub-int/2addr v5, v0

    iput v5, p0, Lp/c;->m:I

    :cond_16
    iput-object v2, p0, Lp/c;->c:Lp/e;

    iget v0, p0, Lp/c;->p:I

    if-nez v0, :cond_17

    iget-boolean v0, p0, Lp/c;->q:Z

    if-eqz v0, :cond_17

    iput-object v2, p0, Lp/c;->e:Lp/e;

    goto :goto_6

    :cond_17
    iget-object v0, p0, Lp/c;->a:Lp/e;

    iput-object v0, p0, Lp/c;->e:Lp/e;

    :goto_6
    iget-boolean v0, p0, Lp/c;->s:Z

    if-eqz v0, :cond_18

    iget-boolean v0, p0, Lp/c;->r:Z

    if-eqz v0, :cond_18

    goto :goto_7

    :cond_18
    move v3, v4

    :goto_7
    iput-boolean v3, p0, Lp/c;->t:Z

    return-void
.end method

.method private static c(Lp/e;I)Z
    .locals 2

    invoke-virtual {p0}, Lp/e;->Q()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lp/e;->S:[Lp/e$b;

    aget-object v0, v0, p1

    sget-object v1, Lp/e$b;->g:Lp/e$b;

    if-ne v0, v1, :cond_1

    iget-object p0, p0, Lp/e;->r:[I

    aget p0, p0, p1

    if-eqz p0, :cond_0

    const/4 p1, 0x3

    if-ne p0, p1, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lp/c;->v:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lp/c;->b()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lp/c;->v:Z

    return-void
.end method
