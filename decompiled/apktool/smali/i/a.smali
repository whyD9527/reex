.class public Li/a;
.super Li/d;
.source "SourceFile"


# static fields
.field private static volatile c:Li/a;

.field private static final d:Ljava/util/concurrent/Executor;

.field private static final e:Ljava/util/concurrent/Executor;


# instance fields
.field private a:Li/d;

.field private b:Li/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li/a$a;

    invoke-direct {v0}, Li/a$a;-><init>()V

    sput-object v0, Li/a;->d:Ljava/util/concurrent/Executor;

    new-instance v0, Li/a$b;

    invoke-direct {v0}, Li/a$b;-><init>()V

    sput-object v0, Li/a;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Li/d;-><init>()V

    new-instance v0, Li/c;

    invoke-direct {v0}, Li/c;-><init>()V

    iput-object v0, p0, Li/a;->b:Li/d;

    iput-object v0, p0, Li/a;->a:Li/d;

    return-void
.end method

.method public static d()Li/a;
    .locals 2

    sget-object v0, Li/a;->c:Li/a;

    if-eqz v0, :cond_0

    sget-object v0, Li/a;->c:Li/a;

    return-object v0

    :cond_0
    const-class v0, Li/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Li/a;->c:Li/a;

    if-nez v1, :cond_1

    new-instance v1, Li/a;

    invoke-direct {v1}, Li/a;-><init>()V

    sput-object v1, Li/a;->c:Li/a;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Li/a;->c:Li/a;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Li/a;->a:Li/d;

    invoke-virtual {v0, p1}, Li/d;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Li/a;->a:Li/d;

    invoke-virtual {v0}, Li/d;->b()Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Li/a;->a:Li/d;

    invoke-virtual {v0, p1}, Li/d;->c(Ljava/lang/Runnable;)V

    return-void
.end method
