.class Ly0/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly0/i;


# direct methods
.method constructor <init>(Ly0/i;)V
    .locals 0

    iput-object p1, p0, Ly0/i$a;->a:Ly0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m(Lz0/j;Lz0/k$d;)V
    .locals 0

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method
