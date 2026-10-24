// lib: , url: OKh

// class id: 1049295, size: 0x8
class :: {
}

// class id: 2744, size: 0x1c, field offset: 0x14
class _VFa extends nt<dynamic> {

  [closure] (Da, Da, oIa?) <anonymous closure>(dynamic, YDa) {
    // ** addr: 0x42a6b8, size: -0x1
  }
  [closure] eHa <anonymous closure>(dynamic, lIa) {
    // ** addr: 0x42a5e8, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, double) {
    // ** addr: 0x42a434, size: -0x1
  }
  [closure] void _qAf(dynamic, double) {
    // ** addr: 0x42a410, size: -0x1
  }
  [closure] void _rAf(dynamic, double) {
    // ** addr: 0x42a3ac, size: -0x1
  }
  [closure] hHa <anonymous closure>(dynamic, gha, bool, eB?) {
    // ** addr: 0x42a1ac, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic) {
    // ** addr: 0x42a2dc, size: -0x1
  }
}

// class id: 2745, size: 0x1c, field offset: 0x14
class _TFa extends nt<dynamic> {

  late String mAf; // offset: 0x18
  late final r Knb; // offset: 0x14

  [closure] void IRb(dynamic) {
    // ** addr: 0x3c5df0, size: -0x1
  }
  [closure] void oAf(dynamic, r) {
    // ** addr: 0x39efd0, size: -0x1
  }
}

// class id: 2746, size: 0x1c, field offset: 0x14
class _OFa extends nt<dynamic> {

  late final MJa _lAf; // offset: 0x18

  [closure] void <anonymous closure>(dynamic, RD) {
    // ** addr: 0x429664, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, bE) {
    // ** addr: 0x429618, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x39ebc4, size: -0x1
  }
  [closure] void IRb(dynamic) {
    // ** addr: 0x3c5d90, size: -0x1
  }
}

// class id: 3279, size: 0xc, field offset: 0xc
class _UFa extends kt {
}

// class id: 3280, size: 0xc, field offset: 0xc
//   const constructor, 
class _SFa extends kt {
}

// class id: 3281, size: 0xc, field offset: 0xc
//   const constructor, 
class NFa extends kt {
}

// class id: 3591, size: 0xc, field offset: 0xc
class _ZFa extends et {

  [closure] dda <anonymous closure>(dynamic, gha) {
    // ** addr: 0x486574, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x486510, size: -0x1
  }
}

