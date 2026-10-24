// lib: , url: KLh

// class id: 1049341, size: 0x8
class :: {

  [closure] static YHa <anonymous closure>(dynamic, vEa) {
    // ** addr: 0x44d734, size: -0x1
  }
}

// class id: 509, size: 0x8, field offset: 0x8
class dKa extends Object {

  static late final dKa current; // offset: 0xf60

  [closure] Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0x70ac7c, size: 0x15c
    // 0x70ac7c: EnterFrame
    //     0x70ac7c: stp             fp, lr, [SP, #-0x10]!
    //     0x70ac80: mov             fp, SP
    // 0x70ac84: AllocStack(0x40)
    //     0x70ac84: sub             SP, SP, #0x40
    // 0x70ac88: SetupParameters(dKa this /* r1 */)
    //     0x70ac88: stur            NULL, [fp, #-8]
    //     0x70ac8c: mov             x0, #0
    //     0x70ac90: add             x1, fp, w0, sxtw #2
    //     0x70ac94: ldr             x1, [x1, #0x10]
    //     0x70ac98: ldur            w2, [x1, #0x17]
    //     0x70ac9c: add             x2, x2, HEAP, lsl #32
    //     0x70aca0: stur            x2, [fp, #-0x10]
    // 0x70aca4: CheckStackOverflow
    //     0x70aca4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x70aca8: cmp             SP, x16
    //     0x70acac: b.ls            #0x70adc8
    // 0x70acb0: InitAsync() -> Future<Null?>
    //     0x70acb0: ldr             x0, [PP, #0xe28]  ; [pp+0xe28] TypeArguments: <Null?>
    //     0x70acb4: bl              #0x6cb614  ; InitAsyncStub
    // 0x70acb8: r0 = InitLateStaticField(0xec4) // [gKh] nv::current
    //     0x70acb8: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x70acbc: ldr             x0, [x0, #0x1d88]
    //     0x70acc0: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x70acc4: cmp             w0, w16
    //     0x70acc8: b.ne            #0x70acd8
    //     0x70accc: add             x2, PP, #0xf, lsl #12  ; [pp+0xfc10] Field <nv.current>: static late final (offset: 0xec4)
    //     0x70acd0: ldr             x2, [x2, #0xc10]
    //     0x70acd4: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x70acd8: mov             x1, x0
    // 0x70acdc: stur            x0, [fp, #-0x18]
    // 0x70ace0: LoadField: r0 = r1->field_1b
    //     0x70ace0: ldur            w0, [x1, #0x1b]
    // 0x70ace4: DecompressPointer r0
    //     0x70ace4: add             x0, x0, HEAP, lsl #32
    // 0x70ace8: r16 = Sentinel
    //     0x70ace8: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0x70acec: cmp             w0, w16
    // 0x70acf0: b.ne            #0x70ad00
    // 0x70acf4: r2 = gpf
    //     0x70acf4: add             x2, PP, #0x10, lsl #12  ; [pp+0x101f8] Field <_bEa@747047974.gpf>: late final (offset: 0x1c)
    //     0x70acf8: ldr             x2, [x2, #0x1f8]
    // 0x70acfc: r0 = InitLateFinalInstanceField()
    //     0x70acfc: bl              #0x74afb8  ; InitLateFinalInstanceFieldStub
    // 0x70ad00: r16 = <uEa, vEa>
    //     0x70ad00: add             x16, PP, #0x10, lsl #12  ; [pp+0x10200] TypeArguments: <uEa, vEa>
    //     0x70ad04: ldr             x16, [x16, #0x200]
    // 0x70ad08: ldur            lr, [fp, #-0x18]
    // 0x70ad0c: stp             lr, x16, [SP, #8]
    // 0x70ad10: str             x0, [SP]
    // 0x70ad14: r4 = const [0x2, 0x2, 0x2, 0x2, null]
    //     0x70ad14: ldr             x4, [PP, #0x1ba8]  ; [pp+0x1ba8] List(5) [0x2, 0x2, 0x2, 0x2, Null]
    // 0x70ad18: r0 = call 0x3832fc
    //     0x70ad18: bl              #0x3832fc
    // 0x70ad1c: mov             x2, x0
    // 0x70ad20: ldur            x1, [fp, #-0x10]
    // 0x70ad24: stur            x2, [fp, #-0x18]
    // 0x70ad28: LoadField: r0 = r1->field_f
    //     0x70ad28: ldur            w0, [x1, #0xf]
    // 0x70ad2c: DecompressPointer r0
    //     0x70ad2c: add             x0, x0, HEAP, lsl #32
    // 0x70ad30: r3 = LoadClassIdInstr(r0)
    //     0x70ad30: ldur            x3, [x0, #-1]
    //     0x70ad34: ubfx            x3, x3, #0xc, #0x14
    // 0x70ad38: str             x0, [SP]
    // 0x70ad3c: mov             x0, x3
    // 0x70ad40: r0 = GDT[cid_x0 + 0xa0a8]()
    //     0x70ad40: mov             x17, #0xa0a8
    //     0x70ad44: add             lr, x0, x17
    //     0x70ad48: ldr             lr, [x21, lr, lsl #3]
    //     0x70ad4c: blr             lr
    // 0x70ad50: mov             x1, x0
    // 0x70ad54: stur            x1, [fp, #-0x20]
    // 0x70ad58: CheckStackOverflow
    //     0x70ad58: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x70ad5c: cmp             SP, x16
    //     0x70ad60: b.ls            #0x70add0
    // 0x70ad64: r0 = LoadClassIdInstr(r1)
    //     0x70ad64: ldur            x0, [x1, #-1]
    //     0x70ad68: ubfx            x0, x0, #0xc, #0x14
    // 0x70ad6c: str             x1, [SP]
    // 0x70ad70: r0 = GDT[cid_x0 + 0x3a9]()
    //     0x70ad70: add             lr, x0, #0x3a9
    //     0x70ad74: ldr             lr, [x21, lr, lsl #3]
    //     0x70ad78: blr             lr
    // 0x70ad7c: tbnz            w0, #4, #0x70adc0
    // 0x70ad80: ldur            x1, [fp, #-0x20]
    // 0x70ad84: r0 = LoadClassIdInstr(r1)
    //     0x70ad84: ldur            x0, [x1, #-1]
    //     0x70ad88: ubfx            x0, x0, #0xc, #0x14
    // 0x70ad8c: str             x1, [SP]
    // 0x70ad90: r0 = GDT[cid_x0 + 0x44d]()
    //     0x70ad90: add             lr, x0, #0x44d
    //     0x70ad94: ldr             lr, [x21, lr, lsl #3]
    //     0x70ad98: blr             lr
    // 0x70ad9c: ldur            x16, [fp, #-0x18]
    // 0x70ada0: stp             x0, x16, [SP]
    // 0x70ada4: r4 = const [0, 0x2, 0x2, 0x2, null]
    //     0x70ada4: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    // 0x70ada8: r0 = __unknown_function__()
    //     0x70ada8: bl              #0x6f75f8  ; [] ::__unknown_function__
    // 0x70adac: mov             x1, x0
    // 0x70adb0: stur            x1, [fp, #-0x28]
    // 0x70adb4: r0 = Await()
    //     0x70adb4: bl              #0x6cdaec  ; AwaitStub
    // 0x70adb8: ldur            x1, [fp, #-0x20]
    // 0x70adbc: b               #0x70ad58
    // 0x70adc0: r0 = Null
    //     0x70adc0: mov             x0, NULL
    // 0x70adc4: r0 = ReturnAsyncNotFuture()
    //     0x70adc4: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x70adc8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x70adc8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x70adcc: b               #0x70acb0
    // 0x70add0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x70add0: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x70add4: b               #0x70ad64
  }
  [closure] Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0x71e13c, size: 0x160
    // 0x71e13c: EnterFrame
    //     0x71e13c: stp             fp, lr, [SP, #-0x10]!
    //     0x71e140: mov             fp, SP
    // 0x71e144: AllocStack(0x38)
    //     0x71e144: sub             SP, SP, #0x38
    // 0x71e148: SetupParameters(dKa this /* r1 */)
    //     0x71e148: stur            NULL, [fp, #-8]
    //     0x71e14c: mov             x0, #0
    //     0x71e150: add             x1, fp, w0, sxtw #2
    //     0x71e154: ldr             x1, [x1, #0x10]
    //     0x71e158: ldur            w2, [x1, #0x17]
    //     0x71e15c: add             x2, x2, HEAP, lsl #32
    //     0x71e160: stur            x2, [fp, #-0x10]
    // 0x71e164: CheckStackOverflow
    //     0x71e164: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x71e168: cmp             SP, x16
    //     0x71e16c: b.ls            #0x71e294
    // 0x71e170: InitAsync() -> Future<Null?>
    //     0x71e170: ldr             x0, [PP, #0xe28]  ; [pp+0xe28] TypeArguments: <Null?>
    //     0x71e174: bl              #0x6cb614  ; InitAsyncStub
    // 0x71e178: r0 = InitLateStaticField(0xec4) // [gKh] nv::current
    //     0x71e178: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x71e17c: ldr             x0, [x0, #0x1d88]
    //     0x71e180: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x71e184: cmp             w0, w16
    //     0x71e188: b.ne            #0x71e198
    //     0x71e18c: add             x2, PP, #0xf, lsl #12  ; [pp+0xfc10] Field <nv.current>: static late final (offset: 0xec4)
    //     0x71e190: ldr             x2, [x2, #0xc10]
    //     0x71e194: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x71e198: mov             x1, x0
    // 0x71e19c: stur            x0, [fp, #-0x18]
    // 0x71e1a0: ArrayLoad: r0 = r1[0]  ; List_4
    //     0x71e1a0: ldur            w0, [x1, #0x17]
    // 0x71e1a4: DecompressPointer r0
    //     0x71e1a4: add             x0, x0, HEAP, lsl #32
    // 0x71e1a8: r16 = Sentinel
    //     0x71e1a8: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0x71e1ac: cmp             w0, w16
    // 0x71e1b0: b.ne            #0x71e1c0
    // 0x71e1b4: r2 = fpf
    //     0x71e1b4: add             x2, PP, #0x10, lsl #12  ; [pp+0x101e0] Field <_bEa@747047974.fpf>: late final (offset: 0x18)
    //     0x71e1b8: ldr             x2, [x2, #0x1e0]
    // 0x71e1bc: r0 = InitLateFinalInstanceField()
    //     0x71e1bc: bl              #0x74afb8  ; InitLateFinalInstanceFieldStub
    // 0x71e1c0: r16 = <qEa, rEa>
    //     0x71e1c0: add             x16, PP, #0x10, lsl #12  ; [pp+0x101e8] TypeArguments: <qEa, rEa>
    //     0x71e1c4: ldr             x16, [x16, #0x1e8]
    // 0x71e1c8: ldur            lr, [fp, #-0x18]
    // 0x71e1cc: stp             lr, x16, [SP, #8]
    // 0x71e1d0: str             x0, [SP]
    // 0x71e1d4: r4 = const [0x2, 0x2, 0x2, 0x2, null]
    //     0x71e1d4: ldr             x4, [PP, #0x1ba8]  ; [pp+0x1ba8] List(5) [0x2, 0x2, 0x2, 0x2, Null]
    // 0x71e1d8: r0 = call 0x44c72c
    //     0x71e1d8: bl              #0x44c72c
    // 0x71e1dc: ldur            x2, [fp, #-0x10]
    // 0x71e1e0: r1 = Function '<anonymous closure>':.
    //     0x71e1e0: add             x1, PP, #0x10, lsl #12  ; [pp+0x101f0] AnonymousClosure: (0x44d980), in [KLh] dKa::<anonymous closure> (0x71e13c)
    //     0x71e1e4: ldr             x1, [x1, #0x1f0]
    // 0x71e1e8: stur            x0, [fp, #-0x20]
    // 0x71e1ec: r0 = AllocateClosure()
    //     0x71e1ec: bl              #0x74bfa8  ; AllocateClosureStub
    // 0x71e1f0: ldur            x16, [fp, #-0x20]
    // 0x71e1f4: stp             x0, x16, [SP]
    // 0x71e1f8: r0 = call 0x3780bc
    //     0x71e1f8: bl              #0x3780bc
    // 0x71e1fc: ldur            x1, [fp, #-0x18]
    // 0x71e200: LoadField: r0 = r1->field_1b
    //     0x71e200: ldur            w0, [x1, #0x1b]
    // 0x71e204: DecompressPointer r0
    //     0x71e204: add             x0, x0, HEAP, lsl #32
    // 0x71e208: r16 = Sentinel
    //     0x71e208: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0x71e20c: cmp             w0, w16
    // 0x71e210: b.ne            #0x71e220
    // 0x71e214: r2 = gpf
    //     0x71e214: add             x2, PP, #0x10, lsl #12  ; [pp+0x101f8] Field <_bEa@747047974.gpf>: late final (offset: 0x1c)
    //     0x71e218: ldr             x2, [x2, #0x1f8]
    // 0x71e21c: r0 = InitLateFinalInstanceField()
    //     0x71e21c: bl              #0x74afb8  ; InitLateFinalInstanceFieldStub
    // 0x71e220: r16 = <uEa, vEa>
    //     0x71e220: add             x16, PP, #0x10, lsl #12  ; [pp+0x10200] TypeArguments: <uEa, vEa>
    //     0x71e224: ldr             x16, [x16, #0x200]
    // 0x71e228: ldur            lr, [fp, #-0x18]
    // 0x71e22c: stp             lr, x16, [SP, #8]
    // 0x71e230: str             x0, [SP]
    // 0x71e234: r4 = const [0x2, 0x2, 0x2, 0x2, null]
    //     0x71e234: ldr             x4, [PP, #0x1ba8]  ; [pp+0x1ba8] List(5) [0x2, 0x2, 0x2, 0x2, Null]
    // 0x71e238: r0 = call 0x44c72c
    //     0x71e238: bl              #0x44c72c
    // 0x71e23c: ldur            x2, [fp, #-0x10]
    // 0x71e240: r1 = Function '<anonymous closure>':.
    //     0x71e240: add             x1, PP, #0x10, lsl #12  ; [pp+0x10208] AnonymousClosure: (0x386494), in [KLh] dKa::<anonymous closure> (0x71e13c)
    //     0x71e244: ldr             x1, [x1, #0x208]
    // 0x71e248: stur            x0, [fp, #-0x18]
    // 0x71e24c: r0 = AllocateClosure()
    //     0x71e24c: bl              #0x74bfa8  ; AllocateClosureStub
    // 0x71e250: ldur            x16, [fp, #-0x18]
    // 0x71e254: stp             x0, x16, [SP]
    // 0x71e258: r0 = call 0x3780bc
    //     0x71e258: bl              #0x3780bc
    // 0x71e25c: ldur            x16, [fp, #-0x20]
    // 0x71e260: str             x16, [SP]
    // 0x71e264: r0 = __unknown_function__()
    //     0x71e264: bl              #0x7134c4  ; [] ::__unknown_function__
    // 0x71e268: mov             x1, x0
    // 0x71e26c: stur            x1, [fp, #-0x20]
    // 0x71e270: r0 = Await()
    //     0x71e270: bl              #0x6cdaec  ; AwaitStub
    // 0x71e274: ldur            x16, [fp, #-0x18]
    // 0x71e278: str             x16, [SP]
    // 0x71e27c: r0 = __unknown_function__()
    //     0x71e27c: bl              #0x7134c4  ; [] ::__unknown_function__
    // 0x71e280: mov             x1, x0
    // 0x71e284: stur            x1, [fp, #-0x18]
    // 0x71e288: r0 = Await()
    //     0x71e288: bl              #0x6cdaec  ; AwaitStub
    // 0x71e28c: r0 = Null
    //     0x71e28c: mov             x0, NULL
    // 0x71e290: r0 = ReturnAsyncNotFuture()
    //     0x71e290: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x71e294: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x71e294: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x71e298: b               #0x71e170
  }
  [closure] Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0x71e468, size: 0x1d8
    // 0x71e468: EnterFrame
    //     0x71e468: stp             fp, lr, [SP, #-0x10]!
    //     0x71e46c: mov             fp, SP
    // 0x71e470: AllocStack(0x60)
    //     0x71e470: sub             SP, SP, #0x60
    // 0x71e474: SetupParameters(dKa this /* r1 */)
    //     0x71e474: stur            NULL, [fp, #-8]
    //     0x71e478: mov             x0, #0
    //     0x71e47c: add             x1, fp, w0, sxtw #2
    //     0x71e480: ldr             x1, [x1, #0x10]
    //     0x71e484: ldur            w2, [x1, #0x17]
    //     0x71e488: add             x2, x2, HEAP, lsl #32
    //     0x71e48c: stur            x2, [fp, #-0x10]
    // 0x71e490: CheckStackOverflow
    //     0x71e490: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x71e494: cmp             SP, x16
    //     0x71e498: b.ls            #0x71e62c
    // 0x71e49c: InitAsync() -> Future<Null?>
    //     0x71e49c: ldr             x0, [PP, #0xe28]  ; [pp+0xe28] TypeArguments: <Null?>
    //     0x71e4a0: bl              #0x6cb614  ; InitAsyncStub
    // 0x71e4a4: r0 = InitLateStaticField(0xec4) // [gKh] nv::current
    //     0x71e4a4: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x71e4a8: ldr             x0, [x0, #0x1d88]
    //     0x71e4ac: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x71e4b0: cmp             w0, w16
    //     0x71e4b4: b.ne            #0x71e4c4
    //     0x71e4b8: add             x2, PP, #0xf, lsl #12  ; [pp+0xfc10] Field <nv.current>: static late final (offset: 0xec4)
    //     0x71e4bc: ldr             x2, [x2, #0xc10]
    //     0x71e4c0: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x71e4c4: mov             x1, x0
    // 0x71e4c8: stur            x0, [fp, #-0x18]
    // 0x71e4cc: ArrayLoad: r0 = r1[0]  ; List_4
    //     0x71e4cc: ldur            w0, [x1, #0x17]
    // 0x71e4d0: DecompressPointer r0
    //     0x71e4d0: add             x0, x0, HEAP, lsl #32
    // 0x71e4d4: r16 = Sentinel
    //     0x71e4d4: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0x71e4d8: cmp             w0, w16
    // 0x71e4dc: b.ne            #0x71e4ec
    // 0x71e4e0: r2 = fpf
    //     0x71e4e0: add             x2, PP, #0x10, lsl #12  ; [pp+0x101e0] Field <_bEa@747047974.fpf>: late final (offset: 0x18)
    //     0x71e4e4: ldr             x2, [x2, #0x1e0]
    // 0x71e4e8: r0 = InitLateFinalInstanceField()
    //     0x71e4e8: bl              #0x74afb8  ; InitLateFinalInstanceFieldStub
    // 0x71e4ec: r16 = <qEa, rEa>
    //     0x71e4ec: add             x16, PP, #0x10, lsl #12  ; [pp+0x101e8] TypeArguments: <qEa, rEa>
    //     0x71e4f0: ldr             x16, [x16, #0x1e8]
    // 0x71e4f4: ldur            lr, [fp, #-0x18]
    // 0x71e4f8: stp             lr, x16, [SP, #8]
    // 0x71e4fc: str             x0, [SP]
    // 0x71e500: r4 = const [0x2, 0x2, 0x2, 0x2, null]
    //     0x71e500: ldr             x4, [PP, #0x1ba8]  ; [pp+0x1ba8] List(5) [0x2, 0x2, 0x2, 0x2, Null]
    // 0x71e504: r0 = call 0x3832fc
    //     0x71e504: bl              #0x3832fc
    // 0x71e508: mov             x4, x0
    // 0x71e50c: ldur            x3, [fp, #-0x10]
    // 0x71e510: stur            x4, [fp, #-0x40]
    // 0x71e514: LoadField: r0 = r3->field_f
    //     0x71e514: ldur            w0, [x3, #0xf]
    // 0x71e518: DecompressPointer r0
    //     0x71e518: add             x0, x0, HEAP, lsl #32
    // 0x71e51c: stur            x0, [fp, #-0x18]
    // 0x71e520: LoadField: r5 = r0->field_7
    //     0x71e520: ldur            w5, [x0, #7]
    // 0x71e524: DecompressPointer r5
    //     0x71e524: add             x5, x5, HEAP, lsl #32
    // 0x71e528: stur            x5, [fp, #-0x38]
    // 0x71e52c: LoadField: r1 = r0->field_b
    //     0x71e52c: ldur            w1, [x0, #0xb]
    // 0x71e530: DecompressPointer r1
    //     0x71e530: add             x1, x1, HEAP, lsl #32
    // 0x71e534: r6 = LoadInt32Instr(r1)
    //     0x71e534: sbfx            x6, x1, #1, #0x1f
    // 0x71e538: stur            x6, [fp, #-0x30]
    // 0x71e53c: r2 = 0
    //     0x71e53c: mov             x2, #0
    // 0x71e540: CheckStackOverflow
    //     0x71e540: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x71e544: cmp             SP, x16
    //     0x71e548: b.ls            #0x71e634
    // 0x71e54c: LoadField: r1 = r0->field_b
    //     0x71e54c: ldur            w1, [x0, #0xb]
    // 0x71e550: DecompressPointer r1
    //     0x71e550: add             x1, x1, HEAP, lsl #32
    // 0x71e554: r7 = LoadInt32Instr(r1)
    //     0x71e554: sbfx            x7, x1, #1, #0x1f
    // 0x71e558: cmp             x6, x7
    // 0x71e55c: b.ne            #0x71e618
    // 0x71e560: mov             x8, x0
    // 0x71e564: cmp             x2, x7
    // 0x71e568: b.lt            #0x71e574
    // 0x71e56c: r0 = Null
    //     0x71e56c: mov             x0, NULL
    // 0x71e570: r0 = ReturnAsyncNotFuture()
    //     0x71e570: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x71e574: mov             x0, x7
    // 0x71e578: mov             x1, x2
    // 0x71e57c: cmp             x1, x0
    // 0x71e580: b.hs            #0x71e63c
    // 0x71e584: LoadField: r0 = r8->field_f
    //     0x71e584: ldur            w0, [x8, #0xf]
    // 0x71e588: DecompressPointer r0
    //     0x71e588: add             x0, x0, HEAP, lsl #32
    // 0x71e58c: ArrayLoad: r7 = r0[r2]  ; Unknown_4
    //     0x71e58c: add             x16, x0, x2, lsl #2
    //     0x71e590: ldur            w7, [x16, #0xf]
    // 0x71e594: DecompressPointer r7
    //     0x71e594: add             x7, x7, HEAP, lsl #32
    // 0x71e598: stur            x7, [fp, #-0x28]
    // 0x71e59c: add             x9, x2, #1
    // 0x71e5a0: stur            x9, [fp, #-0x20]
    // 0x71e5a4: cmp             w7, NULL
    // 0x71e5a8: b.ne            #0x71e5dc
    // 0x71e5ac: mov             x0, x7
    // 0x71e5b0: mov             x2, x5
    // 0x71e5b4: r1 = Null
    //     0x71e5b4: mov             x1, NULL
    // 0x71e5b8: cmp             w2, NULL
    // 0x71e5bc: b.eq            #0x71e5dc
    // 0x71e5c0: ArrayLoad: r4 = r2[0]  ; List_4
    //     0x71e5c0: ldur            w4, [x2, #0x17]
    // 0x71e5c4: DecompressPointer r4
    //     0x71e5c4: add             x4, x4, HEAP, lsl #32
    // 0x71e5c8: r8 = X0
    //     0x71e5c8: ldr             x8, [PP, #0x158]  ; [pp+0x158] TypeParameter: X0
    // 0x71e5cc: LoadField: r9 = r4->field_7
    //     0x71e5cc: ldur            x9, [x4, #7]
    // 0x71e5d0: r3 = Null
    //     0x71e5d0: add             x3, PP, #0x10, lsl #12  ; [pp+0x10940] Null
    //     0x71e5d4: ldr             x3, [x3, #0x940]
    // 0x71e5d8: blr             x9
    // 0x71e5dc: ldur            x16, [fp, #-0x40]
    // 0x71e5e0: ldur            lr, [fp, #-0x28]
    // 0x71e5e4: stp             lr, x16, [SP]
    // 0x71e5e8: r4 = const [0, 0x2, 0x2, 0x2, null]
    //     0x71e5e8: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    // 0x71e5ec: r0 = __unknown_function__()
    //     0x71e5ec: bl              #0x6f75f8  ; [] ::__unknown_function__
    // 0x71e5f0: mov             x1, x0
    // 0x71e5f4: stur            x1, [fp, #-0x48]
    // 0x71e5f8: r0 = Await()
    //     0x71e5f8: bl              #0x6cdaec  ; AwaitStub
    // 0x71e5fc: ldur            x2, [fp, #-0x20]
    // 0x71e600: ldur            x3, [fp, #-0x10]
    // 0x71e604: ldur            x4, [fp, #-0x40]
    // 0x71e608: ldur            x0, [fp, #-0x18]
    // 0x71e60c: ldur            x5, [fp, #-0x38]
    // 0x71e610: ldur            x6, [fp, #-0x30]
    // 0x71e614: b               #0x71e540
    // 0x71e618: r0 = Ha()
    //     0x71e618: bl              #0x6c91fc  ; AllocateHaStub -> Ha (size=0x10)
    // 0x71e61c: ldur            x8, [fp, #-0x18]
    // 0x71e620: StoreField: r0->field_b = r8
    //     0x71e620: stur            w8, [x0, #0xb]
    // 0x71e624: r0 = Throw()
    //     0x71e624: bl              #0x74b258  ; ThrowStub
    // 0x71e628: brk             #0
    // 0x71e62c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x71e62c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x71e630: b               #0x71e49c
    // 0x71e634: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x71e634: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x71e638: b               #0x71e54c
    // 0x71e63c: r0 = RangeErrorSharedWithoutFPURegs()
    //     0x71e63c: bl              #0x74d1ac  ; RangeErrorSharedWithoutFPURegsStub
  }
  [closure] pv<bool> <anonymous closure>(dynamic, qEa) {
    // ** addr: 0x44d980, size: -0x1
  }
  [closure] pv<bool> <anonymous closure>(dynamic, uEa) {
    // ** addr: 0x386494, size: -0x1
  }
  [closure] pv<bool> <anonymous closure>(dynamic, uEa) {
    // ** addr: 0x44c7a0, size: -0x1
  }
}
