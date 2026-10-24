// lib: , url: ePh

// class id: 1049500, size: 0x8
class :: {
}

// class id: 303, size: 0x14, field offset: 0x8
class _iTa extends Object
    implements ka<X0> {
}

// class id: 304, size: 0x8, field offset: 0x8
//   const constructor, transformed mixin,
abstract class _gTa extends Object
     with Tt<X0, X1> {

  void []=(_gTa, String, dynamic) {
    // ** addr: 0x737730, size: 0x7c
    // 0x737730: EnterFrame
    //     0x737730: stp             fp, lr, [SP, #-0x10]!
    //     0x737734: mov             fp, SP
    // 0x737738: CheckStackOverflow
    //     0x737738: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x73773c: cmp             SP, x16
    //     0x737740: b.ls            #0x73778c
    // 0x737744: ldr             x0, [fp, #0x18]
    // 0x737748: r2 = Null
    //     0x737748: mov             x2, NULL
    // 0x73774c: r1 = Null
    //     0x73774c: mov             x1, NULL
    // 0x737750: r4 = 59
    //     0x737750: mov             x4, #0x3b
    // 0x737754: branchIfSmi(r0, 0x737760)
    //     0x737754: tbz             w0, #0, #0x737760
    // 0x737758: r4 = LoadClassIdInstr(r0)
    //     0x737758: ldur            x4, [x0, #-1]
    //     0x73775c: ubfx            x4, x4, #0xc, #0x14
    // 0x737760: sub             x4, x4, #0x5d
    // 0x737764: cmp             x4, #3
    // 0x737768: b.ls            #0x73777c
    // 0x73776c: r8 = String
    //     0x73776c: ldr             x8, [PP, #0x2d0]  ; [pp+0x2d0] Type: String
    // 0x737770: r3 = Null
    //     0x737770: add             x3, PP, #0x1f, lsl #12  ; [pp+0x1f748] Null
    //     0x737774: ldr             x3, [x3, #0x748]
    // 0x737778: r0 = String()
    //     0x737778: bl              #0x758160  ; IsType_String_Stub
    // 0x73777c: r0 = call 0x5d0374
    //     0x73777c: bl              #0x5d0374
    // 0x737780: LeaveFrame
    //     0x737780: mov             SP, fp
    //     0x737784: ldp             fp, lr, [SP], #0x10
    // 0x737788: ret
    //     0x737788: ret             
    // 0x73778c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x73778c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x737790: b               #0x737744
  }
}

