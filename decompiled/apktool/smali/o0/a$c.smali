.class Lo0/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final a:Lo0/c;


# direct methods
.method private constructor <init>(Lo0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/a$c;->a:Lo0/c;

    return-void
.end method

.method synthetic constructor <init>(Lo0/c;Lo0/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lo0/a$c;-><init>(Lo0/c;)V

    return-void
.end method


# virtual methods
.method public a(Lz0/c$d;)Lz0/c$c;
    .locals 1

    iget-object v0, p0, Lo0/a$c;->a:Lo0/c;

    invoke-virtual {v0, p1}, Lo0/c;->a(Lz0/c$d;)Lz0/c$c;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b()Lz0/c$c;
    .locals 1

    invoke-static {p0}, Lz0/b;->a(Lz0/c;)Lz0/c$c;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;Lz0/c$a;)V
    .locals 1

    iget-object v0, p0, Lo0/a$c;->a:Lo0/c;

    invoke-virtual {v0, p1, p2}, Lo0/c;->c(Ljava/lang/String;Lz0/c$a;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/nio/ByteBuffer;Lz0/c$b;)V
    .locals 1

    iget-object v0, p0, Lo0/a$c;->a:Lo0/c;

    invoke-virtual {v0, p1, p2, p3}, Lo0/c;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;Lz0/c$b;)V

    return-void
.end method

.method public e(Ljava/lang/String;Lz0/c$a;Lz0/c$c;)V
    .locals 1

    iget-object v0, p0, Lo0/a$c;->a:Lo0/c;

    invoke-virtual {v0, p1, p2, p3}, Lo0/c;->e(Ljava/lang/String;Lz0/c$a;Lz0/c$c;)V

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 2

    iget-object v0, p0, Lo0/a$c;->a:Lo0/c;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lo0/c;->d(Ljava/lang/String;Ljava/nio/ByteBuffer;Lz0/c$b;)V

    return-void
.end method
