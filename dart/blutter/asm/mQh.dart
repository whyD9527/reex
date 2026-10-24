// lib: , url: MQh

// class id: 1049579, size: 0x8
class :: {
}

// class id: 211, size: 0x1c, field offset: 0x8
class uVa<X0, X1> extends Object {

  X1 [](uVa<X0, X1>, X0) {
    // ** addr: 0x6dfc9c, size: 0x1ec
    // 0x6dfc9c: EnterFrame
    //     0x6dfc9c: stp             fp, lr, [SP, #-0x10]!
    //     0x6dfca0: mov             fp, SP
    // 0x6dfca4: AllocStack(0x30)
    //     0x6dfca4: sub             SP, SP, #0x30
    // 0x6dfca8: CheckStackOverflow
    //     0x6dfca8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6dfcac: cmp             SP, x16
    //     0x6dfcb0: b.ls            #0x6dfe5c
    // 0x6dfcb4: ldr             x3, [fp, #0x18]
    // 0x6dfcb8: LoadField: r2 = r3->field_7
    //     0x6dfcb8: ldur            w2, [x3, #7]
    // 0x6dfcbc: DecompressPointer r2
    //     0x6dfcbc: add             x2, x2, HEAP, lsl #32
    // 0x6dfcc0: ldr             x0, [fp, #0x10]
    // 0x6dfcc4: r1 = Null
    //     0x6dfcc4: mov             x1, NULL
    // 0x6dfcc8: cmp             w2, NULL
    // 0x6dfccc: b.eq            #0x6dfcec
    // 0x6dfcd0: ArrayLoad: r4 = r2[0]  ; List_4
    //     0x6dfcd0: ldur            w4, [x2, #0x17]
    // 0x6dfcd4: DecompressPointer r4
    //     0x6dfcd4: add             x4, x4, HEAP, lsl #32
    // 0x6dfcd8: r8 = X0
    //     0x6dfcd8: ldr             x8, [PP, #0x158]  ; [pp+0x158] TypeParameter: X0
    // 0x6dfcdc: LoadField: r9 = r4->field_7
    //     0x6dfcdc: ldur            x9, [x4, #7]
    // 0x6dfce0: r3 = Null
    //     0x6dfce0: add             x3, PP, #0x13, lsl #12  ; [pp+0x13c88] Null
    //     0x6dfce4: ldr             x3, [x3, #0xc88]
    // 0x6dfce8: blr             x9
    // 0x6dfcec: ldr             x0, [fp, #0x18]
    // 0x6dfcf0: ArrayLoad: r1 = r0[0]  ; List_4
    //     0x6dfcf0: ldur            w1, [x0, #0x17]
    // 0x6dfcf4: DecompressPointer r1
    //     0x6dfcf4: add             x1, x1, HEAP, lsl #32
    // 0x6dfcf8: stur            x1, [fp, #-8]
    // 0x6dfcfc: ldr             x16, [fp, #0x10]
    // 0x6dfd00: stp             x16, x1, [SP]
    // 0x6dfd04: r0 = nl()
    //     0x6dfd04: bl              #0x7350ec  ; [dart:collection] _fd::nl
    // 0x6dfd08: tbz             w0, #4, #0x6dfe14
    // 0x6dfd0c: ldr             x0, [fp, #0x18]
    // 0x6dfd10: ldur            x1, [fp, #-8]
    // 0x6dfd14: LoadField: r2 = r0->field_b
    //     0x6dfd14: ldur            w2, [x0, #0xb]
    // 0x6dfd18: DecompressPointer r2
    //     0x6dfd18: add             x2, x2, HEAP, lsl #32
    // 0x6dfd1c: ldr             x16, [fp, #0x10]
    // 0x6dfd20: stp             x16, x2, [SP]
    // 0x6dfd24: mov             x0, x2
    // 0x6dfd28: ClosureCall
    //     0x6dfd28: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    //     0x6dfd2c: ldur            x2, [x0, #0x1f]
    //     0x6dfd30: blr             x2
    // 0x6dfd34: ldur            x16, [fp, #-8]
    // 0x6dfd38: ldr             lr, [fp, #0x10]
    // 0x6dfd3c: stp             lr, x16, [SP, #8]
    // 0x6dfd40: str             x0, [SP]
    // 0x6dfd44: r0 = []=()
    //     0x6dfd44: bl              #0x73a7c0  ; [dart:collection] _fd::[]=
    // 0x6dfd48: ldur            x0, [fp, #-8]
    // 0x6dfd4c: LoadField: r2 = r0->field_7
    //     0x6dfd4c: ldur            w2, [x0, #7]
    // 0x6dfd50: DecompressPointer r2
    //     0x6dfd50: add             x2, x2, HEAP, lsl #32
    // 0x6dfd54: stur            x2, [fp, #-0x10]
    // 0x6dfd58: CheckStackOverflow
    //     0x6dfd58: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6dfd5c: cmp             SP, x16
    //     0x6dfd60: b.ls            #0x6dfe64
    // 0x6dfd64: LoadField: r1 = r0->field_13
    //     0x6dfd64: ldur            w1, [x0, #0x13]
    // 0x6dfd68: DecompressPointer r1
    //     0x6dfd68: add             x1, x1, HEAP, lsl #32
    // 0x6dfd6c: r3 = LoadInt32Instr(r1)
    //     0x6dfd6c: sbfx            x3, x1, #1, #0x1f
    // 0x6dfd70: asr             x1, x3, #1
    // 0x6dfd74: ArrayLoad: r3 = r0[0]  ; List_4
    //     0x6dfd74: ldur            w3, [x0, #0x17]
    // 0x6dfd78: DecompressPointer r3
    //     0x6dfd78: add             x3, x3, HEAP, lsl #32
    // 0x6dfd7c: r4 = LoadInt32Instr(r3)
    //     0x6dfd7c: sbfx            x4, x3, #1, #0x1f
    // 0x6dfd80: sub             x3, x1, x4
    // 0x6dfd84: cmp             x3, #5
    // 0x6dfd88: b.le            #0x6dfe14
    // 0x6dfd8c: mov             x1, x2
    // 0x6dfd90: r0 = _Bd()
    //     0x6dfd90: bl              #0x6d5248  ; Allocate_BdStub -> _Bd<X0> (size=0x20)
    // 0x6dfd94: mov             x1, x0
    // 0x6dfd98: ldur            x0, [fp, #-8]
    // 0x6dfd9c: StoreField: r1->field_b = r0
    //     0x6dfd9c: stur            w0, [x1, #0xb]
    // 0x6dfda0: r2 = -2
    //     0x6dfda0: mov             x2, #-2
    // 0x6dfda4: StoreField: r1->field_f = r2
    //     0x6dfda4: stur            x2, [x1, #0xf]
    // 0x6dfda8: r3 = 2
    //     0x6dfda8: mov             x3, #2
    // 0x6dfdac: ArrayStore: r1[0] = r3  ; List_8
    //     0x6dfdac: stur            x3, [x1, #0x17]
    // 0x6dfdb0: str             x1, [SP]
    // 0x6dfdb4: r0 = call 0x2f5b80
    //     0x6dfdb4: bl              #0x2f5b80
    // 0x6dfdb8: mov             x1, x0
    // 0x6dfdbc: stur            x1, [fp, #-0x18]
    // 0x6dfdc0: r0 = LoadClassIdInstr(r1)
    //     0x6dfdc0: ldur            x0, [x1, #-1]
    //     0x6dfdc4: ubfx            x0, x0, #0xc, #0x14
    // 0x6dfdc8: str             x1, [SP]
    // 0x6dfdcc: r0 = GDT[cid_x0 + 0x3a9]()
    //     0x6dfdcc: add             lr, x0, #0x3a9
    //     0x6dfdd0: ldr             lr, [x21, lr, lsl #3]
    //     0x6dfdd4: blr             lr
    // 0x6dfdd8: tbnz            w0, #4, #0x6dfe50
    // 0x6dfddc: ldur            x0, [fp, #-0x18]
    // 0x6dfde0: r1 = LoadClassIdInstr(r0)
    //     0x6dfde0: ldur            x1, [x0, #-1]
    //     0x6dfde4: ubfx            x1, x1, #0xc, #0x14
    // 0x6dfde8: str             x0, [SP]
    // 0x6dfdec: mov             x0, x1
    // 0x6dfdf0: r0 = GDT[cid_x0 + 0x44d]()
    //     0x6dfdf0: add             lr, x0, #0x44d
    //     0x6dfdf4: ldr             lr, [x21, lr, lsl #3]
    //     0x6dfdf8: blr             lr
    // 0x6dfdfc: ldur            x16, [fp, #-8]
    // 0x6dfe00: stp             x0, x16, [SP]
    // 0x6dfe04: r0 = call 0x604bf0
    //     0x6dfe04: bl              #0x604bf0
    // 0x6dfe08: ldur            x0, [fp, #-8]
    // 0x6dfe0c: ldur            x2, [fp, #-0x10]
    // 0x6dfe10: b               #0x6dfd58
    // 0x6dfe14: ldur            x0, [fp, #-8]
    // 0x6dfe18: ldr             x16, [fp, #0x10]
    // 0x6dfe1c: stp             x16, x0, [SP]
    // 0x6dfe20: r0 = call 0x6ad3d4
    //     0x6dfe20: bl              #0x6ad3d4
    // 0x6dfe24: ldur            x1, [fp, #-8]
    // 0x6dfe28: LoadField: r2 = r1->field_f
    //     0x6dfe28: ldur            w2, [x1, #0xf]
    // 0x6dfe2c: DecompressPointer r2
    //     0x6dfe2c: add             x2, x2, HEAP, lsl #32
    // 0x6dfe30: cmp             w2, w0
    // 0x6dfe34: b.ne            #0x6dfe3c
    // 0x6dfe38: r0 = Null
    //     0x6dfe38: mov             x0, NULL
    // 0x6dfe3c: cmp             w0, NULL
    // 0x6dfe40: b.eq            #0x6dfe6c
    // 0x6dfe44: LeaveFrame
    //     0x6dfe44: mov             SP, fp
    //     0x6dfe48: ldp             fp, lr, [SP], #0x10
    // 0x6dfe4c: ret
    //     0x6dfe4c: ret             
    // 0x6dfe50: r0 = call 0x1f671c
    //     0x6dfe50: bl              #0x1f671c
    // 0x6dfe54: r0 = Throw()
    //     0x6dfe54: bl              #0x74b258  ; ThrowStub
    // 0x6dfe58: brk             #0
    // 0x6dfe5c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6dfe5c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6dfe60: b               #0x6dfcb4
    // 0x6dfe64: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6dfe64: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6dfe68: b               #0x6dfd64
    // 0x6dfe6c: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x6dfe6c: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
  }
}
