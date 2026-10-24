// lib: , url: FGh

// class id: 1049088, size: 0x8
class :: {
}

// class id: 3005, size: 0x54, field offset: 0x40
class Hoa extends TA
    implements CY {

  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x6d6a08, size: 0x28c
    // 0x6d6a08: EnterFrame
    //     0x6d6a08: stp             fp, lr, [SP, #-0x10]!
    //     0x6d6a0c: mov             fp, SP
    // 0x6d6a10: AllocStack(0x88)
    //     0x6d6a10: sub             SP, SP, #0x88
    // 0x6d6a14: SetupParameters([dynamic _ /* r0 */])
    //     0x6d6a14: ldr             x0, [fp, #0x10]
    //     0x6d6a18: ldur            w2, [x0, #0x17]
    //     0x6d6a1c: add             x2, x2, HEAP, lsl #32
    //     0x6d6a20: stur            x2, [fp, #-0x58]
    // 0x6d6a24: CheckStackOverflow
    //     0x6d6a24: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d6a28: cmp             SP, x16
    //     0x6d6a2c: b.ls            #0x6d6c84
    // 0x6d6a30: ArrayLoad: r0 = r2[0]  ; List_4
    //     0x6d6a30: ldur            w0, [x2, #0x17]
    // 0x6d6a34: DecompressPointer r0
    //     0x6d6a34: add             x0, x0, HEAP, lsl #32
    // 0x6d6a38: LoadField: r3 = r2->field_f
    //     0x6d6a38: ldur            w3, [x2, #0xf]
    // 0x6d6a3c: DecompressPointer r3
    //     0x6d6a3c: add             x3, x3, HEAP, lsl #32
    // 0x6d6a40: stur            x3, [fp, #-0x50]
    // 0x6d6a44: cmp             w0, NULL
    // 0x6d6a48: b.ne            #0x6d6a58
    // 0x6d6a4c: mov             x1, x3
    // 0x6d6a50: r0 = Null
    //     0x6d6a50: mov             x0, NULL
    // 0x6d6a54: b               #0x6d6af4
    // 0x6d6a58: LoadField: r4 = r3->field_43
    //     0x6d6a58: ldur            w4, [x3, #0x43]
    // 0x6d6a5c: DecompressPointer r4
    //     0x6d6a5c: add             x4, x4, HEAP, lsl #32
    // 0x6d6a60: LoadField: r0 = r2->field_13
    //     0x6d6a60: ldur            w0, [x2, #0x13]
    // 0x6d6a64: DecompressPointer r0
    //     0x6d6a64: add             x0, x0, HEAP, lsl #32
    // 0x6d6a68: r1 = LoadInt32Instr(r0)
    //     0x6d6a68: sbfx            x1, x0, #1, #0x1f
    //     0x6d6a6c: tbz             w0, #0, #0x6d6a74
    //     0x6d6a70: ldur            x1, [x0, #7]
    // 0x6d6a74: sub             x5, x1, #1
    // 0x6d6a78: r0 = BoxInt64Instr(r5)
    //     0x6d6a78: sbfiz           x0, x5, #1, #0x1f
    //     0x6d6a7c: cmp             x5, x0, asr #1
    //     0x6d6a80: b.eq            #0x6d6a8c
    //     0x6d6a84: bl              #0x74cee4  ; AllocateMintSharedWithoutFPURegsStub
    //     0x6d6a88: stur            x5, [x0, #7]
    // 0x6d6a8c: stp             x0, x4, [SP]
    // 0x6d6a90: r0 = []()
    //     0x6d6a90: bl              #0x7330b8  ; [dart:collection] qe::[]
    // 0x6d6a94: cmp             w0, NULL
    // 0x6d6a98: b.eq            #0x6d6c8c
    // 0x6d6a9c: r1 = LoadClassIdInstr(r0)
    //     0x6d6a9c: ldur            x1, [x0, #-1]
    //     0x6d6aa0: ubfx            x1, x1, #0xc, #0x14
    // 0x6d6aa4: str             x0, [SP]
    // 0x6d6aa8: mov             x0, x1
    // 0x6d6aac: r0 = GDT[cid_x0 + -0xf59]()
    //     0x6d6aac: sub             lr, x0, #0xf59
    //     0x6d6ab0: ldr             lr, [x21, lr, lsl #3]
    //     0x6d6ab4: blr             lr
    // 0x6d6ab8: mov             x3, x0
    // 0x6d6abc: r2 = Null
    //     0x6d6abc: mov             x2, NULL
    // 0x6d6ac0: r1 = Null
    //     0x6d6ac0: mov             x1, NULL
    // 0x6d6ac4: stur            x3, [fp, #-0x60]
    // 0x6d6ac8: r4 = LoadClassIdInstr(r0)
    //     0x6d6ac8: ldur            x4, [x0, #-1]
    //     0x6d6acc: ubfx            x4, x4, #0xc, #0x14
    // 0x6d6ad0: sub             x4, x4, #0x655
    // 0x6d6ad4: cmp             x4, #0x84
    // 0x6d6ad8: b.ls            #0x6d6aec
    // 0x6d6adc: r8 = XA?
    //     0x6d6adc: ldr             x8, [PP, #0x2d10]  ; [pp+0x2d10] Type: XA?
    // 0x6d6ae0: r3 = Null
    //     0x6d6ae0: add             x3, PP, #0x24, lsl #12  ; [pp+0x248d0] Null
    //     0x6d6ae4: ldr             x3, [x3, #0x8d0]
    // 0x6d6ae8: r0 = XA?()
    //     0x6d6ae8: bl              #0x6d4248  ; IsType_XA?_Stub
    // 0x6d6aec: ldur            x0, [fp, #-0x60]
    // 0x6d6af0: ldur            x1, [fp, #-0x50]
    // 0x6d6af4: StoreField: r1->field_47 = r0
    //     0x6d6af4: stur            w0, [x1, #0x47]
    //     0x6d6af8: ldurb           w16, [x1, #-1]
    //     0x6d6afc: ldurb           w17, [x0, #-1]
    //     0x6d6b00: and             x16, x17, x16, lsr #2
    //     0x6d6b04: tst             x16, HEAP, lsr #32
    //     0x6d6b08: b.eq            #0x6d6b10
    //     0x6d6b0c: bl              #0x74b698  ; WriteBarrierWrappersStub
    // 0x6d6b10: ldur            x3, [fp, #-0x58]
    // 0x6d6b14: LoadField: r4 = r3->field_f
    //     0x6d6b14: ldur            w4, [x3, #0xf]
    // 0x6d6b18: DecompressPointer r4
    //     0x6d6b18: add             x4, x4, HEAP, lsl #32
    // 0x6d6b1c: stur            x4, [fp, #-0x60]
    // 0x6d6b20: ArrayLoad: r5 = r4[0]  ; List_4
    //     0x6d6b20: ldur            w5, [x4, #0x17]
    // 0x6d6b24: DecompressPointer r5
    //     0x6d6b24: add             x5, x5, HEAP, lsl #32
    // 0x6d6b28: stur            x5, [fp, #-0x50]
    // 0x6d6b2c: cmp             w5, NULL
    // 0x6d6b30: b.eq            #0x6d6c90
    // 0x6d6b34: mov             x0, x5
    // 0x6d6b38: r2 = Null
    //     0x6d6b38: mov             x2, NULL
    // 0x6d6b3c: r1 = Null
    //     0x6d6b3c: mov             x1, NULL
    // 0x6d6b40: r4 = LoadClassIdInstr(r0)
    //     0x6d6b40: ldur            x4, [x0, #-1]
    //     0x6d6b44: ubfx            x4, x4, #0xc, #0x14
    // 0x6d6b48: sub             x4, x4, #0xbe0
    // 0x6d6b4c: cmp             x4, #5
    // 0x6d6b50: b.ls            #0x6d6b68
    // 0x6d6b54: r8 = Doa
    //     0x6d6b54: add             x8, PP, #0x24, lsl #12  ; [pp+0x248e0] Type: Doa
    //     0x6d6b58: ldr             x8, [x8, #0x8e0]
    // 0x6d6b5c: r3 = Null
    //     0x6d6b5c: add             x3, PP, #0x24, lsl #12  ; [pp+0x248e8] Null
    //     0x6d6b60: ldr             x3, [x3, #0x8e8]
    // 0x6d6b64: r0 = DefaultTypeTest()
    //     0x6d6b64: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x6d6b68: ldur            x1, [fp, #-0x58]
    // 0x6d6b6c: LoadField: r2 = r1->field_13
    //     0x6d6b6c: ldur            w2, [x1, #0x13]
    // 0x6d6b70: DecompressPointer r2
    //     0x6d6b70: add             x2, x2, HEAP, lsl #32
    // 0x6d6b74: mov             x0, x2
    // 0x6d6b78: ldur            x3, [fp, #-0x60]
    // 0x6d6b7c: StoreField: r3->field_4b = r0
    //     0x6d6b7c: stur            w0, [x3, #0x4b]
    //     0x6d6b80: tbz             w0, #0, #0x6d6b9c
    //     0x6d6b84: ldurb           w16, [x3, #-1]
    //     0x6d6b88: ldurb           w17, [x0, #-1]
    //     0x6d6b8c: and             x16, x17, x16, lsr #2
    //     0x6d6b90: tst             x16, HEAP, lsr #32
    //     0x6d6b94: b.eq            #0x6d6b9c
    //     0x6d6b98: bl              #0x74b6d8  ; WriteBarrierWrappersStub
    // 0x6d6b9c: LoadField: r0 = r3->field_43
    //     0x6d6b9c: ldur            w0, [x3, #0x43]
    // 0x6d6ba0: DecompressPointer r0
    //     0x6d6ba0: add             x0, x0, HEAP, lsl #32
    // 0x6d6ba4: stp             x2, x0, [SP]
    // 0x6d6ba8: r0 = []()
    //     0x6d6ba8: bl              #0x7330b8  ; [dart:collection] qe::[]
    // 0x6d6bac: mov             x1, x0
    // 0x6d6bb0: ldur            x0, [fp, #-0x58]
    // 0x6d6bb4: stur            x1, [fp, #-0x68]
    // 0x6d6bb8: LoadField: r2 = r0->field_f
    //     0x6d6bb8: ldur            w2, [x0, #0xf]
    // 0x6d6bbc: DecompressPointer r2
    //     0x6d6bbc: add             x2, x2, HEAP, lsl #32
    // 0x6d6bc0: LoadField: r3 = r0->field_13
    //     0x6d6bc0: ldur            w3, [x0, #0x13]
    // 0x6d6bc4: DecompressPointer r3
    //     0x6d6bc4: add             x3, x3, HEAP, lsl #32
    // 0x6d6bc8: r4 = LoadInt32Instr(r3)
    //     0x6d6bc8: sbfx            x4, x3, #1, #0x1f
    //     0x6d6bcc: tbz             w3, #0, #0x6d6bd4
    //     0x6d6bd0: ldur            x4, [x3, #7]
    // 0x6d6bd4: stp             x4, x2, [SP, #8]
    // 0x6d6bd8: ldur            x16, [fp, #-0x50]
    // 0x6d6bdc: str             x16, [SP]
    // 0x6d6be0: r0 = call 0x298884
    //     0x6d6be0: bl              #0x298884
    // 0x6d6be4: mov             x1, x0
    // 0x6d6be8: ldur            x0, [fp, #-0x58]
    // 0x6d6bec: LoadField: r2 = r0->field_13
    //     0x6d6bec: ldur            w2, [x0, #0x13]
    // 0x6d6bf0: DecompressPointer r2
    //     0x6d6bf0: add             x2, x2, HEAP, lsl #32
    // 0x6d6bf4: ldur            x16, [fp, #-0x60]
    // 0x6d6bf8: ldur            lr, [fp, #-0x68]
    // 0x6d6bfc: stp             lr, x16, [SP, #0x10]
    // 0x6d6c00: stp             x2, x1, [SP]
    // 0x6d6c04: r0 = call 0x4da2f4
    //     0x6d6c04: bl              #0x4da2f4
    // 0x6d6c08: ldur            x1, [fp, #-0x58]
    // 0x6d6c0c: LoadField: r2 = r1->field_f
    //     0x6d6c0c: ldur            w2, [x1, #0xf]
    // 0x6d6c10: DecompressPointer r2
    //     0x6d6c10: add             x2, x2, HEAP, lsl #32
    // 0x6d6c14: StoreField: r2->field_4b = rNULL
    //     0x6d6c14: stur            NULL, [x2, #0x4b]
    // 0x6d6c18: cmp             w0, NULL
    // 0x6d6c1c: b.eq            #0x6d6c40
    // 0x6d6c20: LoadField: r3 = r2->field_43
    //     0x6d6c20: ldur            w3, [x2, #0x43]
    // 0x6d6c24: DecompressPointer r3
    //     0x6d6c24: add             x3, x3, HEAP, lsl #32
    // 0x6d6c28: LoadField: r2 = r1->field_13
    //     0x6d6c28: ldur            w2, [x1, #0x13]
    // 0x6d6c2c: DecompressPointer r2
    //     0x6d6c2c: add             x2, x2, HEAP, lsl #32
    // 0x6d6c30: stp             x2, x3, [SP, #8]
    // 0x6d6c34: str             x0, [SP]
    // 0x6d6c38: r0 = []=()
    //     0x6d6c38: bl              #0x732ed8  ; [dart:collection] qe::[]=
    // 0x6d6c3c: b               #0x6d6c58
    // 0x6d6c40: LoadField: r0 = r2->field_43
    //     0x6d6c40: ldur            w0, [x2, #0x43]
    // 0x6d6c44: DecompressPointer r0
    //     0x6d6c44: add             x0, x0, HEAP, lsl #32
    // 0x6d6c48: LoadField: r2 = r1->field_13
    //     0x6d6c48: ldur            w2, [x1, #0x13]
    // 0x6d6c4c: DecompressPointer r2
    //     0x6d6c4c: add             x2, x2, HEAP, lsl #32
    // 0x6d6c50: stp             x2, x0, [SP]
    // 0x6d6c54: r0 = call 0x5a7984
    //     0x6d6c54: bl              #0x5a7984
    // 0x6d6c58: r0 = Null
    //     0x6d6c58: mov             x0, NULL
    // 0x6d6c5c: LeaveFrame
    //     0x6d6c5c: mov             SP, fp
    //     0x6d6c60: ldp             fp, lr, [SP], #0x10
    // 0x6d6c64: ret
    //     0x6d6c64: ret             
    // 0x6d6c68: sub             SP, fp, #0x88
    // 0x6d6c6c: ldur            x2, [fp, #-0x10]
    // 0x6d6c70: LoadField: r3 = r2->field_f
    //     0x6d6c70: ldur            w3, [x2, #0xf]
    // 0x6d6c74: DecompressPointer r3
    //     0x6d6c74: add             x3, x3, HEAP, lsl #32
    // 0x6d6c78: StoreField: r3->field_4b = rNULL
    //     0x6d6c78: stur            NULL, [x3, #0x4b]
    // 0x6d6c7c: r0 = ReThrow()
    //     0x6d6c7c: bl              #0x74b234  ; ReThrowStub
    // 0x6d6c80: brk             #0
    // 0x6d6c84: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d6c84: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d6c88: b               #0x6d6a30
    // 0x6d6c8c: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x6d6c8c: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
    // 0x6d6c90: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x6d6c90: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x6d6c94, size: 0xe0
    // 0x6d6c94: EnterFrame
    //     0x6d6c94: stp             fp, lr, [SP, #-0x10]!
    //     0x6d6c98: mov             fp, SP
    // 0x6d6c9c: AllocStack(0x68)
    //     0x6d6c9c: sub             SP, SP, #0x68
    // 0x6d6ca0: SetupParameters([dynamic _ /* r0 */])
    //     0x6d6ca0: ldr             x0, [fp, #0x10]
    //     0x6d6ca4: ldur            w1, [x0, #0x17]
    //     0x6d6ca8: add             x1, x1, HEAP, lsl #32
    //     0x6d6cac: stur            x1, [fp, #-0x48]
    // 0x6d6cb0: CheckStackOverflow
    //     0x6d6cb0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d6cb4: cmp             SP, x16
    //     0x6d6cb8: b.ls            #0x6d6d6c
    // 0x6d6cbc: LoadField: r2 = r1->field_f
    //     0x6d6cbc: ldur            w2, [x1, #0xf]
    // 0x6d6cc0: DecompressPointer r2
    //     0x6d6cc0: add             x2, x2, HEAP, lsl #32
    // 0x6d6cc4: stur            x2, [fp, #-0x40]
    // 0x6d6cc8: LoadField: r3 = r1->field_13
    //     0x6d6cc8: ldur            w3, [x1, #0x13]
    // 0x6d6ccc: DecompressPointer r3
    //     0x6d6ccc: add             x3, x3, HEAP, lsl #32
    // 0x6d6cd0: mov             x0, x3
    // 0x6d6cd4: stur            x3, [fp, #-0x38]
    // 0x6d6cd8: StoreField: r2->field_4b = r0
    //     0x6d6cd8: stur            w0, [x2, #0x4b]
    //     0x6d6cdc: tbz             w0, #0, #0x6d6cf8
    //     0x6d6ce0: ldurb           w16, [x2, #-1]
    //     0x6d6ce4: ldurb           w17, [x0, #-1]
    //     0x6d6ce8: and             x16, x17, x16, lsr #2
    //     0x6d6cec: tst             x16, HEAP, lsr #32
    //     0x6d6cf0: b.eq            #0x6d6cf8
    //     0x6d6cf4: bl              #0x74b6b8  ; WriteBarrierWrappersStub
    // 0x6d6cf8: LoadField: r0 = r2->field_43
    //     0x6d6cf8: ldur            w0, [x2, #0x43]
    // 0x6d6cfc: DecompressPointer r0
    //     0x6d6cfc: add             x0, x0, HEAP, lsl #32
    // 0x6d6d00: stp             x3, x0, [SP]
    // 0x6d6d04: r0 = []()
    //     0x6d6d04: bl              #0x7330b8  ; [dart:collection] qe::[]
    // 0x6d6d08: ldur            x16, [fp, #-0x40]
    // 0x6d6d0c: stp             x0, x16, [SP, #0x10]
    // 0x6d6d10: ldur            x16, [fp, #-0x38]
    // 0x6d6d14: stp             x16, NULL, [SP]
    // 0x6d6d18: r0 = call 0x4da2f4
    //     0x6d6d18: bl              #0x4da2f4
    // 0x6d6d1c: ldur            x0, [fp, #-0x48]
    // 0x6d6d20: LoadField: r1 = r0->field_f
    //     0x6d6d20: ldur            w1, [x0, #0xf]
    // 0x6d6d24: DecompressPointer r1
    //     0x6d6d24: add             x1, x1, HEAP, lsl #32
    // 0x6d6d28: StoreField: r1->field_4b = rNULL
    //     0x6d6d28: stur            NULL, [x1, #0x4b]
    // 0x6d6d2c: LoadField: r0 = r1->field_43
    //     0x6d6d2c: ldur            w0, [x1, #0x43]
    // 0x6d6d30: DecompressPointer r0
    //     0x6d6d30: add             x0, x0, HEAP, lsl #32
    // 0x6d6d34: ldur            x16, [fp, #-0x38]
    // 0x6d6d38: stp             x16, x0, [SP]
    // 0x6d6d3c: r0 = call 0x5a7984
    //     0x6d6d3c: bl              #0x5a7984
    // 0x6d6d40: r0 = Null
    //     0x6d6d40: mov             x0, NULL
    // 0x6d6d44: LeaveFrame
    //     0x6d6d44: mov             SP, fp
    //     0x6d6d48: ldp             fp, lr, [SP], #0x10
    // 0x6d6d4c: ret
    //     0x6d6d4c: ret             
    // 0x6d6d50: sub             SP, fp, #0x68
    // 0x6d6d54: ldur            x2, [fp, #-0x10]
    // 0x6d6d58: LoadField: r3 = r2->field_f
    //     0x6d6d58: ldur            w3, [x2, #0xf]
    // 0x6d6d5c: DecompressPointer r3
    //     0x6d6d5c: add             x3, x3, HEAP, lsl #32
    // 0x6d6d60: StoreField: r3->field_4b = rNULL
    //     0x6d6d60: stur            NULL, [x3, #0x4b]
    // 0x6d6d64: r0 = ReThrow()
    //     0x6d6d64: bl              #0x74b234  ; ReThrowStub
    // 0x6d6d68: brk             #0
    // 0x6d6d6c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d6d6c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d6d70: b               #0x6d6cbc
  }
  [closure] void sTg(dynamic, int) {
    // ** addr: 0x4c8360, size: -0x1
  }
  [closure] cB? <anonymous closure>(dynamic) {
    // ** addr: 0x4c8300, size: -0x1
  }
  [closure] void Iad(dynamic, XA) {
    // ** addr: 0x62fca0, size: -0x1
  }
}

// class id: 3038, size: 0xc, field offset: 0xc
//   const constructor, 
abstract class Coa extends RA {
}

// class id: 3039, size: 0x10, field offset: 0xc
//   const constructor, 
abstract class Doa extends Coa {
}

// class id: 3043, size: 0x14, field offset: 0x10
//   const constructor, 
class Goa extends Doa {
}

// class id: 3045, size: 0x10, field offset: 0x10
//   const constructor, 
class Eoa extends Doa {
}

// class id: 3169, size: 0x18, field offset: 0x14
//   const constructor, 
class Ioa extends Yda<dynamic> {
}
