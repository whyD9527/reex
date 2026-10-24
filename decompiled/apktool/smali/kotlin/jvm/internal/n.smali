.class public Lkotlin/jvm/internal/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lkotlin/jvm/internal/o;

.field private static final b:[Lu1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/internal/o;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/jvm/internal/o;

    invoke-direct {v0}, Lkotlin/jvm/internal/o;-><init>()V

    :goto_0
    sput-object v0, Lkotlin/jvm/internal/n;->a:Lkotlin/jvm/internal/o;

    const/4 v0, 0x0

    new-array v0, v0, [Lu1/c;

    sput-object v0, Lkotlin/jvm/internal/n;->b:[Lu1/c;

    return-void
.end method

.method public static a(Lkotlin/jvm/internal/i;)Lu1/e;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/n;->a:Lkotlin/jvm/internal/o;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/o;->a(Lkotlin/jvm/internal/i;)Lu1/e;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lu1/c;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/n;->a:Lkotlin/jvm/internal/o;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/o;->b(Ljava/lang/Class;)Lu1/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lu1/d;
    .locals 2

    sget-object v0, Lkotlin/jvm/internal/n;->a:Lkotlin/jvm/internal/o;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lkotlin/jvm/internal/o;->c(Ljava/lang/Class;Ljava/lang/String;)Lu1/d;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lkotlin/jvm/internal/h;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/n;->a:Lkotlin/jvm/internal/o;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/o;->d(Lkotlin/jvm/internal/h;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lkotlin/jvm/internal/l;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/n;->a:Lkotlin/jvm/internal/o;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/o;->e(Lkotlin/jvm/internal/l;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