// class id: 3592, size: 0xc, field offset: 0xc
class _YFa extends et {

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x71b768, size: 0xc0
    // 0x71b768: EnterFrame
    //     0x71b768: stp             fp, lr, [SP, #-0x10]!
    //     0x71b76c: mov             fp, SP
    // 0x71b770: AllocStack(0x28)
    //     0x71b770: sub             SP, SP, #0x28
    // 0x71b774: SetupParameters(_YFa this /* r1 */)
    //     0x71b774: stur            NULL, [fp, #-8]
    //     0x71b778: mov             x0, #0
    //     0x71b77c: add             x1, fp, w0, sxtw #2
    //     0x71b780: ldr             x1, [x1, #0x10]
    //     0x71b784: ldur            w2, [x1, #0x17]
    //     0x71b788: add             x2, x2, HEAP, lsl #32
    //     0x71b78c: stur            x2, [fp, #-0x10]
    // 0x71b790: CheckStackOverflow
    //     0x71b790: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x71b794: cmp             SP, x16
    //     0x71b798: b.ls            #0x71b820
    // 0x71b79c: InitAsync() -> Future<void?>
    //     0x71b79c: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x71b7a0: bl              #0x6cb614  ; InitAsyncStub
    // 0x71b7a4: ldur            x0, [fp, #-0x10]
    // 0x71b7a8: LoadField: r1 = r0->field_f
    //     0x71b7a8: ldur            w1, [x0, #0xf]
    // 0x71b7ac: DecompressPointer r1
    //     0x71b7ac: add             x1, x1, HEAP, lsl #32
    // 0x71b7b0: str             x1, [SP]
    // 0x71b7b4: r0 = call 0x39de6c
    //     0x71b7b4: bl              #0x39de6c
    // 0x71b7b8: mov             x1, x0
    // 0x71b7bc: ldur            x0, [fp, #-0x10]
    // 0x71b7c0: stur            x1, [fp, #-0x18]
    // 0x71b7c4: LoadField: r2 = r0->field_13
    //     0x71b7c4: ldur            w2, [x0, #0x13]
    // 0x71b7c8: DecompressPointer r2
    //     0x71b7c8: add             x2, x2, HEAP, lsl #32
    // 0x71b7cc: tbnz            w2, #4, #0x71b7dc
    // 0x71b7d0: r0 = Instance__XIa
    //     0x71b7d0: add             x0, PP, #0x18, lsl #12  ; [pp+0x189c8] Obj!_XIa@4233d1
    //     0x71b7d4: ldr             x0, [x0, #0x9c8]
    // 0x71b7d8: b               #0x71b80c
    // 0x71b7dc: LoadField: r0 = r1->field_27
    //     0x71b7dc: ldur            w0, [x1, #0x27]
    // 0x71b7e0: DecompressPointer r0
    //     0x71b7e0: add             x0, x0, HEAP, lsl #32
    // 0x71b7e4: LoadField: r2 = r0->field_27
    //     0x71b7e4: ldur            w2, [x0, #0x27]
    // 0x71b7e8: DecompressPointer r2
    //     0x71b7e8: add             x2, x2, HEAP, lsl #32
    // 0x71b7ec: stur            x2, [fp, #-0x10]
    // 0x71b7f0: r0 = _XIa()
    //     0x71b7f0: bl              #0x71b744  ; Allocate_XIaStub -> _XIa (size=0x10)
    // 0x71b7f4: mov             x1, x0
    // 0x71b7f8: r0 = Instance_Da
    //     0x71b7f8: ldr             x0, [PP, #0x2018]  ; [pp+0x2018] Obj!Da@43a7f1
    // 0x71b7fc: StoreField: r1->field_7 = r0
    //     0x71b7fc: stur            w0, [x1, #7]
    // 0x71b800: ldur            x0, [fp, #-0x10]
    // 0x71b804: StoreField: r1->field_b = r0
    //     0x71b804: stur            w0, [x1, #0xb]
    // 0x71b808: mov             x0, x1
    // 0x71b80c: ldur            x16, [fp, #-0x18]
    // 0x71b810: stp             x0, x16, [SP]
    // 0x71b814: r0 = __unknown_function__()
    //     0x71b814: bl              #0x71b5b8  ; [] ::__unknown_function__
    // 0x71b818: r0 = Null
    //     0x71b818: mov             x0, NULL
    // 0x71b81c: r0 = ReturnAsyncNotFuture()
    //     0x71b81c: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x71b820: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x71b820: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x71b824: b               #0x71b79c
  }
  [closure] Null <anonymous closure>(dynamic) {
    // ** addr: 0x4863dc, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic) {
    // ** addr: 0x486380, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic) {
    // ** addr: 0x48623c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x4861e0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x486184, size: -0x1
  }
  [closure] PGa <anonymous closure>(dynamic, gha) {
    // ** addr: 0x486078, size: -0x1
  }
  [closure] Zw <anonymous closure>(dynamic, gha) {
    // ** addr: 0x485c20, size: -0x1
  }
  [closure] Zw <anonymous closure>(dynamic, gha) {
    // ** addr: 0x4857e4, size: -0x1
  }
  [closure] List<fIa> <anonymous closure>(dynamic, YDa) {
    // ** addr: 0x485bc4, size: -0x1
  }
  [closure] (bool, bool) <anonymous closure>(dynamic, YDa) {
    // ** addr: 0x486018, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, YDa) {
    // ** addr: 0x486144, size: -0x1
  }
  [closure] GFa <anonymous closure>(dynamic, gha) {
    // ** addr: 0x486470, size: -0x1
  }
}

// class id: 3593, size: 0xc, field offset: 0xc
//   const constructor, 
class _XFa extends et {
}

// class id: 3594, size: 0x1c, field offset: 0xc
//   const constructor, 
class _WFa extends et {

  [closure] iIa <anonymous closure>(dynamic, YDa) {
    // ** addr: 0x48515c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, KP) {
    // ** addr: 0x484ff0, size: -0x1
  }
}

