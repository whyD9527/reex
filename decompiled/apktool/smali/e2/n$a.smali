.class public final Le2/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Le2/n$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Le2/n$a;Landroid/content/Context;J)Landroid/app/PendingIntent;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Le2/n$a;->c(Landroid/content/Context;J)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Le2/n$a;Landroid/content/Context;[B)Landroid/graphics/Bitmap;
    .locals 0

    invoke-direct {p0, p1, p2}, Le2/n$a;->d(Landroid/content/Context;[B)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private final c(Landroid/content/Context;J)Landroid/app/PendingIntent;
    .locals 2

    invoke-static {p2, p3}, Landroid/support/v4/media/session/PlaybackStateCompat;->h(J)I

    move-result p2

    new-instance p3, Landroid/content/Intent;

    const-string v0, "android.intent.action.MEDIA_BUTTON"

    invoke-direct {p3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v0, Landroid/view/KeyEvent;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2}, Landroid/view/KeyEvent;-><init>(II)V

    const-string v1, "android.intent.extra.KEY_EVENT"

    invoke-virtual {p3, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/high16 v0, 0x4000000

    invoke-static {p1, p2, p3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    const-string p2, "getBroadcast(\n          \u2026G_IMMUTABLE\n            )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final d(Landroid/content/Context;[B)Landroid/graphics/Bitmap;
    .locals 8

    array-length v0, p2

    const/4 v1, 0x0

    invoke-static {p2, v1, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f050056

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const v1, 0x7f050055

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-gt v1, v0, :cond_1

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-gt v1, p1, :cond_1

    return-object p2

    :cond_1
    int-to-double v0, v0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    const/4 v3, 0x1

    invoke-static {v3, v2}, Lt1/d;->a(II)I

    move-result v2

    int-to-double v4, v2

    div-double/2addr v0, v4

    int-to-double v4, p1

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    invoke-static {v3, p1}, Lt1/d;->a(II)I

    move-result p1

    int-to-double v6, p1

    div-double/2addr v4, v6

    invoke-static {v0, v1, v4, v5}, Lt1/d;->c(DD)D

    move-result-wide v0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    int-to-double v4, p1

    mul-double/2addr v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int p1, v4

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-double v4, v2

    mul-double/2addr v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {p2, p1, v0, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method
