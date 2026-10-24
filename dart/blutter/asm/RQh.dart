// lib: , url: RQh

// class id: 1049584, size: 0x8
class :: {
}

// class id: 4011, size: 0x18, field offset: 0x10
class AVa<X0 bound LUa> extends Vt<X0 bound LUa> {

  late final Set<CUa> _eQf; // offset: 0x14
  late final LUa _Qnb; // offset: 0x10

  void []=(AVa<X0>, int, X0) {
    // ** addr: 0x6c9634, size: 0x94
    // 0x6c9634: EnterFrame
    //     0x6c9634: stp             fp, lr, [SP, #-0x10]!
    //     0x6c9638: mov             fp, SP
    // 0x6c963c: AllocStack(0x18)
    //     0x6c963c: sub             SP, SP, #0x18
    // 0x6c9640: CheckStackOverflow
    //     0x6c9640: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6c9644: cmp             SP, x16
    //     0x6c9648: b.ls            #0x6c96a8
    // 0x6c964c: ldr             x0, [fp, #0x18]
    // 0x6c9650: r2 = Null
    //     0x6c9650: mov             x2, NULL
    // 0x6c9654: r1 = Null
    //     0x6c9654: mov             x1, NULL
    // 0x6c9658: branchIfSmi(r0, 0x6c9680)
    //     0x6c9658: tbz             w0, #0, #0x6c9680
    // 0x6c965c: r4 = LoadClassIdInstr(r0)
    //     0x6c965c: ldur            x4, [x0, #-1]
    //     0x6c9660: ubfx            x4, x4, #0xc, #0x14
    // 0x6c9664: sub             x4, x4, #0x3b
    // 0x6c9668: cmp             x4, #1
    // 0x6c966c: b.ls            #0x6c9680
    // 0x6c9670: r8 = int
    //     0x6c9670: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x6c9674: r3 = Null
    //     0x6c9674: add             x3, PP, #0x2d, lsl #12  ; [pp+0x2db98] Null
    //     0x6c9678: ldr             x3, [x3, #0xb98]
    // 0x6c967c: r0 = int()
    //     0x6c967c: bl              #0x7586bc  ; IsType_int_Stub
    // 0x6c9680: ldr             x16, [fp, #0x20]
    // 0x6c9684: ldr             lr, [fp, #0x18]
    // 0x6c9688: stp             lr, x16, [SP, #8]
    // 0x6c968c: ldr             x16, [fp, #0x10]
    // 0x6c9690: str             x16, [SP]
    // 0x6c9694: r0 = call 0x6135f4
    //     0x6c9694: bl              #0x6135f4
    // 0x6c9698: r0 = Null
    //     0x6c9698: mov             x0, NULL
    // 0x6c969c: LeaveFrame
    //     0x6c969c: mov             SP, fp
    //     0x6c96a0: ldp             fp, lr, [SP], #0x10
    // 0x6c96a4: ret
    //     0x6c96a4: ret             
    // 0x6c96a8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6c96a8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6c96ac: b               #0x6c964c
  }
  [closure] X0 <anonymous closure>(dynamic, LUa) {
    // ** addr: 0x1fb6ac, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, X0) {
    // ** addr: 0x1fc4f4, size: -0x1
  }
}
