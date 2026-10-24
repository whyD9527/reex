.class public final Landroid/support/v4/media/MediaDescriptionCompat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/MediaDescriptionCompat$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/MediaDescriptionCompat;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/CharSequence;

.field private final g:Ljava/lang/CharSequence;

.field private final h:Ljava/lang/CharSequence;

.field private final i:Landroid/graphics/Bitmap;

.field private final j:Landroid/net/Uri;

.field private final k:Landroid/os/Bundle;

.field private final l:Landroid/net/Uri;

.field private m:Landroid/media/MediaDescription;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/support/v4/media/MediaDescriptionCompat$a;

    invoke-direct {v0}, Landroid/support/v4/media/MediaDescriptionCompat$a;-><init>()V

    sput-object v0, Landroid/support/v4/media/MediaDescriptionCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->e:Ljava/lang/String;

    iput-object p2, p0, Landroid/support/v4/media/MediaDescriptionCompat;->f:Ljava/lang/CharSequence;

    iput-object p3, p0, Landroid/support/v4/media/MediaDescriptionCompat;->g:Ljava/lang/CharSequence;

    iput-object p4, p0, Landroid/support/v4/media/MediaDescriptionCompat;->h:Ljava/lang/CharSequence;

    iput-object p5, p0, Landroid/support/v4/media/MediaDescriptionCompat;->i:Landroid/graphics/Bitmap;

    iput-object p6, p0, Landroid/support/v4/media/MediaDescriptionCompat;->j:Landroid/net/Uri;

    iput-object p7, p0, Landroid/support/v4/media/MediaDescriptionCompat;->k:Landroid/os/Bundle;

    iput-object p8, p0, Landroid/support/v4/media/MediaDescriptionCompat;->l:Landroid/net/Uri;

    return-void
.end method

.method public static a(Ljava/lang/Object;)Landroid/support/v4/media/MediaDescriptionCompat;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    new-instance v1, Landroid/support/v4/media/MediaDescriptionCompat$b;

    invoke-direct {v1}, Landroid/support/v4/media/MediaDescriptionCompat$b;-><init>()V

    check-cast p0, Landroid/media/MediaDescription;

    invoke-virtual {p0}, Landroid/media/MediaDescription;->getMediaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$b;->f(Ljava/lang/String;)Landroid/support/v4/media/MediaDescriptionCompat$b;

    invoke-virtual {p0}, Landroid/media/MediaDescription;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$b;->i(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$b;

    invoke-virtual {p0}, Landroid/media/MediaDescription;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$b;->h(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$b;

    invoke-virtual {p0}, Landroid/media/MediaDescription;->getDescription()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$b;->b(Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaDescriptionCompat$b;

    invoke-virtual {p0}, Landroid/media/MediaDescription;->getIconBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$b;->d(Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaDescriptionCompat$b;

    invoke-virtual {p0}, Landroid/media/MediaDescription;->getIconUri()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/media/MediaDescriptionCompat$b;->e(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$b;

    invoke-virtual {p0}, Landroid/media/MediaDescription;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, Landroid/support/v4/media/session/MediaSessionCompat;->k(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v2

    :cond_0
    const-string v3, "android.support.v4.media.description.MEDIA_URI"

    if-eqz v2, :cond_1

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/net/Uri;

    goto :goto_0

    :cond_1
    move-object v4, v0

    :goto_0
    if-eqz v4, :cond_3

    const-string v5, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    invoke-virtual {v2, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    move-result v6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_3
    move-object v0, v2

    :goto_1
    invoke-virtual {v1, v0}, Landroid/support/v4/media/MediaDescriptionCompat$b;->c(Landroid/os/Bundle;)Landroid/support/v4/media/MediaDescriptionCompat$b;

    if-eqz v4, :cond_4

    invoke-virtual {v1, v4}, Landroid/support/v4/media/MediaDescriptionCompat$b;->g(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$b;

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getMediaUri()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v4/media/MediaDescriptionCompat$b;->g(Landroid/net/Uri;)Landroid/support/v4/media/MediaDescriptionCompat$b;

    :goto_2
    invoke-virtual {v1}, Landroid/support/v4/media/MediaDescriptionCompat$b;->a()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object v0

    iput-object p0, v0, Landroid/support/v4/media/MediaDescriptionCompat;->m:Landroid/media/MediaDescription;

    :cond_5
    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->m:Landroid/media/MediaDescription;

    if-nez v0, :cond_0

    new-instance v0, Landroid/media/MediaDescription$Builder;

    invoke-direct {v0}, Landroid/media/MediaDescription$Builder;-><init>()V

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setMediaId(Ljava/lang/String;)Landroid/media/MediaDescription$Builder;

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->f:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->g:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setSubtitle(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->h:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setDescription(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setIconBitmap(Landroid/graphics/Bitmap;)Landroid/media/MediaDescription$Builder;

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->j:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setIconUri(Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->k:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setExtras(Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->l:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setMediaUri(Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;

    invoke-virtual {v0}, Landroid/media/MediaDescription$Builder;->build()Landroid/media/MediaDescription;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/MediaDescriptionCompat;->m:Landroid/media/MediaDescription;

    :cond_0
    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->f:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroid/support/v4/media/MediaDescriptionCompat;->g:Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/MediaDescriptionCompat;->h:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-virtual {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/MediaDescription;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaDescription;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
