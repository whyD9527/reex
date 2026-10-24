.class final Lb2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj1/d<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lb2/b;

.field private static final f:Lj1/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb2/b;

    invoke-direct {v0}, Lb2/b;-><init>()V

    sput-object v0, Lb2/b;->e:Lb2/b;

    sget-object v0, Lj1/h;->e:Lj1/h;

    sput-object v0, Lb2/b;->f:Lj1/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContext()Lj1/g;
    .locals 1

    sget-object v0, Lb2/b;->f:Lj1/g;

    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method
