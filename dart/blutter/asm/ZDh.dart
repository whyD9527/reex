// lib: , url: ZDh

// class id: 1048961, size: 0x8
class :: {
}

// class id: 1437, size: 0x18, field offset: 0x8
class gaa extends haa {

  [closure] static void <anonymous closure>(dynamic, dynamic) {
    // ** addr: 0x757060, size: 0x22c
    // 0x757060: EnterFrame
    //     0x757060: stp             fp, lr, [SP, #-0x10]!
    //     0x757064: mov             fp, SP
    // 0x757068: AllocStack(0x70)
    //     0x757068: sub             SP, SP, #0x70
    // 0x75706c: SetupParameters([dynamic _ /* r0 */])
    //     0x75706c: ldr             x0, [fp, #0x18]
    //     0x757070: ldur            w3, [x0, #0x17]
    //     0x757074: add             x3, x3, HEAP, lsl #32
    //     0x757078: stur            x3, [fp, #-0x48]
    // 0x75707c: CheckStackOverflow
    //     0x75707c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x757080: cmp             SP, x16
    //     0x757084: b.ls            #0x757280
    // 0x757088: ldr             x4, [fp, #0x10]
    // 0x75708c: mov             x0, x4
    // 0x757090: r2 = Null
    //     0x757090: mov             x2, NULL
    // 0x757094: r1 = Null
    //     0x757094: mov             x1, NULL
    // 0x757098: r4 = 59
    //     0x757098: mov             x4, #0x3b
    // 0x75709c: branchIfSmi(r0, 0x7570a8)
    //     0x75709c: tbz             w0, #0, #0x7570a8
    // 0x7570a0: r4 = LoadClassIdInstr(r0)
    //     0x7570a0: ldur            x4, [x0, #-1]
    //     0x7570a4: ubfx            x4, x4, #0xc, #0x14
    // 0x7570a8: sub             x4, x4, #0x59
    // 0x7570ac: cmp             x4, #2
    // 0x7570b0: b.ls            #0x7570c0
    // 0x7570b4: r8 = List
    //     0x7570b4: ldr             x8, [PP, #0xc00]  ; [pp+0xc00] Type: List
    // 0x7570b8: r3 = Null
    //     0x7570b8: ldr             x3, [PP, #0x7160]  ; [pp+0x7160] Null
    // 0x7570bc: r0 = List()
    //     0x7570bc: bl              #0x7592dc  ; IsType_List_Stub
    // 0x7570c0: ldr             x1, [fp, #0x10]
    // 0x7570c4: r0 = LoadClassIdInstr(r1)
    //     0x7570c4: ldur            x0, [x1, #-1]
    //     0x7570c8: ubfx            x0, x0, #0xc, #0x14
    // 0x7570cc: stp             xzr, x1, [SP]
    // 0x7570d0: r0 = GDT[cid_x0 + -0xe76]()
    //     0x7570d0: sub             lr, x0, #0xe76
    //     0x7570d4: ldr             lr, [x21, lr, lsl #3]
    //     0x7570d8: blr             lr
    // 0x7570dc: mov             x3, x0
    // 0x7570e0: r2 = Null
    //     0x7570e0: mov             x2, NULL
    // 0x7570e4: r1 = Null
    //     0x7570e4: mov             x1, NULL
    // 0x7570e8: stur            x3, [fp, #-0x50]
    // 0x7570ec: branchIfSmi(r0, 0x757110)
    //     0x7570ec: tbz             w0, #0, #0x757110
    // 0x7570f0: r4 = LoadClassIdInstr(r0)
    //     0x7570f0: ldur            x4, [x0, #-1]
    //     0x7570f4: ubfx            x4, x4, #0xc, #0x14
    // 0x7570f8: sub             x4, x4, #0x3b
    // 0x7570fc: cmp             x4, #1
    // 0x757100: b.ls            #0x757110
    // 0x757104: r8 = int
    //     0x757104: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x757108: r3 = Null
    //     0x757108: ldr             x3, [PP, #0x7170]  ; [pp+0x7170] Null
    // 0x75710c: r0 = int()
    //     0x75710c: bl              #0x7586bc  ; IsType_int_Stub
    // 0x757110: ldr             x0, [fp, #0x10]
    // 0x757114: r1 = LoadClassIdInstr(r0)
    //     0x757114: ldur            x1, [x0, #-1]
    //     0x757118: ubfx            x1, x1, #0xc, #0x14
    // 0x75711c: r16 = 2
    //     0x75711c: mov             x16, #2
    // 0x757120: stp             x16, x0, [SP]
    // 0x757124: mov             x0, x1
    // 0x757128: r0 = GDT[cid_x0 + -0xe76]()
    //     0x757128: sub             lr, x0, #0xe76
    //     0x75712c: ldr             lr, [x21, lr, lsl #3]
    //     0x757130: blr             lr
    // 0x757134: mov             x3, x0
    // 0x757138: r2 = Null
    //     0x757138: mov             x2, NULL
    // 0x75713c: r1 = Null
    //     0x75713c: mov             x1, NULL
    // 0x757140: stur            x3, [fp, #-0x58]
    // 0x757144: r4 = 59
    //     0x757144: mov             x4, #0x3b
    // 0x757148: branchIfSmi(r0, 0x757154)
    //     0x757148: tbz             w0, #0, #0x757154
    // 0x75714c: r4 = LoadClassIdInstr(r0)
    //     0x75714c: ldur            x4, [x0, #-1]
    //     0x757150: ubfx            x4, x4, #0xc, #0x14
    // 0x757154: sub             x4, x4, #0x75
    // 0x757158: cmp             x4, #3
    // 0x75715c: b.ls            #0x75716c
    // 0x757160: r8 = Uint8List
    //     0x757160: ldr             x8, [PP, #0x6bc8]  ; [pp+0x6bc8] Type: Uint8List
    // 0x757164: r3 = Null
    //     0x757164: ldr             x3, [PP, #0x7180]  ; [pp+0x7180] Null
    // 0x757168: r0 = Uint8List()
    //     0x757168: bl              #0x6ccc60  ; IsType_Uint8List_Stub
    // 0x75716c: ldur            x16, [fp, #-0x58]
    // 0x757170: stp             x16, NULL, [SP]
    // 0x757174: r4 = const [0, 0x2, 0x2, 0x2, null]
    //     0x757174: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    // 0x757178: r0 = call 0x3a749c
    //     0x757178: bl              #0x3a749c
    // 0x75717c: mov             x1, x0
    // 0x757180: ldur            x0, [fp, #-0x48]
    // 0x757184: stur            x1, [fp, #-0x58]
    // 0x757188: LoadField: r2 = r0->field_f
    //     0x757188: ldur            w2, [x0, #0xf]
    // 0x75718c: DecompressPointer r2
    //     0x75718c: add             x2, x2, HEAP, lsl #32
    // 0x757190: LoadField: r0 = r2->field_b
    //     0x757190: ldur            w0, [x2, #0xb]
    // 0x757194: DecompressPointer r0
    //     0x757194: add             x0, x0, HEAP, lsl #32
    // 0x757198: ldur            x16, [fp, #-0x50]
    // 0x75719c: stp             x16, x0, [SP]
    // 0x7571a0: r0 = call 0x604bf0
    //     0x7571a0: bl              #0x604bf0
    // 0x7571a4: cmp             w0, NULL
    // 0x7571a8: b.eq            #0x757288
    // 0x7571ac: r1 = LoadClassIdInstr(r0)
    //     0x7571ac: ldur            x1, [x0, #-1]
    //     0x7571b0: ubfx            x1, x1, #0xc, #0x14
    // 0x7571b4: ldur            x16, [fp, #-0x58]
    // 0x7571b8: stp             x16, x0, [SP]
    // 0x7571bc: mov             x0, x1
    // 0x7571c0: r4 = const [0, 0x2, 0x2, 0x2, null]
    //     0x7571c0: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    // 0x7571c4: r0 = GDT[cid_x0 + -0x1000]()
    //     0x7571c4: sub             lr, x0, #1, lsl #12
    //     0x7571c8: ldr             lr, [x21, lr, lsl #3]
    //     0x7571cc: blr             lr
    // 0x7571d0: b               #0x757270
    // 0x7571d4: r3 = 2
    //     0x7571d4: mov             x3, #2
    // 0x7571d8: sub             SP, fp, #0x70
    // 0x7571dc: mov             x2, x3
    // 0x7571e0: mov             x4, x0
    // 0x7571e4: stur            x0, [fp, #-0x48]
    // 0x7571e8: mov             x0, x1
    // 0x7571ec: stur            x1, [fp, #-0x50]
    // 0x7571f0: r1 = Null
    //     0x7571f0: mov             x1, NULL
    // 0x7571f4: r0 = AllocateArray()
    //     0x7571f4: bl              #0x74cc68  ; AllocateArrayStub
    // 0x7571f8: stur            x0, [fp, #-0x58]
    // 0x7571fc: r17 = "during a platform message response callback"
    //     0x7571fc: ldr             x17, [PP, #0x3f68]  ; [pp+0x3f68] "during a platform message response callback"
    // 0x757200: StoreField: r0->field_f = r17
    //     0x757200: stur            w17, [x0, #0xf]
    // 0x757204: r1 = <Object>
    //     0x757204: ldr             x1, [PP, #0x118]  ; [pp+0x118] TypeArguments: <Object>
    // 0x757208: r0 = AllocateGrowableArray()
    //     0x757208: bl              #0x74be54  ; AllocateGrowableArrayStub
    // 0x75720c: mov             x2, x0
    // 0x757210: ldur            x0, [fp, #-0x58]
    // 0x757214: stur            x2, [fp, #-0x60]
    // 0x757218: StoreField: r2->field_f = r0
    //     0x757218: stur            w0, [x2, #0xf]
    // 0x75721c: r0 = 2
    //     0x75721c: mov             x0, #2
    // 0x757220: StoreField: r2->field_b = r0
    //     0x757220: stur            w0, [x2, #0xb]
    // 0x757224: r1 = <List<Object>>
    //     0x757224: ldr             x1, [PP, #0x22c8]  ; [pp+0x22c8] TypeArguments: <List<Object>>
    // 0x757228: r0 = DB()
    //     0x757228: bl              #0x6cf5e0  ; AllocateDBStub -> DB (size=0x14)
    // 0x75722c: mov             x1, x0
    // 0x757230: r0 = true
    //     0x757230: add             x0, NULL, #0x20  ; true
    // 0x757234: StoreField: r1->field_f = r0
    //     0x757234: stur            w0, [x1, #0xf]
    // 0x757238: ldur            x0, [fp, #-0x60]
    // 0x75723c: StoreField: r1->field_b = r0
    //     0x75723c: stur            w0, [x1, #0xb]
    // 0x757240: r0 = HB()
    //     0x757240: bl              #0x6cf5d4  ; AllocateHBStub -> HB (size=0x18)
    // 0x757244: mov             x1, x0
    // 0x757248: ldur            x0, [fp, #-0x48]
    // 0x75724c: StoreField: r1->field_7 = r0
    //     0x75724c: stur            w0, [x1, #7]
    // 0x757250: ldur            x0, [fp, #-0x50]
    // 0x757254: StoreField: r1->field_b = r0
    //     0x757254: stur            w0, [x1, #0xb]
    // 0x757258: r0 = "services library"
    //     0x757258: ldr             x0, [PP, #0x3f70]  ; [pp+0x3f70] "services library"
    // 0x75725c: StoreField: r1->field_f = r0
    //     0x75725c: stur            w0, [x1, #0xf]
    // 0x757260: r0 = false
    //     0x757260: add             x0, NULL, #0x30  ; false
    // 0x757264: StoreField: r1->field_13 = r0
    //     0x757264: stur            w0, [x1, #0x13]
    // 0x757268: str             x1, [SP]
    // 0x75726c: r0 = call 0x220f10
    //     0x75726c: bl              #0x220f10
    // 0x757270: r0 = Null
    //     0x757270: mov             x0, NULL
    // 0x757274: LeaveFrame
    //     0x757274: mov             SP, fp
    //     0x757278: ldp             fp, lr, [SP], #0x10
    // 0x75727c: ret
    //     0x75727c: ret             
    // 0x757280: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x757280: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x757284: b               #0x757088
    // 0x757288: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x757288: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
  }
}
