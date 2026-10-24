// lib: , url: MNh

// class id: 1049442, size: 0x8
class :: {
}

// class id: 453, size: 0x8, field offset: 0x8
//   const constructor, 
class TOa extends Object {

  BQa<Y0, Y1> call<Y0, Y1>(TOa, (dynamic, uQa<Y0>, Y1) => Stream<Y0>, {String? name, Iterable<hPa>? zYc}) {
    // ** addr: 0x716ec0, size: 0x1bc
    // 0x716ec0: EnterFrame
    //     0x716ec0: stp             fp, lr, [SP, #-0x10]!
    //     0x716ec4: mov             fp, SP
    // 0x716ec8: AllocStack(0x50)
    //     0x716ec8: sub             SP, SP, #0x50
    // 0x716ecc: SetupParameters(TOa this /* r3, fp-0x28 */, dynamic _ /* r4, fp-0x20 */, {dynamic name = Null /* r5, fp-0x18 */, dynamic zYc = Null /* r6, fp-0x10 */})
    //     0x716ecc: mov             x0, x4
    //     0x716ed0: ldur            w1, [x0, #0x13]
    //     0x716ed4: add             x1, x1, HEAP, lsl #32
    //     0x716ed8: sub             x2, x1, #4
    //     0x716edc: add             x3, fp, w2, sxtw #2
    //     0x716ee0: ldr             x3, [x3, #0x18]
    //     0x716ee4: stur            x3, [fp, #-0x28]
    //     0x716ee8: add             x4, fp, w2, sxtw #2
    //     0x716eec: ldr             x4, [x4, #0x10]
    //     0x716ef0: stur            x4, [fp, #-0x20]
    //     0x716ef4: ldur            w2, [x0, #0x1f]
    //     0x716ef8: add             x2, x2, HEAP, lsl #32
    //     0x716efc: ldr             x16, [PP, #0x66e0]  ; [pp+0x66e0] "name"
    //     0x716f00: cmp             w2, w16
    //     0x716f04: b.ne            #0x716f28
    //     0x716f08: ldur            w2, [x0, #0x23]
    //     0x716f0c: add             x2, x2, HEAP, lsl #32
    //     0x716f10: sub             w5, w1, w2
    //     0x716f14: add             x2, fp, w5, sxtw #2
    //     0x716f18: ldr             x2, [x2, #8]
    //     0x716f1c: mov             x5, x2
    //     0x716f20: mov             x2, #1
    //     0x716f24: b               #0x716f30
    //     0x716f28: mov             x5, NULL
    //     0x716f2c: mov             x2, #0
    //     0x716f30: stur            x5, [fp, #-0x18]
    //     0x716f34: lsl             x6, x2, #1
    //     0x716f38: lsl             w2, w6, #1
    //     0x716f3c: add             w6, w2, #8
    //     0x716f40: add             x16, x0, w6, sxtw #1
    //     0x716f44: ldur            w7, [x16, #0xf]
    //     0x716f48: add             x7, x7, HEAP, lsl #32
    //     0x716f4c: add             x16, PP, #0x19, lsl #12  ; [pp+0x19d08] "zYc"
    //     0x716f50: ldr             x16, [x16, #0xd08]
    //     0x716f54: cmp             w7, w16
    //     0x716f58: b.ne            #0x716f80
    //     0x716f5c: add             w6, w2, #0xa
    //     0x716f60: add             x16, x0, w6, sxtw #1
    //     0x716f64: ldur            w2, [x16, #0xf]
    //     0x716f68: add             x2, x2, HEAP, lsl #32
    //     0x716f6c: sub             w6, w1, w2
    //     0x716f70: add             x1, fp, w6, sxtw #2
    //     0x716f74: ldr             x1, [x1, #8]
    //     0x716f78: mov             x6, x1
    //     0x716f7c: b               #0x716f84
    //     0x716f80: mov             x6, NULL
    //     0x716f84: stur            x6, [fp, #-0x10]
    //     0x716f88: ldur            w1, [x0, #0xf]
    //     0x716f8c: add             x1, x1, HEAP, lsl #32
    //     0x716f90: cbnz            w1, #0x716f9c
    //     0x716f94: mov             x7, NULL
    //     0x716f98: b               #0x716fb0
    //     0x716f9c: ldur            w1, [x0, #0x17]
    //     0x716fa0: add             x1, x1, HEAP, lsl #32
    //     0x716fa4: add             x0, fp, w1, sxtw #2
    //     0x716fa8: ldr             x0, [x0, #0x10]
    //     0x716fac: mov             x7, x0
    //     0x716fb0: stur            x7, [fp, #-8]
    // 0x716fb4: CheckStackOverflow
    //     0x716fb4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x716fb8: cmp             SP, x16
    //     0x716fbc: b.ls            #0x717074
    // 0x716fc0: mov             x0, x4
    // 0x716fc4: mov             x1, x7
    // 0x716fc8: r2 = Null
    //     0x716fc8: mov             x2, NULL
    // 0x716fcc: r8 = (dynamic this, uQa<Y0>, Y1) => Stream<Y0>
    //     0x716fcc: add             x8, PP, #0x27, lsl #12  ; [pp+0x27968] FunctionType: (dynamic this, uQa<Y0>, Y1) => Stream<Y0>
    //     0x716fd0: ldr             x8, [x8, #0x968]
    // 0x716fd4: LoadField: r9 = r8->field_7
    //     0x716fd4: ldur            x9, [x8, #7]
    // 0x716fd8: r3 = Null
    //     0x716fd8: add             x3, PP, #0x27, lsl #12  ; [pp+0x27970] Null
    //     0x716fdc: ldr             x3, [x3, #0x970]
    // 0x716fe0: blr             x9
    // 0x716fe4: ldur            x0, [fp, #-0x18]
    // 0x716fe8: r2 = Null
    //     0x716fe8: mov             x2, NULL
    // 0x716fec: r1 = Null
    //     0x716fec: mov             x1, NULL
    // 0x716ff0: r4 = 59
    //     0x716ff0: mov             x4, #0x3b
    // 0x716ff4: branchIfSmi(r0, 0x717000)
    //     0x716ff4: tbz             w0, #0, #0x717000
    // 0x716ff8: r4 = LoadClassIdInstr(r0)
    //     0x716ff8: ldur            x4, [x0, #-1]
    //     0x716ffc: ubfx            x4, x4, #0xc, #0x14
    // 0x717000: sub             x4, x4, #0x5d
    // 0x717004: cmp             x4, #3
    // 0x717008: b.ls            #0x71701c
    // 0x71700c: r8 = String?
    //     0x71700c: ldr             x8, [PP, #0xad0]  ; [pp+0xad0] Type: String?
    // 0x717010: r3 = Null
    //     0x717010: add             x3, PP, #0x27, lsl #12  ; [pp+0x27980] Null
    //     0x717014: ldr             x3, [x3, #0x980]
    // 0x717018: r0 = String?()
    //     0x717018: bl              #0x6c8c00  ; IsType_String?_Stub
    // 0x71701c: ldur            x0, [fp, #-0x10]
    // 0x717020: r2 = Null
    //     0x717020: mov             x2, NULL
    // 0x717024: r1 = Null
    //     0x717024: mov             x1, NULL
    // 0x717028: r8 = Iterable<hPa>?
    //     0x717028: add             x8, PP, #0x19, lsl #12  ; [pp+0x19d50] Type: Iterable<hPa>?
    //     0x71702c: ldr             x8, [x8, #0xd50]
    // 0x717030: r3 = Null
    //     0x717030: add             x3, PP, #0x27, lsl #12  ; [pp+0x27990] Null
    //     0x717034: ldr             x3, [x3, #0x990]
    // 0x717038: r0 = Iterable<hPa>?()
    //     0x717038: bl              #0x707f14  ; IsType_Iterable<hPa>?_Stub
    // 0x71703c: ldur            x16, [fp, #-8]
    // 0x717040: ldur            lr, [fp, #-0x28]
    // 0x717044: stp             lr, x16, [SP, #0x18]
    // 0x717048: ldur            x16, [fp, #-0x20]
    // 0x71704c: ldur            lr, [fp, #-0x18]
    // 0x717050: stp             lr, x16, [SP, #8]
    // 0x717054: ldur            x16, [fp, #-0x10]
    // 0x717058: str             x16, [SP]
    // 0x71705c: r4 = const [0x2, 0x4, 0x4, 0x2, name, 0x2, zYc, 0x3, null]
    //     0x71705c: add             x4, PP, #0x27, lsl #12  ; [pp+0x279a0] List(9) [0x2, 0x4, 0x4, 0x2, "name", 0x2, "zYc", 0x3, Null]
    //     0x717060: ldr             x4, [x4, #0x9a0]
    // 0x717064: r0 = call 0x457884
    //     0x717064: bl              #0x457884
    // 0x717068: LeaveFrame
    //     0x717068: mov             SP, fp
    //     0x71706c: ldp             fp, lr, [SP], #0x10
    // 0x717070: ret
    //     0x717070: ret             
    // 0x717074: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x717074: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x717078: b               #0x716fc0
  }
}

