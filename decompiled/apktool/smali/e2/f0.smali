.class public final Le2/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;
.implements Lt0/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le2/f0$a;
    }
.end annotation


# static fields
.field public static final d:Le2/f0$a;


# instance fields
.field private a:Lz0/k;

.field private b:Lt0/c;

.field private c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le2/f0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le2/f0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Le2/f0;->d:Le2/f0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/util/Map;Ljava/util/List;Lz0/k$d;Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Le2/f0;->f(Ljava/util/Map;Ljava/util/List;Lz0/k$d;Ljava/lang/String;Landroid/net/Uri;)V

    return-void
.end method

.method public static final synthetic b(Le2/f0;)Lt0/c;
    .locals 0

    iget-object p0, p0, Le2/f0;->b:Lt0/c;

    return-object p0
.end method

.method private final c()Landroid/app/Activity;
    .locals 2

    iget-object v0, p0, Le2/f0;->b:Lt0/c;

    if-nez v0, :cond_0

    const-string v0, "activityBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "activityBinding.activity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final d()Landroid/content/ContentResolver;
    .locals 2

    iget-object v0, p0, Le2/f0;->c:Landroid/content/Context;

    if-nez v0, :cond_0

    const-string v0, "applicationContext"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "applicationContext.contentResolver"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final f(Ljava/util/Map;Ljava/util/List;Lz0/k$d;Ljava/lang/String;Landroid/net/Uri;)V
    .locals 1

    const-string v0, "$map"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$paths"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p4

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    invoke-interface {p0, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result p3

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    if-ne p3, p1, :cond_1

    invoke-interface {p2, p0}, Lz0/k$d;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private final g(Ljava/lang/String;)Ljava/util/List;
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Le2/u;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "_id"

    const-string v3, "_display_name"

    const-string v4, "relative_path"

    const-string v5, "volume_name"

    const-string v6, "_size"

    const-string v7, "date_modified"

    const-string v8, "author"

    const-string v9, "album"

    const-string v10, "artist"

    const-string v11, "album_artist"

    const-string v12, "title"

    const-string v13, "duration"

    const-string v14, "_data"

    filled-new-array/range {v2 .. v14}, [Ljava/lang/String;

    move-result-object v17

    invoke-static/range {p1 .. p1}, Landroid/provider/MediaStore$Audio$Media;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v16

    move-object/from16 v2, p0

    iget-object v0, v2, Le2/f0;->c:Landroid/content/Context;

    if-nez v0, :cond_0

    const-string v0, "applicationContext"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v15

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-virtual/range {v15 .. v20}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    if-eqz v4, :cond_2

    :try_start_0
    const-string v0, "_id"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v5

    const-string v0, "_display_name"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v6

    const-string v0, "relative_path"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v7

    const-string v0, "_size"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v8

    const-string v0, "volume_name"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v9

    const-string v0, "date_modified"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v10

    const-string v0, "author"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v11

    const-string v0, "album"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v12

    const-string v0, "artist"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v13

    const-string v0, "album_artist"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v14

    const-string v0, "title"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v15

    const-string v0, "duration"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    const-string v0, "_data"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v2

    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    move-object/from16 v17, v1

    :try_start_1
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move/from16 v18, v5

    move-object/from16 v5, p1

    :try_start_2
    invoke-static {v5, v0, v1}, Le2/b0;->a(Ljava/lang/String;J)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getContentUri(volumeName, id).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v21

    invoke-interface {v4, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move/from16 v36, v6

    :try_start_3
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v27

    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v31

    invoke-interface {v4, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v32

    invoke-interface {v4, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v33

    invoke-interface {v4, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v34

    invoke-interface {v4, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v35
    :try_end_3
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move/from16 v37, v7

    :try_start_4
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v29
    :try_end_4
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move/from16 v38, v2

    :try_start_5
    new-instance v2, Le2/u;
    :try_end_5
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move/from16 v39, v3

    :try_start_6
    const-string v3, "getString(displayNameColumn)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "getString(pathColumn)"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "getString(volumeNameColumn)"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "getString(dataColumn)"

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v19, v2

    move-object/from16 v20, v0

    move-object/from16 v23, v1

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-object/from16 v26, v7

    invoke-direct/range {v19 .. v35}, Le2/u;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object/from16 v1, v17

    :try_start_7
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_6

    :catch_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_4

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    move/from16 v38, v2

    :goto_1
    move/from16 v39, v3

    goto :goto_4

    :catch_4
    move-exception v0

    move/from16 v38, v2

    move/from16 v39, v3

    goto :goto_3

    :catch_5
    move-exception v0

    move/from16 v38, v2

    move/from16 v39, v3

    goto :goto_2

    :catch_6
    move-exception v0

    move/from16 v38, v2

    move/from16 v39, v3

    move/from16 v18, v5

    :goto_2
    move/from16 v36, v6

    :goto_3
    move/from16 v37, v7

    :goto_4
    move-object/from16 v1, v17

    :goto_5
    :try_start_8
    const-string v2, "MediaStoreChannel"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "queryAudios: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :goto_6
    move/from16 v5, v18

    move/from16 v6, v36

    move/from16 v7, v37

    move/from16 v2, v38

    move/from16 v3, v39

    goto/16 :goto_0

    :cond_1
    sget-object v0, Lg1/q;->a:Lg1/q;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    const/4 v2, 0x0

    invoke-static {v4, v2}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_7

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_9
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-static {v4, v1}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    :cond_2
    :goto_7
    return-object v1
.end method

.method private final k(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Le2/g0;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "_id"

    const-string v3, "_display_name"

    const-string v4, "relative_path"

    const-string v5, "_size"

    const-string v6, "volume_name"

    const-string v7, "_data"

    const-string v8, "date_modified"

    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    move-result-object v11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_0

    const-string v3, "media_type = ?"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const-string v3, " or "

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz p4, :cond_3

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-lez v8, :cond_1

    move v8, v4

    goto :goto_1

    :cond_1
    move v8, v5

    :goto_1
    if-eqz v8, :cond_2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const-string v8, "relative_path = ?"

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    if-eqz p3, :cond_7

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-lez v8, :cond_5

    move v8, v4

    goto :goto_3

    :cond_5
    move v8, v5

    :goto_3
    if-eqz v8, :cond_6

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    const-string v8, "mime_type = ?"

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-static/range {p1 .. p1}, Landroid/provider/MediaStore$Files;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v10

    move-object/from16 v3, p0

    iget-object v6, v3, Le2/f0;->c:Landroid/content/Context;

    const/4 v7, 0x0

    if-nez v6, :cond_8

    const-string v6, "applicationContext"

    invoke-static {v6}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v6, v7

    :cond_8
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v9

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_9

    move v6, v4

    goto :goto_4

    :cond_9
    move v6, v5

    :goto_4
    if-eqz v6, :cond_a

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    goto :goto_5

    :cond_a
    move-object v12, v7

    :goto_5
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v4

    if-eqz v0, :cond_b

    new-array v0, v5, [Ljava/lang/String;

    invoke-interface {v2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    move-object v13, v0

    goto :goto_6

    :cond_b
    move-object v13, v7

    :goto_6
    const/4 v14, 0x0

    invoke-virtual/range {v9 .. v14}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    if-eqz v2, :cond_10

    :try_start_0
    const-string v0, "_id"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    const-string v0, "_display_name"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v5

    const-string v0, "relative_path"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v6

    const-string v0, "_size"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v8

    const-string v0, "volume_name"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v9

    const-string v0, "_data"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v10

    const-string v0, "date_modified"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v11

    :cond_c
    :goto_7
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_f

    :try_start_1
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v12
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v14, p1

    :try_start_2
    invoke-static {v14, v12, v13}, Landroid/provider/MediaStore$Files;->getContentUri(Ljava/lang/String;J)Landroid/net/Uri;

    move-result-object v0

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v20

    if-eqz v19, :cond_c

    if-nez v20, :cond_d

    goto :goto_7

    :cond_d
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v17

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_e

    const-string v12, "Unknown"

    :goto_8
    move-object/from16 v21, v12

    goto :goto_9

    :cond_e
    const-string v13, "cursor.getString(volumeNameColumn) ?: \"Unknown\""

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_8

    :goto_9
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v2, v11}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v23

    new-instance v13, Le2/g0;

    const-string v15, "toString()"

    invoke-static {v0, v15}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "getString(dataColumn)"

    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v15, v13

    move-object/from16 v16, v0

    move-object/from16 v22, v12

    invoke-direct/range {v15 .. v24}, Le2/g0;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-interface {v1, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_7

    :catch_0
    move-exception v0

    goto :goto_a

    :catch_1
    move-exception v0

    move-object/from16 v14, p1

    :goto_a
    :try_start_3
    const-string v12, "MediaStoreChannel"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "queryFiles: "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_7

    :cond_f
    sget-object v0, Lg1/q;->a:Lg1/q;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v2, v7}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_b

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    move-object v4, v0

    invoke-static {v2, v1}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4

    :cond_10
    :goto_b
    return-object v1
.end method

.method private final o(Ljava/lang/String;ZLjava/util/List;)Ljava/util/List;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Le2/g0;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "_id"

    const-string v3, "_display_name"

    const-string v4, "relative_path"

    const-string v5, "_data"

    const-string v6, "_size"

    const-string v7, "date_modified"

    const-string v8, "volume_name"

    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    move-result-object v0

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    if-eqz p2, :cond_0

    const/4 v3, 0x3

    const-string v4, "android:query-arg-match-trashed"

    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz p3, :cond_3

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-lez v9, :cond_1

    move v9, v5

    goto :goto_1

    :cond_1
    move v9, v6

    :goto_1
    if-eqz v9, :cond_2

    const-string v9, " or "

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const-string v9, "relative_path = ?"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-lez v7, :cond_4

    move v7, v5

    goto :goto_2

    :cond_4
    move v7, v6

    :goto_2
    if-eqz v7, :cond_5

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v7, "android:query-arg-sql-selection"

    invoke-virtual {v2, v7, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v5

    if-eqz v3, :cond_6

    new-array v3, v6, [Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    const-string v4, "android:query-arg-sql-selection-args"

    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    :cond_6
    invoke-static/range {p1 .. p1}, Landroid/provider/MediaStore$Video$Media;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v5, v4, Le2/f0;->c:Landroid/content/Context;

    const/4 v6, 0x0

    if-nez v5, :cond_7

    const-string v5, "applicationContext"

    invoke-static {v5}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v5, v6

    :cond_7
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-static {v5, v3, v0, v2, v6}, Le2/c0;->a(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    if-eqz v2, :cond_c

    :try_start_0
    const-string v0, "_id"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v3

    const-string v0, "_display_name"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v5

    const-string v0, "relative_path"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v7

    const-string v0, "_data"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v8

    const-string v0, "_size"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v9

    const-string v0, "date_modified"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v10

    const-string v0, "volume_name"

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v11

    :cond_8
    :goto_3
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_b

    :try_start_1
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v12
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v14, p1

    :try_start_2
    invoke-static {v14, v12, v13}, Le2/d0;->a(Ljava/lang/String;J)Landroid/net/Uri;

    move-result-object v0

    const-string v12, "getContentUri(volumeName, id)"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v20

    if-eqz v19, :cond_8

    if-nez v20, :cond_9

    goto :goto_3

    :cond_9
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v17

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_a

    const-string v13, "Unknown"

    :goto_4
    move-object/from16 v21, v13

    goto :goto_5

    :cond_a
    const-string v15, "cursor.getString(volumeNameColumn) ?: \"Unknown\""

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :goto_5
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v23

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v13, Le2/g0;

    const-string v15, "toString()"

    invoke-static {v0, v15}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "getString(dataColumn)"

    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v15, v13

    move-object/from16 v16, v0

    move-object/from16 v22, v12

    invoke-direct/range {v15 .. v24}, Le2/g0;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-interface {v1, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    move-object/from16 v14, p1

    :goto_6
    :try_start_3
    const-string v12, "MediaStoreChannel"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "queryVideos: "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_b
    sget-object v0, Lg1/q;->a:Lg1/q;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v2, v6}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_7

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-static {v2, v1}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3

    :cond_c
    :goto_7
    return-object v1
.end method


# virtual methods
.method public e()V
    .locals 0

    return-void
.end method

.method public h(Ls0/a$b;)V
    .locals 4

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ls0/a$b;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "binding.applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Le2/f0;->c:Landroid/content/Context;

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object v1

    new-instance v2, Lz0/r;

    new-instance v3, Le2/h0;

    invoke-direct {v3}, Le2/h0;-><init>()V

    invoke-direct {v2, v3}, Lz0/r;-><init>(Lz0/q;)V

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object p1

    invoke-interface {p1}, Lz0/c;->b()Lz0/c$c;

    move-result-object p1

    const-string v3, "xyz.re.player.ex/MediaStoreChannel"

    invoke-direct {v0, v1, v3, v2, p1}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;Lz0/l;Lz0/c$c;)V

    iput-object v0, p0, Le2/f0;->a:Lz0/k;

    invoke-virtual {v0, p0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public i(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Le2/f0;->j(Lt0/c;)V

    return-void
.end method

.method public j(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/f0;->b:Lt0/c;

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/f0;->a:Lz0/k;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "channel"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1, v0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public m(Lz0/j;Lz0/k$d;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "call"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "result"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lz0/j;->a:Ljava/lang/String;

    if-eqz v3, :cond_26

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const-string v5, "_display_name"

    const-string v7, "relative_path"

    const-string v8, "mime_type"

    const-string v9, "activityBinding"

    const-string v10, "external_primary"

    const-string v11, "relativePaths"

    const-string v12, "volumeName"

    const-string v14, "parentDirname"

    const-string v15, "mimeType"

    const-string v16, "applicationContext"

    const/16 v13, 0x1d

    const/4 v6, 0x0

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_e

    :sswitch_0
    const-string v4, "getVersion"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_e

    :cond_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v13, :cond_2

    invoke-virtual/range {p1 .. p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    iget-object v3, v1, Le2/f0;->c:Landroid/content/Context;

    if-nez v3, :cond_1

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v6, v3

    :goto_0
    invoke-static {v6, v0}, Le2/v;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_5

    :cond_2
    invoke-interface/range {p2 .. p2}, Lz0/k$d;->b()V

    goto/16 :goto_e

    :sswitch_1
    const-string v4, "getMediaUri"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_e

    :cond_3
    const-string v3, "documentUriString"

    invoke-virtual {v0, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, v1, Le2/f0;->c:Landroid/content/Context;

    if-nez v3, :cond_4

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v3, v6

    :cond_4
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v3, v0}, Le2/z;->a(Landroid/content/Context;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_14

    goto/16 :goto_7

    :sswitch_2
    const-string v4, "createTrashRequest"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_e

    :cond_5
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-ge v3, v4, :cond_6

    :goto_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v2, v0}, Lz0/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_6
    const-string v3, "isTrashed"

    invoke-virtual {v0, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    const-string v4, "uriList"

    invoke-virtual {v0, v4}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lh1/h;->i(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-direct/range {p0 .. p0}, Le2/f0;->d()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-static {v0, v4, v3}, Le2/y;->a(Landroid/content/ContentResolver;Ljava/util/Collection;Z)Landroid/app/PendingIntent;

    move-result-object v0

    const-string v3, "createTrashRequest(resolver, uriList, isTrashed!!)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Le2/f0;->b:Lt0/c;

    if-nez v3, :cond_8

    invoke-static {v9}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    move-object v6, v3

    :goto_3
    new-instance v3, Le2/f0$c;

    invoke-direct {v3, v2, v1}, Le2/f0$c;-><init>(Lz0/k$d;Le2/f0;)V

    invoke-interface {v6, v3}, Lt0/c;->e(Lz0/m;)V

    invoke-direct/range {p0 .. p0}, Le2/f0;->c()Landroid/app/Activity;

    move-result-object v7

    invoke-virtual {v0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v8

    const v9, 0x786213

    goto/16 :goto_d

    :sswitch_3
    const-string v0, "getExternalVolumeNames"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_e

    :cond_9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v13, :cond_a

    invoke-interface/range {p2 .. p2}, Lz0/k$d;->b()V

    return-void

    :cond_a
    iget-object v0, v1, Le2/f0;->c:Landroid/content/Context;

    if-nez v0, :cond_b

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_4

    :cond_b
    move-object v6, v0

    :goto_4
    invoke-static {v6}, Le2/w;->a(Landroid/content/Context;)Ljava/util/Set;

    move-result-object v0

    const-string v3, "getExternalVolumeNames(applicationContext)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lh1/h;->s(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    :goto_5
    invoke-interface {v2, v0}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_e

    :sswitch_4
    const-string v4, "saveImage"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto/16 :goto_e

    :cond_c
    const-string v3, "name"

    invoke-virtual {v0, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "byteArray"

    invoke-virtual {v0, v4}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    invoke-virtual {v0, v15}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v0, v14}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v11, v13, :cond_d

    invoke-static {v10}, Landroid/provider/MediaStore$Images$Media;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v10

    goto :goto_6

    :cond_d
    sget-object v10, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    :goto_6
    new-instance v12, Landroid/content/ContentValues;

    invoke-direct {v12}, Landroid/content/ContentValues;-><init>()V

    if-lt v11, v13, :cond_e

    if-eqz v0, :cond_e

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v13, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v13, 0x2f

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v7, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_e
    if-eqz v9, :cond_f

    invoke-virtual {v12, v8, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lg1/q;->a:Lg1/q;

    :cond_f
    invoke-virtual {v12, v5, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lg1/q;->a:Lg1/q;

    invoke-direct/range {p0 .. p0}, Le2/f0;->d()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, v10, v12}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_11

    :cond_10
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_5

    :cond_11
    invoke-direct/range {p0 .. p0}, Le2/f0;->d()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v3

    if-eqz v3, :cond_10

    :try_start_0
    invoke-virtual {v3, v4}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3, v6}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    move-object v2, v0

    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    move-object v4, v0

    invoke-static {v3, v2}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4

    :sswitch_5
    const-string v4, "getDocumentUri"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    goto/16 :goto_e

    :cond_12
    const-string v3, "mediaUriString"

    invoke-virtual {v0, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v3, v1, Le2/f0;->c:Landroid/content/Context;

    if-nez v3, :cond_13

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v3, v6

    :cond_13
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v3, v0}, Le2/a0;->a(Landroid/content/Context;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_14

    :goto_7
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_14
    invoke-interface {v2, v6}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_e

    :sswitch_6
    const-string v4, "queryFiles"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    goto/16 :goto_e

    :cond_15
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-ge v3, v4, :cond_16

    invoke-interface/range {p2 .. p2}, Lz0/k$d;->b()V

    return-void

    :cond_16
    invoke-virtual {v0, v12}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/String;

    const-string v4, "mediaType"

    invoke-virtual {v0, v4}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    const-string v5, "extensions"

    invoke-virtual {v0, v5}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0, v11}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    :try_start_2
    invoke-direct {v1, v3, v4, v5, v0}, Le2/f0;->k(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Lz0/k$d;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_a

    :catch_0
    move-exception v0

    goto/16 :goto_9

    :sswitch_7
    const-string v4, "createImage"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    goto/16 :goto_e

    :cond_17
    const-string v3, "displayName"

    invoke-virtual {v0, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v15}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v14}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v9, v13, :cond_18

    invoke-static {v10}, Landroid/provider/MediaStore$Images$Media;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v10

    goto :goto_8

    :cond_18
    sget-object v10, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    :goto_8
    new-instance v11, Landroid/content/ContentValues;

    invoke-direct {v11}, Landroid/content/ContentValues;-><init>()V

    if-lt v9, v13, :cond_19

    if-eqz v0, :cond_19

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v12, 0x2f

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v7, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_19
    if-eqz v4, :cond_1a

    invoke-virtual {v11, v8, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lg1/q;->a:Lg1/q;

    :cond_1a
    invoke-virtual {v11, v5, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lg1/q;->a:Lg1/q;

    invoke-direct/range {p0 .. p0}, Le2/f0;->d()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, v10, v11}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_14

    goto/16 :goto_7

    :sswitch_8
    const-string v4, "queryVideos"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1b

    goto/16 :goto_e

    :cond_1b
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-ge v3, v4, :cond_1c

    invoke-interface/range {p2 .. p2}, Lz0/k$d;->b()V

    return-void

    :cond_1c
    invoke-virtual {v0, v12}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/String;

    const-string v4, "trashed"

    invoke-virtual {v0, v4}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v0, v11}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    :try_start_3
    invoke-direct {v1, v3, v4, v0}, Le2/f0;->o(Ljava/lang/String;ZLjava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Lz0/k$d;->a(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_a

    :catch_1
    move-exception v0

    goto :goto_9

    :sswitch_9
    const-string v4, "scanFilePaths"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    goto/16 :goto_e

    :cond_1d
    const-string v3, "paths"

    invoke-virtual {v0, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v3, Ljava/util/List;

    const-string v4, "mimeTypes"

    invoke-virtual {v0, v4}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v5, v1, Le2/f0;->c:Landroid/content/Context;

    if-nez v5, :cond_1e

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v5, v6

    :cond_1e
    const/4 v7, 0x0

    new-array v8, v7, [Ljava/lang/String;

    invoke-interface {v3, v8}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/String;

    if-eqz v0, :cond_1f

    new-array v6, v7, [Ljava/lang/String;

    invoke-interface {v0, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [Ljava/lang/String;

    :cond_1f
    new-instance v0, Le2/e0;

    invoke-direct {v0, v4, v3, v2}, Le2/e0;-><init>(Ljava/util/Map;Ljava/util/List;Lz0/k$d;)V

    invoke-static {v5, v8, v6, v0}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V

    goto/16 :goto_e

    :sswitch_a
    const-string v4, "queryAudios"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_20

    goto/16 :goto_e

    :cond_20
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-ge v3, v4, :cond_21

    invoke-interface/range {p2 .. p2}, Lz0/k$d;->b()V

    return-void

    :cond_21
    invoke-virtual/range {p1 .. p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    :try_start_4
    invoke-direct {v1, v0}, Le2/f0;->g(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Lz0/k$d;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_a

    :catch_2
    move-exception v0

    :goto_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Lg1/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v4, v0}, Lz0/k$d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_a
    sget-object v0, Lg1/q;->a:Lg1/q;

    goto :goto_e

    :sswitch_b
    const-string v4, "createDeleteRequest"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    goto :goto_e

    :cond_22
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-ge v3, v4, :cond_23

    goto/16 :goto_1

    :cond_23
    invoke-virtual/range {p1 .. p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lh1/h;->i(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_24

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_24
    invoke-direct/range {p0 .. p0}, Le2/f0;->d()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0, v3}, Le2/x;->a(Landroid/content/ContentResolver;Ljava/util/Collection;)Landroid/app/PendingIntent;

    move-result-object v0

    const-string v3, "createDeleteRequest(resolver, uriList)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Le2/f0;->b:Lt0/c;

    if-nez v3, :cond_25

    invoke-static {v9}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_c

    :cond_25
    move-object v6, v3

    :goto_c
    new-instance v3, Le2/f0$b;

    invoke-direct {v3, v2, v1}, Le2/f0$b;-><init>(Lz0/k$d;Le2/f0;)V

    invoke-interface {v6, v3}, Lt0/c;->e(Lz0/m;)V

    invoke-direct/range {p0 .. p0}, Le2/f0;->c()Landroid/app/Activity;

    move-result-object v7

    invoke-virtual {v0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v8

    const v9, 0x786212

    :goto_d
    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-virtual/range {v7 .. v13}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    :cond_26
    :goto_e
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6a359938 -> :sswitch_b
        -0x69d9d1bb -> :sswitch_a
        -0x5719612b -> :sswitch_9
        -0x46ad35c0 -> :sswitch_8
        -0x1ea4aa41 -> :sswitch_7
        -0xb6b1171 -> :sswitch_6
        -0x7f696e5 -> :sswitch_5
        0x9c05dde -> :sswitch_4
        0xa36c44d -> :sswitch_3
        0x43a56353 -> :sswitch_2
        0x4629605e -> :sswitch_1
        0x52c258a2 -> :sswitch_0
    .end sparse-switch
.end method

.method public n()V
    .locals 0

    return-void
.end method
