.class public final Le2/r0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ScaleGestureDetector$OnScaleGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le2/r0;-><init>(Landroid/content/Context;Lz0/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Le2/r0;


# direct methods
.method constructor <init>(Le2/r0;)V
    .locals 0

    iput-object p1, p0, Le2/r0$b;->a:Le2/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 4

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iget-object v1, p0, Le2/r0$b;->a:Le2/r0;

    invoke-static {v1}, Le2/r0;->g(Le2/r0;)Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget v1, v0, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result p1

    iget-object v2, p0, Le2/r0$b;->a:Le2/r0;

    invoke-static {v2}, Le2/r0;->d(Le2/r0;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int v2, v2

    iget-object v3, p0, Le2/r0$b;->a:Le2/r0;

    invoke-static {v3}, Le2/r0;->d(Le2/r0;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, p1

    float-to-int p1, v3

    if-le v2, v1, :cond_0

    mul-int/2addr p1, v1

    div-int/2addr p1, v2

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-le p1, v0, :cond_1

    mul-int/2addr v1, v0

    div-int/2addr v1, p1

    goto :goto_1

    :cond_1
    move v0, p1

    :goto_1
    iget-object p1, p0, Le2/r0$b;->a:Le2/r0;

    invoke-static {p1}, Le2/r0;->g(Le2/r0;)Landroid/view/WindowManager;

    move-result-object p1

    iget-object v2, p0, Le2/r0$b;->a:Le2/r0;

    invoke-static {v2}, Le2/r0;->d(Le2/r0;)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Le2/r0$b;->a:Le2/r0;

    invoke-static {v3}, Le2/r0;->e(Le2/r0;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    iput v1, v3, Landroid/view/WindowManager$LayoutParams;->width:I

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->height:I

    sget-object v0, Lg1/q;->a:Lg1/q;

    invoke-interface {p1, v2, v3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
