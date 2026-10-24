.class public final Le2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;
.implements Lt0/a;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lt0/c;

.field private c:Lz0/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Le2/q;)Lt0/c;
    .locals 0

    iget-object p0, p0, Le2/q;->b:Lt0/c;

    return-object p0
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

    iput-object v0, p0, Le2/q;->a:Landroid/content/Context;

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object v1

    sget-object v2, Lz0/r;->b:Lz0/r;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object p1

    invoke-interface {p1}, Lz0/c;->b()Lz0/c$c;

    move-result-object p1

    const-string v3, "xyz.re.player.ex/DocumentTreeChannel"

    invoke-direct {v0, v1, v3, v2, p1}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;Lz0/l;Lz0/c$c;)V

    iput-object v0, p0, Le2/q;->c:Lz0/k;

    invoke-virtual {v0, p0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public i(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/q;->b:Lt0/c;

    return-void
.end method

.method public j(Lt0/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le2/q;->b:Lt0/c;

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/q;->c:Lz0/k;

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
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "call"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "result"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lz0/j;->a:Ljava/lang/String;

    if-eqz v3, :cond_16

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const v5, -0x4237f9d3

    const-string v6, "toString()"

    const-string v7, "vnd.android.document/directory"

    const/16 v10, 0x18

    const-string v12, "context"

    const-string v13, "flags"

    const-string v14, "_size"

    const-string v15, "_display_name"

    const-string v8, "mime_type"

    if-eq v4, v5, :cond_b

    const v5, 0x414ef28f

    if-eq v4, v5, :cond_7

    const v5, 0x502e9b3a

    if-eq v4, v5, :cond_0

    goto/16 :goto_f

    :cond_0
    const-string v4, "listFile"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_f

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v1, Le2/q;->a:Landroid/content/Context;

    if-nez v4, :cond_2

    invoke-static {v12}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_2
    invoke-static {v4, v0}, Landroid/provider/DocumentsContract;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v0}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_3
    invoke-static {v0}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v4

    :goto_0
    invoke-static {v0, v4}, Landroid/provider/DocumentsContract;->buildChildDocumentsUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v17

    const-string v4, "document_id"

    filled-new-array {v4, v8, v15, v14, v13}, [Ljava/lang/String;

    move-result-object v18

    :try_start_0
    iget-object v5, v1, Le2/q;->a:Landroid/content/Context;

    if-nez v5, :cond_4

    invoke-static {v12}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v5, 0x0

    :cond_4
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v16

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-virtual/range {v16 .. v21}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v5, :cond_15

    :try_start_1
    invoke-interface {v5, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v5, v8}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v8

    invoke-interface {v5, v15}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v12

    invoke-interface {v5, v14}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v14

    invoke-interface {v5, v13}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v13

    :goto_1
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v15

    if-eqz v15, :cond_6

    invoke-interface {v5, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    invoke-interface {v5, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v5, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v17

    invoke-interface {v5, v14}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v21

    invoke-interface {v5, v13}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    invoke-static {v0, v15}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v15

    move-object/from16 p1, v0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v10, :cond_5

    const/16 v10, 0x200

    if-ne v9, v10, :cond_5

    const/16 v20, 0x1

    goto :goto_2

    :cond_5
    const/16 v20, 0x0

    :goto_2
    invoke-virtual {v15}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v7}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v19

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v0

    move-object/from16 v18, v11

    invoke-static/range {v16 .. v22}, Le2/r;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZJ)Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p1

    const/16 v10, 0x18

    goto :goto_1

    :cond_6
    sget-object v0, Lg1/q;->a:Lg1/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v4, 0x0

    :try_start_2
    invoke-static {v5, v4}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto/16 :goto_e

    :catchall_0
    move-exception v0

    move-object v4, v0

    :try_start_3
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    move-object v6, v0

    :try_start_4
    invoke-static {v5, v4}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    invoke-interface {v2, v3}, Lz0/k$d;->a(Ljava/lang/Object;)V

    throw v0

    :cond_7
    const-string v0, "request"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_f

    :cond_8
    new-instance v0, Landroid/content/Intent;

    const-string v3, "android.intent.action.OPEN_DOCUMENT_TREE"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v4, v1, Le2/q;->b:Lt0/c;

    const-string v3, "activityBinding"

    if-nez v4, :cond_9

    invoke-static {v3}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_9
    new-instance v5, Le2/q$a;

    invoke-direct {v5, v2, v1}, Le2/q$a;-><init>(Lz0/k$d;Le2/q;)V

    invoke-interface {v4, v5}, Lt0/c;->e(Lz0/m;)V

    iget-object v2, v1, Le2/q;->b:Lt0/c;

    if-nez v2, :cond_a

    invoke-static {v3}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v11, 0x0

    goto :goto_3

    :cond_a
    move-object v11, v2

    :goto_3
    invoke-interface {v11}, Lt0/c;->d()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x786211

    invoke-virtual {v2, v0, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_10

    :cond_b
    const-string v4, "queryTreeUris"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto/16 :goto_f

    :cond_c
    invoke-virtual/range {p1 .. p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    check-cast v0, Ljava/util/List;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    filled-new-array {v8, v15, v14, v13}, [Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v0, v9}, Lh1/h;->i(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_d
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iget-object v9, v1, Le2/q;->a:Landroid/content/Context;

    if-nez v9, :cond_e

    invoke-static {v12}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v9, 0x0

    :cond_e
    invoke-static {v9, v0}, Landroid/provider/DocumentsContract;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-static {v0}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v9

    goto :goto_6

    :cond_f
    invoke-static {v0}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v9

    :goto_6
    :try_start_5
    invoke-static {v0, v9}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v17

    iget-object v9, v1, Le2/q;->a:Landroid/content/Context;

    if-nez v9, :cond_10

    invoke-static {v12}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    const/4 v9, 0x0

    :cond_10
    invoke-virtual {v9}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v16

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v4

    invoke-virtual/range {v16 .. v21}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    if-eqz v9, :cond_14

    :try_start_6
    invoke-interface {v9, v8}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v10

    invoke-interface {v9, v15}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v11

    invoke-interface {v9, v14}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    move-object/from16 p1, v4

    :try_start_7
    invoke-interface {v9, v13}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v16
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    if-eqz v16, :cond_13

    :try_start_8
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v24

    invoke-interface {v9, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v28

    invoke-interface {v9, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    const/16 v11, 0x18

    if-lt v4, v11, :cond_11

    const/16 v4, 0x200

    if-ne v1, v4, :cond_12

    const/16 v27, 0x1

    goto :goto_7

    :cond_11
    const/16 v4, 0x200

    :cond_12
    const/16 v27, 0x0

    :goto_7
    :try_start_9
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v26

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v23, v0

    move-object/from16 v25, v10

    invoke-static/range {v23 .. v29}, Le2/r;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZJ)Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_9

    :catchall_3
    move-exception v0

    goto :goto_8

    :catchall_4
    move-exception v0

    const/16 v4, 0x200

    const/16 v11, 0x18

    :goto_8
    move-object v10, v0

    const/4 v1, 0x0

    goto :goto_c

    :cond_13
    const/16 v4, 0x200

    const/16 v11, 0x18

    :goto_9
    :try_start_a
    sget-object v0, Lg1/q;->a:Lg1/q;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    const/4 v1, 0x0

    :try_start_b
    invoke-static {v9, v1}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    goto :goto_d

    :catchall_5
    move-exception v0

    const/4 v1, 0x0

    goto :goto_b

    :catchall_6
    move-exception v0

    goto :goto_a

    :catchall_7
    move-exception v0

    move-object/from16 p1, v4

    :goto_a
    const/4 v1, 0x0

    const/16 v4, 0x200

    const/16 v11, 0x18

    :goto_b
    move-object v10, v0

    :goto_c
    :try_start_c
    throw v10
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    :catchall_8
    move-exception v0

    move-object/from16 v16, v0

    :try_start_d
    invoke-static {v9, v10}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v16
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1

    :cond_14
    move-object/from16 v1, p0

    goto/16 :goto_5

    :catch_0
    move-object/from16 p1, v4

    const/4 v1, 0x0

    const/16 v4, 0x200

    const/16 v11, 0x18

    :catch_1
    :goto_d
    move-object/from16 v1, p0

    move-object/from16 v4, p1

    goto/16 :goto_5

    :cond_15
    :goto_e
    invoke-interface {v2, v3}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_10

    :cond_16
    :goto_f
    invoke-interface/range {p2 .. p2}, Lz0/k$d;->b()V

    :goto_10
    return-void
.end method

.method public n()V
    .locals 0

    return-void
.end method
