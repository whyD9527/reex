// lib: , url: TDh

// class id: 1048955, size: 0x8
class :: {
}

// class id: 1458, size: 0x10, field offset: 0x8
//   const constructor, 
class wZ extends Object {

  _Mint field_8;

  wZ +(wZ, int) {
    // ** addr: 0x6fa5b0, size: 0x88
    // 0x6fa5b0: EnterFrame
    //     0x6fa5b0: stp             fp, lr, [SP, #-0x10]!
    //     0x6fa5b4: mov             fp, SP
    // 0x6fa5b8: AllocStack(0x10)
    //     0x6fa5b8: sub             SP, SP, #0x10
    // 0x6fa5bc: CheckStackOverflow
    //     0x6fa5bc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6fa5c0: cmp             SP, x16
    //     0x6fa5c4: b.ls            #0x6fa618
    // 0x6fa5c8: ldr             x0, [fp, #0x10]
    // 0x6fa5cc: r2 = Null
    //     0x6fa5cc: mov             x2, NULL
    // 0x6fa5d0: r1 = Null
    //     0x6fa5d0: mov             x1, NULL
    // 0x6fa5d4: branchIfSmi(r0, 0x6fa5fc)
    //     0x6fa5d4: tbz             w0, #0, #0x6fa5fc
    // 0x6fa5d8: r4 = LoadClassIdInstr(r0)
    //     0x6fa5d8: ldur            x4, [x0, #-1]
    //     0x6fa5dc: ubfx            x4, x4, #0xc, #0x14
    // 0x6fa5e0: sub             x4, x4, #0x3b
    // 0x6fa5e4: cmp             x4, #1
    // 0x6fa5e8: b.ls            #0x6fa5fc
    // 0x6fa5ec: r8 = int
    //     0x6fa5ec: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x6fa5f0: r3 = Null
    //     0x6fa5f0: add             x3, PP, #0x33, lsl #12  ; [pp+0x33c08] Null
    //     0x6fa5f4: ldr             x3, [x3, #0xc08]
    // 0x6fa5f8: r0 = int()
    //     0x6fa5f8: bl              #0x7586bc  ; IsType_int_Stub
    // 0x6fa5fc: ldr             x16, [fp, #0x18]
    // 0x6fa600: ldr             lr, [fp, #0x10]
    // 0x6fa604: stp             lr, x16, [SP]
    // 0x6fa608: r0 = call 0x38e9bc
    //     0x6fa608: bl              #0x38e9bc
    // 0x6fa60c: LeaveFrame
    //     0x6fa60c: mov             SP, fp
    //     0x6fa610: ldp             fp, lr, [SP], #0x10
    // 0x6fa614: ret
    //     0x6fa614: ret             
    // 0x6fa618: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6fa618: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6fa61c: b               #0x6fa5c8
  }
  wZ -(wZ, int) {
    // ** addr: 0x6fa644, size: 0x88
    // 0x6fa644: EnterFrame
    //     0x6fa644: stp             fp, lr, [SP, #-0x10]!
    //     0x6fa648: mov             fp, SP
    // 0x6fa64c: AllocStack(0x10)
    //     0x6fa64c: sub             SP, SP, #0x10
    // 0x6fa650: CheckStackOverflow
    //     0x6fa650: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6fa654: cmp             SP, x16
    //     0x6fa658: b.ls            #0x6fa6ac
    // 0x6fa65c: ldr             x0, [fp, #0x10]
    // 0x6fa660: r2 = Null
    //     0x6fa660: mov             x2, NULL
    // 0x6fa664: r1 = Null
    //     0x6fa664: mov             x1, NULL
    // 0x6fa668: branchIfSmi(r0, 0x6fa690)
    //     0x6fa668: tbz             w0, #0, #0x6fa690
    // 0x6fa66c: r4 = LoadClassIdInstr(r0)
    //     0x6fa66c: ldur            x4, [x0, #-1]
    //     0x6fa670: ubfx            x4, x4, #0xc, #0x14
    // 0x6fa674: sub             x4, x4, #0x3b
    // 0x6fa678: cmp             x4, #1
    // 0x6fa67c: b.ls            #0x6fa690
    // 0x6fa680: r8 = int
    //     0x6fa680: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x6fa684: r3 = Null
    //     0x6fa684: add             x3, PP, #0x33, lsl #12  ; [pp+0x33bf8] Null
    //     0x6fa688: ldr             x3, [x3, #0xbf8]
    // 0x6fa68c: r0 = int()
    //     0x6fa68c: bl              #0x7586bc  ; IsType_int_Stub
    // 0x6fa690: ldr             x16, [fp, #0x18]
    // 0x6fa694: ldr             lr, [fp, #0x10]
    // 0x6fa698: stp             lr, x16, [SP]
    // 0x6fa69c: r0 = call 0x38ea58
    //     0x6fa69c: bl              #0x38ea58
    // 0x6fa6a0: LeaveFrame
    //     0x6fa6a0: mov             SP, fp
    //     0x6fa6a4: ldp             fp, lr, [SP], #0x10
    // 0x6fa6a8: ret
    //     0x6fa6a8: ret             
    // 0x6fa6ac: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6fa6ac: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6fa6b0: b               #0x6fa65c
  }
}
