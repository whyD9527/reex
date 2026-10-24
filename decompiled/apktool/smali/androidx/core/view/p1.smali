.class public final Landroidx/core/view/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/p1$d;,
        Landroidx/core/view/p1$e;,
        Landroidx/core/view/p1$c;,
        Landroidx/core/view/p1$b;,
        Landroidx/core/view/p1$a;
    }
.end annotation


# instance fields
.field private final a:Landroidx/core/view/p1$e;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance p2, Landroidx/core/view/p1$d;

    invoke-direct {p2, p1, p0}, Landroidx/core/view/p1$d;-><init>(Landroid/view/Window;Landroidx/core/view/p1;)V

    iput-object p2, p0, Landroidx/core/view/p1;->a:Landroidx/core/view/p1$e;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    new-instance v0, Landroidx/core/view/p1$c;

    invoke-direct {v0, p1, p2}, Landroidx/core/view/p1$c;-><init>(Landroid/view/Window;Landroid/view/View;)V

    :goto_0
    iput-object v0, p0, Landroidx/core/view/p1;->a:Landroidx/core/view/p1$e;

    goto :goto_1

    :cond_1
    new-instance v0, Landroidx/core/view/p1$b;

    invoke-direct {v0, p1, p2}, Landroidx/core/view/p1$b;-><init>(Landroid/view/Window;Landroid/view/View;)V

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/p1;->a:Landroidx/core/view/p1$e;

    invoke-virtual {v0, p1}, Landroidx/core/view/p1$e;->a(Z)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/p1;->a:Landroidx/core/view/p1$e;

    invoke-virtual {v0, p1}, Landroidx/core/view/p1$e;->b(Z)V

    return-void
.end method