// class id: 305, size: 0x8, field offset: 0x8
//   const constructor, transformed mixin,
abstract class _hTa extends _gTa
     with C<X0, X1> {

  Map<Y0, Y1> Fk<Y0, Y1>(_hTa) {
    // ** addr: 0x7345e0, size: 0x84
    // 0x7345e0: EnterFrame
    //     0x7345e0: stp             fp, lr, [SP, #-0x10]!
    //     0x7345e4: mov             fp, SP
    // 0x7345e8: AllocStack(0x10)
    //     0x7345e8: sub             SP, SP, #0x10
    // 0x7345ec: SetupParameters()
    //     0x7345ec: mov             x0, x4
    //     0x7345f0: ldur            w1, [x0, #0xf]
    //     0x7345f4: add             x1, x1, HEAP, lsl #32
    //     0x7345f8: cbnz            w1, #0x734604
    //     0x7345fc: mov             x1, NULL
    //     0x734600: b               #0x734618
    //     0x734604: ldur            w1, [x0, #0x17]
    //     0x734608: add             x1, x1, HEAP, lsl #32
    //     0x73460c: add             x0, fp, w1, sxtw #2
    //     0x734610: ldr             x0, [x0, #0x10]
    //     0x734614: mov             x1, x0
    // 0x734618: CheckStackOverflow
    //     0x734618: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x73461c: cmp             SP, x16
    //     0x734620: b.ls            #0x73465c
    // 0x734624: r2 = Null
    //     0x734624: mov             x2, NULL
    // 0x734628: r3 = <String, dynamic, Y0, Y1>
    //     0x734628: add             x3, PP, #0x1f, lsl #12  ; [pp+0x1f7d8] TypeArguments: <String, dynamic, Y0, Y1>
    //     0x73462c: ldr             x3, [x3, #0x7d8]
    // 0x734630: r30 = InstantiateTypeArgumentsStub
    //     0x734630: ldr             lr, [PP, #0x320]  ; [pp+0x320] Stub: InstantiateTypeArguments (0x1e0e6c)
    // 0x734634: LoadField: r30 = r30->field_7
    //     0x734634: ldur            lr, [lr, #7]
    // 0x734638: blr             lr
    // 0x73463c: ldr             x16, [fp, #0x10]
    // 0x734640: stp             x16, x0, [SP]
    // 0x734644: r4 = const [0x4, 0x1, 0x1, 0x1, null]
    //     0x734644: add             x4, PP, #9, lsl #12  ; [pp+0x9a70] List(5) [0x4, 0x1, 0x1, 0x1, Null]
    //     0x734648: ldr             x4, [x4, #0xa70]
    // 0x73464c: r0 = call 0x59636c
    //     0x73464c: bl              #0x59636c
    // 0x734650: LeaveFrame
    //     0x734650: mov             SP, fp
    //     0x734654: ldp             fp, lr, [SP], #0x10
    // 0x734658: ret
    //     0x734658: ret             
    // 0x73465c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x73465c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x734660: b               #0x734624
  }
  bool nl(_hTa, Object?) {
    // ** addr: 0x734d5c, size: 0x64
    // 0x734d5c: EnterFrame
    //     0x734d5c: stp             fp, lr, [SP, #-0x10]!
    //     0x734d60: mov             fp, SP
    // 0x734d64: AllocStack(0x10)
    //     0x734d64: sub             SP, SP, #0x10
    // 0x734d68: CheckStackOverflow
    //     0x734d68: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x734d6c: cmp             SP, x16
    //     0x734d70: b.ls            #0x734da0
    // 0x734d74: ldr             x0, [fp, #0x18]
    // 0x734d78: LoadField: r1 = r0->field_7
    //     0x734d78: ldur            w1, [x0, #7]
    // 0x734d7c: DecompressPointer r1
    //     0x734d7c: add             x1, x1, HEAP, lsl #32
    // 0x734d80: LoadField: r0 = r1->field_7
    //     0x734d80: ldur            w0, [x1, #7]
    // 0x734d84: DecompressPointer r0
    //     0x734d84: add             x0, x0, HEAP, lsl #32
    // 0x734d88: ldr             x16, [fp, #0x10]
    // 0x734d8c: stp             x16, x0, [SP]
    // 0x734d90: r0 = call 0x3cc258
    //     0x734d90: bl              #0x3cc258
    // 0x734d94: LeaveFrame
    //     0x734d94: mov             SP, fp
    //     0x734d98: ldp             fp, lr, [SP], #0x10
    // 0x734d9c: ret
    //     0x734d9c: ret             
    // 0x734da0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x734da0: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x734da4: b               #0x734d74
  }
  [closure] Qa<String, dynamic> <anonymous closure>(dynamic, String) {
    // ** addr: 0x5f9330, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, String, dynamic) {
    // ** addr: 0x5f1838, size: -0x1
  }
}

