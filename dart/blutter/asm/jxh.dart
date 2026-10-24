// lib: , url: Jxh

// class id: 1048670, size: 0x8
class :: {

  [closure] static Qa<String, Tw<Object>> <anonymous closure>(dynamic, Tw<Object>) {
    // ** addr: 0x44d368, size: -0x1
  }
  [closure] static bool <anonymous closure>(dynamic, Qa<String, pv<Object>>) {
    // ** addr: 0x44d314, size: -0x1
  }
  [closure] static Qa<Tw<Object>, pv<Object>> <anonymous closure>(dynamic, String, pv<Object>) {
    // ** addr: 0x44d270, size: -0x1
  }
  [closure] static Future<void> _sNe(dynamic, Rw) {
    // ** addr: 0x61db04, size: -0x1
  }
}

// class id: 3822, size: 0xc, field offset: 0x8
abstract class mx<X0> extends Object
    implements jx<X0>, kx<X0>, lx<X0> {
}

// class id: 3823, size: 0xc, field offset: 0x8
abstract class lx<X0> extends Object {
}

// class id: 3824, size: 0xc, field offset: 0x8
abstract class kx<X0> extends Object {
}

// class id: 3825, size: 0xc, field offset: 0x8
abstract class jx<X0> extends Object {
}

// class id: 3827, size: 0x14, field offset: 0x8
class gx<X0 bound rv, X1> extends Object {

