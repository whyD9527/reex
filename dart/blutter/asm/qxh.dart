// lib: , url: qxh

// class id: 1048656, size: 0x8
class :: {

  static late tv dLe; // offset: 0xc94
}

// class id: 3894, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class Ev extends Object {
}

// class id: 3897, size: 0x10, field offset: 0x8
//   const constructor, 
class Dv extends Object {
}

// class id: 3898, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class Bv extends Object {
}

// class id: 3899, size: 0xc, field offset: 0x8
//   const constructor, 
class Av extends Object {

  _ImmutableList<Bv> field_8;
}

// class id: 3901, size: 0x10, field offset: 0x8
abstract class wv extends Object {

  late final Dx DKe; // offset: 0xc

  [closure] Future<Y0> <anonymous closure>(dynamic) async {
    // ** addr: 0x70a0c0, size: 0x210
    // 0x70a0c0: EnterFrame
    //     0x70a0c0: stp             fp, lr, [SP, #-0x10]!
    //     0x70a0c4: mov             fp, SP
    // 0x70a0c8: AllocStack(0xb0)
    //     0x70a0c8: sub             SP, SP, #0xb0
    // 0x70a0cc: SetupParameters(wv this /* r1, fp-0x90 */)
    //     0x70a0cc: stur            NULL, [fp, #-8]
    //     0x70a0d0: mov             x0, #0
    //     0x70a0d4: add             x1, fp, w0, sxtw #2
    //     0x70a0d8: ldr             x1, [x1, #0x10]
    //     0x70a0dc: stur            x1, [fp, #-0x90]
    //     0x70a0e0: ldur            w2, [x1, #0x17]
    //     0x70a0e4: add             x2, x2, HEAP, lsl #32
    //     0x70a0e8: stur            x2, [fp, #-0x88]
    // 0x70a0ec: CheckStackOverflow
    //     0x70a0ec: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x70a0f0: cmp             SP, x16
    //     0x70a0f4: b.ls            #0x70a2c8
    // 0x70a0f8: LoadField: r3 = r1->field_b
    //     0x70a0f8: ldur            w3, [x1, #0xb]
    // 0x70a0fc: DecompressPointer r3
    //     0x70a0fc: add             x3, x3, HEAP, lsl #32
    // 0x70a100: mov             x0, x3
    // 0x70a104: stur            x3, [fp, #-0x80]
    // 0x70a108: r0 = InitAsync()
    //     0x70a108: bl              #0x6cb614  ; InitAsyncStub
    // 0x70a10c: ldur            x1, [fp, #-0x88]
    // 0x70a110: LoadField: r0 = r1->field_b
    //     0x70a110: ldur            w0, [x1, #0xb]
    // 0x70a114: DecompressPointer r0
    //     0x70a114: add             x0, x0, HEAP, lsl #32
    // 0x70a118: LoadField: r2 = r0->field_13
    //     0x70a118: ldur            w2, [x0, #0x13]
    // 0x70a11c: DecompressPointer r2
    //     0x70a11c: add             x2, x2, HEAP, lsl #32
    // 0x70a120: stur            x2, [fp, #-0x80]
    // 0x70a124: str             x2, [SP]
    // 0x70a128: mov             x0, x2
    // 0x70a12c: ClosureCall
    //     0x70a12c: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    //     0x70a130: ldur            x2, [x0, #0x1f]
    //     0x70a134: blr             x2
    // 0x70a138: mov             x1, x0
    // 0x70a13c: stur            x1, [fp, #-0x80]
    // 0x70a140: r0 = Await()
    //     0x70a140: bl              #0x6cdaec  ; AwaitStub
    // 0x70a144: stur            x0, [fp, #-0x90]
    // 0x70a148: ldur            x1, [fp, #-0x88]
    // 0x70a14c: LoadField: r2 = r1->field_13
    //     0x70a14c: ldur            w2, [x1, #0x13]
    // 0x70a150: DecompressPointer r2
    //     0x70a150: add             x2, x2, HEAP, lsl #32
    // 0x70a154: stur            x2, [fp, #-0x80]
    // 0x70a158: str             x2, [SP]
    // 0x70a15c: r0 = __unknown_function__()
    //     0x70a15c: bl              #0x70abc0  ; [] ::__unknown_function__
    // 0x70a160: mov             x1, x0
    // 0x70a164: stur            x1, [fp, #-0x98]
    // 0x70a168: r0 = Await()
    //     0x70a168: bl              #0x6cdaec  ; AwaitStub
    // 0x70a16c: ldur            x16, [fp, #-0x80]
    // 0x70a170: str             x16, [SP]
    // 0x70a174: r0 = __unknown_function__()
    //     0x70a174: bl              #0x70a398  ; [] ::__unknown_function__
    // 0x70a178: mov             x1, x0
    // 0x70a17c: stur            x1, [fp, #-0x80]
    // 0x70a180: r0 = Await()
    //     0x70a180: bl              #0x6cdaec  ; AwaitStub
    // 0x70a184: ldur            x0, [fp, #-0x90]
    // 0x70a188: r0 = ReturnAsync()
    //     0x70a188: b               #0x6ca270  ; ReturnAsyncStub
    // 0x70a18c: sub             SP, fp, #0xb0
    // 0x70a190: ldur            x2, [fp, #-0x28]
    // 0x70a194: stur            x0, [fp, #-0x80]
    // 0x70a198: stur            x1, [fp, #-0x88]
    // 0x70a19c: LoadField: r3 = r2->field_f
    //     0x70a19c: ldur            w3, [x2, #0xf]
    // 0x70a1a0: DecompressPointer r3
    //     0x70a1a0: add             x3, x3, HEAP, lsl #32
    // 0x70a1a4: stp             x0, x3, [SP, #8]
    // 0x70a1a8: str             x1, [SP]
    // 0x70a1ac: r0 = __unknown_function__()
    //     0x70a1ac: bl              #0x70a2d0  ; [] ::__unknown_function__
    // 0x70a1b0: mov             x1, x0
    // 0x70a1b4: stur            x1, [fp, #-0x90]
    // 0x70a1b8: r0 = Await()
    //     0x70a1b8: bl              #0x6cdaec  ; AwaitStub
    // 0x70a1bc: ldur            x0, [fp, #-0x80]
    // 0x70a1c0: ldur            x1, [fp, #-0x88]
    // 0x70a1c4: r0 = ReThrow()
    //     0x70a1c4: bl              #0x74b234  ; ReThrowStub
    // 0x70a1c8: brk             #0
    // 0x70a1cc: sub             SP, fp, #0xb0
    // 0x70a1d0: ldur            x2, [fp, #-0x30]
    // 0x70a1d4: stur            x0, [fp, #-0x80]
    // 0x70a1d8: stur            x1, [fp, #-0x88]
    // 0x70a1dc: LoadField: r3 = r2->field_f
    //     0x70a1dc: ldur            w3, [x2, #0xf]
    // 0x70a1e0: DecompressPointer r3
    //     0x70a1e0: add             x3, x3, HEAP, lsl #32
    // 0x70a1e4: stp             x0, x3, [SP, #8]
    // 0x70a1e8: str             x1, [SP]
    // 0x70a1ec: r0 = __unknown_function__()
    //     0x70a1ec: bl              #0x70a2d0  ; [] ::__unknown_function__
    // 0x70a1f0: mov             x1, x0
    // 0x70a1f4: stur            x1, [fp, #-0x90]
    // 0x70a1f8: r0 = Await()
    //     0x70a1f8: bl              #0x6cdaec  ; AwaitStub
    // 0x70a1fc: ldur            x0, [fp, #-0x80]
    // 0x70a200: ldur            x1, [fp, #-0x88]
    // 0x70a204: r0 = ReThrow()
    //     0x70a204: bl              #0x74b234  ; ReThrowStub
    // 0x70a208: brk             #0
    // 0x70a20c: sub             SP, fp, #0xb0
    // 0x70a210: ldur            x2, [fp, #-0x28]
    // 0x70a214: stur            x0, [fp, #-0x80]
    // 0x70a218: stur            x1, [fp, #-0x88]
    // 0x70a21c: LoadField: r3 = r2->field_f
    //     0x70a21c: ldur            w3, [x2, #0xf]
    // 0x70a220: DecompressPointer r3
    //     0x70a220: add             x3, x3, HEAP, lsl #32
    // 0x70a224: stp             x0, x3, [SP, #8]
    // 0x70a228: str             x1, [SP]
    // 0x70a22c: r0 = __unknown_function__()
    //     0x70a22c: bl              #0x70a2d0  ; [] ::__unknown_function__
    // 0x70a230: mov             x1, x0
    // 0x70a234: stur            x1, [fp, #-0x90]
    // 0x70a238: r0 = Await()
    //     0x70a238: bl              #0x6cdaec  ; AwaitStub
    // 0x70a23c: ldur            x0, [fp, #-0x80]
    // 0x70a240: ldur            x1, [fp, #-0x88]
    // 0x70a244: r0 = ReThrow()
    //     0x70a244: bl              #0x74b234  ; ReThrowStub
    // 0x70a248: brk             #0
    // 0x70a24c: sub             SP, fp, #0xb0
    // 0x70a250: ldur            x2, [fp, #-0x28]
    // 0x70a254: stur            x0, [fp, #-0x80]
    // 0x70a258: stur            x1, [fp, #-0x88]
    // 0x70a25c: LoadField: r3 = r2->field_13
    //     0x70a25c: ldur            w3, [x2, #0x13]
    // 0x70a260: DecompressPointer r3
    //     0x70a260: add             x3, x3, HEAP, lsl #32
    // 0x70a264: str             x3, [SP]
    // 0x70a268: r0 = __unknown_function__()
    //     0x70a268: bl              #0x70a398  ; [] ::__unknown_function__
    // 0x70a26c: mov             x1, x0
    // 0x70a270: stur            x1, [fp, #-0x90]
    // 0x70a274: r0 = Await()
    //     0x70a274: bl              #0x6cdaec  ; AwaitStub
    // 0x70a278: ldur            x0, [fp, #-0x80]
    // 0x70a27c: ldur            x1, [fp, #-0x88]
    // 0x70a280: r0 = ReThrow()
    //     0x70a280: bl              #0x74b234  ; ReThrowStub
    // 0x70a284: brk             #0
    // 0x70a288: sub             SP, fp, #0xb0
    // 0x70a28c: ldur            x2, [fp, #-0x28]
    // 0x70a290: stur            x0, [fp, #-0x80]
    // 0x70a294: stur            x1, [fp, #-0x88]
    // 0x70a298: LoadField: r3 = r2->field_f
    //     0x70a298: ldur            w3, [x2, #0xf]
    // 0x70a29c: DecompressPointer r3
    //     0x70a29c: add             x3, x3, HEAP, lsl #32
    // 0x70a2a0: stp             x0, x3, [SP, #8]
    // 0x70a2a4: str             x1, [SP]
    // 0x70a2a8: r0 = __unknown_function__()
    //     0x70a2a8: bl              #0x70a2d0  ; [] ::__unknown_function__
    // 0x70a2ac: mov             x1, x0
    // 0x70a2b0: stur            x1, [fp, #-0x90]
    // 0x70a2b4: r0 = Await()
    //     0x70a2b4: bl              #0x6cdaec  ; AwaitStub
    // 0x70a2b8: ldur            x0, [fp, #-0x80]
    // 0x70a2bc: ldur            x1, [fp, #-0x88]
    // 0x70a2c0: r0 = ReThrow()
    //     0x70a2c0: bl              #0x74b234  ; ReThrowStub
    // 0x70a2c4: brk             #0
    // 0x70a2c8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x70a2c8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x70a2cc: b               #0x70a0f8
  }
  [closure] FutureOr<Y0> <anonymous closure>(dynamic, bool) {
    // ** addr: 0x377fc4, size: -0x1
  }
  [closure] Future<Y0> <anonymous closure>(dynamic, vv) {
    // ** addr: 0x42f09c, size: -0x1
  }
  [closure] Future<void> <anonymous closure>(dynamic, vv) {
    // ** addr: 0x61cf04, size: -0x1
  }
}

