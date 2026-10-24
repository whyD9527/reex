// lib: hRh, url: ONh

// class id: 1049444, size: 0x8
class :: {

  [closure] static void _BWe(dynamic, (dynamic) => void) {
    // ** addr: 0x4dd9c8, size: -0x1
  }
}

// class id: 397, size: 0x1c, field offset: 0x8
class NPa extends Object {

  [closure] void _RVe(dynamic) {
    // ** addr: 0x4ddbf8, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, (dynamic) => void) {
    // ** addr: 0x4dda40, size: -0x1
  }
  [closure] void QQb(dynamic) {
    // ** addr: 0x4ddb80, size: -0x1
  }
}

// class id: 398, size: 0xc, field offset: 0x8
//   const constructor, transformed mixin,
abstract class _IPa<X0, X1> extends Object
     with ZOa<X0> {
}

// class id: 399, size: 0x14, field offset: 0xc
class _JPa<X0, X1> extends _IPa<X0, X1> {

  [closure] void <anonymous closure>(dynamic, X0?, X0) {
    // ** addr: 0x5128d0, size: -0x1
  }
  [closure] X1 <anonymous closure>(dynamic) {
    // ** addr: 0x51272c, size: -0x1
  }
  [closure] Never <anonymous closure>(dynamic, oQa<X1>) {
    // ** addr: 0x512840, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, jCa<X1>) {
    // ** addr: 0x512ca8, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, nQa<X1>) {
    // ** addr: 0x512c10, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, oQa<X1>) {
    // ** addr: 0x512ba8, size: -0x1
  }
  [closure] jCa<X1> <anonymous closure>(dynamic, nQa<X0>) {
    // ** addr: 0x512678, size: -0x1
  }
  [closure] jCa<X1> <anonymous closure>(dynamic, oQa<X0>) {
    // ** addr: 0x5125f0, size: -0x1
  }
}

// class id: 400, size: 0x14, field offset: 0x14
//   transformed mixin,
abstract class _LPa<X0, X1> extends _JPa<X0, X1>
     with YOa<X0> {
}

// class id: 401, size: 0x14, field offset: 0x14
class _MPa<X0, X1> extends _LPa<X0, X1> {
}

// class id: 402, size: 0xc, field offset: 0x8
//   const constructor, transformed mixin,
abstract class _EPa<X0, X1> extends Object
     with ZOa<X0> {
}

// class id: 403, size: 0xc, field offset: 0xc
//   const constructor, transformed mixin,
abstract class _GPa<X0, X1> extends _EPa<X0, X1>
     with YOa<X0> {
}

// class id: 404, size: 0x14, field offset: 0xc
//   const constructor, 
class HPa<X0, X1> extends _GPa<X0, X1>
    implements aPa<X0> {
}

// class id: 405, size: 0x8, field offset: 0x8
abstract class CPa extends Object {
}

// class id: 406, size: 0xc, field offset: 0x8
abstract class tPa<X0> extends Object
    implements qPa {
}

// class id: 407, size: 0xc, field offset: 0x8
//   const constructor, 
abstract class sPa<X0> extends Object
    implements tPa<X0>, hPa {
}

// class id: 408, size: 0xc, field offset: 0xc
//   const constructor, transformed mixin,
abstract class _xPa<C1X0 bound nza, C1X1, C1X2, C1X3, C1X4 bound eza> extends sPa<C1X0 bound nza>
     with _uPa<X0, X1, X2 bound eza> {
}

// class id: 409, size: 0x24, field offset: 0xc
//   const constructor, 
abstract class BPa<C1X0 bound nza, C1X1, C1X2, C1X3, C1X4 bound eza> extends _xPa<C1X0 bound nza, C1X1, C1X2, C1X3, C1X4 bound eza> {

