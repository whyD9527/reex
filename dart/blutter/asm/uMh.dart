// lib: , url: uMh

// class id: 1049377, size: 0x8
class :: {
}

// class id: 3503, size: 0x14, field offset: 0xc
//   const constructor, 
class _MLa extends et {

  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x4a25d4, size: -0x1
  }
  [closure] List<PNa<_LLa>> <anonymous closure>(dynamic, gha, sza) {
    // ** addr: 0x4a2624, size: -0x1
  }
}

// class id: 3504, size: 0xc, field offset: 0xc
//   const constructor, 
class KLa extends et {

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x71f150, size: 0x5c
    // 0x71f150: EnterFrame
    //     0x71f150: stp             fp, lr, [SP, #-0x10]!
    //     0x71f154: mov             fp, SP
    // 0x71f158: AllocStack(0x18)
    //     0x71f158: sub             SP, SP, #0x18
    // 0x71f15c: SetupParameters(KLa this /* r1 */)
    //     0x71f15c: stur            NULL, [fp, #-8]
    //     0x71f160: mov             x0, #0
    //     0x71f164: add             x1, fp, w0, sxtw #2
    //     0x71f168: ldr             x1, [x1, #0x10]
    //     0x71f16c: ldur            w2, [x1, #0x17]
    //     0x71f170: add             x2, x2, HEAP, lsl #32
    //     0x71f174: stur            x2, [fp, #-0x10]
    // 0x71f178: CheckStackOverflow
    //     0x71f178: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x71f17c: cmp             SP, x16
    //     0x71f180: b.ls            #0x71f1a4
    // 0x71f184: InitAsync() -> Future<void?>
    //     0x71f184: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x71f188: bl              #0x6cb614  ; InitAsyncStub
    // 0x71f18c: r16 = "https://mpv.io/manual/master/"
    //     0x71f18c: add             x16, PP, #0x27, lsl #12  ; [pp+0x27018] "https://mpv.io/manual/master/"
    //     0x71f190: ldr             x16, [x16, #0x18]
    // 0x71f194: str             x16, [SP]
    // 0x71f198: r0 = __unknown_function__()
    //     0x71f198: bl              #0x71f1ac  ; [] ::__unknown_function__
    // 0x71f19c: r0 = Null
    //     0x71f19c: mov             x0, NULL
    // 0x71f1a0: r0 = ReturnAsyncNotFuture()
    //     0x71f1a0: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x71f1a4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x71f1a4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x71f1a8: b               #0x71f184
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x4a23d0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x4a2368, size: -0x1
  }
  [closure] hna <anonymous closure>(dynamic, gha) {
    // ** addr: 0x4a1fe8, size: -0x1
  }
  [closure] _MLa <anonymous closure>(dynamic, gha, int) {
    // ** addr: 0x4a21e8, size: -0x1
  }
}

// class id: 4726, size: 0x14, field offset: 0x14
enum _LLa extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
