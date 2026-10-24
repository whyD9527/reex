// lib: , url: EKh

// class id: 1049286, size: 0x8
class :: {

  [closure] static Future<Null> <anonymous closure>(dynamic) async {
    // ** addr: 0x6fe78c, size: 0xc4
    // 0x6fe78c: EnterFrame
    //     0x6fe78c: stp             fp, lr, [SP, #-0x10]!
    //     0x6fe790: mov             fp, SP
    // 0x6fe794: AllocStack(0x30)
    //     0x6fe794: sub             SP, SP, #0x30
    // 0x6fe798: SetupParameters(dynamic _ /* r1 */)
    //     0x6fe798: stur            NULL, [fp, #-8]
    //     0x6fe79c: mov             x0, #0
    //     0x6fe7a0: add             x1, fp, w0, sxtw #2
    //     0x6fe7a4: ldr             x1, [x1, #0x10]
    //     0x6fe7a8: ldur            w2, [x1, #0x17]
    //     0x6fe7ac: add             x2, x2, HEAP, lsl #32
    //     0x6fe7b0: stur            x2, [fp, #-0x10]
    // 0x6fe7b4: CheckStackOverflow
    //     0x6fe7b4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6fe7b8: cmp             SP, x16
    //     0x6fe7bc: b.ls            #0x6fe848
    // 0x6fe7c0: InitAsync() -> Future<Null?>
    //     0x6fe7c0: ldr             x0, [PP, #0xe28]  ; [pp+0xe28] TypeArguments: <Null?>
    //     0x6fe7c4: bl              #0x6cb614  ; InitAsyncStub
    // 0x6fe7c8: ldur            x0, [fp, #-0x10]
    // 0x6fe7cc: LoadField: r1 = r0->field_f
    //     0x6fe7cc: ldur            w1, [x0, #0xf]
    // 0x6fe7d0: DecompressPointer r1
    //     0x6fe7d0: add             x1, x1, HEAP, lsl #32
    // 0x6fe7d4: stur            x1, [fp, #-0x18]
    // 0x6fe7d8: r16 = true
    //     0x6fe7d8: add             x16, NULL, #0x20  ; true
    // 0x6fe7dc: stp             x16, x1, [SP]
    // 0x6fe7e0: r0 = call 0x3743c8
    //     0x6fe7e0: bl              #0x3743c8
    // 0x6fe7e4: ldur            x0, [fp, #-0x10]
    // 0x6fe7e8: LoadField: r1 = r0->field_13
    //     0x6fe7e8: ldur            w1, [x0, #0x13]
    // 0x6fe7ec: DecompressPointer r1
    //     0x6fe7ec: add             x1, x1, HEAP, lsl #32
    // 0x6fe7f0: r0 = LoadClassIdInstr(r1)
    //     0x6fe7f0: ldur            x0, [x1, #-1]
    //     0x6fe7f4: ubfx            x0, x0, #0xc, #0x14
    // 0x6fe7f8: str             x1, [SP]
    // 0x6fe7fc: r0 = GDT[cid_x0 + -0xee6]()
    //     0x6fe7fc: sub             lr, x0, #0xee6
    //     0x6fe800: ldr             lr, [x21, lr, lsl #3]
    //     0x6fe804: blr             lr
    // 0x6fe808: r1 = LoadClassIdInstr(r0)
    //     0x6fe808: ldur            x1, [x0, #-1]
    //     0x6fe80c: ubfx            x1, x1, #0xc, #0x14
    // 0x6fe810: str             x0, [SP]
    // 0x6fe814: mov             x0, x1
    // 0x6fe818: r4 = const [0, 0x1, 0x1, 0x1, null]
    //     0x6fe818: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    // 0x6fe81c: r0 = GDT[cid_x0 + -0xf8f]()
    //     0x6fe81c: sub             lr, x0, #0xf8f
    //     0x6fe820: ldr             lr, [x21, lr, lsl #3]
    //     0x6fe824: blr             lr
    // 0x6fe828: ldur            x16, [fp, #-0x18]
    // 0x6fe82c: stp             x0, x16, [SP, #8]
    // 0x6fe830: r16 = true
    //     0x6fe830: add             x16, NULL, #0x20  ; true
    // 0x6fe834: str             x16, [SP]
    // 0x6fe838: r4 = const [0, 0x3, 0x3, 0x3, null]
    //     0x6fe838: ldr             x4, [PP, #0x258]  ; [pp+0x258] List(5) [0, 0x3, 0x3, 0x3, Null]
    // 0x6fe83c: r0 = __unknown_function__()
    //     0x6fe83c: bl              #0x6edfc0  ; [] ::__unknown_function__
    // 0x6fe840: r0 = Null
    //     0x6fe840: mov             x0, NULL
    // 0x6fe844: r0 = ReturnAsyncNotFuture()
    //     0x6fe844: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x6fe848: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6fe848: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6fe84c: b               #0x6fe7c0
  }
  [closure] static bool <anonymous closure>(dynamic) {
    // ** addr: 0x3a784c, size: -0x1
  }
  [closure] static Null <anonymous closure>(dynamic, Tya) {
    // ** addr: 0x3aaad4, size: -0x1
  }
  [closure] static Null <anonymous closure>(dynamic) {
    // ** addr: 0x3a7938, size: -0x1
  }
}

