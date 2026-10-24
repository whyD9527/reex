// lib: ZQh, url: OPh

// class id: 1049536, size: 0x8
class :: {
}

// class id: 269, size: 0xc, field offset: 0x8
class kUa extends Object
    implements iUa {

  kUa *(kUa, double) {
    // ** addr: 0x6d431c, size: 0x5c
    // 0x6d431c: EnterFrame
    //     0x6d431c: stp             fp, lr, [SP, #-0x10]!
    //     0x6d4320: mov             fp, SP
    // 0x6d4324: AllocStack(0x10)
    //     0x6d4324: sub             SP, SP, #0x10
    // 0x6d4328: CheckStackOverflow
    //     0x6d4328: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d432c: cmp             SP, x16
    //     0x6d4330: b.ls            #0x6d4358
    // 0x6d4334: ldr             x0, [fp, #0x10]
    // 0x6d4338: LoadField: d0 = r0->field_7
    //     0x6d4338: ldur            d0, [x0, #7]
    // 0x6d433c: ldr             x16, [fp, #0x18]
    // 0x6d4340: str             x16, [SP, #8]
    // 0x6d4344: str             d0, [SP]
    // 0x6d4348: r0 = call 0x25e660
    //     0x6d4348: bl              #0x25e660
    // 0x6d434c: LeaveFrame
    //     0x6d434c: mov             SP, fp
    //     0x6d4350: ldp             fp, lr, [SP], #0x10
    // 0x6d4354: ret
    //     0x6d4354: ret             
    // 0x6d4358: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d4358: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d435c: b               #0x6d4334
  }
  double [](kUa, int) {
    // ** addr: 0x6d4378, size: 0xd8
    // 0x6d4378: EnterFrame
    //     0x6d4378: stp             fp, lr, [SP, #-0x10]!
    //     0x6d437c: mov             fp, SP
    // 0x6d4380: ldr             x0, [fp, #0x10]
    // 0x6d4384: r2 = Null
    //     0x6d4384: mov             x2, NULL
    // 0x6d4388: r1 = Null
    //     0x6d4388: mov             x1, NULL
    // 0x6d438c: branchIfSmi(r0, 0x6d43b4)
    //     0x6d438c: tbz             w0, #0, #0x6d43b4
    // 0x6d4390: r4 = LoadClassIdInstr(r0)
    //     0x6d4390: ldur            x4, [x0, #-1]
    //     0x6d4394: ubfx            x4, x4, #0xc, #0x14
    // 0x6d4398: sub             x4, x4, #0x3b
    // 0x6d439c: cmp             x4, #1
    // 0x6d43a0: b.ls            #0x6d43b4
    // 0x6d43a4: r8 = int
    //     0x6d43a4: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x6d43a8: r3 = Null
    //     0x6d43a8: add             x3, PP, #0x20, lsl #12  ; [pp+0x20d88] Null
    //     0x6d43ac: ldr             x3, [x3, #0xd88]
    // 0x6d43b0: r0 = int()
    //     0x6d43b0: bl              #0x7586bc  ; IsType_int_Stub
    // 0x6d43b4: ldr             x2, [fp, #0x18]
    // 0x6d43b8: LoadField: r3 = r2->field_7
    //     0x6d43b8: ldur            w3, [x2, #7]
    // 0x6d43bc: DecompressPointer r3
    //     0x6d43bc: add             x3, x3, HEAP, lsl #32
    // 0x6d43c0: LoadField: r2 = r3->field_13
    //     0x6d43c0: ldur            w2, [x3, #0x13]
    // 0x6d43c4: DecompressPointer r2
    //     0x6d43c4: add             x2, x2, HEAP, lsl #32
    // 0x6d43c8: ldr             x4, [fp, #0x10]
    // 0x6d43cc: r5 = LoadInt32Instr(r4)
    //     0x6d43cc: sbfx            x5, x4, #1, #0x1f
    //     0x6d43d0: tbz             w4, #0, #0x6d43d8
    //     0x6d43d4: ldur            x5, [x4, #7]
    // 0x6d43d8: r0 = LoadInt32Instr(r2)
    //     0x6d43d8: sbfx            x0, x2, #1, #0x1f
    // 0x6d43dc: mov             x1, x5
    // 0x6d43e0: cmp             x1, x0
    // 0x6d43e4: b.hs            #0x6d4424
    // 0x6d43e8: ArrayLoad: d0 = r3[r5]  ; List_8
    //     0x6d43e8: add             x16, x3, x5, lsl #3
    //     0x6d43ec: ldur            d0, [x16, #0x17]
    // 0x6d43f0: r0 = inline_Allocate_Double()
    //     0x6d43f0: ldp             x0, x1, [THR, #0x50]  ; THR::top
    //     0x6d43f4: add             x0, x0, #0x10
    //     0x6d43f8: cmp             x1, x0
    //     0x6d43fc: b.ls            #0x6d4428
    //     0x6d4400: str             x0, [THR, #0x50]  ; THR::top
    //     0x6d4404: sub             x0, x0, #0xf
    //     0x6d4408: mov             x1, #0xd148
    //     0x6d440c: movk            x1, #3, lsl #16
    //     0x6d4410: stur            x1, [x0, #-1]
    // 0x6d4414: StoreField: r0->field_7 = d0
    //     0x6d4414: stur            d0, [x0, #7]
    // 0x6d4418: LeaveFrame
    //     0x6d4418: mov             SP, fp
    //     0x6d441c: ldp             fp, lr, [SP], #0x10
    // 0x6d4420: ret
    //     0x6d4420: ret             
    // 0x6d4424: r0 = RangeErrorSharedWithoutFPURegs()
    //     0x6d4424: bl              #0x74d1ac  ; RangeErrorSharedWithoutFPURegsStub
    // 0x6d4428: SaveReg d0
    //     0x6d4428: str             q0, [SP, #-0x10]!
    // 0x6d442c: r0 = AllocateDouble()
    //     0x6d442c: bl              #0x74cbc0  ; AllocateDoubleStub
    // 0x6d4430: RestoreReg d0
    //     0x6d4430: ldr             q0, [SP], #0x10
    // 0x6d4434: b               #0x6d4414
  }
  kUa +(kUa, kUa) {
    // ** addr: 0x6d4450, size: 0x8c
    // 0x6d4450: EnterFrame
    //     0x6d4450: stp             fp, lr, [SP, #-0x10]!
    //     0x6d4454: mov             fp, SP
    // 0x6d4458: AllocStack(0x10)
    //     0x6d4458: sub             SP, SP, #0x10
    // 0x6d445c: CheckStackOverflow
    //     0x6d445c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d4460: cmp             SP, x16
    //     0x6d4464: b.ls            #0x6d44bc
    // 0x6d4468: ldr             x0, [fp, #0x10]
    // 0x6d446c: r2 = Null
    //     0x6d446c: mov             x2, NULL
    // 0x6d4470: r1 = Null
    //     0x6d4470: mov             x1, NULL
    // 0x6d4474: r4 = 59
    //     0x6d4474: mov             x4, #0x3b
    // 0x6d4478: branchIfSmi(r0, 0x6d4484)
    //     0x6d4478: tbz             w0, #0, #0x6d4484
    // 0x6d447c: r4 = LoadClassIdInstr(r0)
    //     0x6d447c: ldur            x4, [x0, #-1]
    //     0x6d4480: ubfx            x4, x4, #0xc, #0x14
    // 0x6d4484: cmp             x4, #0x10d
    // 0x6d4488: b.eq            #0x6d44a0
    // 0x6d448c: r8 = kUa
    //     0x6d448c: add             x8, PP, #0x29, lsl #12  ; [pp+0x29350] Type: kUa
    //     0x6d4490: ldr             x8, [x8, #0x350]
    // 0x6d4494: r3 = Null
    //     0x6d4494: add             x3, PP, #0x29, lsl #12  ; [pp+0x29358] Null
    //     0x6d4498: ldr             x3, [x3, #0x358]
    // 0x6d449c: r0 = DefaultTypeTest()
    //     0x6d449c: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x6d44a0: ldr             x16, [fp, #0x18]
    // 0x6d44a4: ldr             lr, [fp, #0x10]
    // 0x6d44a8: stp             lr, x16, [SP]
    // 0x6d44ac: r0 = call 0x25e7f0
    //     0x6d44ac: bl              #0x25e7f0
    // 0x6d44b0: LeaveFrame
    //     0x6d44b0: mov             SP, fp
    //     0x6d44b4: ldp             fp, lr, [SP], #0x10
    // 0x6d44b8: ret
    //     0x6d44b8: ret             
    // 0x6d44bc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d44bc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d44c0: b               #0x6d4468
  }
  void []=(kUa, int, double) {
    // ** addr: 0x6d44dc, size: 0x94
    // 0x6d44dc: EnterFrame
    //     0x6d44dc: stp             fp, lr, [SP, #-0x10]!
    //     0x6d44e0: mov             fp, SP
    // 0x6d44e4: ldr             x0, [fp, #0x18]
    // 0x6d44e8: r2 = Null
    //     0x6d44e8: mov             x2, NULL
    // 0x6d44ec: r1 = Null
    //     0x6d44ec: mov             x1, NULL
    // 0x6d44f0: branchIfSmi(r0, 0x6d4518)
    //     0x6d44f0: tbz             w0, #0, #0x6d4518
    // 0x6d44f4: r4 = LoadClassIdInstr(r0)
    //     0x6d44f4: ldur            x4, [x0, #-1]
    //     0x6d44f8: ubfx            x4, x4, #0xc, #0x14
    // 0x6d44fc: sub             x4, x4, #0x3b
    // 0x6d4500: cmp             x4, #1
    // 0x6d4504: b.ls            #0x6d4518
    // 0x6d4508: r8 = int
    //     0x6d4508: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x6d450c: r3 = Null
    //     0x6d450c: add             x3, PP, #0x31, lsl #12  ; [pp+0x31d28] Null
    //     0x6d4510: ldr             x3, [x3, #0xd28]
    // 0x6d4514: r0 = int()
    //     0x6d4514: bl              #0x7586bc  ; IsType_int_Stub
    // 0x6d4518: ldr             x0, [fp, #0x10]
    // 0x6d451c: r2 = Null
    //     0x6d451c: mov             x2, NULL
    // 0x6d4520: r1 = Null
    //     0x6d4520: mov             x1, NULL
    // 0x6d4524: r4 = 59
    //     0x6d4524: mov             x4, #0x3b
    // 0x6d4528: branchIfSmi(r0, 0x6d4534)
    //     0x6d4528: tbz             w0, #0, #0x6d4534
    // 0x6d452c: r4 = LoadClassIdInstr(r0)
    //     0x6d452c: ldur            x4, [x0, #-1]
    //     0x6d4530: ubfx            x4, x4, #0xc, #0x14
    // 0x6d4534: cmp             x4, #0x3d
    // 0x6d4538: b.eq            #0x6d454c
    // 0x6d453c: r8 = double
    //     0x6d453c: ldr             x8, [PP, #0xca8]  ; [pp+0xca8] Type: double
    // 0x6d4540: r3 = Null
    //     0x6d4540: add             x3, PP, #0x31, lsl #12  ; [pp+0x31d38] Null
    //     0x6d4544: ldr             x3, [x3, #0xd38]
    // 0x6d4548: r0 = double()
    //     0x6d4548: bl              #0x758210  ; IsType_double_Stub
    // 0x6d454c: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x6d454c: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x6d4550: r0 = Throw()
    //     0x6d4550: bl              #0x74b258  ; ThrowStub
    // 0x6d4554: brk             #0
  }
  kUa -(kUa, kUa) {
    // ** addr: 0x6d4570, size: 0x8c
    // 0x6d4570: EnterFrame
    //     0x6d4570: stp             fp, lr, [SP, #-0x10]!
    //     0x6d4574: mov             fp, SP
    // 0x6d4578: AllocStack(0x10)
    //     0x6d4578: sub             SP, SP, #0x10
    // 0x6d457c: CheckStackOverflow
    //     0x6d457c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d4580: cmp             SP, x16
    //     0x6d4584: b.ls            #0x6d45dc
    // 0x6d4588: ldr             x0, [fp, #0x10]
    // 0x6d458c: r2 = Null
    //     0x6d458c: mov             x2, NULL
    // 0x6d4590: r1 = Null
    //     0x6d4590: mov             x1, NULL
    // 0x6d4594: r4 = 59
    //     0x6d4594: mov             x4, #0x3b
    // 0x6d4598: branchIfSmi(r0, 0x6d45a4)
    //     0x6d4598: tbz             w0, #0, #0x6d45a4
    // 0x6d459c: r4 = LoadClassIdInstr(r0)
    //     0x6d459c: ldur            x4, [x0, #-1]
    //     0x6d45a0: ubfx            x4, x4, #0xc, #0x14
    // 0x6d45a4: cmp             x4, #0x10d
    // 0x6d45a8: b.eq            #0x6d45c0
    // 0x6d45ac: r8 = kUa
    //     0x6d45ac: add             x8, PP, #0x29, lsl #12  ; [pp+0x29350] Type: kUa
    //     0x6d45b0: ldr             x8, [x8, #0x350]
    // 0x6d45b4: r3 = Null
    //     0x6d45b4: add             x3, PP, #0x29, lsl #12  ; [pp+0x29368] Null
    //     0x6d45b8: ldr             x3, [x3, #0x368]
    // 0x6d45bc: r0 = DefaultTypeTest()
    //     0x6d45bc: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x6d45c0: ldr             x16, [fp, #0x18]
    // 0x6d45c4: ldr             lr, [fp, #0x10]
    // 0x6d45c8: stp             lr, x16, [SP]
    // 0x6d45cc: r0 = call 0x25e93c
    //     0x6d45cc: bl              #0x25e93c
    // 0x6d45d0: LeaveFrame
    //     0x6d45d0: mov             SP, fp
    //     0x6d45d4: ldp             fp, lr, [SP], #0x10
    // 0x6d45d8: ret
    //     0x6d45d8: ret             
    // 0x6d45dc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d45dc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d45e0: b               #0x6d4588
  }
}

