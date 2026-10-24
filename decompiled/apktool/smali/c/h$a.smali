.class Lc/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lc/h;


# direct methods
.method constructor <init>(Lc/h;)V
    .locals 0

    iput-object p1, p0, Lc/h$a;->e:Lc/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lc/h$a;->e:Lc/h;

    invoke-virtual {v0, p1}, Lc/h;->d(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