// class id: 306, size: 0x10, field offset: 0x8
class Zw extends _hTa
    implements Map<X0, X1> {

  dynamic [](Zw, Object?) {
    // ** addr: 0x7377ac, size: 0x154
    // 0x7377ac: EnterFrame
    //     0x7377ac: stp             fp, lr, [SP, #-0x10]!
    //     0x7377b0: mov             fp, SP
    // 0x7377b4: AllocStack(0x10)
    //     0x7377b4: sub             SP, SP, #0x10
    // 0x7377b8: CheckStackOverflow
    //     0x7377b8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x7377bc: cmp             SP, x16
    //     0x7377c0: b.ls            #0x7378d8
    // 0x7377c4: ldr             x0, [fp, #0x10]
    // 0x7377c8: r1 = 59
    //     0x7377c8: mov             x1, #0x3b
    // 0x7377cc: branchIfSmi(r0, 0x7377d8)
    //     0x7377cc: tbz             w0, #0, #0x7377d8
    // 0x7377d0: r1 = LoadClassIdInstr(r0)
    //     0x7377d0: ldur            x1, [x0, #-1]
    //     0x7377d4: ubfx            x1, x1, #0xc, #0x14
    // 0x7377d8: sub             x16, x1, #0x5d
    // 0x7377dc: cmp             x16, #3
    // 0x7377e0: b.ls            #0x737848
    // 0x7377e4: sub             x16, x1, #0x3b
    // 0x7377e8: cmp             x16, #1
    // 0x7377ec: b.hi            #0x737838
    // 0x7377f0: ldr             x1, [fp, #0x18]
    // 0x7377f4: LoadField: r2 = r1->field_b
    //     0x7377f4: ldur            w2, [x1, #0xb]
    // 0x7377f8: DecompressPointer r2
    //     0x7377f8: add             x2, x2, HEAP, lsl #32
    // 0x7377fc: LoadField: r1 = r2->field_b
    //     0x7377fc: ldur            w1, [x2, #0xb]
    // 0x737800: DecompressPointer r1
    //     0x737800: add             x1, x1, HEAP, lsl #32
    // 0x737804: r3 = LoadInt32Instr(r0)
    //     0x737804: sbfx            x3, x0, #1, #0x1f
    //     0x737808: tbz             w0, #0, #0x737810
    //     0x73780c: ldur            x3, [x0, #7]
    // 0x737810: r0 = LoadInt32Instr(r1)
    //     0x737810: sbfx            x0, x1, #1, #0x1f
    // 0x737814: mov             x1, x3
    // 0x737818: cmp             x1, x0
    // 0x73781c: b.hs            #0x7378e0
    // 0x737820: ArrayLoad: r0 = r2[r3]  ; Unknown_4
    //     0x737820: add             x16, x2, x3, lsl #2
    //     0x737824: ldur            w0, [x16, #0xf]
    // 0x737828: DecompressPointer r0
    //     0x737828: add             x0, x0, HEAP, lsl #32
    // 0x73782c: LeaveFrame
    //     0x73782c: mov             SP, fp
    //     0x737830: ldp             fp, lr, [SP], #0x10
    // 0x737834: ret
    //     0x737834: ret             
    // 0x737838: r0 = Null
    //     0x737838: mov             x0, NULL
    // 0x73783c: LeaveFrame
    //     0x73783c: mov             SP, fp
    //     0x737840: ldp             fp, lr, [SP], #0x10
    // 0x737844: ret
    //     0x737844: ret             
    // 0x737848: ldr             x1, [fp, #0x18]
    // 0x73784c: LoadField: r2 = r1->field_7
    //     0x73784c: ldur            w2, [x1, #7]
    // 0x737850: DecompressPointer r2
    //     0x737850: add             x2, x2, HEAP, lsl #32
    // 0x737854: LoadField: r3 = r2->field_b
    //     0x737854: ldur            w3, [x2, #0xb]
    // 0x737858: DecompressPointer r3
    //     0x737858: add             x3, x3, HEAP, lsl #32
    // 0x73785c: r2 = LoadClassIdInstr(r3)
    //     0x73785c: ldur            x2, [x3, #-1]
    //     0x737860: ubfx            x2, x2, #0xc, #0x14
    // 0x737864: stp             x0, x3, [SP]
    // 0x737868: mov             x0, x2
    // 0x73786c: r0 = GDT[cid_x0 + -0x12d]()
    //     0x73786c: sub             lr, x0, #0x12d
    //     0x737870: ldr             lr, [x21, lr, lsl #3]
    //     0x737874: blr             lr
    // 0x737878: cmp             w0, NULL
    // 0x73787c: b.ne            #0x737890
    // 0x737880: r0 = Null
    //     0x737880: mov             x0, NULL
    // 0x737884: LeaveFrame
    //     0x737884: mov             SP, fp
    //     0x737888: ldp             fp, lr, [SP], #0x10
    // 0x73788c: ret
    //     0x73788c: ret             
    // 0x737890: ldr             x2, [fp, #0x18]
    // 0x737894: LoadField: r3 = r2->field_b
    //     0x737894: ldur            w3, [x2, #0xb]
    // 0x737898: DecompressPointer r3
    //     0x737898: add             x3, x3, HEAP, lsl #32
    // 0x73789c: LoadField: r2 = r3->field_b
    //     0x73789c: ldur            w2, [x3, #0xb]
    // 0x7378a0: DecompressPointer r2
    //     0x7378a0: add             x2, x2, HEAP, lsl #32
    // 0x7378a4: r4 = LoadInt32Instr(r0)
    //     0x7378a4: sbfx            x4, x0, #1, #0x1f
    //     0x7378a8: tbz             w0, #0, #0x7378b0
    //     0x7378ac: ldur            x4, [x0, #7]
    // 0x7378b0: r0 = LoadInt32Instr(r2)
    //     0x7378b0: sbfx            x0, x2, #1, #0x1f
    // 0x7378b4: mov             x1, x4
    // 0x7378b8: cmp             x1, x0
    // 0x7378bc: b.hs            #0x7378e4
    // 0x7378c0: ArrayLoad: r0 = r3[r4]  ; Unknown_4
    //     0x7378c0: add             x16, x3, x4, lsl #2
    //     0x7378c4: ldur            w0, [x16, #0xf]
    // 0x7378c8: DecompressPointer r0
    //     0x7378c8: add             x0, x0, HEAP, lsl #32
    // 0x7378cc: LeaveFrame
    //     0x7378cc: mov             SP, fp
    //     0x7378d0: ldp             fp, lr, [SP], #0x10
    // 0x7378d4: ret
    //     0x7378d4: ret             
    // 0x7378d8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7378d8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7378dc: b               #0x7377c4
    // 0x7378e0: r0 = RangeErrorSharedWithoutFPURegs()
    //     0x7378e0: bl              #0x74d1ac  ; RangeErrorSharedWithoutFPURegsStub
    // 0x7378e4: r0 = RangeErrorSharedWithoutFPURegs()
    //     0x7378e4: bl              #0x74d1ac  ; RangeErrorSharedWithoutFPURegsStub
  }
}

