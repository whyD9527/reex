// lib: , url: Ezh

// class id: 1048747, size: 0x8
class :: {
}

// class id: 2095, size: 0x14, field offset: 0x8
class fF extends Object {
}

// class id: 2096, size: 0x10, field offset: 0x8
class eF extends Object {

  late double nsc; // offset: 0xc

  [closure] String <anonymous closure>(dynamic, double) {
    // ** addr: 0x4f9738, size: -0x1
  }
}

// class id: 2097, size: 0x14, field offset: 0x8
class _dF extends Object {
}

// class id: 2098, size: 0x1c, field offset: 0x8
class _cF extends Object {

  void []=(_cF, int, double) {
    // ** addr: 0x73c394, size: 0xe8
    // 0x73c394: EnterFrame
    //     0x73c394: stp             fp, lr, [SP, #-0x10]!
    //     0x73c398: mov             fp, SP
    // 0x73c39c: ldr             x0, [fp, #0x18]
    // 0x73c3a0: r2 = Null
    //     0x73c3a0: mov             x2, NULL
    // 0x73c3a4: r1 = Null
    //     0x73c3a4: mov             x1, NULL
    // 0x73c3a8: branchIfSmi(r0, 0x73c3d0)
    //     0x73c3a8: tbz             w0, #0, #0x73c3d0
    // 0x73c3ac: r4 = LoadClassIdInstr(r0)
    //     0x73c3ac: ldur            x4, [x0, #-1]
    //     0x73c3b0: ubfx            x4, x4, #0xc, #0x14
    // 0x73c3b4: sub             x4, x4, #0x3b
    // 0x73c3b8: cmp             x4, #1
    // 0x73c3bc: b.ls            #0x73c3d0
    // 0x73c3c0: r8 = int
    //     0x73c3c0: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x73c3c4: r3 = Null
    //     0x73c3c4: add             x3, PP, #0x31, lsl #12  ; [pp+0x31d68] Null
    //     0x73c3c8: ldr             x3, [x3, #0xd68]
    // 0x73c3cc: r0 = int()
    //     0x73c3cc: bl              #0x7586bc  ; IsType_int_Stub
    // 0x73c3d0: ldr             x0, [fp, #0x10]
    // 0x73c3d4: r2 = Null
    //     0x73c3d4: mov             x2, NULL
    // 0x73c3d8: r1 = Null
    //     0x73c3d8: mov             x1, NULL
    // 0x73c3dc: r4 = 59
    //     0x73c3dc: mov             x4, #0x3b
    // 0x73c3e0: branchIfSmi(r0, 0x73c3ec)
    //     0x73c3e0: tbz             w0, #0, #0x73c3ec
    // 0x73c3e4: r4 = LoadClassIdInstr(r0)
    //     0x73c3e4: ldur            x4, [x0, #-1]
    //     0x73c3e8: ubfx            x4, x4, #0xc, #0x14
    // 0x73c3ec: cmp             x4, #0x3d
    // 0x73c3f0: b.eq            #0x73c404
    // 0x73c3f4: r8 = double
    //     0x73c3f4: ldr             x8, [PP, #0xca8]  ; [pp+0xca8] Type: double
    // 0x73c3f8: r3 = Null
    //     0x73c3f8: add             x3, PP, #0x31, lsl #12  ; [pp+0x31d78] Null
    //     0x73c3fc: ldr             x3, [x3, #0xd78]
    // 0x73c400: r0 = double()
    //     0x73c400: bl              #0x758210  ; IsType_double_Stub
    // 0x73c404: ldr             x2, [fp, #0x20]
    // 0x73c408: ArrayLoad: r3 = r2[0]  ; List_4
    //     0x73c408: ldur            w3, [x2, #0x17]
    // 0x73c40c: DecompressPointer r3
    //     0x73c40c: add             x3, x3, HEAP, lsl #32
    // 0x73c410: LoadField: r4 = r2->field_7
    //     0x73c410: ldur            x4, [x2, #7]
    // 0x73c414: ldr             x2, [fp, #0x18]
    // 0x73c418: r5 = LoadInt32Instr(r2)
    //     0x73c418: sbfx            x5, x2, #1, #0x1f
    //     0x73c41c: tbz             w2, #0, #0x73c424
    //     0x73c420: ldur            x5, [x2, #7]
    // 0x73c424: add             x2, x5, x4
    // 0x73c428: LoadField: r4 = r3->field_13
    //     0x73c428: ldur            w4, [x3, #0x13]
    // 0x73c42c: DecompressPointer r4
    //     0x73c42c: add             x4, x4, HEAP, lsl #32
    // 0x73c430: r0 = LoadInt32Instr(r4)
    //     0x73c430: sbfx            x0, x4, #1, #0x1f
    // 0x73c434: mov             x1, x2
    // 0x73c438: cmp             x1, x0
    // 0x73c43c: b.hs            #0x73c460
    // 0x73c440: ldr             x1, [fp, #0x10]
    // 0x73c444: LoadField: d0 = r1->field_7
    //     0x73c444: ldur            d0, [x1, #7]
    // 0x73c448: ArrayStore: r3[r2] = d0  ; List_8
    //     0x73c448: add             x1, x3, x2, lsl #3
    //     0x73c44c: stur            d0, [x1, #0x17]
    // 0x73c450: r0 = Null
    //     0x73c450: mov             x0, NULL
    // 0x73c454: LeaveFrame
    //     0x73c454: mov             SP, fp
    //     0x73c458: ldp             fp, lr, [SP], #0x10
    // 0x73c45c: ret
    //     0x73c45c: ret             
    // 0x73c460: r0 = RangeErrorSharedWithoutFPURegs()
    //     0x73c460: bl              #0x74d1ac  ; RangeErrorSharedWithoutFPURegsStub
  }
  double [](_cF, int) {
    // ** addr: 0x73c47c, size: 0xe0
    // 0x73c47c: EnterFrame
    //     0x73c47c: stp             fp, lr, [SP, #-0x10]!
    //     0x73c480: mov             fp, SP
    // 0x73c484: ldr             x0, [fp, #0x10]
    // 0x73c488: r2 = Null
    //     0x73c488: mov             x2, NULL
    // 0x73c48c: r1 = Null
    //     0x73c48c: mov             x1, NULL
    // 0x73c490: branchIfSmi(r0, 0x73c4b8)
    //     0x73c490: tbz             w0, #0, #0x73c4b8
    // 0x73c494: r4 = LoadClassIdInstr(r0)
    //     0x73c494: ldur            x4, [x0, #-1]
    //     0x73c498: ubfx            x4, x4, #0xc, #0x14
    // 0x73c49c: sub             x4, x4, #0x3b
    // 0x73c4a0: cmp             x4, #1
    // 0x73c4a4: b.ls            #0x73c4b8
    // 0x73c4a8: r8 = int
    //     0x73c4a8: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x73c4ac: r3 = Null
    //     0x73c4ac: add             x3, PP, #0x20, lsl #12  ; [pp+0x20e60] Null
    //     0x73c4b0: ldr             x3, [x3, #0xe60]
    // 0x73c4b4: r0 = int()
    //     0x73c4b4: bl              #0x7586bc  ; IsType_int_Stub
    // 0x73c4b8: ldr             x2, [fp, #0x18]
    // 0x73c4bc: ArrayLoad: r3 = r2[0]  ; List_4
    //     0x73c4bc: ldur            w3, [x2, #0x17]
    // 0x73c4c0: DecompressPointer r3
    //     0x73c4c0: add             x3, x3, HEAP, lsl #32
    // 0x73c4c4: LoadField: r4 = r2->field_7
    //     0x73c4c4: ldur            x4, [x2, #7]
    // 0x73c4c8: ldr             x2, [fp, #0x10]
    // 0x73c4cc: r5 = LoadInt32Instr(r2)
    //     0x73c4cc: sbfx            x5, x2, #1, #0x1f
    //     0x73c4d0: tbz             w2, #0, #0x73c4d8
    //     0x73c4d4: ldur            x5, [x2, #7]
    // 0x73c4d8: add             x2, x5, x4
    // 0x73c4dc: LoadField: r4 = r3->field_13
    //     0x73c4dc: ldur            w4, [x3, #0x13]
    // 0x73c4e0: DecompressPointer r4
    //     0x73c4e0: add             x4, x4, HEAP, lsl #32
    // 0x73c4e4: r0 = LoadInt32Instr(r4)
    //     0x73c4e4: sbfx            x0, x4, #1, #0x1f
    // 0x73c4e8: mov             x1, x2
    // 0x73c4ec: cmp             x1, x0
    // 0x73c4f0: b.hs            #0x73c530
    // 0x73c4f4: ArrayLoad: d0 = r3[r2]  ; List_8
    //     0x73c4f4: add             x16, x3, x2, lsl #3
    //     0x73c4f8: ldur            d0, [x16, #0x17]
    // 0x73c4fc: r0 = inline_Allocate_Double()
    //     0x73c4fc: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0x73c500: add             x0, x0, #0x10
    //     0x73c504: cmp             x1, x0
    //     0x73c508: b.ls            #0x73c534
    //     0x73c50c: str             x0, [THR, #0x50]  ; THR::top
    //     0x73c510: sub             x0, x0, #0xf
    //     0x73c514: mov             x1, #0xd148
    //     0x73c518: movk            x1, #3, lsl #16
    //     0x73c51c: stur            x1, [x0, #-1]
    // 0x73c520: StoreField: r0->field_7 = d0
    //     0x73c520: stur            d0, [x0, #7]
    // 0x73c524: LeaveFrame
    //     0x73c524: mov             SP, fp
    //     0x73c528: ldp             fp, lr, [SP], #0x10
    // 0x73c52c: ret
    //     0x73c52c: ret             
    // 0x73c530: r0 = RangeErrorSharedWithoutFPURegs()
    //     0x73c530: bl              #0x74d1ac  ; RangeErrorSharedWithoutFPURegsStub
    // 0x73c534: SaveReg d0
    //     0x73c534: str             q0, [SP, #-0x10]!
    // 0x73c538: r0 = AllocateDouble()
    //     0x73c538: bl              #0x74cbc0  ; AllocateDoubleStub
    // 0x73c53c: RestoreReg d0
    //     0x73c53c: ldr             q0, [SP], #0x10
    // 0x73c540: b               #0x73c520
  }
}
