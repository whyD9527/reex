.class public Lp/k;
.super Lp/i;
.source "SourceFile"


# instance fields
.field private F0:I

.field private G0:I

.field private H0:I

.field private I0:I

.field private J0:I

.field private K0:I

.field private L0:I

.field private M0:I

.field private N0:Z

.field private O0:I

.field private P0:I

.field protected Q0:Lq/b$a;

.field R0:Lq/b$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp/i;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lp/k;->F0:I

    iput v0, p0, Lp/k;->G0:I

    iput v0, p0, Lp/k;->H0:I

    iput v0, p0, Lp/k;->I0:I

    iput v0, p0, Lp/k;->J0:I

    iput v0, p0, Lp/k;->K0:I

    iput v0, p0, Lp/k;->L0:I

    iput v0, p0, Lp/k;->M0:I

    iput-boolean v0, p0, Lp/k;->N0:Z

    iput v0, p0, Lp/k;->O0:I

    iput v0, p0, Lp/k;->P0:I

    new-instance v0, Lq/b$a;

    invoke-direct {v0}, Lq/b$a;-><init>()V

    iput-object v0, p0, Lp/k;->Q0:Lq/b$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lp/k;->R0:Lq/b$b;

    return-void
.end method


# virtual methods
.method public a(Lp/f;)V
    .locals 0

    invoke-virtual {p0}, Lp/k;->c1()V

    return-void
.end method

.method public c1()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lp/i;->E0:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lp/i;->D0:[Lp/e;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lp/e;->E0(Z)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public d1()Z
    .locals 1

    iget-boolean v0, p0, Lp/k;->N0:Z

    return v0
.end method