// class id: 1191, size: 0x3c, field offset: 0x38
abstract class _nFa extends oFa<dynamic> {
}

// class id: 1192, size: 0x3c, field offset: 0x3c
abstract class _xFa extends _nFa {
}

// class id: 1193, size: 0x3c, field offset: 0x3c
abstract class _vFa extends _nFa
    implements fFa {
}

// class id: 1194, size: 0x3c, field offset: 0x3c
abstract class _tFa extends _nFa {
}

// class id: 1195, size: 0x48, field offset: 0x3c
//   transformed mixin,
abstract class _qFa extends _nFa
     with _rFa {

  [closure] Future<void> <anonymous closure>(dynamic, bool) async {
    // ** addr: 0x700ac0, size: 0x90
    // 0x700ac0: EnterFrame
    //     0x700ac0: stp             fp, lr, [SP, #-0x10]!
    //     0x700ac4: mov             fp, SP
    // 0x700ac8: AllocStack(0x20)
    //     0x700ac8: sub             SP, SP, #0x20
    // 0x700acc: SetupParameters(_qFa this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0x700acc: stur            NULL, [fp, #-8]
    //     0x700ad0: mov             x0, #0
    //     0x700ad4: add             x1, fp, w0, sxtw #2
    //     0x700ad8: ldr             x1, [x1, #0x18]
    //     0x700adc: add             x2, fp, w0, sxtw #2
    //     0x700ae0: ldr             x2, [x2, #0x10]
    //     0x700ae4: stur            x2, [fp, #-0x18]
    //     0x700ae8: ldur            w3, [x1, #0x17]
    //     0x700aec: add             x3, x3, HEAP, lsl #32
    //     0x700af0: stur            x3, [fp, #-0x10]
    // 0x700af4: CheckStackOverflow
    //     0x700af4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x700af8: cmp             SP, x16
    //     0x700afc: b.ls            #0x700b48
    // 0x700b00: InitAsync() -> Future<void?>
    //     0x700b00: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x700b04: bl              #0x6cb614  ; InitAsyncStub
    // 0x700b08: ldur            x0, [fp, #-0x10]
    // 0x700b0c: LoadField: r1 = r0->field_f
    //     0x700b0c: ldur            w1, [x0, #0xf]
    // 0x700b10: DecompressPointer r1
    //     0x700b10: add             x1, x1, HEAP, lsl #32
    // 0x700b14: LoadField: r2 = r1->field_3b
    //     0x700b14: ldur            w2, [x1, #0x3b]
    // 0x700b18: DecompressPointer r2
    //     0x700b18: add             x2, x2, HEAP, lsl #32
    // 0x700b1c: tbz             w2, #4, #0x700b28
    // 0x700b20: str             NULL, [SP]
    // 0x700b24: r0 = __unknown_function__()
    //     0x700b24: bl              #0x700a10  ; [] ::__unknown_function__
    // 0x700b28: ldur            x0, [fp, #-0x18]
    // 0x700b2c: tbnz            w0, #4, #0x700b40
    // 0x700b30: r0 = __unknown_function__()
    //     0x700b30: bl              #0x700b50  ; [] ::__unknown_function__
    // 0x700b34: mov             x1, x0
    // 0x700b38: stur            x1, [fp, #-0x18]
    // 0x700b3c: r0 = Await()
    //     0x700b3c: bl              #0x6cdaec  ; AwaitStub
    // 0x700b40: r0 = Null
    //     0x700b40: mov             x0, NULL
    // 0x700b44: r0 = ReturnAsyncNotFuture()
    //     0x700b44: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x700b48: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x700b48: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x700b4c: b               #0x700b00
  }
}

