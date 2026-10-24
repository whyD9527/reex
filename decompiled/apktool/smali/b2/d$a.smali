.class final synthetic Lb2/d$a;
.super Lkotlin/jvm/internal/j;
.source "SourceFile"

# interfaces
.implements Lq1/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final e:Lb2/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb2/d$a;

    invoke-direct {v0}, Lb2/d$a;-><init>()V

    sput-object v0, Lb2/d$a;->e:Lb2/d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-class v2, La2/c;

    const/4 v1, 0x3

    const-string v3, "emit"

    const-string v4, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final b(La2/c;Ljava/lang/Object;Lj1/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/c<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Lj1/d<",
            "-",
            "Lg1/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1, p2, p3}, La2/c;->emit(Ljava/lang/Object;Lj1/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La2/c;

    check-cast p3, Lj1/d;

    invoke-virtual {p0, p1, p2, p3}, Lb2/d$a;->b(La2/c;Ljava/lang/Object;Lj1/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