// class id: 307, size: 0x10, field offset: 0x8
abstract class cTa extends Object {
}

// class id: 308, size: 0x10, field offset: 0x10
//   transformed mixin,
abstract class _dTa extends cTa
     with B<X0> {

  List<Y0> Fk<Y0>(_dTa) {
    // ** addr: 0x6e3158, size: 0x80
    // 0x6e3158: EnterFrame
    //     0x6e3158: stp             fp, lr, [SP, #-0x10]!
    //     0x6e315c: mov             fp, SP
    // 0x6e3160: AllocStack(0x10)
    //     0x6e3160: sub             SP, SP, #0x10
    // 0x6e3164: SetupParameters()
    //     0x6e3164: mov             x0, x4
    //     0x6e3168: ldur            w1, [x0, #0xf]
    //     0x6e316c: add             x1, x1, HEAP, lsl #32
    //     0x6e3170: cbnz            w1, #0x6e317c
    //     0x6e3174: mov             x1, NULL
    //     0x6e3178: b               #0x6e3190
    //     0x6e317c: ldur            w1, [x0, #0x17]
    //     0x6e3180: add             x1, x1, HEAP, lsl #32
    //     0x6e3184: add             x0, fp, w1, sxtw #2
    //     0x6e3188: ldr             x0, [x0, #0x10]
    //     0x6e318c: mov             x1, x0
    // 0x6e3190: CheckStackOverflow
    //     0x6e3190: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6e3194: cmp             SP, x16
    //     0x6e3198: b.ls            #0x6e31d0
    // 0x6e319c: r2 = Null
    //     0x6e319c: mov             x2, NULL
    // 0x6e31a0: r3 = <Zw, Y0>
    //     0x6e31a0: add             x3, PP, #0x1f, lsl #12  ; [pp+0x1f6f8] TypeArguments: <Zw, Y0>
    //     0x6e31a4: ldr             x3, [x3, #0x6f8]
    // 0x6e31a8: r30 = InstantiateTypeArgumentsStub
    //     0x6e31a8: ldr             lr, [PP, #0x320]  ; [pp+0x320] Stub: InstantiateTypeArguments (0x1e0e6c)
    // 0x6e31ac: LoadField: r30 = r30->field_7
    //     0x6e31ac: ldur            lr, [lr, #7]
    // 0x6e31b0: blr             lr
    // 0x6e31b4: ldr             x16, [fp, #0x10]
    // 0x6e31b8: stp             x16, x0, [SP]
    // 0x6e31bc: r4 = const [0x2, 0x1, 0x1, 0x1, null]
    //     0x6e31bc: ldr             x4, [PP, #0x39e0]  ; [pp+0x39e0] List(5) [0x2, 0x1, 0x1, 0x1, Null]
    // 0x6e31c0: r0 = call 0x331664
    //     0x6e31c0: bl              #0x331664
    // 0x6e31c4: LeaveFrame
    //     0x6e31c4: mov             SP, fp
    //     0x6e31c8: ldp             fp, lr, [SP], #0x10
    // 0x6e31cc: ret
    //     0x6e31cc: ret             
    // 0x6e31d0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6e31d0: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6e31d4: b               #0x6e319c
  }
  List<Zw> +(_dTa, List<Zw>) {
    // ** addr: 0x6e1980, size: 0x78
    // 0x6e1980: EnterFrame
    //     0x6e1980: stp             fp, lr, [SP, #-0x10]!
    //     0x6e1984: mov             fp, SP
    // 0x6e1988: AllocStack(0x10)
    //     0x6e1988: sub             SP, SP, #0x10
    // 0x6e198c: CheckStackOverflow
    //     0x6e198c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6e1990: cmp             SP, x16
    //     0x6e1994: b.ls            #0x6e19d8
    // 0x6e1998: ldr             x0, [fp, #0x10]
    // 0x6e199c: r2 = Null
    //     0x6e199c: mov             x2, NULL
    // 0x6e19a0: r1 = Null
    //     0x6e19a0: mov             x1, NULL
    // 0x6e19a4: r8 = List<Zw>
    //     0x6e19a4: add             x8, PP, #0x27, lsl #12  ; [pp+0x279a8] Type: List<Zw>
    //     0x6e19a8: ldr             x8, [x8, #0x9a8]
    // 0x6e19ac: r3 = Null
    //     0x6e19ac: add             x3, PP, #0x27, lsl #12  ; [pp+0x279b0] Null
    //     0x6e19b0: ldr             x3, [x3, #0x9b0]
    // 0x6e19b4: r0 = List<Zw>()
    //     0x6e19b4: bl              #0x6d391c  ; IsType_List<Zw>_Stub
    // 0x6e19b8: r16 = <Zw>
    //     0x6e19b8: add             x16, PP, #0x1a, lsl #12  ; [pp+0x1a9a0] TypeArguments: <Zw>
    //     0x6e19bc: ldr             x16, [x16, #0x9a0]
    // 0x6e19c0: ldr             lr, [fp, #0x18]
    // 0x6e19c4: stp             lr, x16, [SP]
    // 0x6e19c8: r0 = call 0x1f90e4
    //     0x6e19c8: bl              #0x1f90e4
    // 0x6e19cc: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x6e19cc: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x6e19d0: r0 = Throw()
    //     0x6e19d0: bl              #0x74b258  ; ThrowStub
    // 0x6e19d4: brk             #0
    // 0x6e19d8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6e19d8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6e19dc: b               #0x6e1998
  }
  [closure] bool hk(dynamic, Object?) {
    // ** addr: 0x32b068, size: -0x1
  }
}

