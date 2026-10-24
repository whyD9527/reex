// lib: , url: MCh

// class id: 1048893, size: 0x8
class :: {
}

// class id: 1850, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class YS extends Object {

  [closure] static YS? wSb(dynamic, YS?, YS?, double) {
    // ** addr: 0x4ba8c0, size: -0x1
  }
}

// class id: 1851, size: 0x38, field offset: 0x8
//   const constructor, 
class _bT extends YS {

  _Double field_8;
  _Double field_10;
  _Double field_18;
  _Double field_20;
  _Double field_28;
  _Double field_30;
}

// class id: 1852, size: 0x28, field offset: 0x8
//   const constructor, 
class aT extends YS {

  _Double field_8;
  _Mint field_10;
  _Double field_18;
  _Mint field_20;

  aT -(aT, aT) {
    // ** addr: 0x6fa404, size: 0x8c
    // 0x6fa404: EnterFrame
    //     0x6fa404: stp             fp, lr, [SP, #-0x10]!
    //     0x6fa408: mov             fp, SP
    // 0x6fa40c: AllocStack(0x10)
    //     0x6fa40c: sub             SP, SP, #0x10
    // 0x6fa410: CheckStackOverflow
    //     0x6fa410: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6fa414: cmp             SP, x16
    //     0x6fa418: b.ls            #0x6fa470
    // 0x6fa41c: ldr             x0, [fp, #0x10]
    // 0x6fa420: r2 = Null
    //     0x6fa420: mov             x2, NULL
    // 0x6fa424: r1 = Null
    //     0x6fa424: mov             x1, NULL
    // 0x6fa428: r4 = 59
    //     0x6fa428: mov             x4, #0x3b
    // 0x6fa42c: branchIfSmi(r0, 0x6fa438)
    //     0x6fa42c: tbz             w0, #0, #0x6fa438
    // 0x6fa430: r4 = LoadClassIdInstr(r0)
    //     0x6fa430: ldur            x4, [x0, #-1]
    //     0x6fa434: ubfx            x4, x4, #0xc, #0x14
    // 0x6fa438: cmp             x4, #0x73c
    // 0x6fa43c: b.eq            #0x6fa454
    // 0x6fa440: r8 = aT
    //     0x6fa440: add             x8, PP, #0x28, lsl #12  ; [pp+0x28170] Type: aT
    //     0x6fa444: ldr             x8, [x8, #0x170]
    // 0x6fa448: r3 = Null
    //     0x6fa448: add             x3, PP, #0x28, lsl #12  ; [pp+0x28188] Null
    //     0x6fa44c: ldr             x3, [x3, #0x188]
    // 0x6fa450: r0 = DefaultTypeTest()
    //     0x6fa450: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x6fa454: ldr             x16, [fp, #0x18]
    // 0x6fa458: ldr             lr, [fp, #0x10]
    // 0x6fa45c: stp             lr, x16, [SP]
    // 0x6fa460: r0 = call 0x38e8b4
    //     0x6fa460: bl              #0x38e8b4
    // 0x6fa464: LeaveFrame
    //     0x6fa464: mov             SP, fp
    //     0x6fa468: ldp             fp, lr, [SP], #0x10
    // 0x6fa46c: ret
    //     0x6fa46c: ret             
    // 0x6fa470: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6fa470: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6fa474: b               #0x6fa41c
  }
  aT *(aT, double) {
    // ** addr: 0x6fa490, size: 0x5c
    // 0x6fa490: EnterFrame
    //     0x6fa490: stp             fp, lr, [SP, #-0x10]!
    //     0x6fa494: mov             fp, SP
    // 0x6fa498: AllocStack(0x10)
    //     0x6fa498: sub             SP, SP, #0x10
    // 0x6fa49c: CheckStackOverflow
    //     0x6fa49c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6fa4a0: cmp             SP, x16
    //     0x6fa4a4: b.ls            #0x6fa4cc
    // 0x6fa4a8: ldr             x0, [fp, #0x10]
    // 0x6fa4ac: LoadField: d0 = r0->field_7
    //     0x6fa4ac: ldur            d0, [x0, #7]
    // 0x6fa4b0: ldr             x16, [fp, #0x18]
    // 0x6fa4b4: str             x16, [SP, #8]
    // 0x6fa4b8: str             d0, [SP]
    // 0x6fa4bc: r0 = call 0x64ffcc
    //     0x6fa4bc: bl              #0x64ffcc
    // 0x6fa4c0: LeaveFrame
    //     0x6fa4c0: mov             SP, fp
    //     0x6fa4c4: ldp             fp, lr, [SP], #0x10
    // 0x6fa4c8: ret
    //     0x6fa4c8: ret             
    // 0x6fa4cc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6fa4cc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6fa4d0: b               #0x6fa4a8
  }
  aT +(aT, aT) {
    // ** addr: 0x6fa4ec, size: 0x8c
    // 0x6fa4ec: EnterFrame
    //     0x6fa4ec: stp             fp, lr, [SP, #-0x10]!
    //     0x6fa4f0: mov             fp, SP
    // 0x6fa4f4: AllocStack(0x10)
    //     0x6fa4f4: sub             SP, SP, #0x10
    // 0x6fa4f8: CheckStackOverflow
    //     0x6fa4f8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6fa4fc: cmp             SP, x16
    //     0x6fa500: b.ls            #0x6fa558
    // 0x6fa504: ldr             x0, [fp, #0x10]
    // 0x6fa508: r2 = Null
    //     0x6fa508: mov             x2, NULL
    // 0x6fa50c: r1 = Null
    //     0x6fa50c: mov             x1, NULL
    // 0x6fa510: r4 = 59
    //     0x6fa510: mov             x4, #0x3b
    // 0x6fa514: branchIfSmi(r0, 0x6fa520)
    //     0x6fa514: tbz             w0, #0, #0x6fa520
    // 0x6fa518: r4 = LoadClassIdInstr(r0)
    //     0x6fa518: ldur            x4, [x0, #-1]
    //     0x6fa51c: ubfx            x4, x4, #0xc, #0x14
    // 0x6fa520: cmp             x4, #0x73c
    // 0x6fa524: b.eq            #0x6fa53c
    // 0x6fa528: r8 = aT
    //     0x6fa528: add             x8, PP, #0x28, lsl #12  ; [pp+0x28170] Type: aT
    //     0x6fa52c: ldr             x8, [x8, #0x170]
    // 0x6fa530: r3 = Null
    //     0x6fa530: add             x3, PP, #0x28, lsl #12  ; [pp+0x28178] Null
    //     0x6fa534: ldr             x3, [x3, #0x178]
    // 0x6fa538: r0 = DefaultTypeTest()
    //     0x6fa538: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x6fa53c: ldr             x16, [fp, #0x18]
    // 0x6fa540: ldr             lr, [fp, #0x10]
    // 0x6fa544: stp             lr, x16, [SP]
    // 0x6fa548: r0 = call 0x38e938
    //     0x6fa548: bl              #0x38e938
    // 0x6fa54c: LeaveFrame
    //     0x6fa54c: mov             SP, fp
    //     0x6fa550: ldp             fp, lr, [SP], #0x10
    // 0x6fa554: ret
    //     0x6fa554: ret             
    // 0x6fa558: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6fa558: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6fa55c: b               #0x6fa504
  }
}

