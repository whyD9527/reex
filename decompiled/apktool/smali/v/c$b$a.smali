.class public final Lv/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/c$b;-><init>(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lv/c$b;

.field final synthetic f:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lv/c$b;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lv/c$b$a;->e:Lv/c$b;

    iput-object p2, p0, Lv/c$b$a;->f:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    instance-of p1, p2, Landroid/window/SplashScreenView;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv/c$b$a;->e:Lv/c$b;

    check-cast p2, Landroid/window/SplashScreenView;

    invoke-virtual {p1, p2}, Lv/c$b;->d(Landroid/window/SplashScreenView;)Z

    move-result p2

    invoke-virtual {p1, p2}, Lv/c$b;->e(Z)V

    iget-object p1, p0, Lv/c$b$a;->f:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    :cond_0
    return-void
.end method

.method public onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    return-void
.end method
