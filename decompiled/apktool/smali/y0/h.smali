.class public Ly0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/h$b;
    }
.end annotation


# instance fields
.field public final a:Lz0/k;

.field private b:Ly0/h$b;

.field private final c:Lz0/k$c;


# direct methods
.method public constructor <init>(Lo0/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly0/h$a;

    invoke-direct {v0, p0}, Ly0/h$a;-><init>(Ly0/h;)V

    iput-object v0, p0, Ly0/h;->c:Lz0/k$c;

    new-instance v1, Lz0/k;

    sget-object v2, Lz0/r;->b:Lz0/r;

    const-string v3, "flutter/mousecursor"

    invoke-direct {v1, p1, v3, v2}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;Lz0/l;)V

    iput-object v1, p0, Ly0/h;->a:Lz0/k;

    invoke-virtual {v1, v0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method static synthetic a(Ly0/h;)Ly0/h$b;
    .locals 0

    iget-object p0, p0, Ly0/h;->b:Ly0/h$b;

    return-object p0
.end method


# virtual methods
.method public b(Ly0/h$b;)V
    .locals 0

    iput-object p1, p0, Ly0/h;->b:Ly0/h$b;

    return-void
.end method