// class id: 270, size: 0xc, field offset: 0x8
class DH extends Object
    implements iUa {

  DH +(DH, DH) {
    // ** addr: 0x6db5e4, size: 0x8c
    // 0x6db5e4: EnterFrame
    //     0x6db5e4: stp             fp, lr, [SP, #-0x10]!
    //     0x6db5e8: mov             fp, SP
    // 0x6db5ec: AllocStack(0x10)
    //     0x6db5ec: sub             SP, SP, #0x10
    // 0x6db5f0: CheckStackOverflow
    //     0x6db5f0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6db5f4: cmp             SP, x16
    //     0x6db5f8: b.ls            #0x6db650
    // 0x6db5fc: ldr             x0, [fp, #0x10]
    // 0x6db600: r2 = Null
    //     0x6db600: mov             x2, NULL
    // 0x6db604: r1 = Null
    //     0x6db604: mov             x1, NULL
    // 0x6db608: r4 = 59
    //     0x6db608: mov             x4, #0x3b
    // 0x6db60c: branchIfSmi(r0, 0x6db618)
    //     0x6db60c: tbz             w0, #0, #0x6db618
    // 0x6db610: r4 = LoadClassIdInstr(r0)
    //     0x6db610: ldur            x4, [x0, #-1]
    //     0x6db614: ubfx            x4, x4, #0xc, #0x14
    // 0x6db618: cmp             x4, #0x10e
    // 0x6db61c: b.eq            #0x6db634
    // 0x6db620: r8 = DH
    //     0x6db620: add             x8, PP, #0x29, lsl #12  ; [pp+0x29328] Type: DH
    //     0x6db624: ldr             x8, [x8, #0x328]
    // 0x6db628: r3 = Null
    //     0x6db628: add             x3, PP, #0x29, lsl #12  ; [pp+0x29330] Null
    //     0x6db62c: ldr             x3, [x3, #0x330]
    // 0x6db630: r0 = DefaultTypeTest()
    //     0x6db630: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x6db634: ldr             x16, [fp, #0x18]
    // 0x6db638: ldr             lr, [fp, #0x10]
    // 0x6db63c: stp             lr, x16, [SP]
    // 0x6db640: r0 = call 0x2c15b4
    //     0x6db640: bl              #0x2c15b4
    // 0x6db644: LeaveFrame
    //     0x6db644: mov             SP, fp
    //     0x6db648: ldp             fp, lr, [SP], #0x10
    // 0x6db64c: ret
    //     0x6db64c: ret             
    // 0x6db650: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6db650: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6db654: b               #0x6db5fc
  }
  DH *(DH, double) {
    // ** addr: 0x6db670, size: 0x5c
    // 0x6db670: EnterFrame
    //     0x6db670: stp             fp, lr, [SP, #-0x10]!
    //     0x6db674: mov             fp, SP
    // 0x6db678: AllocStack(0x10)
    //     0x6db678: sub             SP, SP, #0x10
    // 0x6db67c: CheckStackOverflow
    //     0x6db67c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6db680: cmp             SP, x16
    //     0x6db684: b.ls            #0x6db6ac
    // 0x6db688: ldr             x0, [fp, #0x10]
    // 0x6db68c: LoadField: d0 = r0->field_7
    //     0x6db68c: ldur            d0, [x0, #7]
    // 0x6db690: ldr             x16, [fp, #0x18]
    // 0x6db694: str             x16, [SP, #8]
    // 0x6db698: str             d0, [SP]
    // 0x6db69c: r0 = call 0x2c1210
    //     0x6db69c: bl              #0x2c1210
    // 0x6db6a0: LeaveFrame
    //     0x6db6a0: mov             SP, fp
    //     0x6db6a4: ldp             fp, lr, [SP], #0x10
    // 0x6db6a8: ret
    //     0x6db6a8: ret             
    // 0x6db6ac: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6db6ac: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6db6b0: b               #0x6db688
  }
  DH -(DH, DH) {
    // ** addr: 0x6db6cc, size: 0x8c
    // 0x6db6cc: EnterFrame
    //     0x6db6cc: stp             fp, lr, [SP, #-0x10]!
    //     0x6db6d0: mov             fp, SP
    // 0x6db6d4: AllocStack(0x10)
    //     0x6db6d4: sub             SP, SP, #0x10
    // 0x6db6d8: CheckStackOverflow
    //     0x6db6d8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6db6dc: cmp             SP, x16
    //     0x6db6e0: b.ls            #0x6db738
    // 0x6db6e4: ldr             x0, [fp, #0x10]
    // 0x6db6e8: r2 = Null
    //     0x6db6e8: mov             x2, NULL
    // 0x6db6ec: r1 = Null
    //     0x6db6ec: mov             x1, NULL
    // 0x6db6f0: r4 = 59
    //     0x6db6f0: mov             x4, #0x3b
    // 0x6db6f4: branchIfSmi(r0, 0x6db700)
    //     0x6db6f4: tbz             w0, #0, #0x6db700
    // 0x6db6f8: r4 = LoadClassIdInstr(r0)
    //     0x6db6f8: ldur            x4, [x0, #-1]
    //     0x6db6fc: ubfx            x4, x4, #0xc, #0x14
    // 0x6db700: cmp             x4, #0x10e
    // 0x6db704: b.eq            #0x6db71c
    // 0x6db708: r8 = DH
    //     0x6db708: add             x8, PP, #0x29, lsl #12  ; [pp+0x29328] Type: DH
    //     0x6db70c: ldr             x8, [x8, #0x328]
    // 0x6db710: r3 = Null
    //     0x6db710: add             x3, PP, #0x29, lsl #12  ; [pp+0x29340] Null
    //     0x6db714: ldr             x3, [x3, #0x340]
    // 0x6db718: r0 = DefaultTypeTest()
    //     0x6db718: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x6db71c: ldr             x16, [fp, #0x18]
    // 0x6db720: ldr             lr, [fp, #0x10]
    // 0x6db724: stp             lr, x16, [SP]
    // 0x6db728: r0 = call 0x2c129c
    //     0x6db728: bl              #0x2c129c
    // 0x6db72c: LeaveFrame
    //     0x6db72c: mov             SP, fp
    //     0x6db730: ldp             fp, lr, [SP], #0x10
    // 0x6db734: ret
    //     0x6db734: ret             
    // 0x6db738: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6db738: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6db73c: b               #0x6db6e4
  }
  void []=(DH, int, double) {
    // ** addr: 0x6db758, size: 0x94
    // 0x6db758: EnterFrame
    //     0x6db758: stp             fp, lr, [SP, #-0x10]!
    //     0x6db75c: mov             fp, SP
    // 0x6db760: ldr             x0, [fp, #0x18]
    // 0x6db764: r2 = Null
    //     0x6db764: mov             x2, NULL
    // 0x6db768: r1 = Null
    //     0x6db768: mov             x1, NULL
    // 0x6db76c: branchIfSmi(r0, 0x6db794)
    //     0x6db76c: tbz             w0, #0, #0x6db794
    // 0x6db770: r4 = LoadClassIdInstr(r0)
    //     0x6db770: ldur            x4, [x0, #-1]
    //     0x6db774: ubfx            x4, x4, #0xc, #0x14
    // 0x6db778: sub             x4, x4, #0x3b
    // 0x6db77c: cmp             x4, #1
    // 0x6db780: b.ls            #0x6db794
    // 0x6db784: r8 = int
    //     0x6db784: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x6db788: r3 = Null
    //     0x6db788: add             x3, PP, #0x31, lsl #12  ; [pp+0x31d08] Null
    //     0x6db78c: ldr             x3, [x3, #0xd08]
    // 0x6db790: r0 = int()
    //     0x6db790: bl              #0x7586bc  ; IsType_int_Stub
    // 0x6db794: ldr             x0, [fp, #0x10]
    // 0x6db798: r2 = Null
    //     0x6db798: mov             x2, NULL
    // 0x6db79c: r1 = Null
    //     0x6db79c: mov             x1, NULL
    // 0x6db7a0: r4 = 59
    //     0x6db7a0: mov             x4, #0x3b
    // 0x6db7a4: branchIfSmi(r0, 0x6db7b0)
    //     0x6db7a4: tbz             w0, #0, #0x6db7b0
    // 0x6db7a8: r4 = LoadClassIdInstr(r0)
    //     0x6db7a8: ldur            x4, [x0, #-1]
    //     0x6db7ac: ubfx            x4, x4, #0xc, #0x14
    // 0x6db7b0: cmp             x4, #0x3d
    // 0x6db7b4: b.eq            #0x6db7c8
    // 0x6db7b8: r8 = double
    //     0x6db7b8: ldr             x8, [PP, #0xca8]  ; [pp+0xca8] Type: double
    // 0x6db7bc: r3 = Null
    //     0x6db7bc: add             x3, PP, #0x31, lsl #12  ; [pp+0x31d18] Null
    //     0x6db7c0: ldr             x3, [x3, #0xd18]
    // 0x6db7c4: r0 = double()
    //     0x6db7c4: bl              #0x758210  ; IsType_double_Stub
    // 0x6db7c8: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x6db7c8: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x6db7cc: r0 = Throw()
    //     0x6db7cc: bl              #0x74b258  ; ThrowStub
    // 0x6db7d0: brk             #0
  }
  double [](DH, int) {
    // ** addr: 0x6db7ec, size: 0x60
    // 0x6db7ec: EnterFrame
    //     0x6db7ec: stp             fp, lr, [SP, #-0x10]!
    //     0x6db7f0: mov             fp, SP
    // 0x6db7f4: ldr             x0, [fp, #0x10]
    // 0x6db7f8: r2 = Null
    //     0x6db7f8: mov             x2, NULL
    // 0x6db7fc: r1 = Null
    //     0x6db7fc: mov             x1, NULL
    // 0x6db800: branchIfSmi(r0, 0x6db828)
    //     0x6db800: tbz             w0, #0, #0x6db828
    // 0x6db804: r4 = LoadClassIdInstr(r0)
    //     0x6db804: ldur            x4, [x0, #-1]
    //     0x6db808: ubfx            x4, x4, #0xc, #0x14
    // 0x6db80c: sub             x4, x4, #0x3b
    // 0x6db810: cmp             x4, #1
    // 0x6db814: b.ls            #0x6db828
    // 0x6db818: r8 = int
    //     0x6db818: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x6db81c: r3 = Null
    //     0x6db81c: add             x3, PP, #0x20, lsl #12  ; [pp+0x20d78] Null
    //     0x6db820: ldr             x3, [x3, #0xd78]
    // 0x6db824: r0 = int()
    //     0x6db824: bl              #0x7586bc  ; IsType_int_Stub
    // 0x6db828: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x6db828: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x6db82c: r0 = Throw()
    //     0x6db82c: bl              #0x74b258  ; ThrowStub
    // 0x6db830: brk             #0
  }
}