  [closure] Future<int> <anonymous closure>(dynamic, vv) async {
    // ** addr: 0x6f77f4, size: 0x1b0
    // 0x6f77f4: EnterFrame
    //     0x6f77f4: stp             fp, lr, [SP, #-0x10]!
    //     0x6f77f8: mov             fp, SP
    // 0x6f77fc: AllocStack(0x48)
    //     0x6f77fc: sub             SP, SP, #0x48
    // 0x6f7800: SetupParameters(gx<X0 bound rv, X1> this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0x6f7800: stur            NULL, [fp, #-8]
    //     0x6f7804: mov             x0, #0
    //     0x6f7808: add             x1, fp, w0, sxtw #2
    //     0x6f780c: ldr             x1, [x1, #0x18]
    //     0x6f7810: add             x2, fp, w0, sxtw #2
    //     0x6f7814: ldr             x2, [x2, #0x10]
    //     0x6f7818: stur            x2, [fp, #-0x18]
    //     0x6f781c: ldur            w3, [x1, #0x17]
    //     0x6f7820: add             x3, x3, HEAP, lsl #32
    //     0x6f7824: stur            x3, [fp, #-0x10]
    // 0x6f7828: CheckStackOverflow
    //     0x6f7828: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6f782c: cmp             SP, x16
    //     0x6f7830: b.ls            #0x6f799c
    // 0x6f7834: InitAsync() -> Future<int>
    //     0x6f7834: ldr             x0, [PP, #0x878]  ; [pp+0x878] TypeArguments: <int>
    //     0x6f7838: bl              #0x6cb614  ; InitAsyncStub
    // 0x6f783c: ldur            x0, [fp, #-0x10]
    // 0x6f7840: LoadField: r1 = r0->field_13
    //     0x6f7840: ldur            w1, [x0, #0x13]
    // 0x6f7844: DecompressPointer r1
    //     0x6f7844: add             x1, x1, HEAP, lsl #32
    // 0x6f7848: stur            x1, [fp, #-0x20]
    // 0x6f784c: LoadField: r2 = r1->field_27
    //     0x6f784c: ldur            w2, [x1, #0x27]
    // 0x6f7850: DecompressPointer r2
    //     0x6f7850: add             x2, x2, HEAP, lsl #32
    // 0x6f7854: str             x2, [SP]
    // 0x6f7858: r0 = call 0x4ea478
    //     0x6f7858: bl              #0x4ea478
    // 0x6f785c: mov             x1, x0
    // 0x6f7860: ldur            x0, [fp, #-0x20]
    // 0x6f7864: LoadField: r2 = r0->field_1f
    //     0x6f7864: ldur            w2, [x0, #0x1f]
    // 0x6f7868: DecompressPointer r2
    //     0x6f7868: add             x2, x2, HEAP, lsl #32
    // 0x6f786c: ldur            x0, [fp, #-0x18]
    // 0x6f7870: r3 = LoadClassIdInstr(r0)
    //     0x6f7870: ldur            x3, [x0, #-1]
    //     0x6f7874: ubfx            x3, x3, #0xc, #0x14
    // 0x6f7878: stp             x1, x0, [SP, #8]
    // 0x6f787c: str             x2, [SP]
    // 0x6f7880: mov             x0, x3
    // 0x6f7884: r0 = GDT[cid_x0 + -0xd9f]()
    //     0x6f7884: sub             lr, x0, #0xd9f
    //     0x6f7888: ldr             lr, [x21, lr, lsl #3]
    //     0x6f788c: blr             lr
    // 0x6f7890: mov             x1, x0
    // 0x6f7894: stur            x1, [fp, #-0x18]
    // 0x6f7898: r0 = Await()
    //     0x6f7898: bl              #0x6cdaec  ; AwaitStub
    // 0x6f789c: mov             x1, x0
    // 0x6f78a0: ldur            x0, [fp, #-0x10]
    // 0x6f78a4: stur            x1, [fp, #-0x20]
    // 0x6f78a8: LoadField: r2 = r0->field_f
    //     0x6f78a8: ldur            w2, [x0, #0xf]
    // 0x6f78ac: DecompressPointer r2
    //     0x6f78ac: add             x2, x2, HEAP, lsl #32
    // 0x6f78b0: LoadField: r3 = r2->field_b
    //     0x6f78b0: ldur            w3, [x2, #0xb]
    // 0x6f78b4: DecompressPointer r3
    //     0x6f78b4: add             x3, x3, HEAP, lsl #32
    // 0x6f78b8: stur            x3, [fp, #-0x18]
    // 0x6f78bc: r0 = InitLateStaticField(0x518) // [dart:collection] ::_kbb
    //     0x6f78bc: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f78c0: ldr             x0, [x0, #0xa30]
    //     0x6f78c4: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f78c8: cmp             w0, w16
    //     0x6f78cc: b.ne            #0x6f78d8
    //     0x6f78d0: ldr             x2, [PP, #0xe18]  ; [pp+0xe18] Field <::._kbb@3220832>: static late final (offset: 0x518)
    //     0x6f78d4: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f78d8: r1 = <Dv>
    //     0x6f78d8: add             x1, PP, #0x10, lsl #12  ; [pp+0x10268] TypeArguments: <Dv>
    //     0x6f78dc: ldr             x1, [x1, #0x268]
    // 0x6f78e0: stur            x0, [fp, #-0x28]
    // 0x6f78e4: r0 = _Set()
    //     0x6f78e4: bl              #0x6cb690  ; Allocate_SetStub -> _Set<X0> (size=-0x8)
    // 0x6f78e8: mov             x1, x0
    // 0x6f78ec: ldur            x0, [fp, #-0x28]
    // 0x6f78f0: stur            x1, [fp, #-0x30]
    // 0x6f78f4: StoreField: r1->field_1b = r0
    //     0x6f78f4: stur            w0, [x1, #0x1b]
    // 0x6f78f8: StoreField: r1->field_b = rZR
    //     0x6f78f8: stur            wzr, [x1, #0xb]
    // 0x6f78fc: r0 = InitLateStaticField(0x51c) // [dart:collection] ::_lbb
    //     0x6f78fc: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f7900: ldr             x0, [x0, #0xa38]
    //     0x6f7904: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f7908: cmp             w0, w16
    //     0x6f790c: b.ne            #0x6f7918
    //     0x6f7910: ldr             x2, [PP, #0xe20]  ; [pp+0xe20] Field <::._lbb@3220832>: static late final (offset: 0x51c)
    //     0x6f7914: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f7918: ldur            x1, [fp, #-0x30]
    // 0x6f791c: StoreField: r1->field_f = r0
    //     0x6f791c: stur            w0, [x1, #0xf]
    // 0x6f7920: StoreField: r1->field_13 = rZR
    //     0x6f7920: stur            wzr, [x1, #0x13]
    // 0x6f7924: ArrayStore: r1[0] = rZR  ; List_4
    //     0x6f7924: stur            wzr, [x1, #0x17]
    // 0x6f7928: ldur            x0, [fp, #-0x10]
    // 0x6f792c: LoadField: r2 = r0->field_f
    //     0x6f792c: ldur            w2, [x0, #0xf]
    // 0x6f7930: DecompressPointer r2
    //     0x6f7930: add             x2, x2, HEAP, lsl #32
    // 0x6f7934: LoadField: r0 = r2->field_f
    //     0x6f7934: ldur            w0, [x2, #0xf]
    // 0x6f7938: DecompressPointer r0
    //     0x6f7938: add             x0, x0, HEAP, lsl #32
    // 0x6f793c: r2 = LoadClassIdInstr(r0)
    //     0x6f793c: ldur            x2, [x0, #-1]
    //     0x6f7940: ubfx            x2, x2, #0xc, #0x14
    // 0x6f7944: str             x0, [SP]
    // 0x6f7948: mov             x0, x2
    // 0x6f794c: r0 = GDT[cid_x0 + -0x2dc]()
    //     0x6f794c: sub             lr, x0, #0x2dc
    //     0x6f7950: ldr             lr, [x21, lr, lsl #3]
    //     0x6f7954: blr             lr
    // 0x6f7958: stur            x0, [fp, #-0x10]
    // 0x6f795c: r0 = Dv()
    //     0x6f795c: bl              #0x6f79a4  ; AllocateDvStub -> Dv (size=0x10)
    // 0x6f7960: mov             x1, x0
    // 0x6f7964: ldur            x0, [fp, #-0x10]
    // 0x6f7968: StoreField: r1->field_b = r0
    //     0x6f7968: stur            w0, [x1, #0xb]
    // 0x6f796c: r0 = Instance_Cv
    //     0x6f796c: add             x0, PP, #0x10, lsl #12  ; [pp+0x10970] Obj!Cv@4399b1
    //     0x6f7970: ldr             x0, [x0, #0x970]
    // 0x6f7974: StoreField: r1->field_7 = r0
    //     0x6f7974: stur            w0, [x1, #7]
    // 0x6f7978: ldur            x16, [fp, #-0x30]
    // 0x6f797c: stp             x1, x16, [SP]
    // 0x6f7980: r0 = call 0x652020
    //     0x6f7980: bl              #0x652020
    // 0x6f7984: ldur            x16, [fp, #-0x18]
    // 0x6f7988: ldur            lr, [fp, #-0x30]
    // 0x6f798c: stp             lr, x16, [SP]
    // 0x6f7990: r0 = call 0x383204
    //     0x6f7990: bl              #0x383204
    // 0x6f7994: ldur            x0, [fp, #-0x20]
    // 0x6f7998: r0 = ReturnAsync()
    //     0x6f7998: b               #0x6ca270  ; ReturnAsyncStub
    // 0x6f799c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6f799c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6f79a0: b               #0x6f7834
  }
}

