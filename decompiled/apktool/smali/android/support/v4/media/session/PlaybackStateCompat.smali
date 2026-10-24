.class public final Landroid/support/v4/media/session/PlaybackStateCompat;
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
        Landroid/support/v4/media/session/PlaybackStateCompat$b;,
        Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/session/PlaybackStateCompat;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final e:I

.field final f:J

.field final g:J

.field final h:F

.field final i:J

.field final j:I

.field final k:Ljava/lang/CharSequence;

.field final l:J

.field m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;",
            ">;"
        }
    .end annotation
.end field

.field final n:J

.field final o:Landroid/os/Bundle;

.field private p:Landroid/media/session/PlaybackState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/support/v4/media/session/PlaybackStateCompat$a;

    invoke-direct {v0}, Landroid/support/v4/media/session/PlaybackStateCompat$a;-><init>()V

    sput-object v0, Landroid/support/v4/media/session/PlaybackStateCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IJJFJILjava/lang/CharSequence;JLjava/util/List;JLandroid/os/Bundle;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJFJI",
            "Ljava/lang/CharSequence;",
            "J",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;",
            ">;J",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    iput v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->e:I

    move-wide v1, p2

    iput-wide v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->f:J

    move-wide v1, p4

    iput-wide v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->g:J

    move v1, p6

    iput v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->h:F

    move-wide v1, p7

    iput-wide v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->i:J

    move v1, p9

    iput v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->j:I

    move-object v1, p10

    iput-object v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->k:Ljava/lang/CharSequence;

    move-wide v1, p11

    iput-wide v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->l:J

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v2, p13

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->m:Ljava/util/List;

    move-wide/from16 v1, p14

    iput-wide v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->n:J

    move-object/from16 v1, p16

    iput-object v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->o:Landroid/os/Bundle;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->e:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->f:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->h:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->l:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->g:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->i:J

    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->k:Ljava/lang/CharSequence;

    sget-object v0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->m:Ljava/util/List;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->n:J

    const-class v0, Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->o:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->j:I

    return-void
.end method

