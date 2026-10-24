.class public final Ll0/a$b;
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

    iput-object p1, p0, Ll0/a$b;->a:Lz0/k$d;

    iput-object p2, p0, Ll0/a$b;->b:Ll0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IILandroid/content/Intent;)Z
    .locals 1

    const v0, 0x185e4

    if-ne p1, v0, :cond_2

    const/4 p1, -0x1

    const/4 v0, 0x0

    if-ne p2, p1, :cond_0

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iget-object p2, p0, Ll0/a$b;->a:Lz0/k$d;

    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Ll0/a$b;->b:Ll0/a;

    invoke-static {p1}, Ll0/a;->a(Ll0/a;)Lt0/c;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "activityBinding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v0, p1

    :goto_1
    invoke-interface {v0, p0}, Lt0/c;->a(Lz0/m;)V

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return p1
.end method