// class id: 3904, size: 0x14, field offset: 0x10
abstract class yv extends wv
    implements zv {

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x738520, size: 0x184
    // 0x738520: EnterFrame
    //     0x738520: stp             fp, lr, [SP, #-0x10]!
    //     0x738524: mov             fp, SP
    // 0x738528: AllocStack(0x38)
    //     0x738528: sub             SP, SP, #0x38
    // 0x73852c: SetupParameters(yv this /* r1 */)
    //     0x73852c: stur            NULL, [fp, #-8]
    //     0x738530: mov             x0, #0
    //     0x738534: add             x1, fp, w0, sxtw #2
    //     0x738538: ldr             x1, [x1, #0x10]
    //     0x73853c: ldur            w2, [x1, #0x17]
    //     0x738540: add             x2, x2, HEAP, lsl #32
    //     0x738544: stur            x2, [fp, #-0x10]
    // 0x738548: CheckStackOverflow
    //     0x738548: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x73854c: cmp             SP, x16
    //     0x738550: b.ls            #0x738698
    // 0x738554: InitAsync() -> Future<void?>
    //     0x738554: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x738558: bl              #0x6cb614  ; InitAsyncStub
    // 0x73855c: ldur            x0, [fp, #-0x10]
    // 0x738560: LoadField: r1 = r0->field_13
    //     0x738560: ldur            w1, [x0, #0x13]
    // 0x738564: DecompressPointer r1
    //     0x738564: add             x1, x1, HEAP, lsl #32
    // 0x738568: LoadField: r2 = r1->field_7
    //     0x738568: ldur            w2, [x1, #7]
    // 0x73856c: DecompressPointer r2
    //     0x73856c: add             x2, x2, HEAP, lsl #32
    // 0x738570: cmp             w2, NULL
    // 0x738574: b.ne            #0x7385d4
    // 0x738578: LoadField: r1 = r0->field_f
    //     0x738578: ldur            w1, [x0, #0xf]
    // 0x73857c: DecompressPointer r1
    //     0x73857c: add             x1, x1, HEAP, lsl #32
    // 0x738580: str             x1, [SP]
    // 0x738584: r0 = call 0x61dcc8
    //     0x738584: bl              #0x61dcc8
    // 0x738588: mov             x1, x0
    // 0x73858c: ldur            x0, [fp, #-0x10]
    // 0x738590: stur            x1, [fp, #-0x18]
    // 0x738594: LoadField: r2 = r0->field_f
    //     0x738594: ldur            w2, [x0, #0xf]
    // 0x738598: DecompressPointer r2
    //     0x738598: add             x2, x2, HEAP, lsl #32
    // 0x73859c: str             x2, [SP]
    // 0x7385a0: r0 = call 0x61cd28
    //     0x7385a0: bl              #0x61cd28
    // 0x7385a4: LoadField: r1 = r0->field_7
    //     0x7385a4: ldur            w1, [x0, #7]
    // 0x7385a8: DecompressPointer r1
    //     0x7385a8: add             x1, x1, HEAP, lsl #32
    // 0x7385ac: ldur            x16, [fp, #-0x18]
    // 0x7385b0: stp             x16, x1, [SP]
    // 0x7385b4: mov             x0, x1
    // 0x7385b8: ClosureCall
    //     0x7385b8: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    //     0x7385bc: ldur            x2, [x0, #0x1f]
    //     0x7385c0: blr             x2
    // 0x7385c4: mov             x1, x0
    // 0x7385c8: stur            x1, [fp, #-0x18]
    // 0x7385cc: r0 = Await()
    //     0x7385cc: bl              #0x6cdaec  ; AwaitStub
    // 0x7385d0: b               #0x738674
    // 0x7385d4: str             x1, [SP]
    // 0x7385d8: r0 = call 0x61ccf4
    //     0x7385d8: bl              #0x61ccf4
    // 0x7385dc: tbnz            w0, #4, #0x738674
    // 0x7385e0: ldur            x0, [fp, #-0x10]
    // 0x7385e4: LoadField: r1 = r0->field_f
    //     0x7385e4: ldur            w1, [x0, #0xf]
    // 0x7385e8: DecompressPointer r1
    //     0x7385e8: add             x1, x1, HEAP, lsl #32
    // 0x7385ec: str             x1, [SP]
    // 0x7385f0: r0 = call 0x61dcc8
    //     0x7385f0: bl              #0x61dcc8
    // 0x7385f4: mov             x1, x0
    // 0x7385f8: ldur            x0, [fp, #-0x10]
    // 0x7385fc: stur            x1, [fp, #-0x18]
    // 0x738600: LoadField: r2 = r0->field_f
    //     0x738600: ldur            w2, [x0, #0xf]
    // 0x738604: DecompressPointer r2
    //     0x738604: add             x2, x2, HEAP, lsl #32
    // 0x738608: str             x2, [SP]
    // 0x73860c: r0 = call 0x61cd28
    //     0x73860c: bl              #0x61cd28
    // 0x738610: ldur            x2, [fp, #-0x10]
    // 0x738614: LoadField: r1 = r2->field_13
    //     0x738614: ldur            w1, [x2, #0x13]
    // 0x738618: DecompressPointer r1
    //     0x738618: add             x1, x1, HEAP, lsl #32
    // 0x73861c: LoadField: r3 = r1->field_7
    //     0x73861c: ldur            w3, [x1, #7]
    // 0x738620: DecompressPointer r3
    //     0x738620: add             x3, x3, HEAP, lsl #32
    // 0x738624: cmp             w3, NULL
    // 0x738628: b.eq            #0x7386a0
    // 0x73862c: LoadField: r4 = r1->field_b
    //     0x73862c: ldur            x4, [x1, #0xb]
    // 0x738630: LoadField: r5 = r0->field_b
    //     0x738630: ldur            w5, [x0, #0xb]
    // 0x738634: DecompressPointer r5
    //     0x738634: add             x5, x5, HEAP, lsl #32
    // 0x738638: r0 = BoxInt64Instr(r4)
    //     0x738638: sbfiz           x0, x4, #1, #0x1f
    //     0x73863c: cmp             x4, x0, asr #1
    //     0x738640: b.eq            #0x73864c
    //     0x738644: bl              #0x74cee4  ; AllocateMintSharedWithoutFPURegsStub
    //     0x738648: stur            x4, [x0, #7]
    // 0x73864c: ldur            x16, [fp, #-0x18]
    // 0x738650: stp             x16, x5, [SP, #0x10]
    // 0x738654: stp             x0, x3, [SP]
    // 0x738658: mov             x0, x5
    // 0x73865c: ClosureCall
    //     0x73865c: ldr             x4, [PP, #0x530]  ; [pp+0x530] List(5) [0, 0x4, 0x4, 0x4, Null]
    //     0x738660: ldur            x2, [x0, #0x1f]
    //     0x738664: blr             x2
    // 0x738668: mov             x1, x0
    // 0x73866c: stur            x1, [fp, #-0x18]
    // 0x738670: r0 = Await()
    //     0x738670: bl              #0x6cdaec  ; AwaitStub
    // 0x738674: ldur            x0, [fp, #-0x10]
    // 0x738678: LoadField: r1 = r0->field_f
    //     0x738678: ldur            w1, [x0, #0xf]
    // 0x73867c: DecompressPointer r1
    //     0x73867c: add             x1, x1, HEAP, lsl #32
    // 0x738680: str             x1, [SP]
    // 0x738684: r0 = call 0x61cd28
    //     0x738684: bl              #0x61cd28
    // 0x738688: r0 = Null
    //     0x738688: mov             x0, NULL
    // 0x73868c: r0 = Await()
    //     0x73868c: bl              #0x6cdaec  ; AwaitStub
    // 0x738690: r0 = Null
    //     0x738690: mov             x0, NULL
    // 0x738694: r0 = ReturnAsyncNotFuture()
    //     0x738694: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x738698: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x738698: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x73869c: b               #0x738554
    // 0x7386a0: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x7386a0: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
  }
}

// class id: 3907, size: 0x18, field offset: 0x10
abstract class xv<X0 bound yv> extends wv {
}

// class id: 3921, size: 0x10, field offset: 0x8
class uv extends Object
    implements vv {
}

// class id: 3922, size: 0xc, field offset: 0x8
class tv extends Object {
}

// class id: 4921, size: 0x14, field offset: 0x14
enum Cv extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
