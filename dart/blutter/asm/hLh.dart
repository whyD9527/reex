// lib: , url: hLh

// class id: 1049314, size: 0x8
class :: {
}

// class id: 3551, size: 0x14, field offset: 0xc
//   const constructor, 
class cHa extends et {

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x71db24, size: 0x354
    // 0x71db24: EnterFrame
    //     0x71db24: stp             fp, lr, [SP, #-0x10]!
    //     0x71db28: mov             fp, SP
    // 0x71db2c: AllocStack(0xd8)
    //     0x71db2c: sub             SP, SP, #0xd8
    // 0x71db30: SetupParameters(cHa this /* r1, fp-0x78 */)
    //     0x71db30: stur            NULL, [fp, #-8]
    //     0x71db34: mov             x0, #0
    //     0x71db38: add             x1, fp, w0, sxtw #2
    //     0x71db3c: ldr             x1, [x1, #0x10]
    //     0x71db40: stur            x1, [fp, #-0x78]
    //     0x71db44: ldur            w2, [x1, #0x17]
    //     0x71db48: add             x2, x2, HEAP, lsl #32
    //     0x71db4c: stur            x2, [fp, #-0x70]
    // 0x71db50: CheckStackOverflow
    //     0x71db50: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x71db54: cmp             SP, x16
    //     0x71db58: b.ls            #0x71de64
    // 0x71db5c: InitAsync() -> Future<void?>
    //     0x71db5c: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x71db60: bl              #0x6cb614  ; InitAsyncStub
    // 0x71db64: ldur            x0, [fp, #-0x70]
    // 0x71db68: LoadField: r1 = r0->field_13
    //     0x71db68: ldur            w1, [x0, #0x13]
    // 0x71db6c: DecompressPointer r1
    //     0x71db6c: add             x1, x1, HEAP, lsl #32
    // 0x71db70: r16 = <rHa>
    //     0x71db70: add             x16, PP, #0x10, lsl #12  ; [pp+0x10bb0] TypeArguments: <rHa>
    //     0x71db74: ldr             x16, [x16, #0xbb0]
    // 0x71db78: stp             x1, x16, [SP]
    // 0x71db7c: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x71db7c: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x71db80: r0 = call 0x39deb0
    //     0x71db80: bl              #0x39deb0
    // 0x71db84: mov             x1, x0
    // 0x71db88: ldur            x0, [fp, #-0x70]
    // 0x71db8c: stur            x1, [fp, #-0x78]
    // 0x71db90: LoadField: r2 = r0->field_13
    //     0x71db90: ldur            w2, [x0, #0x13]
    // 0x71db94: DecompressPointer r2
    //     0x71db94: add             x2, x2, HEAP, lsl #32
    // 0x71db98: r16 = <MJa>
    //     0x71db98: add             x16, PP, #0x10, lsl #12  ; [pp+0x10bb8] TypeArguments: <MJa>
    //     0x71db9c: ldr             x16, [x16, #0xbb8]
    // 0x71dba0: stp             x2, x16, [SP]
    // 0x71dba4: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x71dba4: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x71dba8: r0 = call 0x39deb0
    //     0x71dba8: bl              #0x39deb0
    // 0x71dbac: stur            x0, [fp, #-0x80]
    // 0x71dbb0: ldur            x1, [fp, #-0x70]
    // 0x71dbb4: LoadField: r2 = r1->field_f
    //     0x71dbb4: ldur            w2, [x1, #0xf]
    // 0x71dbb8: DecompressPointer r2
    //     0x71dbb8: add             x2, x2, HEAP, lsl #32
    // 0x71dbbc: LoadField: r3 = r2->field_f
    //     0x71dbbc: ldur            w3, [x2, #0xf]
    // 0x71dbc0: DecompressPointer r3
    //     0x71dbc0: add             x3, x3, HEAP, lsl #32
    // 0x71dbc4: str             x3, [SP]
    // 0x71dbc8: r0 = call 0x4912fc
    //     0x71dbc8: bl              #0x4912fc
    // 0x71dbcc: stur            x0, [fp, #-0x90]
    // 0x71dbd0: LoadField: r2 = r0->field_7
    //     0x71dbd0: ldur            w2, [x0, #7]
    // 0x71dbd4: DecompressPointer r2
    //     0x71dbd4: add             x2, x2, HEAP, lsl #32
    // 0x71dbd8: mov             x1, x2
    // 0x71dbdc: stur            x2, [fp, #-0x88]
    // 0x71dbe0: r0 = h()
    //     0x71dbe0: bl              #0x6cf770  ; AllocatehStub -> h<X0> (size=0x24)
    // 0x71dbe4: mov             x1, x0
    // 0x71dbe8: ldur            x0, [fp, #-0x90]
    // 0x71dbec: stur            x1, [fp, #-0x98]
    // 0x71dbf0: StoreField: r1->field_b = r0
    //     0x71dbf0: stur            w0, [x1, #0xb]
    // 0x71dbf4: LoadField: r2 = r0->field_b
    //     0x71dbf4: ldur            w2, [x0, #0xb]
    // 0x71dbf8: DecompressPointer r2
    //     0x71dbf8: add             x2, x2, HEAP, lsl #32
    // 0x71dbfc: r3 = LoadInt32Instr(r2)
    //     0x71dbfc: sbfx            x3, x2, #1, #0x1f
    // 0x71dc00: stur            x3, [fp, #-0xb0]
    // 0x71dc04: StoreField: r1->field_f = r3
    //     0x71dc04: stur            x3, [x1, #0xf]
    // 0x71dc08: r2 = 0
    //     0x71dc08: mov             x2, #0
    // 0x71dc0c: ArrayStore: r1[0] = r2  ; List_8
    //     0x71dc0c: stur            x2, [x1, #0x17]
    // 0x71dc10: r2 = 0
    //     0x71dc10: mov             x2, #0
    // 0x71dc14: r4 = 2
    //     0x71dc14: mov             x4, #2
    // 0x71dc18: CheckStackOverflow
    //     0x71dc18: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x71dc1c: cmp             SP, x16
    //     0x71dc20: b.ls            #0x71de6c
    // 0x71dc24: LoadField: r5 = r0->field_b
    //     0x71dc24: ldur            w5, [x0, #0xb]
    // 0x71dc28: DecompressPointer r5
    //     0x71dc28: add             x5, x5, HEAP, lsl #32
    // 0x71dc2c: stur            x5, [fp, #-0x88]
    // 0x71dc30: r6 = LoadInt32Instr(r5)
    //     0x71dc30: sbfx            x6, x5, #1, #0x1f
    // 0x71dc34: cmp             x3, x6
    // 0x71dc38: b.ne            #0x71de44
    // 0x71dc3c: mov             x5, x0
    // 0x71dc40: cmp             x2, x6
    // 0x71dc44: b.lt            #0x71dc54
    // 0x71dc48: ldur            x7, [fp, #-0x98]
    // 0x71dc4c: StoreField: r7->field_1f = rNULL
    //     0x71dc4c: stur            NULL, [x7, #0x1f]
    // 0x71dc50: b               #0x71de3c
    // 0x71dc54: ldur            x7, [fp, #-0x98]
    // 0x71dc58: mov             x0, x6
    // 0x71dc5c: mov             x1, x2
    // 0x71dc60: cmp             x1, x0
    // 0x71dc64: b.hs            #0x71de74
    // 0x71dc68: LoadField: r0 = r5->field_f
    //     0x71dc68: ldur            w0, [x5, #0xf]
    // 0x71dc6c: DecompressPointer r0
    //     0x71dc6c: add             x0, x0, HEAP, lsl #32
    // 0x71dc70: ArrayLoad: r6 = r0[r2]  ; Unknown_4
    //     0x71dc70: add             x16, x0, x2, lsl #2
    //     0x71dc74: ldur            w6, [x16, #0xf]
    // 0x71dc78: DecompressPointer r6
    //     0x71dc78: add             x6, x6, HEAP, lsl #32
    // 0x71dc7c: mov             x0, x6
    // 0x71dc80: stur            x6, [fp, #-0x88]
    // 0x71dc84: StoreField: r7->field_1f = r0
    //     0x71dc84: stur            w0, [x7, #0x1f]
    //     0x71dc88: ldurb           w16, [x7, #-1]
    //     0x71dc8c: ldurb           w17, [x0, #-1]
    //     0x71dc90: and             x16, x17, x16, lsr #2
    //     0x71dc94: tst             x16, HEAP, lsr #32
    //     0x71dc98: b.eq            #0x71dca0
    //     0x71dc9c: bl              #0x74b758  ; WriteBarrierWrappersStub
    // 0x71dca0: add             x0, x2, #1
    // 0x71dca4: stur            x0, [fp, #-0xa8]
    // 0x71dca8: ArrayStore: r7[0] = r0  ; List_8
    //     0x71dca8: stur            x0, [x7, #0x17]
    // 0x71dcac: mov             x2, x4
    // 0x71dcb0: r1 = Null
    //     0x71dcb0: mov             x1, NULL
    // 0x71dcb4: r0 = AllocateArray()
    //     0x71dcb4: bl              #0x74cc68  ; AllocateArrayStub
    // 0x71dcb8: stur            x0, [fp, #-0xa0]
    // 0x71dcbc: r17 = " "
    //     0x71dcbc: ldr             x17, [PP, #0x1d48]  ; [pp+0x1d48] " "
    // 0x71dcc0: StoreField: r0->field_f = r17
    //     0x71dcc0: stur            w17, [x0, #0xf]
    // 0x71dcc4: r1 = <String>
    //     0x71dcc4: ldr             x1, [PP, #0x7e0]  ; [pp+0x7e0] TypeArguments: <String>
    // 0x71dcc8: r0 = AllocateGrowableArray()
    //     0x71dcc8: bl              #0x74be54  ; AllocateGrowableArrayStub
    // 0x71dccc: mov             x3, x0
    // 0x71dcd0: ldur            x0, [fp, #-0xa0]
    // 0x71dcd4: stur            x3, [fp, #-0xb8]
    // 0x71dcd8: StoreField: r3->field_f = r0
    //     0x71dcd8: stur            w0, [x3, #0xf]
    // 0x71dcdc: r0 = 2
    //     0x71dcdc: mov             x0, #2
    // 0x71dce0: StoreField: r3->field_b = r0
    //     0x71dce0: stur            w0, [x3, #0xb]
    // 0x71dce4: mov             x2, x0
    // 0x71dce8: r1 = Null
    //     0x71dce8: mov             x1, NULL
    // 0x71dcec: r0 = AllocateArray()
    //     0x71dcec: bl              #0x74cc68  ; AllocateArrayStub
    // 0x71dcf0: stur            x0, [fp, #-0xa0]
    // 0x71dcf4: r17 = Instance_HTa
    //     0x71dcf4: add             x17, PP, #0x26, lsl #12  ; [pp+0x268b0] Obj!HTa@421601
    //     0x71dcf8: ldr             x17, [x17, #0x8b0]
    // 0x71dcfc: StoreField: r0->field_f = r17
    //     0x71dcfc: stur            w17, [x0, #0xf]
    // 0x71dd00: r1 = <Object>
    //     0x71dd00: ldr             x1, [PP, #0x118]  ; [pp+0x118] TypeArguments: <Object>
    // 0x71dd04: r0 = AllocateGrowableArray()
    //     0x71dd04: bl              #0x74be54  ; AllocateGrowableArrayStub
    // 0x71dd08: mov             x1, x0
    // 0x71dd0c: ldur            x0, [fp, #-0xa0]
    // 0x71dd10: stur            x1, [fp, #-0xc0]
    // 0x71dd14: StoreField: r1->field_f = r0
    //     0x71dd14: stur            w0, [x1, #0xf]
    // 0x71dd18: r0 = 2
    //     0x71dd18: mov             x0, #2
    // 0x71dd1c: StoreField: r1->field_b = r0
    //     0x71dd1c: stur            w0, [x1, #0xb]
    // 0x71dd20: ldur            x16, [fp, #-0x88]
    // 0x71dd24: stp             x1, x16, [SP, #8]
    // 0x71dd28: ldur            x16, [fp, #-0xb8]
    // 0x71dd2c: str             x16, [SP]
    // 0x71dd30: r0 = call 0x425c38
    //     0x71dd30: bl              #0x425c38
    // 0x71dd34: r1 = Function '<anonymous closure>': static.
    //     0x71dd34: add             x1, PP, #0x27, lsl #12  ; [pp+0x27438] AnonymousClosure: static (0x425c9c), of [GNh] zOa
    //     0x71dd38: ldr             x1, [x1, #0x438]
    // 0x71dd3c: r2 = Null
    //     0x71dd3c: mov             x2, NULL
    // 0x71dd40: stur            x0, [fp, #-0xa0]
    // 0x71dd44: r0 = AllocateClosure()
    //     0x71dd44: bl              #0x74bfa8  ; AllocateClosureStub
    // 0x71dd48: r16 = <String>
    //     0x71dd48: ldr             x16, [PP, #0x7e0]  ; [pp+0x7e0] TypeArguments: <String>
    // 0x71dd4c: ldur            lr, [fp, #-0xa0]
    // 0x71dd50: stp             lr, x16, [SP, #8]
    // 0x71dd54: str             x0, [SP]
    // 0x71dd58: r4 = const [0x1, 0x2, 0x2, 0x2, null]
    //     0x71dd58: ldr             x4, [PP, #0x58]  ; [pp+0x58] List(5) [0x1, 0x2, 0x2, 0x2, Null]
    // 0x71dd5c: r0 = call 0x32d280
    //     0x71dd5c: bl              #0x32d280
    // 0x71dd60: r16 = false
    //     0x71dd60: add             x16, NULL, #0x30  ; false
    // 0x71dd64: stp             x16, x0, [SP]
    // 0x71dd68: r4 = const [0, 0x2, 0x2, 0x1, Wj, 0x1, null]
    //     0x71dd68: ldr             x4, [PP, #0x938]  ; [pp+0x938] List(7) [0, 0x2, 0x2, 0x1, "Wj", 0x1, Null]
    // 0x71dd6c: r0 = call 0x2fe5c0
    //     0x71dd6c: bl              #0x2fe5c0
    // 0x71dd70: ldur            x16, [fp, #-0x78]
    // 0x71dd74: stp             x0, x16, [SP]
    // 0x71dd78: r0 = __unknown_function__()
    //     0x71dd78: bl              #0x708980  ; [] ::__unknown_function__
    // 0x71dd7c: mov             x1, x0
    // 0x71dd80: stur            x1, [fp, #-0x88]
    // 0x71dd84: r0 = Await()
    //     0x71dd84: bl              #0x6cdaec  ; AwaitStub
    // 0x71dd88: ldur            x2, [fp, #-0xa8]
    // 0x71dd8c: ldur            x0, [fp, #-0x90]
    // 0x71dd90: ldur            x1, [fp, #-0x98]
    // 0x71dd94: ldur            x3, [fp, #-0xb0]
    // 0x71dd98: b               #0x71dc14
    // 0x71dd9c: sub             SP, fp, #0xd8
    // 0x71dda0: ldur            x1, [fp, #-0x20]
    // 0x71dda4: LoadField: r2 = r1->field_13
    //     0x71dda4: ldur            w2, [x1, #0x13]
    // 0x71dda8: DecompressPointer r2
    //     0x71dda8: add             x2, x2, HEAP, lsl #32
    // 0x71ddac: ArrayLoad: r1 = r2[0]  ; List_4
    //     0x71ddac: ldur            w1, [x2, #0x17]
    // 0x71ddb0: DecompressPointer r1
    //     0x71ddb0: add             x1, x1, HEAP, lsl #32
    // 0x71ddb4: cmp             w1, NULL
    // 0x71ddb8: b.eq            #0x71de3c
    // 0x71ddbc: r1 = 59
    //     0x71ddbc: mov             x1, #0x3b
    // 0x71ddc0: branchIfSmi(r0, 0x71ddcc)
    //     0x71ddc0: tbz             w0, #0, #0x71ddcc
    // 0x71ddc4: r1 = LoadClassIdInstr(r0)
    //     0x71ddc4: ldur            x1, [x0, #-1]
    //     0x71ddc8: ubfx            x1, x1, #0xc, #0x14
    // 0x71ddcc: cmp             x1, #0x2ca
    // 0x71ddd0: b.ne            #0x71dde4
    // 0x71ddd4: LoadField: r1 = r0->field_f
    //     0x71ddd4: ldur            w1, [x0, #0xf]
    // 0x71ddd8: DecompressPointer r1
    //     0x71ddd8: add             x1, x1, HEAP, lsl #32
    // 0x71dddc: mov             x0, x1
    // 0x71dde0: b               #0x71de10
    // 0x71dde4: r1 = 59
    //     0x71dde4: mov             x1, #0x3b
    // 0x71dde8: branchIfSmi(r0, 0x71ddf4)
    //     0x71dde8: tbz             w0, #0, #0x71ddf4
    // 0x71ddec: r1 = LoadClassIdInstr(r0)
    //     0x71ddec: ldur            x1, [x0, #-1]
    //     0x71ddf0: ubfx            x1, x1, #0xc, #0x14
    // 0x71ddf4: str             x0, [SP]
    // 0x71ddf8: mov             x0, x1
    // 0x71ddfc: r4 = const [0, 0x1, 0x1, 0x1, null]
    //     0x71ddfc: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    // 0x71de00: r0 = GDT[cid_x0 + 0x364a]()
    //     0x71de00: mov             x17, #0x364a
    //     0x71de04: add             lr, x0, x17
    //     0x71de08: ldr             lr, [x21, lr, lsl #3]
    //     0x71de0c: blr             lr
    // 0x71de10: stur            x0, [fp, #-0x70]
    // 0x71de14: r0 = VGa()
    //     0x71de14: bl              #0x6f2884  ; AllocateVGaStub -> VGa (size=0x14)
    // 0x71de18: mov             x1, x0
    // 0x71de1c: r0 = Instance_UGa
    //     0x71de1c: add             x0, PP, #0x11, lsl #12  ; [pp+0x11540] Obj!UGa@435a81
    //     0x71de20: ldr             x0, [x0, #0x540]
    // 0x71de24: StoreField: r1->field_b = r0
    //     0x71de24: stur            w0, [x1, #0xb]
    // 0x71de28: ldur            x0, [fp, #-0x70]
    // 0x71de2c: StoreField: r1->field_f = r0
    //     0x71de2c: stur            w0, [x1, #0xf]
    // 0x71de30: ldur            x16, [fp, #-0x50]
    // 0x71de34: stp             x1, x16, [SP]
    // 0x71de38: r0 = call 0x37dbbc
    //     0x71de38: bl              #0x37dbbc
    // 0x71de3c: r0 = Null
    //     0x71de3c: mov             x0, NULL
    // 0x71de40: r0 = ReturnAsyncNotFuture()
    //     0x71de40: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x71de44: r0 = Ha()
    //     0x71de44: bl              #0x6c91fc  ; AllocateHaStub -> Ha (size=0x10)
    // 0x71de48: mov             x1, x0
    // 0x71de4c: ldur            x5, [fp, #-0x90]
    // 0x71de50: stur            x1, [fp, #-0xa0]
    // 0x71de54: StoreField: r1->field_b = r5
    //     0x71de54: stur            w5, [x1, #0xb]
    // 0x71de58: mov             x0, x1
    // 0x71de5c: r0 = Throw()
    //     0x71de5c: bl              #0x74b258  ; ThrowStub
    // 0x71de60: brk             #0
    // 0x71de64: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x71de64: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x71de68: b               #0x71db5c
    // 0x71de6c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x71de6c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x71de70: b               #0x71dc24
    // 0x71de74: r0 = RangeErrorSharedWithoutFPURegs()
    //     0x71de74: bl              #0x74d1ac  ; RangeErrorSharedWithoutFPURegsStub
  }
}
