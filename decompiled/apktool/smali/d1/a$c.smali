.class public final enum Ld1/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld1/a$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Ld1/a$c;

.field public static final enum g:Ld1/a$c;

.field public static final enum h:Ld1/a$c;

.field public static final enum i:Ld1/a$c;

.field public static final enum j:Ld1/a$c;

.field public static final enum k:Ld1/a$c;

.field public static final enum l:Ld1/a$c;

.field public static final enum m:Ld1/a$c;

.field public static final enum n:Ld1/a$c;

.field public static final enum o:Ld1/a$c;

.field public static final enum p:Ld1/a$c;

.field private static final synthetic q:[Ld1/a$c;


# instance fields
.field final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld1/a$c;

    const-string v1, "ROOT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ld1/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/a$c;->f:Ld1/a$c;

    new-instance v0, Ld1/a$c;

    const-string v1, "MUSIC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ld1/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/a$c;->g:Ld1/a$c;

    new-instance v0, Ld1/a$c;

    const-string v1, "PODCASTS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Ld1/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/a$c;->h:Ld1/a$c;

    new-instance v0, Ld1/a$c;

    const-string v1, "RINGTONES"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Ld1/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/a$c;->i:Ld1/a$c;

    new-instance v0, Ld1/a$c;

    const-string v1, "ALARMS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Ld1/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/a$c;->j:Ld1/a$c;

    new-instance v0, Ld1/a$c;

    const-string v1, "NOTIFICATIONS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Ld1/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/a$c;->k:Ld1/a$c;

    new-instance v0, Ld1/a$c;

    const-string v1, "PICTURES"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Ld1/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/a$c;->l:Ld1/a$c;

    new-instance v0, Ld1/a$c;

    const-string v1, "MOVIES"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Ld1/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/a$c;->m:Ld1/a$c;

    new-instance v0, Ld1/a$c;

    const-string v1, "DOWNLOADS"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v2}, Ld1/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/a$c;->n:Ld1/a$c;

    new-instance v0, Ld1/a$c;

    const-string v1, "DCIM"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, v2}, Ld1/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/a$c;->o:Ld1/a$c;

    new-instance v0, Ld1/a$c;

    const-string v1, "DOCUMENTS"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2, v2}, Ld1/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ld1/a$c;->p:Ld1/a$c;

    invoke-static {}, Ld1/a$c;->a()[Ld1/a$c;

    move-result-object v0

    sput-object v0, Ld1/a$c;->q:[Ld1/a$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Ld1/a$c;->e:I

    return-void
.end method

.method private static synthetic a()[Ld1/a$c;
    .locals 3

    const/16 v0, 0xb

    new-array v0, v0, [Ld1/a$c;

    sget-object v1, Ld1/a$c;->f:Ld1/a$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ld1/a$c;->g:Ld1/a$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ld1/a$c;->h:Ld1/a$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ld1/a$c;->i:Ld1/a$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ld1/a$c;->j:Ld1/a$c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ld1/a$c;->k:Ld1/a$c;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ld1/a$c;->l:Ld1/a$c;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Ld1/a$c;->m:Ld1/a$c;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Ld1/a$c;->n:Ld1/a$c;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Ld1/a$c;->o:Ld1/a$c;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Ld1/a$c;->p:Ld1/a$c;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ld1/a$c;
    .locals 1

    const-class v0, Ld1/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld1/a$c;

    return-object p0
.end method

.method public static values()[Ld1/a$c;
    .locals 1

    sget-object v0, Ld1/a$c;->q:[Ld1/a$c;

    invoke-virtual {v0}, [Ld1/a$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld1/a$c;

    return-object v0
.end method
