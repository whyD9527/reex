/*
 * libmmr.c — Reex 媒体元数据检索器（伪代码重建）
 *
 * 这不是反编译得到的原始源码，而是从 ARM64 机器码还原出的等价 C 实现，
 * 用于说明行为与内存布局。每个函数头注释给出原始地址，便于对照
 * tools/disasm_arm64.py 的输出。
 *
 * 结构体定义见 ../libmmr.h
 */
#include "libmmr.h"

#include <libavformat/avformat.h>
#include <libavcodec/avcodec.h>
#include <libavutil/imgutils.h>
#include <libavutil/dict.h>
#include <libswscale/swscale.h>

/* ---------------------------------------------------------------- 内部工具 */

/* 0x1b04: 把 AVDictionary 复制成 mmr_metadata（数组式，便于 Dart FFI 读取） */
static mmr_metadata *mmr_metadata_from_dict(AVDictionary *dict)
{
    int n = av_dict_count(dict);
    if (n <= 0)
        return NULL;

    mmr_metadata *m = calloc(1, sizeof(mmr_metadata));
    if (!m)
        return NULL;

    m->count  = n;
    m->keys   = calloc(n, sizeof(char *));
    m->values = calloc(n, sizeof(char *));
    if (!m->keys || !m->values) {
        free(m->keys);
        free(m->values);
        free(m);
        return NULL;
    }

    /* 遍历：av_dict_get(dict, "", prev, AV_DICT_IGNORE_SUFFIX) */
    const AVDictionaryEntry *e = NULL;
    while ((e = av_dict_get(dict, "", e, AV_DICT_IGNORE_SUFFIX)) != NULL) {
        *m->keys++   = (char *)e->key;      /* 注意: 不复制字符串，仅借指针 */
        *m->values++ = (char *)e->value;
    }
    /* 恢复被后置自增的指针 —— 原实现用的是两个游标寄存器，这里语义等价 */
    m->keys   -= n;
    m->values -= n;
    return m;
}

/* 0x1dc0: 三个轨道链表都已构建完毕的收尾 */
static void mmr_build_tracks_done(mmr_retriever *r)
{
    r->tracks_built = 1;
}

/* 0x1c6c: 循环推进；到末尾则收尾 */
static void mmr_next_stream(mmr_retriever *r, int *i)
{
    AVFormatContext *fmt = (AVFormatContext *)r->fmt;
    (*i)++;
    if ((unsigned)*i >= fmt->nb_streams)
        mmr_build_tracks_done(r);
}

/* 0x1c38: 填充音频轨的剩余字段并挂到链表 */
static void mmr_fill_audio(mmr_retriever *r, AVStream *st, const AVCodec *codec,
                           const char *type, mmr_audio_track *t)
{
    AVCodecParameters *cp = st->codecpar;

    t->media_type      = type;
    t->codec_name      = codec->name;
    t->codec_long_name = codec->long_name;
    t->coded_side_data = cp->coded_side_data;
    t->field_08        = *(int *)((const char *)cp + 0x94); /* [存疑] */
    t->channels        = *(int *)((const char *)cp + 0x74); /* [存疑] */
    t->metadata        = mmr_metadata_from_dict(st->metadata);
    /* next 由调用者串接 */
}

/* 0x1c80: 遍历所有流，按 codec_type 建三条链表 */
static void mmr_build_tracks(mmr_retriever *r)
{
    AVFormatContext *fmt = (AVFormatContext *)r->fmt;

    for (unsigned i = 0; i < fmt->nb_streams; i++) {
        AVStream *st = fmt->streams[i];
        AVCodecParameters *cp = st->codecpar;

        const char *type = av_get_media_type_string(cp->codec_type);
        const AVCodec *codec = avcodec_find_decoder(cp->codec_id);
        if (!codec)
            continue;                       /* 0x1c6c：无法识别的编码直接跳过 */

        switch (cp->codec_type) {
        case AVMEDIA_TYPE_VIDEO: {          /* 0 */
            mmr_video_track *t = calloc(1, 0x48);
            if (!t)
                break;
            if (!r->video)
                r->video = t;               /* 头插：保留第一个视频轨 */

            t->media_type      = type;      /* "video" */
            t->codec_name      = codec->name;
            t->codec_long_name = codec->long_name;
            t->bit_rate        = cp->bit_rate;
            t->coded_side_data = cp->coded_side_data;

            /* avg_frame_rate / r_frame_rate 转 double */
            t->avg_frame_rate  = (double)st->avg_frame_rate.num / st->avg_frame_rate.den;
            t->r_frame_rate    = (double)st->r_frame_rate.num   / st->r_frame_rate.den;

            t->metadata = mmr_metadata_from_dict(st->metadata);
            break;
        }
        case AVMEDIA_TYPE_AUDIO: {          /* 1 */
            mmr_audio_track *t = calloc(1, 0x38);
            if (!t)
                break;
            if (!r->audio)
                r->audio = t;
            mmr_fill_audio(r, st, codec, type, t);
            break;
        }
        case AVMEDIA_TYPE_SUBTITLE: {       /* 3 */
            mmr_subtitle_track *t = calloc(1, 0x30);
            if (!t)
                break;
            if (!r->subtitle)
                r->subtitle = t;

            t->media_type      = type;
            t->codec_name      = codec->name;
            t->codec_long_name = codec->long_name;
            t->coded_side_data = cp->coded_side_data;
            t->metadata        = mmr_metadata_from_dict(st->metadata);
            break;
        }
        default:
            break;
        }
    }
    mmr_build_tracks_done(r);
}

