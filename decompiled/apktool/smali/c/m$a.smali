.class Lc/m$a;
.super Landroidx/core/view/e1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/m;


# direct methods
.method constructor <init>(Lc/m;)V
    .locals 0

    iput-object p1, p0, Lc/m$a;->a:Lc/m;

    invoke-direct {p0}, Landroidx/core/view/e1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lc/m$a;->a:Lc/m;

    iget-boolean v0, p1, Lc/m;->t:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lc/m;->h:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object p1, p0, Lc/m$a;->a:Lc/m;

    iget-object p1, p1, Lc/m;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    :cond_0
    iget-object p1, p0, Lc/m$a;->a:Lc/m;

    iget-object p1, p1, Lc/m;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object p1, p0, Lc/m$a;->a:Lc/m;

    iget-object p1, p1, Lc/m;->e:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iget-object p1, p0, Lc/m$a;->a:Lc/m;

    const/4 v0, 0x0

    iput-object v0, p1, Lc/m;->y:Lg/h;

    invoke-virtual {p1}, Lc/m;->w()V

    iget-object p1, p0, Lc/m$a;->a:Lc/m;

    iget-object p1, p1, Lc/m;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_1

    invoke-static {p1}, Landroidx/core/view/f0;->E(Landroid/view/View;)V

    :cond_1
    return-void
.end method
