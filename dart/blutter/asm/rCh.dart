// lib: , url: RCh

// class id: 1048898, size: 0x8
class :: {
}

// class id: 1831, size: 0x20, field offset: 0x8
//   const constructor, 
class pT extends Object {
}

// class id: 1832, size: 0xc, field offset: 0x8
//   const constructor, 
abstract class oT<X0> extends Object {

  [closure] Null <anonymous closure>(dynamic, X0) {
    // ** addr: 0x6e5310, size: 0xcc
    // 0x6e5310: EnterFrame
    //     0x6e5310: stp             fp, lr, [SP, #-0x10]!
    //     0x6e5314: mov             fp, SP
    // 0x6e5318: AllocStack(0x60)
    //     0x6e5318: sub             SP, SP, #0x60
    // 0x6e531c: SetupParameters([dynamic _ /* r0 */])
    //     0x6e531c: ldr             x0, [fp, #0x18]
    //     0x6e5320: ldur            w1, [x0, #0x17]
    //     0x6e5324: add             x1, x1, HEAP, lsl #32
    //     0x6e5328: stur            x1, [fp, #-0x48]
    // 0x6e532c: CheckStackOverflow
    //     0x6e532c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6e5330: cmp             SP, x16
    //     0x6e5334: b.ls            #0x6e53d4
    // 0x6e5338: ldr             x0, [fp, #0x10]
    // 0x6e533c: StoreField: r1->field_1b = r0
    //     0x6e533c: stur            w0, [x1, #0x1b]
    //     0x6e5340: tbz             w0, #0, #0x6e535c
    //     0x6e5344: ldurb           w16, [x1, #-1]
    //     0x6e5348: ldurb           w17, [x0, #-1]
    //     0x6e534c: and             x16, x17, x16, lsr #2
    //     0x6e5350: tst             x16, HEAP, lsr #32
    //     0x6e5354: b.eq            #0x6e535c
    //     0x6e5358: bl              #0x74b698  ; WriteBarrierWrappersStub
    // 0x6e535c: LoadField: r2 = r1->field_13
    //     0x6e535c: ldur            w2, [x1, #0x13]
    // 0x6e5360: DecompressPointer r2
    //     0x6e5360: add             x2, x2, HEAP, lsl #32
    // 0x6e5364: stur            x2, [fp, #-0x40]
    // 0x6e5368: LoadField: r0 = r1->field_23
    //     0x6e5368: ldur            w0, [x1, #0x23]
    // 0x6e536c: DecompressPointer r0
    //     0x6e536c: add             x0, x0, HEAP, lsl #32
    // 0x6e5370: ldr             x16, [fp, #0x10]
    // 0x6e5374: stp             x16, x2, [SP, #8]
    // 0x6e5378: str             x0, [SP]
    // 0x6e537c: mov             x0, x2
    // 0x6e5380: ClosureCall
    //     0x6e5380: ldr             x4, [PP, #0x258]  ; [pp+0x258] List(5) [0, 0x3, 0x3, 0x3, Null]
    //     0x6e5384: ldur            x2, [x0, #0x1f]
    //     0x6e5388: blr             x2
    // 0x6e538c: b               #0x6e53c4
    // 0x6e5390: sub             SP, fp, #0x60
    // 0x6e5394: ldur            x2, [fp, #-0x10]
    // 0x6e5398: mov             x16, x1
    // 0x6e539c: mov             x1, x0
    // 0x6e53a0: mov             x0, x16
    // 0x6e53a4: LoadField: r3 = r2->field_23
    //     0x6e53a4: ldur            w3, [x2, #0x23]
    // 0x6e53a8: DecompressPointer r3
    //     0x6e53a8: add             x3, x3, HEAP, lsl #32
    // 0x6e53ac: stp             x1, x3, [SP, #8]
    // 0x6e53b0: str             x0, [SP]
    // 0x6e53b4: mov             x0, x3
    // 0x6e53b8: ClosureCall
    //     0x6e53b8: ldr             x4, [PP, #0x258]  ; [pp+0x258] List(5) [0, 0x3, 0x3, 0x3, Null]
    //     0x6e53bc: ldur            x2, [x0, #0x1f]
    //     0x6e53c0: blr             x2
    // 0x6e53c4: r0 = Null
    //     0x6e53c4: mov             x0, NULL
    // 0x6e53c8: LeaveFrame
    //     0x6e53c8: mov             SP, fp
    //     0x6e53cc: ldp             fp, lr, [SP], #0x10
    // 0x6e53d0: ret
    //     0x6e53d0: ret             
    // 0x6e53d4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6e53d4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6e53d8: b               #0x6e5338
  }
  [closure] Future<void> Ncb(dynamic, Object, va?) async {
    // ** addr: 0x6e53dc, size: 0xb4
    // 0x6e53dc: EnterFrame
    //     0x6e53dc: stp             fp, lr, [SP, #-0x10]!
    //     0x6e53e0: mov             fp, SP
    // 0x6e53e4: AllocStack(0x40)
    //     0x6e53e4: sub             SP, SP, #0x40
    // 0x6e53e8: SetupParameters(oT<X0> this /* r1 */, dynamic _ /* r2, fp-0x20 */, dynamic _ /* r3, fp-0x18 */)
    //     0x6e53e8: stur            NULL, [fp, #-8]
    //     0x6e53ec: mov             x0, #0
    //     0x6e53f0: add             x1, fp, w0, sxtw #2
    //     0x6e53f4: ldr             x1, [x1, #0x20]
    //     0x6e53f8: add             x2, fp, w0, sxtw #2
    //     0x6e53fc: ldr             x2, [x2, #0x18]
    //     0x6e5400: stur            x2, [fp, #-0x20]
    //     0x6e5404: add             x3, fp, w0, sxtw #2
    //     0x6e5408: ldr             x3, [x3, #0x10]
    //     0x6e540c: stur            x3, [fp, #-0x18]
    //     0x6e5410: ldur            w4, [x1, #0x17]
    //     0x6e5414: add             x4, x4, HEAP, lsl #32
    //     0x6e5418: stur            x4, [fp, #-0x10]
    // 0x6e541c: CheckStackOverflow
    //     0x6e541c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6e5420: cmp             SP, x16
    //     0x6e5424: b.ls            #0x6e5488
    // 0x6e5428: InitAsync() -> Future<void?>
    //     0x6e5428: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x6e542c: bl              #0x6cb614  ; InitAsyncStub
    // 0x6e5430: ldur            x0, [fp, #-0x10]
    // 0x6e5434: LoadField: r1 = r0->field_1f
    //     0x6e5434: ldur            w1, [x0, #0x1f]
    // 0x6e5438: DecompressPointer r1
    //     0x6e5438: add             x1, x1, HEAP, lsl #32
    // 0x6e543c: tbnz            w1, #4, #0x6e5448
    // 0x6e5440: r0 = Null
    //     0x6e5440: mov             x0, NULL
    // 0x6e5444: r0 = ReturnAsyncNotFuture()
    //     0x6e5444: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x6e5448: r1 = true
    //     0x6e5448: add             x1, NULL, #0x20  ; true
    // 0x6e544c: StoreField: r0->field_1f = r1
    //     0x6e544c: stur            w1, [x0, #0x1f]
    // 0x6e5450: ArrayLoad: r1 = r0[0]  ; List_4
    //     0x6e5450: ldur            w1, [x0, #0x17]
    // 0x6e5454: DecompressPointer r1
    //     0x6e5454: add             x1, x1, HEAP, lsl #32
    // 0x6e5458: LoadField: r2 = r0->field_1b
    //     0x6e5458: ldur            w2, [x0, #0x1b]
    // 0x6e545c: DecompressPointer r2
    //     0x6e545c: add             x2, x2, HEAP, lsl #32
    // 0x6e5460: stp             x2, x1, [SP, #0x10]
    // 0x6e5464: ldur            x16, [fp, #-0x20]
    // 0x6e5468: ldur            lr, [fp, #-0x18]
    // 0x6e546c: stp             lr, x16, [SP]
    // 0x6e5470: mov             x0, x1
    // 0x6e5474: ClosureCall
    //     0x6e5474: ldr             x4, [PP, #0x530]  ; [pp+0x530] List(5) [0, 0x4, 0x4, 0x4, Null]
    //     0x6e5478: ldur            x2, [x0, #0x1f]
    //     0x6e547c: blr             x2
    // 0x6e5480: r0 = Null
    //     0x6e5480: mov             x0, NULL
    // 0x6e5484: r0 = ReturnAsyncNotFuture()
    //     0x6e5484: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x6e5488: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6e5488: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6e548c: b               #0x6e5428
  }
  [closure] Future<void> <anonymous closure>(dynamic, X0?, Object, va?) async {
    // ** addr: 0x6e549c, size: 0xe4
    // 0x6e549c: EnterFrame
    //     0x6e549c: stp             fp, lr, [SP, #-0x10]!
    //     0x6e54a0: mov             fp, SP
    // 0x6e54a4: AllocStack(0x48)
    //     0x6e54a4: sub             SP, SP, #0x48
    // 0x6e54a8: SetupParameters(oT<X0> this /* r1 */, dynamic _ /* r2, fp-0x20 */, dynamic _ /* r3, fp-0x18 */)
    //     0x6e54a8: stur            NULL, [fp, #-8]
    //     0x6e54ac: mov             x0, #0
    //     0x6e54b0: add             x1, fp, w0, sxtw #2
    //     0x6e54b4: ldr             x1, [x1, #0x28]
    //     0x6e54b8: add             x2, fp, w0, sxtw #2
    //     0x6e54bc: ldr             x2, [x2, #0x18]
    //     0x6e54c0: stur            x2, [fp, #-0x20]
    //     0x6e54c4: add             x3, fp, w0, sxtw #2
    //     0x6e54c8: ldr             x3, [x3, #0x10]
    //     0x6e54cc: stur            x3, [fp, #-0x18]
    //     0x6e54d0: ldur            w4, [x1, #0x17]
    //     0x6e54d4: add             x4, x4, HEAP, lsl #32
    //     0x6e54d8: stur            x4, [fp, #-0x10]
    // 0x6e54dc: CheckStackOverflow
    //     0x6e54dc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6e54e0: cmp             SP, x16
    //     0x6e54e4: b.ls            #0x6e5574
    // 0x6e54e8: InitAsync() -> Future<void?>
    //     0x6e54e8: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x6e54ec: bl              #0x6cb614  ; InitAsyncStub
    // 0x6e54f0: r0 = Null
    //     0x6e54f0: mov             x0, NULL
    // 0x6e54f4: r0 = Await()
    //     0x6e54f4: bl              #0x6cdaec  ; AwaitStub
    // 0x6e54f8: ldur            x0, [fp, #-0x10]
    // 0x6e54fc: LoadField: r1 = r0->field_13
    //     0x6e54fc: ldur            w1, [x0, #0x13]
    // 0x6e5500: DecompressPointer r1
    //     0x6e5500: add             x1, x1, HEAP, lsl #32
    // 0x6e5504: stur            x1, [fp, #-0x28]
    // 0x6e5508: LoadField: r0 = r1->field_7
    //     0x6e5508: ldur            w0, [x1, #7]
    // 0x6e550c: DecompressPointer r0
    //     0x6e550c: add             x0, x0, HEAP, lsl #32
    // 0x6e5510: cmp             w0, NULL
    // 0x6e5514: b.ne            #0x6e5538
    // 0x6e5518: r0 = _uT()
    //     0x6e5518: bl              #0x6e59f4  ; Allocate_uTStub -> _uT (size=0x34)
    // 0x6e551c: stur            x0, [fp, #-0x10]
    // 0x6e5520: str             x0, [SP]
    // 0x6e5524: r0 = call 0x34758c
    //     0x6e5524: bl              #0x34758c
    // 0x6e5528: ldur            x16, [fp, #-0x28]
    // 0x6e552c: ldur            lr, [fp, #-0x10]
    // 0x6e5530: stp             lr, x16, [SP]
    // 0x6e5534: r0 = call 0x34732c
    //     0x6e5534: bl              #0x34732c
    // 0x6e5538: ldur            x0, [fp, #-0x28]
    // 0x6e553c: LoadField: r1 = r0->field_7
    //     0x6e553c: ldur            w1, [x0, #7]
    // 0x6e5540: DecompressPointer r1
    //     0x6e5540: add             x1, x1, HEAP, lsl #32
    // 0x6e5544: cmp             w1, NULL
    // 0x6e5548: b.eq            #0x6e557c
    // 0x6e554c: ldur            x16, [fp, #-0x20]
    // 0x6e5550: stp             x16, x1, [SP, #0x10]
    // 0x6e5554: ldur            x16, [fp, #-0x18]
    // 0x6e5558: r30 = true
    //     0x6e5558: add             lr, NULL, #0x20  ; true
    // 0x6e555c: stp             lr, x16, [SP]
    // 0x6e5560: r4 = const [0, 0x4, 0x4, 0x3, Hec, 0x3, null]
    //     0x6e5560: add             x4, PP, #0x28, lsl #12  ; [pp+0x28e30] List(7) [0, 0x4, 0x4, 0x3, "Hec", 0x3, Null]
    //     0x6e5564: ldr             x4, [x4, #0xe30]
    // 0x6e5568: r0 = __unknown_function__()
    //     0x6e5568: bl              #0x6e5580  ; [] ::__unknown_function__
    // 0x6e556c: r0 = Null
    //     0x6e556c: mov             x0, NULL
    // 0x6e5570: r0 = ReturnAsyncNotFuture()
    //     0x6e5570: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x6e5574: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6e5574: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6e5578: b               #0x6e54e8
    // 0x6e557c: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x6e557c: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] void <anonymous closure>(dynamic, X0, (dynamic, Object, va?) => void) {
    // ** addr: 0x347664, size: -0x1
  }
  [closure] vT <anonymous closure>(dynamic) {
    // ** addr: 0x3493a0, size: -0x1
  }
  [closure] vT <anonymous closure>(dynamic) {
    // ** addr: 0x348a9c, size: -0x1
  }
}

