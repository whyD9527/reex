// lib: , url: wHh

// class id: 1049128, size: 0x8
class :: {
}

// class id: 800, size: 0x10, field offset: 0x8
class Uya extends Object {
}

// class id: 801, size: 0x8, field offset: 0x8
//   const constructor, transformed mixin,
abstract class _Sya extends Object
     with _Rya {

  bool nl(_Sya, Mya<Object?, Object?>) {
    // ** addr: 0x6f4728, size: 0x90
    // 0x6f4728: EnterFrame
    //     0x6f4728: stp             fp, lr, [SP, #-0x10]!
    //     0x6f472c: mov             fp, SP
    // 0x6f4730: AllocStack(0x10)
    //     0x6f4730: sub             SP, SP, #0x10
    // 0x6f4734: CheckStackOverflow
    //     0x6f4734: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6f4738: cmp             SP, x16
    //     0x6f473c: b.ls            #0x6f4798
    // 0x6f4740: ldr             x0, [fp, #0x10]
    // 0x6f4744: r2 = Null
    //     0x6f4744: mov             x2, NULL
    // 0x6f4748: r1 = Null
    //     0x6f4748: mov             x1, NULL
    // 0x6f474c: r4 = 59
    //     0x6f474c: mov             x4, #0x3b
    // 0x6f4750: branchIfSmi(r0, 0x6f475c)
    //     0x6f4750: tbz             w0, #0, #0x6f475c
    // 0x6f4754: r4 = LoadClassIdInstr(r0)
    //     0x6f4754: ldur            x4, [x0, #-1]
    //     0x6f4758: ubfx            x4, x4, #0xc, #0x14
    // 0x6f475c: sub             x4, x4, #0x326
    // 0x6f4760: cmp             x4, #7
    // 0x6f4764: b.ls            #0x6f477c
    // 0x6f4768: r8 = Mya<Object?, Object?>
    //     0x6f4768: add             x8, PP, #0xe, lsl #12  ; [pp+0xe248] Type: Mya<Object?, Object?>
    //     0x6f476c: ldr             x8, [x8, #0x248]
    // 0x6f4770: r3 = Null
    //     0x6f4770: add             x3, PP, #0x2e, lsl #12  ; [pp+0x2eda0] Null
    //     0x6f4774: ldr             x3, [x3, #0xda0]
    // 0x6f4778: r0 = Mya<Object?, Object?>()
    //     0x6f4778: bl              #0x6f47a0  ; IsType_Mya<Object?, Object?>_Stub
    // 0x6f477c: ldr             x16, [fp, #0x18]
    // 0x6f4780: ldr             lr, [fp, #0x10]
    // 0x6f4784: stp             lr, x16, [SP]
    // 0x6f4788: r0 = <anonymous closure>()
    //     0x6f4788: bl              #0x1fc72c  ; [ONh] rza::<anonymous closure>
    // 0x6f478c: LeaveFrame
    //     0x6f478c: mov             SP, fp
    //     0x6f4790: ldp             fp, lr, [SP], #0x10
    // 0x6f4794: ret
    //     0x6f4794: ret             
    // 0x6f4798: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6f4798: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6f479c: b               #0x6f4740
  }
}

