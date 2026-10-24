.class final enum Li0/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li0/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Li0/b;

.field public static final enum g:Li0/b;

.field public static final enum h:Li0/b;

.field public static final enum i:Li0/b;

.field public static final enum j:Li0/b;

.field public static final enum k:Li0/b;

.field public static final enum l:Li0/b;

.field public static final enum m:Li0/b;

.field private static final synthetic n:[Li0/b;


# instance fields
.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Li0/b;

    const-string v1, "HANDLE"

    const/4 v2, 0x0

    const-string v3, "handle"

    invoke-direct {v0, v1, v2, v3}, Li0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/b;->f:Li0/b;

    new-instance v0, Li0/b;

    const-string v1, "SERVICE_NAME"

    const/4 v2, 0x1

    const-string v3, "service.name"

    invoke-direct {v0, v1, v2, v3}, Li0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/b;->g:Li0/b;

    new-instance v0, Li0/b;

    const-string v1, "SERVICE_TYPE"

    const/4 v2, 0x2

    const-string v3, "service.type"

    invoke-direct {v0, v1, v2, v3}, Li0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/b;->h:Li0/b;

    new-instance v0, Li0/b;

    const-string v1, "SERVICE_HOST"

    const/4 v2, 0x3

    const-string v3, "service.host"

    invoke-direct {v0, v1, v2, v3}, Li0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/b;->i:Li0/b;

    new-instance v0, Li0/b;

    const-string v1, "SERVICE_PORT"

    const/4 v2, 0x4

    const-string v3, "service.port"

    invoke-direct {v0, v1, v2, v3}, Li0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/b;->j:Li0/b;

    new-instance v0, Li0/b;

    const-string v1, "SERVICE_TXT"

    const/4 v2, 0x5

    const-string v3, "service.txt"

    invoke-direct {v0, v1, v2, v3}, Li0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/b;->k:Li0/b;

    new-instance v0, Li0/b;

    const-string v1, "ERROR_CAUSE"

    const/4 v2, 0x6

    const-string v3, "error.cause"

    invoke-direct {v0, v1, v2, v3}, Li0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/b;->l:Li0/b;

    new-instance v0, Li0/b;

    const-string v1, "ERROR_MESSAGE"

    const/4 v2, 0x7

    const-string v3, "error.message"

    invoke-direct {v0, v1, v2, v3}, Li0/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/b;->m:Li0/b;

    invoke-static {}, Li0/b;->a()[Li0/b;

    move-result-object v0

    sput-object v0, Li0/b;->n:[Li0/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Li0/b;->e:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic a()[Li0/b;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Li0/b;

    sget-object v1, Li0/b;->f:Li0/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Li0/b;->g:Li0/b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Li0/b;->h:Li0/b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Li0/b;->i:Li0/b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Li0/b;->j:Li0/b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Li0/b;->k:Li0/b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Li0/b;->l:Li0/b;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Li0/b;->m:Li0/b;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li0/b;
    .locals 1

    const-class v0, Li0/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li0/b;

    return-object p0
.end method

.method public static values()[Li0/b;
    .locals 1

    sget-object v0, Li0/b;->n:[Li0/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li0/b;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li0/b;->e:Ljava/lang/String;

    return-object v0
.end method
