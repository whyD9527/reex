.class public final Ll0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll0/a;->m(Lz0/j;Lz0/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz0/k$d;

.field final synthetic b:Ll0/a;


# direct methods
.method constructor <init>(Lz0/k$d;Ll0/a;)V
    .locals 0

    iput-object p1, p0, Ll0/a$a;->a:Lz0/k$d;

    iput-object p2, p0, Ll0/a$a;->b:Ll0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IILandroid/content/Intent;)Z
    .locals 4

    const/4 v0, 0x0

    const v1, 0x185e3

    if-ne p1, v1, :cond_5

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne p2, v1, :cond_3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, v2

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object p3

    goto :goto_1

    :cond_1
    move-object p3, v2

    :goto_1
    if-eqz p2, :cond_2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Landroid/content/ClipData;->getItemCount()I

    move-result p2

    :goto_2
    if-ge v0, p2, :cond_3

    invoke-virtual {p3, v0}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "clipData.getItemAt(index).uri.toString()"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    iget-object p2, p0, Ll0/a$a;->a:Lz0/k$d;

    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Ll0/a$a;->b:Ll0/a;

    invoke-static {p1}, Ll0/a;->a(Ll0/a;)Lt0/c;

    move-result-object p1

    if-nez p1, :cond_4

    const-string p1, "activityBinding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    move-object v2, p1

    :goto_4
    invoke-interface {v2, p0}, Lt0/c;->a(Lz0/m;)V

    const/4 v0, 0x1

    :cond_5
    return v0
.end method
