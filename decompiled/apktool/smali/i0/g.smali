.class public final Li0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/nio/charset/CharsetDecoder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Li0/g;->b()Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    sput-object v0, Li0/g;->a:Ljava/nio/charset/CharsetDecoder;

    return-void
.end method

.method private static final a(Ljava/lang/String;[B)V
    .locals 4

    invoke-static {p1}, Li0/g;->j([B)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Li0/e;

    sget-object v1, Li0/a;->f:Li0/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TXT value is not valid UTF8: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(this)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Li0/e;-><init>(Li0/a;Ljava/lang/String;)V

    throw v0
.end method

.method private static final b()Ljava/nio/charset/CharsetDecoder;
    .locals 2

    sget-object v0, Lw1/c;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    sget-object v1, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    const-string v1, "createUtf8Decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final c(Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    sget-object v0, Li0/b;->f:Li0/b;

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Li0/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    instance-of v0, p0, Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, p0

    :goto_1
    check-cast v1, Ljava/lang/String;

    return-object v1
.end method

.method public static final d(Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    sget-object v0, Li0/b;->i:Li0/b;

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Li0/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    instance-of v0, p0, Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, p0

    :goto_1
    check-cast v1, Ljava/lang/String;

    return-object v1
.end method

.method public static final e(Ljava/util/Map;)Landroid/net/nsd/NsdServiceInfo;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Landroid/net/nsd/NsdServiceInfo;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-static {p0}, Li0/g;->f(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Li0/g;->i(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Li0/g;->g(Ljava/util/Map;)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p0}, Li0/g;->d(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Li0/g;->h(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    if-nez v1, :cond_1

    if-nez v2, :cond_1

    if-nez v4, :cond_1

    if-nez v3, :cond_1

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    invoke-static {v4}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    new-instance v4, Landroid/net/nsd/NsdServiceInfo;

    invoke-direct {v4}, Landroid/net/nsd/NsdServiceInfo;-><init>()V

    invoke-virtual {v4, v1}, Landroid/net/nsd/NsdServiceInfo;->setServiceName(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Landroid/net/nsd/NsdServiceInfo;->setServiceType(Ljava/lang/String;)V

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v1}, Landroid/net/nsd/NsdServiceInfo;->setPort(I)V

    :cond_2
    invoke-virtual {v4, v0}, Landroid/net/nsd/NsdServiceInfo;->setHost(Ljava/net/InetAddress;)V

    invoke-static {v4, p0}, Li0/g;->r(Landroid/net/nsd/NsdServiceInfo;Ljava/util/Map;)V

    return-object v4
.end method

.method public static final f(Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    sget-object v0, Li0/b;->g:Li0/b;

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Li0/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    instance-of v0, p0, Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, p0

    :goto_1
    check-cast v1, Ljava/lang/String;

    return-object v1
.end method

.method public static final g(Ljava/util/Map;)Ljava/lang/Integer;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    sget-object v0, Li0/b;->j:Li0/b;

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Li0/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    instance-of v0, p0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, p0

    :goto_1
    check-cast v1, Ljava/lang/Integer;

    return-object v1
.end method

.method public static final h(Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation

    sget-object v0, Li0/b;->k:Li0/b;

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Li0/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    instance-of v0, p0, Ljava/util/Map;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, p0

    :goto_1
    check-cast v1, Ljava/util/Map;

    return-object v1
.end method

.method public static final i(Ljava/util/Map;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    sget-object v0, Li0/b;->h:Li0/b;

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Li0/b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    instance-of v0, p0, Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, p0

    :goto_1
    check-cast v1, Ljava/lang/String;

    return-object v1
.end method

.method private static final j([B)Z
    .locals 1

    :try_start_0
    sget-object v0, Li0/g;->a:Ljava/nio/charset/CharsetDecoder;

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final k(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-nez p0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    const/16 v3, 0x2e

    if-eqz v0, :cond_2

    invoke-static {p0}, Lw1/e;->d0(Ljava/lang/CharSequence;)C

    move-result v0

    if-ne v0, v3, :cond_2

    invoke-static {p0, v2}, Lw1/e;->b0(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_3

    move v1, v2

    :cond_3
    if-eqz v1, :cond_4

    invoke-static {p0}, Lw1/e;->e0(Ljava/lang/CharSequence;)C

    move-result v0

    if-ne v0, v3, :cond_4

    invoke-static {p0, v2}, Lw1/e;->c0(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    :cond_4
    return-object p0
.end method

.method private static final l(Li0/b;Ljava/lang/Object;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li0/b;",
            "TT;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Li0/b;->b()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object p0

    invoke-static {p0}, Lh1/x;->b(Lg1/j;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Li0/b;->l:Li0/b;

    invoke-static {v0, p0}, Li0/g;->l(Li0/b;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Li0/b;->m:Li0/b;

    invoke-static {v0, p0}, Li0/g;->l(Li0/b;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Li0/b;->f:Li0/b;

    invoke-static {v0, p0}, Li0/g;->l(Li0/b;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Landroid/net/nsd/NsdServiceInfo;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/nsd/NsdServiceInfo;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "nsdServiceInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    new-array v0, v0, [Lg1/j;

    sget-object v1, Li0/b;->g:Li0/b;

    invoke-virtual {v1}, Li0/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Li0/b;->h:Li0/b;

    invoke-virtual {v1}, Li0/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroid/net/nsd/NsdServiceInfo;->getServiceType()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Li0/g;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Li0/b;->i:Li0/b;

    invoke-virtual {v1}, Li0/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroid/net/nsd/NsdServiceInfo;->getHost()Ljava/net/InetAddress;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/net/InetAddress;->getCanonicalHostName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-static {v1, v2}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x3

    sget-object v2, Li0/b;->j:Li0/b;

    invoke-virtual {v2}, Li0/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Landroid/net/nsd/NsdServiceInfo;->getPort()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/net/nsd/NsdServiceInfo;->getPort()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :goto_1
    invoke-static {v2, v3}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Li0/b;->k:Li0/b;

    invoke-virtual {v2}, Li0/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Landroid/net/nsd/NsdServiceInfo;->getAttributes()Ljava/util/Map;

    move-result-object p0

    invoke-static {v2, p0}, Lg1/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lg1/j;

    move-result-object p0

    aput-object p0, v0, v1

    invoke-static {v0}, Lh1/x;->f([Lg1/j;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    sget-object v0, Li0/b;->g:Li0/b;

    invoke-static {v0, p0}, Li0/g;->l(Li0/b;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Landroid/net/nsd/NsdServiceInfo;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/nsd/NsdServiceInfo;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/net/nsd/NsdServiceInfo;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {v1, v0}, Li0/g;->a(Ljava/lang/String;[B)V

    new-instance v2, Ljava/lang/String;

    sget-object v3, Lw1/c;->b:Ljava/nio/charset/Charset;

    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p0, v1, v2}, Landroid/net/nsd/NsdServiceInfo;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method