.method public static a(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat;
    .locals 21

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    move-object/from16 v1, p0

    check-cast v1, Landroid/media/session/PlaybackState;

    invoke-virtual {v1}, Landroid/media/session/PlaybackState;->getCustomActions()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->a(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object/from16 v17, v0

    invoke-virtual {v1}, Landroid/media/session/PlaybackState;->getExtras()Landroid/os/Bundle;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Landroid/support/v4/media/session/MediaSessionCompat;->b(Landroid/os/Bundle;)V

    new-instance v0, Landroid/support/v4/media/session/PlaybackStateCompat;

    move-object v4, v0

    invoke-virtual {v1}, Landroid/media/session/PlaybackState;->getState()I

    move-result v5

    invoke-virtual {v1}, Landroid/media/session/PlaybackState;->getPosition()J

    move-result-wide v6

    invoke-virtual {v1}, Landroid/media/session/PlaybackState;->getBufferedPosition()J

    move-result-wide v8

    invoke-virtual {v1}, Landroid/media/session/PlaybackState;->getPlaybackSpeed()F

    move-result v10

    invoke-virtual {v1}, Landroid/media/session/PlaybackState;->getActions()J

    move-result-wide v11

    const/4 v13, 0x0

    invoke-virtual {v1}, Landroid/media/session/PlaybackState;->getErrorMessage()Ljava/lang/CharSequence;

    move-result-object v14

    invoke-virtual {v1}, Landroid/media/session/PlaybackState;->getLastPositionUpdateTime()J

    move-result-wide v15

    invoke-virtual {v1}, Landroid/media/session/PlaybackState;->getActiveQueueItemId()J

    move-result-wide v18

    invoke-direct/range {v4 .. v20}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/List;JLandroid/os/Bundle;)V

    iput-object v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->p:Landroid/media/session/PlaybackState;

    :cond_1
    return-object v0
.end method

.method public static h(J)I
    .locals 2

    const-wide/16 v0, 0x4

    cmp-long v0, p0, v0

    if-nez v0, :cond_0

    const/16 p0, 0x7e

    return p0

    :cond_0
    const-wide/16 v0, 0x2

    cmp-long v0, p0, v0

    if-nez v0, :cond_1

    const/16 p0, 0x7f

    return p0

    :cond_1
    const-wide/16 v0, 0x20

    cmp-long v0, p0, v0

    if-nez v0, :cond_2

    const/16 p0, 0x57

    return p0

    :cond_2
    const-wide/16 v0, 0x10

    cmp-long v0, p0, v0

    if-nez v0, :cond_3

    const/16 p0, 0x58

    return p0

    :cond_3
    const-wide/16 v0, 0x1

    cmp-long v0, p0, v0

    if-nez v0, :cond_4

    const/16 p0, 0x56

    return p0

    :cond_4
    const-wide/16 v0, 0x40

    cmp-long v0, p0, v0

    if-nez v0, :cond_5

    const/16 p0, 0x5a

    return p0

    :cond_5
    const-wide/16 v0, 0x8

    cmp-long v0, p0, v0

    if-nez v0, :cond_6

    const/16 p0, 0x59

    return p0

    :cond_6
    const-wide/16 v0, 0x200

    cmp-long p0, p0, v0

    if-nez p0, :cond_7

    const/16 p0, 0x55

    return p0

    :cond_7
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public b()J
    .locals 2

    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->i:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->l:J

    return-wide v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->h:F

    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->p:Landroid/media/session/PlaybackState;

    if-nez v0, :cond_1

    new-instance v0, Landroid/media/session/PlaybackState$Builder;

    invoke-direct {v0}, Landroid/media/session/PlaybackState$Builder;-><init>()V

    iget v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->e:I

    iget-wide v3, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->f:J

    iget v5, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->h:F

    iget-wide v6, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->l:J

    move-object v1, v0

    invoke-virtual/range {v1 .. v7}, Landroid/media/session/PlaybackState$Builder;->setState(IJFJ)Landroid/media/session/PlaybackState$Builder;

    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->g:J

    invoke-virtual {v0, v1, v2}, Landroid/media/session/PlaybackState$Builder;->setBufferedPosition(J)Landroid/media/session/PlaybackState$Builder;

    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->i:J

    invoke-virtual {v0, v1, v2}, Landroid/media/session/PlaybackState$Builder;->setActions(J)Landroid/media/session/PlaybackState$Builder;

    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->k:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/media/session/PlaybackState$Builder;->setErrorMessage(Ljava/lang/CharSequence;)Landroid/media/session/PlaybackState$Builder;

    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->m:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/session/PlaybackState$CustomAction;

    invoke-virtual {v0, v2}, Landroid/media/session/PlaybackState$Builder;->addCustomAction(Landroid/media/session/PlaybackState$CustomAction;)Landroid/media/session/PlaybackState$Builder;

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->n:J

    invoke-virtual {v0, v1, v2}, Landroid/media/session/PlaybackState$Builder;->setActiveQueueItemId(J)Landroid/media/session/PlaybackState$Builder;

    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->o:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroid/media/session/PlaybackState$Builder;->setExtras(Landroid/os/Bundle;)Landroid/media/session/PlaybackState$Builder;

    invoke-virtual {v0}, Landroid/media/session/PlaybackState$Builder;->build()Landroid/media/session/PlaybackState;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->p:Landroid/media/session/PlaybackState;

    :cond_1
    iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->p:Landroid/media/session/PlaybackState;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->f:J

    return-wide v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->e:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PlaybackState {"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->f:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", buffered position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->g:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", speed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->h:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", updated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->l:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", actions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->i:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", error code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", error message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->k:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v1, ", custom actions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->m:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", active item id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->n:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->f:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->h:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->l:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->g:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->i:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->k:Ljava/lang/CharSequence;

    invoke-static {v0, p1, p2}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    iget-object p2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->m:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->n:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->o:Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    iget p2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->j:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