// class id: 3828, size: 0x8, field offset: 0x8
abstract class Ww extends Object {
}

// class id: 3829, size: 0xc, field offset: 0x8
abstract class Xw<X0, X1> extends Ww {
}

// class id: 3831, size: 0x14, field offset: 0x8
//   const constructor, 
class Sw extends Object {
}

// class id: 3832, size: 0x10, field offset: 0x8
class Rw extends Object {
}

// class id: 3833, size: 0x14, field offset: 0x8
class Qw extends Object {
}

// class id: 3834, size: 0x2c, field offset: 0x8
class Pw extends Object {

  [closure] String OHb(dynamic, String) {
    // ** addr: 0x382e48, size: -0x1
  }
}

// class id: 3835, size: 0x8, field offset: 0x8
abstract class Gw extends Object
    implements uw {
}

// class id: 3836, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class uw extends Object {
}

// class id: 3837, size: 0xc, field offset: 0x8
abstract class ox<X0> extends uw {
}

// class id: 3838, size: 0x28, field offset: 0x8
abstract class dx<X0 bound qv, X1> extends uw {
}

// class id: 3839, size: 0x28, field offset: 0x28
//   transformed mixin,
abstract class _tx<X0 bound rv, X1> extends dx<X0 bound rv, X1>
     with ex<X0 bound qv, X1> {
}

// class id: 3840, size: 0x2c, field offset: 0x28
class ux<X0 bound rv, X1> extends _tx<X0 bound rv, X1> {

  late Map<String, pv<Object>> _vLe; // offset: 0x28

