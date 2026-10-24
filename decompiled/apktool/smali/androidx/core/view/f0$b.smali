.class Landroidx/core/view/f0$b;
.super Landroidx/core/view/f0$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/view/f0;->A()Landroidx/core/view/f0$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/core/view/f0$f<",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(ILjava/lang/Class;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/core/view/f0$f;-><init>(ILjava/lang/Class;II)V

    return-void
.end method


# virtual methods
.method bridge synthetic c(Landroid/view/View;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/core/view/f0$b;->e(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method e(Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p1}, Landroidx/core/view/f0$n;->b(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
