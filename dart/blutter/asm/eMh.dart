// lib: , url: EMh

// class id: 1049387, size: 0x8
class :: {
}

// class id: 2714, size: 0x18, field offset: 0x14
class _eMa extends nt<dynamic> {

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x717af0, size: 0xf8
    // 0x717af0: EnterFrame
    //     0x717af0: stp             fp, lr, [SP, #-0x10]!
    //     0x717af4: mov             fp, SP
    // 0x717af8: AllocStack(0x28)
    //     0x717af8: sub             SP, SP, #0x28
    // 0x717afc: SetupParameters(_eMa this /* r1 */)
    //     0x717afc: stur            NULL, [fp, #-8]
    //     0x717b00: mov             x0, #0
    //     0x717b04: add             x1, fp, w0, sxtw #2
    //     0x717b08: ldr             x1, [x1, #0x10]
    //     0x717b0c: ldur            w2, [x1, #0x17]
    //     0x717b10: add             x2, x2, HEAP, lsl #32
    //     0x717b14: stur            x2, [fp, #-0x10]
    // 0x717b18: CheckStackOverflow
    //     0x717b18: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x717b1c: cmp             SP, x16
    //     0x717b20: b.ls            #0x717bd8
    // 0x717b24: InitAsync() -> Future<void?>
    //     0x717b24: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x717b28: bl              #0x6cb614  ; InitAsyncStub
    // 0x717b2c: ldur            x0, [fp, #-0x10]
    // 0x717b30: LoadField: r1 = r0->field_f
    //     0x717b30: ldur            w1, [x0, #0xf]
    // 0x717b34: DecompressPointer r1
    //     0x717b34: add             x1, x1, HEAP, lsl #32
    // 0x717b38: LoadField: r2 = r1->field_13
    //     0x717b38: ldur            w2, [x1, #0x13]
    // 0x717b3c: DecompressPointer r2
    //     0x717b3c: add             x2, x2, HEAP, lsl #32
    // 0x717b40: cmp             w2, NULL
    // 0x717b44: b.eq            #0x717be0
    // 0x717b48: LoadField: r1 = r0->field_13
    //     0x717b48: ldur            w1, [x0, #0x13]
    // 0x717b4c: DecompressPointer r1
    //     0x717b4c: add             x1, x1, HEAP, lsl #32
    // 0x717b50: stp             x1, x2, [SP]
    // 0x717b54: r0 = __unknown_function__()
    //     0x717b54: bl              #0x717be8  ; [] ::__unknown_function__
    // 0x717b58: mov             x1, x0
    // 0x717b5c: stur            x1, [fp, #-0x18]
    // 0x717b60: r0 = Await()
    //     0x717b60: bl              #0x6cdaec  ; AwaitStub
    // 0x717b64: ldur            x0, [fp, #-0x10]
    // 0x717b68: LoadField: r1 = r0->field_f
    //     0x717b68: ldur            w1, [x0, #0xf]
    // 0x717b6c: DecompressPointer r1
    //     0x717b6c: add             x1, x1, HEAP, lsl #32
    // 0x717b70: LoadField: r2 = r1->field_13
    //     0x717b70: ldur            w2, [x1, #0x13]
    // 0x717b74: DecompressPointer r2
    //     0x717b74: add             x2, x2, HEAP, lsl #32
    // 0x717b78: cmp             w2, NULL
    // 0x717b7c: b.eq            #0x717be4
    // 0x717b80: str             x2, [SP]
    // 0x717b84: r0 = __unknown_function__()
    //     0x717b84: bl              #0x6fb7a8  ; [] ::__unknown_function__
    // 0x717b88: mov             x1, x0
    // 0x717b8c: stur            x1, [fp, #-0x18]
    // 0x717b90: r0 = Await()
    //     0x717b90: bl              #0x6cdaec  ; AwaitStub
    // 0x717b94: ldur            x0, [fp, #-0x10]
    // 0x717b98: LoadField: r3 = r0->field_f
    //     0x717b98: ldur            w3, [x0, #0xf]
    // 0x717b9c: DecompressPointer r3
    //     0x717b9c: add             x3, x3, HEAP, lsl #32
    // 0x717ba0: stur            x3, [fp, #-0x18]
    // 0x717ba4: LoadField: r0 = r3->field_f
    //     0x717ba4: ldur            w0, [x3, #0xf]
    // 0x717ba8: DecompressPointer r0
    //     0x717ba8: add             x0, x0, HEAP, lsl #32
    // 0x717bac: cmp             w0, NULL
    // 0x717bb0: b.eq            #0x717bd0
    // 0x717bb4: r1 = Function '<anonymous closure>':.
    //     0x717bb4: add             x1, PP, #0x29, lsl #12  ; [pp+0x29c00] Function: [dart:ui] Shader::Shader._ (0x6a96a0)
    //     0x717bb8: ldr             x1, [x1, #0xc00]
    // 0x717bbc: r2 = Null
    //     0x717bbc: mov             x2, NULL
    // 0x717bc0: r0 = AllocateClosure()
    //     0x717bc0: bl              #0x74bfa8  ; AllocateClosureStub
    // 0x717bc4: ldur            x16, [fp, #-0x18]
    // 0x717bc8: stp             x0, x16, [SP]
    // 0x717bcc: r0 = call 0x2278d4
    //     0x717bcc: bl              #0x2278d4
    // 0x717bd0: r0 = Null
    //     0x717bd0: mov             x0, NULL
    // 0x717bd4: r0 = ReturnAsyncNotFuture()
    //     0x717bd4: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x717bd8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x717bd8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x717bdc: b               #0x717b24
    // 0x717be0: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x717be0: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
    // 0x717be4: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x717be4: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x717cf0, size: 0x1fc
    // 0x717cf0: EnterFrame
    //     0x717cf0: stp             fp, lr, [SP, #-0x10]!
    //     0x717cf4: mov             fp, SP
    // 0x717cf8: AllocStack(0x40)
    //     0x717cf8: sub             SP, SP, #0x40
    // 0x717cfc: SetupParameters(_eMa this /* r1 */)
    //     0x717cfc: stur            NULL, [fp, #-8]
    //     0x717d00: mov             x0, #0
    //     0x717d04: add             x1, fp, w0, sxtw #2
    //     0x717d08: ldr             x1, [x1, #0x10]
    //     0x717d0c: ldur            w2, [x1, #0x17]
    //     0x717d10: add             x2, x2, HEAP, lsl #32
    //     0x717d14: stur            x2, [fp, #-0x10]
    // 0x717d18: CheckStackOverflow
    //     0x717d18: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x717d1c: cmp             SP, x16
    //     0x717d20: b.ls            #0x717edc
    // 0x717d24: InitAsync() -> Future<void?>
    //     0x717d24: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x717d28: bl              #0x6cb614  ; InitAsyncStub
    // 0x717d2c: ldur            x0, [fp, #-0x10]
    // 0x717d30: LoadField: r1 = r0->field_f
    //     0x717d30: ldur            w1, [x0, #0xf]
    // 0x717d34: DecompressPointer r1
    //     0x717d34: add             x1, x1, HEAP, lsl #32
    // 0x717d38: LoadField: r2 = r1->field_f
    //     0x717d38: ldur            w2, [x1, #0xf]
    // 0x717d3c: DecompressPointer r2
    //     0x717d3c: add             x2, x2, HEAP, lsl #32
    // 0x717d40: stur            x2, [fp, #-0x20]
    // 0x717d44: cmp             w2, NULL
    // 0x717d48: b.ne            #0x717d54
    // 0x717d4c: r0 = Null
    //     0x717d4c: mov             x0, NULL
    // 0x717d50: r0 = ReturnAsyncNotFuture()
    //     0x717d50: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x717d54: LoadField: r1 = r0->field_13
    //     0x717d54: ldur            w1, [x0, #0x13]
    // 0x717d58: DecompressPointer r1
    //     0x717d58: add             x1, x1, HEAP, lsl #32
    // 0x717d5c: LoadField: r3 = r1->field_7
    //     0x717d5c: ldur            w3, [x1, #7]
    // 0x717d60: DecompressPointer r3
    //     0x717d60: add             x3, x3, HEAP, lsl #32
    // 0x717d64: stur            x3, [fp, #-0x18]
    // 0x717d68: r0 = XNa()
    //     0x717d68: bl              #0x712d78  ; AllocateXNaStub -> XNa (size=0x18)
    // 0x717d6c: mov             x3, x0
    // 0x717d70: r0 = Instance_ica
    //     0x717d70: add             x0, PP, #0x10, lsl #12  ; [pp+0x103c8] Obj!ica@422a41
    //     0x717d74: ldr             x0, [x0, #0x3c8]
    // 0x717d78: stur            x3, [fp, #-0x28]
    // 0x717d7c: StoreField: r3->field_b = r0
    //     0x717d7c: stur            w0, [x3, #0xb]
    // 0x717d80: ldur            x0, [fp, #-0x18]
    // 0x717d84: StoreField: r3->field_13 = r0
    //     0x717d84: stur            w0, [x3, #0x13]
    // 0x717d88: r1 = Null
    //     0x717d88: mov             x1, NULL
    // 0x717d8c: r2 = 2
    //     0x717d8c: mov             x2, #2
    // 0x717d90: r0 = AllocateArray()
    //     0x717d90: bl              #0x74cc68  ; AllocateArrayStub
    // 0x717d94: mov             x2, x0
    // 0x717d98: ldur            x0, [fp, #-0x28]
    // 0x717d9c: stur            x2, [fp, #-0x18]
    // 0x717da0: StoreField: r2->field_f = r0
    //     0x717da0: stur            w0, [x2, #0xf]
    // 0x717da4: r1 = <XNa>
    //     0x717da4: add             x1, PP, #0x10, lsl #12  ; [pp+0x10070] TypeArguments: <XNa>
    //     0x717da8: ldr             x1, [x1, #0x70]
    // 0x717dac: r0 = AllocateGrowableArray()
    //     0x717dac: bl              #0x74be54  ; AllocateGrowableArrayStub
    // 0x717db0: mov             x1, x0
    // 0x717db4: ldur            x0, [fp, #-0x18]
    // 0x717db8: StoreField: r1->field_f = r0
    //     0x717db8: stur            w0, [x1, #0xf]
    // 0x717dbc: r0 = 2
    //     0x717dbc: mov             x0, #2
    // 0x717dc0: StoreField: r1->field_b = r0
    //     0x717dc0: stur            w0, [x1, #0xb]
    // 0x717dc4: ldur            x16, [fp, #-0x20]
    // 0x717dc8: stp             x1, x16, [SP]
    // 0x717dcc: r4 = const [0, 0x2, 0x2, 0x2, null]
    //     0x717dcc: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    // 0x717dd0: r0 = call 0x44b750
    //     0x717dd0: bl              #0x44b750
    // 0x717dd4: mov             x1, x0
    // 0x717dd8: stur            x1, [fp, #-0x18]
    // 0x717ddc: r0 = Await()
    //     0x717ddc: bl              #0x6cdaec  ; AwaitStub
    // 0x717de0: ldur            x1, [fp, #-0x28]
    // 0x717de4: LoadField: r0 = r1->field_13
    //     0x717de4: ldur            w0, [x1, #0x13]
    // 0x717de8: DecompressPointer r0
    //     0x717de8: add             x0, x0, HEAP, lsl #32
    // 0x717dec: ldur            x2, [fp, #-0x10]
    // 0x717df0: LoadField: r3 = r2->field_13
    //     0x717df0: ldur            w3, [x2, #0x13]
    // 0x717df4: DecompressPointer r3
    //     0x717df4: add             x3, x3, HEAP, lsl #32
    // 0x717df8: LoadField: r4 = r3->field_7
    //     0x717df8: ldur            w4, [x3, #7]
    // 0x717dfc: DecompressPointer r4
    //     0x717dfc: add             x4, x4, HEAP, lsl #32
    // 0x717e00: r3 = LoadClassIdInstr(r0)
    //     0x717e00: ldur            x3, [x0, #-1]
    //     0x717e04: ubfx            x3, x3, #0xc, #0x14
    // 0x717e08: stp             x4, x0, [SP]
    // 0x717e0c: mov             x0, x3
    // 0x717e10: mov             lr, x0
    // 0x717e14: ldr             lr, [x21, lr, lsl #3]
    // 0x717e18: blr             lr
    // 0x717e1c: tbz             w0, #4, #0x717e98
    // 0x717e20: ldur            x1, [fp, #-0x10]
    // 0x717e24: ldur            x0, [fp, #-0x28]
    // 0x717e28: LoadField: r2 = r1->field_f
    //     0x717e28: ldur            w2, [x1, #0xf]
    // 0x717e2c: DecompressPointer r2
    //     0x717e2c: add             x2, x2, HEAP, lsl #32
    // 0x717e30: LoadField: r3 = r2->field_13
    //     0x717e30: ldur            w3, [x2, #0x13]
    // 0x717e34: DecompressPointer r3
    //     0x717e34: add             x3, x3, HEAP, lsl #32
    // 0x717e38: cmp             w3, NULL
    // 0x717e3c: b.eq            #0x717ee4
    // 0x717e40: LoadField: r2 = r1->field_13
    //     0x717e40: ldur            w2, [x1, #0x13]
    // 0x717e44: DecompressPointer r2
    //     0x717e44: add             x2, x2, HEAP, lsl #32
    // 0x717e48: LoadField: r4 = r0->field_13
    //     0x717e48: ldur            w4, [x0, #0x13]
    // 0x717e4c: DecompressPointer r4
    //     0x717e4c: add             x4, x4, HEAP, lsl #32
    // 0x717e50: stp             x2, x3, [SP, #8]
    // 0x717e54: str             x4, [SP]
    // 0x717e58: r0 = __unknown_function__()
    //     0x717e58: bl              #0x717eec  ; [] ::__unknown_function__
    // 0x717e5c: mov             x1, x0
    // 0x717e60: stur            x1, [fp, #-0x18]
    // 0x717e64: r0 = Await()
    //     0x717e64: bl              #0x6cdaec  ; AwaitStub
    // 0x717e68: ldur            x0, [fp, #-0x10]
    // 0x717e6c: LoadField: r1 = r0->field_f
    //     0x717e6c: ldur            w1, [x0, #0xf]
    // 0x717e70: DecompressPointer r1
    //     0x717e70: add             x1, x1, HEAP, lsl #32
    // 0x717e74: LoadField: r2 = r1->field_13
    //     0x717e74: ldur            w2, [x1, #0x13]
    // 0x717e78: DecompressPointer r2
    //     0x717e78: add             x2, x2, HEAP, lsl #32
    // 0x717e7c: cmp             w2, NULL
    // 0x717e80: b.eq            #0x717ee8
    // 0x717e84: str             x2, [SP]
    // 0x717e88: r0 = __unknown_function__()
    //     0x717e88: bl              #0x6fb7a8  ; [] ::__unknown_function__
    // 0x717e8c: mov             x1, x0
    // 0x717e90: stur            x1, [fp, #-0x18]
    // 0x717e94: r0 = Await()
    //     0x717e94: bl              #0x6cdaec  ; AwaitStub
    // 0x717e98: ldur            x0, [fp, #-0x10]
    // 0x717e9c: LoadField: r3 = r0->field_f
    //     0x717e9c: ldur            w3, [x0, #0xf]
    // 0x717ea0: DecompressPointer r3
    //     0x717ea0: add             x3, x3, HEAP, lsl #32
    // 0x717ea4: stur            x3, [fp, #-0x18]
    // 0x717ea8: LoadField: r0 = r3->field_f
    //     0x717ea8: ldur            w0, [x3, #0xf]
    // 0x717eac: DecompressPointer r0
    //     0x717eac: add             x0, x0, HEAP, lsl #32
    // 0x717eb0: cmp             w0, NULL
    // 0x717eb4: b.eq            #0x717ed4
    // 0x717eb8: r1 = Function '<anonymous closure>':.
    //     0x717eb8: add             x1, PP, #0x29, lsl #12  ; [pp+0x29c18] Function: [dart:ui] Shader::Shader._ (0x6a96a0)
    //     0x717ebc: ldr             x1, [x1, #0xc18]
    // 0x717ec0: r2 = Null
    //     0x717ec0: mov             x2, NULL
    // 0x717ec4: r0 = AllocateClosure()
    //     0x717ec4: bl              #0x74bfa8  ; AllocateClosureStub
    // 0x717ec8: ldur            x16, [fp, #-0x18]
    // 0x717ecc: stp             x0, x16, [SP]
    // 0x717ed0: r0 = call 0x2278d4
    //     0x717ed0: bl              #0x2278d4
    // 0x717ed4: r0 = Null
    //     0x717ed4: mov             x0, NULL
    // 0x717ed8: r0 = ReturnAsyncNotFuture()
    //     0x717ed8: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x717edc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x717edc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x717ee0: b               #0x717d24
    // 0x717ee4: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x717ee4: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
    // 0x717ee8: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x717ee8: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] Future<void> _KGf(dynamic) {
    // ** addr: 0x45d444, size: -0x1
  }
  [closure] tNa <anonymous closure>(dynamic, gha, int) {
    // ** addr: 0x45ce34, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x45d184, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x45cf6c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x45d1ec, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, ATa) {
    // ** addr: 0x45d514, size: -0x1
  }
}

// class id: 3254, size: 0xc, field offset: 0xc
//   const constructor, 
class dMa extends kt {
}