// class id: 271, size: 0xc, field offset: 0x8
class jUa extends Object
    implements iUa {

  jUa +(jUa, jUa) {
    // ** addr: 0x7064b4, size: 0x8c
    // 0x7064b4: EnterFrame
    //     0x7064b4: stp             fp, lr, [SP, #-0x10]!
    //     0x7064b8: mov             fp, SP
    // 0x7064bc: AllocStack(0x10)
    //     0x7064bc: sub             SP, SP, #0x10
    // 0x7064c0: CheckStackOverflow
    //     0x7064c0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x7064c4: cmp             SP, x16
    //     0x7064c8: b.ls            #0x706520
    // 0x7064cc: ldr             x0, [fp, #0x10]
    // 0x7064d0: r2 = Null
    //     0x7064d0: mov             x2, NULL
    // 0x7064d4: r1 = Null
    //     0x7064d4: mov             x1, NULL
    // 0x7064d8: r4 = 59
    //     0x7064d8: mov             x4, #0x3b
    // 0x7064dc: branchIfSmi(r0, 0x7064e8)
    //     0x7064dc: tbz             w0, #0, #0x7064e8
    // 0x7064e0: r4 = LoadClassIdInstr(r0)
    //     0x7064e0: ldur            x4, [x0, #-1]
    //     0x7064e4: ubfx            x4, x4, #0xc, #0x14
    // 0x7064e8: cmp             x4, #0x10f
    // 0x7064ec: b.eq            #0x706504
    // 0x7064f0: r8 = jUa
    //     0x7064f0: add             x8, PP, #0x29, lsl #12  ; [pp+0x29388] Type: jUa
    //     0x7064f4: ldr             x8, [x8, #0x388]
    // 0x7064f8: r3 = Null
    //     0x7064f8: add             x3, PP, #0x29, lsl #12  ; [pp+0x29390] Null
    //     0x7064fc: ldr             x3, [x3, #0x390]
    // 0x706500: r0 = jUa()
    //     0x706500: bl              #0x706704  ; IsType_jUa_Stub
    // 0x706504: ldr             x16, [fp, #0x18]
    // 0x706508: ldr             lr, [fp, #0x10]
    // 0x70650c: stp             lr, x16, [SP]
    // 0x706510: r0 = call 0x3ea280
    //     0x706510: bl              #0x3ea280
    // 0x706514: LeaveFrame
    //     0x706514: mov             SP, fp
    //     0x706518: ldp             fp, lr, [SP], #0x10
    // 0x70651c: ret
    //     0x70651c: ret             
    // 0x706520: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x706520: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x706524: b               #0x7064cc
  }
  jUa *(jUa, double) {
    // ** addr: 0x706540, size: 0x5c
    // 0x706540: EnterFrame
    //     0x706540: stp             fp, lr, [SP, #-0x10]!
    //     0x706544: mov             fp, SP
    // 0x706548: AllocStack(0x10)
    //     0x706548: sub             SP, SP, #0x10
    // 0x70654c: CheckStackOverflow
    //     0x70654c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x706550: cmp             SP, x16
    //     0x706554: b.ls            #0x70657c
    // 0x706558: ldr             x0, [fp, #0x10]
    // 0x70655c: LoadField: d0 = r0->field_7
    //     0x70655c: ldur            d0, [x0, #7]
    // 0x706560: ldr             x16, [fp, #0x18]
    // 0x706564: str             x16, [SP, #8]
    // 0x706568: str             d0, [SP]
    // 0x70656c: r0 = call 0x3ea404
    //     0x70656c: bl              #0x3ea404
    // 0x706570: LeaveFrame
    //     0x706570: mov             SP, fp
    //     0x706574: ldp             fp, lr, [SP], #0x10
    // 0x706578: ret
    //     0x706578: ret             
    // 0x70657c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x70657c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x706580: b               #0x706558
  }
  jUa -(jUa, jUa) {
    // ** addr: 0x70659c, size: 0x8c
    // 0x70659c: EnterFrame
    //     0x70659c: stp             fp, lr, [SP, #-0x10]!
    //     0x7065a0: mov             fp, SP
    // 0x7065a4: AllocStack(0x10)
    //     0x7065a4: sub             SP, SP, #0x10
    // 0x7065a8: CheckStackOverflow
    //     0x7065a8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x7065ac: cmp             SP, x16
    //     0x7065b0: b.ls            #0x706608
    // 0x7065b4: ldr             x0, [fp, #0x10]
    // 0x7065b8: r2 = Null
    //     0x7065b8: mov             x2, NULL
    // 0x7065bc: r1 = Null
    //     0x7065bc: mov             x1, NULL
    // 0x7065c0: r4 = 59
    //     0x7065c0: mov             x4, #0x3b
    // 0x7065c4: branchIfSmi(r0, 0x7065d0)
    //     0x7065c4: tbz             w0, #0, #0x7065d0
    // 0x7065c8: r4 = LoadClassIdInstr(r0)
    //     0x7065c8: ldur            x4, [x0, #-1]
    //     0x7065cc: ubfx            x4, x4, #0xc, #0x14
    // 0x7065d0: cmp             x4, #0x10f
    // 0x7065d4: b.eq            #0x7065ec
    // 0x7065d8: r8 = jUa
    //     0x7065d8: add             x8, PP, #0x29, lsl #12  ; [pp+0x29388] Type: jUa
    //     0x7065dc: ldr             x8, [x8, #0x388]
    // 0x7065e0: r3 = Null
    //     0x7065e0: add             x3, PP, #0x29, lsl #12  ; [pp+0x293a0] Null
    //     0x7065e4: ldr             x3, [x3, #0x3a0]
    // 0x7065e8: r0 = jUa()
    //     0x7065e8: bl              #0x706704  ; IsType_jUa_Stub
    // 0x7065ec: ldr             x16, [fp, #0x18]
    // 0x7065f0: ldr             lr, [fp, #0x10]
    // 0x7065f4: stp             lr, x16, [SP]
    // 0x7065f8: r0 = call 0x3ea484
    //     0x7065f8: bl              #0x3ea484
    // 0x7065fc: LeaveFrame
    //     0x7065fc: mov             SP, fp
    //     0x706600: ldp             fp, lr, [SP], #0x10
    // 0x706604: ret
    //     0x706604: ret             
    // 0x706608: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x706608: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x70660c: b               #0x7065b4
  }
  void []=(jUa, int, double) {
    // ** addr: 0x706628, size: 0x94
    // 0x706628: EnterFrame
    //     0x706628: stp             fp, lr, [SP, #-0x10]!
    //     0x70662c: mov             fp, SP
    // 0x706630: ldr             x0, [fp, #0x18]
    // 0x706634: r2 = Null
    //     0x706634: mov             x2, NULL
    // 0x706638: r1 = Null
    //     0x706638: mov             x1, NULL
    // 0x70663c: branchIfSmi(r0, 0x706664)
    //     0x70663c: tbz             w0, #0, #0x706664
    // 0x706640: r4 = LoadClassIdInstr(r0)
    //     0x706640: ldur            x4, [x0, #-1]
    //     0x706644: ubfx            x4, x4, #0xc, #0x14
    // 0x706648: sub             x4, x4, #0x3b
    // 0x70664c: cmp             x4, #1
    // 0x706650: b.ls            #0x706664
    // 0x706654: r8 = int
    //     0x706654: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x706658: r3 = Null
    //     0x706658: add             x3, PP, #0x31, lsl #12  ; [pp+0x31d48] Null
    //     0x70665c: ldr             x3, [x3, #0xd48]
    // 0x706660: r0 = int()
    //     0x706660: bl              #0x7586bc  ; IsType_int_Stub
    // 0x706664: ldr             x0, [fp, #0x10]
    // 0x706668: r2 = Null
    //     0x706668: mov             x2, NULL
    // 0x70666c: r1 = Null
    //     0x70666c: mov             x1, NULL
    // 0x706670: r4 = 59
    //     0x706670: mov             x4, #0x3b
    // 0x706674: branchIfSmi(r0, 0x706680)
    //     0x706674: tbz             w0, #0, #0x706680
    // 0x706678: r4 = LoadClassIdInstr(r0)
    //     0x706678: ldur            x4, [x0, #-1]
    //     0x70667c: ubfx            x4, x4, #0xc, #0x14
    // 0x706680: cmp             x4, #0x3d
    // 0x706684: b.eq            #0x706698
    // 0x706688: r8 = double
    //     0x706688: ldr             x8, [PP, #0xca8]  ; [pp+0xca8] Type: double
    // 0x70668c: r3 = Null
    //     0x70668c: add             x3, PP, #0x31, lsl #12  ; [pp+0x31d58] Null
    //     0x706690: ldr             x3, [x3, #0xd58]
    // 0x706694: r0 = double()
    //     0x706694: bl              #0x758210  ; IsType_double_Stub
    // 0x706698: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x706698: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x70669c: r0 = Throw()
    //     0x70669c: bl              #0x74b258  ; ThrowStub
    // 0x7066a0: brk             #0
  }
  double [](jUa, int) {
    // ** addr: 0x7066bc, size: 0x60
    // 0x7066bc: EnterFrame
    //     0x7066bc: stp             fp, lr, [SP, #-0x10]!
    //     0x7066c0: mov             fp, SP
    // 0x7066c4: ldr             x0, [fp, #0x10]
    // 0x7066c8: r2 = Null
    //     0x7066c8: mov             x2, NULL
    // 0x7066cc: r1 = Null
    //     0x7066cc: mov             x1, NULL
    // 0x7066d0: branchIfSmi(r0, 0x7066f8)
    //     0x7066d0: tbz             w0, #0, #0x7066f8
    // 0x7066d4: r4 = LoadClassIdInstr(r0)
    //     0x7066d4: ldur            x4, [x0, #-1]
    //     0x7066d8: ubfx            x4, x4, #0xc, #0x14
    // 0x7066dc: sub             x4, x4, #0x3b
    // 0x7066e0: cmp             x4, #1
    // 0x7066e4: b.ls            #0x7066f8
    // 0x7066e8: r8 = int
    //     0x7066e8: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x7066ec: r3 = Null
    //     0x7066ec: add             x3, PP, #0x29, lsl #12  ; [pp+0x29378] Null
    //     0x7066f0: ldr             x3, [x3, #0x378]
    // 0x7066f4: r0 = int()
    //     0x7066f4: bl              #0x7586bc  ; IsType_int_Stub
    // 0x7066f8: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x7066f8: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x7066fc: r0 = Throw()
    //     0x7066fc: bl              #0x74b258  ; ThrowStub
    // 0x706700: brk             #0
  }
}

