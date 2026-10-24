// lib: , url: LLh

// class id: 1049342, size: 0x8
class :: {
}

// class id: 508, size: 0x18, field offset: 0x8
class eKa extends Object {

  static late final eKa current; // offset: 0xf5c

  [closure] (File?, CFa)? <anonymous closure>(dynamic, (File, File)) {
    // ** addr: 0x6ea4e8, size: 0x194
    // 0x6ea4e8: EnterFrame
    //     0x6ea4e8: stp             fp, lr, [SP, #-0x10]!
    //     0x6ea4ec: mov             fp, SP
    // 0x6ea4f0: AllocStack(0x80)
    //     0x6ea4f0: sub             SP, SP, #0x80
    // 0x6ea4f4: CheckStackOverflow
    //     0x6ea4f4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6ea4f8: cmp             SP, x16
    //     0x6ea4fc: b.ls            #0x6ea674
    // 0x6ea500: ldr             x0, [fp, #0x10]
    // 0x6ea504: LoadField: r1 = r0->field_f
    //     0x6ea504: ldur            w1, [x0, #0xf]
    // 0x6ea508: DecompressPointer r1
    //     0x6ea508: add             x1, x1, HEAP, lsl #32
    // 0x6ea50c: stur            x1, [fp, #-0x68]
    // 0x6ea510: LoadField: r2 = r0->field_13
    //     0x6ea510: ldur            w2, [x0, #0x13]
    // 0x6ea514: DecompressPointer r2
    //     0x6ea514: add             x2, x2, HEAP, lsl #32
    // 0x6ea518: stur            x2, [fp, #-0x60]
    // 0x6ea51c: str             x2, [SP]
    // 0x6ea520: r0 = call 0x61a920
    //     0x6ea520: bl              #0x61a920
    // 0x6ea524: tbz             w0, #4, #0x6ea538
    // 0x6ea528: r0 = Null
    //     0x6ea528: mov             x0, NULL
    // 0x6ea52c: LeaveFrame
    //     0x6ea52c: mov             SP, fp
    //     0x6ea530: ldp             fp, lr, [SP], #0x10
    // 0x6ea534: ret
    //     0x6ea534: ret             
    // 0x6ea538: ldur            x16, [fp, #-0x60]
    // 0x6ea53c: str             x16, [SP]
    // 0x6ea540: r0 = call 0x368f04
    //     0x6ea540: bl              #0x368f04
    // 0x6ea544: stur            x0, [fp, #-0x60]
    // 0x6ea548: stp             NULL, x0, [SP]
    // 0x6ea54c: r0 = call 0x21ac14
    //     0x6ea54c: bl              #0x21ac14
    // 0x6ea550: mov             x3, x0
    // 0x6ea554: r2 = Null
    //     0x6ea554: mov             x2, NULL
    // 0x6ea558: r1 = Null
    //     0x6ea558: mov             x1, NULL
    // 0x6ea55c: stur            x3, [fp, #-0x60]
    // 0x6ea560: r8 = Map
    //     0x6ea560: ldr             x8, [PP, #0xd00]  ; [pp+0xd00] Type: Map
    // 0x6ea564: r3 = Null
    //     0x6ea564: add             x3, PP, #0x2d, lsl #12  ; [pp+0x2de90] Null
    //     0x6ea568: ldr             x3, [x3, #0xe90]
    // 0x6ea56c: r0 = Map()
    //     0x6ea56c: bl              #0x759274  ; IsType_Map_Stub
    // 0x6ea570: ldur            x0, [fp, #-0x60]
    // 0x6ea574: r1 = LoadClassIdInstr(r0)
    //     0x6ea574: ldur            x1, [x0, #-1]
    //     0x6ea578: ubfx            x1, x1, #0xc, #0x14
    // 0x6ea57c: r16 = <String, Object?>
    //     0x6ea57c: ldr             x16, [PP, #0xb20]  ; [pp+0xb20] TypeArguments: <String, Object?>
    // 0x6ea580: stp             x0, x16, [SP]
    // 0x6ea584: mov             x0, x1
    // 0x6ea588: r4 = const [0x2, 0x1, 0x1, 0x1, null]
    //     0x6ea588: ldr             x4, [PP, #0x39e0]  ; [pp+0x39e0] List(5) [0x2, 0x1, 0x1, 0x1, Null]
    // 0x6ea58c: r0 = GDT[cid_x0 + 0x6ae]()
    //     0x6ea58c: add             lr, x0, #0x6ae
    //     0x6ea590: ldr             lr, [x21, lr, lsl #3]
    //     0x6ea594: blr             lr
    // 0x6ea598: stur            x0, [fp, #-0x60]
    // 0x6ea59c: str             x0, [SP]
    // 0x6ea5a0: r0 = call 0x367708
    //     0x6ea5a0: bl              #0x367708
    // 0x6ea5a4: stur            x0, [fp, #-0x60]
    // 0x6ea5a8: ldur            x16, [fp, #-0x68]
    // 0x6ea5ac: str             x16, [SP]
    // 0x6ea5b0: r0 = call 0x61a920
    //     0x6ea5b0: bl              #0x61a920
    // 0x6ea5b4: tbnz            w0, #4, #0x6ea5dc
    // 0x6ea5b8: ldur            x16, [fp, #-0x68]
    // 0x6ea5bc: str             x16, [SP]
    // 0x6ea5c0: r0 = call 0x3675b8
    //     0x6ea5c0: bl              #0x3675b8
    // 0x6ea5c4: cbnz            x0, #0x6ea5d0
    // 0x6ea5c8: r1 = false
    //     0x6ea5c8: add             x1, NULL, #0x30  ; false
    // 0x6ea5cc: b               #0x6ea5d4
    // 0x6ea5d0: r1 = true
    //     0x6ea5d0: add             x1, NULL, #0x20  ; true
    // 0x6ea5d4: mov             x0, x1
    // 0x6ea5d8: b               #0x6ea5e0
    // 0x6ea5dc: r0 = false
    //     0x6ea5dc: add             x0, NULL, #0x30  ; false
    // 0x6ea5e0: stur            x0, [fp, #-0x70]
    // 0x6ea5e4: tbz             w0, #4, #0x6ea62c
    // 0x6ea5e8: ldur            x3, [fp, #-0x60]
    // 0x6ea5ec: r1 = <BFa>
    //     0x6ea5ec: add             x1, PP, #0x17, lsl #12  ; [pp+0x17c68] TypeArguments: <BFa>
    //     0x6ea5f0: ldr             x1, [x1, #0xc68]
    // 0x6ea5f4: r0 = Fza()
    //     0x6ea5f4: bl              #0x6ea67c  ; AllocateFzaStub -> Fza<X0> (size=0x14)
    // 0x6ea5f8: mov             x1, x0
    // 0x6ea5fc: ldur            x0, [fp, #-0x60]
    // 0x6ea600: LoadField: r2 = r0->field_f
    //     0x6ea600: ldur            w2, [x0, #0xf]
    // 0x6ea604: DecompressPointer r2
    //     0x6ea604: add             x2, x2, HEAP, lsl #32
    // 0x6ea608: StoreField: r1->field_f = r2
    //     0x6ea608: stur            w2, [x1, #0xf]
    // 0x6ea60c: StoreField: r1->field_b = r2
    //     0x6ea60c: stur            w2, [x1, #0xb]
    // 0x6ea610: LoadField: r1 = r2->field_b
    //     0x6ea610: ldur            w1, [x2, #0xb]
    // 0x6ea614: DecompressPointer r1
    //     0x6ea614: add             x1, x1, HEAP, lsl #32
    // 0x6ea618: cbz             w1, #0x6ea630
    // 0x6ea61c: r0 = Null
    //     0x6ea61c: mov             x0, NULL
    // 0x6ea620: LeaveFrame
    //     0x6ea620: mov             SP, fp
    //     0x6ea624: ldp             fp, lr, [SP], #0x10
    // 0x6ea628: ret
    //     0x6ea628: ret             
    // 0x6ea62c: ldur            x0, [fp, #-0x60]
    // 0x6ea630: ldur            x1, [fp, #-0x70]
    // 0x6ea634: tbnz            w1, #4, #0x6ea640
    // 0x6ea638: ldur            x1, [fp, #-0x68]
    // 0x6ea63c: b               #0x6ea644
    // 0x6ea640: r1 = Null
    //     0x6ea640: mov             x1, NULL
    // 0x6ea644: mov             x2, x1
    // 0x6ea648: mov             x3, x0
    // 0x6ea64c: stur            x1, [fp, #-0x68]
    // 0x6ea650: r0 = AllocateRecord2()
    //     0x6ea650: bl              #0x74bc00  ; AllocateRecord2Stub
    // 0x6ea654: LeaveFrame
    //     0x6ea654: mov             SP, fp
    //     0x6ea658: ldp             fp, lr, [SP], #0x10
    // 0x6ea65c: ret
    //     0x6ea65c: ret             
    // 0x6ea660: sub             SP, fp, #0x80
    // 0x6ea664: r0 = Null
    //     0x6ea664: mov             x0, NULL
    // 0x6ea668: LeaveFrame
    //     0x6ea668: mov             SP, fp
    //     0x6ea66c: ldp             fp, lr, [SP], #0x10
    // 0x6ea670: ret
    //     0x6ea670: ret             
    // 0x6ea674: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6ea674: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6ea678: b               #0x6ea500
  }
  [closure] Future<(File?, CFa)> <anonymous closure>(dynamic) {
    // ** addr: 0x374904, size: -0x1
  }
  [closure] Future<(File?, CFa)> <anonymous closure>(dynamic) {
    // ** addr: 0x374844, size: -0x1
  }
  [closure] Future<Y0> <anonymous closure>(dynamic) {
    // ** addr: 0x36e7c4, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x36a120, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x36a1d0, size: -0x1
  }
  [closure] Future<(File?, CFa)> <anonymous closure>(dynamic) {
    // ** addr: 0x36e844, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, File) {
    // ** addr: 0x3747f4, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, (File, CFa)) {
    // ** addr: 0x373b6c, size: -0x1
  }
}