/* ------------------------------------------------------------- 导出函数实现 */

/* 0x1610 */
mmr_retriever *media_metadata_retriever_create(const char *url)
{
    mmr_retriever *r = calloc(1, 0x30);
    if (!r)
        return NULL;

    /* 失败时: free(r) 并返回 NULL */
    if (avformat_open_input((AVFormatContext **)&r->fmt, url, NULL, NULL) != 0) {
        free(r);
        return NULL;
    }
    if (avformat_find_stream_info((AVFormatContext *)r->fmt, NULL) < 0) {
        free(r);                 /* 注意：原实现此处没有 avformat_close_input */
        return NULL;
    }
    return r;
}

/* 0x1ac4 */
int64_t media_metadata_retriever_get_duration(mmr_retriever *r)
{
    return ((AVFormatContext *)r->fmt)->duration;
}

/* 0x1ad0 */
mmr_metadata *media_metadata_retriever_get_metadata(mmr_retriever *r)
{
    if (!r->metadata)
        r->metadata = mmr_metadata_from_dict(((AVFormatContext *)r->fmt)->metadata);
    return r->metadata;
}

/* 0x1bdc / 0x1bdc+…: 首次访问时构建全部轨道链表 */
mmr_video_track *media_metadata_retriever_get_video_track(mmr_retriever *r)
{
    if (!r->tracks_built)
        mmr_build_tracks(r);
    return r->video;
}

mmr_audio_track *media_metadata_retriever_get_audio_track(mmr_retriever *r)
{
    if (!r->tracks_built)
        mmr_build_tracks(r);
    return r->audio;
}

mmr_subtitle_track *media_metadata_retriever_get_subtitle_track(mmr_retriever *r)
{
    if (!r->tracks_built)
        mmr_build_tracks(r);
    return r->subtitle;
}

/* 0x1a1c */
mmr_image *media_metadata_retriever_get_attached_image(mmr_retriever *r)
{
    AVFormatContext *fmt = (AVFormatContext *)r->fmt;

    int idx = av_find_best_stream(fmt, AVMEDIA_TYPE_VIDEO, -1, -1, NULL, 0);
    if (idx < 0)
        return NULL;

    AVStream *st = fmt->streams[idx];
    if (!(st->disposition & AV_DISPOSITION_ATTACHED_PIC))
        return NULL;

    mmr_image *img = malloc(0x10);
    if (!img)
        return NULL;

    AVPacket *pic = &st->attached_pic;
    img->data = malloc(pic->size);
    if (!img->data) {
        free(img);
        return NULL;
    }
    memcpy(img->data, pic->data, pic->size);
    img->size = pic->size;
    return img;
}

/* 0x17fc：解码一帧 → 缩放 → MJPEG 编码 */
static mmr_image *mmr_encode_jpeg(AVFrame *src, AVFrame *dst,
                                  int w, int h)
{
    struct SwsContext *sws = sws_getContext(src->width, src->height, src->format,
                                            dst->width, dst->height, dst->format,
                                            SWS_BILINEAR, NULL, NULL, NULL);
    if (!sws)
        return NULL;
    sws_scale(sws, (const uint8_t *const *)src->data, src->linesize, 0,
              src->height, dst->data, dst->linesize);
    sws_freeContext(sws);

    const AVCodec *codec = avcodec_find_encoder(AV_CODEC_ID_MJPEG);  /* 立即数 7 */
    if (!codec)
        return NULL;

    AVCodecContext *enc = avcodec_alloc_context3(codec);
    if (!enc)
        return NULL;
    enc->width     = dst->width;
    enc->height    = dst->height;
    enc->pix_fmt   = dst->format;
    enc->time_base = (AVRational){ 1, 25 };

    if (avcodec_open2(enc, codec, NULL) < 0)
        goto fail;

    AVPacket *pkt = av_packet_alloc();
    if (!pkt)
        goto fail;

    if (avcodec_send_frame(enc, dst) < 0)
        goto fail_pkt;
    if (avcodec_receive_packet(enc, pkt) < 0)
        goto fail_pkt;

    mmr_image *img = malloc(0x10);
    if (!img)
        goto fail_pkt;
    img->data = malloc(pkt->size);
    if (!img->data) {
        free(img);
        img = NULL;
        goto fail_pkt;
    }
    memcpy(img->data, pkt->data, pkt->size);
    img->size = pkt->size;

fail_pkt:
    av_packet_free(&pkt);
fail:
    avcodec_free_context(&enc);
    return img;
}

