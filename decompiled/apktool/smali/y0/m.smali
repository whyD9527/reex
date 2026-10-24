.class public Ly0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/m$b;
    }
.end annotation


# instance fields
.field public final a:Lz0/k;

.field public final b:Landroid/content/pm/PackageManager;

.field private c:Ly0/m$b;

.field public final d:Lz0/k$c;


# direct methods
.method public constructor <init>(Lo0/a;Landroid/content/pm/PackageManager;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly0/m$a;

    invoke-direct {v0, p0}, Ly0/m$a;-><init>(Ly0/m;)V

    iput-object v0, p0, Ly0/m;->d:Lz0/k$c;

    iput-object p2, p0, Ly0/m;->b:Landroid/content/pm/PackageManager;

    new-instance p2, Lz0/k;

    sget-object v1, Lz0/r;->b:Lz0/r;

    const-string v2, "flutter/processtext"

    invoke-direct {p2, p1, v2, v1}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;Lz0/l;)V

    iput-object p2, p0, Ly0/m;->a:Lz0/k;

    invoke-virtual {p2, v0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method static synthetic a(Ly0/m;)Ly0/m$b;
    .locals 0

    iget-object p0, p0, Ly0/m;->c:Ly0/m$b;

    return-object p0
.end method


# virtual methods
.method public b(Ly0/m$b;)V
    .locals 0

    iput-object p1, p0, Ly0/m;->c:Ly0/m$b;

    return-void
.end method
