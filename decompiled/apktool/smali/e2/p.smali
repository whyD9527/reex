.class public final Le2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls0/a;
.implements Lz0/k$c;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lz0/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public h(Ls0/a$b;)V
    .locals 4

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ls0/a$b;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "binding.applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Le2/p;->a:Landroid/content/Context;

    new-instance v0, Lz0/k;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object v1

    sget-object v2, Lz0/r;->b:Lz0/r;

    invoke-virtual {p1}, Ls0/a$b;->b()Lz0/c;

    move-result-object p1

    invoke-interface {p1}, Lz0/c;->b()Lz0/c$c;

    move-result-object p1

    const-string v3, "xyz.re.player.ex/ContentResolverChannel"

    invoke-direct {v0, v1, v3, v2, p1}, Lz0/k;-><init>(Lz0/c;Ljava/lang/String;Lz0/l;Lz0/c$c;)V

    iput-object v0, p0, Le2/p;->b:Lz0/k;

    invoke-virtual {v0, p0}, Lz0/k;->e(Lz0/k$c;)V

    return-void
.end method

.method public l(Ls0/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le2/p;->b:Lz0/k;

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
    .locals 13

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lz0/j;->a:Ljava/lang/String;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x1

    const-string v3, "uriString"

    const-string v4, "applicationContext"

    const/4 v5, 0x0

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_b

    :sswitch_0
    const-string v1, "queryDisplayName"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_b

    :cond_0
    invoke-virtual {p1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v7

    iget-object p1, p0, Le2/p;->a:Landroid/content/Context;

    if-nez p1, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v5

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual/range {v6 .. v12}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-interface {p2, v5}, Lz0/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_0
    const-string v0, "_display_name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-interface {p2, v5}, Lz0/k$d;->a(Ljava/lang/Object;)V

    :goto_0
    sget-object p2, Lg1/q;->a:Lg1/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1, v5}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto/16 :goto_b

    :catchall_0
    move-exception p2

    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :sswitch_1
    const-string p1, "getPersistedUriReadPermissions"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_b

    :cond_4
    :try_start_2
    iget-object p1, p0, Le2/p;->a:Landroid/content/Context;

    if-nez p1, :cond_5

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object p1, v5

    :cond_5
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/ContentResolver;->getPersistedUriPermissions()Ljava/util/List;

    move-result-object p1

    const-string v0, "applicationContext.conte\u2026r.persistedUriPermissions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/UriPermission;

    invoke-virtual {v1}, Landroid/content/UriPermission;->isReadPermission()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v1}, Landroid/content/UriPermission;->getUri()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    invoke-interface {p2, v0}, Lz0/k$d;->a(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_b

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-interface {p2, v0, p1, v5}, Lz0/k$d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_b

    :sswitch_2
    const-string v1, "openFileDescriptor"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_b

    :cond_8
    invoke-virtual {p1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "mode"

    invoke-virtual {p1, v1}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :try_start_3
    iget-object v1, p0, Le2/p;->a:Landroid/content/Context;

    if-nez v1, :cond_9

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v1, v5

    :cond_9
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-virtual {v1, v0, p1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-eqz p1, :cond_a

    :try_start_4
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-static {p1, v5}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_3

    :catchall_2
    move-exception v0

    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v1

    :try_start_7
    invoke-static {p1, v0}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_a
    move-object v0, v5

    :goto_3
    invoke-interface {p2, v0}, Lz0/k$d;->a(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    goto/16 :goto_b

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FileNotFound"

    goto :goto_2

    :sswitch_3
    const-string v1, "writeBytes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_b

    :cond_b
    invoke-virtual {p1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "bytes"

    invoke-virtual {p1, v1}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Le2/p;->a:Landroid/content/Context;

    if-nez v1, :cond_c

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v1, v5

    :cond_c
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v0

    if-nez v0, :cond_d

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_d
    :try_start_8
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    sget-object p1, Lg1/q;->a:Lg1/q;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    invoke-static {v0, v5}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_5

    :catchall_4
    move-exception p1

    :try_start_9
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :catchall_5
    move-exception p2

    invoke-static {v0, p1}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2

    :sswitch_4
    const-string v1, "isDocumentUri"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_b

    :cond_e
    invoke-virtual {p1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Le2/p;->a:Landroid/content/Context;

    if-nez v0, :cond_f

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_4

    :cond_f
    move-object v5, v0

    :goto_4
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {v5, p1}, Landroid/provider/DocumentsContract;->isDocumentUri(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_5
    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_b

    :sswitch_5
    const-string v1, "readBytes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_b

    :cond_10
    invoke-virtual {p1, v3}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :try_start_a
    iget-object v0, p0, Le2/p;->a:Landroid/content/Context;

    if-nez v0, :cond_11

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v0, v5

    :cond_11
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_a
    .catch Ljava/io/FileNotFoundException; {:try_start_a .. :try_end_a} :catch_2

    if-eqz p1, :cond_12

    :try_start_b
    invoke-static {p1}, Lo1/a;->c(Ljava/io/InputStream;)[B

    move-result-object v0

    goto :goto_6

    :catchall_6
    move-exception v0

    goto :goto_7

    :cond_12
    move-object v0, v5

    :goto_6
    invoke-interface {p2, v0}, Lz0/k$d;->a(Ljava/lang/Object;)V

    sget-object v0, Lg1/q;->a:Lg1/q;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :try_start_c
    invoke-static {p1, v5}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_c
    .catch Ljava/io/FileNotFoundException; {:try_start_c .. :try_end_c} :catch_2

    goto/16 :goto_b

    :goto_7
    :try_start_d
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    :catchall_7
    move-exception v1

    :try_start_e
    invoke-static {p1, v0}, Lo1/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_e
    .catch Ljava/io/FileNotFoundException; {:try_start_e .. :try_end_e} :catch_2

    :sswitch_6
    const-string v1, "releasePersistableUriReadPermission"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_b

    :cond_13
    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :try_start_f
    iget-object v0, p0, Le2/p;->a:Landroid/content/Context;

    if-nez v0, :cond_14

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v0, v5

    :cond_14
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1, v2}, Landroid/content/ContentResolver;->releasePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_2

    goto :goto_9

    :sswitch_7
    const-string v1, "delete"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_b

    :cond_15
    const-string v0, "uriStringList"

    invoke-virtual {p1, v0}, Lz0/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Le2/p;->a:Landroid/content/Context;

    if-nez v1, :cond_16

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    move-object v1, v5

    :cond_16
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v1, v0, v5, v5}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_8

    :catch_2
    :cond_17
    :goto_9
    invoke-interface {p2, v5}, Lz0/k$d;->a(Ljava/lang/Object;)V

    goto :goto_b

    :sswitch_8
    const-string v1, "takePersistableUriReadPermission"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_b

    :cond_18
    invoke-virtual {p1}, Lz0/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :try_start_10
    iget-object v0, p0, Le2/p;->a:Landroid/content/Context;

    if-nez v0, :cond_19

    invoke-static {v4}, Lkotlin/jvm/internal/k;->o(Ljava/lang/String;)V

    goto :goto_a

    :cond_19
    move-object v5, v0

    :goto_a
    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1, v2}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lz0/k$d;->a(Ljava/lang/Object;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_3

    goto :goto_b

    :catch_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_5

    :cond_1a
    :goto_b
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x58e6ded6 -> :sswitch_8
        -0x4f997a55 -> :sswitch_7
        -0x4d442b56 -> :sswitch_6
        -0x43f3fb8b -> :sswitch_5
        -0x35d84139 -> :sswitch_4
        -0x27807434 -> :sswitch_3
        -0x1d3dd0b -> :sswitch_2
        0x53d7ef9f -> :sswitch_1
        0x62109885 -> :sswitch_0
    .end sparse-switch
.end method
