// lib: , url: Dxh

// class id: 1048664, size: 0x8
class :: {
}

// class id: 3914, size: 0x1c, field offset: 0x8
abstract class _cw extends vv {

  [closure] Future<int> <anonymous closure>(dynamic) {
    // ** addr: 0x6178d8, size: -0x1
  }
  [closure] Future<Y0> <anonymous closure>(dynamic) {
    // ** addr: 0x5f3b0c, size: -0x1
  }
  [closure] Future<int> <anonymous closure>(dynamic) {
    // ** addr: 0x5f3c10, size: -0x1
  }
  [closure] Future<hw> <anonymous closure>(dynamic) {
    // ** addr: 0x5fad38, size: -0x1
  }
  [closure] Future<void> <anonymous closure>(dynamic) {
    // ** addr: 0x61c828, size: -0x1
  }
}

// class id: 3915, size: 0x20, field offset: 0x1c
class _gw extends _cw {
}

// class id: 3916, size: 0x20, field offset: 0x1c
abstract class _dw extends _cw
    implements Tv {
}

// class id: 3917, size: 0x38, field offset: 0x20
class _fw extends _dw {

  late Vv bOe; // offset: 0x20
}

// class id: 3918, size: 0x3c, field offset: 0x20
class _ew extends _dw {

