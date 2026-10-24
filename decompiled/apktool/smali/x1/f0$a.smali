.class public final Lx1/f0$a;
.super Lj1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj1/b<",
        "Lj1/e;",
        "Lx1/f0;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    sget-object v0, Lj1/e;->b:Lj1/e$b;

    sget-object v1, Lx1/f0$a$a;->e:Lx1/f0$a$a;

    invoke-direct {p0, v0, v1}, Lj1/b;-><init>(Lj1/g$c;Lq1/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lx1/f0$a;-><init>()V

    return-void
.end method
