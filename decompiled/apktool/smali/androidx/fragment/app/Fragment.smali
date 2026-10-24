.class public Landroidx/fragment/app/Fragment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Landroidx/lifecycle/g;
.implements Landroidx/lifecycle/t;
.implements Landroidx/savedstate/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/Fragment$d;,
        Landroidx/fragment/app/Fragment$f;,
        Landroidx/fragment/app/Fragment$e;
    }
.end annotation


# static fields
.field static final b0:Ljava/lang/Object;


# instance fields
.field A:I

.field B:Ljava/lang/String;

.field C:Z

.field D:Z

.field E:Z

.field F:Z

.field G:Z

.field H:Z

.field private I:Z

.field J:Landroid/view/ViewGroup;

.field K:Landroid/view/View;

.field L:Landroid/view/View;

.field M:Z

.field N:Z

.field O:Landroidx/fragment/app/Fragment$d;

.field P:Ljava/lang/Runnable;

.field Q:Z

.field R:Z

.field S:F

.field T:Landroid/view/LayoutInflater;

.field U:Z

.field V:Landroidx/lifecycle/d$c;

.field W:Landroidx/lifecycle/h;

.field X:Landroidx/fragment/app/q;

.field Y:Landroidx/lifecycle/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/l<",
            "Landroidx/lifecycle/g;",
            ">;"
        }
    .end annotation
.end field

.field Z:Landroidx/savedstate/a;

.field private a0:I

.field e:I

.field f:Landroid/os/Bundle;

.field g:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field h:Ljava/lang/Boolean;

.field i:Ljava/lang/String;

.field j:Landroid/os/Bundle;

.field k:Landroidx/fragment/app/Fragment;

.field l:Ljava/lang/String;

.field m:I

.field private n:Ljava/lang/Boolean;

.field o:Z

.field p:Z

.field q:Z

.field r:Z

.field s:Z

.field t:Z

.field u:I

.field v:Landroidx/fragment/app/i;

.field w:Landroidx/fragment/app/g;

.field x:Landroidx/fragment/app/i;

.field y:Landroidx/fragment/app/Fragment;

.field z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/fragment/app/Fragment;->b0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/Fragment;->e:I

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->l:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->n:Ljava/lang/Boolean;

    new-instance v0, Landroidx/fragment/app/i;

    invoke-direct {v0}, Landroidx/fragment/app/i;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->N:Z

    new-instance v0, Landroidx/fragment/app/Fragment$a;

    invoke-direct {v0, p0}, Landroidx/fragment/app/Fragment$a;-><init>(Landroidx/fragment/app/Fragment;)V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->P:Ljava/lang/Runnable;

    sget-object v0, Landroidx/lifecycle/d$c;->i:Landroidx/lifecycle/d$c;

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->V:Landroidx/lifecycle/d$c;

    new-instance v0, Landroidx/lifecycle/l;

    invoke-direct {v0}, Landroidx/lifecycle/l;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->Y:Landroidx/lifecycle/l;

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->J()V

    return-void
.end method

.method private J()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/h;

    invoke-direct {v0, p0}, Landroidx/lifecycle/h;-><init>(Landroidx/lifecycle/g;)V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/lifecycle/h;

    invoke-static {p0}, Landroidx/savedstate/a;->a(Landroidx/savedstate/b;)Landroidx/savedstate/a;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->Z:Landroidx/savedstate/a;

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/lifecycle/h;

    new-instance v1, Landroidx/fragment/app/Fragment$2;

    invoke-direct {v1, p0}, Landroidx/fragment/app/Fragment$2;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->a(Landroidx/lifecycle/f;)V

    return-void
.end method

