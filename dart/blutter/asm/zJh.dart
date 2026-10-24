// lib: , url: ZJh

// class id: 1049259, size: 0x8
class :: {
}

// class id: 648, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class fq extends Object {

  String DDb(fq) {
    // ** addr: 0x6f00a4, size: 0x42c
    // 0x6f00a4: EnterFrame
    //     0x6f00a4: stp             fp, lr, [SP, #-0x10]!
    //     0x6f00a8: mov             fp, SP
    // 0x6f00ac: AllocStack(0x18)
    //     0x6f00ac: sub             SP, SP, #0x18
    // 0x6f00b0: CheckStackOverflow
    //     0x6f00b0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6f00b4: cmp             SP, x16
    //     0x6f00b8: b.ls            #0x6f04b0
    // 0x6f00bc: r1 = Null
    //     0x6f00bc: mov             x1, NULL
    // 0x6f00c0: r2 = 60
    //     0x6f00c0: mov             x2, #0x3c
    // 0x6f00c4: r0 = AllocateArray()
    //     0x6f00c4: bl              #0x74cc68  ; AllocateArrayStub
    // 0x6f00c8: stur            x0, [fp, #-8]
    // 0x6f00cc: r17 = "numberOfProcessors"
    //     0x6f00cc: add             x17, PP, #0xa, lsl #12  ; [pp+0xa720] "numberOfProcessors"
    //     0x6f00d0: ldr             x17, [x17, #0x720]
    // 0x6f00d4: StoreField: r0->field_f = r17
    //     0x6f00d4: stur            w17, [x0, #0xf]
    // 0x6f00d8: r0 = InitLateStaticField(0x638) // [dart:io] fq::vKb
    //     0x6f00d8: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f00dc: ldr             x0, [x0, #0xc70]
    //     0x6f00e0: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f00e4: cmp             w0, w16
    //     0x6f00e8: b.ne            #0x6f00f8
    //     0x6f00ec: add             x2, PP, #0xa, lsl #12  ; [pp+0xa728] Field <fq.vKb>: static late final (offset: 0x638)
    //     0x6f00f0: ldr             x2, [x2, #0x728]
    //     0x6f00f4: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f00f8: ldur            x1, [fp, #-8]
    // 0x6f00fc: ArrayStore: r1[1] = r0  ; List_4
    //     0x6f00fc: add             x25, x1, #0x13
    //     0x6f0100: str             w0, [x25]
    //     0x6f0104: tbz             w0, #0, #0x6f0120
    //     0x6f0108: ldurb           w16, [x1, #-1]
    //     0x6f010c: ldurb           w17, [x0, #-1]
    //     0x6f0110: and             x16, x17, x16, lsr #2
    //     0x6f0114: tst             x16, HEAP, lsr #32
    //     0x6f0118: b.eq            #0x6f0120
    //     0x6f011c: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x6f0120: ldur            x1, [fp, #-8]
    // 0x6f0124: r17 = "pathSeparator"
    //     0x6f0124: add             x17, PP, #0xa, lsl #12  ; [pp+0xa730] "pathSeparator"
    //     0x6f0128: ldr             x17, [x17, #0x730]
    // 0x6f012c: ArrayStore: r1[0] = r17  ; List_4
    //     0x6f012c: stur            w17, [x1, #0x17]
    // 0x6f0130: r17 = "/"
    //     0x6f0130: ldr             x17, [PP, #0xf10]  ; [pp+0xf10] "/"
    // 0x6f0134: StoreField: r1->field_1b = r17
    //     0x6f0134: stur            w17, [x1, #0x1b]
    // 0x6f0138: r17 = "operatingSystem"
    //     0x6f0138: add             x17, PP, #0xa, lsl #12  ; [pp+0xa738] "operatingSystem"
    //     0x6f013c: ldr             x17, [x17, #0x738]
    // 0x6f0140: StoreField: r1->field_1f = r17
    //     0x6f0140: stur            w17, [x1, #0x1f]
    // 0x6f0144: r17 = "android"
    //     0x6f0144: ldr             x17, [PP, #0x4290]  ; [pp+0x4290] "android"
    // 0x6f0148: StoreField: r1->field_23 = r17
    //     0x6f0148: stur            w17, [x1, #0x23]
    // 0x6f014c: r17 = "operatingSystemVersion"
    //     0x6f014c: add             x17, PP, #0xa, lsl #12  ; [pp+0xa740] "operatingSystemVersion"
    //     0x6f0150: ldr             x17, [x17, #0x740]
    // 0x6f0154: StoreField: r1->field_27 = r17
    //     0x6f0154: stur            w17, [x1, #0x27]
    // 0x6f0158: r0 = InitLateStaticField(0x63c) // [dart:io] fq::wKb
    //     0x6f0158: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f015c: ldr             x0, [x0, #0xc78]
    //     0x6f0160: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f0164: cmp             w0, w16
    //     0x6f0168: b.ne            #0x6f0178
    //     0x6f016c: add             x2, PP, #0xa, lsl #12  ; [pp+0xa748] Field <fq.wKb>: static late final (offset: 0x63c)
    //     0x6f0170: ldr             x2, [x2, #0x748]
    //     0x6f0174: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f0178: ldur            x1, [fp, #-8]
    // 0x6f017c: ArrayStore: r1[7] = r0  ; List_4
    //     0x6f017c: add             x25, x1, #0x2b
    //     0x6f0180: str             w0, [x25]
    //     0x6f0184: tbz             w0, #0, #0x6f01a0
    //     0x6f0188: ldurb           w16, [x1, #-1]
    //     0x6f018c: ldurb           w17, [x0, #-1]
    //     0x6f0190: and             x16, x17, x16, lsr #2
    //     0x6f0194: tst             x16, HEAP, lsr #32
    //     0x6f0198: b.eq            #0x6f01a0
    //     0x6f019c: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x6f01a0: ldur            x1, [fp, #-8]
    // 0x6f01a4: r17 = "localHostname"
    //     0x6f01a4: add             x17, PP, #0xa, lsl #12  ; [pp+0xa750] "localHostname"
    //     0x6f01a8: ldr             x17, [x17, #0x750]
    // 0x6f01ac: StoreField: r1->field_2f = r17
    //     0x6f01ac: stur            w17, [x1, #0x2f]
    // 0x6f01b0: r0 = InitLateStaticField(0x640) // [dart:io] fq::xKb
    //     0x6f01b0: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f01b4: ldr             x0, [x0, #0xc80]
    //     0x6f01b8: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f01bc: cmp             w0, w16
    //     0x6f01c0: b.ne            #0x6f01d0
    //     0x6f01c4: add             x2, PP, #0xa, lsl #12  ; [pp+0xa758] Field <fq.xKb>: static late final (offset: 0x640)
    //     0x6f01c8: ldr             x2, [x2, #0x758]
    //     0x6f01cc: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f01d0: ldur            x1, [fp, #-8]
    // 0x6f01d4: ArrayStore: r1[9] = r0  ; List_4
    //     0x6f01d4: add             x25, x1, #0x33
    //     0x6f01d8: str             w0, [x25]
    //     0x6f01dc: tbz             w0, #0, #0x6f01f8
    //     0x6f01e0: ldurb           w16, [x1, #-1]
    //     0x6f01e4: ldurb           w17, [x0, #-1]
    //     0x6f01e8: and             x16, x17, x16, lsr #2
    //     0x6f01ec: tst             x16, HEAP, lsr #32
    //     0x6f01f0: b.eq            #0x6f01f8
    //     0x6f01f4: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x6f01f8: ldur            x1, [fp, #-8]
    // 0x6f01fc: r17 = "environment"
    //     0x6f01fc: add             x17, PP, #0xa, lsl #12  ; [pp+0xa760] "environment"
    //     0x6f0200: ldr             x17, [x17, #0x760]
    // 0x6f0204: StoreField: r1->field_37 = r17
    //     0x6f0204: stur            w17, [x1, #0x37]
    // 0x6f0208: r0 = call 0x37c8e8
    //     0x6f0208: bl              #0x37c8e8
    // 0x6f020c: ldur            x1, [fp, #-8]
    // 0x6f0210: ArrayStore: r1[11] = r0  ; List_4
    //     0x6f0210: add             x25, x1, #0x3b
    //     0x6f0214: str             w0, [x25]
    //     0x6f0218: tbz             w0, #0, #0x6f0234
    //     0x6f021c: ldurb           w16, [x1, #-1]
    //     0x6f0220: ldurb           w17, [x0, #-1]
    //     0x6f0224: and             x16, x17, x16, lsr #2
    //     0x6f0228: tst             x16, HEAP, lsr #32
    //     0x6f022c: b.eq            #0x6f0234
    //     0x6f0230: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x6f0234: ldur            x1, [fp, #-8]
    // 0x6f0238: r17 = "executable"
    //     0x6f0238: add             x17, PP, #0xa, lsl #12  ; [pp+0xa768] "executable"
    //     0x6f023c: ldr             x17, [x17, #0x768]
    // 0x6f0240: StoreField: r1->field_3f = r17
    //     0x6f0240: stur            w17, [x1, #0x3f]
    // 0x6f0244: r0 = InitLateStaticField(0x678) // [dart:io] _Platform::executable
    //     0x6f0244: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f0248: ldr             x0, [x0, #0xcf0]
    //     0x6f024c: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f0250: cmp             w0, w16
    //     0x6f0254: b.ne            #0x6f0264
    //     0x6f0258: add             x2, PP, #0xa, lsl #12  ; [pp+0xa770] Field <_Platform@14069316.executable>: static late (offset: 0x678)
    //     0x6f025c: ldr             x2, [x2, #0x770]
    //     0x6f0260: bl              #0x74b164  ; InitLateStaticFieldStub
    // 0x6f0264: ldur            x1, [fp, #-8]
    // 0x6f0268: ArrayStore: r1[13] = r0  ; List_4
    //     0x6f0268: add             x25, x1, #0x43
    //     0x6f026c: str             w0, [x25]
    //     0x6f0270: tbz             w0, #0, #0x6f028c
    //     0x6f0274: ldurb           w16, [x1, #-1]
    //     0x6f0278: ldurb           w17, [x0, #-1]
    //     0x6f027c: and             x16, x17, x16, lsr #2
    //     0x6f0280: tst             x16, HEAP, lsr #32
    //     0x6f0284: b.eq            #0x6f028c
    //     0x6f0288: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x6f028c: ldur            x1, [fp, #-8]
    // 0x6f0290: r17 = "resolvedExecutable"
    //     0x6f0290: add             x17, PP, #0xa, lsl #12  ; [pp+0xa778] "resolvedExecutable"
    //     0x6f0294: ldr             x17, [x17, #0x778]
    // 0x6f0298: StoreField: r1->field_47 = r17
    //     0x6f0298: stur            w17, [x1, #0x47]
    // 0x6f029c: r0 = InitLateStaticField(0x67c) // [dart:io] _Platform::zKb
    //     0x6f029c: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f02a0: ldr             x0, [x0, #0xcf8]
    //     0x6f02a4: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f02a8: cmp             w0, w16
    //     0x6f02ac: b.ne            #0x6f02bc
    //     0x6f02b0: add             x2, PP, #0xa, lsl #12  ; [pp+0xa780] Field <_Platform@14069316.zKb>: static late (offset: 0x67c)
    //     0x6f02b4: ldr             x2, [x2, #0x780]
    //     0x6f02b8: bl              #0x74b164  ; InitLateStaticFieldStub
    // 0x6f02bc: ldur            x1, [fp, #-8]
    // 0x6f02c0: ArrayStore: r1[15] = r0  ; List_4
    //     0x6f02c0: add             x25, x1, #0x4b
    //     0x6f02c4: str             w0, [x25]
    //     0x6f02c8: tbz             w0, #0, #0x6f02e4
    //     0x6f02cc: ldurb           w16, [x1, #-1]
    //     0x6f02d0: ldurb           w17, [x0, #-1]
    //     0x6f02d4: and             x16, x17, x16, lsr #2
    //     0x6f02d8: tst             x16, HEAP, lsr #32
    //     0x6f02dc: b.eq            #0x6f02e4
    //     0x6f02e0: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x6f02e4: ldur            x1, [fp, #-8]
    // 0x6f02e8: r17 = "script"
    //     0x6f02e8: add             x17, PP, #0xa, lsl #12  ; [pp+0xa788] "script"
    //     0x6f02ec: ldr             x17, [x17, #0x788]
    // 0x6f02f0: StoreField: r1->field_4f = r17
    //     0x6f02f0: stur            w17, [x1, #0x4f]
    // 0x6f02f4: r0 = call 0x37c8b0
    //     0x6f02f4: bl              #0x37c8b0
    // 0x6f02f8: r1 = LoadClassIdInstr(r0)
    //     0x6f02f8: ldur            x1, [x0, #-1]
    //     0x6f02fc: ubfx            x1, x1, #0xc, #0x14
    // 0x6f0300: str             x0, [SP]
    // 0x6f0304: mov             x0, x1
    // 0x6f0308: r4 = const [0, 0x1, 0x1, 0x1, null]
    //     0x6f0308: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    // 0x6f030c: r0 = GDT[cid_x0 + 0x364a]()
    //     0x6f030c: mov             x17, #0x364a
    //     0x6f0310: add             lr, x0, x17
    //     0x6f0314: ldr             lr, [x21, lr, lsl #3]
    //     0x6f0318: blr             lr
    // 0x6f031c: ldur            x1, [fp, #-8]
    // 0x6f0320: ArrayStore: r1[17] = r0  ; List_4
    //     0x6f0320: add             x25, x1, #0x53
    //     0x6f0324: str             w0, [x25]
    //     0x6f0328: tbz             w0, #0, #0x6f0344
    //     0x6f032c: ldurb           w16, [x1, #-1]
    //     0x6f0330: ldurb           w17, [x0, #-1]
    //     0x6f0334: and             x16, x17, x16, lsr #2
    //     0x6f0338: tst             x16, HEAP, lsr #32
    //     0x6f033c: b.eq            #0x6f0344
    //     0x6f0340: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x6f0344: ldur            x1, [fp, #-8]
    // 0x6f0348: r17 = "executableArguments"
    //     0x6f0348: add             x17, PP, #0xa, lsl #12  ; [pp+0xa790] "executableArguments"
    //     0x6f034c: ldr             x17, [x17, #0x790]
    // 0x6f0350: StoreField: r1->field_57 = r17
    //     0x6f0350: stur            w17, [x1, #0x57]
    // 0x6f0354: r0 = _aMb()
    //     0x6f0354: bl              #0x6f0a94  ; [dart:io] _Platform::_aMb
    // 0x6f0358: ldur            x1, [fp, #-8]
    // 0x6f035c: ArrayStore: r1[19] = r0  ; List_4
    //     0x6f035c: add             x25, x1, #0x5b
    //     0x6f0360: str             w0, [x25]
    //     0x6f0364: tbz             w0, #0, #0x6f0380
    //     0x6f0368: ldurb           w16, [x1, #-1]
    //     0x6f036c: ldurb           w17, [x0, #-1]
    //     0x6f0370: and             x16, x17, x16, lsr #2
    //     0x6f0374: tst             x16, HEAP, lsr #32
    //     0x6f0378: b.eq            #0x6f0380
    //     0x6f037c: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x6f0380: ldur            x1, [fp, #-8]
    // 0x6f0384: r17 = "packageConfig"
    //     0x6f0384: add             x17, PP, #0xa, lsl #12  ; [pp+0xa798] "packageConfig"
    //     0x6f0388: ldr             x17, [x17, #0x798]
    // 0x6f038c: StoreField: r1->field_5f = r17
    //     0x6f038c: stur            w17, [x1, #0x5f]
    // 0x6f0390: r0 = InitLateStaticField(0x680) // [dart:io] _Platform::tob
    //     0x6f0390: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f0394: ldr             x0, [x0, #0xd00]
    //     0x6f0398: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f039c: cmp             w0, w16
    //     0x6f03a0: b.ne            #0x6f03b0
    //     0x6f03a4: add             x2, PP, #0xa, lsl #12  ; [pp+0xa7a0] Field <_Platform@14069316.tob>: static late (offset: 0x680)
    //     0x6f03a8: ldr             x2, [x2, #0x7a0]
    //     0x6f03ac: bl              #0x74b164  ; InitLateStaticFieldStub
    // 0x6f03b0: ldur            x1, [fp, #-8]
    // 0x6f03b4: StoreField: r1->field_63 = rNULL
    //     0x6f03b4: stur            NULL, [x1, #0x63]
    // 0x6f03b8: r17 = "version"
    //     0x6f03b8: ldr             x17, [PP, #0x70b0]  ; [pp+0x70b0] "version"
    // 0x6f03bc: StoreField: r1->field_67 = r17
    //     0x6f03bc: stur            w17, [x1, #0x67]
    // 0x6f03c0: r0 = InitLateStaticField(0x644) // [dart:io] fq::GEb
    //     0x6f03c0: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f03c4: ldr             x0, [x0, #0xc88]
    //     0x6f03c8: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f03cc: cmp             w0, w16
    //     0x6f03d0: b.ne            #0x6f03e0
    //     0x6f03d4: add             x2, PP, #0xa, lsl #12  ; [pp+0xa7a8] Field <fq.GEb>: static late final (offset: 0x644)
    //     0x6f03d8: ldr             x2, [x2, #0x7a8]
    //     0x6f03dc: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f03e0: ldur            x1, [fp, #-8]
    // 0x6f03e4: ArrayStore: r1[23] = r0  ; List_4
    //     0x6f03e4: add             x25, x1, #0x6b
    //     0x6f03e8: str             w0, [x25]
    //     0x6f03ec: tbz             w0, #0, #0x6f0408
    //     0x6f03f0: ldurb           w16, [x1, #-1]
    //     0x6f03f4: ldurb           w17, [x0, #-1]
    //     0x6f03f8: and             x16, x17, x16, lsr #2
    //     0x6f03fc: tst             x16, HEAP, lsr #32
    //     0x6f0400: b.eq            #0x6f0408
    //     0x6f0404: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x6f0408: ldur            x1, [fp, #-8]
    // 0x6f040c: r17 = "stdinSupportsAnsi"
    //     0x6f040c: add             x17, PP, #0xa, lsl #12  ; [pp+0xa7b0] "stdinSupportsAnsi"
    //     0x6f0410: ldr             x17, [x17, #0x7b0]
    // 0x6f0414: StoreField: r1->field_6f = r17
    //     0x6f0414: stur            w17, [x1, #0x6f]
    // 0x6f0418: ldr             x16, [fp, #0x10]
    // 0x6f041c: str             x16, [SP]
    // 0x6f0420: r0 = call 0x379338
    //     0x6f0420: bl              #0x379338
    // 0x6f0424: ldur            x1, [fp, #-8]
    // 0x6f0428: StoreField: r1->field_73 = r0
    //     0x6f0428: stur            w0, [x1, #0x73]
    // 0x6f042c: r17 = "stdoutSupportsAnsi"
    //     0x6f042c: add             x17, PP, #0xa, lsl #12  ; [pp+0xa7b8] "stdoutSupportsAnsi"
    //     0x6f0430: ldr             x17, [x17, #0x7b8]
    // 0x6f0434: StoreField: r1->field_77 = r17
    //     0x6f0434: stur            w17, [x1, #0x77]
    // 0x6f0438: ldr             x16, [fp, #0x10]
    // 0x6f043c: str             x16, [SP]
    // 0x6f0440: r0 = call 0x378ec8
    //     0x6f0440: bl              #0x378ec8
    // 0x6f0444: ldur            x1, [fp, #-8]
    // 0x6f0448: StoreField: r1->field_7b = r0
    //     0x6f0448: stur            w0, [x1, #0x7b]
    // 0x6f044c: r17 = "localeName"
    //     0x6f044c: add             x17, PP, #0xa, lsl #12  ; [pp+0xa7c0] "localeName"
    //     0x6f0450: ldr             x17, [x17, #0x7c0]
    // 0x6f0454: StoreField: r1->field_7f = r17
    //     0x6f0454: stur            w17, [x1, #0x7f]
    // 0x6f0458: r0 = call 0x378e74
    //     0x6f0458: bl              #0x378e74
    // 0x6f045c: ldur            x1, [fp, #-8]
    // 0x6f0460: ArrayStore: r1[29] = r0  ; List_4
    //     0x6f0460: add             x25, x1, #0x83
    //     0x6f0464: str             w0, [x25]
    //     0x6f0468: tbz             w0, #0, #0x6f0484
    //     0x6f046c: ldurb           w16, [x1, #-1]
    //     0x6f0470: ldurb           w17, [x0, #-1]
    //     0x6f0474: and             x16, x17, x16, lsr #2
    //     0x6f0478: tst             x16, HEAP, lsr #32
    //     0x6f047c: b.eq            #0x6f0484
    //     0x6f0480: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x6f0484: r16 = <String, dynamic>
    //     0x6f0484: ldr             x16, [PP, #0xc68]  ; [pp+0xc68] TypeArguments: <String, dynamic>
    // 0x6f0488: ldur            lr, [fp, #-8]
    // 0x6f048c: stp             lr, x16, [SP]
    // 0x6f0490: r0 = Map._fromLiteral()
    //     0x6f0490: bl              #0x2002cc  ; [dart:core] Map::Map._fromLiteral
    // 0x6f0494: r16 = Instance_pf
    //     0x6f0494: add             x16, PP, #0xa, lsl #12  ; [pp+0xa7c8] Obj!pf@434ab1
    //     0x6f0498: ldr             x16, [x16, #0x7c8]
    // 0x6f049c: stp             x0, x16, [SP]
    // 0x6f04a0: r0 = call 0x584728
    //     0x6f04a0: bl              #0x584728
    // 0x6f04a4: LeaveFrame
    //     0x6f04a4: mov             SP, fp
    //     0x6f04a8: ldp             fp, lr, [SP], #0x10
    // 0x6f04ac: ret
    //     0x6f04ac: ret             
    // 0x6f04b0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6f04b0: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6f04b4: b               #0x6f00bc
  }
}
