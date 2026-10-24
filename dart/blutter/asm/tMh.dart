// lib: , url: TMh

// class id: 1049402, size: 0x8
class :: {
}

// class id: 492, size: 0x30, field offset: 0x8
class _OMa extends Object {

  void call(_OMa) {
    // ** addr: 0x740e50, size: 0x2b4
    // 0x740e50: EnterFrame
    //     0x740e50: stp             fp, lr, [SP, #-0x10]!
    //     0x740e54: mov             fp, SP
    // 0x740e58: AllocStack(0x50)
    //     0x740e58: sub             SP, SP, #0x50
    // 0x740e5c: CheckStackOverflow
    //     0x740e5c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x740e60: cmp             SP, x16
    //     0x740e64: b.ls            #0x7410d4
    // 0x740e68: ldr             x1, [fp, #0x10]
    // 0x740e6c: LoadField: r0 = r1->field_7
    //     0x740e6c: ldur            w0, [x1, #7]
    // 0x740e70: DecompressPointer r0
    //     0x740e70: add             x0, x0, HEAP, lsl #32
    // 0x740e74: r2 = LoadClassIdInstr(r0)
    //     0x740e74: ldur            x2, [x0, #-1]
    //     0x740e78: ubfx            x2, x2, #0xc, #0x14
    // 0x740e7c: str             x0, [SP]
    // 0x740e80: mov             x0, x2
    // 0x740e84: r0 = GDT[cid_x0 + 0xa0a8]()
    //     0x740e84: mov             x17, #0xa0a8
    //     0x740e88: add             lr, x0, x17
    //     0x740e8c: ldr             lr, [x21, lr, lsl #3]
    //     0x740e90: blr             lr
    // 0x740e94: mov             x2, x0
    // 0x740e98: ldr             x1, [fp, #0x10]
    // 0x740e9c: stur            x2, [fp, #-0x10]
    // 0x740ea0: LoadField: r3 = r1->field_b
    //     0x740ea0: ldur            w3, [x1, #0xb]
    // 0x740ea4: DecompressPointer r3
    //     0x740ea4: add             x3, x3, HEAP, lsl #32
    // 0x740ea8: stur            x3, [fp, #-8]
    // 0x740eac: CheckStackOverflow
    //     0x740eac: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x740eb0: cmp             SP, x16
    //     0x740eb4: b.ls            #0x7410dc
    // 0x740eb8: r0 = LoadClassIdInstr(r2)
    //     0x740eb8: ldur            x0, [x2, #-1]
    //     0x740ebc: ubfx            x0, x0, #0xc, #0x14
    // 0x740ec0: str             x2, [SP]
    // 0x740ec4: r0 = GDT[cid_x0 + 0x3a9]()
    //     0x740ec4: add             lr, x0, #0x3a9
    //     0x740ec8: ldr             lr, [x21, lr, lsl #3]
    //     0x740ecc: blr             lr
    // 0x740ed0: tbnz            w0, #4, #0x74109c
    // 0x740ed4: ldur            x1, [fp, #-0x10]
    // 0x740ed8: ldur            x2, [fp, #-8]
    // 0x740edc: r0 = LoadClassIdInstr(r1)
    //     0x740edc: ldur            x0, [x1, #-1]
    //     0x740ee0: ubfx            x0, x0, #0xc, #0x14
    // 0x740ee4: str             x1, [SP]
    // 0x740ee8: r0 = GDT[cid_x0 + 0x44d]()
    //     0x740ee8: add             lr, x0, #0x44d
    //     0x740eec: ldr             lr, [x21, lr, lsl #3]
    //     0x740ef0: blr             lr
    // 0x740ef4: mov             x2, x0
    // 0x740ef8: ldur            x1, [fp, #-8]
    // 0x740efc: stur            x2, [fp, #-0x18]
    // 0x740f00: r0 = LoadClassIdInstr(r1)
    //     0x740f00: ldur            x0, [x1, #-1]
    //     0x740f04: ubfx            x0, x0, #0xc, #0x14
    // 0x740f08: str             x1, [SP]
    // 0x740f0c: r0 = GDT[cid_x0 + 0xa0a8]()
    //     0x740f0c: mov             x17, #0xa0a8
    //     0x740f10: add             lr, x0, x17
    //     0x740f14: ldr             lr, [x21, lr, lsl #3]
    //     0x740f18: blr             lr
    // 0x740f1c: mov             x1, x0
    // 0x740f20: stur            x1, [fp, #-0x20]
    // 0x740f24: CheckStackOverflow
    //     0x740f24: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x740f28: cmp             SP, x16
    //     0x740f2c: b.ls            #0x7410e4
    // 0x740f30: r0 = LoadClassIdInstr(r1)
    //     0x740f30: ldur            x0, [x1, #-1]
    //     0x740f34: ubfx            x0, x0, #0xc, #0x14
    // 0x740f38: str             x1, [SP]
    // 0x740f3c: r0 = GDT[cid_x0 + 0x3a9]()
    //     0x740f3c: add             lr, x0, #0x3a9
    //     0x740f40: ldr             lr, [x21, lr, lsl #3]
    //     0x740f44: blr             lr
    // 0x740f48: tbnz            w0, #4, #0x740f90
    // 0x740f4c: ldur            x1, [fp, #-0x20]
    // 0x740f50: r0 = LoadClassIdInstr(r1)
    //     0x740f50: ldur            x0, [x1, #-1]
    //     0x740f54: ubfx            x0, x0, #0xc, #0x14
    // 0x740f58: str             x1, [SP]
    // 0x740f5c: r0 = GDT[cid_x0 + 0x44d]()
    //     0x740f5c: add             lr, x0, #0x44d
    //     0x740f60: ldr             lr, [x21, lr, lsl #3]
    //     0x740f64: blr             lr
    // 0x740f68: stur            x0, [fp, #-0x28]
    // 0x740f6c: ldur            x16, [fp, #-0x18]
    // 0x740f70: stp             x0, x16, [SP]
    // 0x740f74: r4 = const [0, 0x2, 0x2, 0x2, null]
    //     0x740f74: ldr             x4, [PP, #0x120]  ; [pp+0x120] List(5) [0, 0x2, 0x2, 0x2, Null]
    // 0x740f78: r0 = call 0x20d160
    //     0x740f78: bl              #0x20d160
    // 0x740f7c: tbnz            w0, #4, #0x740f88
    // 0x740f80: ldur            x0, [fp, #-0x28]
    // 0x740f84: b               #0x740f94
    // 0x740f88: ldur            x1, [fp, #-0x20]
    // 0x740f8c: b               #0x740f24
    // 0x740f90: r0 = Null
    //     0x740f90: mov             x0, NULL
    // 0x740f94: stur            x0, [fp, #-0x20]
    // 0x740f98: cmp             w0, NULL
    // 0x740f9c: b.eq            #0x74108c
    // 0x740fa0: ldur            x1, [fp, #-0x18]
    // 0x740fa4: r0 = call 0x20f3cc
    //     0x740fa4: bl              #0x20f3cc
    // 0x740fa8: r0 = _Op()
    //     0x740fa8: bl              #0x6cd2d8  ; Allocate_OpStub -> _Op (size=0x10)
    // 0x740fac: mov             x1, x0
    // 0x740fb0: ldur            x0, [fp, #-0x18]
    // 0x740fb4: stur            x1, [fp, #-0x28]
    // 0x740fb8: StoreField: r1->field_7 = r0
    //     0x740fb8: stur            w0, [x1, #7]
    // 0x740fbc: str             x0, [SP]
    // 0x740fc0: r0 = call 0x20f328
    //     0x740fc0: bl              #0x20f328
    // 0x740fc4: mov             x2, x0
    // 0x740fc8: ldur            x1, [fp, #-0x28]
    // 0x740fcc: stur            x2, [fp, #-0x30]
    // 0x740fd0: StoreField: r1->field_b = r0
    //     0x740fd0: stur            w0, [x1, #0xb]
    //     0x740fd4: ldurb           w16, [x1, #-1]
    //     0x740fd8: ldurb           w17, [x0, #-1]
    //     0x740fdc: and             x16, x17, x16, lsr #2
    //     0x740fe0: tst             x16, HEAP, lsr #32
    //     0x740fe4: b.eq            #0x740fec
    //     0x740fe8: bl              #0x74b698  ; WriteBarrierWrappersStub
    // 0x740fec: r0 = call 0x20f370
    //     0x740fec: bl              #0x20f370
    // 0x740ff0: ldur            x16, [fp, #-0x30]
    // 0x740ff4: stp             x16, x0, [SP]
    // 0x740ff8: r0 = _KIb()
    //     0x740ff8: bl              #0x73711c  ; [dart:io] _Op::_KIb
    // 0x740ffc: stur            x0, [fp, #-0x30]
    // 0x741000: r1 = 59
    //     0x741000: mov             x1, #0x3b
    // 0x741004: branchIfSmi(r0, 0x741010)
    //     0x741004: tbz             w0, #0, #0x741010
    // 0x741008: r1 = LoadClassIdInstr(r0)
    //     0x741008: ldur            x1, [x0, #-1]
    //     0x74100c: ubfx            x1, x1, #0xc, #0x14
    // 0x741010: r17 = 4186
    //     0x741010: mov             x17, #0x105a
    // 0x741014: cmp             x1, x17
    // 0x741018: b.eq            #0x7410ac
    // 0x74101c: mov             x2, x0
    // 0x741020: r1 = "Exists failed"
    //     0x741020: ldr             x1, [PP, #0x7968]  ; [pp+0x7968] "Exists failed"
    // 0x741024: r0 = 59
    //     0x741024: mov             x0, #0x3b
    // 0x741028: branchIfSmi(r2, 0x741034)
    //     0x741028: tbz             w2, #0, #0x741034
    // 0x74102c: r0 = LoadClassIdInstr(r2)
    //     0x74102c: ldur            x0, [x2, #-1]
    //     0x741030: ubfx            x0, x0, #0xc, #0x14
    // 0x741034: r16 = 2
    //     0x741034: mov             x16, #2
    // 0x741038: stp             x16, x2, [SP]
    // 0x74103c: mov             lr, x0
    // 0x741040: ldr             lr, [x21, lr, lsl #3]
    // 0x741044: blr             lr
    // 0x741048: tbnz            w0, #4, #0x74108c
    // 0x74104c: r0 = InitLateStaticField(0xae8) // [LIh] ::kBb
    //     0x74104c: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x741050: ldr             x0, [x0, #0x15d0]
    //     0x741054: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x741058: cmp             w0, w16
    //     0x74105c: b.ne            #0x741068
    //     0x741060: ldr             x2, [PP, #0x6cd0]  ; [pp+0x6cd0] Field <::.kBb>: static late final (offset: 0xae8)
    //     0x741064: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x741068: ldur            x16, [fp, #-0x20]
    // 0x74106c: stp             x16, x0, [SP]
    // 0x741070: r0 = call 0x3a44c0
    //     0x741070: bl              #0x3a44c0
    // 0x741074: ldr             x16, [fp, #0x10]
    // 0x741078: ldur            lr, [fp, #-0x20]
    // 0x74107c: stp             lr, x16, [SP, #0x10]
    // 0x741080: ldur            x16, [fp, #-0x28]
    // 0x741084: stp             x16, x0, [SP]
    // 0x741088: r0 = __unknown_function__()
    //     0x741088: bl              #0x7410ec  ; [] ::__unknown_function__
    // 0x74108c: ldr             x1, [fp, #0x10]
    // 0x741090: ldur            x2, [fp, #-0x10]
    // 0x741094: ldur            x3, [fp, #-8]
    // 0x741098: b               #0x740eac
    // 0x74109c: r0 = Null
    //     0x74109c: mov             x0, NULL
    // 0x7410a0: LeaveFrame
    //     0x7410a0: mov             SP, fp
    //     0x7410a4: ldp             fp, lr, [SP], #0x10
    // 0x7410a8: ret
    //     0x7410a8: ret             
    // 0x7410ac: ldur            x1, [fp, #-0x18]
    // 0x7410b0: r0 = FileSystemException()
    //     0x7410b0: bl              #0x6cccb4  ; AllocateFileSystemExceptionStub -> FileSystemException (size=0x14)
    // 0x7410b4: r1 = "Exists failed"
    //     0x7410b4: ldr             x1, [PP, #0x7968]  ; [pp+0x7968] "Exists failed"
    // 0x7410b8: StoreField: r0->field_7 = r1
    //     0x7410b8: stur            w1, [x0, #7]
    // 0x7410bc: ldur            x1, [fp, #-0x18]
    // 0x7410c0: StoreField: r0->field_b = r1
    //     0x7410c0: stur            w1, [x0, #0xb]
    // 0x7410c4: ldur            x2, [fp, #-0x30]
    // 0x7410c8: StoreField: r0->field_f = r2
    //     0x7410c8: stur            w2, [x0, #0xf]
    // 0x7410cc: r0 = Throw()
    //     0x7410cc: bl              #0x74b258  ; ThrowStub
    // 0x7410d0: brk             #0
    // 0x7410d4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7410d4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7410d8: b               #0x740e68
    // 0x7410dc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7410dc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7410e0: b               #0x740eb8
    // 0x7410e4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7410e4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7410e8: b               #0x740f30
  }
  [closure] static Map<IMa, List<KMa>> <anonymous closure>(dynamic) {
    // ** addr: 0x68fa20, size: -0x1
  }
}

