.class final enum Lq/p$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq/p$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lq/p$b;

.field public static final enum f:Lq/p$b;

.field public static final enum g:Lq/p$b;

.field public static final enum h:Lq/p$b;

.field private static final synthetic i:[Lq/p$b;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lq/p$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lq/p$b;->e:Lq/p$b;

    new-instance v1, Lq/p$b;

    const-string v3, "START"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lq/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lq/p$b;->f:Lq/p$b;

    new-instance v3, Lq/p$b;

    const-string v5, "END"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lq/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lq/p$b;->g:Lq/p$b;

    new-instance v5, Lq/p$b;

    const-string v7, "CENTER"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lq/p$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lq/p$b;->h:Lq/p$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lq/p$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lq/p$b;->i:[Lq/p$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lq/p$b;
    .locals 1

    const-class v0, Lq/p$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq/p$b;

    return-object p0
.end method

.method public static values()[Lq/p$b;
    .locals 1

    sget-object v0, Lq/p$b;->i:[Lq/p$b;

    invoke-virtual {v0}, [Lq/p$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq/p$b;

    return-object v0
.end method
