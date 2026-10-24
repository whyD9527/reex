.class public final synthetic Landroidx/core/content/res/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Landroidx/core/content/res/h$b;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/core/content/res/h$b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/content/res/j;->e:Landroidx/core/content/res/h$b;

    iput p2, p0, Landroidx/core/content/res/j;->f:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/core/content/res/j;->e:Landroidx/core/content/res/h$b;

    iget v1, p0, Landroidx/core/content/res/j;->f:I

    invoke-static {v0, v1}, Landroidx/core/content/res/h$b;->a(Landroidx/core/content/res/h$b;I)V

    return-void
.end method