// class id: 272, size: 0x8, field offset: 0x8
abstract class iUa extends Object {
}

// class id: 273, size: 0xc, field offset: 0x8
class hUa extends Object {

  hUa *(hUa, hUa) {
    // ** addr: 0x722fd8, size: 0x88
    // 0x722fd8: EnterFrame
    //     0x722fd8: stp             fp, lr, [SP, #-0x10]!
    //     0x722fdc: mov             fp, SP
    // 0x722fe0: ldr             x0, [fp, #0x10]
    // 0x722fe4: r2 = Null
    //     0x722fe4: mov             x2, NULL
    // 0x722fe8: r1 = Null
    //     0x722fe8: mov             x1, NULL
    // 0x722fec: r4 = LoadClassIdInstr(r0)
    //     0x722fec: ldur            x4, [x0, #-1]
    //     0x722ff0: ubfx            x4, x4, #0xc, #0x14
    // 0x722ff4: cmp             x4, #0x111
    // 0x722ff8: b.eq            #0x723010
    // 0x722ffc: r8 = hUa
    //     0x722ffc: add             x8, PP, #0x38, lsl #12  ; [pp+0x382d0] Type: hUa
    //     0x723000: ldr             x8, [x8, #0x2d0]
    // 0x723004: r3 = Null
    //     0x723004: add             x3, PP, #0x38, lsl #12  ; [pp+0x382f8] Null
    //     0x723008: ldr             x3, [x3, #0x2f8]
    // 0x72300c: r0 = DefaultTypeTest()
    //     0x72300c: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x723010: ldr             x0, [fp, #0x18]
    // 0x723014: LoadField: r1 = r0->field_7
    //     0x723014: ldur            w1, [x0, #7]
    // 0x723018: DecompressPointer r1
    //     0x723018: add             x1, x1, HEAP, lsl #32
    // 0x72301c: LoadField: r0 = r1->field_13
    //     0x72301c: ldur            w0, [x1, #0x13]
    // 0x723020: DecompressPointer r0
    //     0x723020: add             x0, x0, HEAP, lsl #32
    // 0x723024: r1 = LoadInt32Instr(r0)
    //     0x723024: sbfx            x1, x0, #1, #0x1f
    // 0x723028: mov             x0, x1
    // 0x72302c: r1 = 3
    //     0x72302c: mov             x1, #3
    // 0x723030: cmp             x1, x0
    // 0x723034: b.hs            #0x723044
    // 0x723038: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x723038: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x72303c: r0 = Throw()
    //     0x72303c: bl              #0x74b258  ; ThrowStub
    // 0x723040: brk             #0
    // 0x723044: r0 = RangeErrorSharedWithoutFPURegs()
    //     0x723044: bl              #0x74d1ac  ; RangeErrorSharedWithoutFPURegsStub
  }
  hUa -(hUa, hUa) {
    // ** addr: 0x723060, size: 0x8c
    // 0x723060: EnterFrame
    //     0x723060: stp             fp, lr, [SP, #-0x10]!
    //     0x723064: mov             fp, SP
    // 0x723068: AllocStack(0x10)
    //     0x723068: sub             SP, SP, #0x10
    // 0x72306c: CheckStackOverflow
    //     0x72306c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x723070: cmp             SP, x16
    //     0x723074: b.ls            #0x7230cc
    // 0x723078: ldr             x0, [fp, #0x10]
    // 0x72307c: r2 = Null
    //     0x72307c: mov             x2, NULL
    // 0x723080: r1 = Null
    //     0x723080: mov             x1, NULL
    // 0x723084: r4 = 59
    //     0x723084: mov             x4, #0x3b
    // 0x723088: branchIfSmi(r0, 0x723094)
    //     0x723088: tbz             w0, #0, #0x723094
    // 0x72308c: r4 = LoadClassIdInstr(r0)
    //     0x72308c: ldur            x4, [x0, #-1]
    //     0x723090: ubfx            x4, x4, #0xc, #0x14
    // 0x723094: cmp             x4, #0x111
    // 0x723098: b.eq            #0x7230b0
    // 0x72309c: r8 = hUa
    //     0x72309c: add             x8, PP, #0x38, lsl #12  ; [pp+0x382d0] Type: hUa
    //     0x7230a0: ldr             x8, [x8, #0x2d0]
    // 0x7230a4: r3 = Null
    //     0x7230a4: add             x3, PP, #0x38, lsl #12  ; [pp+0x382d8] Null
    //     0x7230a8: ldr             x3, [x3, #0x2d8]
    // 0x7230ac: r0 = DefaultTypeTest()
    //     0x7230ac: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x7230b0: ldr             x16, [fp, #0x18]
    // 0x7230b4: ldr             lr, [fp, #0x10]
    // 0x7230b8: stp             lr, x16, [SP]
    // 0x7230bc: r0 = call 0x4c5e6c
    //     0x7230bc: bl              #0x4c5e6c
    // 0x7230c0: LeaveFrame
    //     0x7230c0: mov             SP, fp
    //     0x7230c4: ldp             fp, lr, [SP], #0x10
    // 0x7230c8: ret
    //     0x7230c8: ret             
    // 0x7230cc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7230cc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7230d0: b               #0x723078
  }
  hUa +(hUa, hUa) {
    // ** addr: 0x7230ec, size: 0x8c
    // 0x7230ec: EnterFrame
    //     0x7230ec: stp             fp, lr, [SP, #-0x10]!
    //     0x7230f0: mov             fp, SP
    // 0x7230f4: AllocStack(0x10)
    //     0x7230f4: sub             SP, SP, #0x10
    // 0x7230f8: CheckStackOverflow
    //     0x7230f8: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x7230fc: cmp             SP, x16
    //     0x723100: b.ls            #0x723158
    // 0x723104: ldr             x0, [fp, #0x10]
    // 0x723108: r2 = Null
    //     0x723108: mov             x2, NULL
    // 0x72310c: r1 = Null
    //     0x72310c: mov             x1, NULL
    // 0x723110: r4 = 59
    //     0x723110: mov             x4, #0x3b
    // 0x723114: branchIfSmi(r0, 0x723120)
    //     0x723114: tbz             w0, #0, #0x723120
    // 0x723118: r4 = LoadClassIdInstr(r0)
    //     0x723118: ldur            x4, [x0, #-1]
    //     0x72311c: ubfx            x4, x4, #0xc, #0x14
    // 0x723120: cmp             x4, #0x111
    // 0x723124: b.eq            #0x72313c
    // 0x723128: r8 = hUa
    //     0x723128: add             x8, PP, #0x38, lsl #12  ; [pp+0x382d0] Type: hUa
    //     0x72312c: ldr             x8, [x8, #0x2d0]
    // 0x723130: r3 = Null
    //     0x723130: add             x3, PP, #0x38, lsl #12  ; [pp+0x382e8] Null
    //     0x723134: ldr             x3, [x3, #0x2e8]
    // 0x723138: r0 = DefaultTypeTest()
    //     0x723138: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x72313c: ldr             x16, [fp, #0x18]
    // 0x723140: ldr             lr, [fp, #0x10]
    // 0x723144: stp             lr, x16, [SP]
    // 0x723148: r0 = call 0x4c5fb8
    //     0x723148: bl              #0x4c5fb8
    // 0x72314c: LeaveFrame
    //     0x72314c: mov             SP, fp
    //     0x723150: ldp             fp, lr, [SP], #0x10
    // 0x723154: ret
    //     0x723154: ret             
    // 0x723158: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x723158: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x72315c: b               #0x723104
  }
  void []=(hUa, int, double) {
    // ** addr: 0x723178, size: 0x94
    // 0x723178: EnterFrame
    //     0x723178: stp             fp, lr, [SP, #-0x10]!
    //     0x72317c: mov             fp, SP
    // 0x723180: ldr             x0, [fp, #0x18]
    // 0x723184: r2 = Null
    //     0x723184: mov             x2, NULL
    // 0x723188: r1 = Null
    //     0x723188: mov             x1, NULL
    // 0x72318c: branchIfSmi(r0, 0x7231b4)
    //     0x72318c: tbz             w0, #0, #0x7231b4
    // 0x723190: r4 = LoadClassIdInstr(r0)
    //     0x723190: ldur            x4, [x0, #-1]
    //     0x723194: ubfx            x4, x4, #0xc, #0x14
    // 0x723198: sub             x4, x4, #0x3b
    // 0x72319c: cmp             x4, #1
    // 0x7231a0: b.ls            #0x7231b4
    // 0x7231a4: r8 = int
    //     0x7231a4: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x7231a8: r3 = Null
    //     0x7231a8: add             x3, PP, #0x38, lsl #12  ; [pp+0x382a0] Null
    //     0x7231ac: ldr             x3, [x3, #0x2a0]
    // 0x7231b0: r0 = int()
    //     0x7231b0: bl              #0x7586bc  ; IsType_int_Stub
    // 0x7231b4: ldr             x0, [fp, #0x10]
    // 0x7231b8: r2 = Null
    //     0x7231b8: mov             x2, NULL
    // 0x7231bc: r1 = Null
    //     0x7231bc: mov             x1, NULL
    // 0x7231c0: r4 = 59
    //     0x7231c0: mov             x4, #0x3b
    // 0x7231c4: branchIfSmi(r0, 0x7231d0)
    //     0x7231c4: tbz             w0, #0, #0x7231d0
    // 0x7231c8: r4 = LoadClassIdInstr(r0)
    //     0x7231c8: ldur            x4, [x0, #-1]
    //     0x7231cc: ubfx            x4, x4, #0xc, #0x14
    // 0x7231d0: cmp             x4, #0x3d
    // 0x7231d4: b.eq            #0x7231e8
    // 0x7231d8: r8 = double
    //     0x7231d8: ldr             x8, [PP, #0xca8]  ; [pp+0xca8] Type: double
    // 0x7231dc: r3 = Null
    //     0x7231dc: add             x3, PP, #0x38, lsl #12  ; [pp+0x382b0] Null
    //     0x7231e0: ldr             x3, [x3, #0x2b0]
    // 0x7231e4: r0 = double()
    //     0x7231e4: bl              #0x758210  ; IsType_double_Stub
    // 0x7231e8: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x7231e8: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x7231ec: r0 = Throw()
    //     0x7231ec: bl              #0x74b258  ; ThrowStub
    // 0x7231f0: brk             #0
  }
  double [](hUa, int) {
    // ** addr: 0x72320c, size: 0x60
    // 0x72320c: EnterFrame
    //     0x72320c: stp             fp, lr, [SP, #-0x10]!
    //     0x723210: mov             fp, SP
    // 0x723214: ldr             x0, [fp, #0x10]
    // 0x723218: r2 = Null
    //     0x723218: mov             x2, NULL
    // 0x72321c: r1 = Null
    //     0x72321c: mov             x1, NULL
    // 0x723220: branchIfSmi(r0, 0x723248)
    //     0x723220: tbz             w0, #0, #0x723248
    // 0x723224: r4 = LoadClassIdInstr(r0)
    //     0x723224: ldur            x4, [x0, #-1]
    //     0x723228: ubfx            x4, x4, #0xc, #0x14
    // 0x72322c: sub             x4, x4, #0x3b
    // 0x723230: cmp             x4, #1
    // 0x723234: b.ls            #0x723248
    // 0x723238: r8 = int
    //     0x723238: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x72323c: r3 = Null
    //     0x72323c: add             x3, PP, #0x38, lsl #12  ; [pp+0x382c0] Null
    //     0x723240: ldr             x3, [x3, #0x2c0]
    // 0x723244: r0 = int()
    //     0x723244: bl              #0x7586bc  ; IsType_int_Stub
    // 0x723248: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x723248: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x72324c: r0 = Throw()
    //     0x72324c: bl              #0x74b258  ; ThrowStub
    // 0x723250: brk             #0
  }
}

