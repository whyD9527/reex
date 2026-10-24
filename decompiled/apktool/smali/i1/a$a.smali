.class public final Li1/a$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li1/a;->a(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILq1/a;)Ljava/lang/Thread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lq1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq1/a<",
            "Lg1/q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lq1/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq1/a<",
            "Lg1/q;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li1/a$a;->e:Lq1/a;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Li1/a$a;->e:Lq1/a;

    invoke-interface {v0}, Lq1/a;->invoke()Ljava/lang/Object;

    return-void
.end method
