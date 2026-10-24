.class La/b$b;
.super La/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic b:La/b;


# direct methods
.method constructor <init>(La/b;)V
    .locals 0

    iput-object p1, p0, La/b$b;->b:La/b;

    invoke-direct {p0}, La/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public g0(ILandroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, La/b$b;->b:La/b;

    iget-object v1, v0, La/b;->f:Landroid/os/Handler;

    if-eqz v1, :cond_0

    new-instance v2, La/b$c;

    invoke-direct {v2, v0, p1, p2}, La/b$c;-><init>(La/b;ILandroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, La/b;->a(ILandroid/os/Bundle;)V

    :goto_0
    return-void
.end method