  [closure] Future<int> <anonymous closure>(dynamic, vv) async {
    // ** addr: 0x713f10, size: 0xb4
    // 0x713f10: EnterFrame
    //     0x713f10: stp             fp, lr, [SP, #-0x10]!
    //     0x713f14: mov             fp, SP
    // 0x713f18: AllocStack(0x38)
    //     0x713f18: sub             SP, SP, #0x38
    // 0x713f1c: SetupParameters(ux<X0 bound rv, X1> this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0x713f1c: stur            NULL, [fp, #-8]
    //     0x713f20: mov             x0, #0
    //     0x713f24: add             x1, fp, w0, sxtw #2
    //     0x713f28: ldr             x1, [x1, #0x18]
    //     0x713f2c: add             x2, fp, w0, sxtw #2
    //     0x713f30: ldr             x2, [x2, #0x10]
    //     0x713f34: stur            x2, [fp, #-0x18]
    //     0x713f38: ldur            w3, [x1, #0x17]
    //     0x713f3c: add             x3, x3, HEAP, lsl #32
    //     0x713f40: stur            x3, [fp, #-0x10]
    // 0x713f44: CheckStackOverflow
    //     0x713f44: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x713f48: cmp             SP, x16
    //     0x713f4c: b.ls            #0x713fbc
    // 0x713f50: InitAsync() -> Future<int>
    //     0x713f50: ldr             x0, [PP, #0x878]  ; [pp+0x878] TypeArguments: <int>
    //     0x713f54: bl              #0x6cb614  ; InitAsyncStub
    // 0x713f58: ldur            x0, [fp, #-0x10]
    // 0x713f5c: LoadField: r1 = r0->field_f
    //     0x713f5c: ldur            w1, [x0, #0xf]
    // 0x713f60: DecompressPointer r1
    //     0x713f60: add             x1, x1, HEAP, lsl #32
    // 0x713f64: stur            x1, [fp, #-0x20]
    // 0x713f68: LoadField: r2 = r1->field_27
    //     0x713f68: ldur            w2, [x1, #0x27]
    // 0x713f6c: DecompressPointer r2
    //     0x713f6c: add             x2, x2, HEAP, lsl #32
    // 0x713f70: str             x2, [SP]
    // 0x713f74: r0 = call 0x4ea478
    //     0x713f74: bl              #0x4ea478
    // 0x713f78: mov             x1, x0
    // 0x713f7c: ldur            x0, [fp, #-0x20]
    // 0x713f80: LoadField: r2 = r0->field_1f
    //     0x713f80: ldur            w2, [x0, #0x1f]
    // 0x713f84: DecompressPointer r2
    //     0x713f84: add             x2, x2, HEAP, lsl #32
    // 0x713f88: ldur            x0, [fp, #-0x18]
    // 0x713f8c: r3 = LoadClassIdInstr(r0)
    //     0x713f8c: ldur            x3, [x0, #-1]
    //     0x713f90: ubfx            x3, x3, #0xc, #0x14
    // 0x713f94: stp             x1, x0, [SP, #8]
    // 0x713f98: str             x2, [SP]
    // 0x713f9c: mov             x0, x3
    // 0x713fa0: r0 = GDT[cid_x0 + -0x645]()
    //     0x713fa0: sub             lr, x0, #0x645
    //     0x713fa4: ldr             lr, [x21, lr, lsl #3]
    //     0x713fa8: blr             lr
    // 0x713fac: mov             x1, x0
    // 0x713fb0: stur            x1, [fp, #-0x18]
    // 0x713fb4: r0 = Await()
    //     0x713fb4: bl              #0x6cdaec  ; AwaitStub
    // 0x713fb8: r0 = ReturnAsync()
    //     0x713fb8: b               #0x6ca270  ; ReturnAsyncStub
    // 0x713fbc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x713fbc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x713fc0: b               #0x713f50
  }
  [closure] void <anonymous closure>(dynamic, String, pv<Object>) {
    // ** addr: 0x5c99ac, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, String, pv<Object>) {
    // ** addr: 0x44d3ac, size: -0x1
  }
}

// class id: 3841, size: 0x28, field offset: 0x28
//   transformed mixin,
abstract class _px<X0 bound qv, X1> extends dx<X0 bound qv, X1>
     with ex<X0 bound qv, X1> {
}

// class id: 3842, size: 0x28, field offset: 0x28
//   transformed mixin,
abstract class _qx<X0 bound qv, X1> extends _px<X0 bound qv, X1>
     with nx<X0 bound qv, X1> {
}

// class id: 3843, size: 0x28, field offset: 0x28
//   transformed mixin,
abstract class _rx<X0 bound qv, X1> extends _qx<X0 bound qv, X1>
     with mx<X0> {
}

// class id: 3844, size: 0x2c, field offset: 0x28
class sx<X0 bound qv, X1> extends _rx<X0 bound qv, X1>
    implements ox<X0> {

  [closure] Future<List<Map<String, Object?>>> <anonymous closure>(dynamic) {
    // ** addr: 0x377d34, size: -0x1
  }
  [closure] FutureOr<List<X1>> _lNe(dynamic, List<Map<String, Object?>>) {
    // ** addr: 0x3778f4, size: -0x1
  }
  [closure] Future<List<Map<String, Object?>>> <anonymous closure>(dynamic, vv) {
    // ** addr: 0x37802c, size: -0x1
  }
  [closure] Aw <anonymous closure>(dynamic, (dynamic, X0) => Aw) {
    // ** addr: 0x4aae94, size: -0x1
  }
}

// class id: 3845, size: 0x28, field offset: 0x28
abstract class nx<X0 bound qv, X1> extends dx<X0 bound qv, X1> {
}

// class id: 3846, size: 0x28, field offset: 0x28
//   transformed mixin,
abstract class _cx<X0 bound rv, X1> extends dx<X0 bound rv, X1>
     with ex<X0 bound qv, X1> {
}

// class id: 3847, size: 0x28, field offset: 0x28
class fx<X0 bound rv, X1> extends _cx<X0 bound rv, X1> {

