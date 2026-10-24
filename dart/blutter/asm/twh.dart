// lib: , url: Twh

// class id: 1048639, size: 0x8
class :: {
}

// class id: 3968, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class Pu extends Object {

  [closure] void idb(dynamic, Hu, Ou) {
    // ** addr: 0x62524c, size: -0x1
  }
  [closure] void HIe(dynamic, dv<dynamic>, Nu) {
    // ** addr: 0x625180, size: -0x1
  }
}

// class id: 3971, size: 0x10, field offset: 0x8
abstract class _Lu extends Object {
}

// class id: 3972, size: 0x10, field offset: 0x10
class Ou extends _Lu {
}

// class id: 3973, size: 0x10, field offset: 0x10
class Nu extends _Lu {
}

// class id: 3974, size: 0x10, field offset: 0x10
class Mu extends _Lu {
}

// class id: 3975, size: 0x14, field offset: 0x8
//   const constructor, 
class Ku<X0> extends Object {
}

// class id: 3976, size: 0x8, field offset: 0x8
abstract class Iu extends Object
    implements Du {
}

// class id: 4924, size: 0x14, field offset: 0x14
enum Ju extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 5041, size: 0x10, field offset: 0xc
class Qu extends B<dynamic> {

  void []=(Qu, int, Pu) {
    // ** addr: 0x702150, size: 0x200
    // 0x702150: EnterFrame
    //     0x702150: stp             fp, lr, [SP, #-0x10]!
    //     0x702154: mov             fp, SP
    // 0x702158: AllocStack(0x20)
    //     0x702158: sub             SP, SP, #0x20
    // 0x70215c: CheckStackOverflow
    //     0x70215c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x702160: cmp             SP, x16
    //     0x702164: b.ls            #0x702328
    // 0x702168: ldr             x0, [fp, #0x18]
    // 0x70216c: r2 = Null
    //     0x70216c: mov             x2, NULL
    // 0x702170: r1 = Null
    //     0x702170: mov             x1, NULL
    // 0x702174: branchIfSmi(r0, 0x70219c)
    //     0x702174: tbz             w0, #0, #0x70219c
    // 0x702178: r4 = LoadClassIdInstr(r0)
    //     0x702178: ldur            x4, [x0, #-1]
    //     0x70217c: ubfx            x4, x4, #0xc, #0x14
    // 0x702180: sub             x4, x4, #0x3b
    // 0x702184: cmp             x4, #1
    // 0x702188: b.ls            #0x70219c
    // 0x70218c: r8 = int
    //     0x70218c: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x702190: r3 = Null
    //     0x702190: add             x3, PP, #0x30, lsl #12  ; [pp+0x30b68] Null
    //     0x702194: ldr             x3, [x3, #0xb68]
    // 0x702198: r0 = int()
    //     0x702198: bl              #0x7586bc  ; IsType_int_Stub
    // 0x70219c: ldr             x0, [fp, #0x10]
    // 0x7021a0: r2 = Null
    //     0x7021a0: mov             x2, NULL
    // 0x7021a4: r1 = Null
    //     0x7021a4: mov             x1, NULL
    // 0x7021a8: r4 = 59
    //     0x7021a8: mov             x4, #0x3b
    // 0x7021ac: branchIfSmi(r0, 0x7021b8)
    //     0x7021ac: tbz             w0, #0, #0x7021b8
    // 0x7021b0: r4 = LoadClassIdInstr(r0)
    //     0x7021b0: ldur            x4, [x0, #-1]
    //     0x7021b4: ubfx            x4, x4, #0xc, #0x14
    // 0x7021b8: sub             x4, x4, #0xf81
    // 0x7021bc: cmp             x4, #1
    // 0x7021c0: b.ls            #0x7021d8
    // 0x7021c4: r8 = Pu
    //     0x7021c4: add             x8, PP, #0x23, lsl #12  ; [pp+0x23460] Type: Pu
    //     0x7021c8: ldr             x8, [x8, #0x460]
    // 0x7021cc: r3 = Null
    //     0x7021cc: add             x3, PP, #0x30, lsl #12  ; [pp+0x30b78] Null
    //     0x7021d0: ldr             x3, [x3, #0xb78]
    // 0x7021d4: r0 = Pu()
    //     0x7021d4: bl              #0x702338  ; IsType_Pu_Stub
    // 0x7021d8: ldr             x0, [fp, #0x20]
    // 0x7021dc: LoadField: r1 = r0->field_b
    //     0x7021dc: ldur            w1, [x0, #0xb]
    // 0x7021e0: DecompressPointer r1
    //     0x7021e0: add             x1, x1, HEAP, lsl #32
    // 0x7021e4: stur            x1, [fp, #-0x10]
    // 0x7021e8: LoadField: r0 = r1->field_b
    //     0x7021e8: ldur            w0, [x1, #0xb]
    // 0x7021ec: DecompressPointer r0
    //     0x7021ec: add             x0, x0, HEAP, lsl #32
    // 0x7021f0: ldr             x2, [fp, #0x18]
    // 0x7021f4: r3 = LoadInt32Instr(r2)
    //     0x7021f4: sbfx            x3, x2, #1, #0x1f
    //     0x7021f8: tbz             w2, #0, #0x702200
    //     0x7021fc: ldur            x3, [x2, #7]
    // 0x702200: stur            x3, [fp, #-0x18]
    // 0x702204: r2 = LoadInt32Instr(r0)
    //     0x702204: sbfx            x2, x0, #1, #0x1f
    // 0x702208: stur            x2, [fp, #-8]
    // 0x70220c: cmp             x2, x3
    // 0x702210: b.ne            #0x702290
    // 0x702214: LoadField: r0 = r1->field_f
    //     0x702214: ldur            w0, [x1, #0xf]
    // 0x702218: DecompressPointer r0
    //     0x702218: add             x0, x0, HEAP, lsl #32
    // 0x70221c: LoadField: r3 = r0->field_b
    //     0x70221c: ldur            w3, [x0, #0xb]
    // 0x702220: DecompressPointer r3
    //     0x702220: add             x3, x3, HEAP, lsl #32
    // 0x702224: r0 = LoadInt32Instr(r3)
    //     0x702224: sbfx            x0, x3, #1, #0x1f
    // 0x702228: cmp             x2, x0
    // 0x70222c: b.ne            #0x702238
    // 0x702230: str             x1, [SP]
    // 0x702234: r0 = call 0x1f93c8
    //     0x702234: bl              #0x1f93c8
    // 0x702238: ldur            x4, [fp, #-0x10]
    // 0x70223c: ldur            x5, [fp, #-8]
    // 0x702240: add             x0, x5, #1
    // 0x702244: lsl             x1, x0, #1
    // 0x702248: StoreField: r4->field_b = r1
    //     0x702248: stur            w1, [x4, #0xb]
    // 0x70224c: mov             x1, x5
    // 0x702250: cmp             x1, x0
    // 0x702254: b.hs            #0x702330
    // 0x702258: LoadField: r1 = r4->field_f
    //     0x702258: ldur            w1, [x4, #0xf]
    // 0x70225c: DecompressPointer r1
    //     0x70225c: add             x1, x1, HEAP, lsl #32
    // 0x702260: ldr             x0, [fp, #0x10]
    // 0x702264: ArrayStore: r1[r5] = r0  ; List_4
    //     0x702264: add             x25, x1, x5, lsl #2
    //     0x702268: add             x25, x25, #0xf
    //     0x70226c: str             w0, [x25]
    //     0x702270: tbz             w0, #0, #0x70228c
    //     0x702274: ldurb           w16, [x1, #-1]
    //     0x702278: ldurb           w17, [x0, #-1]
    //     0x70227c: and             x16, x17, x16, lsr #2
    //     0x702280: tst             x16, HEAP, lsr #32
    //     0x702284: b.eq            #0x70228c
    //     0x702288: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x70228c: b               #0x702318
    // 0x702290: mov             x4, x1
    // 0x702294: mov             x5, x2
    // 0x702298: LoadField: r2 = r4->field_7
    //     0x702298: ldur            w2, [x4, #7]
    // 0x70229c: DecompressPointer r2
    //     0x70229c: add             x2, x2, HEAP, lsl #32
    // 0x7022a0: ldr             x0, [fp, #0x10]
    // 0x7022a4: r1 = Null
    //     0x7022a4: mov             x1, NULL
    // 0x7022a8: cmp             w2, NULL
    // 0x7022ac: b.eq            #0x7022cc
    // 0x7022b0: ArrayLoad: r4 = r2[0]  ; List_4
    //     0x7022b0: ldur            w4, [x2, #0x17]
    // 0x7022b4: DecompressPointer r4
    //     0x7022b4: add             x4, x4, HEAP, lsl #32
    // 0x7022b8: r8 = X0
    //     0x7022b8: ldr             x8, [PP, #0x158]  ; [pp+0x158] TypeParameter: X0
    // 0x7022bc: LoadField: r9 = r4->field_7
    //     0x7022bc: ldur            x9, [x4, #7]
    // 0x7022c0: r3 = Null
    //     0x7022c0: add             x3, PP, #0x30, lsl #12  ; [pp+0x30b88] Null
    //     0x7022c4: ldr             x3, [x3, #0xb88]
    // 0x7022c8: blr             x9
    // 0x7022cc: ldur            x0, [fp, #-8]
    // 0x7022d0: ldur            x1, [fp, #-0x18]
    // 0x7022d4: cmp             x1, x0
    // 0x7022d8: b.hs            #0x702334
    // 0x7022dc: ldur            x2, [fp, #-0x10]
    // 0x7022e0: LoadField: r1 = r2->field_f
    //     0x7022e0: ldur            w1, [x2, #0xf]
    // 0x7022e4: DecompressPointer r1
    //     0x7022e4: add             x1, x1, HEAP, lsl #32
    // 0x7022e8: ldr             x0, [fp, #0x10]
    // 0x7022ec: ldur            x2, [fp, #-0x18]
    // 0x7022f0: ArrayStore: r1[r2] = r0  ; List_4
    //     0x7022f0: add             x25, x1, x2, lsl #2
    //     0x7022f4: add             x25, x25, #0xf
    //     0x7022f8: str             w0, [x25]
    //     0x7022fc: tbz             w0, #0, #0x702318
    //     0x702300: ldurb           w16, [x1, #-1]
    //     0x702304: ldurb           w17, [x0, #-1]
    //     0x702308: and             x16, x17, x16, lsr #2
    //     0x70230c: tst             x16, HEAP, lsr #32
    //     0x702310: b.eq            #0x702318
    //     0x702314: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x702318: r0 = Null
    //     0x702318: mov             x0, NULL
    // 0x70231c: LeaveFrame
    //     0x70231c: mov             SP, fp
    //     0x702320: ldp             fp, lr, [SP], #0x10
    // 0x702324: ret
    //     0x702324: ret             
    // 0x702328: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x702328: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x70232c: b               #0x702168
    // 0x702330: r0 = RangeErrorSharedWithoutFPURegs()
    //     0x702330: bl              #0x74d1ac  ; RangeErrorSharedWithoutFPURegsStub
    // 0x702334: r0 = RangeErrorSharedWithoutFPURegs()
    //     0x702334: bl              #0x74d1ac  ; RangeErrorSharedWithoutFPURegsStub
  }
  Pu [](Qu, int) {
    // ** addr: 0x702374, size: 0xb8
    // 0x702374: EnterFrame
    //     0x702374: stp             fp, lr, [SP, #-0x10]!
    //     0x702378: mov             fp, SP
    // 0x70237c: ldr             x0, [fp, #0x10]
    // 0x702380: r2 = Null
    //     0x702380: mov             x2, NULL
    // 0x702384: r1 = Null
    //     0x702384: mov             x1, NULL
    // 0x702388: branchIfSmi(r0, 0x7023b0)
    //     0x702388: tbz             w0, #0, #0x7023b0
    // 0x70238c: r4 = LoadClassIdInstr(r0)
    //     0x70238c: ldur            x4, [x0, #-1]
    //     0x702390: ubfx            x4, x4, #0xc, #0x14
    // 0x702394: sub             x4, x4, #0x3b
    // 0x702398: cmp             x4, #1
    // 0x70239c: b.ls            #0x7023b0
    // 0x7023a0: r8 = int
    //     0x7023a0: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x7023a4: r3 = Null
    //     0x7023a4: add             x3, PP, #0x23, lsl #12  ; [pp+0x23488] Null
    //     0x7023a8: ldr             x3, [x3, #0x488]
    // 0x7023ac: r0 = int()
    //     0x7023ac: bl              #0x7586bc  ; IsType_int_Stub
    // 0x7023b0: ldr             x2, [fp, #0x18]
    // 0x7023b4: LoadField: r3 = r2->field_b
    //     0x7023b4: ldur            w3, [x2, #0xb]
    // 0x7023b8: DecompressPointer r3
    //     0x7023b8: add             x3, x3, HEAP, lsl #32
    // 0x7023bc: LoadField: r2 = r3->field_b
    //     0x7023bc: ldur            w2, [x3, #0xb]
    // 0x7023c0: DecompressPointer r2
    //     0x7023c0: add             x2, x2, HEAP, lsl #32
    // 0x7023c4: ldr             x4, [fp, #0x10]
    // 0x7023c8: r5 = LoadInt32Instr(r4)
    //     0x7023c8: sbfx            x5, x4, #1, #0x1f
    //     0x7023cc: tbz             w4, #0, #0x7023d4
    //     0x7023d0: ldur            x5, [x4, #7]
    // 0x7023d4: r0 = LoadInt32Instr(r2)
    //     0x7023d4: sbfx            x0, x2, #1, #0x1f
    // 0x7023d8: mov             x1, x5
    // 0x7023dc: cmp             x1, x0
    // 0x7023e0: b.hs            #0x70240c
    // 0x7023e4: LoadField: r1 = r3->field_f
    //     0x7023e4: ldur            w1, [x3, #0xf]
    // 0x7023e8: DecompressPointer r1
    //     0x7023e8: add             x1, x1, HEAP, lsl #32
    // 0x7023ec: ArrayLoad: r0 = r1[r5]  ; Unknown_4
    //     0x7023ec: add             x16, x1, x5, lsl #2
    //     0x7023f0: ldur            w0, [x16, #0xf]
    // 0x7023f4: DecompressPointer r0
    //     0x7023f4: add             x0, x0, HEAP, lsl #32
    // 0x7023f8: cmp             w0, NULL
    // 0x7023fc: b.eq            #0x702410
    // 0x702400: LeaveFrame
    //     0x702400: mov             SP, fp
    //     0x702404: ldp             fp, lr, [SP], #0x10
    // 0x702408: ret
    //     0x702408: ret             
    // 0x70240c: r0 = RangeErrorSharedWithoutFPURegs()
    //     0x70240c: bl              #0x74d1ac  ; RangeErrorSharedWithoutFPURegsStub
    // 0x702410: r0 = NullCastErrorSharedWithoutFPURegs()
    //     0x702410: bl              #0x74d30c  ; NullCastErrorSharedWithoutFPURegsStub
  }
}