// class id: 802, size: 0x1c, field offset: 0x8
class Vya extends _Sya {

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x6fba1c, size: 0x1a8
    // 0x6fba1c: EnterFrame
    //     0x6fba1c: stp             fp, lr, [SP, #-0x10]!
    //     0x6fba20: mov             fp, SP
    // 0x6fba24: AllocStack(0x30)
    //     0x6fba24: sub             SP, SP, #0x30
    // 0x6fba28: SetupParameters(Vya this /* r1 */)
    //     0x6fba28: stur            NULL, [fp, #-8]
    //     0x6fba2c: mov             x0, #0
    //     0x6fba30: add             x1, fp, w0, sxtw #2
    //     0x6fba34: ldr             x1, [x1, #0x10]
    //     0x6fba38: ldur            w2, [x1, #0x17]
    //     0x6fba3c: add             x2, x2, HEAP, lsl #32
    //     0x6fba40: stur            x2, [fp, #-0x10]
    // 0x6fba44: CheckStackOverflow
    //     0x6fba44: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6fba48: cmp             SP, x16
    //     0x6fba4c: b.ls            #0x6fbbbc
    // 0x6fba50: InitAsync() -> Future<void?>
    //     0x6fba50: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x6fba54: bl              #0x6cb614  ; InitAsyncStub
    // 0x6fba58: ldur            x0, [fp, #-0x10]
    // 0x6fba5c: LoadField: r1 = r0->field_f
    //     0x6fba5c: ldur            w1, [x0, #0xf]
    // 0x6fba60: DecompressPointer r1
    //     0x6fba60: add             x1, x1, HEAP, lsl #32
    // 0x6fba64: stur            x1, [fp, #-0x18]
    // 0x6fba68: r0 = Tya()
    //     0x6fba68: bl              #0x6fc54c  ; AllocateTyaStub -> Tya (size=0x14)
    // 0x6fba6c: stur            x0, [fp, #-0x20]
    // 0x6fba70: ldur            x16, [fp, #-0x18]
    // 0x6fba74: stp             x16, x0, [SP]
    // 0x6fba78: r0 = call 0x3a3d34
    //     0x6fba78: bl              #0x3a3d34
    // 0x6fba7c: ldur            x1, [fp, #-0x10]
    // 0x6fba80: LoadField: r0 = r1->field_13
    //     0x6fba80: ldur            w0, [x1, #0x13]
    // 0x6fba84: DecompressPointer r0
    //     0x6fba84: add             x0, x0, HEAP, lsl #32
    // 0x6fba88: ldur            x16, [fp, #-0x20]
    // 0x6fba8c: stp             x16, x0, [SP]
    // 0x6fba90: ClosureCall
    //     0x6fba90: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    //     0x6fba94: ldur            x2, [x0, #0x1f]
    //     0x6fba98: blr             x2
    // 0x6fba9c: mov             x3, x0
    // 0x6fbaa0: r2 = Null
    //     0x6fbaa0: mov             x2, NULL
    // 0x6fbaa4: r1 = Null
    //     0x6fbaa4: mov             x1, NULL
    // 0x6fbaa8: stur            x3, [fp, #-0x18]
    // 0x6fbaac: cmp             w0, NULL
    // 0x6fbab0: b.eq            #0x6fbb34
    // 0x6fbab4: branchIfSmi(r0, 0x6fbb34)
    //     0x6fbab4: tbz             w0, #0, #0x6fbb34
    // 0x6fbab8: r4 = LoadClassIdInstr(r0)
    //     0x6fbab8: ldur            x4, [x0, #-1]
    //     0x6fbabc: ubfx            x4, x4, #0xc, #0x14
    // 0x6fbac0: ldr             x3, [THR, #0x6e8]  ; THR::isolate_group
    // 0x6fbac4: ldr             x3, [x3, #0x18]
    // 0x6fbac8: ldr             x3, [x3, x4, lsl #3]
    // 0x6fbacc: LoadField: r3 = r3->field_2b
    //     0x6fbacc: ldur            w3, [x3, #0x2b]
    // 0x6fbad0: DecompressPointer r3
    //     0x6fbad0: add             x3, x3, HEAP, lsl #32
    // 0x6fbad4: cmp             w3, NULL
    // 0x6fbad8: b.eq            #0x6fbb34
    // 0x6fbadc: LoadField: r3 = r3->field_f
    //     0x6fbadc: ldur            w3, [x3, #0xf]
    // 0x6fbae0: lsr             x3, x3, #4
    // 0x6fbae4: r17 = 4671
    //     0x6fbae4: mov             x17, #0x123f
    // 0x6fbae8: cmp             x3, x17
    // 0x6fbaec: b.eq            #0x6fbb3c
    // 0x6fbaf0: r3 = SubtypeTestCache
    //     0x6fbaf0: add             x3, PP, #0xf, lsl #12  ; [pp+0xf3f8] SubtypeTestCache
    //     0x6fbaf4: ldr             x3, [x3, #0x3f8]
    // 0x6fbaf8: r30 = Subtype1TestCacheStub
    //     0x6fbaf8: ldr             lr, [PP, #0x860]  ; [pp+0x860] Stub: Subtype1TestCache (0x1f2f98)
    // 0x6fbafc: LoadField: r30 = r30->field_7
    //     0x6fbafc: ldur            lr, [lr, #7]
    // 0x6fbb00: blr             lr
    // 0x6fbb04: cmp             w7, NULL
    // 0x6fbb08: b.eq            #0x6fbb14
    // 0x6fbb0c: tbnz            w7, #4, #0x6fbb34
    // 0x6fbb10: b               #0x6fbb3c
    // 0x6fbb14: r8 = Future<void?>
    //     0x6fbb14: add             x8, PP, #0xf, lsl #12  ; [pp+0xf400] Type: Future<void?>
    //     0x6fbb18: ldr             x8, [x8, #0x400]
    // 0x6fbb1c: r3 = SubtypeTestCache
    //     0x6fbb1c: add             x3, PP, #0xf, lsl #12  ; [pp+0xf408] SubtypeTestCache
    //     0x6fbb20: ldr             x3, [x3, #0x408]
    // 0x6fbb24: r30 = InstanceOfStub
    //     0x6fbb24: ldr             lr, [PP, #0x368]  ; [pp+0x368] Stub: InstanceOf (0x1e1284)
    // 0x6fbb28: LoadField: r30 = r30->field_7
    //     0x6fbb28: ldur            lr, [lr, #7]
    // 0x6fbb2c: blr             lr
    // 0x6fbb30: b               #0x6fbb40
    // 0x6fbb34: r0 = false
    //     0x6fbb34: add             x0, NULL, #0x30  ; false
    // 0x6fbb38: b               #0x6fbb40
    // 0x6fbb3c: r0 = true
    //     0x6fbb3c: add             x0, NULL, #0x20  ; true
    // 0x6fbb40: tbnz            w0, #4, #0x6fbb4c
    // 0x6fbb44: ldur            x0, [fp, #-0x18]
    // 0x6fbb48: r0 = Await()
    //     0x6fbb48: bl              #0x6cdaec  ; AwaitStub
    // 0x6fbb4c: ldur            x0, [fp, #-0x10]
    // 0x6fbb50: ldur            x16, [fp, #-0x20]
    // 0x6fbb54: str             x16, [SP]
    // 0x6fbb58: r0 = call 0x3a3d1c
    //     0x6fbb58: bl              #0x3a3d1c
    // 0x6fbb5c: ldur            x0, [fp, #-0x10]
    // 0x6fbb60: LoadField: r1 = r0->field_f
    //     0x6fbb60: ldur            w1, [x0, #0xf]
    // 0x6fbb64: DecompressPointer r1
    //     0x6fbb64: add             x1, x1, HEAP, lsl #32
    // 0x6fbb68: LoadField: r2 = r1->field_b
    //     0x6fbb68: ldur            w2, [x1, #0xb]
    // 0x6fbb6c: DecompressPointer r2
    //     0x6fbb6c: add             x2, x2, HEAP, lsl #32
    // 0x6fbb70: stur            x2, [fp, #-0x18]
    // 0x6fbb74: LoadField: r3 = r1->field_13
    //     0x6fbb74: ldur            w3, [x1, #0x13]
    // 0x6fbb78: DecompressPointer r3
    //     0x6fbb78: add             x3, x3, HEAP, lsl #32
    // 0x6fbb7c: str             x3, [SP]
    // 0x6fbb80: r0 = call 0x3a1c18
    //     0x6fbb80: bl              #0x3a1c18
    // 0x6fbb84: ldur            x16, [fp, #-0x18]
    // 0x6fbb88: stp             x0, x16, [SP]
    // 0x6fbb8c: r0 = __unknown_function__()
    //     0x6fbb8c: bl              #0x6fbbf0  ; [] ::__unknown_function__
    // 0x6fbb90: mov             x1, x0
    // 0x6fbb94: stur            x1, [fp, #-0x18]
    // 0x6fbb98: r0 = Await()
    //     0x6fbb98: bl              #0x6cdaec  ; AwaitStub
    // 0x6fbb9c: ldur            x0, [fp, #-0x10]
    // 0x6fbba0: LoadField: r1 = r0->field_f
    //     0x6fbba0: ldur            w1, [x0, #0xf]
    // 0x6fbba4: DecompressPointer r1
    //     0x6fbba4: add             x1, x1, HEAP, lsl #32
    // 0x6fbba8: ldur            x16, [fp, #-0x20]
    // 0x6fbbac: stp             x16, x1, [SP]
    // 0x6fbbb0: r0 = call 0x39f98c
    //     0x6fbbb0: bl              #0x39f98c
    // 0x6fbbb4: r0 = Null
    //     0x6fbbb4: mov             x0, NULL
    // 0x6fbbb8: r0 = ReturnAsyncNotFuture()
    //     0x6fbbb8: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x6fbbbc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6fbbbc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6fbbc0: b               #0x6fba50
  }
  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x755d84, size: 0xbc
    // 0x755d84: EnterFrame
    //     0x755d84: stp             fp, lr, [SP, #-0x10]!
    //     0x755d88: mov             fp, SP
    // 0x755d8c: AllocStack(0x20)
    //     0x755d8c: sub             SP, SP, #0x20
    // 0x755d90: SetupParameters(Vya this /* r1 */)
    //     0x755d90: stur            NULL, [fp, #-8]
    //     0x755d94: mov             x0, #0
    //     0x755d98: add             x1, fp, w0, sxtw #2
    //     0x755d9c: ldr             x1, [x1, #0x10]
    //     0x755da0: ldur            w2, [x1, #0x17]
    //     0x755da4: add             x2, x2, HEAP, lsl #32
    //     0x755da8: stur            x2, [fp, #-0x10]
    // 0x755dac: CheckStackOverflow
    //     0x755dac: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x755db0: cmp             SP, x16
    //     0x755db4: b.ls            #0x755e38
    // 0x755db8: InitAsync() -> Future<void?>
    //     0x755db8: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x755dbc: bl              #0x6cb614  ; InitAsyncStub
    // 0x755dc0: ldur            x0, [fp, #-0x10]
    // 0x755dc4: LoadField: r1 = r0->field_f
    //     0x755dc4: ldur            w1, [x0, #0xf]
    // 0x755dc8: DecompressPointer r1
    //     0x755dc8: add             x1, x1, HEAP, lsl #32
    // 0x755dcc: LoadField: r2 = r1->field_b
    //     0x755dcc: ldur            w2, [x1, #0xb]
    // 0x755dd0: DecompressPointer r2
    //     0x755dd0: add             x2, x2, HEAP, lsl #32
    // 0x755dd4: str             x2, [SP]
    // 0x755dd8: r0 = __unknown_function__()
    //     0x755dd8: bl              #0x756050  ; [] ::__unknown_function__
    // 0x755ddc: mov             x1, x0
    // 0x755de0: stur            x1, [fp, #-0x18]
    // 0x755de4: r0 = Await()
    //     0x755de4: bl              #0x6cdaec  ; AwaitStub
    // 0x755de8: cmp             w0, NULL
    // 0x755dec: b.ne            #0x755df8
    // 0x755df0: r0 = Null
    //     0x755df0: mov             x0, NULL
    // 0x755df4: r0 = ReturnAsyncNotFuture()
    //     0x755df4: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x755df8: ldur            x1, [fp, #-0x10]
    // 0x755dfc: LoadField: r2 = r1->field_f
    //     0x755dfc: ldur            w2, [x1, #0xf]
    // 0x755e00: DecompressPointer r2
    //     0x755e00: add             x2, x2, HEAP, lsl #32
    // 0x755e04: stur            x2, [fp, #-0x18]
    // 0x755e08: str             x0, [SP]
    // 0x755e0c: r0 = __unknown_function__()
    //     0x755e0c: bl              #0x755e40  ; [] ::__unknown_function__
    // 0x755e10: ldur            x1, [fp, #-0x18]
    // 0x755e14: StoreField: r1->field_13 = r0
    //     0x755e14: stur            w0, [x1, #0x13]
    //     0x755e18: ldurb           w16, [x1, #-1]
    //     0x755e1c: ldurb           w17, [x0, #-1]
    //     0x755e20: and             x16, x17, x16, lsr #2
    //     0x755e24: tst             x16, HEAP, lsr #32
    //     0x755e28: b.eq            #0x755e30
    //     0x755e2c: bl              #0x74b698  ; WriteBarrierWrappersStub
    // 0x755e30: r0 = Null
    //     0x755e30: mov             x0, NULL
    // 0x755e34: r0 = ReturnAsyncNotFuture()
    //     0x755e34: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x755e38: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x755e38: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x755e3c: b               #0x755db8
  }
  [closure] Null <anonymous closure>(dynamic) {
    // ** addr: 0x470874, size: -0x1
  }
}

// class id: 803, size: 0x14, field offset: 0x8
class Tya extends _Sya {
}

// class id: 804, size: 0x8, field offset: 0x8
abstract class _Rya extends Object {
}

// class id: 805, size: 0x14, field offset: 0x8
//   const constructor, 
abstract class Mya<X0, X1> extends Object {
}

// class id: 810, size: 0x14, field offset: 0x14
//   const constructor, 
abstract class Qya<C2X0 bound Ea> extends Mya<C2X0 bound Ea, dynamic> {
}

// class id: 812, size: 0x14, field offset: 0x14
//   const constructor, 
class Pya extends Mya<dynamic, dynamic> {

  _OneByteString field_c;
  _ImmutableList<String> field_10;
}

// class id: 813, size: 0x14, field offset: 0x14
//   const constructor, 
class Oya<C1X0> extends Mya<C1X0, dynamic> {

  _OneByteString field_c;
  PG field_10;
}
