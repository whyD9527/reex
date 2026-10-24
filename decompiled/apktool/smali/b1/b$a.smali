.class Lb1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/b;-><init>(Lb1/b$c;Ly0/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb1/b;


# direct methods
.method constructor <init>(Lb1/b;)V
    .locals 0

    iput-object p1, p0, Lb1/b$a;->a:Lb1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lb1/b$a;->a:Lb1/b;

    invoke-static {v0}, Lb1/b;->b(Lb1/b;)Lb1/b$c;

    move-result-object v0

    iget-object v1, p0, Lb1/b$a;->a:Lb1/b;

    invoke-static {v1, p1}, Lb1/b;->a(Lb1/b;Ljava/lang/String;)Landroid/view/PointerIcon;

    move-result-object p1

    invoke-interface {v0, p1}, Lb1/b$c;->setPointerIcon(Landroid/view/PointerIcon;)V

    return-void
.end method
