.class public abstract Lr1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr1/c$a;
    }
.end annotation


# static fields
.field public static final e:Lr1/c$a;

.field private static final f:Lr1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr1/c$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lr1/c;->e:Lr1/c$a;

    sget-object v0, Ll1/b;->a:Ll1/a;

    invoke-virtual {v0}, Ll1/a;->b()Lr1/c;

    move-result-object v0

    sput-object v0, Lr1/c;->f:Lr1/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lr1/c;
    .locals 1

    sget-object v0, Lr1/c;->f:Lr1/c;

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method
