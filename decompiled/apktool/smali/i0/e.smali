.class public final Li0/e;
.super Ljava/lang/Error;
.source "SourceFile"


# instance fields
.field private final e:Li0/a;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Li0/a;Ljava/lang/String;)V
    .locals 2

    const-string v0, "errorCause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Li0/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Li0/e;->e:Li0/a;

    iput-object p2, p0, Li0/e;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Li0/a;
    .locals 1

    iget-object v0, p0, Li0/e;->e:Li0/a;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li0/e;->f:Ljava/lang/String;

    return-object v0
.end method
