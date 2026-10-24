.class public final synthetic Le2/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaScannerConnection$OnScanCompletedListener;


# instance fields
.field public final synthetic a:Ljava/util/Map;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lz0/k$d;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;Ljava/util/List;Lz0/k$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le2/e0;->a:Ljava/util/Map;

    iput-object p2, p0, Le2/e0;->b:Ljava/util/List;

    iput-object p3, p0, Le2/e0;->c:Lz0/k$d;

    return-void
.end method


# virtual methods
.method public final onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 3

    iget-object v0, p0, Le2/e0;->a:Ljava/util/Map;

    iget-object v1, p0, Le2/e0;->b:Ljava/util/List;

    iget-object v2, p0, Le2/e0;->c:Lz0/k$d;

    invoke-static {v0, v1, v2, p1, p2}, Le2/f0;->a(Ljava/util/Map;Ljava/util/List;Lz0/k$d;Ljava/lang/String;Landroid/net/Uri;)V

    return-void
.end method
