.class public Lu/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu/a$a;
    }
.end annotation


# static fields
.field public static final a:I
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CompileTimeConstant"
        }
    .end annotation
.end field

.field public static final b:I
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CompileTimeConstant"
        }
    .end annotation
.end field

.field public static final c:I
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CompileTimeConstant"
        }
    .end annotation
.end field

.field public static final d:I
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CompileTimeConstant"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_0

    sget v3, Lu/a$a;->a:I

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    sput v3, Lu/a;->a:I

    if-lt v0, v2, :cond_1

    sget v3, Lu/a$a;->b:I

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    sput v3, Lu/a;->b:I

    if-lt v0, v2, :cond_2

    sget v3, Lu/a$a;->c:I

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    sput v3, Lu/a;->c:I

    if-lt v0, v2, :cond_3

    sget v1, Lu/a$a;->d:I

    :cond_3
    sput v1, Lu/a;->d:I

    return-void
.end method

.method protected static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "REL"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    if-ltz p0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public static b()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_1

    const/16 v1, 0x20

    if-lt v0, v1, :cond_0

    sget-object v0, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    const-string v1, "Tiramisu"

    invoke-static {v1, v0}, Lu/a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