// class id: 309, size: 0x10, field offset: 0x10
//   transformed mixin,
abstract class _eTa extends _dTa
     with Ot<X0> {
}

// class id: 310, size: 0x14, field offset: 0x10
class fTa extends _eTa
    implements Iterable<X0> {

  void []=(fTa, int, Zw) {
    // ** addr: 0x7344c4, size: 0xac
    // 0x7344c4: EnterFrame
    //     0x7344c4: stp             fp, lr, [SP, #-0x10]!
    //     0x7344c8: mov             fp, SP
    // 0x7344cc: ldr             x0, [fp, #0x18]
    // 0x7344d0: r2 = Null
    //     0x7344d0: mov             x2, NULL
    // 0x7344d4: r1 = Null
    //     0x7344d4: mov             x1, NULL
    // 0x7344d8: branchIfSmi(r0, 0x734500)
    //     0x7344d8: tbz             w0, #0, #0x734500
    // 0x7344dc: r4 = LoadClassIdInstr(r0)
    //     0x7344dc: ldur            x4, [x0, #-1]
    //     0x7344e0: ubfx            x4, x4, #0xc, #0x14
    // 0x7344e4: sub             x4, x4, #0x3b
    // 0x7344e8: cmp             x4, #1
    // 0x7344ec: b.ls            #0x734500
    // 0x7344f0: r8 = int
    //     0x7344f0: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x7344f4: r3 = Null
    //     0x7344f4: add             x3, PP, #0x30, lsl #12  ; [pp+0x30b48] Null
    //     0x7344f8: ldr             x3, [x3, #0xb48]
    // 0x7344fc: r0 = int()
    //     0x7344fc: bl              #0x7586bc  ; IsType_int_Stub
    // 0x734500: ldr             x0, [fp, #0x10]
    // 0x734504: r2 = Null
    //     0x734504: mov             x2, NULL
    // 0x734508: r1 = Null
    //     0x734508: mov             x1, NULL
    // 0x73450c: r4 = 59
    //     0x73450c: mov             x4, #0x3b
    // 0x734510: branchIfSmi(r0, 0x73451c)
    //     0x734510: tbz             w0, #0, #0x73451c
    // 0x734514: r4 = LoadClassIdInstr(r0)
    //     0x734514: ldur            x4, [x0, #-1]
    //     0x734518: ubfx            x4, x4, #0xc, #0x14
    // 0x73451c: cmp             x4, #0x132
    // 0x734520: b.eq            #0x734538
    // 0x734524: r8 = Zw
    //     0x734524: add             x8, PP, #0x1f, lsl #12  ; [pp+0x1f718] Type: Zw
    //     0x734528: ldr             x8, [x8, #0x718]
    // 0x73452c: r3 = Null
    //     0x73452c: add             x3, PP, #0x30, lsl #12  ; [pp+0x30b58] Null
    //     0x734530: ldr             x3, [x3, #0xb58]
    // 0x734534: r0 = Zw()
    //     0x734534: bl              #0x6d3840  ; IsType_Zw_Stub
    // 0x734538: r0 = UnsupportedError()
    //     0x734538: bl              #0x6c8be8  ; AllocateUnsupportedErrorStub -> UnsupportedError (size=0x10)
    // 0x73453c: mov             x1, x0
    // 0x734540: r0 = "Can\'t change rows from a result set"
    //     0x734540: add             x0, PP, #0x1f, lsl #12  ; [pp+0x1f6f0] "Can\'t change rows from a result set"
    //     0x734544: ldr             x0, [x0, #0x6f0]
    // 0x734548: StoreField: r1->field_b = r0
    //     0x734548: stur            w0, [x1, #0xb]
    // 0x73454c: mov             x0, x1
    // 0x734550: r0 = Throw()
    //     0x734550: bl              #0x74b258  ; ThrowStub
    // 0x734554: brk             #0
  }
  Zw [](fTa, int) {
    // ** addr: 0x734570, size: 0x88
    // 0x734570: EnterFrame
    //     0x734570: stp             fp, lr, [SP, #-0x10]!
    //     0x734574: mov             fp, SP
    // 0x734578: AllocStack(0x10)
    //     0x734578: sub             SP, SP, #0x10
    // 0x73457c: CheckStackOverflow
    //     0x73457c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x734580: cmp             SP, x16
    //     0x734584: b.ls            #0x7345d8
    // 0x734588: ldr             x0, [fp, #0x10]
    // 0x73458c: r2 = Null
    //     0x73458c: mov             x2, NULL
    // 0x734590: r1 = Null
    //     0x734590: mov             x1, NULL
    // 0x734594: branchIfSmi(r0, 0x7345bc)
    //     0x734594: tbz             w0, #0, #0x7345bc
    // 0x734598: r4 = LoadClassIdInstr(r0)
    //     0x734598: ldur            x4, [x0, #-1]
    //     0x73459c: ubfx            x4, x4, #0xc, #0x14
    // 0x7345a0: sub             x4, x4, #0x3b
    // 0x7345a4: cmp             x4, #1
    // 0x7345a8: b.ls            #0x7345bc
    // 0x7345ac: r8 = int
    //     0x7345ac: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x7345b0: r3 = Null
    //     0x7345b0: add             x3, PP, #0x1f, lsl #12  ; [pp+0x1f730] Null
    //     0x7345b4: ldr             x3, [x3, #0x730]
    // 0x7345b8: r0 = int()
    //     0x7345b8: bl              #0x7586bc  ; IsType_int_Stub
    // 0x7345bc: ldr             x16, [fp, #0x18]
    // 0x7345c0: ldr             lr, [fp, #0x10]
    // 0x7345c4: stp             lr, x16, [SP]
    // 0x7345c8: r0 = call 0x698d3c
    //     0x7345c8: bl              #0x698d3c
    // 0x7345cc: LeaveFrame
    //     0x7345cc: mov             SP, fp
    //     0x7345d0: ldp             fp, lr, [SP], #0x10
    // 0x7345d4: ret
    //     0x7345d4: ret             
    // 0x7345d8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7345d8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7345dc: b               #0x734588
  }
}