// class id: 274, size: 0xc, field offset: 0x8
class gUa extends Object {

  gUa +(gUa, gUa) {
    // ** addr: 0x723278, size: 0x8c
    // 0x723278: EnterFrame
    //     0x723278: stp             fp, lr, [SP, #-0x10]!
    //     0x72327c: mov             fp, SP
    // 0x723280: AllocStack(0x10)
    //     0x723280: sub             SP, SP, #0x10
    // 0x723284: CheckStackOverflow
    //     0x723284: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x723288: cmp             SP, x16
    //     0x72328c: b.ls            #0x7232e4
    // 0x723290: ldr             x0, [fp, #0x10]
    // 0x723294: r2 = Null
    //     0x723294: mov             x2, NULL
    // 0x723298: r1 = Null
    //     0x723298: mov             x1, NULL
    // 0x72329c: r4 = 59
    //     0x72329c: mov             x4, #0x3b
    // 0x7232a0: branchIfSmi(r0, 0x7232ac)
    //     0x7232a0: tbz             w0, #0, #0x7232ac
    // 0x7232a4: r4 = LoadClassIdInstr(r0)
    //     0x7232a4: ldur            x4, [x0, #-1]
    //     0x7232a8: ubfx            x4, x4, #0xc, #0x14
    // 0x7232ac: cmp             x4, #0x112
    // 0x7232b0: b.eq            #0x7232c8
    // 0x7232b4: r8 = gUa
    //     0x7232b4: add             x8, PP, #0x38, lsl #12  ; [pp+0x38248] Type: gUa
    //     0x7232b8: ldr             x8, [x8, #0x248]
    // 0x7232bc: r3 = Null
    //     0x7232bc: add             x3, PP, #0x38, lsl #12  ; [pp+0x38260] Null
    //     0x7232c0: ldr             x3, [x3, #0x260]
    // 0x7232c4: r0 = DefaultTypeTest()
    //     0x7232c4: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x7232c8: ldr             x16, [fp, #0x18]
    // 0x7232cc: ldr             lr, [fp, #0x10]
    // 0x7232d0: stp             lr, x16, [SP]
    // 0x7232d4: r0 = call 0x4c6c6c
    //     0x7232d4: bl              #0x4c6c6c
    // 0x7232d8: LeaveFrame
    //     0x7232d8: mov             SP, fp
    //     0x7232dc: ldp             fp, lr, [SP], #0x10
    // 0x7232e0: ret
    //     0x7232e0: ret             
    // 0x7232e4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7232e4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7232e8: b               #0x723290
  }
  dynamic *(gUa, dynamic) {
    // ** addr: 0x723304, size: 0x5c
    // 0x723304: EnterFrame
    //     0x723304: stp             fp, lr, [SP, #-0x10]!
    //     0x723308: mov             fp, SP
    // 0x72330c: AllocStack(0x10)
    //     0x72330c: sub             SP, SP, #0x10
    // 0x723310: CheckStackOverflow
    //     0x723310: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x723314: cmp             SP, x16
    //     0x723318: b.ls            #0x723340
    // 0x72331c: ldr             x0, [fp, #0x10]
    // 0x723320: LoadField: d0 = r0->field_7
    //     0x723320: ldur            d0, [x0, #7]
    // 0x723324: ldr             x16, [fp, #0x18]
    // 0x723328: str             x16, [SP, #8]
    // 0x72332c: str             d0, [SP]
    // 0x723330: r0 = call 0x4c70dc
    //     0x723330: bl              #0x4c70dc
    // 0x723334: LeaveFrame
    //     0x723334: mov             SP, fp
    //     0x723338: ldp             fp, lr, [SP], #0x10
    // 0x72333c: ret
    //     0x72333c: ret             
    // 0x723340: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x723340: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x723344: b               #0x72331c
  }
  gUa -(gUa, gUa) {
    // ** addr: 0x723360, size: 0x8c
    // 0x723360: EnterFrame
    //     0x723360: stp             fp, lr, [SP, #-0x10]!
    //     0x723364: mov             fp, SP
    // 0x723368: AllocStack(0x10)
    //     0x723368: sub             SP, SP, #0x10
    // 0x72336c: CheckStackOverflow
    //     0x72336c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x723370: cmp             SP, x16
    //     0x723374: b.ls            #0x7233cc
    // 0x723378: ldr             x0, [fp, #0x10]
    // 0x72337c: r2 = Null
    //     0x72337c: mov             x2, NULL
    // 0x723380: r1 = Null
    //     0x723380: mov             x1, NULL
    // 0x723384: r4 = 59
    //     0x723384: mov             x4, #0x3b
    // 0x723388: branchIfSmi(r0, 0x723394)
    //     0x723388: tbz             w0, #0, #0x723394
    // 0x72338c: r4 = LoadClassIdInstr(r0)
    //     0x72338c: ldur            x4, [x0, #-1]
    //     0x723390: ubfx            x4, x4, #0xc, #0x14
    // 0x723394: cmp             x4, #0x112
    // 0x723398: b.eq            #0x7233b0
    // 0x72339c: r8 = gUa
    //     0x72339c: add             x8, PP, #0x38, lsl #12  ; [pp+0x38248] Type: gUa
    //     0x7233a0: ldr             x8, [x8, #0x248]
    // 0x7233a4: r3 = Null
    //     0x7233a4: add             x3, PP, #0x38, lsl #12  ; [pp+0x38250] Null
    //     0x7233a8: ldr             x3, [x3, #0x250]
    // 0x7233ac: r0 = DefaultTypeTest()
    //     0x7233ac: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x7233b0: ldr             x16, [fp, #0x18]
    // 0x7233b4: ldr             lr, [fp, #0x10]
    // 0x7233b8: stp             lr, x16, [SP]
    // 0x7233bc: r0 = call 0x4c7280
    //     0x7233bc: bl              #0x4c7280
    // 0x7233c0: LeaveFrame
    //     0x7233c0: mov             SP, fp
    //     0x7233c4: ldp             fp, lr, [SP], #0x10
    // 0x7233c8: ret
    //     0x7233c8: ret             
    // 0x7233cc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x7233cc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7233d0: b               #0x723378
  }
  void []=(gUa, int, double) {
    // ** addr: 0x7233ec, size: 0x94
    // 0x7233ec: EnterFrame
    //     0x7233ec: stp             fp, lr, [SP, #-0x10]!
    //     0x7233f0: mov             fp, SP
    // 0x7233f4: ldr             x0, [fp, #0x18]
    // 0x7233f8: r2 = Null
    //     0x7233f8: mov             x2, NULL
    // 0x7233fc: r1 = Null
    //     0x7233fc: mov             x1, NULL
    // 0x723400: branchIfSmi(r0, 0x723428)
    //     0x723400: tbz             w0, #0, #0x723428
    // 0x723404: r4 = LoadClassIdInstr(r0)
    //     0x723404: ldur            x4, [x0, #-1]
    //     0x723408: ubfx            x4, x4, #0xc, #0x14
    // 0x72340c: sub             x4, x4, #0x3b
    // 0x723410: cmp             x4, #1
    // 0x723414: b.ls            #0x723428
    // 0x723418: r8 = int
    //     0x723418: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x72341c: r3 = Null
    //     0x72341c: add             x3, PP, #0x38, lsl #12  ; [pp+0x38270] Null
    //     0x723420: ldr             x3, [x3, #0x270]
    // 0x723424: r0 = int()
    //     0x723424: bl              #0x7586bc  ; IsType_int_Stub
    // 0x723428: ldr             x0, [fp, #0x10]
    // 0x72342c: r2 = Null
    //     0x72342c: mov             x2, NULL
    // 0x723430: r1 = Null
    //     0x723430: mov             x1, NULL
    // 0x723434: r4 = 59
    //     0x723434: mov             x4, #0x3b
    // 0x723438: branchIfSmi(r0, 0x723444)
    //     0x723438: tbz             w0, #0, #0x723444
    // 0x72343c: r4 = LoadClassIdInstr(r0)
    //     0x72343c: ldur            x4, [x0, #-1]
    //     0x723440: ubfx            x4, x4, #0xc, #0x14
    // 0x723444: cmp             x4, #0x3d
    // 0x723448: b.eq            #0x72345c
    // 0x72344c: r8 = double
    //     0x72344c: ldr             x8, [PP, #0xca8]  ; [pp+0xca8] Type: double
    // 0x723450: r3 = Null
    //     0x723450: add             x3, PP, #0x38, lsl #12  ; [pp+0x38280] Null
    //     0x723454: ldr             x3, [x3, #0x280]
    // 0x723458: r0 = double()
    //     0x723458: bl              #0x758210  ; IsType_double_Stub
    // 0x72345c: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x72345c: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x723460: r0 = Throw()
    //     0x723460: bl              #0x74b258  ; ThrowStub
    // 0x723464: brk             #0
  }
  double [](gUa, int) {
    // ** addr: 0x723480, size: 0x60
    // 0x723480: EnterFrame
    //     0x723480: stp             fp, lr, [SP, #-0x10]!
    //     0x723484: mov             fp, SP
    // 0x723488: ldr             x0, [fp, #0x10]
    // 0x72348c: r2 = Null
    //     0x72348c: mov             x2, NULL
    // 0x723490: r1 = Null
    //     0x723490: mov             x1, NULL
    // 0x723494: branchIfSmi(r0, 0x7234bc)
    //     0x723494: tbz             w0, #0, #0x7234bc
    // 0x723498: r4 = LoadClassIdInstr(r0)
    //     0x723498: ldur            x4, [x0, #-1]
    //     0x72349c: ubfx            x4, x4, #0xc, #0x14
    // 0x7234a0: sub             x4, x4, #0x3b
    // 0x7234a4: cmp             x4, #1
    // 0x7234a8: b.ls            #0x7234bc
    // 0x7234ac: r8 = int
    //     0x7234ac: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x7234b0: r3 = Null
    //     0x7234b0: add             x3, PP, #0x38, lsl #12  ; [pp+0x38290] Null
    //     0x7234b4: ldr             x3, [x3, #0x290]
    // 0x7234b8: r0 = int()
    //     0x7234b8: bl              #0x7586bc  ; IsType_int_Stub
    // 0x7234bc: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x7234bc: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x7234c0: r0 = Throw()
    //     0x7234c0: bl              #0x74b258  ; ThrowStub
    // 0x7234c4: brk             #0
  }
}

