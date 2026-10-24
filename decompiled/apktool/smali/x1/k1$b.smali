.class public final Lx1/k1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/k1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj1/g$c<",
        "Lx1/k1;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic e:Lx1/k1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx1/k1$b;

    invoke-direct {v0}, Lx1/k1$b;-><init>()V

    sput-object v0, Lx1/k1$b;->e:Lx1/k1$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