// class id: 455, size: 0x8, field offset: 0x8
//   const constructor, 
class ROa extends Object {

  ZPa<Y0, Y1> call<Y0, Y1>(ROa, (dynamic, SPa<Y0>, Y1) => FutureOr<Y0>, {String? name, Iterable<hPa>? zYc}) {
    // ** addr: 0x717180, size: 0x1bc
    // 0x717180: EnterFrame
    //     0x717180: stp             fp, lr, [SP, #-0x10]!
    //     0x717184: mov             fp, SP
    // 0x717188: AllocStack(0x50)
    //     0x717188: sub             SP, SP, #0x50
    // 0x71718c: SetupParameters(ROa this /* r3, fp-0x28 */, dynamic _ /* r4, fp-0x20 */, {dynamic name = Null /* r5, fp-0x18 */, dynamic zYc = Null /* r6, fp-0x10 */})
    //     0x71718c: mov             x0, x4
    //     0x717190: ldur            w1, [x0, #0x13]
    //     0x717194: add             x1, x1, HEAP, lsl #32
    //     0x717198: sub             x2, x1, #4
    //     0x71719c: add             x3, fp, w2, sxtw #2
    //     0x7171a0: ldr             x3, [x3, #0x18]
    //     0x7171a4: stur            x3, [fp, #-0x28]
    //     0x7171a8: add             x4, fp, w2, sxtw #2
    //     0x7171ac: ldr             x4, [x4, #0x10]
    //     0x7171b0: stur            x4, [fp, #-0x20]
    //     0x7171b4: ldur            w2, [x0, #0x1f]
    //     0x7171b8: add             x2, x2, HEAP, lsl #32
    //     0x7171bc: ldr             x16, [PP, #0x66e0]  ; [pp+0x66e0] "name"
    //     0x7171c0: cmp             w2, w16
    //     0x7171c4: b.ne            #0x7171e8
    //     0x7171c8: ldur            w2, [x0, #0x23]
    //     0x7171cc: add             x2, x2, HEAP, lsl #32
    //     0x7171d0: sub             w5, w1, w2
    //     0x7171d4: add             x2, fp, w5, sxtw #2
    //     0x7171d8: ldr             x2, [x2, #8]
    //     0x7171dc: mov             x5, x2
    //     0x7171e0: mov             x2, #1
    //     0x7171e4: b               #0x7171f0
    //     0x7171e8: mov             x5, NULL
    //     0x7171ec: mov             x2, #0
    //     0x7171f0: stur            x5, [fp, #-0x18]
    //     0x7171f4: lsl             x6, x2, #1
    //     0x7171f8: lsl             w2, w6, #1
    //     0x7171fc: add             w6, w2, #8
    //     0x717200: add             x16, x0, w6, sxtw #1
    //     0x717204: ldur            w7, [x16, #0xf]
    //     0x717208: add             x7, x7, HEAP, lsl #32
    //     0x71720c: add             x16, PP, #0x19, lsl #12  ; [pp+0x19d08] "zYc"
    //     0x717210: ldr             x16, [x16, #0xd08]
    //     0x717214: cmp             w7, w16
    //     0x717218: b.ne            #0x717240
    //     0x71721c: add             w6, w2, #0xa
    //     0x717220: add             x16, x0, w6, sxtw #1
    //     0x717224: ldur            w2, [x16, #0xf]
    //     0x717228: add             x2, x2, HEAP, lsl #32
    //     0x71722c: sub             w6, w1, w2
    //     0x717230: add             x1, fp, w6, sxtw #2
    //     0x717234: ldr             x1, [x1, #8]
    //     0x717238: mov             x6, x1
    //     0x71723c: b               #0x717244
    //     0x717240: mov             x6, NULL
    //     0x717244: stur            x6, [fp, #-0x10]
    //     0x717248: ldur            w1, [x0, #0xf]
    //     0x71724c: add             x1, x1, HEAP, lsl #32
    //     0x717250: cbnz            w1, #0x71725c
    //     0x717254: mov             x7, NULL
    //     0x717258: b               #0x717270
    //     0x71725c: ldur            w1, [x0, #0x17]
    //     0x717260: add             x1, x1, HEAP, lsl #32
    //     0x717264: add             x0, fp, w1, sxtw #2
    //     0x717268: ldr             x0, [x0, #0x10]
    //     0x71726c: mov             x7, x0
    //     0x717270: stur            x7, [fp, #-8]
    // 0x717274: CheckStackOverflow
    //     0x717274: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x717278: cmp             SP, x16
    //     0x71727c: b.ls            #0x717334
    // 0x717280: mov             x0, x4
    // 0x717284: mov             x1, x7
    // 0x717288: r2 = Null
    //     0x717288: mov             x2, NULL
    // 0x71728c: r8 = (dynamic this, SPa<Y0>, Y1) => FutureOr<Y0>
    //     0x71728c: add             x8, PP, #0x33, lsl #12  ; [pp+0x33230] FunctionType: (dynamic this, SPa<Y0>, Y1) => FutureOr<Y0>
    //     0x717290: ldr             x8, [x8, #0x230]
    // 0x717294: LoadField: r9 = r8->field_7
    //     0x717294: ldur            x9, [x8, #7]
    // 0x717298: r3 = Null
    //     0x717298: add             x3, PP, #0x33, lsl #12  ; [pp+0x33238] Null
    //     0x71729c: ldr             x3, [x3, #0x238]
    // 0x7172a0: blr             x9
    // 0x7172a4: ldur            x0, [fp, #-0x18]
    // 0x7172a8: r2 = Null
    //     0x7172a8: mov             x2, NULL
    // 0x7172ac: r1 = Null
    //     0x7172ac: mov             x1, NULL
    // 0x7172b0: r4 = 59
    //     0x7172b0: mov             x4, #0x3b
    // 0x7172b4: branchIfSmi(r0, 0x7172c0)
    //     0x7172b4: tbz             w0, #0, #0x7172c0
    // 0x7172b8: r4 = LoadClassIdInstr(r0)
    //     0x7172b8: ldur            x4, [x0, #-1]
    //     0x7172bc: ubfx            x4, x4, #0xc, #0x14
    // 0x7172c0: sub             x4, x4, #0x5d
    // 0x7172c4: cmp             x4, #3
    // 0x7172c8: b.ls            #0x7172dc
    // 0x7172cc: r8 = String?
    //     0x7172cc: ldr             x8, [PP, #0xad0]  ; [pp+0xad0] Type: String?
    // 0x7172d0: r3 = Null
    //     0x7172d0: add             x3, PP, #0x33, lsl #12  ; [pp+0x33248] Null
    //     0x7172d4: ldr             x3, [x3, #0x248]
    // 0x7172d8: r0 = String?()
    //     0x7172d8: bl              #0x6c8c00  ; IsType_String?_Stub
    // 0x7172dc: ldur            x0, [fp, #-0x10]
    // 0x7172e0: r2 = Null
    //     0x7172e0: mov             x2, NULL
    // 0x7172e4: r1 = Null
    //     0x7172e4: mov             x1, NULL
    // 0x7172e8: r8 = Iterable<hPa>?
    //     0x7172e8: add             x8, PP, #0x19, lsl #12  ; [pp+0x19d50] Type: Iterable<hPa>?
    //     0x7172ec: ldr             x8, [x8, #0xd50]
    // 0x7172f0: r3 = Null
    //     0x7172f0: add             x3, PP, #0x33, lsl #12  ; [pp+0x33258] Null
    //     0x7172f4: ldr             x3, [x3, #0x258]
    // 0x7172f8: r0 = Iterable<hPa>?()
    //     0x7172f8: bl              #0x707f14  ; IsType_Iterable<hPa>?_Stub
    // 0x7172fc: ldur            x16, [fp, #-8]
    // 0x717300: ldur            lr, [fp, #-0x28]
    // 0x717304: stp             lr, x16, [SP, #0x18]
    // 0x717308: ldur            x16, [fp, #-0x20]
    // 0x71730c: ldur            lr, [fp, #-0x18]
    // 0x717310: stp             lr, x16, [SP, #8]
    // 0x717314: ldur            x16, [fp, #-0x10]
    // 0x717318: str             x16, [SP]
    // 0x71731c: r4 = const [0x2, 0x4, 0x4, 0x2, name, 0x2, zYc, 0x3, null]
    //     0x71731c: add             x4, PP, #0x27, lsl #12  ; [pp+0x279a0] List(9) [0x2, 0x4, 0x4, 0x2, "name", 0x2, "zYc", 0x3, Null]
    //     0x717320: ldr             x4, [x4, #0x9a0]
    // 0x717324: r0 = call 0x459224
    //     0x717324: bl              #0x459224
    // 0x717328: LeaveFrame
    //     0x717328: mov             SP, fp
    //     0x71732c: ldp             fp, lr, [SP], #0x10
    // 0x717330: ret
    //     0x717330: ret             
    // 0x717334: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x717334: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x717338: b               #0x717280
  }
}

