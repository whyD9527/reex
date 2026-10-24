.class public final Lx1/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/f1;


# instance fields
.field private final e:Lx1/v1;


# direct methods
.method public constructor <init>(Lx1/v1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/e1;->e:Lx1/v1;

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h()Lx1/v1;
    .locals 1

    iget-object v0, p0, Lx1/e1;->e:Lx1/v1;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
