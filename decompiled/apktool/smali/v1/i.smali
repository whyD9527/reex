.class public final Lv1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lv1/b<",
        "TR;>;"
    }
.end annotation


# instance fields
.field private final a:Lv1/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv1/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lq1/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq1/l<",
            "TT;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv1/b;Lq1/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/b<",
            "+TT;>;",
            "Lq1/l<",
            "-TT;+TR;>;)V"
        }
    .end annotation

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv1/i;->a:Lv1/b;

    iput-object p2, p0, Lv1/i;->b:Lq1/l;

    return-void
.end method

.method public static final synthetic a(Lv1/i;)Lv1/b;
    .locals 0

    iget-object p0, p0, Lv1/i;->a:Lv1/b;

    return-object p0
.end method

.method public static final synthetic b(Lv1/i;)Lq1/l;
    .locals 0

    iget-object p0, p0, Lv1/i;->b:Lq1/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Lv1/i$a;

    invoke-direct {v0, p0}, Lv1/i$a;-><init>(Lv1/i;)V

    return-object v0
.end method
