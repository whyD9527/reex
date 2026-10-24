.class public final Lj1/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj1/g$c<",
        "Lj1/e;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic e:Lj1/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj1/e$b;

    invoke-direct {v0}, Lj1/e$b;-><init>()V

    sput-object v0, Lj1/e$b;->e:Lj1/e$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
