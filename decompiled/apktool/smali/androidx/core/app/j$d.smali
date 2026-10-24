.class public abstract Landroidx/core/app/j$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation


# instance fields
.field protected a:Landroidx/core/app/j$c;

.field b:Ljava/lang/CharSequence;

.field c:Ljava/lang/CharSequence;

.field d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/core/app/j$d;->d:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    iget-boolean v0, p0, Landroidx/core/app/j$d;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/core/app/j$d;->c:Ljava/lang/CharSequence;

    const-string v1, "android.summaryText"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Landroidx/core/app/j$d;->b:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    const-string v1, "android.title.big"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual {p0}, Landroidx/core/app/j$d;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "androidx.core.app.extra.COMPAT_TEMPLATE"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public abstract b(Landroidx/core/app/i;)V
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract d(Landroidx/core/app/i;)Landroid/widget/RemoteViews;
.end method

.method public abstract e(Landroidx/core/app/i;)Landroid/widget/RemoteViews;
.end method

.method public f(Landroidx/core/app/i;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public g(Landroidx/core/app/j$c;)V
    .locals 1

    iget-object v0, p0, Landroidx/core/app/j$d;->a:Landroidx/core/app/j$c;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Landroidx/core/app/j$d;->a:Landroidx/core/app/j$c;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Landroidx/core/app/j$c;->n(Landroidx/core/app/j$d;)Landroidx/core/app/j$c;

    :cond_0
    return-void
.end method
