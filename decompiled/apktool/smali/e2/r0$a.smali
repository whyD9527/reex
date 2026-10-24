.class public final Le2/r0$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


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

    iput-object p1, p0, Le2/r0$a;->a:Le2/r0;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/r0$a;->a:Le2/r0;

    invoke-static {p1}, Le2/r0;->h(Le2/r0;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/r0$a;->a:Le2/r0;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Le2/r0;->i(Le2/r0;Z)V

    iget-object p1, p0, Le2/r0$a;->a:Le2/r0;

    invoke-static {p1}, Le2/r0;->l(Le2/r0;)V

    return-void
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 3

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/r0$a;->a:Le2/r0;

    invoke-static {p1}, Le2/r0;->c(Le2/r0;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0x8

    if-ne v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1, v0}, Le2/r0;->k(Le2/r0;Z)V

    return v1
.end method
