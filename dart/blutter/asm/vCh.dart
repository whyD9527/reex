// lib: , url: vCh

// class id: 1048879, size: 0x8
class :: {
}

// class id: 1870, size: 0x10, field offset: 0x8
//   const constructor, 
class kS extends Object {

  _Mint field_8;
}

// class id: 1871, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class gS extends Object {
}

// class id: 1872, size: 0x20, field offset: 0x8
//   const constructor, 
class _jS extends gS {
}

// class id: 1873, size: 0x18, field offset: 0x8
//   const constructor, 
class iS extends gS {

  _Double field_8;
  _Double field_10;

  iS -(iS, iS) {
    // ** addr: 0x6d5620, size: 0x8c
    // 0x6d5620: EnterFrame
    //     0x6d5620: stp             fp, lr, [SP, #-0x10]!
    //     0x6d5624: mov             fp, SP
    // 0x6d5628: AllocStack(0x10)
    //     0x6d5628: sub             SP, SP, #0x10
    // 0x6d562c: CheckStackOverflow
    //     0x6d562c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d5630: cmp             SP, x16
    //     0x6d5634: b.ls            #0x6d568c
    // 0x6d5638: ldr             x0, [fp, #0x10]
    // 0x6d563c: r2 = Null
    //     0x6d563c: mov             x2, NULL
    // 0x6d5640: r1 = Null
    //     0x6d5640: mov             x1, NULL
    // 0x6d5644: r4 = 59
    //     0x6d5644: mov             x4, #0x3b
    // 0x6d5648: branchIfSmi(r0, 0x6d5654)
    //     0x6d5648: tbz             w0, #0, #0x6d5654
    // 0x6d564c: r4 = LoadClassIdInstr(r0)
    //     0x6d564c: ldur            x4, [x0, #-1]
    //     0x6d5650: ubfx            x4, x4, #0xc, #0x14
    // 0x6d5654: cmp             x4, #0x751
    // 0x6d5658: b.eq            #0x6d5670
    // 0x6d565c: r8 = iS
    //     0x6d565c: add             x8, PP, #0x28, lsl #12  ; [pp+0x281f0] Type: iS
    //     0x6d5660: ldr             x8, [x8, #0x1f0]
    // 0x6d5664: r3 = Null
    //     0x6d5664: add             x3, PP, #0x28, lsl #12  ; [pp+0x28208] Null
    //     0x6d5668: ldr             x3, [x3, #0x208]
    // 0x6d566c: r0 = DefaultTypeTest()
    //     0x6d566c: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x6d5670: ldr             x16, [fp, #0x18]
    // 0x6d5674: ldr             lr, [fp, #0x10]
    // 0x6d5678: stp             lr, x16, [SP]
    // 0x6d567c: r0 = call 0x27cc5c
    //     0x6d567c: bl              #0x27cc5c
    // 0x6d5680: LeaveFrame
    //     0x6d5680: mov             SP, fp
    //     0x6d5684: ldp             fp, lr, [SP], #0x10
    // 0x6d5688: ret
    //     0x6d5688: ret             
    // 0x6d568c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d568c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d5690: b               #0x6d5638
  }
  iS +(iS, iS) {
    // ** addr: 0x6d56b8, size: 0x8c
    // 0x6d56b8: EnterFrame
    //     0x6d56b8: stp             fp, lr, [SP, #-0x10]!
    //     0x6d56bc: mov             fp, SP
    // 0x6d56c0: AllocStack(0x10)
    //     0x6d56c0: sub             SP, SP, #0x10
    // 0x6d56c4: CheckStackOverflow
    //     0x6d56c4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d56c8: cmp             SP, x16
    //     0x6d56cc: b.ls            #0x6d5724
    // 0x6d56d0: ldr             x0, [fp, #0x10]
    // 0x6d56d4: r2 = Null
    //     0x6d56d4: mov             x2, NULL
    // 0x6d56d8: r1 = Null
    //     0x6d56d8: mov             x1, NULL
    // 0x6d56dc: r4 = 59
    //     0x6d56dc: mov             x4, #0x3b
    // 0x6d56e0: branchIfSmi(r0, 0x6d56ec)
    //     0x6d56e0: tbz             w0, #0, #0x6d56ec
    // 0x6d56e4: r4 = LoadClassIdInstr(r0)
    //     0x6d56e4: ldur            x4, [x0, #-1]
    //     0x6d56e8: ubfx            x4, x4, #0xc, #0x14
    // 0x6d56ec: cmp             x4, #0x751
    // 0x6d56f0: b.eq            #0x6d5708
    // 0x6d56f4: r8 = iS
    //     0x6d56f4: add             x8, PP, #0x28, lsl #12  ; [pp+0x281f0] Type: iS
    //     0x6d56f8: ldr             x8, [x8, #0x1f0]
    // 0x6d56fc: r3 = Null
    //     0x6d56fc: add             x3, PP, #0x28, lsl #12  ; [pp+0x281f8] Null
    //     0x6d5700: ldr             x3, [x3, #0x1f8]
    // 0x6d5704: r0 = DefaultTypeTest()
    //     0x6d5704: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x6d5708: ldr             x16, [fp, #0x18]
    // 0x6d570c: ldr             lr, [fp, #0x10]
    // 0x6d5710: stp             lr, x16, [SP]
    // 0x6d5714: r0 = call 0x27ccb0
    //     0x6d5714: bl              #0x27ccb0
    // 0x6d5718: LeaveFrame
    //     0x6d5718: mov             SP, fp
    //     0x6d571c: ldp             fp, lr, [SP], #0x10
    // 0x6d5720: ret
    //     0x6d5720: ret             
    // 0x6d5724: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d5724: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d5728: b               #0x6d56d0
  }
  iS *(iS, double) {
    // ** addr: 0x6d5744, size: 0x5c
    // 0x6d5744: EnterFrame
    //     0x6d5744: stp             fp, lr, [SP, #-0x10]!
    //     0x6d5748: mov             fp, SP
    // 0x6d574c: AllocStack(0x10)
    //     0x6d574c: sub             SP, SP, #0x10
    // 0x6d5750: CheckStackOverflow
    //     0x6d5750: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d5754: cmp             SP, x16
    //     0x6d5758: b.ls            #0x6d5780
    // 0x6d575c: ldr             x0, [fp, #0x10]
    // 0x6d5760: LoadField: d0 = r0->field_7
    //     0x6d5760: ldur            d0, [x0, #7]
    // 0x6d5764: ldr             x16, [fp, #0x18]
    // 0x6d5768: str             x16, [SP, #8]
    // 0x6d576c: str             d0, [SP]
    // 0x6d5770: r0 = call 0x64ea00
    //     0x6d5770: bl              #0x64ea00
    // 0x6d5774: LeaveFrame
    //     0x6d5774: mov             SP, fp
    //     0x6d5778: ldp             fp, lr, [SP], #0x10
    // 0x6d577c: ret
    //     0x6d577c: ret             
    // 0x6d5780: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d5780: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d5784: b               #0x6d575c
  }
}

