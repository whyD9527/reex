.class public final Le2/j0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le2/j0;->m(Lz0/j;Lz0/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz0/k$d;

.field final synthetic b:Le2/j0;


# direct methods
.method constructor <init>(Lz0/k$d;Le2/j0;)V
    .locals 0

    iput-object p1, p0, Le2/j0$a;->a:Lz0/k$d;

    iput-object p2, p0, Le2/j0$a;->b:Le2/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I[Ljava/lang/String;[I)Z
    .locals 2

    const-string v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "grantResults"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    const/16 v1, 0x54f

    if-ne p1, v1, :cond_3

    array-length p1, p3

    if-nez p1, :cond_0

    move p2, v0

    :cond_0
    xor-int/lit8 p1, p2, 0x1

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    invoke-static {p3, p1}, Lh1/b;->f([II)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Le2/j0$a;->a:Lz0/k$d;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Le2/j0$a;->a:Lz0/k$d;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-interface {p1, p2}, Lz0/k$d;->a(Ljava/lang/Object;)V

    iget-object p1, p0, Le2/j0$a;->b:Le2/j0;

    invoke-static {p1}, Le2/j0;->a(Le2/j0;)Lt0/c;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "activityBinding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_2
    invoke-interface {p1, p0}, Lt0/c;->c(Lz0/o;)V

    move p2, v0

    :cond_3
    return p2
.end method
