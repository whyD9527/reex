.class final Le2/h0;
.super Lz0/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le2/h0$a;
    }
.end annotation


# static fields
.field public static final d:Le2/h0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le2/h0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le2/h0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Le2/h0;->d:Le2/h0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lz0/q;-><init>()V

    return-void
.end method


# virtual methods
.method protected p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Le2/g0;

    if-eqz v0, :cond_0

    const/16 v0, 0x80

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Le2/g0;

    invoke-virtual {p2}, Le2/g0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/g0;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/g0;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/g0;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/g0;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/g0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/g0;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p2, Le2/u;

    if-eqz v0, :cond_1

    const/16 v0, 0x81

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Le2/u;

    invoke-virtual {p2}, Le2/u;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/u;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/u;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/u;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/u;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/u;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/u;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/u;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/u;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/u;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/u;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/u;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Le2/u;->l()Ljava/lang/String;

    move-result-object p2

    :try_start_0
    invoke-virtual {p0, p1, p2}, Le2/h0;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    invoke-super {p0, p1, p2}, Lz0/q;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    throw p1
.end method
