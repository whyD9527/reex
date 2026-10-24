// lib: , url: yNh

// class id: 1049429, size: 0x8
class :: {
}

// class id: 2757, size: 0x28, field offset: 0x18
//   transformed mixin,
abstract class _jOa extends xza<dynamic>
     with mKa<X0 bound lKa> {

  [closure] List<PNa<dynamic>> <anonymous closure>(dynamic, gha, sza) {
    // ** addr: 0x4235cc, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x42384c, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x422b88, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x422a84, size: -0x1
  }
  [closure] void IRb(dynamic) {
    // ** addr: 0x3c5bb0, size: -0x1
  }
  [closure] void _WDf(dynamic, DEa?) {
    // ** addr: 0x37d8c0, size: -0x1
  }
}

// class id: 2758, size: 0x28, field offset: 0x28
class _kOa extends _jOa {

  [closure] void XDf(dynamic) {
    // ** addr: 0x4238b0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x423584, size: -0x1
  }
}

// class id: 2759, size: 0x28, field offset: 0x18
//   transformed mixin,
abstract class _gOa extends xza<dynamic>
     with mKa<X0 bound lKa> {

  [closure] Future<(File?, CFa)?> <anonymous closure>(dynamic, (dynamic) => Future<(File?, CFa)>) async {
    // ** addr: 0x6ee280, size: 0x94
    // 0x6ee280: EnterFrame
    //     0x6ee280: stp             fp, lr, [SP, #-0x10]!
    //     0x6ee284: mov             fp, SP
    // 0x6ee288: AllocStack(0x20)
    //     0x6ee288: sub             SP, SP, #0x20
    // 0x6ee28c: SetupParameters(_gOa this /* r1 */, dynamic _ /* r2, fp-0x18 */)
    //     0x6ee28c: stur            NULL, [fp, #-8]
    //     0x6ee290: mov             x0, #0
    //     0x6ee294: add             x1, fp, w0, sxtw #2
    //     0x6ee298: ldr             x1, [x1, #0x18]
    //     0x6ee29c: add             x2, fp, w0, sxtw #2
    //     0x6ee2a0: ldr             x2, [x2, #0x10]
    //     0x6ee2a4: stur            x2, [fp, #-0x18]
    //     0x6ee2a8: ldur            w3, [x1, #0x17]
    //     0x6ee2ac: add             x3, x3, HEAP, lsl #32
    //     0x6ee2b0: stur            x3, [fp, #-0x10]
    // 0x6ee2b4: CheckStackOverflow
    //     0x6ee2b4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6ee2b8: cmp             SP, x16
    //     0x6ee2bc: b.ls            #0x6ee30c
    // 0x6ee2c0: InitAsync() -> Future<(File?, CFa)?>
    //     0x6ee2c0: add             x0, PP, #0x2d, lsl #12  ; [pp+0x2dd00] TypeArguments: <(File?, CFa)?>
    //     0x6ee2c4: ldr             x0, [x0, #0xd00]
    //     0x6ee2c8: bl              #0x6cb614  ; InitAsyncStub
    // 0x6ee2cc: ldur            x0, [fp, #-0x10]
    // 0x6ee2d0: LoadField: r1 = r0->field_f
    //     0x6ee2d0: ldur            w1, [x0, #0xf]
    // 0x6ee2d4: DecompressPointer r1
    //     0x6ee2d4: add             x1, x1, HEAP, lsl #32
    // 0x6ee2d8: LoadField: r0 = r1->field_f
    //     0x6ee2d8: ldur            w0, [x1, #0xf]
    // 0x6ee2dc: DecompressPointer r0
    //     0x6ee2dc: add             x0, x0, HEAP, lsl #32
    // 0x6ee2e0: cmp             w0, NULL
    // 0x6ee2e4: b.ne            #0x6ee2f0
    // 0x6ee2e8: r0 = Null
    //     0x6ee2e8: mov             x0, NULL
    // 0x6ee2ec: r0 = ReturnAsyncNotFuture()
    //     0x6ee2ec: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x6ee2f0: ldur            x16, [fp, #-0x18]
    // 0x6ee2f4: str             x16, [SP]
    // 0x6ee2f8: ldur            x0, [fp, #-0x18]
    // 0x6ee2fc: ClosureCall
    //     0x6ee2fc: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    //     0x6ee300: ldur            x2, [x0, #0x1f]
    //     0x6ee304: blr             x2
    // 0x6ee308: r0 = ReturnAsync()
    //     0x6ee308: b               #0x6ca270  ; ReturnAsyncStub
    // 0x6ee30c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6ee30c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6ee310: b               #0x6ee2c0
  }
  [closure] void IRb(dynamic) {
    // ** addr: 0x3c5b50, size: -0x1
  }
  [closure] void _WDf(dynamic, DEa?) {
    // ** addr: 0x37d5a8, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x37d65c, size: -0x1
  }
  [closure] Future<void> uHf(dynamic) {
    // ** addr: 0x422364, size: -0x1
  }
  [closure] List<PNa<dynamic>> <anonymous closure>(dynamic, gha, sza) {
    // ** addr: 0x422804, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x422cf8, size: -0x1
  }
}

// class id: 2760, size: 0x28, field offset: 0x28
class _hOa extends _gOa {

  [closure] void XDf(dynamic) {
    // ** addr: 0x422db8, size: -0x1
  }
}

// class id: 3293, size: 0x14, field offset: 0xc
//   const constructor, 
class iOa extends lKa {
}

// class id: 3294, size: 0x14, field offset: 0xc
//   const constructor, 
class fOa extends lKa {
}

// class id: 3456, size: 0x14, field offset: 0xc
//   const constructor, 
class _eOa extends et {
}

// class id: 3457, size: 0x10, field offset: 0xc
//   const constructor, 
class _dOa extends et {
}

// class id: 3458, size: 0x10, field offset: 0xc
//   const constructor, 
class _cOa extends et {
}
