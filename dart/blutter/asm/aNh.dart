// lib: , url: ANh

// class id: 1049431, size: 0x8
class :: {
}

// class id: 483, size: 0x8, field offset: 0x8
abstract class nOa extends Object {

  static late final aza _cHc; // offset: 0xe68

  [closure] static Null <anonymous closure>(dynamic) {
    // ** addr: 0x6fe6b8, size: 0xd4
    // 0x6fe6b8: EnterFrame
    //     0x6fe6b8: stp             fp, lr, [SP, #-0x10]!
    //     0x6fe6bc: mov             fp, SP
    // 0x6fe6c0: AllocStack(0x50)
    //     0x6fe6c0: sub             SP, SP, #0x50
    // 0x6fe6c4: SetupParameters([dynamic _ /* r0 */])
    //     0x6fe6c4: ldr             x0, [fp, #0x10]
    //     0x6fe6c8: ldur            w1, [x0, #0x17]
    //     0x6fe6cc: add             x1, x1, HEAP, lsl #32
    //     0x6fe6d0: stur            x1, [fp, #-0x38]
    // 0x6fe6d4: CheckStackOverflow
    //     0x6fe6d4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6fe6d8: cmp             SP, x16
    //     0x6fe6dc: b.ls            #0x6fe784
    // 0x6fe6e0: LoadField: r0 = r1->field_13
    //     0x6fe6e0: ldur            w0, [x1, #0x13]
    // 0x6fe6e4: DecompressPointer r0
    //     0x6fe6e4: add             x0, x0, HEAP, lsl #32
    // 0x6fe6e8: stur            x0, [fp, #-0x30]
    // 0x6fe6ec: str             x0, [SP]
    // 0x6fe6f0: r0 = call 0x61a920
    //     0x6fe6f0: bl              #0x61a920
    // 0x6fe6f4: tbz             w0, #4, #0x6fe708
    // 0x6fe6f8: ldur            x16, [fp, #-0x30]
    // 0x6fe6fc: r30 = true
    //     0x6fe6fc: add             lr, NULL, #0x20  ; true
    // 0x6fe700: stp             lr, x16, [SP]
    // 0x6fe704: r0 = call 0x3743c8
    //     0x6fe704: bl              #0x3743c8
    // 0x6fe708: ldur            x0, [fp, #-0x38]
    // 0x6fe70c: LoadField: r1 = r0->field_f
    //     0x6fe70c: ldur            w1, [x0, #0xf]
    // 0x6fe710: DecompressPointer r1
    //     0x6fe710: add             x1, x1, HEAP, lsl #32
    // 0x6fe714: str             x1, [SP]
    // 0x6fe718: r0 = call 0x3a7318
    //     0x6fe718: bl              #0x3a7318
    // 0x6fe71c: r16 = Instance_pf
    //     0x6fe71c: ldr             x16, [PP, #0x7820]  ; [pp+0x7820] Obj!pf@434a91
    // 0x6fe720: stp             x0, x16, [SP]
    // 0x6fe724: r0 = call 0x584728
    //     0x6fe724: bl              #0x584728
    // 0x6fe728: r1 = Null
    //     0x6fe728: mov             x1, NULL
    // 0x6fe72c: r2 = 4
    //     0x6fe72c: mov             x2, #4
    // 0x6fe730: stur            x0, [fp, #-0x38]
    // 0x6fe734: r0 = AllocateArray()
    //     0x6fe734: bl              #0x74cc68  ; AllocateArrayStub
    // 0x6fe738: mov             x1, x0
    // 0x6fe73c: ldur            x0, [fp, #-0x38]
    // 0x6fe740: StoreField: r1->field_f = r0
    //     0x6fe740: stur            w0, [x1, #0xf]
    // 0x6fe744: r17 = "\n"
    //     0x6fe744: ldr             x17, [PP, #0x2310]  ; [pp+0x2310] "\n"
    // 0x6fe748: StoreField: r1->field_13 = r17
    //     0x6fe748: stur            w17, [x1, #0x13]
    // 0x6fe74c: str             x1, [SP]
    // 0x6fe750: r0 = _interpolate()
    //     0x6fe750: bl              #0x1fb13c  ; [dart:core] _StringBase::_interpolate
    // 0x6fe754: ldur            x16, [fp, #-0x30]
    // 0x6fe758: stp             x0, x16, [SP, #8]
    // 0x6fe75c: r16 = Instance_Qp
    //     0x6fe75c: ldr             x16, [PP, #0x6c18]  ; [pp+0x6c18] Obj!Qp@4347e1
    // 0x6fe760: str             x16, [SP]
    // 0x6fe764: r4 = const [0, 0x3, 0x3, 0x2, vJb, 0x2, null]
    //     0x6fe764: ldr             x4, [PP, #0x7828]  ; [pp+0x7828] List(7) [0, 0x3, 0x3, 0x2, "vJb", 0x2, Null]
    // 0x6fe768: r0 = call 0x373bec
    //     0x6fe768: bl              #0x373bec
    // 0x6fe76c: b               #0x6fe774
    // 0x6fe770: sub             SP, fp, #0x50
    // 0x6fe774: r0 = Null
    //     0x6fe774: mov             x0, NULL
    // 0x6fe778: LeaveFrame
    //     0x6fe778: mov             SP, fp
    //     0x6fe77c: ldp             fp, lr, [SP], #0x10
    // 0x6fe780: ret
    //     0x6fe780: ret             
    // 0x6fe784: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6fe784: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6fe788: b               #0x6fe6e0
  }
  [closure] static Null <anonymous closure>(dynamic) {
    // ** addr: 0x709a78, size: 0x6c
    // 0x709a78: EnterFrame
    //     0x709a78: stp             fp, lr, [SP, #-0x10]!
    //     0x709a7c: mov             fp, SP
    // 0x709a80: AllocStack(0x38)
    //     0x709a80: sub             SP, SP, #0x38
    // 0x709a84: SetupParameters([dynamic _ /* r0 */])
    //     0x709a84: ldr             x0, [fp, #0x10]
    //     0x709a88: ldur            w1, [x0, #0x17]
    //     0x709a8c: add             x1, x1, HEAP, lsl #32
    // 0x709a90: CheckStackOverflow
    //     0x709a90: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x709a94: cmp             SP, x16
    //     0x709a98: b.ls            #0x709adc
    // 0x709a9c: LoadField: r0 = r1->field_f
    //     0x709a9c: ldur            w0, [x1, #0xf]
    // 0x709aa0: DecompressPointer r0
    //     0x709aa0: add             x0, x0, HEAP, lsl #32
    // 0x709aa4: stur            x0, [fp, #-0x30]
    // 0x709aa8: str             x0, [SP]
    // 0x709aac: r0 = call 0x61a920
    //     0x709aac: bl              #0x61a920
    // 0x709ab0: tbnz            w0, #4, #0x709acc
    // 0x709ab4: ldur            x16, [fp, #-0x30]
    // 0x709ab8: str             x16, [SP]
    // 0x709abc: r4 = const [0, 0x1, 0x1, 0x1, null]
    //     0x709abc: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    // 0x709ac0: r0 = call 0x3ad2b0
    //     0x709ac0: bl              #0x3ad2b0
    // 0x709ac4: b               #0x709acc
    // 0x709ac8: sub             SP, fp, #0x38
    // 0x709acc: r0 = Null
    //     0x709acc: mov             x0, NULL
    // 0x709ad0: LeaveFrame
    //     0x709ad0: mov             SP, fp
    //     0x709ad4: ldp             fp, lr, [SP], #0x10
    // 0x709ad8: ret
    //     0x709ad8: ret             
    // 0x709adc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x709adc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x709ae0: b               #0x709a9c
  }
  [closure] static Future<void> <anonymous closure>(dynamic) {
    // ** addr: 0x3a7038, size: -0x1
  }
  [closure] static Future<void> <anonymous closure>(dynamic) {
    // ** addr: 0x42e5d0, size: -0x1
  }
  [closure] static Future<List<mOa>> <anonymous closure>(dynamic) {
    // ** addr: 0x3b591c, size: -0x1
  }
  [closure] static List<mOa> <anonymous closure>(dynamic) {
    // ** addr: 0x3b59f4, size: -0x1
  }
  [closure] static mOa <anonymous closure>(dynamic, String) {
    // ** addr: 0x3b5c70, size: -0x1
  }
}

// class id: 484, size: 0x14, field offset: 0x8
class mOa extends Object {
}
