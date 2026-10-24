.class public final enum Ly0/r$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly0/r$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Ly0/r$g;

.field public static final enum g:Ly0/r$g;

.field public static final enum h:Ly0/r$g;

.field public static final enum i:Ly0/r$g;

.field public static final enum j:Ly0/r$g;

.field public static final enum k:Ly0/r$g;

.field public static final enum l:Ly0/r$g;

.field public static final enum m:Ly0/r$g;

.field public static final enum n:Ly0/r$g;

.field public static final enum o:Ly0/r$g;

.field public static final enum p:Ly0/r$g;

.field private static final synthetic q:[Ly0/r$g;


# instance fields
.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly0/r$g;

    const-string v1, "TEXT"

    const/4 v2, 0x0

    const-string v3, "TextInputType.text"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$g;->f:Ly0/r$g;

    new-instance v0, Ly0/r$g;

    const-string v1, "DATETIME"

    const/4 v2, 0x1

    const-string v3, "TextInputType.datetime"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$g;->g:Ly0/r$g;

    new-instance v0, Ly0/r$g;

    const-string v1, "NAME"

    const/4 v2, 0x2

    const-string v3, "TextInputType.name"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$g;->h:Ly0/r$g;

    new-instance v0, Ly0/r$g;

    const-string v1, "POSTAL_ADDRESS"

    const/4 v2, 0x3

    const-string v3, "TextInputType.address"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$g;->i:Ly0/r$g;

    new-instance v0, Ly0/r$g;

    const-string v1, "NUMBER"

    const/4 v2, 0x4

    const-string v3, "TextInputType.number"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$g;->j:Ly0/r$g;

    new-instance v0, Ly0/r$g;

    const-string v1, "PHONE"

    const/4 v2, 0x5

    const-string v3, "TextInputType.phone"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$g;->k:Ly0/r$g;

    new-instance v0, Ly0/r$g;

    const-string v1, "MULTILINE"

    const/4 v2, 0x6

    const-string v3, "TextInputType.multiline"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$g;->l:Ly0/r$g;

    new-instance v0, Ly0/r$g;

    const-string v1, "EMAIL_ADDRESS"

    const/4 v2, 0x7

    const-string v3, "TextInputType.emailAddress"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$g;->m:Ly0/r$g;

    new-instance v0, Ly0/r$g;

    const-string v1, "URL"

    const/16 v2, 0x8

    const-string v3, "TextInputType.url"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$g;->n:Ly0/r$g;

    new-instance v0, Ly0/r$g;

    const-string v1, "VISIBLE_PASSWORD"

    const/16 v2, 0x9

    const-string v3, "TextInputType.visiblePassword"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$g;->o:Ly0/r$g;

    new-instance v0, Ly0/r$g;

    const-string v1, "NONE"

    const/16 v2, 0xa

    const-string v3, "TextInputType.none"

    invoke-direct {v0, v1, v2, v3}, Ly0/r$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly0/r$g;->p:Ly0/r$g;

    invoke-static {}, Ly0/r$g;->a()[Ly0/r$g;

    move-result-object v0

    sput-object v0, Ly0/r$g;->q:[Ly0/r$g;

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

    iput-object p3, p0, Ly0/r$g;->e:Ljava/lang/String;

    return-void
.end method

.method private static synthetic a()[Ly0/r$g;
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Ly0/r$g;

    sget-object v1, Ly0/r$g;->f:Ly0/r$g;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$g;->g:Ly0/r$g;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$g;->h:Ly0/r$g;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$g;->i:Ly0/r$g;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$g;->j:Ly0/r$g;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$g;->k:Ly0/r$g;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$g;->l:Ly0/r$g;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$g;->m:Ly0/r$g;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$g;->n:Ly0/r$g;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$g;->o:Ly0/r$g;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Ly0/r$g;->p:Ly0/r$g;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    return-object v0
.end method

.method static b(Ljava/lang/String;)Ly0/r$g;
    .locals 5

    invoke-static {}, Ly0/r$g;->values()[Ly0/r$g;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Ly0/r$g;->e:Ljava/lang/String;

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

    const-string v2, "No such TextInputType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Ly0/r$g;
    .locals 1

    const-class v0, Ly0/r$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly0/r$g;

    return-object p0
.end method

.method public static values()[Ly0/r$g;
    .locals 1

    sget-object v0, Ly0/r$g;->q:[Ly0/r$g;

    invoke-virtual {v0}, [Ly0/r$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly0/r$g;

    return-object v0
.end method
