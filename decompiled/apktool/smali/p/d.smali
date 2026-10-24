.class public Lp/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp/d$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lp/d;",
            ">;"
        }
    .end annotation
.end field

.field private b:I

.field private c:Z

.field public final d:Lp/e;

.field public final e:Lp/d$b;

.field public f:Lp/d;

.field public g:I

.field h:I

.field i:Lo/i;


# direct methods
.method public constructor <init>(Lp/e;Lp/d$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lp/d;->a:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput v0, p0, Lp/d;->g:I

    const/4 v0, -0x1

    iput v0, p0, Lp/d;->h:I

    iput-object p1, p0, Lp/d;->d:Lp/e;

    iput-object p2, p0, Lp/d;->e:Lp/d$b;

    return-void
.end method


# virtual methods
.method public a(Lp/d;IIZ)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lp/d;->p()V

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p4, :cond_1

    invoke-virtual {p0, p1}, Lp/d;->o(Lp/d;)Z

    move-result p4

    if-nez p4, :cond_1

    return v1

    :cond_1
    iput-object p1, p0, Lp/d;->f:Lp/d;

    iget-object p4, p1, Lp/d;->a:Ljava/util/HashSet;

    if-nez p4, :cond_2

    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    iput-object p4, p1, Lp/d;->a:Ljava/util/HashSet;

    :cond_2
    iget-object p1, p0, Lp/d;->f:Lp/d;

    iget-object p1, p1, Lp/d;->a:Ljava/util/HashSet;

    if-eqz p1, :cond_3

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_3
    if-lez p2, :cond_4

    iput p2, p0, Lp/d;->g:I

    goto :goto_0

    :cond_4
    iput v1, p0, Lp/d;->g:I

    :goto_0
    iput p3, p0, Lp/d;->h:I

    return v0
.end method

.method public b(ILjava/util/ArrayList;Lq/o;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lq/o;",
            ">;",
            "Lq/o;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lp/d;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp/d;

    iget-object v1, v1, Lp/d;->d:Lp/e;

    invoke-static {v1, p1, p2, p3}, Lq/i;->a(Lp/e;ILjava/util/ArrayList;Lq/o;)Lq/o;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lp/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lp/d;->a:Ljava/util/HashSet;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget-boolean v0, p0, Lp/d;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lp/d;->b:I

    return v0
.end method

.method public e()I
    .locals 3

    iget-object v0, p0, Lp/d;->d:Lp/e;

    invoke-virtual {v0}, Lp/e;->Q()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lp/d;->h:I

    const/4 v2, -0x1

    if-le v0, v2, :cond_1

    iget-object v0, p0, Lp/d;->f:Lp/d;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lp/d;->d:Lp/e;

    invoke-virtual {v0}, Lp/e;->Q()I

    move-result v0

    if-ne v0, v1, :cond_1

    iget v0, p0, Lp/d;->h:I

    return v0

    :cond_1
    iget v0, p0, Lp/d;->g:I

    return v0
.end method

.method public final f()Lp/d;
    .locals 2

    sget-object v0, Lp/d$a;->a:[I

    iget-object v1, p0, Lp/d;->e:Lp/d$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    iget-object v1, p0, Lp/d;->e:Lp/d$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lp/d;->d:Lp/e;

    iget-object v0, v0, Lp/e;->I:Lp/d;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lp/d;->d:Lp/e;

    iget-object v0, v0, Lp/e;->K:Lp/d;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lp/d;->d:Lp/e;

    iget-object v0, v0, Lp/e;->H:Lp/d;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lp/d;->d:Lp/e;

    iget-object v0, v0, Lp/e;->J:Lp/d;

    return-object v0

    :pswitch_4
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public g()Lp/e;
    .locals 1

    iget-object v0, p0, Lp/d;->d:Lp/e;

    return-object v0
.end method

.method public h()Lo/i;
    .locals 1

    iget-object v0, p0, Lp/d;->i:Lo/i;

    return-object v0
.end method

.method public i()Lp/d;
    .locals 1

    iget-object v0, p0, Lp/d;->f:Lp/d;

    return-object v0
.end method

.method public j()Lp/d$b;
    .locals 1

    iget-object v0, p0, Lp/d;->e:Lp/d$b;

    return-object v0
.end method

.method public k()Z
    .locals 3

    iget-object v0, p0, Lp/d;->a:Ljava/util/HashSet;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp/d;

    invoke-virtual {v2}, Lp/d;->f()Lp/d;

    move-result-object v2

    invoke-virtual {v2}, Lp/d;->n()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public l()Z
    .locals 2

    iget-object v0, p0, Lp/d;->a:Ljava/util/HashSet;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lp/d;->c:Z

    return v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lp/d;->f:Lp/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o(Lp/d;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lp/d;->j()Lp/d$b;

    move-result-object v1

    iget-object v2, p0, Lp/d;->e:Lp/d$b;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_3

    sget-object v1, Lp/d$b;->j:Lp/d$b;

    if-ne v2, v1, :cond_2

    invoke-virtual {p1}, Lp/d;->g()Lp/e;

    move-result-object p1

    invoke-virtual {p1}, Lp/e;->U()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lp/d;->g()Lp/e;

    move-result-object p1

    invoke-virtual {p1}, Lp/e;->U()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    return v0

    :cond_2
    return v3

    :cond_3
    sget-object v4, Lp/d$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/AssertionError;

    iget-object v0, p0, Lp/d;->e:Lp/d$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_0
    return v0

    :pswitch_1
    sget-object v2, Lp/d$b;->g:Lp/d$b;

    if-eq v1, v2, :cond_5

    sget-object v2, Lp/d$b;->i:Lp/d$b;

    if-ne v1, v2, :cond_4

    goto :goto_0

    :cond_4
    move v2, v0

    goto :goto_1

    :cond_5
    :goto_0
    move v2, v3

    :goto_1
    invoke-virtual {p1}, Lp/d;->g()Lp/e;

    move-result-object p1

    instance-of p1, p1, Lp/g;

    if-eqz p1, :cond_8

    if-nez v2, :cond_6

    sget-object p1, Lp/d$b;->m:Lp/d$b;

    if-ne v1, p1, :cond_7

    :cond_6
    move v0, v3

    :cond_7
    move v2, v0

    :cond_8
    return v2

    :pswitch_2
    sget-object v2, Lp/d$b;->f:Lp/d$b;

    if-eq v1, v2, :cond_a

    sget-object v2, Lp/d$b;->h:Lp/d$b;

    if-ne v1, v2, :cond_9

    goto :goto_2

    :cond_9
    move v2, v0

    goto :goto_3

    :cond_a
    :goto_2
    move v2, v3

    :goto_3
    invoke-virtual {p1}, Lp/d;->g()Lp/e;

    move-result-object p1

    instance-of p1, p1, Lp/g;

    if-eqz p1, :cond_d

    if-nez v2, :cond_b

    sget-object p1, Lp/d$b;->l:Lp/d$b;

    if-ne v1, p1, :cond_c

    :cond_b
    move v0, v3

    :cond_c
    move v2, v0

    :cond_d
    return v2

    :pswitch_3
    sget-object p1, Lp/d$b;->j:Lp/d$b;

    if-eq v1, p1, :cond_e

    sget-object p1, Lp/d$b;->l:Lp/d$b;

    if-eq v1, p1, :cond_e

    sget-object p1, Lp/d$b;->m:Lp/d$b;

    if-eq v1, p1, :cond_e

    move v0, v3

    :cond_e
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, Lp/d;->f:Lp/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lp/d;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lp/d;->f:Lp/d;

    iget-object v0, v0, Lp/d;->a:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp/d;->f:Lp/d;

    iput-object v1, v0, Lp/d;->a:Ljava/util/HashSet;

    :cond_0
    iput-object v1, p0, Lp/d;->a:Ljava/util/HashSet;

    iput-object v1, p0, Lp/d;->f:Lp/d;

    const/4 v0, 0x0

    iput v0, p0, Lp/d;->g:I

    const/4 v1, -0x1

    iput v1, p0, Lp/d;->h:I

    iput-boolean v0, p0, Lp/d;->c:Z

    iput v0, p0, Lp/d;->b:I

    return-void
.end method

.method public q()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp/d;->c:Z

    iput v0, p0, Lp/d;->b:I

    return-void
.end method

.method public r(Lo/c;)V
    .locals 2

    iget-object p1, p0, Lp/d;->i:Lo/i;

    if-nez p1, :cond_0

    new-instance p1, Lo/i;

    sget-object v0, Lo/i$a;->e:Lo/i$a;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lo/i;-><init>(Lo/i$a;Ljava/lang/String;)V

    iput-object p1, p0, Lp/d;->i:Lo/i;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo/i;->d()V

    :goto_0
    return-void
.end method

.method public s(I)V
    .locals 0

    iput p1, p0, Lp/d;->b:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp/d;->c:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lp/d;->d:Lp/e;

    invoke-virtual {v1}, Lp/e;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp/d;->e:Lp/d$b;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