// class id: 1853, size: 0x28, field offset: 0x8
//   const constructor, 
class ZS extends YS {

  _Double field_8;
  _Double field_10;
  _Double field_18;
  _Double field_20;

  ZS +(ZS, ZS) {
    // ** addr: 0x6d2570, size: 0x8c
    // 0x6d2570: EnterFrame
    //     0x6d2570: stp             fp, lr, [SP, #-0x10]!
    //     0x6d2574: mov             fp, SP
    // 0x6d2578: AllocStack(0x10)
    //     0x6d2578: sub             SP, SP, #0x10
    // 0x6d257c: CheckStackOverflow
    //     0x6d257c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d2580: cmp             SP, x16
    //     0x6d2584: b.ls            #0x6d25dc
    // 0x6d2588: ldr             x0, [fp, #0x10]
    // 0x6d258c: r2 = Null
    //     0x6d258c: mov             x2, NULL
    // 0x6d2590: r1 = Null
    //     0x6d2590: mov             x1, NULL
    // 0x6d2594: r4 = 59
    //     0x6d2594: mov             x4, #0x3b
    // 0x6d2598: branchIfSmi(r0, 0x6d25a4)
    //     0x6d2598: tbz             w0, #0, #0x6d25a4
    // 0x6d259c: r4 = LoadClassIdInstr(r0)
    //     0x6d259c: ldur            x4, [x0, #-1]
    //     0x6d25a0: ubfx            x4, x4, #0xc, #0x14
    // 0x6d25a4: cmp             x4, #0x73d
    // 0x6d25a8: b.eq            #0x6d25c0
    // 0x6d25ac: r8 = ZS
    //     0x6d25ac: add             x8, PP, #0x28, lsl #12  ; [pp+0x28148] Type: ZS
    //     0x6d25b0: ldr             x8, [x8, #0x148]
    // 0x6d25b4: r3 = Null
    //     0x6d25b4: add             x3, PP, #0x28, lsl #12  ; [pp+0x28150] Null
    //     0x6d25b8: ldr             x3, [x3, #0x150]
    // 0x6d25bc: r0 = ZS()
    //     0x6d25bc: bl              #0x6d26cc  ; IsType_ZS_Stub
    // 0x6d25c0: ldr             x16, [fp, #0x18]
    // 0x6d25c4: ldr             lr, [fp, #0x10]
    // 0x6d25c8: stp             lr, x16, [SP]
    // 0x6d25cc: r0 = call 0x239e98
    //     0x6d25cc: bl              #0x239e98
    // 0x6d25d0: LeaveFrame
    //     0x6d25d0: mov             SP, fp
    //     0x6d25d4: ldp             fp, lr, [SP], #0x10
    // 0x6d25d8: ret
    //     0x6d25d8: ret             
    // 0x6d25dc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d25dc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d25e0: b               #0x6d2588
  }
  ZS -(ZS, ZS) {
    // ** addr: 0x6d25fc, size: 0x8c
    // 0x6d25fc: EnterFrame
    //     0x6d25fc: stp             fp, lr, [SP, #-0x10]!
    //     0x6d2600: mov             fp, SP
    // 0x6d2604: AllocStack(0x10)
    //     0x6d2604: sub             SP, SP, #0x10
    // 0x6d2608: CheckStackOverflow
    //     0x6d2608: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d260c: cmp             SP, x16
    //     0x6d2610: b.ls            #0x6d2668
    // 0x6d2614: ldr             x0, [fp, #0x10]
    // 0x6d2618: r2 = Null
    //     0x6d2618: mov             x2, NULL
    // 0x6d261c: r1 = Null
    //     0x6d261c: mov             x1, NULL
    // 0x6d2620: r4 = 59
    //     0x6d2620: mov             x4, #0x3b
    // 0x6d2624: branchIfSmi(r0, 0x6d2630)
    //     0x6d2624: tbz             w0, #0, #0x6d2630
    // 0x6d2628: r4 = LoadClassIdInstr(r0)
    //     0x6d2628: ldur            x4, [x0, #-1]
    //     0x6d262c: ubfx            x4, x4, #0xc, #0x14
    // 0x6d2630: cmp             x4, #0x73d
    // 0x6d2634: b.eq            #0x6d264c
    // 0x6d2638: r8 = ZS
    //     0x6d2638: add             x8, PP, #0x28, lsl #12  ; [pp+0x28148] Type: ZS
    //     0x6d263c: ldr             x8, [x8, #0x148]
    // 0x6d2640: r3 = Null
    //     0x6d2640: add             x3, PP, #0x28, lsl #12  ; [pp+0x28160] Null
    //     0x6d2644: ldr             x3, [x3, #0x160]
    // 0x6d2648: r0 = ZS()
    //     0x6d2648: bl              #0x6d26cc  ; IsType_ZS_Stub
    // 0x6d264c: ldr             x16, [fp, #0x18]
    // 0x6d2650: ldr             lr, [fp, #0x10]
    // 0x6d2654: stp             lr, x16, [SP]
    // 0x6d2658: r0 = call 0x239f1c
    //     0x6d2658: bl              #0x239f1c
    // 0x6d265c: LeaveFrame
    //     0x6d265c: mov             SP, fp
    //     0x6d2660: ldp             fp, lr, [SP], #0x10
    // 0x6d2664: ret
    //     0x6d2664: ret             
    // 0x6d2668: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d2668: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d266c: b               #0x6d2614
  }
  ZS *(ZS, double) {
    // ** addr: 0x6d2688, size: 0x5c
    // 0x6d2688: EnterFrame
    //     0x6d2688: stp             fp, lr, [SP, #-0x10]!
    //     0x6d268c: mov             fp, SP
    // 0x6d2690: AllocStack(0x10)
    //     0x6d2690: sub             SP, SP, #0x10
    // 0x6d2694: CheckStackOverflow
    //     0x6d2694: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d2698: cmp             SP, x16
    //     0x6d269c: b.ls            #0x6d26c4
    // 0x6d26a0: ldr             x0, [fp, #0x10]
    // 0x6d26a4: LoadField: d0 = r0->field_7
    //     0x6d26a4: ldur            d0, [x0, #7]
    // 0x6d26a8: ldr             x16, [fp, #0x18]
    // 0x6d26ac: str             x16, [SP, #8]
    // 0x6d26b0: str             d0, [SP]
    // 0x6d26b4: r0 = call 0x64ff58
    //     0x6d26b4: bl              #0x64ff58
    // 0x6d26b8: LeaveFrame
    //     0x6d26b8: mov             SP, fp
    //     0x6d26bc: ldp             fp, lr, [SP], #0x10
    // 0x6d26c0: ret
    //     0x6d26c0: ret             
    // 0x6d26c4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d26c4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d26c8: b               #0x6d26a0
  }
}
