.class final Le2/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private final e:Landroid/content/Context;

.field private final f:Lz0/k;

.field private final g:Lg1/e;

.field private h:J

.field private final i:Le2/r0$d;

.field private final j:Le2/r0$c;

.field private final k:Le2/r0$b;

.field private l:Z

.field private final m:Le2/r0$a;

.field private final n:Landroid/view/ScaleGestureDetector;

.field private final o:Landroidx/core/view/d;

.field private final p:Landroid/view/WindowManager$LayoutParams;

.field private final q:Landroid/view/View;

.field private final r:Landroid/widget/ImageButton;

.field private final s:Landroid/widget/ImageButton;

.field private final t:Landroid/widget/SeekBar;

.field private u:F

.field private v:F

.field private w:I

.field private x:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lz0/k;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le2/r0;->e:Landroid/content/Context;

    iput-object p2, p0, Le2/r0;->f:Lz0/k;

    new-instance p2, Le2/r0$e;

    invoke-direct {p2, p0}, Le2/r0$e;-><init>(Le2/r0;)V

    invoke-static {p2}, Lg1/f;->a(Lq1/a;)Lg1/e;

    move-result-object p2

    iput-object p2, p0, Le2/r0;->g:Lg1/e;

    new-instance p2, Le2/r0$d;

    invoke-direct {p2, p0}, Le2/r0$d;-><init>(Le2/r0;)V

    iput-object p2, p0, Le2/r0;->i:Le2/r0$d;

    new-instance p2, Le2/r0$c;

    invoke-direct {p2, p0}, Le2/r0$c;-><init>(Le2/r0;)V

    iput-object p2, p0, Le2/r0;->j:Le2/r0$c;

    new-instance p2, Le2/r0$b;

    invoke-direct {p2, p0}, Le2/r0$b;-><init>(Le2/r0;)V

    iput-object p2, p0, Le2/r0;->k:Le2/r0$b;

    new-instance v0, Le2/r0$a;

    invoke-direct {v0, p0}, Le2/r0$a;-><init>(Le2/r0;)V

    iput-object v0, p0, Le2/r0;->m:Le2/r0$a;

    new-instance v1, Landroid/view/ScaleGestureDetector;

    invoke-direct {v1, p1, p2}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v1, p0, Le2/r0;->n:Landroid/view/ScaleGestureDetector;

    new-instance p2, Landroidx/core/view/d;

    invoke-direct {p2, p1, v0}, Landroidx/core/view/d;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Le2/r0;->o:Landroidx/core/view/d;

    new-instance p2, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {p2}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const/16 v0, 0x7f6

    goto :goto_0

    :cond_0
    const/16 v0, 0x7d2

    :goto_0
    iput v0, p2, Landroid/view/WindowManager$LayoutParams;->type:I

    const/16 v0, 0x8

    iput v0, p2, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/4 v0, -0x1

    iput v0, p2, Landroid/view/WindowManager$LayoutParams;->format:I

    const v0, 0x800055

    iput v0, p2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iput-object p2, p0, Le2/r0;->p:Landroid/view/WindowManager$LayoutParams;

    const p2, 0x7f0a0034

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const-string p2, "inflate(context, R.layout.video_popup_view, null)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/r0;->q:Landroid/view/View;

    const p2, 0x7f070063

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageButton;

    iput-object p2, p0, Le2/r0;->r:Landroid/widget/ImageButton;

    const p2, 0x7f07004c

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageButton;

    iput-object p2, p0, Le2/r0;->s:Landroid/widget/ImageButton;

    const p2, 0x7f07010f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/SeekBar;

    iput-object p1, p0, Le2/r0;->t:Landroid/widget/SeekBar;

    return-void
.end method

