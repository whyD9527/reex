.class public final synthetic Lio/flutter/plugin/platform/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/platform/u;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/u;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/p;->a:Lio/flutter/plugin/platform/u;

    iput p2, p0, Lio/flutter/plugin/platform/p;->b:I

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/p;->a:Lio/flutter/plugin/platform/u;

    iget v1, p0, Lio/flutter/plugin/platform/p;->b:I

    invoke-static {v0, v1, p1, p2}, Lio/flutter/plugin/platform/u;->h(Lio/flutter/plugin/platform/u;ILandroid/view/View;Z)V

    return-void
.end method
