.class public final Lx1/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx1/s0;

.field private static final b:Lx1/f0;

.field private static final c:Lx1/f0;

.field private static final d:Lx1/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx1/s0;

    invoke-direct {v0}, Lx1/s0;-><init>()V

    sput-object v0, Lx1/s0;->a:Lx1/s0;

    invoke-static {}, Lx1/e0;->a()Lx1/f0;

    move-result-object v0

    sput-object v0, Lx1/s0;->b:Lx1/f0;

    sget-object v0, Lx1/c2;->f:Lx1/c2;

    sput-object v0, Lx1/s0;->c:Lx1/f0;

    sget-object v0, Lkotlinx/coroutines/scheduling/b;->l:Lkotlinx/coroutines/scheduling/b;

    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/b;->r()Lx1/f0;

    move-result-object v0

    sput-object v0, Lx1/s0;->d:Lx1/f0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lx1/f0;
    .locals 1

    sget-object v0, Lx1/s0;->b:Lx1/f0;

    return-object v0
.end method

.method public static final b()Lx1/f0;
    .locals 1

    sget-object v0, Lx1/s0;->d:Lx1/f0;

    return-object v0
.end method

.method public static final c()Lx1/u1;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/internal/p;->c:Lx1/u1;

    return-object v0
.end method
