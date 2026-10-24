.class final Ld2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

.field private final b:J


# direct methods
.method public constructor <init>(Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;J)V
    .locals 1

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld2/b$a;->a:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    iput-wide p2, p0, Ld2/b$a;->b:J

    return-void
.end method


# virtual methods
.method public final a()Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;
    .locals 1

    iget-object v0, p0, Ld2/b$a;->a:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Ld2/b$a;->b:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ld2/b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ld2/b$a;

    iget-object v1, p0, Ld2/b$a;->a:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    iget-object v3, p1, Ld2/b$a;->a:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Ld2/b$a;->b:J

    iget-wide v5, p1, Ld2/b$a;->b:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ld2/b$a;->a:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ld2/b$a;->b:J

    invoke-static {v1, v2}, Ld2/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SurfaceTextureEntryData(entry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld2/b$a;->a:Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", surfacePtr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ld2/b$a;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
