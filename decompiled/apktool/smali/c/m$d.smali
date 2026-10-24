.class public Lc/m$d;
.super Lg/b;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field private final g:Landroid/content/Context;

.field private final h:Landroidx/appcompat/view/menu/e;

.field private i:Lg/b$a;

.field private j:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic k:Lc/m;


# direct methods
.method public constructor <init>(Lc/m;Landroid/content/Context;Lg/b$a;)V
    .locals 0

    iput-object p1, p0, Lc/m$d;->k:Lc/m;

    invoke-direct {p0}, Lg/b;-><init>()V

    iput-object p2, p0, Lc/m$d;->g:Landroid/content/Context;

    iput-object p3, p0, Lc/m$d;->i:Lg/b$a;

    new-instance p1, Landroidx/appcompat/view/menu/e;

    invoke-direct {p1, p2}, Landroidx/appcompat/view/menu/e;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/appcompat/view/menu/e;->S(I)Landroidx/appcompat/view/menu/e;

    move-result-object p1

    iput-object p1, p0, Lc/m$d;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p1, p0}, Landroidx/appcompat/view/menu/e;->R(Landroidx/appcompat/view/menu/e$a;)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Lc/m$d;->i:Lg/b$a;

    if-eqz p1, :cond_0

    invoke-interface {p1, p0, p2}, Lg/b$a;->c(Lg/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(Landroidx/appcompat/view/menu/e;)V
    .locals 0

    iget-object p1, p0, Lc/m$d;->i:Lg/b$a;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lc/m$d;->k()V

    iget-object p1, p0, Lc/m$d;->k:Lc/m;

    iget-object p1, p1, Lc/m;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->l()Z

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lc/m$d;->k:Lc/m;

    iget-object v1, v0, Lc/m;->m:Lc/m$d;

    if-eq v1, p0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, Lc/m;->u:Z

    iget-boolean v0, v0, Lc/m;->v:Z

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lc/m;->v(ZZZ)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/m$d;->k:Lc/m;

    iput-object p0, v0, Lc/m;->n:Lg/b;

    iget-object v1, p0, Lc/m$d;->i:Lg/b$a;

    iput-object v1, v0, Lc/m;->o:Lg/b$a;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lc/m$d;->i:Lg/b$a;

    invoke-interface {v0, p0}, Lg/b$a;->d(Lg/b;)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lc/m$d;->i:Lg/b$a;

    iget-object v1, p0, Lc/m$d;->k:Lc/m;

    invoke-virtual {v1, v2}, Lc/m;->u(Z)V

    iget-object v1, p0, Lc/m$d;->k:Lc/m;

    iget-object v1, v1, Lc/m;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->g()V

    iget-object v1, p0, Lc/m$d;->k:Lc/m;

    iget-object v1, v1, Lc/m;->f:Landroidx/appcompat/widget/l0;

    invoke-interface {v1}, Landroidx/appcompat/widget/l0;->k()Landroid/view/ViewGroup;

    move-result-object v1

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Landroid/view/View;->sendAccessibilityEvent(I)V

    iget-object v1, p0, Lc/m$d;->k:Lc/m;

    iget-object v2, v1, Lc/m;->d:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v1, v1, Lc/m;->A:Z

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v1, p0, Lc/m$d;->k:Lc/m;

    iput-object v0, v1, Lc/m;->m:Lc/m$d;

    return-void
.end method

.method public d()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lc/m$d;->j:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public e()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Lc/m$d;->h:Landroidx/appcompat/view/menu/e;

    return-object v0
.end method

.method public f()Landroid/view/MenuInflater;
    .locals 2

    new-instance v0, Lg/g;

    iget-object v1, p0, Lc/m$d;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lg/g;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public g()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lc/m$d;->k:Lc/m;

    iget-object v0, v0, Lc/m;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lc/m$d;->k:Lc/m;

    iget-object v0, v0, Lc/m;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Lc/m$d;->k:Lc/m;

    iget-object v0, v0, Lc/m;->m:Lc/m$d;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lc/m$d;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/e;->d0()V

    :try_start_0
    iget-object v0, p0, Lc/m$d;->i:Lg/b$a;

    iget-object v1, p0, Lc/m$d;->h:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, p0, v1}, Lg/b$a;->a(Lg/b;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lc/m$d;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/e;->c0()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lc/m$d;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/e;->c0()V

    throw v0
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lc/m$d;->k:Lc/m;

    iget-object v0, v0, Lc/m;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->j()Z

    move-result v0

    return v0
.end method

.method public m(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lc/m$d;->k:Lc/m;

    iget-object v0, v0, Lc/m;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lc/m$d;->j:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public n(I)V
    .locals 1

    iget-object v0, p0, Lc/m$d;->k:Lc/m;

    iget-object v0, v0, Lc/m;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/m$d;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public o(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lc/m$d;->k:Lc/m;

    iget-object v0, v0, Lc/m;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public q(I)V
    .locals 1

    iget-object v0, p0, Lc/m$d;->k:Lc/m;

    iget-object v0, v0, Lc/m;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/m$d;->r(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public r(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lc/m$d;->k:Lc/m;

    iget-object v0, v0, Lc/m;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public s(Z)V
    .locals 1

    invoke-super {p0, p1}, Lg/b;->s(Z)V

    iget-object v0, p0, Lc/m$d;->k:Lc/m;

    iget-object v0, v0, Lc/m;->g:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method

.method public t()Z
    .locals 2

    iget-object v0, p0, Lc/m$d;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/e;->d0()V

    :try_start_0
    iget-object v0, p0, Lc/m$d;->i:Lg/b$a;

    iget-object v1, p0, Lc/m$d;->h:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, p0, v1}, Lg/b$a;->b(Lg/b;Landroid/view/Menu;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lc/m$d;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/e;->c0()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lc/m$d;->h:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/e;->c0()V

    throw v0
.end method
