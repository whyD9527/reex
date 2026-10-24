// lib: , url: package:flutter/src/services/platform_channel.dart

// class id: 1048976, size: 0x8
class :: {
}

// class id: 1398, size: 0x14, field offset: 0x8
//   const constructor, 
class hba extends Object {

  _OneByteString field_8;
  Xaa field_c;

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x6fcc74, size: 0x18c
    // 0x6fcc74: EnterFrame
    //     0x6fcc74: stp             fp, lr, [SP, #-0x10]!
    //     0x6fcc78: mov             fp, SP
    // 0x6fcc7c: AllocStack(0x90)
    //     0x6fcc7c: sub             SP, SP, #0x90
    // 0x6fcc80: SetupParameters(hba this /* r1, fp-0x60 */)
    //     0x6fcc80: stur            NULL, [fp, #-8]
    //     0x6fcc84: mov             x0, #0
    //     0x6fcc88: add             x1, fp, w0, sxtw #2
    //     0x6fcc8c: ldr             x1, [x1, #0x10]
    //     0x6fcc90: stur            x1, [fp, #-0x60]
    //     0x6fcc94: ldur            w2, [x1, #0x17]
    //     0x6fcc98: add             x2, x2, HEAP, lsl #32
    //     0x6fcc9c: stur            x2, [fp, #-0x58]
    // 0x6fcca0: CheckStackOverflow
    //     0x6fcca0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6fcca4: cmp             SP, x16
    //     0x6fcca8: b.ls            #0x6fcdf8
    // 0x6fccac: InitAsync() -> Future<void?>
    //     0x6fccac: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x6fccb0: bl              #0x6cb614  ; InitAsyncStub
    // 0x6fccb4: r0 = call 0x2a5934
    //     0x6fccb4: bl              #0x2a5934
    // 0x6fccb8: r1 = LoadClassIdInstr(r0)
    //     0x6fccb8: ldur            x1, [x0, #-1]
    //     0x6fccbc: ubfx            x1, x1, #0xc, #0x14
    // 0x6fccc0: r16 = "xyz.re.player.ex/HeadsetPlugChannel"
    //     0x6fccc0: add             x16, PP, #0x11, lsl #12  ; [pp+0x11d88] "xyz.re.player.ex/HeadsetPlugChannel"
    //     0x6fccc4: ldr             x16, [x16, #0xd88]
    // 0x6fccc8: stp             x16, x0, [SP, #8]
    // 0x6fcccc: str             NULL, [SP]
    // 0x6fccd0: mov             x0, x1
    // 0x6fccd4: r0 = GDT[cid_x0 + -0x1000]()
    //     0x6fccd4: sub             lr, x0, #1, lsl #12
    //     0x6fccd8: ldr             lr, [x21, lr, lsl #3]
    //     0x6fccdc: blr             lr
    // 0x6fcce0: ldur            x0, [fp, #-0x58]
    // 0x6fcce4: LoadField: r1 = r0->field_13
    //     0x6fcce4: ldur            w1, [x0, #0x13]
    // 0x6fcce8: DecompressPointer r1
    //     0x6fcce8: add             x1, x1, HEAP, lsl #32
    // 0x6fccec: r16 = <void?>
    //     0x6fccec: ldr             x16, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    // 0x6fccf0: stp             x1, x16, [SP, #0x10]
    // 0x6fccf4: r16 = "cancel"
    //     0x6fccf4: add             x16, PP, #0x11, lsl #12  ; [pp+0x11db0] "cancel"
    //     0x6fccf8: ldr             x16, [x16, #0xdb0]
    // 0x6fccfc: stp             NULL, x16, [SP]
    // 0x6fcd00: r4 = const [0x1, 0x3, 0x3, 0x3, null]
    //     0x6fcd00: ldr             x4, [PP, #0x3f8]  ; [pp+0x3f8] List(5) [0x1, 0x3, 0x3, 0x3, Null]
    // 0x6fcd04: r0 = call 0x685940
    //     0x6fcd04: bl              #0x685940
    // 0x6fcd08: mov             x1, x0
    // 0x6fcd0c: stur            x1, [fp, #-0x60]
    // 0x6fcd10: r0 = Await()
    //     0x6fcd10: bl              #0x6cdaec  ; AwaitStub
    // 0x6fcd14: b               #0x6fcdf0
    // 0x6fcd18: sub             SP, fp, #0x90
    // 0x6fcd1c: mov             x3, x0
    // 0x6fcd20: stur            x0, [fp, #-0x58]
    // 0x6fcd24: mov             x0, x1
    // 0x6fcd28: stur            x1, [fp, #-0x60]
    // 0x6fcd2c: r1 = Null
    //     0x6fcd2c: mov             x1, NULL
    // 0x6fcd30: r2 = 4
    //     0x6fcd30: mov             x2, #4
    // 0x6fcd34: r0 = AllocateArray()
    //     0x6fcd34: bl              #0x74cc68  ; AllocateArrayStub
    // 0x6fcd38: r17 = "while de-activating platform stream on channel "
    //     0x6fcd38: add             x17, PP, #0x11, lsl #12  ; [pp+0x11db8] "while de-activating platform stream on channel "
    //     0x6fcd3c: ldr             x17, [x17, #0xdb8]
    // 0x6fcd40: StoreField: r0->field_f = r17
    //     0x6fcd40: stur            w17, [x0, #0xf]
    // 0x6fcd44: ldur            x1, [fp, #-0x20]
    // 0x6fcd48: LoadField: r2 = r1->field_f
    //     0x6fcd48: ldur            w2, [x1, #0xf]
    // 0x6fcd4c: DecompressPointer r2
    //     0x6fcd4c: add             x2, x2, HEAP, lsl #32
    // 0x6fcd50: LoadField: r1 = r2->field_7
    //     0x6fcd50: ldur            w1, [x2, #7]
    // 0x6fcd54: DecompressPointer r1
    //     0x6fcd54: add             x1, x1, HEAP, lsl #32
    // 0x6fcd58: StoreField: r0->field_13 = r1
    //     0x6fcd58: stur            w1, [x0, #0x13]
    // 0x6fcd5c: str             x0, [SP]
    // 0x6fcd60: r0 = _interpolate()
    //     0x6fcd60: bl              #0x1fb13c  ; [dart:core] _StringBase::_interpolate
    // 0x6fcd64: r1 = Null
    //     0x6fcd64: mov             x1, NULL
    // 0x6fcd68: r2 = 2
    //     0x6fcd68: mov             x2, #2
    // 0x6fcd6c: stur            x0, [fp, #-0x68]
    // 0x6fcd70: r0 = AllocateArray()
    //     0x6fcd70: bl              #0x74cc68  ; AllocateArrayStub
    // 0x6fcd74: mov             x2, x0
    // 0x6fcd78: ldur            x0, [fp, #-0x68]
    // 0x6fcd7c: stur            x2, [fp, #-0x70]
    // 0x6fcd80: StoreField: r2->field_f = r0
    //     0x6fcd80: stur            w0, [x2, #0xf]
    // 0x6fcd84: r1 = <Object>
    //     0x6fcd84: ldr             x1, [PP, #0x118]  ; [pp+0x118] TypeArguments: <Object>
    // 0x6fcd88: r0 = AllocateGrowableArray()
    //     0x6fcd88: bl              #0x74be54  ; AllocateGrowableArrayStub
    // 0x6fcd8c: mov             x2, x0
    // 0x6fcd90: ldur            x0, [fp, #-0x70]
    // 0x6fcd94: stur            x2, [fp, #-0x68]
    // 0x6fcd98: StoreField: r2->field_f = r0
    //     0x6fcd98: stur            w0, [x2, #0xf]
    // 0x6fcd9c: r0 = 2
    //     0x6fcd9c: mov             x0, #2
    // 0x6fcda0: StoreField: r2->field_b = r0
    //     0x6fcda0: stur            w0, [x2, #0xb]
    // 0x6fcda4: r1 = <List<Object>>
    //     0x6fcda4: ldr             x1, [PP, #0x22c8]  ; [pp+0x22c8] TypeArguments: <List<Object>>
    // 0x6fcda8: r0 = DB()
    //     0x6fcda8: bl              #0x6cf5e0  ; AllocateDBStub -> DB (size=0x14)
    // 0x6fcdac: mov             x1, x0
    // 0x6fcdb0: r0 = true
    //     0x6fcdb0: add             x0, NULL, #0x20  ; true
    // 0x6fcdb4: StoreField: r1->field_f = r0
    //     0x6fcdb4: stur            w0, [x1, #0xf]
    // 0x6fcdb8: ldur            x0, [fp, #-0x68]
    // 0x6fcdbc: StoreField: r1->field_b = r0
    //     0x6fcdbc: stur            w0, [x1, #0xb]
    // 0x6fcdc0: r0 = HB()
    //     0x6fcdc0: bl              #0x6cf5d4  ; AllocateHBStub -> HB (size=0x18)
    // 0x6fcdc4: mov             x1, x0
    // 0x6fcdc8: ldur            x0, [fp, #-0x58]
    // 0x6fcdcc: StoreField: r1->field_7 = r0
    //     0x6fcdcc: stur            w0, [x1, #7]
    // 0x6fcdd0: ldur            x0, [fp, #-0x60]
    // 0x6fcdd4: StoreField: r1->field_b = r0
    //     0x6fcdd4: stur            w0, [x1, #0xb]
    // 0x6fcdd8: r0 = "services library"
    //     0x6fcdd8: ldr             x0, [PP, #0x3f70]  ; [pp+0x3f70] "services library"
    // 0x6fcddc: StoreField: r1->field_f = r0
    //     0x6fcddc: stur            w0, [x1, #0xf]
    // 0x6fcde0: r0 = false
    //     0x6fcde0: add             x0, NULL, #0x30  ; false
    // 0x6fcde4: StoreField: r1->field_13 = r0
    //     0x6fcde4: stur            w0, [x1, #0x13]
    // 0x6fcde8: str             x1, [SP]
    // 0x6fcdec: r0 = call 0x220f10
    //     0x6fcdec: bl              #0x220f10
    // 0x6fcdf0: r0 = Null
    //     0x6fcdf0: mov             x0, NULL
    // 0x6fcdf4: r0 = ReturnAsyncNotFuture()
    //     0x6fcdf4: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x6fcdf8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6fcdf8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6fcdfc: b               #0x6fccac
  }
  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x6fce00, size: 0x1a8
    // 0x6fce00: EnterFrame
    //     0x6fce00: stp             fp, lr, [SP, #-0x10]!
    //     0x6fce04: mov             fp, SP
    // 0x6fce08: AllocStack(0x90)
    //     0x6fce08: sub             SP, SP, #0x90
    // 0x6fce0c: SetupParameters(hba this /* r1, fp-0x60 */)
    //     0x6fce0c: stur            NULL, [fp, #-8]
    //     0x6fce10: mov             x0, #0
    //     0x6fce14: add             x1, fp, w0, sxtw #2
    //     0x6fce18: ldr             x1, [x1, #0x10]
    //     0x6fce1c: stur            x1, [fp, #-0x60]
    //     0x6fce20: ldur            w2, [x1, #0x17]
    //     0x6fce24: add             x2, x2, HEAP, lsl #32
    //     0x6fce28: stur            x2, [fp, #-0x58]
    // 0x6fce2c: CheckStackOverflow
    //     0x6fce2c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6fce30: cmp             SP, x16
    //     0x6fce34: b.ls            #0x6fcfa0
    // 0x6fce38: InitAsync() -> Future<void?>
    //     0x6fce38: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x6fce3c: bl              #0x6cb614  ; InitAsyncStub
    // 0x6fce40: r0 = call 0x2a5934
    //     0x6fce40: bl              #0x2a5934
    // 0x6fce44: ldur            x2, [fp, #-0x58]
    // 0x6fce48: r1 = Function '<anonymous closure>':.
    //     0x6fce48: add             x1, PP, #0x11, lsl #12  ; [pp+0x11dc0] AnonymousClosure: (0x6fcfa8), in [package:flutter/src/services/platform_channel.dart] hba::<anonymous closure> (0x6fce00)
    //     0x6fce4c: ldr             x1, [x1, #0xdc0]
    // 0x6fce50: stur            x0, [fp, #-0x60]
    // 0x6fce54: r0 = AllocateClosure()
    //     0x6fce54: bl              #0x74bfa8  ; AllocateClosureStub
    // 0x6fce58: mov             x1, x0
    // 0x6fce5c: ldur            x0, [fp, #-0x60]
    // 0x6fce60: r2 = LoadClassIdInstr(r0)
    //     0x6fce60: ldur            x2, [x0, #-1]
    //     0x6fce64: ubfx            x2, x2, #0xc, #0x14
    // 0x6fce68: r16 = "xyz.re.player.ex/HeadsetPlugChannel"
    //     0x6fce68: add             x16, PP, #0x11, lsl #12  ; [pp+0x11d88] "xyz.re.player.ex/HeadsetPlugChannel"
    //     0x6fce6c: ldr             x16, [x16, #0xd88]
    // 0x6fce70: stp             x16, x0, [SP, #8]
    // 0x6fce74: str             x1, [SP]
    // 0x6fce78: mov             x0, x2
    // 0x6fce7c: r0 = GDT[cid_x0 + -0x1000]()
    //     0x6fce7c: sub             lr, x0, #1, lsl #12
    //     0x6fce80: ldr             lr, [x21, lr, lsl #3]
    //     0x6fce84: blr             lr
    // 0x6fce88: ldur            x0, [fp, #-0x58]
    // 0x6fce8c: LoadField: r1 = r0->field_13
    //     0x6fce8c: ldur            w1, [x0, #0x13]
    // 0x6fce90: DecompressPointer r1
    //     0x6fce90: add             x1, x1, HEAP, lsl #32
    // 0x6fce94: r16 = <void?>
    //     0x6fce94: ldr             x16, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    // 0x6fce98: stp             x1, x16, [SP, #0x10]
    // 0x6fce9c: r16 = "listen"
    //     0x6fce9c: add             x16, PP, #0x11, lsl #12  ; [pp+0x11dc8] "listen"
    //     0x6fcea0: ldr             x16, [x16, #0xdc8]
    // 0x6fcea4: stp             NULL, x16, [SP]
    // 0x6fcea8: r4 = const [0x1, 0x3, 0x3, 0x3, null]
    //     0x6fcea8: ldr             x4, [PP, #0x3f8]  ; [pp+0x3f8] List(5) [0x1, 0x3, 0x3, 0x3, Null]
    // 0x6fceac: r0 = call 0x685940
    //     0x6fceac: bl              #0x685940
    // 0x6fceb0: mov             x1, x0
    // 0x6fceb4: stur            x1, [fp, #-0x60]
    // 0x6fceb8: r0 = Await()
    //     0x6fceb8: bl              #0x6cdaec  ; AwaitStub
    // 0x6fcebc: b               #0x6fcf98
    // 0x6fcec0: sub             SP, fp, #0x90
    // 0x6fcec4: mov             x3, x0
    // 0x6fcec8: stur            x0, [fp, #-0x58]
    // 0x6fcecc: mov             x0, x1
    // 0x6fced0: stur            x1, [fp, #-0x60]
    // 0x6fced4: r1 = Null
    //     0x6fced4: mov             x1, NULL
    // 0x6fced8: r2 = 4
    //     0x6fced8: mov             x2, #4
    // 0x6fcedc: r0 = AllocateArray()
    //     0x6fcedc: bl              #0x74cc68  ; AllocateArrayStub
    // 0x6fcee0: r17 = "while activating platform stream on channel "
    //     0x6fcee0: add             x17, PP, #0x11, lsl #12  ; [pp+0x11dd0] "while activating platform stream on channel "
    //     0x6fcee4: ldr             x17, [x17, #0xdd0]
    // 0x6fcee8: StoreField: r0->field_f = r17
    //     0x6fcee8: stur            w17, [x0, #0xf]
    // 0x6fceec: ldur            x1, [fp, #-0x20]
    // 0x6fcef0: LoadField: r2 = r1->field_f
    //     0x6fcef0: ldur            w2, [x1, #0xf]
    // 0x6fcef4: DecompressPointer r2
    //     0x6fcef4: add             x2, x2, HEAP, lsl #32
    // 0x6fcef8: LoadField: r1 = r2->field_7
    //     0x6fcef8: ldur            w1, [x2, #7]
    // 0x6fcefc: DecompressPointer r1
    //     0x6fcefc: add             x1, x1, HEAP, lsl #32
    // 0x6fcf00: StoreField: r0->field_13 = r1
    //     0x6fcf00: stur            w1, [x0, #0x13]
    // 0x6fcf04: str             x0, [SP]
    // 0x6fcf08: r0 = _interpolate()
    //     0x6fcf08: bl              #0x1fb13c  ; [dart:core] _StringBase::_interpolate
    // 0x6fcf0c: r1 = Null
    //     0x6fcf0c: mov             x1, NULL
    // 0x6fcf10: r2 = 2
    //     0x6fcf10: mov             x2, #2
    // 0x6fcf14: stur            x0, [fp, #-0x68]
    // 0x6fcf18: r0 = AllocateArray()
    //     0x6fcf18: bl              #0x74cc68  ; AllocateArrayStub
    // 0x6fcf1c: mov             x2, x0
    // 0x6fcf20: ldur            x0, [fp, #-0x68]
    // 0x6fcf24: stur            x2, [fp, #-0x70]
    // 0x6fcf28: StoreField: r2->field_f = r0
    //     0x6fcf28: stur            w0, [x2, #0xf]
    // 0x6fcf2c: r1 = <Object>
    //     0x6fcf2c: ldr             x1, [PP, #0x118]  ; [pp+0x118] TypeArguments: <Object>
    // 0x6fcf30: r0 = AllocateGrowableArray()
    //     0x6fcf30: bl              #0x74be54  ; AllocateGrowableArrayStub
    // 0x6fcf34: mov             x2, x0
    // 0x6fcf38: ldur            x0, [fp, #-0x70]
    // 0x6fcf3c: stur            x2, [fp, #-0x68]
    // 0x6fcf40: StoreField: r2->field_f = r0
    //     0x6fcf40: stur            w0, [x2, #0xf]
    // 0x6fcf44: r0 = 2
    //     0x6fcf44: mov             x0, #2
    // 0x6fcf48: StoreField: r2->field_b = r0
    //     0x6fcf48: stur            w0, [x2, #0xb]
    // 0x6fcf4c: r1 = <List<Object>>
    //     0x6fcf4c: ldr             x1, [PP, #0x22c8]  ; [pp+0x22c8] TypeArguments: <List<Object>>
    // 0x6fcf50: r0 = DB()
    //     0x6fcf50: bl              #0x6cf5e0  ; AllocateDBStub -> DB (size=0x14)
    // 0x6fcf54: mov             x1, x0
    // 0x6fcf58: r0 = true
    //     0x6fcf58: add             x0, NULL, #0x20  ; true
    // 0x6fcf5c: StoreField: r1->field_f = r0
    //     0x6fcf5c: stur            w0, [x1, #0xf]
    // 0x6fcf60: ldur            x0, [fp, #-0x68]
    // 0x6fcf64: StoreField: r1->field_b = r0
    //     0x6fcf64: stur            w0, [x1, #0xb]
    // 0x6fcf68: r0 = HB()
    //     0x6fcf68: bl              #0x6cf5d4  ; AllocateHBStub -> HB (size=0x18)
    // 0x6fcf6c: mov             x1, x0
    // 0x6fcf70: ldur            x0, [fp, #-0x58]
    // 0x6fcf74: StoreField: r1->field_7 = r0
    //     0x6fcf74: stur            w0, [x1, #7]
    // 0x6fcf78: ldur            x0, [fp, #-0x60]
    // 0x6fcf7c: StoreField: r1->field_b = r0
    //     0x6fcf7c: stur            w0, [x1, #0xb]
    // 0x6fcf80: r0 = "services library"
    //     0x6fcf80: ldr             x0, [PP, #0x3f70]  ; [pp+0x3f70] "services library"
    // 0x6fcf84: StoreField: r1->field_f = r0
    //     0x6fcf84: stur            w0, [x1, #0xf]
    // 0x6fcf88: r0 = false
    //     0x6fcf88: add             x0, NULL, #0x30  ; false
    // 0x6fcf8c: StoreField: r1->field_13 = r0
    //     0x6fcf8c: stur            w0, [x1, #0x13]
    // 0x6fcf90: str             x1, [SP]
    // 0x6fcf94: r0 = call 0x220f10
    //     0x6fcf94: bl              #0x220f10
    // 0x6fcf98: r0 = Null
    //     0x6fcf98: mov             x0, NULL
    // 0x6fcf9c: r0 = ReturnAsyncNotFuture()
    //     0x6fcf9c: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x6fcfa0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6fcfa0: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6fcfa4: b               #0x6fce38
  }
  [closure] Future<Null> <anonymous closure>(dynamic, ByteData?) async {
    // ** addr: 0x6fcfa8, size: 0x168
    // 0x6fcfa8: EnterFrame
    //     0x6fcfa8: stp             fp, lr, [SP, #-0x10]!
    //     0x6fcfac: mov             fp, SP
    // 0x6fcfb0: AllocStack(0x70)
    //     0x6fcfb0: sub             SP, SP, #0x70
    // 0x6fcfb4: SetupParameters(hba this /* r1, fp-0x60 */, dynamic _ /* r2, fp-0x58 */)
    //     0x6fcfb4: stur            NULL, [fp, #-8]
    //     0x6fcfb8: mov             x0, #0
    //     0x6fcfbc: add             x1, fp, w0, sxtw #2
    //     0x6fcfc0: ldr             x1, [x1, #0x18]
    //     0x6fcfc4: stur            x1, [fp, #-0x60]
    //     0x6fcfc8: add             x2, fp, w0, sxtw #2
    //     0x6fcfcc: ldr             x2, [x2, #0x10]
    //     0x6fcfd0: stur            x2, [fp, #-0x58]
    //     0x6fcfd4: ldur            w3, [x1, #0x17]
    //     0x6fcfd8: add             x3, x3, HEAP, lsl #32
    //     0x6fcfdc: stur            x3, [fp, #-0x50]
    // 0x6fcfe0: CheckStackOverflow
    //     0x6fcfe0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6fcfe4: cmp             SP, x16
    //     0x6fcfe8: b.ls            #0x6fd108
    // 0x6fcfec: InitAsync() -> Future<Null?>
    //     0x6fcfec: ldr             x0, [PP, #0xe28]  ; [pp+0xe28] TypeArguments: <Null?>
    //     0x6fcff0: bl              #0x6cb614  ; InitAsyncStub
    // 0x6fcff4: ldur            x0, [fp, #-0x58]
    // 0x6fcff8: cmp             w0, NULL
    // 0x6fcffc: b.ne            #0x6fd03c
    // 0x6fd000: ldur            x0, [fp, #-0x50]
    // 0x6fd004: ArrayLoad: r1 = r0[0]  ; List_4
    //     0x6fd004: ldur            w1, [x0, #0x17]
    // 0x6fd008: DecompressPointer r1
    //     0x6fd008: add             x1, x1, HEAP, lsl #32
    // 0x6fd00c: r16 = Sentinel
    //     0x6fd00c: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0x6fd010: cmp             w1, w16
    // 0x6fd014: b.ne            #0x6fd024
    // 0x6fd018: r16 = "controller"
    //     0x6fd018: ldr             x16, [PP, #0x3ba0]  ; [pp+0x3ba0] "controller"
    // 0x6fd01c: str             x16, [SP]
    // 0x6fd020: r0 = _throwLocalNotInitialized()
    //     0x6fd020: bl              #0x225c0c  ; [dart:_internal] LateError::_throwLocalNotInitialized
    // 0x6fd024: ldur            x1, [fp, #-0x50]
    // 0x6fd028: ArrayLoad: r0 = r1[0]  ; List_4
    //     0x6fd028: ldur            w0, [x1, #0x17]
    // 0x6fd02c: DecompressPointer r0
    //     0x6fd02c: add             x0, x0, HEAP, lsl #32
    // 0x6fd030: str             x0, [SP]
    // 0x6fd034: r0 = call 0x57f9a8
    //     0x6fd034: bl              #0x57f9a8
    // 0x6fd038: b               #0x6fd0f4
    // 0x6fd03c: ldur            x1, [fp, #-0x50]
    // 0x6fd040: ArrayLoad: r2 = r1[0]  ; List_4
    //     0x6fd040: ldur            w2, [x1, #0x17]
    // 0x6fd044: DecompressPointer r2
    //     0x6fd044: add             x2, x2, HEAP, lsl #32
    // 0x6fd048: r16 = Sentinel
    //     0x6fd048: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0x6fd04c: cmp             w2, w16
    // 0x6fd050: b.ne            #0x6fd060
    // 0x6fd054: r16 = "controller"
    //     0x6fd054: ldr             x16, [PP, #0x3ba0]  ; [pp+0x3ba0] "controller"
    // 0x6fd058: str             x16, [SP]
    // 0x6fd05c: r0 = _throwLocalNotInitialized()
    //     0x6fd05c: bl              #0x225c0c  ; [dart:_internal] LateError::_throwLocalNotInitialized
    // 0x6fd060: ldur            x0, [fp, #-0x50]
    // 0x6fd064: ArrayLoad: r1 = r0[0]  ; List_4
    //     0x6fd064: ldur            w1, [x0, #0x17]
    // 0x6fd068: DecompressPointer r1
    //     0x6fd068: add             x1, x1, HEAP, lsl #32
    // 0x6fd06c: stur            x1, [fp, #-0x60]
    // 0x6fd070: r16 = Instance_Xaa
    //     0x6fd070: add             x16, PP, #0x11, lsl #12  ; [pp+0x11d90] Obj!Xaa@4230d1
    //     0x6fd074: ldr             x16, [x16, #0xd90]
    // 0x6fd078: ldur            lr, [fp, #-0x58]
    // 0x6fd07c: stp             lr, x16, [SP]
    // 0x6fd080: r0 = call 0x683bb4
    //     0x6fd080: bl              #0x683bb4
    // 0x6fd084: ldur            x16, [fp, #-0x60]
    // 0x6fd088: stp             x0, x16, [SP]
    // 0x6fd08c: r0 = call 0x5a51b4
    //     0x6fd08c: bl              #0x5a51b4
    // 0x6fd090: b               #0x6fd0f4
    // 0x6fd094: sub             SP, fp, #0x70
    // 0x6fd098: stur            x0, [fp, #-0x50]
    // 0x6fd09c: r2 = 59
    //     0x6fd09c: mov             x2, #0x3b
    // 0x6fd0a0: branchIfSmi(r0, 0x6fd0ac)
    //     0x6fd0a0: tbz             w0, #0, #0x6fd0ac
    // 0x6fd0a4: r2 = LoadClassIdInstr(r0)
    //     0x6fd0a4: ldur            x2, [x0, #-1]
    //     0x6fd0a8: ubfx            x2, x2, #0xc, #0x14
    // 0x6fd0ac: cmp             x2, #0x587
    // 0x6fd0b0: b.ne            #0x6fd0fc
    // 0x6fd0b4: ldur            x1, [fp, #-0x28]
    // 0x6fd0b8: ArrayLoad: r2 = r1[0]  ; List_4
    //     0x6fd0b8: ldur            w2, [x1, #0x17]
    // 0x6fd0bc: DecompressPointer r2
    //     0x6fd0bc: add             x2, x2, HEAP, lsl #32
    // 0x6fd0c0: r16 = Sentinel
    //     0x6fd0c0: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0x6fd0c4: cmp             w2, w16
    // 0x6fd0c8: b.ne            #0x6fd0d8
    // 0x6fd0cc: r16 = "controller"
    //     0x6fd0cc: ldr             x16, [PP, #0x3ba0]  ; [pp+0x3ba0] "controller"
    // 0x6fd0d0: str             x16, [SP]
    // 0x6fd0d4: r0 = _throwLocalNotInitialized()
    //     0x6fd0d4: bl              #0x225c0c  ; [dart:_internal] LateError::_throwLocalNotInitialized
    // 0x6fd0d8: ldur            x0, [fp, #-0x28]
    // 0x6fd0dc: ArrayLoad: r1 = r0[0]  ; List_4
    //     0x6fd0dc: ldur            w1, [x0, #0x17]
    // 0x6fd0e0: DecompressPointer r1
    //     0x6fd0e0: add             x1, x1, HEAP, lsl #32
    // 0x6fd0e4: ldur            x16, [fp, #-0x50]
    // 0x6fd0e8: stp             x16, x1, [SP]
    // 0x6fd0ec: r4 = const [0, 0x2, 0x2, 0x2, null]
    //     0x6fd0ec: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    // 0x6fd0f0: r0 = call 0x5af204
    //     0x6fd0f0: bl              #0x5af204
    // 0x6fd0f4: r0 = Null
    //     0x6fd0f4: mov             x0, NULL
    // 0x6fd0f8: r0 = ReturnAsyncNotFuture()
    //     0x6fd0f8: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x6fd0fc: ldur            x0, [fp, #-0x50]
    // 0x6fd100: r0 = ReThrow()
    //     0x6fd100: bl              #0x74b234  ; ReThrowStub
    // 0x6fd104: brk             #0
    // 0x6fd108: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6fd108: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6fd10c: b               #0x6fcfec
  }
}

