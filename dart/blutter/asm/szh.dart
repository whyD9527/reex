// lib: , url: Szh

// class id: 1048758, size: 0x8
class :: {
}

// class id: 2074, size: 0x1c, field offset: 0x8
class lF extends Object {
}

// class id: 2077, size: 0x10, field offset: 0x8
//   const constructor, 
class _aG extends Object {
}

// class id: 2078, size: 0x1c, field offset: 0x8
//   const constructor, 
class kF extends Object {

  Tq field_8;
  _Double field_c;
  Da field_14;
  Tq field_18;
}

// class id: 2079, size: 0xc, field offset: 0x8
//   const constructor, 
class fD extends Object {

  Tq field_8;

  fD -(fD, fD) {
    // ** addr: 0x7071d4, size: 0x8c
    // 0x7071d4: EnterFrame
    //     0x7071d4: stp             fp, lr, [SP, #-0x10]!
    //     0x7071d8: mov             fp, SP
    // 0x7071dc: AllocStack(0x10)
    //     0x7071dc: sub             SP, SP, #0x10
    // 0x7071e0: CheckStackOverflow
    //     0x7071e0: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x7071e4: cmp             SP, x16
    //     0x7071e8: b.ls            #0x707240
    // 0x7071ec: ldr             x0, [fp, #0x10]
    // 0x7071f0: r2 = Null
    //     0x7071f0: mov             x2, NULL
    // 0x7071f4: r1 = Null
    //     0x7071f4: mov             x1, NULL
    // 0x7071f8: r4 = 59
    //     0x7071f8: mov             x4, #0x3b
    // 0x7071fc: branchIfSmi(r0, 0x707208)
    //     0x7071fc: tbz             w0, #0, #0x707208
    // 0x707200: r4 = LoadClassIdInstr(r0)
    //     0x707200: ldur            x4, [x0, #-1]
    //     0x707204: ubfx            x4, x4, #0xc, #0x14
    // 0x707208: cmp             x4, #0x81f
    // 0x70720c: b.eq            #0x707224
    // 0x707210: r8 = fD
    //     0x707210: add             x8, PP, #0x29, lsl #12  ; [pp+0x293b0] Type: fD
    //     0x707214: ldr             x8, [x8, #0x3b0]
    // 0x707218: r3 = Null
    //     0x707218: add             x3, PP, #0x29, lsl #12  ; [pp+0x293c8] Null
    //     0x70721c: ldr             x3, [x3, #0x3c8]
    // 0x707220: r0 = DefaultTypeTest()
    //     0x707220: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x707224: ldr             x16, [fp, #0x18]
    // 0x707228: ldr             lr, [fp, #0x10]
    // 0x70722c: stp             lr, x16, [SP]
    // 0x707230: r0 = call 0x410170
    //     0x707230: bl              #0x410170
    // 0x707234: LeaveFrame
    //     0x707234: mov             SP, fp
    //     0x707238: ldp             fp, lr, [SP], #0x10
    // 0x70723c: ret
    //     0x70723c: ret             
    // 0x707240: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x707240: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x707244: b               #0x7071ec
  }
  fD +(fD, fD) {
    // ** addr: 0x70726c, size: 0x64
    // 0x70726c: EnterFrame
    //     0x70726c: stp             fp, lr, [SP, #-0x10]!
    //     0x707270: mov             fp, SP
    // 0x707274: ldr             x0, [fp, #0x10]
    // 0x707278: r2 = Null
    //     0x707278: mov             x2, NULL
    // 0x70727c: r1 = Null
    //     0x70727c: mov             x1, NULL
    // 0x707280: r4 = 59
    //     0x707280: mov             x4, #0x3b
    // 0x707284: branchIfSmi(r0, 0x707290)
    //     0x707284: tbz             w0, #0, #0x707290
    // 0x707288: r4 = LoadClassIdInstr(r0)
    //     0x707288: ldur            x4, [x0, #-1]
    //     0x70728c: ubfx            x4, x4, #0xc, #0x14
    // 0x707290: cmp             x4, #0x81f
    // 0x707294: b.eq            #0x7072ac
    // 0x707298: r8 = fD
    //     0x707298: add             x8, PP, #0x29, lsl #12  ; [pp+0x293b0] Type: fD
    //     0x70729c: ldr             x8, [x8, #0x3b0]
    // 0x7072a0: r3 = Null
    //     0x7072a0: add             x3, PP, #0x29, lsl #12  ; [pp+0x293b8] Null
    //     0x7072a4: ldr             x3, [x3, #0x3b8]
    // 0x7072a8: r0 = DefaultTypeTest()
    //     0x7072a8: bl              #0x74aee8  ; DefaultTypeTestStub
    // 0x7072ac: r0 = "Attempt to execute code removed by Dart AOT compiler (TFA)"
    //     0x7072ac: ldr             x0, [PP, #0x6b8]  ; [pp+0x6b8] "Attempt to execute code removed by Dart AOT compiler (TFA)"
    // 0x7072b0: r0 = Throw()
    //     0x7072b0: bl              #0x74b258  ; ThrowStub
    // 0x7072b4: brk             #0
  }
}