// class id: 1874, size: 0x18, field offset: 0x8
//   const constructor, 
class hS extends gS {

  _Double field_8;
  _Double field_10;

  hS -(hS, hS) {
    // ** addr: 0x6d4608, size: 0x90
    // 0x6d4608: EnterFrame
    //     0x6d4608: stp             fp, lr, [SP, #-0x10]!
    //     0x6d460c: mov             fp, SP
    // 0x6d4610: AllocStack(0x10)
    //     0x6d4610: sub             SP, SP, #0x10
    // 0x6d4614: CheckStackOverflow
    //     0x6d4614: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d4618: cmp             SP, x16
    //     0x6d461c: b.ls            #0x6d4678
    // 0x6d4620: ldr             x0, [fp, #0x10]
    // 0x6d4624: r2 = Null
    //     0x6d4624: mov             x2, NULL
    // 0x6d4628: r1 = Null
    //     0x6d4628: mov             x1, NULL
    // 0x6d462c: r4 = 59
    //     0x6d462c: mov             x4, #0x3b
    // 0x6d4630: branchIfSmi(r0, 0x6d463c)
    //     0x6d4630: tbz             w0, #0, #0x6d463c
    // 0x6d4634: r4 = LoadClassIdInstr(r0)
    //     0x6d4634: ldur            x4, [x0, #-1]
    //     0x6d4638: ubfx            x4, x4, #0xc, #0x14
    // 0x6d463c: sub             x4, x4, #0x752
    // 0x6d4640: cmp             x4, #1
    // 0x6d4644: b.ls            #0x6d465c
    // 0x6d4648: r8 = hS
    //     0x6d4648: add             x8, PP, #0x28, lsl #12  ; [pp+0x28120] Type: hS
    //     0x6d464c: ldr             x8, [x8, #0x120]
    // 0x6d4650: r3 = Null
    //     0x6d4650: add             x3, PP, #0x28, lsl #12  ; [pp+0x281e0] Null
    //     0x6d4654: ldr             x3, [x3, #0x1e0]
    // 0x6d4658: r0 = DefaultTypeTest()
    //     0x6d4658: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x6d465c: ldr             x16, [fp, #0x18]
    // 0x6d4660: ldr             lr, [fp, #0x10]
    // 0x6d4664: stp             lr, x16, [SP]
    // 0x6d4668: r0 = call 0x25ee90
    //     0x6d4668: bl              #0x25ee90
    // 0x6d466c: LeaveFrame
    //     0x6d466c: mov             SP, fp
    //     0x6d4670: ldp             fp, lr, [SP], #0x10
    // 0x6d4674: ret
    //     0x6d4674: ret             
    // 0x6d4678: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d4678: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d467c: b               #0x6d4620
  }
  hS *(hS, double) {
    // ** addr: 0x6d4698, size: 0x5c
    // 0x6d4698: EnterFrame
    //     0x6d4698: stp             fp, lr, [SP, #-0x10]!
    //     0x6d469c: mov             fp, SP
    // 0x6d46a0: AllocStack(0x10)
    //     0x6d46a0: sub             SP, SP, #0x10
    // 0x6d46a4: CheckStackOverflow
    //     0x6d46a4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d46a8: cmp             SP, x16
    //     0x6d46ac: b.ls            #0x6d46d4
    // 0x6d46b0: ldr             x0, [fp, #0x10]
    // 0x6d46b4: LoadField: d0 = r0->field_7
    //     0x6d46b4: ldur            d0, [x0, #7]
    // 0x6d46b8: ldr             x16, [fp, #0x18]
    // 0x6d46bc: str             x16, [SP, #8]
    // 0x6d46c0: str             d0, [SP]
    // 0x6d46c4: r0 = call 0x64e9b4
    //     0x6d46c4: bl              #0x64e9b4
    // 0x6d46c8: LeaveFrame
    //     0x6d46c8: mov             SP, fp
    //     0x6d46cc: ldp             fp, lr, [SP], #0x10
    // 0x6d46d0: ret
    //     0x6d46d0: ret             
    // 0x6d46d4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d46d4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d46d8: b               #0x6d46b0
  }
  hS +(hS, hS) {
    // ** addr: 0x6d46f4, size: 0x90
    // 0x6d46f4: EnterFrame
    //     0x6d46f4: stp             fp, lr, [SP, #-0x10]!
    //     0x6d46f8: mov             fp, SP
    // 0x6d46fc: AllocStack(0x10)
    //     0x6d46fc: sub             SP, SP, #0x10
    // 0x6d4700: CheckStackOverflow
    //     0x6d4700: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d4704: cmp             SP, x16
    //     0x6d4708: b.ls            #0x6d4764
    // 0x6d470c: ldr             x0, [fp, #0x10]
    // 0x6d4710: r2 = Null
    //     0x6d4710: mov             x2, NULL
    // 0x6d4714: r1 = Null
    //     0x6d4714: mov             x1, NULL
    // 0x6d4718: r4 = 59
    //     0x6d4718: mov             x4, #0x3b
    // 0x6d471c: branchIfSmi(r0, 0x6d4728)
    //     0x6d471c: tbz             w0, #0, #0x6d4728
    // 0x6d4720: r4 = LoadClassIdInstr(r0)
    //     0x6d4720: ldur            x4, [x0, #-1]
    //     0x6d4724: ubfx            x4, x4, #0xc, #0x14
    // 0x6d4728: sub             x4, x4, #0x752
    // 0x6d472c: cmp             x4, #1
    // 0x6d4730: b.ls            #0x6d4748
    // 0x6d4734: r8 = hS
    //     0x6d4734: add             x8, PP, #0x28, lsl #12  ; [pp+0x28120] Type: hS
    //     0x6d4738: ldr             x8, [x8, #0x120]
    // 0x6d473c: r3 = Null
    //     0x6d473c: add             x3, PP, #0x28, lsl #12  ; [pp+0x281d0] Null
    //     0x6d4740: ldr             x3, [x3, #0x1d0]
    // 0x6d4744: r0 = DefaultTypeTest()
    //     0x6d4744: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x6d4748: ldr             x16, [fp, #0x18]
    // 0x6d474c: ldr             lr, [fp, #0x10]
    // 0x6d4750: stp             lr, x16, [SP]
    // 0x6d4754: r0 = call 0x25eee4
    //     0x6d4754: bl              #0x25eee4
    // 0x6d4758: LeaveFrame
    //     0x6d4758: mov             SP, fp
    //     0x6d475c: ldp             fp, lr, [SP], #0x10
    // 0x6d4760: ret
    //     0x6d4760: ret             
    // 0x6d4764: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d4764: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d4768: b               #0x6d470c
  }
}