// class id: 1196, size: 0x54, field offset: 0x48
//   transformed mixin,
abstract class _sFa extends _qFa
     with _tFa {

  [closure] bool _Fvf(dynamic, Gaa) {
    // ** addr: 0x3adf60, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3af298, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3af5c4, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3af730, size: -0x1
  }
}

// class id: 1197, size: 0x6c, field offset: 0x54
//   transformed mixin,
abstract class _uFa extends _sFa
     with _vFa {

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x744264, size: 0xfc
    // 0x744264: EnterFrame
    //     0x744264: stp             fp, lr, [SP, #-0x10]!
    //     0x744268: mov             fp, SP
    // 0x74426c: AllocStack(0x30)
    //     0x74426c: sub             SP, SP, #0x30
    // 0x744270: SetupParameters(_uFa this /* r1 */)
    //     0x744270: stur            NULL, [fp, #-8]
    //     0x744274: mov             x0, #0
    //     0x744278: add             x1, fp, w0, sxtw #2
    //     0x74427c: ldr             x1, [x1, #0x10]
    //     0x744280: ldur            w2, [x1, #0x17]
    //     0x744284: add             x2, x2, HEAP, lsl #32
    //     0x744288: stur            x2, [fp, #-0x10]
    // 0x74428c: CheckStackOverflow
    //     0x74428c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x744290: cmp             SP, x16
    //     0x744294: b.ls            #0x74434c
    // 0x744298: InitAsync() -> Future<void?>
    //     0x744298: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x74429c: bl              #0x6cb614  ; InitAsyncStub
    // 0x7442a0: ldur            x0, [fp, #-0x10]
    // 0x7442a4: LoadField: r1 = r0->field_f
    //     0x7442a4: ldur            w1, [x0, #0xf]
    // 0x7442a8: DecompressPointer r1
    //     0x7442a8: add             x1, x1, HEAP, lsl #32
    // 0x7442ac: str             x1, [SP]
    // 0x7442b0: r0 = __unknown_function__()
    //     0x7442b0: bl              #0x6fd19c  ; [] ::__unknown_function__
    // 0x7442b4: mov             x1, x0
    // 0x7442b8: stur            x1, [fp, #-0x18]
    // 0x7442bc: r0 = Await()
    //     0x7442bc: bl              #0x6cdaec  ; AwaitStub
    // 0x7442c0: ldur            x0, [fp, #-0x10]
    // 0x7442c4: LoadField: r1 = r0->field_f
    //     0x7442c4: ldur            w1, [x0, #0xf]
    // 0x7442c8: DecompressPointer r1
    //     0x7442c8: add             x1, x1, HEAP, lsl #32
    // 0x7442cc: LoadField: r2 = r1->field_2f
    //     0x7442cc: ldur            w2, [x1, #0x2f]
    // 0x7442d0: DecompressPointer r2
    //     0x7442d0: add             x2, x2, HEAP, lsl #32
    // 0x7442d4: cmp             w2, NULL
    // 0x7442d8: b.eq            #0x7442e4
    // 0x7442dc: stp             x2, x1, [SP]
    // 0x7442e0: r0 = call 0x48f9f0
    //     0x7442e0: bl              #0x48f9f0
    // 0x7442e4: ldur            x0, [fp, #-0x10]
    // 0x7442e8: LoadField: r1 = r0->field_f
    //     0x7442e8: ldur            w1, [x0, #0xf]
    // 0x7442ec: DecompressPointer r1
    //     0x7442ec: add             x1, x1, HEAP, lsl #32
    // 0x7442f0: LoadField: r2 = r1->field_27
    //     0x7442f0: ldur            w2, [x1, #0x27]
    // 0x7442f4: DecompressPointer r2
    //     0x7442f4: add             x2, x2, HEAP, lsl #32
    // 0x7442f8: cmp             w2, NULL
    // 0x7442fc: b.eq            #0x744354
    // 0x744300: LoadField: r3 = r2->field_47
    //     0x744300: ldur            w3, [x2, #0x47]
    // 0x744304: DecompressPointer r3
    //     0x744304: add             x3, x3, HEAP, lsl #32
    // 0x744308: cmp             w3, NULL
    // 0x74430c: b.eq            #0x744358
    // 0x744310: LoadField: r2 = r1->field_5f
    //     0x744310: ldur            w2, [x1, #0x5f]
    // 0x744314: DecompressPointer r2
    //     0x744314: add             x2, x2, HEAP, lsl #32
    // 0x744318: cmp             w2, NULL
    // 0x74431c: b.eq            #0x74435c
    // 0x744320: r16 = "vo"
    //     0x744320: add             x16, PP, #0x12, lsl #12  ; [pp+0x12028] "vo"
    //     0x744324: ldr             x16, [x16, #0x28]
    // 0x744328: stp             x16, x3, [SP, #8]
    // 0x74432c: str             x2, [SP]
    // 0x744330: r0 = call 0x37ea78
    //     0x744330: bl              #0x37ea78
    // 0x744334: ldur            x1, [fp, #-0x10]
    // 0x744338: LoadField: r2 = r1->field_f
    //     0x744338: ldur            w2, [x1, #0xf]
    // 0x74433c: DecompressPointer r2
    //     0x74433c: add             x2, x2, HEAP, lsl #32
    // 0x744340: StoreField: r2->field_5f = rNULL
    //     0x744340: stur            NULL, [x2, #0x5f]
    // 0x744344: r0 = Null
    //     0x744344: mov             x0, NULL
    // 0x744348: r0 = ReturnAsyncNotFuture()
    //     0x744348: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x74434c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x74434c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x744350: b               #0x744298
    // 0x744354: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x744354: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
    // 0x744358: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x744358: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
    // 0x74435c: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x74435c: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x744488, size: 0xdc
    // 0x744488: EnterFrame
    //     0x744488: stp             fp, lr, [SP, #-0x10]!
    //     0x74448c: mov             fp, SP
    // 0x744490: AllocStack(0x30)
    //     0x744490: sub             SP, SP, #0x30
    // 0x744494: SetupParameters(_uFa this /* r1 */)
    //     0x744494: stur            NULL, [fp, #-8]
    //     0x744498: mov             x0, #0
    //     0x74449c: add             x1, fp, w0, sxtw #2
    //     0x7444a0: ldr             x1, [x1, #0x10]
    //     0x7444a4: ldur            w2, [x1, #0x17]
    //     0x7444a8: add             x2, x2, HEAP, lsl #32
    //     0x7444ac: stur            x2, [fp, #-0x10]
    // 0x7444b0: CheckStackOverflow
    //     0x7444b0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x7444b4: cmp             SP, x16
    //     0x7444b8: b.ls            #0x744550
    // 0x7444bc: InitAsync() -> Future<void?>
    //     0x7444bc: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x7444c0: bl              #0x6cb614  ; InitAsyncStub
    // 0x7444c4: ldur            x0, [fp, #-0x10]
    // 0x7444c8: LoadField: r1 = r0->field_f
    //     0x7444c8: ldur            w1, [x0, #0xf]
    // 0x7444cc: DecompressPointer r1
    //     0x7444cc: add             x1, x1, HEAP, lsl #32
    // 0x7444d0: LoadField: r2 = r0->field_13
    //     0x7444d0: ldur            w2, [x0, #0x13]
    // 0x7444d4: DecompressPointer r2
    //     0x7444d4: add             x2, x2, HEAP, lsl #32
    // 0x7444d8: r3 = LoadInt32Instr(r2)
    //     0x7444d8: sbfx            x3, x2, #1, #0x1f
    //     0x7444dc: tbz             w2, #0, #0x7444e4
    //     0x7444e0: ldur            x3, [x2, #7]
    // 0x7444e4: stp             x3, x1, [SP]
    // 0x7444e8: r0 = call 0x3a618c
    //     0x7444e8: bl              #0x3a618c
    // 0x7444ec: mov             x1, x0
    // 0x7444f0: stur            x1, [fp, #-0x18]
    // 0x7444f4: r0 = Await()
    //     0x7444f4: bl              #0x6cdaec  ; AwaitStub
    // 0x7444f8: ldur            x0, [fp, #-0x10]
    // 0x7444fc: LoadField: r1 = r0->field_f
    //     0x7444fc: ldur            w1, [x0, #0xf]
    // 0x744500: DecompressPointer r1
    //     0x744500: add             x1, x1, HEAP, lsl #32
    // 0x744504: LoadField: r0 = r1->field_27
    //     0x744504: ldur            w0, [x1, #0x27]
    // 0x744508: DecompressPointer r0
    //     0x744508: add             x0, x0, HEAP, lsl #32
    // 0x74450c: cmp             w0, NULL
    // 0x744510: b.eq            #0x744558
    // 0x744514: LoadField: r2 = r0->field_47
    //     0x744514: ldur            w2, [x0, #0x47]
    // 0x744518: DecompressPointer r2
    //     0x744518: add             x2, x2, HEAP, lsl #32
    // 0x74451c: cmp             w2, NULL
    // 0x744520: b.eq            #0x74455c
    // 0x744524: LoadField: r0 = r1->field_5f
    //     0x744524: ldur            w0, [x1, #0x5f]
    // 0x744528: DecompressPointer r0
    //     0x744528: add             x0, x0, HEAP, lsl #32
    // 0x74452c: cmp             w0, NULL
    // 0x744530: b.eq            #0x744560
    // 0x744534: r16 = "vo"
    //     0x744534: add             x16, PP, #0x12, lsl #12  ; [pp+0x12028] "vo"
    //     0x744538: ldr             x16, [x16, #0x28]
    // 0x74453c: stp             x16, x2, [SP, #8]
    // 0x744540: str             x0, [SP]
    // 0x744544: r0 = call 0x37ea78
    //     0x744544: bl              #0x37ea78
    // 0x744548: r0 = Null
    //     0x744548: mov             x0, NULL
    // 0x74454c: r0 = ReturnAsyncNotFuture()
    //     0x74454c: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x744550: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x744550: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x744554: b               #0x7444bc
    // 0x744558: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x744558: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
    // 0x74455c: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x74455c: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
    // 0x744560: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x744560: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
  }
  [closure] void _ovf(dynamic, bool) {
    // ** addr: 0x690d98, size: -0x1
  }
  [closure] void _nvf(dynamic, dFa) {
    // ** addr: 0x690c54, size: -0x1
  }
}

