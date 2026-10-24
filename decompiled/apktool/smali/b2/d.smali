.class public final Lb2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lq1/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq1/q<",
            "La2/c<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Lj1/d<",
            "-",
            "Lg1/q;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lb2/d$a;->e:Lb2/d$a;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq1/q;

    sput-object v0, Lb2/d;->a:Lq1/q;

    return-void
.end method

.method public static final synthetic a()Lq1/q;
    .locals 1

    sget-object v0, Lb2/d;->a:Lq1/q;

    return-object v0
.end method