  [closure] Future<int> <anonymous closure>(dynamic, vv) async {
    // ** addr: 0x71357c, size: 0x1d8
    // 0x71357c: EnterFrame
    //     0x71357c: stp             fp, lr, [SP, #-0x10]!
    //     0x713580: mov             fp, SP
    // 0x713584: AllocStack(0x48)
    //     0x713584: sub             SP, SP, #0x48
    // 0x713588: SetupParameters(fx<X0 bound rv, X1> this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0x713588: stur            NULL, [fp, #-8]
    //     0x71358c: mov             x0, #0
    //     0x713590: add             x1, fp, w0, sxtw #2
    //     0x713594: ldr             x1, [x1, #0x18]
    //     0x713598: add             x2, fp, w0, sxtw #2
    //     0x71359c: ldr             x2, [x2, #0x10]
    //     0x7135a0: stur            x2, [fp, #-0x18]
    //     0x7135a4: ldur            w3, [x1, #0x17]
    //     0x7135a8: add             x3, x3, HEAP, lsl #32
    //     0x7135ac: stur            x3, [fp, #-0x10]
    // 0x7135b0: CheckStackOverflow
    //     0x7135b0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x7135b4: cmp             SP, x16
    //     0x7135b8: b.ls            #0x713748
    // 0x7135bc: InitAsync() -> Future<int>
    //     0x7135bc: ldr             x0, [PP, #0x878]  ; [pp+0x878] TypeArguments: <int>
    //     0x7135c0: bl              #0x6cb614  ; InitAsyncStub
    // 0x7135c4: ldur            x0, [fp, #-0x10]
    // 0x7135c8: LoadField: r1 = r0->field_13
    //     0x7135c8: ldur            w1, [x0, #0x13]
    // 0x7135cc: DecompressPointer r1
    //     0x7135cc: add             x1, x1, HEAP, lsl #32
    // 0x7135d0: stur            x1, [fp, #-0x20]
    // 0x7135d4: LoadField: r2 = r1->field_27
    //     0x7135d4: ldur            w2, [x1, #0x27]
    // 0x7135d8: DecompressPointer r2
    //     0x7135d8: add             x2, x2, HEAP, lsl #32
    // 0x7135dc: str             x2, [SP]
    // 0x7135e0: r0 = call 0x4ea478
    //     0x7135e0: bl              #0x4ea478
    // 0x7135e4: mov             x1, x0
    // 0x7135e8: ldur            x0, [fp, #-0x20]
    // 0x7135ec: LoadField: r2 = r0->field_1f
    //     0x7135ec: ldur            w2, [x0, #0x1f]
    // 0x7135f0: DecompressPointer r2
    //     0x7135f0: add             x2, x2, HEAP, lsl #32
    // 0x7135f4: ldur            x0, [fp, #-0x18]
    // 0x7135f8: r3 = LoadClassIdInstr(r0)
    //     0x7135f8: ldur            x3, [x0, #-1]
    //     0x7135fc: ubfx            x3, x3, #0xc, #0x14
    // 0x713600: stp             x1, x0, [SP, #8]
    // 0x713604: str             x2, [SP]
    // 0x713608: mov             x0, x3
    // 0x71360c: r0 = GDT[cid_x0 + -0xe5f]()
    //     0x71360c: sub             lr, x0, #0xe5f
    //     0x713610: ldr             lr, [x21, lr, lsl #3]
    //     0x713614: blr             lr
    // 0x713618: mov             x1, x0
    // 0x71361c: stur            x1, [fp, #-0x18]
    // 0x713620: r0 = Await()
    //     0x713620: bl              #0x6cdaec  ; AwaitStub
    // 0x713624: stur            x0, [fp, #-0x20]
    // 0x713628: cmp             w0, NULL
    // 0x71362c: b.eq            #0x713750
    // 0x713630: r1 = LoadInt32Instr(r0)
    //     0x713630: sbfx            x1, x0, #1, #0x1f
    //     0x713634: tbz             w0, #0, #0x71363c
    //     0x713638: ldur            x1, [x0, #7]
    // 0x71363c: cmp             x1, #0
    // 0x713640: b.le            #0x713740
    // 0x713644: ldur            x1, [fp, #-0x10]
    // 0x713648: LoadField: r2 = r1->field_f
    //     0x713648: ldur            w2, [x1, #0xf]
    // 0x71364c: DecompressPointer r2
    //     0x71364c: add             x2, x2, HEAP, lsl #32
    // 0x713650: LoadField: r3 = r2->field_b
    //     0x713650: ldur            w3, [x2, #0xb]
    // 0x713654: DecompressPointer r3
    //     0x713654: add             x3, x3, HEAP, lsl #32
    // 0x713658: stur            x3, [fp, #-0x18]
    // 0x71365c: r0 = InitLateStaticField(0x518) // [dart:collection] ::_kbb
    //     0x71365c: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x713660: ldr             x0, [x0, #0xa30]
    //     0x713664: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x713668: cmp             w0, w16
    //     0x71366c: b.ne            #0x713678
    //     0x713670: ldr             x2, [PP, #0xe18]  ; [pp+0xe18] Field <::._kbb@3220832>: static late final (offset: 0x518)
    //     0x713674: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x713678: r1 = <Dv>
    //     0x713678: add             x1, PP, #0x10, lsl #12  ; [pp+0x10268] TypeArguments: <Dv>
    //     0x71367c: ldr             x1, [x1, #0x268]
    // 0x713680: stur            x0, [fp, #-0x28]
    // 0x713684: r0 = _Set()
    //     0x713684: bl              #0x6cb690  ; Allocate_SetStub -> _Set<X0> (size=-0x8)
    // 0x713688: mov             x1, x0
    // 0x71368c: ldur            x0, [fp, #-0x28]
    // 0x713690: stur            x1, [fp, #-0x30]
    // 0x713694: StoreField: r1->field_1b = r0
    //     0x713694: stur            w0, [x1, #0x1b]
    // 0x713698: StoreField: r1->field_b = rZR
    //     0x713698: stur            wzr, [x1, #0xb]
    // 0x71369c: r0 = InitLateStaticField(0x51c) // [dart:collection] ::_lbb
    //     0x71369c: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x7136a0: ldr             x0, [x0, #0xa38]
    //     0x7136a4: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x7136a8: cmp             w0, w16
    //     0x7136ac: b.ne            #0x7136b8
    //     0x7136b0: ldr             x2, [PP, #0xe20]  ; [pp+0xe20] Field <::._lbb@3220832>: static late final (offset: 0x51c)
    //     0x7136b4: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x7136b8: ldur            x3, [fp, #-0x30]
    // 0x7136bc: StoreField: r3->field_f = r0
    //     0x7136bc: stur            w0, [x3, #0xf]
    // 0x7136c0: StoreField: r3->field_13 = rZR
    //     0x7136c0: stur            wzr, [x3, #0x13]
    // 0x7136c4: ArrayStore: r3[0] = rZR  ; List_4
    //     0x7136c4: stur            wzr, [x3, #0x17]
    // 0x7136c8: ldur            x0, [fp, #-0x10]
    // 0x7136cc: LoadField: r1 = r0->field_f
    //     0x7136cc: ldur            w1, [x0, #0xf]
    // 0x7136d0: DecompressPointer r1
    //     0x7136d0: add             x1, x1, HEAP, lsl #32
    // 0x7136d4: LoadField: r0 = r1->field_7
    //     0x7136d4: ldur            w0, [x1, #7]
    // 0x7136d8: DecompressPointer r0
    //     0x7136d8: add             x0, x0, HEAP, lsl #32
    // 0x7136dc: LoadField: r4 = r1->field_f
    //     0x7136dc: ldur            w4, [x1, #0xf]
    // 0x7136e0: DecompressPointer r4
    //     0x7136e0: add             x4, x4, HEAP, lsl #32
    // 0x7136e4: mov             x1, x0
    // 0x7136e8: mov             x0, x4
    // 0x7136ec: stur            x4, [fp, #-0x10]
    // 0x7136f0: r2 = Null
    //     0x7136f0: mov             x2, NULL
    // 0x7136f4: r8 = ax<Y0 bound rv, Y1>
    //     0x7136f4: add             x8, PP, #0x10, lsl #12  ; [pp+0x10270] Type: ax<Y0 bound rv, Y1>
    //     0x7136f8: ldr             x8, [x8, #0x270]
    // 0x7136fc: LoadField: r9 = r8->field_7
    //     0x7136fc: ldur            x9, [x8, #7]
    // 0x713700: r3 = Null
    //     0x713700: add             x3, PP, #0x10, lsl #12  ; [pp+0x10278] Null
    //     0x713704: ldr             x3, [x3, #0x278]
    // 0x713708: blr             x9
    // 0x71370c: ldur            x16, [fp, #-0x10]
    // 0x713710: stp             x16, NULL, [SP, #8]
    // 0x713714: r16 = Instance_Cv
    //     0x713714: add             x16, PP, #0x10, lsl #12  ; [pp+0x10288] Obj!Cv@4399d1
    //     0x713718: ldr             x16, [x16, #0x288]
    // 0x71371c: str             x16, [SP]
    // 0x713720: r0 = call 0x44c6c8
    //     0x713720: bl              #0x44c6c8
    // 0x713724: ldur            x16, [fp, #-0x30]
    // 0x713728: stp             x0, x16, [SP]
    // 0x71372c: r0 = call 0x652020
    //     0x71372c: bl              #0x652020
    // 0x713730: ldur            x16, [fp, #-0x18]
    // 0x713734: ldur            lr, [fp, #-0x30]
    // 0x713738: stp             lr, x16, [SP]
    // 0x71373c: r0 = call 0x383204
    //     0x71373c: bl              #0x383204
    // 0x713740: ldur            x0, [fp, #-0x20]
    // 0x713744: r0 = ReturnAsyncNotFuture()
    //     0x713744: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x713748: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x713748: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x71374c: b               #0x7135bc
    // 0x713750: r0 = NullErrorSharedWithoutFPURegs()
    //     0x713750: bl              #0x74d4bc  ; NullErrorSharedWithoutFPURegsStub
  }
}

