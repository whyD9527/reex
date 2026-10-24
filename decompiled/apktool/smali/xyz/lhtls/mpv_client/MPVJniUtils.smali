.class public final Lxyz/lhtls/mpv_client/MPVJniUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lxyz/lhtls/mpv_client/MPVJniUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxyz/lhtls/mpv_client/MPVJniUtils;

    invoke-direct {v0}, Lxyz/lhtls/mpv_client/MPVJniUtils;-><init>()V

    sput-object v0, Lxyz/lhtls/mpv_client/MPVJniUtils;->a:Lxyz/lhtls/mpv_client/MPVJniUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native avJniSetJavaVM()V
.end method

.method public final native deleteGlobalNativePtr(J)V
.end method

.method public final native newGlobalNativePtr(Ljava/lang/Object;)J
.end method
