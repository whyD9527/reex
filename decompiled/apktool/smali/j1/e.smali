.class public interface abstract Lj1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/e$b;,
        Lj1/e$a;
    }
.end annotation


# static fields
.field public static final b:Lj1/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lj1/e$b;->e:Lj1/e$b;

    sput-object v0, Lj1/e;->b:Lj1/e$b;

    return-void
.end method


# virtual methods
.method public abstract d(Lj1/d;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj1/d<",
            "*>;)V"
        }
    .end annotation
.end method

.method public abstract l(Lj1/d;)Lj1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj1/d<",
            "-TT;>;)",
            "Lj1/d<",
            "TT;>;"
        }
    .end annotation
.end method