  C1X4 call(BPa<C1X0, C1X1, C1X2, C1X3, C1X4>, C1X2) {
    // ** addr: 0x716a50, size: 0x140
    // 0x716a50: EnterFrame
    //     0x716a50: stp             fp, lr, [SP, #-0x10]!
    //     0x716a54: mov             fp, SP
    // 0x716a58: AllocStack(0x78)
    //     0x716a58: sub             SP, SP, #0x78
    // 0x716a5c: CheckStackOverflow
    //     0x716a5c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x716a60: cmp             SP, x16
    //     0x716a64: b.ls            #0x716b70
    // 0x716a68: r1 = 2
    //     0x716a68: mov             x1, #2
    // 0x716a6c: r0 = AllocateContext()
    //     0x716a6c: bl              #0x74be90  ; AllocateContextStub
    // 0x716a70: mov             x4, x0
    // 0x716a74: ldr             x3, [fp, #0x18]
    // 0x716a78: stur            x4, [fp, #-0x10]
    // 0x716a7c: StoreField: r4->field_f = r3
    //     0x716a7c: stur            w3, [x4, #0xf]
    // 0x716a80: ldr             x5, [fp, #0x10]
    // 0x716a84: StoreField: r4->field_13 = r5
    //     0x716a84: stur            w5, [x4, #0x13]
    // 0x716a88: LoadField: r6 = r3->field_7
    //     0x716a88: ldur            w6, [x3, #7]
    // 0x716a8c: DecompressPointer r6
    //     0x716a8c: add             x6, x6, HEAP, lsl #32
    // 0x716a90: mov             x0, x5
    // 0x716a94: mov             x2, x6
    // 0x716a98: stur            x6, [fp, #-8]
    // 0x716a9c: r1 = Null
    //     0x716a9c: mov             x1, NULL
    // 0x716aa0: cmp             w2, NULL
    // 0x716aa4: b.eq            #0x716ac8
    // 0x716aa8: LoadField: r4 = r2->field_23
    //     0x716aa8: ldur            w4, [x2, #0x23]
    // 0x716aac: DecompressPointer r4
    //     0x716aac: add             x4, x4, HEAP, lsl #32
    // 0x716ab0: r8 = C1X2
    //     0x716ab0: add             x8, PP, #0x19, lsl #12  ; [pp+0x19c18] TypeParameter: C1X2
    //     0x716ab4: ldr             x8, [x8, #0xc18]
    // 0x716ab8: LoadField: r9 = r4->field_7
    //     0x716ab8: ldur            x9, [x4, #7]
    // 0x716abc: r3 = Null
    //     0x716abc: add             x3, PP, #0x19, lsl #12  ; [pp+0x19c30] Null
    //     0x716ac0: ldr             x3, [x3, #0xc30]
    // 0x716ac4: blr             x9
    // 0x716ac8: ldr             x0, [fp, #0x18]
    // 0x716acc: LoadField: r3 = r0->field_13
    //     0x716acc: ldur            w3, [x0, #0x13]
    // 0x716ad0: DecompressPointer r3
    //     0x716ad0: add             x3, x3, HEAP, lsl #32
    // 0x716ad4: stur            x3, [fp, #-0x38]
    // 0x716ad8: ArrayLoad: r4 = r0[0]  ; List_4
    //     0x716ad8: ldur            w4, [x0, #0x17]
    // 0x716adc: DecompressPointer r4
    //     0x716adc: add             x4, x4, HEAP, lsl #32
    // 0x716ae0: stur            x4, [fp, #-0x30]
    // 0x716ae4: LoadField: r5 = r0->field_1b
    //     0x716ae4: ldur            w5, [x0, #0x1b]
    // 0x716ae8: DecompressPointer r5
    //     0x716ae8: add             x5, x5, HEAP, lsl #32
    // 0x716aec: stur            x5, [fp, #-0x28]
    // 0x716af0: LoadField: r6 = r0->field_1f
    //     0x716af0: ldur            w6, [x0, #0x1f]
    // 0x716af4: DecompressPointer r6
    //     0x716af4: add             x6, x6, HEAP, lsl #32
    // 0x716af8: stur            x6, [fp, #-0x20]
    // 0x716afc: LoadField: r7 = r0->field_b
    //     0x716afc: ldur            w7, [x0, #0xb]
    // 0x716b00: DecompressPointer r7
    //     0x716b00: add             x7, x7, HEAP, lsl #32
    // 0x716b04: ldur            x2, [fp, #-0x10]
    // 0x716b08: stur            x7, [fp, #-0x18]
    // 0x716b0c: r1 = Function '<anonymous closure>':.
    //     0x716b0c: add             x1, PP, #0x19, lsl #12  ; [pp+0x19c40] AnonymousClosure: (0x457374), in [ONh] BPa::call (0x716a50)
    //     0x716b10: ldr             x1, [x1, #0xc40]
    // 0x716b14: r0 = AllocateClosure()
    //     0x716b14: bl              #0x74bfa8  ; AllocateClosureStub
    // 0x716b18: mov             x1, x0
    // 0x716b1c: ldur            x0, [fp, #-8]
    // 0x716b20: StoreField: r1->field_7 = r0
    //     0x716b20: stur            w0, [x1, #7]
    // 0x716b24: ldur            x16, [fp, #-0x18]
    // 0x716b28: stp             x1, x16, [SP, #0x30]
    // 0x716b2c: ldur            x16, [fp, #-0x38]
    // 0x716b30: ldr             lr, [fp, #0x18]
    // 0x716b34: stp             lr, x16, [SP, #0x20]
    // 0x716b38: ldr             x16, [fp, #0x10]
    // 0x716b3c: ldur            lr, [fp, #-0x30]
    // 0x716b40: stp             lr, x16, [SP, #0x10]
    // 0x716b44: ldur            x16, [fp, #-0x28]
    // 0x716b48: ldur            lr, [fp, #-0x20]
    // 0x716b4c: stp             lr, x16, [SP]
    // 0x716b50: ldur            x0, [fp, #-0x18]
    // 0x716b54: ClosureCall
    //     0x716b54: add             x4, PP, #0x19, lsl #12  ; [pp+0x19c48] List(17) [0, 0x8, 0x8, 0x2, "XVe", 0x6, "Xfb", 0x4, "from", 0x3, "name", 0x2, "vWe", 0x7, "zYc", 0x5, Null]
    //     0x716b58: ldr             x4, [x4, #0xc48]
    //     0x716b5c: ldur            x2, [x0, #0x1f]
    //     0x716b60: blr             x2
    // 0x716b64: LeaveFrame
    //     0x716b64: mov             SP, fp
    //     0x716b68: ldp             fp, lr, [SP], #0x10
    // 0x716b6c: ret
    //     0x716b6c: ret             
    // 0x716b70: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x716b70: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x716b74: b               #0x716a68
  }
  [closure] C1X3 <anonymous closure>(dynamic, C1X0) {
    // ** addr: 0x457374, size: -0x1
  }
}

