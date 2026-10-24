.class Lc/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/e;->Q()Landroid/view/ViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/e;


# direct methods
.method constructor <init>(Lc/e;)V
    .locals 0

    iput-object p1, p0, Lc/e$b;->a:Lc/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroidx/core/view/g1;)Landroidx/core/view/g1;
    .locals 4

    invoke-virtual {p2}, Landroidx/core/view/g1;->k()I

    move-result v0

    iget-object v1, p0, Lc/e$b;->a:Lc/e;

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v2}, Lc/e;->L0(Landroidx/core/view/g1;Landroid/graphics/Rect;)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Landroidx/core/view/g1;->i()I

    move-result v0

    invoke-virtual {p2}, Landroidx/core/view/g1;->j()I

    move-result v2

    invoke-virtual {p2}, Landroidx/core/view/g1;->h()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, Landroidx/core/view/g1;->o(IIII)Landroidx/core/view/g1;

    move-result-object p2

    :cond_0
    invoke-static {p1, p2}, Landroidx/core/view/f0;->z(Landroid/view/View;Landroidx/core/view/g1;)Landroidx/core/view/g1;

    move-result-object p1

    return-object p1
.end method
