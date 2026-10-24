.class public final Lz1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz1/i$c;,
        Lz1/i$a;,
        Lz1/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final a:Lz1/i$b;

.field private static final b:Lz1/i$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz1/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz1/i$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lz1/i;->a:Lz1/i$b;

    new-instance v0, Lz1/i$c;

    invoke-direct {v0}, Lz1/i$c;-><init>()V

    sput-object v0, Lz1/i;->b:Lz1/i$c;

    return-void
.end method

.method public static final synthetic a()Lz1/i$c;
    .locals 1

    sget-object v0, Lz1/i;->b:Lz1/i$c;

    return-object v0
.end method

.method public static b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    return-object p0
.end method
