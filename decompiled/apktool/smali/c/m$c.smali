.class Lc/m$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/f1;


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

    iput-object p1, p0, Lc/m$c;->a:Lc/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lc/m$c;->a:Lc/m;

    iget-object p1, p1, Lc/m;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
