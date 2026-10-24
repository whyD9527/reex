// lib: , url: SFh

// class id: 1049325, size: 0x8
class :: {
}

// class id: 1187, size: 0x38, field offset: 0x38
//   transformed mixin,
abstract class _FHa extends rHa
     with qBa {
}

// class id: 1188, size: 0x68, field offset: 0x38
class pFa extends _FHa {

  late final List<JJa> _nxf; // offset: 0x3c

  [closure] (int, int) <anonymous closure>(dynamic) {
    // ** addr: 0x700464, size: 0x1ac
    // 0x700464: EnterFrame
    //     0x700464: stp             fp, lr, [SP, #-0x10]!
    //     0x700468: mov             fp, SP
    // 0x70046c: AllocStack(0x88)
    //     0x70046c: sub             SP, SP, #0x88
    // 0x700470: SetupParameters([dynamic _ /* r0 */])
    //     0x700470: ldr             x0, [fp, #0x10]
    //     0x700474: ldur            w1, [x0, #0x17]
    //     0x700478: add             x1, x1, HEAP, lsl #32
    // 0x70047c: CheckStackOverflow
    //     0x70047c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x700480: cmp             SP, x16
    //     0x700484: b.ls            #0x700608
    // 0x700488: LoadField: r0 = r1->field_f
    //     0x700488: ldur            w0, [x1, #0xf]
    // 0x70048c: DecompressPointer r0
    //     0x70048c: add             x0, x0, HEAP, lsl #32
    // 0x700490: stur            x0, [fp, #-0x50]
    // 0x700494: str             x0, [SP]
    // 0x700498: r4 = const [0, 0x1, 0x1, 0x1, null]
    //     0x700498: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    // 0x70049c: r0 = call 0x369f60
    //     0x70049c: bl              #0x369f60
    // 0x7004a0: stur            x0, [fp, #-0x58]
    // 0x7004a4: str             x0, [SP]
    // 0x7004a8: r0 = call 0x369e70
    //     0x7004a8: bl              #0x369e70
    // 0x7004ac: stur            x0, [fp, #-0x60]
    // 0x7004b0: r16 = <Uint8>
    //     0x7004b0: add             x16, PP, #0x10, lsl #12  ; [pp+0x10db8] TypeArguments: <Uint8>
    //     0x7004b4: ldr             x16, [x16, #0xdb8]
    // 0x7004b8: r30 = Instance_Sx
    //     0x7004b8: add             lr, PP, #0x11, lsl #12  ; [pp+0x11068] Obj!Sx@4302d1
    //     0x7004bc: ldr             lr, [lr, #0x68]
    // 0x7004c0: stp             lr, x16, [SP, #8]
    // 0x7004c4: str             x0, [SP]
    // 0x7004c8: r4 = const [0x1, 0x2, 0x2, 0x2, null]
    //     0x7004c8: ldr             x4, [PP, #0x58]  ; [pp+0x58] List(5) [0x1, 0x2, 0x2, 0x2, Null]
    // 0x7004cc: r0 = call 0x5de570
    //     0x7004cc: bl              #0x5de570
    // 0x7004d0: stur            x0, [fp, #-0x68]
    // 0x7004d4: ldur            x1, [fp, #-0x60]
    // 0x7004d8: tbnz            x1, #0x3f, #0x700580
    // 0x7004dc: r17 = 1073741823
    //     0x7004dc: mov             x17, #0x3fffffff
    // 0x7004e0: cmp             x1, x17
    // 0x7004e4: b.gt            #0x700580
    // 0x7004e8: r0 = _ExternalUint8Array()
    //     0x7004e8: bl              #0x6eb8e4  ; Allocate_ExternalUint8ArrayStub -> _ExternalUint8Array (size=-0x8)
    // 0x7004ec: mov             x3, x0
    // 0x7004f0: ldur            x2, [fp, #-0x60]
    // 0x7004f4: r0 = BoxInt64Instr(r2)
    //     0x7004f4: sbfiz           x0, x2, #1, #0x1f
    //     0x7004f8: cmp             x2, x0, asr #1
    //     0x7004fc: b.eq            #0x700508
    //     0x700500: bl              #0x74cee4  ; AllocateMintSharedWithoutFPURegsStub
    //     0x700504: stur            x2, [x0, #7]
    // 0x700508: stur            x0, [fp, #-0x70]
    // 0x70050c: StoreField: r3->field_13 = r0
    //     0x70050c: stur            w0, [x3, #0x13]
    // 0x700510: ldur            x1, [fp, #-0x68]
    // 0x700514: LoadField: r2 = r1->field_7
    //     0x700514: ldur            x2, [x1, #7]
    // 0x700518: StoreField: r3->field_7 = r2
    //     0x700518: stur            x2, [x3, #7]
    // 0x70051c: ldur            x16, [fp, #-0x58]
    // 0x700520: stp             x3, x16, [SP]
    // 0x700524: r4 = const [0, 0x2, 0x2, 0x2, null]
    //     0x700524: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    // 0x700528: r0 = call 0x369188
    //     0x700528: bl              #0x369188
    // 0x70052c: ldur            x16, [fp, #-0x58]
    // 0x700530: str             x16, [SP]
    // 0x700534: r0 = call 0x368f48
    //     0x700534: bl              #0x368f48
    // 0x700538: ldur            x16, [fp, #-0x50]
    // 0x70053c: str             x16, [SP]
    // 0x700540: r4 = const [0, 0x1, 0x1, 0x1, null]
    //     0x700540: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    // 0x700544: r0 = call 0x3ad2b0
    //     0x700544: bl              #0x3ad2b0
    // 0x700548: ldur            x0, [fp, #-0x68]
    // 0x70054c: LoadField: r1 = r0->field_7
    //     0x70054c: ldur            x1, [x0, #7]
    // 0x700550: mov             x2, x1
    // 0x700554: r0 = BoxInt64Instr(r2)
    //     0x700554: sbfiz           x0, x2, #1, #0x1f
    //     0x700558: cmp             x2, x0, asr #1
    //     0x70055c: b.eq            #0x700568
    //     0x700560: bl              #0x74cee4  ; AllocateMintSharedWithoutFPURegsStub
    //     0x700564: stur            x2, [x0, #7]
    // 0x700568: mov             x2, x0
    // 0x70056c: ldur            x3, [fp, #-0x70]
    // 0x700570: r0 = AllocateRecord2()
    //     0x700570: bl              #0x74bc00  ; AllocateRecord2Stub
    // 0x700574: LeaveFrame
    //     0x700574: mov             SP, fp
    //     0x700578: ldp             fp, lr, [SP], #0x10
    // 0x70057c: ret
    //     0x70057c: ret             
    // 0x700580: r0 = ArgumentError()
    //     0x700580: bl              #0x6cad10  ; AllocateArgumentErrorStub -> ArgumentError (size=0x1c)
    // 0x700584: r1 = Null
    //     0x700584: mov             x1, NULL
    // 0x700588: r2 = 6
    //     0x700588: mov             x2, #6
    // 0x70058c: stur            x0, [fp, #-0x70]
    // 0x700590: r0 = AllocateArray()
    //     0x700590: bl              #0x74cc68  ; AllocateArrayStub
    // 0x700594: r17 = "length must be in the range [0, "
    //     0x700594: add             x17, PP, #0x10, lsl #12  ; [pp+0x10ea8] "length must be in the range [0, "
    //     0x700598: ldr             x17, [x17, #0xea8]
    // 0x70059c: StoreField: r0->field_f = r17
    //     0x70059c: stur            w17, [x0, #0xf]
    // 0x7005a0: r17 = 2147483646
    //     0x7005a0: mov             x17, #0x7ffffffe
    // 0x7005a4: StoreField: r0->field_13 = r17
    //     0x7005a4: stur            w17, [x0, #0x13]
    // 0x7005a8: r17 = "]."
    //     0x7005a8: add             x17, PP, #0x10, lsl #12  ; [pp+0x10eb0] "]."
    //     0x7005ac: ldr             x17, [x17, #0xeb0]
    // 0x7005b0: ArrayStore: r0[0] = r17  ; List_4
    //     0x7005b0: stur            w17, [x0, #0x17]
    // 0x7005b4: ldur            x1, [fp, #-0x70]
    // 0x7005b8: r0 = "length must be in the range [0, 1073741823]."
    //     0x7005b8: add             x0, PP, #0x10, lsl #12  ; [pp+0x10dc0] "length must be in the range [0, 1073741823]."
    //     0x7005bc: ldr             x0, [x0, #0xdc0]
    // 0x7005c0: ArrayStore: r1[0] = r0  ; List_4
    //     0x7005c0: stur            w0, [x1, #0x17]
    // 0x7005c4: r0 = false
    //     0x7005c4: add             x0, NULL, #0x30  ; false
    // 0x7005c8: StoreField: r1->field_b = r0
    //     0x7005c8: stur            w0, [x1, #0xb]
    // 0x7005cc: mov             x0, x1
    // 0x7005d0: r0 = Throw()
    //     0x7005d0: bl              #0x74b258  ; ThrowStub
    // 0x7005d4: brk             #0
    // 0x7005d8: sub             SP, fp, #0x88
    // 0x7005dc: stur            x0, [fp, #-0x50]
    // 0x7005e0: stur            x1, [fp, #-0x58]
    // 0x7005e4: r16 = Instance_Sx
    //     0x7005e4: add             x16, PP, #0x11, lsl #12  ; [pp+0x11068] Obj!Sx@4302d1
    //     0x7005e8: ldr             x16, [x16, #0x68]
    // 0x7005ec: ldur            lr, [fp, #-0x40]
    // 0x7005f0: stp             lr, x16, [SP]
    // 0x7005f4: r0 = call 0x36a364
    //     0x7005f4: bl              #0x36a364
    // 0x7005f8: ldur            x0, [fp, #-0x50]
    // 0x7005fc: ldur            x1, [fp, #-0x58]
    // 0x700600: r0 = ReThrow()
    //     0x700600: bl              #0x74b234  ; ReThrowStub
    // 0x700604: brk             #0
    // 0x700608: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x700608: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x70060c: b               #0x700488
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x383368, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3833c4, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3811c8, size: -0x1
  }
  [closure] String <anonymous closure>(dynamic, Qa<String, String>) {
    // ** addr: 0x381154, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x37f008, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic) {
    // ** addr: 0x3ad34c, size: -0x1
  }
  [closure] Future<void> hlf(dynamic, Da, {bool ilf}) {
    // ** addr: 0x3ad8a4, size: -0x1
  }
  [closure] Future<void> jlf(dynamic, double) {
    // ** addr: 0x3ad638, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic) {
    // ** addr: 0x3aacb8, size: -0x1
  }
  [closure] fIa <anonymous closure>(dynamic, Object?) {
    // ** addr: 0x6781c4, size: -0x1
  }
  [closure] lIa <anonymous closure>(dynamic, Map<String, Object?>) {
    // ** addr: 0x677fe8, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, YHa) {
    // ** addr: 0x6790ec, size: -0x1
  }
  [closure] void IRb(dynamic) {
    // ** addr: 0x46fd94, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, r) {
    // ** addr: 0x489148, size: -0x1
  }
}
