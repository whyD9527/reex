.class public final enum Ly0/r$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly0/r$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Ly0/r$d;

.field public static final enum g:Ly0/r$d;

.field public static final enum h:Ly0/r$d;

.field public static final enum i:Ly0/r$d;

.field private static final synthetic j:[Ly0/r$d;


# instance fields
.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly0/r$d;

    const-string v1, "CHARACTERS"

    const/4 v2, 0x0

    const-string v3, "TextCapitalization.characters"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$d;->f:Ly0/r$d;

    new-instance v0, Ly0/r$d;

    const-string v1, "WORDS"

    const/4 v2, 0x1

    const-string v3, "TextCapitalization.words"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$d;->g:Ly0/r$d;

    new-instance v0, Ly0/r$d;

    const-string v1, "SENTENCES"

    const/4 v2, 0x2

    const-string v3, "TextCapitalization.sentences"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$d;->h:Ly0/r$d;

    new-instance v0, Ly0/r$d;

    const-string v1, "NONE"

    const/4 v2, 0x3

    const-string v3, "TextCapitalization.none"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$d;->i:Ly0/r$d;

    invoke-static {}, Ly0/r$d;->a()[Ly0/r$d;

    move-result-object v0

    sput-object v0, Ly0/r$d;->j:[Ly0/r$d;

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

    iput-object p3, p0, Ly0/r$d;->e:Ljava/lang/String;

    return-void
.end method

.method private static synthetic a()[Ly0/r$d;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ly0/r$d;

    sget-object v1, Ly0/r$d;->f:Ly0/r$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$d;->g:Ly0/r$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$d;->h:Ly0/r$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$d;->i:Ly0/r$d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method static b(Ljava/lang/String;)Ly0/r$d;
    .locals 5

    invoke-static {}, Ly0/r$d;->values()[Ly0/r$d;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Ly0/r$d;->e:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/NoSuchFieldException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No such TextCapitalization: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Ly0/r$d;
    .locals 1

    const-class v0, Ly0/r$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly0/r$d;

    return-object p0
.end method

.method public static values()[Ly0/r$d;
    .locals 1

    sget-object v0, Ly0/r$d;->j:[Ly0/r$d;

    invoke-virtual {v0}, [Ly0/r$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly0/r$d;

    return-object v0
.end method