// class id: 493, size: 0xc, field offset: 0x8
class _MMa extends Object {

  [closure] bool <anonymous closure>(dynamic, XEa) {
    // ** addr: 0x68f2e4, size: -0x1
  }
  [closure] UDa <anonymous closure>(dynamic, XEa) {
    // ** addr: 0x68f29c, size: -0x1
  }
}

// class id: 494, size: 0x30, field offset: 0x8
//   const constructor, 
class KMa extends Object
    implements gLa {
}

// class id: 495, size: 0x18, field offset: 0x8
//   const constructor, 
class IMa extends Object
    implements gLa {
}

// class id: 496, size: 0x14, field offset: 0x8
//   const constructor, 
class HMa extends Object {
}

// class id: 1179, size: 0x28, field offset: 0x24
abstract class GMa extends _roa {

  [closure] Null <anonymous closure>(dynamic, Tya) {
    // ** addr: 0x4aa3c4, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, String) {
    // ** addr: 0x57b114, size: -0x1
  }
  [closure] String <anonymous closure>(dynamic, KMa) {
    // ** addr: 0x691374, size: -0x1
  }
}

// class id: 1180, size: 0x38, field offset: 0x28
abstract class _LMa extends GMa {

  [closure] static List<Object?> <anonymous closure>(dynamic) {
    // ** addr: 0x68dbe8, size: -0x1
  }
  [closure] static Qa<IMa, List<IMa>> <anonymous closure>(dynamic, IMa, Set<IMa>) {
    // ** addr: 0x68e5ec, size: -0x1
  }
  [closure] static int <anonymous closure>(dynamic, IMa, IMa) {
    // ** addr: 0x68e66c, size: -0x1
  }
  [closure] List<KMa> <anonymous closure>(dynamic, List<KMa>) {
    // ** addr: 0x57ced0, size: -0x1
  }
}

