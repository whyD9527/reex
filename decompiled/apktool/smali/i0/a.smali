.class public final enum Li0/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li0/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Li0/a;

.field public static final enum g:Li0/a;

.field public static final enum h:Li0/a;

.field public static final enum i:Li0/a;

.field public static final enum j:Li0/a;

.field private static final synthetic k:[Li0/a;


# instance fields
.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Li0/a;

    const-string v1, "ILLEGAL_ARGUMENT"

    const/4 v2, 0x0

    const-string v3, "illegalArgument"

    invoke-direct {v0, v1, v2, v3}, Li0/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/a;->f:Li0/a;

    new-instance v0, Li0/a;

    const-string v1, "ALREADY_ACTIVE"

    const/4 v2, 0x1

    const-string v3, "alreadyActive"

    invoke-direct {v0, v1, v2, v3}, Li0/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/a;->g:Li0/a;

    new-instance v0, Li0/a;

    const-string v1, "MAX_LIMIT"

    const/4 v2, 0x2

    const-string v3, "maxLimit"

    invoke-direct {v0, v1, v2, v3}, Li0/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/a;->h:Li0/a;

    new-instance v0, Li0/a;

    const-string v1, "INTERNAL_ERROR"

    const/4 v2, 0x3

    const-string v3, "internalError"

    invoke-direct {v0, v1, v2, v3}, Li0/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/a;->i:Li0/a;

    new-instance v0, Li0/a;

    const-string v1, "SECURITY_ISSUE"

    const/4 v2, 0x4

    const-string v3, "securityIssue"

    invoke-direct {v0, v1, v2, v3}, Li0/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li0/a;->j:Li0/a;

    invoke-static {}, Li0/a;->a()[Li0/a;

    move-result-object v0

    sput-object v0, Li0/a;->k:[Li0/a;

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

    iput-object p3, p0, Li0/a;->e:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic a()[Li0/a;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Li0/a;

    sget-object v1, Li0/a;->f:Li0/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Li0/a;->g:Li0/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Li0/a;->h:Li0/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Li0/a;->i:Li0/a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Li0/a;->j:Li0/a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li0/a;
    .locals 1

    const-class v0, Li0/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li0/a;

    return-object p0
.end method

.method public static values()[Li0/a;
    .locals 1

    sget-object v0, Li0/a;->k:[Li0/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li0/a;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li0/a;->e:Ljava/lang/String;

    return-object v0
.end method
