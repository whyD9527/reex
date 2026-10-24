.class final Lw1/g$a;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lq1/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw1/g;->b(Ljava/lang/String;)Lq1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/l;",
        "Lq1/l<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lw1/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw1/g$a;

    invoke-direct {v0}, Lw1/g$a;-><init>()V

    sput-object v0, Lw1/g$a;->e:Lw1/g$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "line"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lw1/g$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
