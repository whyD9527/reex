.class public Lc/b;
.super Landroidx/fragment/app/c;
.source "SourceFile"

# interfaces
.implements Lc/c;
.implements Landroidx/core/app/l0$a;


# instance fields
.field private u:Lc/d;

.field private v:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/c;-><init>()V

    return-void
.end method

.method private B(Landroid/view/KeyEvent;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public A()Z
    .locals 2

    invoke-virtual {p0}, Lc/b;->d()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lc/b;->D(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Landroidx/core/app/l0;->d(Landroid/content/Context;)Landroidx/core/app/l0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lc/b;->w(Landroidx/core/app/l0;)V

    invoke-virtual {p0, v0}, Lc/b;->y(Landroidx/core/app/l0;)V

    invoke-virtual {v0}, Landroidx/core/app/l0;->e()V

    :try_start_0
    invoke-static {p0}, Landroidx/core/app/b;->n(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lc/b;->C(Landroid/content/Intent;)V

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public C(Landroid/content/Intent;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/app/h;->e(Landroid/app/Activity;Landroid/content/Intent;)V

    return-void
.end method

.method public D(Landroid/content/Intent;)Z
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/app/h;->f(Landroid/app/Activity;Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/d;->d(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/d;->f(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public b(Lg/b;)V
    .locals 0

    return-void
.end method

.method public closeOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Lc/b;->v()Lc/a;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/a;->f()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    :cond_1
    return-void
.end method

.method public d()Landroid/content/Intent;
    .locals 1

    invoke-static {p0}, Landroidx/core/app/h;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0}, Lc/b;->v()Lc/a;

    move-result-object v1

    const/16 v2, 0x52

    if-ne v0, v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lc/a;->o(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroidx/core/app/g;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public e(Lg/b$a;)Lg/b;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/d;->i(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public g(Lg/b;)V
    .locals 0

    return-void
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0}, Lc/d;->l()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 2

    iget-object v0, p0, Lc/b;->v:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/appcompat/widget/o1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/appcompat/widget/o1;

    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/appcompat/widget/o1;-><init>(Landroid/content/Context;Landroid/content/res/Resources;)V

    iput-object v0, p0, Lc/b;->v:Landroid/content/res/Resources;

    :cond_0
    iget-object v0, p0, Lc/b;->v:Landroid/content/res/Resources;

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0}, Lc/d;->o()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lc/b;->v:Landroid/content/res/Resources;

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget-object v1, p0, Lc/b;->v:Landroid/content/res/Resources;

    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    :cond_0
    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/d;->p(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onContentChanged()V
    .locals 0

    invoke-virtual {p0}, Lc/b;->z()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0}, Lc/d;->n()V

    invoke-virtual {v0, p1}, Lc/d;->q(Landroid/os/Bundle;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->onDestroy()V

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0}, Lc/d;->r()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-direct {p0, p2}, Lc/b;->B(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/c;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Lc/b;->v()Lc/a;

    move-result-object p1

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v0, 0x102002c

    if-ne p2, v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lc/a;->i()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lc/b;->A()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/c;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/d;->s(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onPostResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->onPostResume()V

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0}, Lc/d;->t()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/d;->u(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onStart()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->onStart()V

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0}, Lc/d;->v()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->onStop()V

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0}, Lc/d;->w()V

    return-void
.end method

.method protected onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Lc/d;->E(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public openOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Lc/b;->v()Lc/a;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/a;->p()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    :cond_1
    return-void
.end method

.method public setContentView(I)V
    .locals 1

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/d;->A(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/d;->B(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/d;->C(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTheme(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Activity;->setTheme(I)V

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/d;->D(I)V

    return-void
.end method

.method public t()V
    .locals 1

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0}, Lc/d;->o()V

    return-void
.end method

.method public u()Lc/d;
    .locals 1

    iget-object v0, p0, Lc/b;->u:Lc/d;

    if-nez v0, :cond_0

    invoke-static {p0, p0}, Lc/d;->g(Landroid/app/Activity;Lc/c;)Lc/d;

    move-result-object v0

    iput-object v0, p0, Lc/b;->u:Lc/d;

    :cond_0
    iget-object v0, p0, Lc/b;->u:Lc/d;

    return-object v0
.end method

.method public v()Lc/a;
    .locals 1

    invoke-virtual {p0}, Lc/b;->u()Lc/d;

    move-result-object v0

    invoke-virtual {v0}, Lc/d;->m()Lc/a;

    move-result-object v0

    return-object v0
.end method

.method public w(Landroidx/core/app/l0;)V
    .locals 0

    invoke-virtual {p1, p0}, Landroidx/core/app/l0;->b(Landroid/app/Activity;)Landroidx/core/app/l0;

    return-void
.end method

.method protected x(I)V
    .locals 0

    return-void
.end method

.method public y(Landroidx/core/app/l0;)V
    .locals 0

    return-void
.end method

.method public z()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method
