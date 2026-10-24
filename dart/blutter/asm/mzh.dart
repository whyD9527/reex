// lib: , url: Mzh

// class id: 1048752, size: 0x8
class :: {
}

// class id: 2090, size: 0x10, field offset: 0x8
//   const constructor, 
class DF extends Object {

  Tq field_8;
  Tq field_c;

  DF -(DF, DF) {
    // ** addr: 0x705358, size: 0x8c
    // 0x705358: EnterFrame
    //     0x705358: stp             fp, lr, [SP, #-0x10]!
    //     0x70535c: mov             fp, SP
    // 0x705360: AllocStack(0x10)
    //     0x705360: sub             SP, SP, #0x10
    // 0x705364: CheckStackOverflow
    //     0x705364: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x705368: cmp             SP, x16
    //     0x70536c: b.ls            #0x7053c4
    // 0x705370: ldr             x0, [fp, #0x10]
    // 0x705374: r2 = Null
    //     0x705374: mov             x2, NULL
    // 0x705378: r1 = Null
    //     0x705378: mov             x1, NULL
    // 0x70537c: r4 = 59
    //     0x70537c: mov             x4, #0x3b
    // 0x705380: branchIfSmi(r0, 0x70538c)
    //     0x705380: tbz             w0, #0, #0x70538c
    // 0x705384: r4 = LoadClassIdInstr(r0)
    //     0x705384: ldur            x4, [x0, #-1]
    //     0x705388: ubfx            x4, x4, #0xc, #0x14
    // 0x70538c: cmp             x4, #0x82a
    // 0x705390: b.eq            #0x7053a8
    // 0x705394: r8 = DF
    //     0x705394: add             x8, PP, #0x29, lsl #12  ; [pp+0x293d8] Type: DF
    //     0x705398: ldr             x8, [x8, #0x3d8]
    // 0x70539c: r3 = Null
    //     0x70539c: add             x3, PP, #0x29, lsl #12  ; [pp+0x293e0] Null
    //     0x7053a0: ldr             x3, [x3, #0x3e0]
    // 0x7053a4: r0 = DefaultTypeTest()
    //     0x7053a4: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x7053a8: ldr             x16, [fp, #0x18]
    // 0x7053ac: ldr             lr, [fp, #0x10]
    // 0x7053b0: stp             lr, x16, [SP]
    // 0x7053b4: r0 = call 0x3c6b00
    //     0x7053b4: bl              #0x3c6b00
    // 0x7053b8: LeaveFrame
    //     0x7053b8: mov             SP, fp
    //     0x7053bc: ldp             fp, lr, [SP], #0x10
    // 0x7053c0: ret
    //     0x7053c0: ret             
    // 0x7053c4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7053c4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7053c8: b               #0x705370
  }
  DF +(DF, DF) {
    // ** addr: 0x7053e4, size: 0x8c
    // 0x7053e4: EnterFrame
    //     0x7053e4: stp             fp, lr, [SP, #-0x10]!
    //     0x7053e8: mov             fp, SP
    // 0x7053ec: AllocStack(0x10)
    //     0x7053ec: sub             SP, SP, #0x10
    // 0x7053f0: CheckStackOverflow
    //     0x7053f0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x7053f4: cmp             SP, x16
    //     0x7053f8: b.ls            #0x705450
    // 0x7053fc: ldr             x0, [fp, #0x10]
    // 0x705400: r2 = Null
    //     0x705400: mov             x2, NULL
    // 0x705404: r1 = Null
    //     0x705404: mov             x1, NULL
    // 0x705408: r4 = 59
    //     0x705408: mov             x4, #0x3b
    // 0x70540c: branchIfSmi(r0, 0x705418)
    //     0x70540c: tbz             w0, #0, #0x705418
    // 0x705410: r4 = LoadClassIdInstr(r0)
    //     0x705410: ldur            x4, [x0, #-1]
    //     0x705414: ubfx            x4, x4, #0xc, #0x14
    // 0x705418: cmp             x4, #0x82a
    // 0x70541c: b.eq            #0x705434
    // 0x705420: r8 = DF
    //     0x705420: add             x8, PP, #0x29, lsl #12  ; [pp+0x293d8] Type: DF
    //     0x705424: ldr             x8, [x8, #0x3d8]
    // 0x705428: r3 = Null
    //     0x705428: add             x3, PP, #0x29, lsl #12  ; [pp+0x293f0] Null
    //     0x70542c: ldr             x3, [x3, #0x3f0]
    // 0x705430: r0 = DefaultTypeTest()
    //     0x705430: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x705434: ldr             x16, [fp, #0x18]
    // 0x705438: ldr             lr, [fp, #0x10]
    // 0x70543c: stp             lr, x16, [SP]
    // 0x705440: r0 = call 0x3c6b8c
    //     0x705440: bl              #0x3c6b8c
    // 0x705444: LeaveFrame
    //     0x705444: mov             SP, fp
    //     0x705448: ldp             fp, lr, [SP], #0x10
    // 0x70544c: ret
    //     0x70544c: ret             
    // 0x705450: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x705450: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x705454: b               #0x7053fc
  }
}

// class id: 2165, size: 0x8, field offset: 0x8
//   transformed mixin,
abstract class _BF extends LC
     with JB {
}

// class id: 2166, size: 0x18, field offset: 0x8
abstract class yF extends _BF {
}

// class id: 2168, size: 0x24, field offset: 0x18
abstract class SE extends yF {
}

// class id: 2180, size: 0x48, field offset: 0x24
abstract class bF extends SE {

  [closure] void yqc(dynamic, PC) {
    // ** addr: 0x5a87c0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3c6e60, size: -0x1
  }
}

// class id: 4896, size: 0x14, field offset: 0x14
enum CF extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 4897, size: 0x14, field offset: 0x14
enum AF extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 4898, size: 0x14, field offset: 0x14
enum jF extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
