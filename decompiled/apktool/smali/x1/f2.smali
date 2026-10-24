.class public final Lx1/f2;
.super Lj1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/f2$a;
    }
.end annotation


# static fields
.field public static final f:Lx1/f2$a;


# instance fields
.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/f2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx1/f2$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lx1/f2;->f:Lx1/f2$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lx1/f2;->f:Lx1/f2$a;

    invoke-direct {p0, v0}, Lj1/a;-><init>(Lj1/g$c;)V

    return-void
.end method