// class id: 1399, size: 0x14, field offset: 0x8
//   const constructor, 
class MethodChannel extends Object {

  _OneByteString field_8;
  Xaa field_c;

  [closure] Future<ByteData?> <anonymous closure>(dynamic, ByteData?) {
    // ** addr: 0x2a5afc, size: -0x1
  }
}

// class id: 1400, size: 0x14, field offset: 0x14
//   const constructor, 
class gba extends MethodChannel {

  _OneByteString field_8;
  Xaa field_c;
}

// class id: 1401, size: 0x18, field offset: 0x8
//   const constructor, 
class fba<X0> extends Object {

  _OneByteString field_c;
  Uaa field_10;

  [closure] Future<ByteData?> <anonymous closure>(dynamic, ByteData?) async {
    // ** addr: 0x75238c, size: 0xdc
    // 0x75238c: EnterFrame
    //     0x75238c: stp             fp, lr, [SP, #-0x10]!
    //     0x752390: mov             fp, SP
    // 0x752394: AllocStack(0x38)
    //     0x752394: sub             SP, SP, #0x38
    // 0x752398: SetupParameters(fba<X0> this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0x752398: stur            NULL, [fp, #-8]
    //     0x75239c: mov             x0, #0
    //     0x7523a0: add             x1, fp, w0, sxtw #2
    //     0x7523a4: ldr             x1, [x1, #0x18]
    //     0x7523a8: add             x2, fp, w0, sxtw #2
    //     0x7523ac: ldr             x2, [x2, #0x10]
    //     0x7523b0: stur            x2, [fp, #-0x18]
    //     0x7523b4: ldur            w3, [x1, #0x17]
    //     0x7523b8: add             x3, x3, HEAP, lsl #32
    //     0x7523bc: stur            x3, [fp, #-0x10]
    // 0x7523c0: CheckStackOverflow
    //     0x7523c0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x7523c4: cmp             SP, x16
    //     0x7523c8: b.ls            #0x752460
    // 0x7523cc: InitAsync() -> Future<ByteData?>
    //     0x7523cc: ldr             x0, [PP, #0x4e0]  ; [pp+0x4e0] TypeArguments: <ByteData?>
    //     0x7523d0: bl              #0x6cb614  ; InitAsyncStub
    // 0x7523d4: ldur            x1, [fp, #-0x10]
    // 0x7523d8: LoadField: r0 = r1->field_f
    //     0x7523d8: ldur            w0, [x1, #0xf]
    // 0x7523dc: DecompressPointer r0
    //     0x7523dc: add             x0, x0, HEAP, lsl #32
    // 0x7523e0: LoadField: r2 = r0->field_f
    //     0x7523e0: ldur            w2, [x0, #0xf]
    // 0x7523e4: DecompressPointer r2
    //     0x7523e4: add             x2, x2, HEAP, lsl #32
    // 0x7523e8: stur            x2, [fp, #-0x28]
    // 0x7523ec: LoadField: r3 = r1->field_13
    //     0x7523ec: ldur            w3, [x1, #0x13]
    // 0x7523f0: DecompressPointer r3
    //     0x7523f0: add             x3, x3, HEAP, lsl #32
    // 0x7523f4: stur            x3, [fp, #-0x20]
    // 0x7523f8: r0 = LoadClassIdInstr(r2)
    //     0x7523f8: ldur            x0, [x2, #-1]
    //     0x7523fc: ubfx            x0, x0, #0xc, #0x14
    // 0x752400: ldur            x16, [fp, #-0x18]
    // 0x752404: stp             x16, x2, [SP]
    // 0x752408: r0 = GDT[cid_x0 + -0xfca]()
    //     0x752408: sub             lr, x0, #0xfca
    //     0x75240c: ldr             lr, [x21, lr, lsl #3]
    //     0x752410: blr             lr
    // 0x752414: ldur            x16, [fp, #-0x20]
    // 0x752418: stp             x0, x16, [SP]
    // 0x75241c: ldur            x0, [fp, #-0x20]
    // 0x752420: ClosureCall
    //     0x752420: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    //     0x752424: ldur            x2, [x0, #0x1f]
    //     0x752428: blr             x2
    // 0x75242c: mov             x1, x0
    // 0x752430: stur            x1, [fp, #-0x18]
    // 0x752434: r0 = Await()
    //     0x752434: bl              #0x6cdaec  ; AwaitStub
    // 0x752438: mov             x1, x0
    // 0x75243c: ldur            x0, [fp, #-0x28]
    // 0x752440: r2 = LoadClassIdInstr(r0)
    //     0x752440: ldur            x2, [x0, #-1]
    //     0x752444: ubfx            x2, x2, #0xc, #0x14
    // 0x752448: stp             x1, x0, [SP]
    // 0x75244c: mov             x0, x2
    // 0x752450: r0 = GDT[cid_x0 + -0xf8e]()
    //     0x752450: sub             lr, x0, #0xf8e
    //     0x752454: ldr             lr, [x21, lr, lsl #3]
    //     0x752458: blr             lr
    // 0x75245c: r0 = ReturnAsyncNotFuture()
    //     0x75245c: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x752460: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x752460: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x752464: b               #0x7523cc
  }
}
