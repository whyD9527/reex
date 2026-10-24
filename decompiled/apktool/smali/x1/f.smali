.class public final Lx1/f;
.super Lx1/w0;
.source "SourceFile"


# instance fields
.field private final k:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    invoke-direct {p0}, Lx1/w0;-><init>()V

    iput-object p1, p0, Lx1/f;->k:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method protected y()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lx1/f;->k:Ljava/lang/Thread;

    return-object v0
.end method