// class id: 456, size: 0x8, field offset: 0x8
//   const constructor, 
class QOa extends Object {

  VPa<Y0> call<Y0>(QOa, (dynamic, SPa<Y0>) => FutureOr<Y0>, {String? name, Iterable<hPa>? zYc}) {
    // ** addr: 0x72c214, size: 0x1bc
    // 0x72c214: EnterFrame
    //     0x72c214: stp             fp, lr, [SP, #-0x10]!
    //     0x72c218: mov             fp, SP
    // 0x72c21c: AllocStack(0x50)
    //     0x72c21c: sub             SP, SP, #0x50
    // 0x72c220: SetupParameters(QOa this /* r3, fp-0x28 */, dynamic _ /* r4, fp-0x20 */, {dynamic name = Null /* r5, fp-0x18 */, dynamic zYc = Null /* r6, fp-0x10 */})
    //     0x72c220: mov             x0, x4
    //     0x72c224: ldur            w1, [x0, #0x13]
    //     0x72c228: add             x1, x1, HEAP, lsl #32
    //     0x72c22c: sub             x2, x1, #4
    //     0x72c230: add             x3, fp, w2, sxtw #2
    //     0x72c234: ldr             x3, [x3, #0x18]
    //     0x72c238: stur            x3, [fp, #-0x28]
    //     0x72c23c: add             x4, fp, w2, sxtw #2
    //     0x72c240: ldr             x4, [x4, #0x10]
    //     0x72c244: stur            x4, [fp, #-0x20]
    //     0x72c248: ldur            w2, [x0, #0x1f]
    //     0x72c24c: add             x2, x2, HEAP, lsl #32
    //     0x72c250: ldr             x16, [PP, #0x66e0]  ; [pp+0x66e0] "name"
    //     0x72c254: cmp             w2, w16
    //     0x72c258: b.ne            #0x72c27c
    //     0x72c25c: ldur            w2, [x0, #0x23]
    //     0x72c260: add             x2, x2, HEAP, lsl #32
    //     0x72c264: sub             w5, w1, w2
    //     0x72c268: add             x2, fp, w5, sxtw #2
    //     0x72c26c: ldr             x2, [x2, #8]
    //     0x72c270: mov             x5, x2
    //     0x72c274: mov             x2, #1
    //     0x72c278: b               #0x72c284
    //     0x72c27c: mov             x5, NULL
    //     0x72c280: mov             x2, #0
    //     0x72c284: stur            x5, [fp, #-0x18]
    //     0x72c288: lsl             x6, x2, #1
    //     0x72c28c: lsl             w2, w6, #1
    //     0x72c290: add             w6, w2, #8
    //     0x72c294: add             x16, x0, w6, sxtw #1
    //     0x72c298: ldur            w7, [x16, #0xf]
    //     0x72c29c: add             x7, x7, HEAP, lsl #32
    //     0x72c2a0: add             x16, PP, #0x19, lsl #12  ; [pp+0x19d08] "zYc"
    //     0x72c2a4: ldr             x16, [x16, #0xd08]
    //     0x72c2a8: cmp             w7, w16
    //     0x72c2ac: b.ne            #0x72c2d4
    //     0x72c2b0: add             w6, w2, #0xa
    //     0x72c2b4: add             x16, x0, w6, sxtw #1
    //     0x72c2b8: ldur            w2, [x16, #0xf]
    //     0x72c2bc: add             x2, x2, HEAP, lsl #32
    //     0x72c2c0: sub             w6, w1, w2
    //     0x72c2c4: add             x1, fp, w6, sxtw #2
    //     0x72c2c8: ldr             x1, [x1, #8]
    //     0x72c2cc: mov             x6, x1
    //     0x72c2d0: b               #0x72c2d8
    //     0x72c2d4: mov             x6, NULL
    //     0x72c2d8: stur            x6, [fp, #-0x10]
    //     0x72c2dc: ldur            w1, [x0, #0xf]
    //     0x72c2e0: add             x1, x1, HEAP, lsl #32
    //     0x72c2e4: cbnz            w1, #0x72c2f0
    //     0x72c2e8: mov             x7, NULL
    //     0x72c2ec: b               #0x72c304
    //     0x72c2f0: ldur            w1, [x0, #0x17]
    //     0x72c2f4: add             x1, x1, HEAP, lsl #32
    //     0x72c2f8: add             x0, fp, w1, sxtw #2
    //     0x72c2fc: ldr             x0, [x0, #0x10]
    //     0x72c300: mov             x7, x0
    //     0x72c304: stur            x7, [fp, #-8]
    // 0x72c308: CheckStackOverflow
    //     0x72c308: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x72c30c: cmp             SP, x16
    //     0x72c310: b.ls            #0x72c3c8
    // 0x72c314: mov             x0, x4
    // 0x72c318: mov             x1, x7
    // 0x72c31c: r2 = Null
    //     0x72c31c: mov             x2, NULL
    // 0x72c320: r8 = (dynamic this, SPa<Y0>) => FutureOr<Y0>
    //     0x72c320: add             x8, PP, #0x27, lsl #12  ; [pp+0x27930] FunctionType: (dynamic this, SPa<Y0>) => FutureOr<Y0>
    //     0x72c324: ldr             x8, [x8, #0x930]
    // 0x72c328: LoadField: r9 = r8->field_7
    //     0x72c328: ldur            x9, [x8, #7]
    // 0x72c32c: r3 = Null
    //     0x72c32c: add             x3, PP, #0x27, lsl #12  ; [pp+0x27938] Null
    //     0x72c330: ldr             x3, [x3, #0x938]
    // 0x72c334: blr             x9
    // 0x72c338: ldur            x0, [fp, #-0x18]
    // 0x72c33c: r2 = Null
    //     0x72c33c: mov             x2, NULL
    // 0x72c340: r1 = Null
    //     0x72c340: mov             x1, NULL
    // 0x72c344: r4 = 59
    //     0x72c344: mov             x4, #0x3b
    // 0x72c348: branchIfSmi(r0, 0x72c354)
    //     0x72c348: tbz             w0, #0, #0x72c354
    // 0x72c34c: r4 = LoadClassIdInstr(r0)
    //     0x72c34c: ldur            x4, [x0, #-1]
    //     0x72c350: ubfx            x4, x4, #0xc, #0x14
    // 0x72c354: sub             x4, x4, #0x5d
    // 0x72c358: cmp             x4, #3
    // 0x72c35c: b.ls            #0x72c370
    // 0x72c360: r8 = String?
    //     0x72c360: ldr             x8, [PP, #0xad0]  ; [pp+0xad0] Type: String?
    // 0x72c364: r3 = Null
    //     0x72c364: add             x3, PP, #0x27, lsl #12  ; [pp+0x27948] Null
    //     0x72c368: ldr             x3, [x3, #0x948]
    // 0x72c36c: r0 = String?()
    //     0x72c36c: bl              #0x6c8c00  ; IsType_String?_Stub
    // 0x72c370: ldur            x0, [fp, #-0x10]
    // 0x72c374: r2 = Null
    //     0x72c374: mov             x2, NULL
    // 0x72c378: r1 = Null
    //     0x72c378: mov             x1, NULL
    // 0x72c37c: r8 = Iterable<hPa>?
    //     0x72c37c: add             x8, PP, #0x19, lsl #12  ; [pp+0x19d50] Type: Iterable<hPa>?
    //     0x72c380: ldr             x8, [x8, #0xd50]
    // 0x72c384: r3 = Null
    //     0x72c384: add             x3, PP, #0x27, lsl #12  ; [pp+0x27958] Null
    //     0x72c388: ldr             x3, [x3, #0x958]
    // 0x72c38c: r0 = Iterable<hPa>?()
    //     0x72c38c: bl              #0x707f14  ; IsType_Iterable<hPa>?_Stub
    // 0x72c390: ldur            x16, [fp, #-8]
    // 0x72c394: ldur            lr, [fp, #-0x28]
    // 0x72c398: stp             lr, x16, [SP, #0x18]
    // 0x72c39c: ldur            x16, [fp, #-0x20]
    // 0x72c3a0: ldur            lr, [fp, #-0x18]
    // 0x72c3a4: stp             lr, x16, [SP, #8]
    // 0x72c3a8: ldur            x16, [fp, #-0x10]
    // 0x72c3ac: str             x16, [SP]
    // 0x72c3b0: r4 = const [0x1, 0x4, 0x4, 0x2, name, 0x2, zYc, 0x3, null]
    //     0x72c3b0: add             x4, PP, #0x19, lsl #12  ; [pp+0x19d68] List(9) [0x1, 0x4, 0x4, 0x2, "name", 0x2, "zYc", 0x3, Null]
    //     0x72c3b4: ldr             x4, [x4, #0xd68]
    // 0x72c3b8: r0 = call 0x57a9d4
    //     0x72c3b8: bl              #0x57a9d4
    // 0x72c3bc: LeaveFrame
    //     0x72c3bc: mov             SP, fp
    //     0x72c3c0: ldp             fp, lr, [SP], #0x10
    // 0x72c3c4: ret
    //     0x72c3c4: ret             
    // 0x72c3c8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x72c3c8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x72c3cc: b               #0x72c314
  }
}

