.class public final synthetic Ld1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/a$d;


# instance fields
.field public final synthetic a:Ld1/a$b;


# direct methods
.method public synthetic constructor <init>(Ld1/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/b;->a:Ld1/a$b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lz0/a$e;)V
    .locals 1

    iget-object v0, p0, Ld1/b;->a:Ld1/a$b;

    invoke-static {v0, p1, p2}, Ld1/i;->b(Ld1/a$b;Ljava/lang/Object;Lz0/a$e;)V

    return-void
.end method