// class id: 412, size: 0xc, field offset: 0xc
abstract class _uPa<X0, X1, X2 bound eza> extends sPa<X0> {
}

// class id: 413, size: 0x8, field offset: 0x8
abstract class qPa extends Object {
}

// class id: 414, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class pPa extends Object {
}

// class id: 415, size: 0x34, field offset: 0x8
class oPa extends Object
    implements le {

  late final NPa bHc; // offset: 0x8

  [closure] void <anonymous closure>(dynamic, rza<dynamic>) {
    // ** addr: 0x3c2164, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, rza<dynamic>) {
    // ** addr: 0x3c1ed0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, rza<dynamic>) {
    // ** addr: 0x3c20c8, size: -0x1
  }
  [closure] void dGg(dynamic, oPa) {
    // ** addr: 0x4de178, size: -0x1
  }
  [closure] _nPa fGg(dynamic) {
    // ** addr: 0x511804, size: -0x1
  }
  [closure] void hGg(dynamic, {required eza<Object?> zGc, required eza<Object?> Rad}) {
    // ** addr: 0x511f90, size: -0x1
  }
  [closure] oPa? <anonymous closure>(dynamic, hPa) {
    // ** addr: 0x511eb4, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, oPa?) {
    // ** addr: 0x335ec4, size: -0x1
  }
  [closure] oPa <anonymous closure>(dynamic, oPa, oPa?) {
    // ** addr: 0x511e6c, size: -0x1
  }
  [closure] _nPa <anonymous closure>(dynamic) {
    // ** addr: 0x511e08, size: -0x1
  }
}

// class id: 416, size: 0x1c, field offset: 0x8
class _nPa extends Object {

  [closure] void <anonymous closure>(dynamic, nQa<Object?>) {
    // ** addr: 0x5116ac, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, oQa<Object?>) {
    // ** addr: 0x51161c, size: -0x1
  }
}

// class id: 417, size: 0x10, field offset: 0x8
class _mPa extends Object {
}

