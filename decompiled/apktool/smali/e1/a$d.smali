.class Le1/a$d;
.super Lz0/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# static fields
.field public static final d:Le1/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le1/a$d;

    invoke-direct {v0}, Le1/a$d;-><init>()V

    sput-object v0, Le1/a$d;->d:Le1/a$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lz0/q;-><init>()V

    return-void
.end method


# virtual methods
.method protected g(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 1

    const/16 v0, -0x80

    if-eq p1, v0, :cond_1

    const/16 v0, -0x7f

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1, p2}, Lz0/q;->g(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p2}, Lz0/q;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-static {p1}, Le1/a$e;->a(Ljava/util/ArrayList;)Le1/a$e;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0, p2}, Lz0/q;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-static {p1}, Le1/a$a;->a(Ljava/util/ArrayList;)Le1/a$a;

    move-result-object p1

    return-object p1
.end method

.method protected p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p2, Le1/a$a;

    if-eqz v0, :cond_0

    const/16 v0, 0x80

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Le1/a$a;

    invoke-virtual {p2}, Le1/a$a;->d()Ljava/util/ArrayList;

    move-result-object p2

    :goto_0
    invoke-virtual {p0, p1, p2}, Le1/a$d;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    instance-of v0, p2, Le1/a$e;

    if-eqz v0, :cond_1

    const/16 v0, 0x81

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Le1/a$e;

    invoke-virtual {p2}, Le1/a$e;->h()Ljava/util/ArrayList;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-super {p0, p1, p2}, Lz0/q;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
