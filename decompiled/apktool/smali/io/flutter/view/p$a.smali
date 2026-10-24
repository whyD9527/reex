.class Lio/flutter/view/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/FlutterJNI$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/view/p;


# direct methods
.method constructor <init>(Lio/flutter/view/p;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/view/p$a;->a:Lio/flutter/view/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(J)Landroid/view/Choreographer$FrameCallback;
    .locals 2

    iget-object v0, p0, Lio/flutter/view/p$a;->a:Lio/flutter/view/p;

    invoke-static {v0}, Lio/flutter/view/p;->d(Lio/flutter/view/p;)Lio/flutter/view/p$c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/view/p$a;->a:Lio/flutter/view/p;

    invoke-static {v0}, Lio/flutter/view/p;->d(Lio/flutter/view/p;)Lio/flutter/view/p$c;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lio/flutter/view/p$c;->a(Lio/flutter/view/p$c;J)J

    iget-object p1, p0, Lio/flutter/view/p$a;->a:Lio/flutter/view/p;

    invoke-static {p1}, Lio/flutter/view/p;->d(Lio/flutter/view/p;)Lio/flutter/view/p$c;

    move-result-object p1

    iget-object p2, p0, Lio/flutter/view/p$a;->a:Lio/flutter/view/p;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lio/flutter/view/p;->e(Lio/flutter/view/p;Lio/flutter/view/p$c;)Lio/flutter/view/p$c;

    return-object p1

    :cond_0
    new-instance v0, Lio/flutter/view/p$c;

    iget-object v1, p0, Lio/flutter/view/p$a;->a:Lio/flutter/view/p;

    invoke-direct {v0, v1, p1, p2}, Lio/flutter/view/p$c;-><init>(Lio/flutter/view/p;J)V

    return-object v0
.end method


# virtual methods
.method public a(J)V
    .locals 1

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    invoke-direct {p0, p1, p2}, Lio/flutter/view/p$a;->b(J)Landroid/view/Choreographer$FrameCallback;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method
