.class public final synthetic Li0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Li0/d;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/c;->e:Li0/d;

    iput-object p2, p0, Li0/c;->f:Ljava/lang/String;

    iput-object p3, p0, Li0/c;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Li0/c;->e:Li0/d;

    iget-object v1, p0, Li0/c;->f:Ljava/lang/String;

    iget-object v2, p0, Li0/c;->g:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Li0/d;->a(Li0/d;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