// class id: 3848, size: 0x28, field offset: 0x28
abstract class ex<X0 bound qv, X1> extends dx<X0 bound qv, X1> {
}

// class id: 3849, size: 0xc, field offset: 0x8
class Cw extends uw {
}

// class id: 3850, size: 0xc, field offset: 0x8
//   const constructor, 
class Bw extends uw {
}

// class id: 3851, size: 0x14, field offset: 0x8
class Aw extends uw {
}

// class id: 3941, size: 0xc, field offset: 0x8
abstract class ax<X0 bound rv, X1> extends rv
    implements Ww, Xw<X0, X1> {
}

// class id: 3942, size: 0xc, field offset: 0x8
//   const constructor, 
abstract class pv<X0> extends Object
    implements Gw {

  pv<Y0> Fk<Y0 extends Object>(pv<X0>, [Fx<Y0>?]) {
    // ** addr: 0x6ef5a0, size: 0x10c
    // 0x6ef5a0: EnterFrame
    //     0x6ef5a0: stp             fp, lr, [SP, #-0x10]!
    //     0x6ef5a4: mov             fp, SP
    // 0x6ef5a8: AllocStack(0x30)
    //     0x6ef5a8: sub             SP, SP, #0x30
    // 0x6ef5ac: SetupParameters(pv<X0> this /* r4, fp-0x18 */, [dynamic _ = Null /* r5, fp-0x10 */])
    //     0x6ef5ac: mov             x0, x4
    //     0x6ef5b0: ldur            w1, [x0, #0x13]
    //     0x6ef5b4: add             x1, x1, HEAP, lsl #32
    //     0x6ef5b8: sub             x2, x1, #2
    //     0x6ef5bc: add             x4, fp, w2, sxtw #2
    //     0x6ef5c0: ldr             x4, [x4, #0x10]
    //     0x6ef5c4: stur            x4, [fp, #-0x18]
    //     0x6ef5c8: cmp             w2, #2
    //     0x6ef5cc: b.lt            #0x6ef5e0
    //     0x6ef5d0: add             x1, fp, w2, sxtw #2
    //     0x6ef5d4: ldr             x1, [x1, #8]
    //     0x6ef5d8: mov             x5, x1
    //     0x6ef5dc: b               #0x6ef5e4
    //     0x6ef5e0: mov             x5, NULL
    //     0x6ef5e4: stur            x5, [fp, #-0x10]
    //     0x6ef5e8: ldur            w1, [x0, #0xf]
    //     0x6ef5ec: add             x1, x1, HEAP, lsl #32
    //     0x6ef5f0: cbnz            w1, #0x6ef5fc
    //     0x6ef5f4: mov             x0, NULL
    //     0x6ef5f8: b               #0x6ef60c
    //     0x6ef5fc: ldur            w2, [x0, #0x17]
    //     0x6ef600: add             x2, x2, HEAP, lsl #32
    //     0x6ef604: add             x0, fp, w2, sxtw #2
    //     0x6ef608: ldr             x0, [x0, #0x10]
    // 0x6ef60c: CheckStackOverflow
    //     0x6ef60c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6ef610: cmp             SP, x16
    //     0x6ef614: b.ls            #0x6ef6a4
    // 0x6ef618: cbnz            w1, #0x6ef624
    // 0x6ef61c: r6 = <Object>
    //     0x6ef61c: ldr             x6, [PP, #0x118]  ; [pp+0x118] TypeArguments: <Object>
    // 0x6ef620: b               #0x6ef628
    // 0x6ef624: mov             x6, x0
    // 0x6ef628: stur            x6, [fp, #-8]
    // 0x6ef62c: LoadField: r2 = r4->field_7
    //     0x6ef62c: ldur            w2, [x4, #7]
    // 0x6ef630: DecompressPointer r2
    //     0x6ef630: add             x2, x2, HEAP, lsl #32
    // 0x6ef634: mov             x1, x6
    // 0x6ef638: r0 = Y0
    //     0x6ef638: add             x0, PP, #0x27, lsl #12  ; [pp+0x279c0] TypeParameter: Y0
    //     0x6ef63c: ldr             x0, [x0, #0x9c0]
    // 0x6ef640: r8 = Object
    //     0x6ef640: ldr             x8, [PP, #0x2040]  ; [pp+0x2040] Type: Object
    // 0x6ef644: r3 = "Mw"
    //     0x6ef644: add             x3, PP, #0x27, lsl #12  ; [pp+0x279c8] "Mw"
    //     0x6ef648: ldr             x3, [x3, #0x9c8]
    // 0x6ef64c: r30 = AssertSubtypeStub
    //     0x6ef64c: ldr             lr, [PP, #0x328]  ; [pp+0x328] Stub: AssertSubtype (0x1f3248)
    // 0x6ef650: LoadField: r30 = r30->field_7
    //     0x6ef650: ldur            lr, [lr, #7]
    // 0x6ef654: blr             lr
    // 0x6ef658: ldur            x0, [fp, #-0x10]
    // 0x6ef65c: ldur            x1, [fp, #-8]
    // 0x6ef660: r2 = Null
    //     0x6ef660: mov             x2, NULL
    // 0x6ef664: r8 = Fx<Y0>?
    //     0x6ef664: add             x8, PP, #0x27, lsl #12  ; [pp+0x279d0] Type: Fx<Y0>?
    //     0x6ef668: ldr             x8, [x8, #0x9d0]
    // 0x6ef66c: LoadField: r9 = r8->field_7
    //     0x6ef66c: ldur            x9, [x8, #7]
    // 0x6ef670: r3 = Null
    //     0x6ef670: add             x3, PP, #0x27, lsl #12  ; [pp+0x279d8] Null
    //     0x6ef674: ldr             x3, [x3, #0x9d8]
    // 0x6ef678: blr             x9
    // 0x6ef67c: ldur            x16, [fp, #-8]
    // 0x6ef680: ldur            lr, [fp, #-0x18]
    // 0x6ef684: stp             lr, x16, [SP, #8]
    // 0x6ef688: ldur            x16, [fp, #-0x10]
    // 0x6ef68c: str             x16, [SP]
    // 0x6ef690: r4 = const [0x1, 0x2, 0x2, 0x2, null]
    //     0x6ef690: ldr             x4, [PP, #0x58]  ; [pp+0x58] List(5) [0x1, 0x2, 0x2, 0x2, Null]
    // 0x6ef694: r0 = call 0x37752c
    //     0x6ef694: bl              #0x37752c
    // 0x6ef698: LeaveFrame
    //     0x6ef698: mov             SP, fp
    //     0x6ef69c: ldp             fp, lr, [SP], #0x10
    // 0x6ef6a0: ret
    //     0x6ef6a0: ret             
    // 0x6ef6a4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6ef6a4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6ef6a8: b               #0x6ef618
  }
}