/* 0x1678 */
mmr_image *media_metadata_retriever_get_frame_at_time(mmr_retriever *r,
                                                      int pos, int width, int height)
{
    AVFormatContext *fmt = (AVFormatContext *)r->fmt;
    AVCodec *codec = NULL;
    int idx = av_find_best_stream(fmt, AVMEDIA_TYPE_VIDEO, -1, -1, &codec, 0);
    if (idx < 0)
        return NULL;

    AVStream *st = fmt->streams[idx];

    AVCodecContext *dec = avcodec_alloc_context3(codec);
    if (!dec)
        return NULL;
    if (avcodec_parameters_to_context(dec, st->codecpar) < 0)
        goto fail_dec;
    if (avcodec_open2(dec, codec, NULL) < 0)
        goto fail_dec;

    AVFrame *frame = av_frame_alloc();
    AVPacket *pkt  = av_packet_alloc();
    if (!frame || !pkt)
        goto fail;

    if (pos != 0) {
        /* 反汇编: av_rescale(pos, time_base.den, time_base.num) [单位存疑] */
        int64_t ts = av_rescale(pos, st->time_base.den, st->time_base.num);
        if (av_seek_frame(fmt, idx, ts, AVSEEK_FLAG_BACKWARD) < 0)
            goto fail;
        avcodec_flush_buffers(dec);
    }

    for (;;) {
        if (av_read_frame(fmt, pkt) < 0)
            goto fail;
        if (pkt->stream_index != idx) {
            av_packet_unref(pkt);
            continue;
        }
        if (avcodec_send_packet(dec, pkt) < 0)
            goto fail;
        int ret = avcodec_receive_frame(dec, frame);
        av_packet_unref(pkt);
        if (ret == AVERROR(EAGAIN))
            continue;
        if (ret < 0)
            goto fail;
        break;
    }

    /* 目标帧：宽高为 0 时沿用源尺寸；像素格式固定 YUVJ420P */
    AVFrame *out = av_frame_alloc();
    if (!out)
        goto fail;
    out->width  = width  > 0 ? width  : frame->width;
    out->height = height > 0 ? height : frame->height;
    out->format = AV_PIX_FMT_YUVJ420P;      /* 立即数 0xC */
    if (av_frame_get_buffer(out, 0) < 0) {
        av_frame_free(&out);
        goto fail;
    }

    mmr_image *img = mmr_encode_jpeg(frame, out, out->width, out->height);

    av_frame_free(&out);
    av_frame_free(&frame);
    av_packet_free(&pkt);
    avcodec_free_context(&dec);
    return img;

fail:
    av_frame_free(&frame);
    av_packet_free(&pkt);
fail_dec:
    avcodec_free_context(&dec);
    return NULL;
}

/* 0x1e3c */
void media_metadata_retriever_release(mmr_retriever *r)
{
    if (!r)
        return;

    if (r->metadata) {
        free(r->metadata->keys);
        free(r->metadata->values);
        free(r->metadata);
    }
    for (mmr_video_track *v = r->video; v; ) {
        mmr_video_track *n = v->next;
        if (v->metadata) {
            free(v->metadata->keys);
            free(v->metadata->values);
            free(v->metadata);
        }
        free(v);
        v = n;
    }
    for (mmr_audio_track *a = r->audio; a; ) {
        mmr_audio_track *n = a->next;
        if (a->metadata) {
            free(a->metadata->keys);
            free(a->metadata->values);
            free(a->metadata);
        }
        free(a);
        a = n;
    }
    for (mmr_subtitle_track *s = r->subtitle; s; ) {
        mmr_subtitle_track *n = s->next;
        if (s->metadata) {
            free(s->metadata->keys);
            free(s->metadata->values);
            free(s->metadata);
        }
        free(s);
        s = n;
    }
    /* 0x1f4c: avformat_close_input(&r->fmt) + free(r) */
    avformat_close_input((AVFormatContext **)&r->fmt);
    free(r);
}

/* 0x1f94 */
void media_image_release(mmr_image *img)
{
    if (!img)
        return;
    free(img->data);
    free(img);
}