// class id: 1181, size: 0x3c, field offset: 0x38
class _PMa extends _LMa {

  [closure] Null <anonymous closure>(dynamic, Tya) {
    // ** addr: 0x68f7e0, size: -0x1
  }
  [closure] String <anonymous closure>(dynamic, IMa) {
    // ** addr: 0x68f8d8, size: -0x1
  }
}

// class id: 1182, size: 0x3c, field offset: 0x38
class _NMa extends _LMa {

  [closure] String <anonymous closure>(dynamic, XEa) {
    // ** addr: 0x6aaf5c, size: -0x1
  }
  [closure] static Map<IMa, List<KMa>> <anonymous closure>(dynamic) {
    // ** addr: 0x68e7dc, size: -0x1
  }
  [closure] static int <anonymous closure>(dynamic, KMa, KMa) {
    // ** addr: 0x57cf38, size: -0x1
  }
  [closure] static bool <anonymous closure>(dynamic, Qa<IMa, List<KMa>>) {
    // ** addr: 0x68f33c, size: -0x1
  }
  [closure] static List<String> <anonymous closure>(dynamic) {
    // ** addr: 0x690f84, size: -0x1
  }
  [closure] String <anonymous closure>(dynamic, KMa) {
    // ** addr: 0x6914d0, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, KMa) {
    // ** addr: 0x69147c, size: -0x1
  }
}

// class id: 1837, size: 0x24, field offset: 0x24
class JMa extends rT {
}
