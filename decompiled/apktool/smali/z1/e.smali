.class public final enum Lz1/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lz1/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lz1/e;

.field public static final enum f:Lz1/e;

.field public static final enum g:Lz1/e;

.field private static final synthetic h:[Lz1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz1/e;

    const-string v1, "SUSPEND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz1/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz1/e;->e:Lz1/e;

    new-instance v0, Lz1/e;

    const-string v1, "DROP_OLDEST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz1/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz1/e;->f:Lz1/e;

    new-instance v0, Lz1/e;

    const-string v1, "DROP_LATEST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lz1/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz1/e;->g:Lz1/e;

    invoke-static {}, Lz1/e;->a()[Lz1/e;

    move-result-object v0

    sput-object v0, Lz1/e;->h:[Lz1/e;

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

.method private static final synthetic a()[Lz1/e;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lz1/e;

    sget-object v1, Lz1/e;->e:Lz1/e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lz1/e;->f:Lz1/e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lz1/e;->g:Lz1/e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz1/e;
    .locals 1

    const-class v0, Lz1/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz1/e;

    return-object p0
.end method

.method public static values()[Lz1/e;
    .locals 1

    sget-object v0, Lz1/e;->h:[Lz1/e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz1/e;

    return-object v0
.end method