// class id: 3595, size: 0xc, field offset: 0xc
class _RFa extends et {

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x71b4e4, size: 0xc8
    // 0x71b4e4: EnterFrame
    //     0x71b4e4: stp             fp, lr, [SP, #-0x10]!
    //     0x71b4e8: mov             fp, SP
    // 0x71b4ec: AllocStack(0x28)
    //     0x71b4ec: sub             SP, SP, #0x28
    // 0x71b4f0: SetupParameters(_RFa this /* r1 */)
    //     0x71b4f0: stur            NULL, [fp, #-8]
    //     0x71b4f4: mov             x0, #0
    //     0x71b4f8: add             x1, fp, w0, sxtw #2
    //     0x71b4fc: ldr             x1, [x1, #0x10]
    //     0x71b500: ldur            w2, [x1, #0x17]
    //     0x71b504: add             x2, x2, HEAP, lsl #32
    //     0x71b508: stur            x2, [fp, #-0x10]
    // 0x71b50c: CheckStackOverflow
    //     0x71b50c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x71b510: cmp             SP, x16
    //     0x71b514: b.ls            #0x71b5a4
    // 0x71b518: InitAsync() -> Future<void?>
    //     0x71b518: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x71b51c: bl              #0x6cb614  ; InitAsyncStub
    // 0x71b520: ldur            x0, [fp, #-0x10]
    // 0x71b524: LoadField: r1 = r0->field_f
    //     0x71b524: ldur            w1, [x0, #0xf]
    // 0x71b528: DecompressPointer r1
    //     0x71b528: add             x1, x1, HEAP, lsl #32
    // 0x71b52c: r16 = <rHa>
    //     0x71b52c: add             x16, PP, #0x10, lsl #12  ; [pp+0x10bb0] TypeArguments: <rHa>
    //     0x71b530: ldr             x16, [x16, #0xbb0]
    // 0x71b534: stp             x1, x16, [SP]
    // 0x71b538: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x71b538: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x71b53c: r0 = call 0x39deb0
    //     0x71b53c: bl              #0x39deb0
    // 0x71b540: LoadField: r1 = r0->field_37
    //     0x71b540: ldur            w1, [x0, #0x37]
    // 0x71b544: DecompressPointer r1
    //     0x71b544: add             x1, x1, HEAP, lsl #32
    // 0x71b548: str             x1, [SP]
    // 0x71b54c: r0 = __unknown_function__()
    //     0x71b54c: bl              #0x709908  ; [] ::__unknown_function__
    // 0x71b550: mov             x1, x0
    // 0x71b554: stur            x1, [fp, #-0x18]
    // 0x71b558: r0 = Await()
    //     0x71b558: bl              #0x6cdaec  ; AwaitStub
    // 0x71b55c: ldur            x0, [fp, #-0x10]
    // 0x71b560: LoadField: r1 = r0->field_f
    //     0x71b560: ldur            w1, [x0, #0xf]
    // 0x71b564: DecompressPointer r1
    //     0x71b564: add             x1, x1, HEAP, lsl #32
    // 0x71b568: ArrayLoad: r0 = r1[0]  ; List_4
    //     0x71b568: ldur            w0, [x1, #0x17]
    // 0x71b56c: DecompressPointer r0
    //     0x71b56c: add             x0, x0, HEAP, lsl #32
    // 0x71b570: cmp             w0, NULL
    // 0x71b574: b.eq            #0x71b59c
    // 0x71b578: r16 = true
    //     0x71b578: add             x16, NULL, #0x20  ; true
    // 0x71b57c: stp             x16, x1, [SP]
    // 0x71b580: r4 = const [0, 0x2, 0x2, 0x1, qfd, 0x1, null]
    //     0x71b580: add             x4, PP, #0x10, lsl #12  ; [pp+0x100c0] List(7) [0, 0x2, 0x2, 0x1, "qfd", 0x1, Null]
    //     0x71b584: ldr             x4, [x4, #0xc0]
    // 0x71b588: r0 = call 0x390658
    //     0x71b588: bl              #0x390658
    // 0x71b58c: r16 = <Object?>
    //     0x71b58c: ldr             x16, [PP, #0x180]  ; [pp+0x180] TypeArguments: <Object?>
    // 0x71b590: stp             x0, x16, [SP]
    // 0x71b594: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x71b594: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x71b598: r0 = __unknown_function__()
    //     0x71b598: bl              #0x6e7f80  ; [] ::__unknown_function__
    // 0x71b59c: r0 = Null
    //     0x71b59c: mov             x0, NULL
    // 0x71b5a0: r0 = ReturnAsyncNotFuture()
    //     0x71b5a0: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x71b5a4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x71b5a4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x71b5a8: b               #0x71b518
  }
  [closure] (VHa, bool) <anonymous closure>(dynamic, YDa) {
    // ** addr: 0x484c5c, size: -0x1
  }
  [closure] dda <anonymous closure>(dynamic, gha, bool, eB?) {
    // ** addr: 0x484a14, size: -0x1
  }
  [closure] Jpa <anonymous closure>(dynamic, gha) {
    // ** addr: 0x484924, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x4848c8, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x484828, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x484418, size: -0x1
  }
  [closure] iGa <anonymous closure>(dynamic, gha) {
    // ** addr: 0x48481c, size: -0x1
  }
  [closure] gGa <anonymous closure>(dynamic, gha) {
    // ** addr: 0x4848bc, size: -0x1
  }
  [closure] String? <anonymous closure>(dynamic, YDa) {
    // ** addr: 0x48499c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x484b90, size: -0x1
  }
}

// class id: 3596, size: 0xc, field offset: 0xc
//   const constructor, 
class _QFa extends et {

  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x483df0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x483d90, size: -0x1
  }
}

// class id: 3597, size: 0xc, field offset: 0xc
//   const constructor, 
class _PFa extends et {

  [closure] bool <anonymous closure>(dynamic, YDa) {
    // ** addr: 0x42a39c, size: -0x1
  }
  [closure] Jpa <anonymous closure>(dynamic, gha) {
    // ** addr: 0x483b70, size: -0x1
  }
  [closure] int <anonymous closure>(dynamic, YDa) {
    // ** addr: 0x483c00, size: -0x1
  }
}
