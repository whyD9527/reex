.class final Lx1/r1$a;
.super Lx1/q1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final i:Lx1/r1;

.field private final j:Lx1/r1$b;

.field private final k:Lx1/s;

.field private final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx1/r1;Lx1/r1$b;Lx1/s;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lx1/q1;-><init>()V

    iput-object p1, p0, Lx1/r1$a;->i:Lx1/r1;

    iput-object p2, p0, Lx1/r1$a;->j:Lx1/r1$b;

    iput-object p3, p0, Lx1/r1$a;->k:Lx1/s;

    iput-object p4, p0, Lx1/r1$a;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lx1/r1$a;->y(Ljava/lang/Throwable;)V

    sget-object p1, Lg1/q;->a:Lg1/q;

    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 3

    iget-object p1, p0, Lx1/r1$a;->i:Lx1/r1;

    iget-object v0, p0, Lx1/r1$a;->j:Lx1/r1$b;

    iget-object v1, p0, Lx1/r1$a;->k:Lx1/s;

    iget-object v2, p0, Lx1/r1$a;->l:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lx1/r1;->t(Lx1/r1;Lx1/r1$b;Lx1/s;Ljava/lang/Object;)V

    return-void
.end method