// class id: 1824, size: 0xc, field offset: 0x8
class iD extends Object {

  dynamic *(iD, dynamic) {
    // ** addr: 0x6d23f0, size: 0xb8
    // 0x6d23f0: EnterFrame
    //     0x6d23f0: stp             fp, lr, [SP, #-0x10]!
    //     0x6d23f4: mov             fp, SP
    // 0x6d23f8: AllocStack(0x10)
    //     0x6d23f8: sub             SP, SP, #0x10
    // 0x6d23fc: CheckStackOverflow
    //     0x6d23fc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d2400: cmp             SP, x16
    //     0x6d2404: b.ls            #0x6d2488
    // 0x6d2408: ldr             x0, [fp, #0x10]
    // 0x6d240c: r1 = 59
    //     0x6d240c: mov             x1, #0x3b
    // 0x6d2410: branchIfSmi(r0, 0x6d241c)
    //     0x6d2410: tbz             w0, #0, #0x6d241c
    // 0x6d2414: r1 = LoadClassIdInstr(r0)
    //     0x6d2414: ldur            x1, [x0, #-1]
    //     0x6d2418: ubfx            x1, x1, #0xc, #0x14
    // 0x6d241c: cmp             x1, #0x3d
    // 0x6d2420: b.ne            #0x6d2444
    // 0x6d2424: LoadField: d0 = r0->field_7
    //     0x6d2424: ldur            d0, [x0, #7]
    // 0x6d2428: ldr             x16, [fp, #0x18]
    // 0x6d242c: str             x16, [SP, #8]
    // 0x6d2430: str             d0, [SP]
    // 0x6d2434: r0 = call 0x238698
    //     0x6d2434: bl              #0x238698
    // 0x6d2438: LeaveFrame
    //     0x6d2438: mov             SP, fp
    //     0x6d243c: ldp             fp, lr, [SP], #0x10
    // 0x6d2440: ret
    //     0x6d2440: ret             
    // 0x6d2444: cmp             x1, #0x720
    // 0x6d2448: b.ne            #0x6d2464
    // 0x6d244c: ldr             x16, [fp, #0x18]
    // 0x6d2450: stp             x0, x16, [SP]
    // 0x6d2454: r0 = call 0x238194
    //     0x6d2454: bl              #0x238194
    // 0x6d2458: LeaveFrame
    //     0x6d2458: mov             SP, fp
    //     0x6d245c: ldp             fp, lr, [SP], #0x10
    // 0x6d2460: ret
    //     0x6d2460: ret             
    // 0x6d2464: r0 = ArgumentError()
    //     0x6d2464: bl              #0x6cad10  ; AllocateArgumentErrorStub -> ArgumentError (size=0x1c)
    // 0x6d2468: mov             x1, x0
    // 0x6d246c: ldr             x0, [fp, #0x10]
    // 0x6d2470: ArrayStore: r1[0] = r0  ; List_4
    //     0x6d2470: stur            w0, [x1, #0x17]
    // 0x6d2474: r0 = false
    //     0x6d2474: add             x0, NULL, #0x30  ; false
    // 0x6d2478: StoreField: r1->field_b = r0
    //     0x6d2478: stur            w0, [x1, #0xb]
    // 0x6d247c: mov             x0, x1
    // 0x6d2480: r0 = Throw()
    //     0x6d2480: bl              #0x74b258  ; ThrowStub
    // 0x6d2484: brk             #0
    // 0x6d2488: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d2488: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d248c: b               #0x6d2408
  }
  iD +(iD, iD) {
    // ** addr: 0x6d21c4, size: 0x8c
    // 0x6d21c4: EnterFrame
    //     0x6d21c4: stp             fp, lr, [SP, #-0x10]!
    //     0x6d21c8: mov             fp, SP
    // 0x6d21cc: AllocStack(0x10)
    //     0x6d21cc: sub             SP, SP, #0x10
    // 0x6d21d0: CheckStackOverflow
    //     0x6d21d0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d21d4: cmp             SP, x16
    //     0x6d21d8: b.ls            #0x6d2230
    // 0x6d21dc: ldr             x0, [fp, #0x10]
    // 0x6d21e0: r2 = Null
    //     0x6d21e0: mov             x2, NULL
    // 0x6d21e4: r1 = Null
    //     0x6d21e4: mov             x1, NULL
    // 0x6d21e8: r4 = 59
    //     0x6d21e8: mov             x4, #0x3b
    // 0x6d21ec: branchIfSmi(r0, 0x6d21f8)
    //     0x6d21ec: tbz             w0, #0, #0x6d21f8
    // 0x6d21f0: r4 = LoadClassIdInstr(r0)
    //     0x6d21f0: ldur            x4, [x0, #-1]
    //     0x6d21f4: ubfx            x4, x4, #0xc, #0x14
    // 0x6d21f8: cmp             x4, #0x720
    // 0x6d21fc: b.eq            #0x6d2214
    // 0x6d2200: r8 = iD
    //     0x6d2200: add             x8, PP, #0x29, lsl #12  ; [pp+0x29300] Type: iD
    //     0x6d2204: ldr             x8, [x8, #0x300]
    // 0x6d2208: r3 = Null
    //     0x6d2208: add             x3, PP, #0x29, lsl #12  ; [pp+0x29318] Null
    //     0x6d220c: ldr             x3, [x3, #0x318]
    // 0x6d2210: r0 = iD()
    //     0x6d2210: bl              #0x6d23b8  ; IsType_iD_Stub
    // 0x6d2214: ldr             x16, [fp, #0x18]
    // 0x6d2218: ldr             lr, [fp, #0x10]
    // 0x6d221c: stp             lr, x16, [SP]
    // 0x6d2220: r0 = call 0x2376fc
    //     0x6d2220: bl              #0x2376fc
    // 0x6d2224: LeaveFrame
    //     0x6d2224: mov             SP, fp
    //     0x6d2228: ldp             fp, lr, [SP], #0x10
    // 0x6d222c: ret
    //     0x6d222c: ret             
    // 0x6d2230: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d2230: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d2234: b               #0x6d21dc
  }
  iD -(iD, iD) {
    // ** addr: 0x6d2250, size: 0x8c
    // 0x6d2250: EnterFrame
    //     0x6d2250: stp             fp, lr, [SP, #-0x10]!
    //     0x6d2254: mov             fp, SP
    // 0x6d2258: AllocStack(0x10)
    //     0x6d2258: sub             SP, SP, #0x10
    // 0x6d225c: CheckStackOverflow
    //     0x6d225c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d2260: cmp             SP, x16
    //     0x6d2264: b.ls            #0x6d22bc
    // 0x6d2268: ldr             x0, [fp, #0x10]
    // 0x6d226c: r2 = Null
    //     0x6d226c: mov             x2, NULL
    // 0x6d2270: r1 = Null
    //     0x6d2270: mov             x1, NULL
    // 0x6d2274: r4 = 59
    //     0x6d2274: mov             x4, #0x3b
    // 0x6d2278: branchIfSmi(r0, 0x6d2284)
    //     0x6d2278: tbz             w0, #0, #0x6d2284
    // 0x6d227c: r4 = LoadClassIdInstr(r0)
    //     0x6d227c: ldur            x4, [x0, #-1]
    //     0x6d2280: ubfx            x4, x4, #0xc, #0x14
    // 0x6d2284: cmp             x4, #0x720
    // 0x6d2288: b.eq            #0x6d22a0
    // 0x6d228c: r8 = iD
    //     0x6d228c: add             x8, PP, #0x29, lsl #12  ; [pp+0x29300] Type: iD
    //     0x6d2290: ldr             x8, [x8, #0x300]
    // 0x6d2294: r3 = Null
    //     0x6d2294: add             x3, PP, #0x29, lsl #12  ; [pp+0x29308] Null
    //     0x6d2298: ldr             x3, [x3, #0x308]
    // 0x6d229c: r0 = iD()
    //     0x6d229c: bl              #0x6d23b8  ; IsType_iD_Stub
    // 0x6d22a0: ldr             x16, [fp, #0x18]
    // 0x6d22a4: ldr             lr, [fp, #0x10]
    // 0x6d22a8: stp             lr, x16, [SP]
    // 0x6d22ac: r0 = call 0x237d80
    //     0x6d22ac: bl              #0x237d80
    // 0x6d22b0: LeaveFrame
    //     0x6d22b0: mov             SP, fp
    //     0x6d22b4: ldp             fp, lr, [SP], #0x10
    // 0x6d22b8: ret
    //     0x6d22b8: ret             
    // 0x6d22bc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d22bc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d22c0: b               #0x6d2268
  }
  void []=(iD, int, double) {
    // ** addr: 0x6d22dc, size: 0x94
    // 0x6d22dc: EnterFrame
    //     0x6d22dc: stp             fp, lr, [SP, #-0x10]!
    //     0x6d22e0: mov             fp, SP
    // 0x6d22e4: ldr             x0, [fp, #0x18]
    // 0x6d22e8: r2 = Null
    //     0x6d22e8: mov             x2, NULL
    // 0x6d22ec: r1 = Null
    //     0x6d22ec: mov             x1, NULL
    // 0x6d22f0: branchIfSmi(r0, 0x6d2318)
    //     0x6d22f0: tbz             w0, #0, #0x6d2318
    // 0x6d22f4: r4 = LoadClassIdInstr(r0)
    //     0x6d22f4: ldur            x4, [x0, #-1]
    //     0x6d22f8: ubfx            x4, x4, #0xc, #0x14
    // 0x6d22fc: sub             x4, x4, #0x3b
    // 0x6d2300: cmp             x4, #1
    // 0x6d2304: b.ls            #0x6d2318
    // 0x6d2308: r8 = int
    //     0x6d2308: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x6d230c: r3 = Null
    //     0x6d230c: add             x3, PP, #0x31, lsl #12  ; [pp+0x31ce8] Null
    //     0x6d2310: ldr             x3, [x3, #0xce8]
    // 0x6d2314: r0 = int()
    //     0x6d2314: bl              #0x7586bc  ; IsType_int_Stub
    // 0x6d2318: ldr             x0, [fp, #0x10]
    // 0x6d231c: r2 = Null
    //     0x6d231c: mov             x2, NULL
    // 0x6d2320: r1 = Null
    //     0x6d2320: mov             x1, NULL
    // 0x6d2324: r4 = 59
    //     0x6d2324: mov             x4, #0x3b
    // 0x6d2328: branchIfSmi(r0, 0x6d2334)
    //     0x6d2328: tbz             w0, #0, #0x6d2334
    // 0x6d232c: r4 = LoadClassIdInstr(r0)
    //     0x6d232c: ldur            x4, [x0, #-1]
    //     0x6d2330: ubfx            x4, x4, #0xc, #0x14
    // 0x6d2334: cmp             x4, #0x3d
    // 0x6d2338: b.eq            #0x6d234c
    // 0x6d233c: r8 = double
    //     0x6d233c: ldr             x8, [PP, #0xca8]  ; [pp+0xca8] Type: double
    // 0x6d2340: r3 = Null
    //     0x6d2340: add             x3, PP, #0x31, lsl #12  ; [pp+0x31cf8] Null
    //     0x6d2344: ldr             x3, [x3, #0xcf8]
    // 0x6d2348: r0 = double()
    //     0x6d2348: bl              #0x758210  ; IsType_double_Stub
    // 0x6d234c: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x6d234c: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x6d2350: r0 = Throw()
    //     0x6d2350: bl              #0x74b258  ; ThrowStub
    // 0x6d2354: brk             #0
  }
  double [](iD, int) {
    // ** addr: 0x6d2370, size: 0x60
    // 0x6d2370: EnterFrame
    //     0x6d2370: stp             fp, lr, [SP, #-0x10]!
    //     0x6d2374: mov             fp, SP
    // 0x6d2378: ldr             x0, [fp, #0x10]
    // 0x6d237c: r2 = Null
    //     0x6d237c: mov             x2, NULL
    // 0x6d2380: r1 = Null
    //     0x6d2380: mov             x1, NULL
    // 0x6d2384: branchIfSmi(r0, 0x6d23ac)
    //     0x6d2384: tbz             w0, #0, #0x6d23ac
    // 0x6d2388: r4 = LoadClassIdInstr(r0)
    //     0x6d2388: ldur            x4, [x0, #-1]
    //     0x6d238c: ubfx            x4, x4, #0xc, #0x14
    // 0x6d2390: sub             x4, x4, #0x3b
    // 0x6d2394: cmp             x4, #1
    // 0x6d2398: b.ls            #0x6d23ac
    // 0x6d239c: r8 = int
    //     0x6d239c: ldr             x8, [PP, #0x940]  ; [pp+0x940] Type: int
    // 0x6d23a0: r3 = Null
    //     0x6d23a0: add             x3, PP, #0x20, lsl #12  ; [pp+0x20d68] Null
    //     0x6d23a4: ldr             x3, [x3, #0xd68]
    // 0x6d23a8: r0 = int()
    //     0x6d23a8: bl              #0x7586bc  ; IsType_int_Stub
    // 0x6d23ac: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x6d23ac: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x6d23b0: r0 = Throw()
    //     0x6d23b0: bl              #0x74b258  ; ThrowStub
    // 0x6d23b4: brk             #0
  }
}
