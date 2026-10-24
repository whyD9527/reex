.class public Ly0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz0/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo0/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz0/a;

    sget-object v1, Lz0/f;->a:Lz0/f;

    const-string v2, "flutter/system"

    invoke-direct {v0, p1, v2, v1}, Lz0/a;-><init>(Lz0/c;Ljava/lang/String;Lz0/i;)V

    iput-object v0, p0, Ly0/q;->a:Lz0/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "SystemChannel"

    const-string v1, "Sending memory pressure warning to Flutter."

    invoke-static {v0, v1}, Ln0/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const-string v1, "type"

    const-string v2, "memoryPressure"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Ly0/q;->a:Lz0/a;

    invoke-virtual {v1, v0}, Lz0/a;->c(Ljava/lang/Object;)V

    return-void
.end method