// class id: 418, size: 0x8, field offset: 0x8
abstract class le extends Object {
}

// class id: 419, size: 0xc, field offset: 0x8
abstract class jPa<X0> extends Object
    implements ZOa<X0> {
}

// class id: 420, size: 0x10, field offset: 0x8
class iPa extends Object
    implements qPa {
}

// class id: 421, size: 0x10, field offset: 0x8
//   const constructor, 
abstract class hPa extends Object
    implements CPa {
}

// class id: 422, size: 0x14, field offset: 0x10
//   const constructor, transformed mixin,
abstract class _fPa<X0> extends hPa
     with ZOa<X0> {
}

// class id: 423, size: 0x1c, field offset: 0x14
//   const constructor, 
abstract class eza<X0> extends _fPa<X0>
    implements iPa, jPa<X0> {

  [closure] void <anonymous closure>(dynamic, Object?, Object?) {
    // ** addr: 0x5120a8, size: -0x1
  }
}

// class id: 439, size: 0x1c, field offset: 0x1c
//   const constructor, transformed mixin,
abstract class _OPa<X0> extends eza<X0>
     with pza<X0> {
}

// class id: 440, size: 0x20, field offset: 0x1c
class PPa<X0> extends _OPa<X0> {
}

// class id: 441, size: 0x1c, field offset: 0x1c
abstract class lPa<X0> extends eza<X0> {
}

// class id: 442, size: 0x1c, field offset: 0x1c
abstract class pza<X0> extends eza<X0>
    implements YOa<X0>, aPa<X0> {
}

// class id: 448, size: 0xc, field offset: 0x8
abstract class aPa<X0> extends Object
    implements jPa<X0>, YOa<X0> {
}

// class id: 449, size: 0xc, field offset: 0x8
abstract class ZOa<X0> extends Object
    implements CPa {
}

// class id: 450, size: 0xc, field offset: 0xc
abstract class cPa<C1X0> extends ZOa<C1X0> {
}

// class id: 451, size: 0xc, field offset: 0xc
abstract class YOa<X0> extends ZOa<X0> {
}

// class id: 452, size: 0xc, field offset: 0xc
abstract class ePa<C1X0> extends YOa<C1X0> {
}

// class id: 764, size: 0x14, field offset: 0x8
abstract class Aza<X0> extends Object {
}

// class id: 765, size: 0x20, field offset: 0x14
class _KPa<C1X0, C1X1> extends Aza<C1X0> {
}

// class id: 767, size: 0x20, field offset: 0x14
class _kPa<X0> extends Aza<X0> {

  [closure] X0 jGb(dynamic) {
    // ** addr: 0x512888, size: -0x1
  }
}

// class id: 770, size: 0x60, field offset: 0x8
abstract class rza<X0> extends Object
    implements nza<X0>, le {

  late final oPa _PKd; // offset: 0x14
  late eza<Object?> _RLd; // offset: 0xc

  [closure] Null <anonymous closure>(dynamic, nQa<X0>) {
    // ** addr: 0x4debf0, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, oQa<X0>) {
    // ** addr: 0x4dea40, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, oQa<X0>) {
    // ** addr: 0x1fc72c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, rza<dynamic>) {
    // ** addr: 0x4de960, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, cQa<dynamic>) {
    // ** addr: 0x4de8b0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, rza<dynamic>) {
    // ** addr: 0x4de81c, size: -0x1
  }
  [closure] void yyc(dynamic, Object?) {
    // ** addr: 0x4e09d8, size: -0x1
  }
  [closure] void Al(dynamic, Object?) {
    // ** addr: 0x51f968, size: -0x1
  }
}

// class id: 783, size: 0x64, field offset: 0x60
class QPa<X0> extends rza<X0> {

  [closure] void Al(dynamic, Object?) {
    // ** addr: 0x51f7e4, size: -0x1
  }
}

// class id: 785, size: 0x60, field offset: 0x60
abstract class lza<X0> extends rza<X0>
    implements hza<X0> {
}

// class id: 789, size: 0xc, field offset: 0x8
abstract class nza<X0> extends Object {
}

// class id: 790, size: 0xc, field offset: 0xc
abstract class hza<X0> extends nza<X0> {
}

// class id: 5055, size: 0xc, field offset: 0xc
class rPa extends Error {
}
