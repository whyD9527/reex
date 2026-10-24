// lib: , url: ILh

// class id: 1049339, size: 0x8
class :: {

  static late final ZPa<(File?, CFa)?, String> qDf; // offset: 0xf58

  [closure] static Future<(File?, CFa)?> <anonymous closure>(dynamic, SPa<(File?, CFa)?>, String) async {
    // ** addr: 0x71733c, size: 0x110
    // 0x71733c: EnterFrame
    //     0x71733c: stp             fp, lr, [SP, #-0x10]!
    //     0x717340: mov             fp, SP
    // 0x717344: AllocStack(0x88)
    //     0x717344: sub             SP, SP, #0x88
    // 0x717348: SetupParameters(dynamic _ /* r1, fp-0x68 */, dynamic _ /* r2, fp-0x60 */, dynamic _ /* r3, fp-0x58 */)
    //     0x717348: stur            NULL, [fp, #-8]
    //     0x71734c: mov             x0, #0
    //     0x717350: add             x1, fp, w0, sxtw #2
    //     0x717354: ldr             x1, [x1, #0x20]
    //     0x717358: stur            x1, [fp, #-0x68]
    //     0x71735c: add             x2, fp, w0, sxtw #2
    //     0x717360: ldr             x2, [x2, #0x18]
    //     0x717364: stur            x2, [fp, #-0x60]
    //     0x717368: add             x3, fp, w0, sxtw #2
    //     0x71736c: ldr             x3, [x3, #0x10]
    //     0x717370: stur            x3, [fp, #-0x58]
    //     0x717374: ldur            w4, [x1, #0x17]
    //     0x717378: add             x4, x4, HEAP, lsl #32
    //     0x71737c: stur            x4, [fp, #-0x50]
    // 0x717380: CheckStackOverflow
    //     0x717380: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x717384: cmp             SP, x16
    //     0x717388: b.ls            #0x717444
    // 0x71738c: InitAsync() -> Future<(File?, CFa)?>
    //     0x71738c: add             x0, PP, #0x2d, lsl #12  ; [pp+0x2dd00] TypeArguments: <(File?, CFa)?>
    //     0x717390: ldr             x0, [x0, #0xd00]
    //     0x717394: bl              #0x6cb614  ; InitAsyncStub
    // 0x717398: r1 = 1
    //     0x717398: mov             x1, #1
    // 0x71739c: r0 = AllocateContext()
    //     0x71739c: bl              #0x74be90  ; AllocateContextStub
    // 0x7173a0: mov             x3, x0
    // 0x7173a4: ldur            x0, [fp, #-0x50]
    // 0x7173a8: stur            x3, [fp, #-0x68]
    // 0x7173ac: StoreField: r3->field_b = r0
    //     0x7173ac: stur            w0, [x3, #0xb]
    // 0x7173b0: r0 = false
    //     0x7173b0: add             x0, NULL, #0x30  ; false
    // 0x7173b4: StoreField: r3->field_f = r0
    //     0x7173b4: stur            w0, [x3, #0xf]
    // 0x7173b8: mov             x2, x3
    // 0x7173bc: r1 = Function '<anonymous closure>': static.
    //     0x7173bc: add             x1, PP, #0x2e, lsl #12  ; [pp+0x2e400] AnonymousClosure: static (0x459928), in [ILh] ::qDf (0x4591c8)
    //     0x7173c0: ldr             x1, [x1, #0x400]
    // 0x7173c4: r0 = AllocateClosure()
    //     0x7173c4: bl              #0x74bfa8  ; AllocateClosureStub
    // 0x7173c8: ldur            x16, [fp, #-0x60]
    // 0x7173cc: stp             x0, x16, [SP]
    // 0x7173d0: r0 = call 0x4597b4
    //     0x7173d0: bl              #0x4597b4
    // 0x7173d4: r0 = InitLateStaticField(0xf5c) // [LLh] eKa::current
    //     0x7173d4: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x7173d8: ldr             x0, [x0, #0x1eb8]
    //     0x7173dc: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x7173e0: cmp             w0, w16
    //     0x7173e4: b.ne            #0x7173f4
    //     0x7173e8: add             x2, PP, #0x2d, lsl #12  ; [pp+0x2dcf0] Field <eKa.current>: static late final (offset: 0xf5c)
    //     0x7173ec: ldr             x2, [x2, #0xcf0]
    //     0x7173f0: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x7173f4: ldur            x2, [fp, #-0x68]
    // 0x7173f8: r1 = Function '<anonymous closure>': static.
    //     0x7173f8: add             x1, PP, #0x2e, lsl #12  ; [pp+0x2e408] AnonymousClosure: static (0x71744c), in [ILh] ::qDf (0x4591c8)
    //     0x7173fc: ldr             x1, [x1, #0x408]
    // 0x717400: stur            x0, [fp, #-0x50]
    // 0x717404: r0 = AllocateClosure()
    //     0x717404: bl              #0x74bfa8  ; AllocateClosureStub
    // 0x717408: r16 = <(File?, CFa)?>
    //     0x717408: add             x16, PP, #0x2d, lsl #12  ; [pp+0x2dd00] TypeArguments: <(File?, CFa)?>
    //     0x71740c: ldr             x16, [x16, #0xd00]
    // 0x717410: ldur            lr, [fp, #-0x50]
    // 0x717414: stp             lr, x16, [SP, #0x10]
    // 0x717418: ldur            x16, [fp, #-0x58]
    // 0x71741c: stp             x0, x16, [SP]
    // 0x717420: r4 = const [0x1, 0x3, 0x3, 0x3, null]
    //     0x717420: ldr             x4, [PP, #0x3f8]  ; [pp+0x3f8] List(5) [0x1, 0x3, 0x3, 0x3, Null]
    // 0x717424: r0 = __unknown_function__()
    //     0x717424: bl              #0x6e9470  ; [] ::__unknown_function__
    // 0x717428: mov             x1, x0
    // 0x71742c: stur            x1, [fp, #-0x50]
    // 0x717430: r0 = Await()
    //     0x717430: bl              #0x6cdaec  ; AwaitStub
    // 0x717434: r0 = ReturnAsync()
    //     0x717434: b               #0x6ca270  ; ReturnAsyncStub
    // 0x717438: sub             SP, fp, #0x88
    // 0x71743c: r0 = Null
    //     0x71743c: mov             x0, NULL
    // 0x717440: r0 = ReturnAsyncNotFuture()
    //     0x717440: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x717444: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x717444: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x717448: b               #0x71738c
  }
  [closure] static Future<(File?, CFa)?> <anonymous closure>(dynamic, (dynamic) => Future<(File?, CFa)>) async {
    // ** addr: 0x71744c, size: 0x88
    // 0x71744c: EnterFrame
    //     0x71744c: stp             fp, lr, [SP, #-0x10]!
    //     0x717450: mov             fp, SP
    // 0x717454: AllocStack(0x20)
    //     0x717454: sub             SP, SP, #0x20
    // 0x717458: SetupParameters(dynamic _ /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0x717458: stur            NULL, [fp, #-8]
    //     0x71745c: mov             x0, #0
    //     0x717460: add             x1, fp, w0, sxtw #2
    //     0x717464: ldr             x1, [x1, #0x18]
    //     0x717468: add             x2, fp, w0, sxtw #2
    //     0x71746c: ldr             x2, [x2, #0x10]
    //     0x717470: stur            x2, [fp, #-0x18]
    //     0x717474: ldur            w3, [x1, #0x17]
    //     0x717478: add             x3, x3, HEAP, lsl #32
    //     0x71747c: stur            x3, [fp, #-0x10]
    // 0x717480: CheckStackOverflow
    //     0x717480: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x717484: cmp             SP, x16
    //     0x717488: b.ls            #0x7174cc
    // 0x71748c: InitAsync() -> Future<(File?, CFa)?>
    //     0x71748c: add             x0, PP, #0x2d, lsl #12  ; [pp+0x2dd00] TypeArguments: <(File?, CFa)?>
    //     0x717490: ldr             x0, [x0, #0xd00]
    //     0x717494: bl              #0x6cb614  ; InitAsyncStub
    // 0x717498: ldur            x0, [fp, #-0x10]
    // 0x71749c: LoadField: r1 = r0->field_f
    //     0x71749c: ldur            w1, [x0, #0xf]
    // 0x7174a0: DecompressPointer r1
    //     0x7174a0: add             x1, x1, HEAP, lsl #32
    // 0x7174a4: tbnz            w1, #4, #0x7174b0
    // 0x7174a8: r0 = Null
    //     0x7174a8: mov             x0, NULL
    // 0x7174ac: r0 = ReturnAsyncNotFuture()
    //     0x7174ac: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x7174b0: ldur            x16, [fp, #-0x18]
    // 0x7174b4: str             x16, [SP]
    // 0x7174b8: ldur            x0, [fp, #-0x18]
    // 0x7174bc: ClosureCall
    //     0x7174bc: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    //     0x7174c0: ldur            x2, [x0, #0x1f]
    //     0x7174c4: blr             x2
    // 0x7174c8: r0 = ReturnAsync()
    //     0x7174c8: b               #0x6ca270  ; ReturnAsyncStub
    // 0x7174cc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7174cc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7174d0: b               #0x71748c
  }
  [closure] static void <anonymous closure>(dynamic) {
    // ** addr: 0x459928, size: -0x1
  }
  static ZPa<(File?, CFa)?, String> qDf() {
    // ** addr: 0x4591c8, size: -0x1
  }
}
