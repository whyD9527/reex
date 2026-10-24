.class final La2/a$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La2/a;->a(La2/c;Lj1/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.flow.AbstractFlow"
    f = "Flow.kt"
    l = {
        0xd4
    }
    m = "collect"
.end annotation


# instance fields
.field e:Ljava/lang/Object;

.field synthetic f:Ljava/lang/Object;

.field final synthetic g:La2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La2/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field h:I


# direct methods
.method constructor <init>(La2/a;Lj1/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La2/a<",
            "TT;>;",
            "Lj1/d<",
            "-",
            "La2/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La2/a$a;->g:La2/a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lj1/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, La2/a$a;->f:Ljava/lang/Object;

    iget p1, p0, La2/a$a;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, La2/a$a;->h:I

    iget-object p1, p0, La2/a$a;->g:La2/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, La2/a;->a(La2/c;Lj1/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