// class id: 1198, size: 0x70, field offset: 0x6c
//   transformed mixin,
abstract class _wFa extends _uFa
     with _xFa {

  [closure] Null <anonymous closure>(dynamic, SEa?) {
    // ** addr: 0x3ac690, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3ad9b0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3ad94c, size: -0x1
  }
}

// class id: 1199, size: 0x7c, field offset: 0x70
//   transformed mixin,
abstract class _yFa extends _wFa
     with zFa<X0 bound rHa> {

  late final EHa _Yuf; // offset: 0x78
  late final zAa<Rp> _Xuf; // offset: 0x74

  [closure] Null <anonymous closure>(dynamic, zAa<Rp>) {
    // ** addr: 0x46994c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, pBa) {
    // ** addr: 0x3a65fc, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, (zAa<Rp>, pBa)) {
    // ** addr: 0x3a66b0, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, (File, zAa<Rp>)) {
    // ** addr: 0x3a62c0, size: -0x1
  }
  EHa _Yuf(_yFa) {
    // ** addr: 0x3a659c, size: -0x1
  }
}

// class id: 1200, size: 0x8c, field offset: 0x7c
class AFa extends _yFa {

  [closure] static Uint8List <anonymous closure>(dynamic) {
    // ** addr: 0x701234, size: 0xac
    // 0x701234: EnterFrame
    //     0x701234: stp             fp, lr, [SP, #-0x10]!
    //     0x701238: mov             fp, SP
    // 0x70123c: AllocStack(0x58)
    //     0x70123c: sub             SP, SP, #0x58
    // 0x701240: SetupParameters([dynamic _ /* r0 */])
    //     0x701240: ldr             x0, [fp, #0x10]
    //     0x701244: ldur            w1, [x0, #0x17]
    //     0x701248: add             x1, x1, HEAP, lsl #32
    //     0x70124c: stur            x1, [fp, #-0x40]
    // 0x701250: CheckStackOverflow
    //     0x701250: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x701254: cmp             SP, x16
    //     0x701258: b.ls            #0x7012d8
    // 0x70125c: LoadField: r0 = r1->field_f
    //     0x70125c: ldur            w0, [x1, #0xf]
    // 0x701260: DecompressPointer r0
    //     0x701260: add             x0, x0, HEAP, lsl #32
    // 0x701264: stur            x0, [fp, #-0x38]
    // 0x701268: LoadField: r2 = r1->field_13
    //     0x701268: ldur            w2, [x1, #0x13]
    // 0x70126c: DecompressPointer r2
    //     0x70126c: add             x2, x2, HEAP, lsl #32
    // 0x701270: r3 = LoadInt32Instr(r0)
    //     0x701270: sbfx            x3, x0, #1, #0x1f
    //     0x701274: tbz             w0, #0, #0x70127c
    //     0x701278: ldur            x3, [x0, #7]
    // 0x70127c: stp             x2, x3, [SP]
    // 0x701280: r0 = call 0x3aebe8
    //     0x701280: bl              #0x3aebe8
    // 0x701284: ldur            x0, [fp, #-0x40]
    // 0x701288: LoadField: r1 = r0->field_13
    //     0x701288: ldur            w1, [x0, #0x13]
    // 0x70128c: DecompressPointer r1
    //     0x70128c: add             x1, x1, HEAP, lsl #32
    // 0x701290: stur            x1, [fp, #-0x48]
    // 0x701294: ldur            x16, [fp, #-0x38]
    // 0x701298: str             x16, [SP]
    // 0x70129c: r0 = call 0x3aea78
    //     0x70129c: bl              #0x3aea78
    // 0x7012a0: ldur            x0, [fp, #-0x48]
    // 0x7012a4: LeaveFrame
    //     0x7012a4: mov             SP, fp
    //     0x7012a8: ldp             fp, lr, [SP], #0x10
    // 0x7012ac: ret
    //     0x7012ac: ret             
    // 0x7012b0: sub             SP, fp, #0x58
    // 0x7012b4: stur            x0, [fp, #-0x38]
    // 0x7012b8: stur            x1, [fp, #-0x40]
    // 0x7012bc: ldur            x16, [fp, #-0x30]
    // 0x7012c0: str             x16, [SP]
    // 0x7012c4: r0 = call 0x3aea78
    //     0x7012c4: bl              #0x3aea78
    // 0x7012c8: ldur            x0, [fp, #-0x38]
    // 0x7012cc: ldur            x1, [fp, #-0x40]
    // 0x7012d0: r0 = ReThrow()
    //     0x7012d0: bl              #0x74b234  ; ReThrowStub
    // 0x7012d4: brk             #0
    // 0x7012d8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7012d8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7012dc: b               #0x70125c
  }
  [closure] void _ywf(dynamic, PEa) {
    // ** addr: 0x3a6b50, size: -0x1
  }
  [closure] void _zwf(dynamic, bool) {
    // ** addr: 0x3a6a90, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3a5df8, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3a5b9c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3a5b78, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3a5b18, size: -0x1
  }
}

// class id: 1201, size: 0x3c, field offset: 0x3c
abstract class _rFa extends _nFa {
}
