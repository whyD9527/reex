// lib: , url: MLh

// class id: 1049343, size: 0x8
class :: {

  static late final BQa<DEa?, String> dBf; // offset: 0xf3c

  [closure] static Stream<DEa?> <anonymous closure>(dynamic, uQa<DEa?>, String) {
    // ** addr: 0x495f50, size: -0x1
  }
  static BQa<DEa?, String> dBf() {
    // ** addr: 0x495ef4, size: -0x1
  }
}

// class id: 507, size: 0x8, field offset: 0x8
class fKa extends Object {

  static late final fKa current; // offset: 0xf38

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x742520, size: 0x1c0
    // 0x742520: EnterFrame
    //     0x742520: stp             fp, lr, [SP, #-0x10]!
    //     0x742524: mov             fp, SP
    // 0x742528: AllocStack(0x48)
    //     0x742528: sub             SP, SP, #0x48
    // 0x74252c: SetupParameters(fKa this /* r1 */)
    //     0x74252c: stur            NULL, [fp, #-8]
    //     0x742530: mov             x0, #0
    //     0x742534: add             x1, fp, w0, sxtw #2
    //     0x742538: ldr             x1, [x1, #0x10]
    //     0x74253c: ldur            w2, [x1, #0x17]
    //     0x742540: add             x2, x2, HEAP, lsl #32
    //     0x742544: stur            x2, [fp, #-0x10]
    // 0x742548: CheckStackOverflow
    //     0x742548: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x74254c: cmp             SP, x16
    //     0x742550: b.ls            #0x7426d0
    // 0x742554: InitAsync() -> Future<void?>
    //     0x742554: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x742558: bl              #0x6cb614  ; InitAsyncStub
    // 0x74255c: ldur            x0, [fp, #-0x10]
    // 0x742560: LoadField: r1 = r0->field_13
    //     0x742560: ldur            w1, [x0, #0x13]
    // 0x742564: DecompressPointer r1
    //     0x742564: add             x1, x1, HEAP, lsl #32
    // 0x742568: str             x1, [SP]
    // 0x74256c: r0 = call 0x2f5654
    //     0x74256c: bl              #0x2f5654
    // 0x742570: mov             x1, x0
    // 0x742574: stur            x1, [fp, #-0x30]
    // 0x742578: LoadField: r2 = r1->field_b
    //     0x742578: ldur            w2, [x1, #0xb]
    // 0x74257c: DecompressPointer r2
    //     0x74257c: add             x2, x2, HEAP, lsl #32
    // 0x742580: stur            x2, [fp, #-0x28]
    // 0x742584: LoadField: r3 = r1->field_f
    //     0x742584: ldur            x3, [x1, #0xf]
    // 0x742588: stur            x3, [fp, #-0x20]
    // 0x74258c: LoadField: r4 = r1->field_7
    //     0x74258c: ldur            w4, [x1, #7]
    // 0x742590: DecompressPointer r4
    //     0x742590: add             x4, x4, HEAP, lsl #32
    // 0x742594: stur            x4, [fp, #-0x18]
    // 0x742598: ldur            x5, [fp, #-0x10]
    // 0x74259c: CheckStackOverflow
    //     0x74259c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x7425a0: cmp             SP, x16
    //     0x7425a4: b.ls            #0x7426d8
    // 0x7425a8: r0 = LoadClassIdInstr(r2)
    //     0x7425a8: ldur            x0, [x2, #-1]
    //     0x7425ac: ubfx            x0, x0, #0xc, #0x14
    // 0x7425b0: str             x2, [SP]
    // 0x7425b4: r0 = GDT[cid_x0 + 0x9338]()
    //     0x7425b4: mov             x17, #0x9338
    //     0x7425b8: add             lr, x0, x17
    //     0x7425bc: ldr             lr, [x21, lr, lsl #3]
    //     0x7425c0: blr             lr
    // 0x7425c4: r1 = LoadInt32Instr(r0)
    //     0x7425c4: sbfx            x1, x0, #1, #0x1f
    //     0x7425c8: tbz             w0, #0, #0x7425d0
    //     0x7425cc: ldur            x1, [x0, #7]
    // 0x7425d0: ldur            x2, [fp, #-0x20]
    // 0x7425d4: cmp             x2, x1
    // 0x7425d8: b.ne            #0x7426b8
    // 0x7425dc: ldur            x4, [fp, #-0x30]
    // 0x7425e0: ldur            x3, [fp, #-0x28]
    // 0x7425e4: ArrayLoad: r0 = r4[0]  ; List_8
    //     0x7425e4: ldur            x0, [x4, #0x17]
    // 0x7425e8: cmp             x0, x1
    // 0x7425ec: b.lt            #0x7425fc
    // 0x7425f0: StoreField: r4->field_1f = rNULL
    //     0x7425f0: stur            NULL, [x4, #0x1f]
    // 0x7425f4: r0 = Null
    //     0x7425f4: mov             x0, NULL
    // 0x7425f8: r0 = ReturnAsyncNotFuture()
    //     0x7425f8: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x7425fc: r1 = LoadClassIdInstr(r3)
    //     0x7425fc: ldur            x1, [x3, #-1]
    //     0x742600: ubfx            x1, x1, #0xc, #0x14
    // 0x742604: stp             x0, x3, [SP]
    // 0x742608: mov             x0, x1
    // 0x74260c: r0 = GDT[cid_x0 + 0xf51d]()
    //     0x74260c: mov             x17, #0xf51d
    //     0x742610: add             lr, x0, x17
    //     0x742614: ldr             lr, [x21, lr, lsl #3]
    //     0x742618: blr             lr
    // 0x74261c: mov             x4, x0
    // 0x742620: ldur            x3, [fp, #-0x30]
    // 0x742624: stur            x4, [fp, #-0x38]
    // 0x742628: StoreField: r3->field_1f = r0
    //     0x742628: stur            w0, [x3, #0x1f]
    //     0x74262c: tbz             w0, #0, #0x742648
    //     0x742630: ldurb           w16, [x3, #-1]
    //     0x742634: ldurb           w17, [x0, #-1]
    //     0x742638: and             x16, x17, x16, lsr #2
    //     0x74263c: tst             x16, HEAP, lsr #32
    //     0x742640: b.eq            #0x742648
    //     0x742644: bl              #0x74b6d8  ; WriteBarrierWrappersStub
    // 0x742648: ArrayLoad: r0 = r3[0]  ; List_8
    //     0x742648: ldur            x0, [x3, #0x17]
    // 0x74264c: add             x1, x0, #1
    // 0x742650: ArrayStore: r3[0] = r1  ; List_8
    //     0x742650: stur            x1, [x3, #0x17]
    // 0x742654: cmp             w4, NULL
    // 0x742658: b.ne            #0x74268c
    // 0x74265c: mov             x0, x4
    // 0x742660: ldur            x2, [fp, #-0x18]
    // 0x742664: r1 = Null
    //     0x742664: mov             x1, NULL
    // 0x742668: cmp             w2, NULL
    // 0x74266c: b.eq            #0x74268c
    // 0x742670: ArrayLoad: r4 = r2[0]  ; List_4
    //     0x742670: ldur            w4, [x2, #0x17]
    // 0x742674: DecompressPointer r4
    //     0x742674: add             x4, x4, HEAP, lsl #32
    // 0x742678: r8 = X0
    //     0x742678: ldr             x8, [PP, #0x158]  ; [pp+0x158] TypeParameter: X0
    // 0x74267c: LoadField: r9 = r4->field_7
    //     0x74267c: ldur            x9, [x4, #7]
    // 0x742680: r3 = Null
    //     0x742680: add             x3, PP, #0x2d, lsl #12  ; [pp+0x2dcb0] Null
    //     0x742684: ldr             x3, [x3, #0xcb0]
    // 0x742688: blr             x9
    // 0x74268c: ldur            x0, [fp, #-0x10]
    // 0x742690: LoadField: r1 = r0->field_f
    //     0x742690: ldur            w1, [x0, #0xf]
    // 0x742694: DecompressPointer r1
    //     0x742694: add             x1, x1, HEAP, lsl #32
    // 0x742698: ldur            x16, [fp, #-0x38]
    // 0x74269c: stp             x16, x1, [SP]
    // 0x7426a0: r0 = __unknown_function__()
    //     0x7426a0: bl              #0x718908  ; [] ::__unknown_function__
    // 0x7426a4: ldur            x1, [fp, #-0x30]
    // 0x7426a8: ldur            x4, [fp, #-0x18]
    // 0x7426ac: ldur            x2, [fp, #-0x28]
    // 0x7426b0: ldur            x3, [fp, #-0x20]
    // 0x7426b4: b               #0x742598
    // 0x7426b8: ldur            x0, [fp, #-0x28]
    // 0x7426bc: r0 = Ha()
    //     0x7426bc: bl              #0x6c91fc  ; AllocateHaStub -> Ha (size=0x10)
    // 0x7426c0: ldur            x3, [fp, #-0x28]
    // 0x7426c4: StoreField: r0->field_b = r3
    //     0x7426c4: stur            w3, [x0, #0xb]
    // 0x7426c8: r0 = Throw()
    //     0x7426c8: bl              #0x74b258  ; ThrowStub
    // 0x7426cc: brk             #0
    // 0x7426d0: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7426d0: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7426d4: b               #0x742554
    // 0x7426d8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7426d8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7426dc: b               #0x7425a8
  }
  [closure] Aw <anonymous closure>(dynamic, CEa) {
    // ** addr: 0x4aaf0c, size: -0x1
  }
  [closure] pv<bool> <anonymous closure>(dynamic, CEa) {
    // ** addr: 0x378288, size: -0x1
  }
}
