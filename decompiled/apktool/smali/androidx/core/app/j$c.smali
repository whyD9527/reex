.class public Landroidx/core/app/j$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field A:Z

.field B:Z

.field C:Ljava/lang/String;

.field D:Landroid/os/Bundle;

.field E:I

.field F:I

.field G:Landroid/app/Notification;

.field H:Landroid/widget/RemoteViews;

.field I:Landroid/widget/RemoteViews;

.field J:Landroid/widget/RemoteViews;

.field K:Ljava/lang/String;

.field L:I

.field M:Ljava/lang/String;

.field N:J

.field O:I

.field P:I

.field Q:Z

.field R:Landroid/app/Notification;

.field S:Z

.field T:Ljava/lang/Object;

.field public U:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public a:Landroid/content/Context;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/app/j$a;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/app/i0;",
            ">;"
        }
    .end annotation
.end field

.field d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/core/app/j$a;",
            ">;"
        }
    .end annotation
.end field

.field e:Ljava/lang/CharSequence;

.field f:Ljava/lang/CharSequence;

.field g:Landroid/app/PendingIntent;

.field h:Landroid/app/PendingIntent;

.field i:Landroid/widget/RemoteViews;

.field j:Landroid/graphics/Bitmap;

.field k:Ljava/lang/CharSequence;

.field l:I

.field m:I

.field n:Z

.field o:Z

.field p:Landroidx/core/app/j$d;

.field q:Ljava/lang/CharSequence;

.field r:Ljava/lang/CharSequence;

.field s:[Ljava/lang/CharSequence;

.field t:I

.field u:I

.field v:Z

.field w:Ljava/lang/String;

.field x:Z

.field y:Ljava/lang/String;

.field z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/app/j$c;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/app/j$c;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/core/app/j$c;->d:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/core/app/j$c;->n:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/core/app/j$c;->z:Z

    iput v1, p0, Landroidx/core/app/j$c;->E:I

    iput v1, p0, Landroidx/core/app/j$c;->F:I

    iput v1, p0, Landroidx/core/app/j$c;->L:I

    iput v1, p0, Landroidx/core/app/j$c;->O:I

    iput v1, p0, Landroidx/core/app/j$c;->P:I

    new-instance v2, Landroid/app/Notification;

    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    iput-object v2, p0, Landroidx/core/app/j$c;->R:Landroid/app/Notification;

    iput-object p1, p0, Landroidx/core/app/j$c;->a:Landroid/content/Context;

    iput-object p2, p0, Landroidx/core/app/j$c;->K:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v2, Landroid/app/Notification;->when:J

    iget-object p1, p0, Landroidx/core/app/j$c;->R:Landroid/app/Notification;

    const/4 p2, -0x1

    iput p2, p1, Landroid/app/Notification;->audioStreamType:I

    iput v1, p0, Landroidx/core/app/j$c;->m:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/core/app/j$c;->U:Ljava/util/ArrayList;

    iput-boolean v0, p0, Landroidx/core/app/j$c;->Q:Z

    return-void
.end method

.method protected static e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    if-nez p0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x1400

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method private f(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 9

    if-eqz p1, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/core/app/j$c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lr/b;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sget v2, Lr/b;->a:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-gt v2, v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-gt v2, v0, :cond_1

    return-object p1

    :cond_1
    int-to-double v1, v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    const/4 v4, 0x1

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-double v5, v3

    div-double/2addr v1, v5

    int-to-double v5, v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-double v7, v0

    div-double/2addr v5, v7

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-double v2, v2

    mul-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-double v5, v3

    mul-double/2addr v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {p1, v2, v0, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    :cond_2
    :goto_0
    return-object p1
.end method


# virtual methods
.method public a(Landroidx/core/app/j$a;)Landroidx/core/app/j$c;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/core/app/j$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public b()Landroid/app/Notification;
    .locals 1

    new-instance v0, Landroidx/core/app/k;

    invoke-direct {v0, p0}, Landroidx/core/app/k;-><init>(Landroidx/core/app/j$c;)V

    invoke-virtual {v0}, Landroidx/core/app/k;->c()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroidx/core/app/j$c;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/j$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-object p0
.end method

.method public d()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/j$c;->D:Landroid/os/Bundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Landroidx/core/app/j$c;->D:Landroid/os/Bundle;

    :cond_0
    iget-object v0, p0, Landroidx/core/app/j$c;->D:Landroid/os/Bundle;

    return-object v0
.end method

.method public g(Z)Landroidx/core/app/j$c;
    .locals 0

    iput-boolean p1, p0, Landroidx/core/app/j$c;->A:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/core/app/j$c;->B:Z

    return-object p0
.end method

.method public h(Landroid/app/PendingIntent;)Landroidx/core/app/j$c;
    .locals 0

    iput-object p1, p0, Landroidx/core/app/j$c;->g:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public i(Ljava/lang/CharSequence;)Landroidx/core/app/j$c;
    .locals 0

    invoke-static {p1}, Landroidx/core/app/j$c;->e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/j$c;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public j(Ljava/lang/CharSequence;)Landroidx/core/app/j$c;
    .locals 0

    invoke-static {p1}, Landroidx/core/app/j$c;->e(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/j$c;->e:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public k(Landroid/graphics/Bitmap;)Landroidx/core/app/j$c;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/core/app/j$c;->f(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Landroidx/core/app/j$c;->j:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public l(I)Landroidx/core/app/j$c;
    .locals 0

    iput p1, p0, Landroidx/core/app/j$c;->m:I

    return-object p0
.end method

.method public m(I)Landroidx/core/app/j$c;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/j$c;->R:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->icon:I

    return-object p0
.end method

.method public n(Landroidx/core/app/j$d;)Landroidx/core/app/j$c;
    .locals 1

    iget-object v0, p0, Landroidx/core/app/j$c;->p:Landroidx/core/app/j$d;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Landroidx/core/app/j$c;->p:Landroidx/core/app/j$d;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Landroidx/core/app/j$d;->g(Landroidx/core/app/j$c;)V

    :cond_0
    return-object p0
.end method