.method private final A(Z)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    iget-object v0, p0, Le2/r0;->r:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Le2/r0;->s:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Le2/r0;->t:Landroid/widget/SeekBar;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final B()V
    .locals 3

    iget-object v0, p0, Le2/r0;->f:Lz0/k;

    const-string v1, "onUpPlaybackSpeed"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Le2/r0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Le2/r0;->t(Le2/r0;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Le2/r0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Le2/r0;->s(Le2/r0;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic c(Le2/r0;)Landroid/widget/ImageButton;
    .locals 0

    iget-object p0, p0, Le2/r0;->s:Landroid/widget/ImageButton;

    return-object p0
.end method

.method public static final synthetic d(Le2/r0;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Le2/r0;->q:Landroid/view/View;

    return-object p0
.end method

.method public static final synthetic e(Le2/r0;)Landroid/view/WindowManager$LayoutParams;
    .locals 0

    iget-object p0, p0, Le2/r0;->p:Landroid/view/WindowManager$LayoutParams;

    return-object p0
.end method

.method public static final synthetic f(Le2/r0;)J
    .locals 2

    iget-wide v0, p0, Le2/r0;->h:J

    return-wide v0
.end method

.method public static final synthetic g(Le2/r0;)Landroid/view/WindowManager;
    .locals 0

    invoke-direct {p0}, Le2/r0;->p()Landroid/view/WindowManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Le2/r0;)V
    .locals 0

    invoke-direct {p0}, Le2/r0;->u()V

    return-void
.end method

.method public static final synthetic i(Le2/r0;Z)V
    .locals 0

    iput-boolean p1, p0, Le2/r0;->l:Z

    return-void
.end method

.method public static final synthetic j(Le2/r0;J)V
    .locals 0

    iput-wide p1, p0, Le2/r0;->h:J

    return-void
.end method

.method public static final synthetic k(Le2/r0;Z)V
    .locals 0

    invoke-direct {p0, p1}, Le2/r0;->A(Z)V

    return-void
.end method

.method public static final synthetic l(Le2/r0;)V
    .locals 0

    invoke-direct {p0}, Le2/r0;->B()V

    return-void
.end method

.method private final p()Landroid/view/WindowManager;
    .locals 1

    iget-object v0, p0, Le2/r0;->g:Lg1/e;

    invoke-interface {v0}, Lg1/e;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    return-object v0
.end method

.method private final q(Landroid/view/View;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f07004c

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    const v0, 0x7f070063

    if-eq p1, v0, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Le2/r0;->p()Landroid/view/WindowManager;

    move-result-object p1

    iget-object v0, p0, Le2/r0;->q:Landroid/view/View;

    invoke-interface {p1, v0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    const-string p1, "onViewClose"

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Le2/r0;->p()Landroid/view/WindowManager;

    move-result-object p1

    iget-object v0, p0, Le2/r0;->q:Landroid/view/View;

    invoke-interface {p1, v0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Le2/r0;->e:Landroid/content/Context;

    const-class v2, Lxyz/re/player/ex/MainActivity;

    invoke-direct {p1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v0, p0, Le2/r0;->e:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string p1, "onViewBack"

    :goto_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Le2/r0;->f:Lz0/k;

    invoke-virtual {v0, p1, v1}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private static final s(Le2/r0;Landroid/view/View;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Le2/r0;->q(Landroid/view/View;)V

    return-void
.end method

.method private static final t(Le2/r0;Landroid/view/View;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Le2/r0;->q(Landroid/view/View;)V

    return-void
.end method

.method private final u()V
    .locals 3

    iget-object v0, p0, Le2/r0;->f:Lz0/k;

    const-string v1, "onPlayPause"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final v()V
    .locals 2

    iget-object v0, p0, Le2/r0;->q:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWindowVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    invoke-direct {p0}, Le2/r0;->p()Landroid/view/WindowManager;

    move-result-object v0

    iget-object v1, p0, Le2/r0;->q:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private final w()V
    .locals 3

    iget-object v0, p0, Le2/r0;->f:Lz0/k;

    const-string v1, "onResetPlaybackSpeed"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lz0/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final m()V
    .locals 0

    invoke-direct {p0}, Le2/r0;->v()V

    return-void
.end method

.method public final n()Lz0/k;
    .locals 1

    iget-object v0, p0, Le2/r0;->f:Lz0/k;

    return-object v0
.end method

.method public final o()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Le2/r0;->e:Landroid/content/Context;

    return-object v0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/r0;->n:Landroid/view/ScaleGestureDetector;

    invoke-virtual {p1, p2}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object p1, p0, Le2/r0;->o:Landroidx/core/view/d;

    invoke-virtual {p1, p2}, Landroidx/core/view/d;->a(Landroid/view/MotionEvent;)Z

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v1, :cond_1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Le2/r0;->n:Landroid/view/ScaleGestureDetector;

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->isInProgress()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iget v0, p0, Le2/r0;->u:F

    sub-float/2addr p1, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    iget v0, p0, Le2/r0;->v:F

    sub-float/2addr p2, v0

    invoke-direct {p0}, Le2/r0;->p()Landroid/view/WindowManager;

    move-result-object v0

    iget-object v2, p0, Le2/r0;->q:Landroid/view/View;

    iget-object v3, p0, Le2/r0;->p:Landroid/view/WindowManager$LayoutParams;

    iget v4, p0, Le2/r0;->w:I

    float-to-int p1, p1

    sub-int/2addr v4, p1

    iput v4, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    iget p1, p0, Le2/r0;->x:I

    float-to-int p2, p2

    sub-int/2addr p1, p2

    iput p1, v3, Landroid/view/WindowManager$LayoutParams;->y:I

    sget-object p1, Lg1/q;->a:Lg1/q;

    invoke-interface {v0, v2, v3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Le2/r0;->l:Z

    if-eqz p1, :cond_3

    iput-boolean v0, p0, Le2/r0;->l:Z

    invoke-direct {p0}, Le2/r0;->w()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Le2/r0;->p:Landroid/view/WindowManager$LayoutParams;

    iget v0, p1, Landroid/view/WindowManager$LayoutParams;->x:I

    iput v0, p0, Le2/r0;->w:I

    iget p1, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    iput p1, p0, Le2/r0;->x:I

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iput p1, p0, Le2/r0;->u:F

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Le2/r0;->v:F

    :cond_3
    :goto_0
    move v0, v1

    :goto_1
    return v0
.end method

.method public final r()V
    .locals 2

    iget-object v0, p0, Le2/r0;->q:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const v1, 0x7f070110

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Le2/r0;->i:Le2/r0$d;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    iget-object v0, p0, Le2/r0;->r:Landroid/widget/ImageButton;

    new-instance v1, Le2/p0;

    invoke-direct {v1, p0}, Le2/p0;-><init>(Le2/r0;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Le2/r0;->s:Landroid/widget/ImageButton;

    new-instance v1, Le2/q0;

    invoke-direct {v1, p0}, Le2/q0;-><init>(Le2/r0;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Le2/r0;->t:Landroid/widget/SeekBar;

    iget-object v1, p0, Le2/r0;->j:Le2/r0$c;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    return-void
.end method

.method public final x(D)V
    .locals 13

    iget-object v0, p0, Le2/r0;->q:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Le2/r0;->q:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-double v2, v0

    int-to-double v4, v1

    div-double v6, v2, v4

    cmpg-double v8, v6, p1

    if-nez v8, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    if-eqz v8, :cond_1

    return-void

    :cond_1
    invoke-direct {p0}, Le2/r0;->p()Landroid/view/WindowManager;

    move-result-object v8

    iget-object v9, p0, Le2/r0;->q:Landroid/view/View;

    iget-object v10, p0, Le2/r0;->p:Landroid/view/WindowManager$LayoutParams;

    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    cmpl-double v6, v6, v11

    if-lez v6, :cond_2

    mul-double/2addr v4, p1

    double-to-int p1, v4

    iput p1, v10, Landroid/view/WindowManager$LayoutParams;->width:I

    iput v1, v10, Landroid/view/WindowManager$LayoutParams;->height:I

    goto :goto_1

    :cond_2
    iput v0, v10, Landroid/view/WindowManager$LayoutParams;->width:I

    div-double/2addr v2, p1

    double-to-int p1, v2

    iput p1, v10, Landroid/view/WindowManager$LayoutParams;->height:I

    :goto_1
    sget-object p1, Lg1/q;->a:Lg1/q;

    invoke-interface {v8, v9, v10}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final y(II)V
    .locals 1

    iget-object v0, p0, Le2/r0;->t:Landroid/widget/SeekBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object p1, p0, Le2/r0;->t:Landroid/widget/SeekBar;

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setMax(I)V

    return-void
.end method

.method public final z(DIIII)V
    .locals 3

    iget-object v0, p0, Le2/r0;->t:Landroid/widget/SeekBar;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v0, p4}, Landroid/widget/ProgressBar;->setMax(I)V

    invoke-virtual {v0, p3}, Landroid/widget/ProgressBar;->setProgress(I)V

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x1e

    if-lt p3, p4, :cond_0

    invoke-virtual {v0}, Landroid/widget/AbsSeekBar;->getThumb()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    new-instance p4, Landroid/graphics/BlendModeColorFilter;

    sget-object v1, Landroid/graphics/BlendMode;->SRC_ATOP:Landroid/graphics/BlendMode;

    invoke-direct {p4, p5, v1}, Landroid/graphics/BlendModeColorFilter;-><init>(ILandroid/graphics/BlendMode;)V

    invoke-virtual {p3, p4}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    new-instance p4, Landroid/graphics/BlendModeColorFilter;

    sget-object p5, Landroid/graphics/BlendMode;->SRC_ATOP:Landroid/graphics/BlendMode;

    invoke-direct {p4, p6, p5}, Landroid/graphics/BlendModeColorFilter;-><init>(ILandroid/graphics/BlendMode;)V

    invoke-virtual {p3, p4}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/widget/AbsSeekBar;->getThumb()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    sget-object p4, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p3, p5, p4}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    sget-object p4, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p3, p6, p4}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_0
    new-instance p3, Landroid/graphics/Point;

    invoke-direct {p3}, Landroid/graphics/Point;-><init>()V

    invoke-direct {p0}, Le2/r0;->p()Landroid/view/WindowManager;

    move-result-object p4

    invoke-interface {p4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p4

    invoke-virtual {p4, p3}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget p4, p3, Landroid/graphics/Point;->x:I

    iget p3, p3, Landroid/graphics/Point;->y:I

    invoke-direct {p0}, Le2/r0;->p()Landroid/view/WindowManager;

    move-result-object p5

    iget-object p6, p0, Le2/r0;->q:Landroid/view/View;

    iget-object v0, p0, Le2/r0;->p:Landroid/view/WindowManager$LayoutParams;

    const-wide v1, 0x3fddc28f5c28f5c3L    # 0.465

    if-le p4, p3, :cond_1

    int-to-double p3, p3

    mul-double/2addr p3, v1

    double-to-int p3, p3

    iput p3, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    int-to-double p3, p3

    mul-double/2addr p3, p1

    double-to-int p1, p3

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    goto :goto_1

    :cond_1
    int-to-double p3, p4

    mul-double/2addr p3, v1

    double-to-int p3, p3

    iput p3, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    int-to-double p3, p3

    div-double/2addr p3, p1

    double-to-int p1, p3

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    :goto_1
    sget-object p1, Lg1/q;->a:Lg1/q;

    invoke-interface {p5, p6, v0}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string p2, "android.intent.action.MAIN"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p2, 0x10000000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string p2, "android.intent.category.HOME"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p2, p0, Le2/r0;->e:Landroid/content/Context;

    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
