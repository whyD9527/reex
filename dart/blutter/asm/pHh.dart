// lib: , url: PHh

// class id: 1049143, size: 0x8
class :: {
}

// class id: 754, size: 0x28, field offset: 0x8
class Sza extends Object {

  [closure] Future<bool> <anonymous closure>(dynamic) async {
    // ** addr: 0x748df8, size: 0x208
    // 0x748df8: EnterFrame
    //     0x748df8: stp             fp, lr, [SP, #-0x10]!
    //     0x748dfc: mov             fp, SP
    // 0x748e00: AllocStack(0x58)
    //     0x748e00: sub             SP, SP, #0x58
    // 0x748e04: SetupParameters(Sza this /* r1 */)
    //     0x748e04: stur            NULL, [fp, #-8]
    //     0x748e08: mov             x0, #0
    //     0x748e0c: add             x1, fp, w0, sxtw #2
    //     0x748e10: ldr             x1, [x1, #0x10]
    //     0x748e14: ldur            w2, [x1, #0x17]
    //     0x748e18: add             x2, x2, HEAP, lsl #32
    //     0x748e1c: stur            x2, [fp, #-0x10]
    // 0x748e20: CheckStackOverflow
    //     0x748e20: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x748e24: cmp             SP, x16
    //     0x748e28: b.ls            #0x748fe4
    // 0x748e2c: InitAsync() -> Future<bool>
    //     0x748e2c: ldr             x0, [PP, #0x31d8]  ; [pp+0x31d8] TypeArguments: <bool>
    //     0x748e30: bl              #0x6cb614  ; InitAsyncStub
    // 0x748e34: r2 = false
    //     0x748e34: add             x2, NULL, #0x30  ; false
    // 0x748e38: ldur            x1, [fp, #-0x10]
    // 0x748e3c: stur            x2, [fp, #-0x18]
    // 0x748e40: CheckStackOverflow
    //     0x748e40: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x748e44: cmp             SP, x16
    //     0x748e48: b.ls            #0x748fec
    // 0x748e4c: LoadField: r0 = r1->field_f
    //     0x748e4c: ldur            w0, [x1, #0xf]
    // 0x748e50: DecompressPointer r0
    //     0x748e50: add             x0, x0, HEAP, lsl #32
    // 0x748e54: LoadField: r3 = r0->field_23
    //     0x748e54: ldur            w3, [x0, #0x23]
    // 0x748e58: DecompressPointer r3
    //     0x748e58: add             x3, x3, HEAP, lsl #32
    // 0x748e5c: cmp             w3, NULL
    // 0x748e60: b.eq            #0x748ff4
    // 0x748e64: r0 = LoadClassIdInstr(r3)
    //     0x748e64: ldur            x0, [x3, #-1]
    //     0x748e68: ubfx            x0, x0, #0xc, #0x14
    // 0x748e6c: str             x3, [SP]
    // 0x748e70: r0 = GDT[cid_x0 + -0xcd8]()
    //     0x748e70: sub             lr, x0, #0xcd8
    //     0x748e74: ldr             lr, [x21, lr, lsl #3]
    //     0x748e78: blr             lr
    // 0x748e7c: cmp             x0, #0
    // 0x748e80: b.le            #0x748fa4
    // 0x748e84: ldur            x1, [fp, #-0x10]
    // 0x748e88: LoadField: r2 = r1->field_13
    //     0x748e88: ldur            w2, [x1, #0x13]
    // 0x748e8c: DecompressPointer r2
    //     0x748e8c: add             x2, x2, HEAP, lsl #32
    // 0x748e90: stur            x2, [fp, #-0x20]
    // 0x748e94: LoadField: r0 = r1->field_f
    //     0x748e94: ldur            w0, [x1, #0xf]
    // 0x748e98: DecompressPointer r0
    //     0x748e98: add             x0, x0, HEAP, lsl #32
    // 0x748e9c: LoadField: r3 = r0->field_23
    //     0x748e9c: ldur            w3, [x0, #0x23]
    // 0x748ea0: DecompressPointer r3
    //     0x748ea0: add             x3, x3, HEAP, lsl #32
    // 0x748ea4: cmp             w3, NULL
    // 0x748ea8: b.eq            #0x748ff8
    // 0x748eac: r0 = LoadClassIdInstr(r3)
    //     0x748eac: ldur            x0, [x3, #-1]
    //     0x748eb0: ubfx            x0, x0, #0xc, #0x14
    // 0x748eb4: str             x3, [SP]
    // 0x748eb8: r4 = const [0, 0x1, 0x1, 0x1, null]
    //     0x748eb8: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    // 0x748ebc: r0 = GDT[cid_x0 + -0xfb8]()
    //     0x748ebc: sub             lr, x0, #0xfb8
    //     0x748ec0: ldr             lr, [x21, lr, lsl #3]
    //     0x748ec4: blr             lr
    // 0x748ec8: cmp             w0, NULL
    // 0x748ecc: b.eq            #0x748ffc
    // 0x748ed0: r16 = Instance_Tf
    //     0x748ed0: ldr             x16, [PP, #0x758]  ; [pp+0x758] Obj!Tf@434a51
    // 0x748ed4: stp             x0, x16, [SP]
    // 0x748ed8: r4 = const [0, 0x2, 0x2, 0x2, null]
    //     0x748ed8: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    // 0x748edc: r0 = call 0x585efc
    //     0x748edc: bl              #0x585efc
    // 0x748ee0: stur            x0, [fp, #-0x30]
    // 0x748ee4: LoadField: r1 = r0->field_7
    //     0x748ee4: ldur            w1, [x0, #7]
    // 0x748ee8: DecompressPointer r1
    //     0x748ee8: add             x1, x1, HEAP, lsl #32
    // 0x748eec: stur            x1, [fp, #-0x28]
    // 0x748ef0: str             x0, [SP]
    // 0x748ef4: r0 = call 0x2036b0
    //     0x748ef4: bl              #0x2036b0
    // 0x748ef8: mov             x1, x0
    // 0x748efc: ldur            x0, [fp, #-0x28]
    // 0x748f00: stur            x1, [fp, #-0x40]
    // 0x748f04: r2 = LoadInt32Instr(r0)
    //     0x748f04: sbfx            x2, x0, #1, #0x1f
    // 0x748f08: stur            x2, [fp, #-0x38]
    // 0x748f0c: cmp             x2, x1
    // 0x748f10: b.ne            #0x748f1c
    // 0x748f14: r0 = ""
    //     0x748f14: ldr             x0, [PP, #0x2b8]  ; [pp+0x2b8] ""
    // 0x748f18: b               #0x748f58
    // 0x748f1c: ldur            x16, [fp, #-0x30]
    // 0x748f20: str             x16, [SP]
    // 0x748f24: r0 = call 0x20392c
    //     0x748f24: bl              #0x20392c
    // 0x748f28: add             x1, x0, #1
    // 0x748f2c: ldur            x0, [fp, #-0x40]
    // 0x748f30: cbnz            x0, #0x748f48
    // 0x748f34: ldur            x2, [fp, #-0x38]
    // 0x748f38: cmp             x1, x2
    // 0x748f3c: b.ne            #0x748f48
    // 0x748f40: ldur            x0, [fp, #-0x30]
    // 0x748f44: b               #0x748f58
    // 0x748f48: ldur            x16, [fp, #-0x30]
    // 0x748f4c: stp             x0, x16, [SP, #8]
    // 0x748f50: str             x1, [SP]
    // 0x748f54: r0 = call 0x207b90
    //     0x748f54: bl              #0x207b90
    // 0x748f58: ldur            x16, [fp, #-0x20]
    // 0x748f5c: stp             x0, x16, [SP]
    // 0x748f60: r0 = call 0x208b20
    //     0x748f60: bl              #0x208b20
    // 0x748f64: ldur            x16, [fp, #-0x20]
    // 0x748f68: r30 = "\n"
    //     0x748f68: ldr             lr, [PP, #0x2310]  ; [pp+0x2310] "\n"
    // 0x748f6c: stp             lr, x16, [SP]
    // 0x748f70: r0 = call 0x208b20
    //     0x748f70: bl              #0x208b20
    // 0x748f74: r0 = Da()
    //     0x748f74: bl              #0x6c8aa0  ; AllocateDaStub -> Da (size=0x10)
    // 0x748f78: mov             x1, x0
    // 0x748f7c: r0 = 300000
    //     0x748f7c: mov             x0, #0x93e0
    //     0x748f80: movk            x0, #4, lsl #16
    // 0x748f84: StoreField: r1->field_7 = r0
    //     0x748f84: stur            x0, [x1, #7]
    // 0x748f88: stp             x1, NULL, [SP]
    // 0x748f8c: r0 = call 0x3531e8
    //     0x748f8c: bl              #0x3531e8
    // 0x748f90: mov             x1, x0
    // 0x748f94: stur            x1, [fp, #-0x20]
    // 0x748f98: r0 = Await()
    //     0x748f98: bl              #0x6cdaec  ; AwaitStub
    // 0x748f9c: r2 = true
    //     0x748f9c: add             x2, NULL, #0x20  ; true
    // 0x748fa0: b               #0x748e38
    // 0x748fa4: ldur            x0, [fp, #-0x18]
    // 0x748fa8: tbnz            w0, #4, #0x748fb4
    // 0x748fac: r0 = false
    //     0x748fac: add             x0, NULL, #0x30  ; false
    // 0x748fb0: r0 = ReturnAsyncNotFuture()
    //     0x748fb0: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x748fb4: r0 = Da()
    //     0x748fb4: bl              #0x6c8aa0  ; AllocateDaStub -> Da (size=0x10)
    // 0x748fb8: mov             x1, x0
    // 0x748fbc: r0 = 300000
    //     0x748fbc: mov             x0, #0x93e0
    //     0x748fc0: movk            x0, #4, lsl #16
    // 0x748fc4: StoreField: r1->field_7 = r0
    //     0x748fc4: stur            x0, [x1, #7]
    // 0x748fc8: stp             x1, NULL, [SP]
    // 0x748fcc: r0 = call 0x3531e8
    //     0x748fcc: bl              #0x3531e8
    // 0x748fd0: mov             x1, x0
    // 0x748fd4: stur            x1, [fp, #-0x18]
    // 0x748fd8: r0 = Await()
    //     0x748fd8: bl              #0x6cdaec  ; AwaitStub
    // 0x748fdc: r0 = true
    //     0x748fdc: add             x0, NULL, #0x20  ; true
    // 0x748fe0: r0 = ReturnAsyncNotFuture()
    //     0x748fe0: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x748fe4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x748fe4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x748fe8: b               #0x748e2c
    // 0x748fec: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x748fec: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x748ff0: b               #0x748e4c
    // 0x748ff4: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x748ff4: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
    // 0x748ff8: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x748ff8: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
    // 0x748ffc: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x748ffc: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] Never <anonymous closure>(dynamic) {
    // ** addr: 0x6a7f28, size: -0x1
  }
}
