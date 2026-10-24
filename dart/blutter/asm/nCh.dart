// lib: , url: NCh

// class id: 1048894, size: 0x8
class :: {
}

// class id: 1875, size: 0x18, field offset: 0x18
//   const constructor, 
class cT extends hS {

  _Mint field_8;
  _Mint field_10;

  hS +(cT, hS) {
    // ** addr: 0x71d990, size: 0x90
    // 0x71d990: EnterFrame
    //     0x71d990: stp             fp, lr, [SP, #-0x10]!
    //     0x71d994: mov             fp, SP
    // 0x71d998: AllocStack(0x10)
    //     0x71d998: sub             SP, SP, #0x10
    // 0x71d99c: CheckStackOverflow
    //     0x71d99c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x71d9a0: cmp             SP, x16
    //     0x71d9a4: b.ls            #0x71da00
    // 0x71d9a8: ldr             x0, [fp, #0x10]
    // 0x71d9ac: r2 = Null
    //     0x71d9ac: mov             x2, NULL
    // 0x71d9b0: r1 = Null
    //     0x71d9b0: mov             x1, NULL
    // 0x71d9b4: r4 = 59
    //     0x71d9b4: mov             x4, #0x3b
    // 0x71d9b8: branchIfSmi(r0, 0x71d9c4)
    //     0x71d9b8: tbz             w0, #0, #0x71d9c4
    // 0x71d9bc: r4 = LoadClassIdInstr(r0)
    //     0x71d9bc: ldur            x4, [x0, #-1]
    //     0x71d9c0: ubfx            x4, x4, #0xc, #0x14
    // 0x71d9c4: sub             x4, x4, #0x752
    // 0x71d9c8: cmp             x4, #1
    // 0x71d9cc: b.ls            #0x71d9e4
    // 0x71d9d0: r8 = hS
    //     0x71d9d0: add             x8, PP, #0x28, lsl #12  ; [pp+0x28120] Type: hS
    //     0x71d9d4: ldr             x8, [x8, #0x120]
    // 0x71d9d8: r3 = Null
    //     0x71d9d8: add             x3, PP, #0x28, lsl #12  ; [pp+0x28128] Null
    //     0x71d9dc: ldr             x3, [x3, #0x128]
    // 0x71d9e0: r0 = DefaultTypeTest()
    //     0x71d9e0: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x71d9e4: ldr             x16, [fp, #0x18]
    // 0x71d9e8: ldr             lr, [fp, #0x10]
    // 0x71d9ec: stp             lr, x16, [SP]
    // 0x71d9f0: r0 = call 0x48f664
    //     0x71d9f0: bl              #0x48f664
    // 0x71d9f4: LeaveFrame
    //     0x71d9f4: mov             SP, fp
    //     0x71d9f8: ldp             fp, lr, [SP], #0x10
    // 0x71d9fc: ret
    //     0x71d9fc: ret             
    // 0x71da00: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x71da00: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x71da04: b               #0x71d9a8
  }
  cT *(cT, double) {
    // ** addr: 0x71da2c, size: 0x5c
    // 0x71da2c: EnterFrame
    //     0x71da2c: stp             fp, lr, [SP, #-0x10]!
    //     0x71da30: mov             fp, SP
    // 0x71da34: AllocStack(0x10)
    //     0x71da34: sub             SP, SP, #0x10
    // 0x71da38: CheckStackOverflow
    //     0x71da38: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x71da3c: cmp             SP, x16
    //     0x71da40: b.ls            #0x71da68
    // 0x71da44: ldr             x0, [fp, #0x10]
    // 0x71da48: LoadField: d0 = r0->field_7
    //     0x71da48: ldur            d0, [x0, #7]
    // 0x71da4c: ldr             x16, [fp, #0x18]
    // 0x71da50: str             x16, [SP, #8]
    // 0x71da54: str             d0, [SP]
    // 0x71da58: r0 = call 0x64e940
    //     0x71da58: bl              #0x64e940
    // 0x71da5c: LeaveFrame
    //     0x71da5c: mov             SP, fp
    //     0x71da60: ldp             fp, lr, [SP], #0x10
    // 0x71da64: ret
    //     0x71da64: ret             
    // 0x71da68: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x71da68: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x71da6c: b               #0x71da44
  }
  hS -(cT, hS) {
    // ** addr: 0x71da88, size: 0x90
    // 0x71da88: EnterFrame
    //     0x71da88: stp             fp, lr, [SP, #-0x10]!
    //     0x71da8c: mov             fp, SP
    // 0x71da90: AllocStack(0x10)
    //     0x71da90: sub             SP, SP, #0x10
    // 0x71da94: CheckStackOverflow
    //     0x71da94: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x71da98: cmp             SP, x16
    //     0x71da9c: b.ls            #0x71daf8
    // 0x71daa0: ldr             x0, [fp, #0x10]
    // 0x71daa4: r2 = Null
    //     0x71daa4: mov             x2, NULL
    // 0x71daa8: r1 = Null
    //     0x71daa8: mov             x1, NULL
    // 0x71daac: r4 = 59
    //     0x71daac: mov             x4, #0x3b
    // 0x71dab0: branchIfSmi(r0, 0x71dabc)
    //     0x71dab0: tbz             w0, #0, #0x71dabc
    // 0x71dab4: r4 = LoadClassIdInstr(r0)
    //     0x71dab4: ldur            x4, [x0, #-1]
    //     0x71dab8: ubfx            x4, x4, #0xc, #0x14
    // 0x71dabc: sub             x4, x4, #0x752
    // 0x71dac0: cmp             x4, #1
    // 0x71dac4: b.ls            #0x71dadc
    // 0x71dac8: r8 = hS
    //     0x71dac8: add             x8, PP, #0x28, lsl #12  ; [pp+0x28120] Type: hS
    //     0x71dacc: ldr             x8, [x8, #0x120]
    // 0x71dad0: r3 = Null
    //     0x71dad0: add             x3, PP, #0x28, lsl #12  ; [pp+0x28138] Null
    //     0x71dad4: ldr             x3, [x3, #0x138]
    // 0x71dad8: r0 = DefaultTypeTest()
    //     0x71dad8: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x71dadc: ldr             x16, [fp, #0x18]
    // 0x71dae0: ldr             lr, [fp, #0x10]
    // 0x71dae4: stp             lr, x16, [SP]
    // 0x71dae8: r0 = call 0x48f72c
    //     0x71dae8: bl              #0x48f72c
    // 0x71daec: LeaveFrame
    //     0x71daec: mov             SP, fp
    //     0x71daf0: ldp             fp, lr, [SP], #0x10
    // 0x71daf4: ret
    //     0x71daf4: ret             
    // 0x71daf8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x71daf8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x71dafc: b               #0x71daa0
  }
}
