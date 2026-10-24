// lib: , url: CCh

// class id: 1048883, size: 0x8
class :: {
}

// class id: 1941, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class EL extends Object {

  EL +(EL, EL) {
    // ** addr: 0x6e3e44, size: 0x68
    // 0x6e3e44: EnterFrame
    //     0x6e3e44: stp             fp, lr, [SP, #-0x10]!
    //     0x6e3e48: mov             fp, SP
    // 0x6e3e4c: ldr             x0, [fp, #0x10]
    // 0x6e3e50: r2 = Null
    //     0x6e3e50: mov             x2, NULL
    // 0x6e3e54: r1 = Null
    //     0x6e3e54: mov             x1, NULL
    // 0x6e3e58: r4 = 59
    //     0x6e3e58: mov             x4, #0x3b
    // 0x6e3e5c: branchIfSmi(r0, 0x6e3e68)
    //     0x6e3e5c: tbz             w0, #0, #0x6e3e68
    // 0x6e3e60: r4 = LoadClassIdInstr(r0)
    //     0x6e3e60: ldur            x4, [x0, #-1]
    //     0x6e3e64: ubfx            x4, x4, #0xc, #0x14
    // 0x6e3e68: sub             x4, x4, #0x797
    // 0x6e3e6c: cmp             x4, #0xc
    // 0x6e3e70: b.ls            #0x6e3e88
    // 0x6e3e74: r8 = EL
    //     0x6e3e74: add             x8, PP, #0x23, lsl #12  ; [pp+0x23b58] Type: EL
    //     0x6e3e78: ldr             x8, [x8, #0xb58]
    // 0x6e3e7c: r3 = Null
    //     0x6e3e7c: add             x3, PP, #0x28, lsl #12  ; [pp+0x281a0] Null
    //     0x6e3e80: ldr             x3, [x3, #0x1a0]
    // 0x6e3e84: r0 = DefaultTypeTest()
    //     0x6e3e84: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x6e3e88: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x6e3e88: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x6e3e8c: r0 = Throw()
    //     0x6e3e8c: bl              #0x74b258  ; ThrowStub
    // 0x6e3e90: brk             #0
  }
}

// class id: 1946, size: 0xc, field offset: 0x8
//   const constructor, 
abstract class CS extends EL {

  [closure] static CS? wSb(dynamic, CS?, CS?, double) {
    // ** addr: 0x4ba73c, size: -0x1
  }
}

// class id: 2566, size: 0x20, field offset: 0x8
//   const constructor, 
class XH extends _ry {

  cr field_8;
  _Mint field_c;
  BS field_14;
  _Double field_18;
}

// class id: 4847, size: 0x14, field offset: 0x14
enum BS extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