  [closure] Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0x73a474, size: 0x120
    // 0x73a474: EnterFrame
    //     0x73a474: stp             fp, lr, [SP, #-0x10]!
    //     0x73a478: mov             fp, SP
    // 0x73a47c: AllocStack(0x70)
    //     0x73a47c: sub             SP, SP, #0x70
    // 0x73a480: SetupParameters(_ew this /* r1, fp-0x58 */)
    //     0x73a480: stur            NULL, [fp, #-8]
    //     0x73a484: mov             x0, #0
    //     0x73a488: add             x1, fp, w0, sxtw #2
    //     0x73a48c: ldr             x1, [x1, #0x10]
    //     0x73a490: stur            x1, [fp, #-0x58]
    //     0x73a494: ldur            w2, [x1, #0x17]
    //     0x73a498: add             x2, x2, HEAP, lsl #32
    //     0x73a49c: stur            x2, [fp, #-0x50]
    // 0x73a4a0: CheckStackOverflow
    //     0x73a4a0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x73a4a4: cmp             SP, x16
    //     0x73a4a8: b.ls            #0x73a584
    // 0x73a4ac: InitAsync() -> Future<Null?>
    //     0x73a4ac: ldr             x0, [PP, #0xe28]  ; [pp+0xe28] TypeArguments: <Null?>
    //     0x73a4b0: bl              #0x6cb614  ; InitAsyncStub
    // 0x73a4b4: ldur            x0, [fp, #-0x50]
    // 0x73a4b8: LoadField: r1 = r0->field_f
    //     0x73a4b8: ldur            w1, [x0, #0xf]
    // 0x73a4bc: DecompressPointer r1
    //     0x73a4bc: add             x1, x1, HEAP, lsl #32
    // 0x73a4c0: LoadField: r2 = r1->field_2f
    //     0x73a4c0: ldur            w2, [x1, #0x2f]
    // 0x73a4c4: DecompressPointer r2
    //     0x73a4c4: add             x2, x2, HEAP, lsl #32
    // 0x73a4c8: stp             x2, x1, [SP]
    // 0x73a4cc: r4 = const [0, 0x2, 0x2, 0x2, null]
    //     0x73a4cc: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    // 0x73a4d0: r0 = call 0x61c768
    //     0x73a4d0: bl              #0x61c768
    // 0x73a4d4: mov             x1, x0
    // 0x73a4d8: stur            x1, [fp, #-0x58]
    // 0x73a4dc: r0 = Await()
    //     0x73a4dc: bl              #0x6cdaec  ; AwaitStub
    // 0x73a4e0: ldur            x0, [fp, #-0x50]
    // 0x73a4e4: LoadField: r1 = r0->field_f
    //     0x73a4e4: ldur            w1, [x0, #0xf]
    // 0x73a4e8: DecompressPointer r1
    //     0x73a4e8: add             x1, x1, HEAP, lsl #32
    // 0x73a4ec: LoadField: r2 = r1->field_23
    //     0x73a4ec: ldur            w2, [x1, #0x23]
    // 0x73a4f0: DecompressPointer r2
    //     0x73a4f0: add             x2, x2, HEAP, lsl #32
    // 0x73a4f4: cmp             w2, NULL
    // 0x73a4f8: b.eq            #0x73a58c
    // 0x73a4fc: r16 = true
    //     0x73a4fc: add             x16, NULL, #0x20  ; true
    // 0x73a500: stp             x16, x2, [SP]
    // 0x73a504: r4 = const [0, 0x2, 0x2, 0x2, null]
    //     0x73a504: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    // 0x73a508: r0 = call 0x61486c
    //     0x73a508: bl              #0x61486c
    // 0x73a50c: ldur            x1, [fp, #-0x50]
    // 0x73a510: b               #0x73a554
    // 0x73a514: sub             SP, fp, #0x70
    // 0x73a518: ldur            x2, [fp, #-0x20]
    // 0x73a51c: mov             x16, x1
    // 0x73a520: mov             x1, x0
    // 0x73a524: mov             x0, x16
    // 0x73a528: LoadField: r3 = r2->field_f
    //     0x73a528: ldur            w3, [x2, #0xf]
    // 0x73a52c: DecompressPointer r3
    //     0x73a52c: add             x3, x3, HEAP, lsl #32
    // 0x73a530: LoadField: r4 = r3->field_23
    //     0x73a530: ldur            w4, [x3, #0x23]
    // 0x73a534: DecompressPointer r4
    //     0x73a534: add             x4, x4, HEAP, lsl #32
    // 0x73a538: cmp             w4, NULL
    // 0x73a53c: b.eq            #0x73a590
    // 0x73a540: stp             x1, x4, [SP, #8]
    // 0x73a544: str             x0, [SP]
    // 0x73a548: r4 = const [0, 0x3, 0x3, 0x3, null]
    //     0x73a548: ldr             x4, [PP, #0x258]  ; [pp+0x258] List(5) [0, 0x3, 0x3, 0x3, Null]
    // 0x73a54c: r0 = call 0x211a5c
    //     0x73a54c: bl              #0x211a5c
    // 0x73a550: ldur            x1, [fp, #-0x20]
    // 0x73a554: stur            x1, [fp, #-0x58]
    // 0x73a558: LoadField: r0 = r1->field_f
    //     0x73a558: ldur            w0, [x1, #0xf]
    // 0x73a55c: DecompressPointer r0
    //     0x73a55c: add             x0, x0, HEAP, lsl #32
    // 0x73a560: LoadField: r2 = r0->field_27
    //     0x73a560: ldur            w2, [x0, #0x27]
    // 0x73a564: DecompressPointer r2
    //     0x73a564: add             x2, x2, HEAP, lsl #32
    // 0x73a568: LoadField: r3 = r2->field_b
    //     0x73a568: ldur            w3, [x2, #0xb]
    // 0x73a56c: DecompressPointer r3
    //     0x73a56c: add             x3, x3, HEAP, lsl #32
    // 0x73a570: mov             x0, x3
    // 0x73a574: stur            x3, [fp, #-0x50]
    // 0x73a578: r0 = Await()
    //     0x73a578: bl              #0x6cdaec  ; AwaitStub
    // 0x73a57c: r0 = Null
    //     0x73a57c: mov             x0, NULL
    // 0x73a580: r0 = ReturnAsyncNotFuture()
    //     0x73a580: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x73a584: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x73a584: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x73a588: b               #0x73a4ac
    // 0x73a58c: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x73a58c: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
    // 0x73a590: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x73a590: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] int <anonymous closure>(dynamic) {
    // ** addr: 0x622ab4, size: -0x1
  }
}

// class id: 3919, size: 0x30, field offset: 0x1c
abstract class kv extends _cw {

