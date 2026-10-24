.class final Lx1/b1$a$a;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lq1/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/b1$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/l;",
        "Lq1/l<",
        "Lj1/g$b;",
        "Lx1/b1;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lx1/b1$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx1/b1$a$a;

    invoke-direct {v0}, Lx1/b1$a$a;-><init>()V

    sput-object v0, Lx1/b1$a$a;->e:Lx1/b1$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lj1/g$b;)Lx1/b1;
    .locals 1

    instance-of v0, p1, Lx1/b1;

    if-eqz v0, :cond_0

    check-cast p1, Lx1/b1;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj1/g$b;

    invoke-virtual {p0, p1}, Lx1/b1$a$a;->a(Lj1/g$b;)Lx1/b1;

    move-result-object p1

    return-object p1
.end method
