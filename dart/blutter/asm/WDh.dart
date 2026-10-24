// lib: , url: WDh

// class id: 1048958, size: 0x8
class :: {

  static late final int _oTd; // offset: 0xaa4

  [closure] static List<OZ> <anonymous closure>(dynamic, _SZ) {
    // ** addr: 0x6c161c, size: -0x1
  }
}

// class id: 1444, size: 0xa0, field offset: 0x8
class VZ extends Object {

  [closure] void DRd(dynamic, nW) {
    // ** addr: 0x67b014, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, ls, (dynamic, Object?) => void) {
    // ** addr: 0x679fec, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, Object?) {
    // ** addr: 0x307878, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, Object?) {
    // ** addr: 0x30798c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, Object?) {
    // ** addr: 0x307b58, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, Object?) {
    // ** addr: 0x307c6c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, Object?) {
    // ** addr: 0x307e70, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, Object?) {
    // ** addr: 0x307f88, size: -0x1
  }
}

// class id: 1445, size: 0x18, field offset: 0x8
class _TZ extends Object
    implements Ba<X0> {
}

// class id: 1446, size: 0x18, field offset: 0x8
class _SZ extends Object
    implements Ba<X0> {

  [closure] List<OZ> <anonymous closure>(dynamic, _SZ) {
    // ** addr: 0x6c1c94, size: -0x1
  }
  [closure] int <anonymous closure>(dynamic, OZ, OZ) {
    // ** addr: 0x6c25ec, size: -0x1
  }
  [closure] void Lqf(dynamic, int) {
    // ** addr: 0x6c2448, size: -0x1
  }
  [closure] OZ <anonymous closure>(dynamic, int) {
    // ** addr: 0x6c23d4, size: -0x1
  }
}

// class id: 1447, size: 0x18, field offset: 0x8
class _RZ extends Object
    implements Ba<X0> {
}

// class id: 1448, size: 0x10, field offset: 0x8
class KZ extends Object {

  KZ +(KZ, KZ) {
    // ** addr: 0x6d0848, size: 0x88
    // 0x6d0848: EnterFrame
    //     0x6d0848: stp             fp, lr, [SP, #-0x10]!
    //     0x6d084c: mov             fp, SP
    // 0x6d0850: AllocStack(0x10)
    //     0x6d0850: sub             SP, SP, #0x10
    // 0x6d0854: CheckStackOverflow
    //     0x6d0854: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d0858: cmp             SP, x16
    //     0x6d085c: b.ls            #0x6d08b0
    // 0x6d0860: ldr             x0, [fp, #0x10]
    // 0x6d0864: r2 = Null
    //     0x6d0864: mov             x2, NULL
    // 0x6d0868: r1 = Null
    //     0x6d0868: mov             x1, NULL
    // 0x6d086c: r4 = 59
    //     0x6d086c: mov             x4, #0x3b
    // 0x6d0870: branchIfSmi(r0, 0x6d087c)
    //     0x6d0870: tbz             w0, #0, #0x6d087c
    // 0x6d0874: r4 = LoadClassIdInstr(r0)
    //     0x6d0874: ldur            x4, [x0, #-1]
    //     0x6d0878: ubfx            x4, x4, #0xc, #0x14
    // 0x6d087c: cmp             x4, #0x5a8
    // 0x6d0880: b.eq            #0x6d0894
    // 0x6d0884: r8 = KZ
    //     0x6d0884: ldr             x8, [PP, #0x7c48]  ; [pp+0x7c48] Type: KZ
    // 0x6d0888: r3 = Null
    //     0x6d0888: add             x3, PP, #0x28, lsl #12  ; [pp+0x28220] Null
    //     0x6d088c: ldr             x3, [x3, #0x220]
    // 0x6d0890: r0 = KZ()
    //     0x6d0890: bl              #0x6d08ec  ; IsType_KZ_Stub
    // 0x6d0894: ldr             x16, [fp, #0x18]
    // 0x6d0898: ldr             lr, [fp, #0x10]
    // 0x6d089c: stp             lr, x16, [SP]
    // 0x6d08a0: r0 = call 0x2307b4
    //     0x6d08a0: bl              #0x2307b4
    // 0x6d08a4: LeaveFrame
    //     0x6d08a4: mov             SP, fp
    //     0x6d08a8: ldp             fp, lr, [SP], #0x10
    // 0x6d08ac: ret
    //     0x6d08ac: ret             
    // 0x6d08b0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d08b0: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d08b4: b               #0x6d0860
  }
}

// class id: 1449, size: 0x14, field offset: 0x8
//   const constructor, 
class JZ extends Object {

  static late final Map<int, JZ> _OOc; // offset: 0xa84
  static late final Map<JZ, int> _ZRd; // offset: 0xa88
}

// class id: 1450, size: 0x10, field offset: 0x8
class IZ extends Object {
}

// class id: 1451, size: 0x10, field offset: 0x8
class HZ extends Object {
}

// class id: 1501, size: 0xc, field offset: 0x8
//   const constructor, 
class nW extends Object {

  _OneByteString field_8;
}

// class id: 1538, size: 0xd0, field offset: 0x8
class OZ extends _AV {

  static late final Int32List _jSd; // offset: 0xa98
  static late final Float64List _lSd; // offset: 0xaa0
  static late final Int32List _kSd; // offset: 0xa9c
  static late final VZ _iSd; // offset: 0xa94

  [closure] bool <anonymous closure>(dynamic, OZ) {
    // ** addr: 0x6c3250, size: -0x1
  }
  [closure] void _wSd(dynamic, OZ) {
    // ** addr: 0x2cb6e8, size: -0x1
  }
  [closure] void _uSd(dynamic, OZ) {
    // ** addr: 0x2cbdb0, size: -0x1
  }
}

// class id: 2216, size: 0xc, field offset: 0xc
class _NZ extends OB<dynamic> {
}

// class id: 2270, size: 0x34, field offset: 0x24
class UZ extends UB {

  [closure] bool <anonymous closure>(dynamic, OZ) {
    // ** addr: 0x6c3d4c, size: -0x1
  }
  [closure] int <anonymous closure>(dynamic, OZ, OZ) {
    // ** addr: 0x6c3d10, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, OZ) {
    // ** addr: 0x6bcab0, size: -0x1
  }
  [closure] void IRb(dynamic) {
    // ** addr: 0x3cc818, size: -0x1
  }
}

// class id: 2438, size: 0xc, field offset: 0x8
//   const constructor, 
abstract class XZ extends _ry
    implements Ba<X0> {
}

// class id: 2439, size: 0x14, field offset: 0xc
//   const constructor, 
class YZ extends XZ {

  _Mint field_c;
}

// class id: 2440, size: 0x7c, field offset: 0x8
class MZ extends _ry {
}

// class id: 2962, size: 0x100, field offset: 0x8
//   const constructor, 
class QZ extends nC {
}