// class id: 1834, size: 0x18, field offset: 0xc
//   const constructor, 
class tT extends oT<dynamic> {
}

// class id: 1835, size: 0x18, field offset: 0xc
//   const constructor, 
class sT extends oT<dynamic> {

  [closure] List<xB> <anonymous closure>(dynamic) {
    // ** addr: 0x5c450c, size: -0x1
  }
}

// class id: 1836, size: 0x24, field offset: 0xc
//   const constructor, 
class rT extends oT<dynamic> {

  [closure] Null <anonymous closure>(dynamic, Object) {
    // ** addr: 0x53a118, size: -0x1
  }
  [closure] Future<We> iYg(dynamic, Kr, {((dynamic, int, int) => lr)? Ndc}) {
    // ** addr: 0x5c25f0, size: -0x1
  }
  [closure] lr <anonymous closure>(dynamic, int, int) {
    // ** addr: 0x5c2684, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, Object, va?) {
    // ** addr: 0x5c2524, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x5c2574, size: -0x1
  }
}

// class id: 1838, size: 0x20, field offset: 0x8
//   const constructor, 
class nT extends Object {
}

// class id: 2449, size: 0x34, field offset: 0x34
class _uT extends vT {
}

// class id: 4843, size: 0x14, field offset: 0x14
enum qT extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
