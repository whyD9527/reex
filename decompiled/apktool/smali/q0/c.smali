.class public final synthetic Lq0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lq0/d$a;


# direct methods
.method public synthetic constructor <init>(Lq0/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/c;->e:Lq0/d$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lq0/c;->e:Lq0/d$a;

    invoke-static {v0}, Lq0/d$a;->a(Lq0/d$a;)V

    return-void
.end method
