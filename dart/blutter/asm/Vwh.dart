// lib: , url: Vwh

// class id: 1048640, size: 0x8
class :: {
}

// class id: 3967, size: 0xc, field offset: 0x8
class Ru extends Object {

  List<String>? [](Ru, String) {
    // ** addr: 0x70bfc4, size: 0x8c
    // 0x70bfc4: EnterFrame
    //     0x70bfc4: stp             fp, lr, [SP, #-0x10]!
    //     0x70bfc8: mov             fp, SP
    // 0x70bfcc: AllocStack(0x10)
    //     0x70bfcc: sub             SP, SP, #0x10
    // 0x70bfd0: CheckStackOverflow
    //     0x70bfd0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x70bfd4: cmp             SP, x16
    //     0x70bfd8: b.ls            #0x70c030
    // 0x70bfdc: ldr             x0, [fp, #0x10]
    // 0x70bfe0: r2 = Null
    //     0x70bfe0: mov             x2, NULL
    // 0x70bfe4: r1 = Null
    //     0x70bfe4: mov             x1, NULL
    // 0x70bfe8: r4 = 59
    //     0x70bfe8: mov             x4, #0x3b
    // 0x70bfec: branchIfSmi(r0, 0x70bff8)
    //     0x70bfec: tbz             w0, #0, #0x70bff8
    // 0x70bff0: r4 = LoadClassIdInstr(r0)
    //     0x70bff0: ldur            x4, [x0, #-1]
    //     0x70bff4: ubfx            x4, x4, #0xc, #0x14
    // 0x70bff8: sub             x4, x4, #0x5d
    // 0x70bffc: cmp             x4, #3
    // 0x70c000: b.ls            #0x70c014
    // 0x70c004: r8 = String
    //     0x70c004: ldr             x8, [PP, #0x2d0]  ; [pp+0x2d0] Type: String
    // 0x70c008: r3 = Null
    //     0x70c008: add             x3, PP, #0x23, lsl #12  ; [pp+0x23528] Null
    //     0x70c00c: ldr             x3, [x3, #0x528]
    // 0x70c010: r0 = String()
    //     0x70c010: bl              #0x758160  ; IsType_String_Stub
    // 0x70c014: ldr             x16, [fp, #0x18]
    // 0x70c018: ldr             lr, [fp, #0x10]
    // 0x70c01c: stp             lr, x16, [SP]
    // 0x70c020: r0 = call 0x432ac0
    //     0x70c020: bl              #0x432ac0
    // 0x70c024: LeaveFrame
    //     0x70c024: mov             SP, fp
    //     0x70c028: ldp             fp, lr, [SP], #0x10
    // 0x70c02c: ret
    //     0x70c02c: ret             
    // 0x70c030: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x70c030: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x70c034: b               #0x70bfdc
  }
  [closure] Qa<String, List<String>> <anonymous closure>(dynamic, String, List<String>) {
    // ** addr: 0x432a68, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, String, List<String>) {
    // ** addr: 0x4f3bbc, size: -0x1
  }
}