  [closure] Future<bool> <anonymous closure>(dynamic) async {
    // ** addr: 0x7381a4, size: 0x228
    // 0x7381a4: EnterFrame
    //     0x7381a4: stp             fp, lr, [SP, #-0x10]!
    //     0x7381a8: mov             fp, SP
    // 0x7381ac: AllocStack(0x90)
    //     0x7381ac: sub             SP, SP, #0x90
    // 0x7381b0: SetupParameters(kv this /* r1, fp-0x68 */)
    //     0x7381b0: stur            NULL, [fp, #-8]
    //     0x7381b4: mov             x0, #0
    //     0x7381b8: add             x1, fp, w0, sxtw #2
    //     0x7381bc: ldr             x1, [x1, #0x10]
    //     0x7381c0: stur            x1, [fp, #-0x68]
    //     0x7381c4: ldur            w2, [x1, #0x17]
    //     0x7381c8: add             x2, x2, HEAP, lsl #32
    //     0x7381cc: stur            x2, [fp, #-0x60]
    // 0x7381d0: CheckStackOverflow
    //     0x7381d0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x7381d4: cmp             SP, x16
    //     0x7381d8: b.ls            #0x7383c4
    // 0x7381dc: InitAsync() -> Future<bool>
    //     0x7381dc: ldr             x0, [PP, #0x31d8]  ; [pp+0x31d8] TypeArguments: <bool>
    //     0x7381e0: bl              #0x6cb614  ; InitAsyncStub
    // 0x7381e4: ldur            x0, [fp, #-0x60]
    // 0x7381e8: LoadField: r1 = r0->field_f
    //     0x7381e8: ldur            w1, [x0, #0xf]
    // 0x7381ec: DecompressPointer r1
    //     0x7381ec: add             x1, x1, HEAP, lsl #32
    // 0x7381f0: ArrayLoad: r2 = r1[0]  ; List_4
    //     0x7381f0: ldur            w2, [x1, #0x17]
    // 0x7381f4: DecompressPointer r2
    //     0x7381f4: add             x2, x2, HEAP, lsl #32
    // 0x7381f8: tbnz            w2, #4, #0x738224
    // 0x7381fc: r0 = StateError()
    //     0x7381fc: bl              #0x6c8a04  ; AllocateStateErrorStub -> StateError (size=0x10)
    // 0x738200: mov             x1, x0
    // 0x738204: r0 = "Can\'t re-open a database after closing it. Please create a new database connection and open that instead."
    //     0x738204: add             x0, PP, #0x19, lsl #12  ; [pp+0x19e08] "Can\'t re-open a database after closing it. Please create a new database connection and open that instead."
    //     0x738208: ldr             x0, [x0, #0xe08]
    // 0x73820c: StoreField: r1->field_b = r0
    //     0x73820c: stur            w0, [x1, #0xb]
    // 0x738210: r16 = <bool>
    //     0x738210: ldr             x16, [PP, #0x31d8]  ; [pp+0x31d8] TypeArguments: <bool>
    // 0x738214: stp             x1, x16, [SP]
    // 0x738218: r4 = const [0, 0x2, 0x2, 0x2, null]
    //     0x738218: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    // 0x73821c: r0 = call 0x23126c
    //     0x73821c: bl              #0x23126c
    // 0x738220: r0 = ReturnAsync()
    //     0x738220: b               #0x6ca270  ; ReturnAsyncStub
    // 0x738224: LoadField: r2 = r1->field_1f
    //     0x738224: ldur            w2, [x1, #0x1f]
    // 0x738228: DecompressPointer r2
    //     0x738228: add             x2, x2, HEAP, lsl #32
    // 0x73822c: stur            x2, [fp, #-0x70]
    // 0x738230: cmp             w2, NULL
    // 0x738234: b.eq            #0x738250
    // 0x738238: LoadField: r1 = r2->field_f
    //     0x738238: ldur            w1, [x2, #0xf]
    // 0x73823c: DecompressPointer r1
    //     0x73823c: add             x1, x1, HEAP, lsl #32
    // 0x738240: LoadField: r3 = r2->field_13
    //     0x738240: ldur            w3, [x2, #0x13]
    // 0x738244: DecompressPointer r3
    //     0x738244: add             x3, x3, HEAP, lsl #32
    // 0x738248: stp             x3, x1, [SP]
    // 0x73824c: r0 = call 0x1fe9b8
    //     0x73824c: bl              #0x1fe9b8
    // 0x738250: ldur            x0, [fp, #-0x60]
    // 0x738254: LoadField: r1 = r0->field_f
    //     0x738254: ldur            w1, [x0, #0xf]
    // 0x738258: DecompressPointer r1
    //     0x738258: add             x1, x1, HEAP, lsl #32
    // 0x73825c: LoadField: r2 = r1->field_1b
    //     0x73825c: ldur            w2, [x1, #0x1b]
    // 0x738260: DecompressPointer r2
    //     0x738260: add             x2, x2, HEAP, lsl #32
    // 0x738264: LoadField: r3 = r2->field_13
    //     0x738264: ldur            w3, [x2, #0x13]
    // 0x738268: DecompressPointer r3
    //     0x738268: add             x3, x3, HEAP, lsl #32
    // 0x73826c: stur            x3, [fp, #-0x78]
    // 0x738270: r1 = <bool>
    //     0x738270: ldr             x1, [PP, #0x31d8]  ; [pp+0x31d8] TypeArguments: <bool>
    // 0x738274: r0 = _Future()
    //     0x738274: bl              #0x6cb5dc  ; Allocate_FutureStub -> _Future<X0> (size=0x1c)
    // 0x738278: mov             x1, x0
    // 0x73827c: r0 = 0
    //     0x73827c: mov             x0, #0
    // 0x738280: stur            x1, [fp, #-0x80]
    // 0x738284: StoreField: r1->field_b = r0
    //     0x738284: stur            x0, [x1, #0xb]
    // 0x738288: r0 = InitLateStaticField(0x5a4) // [dart:async] s::_current
    //     0x738288: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x73828c: ldr             x0, [x0, #0xb48]
    //     0x738290: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x738294: cmp             w0, w16
    //     0x738298: b.ne            #0x7382a4
    //     0x73829c: ldr             x2, [PP, #0x1f8]  ; [pp+0x1f8] Field <s._current@4048458>: static late (offset: 0x5a4)
    //     0x7382a0: bl              #0x74b164  ; InitLateStaticFieldStub
    // 0x7382a4: mov             x1, x0
    // 0x7382a8: ldur            x0, [fp, #-0x80]
    // 0x7382ac: StoreField: r0->field_13 = r1
    //     0x7382ac: stur            w1, [x0, #0x13]
    // 0x7382b0: ldur            x16, [fp, #-0x78]
    // 0x7382b4: stp             x16, x0, [SP]
    // 0x7382b8: r0 = call 0x1fcf78
    //     0x7382b8: bl              #0x1fcf78
    // 0x7382bc: ldur            x0, [fp, #-0x80]
    // 0x7382c0: r1 = <bool>
    //     0x7382c0: ldr             x1, [PP, #0x31d8]  ; [pp+0x31d8] TypeArguments: <bool>
    // 0x7382c4: r0 = AwaitWithTypeCheck()
    //     0x7382c4: bl              #0x6e79fc  ; AwaitWithTypeCheckStub
    // 0x7382c8: mov             x1, x0
    // 0x7382cc: stur            x1, [fp, #-0x78]
    // 0x7382d0: tbnz            w0, #5, #0x7382d8
    // 0x7382d4: r0 = AssertBoolean()
    //     0x7382d4: bl              #0x74b210  ; AssertBooleanStub
    // 0x7382d8: ldur            x0, [fp, #-0x78]
    // 0x7382dc: tbnz            w0, #4, #0x7382fc
    // 0x7382e0: ldur            x1, [fp, #-0x60]
    // 0x7382e4: r2 = true
    //     0x7382e4: add             x2, NULL, #0x20  ; true
    // 0x7382e8: LoadField: r0 = r1->field_f
    //     0x7382e8: ldur            w0, [x1, #0xf]
    // 0x7382ec: DecompressPointer r0
    //     0x7382ec: add             x0, x0, HEAP, lsl #32
    // 0x7382f0: StoreField: r0->field_13 = r2
    //     0x7382f0: stur            w2, [x0, #0x13]
    // 0x7382f4: mov             x0, x2
    // 0x7382f8: r0 = ReturnAsyncNotFuture()
    //     0x7382f8: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x7382fc: ldur            x1, [fp, #-0x60]
    // 0x738300: r2 = true
    //     0x738300: add             x2, NULL, #0x20  ; true
    // 0x738304: LoadField: r3 = r1->field_f
    //     0x738304: ldur            w3, [x1, #0xf]
    // 0x738308: DecompressPointer r3
    //     0x738308: add             x3, x3, HEAP, lsl #32
    // 0x73830c: LoadField: r4 = r3->field_1b
    //     0x73830c: ldur            w4, [x3, #0x1b]
    // 0x738310: DecompressPointer r4
    //     0x738310: add             x4, x4, HEAP, lsl #32
    // 0x738314: str             x4, [SP]
    // 0x738318: r0 = __unknown_function__()
    //     0x738318: bl              #0x739384  ; [] ::__unknown_function__
    // 0x73831c: mov             x1, x0
    // 0x738320: stur            x1, [fp, #-0x80]
    // 0x738324: r0 = Await()
    //     0x738324: bl              #0x6cdaec  ; AwaitStub
    // 0x738328: ldur            x0, [fp, #-0x60]
    // 0x73832c: LoadField: r1 = r0->field_f
    //     0x73832c: ldur            w1, [x0, #0xf]
    // 0x738330: DecompressPointer r1
    //     0x738330: add             x1, x1, HEAP, lsl #32
    // 0x738334: r2 = true
    //     0x738334: add             x2, NULL, #0x20  ; true
    // 0x738338: StoreField: r1->field_13 = r2
    //     0x738338: stur            w2, [x1, #0x13]
    // 0x73833c: LoadField: r3 = r0->field_13
    //     0x73833c: ldur            w3, [x0, #0x13]
    // 0x738340: DecompressPointer r3
    //     0x738340: add             x3, x3, HEAP, lsl #32
    // 0x738344: stp             x3, x1, [SP]
    // 0x738348: r0 = __unknown_function__()
    //     0x738348: bl              #0x7383cc  ; [] ::__unknown_function__
    // 0x73834c: mov             x1, x0
    // 0x738350: stur            x1, [fp, #-0x68]
    // 0x738354: r0 = Await()
    //     0x738354: bl              #0x6cdaec  ; AwaitStub
    // 0x738358: r0 = true
    //     0x738358: add             x0, NULL, #0x20  ; true
    // 0x73835c: r0 = ReturnAsyncNotFuture()
    //     0x73835c: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x738360: sub             SP, fp, #0x90
    // 0x738364: ldur            x2, [fp, #-0x20]
    // 0x738368: stur            x0, [fp, #-0x68]
    // 0x73836c: mov             x16, x1
    // 0x738370: mov             x1, x0
    // 0x738374: mov             x0, x16
    // 0x738378: stur            x0, [fp, #-0x70]
    // 0x73837c: LoadField: r4 = r2->field_f
    //     0x73837c: ldur            w4, [x2, #0xf]
    // 0x738380: DecompressPointer r4
    //     0x738380: add             x4, x4, HEAP, lsl #32
    // 0x738384: mov             x2, x1
    // 0x738388: mov             x3, x0
    // 0x73838c: stur            x4, [fp, #-0x60]
    // 0x738390: r0 = AllocateRecord2()
    //     0x738390: bl              #0x74bc00  ; AllocateRecord2Stub
    // 0x738394: ldur            x1, [fp, #-0x60]
    // 0x738398: StoreField: r1->field_1f = r0
    //     0x738398: stur            w0, [x1, #0x1f]
    //     0x73839c: ldurb           w16, [x1, #-1]
    //     0x7383a0: ldurb           w17, [x0, #-1]
    //     0x7383a4: and             x16, x17, x16, lsr #2
    //     0x7383a8: tst             x16, HEAP, lsr #32
    //     0x7383ac: b.eq            #0x7383b4
    //     0x7383b0: bl              #0x74b698  ; WriteBarrierWrappersStub
    // 0x7383b4: ldur            x0, [fp, #-0x68]
    // 0x7383b8: ldur            x1, [fp, #-0x70]
    // 0x7383bc: r0 = ReThrow()
    //     0x7383bc: bl              #0x74b234  ; ReThrowStub
    // 0x7383c0: brk             #0
    // 0x7383c4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7383c4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7383c8: b               #0x7381dc
  }
}
