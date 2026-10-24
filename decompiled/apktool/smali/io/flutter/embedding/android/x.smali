.class public final synthetic Lio/flutter/embedding/android/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lio/flutter/embedding/android/z;

.field public final synthetic f:Lio/flutter/embedding/android/b0$c;

.field public final synthetic g:J

.field public final synthetic h:Landroid/view/KeyEvent;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/embedding/android/z;Lio/flutter/embedding/android/b0$c;JLandroid/view/KeyEvent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/embedding/android/x;->e:Lio/flutter/embedding/android/z;

    iput-object p2, p0, Lio/flutter/embedding/android/x;->f:Lio/flutter/embedding/android/b0$c;

    iput-wide p3, p0, Lio/flutter/embedding/android/x;->g:J

    iput-object p5, p0, Lio/flutter/embedding/android/x;->h:Landroid/view/KeyEvent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lio/flutter/embedding/android/x;->e:Lio/flutter/embedding/android/z;

    iget-object v1, p0, Lio/flutter/embedding/android/x;->f:Lio/flutter/embedding/android/b0$c;

    iget-wide v2, p0, Lio/flutter/embedding/android/x;->g:J

    iget-object v4, p0, Lio/flutter/embedding/android/x;->h:Landroid/view/KeyEvent;

    invoke-static {v0, v1, v2, v3, v4}, Lio/flutter/embedding/android/z;->d(Lio/flutter/embedding/android/z;Lio/flutter/embedding/android/b0$c;JLandroid/view/KeyEvent;)V

    return-void
.end method
