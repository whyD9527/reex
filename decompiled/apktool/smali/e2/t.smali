.class public final synthetic Le2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lio/flutter/embedding/engine/a;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/embedding/engine/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le2/t;->e:Lio/flutter/embedding/engine/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le2/t;->e:Lio/flutter/embedding/engine/a;

    invoke-static {v0}, Lxyz/re/player/ex/MainActivity;->R(Lio/flutter/embedding/engine/a;)V

    return-void
.end method
