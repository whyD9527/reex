.class public final Le2/f0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le2/f0;->m(Lz0/j;Lz0/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz0/k$d;

.field final synthetic b:Le2/f0;


# direct methods
.method constructor <init>(Lz0/k$d;Le2/f0;)V
    .locals 0

    iput-object p1, p0, Le2/f0$b;->a:Lz0/k$d;

    iput-object p2, p0, Le2/f0$b;->b:Le2/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IILandroid/content/Intent;)Z
    .locals 0

    const p3, 0x786212

    if-ne p1, p3, :cond_2

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Le2/f0$b;->a:Lz0/k$d;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Le2/f0$b;->a:Lz0/k$d;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-interface {p1, p2}, Lz0/k$d;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Le2/f0$b;->b:Le2/f0;

    invoke-static {p1}, Le2/f0;->b(Le2/f0;)Lt0/c;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "activityBinding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_1
    invoke-interface {p1, p0}, Lt0/c;->a(Lz0/m;)V

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method
