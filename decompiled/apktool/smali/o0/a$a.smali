.class Lo0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo0/a;


# direct methods
.method constructor <init>(Lo0/a;)V
    .locals 0

    iput-object p1, p0, Lo0/a$a;->a:Lo0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;Lz0/c$b;)V
    .locals 1

    iget-object p2, p0, Lo0/a$a;->a:Lo0/a;

    sget-object v0, Lz0/s;->b:Lz0/s;

    invoke-virtual {v0, p1}, Lz0/s;->c(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lo0/a;->h(Lo0/a;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lo0/a$a;->a:Lo0/a;

    invoke-static {p1}, Lo0/a;->i(Lo0/a;)Lo0/a$d;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lo0/a$a;->a:Lo0/a;

    invoke-static {p1}, Lo0/a;->i(Lo0/a;)Lo0/a$d;

    move-result-object p1

    iget-object p2, p0, Lo0/a$a;->a:Lo0/a;

    invoke-static {p2}, Lo0/a;->g(Lo0/a;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lo0/a$d;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
