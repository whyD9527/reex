.class Lc/e$k;
.super Lc/e$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "k"
.end annotation


# instance fields
.field private final c:Lc/l;

.field final synthetic d:Lc/e;


# direct methods
.method constructor <init>(Lc/e;Lc/l;)V
    .locals 0

    iput-object p1, p0, Lc/e$k;->d:Lc/e;

    invoke-direct {p0, p1}, Lc/e$j;-><init>(Lc/e;)V

    iput-object p2, p0, Lc/e$k;->c:Lc/l;

    return-void
.end method


# virtual methods
.method b()Landroid/content/IntentFilter;
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.TIME_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIMEZONE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.TIME_TICK"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lc/e$k;->c:Lc/l;

    invoke-virtual {v0}, Lc/l;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lc/e$k;->d:Lc/e;

    invoke-virtual {v0}, Lc/e;->F()Z

    return-void
.end method
