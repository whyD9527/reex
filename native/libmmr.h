/*
 * libmmr.h — Reex "media metadata retriever" (作者自写，逆向重建)
 *
 * 目标库: lib/arm64-v8a/libmmr.so  (11,568 字节)
 * 来源:   Reex 1.8.9  APK，包名 xyz.re.player.ex
 * 方法:   静态反汇编（tools/disasm_arm64.py）+ 导入符号/字符串交叉引用
 *
 * 置信度标注:
 *   [确定]   调用序列、结构体大小、字段偏移均可从反汇编直接读出
 *   [推断]   字段语义由调用上下文推断，未经运行时验证
 *   [存疑]   与 FFmpeg 7.0 头文件布局不一致，可能是作者编译头文件版本差异
 *
 * 注意: 本文件是"等价重写"所需的 ABI 描述，不是原作者的源码。
 *       结构体布局按实测偏移排列，未使用的填充用 _pad 表示。
 */
#ifndef REER_MMR_H
#define REER_MMR_H

#include <stdint.h>
#include <stddef.h>

#ifdef __cplusplus
extern "C" {
#endif

/* ---------------------------------------------------------------- 基础类型 */

/* 元数据键值表 —— calloc(1, 0x18) [确定] */
typedef struct mmr_metadata {
    int      count;          /* +0x00  条目数                        */
    char   **keys;           /* +0x08  calloc(count,8)               */
    char   **values;         /* +0x10  calloc(count,8)               */
} mmr_metadata;

/* 封面/截帧 —— calloc/malloc(0x10) [确定] */
typedef struct mmr_image {
    uint8_t *data;           /* +0x00  由 malloc 分配，media_image_release 释放 */
    size_t   size;           /* +0x08  字节数（JPEG 数据）            */
} mmr_image;

/* 轨道链表节点（三种类型布局不同，见下） */

/* 视频轨 —— calloc(1, 0x48) [确定] */
typedef struct mmr_video_track {
    void           *coded_side_data; /* +0x00  ← codecpar+0x20 (AVPacketSideData*) [推断] */
    int64_t         bit_rate;        /* +0x08  ← codecpar+0x38 (bit_rate)          [确定] */
    double          avg_frame_rate;  /* +0x10  ← stream+0x58 avg_frame_rate        [确定] */
    double          r_frame_rate;    /* +0x18  ← stream+0xD8 r_frame_rate          [确定] */
    const char     *media_type;      /* +0x20  av_get_media_type_string() → "video" [确定] */
    const char     *codec_name;      /* +0x28  AVCodec.name                        [确定] */
    const char     *codec_long_name; /* +0x30  AVCodec.long_name                   [确定] */
    mmr_metadata   *metadata;        /* +0x38  stream->metadata 的键值副本         [确定] */
    struct mmr_video_track *next;    /* +0x40  链表后继                            [确定] */
} mmr_video_track;

/* 音频轨 —— calloc(1, 0x38) [确定] */
typedef struct mmr_audio_track {
    void           *coded_side_data; /* +0x00  ← codecpar+0x20                     [推断] */
    int             field_08;        /* +0x08  ← codecpar+0x94                     [存疑] */
    int             channels;        /* +0x0c  ← codecpar+0x74（推断为 channels）   [存疑] */
    const char     *media_type;      /* +0x10  "audio"                             [确定] */
    const char     *codec_name;      /* +0x18  AVCodec.name                        [确定] */
    const char     *codec_long_name; /* +0x20  AVCodec.long_name                   [确定] */
    mmr_metadata   *metadata;        /* +0x28  stream->metadata                    [确定] */
    struct mmr_audio_track *next;    /* +0x30                                      [确定] */
} mmr_audio_track;

/* 字幕轨 —— calloc(1, 0x30) [确定] */
typedef struct mmr_subtitle_track {
    void           *coded_side_data; /* +0x00  ← codecpar+0x20                     [推断] */
    const char     *media_type;      /* +0x08  "subtitle"                          [确定] */
    const char     *codec_name;      /* +0x10  AVCodec.name                        [确定] */
    const char     *codec_long_name; /* +0x18  AVCodec.long_name                   [确定] */
    mmr_metadata   *metadata;        /* +0x20  stream->metadata                    [确定] */
    struct mmr_subtitle_track *next; /* +0x28                                      [确定] */
} mmr_subtitle_track;

/* 检索器 —— calloc(1, 0x30) [确定] */
typedef struct mmr_retriever {
    void             *fmt;           /* +0x00  AVFormatContext*                    [确定] */
    mmr_metadata     *metadata;      /* +0x08  懒加载缓存（get_metadata 首次调用填充）*/
    uint8_t           tracks_built;  /* +0x10  0/1 标志（get_*_track 首次调用置 1）*/
    uint8_t           _pad[7];       /* +0x11                                        */
    mmr_video_track  *video;         /* +0x18  链表头                                */
    mmr_audio_track  *audio;         /* +0x20  链表头                                */
    mmr_subtitle_track *subtitle;    /* +0x28  链表头                                */
} mmr_retriever;

/* ------------------------------------------------------------------- API */
/*
 * 打开媒体并读取流信息。
 *   内部: calloc(1,0x30) → avformat_open_input(&self->fmt, url, NULL, NULL)
 *         → avformat_find_stream_info(self->fmt, NULL)
 *   失败返回 NULL（并 free）。
 *   反汇编: media_metadata_retriever_create @0x1610
 */
mmr_retriever *media_metadata_retriever_create(const char *url);

/* 释放检索器、所有轨道、元数据与封面缓存。NULL 安全。
 *   反汇编: media_metadata_retriever_release @0x1e3c */
void media_metadata_retriever_release(mmr_retriever *r);

/* 时长，单位 AV_TIME_BASE（1/1000000 秒）。直接返回 fmt->duration。
 *   反汇编: media_metadata_retriever_get_duration @0x1ac4 */
int64_t media_metadata_retriever_get_duration(mmr_retriever *r);

/* 容器级元数据键值表；无标签时返回 NULL。首次调用后缓存于 r->metadata。
 *   反汇编: media_metadata_retriever_get_metadata @0x1ad0 */
mmr_metadata *media_metadata_retriever_get_metadata(mmr_retriever *r);

/* 轨道链表（首次调用会遍历全部流并构建三个链表）：
 *   反汇编: get_video_track @0x1bdc / get_audio_track @0x1c0c(0x20) / get_subtitle_track
 */
mmr_video_track    *media_metadata_retriever_get_video_track(mmr_retriever *r);
mmr_audio_track    *media_metadata_retriever_get_audio_track(mmr_retriever *r);
mmr_subtitle_track *media_metadata_retriever_get_subtitle_track(mmr_retriever *r);

/* 内嵌封面（AV_DISPOSITION_ATTACHED_PIC）。
 *   流程: av_find_best_stream(fmt, AVMEDIA_TYPE_VIDEO, -1, -1, NULL, 0)
 *         → 检查 stream->disposition & 0x400
 *         → malloc(0x10) + malloc(packet.size) + memcpy
 *   无封面返回 NULL。数据一般是 JPEG。
 *   反汇编: media_metadata_retriever_get_attached_image @0x1a1c
 */
mmr_image *media_metadata_retriever_get_attached_image(mmr_retriever *r);

/*
 * 在指定时间点截帧，编码为 JPEG 返回。
 *   pos:  seek 位置。内部 av_rescale(pos, time_base.den, time_base.num)
 *         且 pos 按 32 位有符号处理；**单位需运行时确认**（秒 or 毫秒）[存疑]
 *   width/height: 输出尺寸；<=0 时取源尺寸。
 *   流程: av_find_best_stream → avcodec_alloc_context3 → avcodec_open2
 *         → av_seek_frame(+flush) → av_read_frame/send_packet/receive_frame
 *         → sws_getContext/scale → avcodec_find_encoder(AV_CODEC_ID_MJPEG=7)
 *         → avcodec_open2 → avcodec_send_frame → avcodec_receive_packet
 *         → malloc + memcpy
 *   反汇编: media_metadata_retriever_get_frame_at_time @0x1678, 核心 @0x17fc
 */
mmr_image *media_metadata_retriever_get_frame_at_time(mmr_retriever *r,
                                                      int pos, int width, int height);

/* 释放 mmr_image（先 free(data) 再 free(struct)）。
 *   反汇编: media_image_release @0x1f94 */
void media_image_release(mmr_image *img);

#ifdef __cplusplus
}
#endif
#endif /* REER_MMR_H */
