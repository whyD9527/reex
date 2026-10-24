// lib: , url: TOh

// class id: 1049487, size: 0x8
class :: {

  [closure] static void <anonymous closure>(dynamic, Pointer<SSa>, int, Pointer<Pointer<RSa>>) {
    // ** addr: 0x61f174, size: -0x1
  }
}

// class id: 325, size: 0x10, field offset: 0x8
class CSa extends DSa {
}

// class id: 327, size: 0x10, field offset: 0x8
class ASa extends BSa {
}

// class id: 329, size: 0x18, field offset: 0x8
class ySa extends zSa {
}

// class id: 331, size: 0x18, field offset: 0x8
class wSa extends xSa {
}

// class id: 333, size: 0x14, field offset: 0x8
class uSa extends vSa {

  [closure] static void VDb(dynamic, Pointer<Void>) {
    // ** addr: 0x61efd4, size: -0x1
  }
}

// class id: 335, size: 0xc, field offset: 0x8
class sSa extends tSa {
}

// class id: 336, size: 0x14, field offset: 0x8
class rSa extends Object {
}

// class id: 5040, size: 0x1c, field offset: 0xc
class _ESa extends B<dynamic> {

  void []=(_ESa, int, ASa) {
    // ** addr: 0x7399a8, size: 0x9c
    // 0x7399a8: EnterFrame
    //     0x7399a8: stp             fp, lr, [SP, #-0x10]!
    //     0x7399ac: mov             fp, SP
    // 0x7399b0: ldr             x0, [fp, #0x18]
    // 0x7399b4: r2 = Null
    //     0x7399b4: mov             x2, NULL
    // 0x7399b8: r1 = Null
    //     0x7399b8: mov             x1, NULL
    // 0x7399bc: branchIfSmi(r0, 0x7399e4)
    //     0x7399bc: tbz             w0, #0, #0x7399e4
    // 0x7399c0: r4 = LoadClassIdInstr(r0)
    //     0x7399c0: ldur            x4, [x0, #-1]
    //     0x7399c4: ubfx            x4, x4, #0xc, #0x14
    // 0x7399c8: sub             x4, x4, #0x3b
    // 0x7399cc: cmp             x4, #1
    // 0x7399d0: b.ls            #0x7399e4
    // 0x7399d4: r8 = int
    //     0x7399d4: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x7399d8: r3 = Null
    //     0x7399d8: add             x3, PP, #0x2d, lsl #12  ; [pp+0x2dbb8] Null
    //     0x7399dc: ldr             x3, [x3, #0xbb8]
    // 0x7399e0: r0 = int()
    //     0x7399e0: bl              #0x7586bc  ; IsType_int_Stub
    // 0x7399e4: ldr             x0, [fp, #0x10]
    // 0x7399e8: r2 = Null
    //     0x7399e8: mov             x2, NULL
    // 0x7399ec: r1 = Null
    //     0x7399ec: mov             x1, NULL
    // 0x7399f0: r4 = 59
    //     0x7399f0: mov             x4, #0x3b
    // 0x7399f4: branchIfSmi(r0, 0x739a00)
    //     0x7399f4: tbz             w0, #0, #0x739a00
    // 0x7399f8: r4 = LoadClassIdInstr(r0)
    //     0x7399f8: ldur            x4, [x0, #-1]
    //     0x7399fc: ubfx            x4, x4, #0xc, #0x14
    // 0x739a00: cmp             x4, #0x147
    // 0x739a04: b.eq            #0x739a1c
    // 0x739a08: r8 = ASa
    //     0x739a08: add             x8, PP, #0x1c, lsl #12  ; [pp+0x1c4a0] Type: ASa
    //     0x739a0c: ldr             x8, [x8, #0x4a0]
    // 0x739a10: r3 = Null
    //     0x739a10: add             x3, PP, #0x2d, lsl #12  ; [pp+0x2dbc8] Null
    //     0x739a14: ldr             x3, [x3, #0xbc8]
    // 0x739a18: r0 = ASa()
    //     0x739a18: bl              #0x734da8  ; IsType_ASa_Stub
    // 0x739a1c: r0 = Null
    //     0x739a1c: mov             x0, NULL
    // 0x739a20: LeaveFrame
    //     0x739a20: mov             SP, fp
    //     0x739a24: ldp             fp, lr, [SP], #0x10
    // 0x739a28: ret
    //     0x739a28: ret             
  }
  ASa [](_ESa, int) {
    // ** addr: 0x739a44, size: 0x88
    // 0x739a44: EnterFrame
    //     0x739a44: stp             fp, lr, [SP, #-0x10]!
    //     0x739a48: mov             fp, SP
    // 0x739a4c: AllocStack(0x10)
    //     0x739a4c: sub             SP, SP, #0x10
    // 0x739a50: CheckStackOverflow
    //     0x739a50: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x739a54: cmp             SP, x16
    //     0x739a58: b.ls            #0x739aac
    // 0x739a5c: ldr             x0, [fp, #0x10]
    // 0x739a60: r2 = Null
    //     0x739a60: mov             x2, NULL
    // 0x739a64: r1 = Null
    //     0x739a64: mov             x1, NULL
    // 0x739a68: branchIfSmi(r0, 0x739a90)
    //     0x739a68: tbz             w0, #0, #0x739a90
    // 0x739a6c: r4 = LoadClassIdInstr(r0)
    //     0x739a6c: ldur            x4, [x0, #-1]
    //     0x739a70: ubfx            x4, x4, #0xc, #0x14
    // 0x739a74: sub             x4, x4, #0x3b
    // 0x739a78: cmp             x4, #1
    // 0x739a7c: b.ls            #0x739a90
    // 0x739a80: r8 = int
    //     0x739a80: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x739a84: r3 = Null
    //     0x739a84: add             x3, PP, #0x1c, lsl #12  ; [pp+0x1c4b8] Null
    //     0x739a88: ldr             x3, [x3, #0x4b8]
    // 0x739a8c: r0 = int()
    //     0x739a8c: bl              #0x7586bc  ; IsType_int_Stub
    // 0x739a90: ldr             x16, [fp, #0x18]
    // 0x739a94: ldr             lr, [fp, #0x10]
    // 0x739a98: stp             lr, x16, [SP]
    // 0x739a9c: r0 = call 0x60be2c
    //     0x739a9c: bl              #0x60be2c
    // 0x739aa0: LeaveFrame
    //     0x739aa0: mov             SP, fp
    //     0x739aa4: ldp             fp, lr, [SP], #0x10
    // 0x739aa8: ret
    //     0x739aa8: ret             
    // 0x739aac: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x739aac: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x739ab0: b               #0x739a5c
  }
}