// class id: 457, size: 0x8, field offset: 0x8
//   const constructor, 
class POa extends Object {

  jQa<Y0> call<Y0>(POa, (dynamic, hQa<Y0>) => Y0, {String? name, Iterable<hPa>? zYc}) {
    // ** addr: 0x716580, size: 0x1bc
    // 0x716580: EnterFrame
    //     0x716580: stp             fp, lr, [SP, #-0x10]!
    //     0x716584: mov             fp, SP
    // 0x716588: AllocStack(0x50)
    //     0x716588: sub             SP, SP, #0x50
    // 0x71658c: SetupParameters(POa this /* r3, fp-0x28 */, dynamic _ /* r4, fp-0x20 */, {dynamic name = Null /* r5, fp-0x18 */, dynamic zYc = Null /* r6, fp-0x10 */})
    //     0x71658c: mov             x0, x4
    //     0x716590: ldur            w1, [x0, #0x13]
    //     0x716594: add             x1, x1, HEAP, lsl #32
    //     0x716598: sub             x2, x1, #4
    //     0x71659c: add             x3, fp, w2, sxtw #2
    //     0x7165a0: ldr             x3, [x3, #0x18]
    //     0x7165a4: stur            x3, [fp, #-0x28]
    //     0x7165a8: add             x4, fp, w2, sxtw #2
    //     0x7165ac: ldr             x4, [x4, #0x10]
    //     0x7165b0: stur            x4, [fp, #-0x20]
    //     0x7165b4: ldur            w2, [x0, #0x1f]
    //     0x7165b8: add             x2, x2, HEAP, lsl #32
    //     0x7165bc: ldr             x16, [PP, #0x66e0]  ; [pp+0x66e0] "name"
    //     0x7165c0: cmp             w2, w16
    //     0x7165c4: b.ne            #0x7165e8
    //     0x7165c8: ldur            w2, [x0, #0x23]
    //     0x7165cc: add             x2, x2, HEAP, lsl #32
    //     0x7165d0: sub             w5, w1, w2
    //     0x7165d4: add             x2, fp, w5, sxtw #2
    //     0x7165d8: ldr             x2, [x2, #8]
    //     0x7165dc: mov             x5, x2
    //     0x7165e0: mov             x2, #1
    //     0x7165e4: b               #0x7165f0
    //     0x7165e8: mov             x5, NULL
    //     0x7165ec: mov             x2, #0
    //     0x7165f0: stur            x5, [fp, #-0x18]
    //     0x7165f4: lsl             x6, x2, #1
    //     0x7165f8: lsl             w2, w6, #1
    //     0x7165fc: add             w6, w2, #8
    //     0x716600: add             x16, x0, w6, sxtw #1
    //     0x716604: ldur            w7, [x16, #0xf]
    //     0x716608: add             x7, x7, HEAP, lsl #32
    //     0x71660c: add             x16, PP, #0x19, lsl #12  ; [pp+0x19d08] "zYc"
    //     0x716610: ldr             x16, [x16, #0xd08]
    //     0x716614: cmp             w7, w16
    //     0x716618: b.ne            #0x716640
    //     0x71661c: add             w6, w2, #0xa
    //     0x716620: add             x16, x0, w6, sxtw #1
    //     0x716624: ldur            w2, [x16, #0xf]
    //     0x716628: add             x2, x2, HEAP, lsl #32
    //     0x71662c: sub             w6, w1, w2
    //     0x716630: add             x1, fp, w6, sxtw #2
    //     0x716634: ldr             x1, [x1, #8]
    //     0x716638: mov             x6, x1
    //     0x71663c: b               #0x716644
    //     0x716640: mov             x6, NULL
    //     0x716644: stur            x6, [fp, #-0x10]
    //     0x716648: ldur            w1, [x0, #0xf]
    //     0x71664c: add             x1, x1, HEAP, lsl #32
    //     0x716650: cbnz            w1, #0x71665c
    //     0x716654: mov             x7, NULL
    //     0x716658: b               #0x716670
    //     0x71665c: ldur            w1, [x0, #0x17]
    //     0x716660: add             x1, x1, HEAP, lsl #32
    //     0x716664: add             x0, fp, w1, sxtw #2
    //     0x716668: ldr             x0, [x0, #0x10]
    //     0x71666c: mov             x7, x0
    //     0x716670: stur            x7, [fp, #-8]
    // 0x716674: CheckStackOverflow
    //     0x716674: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x716678: cmp             SP, x16
    //     0x71667c: b.ls            #0x716734
    // 0x716680: mov             x0, x4
    // 0x716684: mov             x1, x7
    // 0x716688: r2 = Null
    //     0x716688: mov             x2, NULL
    // 0x71668c: r8 = (dynamic this, hQa<Y0>) => Y0
    //     0x71668c: add             x8, PP, #0x2a, lsl #12  ; [pp+0x2a328] FunctionType: (dynamic this, hQa<Y0>) => Y0
    //     0x716690: ldr             x8, [x8, #0x328]
    // 0x716694: LoadField: r9 = r8->field_7
    //     0x716694: ldur            x9, [x8, #7]
    // 0x716698: r3 = Null
    //     0x716698: add             x3, PP, #0x2a, lsl #12  ; [pp+0x2a330] Null
    //     0x71669c: ldr             x3, [x3, #0x330]
    // 0x7166a0: blr             x9
    // 0x7166a4: ldur            x0, [fp, #-0x18]
    // 0x7166a8: r2 = Null
    //     0x7166a8: mov             x2, NULL
    // 0x7166ac: r1 = Null
    //     0x7166ac: mov             x1, NULL
    // 0x7166b0: r4 = 59
    //     0x7166b0: mov             x4, #0x3b
    // 0x7166b4: branchIfSmi(r0, 0x7166c0)
    //     0x7166b4: tbz             w0, #0, #0x7166c0
    // 0x7166b8: r4 = LoadClassIdInstr(r0)
    //     0x7166b8: ldur            x4, [x0, #-1]
    //     0x7166bc: ubfx            x4, x4, #0xc, #0x14
    // 0x7166c0: sub             x4, x4, #0x5d
    // 0x7166c4: cmp             x4, #3
    // 0x7166c8: b.ls            #0x7166dc
    // 0x7166cc: r8 = String?
    //     0x7166cc: ldr             x8, [PP, #0xad0]  ; [pp+0xad0] Type: String?
    // 0x7166d0: r3 = Null
    //     0x7166d0: add             x3, PP, #0x2a, lsl #12  ; [pp+0x2a340] Null
    //     0x7166d4: ldr             x3, [x3, #0x340]
    // 0x7166d8: r0 = String?()
    //     0x7166d8: bl              #0x6c8c00  ; IsType_String?_Stub
    // 0x7166dc: ldur            x0, [fp, #-0x10]
    // 0x7166e0: r2 = Null
    //     0x7166e0: mov             x2, NULL
    // 0x7166e4: r1 = Null
    //     0x7166e4: mov             x1, NULL
    // 0x7166e8: r8 = Iterable<hPa>?
    //     0x7166e8: add             x8, PP, #0x19, lsl #12  ; [pp+0x19d50] Type: Iterable<hPa>?
    //     0x7166ec: ldr             x8, [x8, #0xd50]
    // 0x7166f0: r3 = Null
    //     0x7166f0: add             x3, PP, #0x2a, lsl #12  ; [pp+0x2a350] Null
    //     0x7166f4: ldr             x3, [x3, #0x350]
    // 0x7166f8: r0 = Iterable<hPa>?()
    //     0x7166f8: bl              #0x707f14  ; IsType_Iterable<hPa>?_Stub
    // 0x7166fc: ldur            x16, [fp, #-8]
    // 0x716700: ldur            lr, [fp, #-0x28]
    // 0x716704: stp             lr, x16, [SP, #0x18]
    // 0x716708: ldur            x16, [fp, #-0x20]
    // 0x71670c: ldur            lr, [fp, #-0x18]
    // 0x716710: stp             lr, x16, [SP, #8]
    // 0x716714: ldur            x16, [fp, #-0x10]
    // 0x716718: str             x16, [SP]
    // 0x71671c: r4 = const [0x1, 0x4, 0x4, 0x2, name, 0x2, zYc, 0x3, null]
    //     0x71671c: add             x4, PP, #0x19, lsl #12  ; [pp+0x19d68] List(9) [0x1, 0x4, 0x4, 0x2, "name", 0x2, "zYc", 0x3, Null]
    //     0x716720: ldr             x4, [x4, #0xd68]
    // 0x716724: r0 = call 0x455b8c
    //     0x716724: bl              #0x455b8c
    // 0x716728: LeaveFrame
    //     0x716728: mov             SP, fp
    //     0x71672c: ldp             fp, lr, [SP], #0x10
    // 0x716730: ret
    //     0x716730: ret             
    // 0x716734: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x716734: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x716738: b               #0x716680
  }
}
