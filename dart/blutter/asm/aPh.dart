// lib: , url: aPh

// class id: 1049494, size: 0x8
class :: {
}

// class id: 315, size: 0x14, field offset: 0x8
class WSa extends XSa {
}

// class id: 320, size: 0x1c, field offset: 0x8
abstract class ISa extends Object
    implements Kx {

  [closure] void <anonymous closure>(dynamic, DSa, List<BSa>) {
    // ** addr: 0x61f458, size: -0x1
  }
}

// class id: 5039, size: 0x14, field offset: 0xc
class YSa extends B<dynamic> {

  void []=(YSa, int, Object?) {
    // ** addr: 0x739c00, size: 0x7c
    // 0x739c00: EnterFrame
    //     0x739c00: stp             fp, lr, [SP, #-0x10]!
    //     0x739c04: mov             fp, SP
    // 0x739c08: ldr             x0, [fp, #0x18]
    // 0x739c0c: r2 = Null
    //     0x739c0c: mov             x2, NULL
    // 0x739c10: r1 = Null
    //     0x739c10: mov             x1, NULL
    // 0x739c14: branchIfSmi(r0, 0x739c3c)
    //     0x739c14: tbz             w0, #0, #0x739c3c
    // 0x739c18: r4 = LoadClassIdInstr(r0)
    //     0x739c18: ldur            x4, [x0, #-1]
    //     0x739c1c: ubfx            x4, x4, #0xc, #0x14
    // 0x739c20: sub             x4, x4, #0x3b
    // 0x739c24: cmp             x4, #1
    // 0x739c28: b.ls            #0x739c3c
    // 0x739c2c: r8 = int
    //     0x739c2c: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x739c30: r3 = Null
    //     0x739c30: add             x3, PP, #0x2d, lsl #12  ; [pp+0x2dba8] Null
    //     0x739c34: ldr             x3, [x3, #0xba8]
    // 0x739c38: r0 = int()
    //     0x739c38: bl              #0x7586bc  ; IsType_int_Stub
    // 0x739c3c: r0 = ArgumentError()
    //     0x739c3c: bl              #0x6cad10  ; AllocateArgumentErrorStub -> ArgumentError (size=0x1c)
    // 0x739c40: mov             x1, x0
    // 0x739c44: r0 = "The argument list is unmodifiable"
    //     0x739c44: add             x0, PP, #0x1c, lsl #12  ; [pp+0x1c398] "The argument list is unmodifiable"
    //     0x739c48: ldr             x0, [x0, #0x398]
    // 0x739c4c: ArrayStore: r1[0] = r0  ; List_4
    //     0x739c4c: stur            w0, [x1, #0x17]
    // 0x739c50: r0 = false
    //     0x739c50: add             x0, NULL, #0x30  ; false
    // 0x739c54: StoreField: r1->field_b = r0
    //     0x739c54: stur            w0, [x1, #0xb]
    // 0x739c58: mov             x0, x1
    // 0x739c5c: r0 = Throw()
    //     0x739c5c: bl              #0x74b258  ; ThrowStub
    // 0x739c60: brk             #0
  }
  Object? [](YSa, int) {
    // ** addr: 0x739c7c, size: 0x88
    // 0x739c7c: EnterFrame
    //     0x739c7c: stp             fp, lr, [SP, #-0x10]!
    //     0x739c80: mov             fp, SP
    // 0x739c84: AllocStack(0x10)
    //     0x739c84: sub             SP, SP, #0x10
    // 0x739c88: CheckStackOverflow
    //     0x739c88: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x739c8c: cmp             SP, x16
    //     0x739c90: b.ls            #0x739ce4
    // 0x739c94: ldr             x0, [fp, #0x10]
    // 0x739c98: r2 = Null
    //     0x739c98: mov             x2, NULL
    // 0x739c9c: r1 = Null
    //     0x739c9c: mov             x1, NULL
    // 0x739ca0: branchIfSmi(r0, 0x739cc8)
    //     0x739ca0: tbz             w0, #0, #0x739cc8
    // 0x739ca4: r4 = LoadClassIdInstr(r0)
    //     0x739ca4: ldur            x4, [x0, #-1]
    //     0x739ca8: ubfx            x4, x4, #0xc, #0x14
    // 0x739cac: sub             x4, x4, #0x3b
    // 0x739cb0: cmp             x4, #1
    // 0x739cb4: b.ls            #0x739cc8
    // 0x739cb8: r8 = int
    //     0x739cb8: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x739cbc: r3 = Null
    //     0x739cbc: add             x3, PP, #0x1c, lsl #12  ; [pp+0x1c3a0] Null
    //     0x739cc0: ldr             x3, [x3, #0x3a0]
    // 0x739cc4: r0 = int()
    //     0x739cc4: bl              #0x7586bc  ; IsType_int_Stub
    // 0x739cc8: ldr             x16, [fp, #0x18]
    // 0x739ccc: ldr             lr, [fp, #0x10]
    // 0x739cd0: stp             lr, x16, [SP]
    // 0x739cd4: r0 = call 0x60bf20
    //     0x739cd4: bl              #0x60bf20
    // 0x739cd8: LeaveFrame
    //     0x739cd8: mov             SP, fp
    //     0x739cdc: ldp             fp, lr, [SP], #0x10
    // 0x739ce0: ret
    //     0x739ce0: ret             
    // 0x739ce4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x739ce4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x739ce8: b               #0x739c94
  }
}
