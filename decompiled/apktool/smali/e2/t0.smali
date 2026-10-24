.class public final Le2/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/content/Intent;)Ljava/util/HashMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reex.extra.title"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "title"

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const/4 v2, 0x4

    new-array v2, v2, [Lg1/j;

    const/4 v3, 0x0

    invoke-static {v1, v0}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object v0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    invoke-virtual {p0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "uriString"

    invoke-static {v3, v1}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object v1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    const-string v1, "reex.extra.http_header"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "httpHeader"

    invoke-static {v3, v1}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object v1

    aput-object v1, v2, v0

    const/4 v0, 0x3

    const-string v1, "reex.extra.subtitle"

    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "subtitle"

    invoke-static {v1, p0}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object p0

    aput-object p0, v2, v0

    invoke-static {v2}, Lh1/x;->e([Lg1/j;)Ljava/util/HashMap;

    move-result-object p0

    return-object p0
.end method
