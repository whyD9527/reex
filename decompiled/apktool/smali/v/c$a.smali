.class public final Lv/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lv/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)Lv/c;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lv/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lv/c;-><init>(Landroid/app/Activity;Lkotlin/jvm/internal/g;)V

    invoke-static {v0}, Lv/c;->a(Lv/c;)V

    return-object v0
.end method
