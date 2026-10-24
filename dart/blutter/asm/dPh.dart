// lib: , url: DPh

// class id: 1049525, size: 0x8
class :: {
}

// class id: 5036, size: 0x18, field offset: 0xc
abstract class KTa<X0> extends B<X0> {

  int length(KTa<X0>) {
    // ** addr: 0x6e213c, size: 0x48
    // 0x6e213c: EnterFrame
    //     0x6e213c: stp             fp, lr, [SP, #-0x10]!
    //     0x6e2140: mov             fp, SP
    // 0x6e2144: ldr             x2, [fp, #0x10]
    // 0x6e2148: LoadField: r3 = r2->field_f
    //     0x6e2148: ldur            x3, [x2, #0xf]
    // 0x6e214c: r0 = BoxInt64Instr(r3)
    //     0x6e214c: sbfiz           x0, x3, #1, #0x1f
    //     0x6e2150: cmp             x3, x0, asr #1
    //     0x6e2154: b.eq            #0x6e2160
    //     0x6e2158: bl              #0x74cee4  ; AllocateMintSharedWithoutFPURegsStub
    //     0x6e215c: stur            x3, [x0, #7]
    // 0x6e2160: LeaveFrame
    //     0x6e2160: mov             SP, fp
    //     0x6e2164: ldp             fp, lr, [SP], #0x10
    // 0x6e2168: ret
    //     0x6e2168: ret             
  }
  void []=(KTa<X0>, int, X0) {
    // ** addr: 0x6c8f64, size: 0x94
    // 0x6c8f64: EnterFrame
    //     0x6c8f64: stp             fp, lr, [SP, #-0x10]!
    //     0x6c8f68: mov             fp, SP
    // 0x6c8f6c: AllocStack(0x18)
    //     0x6c8f6c: sub             SP, SP, #0x18
    // 0x6c8f70: CheckStackOverflow
    //     0x6c8f70: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6c8f74: cmp             SP, x16
    //     0x6c8f78: b.ls            #0x6c8fd8
    // 0x6c8f7c: ldr             x0, [fp, #0x18]
    // 0x6c8f80: r2 = Null
    //     0x6c8f80: mov             x2, NULL
    // 0x6c8f84: r1 = Null
    //     0x6c8f84: mov             x1, NULL
    // 0x6c8f88: branchIfSmi(r0, 0x6c8fb0)
    //     0x6c8f88: tbz             w0, #0, #0x6c8fb0
    // 0x6c8f8c: r4 = LoadClassIdInstr(r0)
    //     0x6c8f8c: ldur            x4, [x0, #-1]
    //     0x6c8f90: ubfx            x4, x4, #0xc, #0x14
    // 0x6c8f94: sub             x4, x4, #0x3b
    // 0x6c8f98: cmp             x4, #1
    // 0x6c8f9c: b.ls            #0x6c8fb0
    // 0x6c8fa0: r8 = int
    //     0x6c8fa0: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x6c8fa4: r3 = Null
    //     0x6c8fa4: add             x3, PP, #0x30, lsl #12  ; [pp+0x30b98] Null
    //     0x6c8fa8: ldr             x3, [x3, #0xb98]
    // 0x6c8fac: r0 = int()
    //     0x6c8fac: bl              #0x7586bc  ; IsType_int_Stub
    // 0x6c8fb0: ldr             x16, [fp, #0x20]
    // 0x6c8fb4: ldr             lr, [fp, #0x18]
    // 0x6c8fb8: stp             lr, x16, [SP, #8]
    // 0x6c8fbc: ldr             x16, [fp, #0x10]
    // 0x6c8fc0: str             x16, [SP]
    // 0x6c8fc4: r0 = call 0x60380c
    //     0x6c8fc4: bl              #0x60380c
    // 0x6c8fc8: r0 = Null
    //     0x6c8fc8: mov             x0, NULL
    // 0x6c8fcc: LeaveFrame
    //     0x6c8fcc: mov             SP, fp
    //     0x6c8fd0: ldp             fp, lr, [SP], #0x10
    // 0x6c8fd4: ret
    //     0x6c8fd4: ret             
    // 0x6c8fd8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6c8fd8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6c8fdc: b               #0x6c8f7c
  }
  X0 [](KTa<X0>, int) {
    // ** addr: 0x6c8ff8, size: 0x88
    // 0x6c8ff8: EnterFrame
    //     0x6c8ff8: stp             fp, lr, [SP, #-0x10]!
    //     0x6c8ffc: mov             fp, SP
    // 0x6c9000: AllocStack(0x10)
    //     0x6c9000: sub             SP, SP, #0x10
    // 0x6c9004: CheckStackOverflow
    //     0x6c9004: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6c9008: cmp             SP, x16
    //     0x6c900c: b.ls            #0x6c9060
    // 0x6c9010: ldr             x0, [fp, #0x10]
    // 0x6c9014: r2 = Null
    //     0x6c9014: mov             x2, NULL
    // 0x6c9018: r1 = Null
    //     0x6c9018: mov             x1, NULL
    // 0x6c901c: branchIfSmi(r0, 0x6c9044)
    //     0x6c901c: tbz             w0, #0, #0x6c9044
    // 0x6c9020: r4 = LoadClassIdInstr(r0)
    //     0x6c9020: ldur            x4, [x0, #-1]
    //     0x6c9024: ubfx            x4, x4, #0xc, #0x14
    // 0x6c9028: sub             x4, x4, #0x3b
    // 0x6c902c: cmp             x4, #1
    // 0x6c9030: b.ls            #0x6c9044
    // 0x6c9034: r8 = int
    //     0x6c9034: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x6c9038: r3 = Null
    //     0x6c9038: add             x3, PP, #0x1f, lsl #12  ; [pp+0x1f940] Null
    //     0x6c903c: ldr             x3, [x3, #0x940]
    // 0x6c9040: r0 = int()
    //     0x6c9040: bl              #0x7586bc  ; IsType_int_Stub
    // 0x6c9044: ldr             x16, [fp, #0x18]
    // 0x6c9048: ldr             lr, [fp, #0x10]
    // 0x6c904c: stp             lr, x16, [SP]
    // 0x6c9050: r0 = call 0x60cb80
    //     0x6c9050: bl              #0x60cb80
    // 0x6c9054: LeaveFrame
    //     0x6c9054: mov             SP, fp
    //     0x6c9058: ldp             fp, lr, [SP], #0x10
    // 0x6c905c: ret
    //     0x6c905c: ret             
    // 0x6c9060: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6c9060: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6c9064: b               #0x6c9010
  }
}

// class id: 5037, size: 0x18, field offset: 0x18
abstract class _LTa extends KTa<dynamic> {
}

// class id: 5038, size: 0x18, field offset: 0x18
class MTa extends _LTa {
}
