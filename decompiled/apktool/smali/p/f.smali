.class public Lp/f;
.super Lp/l;
.source "SourceFile"


# instance fields
.field E0:Lq/b;

.field public F0:Lq/e;

.field protected G0:Lq/b$b;

.field private H0:Z

.field protected I0:Lo/d;

.field J0:I

.field K0:I

.field L0:I

.field M0:I

.field public N0:I

.field public O0:I

.field P0:[Lp/c;

.field Q0:[Lp/c;

.field public R0:Z

.field public S0:Z

.field public T0:Z

.field public U0:I

.field public V0:I

.field private W0:I

.field public X0:Z

.field private Y0:Z

.field private Z0:Z

.field a1:I

.field private b1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lp/d;",
            ">;"
        }
    .end annotation
.end field

.field private c1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lp/d;",
            ">;"
        }
    .end annotation
.end field

.field private d1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lp/d;",
            ">;"
        }
    .end annotation
.end field

.field private e1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lp/d;",
            ">;"
        }
    .end annotation
.end field

.field public f1:Lq/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lp/l;-><init>()V

    new-instance v0, Lq/b;

    invoke-direct {v0, p0}, Lq/b;-><init>(Lp/f;)V

    iput-object v0, p0, Lp/f;->E0:Lq/b;

    new-instance v0, Lq/e;

    invoke-direct {v0, p0}, Lq/e;-><init>(Lp/f;)V

    iput-object v0, p0, Lp/f;->F0:Lq/e;

    const/4 v0, 0x0

    iput-object v0, p0, Lp/f;->G0:Lq/b$b;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lp/f;->H0:Z

    new-instance v2, Lo/d;

    invoke-direct {v2}, Lo/d;-><init>()V

    iput-object v2, p0, Lp/f;->I0:Lo/d;

    iput v1, p0, Lp/f;->N0:I

    iput v1, p0, Lp/f;->O0:I

    const/4 v2, 0x4

    new-array v3, v2, [Lp/c;

    iput-object v3, p0, Lp/f;->P0:[Lp/c;

    new-array v2, v2, [Lp/c;

    iput-object v2, p0, Lp/f;->Q0:[Lp/c;

    iput-boolean v1, p0, Lp/f;->R0:Z

    iput-boolean v1, p0, Lp/f;->S0:Z

    iput-boolean v1, p0, Lp/f;->T0:Z

    iput v1, p0, Lp/f;->U0:I

    iput v1, p0, Lp/f;->V0:I

    const/16 v2, 0x101

    iput v2, p0, Lp/f;->W0:I

    iput-boolean v1, p0, Lp/f;->X0:Z

    iput-boolean v1, p0, Lp/f;->Y0:Z

    iput-boolean v1, p0, Lp/f;->Z0:Z

    iput v1, p0, Lp/f;->a1:I

    iput-object v0, p0, Lp/f;->b1:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lp/f;->c1:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lp/f;->d1:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lp/f;->e1:Ljava/lang/ref/WeakReference;

    new-instance v0, Lq/b$a;

    invoke-direct {v0}, Lq/b$a;-><init>()V

    iput-object v0, p0, Lp/f;->f1:Lq/b$a;

    return-void
.end method

.method public static A1(Lp/e;Lq/b$b;Lq/b$a;I)Z
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lp/e;->y()Lp/e$b;

    move-result-object v1

    iput-object v1, p2, Lq/b$a;->a:Lp/e$b;

    invoke-virtual {p0}, Lp/e;->O()Lp/e$b;

    move-result-object v1

    iput-object v1, p2, Lq/b$a;->b:Lp/e$b;

    invoke-virtual {p0}, Lp/e;->R()I

    move-result v1

    iput v1, p2, Lq/b$a;->c:I

    invoke-virtual {p0}, Lp/e;->v()I

    move-result v1

    iput v1, p2, Lq/b$a;->d:I

    iput-boolean v0, p2, Lq/b$a;->i:Z

    iput p3, p2, Lq/b$a;->j:I

    iget-object p3, p2, Lq/b$a;->a:Lp/e$b;

    sget-object v1, Lp/e$b;->g:Lp/e$b;

    const/4 v2, 0x1

    if-ne p3, v1, :cond_1

    move p3, v2

    goto :goto_0

    :cond_1
    move p3, v0

    :goto_0
    iget-object v3, p2, Lq/b$a;->b:Lp/e$b;

    if-ne v3, v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    move v1, v0

    :goto_1
    const/4 v3, 0x0

    if-eqz p3, :cond_3

    iget v4, p0, Lp/e;->W:F

    cmpl-float v4, v4, v3

    if-lez v4, :cond_3

    move v4, v2

    goto :goto_2

    :cond_3
    move v4, v0

    :goto_2
    if-eqz v1, :cond_4

    iget v5, p0, Lp/e;->W:F

    cmpl-float v3, v5, v3

    if-lez v3, :cond_4

    move v3, v2

    goto :goto_3

    :cond_4
    move v3, v0

    :goto_3
    if-eqz p3, :cond_6

    invoke-virtual {p0, v0}, Lp/e;->V(I)Z

    move-result v5

    if-eqz v5, :cond_6

    iget v5, p0, Lp/e;->p:I

    if-nez v5, :cond_6

    if-nez v4, :cond_6

    sget-object p3, Lp/e$b;->f:Lp/e$b;

    iput-object p3, p2, Lq/b$a;->a:Lp/e$b;

    if-eqz v1, :cond_5

    iget p3, p0, Lp/e;->q:I

    if-nez p3, :cond_5

    sget-object p3, Lp/e$b;->e:Lp/e$b;

    iput-object p3, p2, Lq/b$a;->a:Lp/e$b;

    :cond_5
    move p3, v0

    :cond_6
    if-eqz v1, :cond_8

    invoke-virtual {p0, v2}, Lp/e;->V(I)Z

    move-result v5

    if-eqz v5, :cond_8

    iget v5, p0, Lp/e;->q:I

    if-nez v5, :cond_8

    if-nez v3, :cond_8

    sget-object v1, Lp/e$b;->f:Lp/e$b;

    iput-object v1, p2, Lq/b$a;->b:Lp/e$b;

    if-eqz p3, :cond_7

    iget v1, p0, Lp/e;->p:I

    if-nez v1, :cond_7

    sget-object v1, Lp/e$b;->e:Lp/e$b;

    iput-object v1, p2, Lq/b$a;->b:Lp/e$b;

    :cond_7
    move v1, v0

    :cond_8
    invoke-virtual {p0}, Lp/e;->e0()Z

    move-result v5

    if-eqz v5, :cond_9

    sget-object p3, Lp/e$b;->e:Lp/e$b;

    iput-object p3, p2, Lq/b$a;->a:Lp/e$b;

    move p3, v0

    :cond_9
    invoke-virtual {p0}, Lp/e;->f0()Z

    move-result v5

    if-eqz v5, :cond_a

    sget-object v1, Lp/e$b;->e:Lp/e$b;

    iput-object v1, p2, Lq/b$a;->b:Lp/e$b;

    move v1, v0

    :cond_a
    const/4 v5, -0x1

    const/4 v6, 0x4

    if-eqz v4, :cond_f

    iget-object v4, p0, Lp/e;->r:[I

    aget v0, v4, v0

    if-ne v0, v6, :cond_b

    sget-object v0, Lp/e$b;->e:Lp/e$b;

    iput-object v0, p2, Lq/b$a;->a:Lp/e$b;

    goto :goto_7

    :cond_b
    if-nez v1, :cond_f

    iget-object v0, p2, Lq/b$a;->b:Lp/e$b;

    sget-object v1, Lp/e$b;->e:Lp/e$b;

    if-ne v0, v1, :cond_c

    iget v0, p2, Lq/b$a;->d:I

    goto :goto_4

    :cond_c
    sget-object v0, Lp/e$b;->f:Lp/e$b;

    iput-object v0, p2, Lq/b$a;->a:Lp/e$b;

    invoke-interface {p1, p0, p2}, Lq/b$b;->b(Lp/e;Lq/b$a;)V

    iget v0, p2, Lq/b$a;->f:I

    :goto_4
    iput-object v1, p2, Lq/b$a;->a:Lp/e$b;

    iget v1, p0, Lp/e;->X:I

    if-eqz v1, :cond_e

    if-ne v1, v5, :cond_d

    goto :goto_5

    :cond_d
    invoke-virtual {p0}, Lp/e;->t()F

    move-result v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    goto :goto_6

    :cond_e
    :goto_5
    invoke-virtual {p0}, Lp/e;->t()F

    move-result v1

    int-to-float v0, v0

    mul-float/2addr v1, v0

    :goto_6
    float-to-int v0, v1

    iput v0, p2, Lq/b$a;->c:I

    :cond_f
    :goto_7
    if-eqz v3, :cond_14

    iget-object v0, p0, Lp/e;->r:[I

    aget v0, v0, v2

    if-ne v0, v6, :cond_10

    sget-object p3, Lp/e$b;->e:Lp/e$b;

    iput-object p3, p2, Lq/b$a;->b:Lp/e$b;

    goto :goto_b

    :cond_10
    if-nez p3, :cond_14

    iget-object p3, p2, Lq/b$a;->a:Lp/e$b;

    sget-object v0, Lp/e$b;->e:Lp/e$b;

    if-ne p3, v0, :cond_11

    iget p3, p2, Lq/b$a;->c:I

    goto :goto_8

    :cond_11
    sget-object p3, Lp/e$b;->f:Lp/e$b;

    iput-object p3, p2, Lq/b$a;->b:Lp/e$b;

    invoke-interface {p1, p0, p2}, Lq/b$b;->b(Lp/e;Lq/b$a;)V

    iget p3, p2, Lq/b$a;->e:I

    :goto_8
    iput-object v0, p2, Lq/b$a;->b:Lp/e$b;

    iget v0, p0, Lp/e;->X:I

    if-eqz v0, :cond_13

    if-ne v0, v5, :cond_12

    goto :goto_9

    :cond_12
    int-to-float p3, p3

    invoke-virtual {p0}, Lp/e;->t()F

    move-result v0

    mul-float/2addr p3, v0

    goto :goto_a

    :cond_13
    :goto_9
    int-to-float p3, p3

    invoke-virtual {p0}, Lp/e;->t()F

    move-result v0

    div-float/2addr p3, v0

    :goto_a
    float-to-int p3, p3

    iput p3, p2, Lq/b$a;->d:I

    :cond_14
    :goto_b
    invoke-interface {p1, p0, p2}, Lq/b$b;->b(Lp/e;Lq/b$a;)V

    iget p1, p2, Lq/b$a;->e:I

    invoke-virtual {p0, p1}, Lp/e;->U0(I)V

    iget p1, p2, Lq/b$a;->f:I

    invoke-virtual {p0, p1}, Lp/e;->v0(I)V

    iget-boolean p1, p2, Lq/b$a;->h:Z

    invoke-virtual {p0, p1}, Lp/e;->u0(Z)V

    iget p1, p2, Lq/b$a;->g:I

    invoke-virtual {p0, p1}, Lp/e;->k0(I)V

    sget p0, Lq/b$a;->k:I

    iput p0, p2, Lq/b$a;->j:I

    iget-boolean p0, p2, Lq/b$a;->i:Z

    return p0
.end method

.method private C1()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lp/f;->N0:I

    iput v0, p0, Lp/f;->O0:I

    return-void
.end method

.method private g1(Lp/e;)V
    .locals 5

    iget v0, p0, Lp/f;->N0:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lp/f;->Q0:[Lp/c;

    array-length v2, v1

    if-lt v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp/c;

    iput-object v0, p0, Lp/f;->Q0:[Lp/c;

    :cond_0
    iget-object v0, p0, Lp/f;->Q0:[Lp/c;

    iget v1, p0, Lp/f;->N0:I

    new-instance v2, Lp/c;

    const/4 v3, 0x0

    invoke-virtual {p0}, Lp/f;->x1()Z

    move-result v4

    invoke-direct {v2, p1, v3, v4}, Lp/c;-><init>(Lp/e;IZ)V

    aput-object v2, v0, v1

    iget p1, p0, Lp/f;->N0:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lp/f;->N0:I

    return-void
.end method

.method private j1(Lp/d;Lo/i;)V
    .locals 3

    iget-object v0, p0, Lp/f;->I0:Lo/d;

    invoke-virtual {v0, p1}, Lo/d;->q(Ljava/lang/Object;)Lo/i;

    move-result-object p1

    iget-object v0, p0, Lp/f;->I0:Lo/d;

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v0, p2, p1, v1, v2}, Lo/d;->h(Lo/i;Lo/i;II)V

    return-void
.end method

.method private k1(Lp/d;Lo/i;)V
    .locals 3

    iget-object v0, p0, Lp/f;->I0:Lo/d;

    invoke-virtual {v0, p1}, Lo/d;->q(Ljava/lang/Object;)Lo/i;

    move-result-object p1

    iget-object v0, p0, Lp/f;->I0:Lo/d;

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v0, p1, p2, v1, v2}, Lo/d;->h(Lo/i;Lo/i;II)V

    return-void
.end method

.method private l1(Lp/e;)V
    .locals 5

    iget v0, p0, Lp/f;->O0:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lp/f;->P0:[Lp/c;

    array-length v3, v2

    if-lt v0, v3, :cond_0

    array-length v0, v2

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp/c;

    iput-object v0, p0, Lp/f;->P0:[Lp/c;

    :cond_0
    iget-object v0, p0, Lp/f;->P0:[Lp/c;

    iget v2, p0, Lp/f;->O0:I

    new-instance v3, Lp/c;

    invoke-virtual {p0}, Lp/f;->x1()Z

    move-result v4

    invoke-direct {v3, p1, v1, v4}, Lp/c;-><init>(Lp/e;IZ)V

    aput-object v3, v0, v2

    iget p1, p0, Lp/f;->O0:I

    add-int/2addr p1, v1

    iput p1, p0, Lp/f;->O0:I

    return-void
.end method


# virtual methods
.method public B1(I)Z
    .locals 1

    iget v0, p0, Lp/f;->W0:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public D1(Lq/b$b;)V
    .locals 1

    iput-object p1, p0, Lp/f;->G0:Lq/b$b;

    iget-object v0, p0, Lp/f;->F0:Lq/e;

    invoke-virtual {v0, p1}, Lq/e;->n(Lq/b$b;)V

    return-void
.end method

.method public E1(I)V
    .locals 0

    iput p1, p0, Lp/f;->W0:I

    const/16 p1, 0x200

    invoke-virtual {p0, p1}, Lp/f;->B1(I)Z

    move-result p1

    sput-boolean p1, Lo/d;->r:Z

    return-void
.end method

.method public F1(Z)V
    .locals 0

    iput-boolean p1, p0, Lp/f;->H0:Z

    return-void
.end method

.method public G1(Lo/d;[Z)V
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    aput-boolean v1, p2, v0

    const/16 p2, 0x40

    invoke-virtual {p0, p2}, Lp/f;->B1(I)Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lp/e;->Z0(Lo/d;Z)V

    iget-object v0, p0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp/e;

    invoke-virtual {v2, p1, p2}, Lp/e;->Z0(Lo/d;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public H1()V
    .locals 1

    iget-object v0, p0, Lp/f;->E0:Lq/b;

    invoke-virtual {v0, p0}, Lq/b;->e(Lp/f;)V

    return-void
.end method

.method public Y0(ZZ)V
    .locals 3

    invoke-super {p0, p1, p2}, Lp/e;->Y0(ZZ)V

    iget-object v0, p0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp/e;

    invoke-virtual {v2, p1, p2}, Lp/e;->Y0(ZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b1()V
    .locals 17

    move-object/from16 v1, p0

    const/4 v2, 0x0

    iput v2, v1, Lp/e;->Y:I

    iput v2, v1, Lp/e;->Z:I

    iput-boolean v2, v1, Lp/f;->Y0:Z

    iput-boolean v2, v1, Lp/f;->Z0:Z

    iget-object v0, v1, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lp/e;->R()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lp/e;->v()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget-object v5, v1, Lp/e;->S:[Lp/e$b;

    const/4 v6, 0x1

    aget-object v7, v5, v6

    aget-object v5, v5, v2

    iget v8, v1, Lp/f;->W0:I

    invoke-static {v8, v6}, Lp/j;->b(II)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual/range {p0 .. p0}, Lp/f;->r1()Lq/b$b;

    move-result-object v8

    invoke-static {v1, v8}, Lq/h;->h(Lp/f;Lq/b$b;)V

    move v8, v2

    :goto_0
    if-ge v8, v3, :cond_2

    iget-object v9, v1, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lp/e;

    invoke-virtual {v9}, Lp/e;->d0()Z

    move-result v10

    if-eqz v10, :cond_1

    instance-of v10, v9, Lp/g;

    if-nez v10, :cond_1

    instance-of v10, v9, Lp/a;

    if-nez v10, :cond_1

    instance-of v10, v9, Lp/k;

    if-nez v10, :cond_1

    invoke-virtual {v9}, Lp/e;->c0()Z

    move-result v10

    if-nez v10, :cond_1

    invoke-virtual {v9, v2}, Lp/e;->s(I)Lp/e$b;

    move-result-object v10

    invoke-virtual {v9, v6}, Lp/e;->s(I)Lp/e$b;

    move-result-object v11

    sget-object v12, Lp/e$b;->g:Lp/e$b;

    if-ne v10, v12, :cond_0

    iget v10, v9, Lp/e;->p:I

    if-eq v10, v6, :cond_0

    if-ne v11, v12, :cond_0

    iget v10, v9, Lp/e;->q:I

    if-eq v10, v6, :cond_0

    move v10, v6

    goto :goto_1

    :cond_0
    move v10, v2

    :goto_1
    if-nez v10, :cond_1

    new-instance v10, Lq/b$a;

    invoke-direct {v10}, Lq/b$a;-><init>()V

    iget-object v11, v1, Lp/f;->G0:Lq/b$b;

    sget v12, Lq/b$a;->k:I

    invoke-static {v9, v11, v10, v12}, Lp/f;->A1(Lp/e;Lq/b$b;Lq/b$a;I)Z

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    const/4 v8, 0x2

    if-le v3, v8, :cond_8

    sget-object v9, Lp/e$b;->f:Lp/e$b;

    if-eq v5, v9, :cond_3

    if-ne v7, v9, :cond_8

    :cond_3
    iget v10, v1, Lp/f;->W0:I

    const/16 v11, 0x400

    invoke-static {v10, v11}, Lp/j;->b(II)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-virtual/range {p0 .. p0}, Lp/f;->r1()Lq/b$b;

    move-result-object v10

    invoke-static {v1, v10}, Lq/i;->c(Lp/f;Lq/b$b;)Z

    move-result v10

    if-eqz v10, :cond_8

    if-ne v5, v9, :cond_5

    invoke-virtual/range {p0 .. p0}, Lp/e;->R()I

    move-result v10

    if-ge v0, v10, :cond_4

    if-lez v0, :cond_4

    invoke-virtual {v1, v0}, Lp/e;->U0(I)V

    iput-boolean v6, v1, Lp/f;->Y0:Z

    goto :goto_2

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lp/e;->R()I

    move-result v0

    :cond_5
    :goto_2
    if-ne v7, v9, :cond_7

    invoke-virtual/range {p0 .. p0}, Lp/e;->v()I

    move-result v9

    if-ge v4, v9, :cond_6

    if-lez v4, :cond_6

    invoke-virtual {v1, v4}, Lp/e;->v0(I)V

    iput-boolean v6, v1, Lp/f;->Z0:Z

    goto :goto_3

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lp/e;->v()I

    move-result v4

    :cond_7
    :goto_3
    move v9, v4

    move v4, v0

    move v0, v6

    goto :goto_4

    :cond_8
    move v9, v4

    move v4, v0

    move v0, v2

    :goto_4
    const/16 v10, 0x40

    invoke-virtual {v1, v10}, Lp/f;->B1(I)Z

    move-result v11

    if-nez v11, :cond_a

    const/16 v11, 0x80

    invoke-virtual {v1, v11}, Lp/f;->B1(I)Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_5

    :cond_9
    move v11, v2

    goto :goto_6

    :cond_a
    :goto_5
    move v11, v6

    :goto_6
    iget-object v12, v1, Lp/f;->I0:Lo/d;

    iput-boolean v2, v12, Lo/d;->h:Z

    iput-boolean v2, v12, Lo/d;->i:Z

    iget v13, v1, Lp/f;->W0:I

    if-eqz v13, :cond_b

    if-eqz v11, :cond_b

    iput-boolean v6, v12, Lo/d;->i:Z

    :cond_b
    iget-object v11, v1, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Lp/e;->y()Lp/e$b;

    move-result-object v12

    sget-object v13, Lp/e$b;->f:Lp/e$b;

    if-eq v12, v13, :cond_d

    invoke-virtual/range {p0 .. p0}, Lp/e;->O()Lp/e$b;

    move-result-object v12

    if-ne v12, v13, :cond_c

    goto :goto_7

    :cond_c
    move v12, v2

    goto :goto_8

    :cond_d
    :goto_7
    move v12, v6

    :goto_8
    invoke-direct/range {p0 .. p0}, Lp/f;->C1()V

    move v13, v2

    :goto_9
    if-ge v13, v3, :cond_f

    iget-object v14, v1, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lp/e;

    instance-of v15, v14, Lp/l;

    if-eqz v15, :cond_e

    check-cast v14, Lp/l;

    invoke-virtual {v14}, Lp/l;->b1()V

    :cond_e
    add-int/lit8 v13, v13, 0x1

    goto :goto_9

    :cond_f
    invoke-virtual {v1, v10}, Lp/f;->B1(I)Z

    move-result v10

    move v13, v0

    move v0, v2

    move v14, v6

    :goto_a
    if-eqz v14, :cond_20

    add-int/lit8 v15, v0, 0x1

    :try_start_0
    iget-object v0, v1, Lp/f;->I0:Lo/d;

    invoke-virtual {v0}, Lo/d;->D()V

    invoke-direct/range {p0 .. p0}, Lp/f;->C1()V

    iget-object v0, v1, Lp/f;->I0:Lo/d;

    invoke-virtual {v1, v0}, Lp/e;->k(Lo/d;)V

    move v0, v2

    :goto_b
    if-ge v0, v3, :cond_10

    iget-object v6, v1, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp/e;

    iget-object v2, v1, Lp/f;->I0:Lo/d;

    invoke-virtual {v6, v2}, Lp/e;->k(Lo/d;)V

    add-int/lit8 v0, v0, 0x1

    const/4 v2, 0x0

    const/4 v6, 0x1

    goto :goto_b

    :cond_10
    iget-object v0, v1, Lp/f;->I0:Lo/d;

    invoke-virtual {v1, v0}, Lp/f;->f1(Lo/d;)Z

    move-result v14

    iget-object v0, v1, Lp/f;->b1:Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_11

    iget-object v0, v1, Lp/f;->b1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/d;

    iget-object v6, v1, Lp/f;->I0:Lo/d;

    iget-object v8, v1, Lp/e;->I:Lp/d;

    invoke-virtual {v6, v8}, Lo/d;->q(Ljava/lang/Object;)Lo/i;

    move-result-object v6

    invoke-direct {v1, v0, v6}, Lp/f;->k1(Lp/d;Lo/i;)V

    iput-object v2, v1, Lp/f;->b1:Ljava/lang/ref/WeakReference;

    :cond_11
    iget-object v0, v1, Lp/f;->d1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_12

    iget-object v0, v1, Lp/f;->d1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/d;

    iget-object v6, v1, Lp/f;->I0:Lo/d;

    iget-object v8, v1, Lp/e;->K:Lp/d;

    invoke-virtual {v6, v8}, Lo/d;->q(Ljava/lang/Object;)Lo/i;

    move-result-object v6

    invoke-direct {v1, v0, v6}, Lp/f;->j1(Lp/d;Lo/i;)V

    iput-object v2, v1, Lp/f;->d1:Ljava/lang/ref/WeakReference;

    :cond_12
    iget-object v0, v1, Lp/f;->c1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_13

    iget-object v0, v1, Lp/f;->c1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/d;

    iget-object v6, v1, Lp/f;->I0:Lo/d;

    iget-object v8, v1, Lp/e;->H:Lp/d;

    invoke-virtual {v6, v8}, Lo/d;->q(Ljava/lang/Object;)Lo/i;

    move-result-object v6

    invoke-direct {v1, v0, v6}, Lp/f;->k1(Lp/d;Lo/i;)V

    iput-object v2, v1, Lp/f;->c1:Ljava/lang/ref/WeakReference;

    :cond_13
    iget-object v0, v1, Lp/f;->e1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_14

    iget-object v0, v1, Lp/f;->e1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp/d;

    iget-object v6, v1, Lp/f;->I0:Lo/d;

    iget-object v8, v1, Lp/e;->J:Lp/d;

    invoke-virtual {v6, v8}, Lo/d;->q(Ljava/lang/Object;)Lo/i;

    move-result-object v6

    invoke-direct {v1, v0, v6}, Lp/f;->j1(Lp/d;Lo/i;)V

    iput-object v2, v1, Lp/f;->e1:Ljava/lang/ref/WeakReference;

    :cond_14
    if-eqz v14, :cond_15

    iget-object v0, v1, Lp/f;->I0:Lo/d;

    invoke-virtual {v0}, Lo/d;->z()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_c

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "EXCEPTION : "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_15
    :goto_c
    iget-object v0, v1, Lp/f;->I0:Lo/d;

    if-eqz v14, :cond_16

    sget-object v2, Lp/j;->a:[Z

    invoke-virtual {v1, v0, v2}, Lp/f;->G1(Lo/d;[Z)V

    goto :goto_e

    :cond_16
    invoke-virtual {v1, v0, v10}, Lp/e;->Z0(Lo/d;Z)V

    const/4 v0, 0x0

    :goto_d
    if-ge v0, v3, :cond_17

    iget-object v2, v1, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp/e;

    iget-object v6, v1, Lp/f;->I0:Lo/d;

    invoke-virtual {v2, v6, v10}, Lp/e;->Z0(Lo/d;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    :cond_17
    :goto_e
    if-eqz v12, :cond_1a

    const/16 v0, 0x8

    if-ge v15, v0, :cond_1a

    sget-object v0, Lp/j;->a:[Z

    const/4 v2, 0x2

    aget-boolean v0, v0, v2

    if-eqz v0, :cond_1a

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_f
    if-ge v0, v3, :cond_18

    iget-object v14, v1, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lp/e;

    iget v2, v14, Lp/e;->Y:I

    invoke-virtual {v14}, Lp/e;->R()I

    move-result v16

    add-int v2, v2, v16

    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v6

    iget v2, v14, Lp/e;->Z:I

    invoke-virtual {v14}, Lp/e;->v()I

    move-result v14

    add-int/2addr v2, v14

    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    move-result v8

    add-int/lit8 v0, v0, 0x1

    const/4 v2, 0x2

    goto :goto_f

    :cond_18
    iget v0, v1, Lp/e;->f0:I

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, v1, Lp/e;->g0:I

    invoke-static {v2, v8}, Ljava/lang/Math;->max(II)I

    move-result v2

    sget-object v6, Lp/e$b;->f:Lp/e$b;

    if-ne v5, v6, :cond_19

    invoke-virtual/range {p0 .. p0}, Lp/e;->R()I

    move-result v8

    if-ge v8, v0, :cond_19

    invoke-virtual {v1, v0}, Lp/e;->U0(I)V

    iget-object v0, v1, Lp/e;->S:[Lp/e$b;

    const/4 v8, 0x0

    aput-object v6, v0, v8

    const/4 v0, 0x1

    const/4 v13, 0x1

    goto :goto_10

    :cond_19
    const/4 v0, 0x0

    :goto_10
    if-ne v7, v6, :cond_1b

    invoke-virtual/range {p0 .. p0}, Lp/e;->v()I

    move-result v8

    if-ge v8, v2, :cond_1b

    invoke-virtual {v1, v2}, Lp/e;->v0(I)V

    iget-object v0, v1, Lp/e;->S:[Lp/e$b;

    const/4 v2, 0x1

    aput-object v6, v0, v2

    const/4 v0, 0x1

    const/4 v13, 0x1

    goto :goto_11

    :cond_1a
    const/4 v0, 0x0

    :cond_1b
    :goto_11
    iget v2, v1, Lp/e;->f0:I

    invoke-virtual/range {p0 .. p0}, Lp/e;->R()I

    move-result v6

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lp/e;->R()I

    move-result v6

    if-le v2, v6, :cond_1c

    invoke-virtual {v1, v2}, Lp/e;->U0(I)V

    iget-object v0, v1, Lp/e;->S:[Lp/e$b;

    sget-object v2, Lp/e$b;->e:Lp/e$b;

    const/4 v6, 0x0

    aput-object v2, v0, v6

    const/4 v0, 0x1

    const/4 v13, 0x1

    :cond_1c
    iget v2, v1, Lp/e;->g0:I

    invoke-virtual/range {p0 .. p0}, Lp/e;->v()I

    move-result v6

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lp/e;->v()I

    move-result v6

    if-le v2, v6, :cond_1d

    invoke-virtual {v1, v2}, Lp/e;->v0(I)V

    iget-object v0, v1, Lp/e;->S:[Lp/e$b;

    sget-object v2, Lp/e$b;->e:Lp/e$b;

    const/4 v6, 0x1

    aput-object v2, v0, v6

    move v0, v6

    move v2, v0

    goto :goto_12

    :cond_1d
    const/4 v6, 0x1

    move v2, v13

    :goto_12
    if-nez v2, :cond_1f

    iget-object v8, v1, Lp/e;->S:[Lp/e$b;

    const/4 v13, 0x0

    aget-object v8, v8, v13

    sget-object v14, Lp/e$b;->f:Lp/e$b;

    if-ne v8, v14, :cond_1e

    if-lez v4, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lp/e;->R()I

    move-result v8

    if-le v8, v4, :cond_1e

    iput-boolean v6, v1, Lp/f;->Y0:Z

    iget-object v0, v1, Lp/e;->S:[Lp/e$b;

    sget-object v2, Lp/e$b;->e:Lp/e$b;

    aput-object v2, v0, v13

    invoke-virtual {v1, v4}, Lp/e;->U0(I)V

    move v0, v6

    move v2, v0

    :cond_1e
    iget-object v8, v1, Lp/e;->S:[Lp/e$b;

    aget-object v8, v8, v6

    if-ne v8, v14, :cond_1f

    if-lez v9, :cond_1f

    invoke-virtual/range {p0 .. p0}, Lp/e;->v()I

    move-result v8

    if-le v8, v9, :cond_1f

    iput-boolean v6, v1, Lp/f;->Z0:Z

    iget-object v0, v1, Lp/e;->S:[Lp/e$b;

    sget-object v2, Lp/e$b;->e:Lp/e$b;

    aput-object v2, v0, v6

    invoke-virtual {v1, v9}, Lp/e;->v0(I)V

    const/4 v13, 0x1

    const/4 v14, 0x1

    goto :goto_13

    :cond_1f
    move v14, v0

    move v13, v2

    :goto_13
    move v0, v15

    const/4 v2, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x2

    goto/16 :goto_a

    :cond_20
    iput-object v11, v1, Lp/l;->D0:Ljava/util/ArrayList;

    if-eqz v13, :cond_21

    iget-object v0, v1, Lp/e;->S:[Lp/e$b;

    const/4 v2, 0x0

    aput-object v5, v0, v2

    const/4 v2, 0x1

    aput-object v7, v0, v2

    :cond_21
    iget-object v0, v1, Lp/f;->I0:Lo/d;

    invoke-virtual {v0}, Lo/d;->v()Lo/c;

    move-result-object v0

    invoke-virtual {v1, v0}, Lp/l;->j0(Lo/c;)V

    return-void
.end method

.method e1(Lp/e;I)V
    .locals 1

    if-nez p2, :cond_0

    invoke-direct {p0, p1}, Lp/f;->g1(Lp/e;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    invoke-direct {p0, p1}, Lp/f;->l1(Lp/e;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public f1(Lo/d;)Z
    .locals 12

    const/16 v0, 0x40

    invoke-virtual {p0, v0}, Lp/f;->B1(I)Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lp/e;->g(Lo/d;Z)V

    iget-object v1, p0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v3, v1, :cond_1

    iget-object v6, p0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp/e;

    invoke-virtual {v6, v2, v2}, Lp/e;->C0(IZ)V

    invoke-virtual {v6, v5, v2}, Lp/e;->C0(IZ)V

    instance-of v6, v6, Lp/a;

    if-eqz v6, :cond_0

    move v4, v5

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_3

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_3

    iget-object v4, p0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp/e;

    instance-of v6, v4, Lp/a;

    if-eqz v6, :cond_2

    check-cast v4, Lp/a;

    invoke-virtual {v4}, Lp/a;->h1()V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    move v3, v2

    :goto_2
    if-ge v3, v1, :cond_5

    iget-object v4, p0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp/e;

    invoke-virtual {v4}, Lp/e;->f()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v4, p1, v0}, Lp/e;->g(Lo/d;Z)V

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    sget-boolean v3, Lo/d;->r:Z

    if-eqz v3, :cond_9

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    move v4, v2

    :goto_3
    if-ge v4, v1, :cond_7

    iget-object v6, p0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp/e;

    invoke-virtual {v6}, Lp/e;->f()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Lp/e;->y()Lp/e$b;

    move-result-object v1

    sget-object v4, Lp/e$b;->f:Lp/e$b;

    if-ne v1, v4, :cond_8

    move v10, v2

    goto :goto_4

    :cond_8
    move v10, v5

    :goto_4
    const/4 v11, 0x0

    move-object v6, p0

    move-object v7, p0

    move-object v8, p1

    move-object v9, v3

    invoke-virtual/range {v6 .. v11}, Lp/e;->e(Lp/f;Lo/d;Ljava/util/HashSet;IZ)V

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp/e;

    invoke-static {p0, p1, v3}, Lp/j;->a(Lp/f;Lo/d;Lp/e;)V

    invoke-virtual {v3, p1, v0}, Lp/e;->g(Lo/d;Z)V

    goto :goto_5

    :cond_9
    move v3, v2

    :goto_6
    if-ge v3, v1, :cond_f

    iget-object v4, p0, Lp/l;->D0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp/e;

    instance-of v6, v4, Lp/f;

    if-eqz v6, :cond_d

    iget-object v6, v4, Lp/e;->S:[Lp/e$b;

    aget-object v7, v6, v2

    aget-object v6, v6, v5

    sget-object v8, Lp/e$b;->f:Lp/e$b;

    if-ne v7, v8, :cond_a

    sget-object v9, Lp/e$b;->e:Lp/e$b;

    invoke-virtual {v4, v9}, Lp/e;->z0(Lp/e$b;)V

    :cond_a
    if-ne v6, v8, :cond_b

    sget-object v9, Lp/e$b;->e:Lp/e$b;

    invoke-virtual {v4, v9}, Lp/e;->Q0(Lp/e$b;)V

    :cond_b
    invoke-virtual {v4, p1, v0}, Lp/e;->g(Lo/d;Z)V

    if-ne v7, v8, :cond_c

    invoke-virtual {v4, v7}, Lp/e;->z0(Lp/e$b;)V

    :cond_c
    if-ne v6, v8, :cond_e

    invoke-virtual {v4, v6}, Lp/e;->Q0(Lp/e$b;)V

    goto :goto_7

    :cond_d
    invoke-static {p0, p1, v4}, Lp/j;->a(Lp/f;Lo/d;Lp/e;)V

    invoke-virtual {v4}, Lp/e;->f()Z

    move-result v6

    if-nez v6, :cond_e

    invoke-virtual {v4, p1, v0}, Lp/e;->g(Lo/d;Z)V

    :cond_e
    :goto_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_f
    iget v0, p0, Lp/f;->N0:I

    const/4 v1, 0x0

    if-lez v0, :cond_10

    invoke-static {p0, p1, v1, v2}, Lp/b;->b(Lp/f;Lo/d;Ljava/util/ArrayList;I)V

    :cond_10
    iget v0, p0, Lp/f;->O0:I

    if-lez v0, :cond_11

    invoke-static {p0, p1, v1, v5}, Lp/b;->b(Lp/f;Lo/d;Ljava/util/ArrayList;I)V

    :cond_11
    return v5
.end method

.method public h0()V
    .locals 1

    iget-object v0, p0, Lp/f;->I0:Lo/d;

    invoke-virtual {v0}, Lo/d;->D()V

    const/4 v0, 0x0

    iput v0, p0, Lp/f;->J0:I

    iput v0, p0, Lp/f;->L0:I

    iput v0, p0, Lp/f;->K0:I

    iput v0, p0, Lp/f;->M0:I

    iput-boolean v0, p0, Lp/f;->X0:Z

    invoke-super {p0}, Lp/l;->h0()V

    return-void
.end method

.method public h1(Lp/d;)V
    .locals 2

    iget-object v0, p0, Lp/f;->e1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lp/d;->d()I

    move-result v0

    iget-object v1, p0, Lp/f;->e1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/d;

    invoke-virtual {v1}, Lp/d;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lp/f;->e1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public i1(Lp/d;)V
    .locals 2

    iget-object v0, p0, Lp/f;->c1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lp/d;->d()I

    move-result v0

    iget-object v1, p0, Lp/f;->c1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/d;

    invoke-virtual {v1}, Lp/d;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lp/f;->c1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method m1(Lp/d;)V
    .locals 2

    iget-object v0, p0, Lp/f;->d1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lp/d;->d()I

    move-result v0

    iget-object v1, p0, Lp/f;->d1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/d;

    invoke-virtual {v1}, Lp/d;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lp/f;->d1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method n1(Lp/d;)V
    .locals 2

    iget-object v0, p0, Lp/f;->b1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lp/d;->d()I

    move-result v0

    iget-object v1, p0, Lp/f;->b1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/d;

    invoke-virtual {v1}, Lp/d;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lp/f;->b1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public o1(Z)Z
    .locals 1

    iget-object v0, p0, Lp/f;->F0:Lq/e;

    invoke-virtual {v0, p1}, Lq/e;->f(Z)Z

    move-result p1

    return p1
.end method

.method public p1(Z)Z
    .locals 1

    iget-object v0, p0, Lp/f;->F0:Lq/e;

    invoke-virtual {v0, p1}, Lq/e;->g(Z)Z

    move-result p1

    return p1
.end method

.method public q1(ZI)Z
    .locals 1

    iget-object v0, p0, Lp/f;->F0:Lq/e;

    invoke-virtual {v0, p1, p2}, Lq/e;->h(ZI)Z

    move-result p1

    return p1
.end method

.method public r1()Lq/b$b;
    .locals 1

    iget-object v0, p0, Lp/f;->G0:Lq/b$b;

    return-object v0
.end method

.method public s1()I
    .locals 1

    iget v0, p0, Lp/f;->W0:I

    return v0
.end method

.method public t1()Lo/d;
    .locals 1

    iget-object v0, p0, Lp/f;->I0:Lo/d;

    return-object v0
.end method

.method public u1()V
    .locals 1

    iget-object v0, p0, Lp/f;->F0:Lq/e;

    invoke-virtual {v0}, Lq/e;->j()V

    return-void
.end method

.method public v1()V
    .locals 1

    iget-object v0, p0, Lp/f;->F0:Lq/e;

    invoke-virtual {v0}, Lq/e;->k()V

    return-void
.end method

.method public w1()Z
    .locals 1

    iget-boolean v0, p0, Lp/f;->Z0:Z

    return v0
.end method

.method public x1()Z
    .locals 1

    iget-boolean v0, p0, Lp/f;->H0:Z

    return v0
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Lp/f;->Y0:Z

    return v0
.end method

.method public z1(IIIIIIIII)J
    .locals 12

    move-object v11, p0

    move/from16 v3, p8

    iput v3, v11, Lp/f;->J0:I

    move/from16 v4, p9

    iput v4, v11, Lp/f;->K0:I

    iget-object v0, v11, Lp/f;->E0:Lq/b;

    move-object v1, p0

    move v2, p1

    move v5, p2

    move v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    invoke-virtual/range {v0 .. v10}, Lq/b;->d(Lp/f;IIIIIIIII)J

    move-result-wide v0

    return-wide v0
.end method