.method public static L(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, ": make sure class name exists, is public, and has an empty constructor that is public"

    const-string v1, "Unable to instantiate fragment "

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-static {p0, p1}, Landroidx/fragment/app/f;->d(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {p0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/fragment/app/Fragment;

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->c1(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    new-instance p2, Landroidx/fragment/app/Fragment$e;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": calling Fragment constructor caused an exception"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$e;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_1
    move-exception p0

    new-instance p2, Landroidx/fragment/app/Fragment$e;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": could not find Fragment constructor"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$e;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_2
    move-exception p0

    new-instance p2, Landroidx/fragment/app/Fragment$e;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$e;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_3
    move-exception p0

    new-instance p2, Landroidx/fragment/app/Fragment$e;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Landroidx/fragment/app/Fragment$e;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method private d()Landroidx/fragment/app/Fragment$d;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/fragment/app/Fragment$d;

    invoke-direct {v0}, Landroidx/fragment/app/Fragment$d;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    return-object v0
.end method


# virtual methods
.method public A()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$d;->j:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/Fragment;->b0:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->r()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method A0(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/i;->u(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public final B()Landroid/content/res/Resources;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->W0()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method B0(Landroid/view/MenuItem;)Z
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->C:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->W(Landroid/view/MenuItem;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/i;->v(Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final C()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->E:Z

    return v0
.end method

.method C0(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->N0()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/Fragment;->e:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/Fragment;->I:Z

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->Z:Landroidx/savedstate/a;

    invoke-virtual {v1, p1}, Landroidx/savedstate/a;->c(Landroid/os/Bundle;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->X(Landroid/os/Bundle;)V

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->U:Z

    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/lifecycle/h;

    sget-object v0, Landroidx/lifecycle/d$b;->ON_CREATE:Landroidx/lifecycle/d$b;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/h;->h(Landroidx/lifecycle/d$b;)V

    return-void

    :cond_0
    new-instance p1, Landroidx/fragment/app/r;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onCreate()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/fragment/app/r;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public D()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$d;->h:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/Fragment;->b0:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method D0(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->C:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/Fragment;->a0(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0, p1, p2}, Landroidx/fragment/app/i;->x(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p1

    or-int/2addr v1, p1

    :cond_1
    return v1
.end method

.method public E()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$d;->k:Ljava/lang/Object;

    return-object v0
.end method

.method E0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->N0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->t:Z

    new-instance v0, Landroidx/fragment/app/q;

    invoke-direct {v0}, Landroidx/fragment/app/q;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/fragment/app/q;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->b0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/fragment/app/q;

    invoke-virtual {p1}, Landroidx/fragment/app/q;->c()V

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->Y:Landroidx/lifecycle/l;

    iget-object p2, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/fragment/app/q;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/fragment/app/q;

    invoke-virtual {p1}, Landroidx/fragment/app/q;->d()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/fragment/app/q;

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public F()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$d;->l:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/Fragment;->b0:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->E()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method F0()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->y()V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/lifecycle/h;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_DESTROY:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->h(Landroidx/lifecycle/d$b;)V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/Fragment;->e:I

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->U:Z

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/fragment/app/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDestroy()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method G()I
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/Fragment$d;->c:I

    return v0
.end method

.method G0()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->z()V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/fragment/app/q;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_DESTROY:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/q;->b(Landroidx/lifecycle/d$b;)V

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/Fragment;->e:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->e0()V

    iget-boolean v1, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v1, :cond_1

    invoke-static {p0}, Landroidx/loader/app/a;->b(Landroidx/lifecycle/g;)Landroidx/loader/app/a;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/loader/app/a;->c()V

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->t:Z

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final H()Landroidx/fragment/app/Fragment;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->k:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/i;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->l:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/i;->k:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method H0()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->f0()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->T:Landroid/view/LayoutInflater;

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->y0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->y()V

    new-instance v0, Landroidx/fragment/app/i;

    invoke-direct {v0}, Landroidx/fragment/app/i;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    :cond_0
    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDetach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public I()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    return-object v0
.end method

.method I0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->g0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/Fragment;->T:Landroid/view/LayoutInflater;

    return-object p1
.end method

.method J0()V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->onLowMemory()V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->A()V

    return-void
.end method

.method K()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->J()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->o:Z

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->p:Z

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->q:Z

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->r:Z

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->s:Z

    iput v0, p0, Landroidx/fragment/app/Fragment;->u:I

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/i;

    new-instance v2, Landroidx/fragment/app/i;

    invoke-direct {v2}, Landroidx/fragment/app/i;-><init>()V

    iput-object v2, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    iput-object v1, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/g;

    iput v0, p0, Landroidx/fragment/app/Fragment;->z:I

    iput v0, p0, Landroidx/fragment/app/Fragment;->A:I

    iput-object v1, p0, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->C:Z

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->D:Z

    return-void
.end method

.method K0(Z)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->k0(Z)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/i;->B(Z)V

    return-void
.end method

.method L0(Landroid/view/MenuItem;)Z
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->C:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->l0(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/i;->Q(Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method M()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, v0, Landroidx/fragment/app/Fragment$d;->q:Z

    return v0
.end method

.method M0(Landroid/view/Menu;)V
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->C:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->m0(Landroid/view/Menu;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/i;->R(Landroid/view/Menu;)V

    :cond_1
    return-void
.end method

.method final N()Z
    .locals 1

    iget v0, p0, Landroidx/fragment/app/Fragment;->u:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method N0()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->T()V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/fragment/app/q;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_PAUSE:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/q;->b(Landroidx/lifecycle/d$b;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/lifecycle/h;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_PAUSE:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->h(Landroidx/lifecycle/d$b;)V

    const/4 v0, 0x3

    iput v0, p0, Landroidx/fragment/app/Fragment;->e:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onPause()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method O()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, v0, Landroidx/fragment/app/Fragment$d;->o:Z

    return v0
.end method

.method O0(Z)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->o0(Z)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/i;->U(Z)V

    return-void
.end method

.method public final P()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/i;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/i;->C0()Z

    move-result v0

    return v0
.end method

.method P0(Landroid/view/Menu;)Z
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->C:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->p0(Landroid/view/Menu;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/i;->V(Landroid/view/Menu;)Z

    move-result p1

    or-int/2addr v1, p1

    :cond_1
    return v1
.end method

.method Q()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->N0()V

    return-void
.end method

.method Q0()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/i;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/i;->A0(Landroidx/fragment/app/Fragment;)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->n:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, v0, :cond_1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Landroidx/fragment/app/Fragment;->n:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->q0(Z)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->W()V

    :cond_1
    return-void
.end method

.method public R(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method R0()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->N0()V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->f0()Z

    const/4 v0, 0x4

    iput v0, p0, Landroidx/fragment/app/Fragment;->e:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->s0()V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/lifecycle/h;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_RESUME:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->h(Landroidx/lifecycle/d$b;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/fragment/app/q;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/q;->b(Landroidx/lifecycle/d$b;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->X()V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->f0()Z

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onResume()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public S(IILandroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method S0(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->t0(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->Z:Landroidx/savedstate/a;

    invoke-virtual {v0, p1}, Landroidx/savedstate/a;->d(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->Z0()Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method public T(Landroid/app/Activity;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method T0()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->N0()V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->f0()Z

    const/4 v0, 0x3

    iput v0, p0, Landroidx/fragment/app/Fragment;->e:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->u0()V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/lifecycle/h;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_START:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->h(Landroidx/lifecycle/d$b;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/fragment/app/q;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/q;->b(Landroidx/lifecycle/d$b;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->Y()V

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onStart()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public U(Landroid/content/Context;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/g;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/g;->e()Landroid/app/Activity;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->T(Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method U0()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->a0()V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/fragment/app/q;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_STOP:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/q;->b(Landroidx/lifecycle/d$b;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/lifecycle/h;

    sget-object v1, Landroidx/lifecycle/d$b;->ON_STOP:Landroidx/lifecycle/d$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->h(Landroidx/lifecycle/d$b;)V

    const/4 v0, 0x2

    iput v0, p0, Landroidx/fragment/app/Fragment;->e:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->v0()V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onStop()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public V(Landroidx/fragment/app/Fragment;)V
    .locals 0

    return-void
.end method

.method public final V0()Landroidx/fragment/app/c;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->g()Landroidx/fragment/app/c;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to an activity."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public W(Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final W0()Landroid/content/Context;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to a context."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public X(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->Y0(Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/i;->B0(I)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {p1}, Landroidx/fragment/app/i;->w()V

    :cond_0
    return-void
.end method

.method public final X0()Landroid/view/View;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->I()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public Y(IZI)Landroid/view/animation/Animation;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method Y0(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/i;->X0(Landroid/os/Parcelable;)V

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {p1}, Landroidx/fragment/app/i;->w()V

    :cond_0
    return-void
.end method

.method public Z(IZI)Landroid/animation/Animator;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method final Z0(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->g:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->L:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/Fragment;->g:Landroid/util/SparseArray;

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->x0(Landroid/os/Bundle;)V

    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->X:Landroidx/fragment/app/q;

    sget-object v0, Landroidx/lifecycle/d$b;->ON_CREATE:Landroidx/lifecycle/d$b;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/q;->b(Landroidx/lifecycle/d$b;)V

    :cond_1
    return-void

    :cond_2
    new-instance p1, Landroidx/fragment/app/r;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/fragment/app/r;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()Landroidx/lifecycle/d;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->W:Landroidx/lifecycle/h;

    return-object v0
.end method

.method public a0(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    return-void
.end method

.method a1(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->d()Landroidx/fragment/app/Fragment$d;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/Fragment$d;->a:Landroid/view/View;

    return-void
.end method

.method b()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    iput-boolean v2, v0, Landroidx/fragment/app/Fragment$d;->o:Z

    iget-object v2, v0, Landroidx/fragment/app/Fragment$d;->p:Landroidx/fragment/app/Fragment$f;

    iput-object v1, v0, Landroidx/fragment/app/Fragment$d;->p:Landroidx/fragment/app/Fragment$f;

    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroidx/fragment/app/Fragment$f;->a()V

    :cond_1
    return-void
.end method

.method public b0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    iget p3, p0, Landroidx/fragment/app/Fragment;->a0:I

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method b1(Landroid/animation/Animator;)V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->d()Landroidx/fragment/app/Fragment$d;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/Fragment$d;->b:Landroid/animation/Animator;

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/Fragment;->z:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mContainerId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/Fragment;->A:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mTag="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/Fragment;->e:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mWho="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBackStackNesting="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/Fragment;->u:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAdded="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->o:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mRemoving="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->p:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mFromLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->q:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mInLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->r:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHidden="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->C:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mDetached="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->D:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mMenuVisible="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->H:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mHasMenu="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->G:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mRetainInstance="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->E:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mUserVisibleHint="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->N:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/i;

    if-eqz v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentManager="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/i;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/g;

    if-eqz v0, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHost="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/g;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mParentFragment="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->j:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mArguments="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->j:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->f:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedFragmentState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->f:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->g:Landroid/util/SparseArray;

    if-eqz v0, :cond_5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->g:Landroid/util/SparseArray;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->H()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mTarget="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v0, " mTargetRequestCode="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/Fragment;->m:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()I

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mNextAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->w()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_7
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->J:Landroid/view/ViewGroup;

    if-eqz v0, :cond_8

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->J:Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_8
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    if-eqz v0, :cond_9

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_9
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->L:Landroid/view/View;

    if-eqz v0, :cond_a

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mInnerView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->K:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_a
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->l()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAnimatingAway="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->l()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mStateAfterAnimating="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_b
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-static {p0}, Landroidx/loader/app/a;->b(Landroidx/lifecycle/g;)Landroidx/loader/app/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/loader/app/a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_c
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Child "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "  "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/i;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public c0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public c1(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/i;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->P()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added and state has been saved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->j:Landroid/os/Bundle;

    return-void
.end method

.method public d0()V
    .locals 0

    return-void
.end method

.method d1(Z)V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->d()Landroidx/fragment/app/Fragment$d;

    move-result-object v0

    iput-boolean p1, v0, Landroidx/fragment/app/Fragment$d;->q:Z

    return-void
.end method

.method e(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/i;->l0(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method

.method public e0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method e1(I)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->d()Landroidx/fragment/app/Fragment$d;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/Fragment$d;->d:I

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Landroidx/lifecycle/s;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/fragment/app/i;->v0(Landroidx/fragment/app/Fragment;)Landroidx/lifecycle/s;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method f1(II)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->d()Landroidx/fragment/app/Fragment$d;

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    iput p1, v0, Landroidx/fragment/app/Fragment$d;->e:I

    iput p2, v0, Landroidx/fragment/app/Fragment$d;->f:I

    return-void
.end method

.method public final g()Landroidx/fragment/app/c;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/g;->e()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/c;

    :goto_0
    return-object v0
.end method

.method public g0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->v(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    return-object p1
.end method

.method g1(Landroidx/fragment/app/Fragment$f;)V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->d()Landroidx/fragment/app/Fragment$d;

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    iget-object v1, v0, Landroidx/fragment/app/Fragment$d;->p:Landroidx/fragment/app/Fragment$f;

    if-ne p1, v1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Trying to set a replacement startPostponedEnterTransition on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iget-boolean v1, v0, Landroidx/fragment/app/Fragment$d;->o:Z

    if-eqz v1, :cond_3

    iput-object p1, v0, Landroidx/fragment/app/Fragment$d;->p:Landroidx/fragment/app/Fragment$f;

    :cond_3
    if-eqz p1, :cond_4

    invoke-interface {p1}, Landroidx/fragment/app/Fragment$f;->b()V

    :cond_4
    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/Fragment$d;->n:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public h0(Z)V
    .locals 0

    return-void
.end method

.method h1(I)V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->d()Landroidx/fragment/app/Fragment$d;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/Fragment$d;->c:I

    return-void
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/Fragment$d;->m:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public i0(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public i1()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/i;

    if-eqz v0, :cond_2

    iget-object v0, v0, Landroidx/fragment/app/i;->u:Landroidx/fragment/app/g;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/i;

    iget-object v1, v1, Landroidx/fragment/app/i;->u:Landroidx/fragment/app/g;

    invoke-virtual {v1}, Landroidx/fragment/app/g;->h()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/i;

    iget-object v0, v0, Landroidx/fragment/app/i;->u:Landroidx/fragment/app/g;

    invoke-virtual {v0}, Landroidx/fragment/app/g;->h()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/Fragment$b;

    invoke-direct {v1, p0}, Landroidx/fragment/app/Fragment$b;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b()V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;->d()Landroidx/fragment/app/Fragment$d;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/fragment/app/Fragment$d;->o:Z

    :goto_1
    return-void
.end method

.method public j0(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/g;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/g;->e()Landroid/app/Activity;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->i0(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method

.method public final k()Landroidx/savedstate/SavedStateRegistry;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->Z:Landroidx/savedstate/a;

    invoke-virtual {v0}, Landroidx/savedstate/a;->b()Landroidx/savedstate/SavedStateRegistry;

    move-result-object v0

    return-object v0
.end method

.method public k0(Z)V
    .locals 0

    return-void
.end method

.method l()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$d;->a:Landroid/view/View;

    return-object v0
.end method

.method public l0(Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method m()Landroid/animation/Animator;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$d;->b:Landroid/animation/Animator;

    return-object v0
.end method

.method public m0(Landroid/view/Menu;)V
    .locals 0

    return-void
.end method

.method public final n()Landroidx/fragment/app/h;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has not been attached yet."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public n0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public o()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/g;->g()Landroid/content/Context;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public o0(Z)V
    .locals 0

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->V0()Landroidx/fragment/app/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$d;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public p0(Landroid/view/Menu;)V
    .locals 0

    return-void
.end method

.method q()Landroidx/core/app/k0;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public q0(Z)V
    .locals 0

    return-void
.end method

.method public r()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/Fragment$d;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public r0(I[Ljava/lang/String;[I)V
    .locals 0

    return-void
.end method

.method s()Landroidx/core/app/k0;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public s0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public final t()Landroidx/fragment/app/h;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/i;

    return-object v0
.end method

.method public t0(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {p0, v0}, Landroidx/core/util/b;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/Fragment;->z:I

    if-eqz v1, :cond_0

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/Fragment;->z:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/g;->m()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public u0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method public v(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/g;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/g;->n()Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->t0()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/core/view/g;->a(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public v0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method w()I
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/Fragment$d;->d:I

    return v0
.end method

.method public w0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method x()I
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/Fragment$d;->e:I

    return v0
.end method

.method public x0(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    return-void
.end method

.method y()I
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->O:Landroidx/fragment/app/Fragment$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/Fragment$d;->f:I

    return v0
.end method

.method y0(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->N0()V

    const/4 v0, 0x2

    iput v0, p0, Landroidx/fragment/app/Fragment;->e:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->R(Landroid/os/Bundle;)V

    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    invoke-virtual {p1}, Landroidx/fragment/app/i;->t()V

    return-void

    :cond_0
    new-instance p1, Landroidx/fragment/app/r;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onActivityCreated()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroidx/fragment/app/r;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final z()Landroidx/fragment/app/Fragment;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    return-object v0
.end method

.method z0()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->x:Landroidx/fragment/app/i;

    iget-object v1, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/g;

    new-instance v2, Landroidx/fragment/app/Fragment$c;

    invoke-direct {v2, p0}, Landroidx/fragment/app/Fragment$c;-><init>(Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v0, v1, v2, p0}, Landroidx/fragment/app/i;->k(Landroidx/fragment/app/g;Landroidx/fragment/app/d;Landroidx/fragment/app/Fragment;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    iget-object v0, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/g;

    invoke-virtual {v0}, Landroidx/fragment/app/g;->g()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->U(Landroid/content/Context;)V

    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->I:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/fragment/app/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onAttach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/fragment/app/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method
