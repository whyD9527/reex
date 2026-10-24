.class Lc/e$e;
.super Landroidx/core/view/e1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/e;->G0(Lg/b$a;)Lg/b;
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

    iput-object p1, p0, Lc/e$e;->a:Lc/e;

    invoke-direct {p0}, Landroidx/core/view/e1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lc/e$e;->a:Lc/e;

    iget-object p1, p1, Lc/e;->t:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lc/e$e;->a:Lc/e;

    iget-object p1, p1, Lc/e;->w:Landroidx/core/view/c1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/core/view/c1;->h(Landroidx/core/view/d1;)Landroidx/core/view/c1;

    iget-object p1, p0, Lc/e$e;->a:Lc/e;

    iput-object v0, p1, Lc/e;->w:Landroidx/core/view/c1;

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lc/e$e;->a:Lc/e;

    iget-object p1, p1, Lc/e;->t:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lc/e$e;->a:Lc/e;

    iget-object p1, p1, Lc/e;->t:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Landroid/view/View;->sendAccessibilityEvent(I)V

    iget-object p1, p0, Lc/e$e;->a:Lc/e;

    iget-object p1, p1, Lc/e;->t:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc/e$e;->a:Lc/e;

    iget-object p1, p1, Lc/e;->t:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Landroidx/core/view/f0;->E(Landroid/view/View;)V

    :cond_0
    return-void
.end method