// class id: 3943, size: 0x14, field offset: 0xc
//   const constructor, 
class Ow<X0> extends pv<X0> {
}

// class id: 3945, size: 0x14, field offset: 0xc
//   const constructor, 
class _Kw<C1X0, C1X1> extends pv<C1X0> {
}

// class id: 3946, size: 0x14, field offset: 0xc
//   const constructor, 
class Fw<X0> extends pv<X0> {
}

// class id: 3950, size: 0x18, field offset: 0xc
class _Jw extends sw<dynamic> {
}

// class id: 3953, size: 0x44, field offset: 0x10
class Tw<X0> extends ov<X0> {

  [closure] static void <anonymous closure>(dynamic, Pw) {
    // ** addr: 0x44c8a0, size: -0x1
  }
}

// class id: 3954, size: 0x44, field offset: 0x44
class Uw<C1X0, C1X1> extends Tw<C1X0> {
}

// class id: 4915, size: 0x14, field offset: 0x14
enum hx extends _Enum
    implements uw {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 4916, size: 0x18, field offset: 0x14
enum _Iw extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
  _OneByteString field_14;
}

// class id: 4917, size: 0x1c, field offset: 0x14
enum Hw extends _Enum
    implements Ba<X0> {

  _Mint field_8;
  _OneByteString field_10;
  _Mint field_14;
}

// class id: 4919, size: 0x18, field offset: 0x14
enum yw extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
  _OneByteString field_14;
}

// class id: 4920, size: 0x30, field offset: 0x14
enum vw extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
  _OneByteString field_14;
  _OneByteString field_18;
  _OneByteString field_1c;
  _OneByteString field_20;
  _OneByteString field_24;
  _OneByteString field_28;
  bool field_2c;
}
