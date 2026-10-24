.class Lc/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/e;->G0(Lg/b$a;)Lg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lc/e;


# direct methods
.method constructor <init>(Lc/e;)V
    .locals 0

    iput-object p1, p0, Lc/e$d;->e:Lc/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lc/e$d;->e:Lc/e;

    iget-object v1, v0, Lc/e;->u:Landroid/widget/PopupWindow;

    iget-object v0, v0, Lc/e;->t:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v2, 0x37

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iget-object v0, p0, Lc/e$d;->e:Lc/e;

    invoke-virtual {v0}, Lc/e;->V()V

    iget-object v0, p0, Lc/e$d;->e:Lc/e;

    invoke-virtual {v0}, Lc/e;->D0()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/e$d;->e:Lc/e;

    iget-object v0, v0, Lc/e;->t:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Lc/e$d;->e:Lc/e;

    iget-object v2, v0, Lc/e;->t:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v2}, Landroidx/core/view/f0;->b(Landroid/view/View;)Landroidx/core/view/c1;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroidx/core/view/c1;->b(F)Landroidx/core/view/c1;

    move-result-object v1

    iput-object v1, v0, Lc/e;->w:Landroidx/core/view/c1;

    iget-object v0, p0, Lc/e$d;->e:Lc/e;

    iget-object v0, v0, Lc/e;->w:Landroidx/core/view/c1;

    new-instance v1, Lc/e$d$a;

    invoke-direct {v1, p0}, Lc/e$d$a;-><init>(Lc/e$d;)V

    invoke-virtual {v0, v1}, Landroidx/core/view/c1;->h(Landroidx/core/view/d1;)Landroidx/core/view/c1;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/e$d;->e:Lc/e;

    iget-object v0, v0, Lc/e;->t:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Lc/e$d;->e:Lc/e;

    iget-object v0, v0, Lc/e;->t:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_0
    return-void
.end method
