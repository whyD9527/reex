.class Lc/m$b;
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

    iput-object p1, p0, Lc/m$b;->a:Lc/m;

    invoke-direct {p0}, Landroidx/core/view/e1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lc/m$b;->a:Lc/m;

    const/4 v0, 0x0

    iput-object v0, p1, Lc/m;->y:Lg/h;

    iget-object p1, p1, Lc/m;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method
