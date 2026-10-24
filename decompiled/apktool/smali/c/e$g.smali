.class Lc/e$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g"
.end annotation


# instance fields
.field private a:Lg/b$a;

.field final synthetic b:Lc/e;


# direct methods
.method public constructor <init>(Lc/e;Lg/b$a;)V
    .locals 0

    iput-object p1, p0, Lc/e$g;->b:Lc/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc/e$g;->a:Lg/b$a;

    return-void
.end method


# virtual methods
.method public a(Lg/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lc/e$g;->b:Lc/e;

    iget-object v0, v0, Lc/e;->z:Landroid/view/ViewGroup;

    invoke-static {v0}, Landroidx/core/view/f0;->E(Landroid/view/View;)V

    iget-object v0, p0, Lc/e$g;->a:Lg/b$a;

    invoke-interface {v0, p1, p2}, Lg/b$a;->a(Lg/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Lg/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lc/e$g;->a:Lg/b$a;

    invoke-interface {v0, p1, p2}, Lg/b$a;->b(Lg/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public c(Lg/b;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lc/e$g;->a:Lg/b$a;

    invoke-interface {v0, p1, p2}, Lg/b$a;->c(Lg/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public d(Lg/b;)V
    .locals 2

    iget-object v0, p0, Lc/e$g;->a:Lg/b$a;

    invoke-interface {v0, p1}, Lg/b$a;->d(Lg/b;)V

    iget-object p1, p0, Lc/e$g;->b:Lc/e;

    iget-object v0, p1, Lc/e;->u:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lc/e;->j:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lc/e$g;->b:Lc/e;

    iget-object v0, v0, Lc/e;->v:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Lc/e$g;->b:Lc/e;

    iget-object v0, p1, Lc/e;->t:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lc/e;->V()V

    iget-object p1, p0, Lc/e$g;->b:Lc/e;

    iget-object v0, p1, Lc/e;->t:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Landroidx/core/view/f0;->b(Landroid/view/View;)Landroidx/core/view/c1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/core/view/c1;->b(F)Landroidx/core/view/c1;

    move-result-object v0

    iput-object v0, p1, Lc/e;->w:Landroidx/core/view/c1;

    iget-object p1, p0, Lc/e$g;->b:Lc/e;

    iget-object p1, p1, Lc/e;->w:Landroidx/core/view/c1;

    new-instance v0, Lc/e$g$a;

    invoke-direct {v0, p0}, Lc/e$g$a;-><init>(Lc/e$g;)V

    invoke-virtual {p1, v0}, Landroidx/core/view/c1;->h(Landroidx/core/view/d1;)Landroidx/core/view/c1;

    :cond_1
    iget-object p1, p0, Lc/e$g;->b:Lc/e;

    iget-object v0, p1, Lc/e;->l:Lc/c;

    if-eqz v0, :cond_2

    iget-object p1, p1, Lc/e;->s:Lg/b;

    invoke-interface {v0, p1}, Lc/c;->b(Lg/b;)V

    :cond_2
    iget-object p1, p0, Lc/e$g;->b:Lc/e;

    const/4 v0, 0x0

    iput-object v0, p1, Lc/e;->s:Lg/b;

    iget-object p1, p1, Lc/e;->z:Landroid/view/ViewGroup;

    invoke-static {p1}, Landroidx/core/view/f0;->E(Landroid/view/View;)V

    return-void
.end method
