.class Lo0/c$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# instance fields
.field public final a:Lz0/c$a;

.field public final b:Lo0/c$d;


# direct methods
.method constructor <init>(Lz0/c$a;Lo0/c$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/c$f;->a:Lz0/c$a;

    iput-object p2, p0, Lo0/c$f;->b:Lo0/c$d;

    return-void
.end method
