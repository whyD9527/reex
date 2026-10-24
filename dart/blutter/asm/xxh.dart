// lib: , url: xxh

// class id: 1048658, size: 0x8
class :: {
}

// class id: 3877, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class Mv extends Object {
}

// class id: 3878, size: 0xc, field offset: 0x8
//   const constructor, 
class _Nv extends Mv {

  bool field_8;

  dynamic DDb<Y0>(_Nv, Y0) {
    // ** addr: 0x6efa58, size: 0xac
    // 0x6efa58: EnterFrame
    //     0x6efa58: stp             fp, lr, [SP, #-0x10]!
    //     0x6efa5c: mov             fp, SP
    // 0x6efa60: AllocStack(0x20)
    //     0x6efa60: sub             SP, SP, #0x20
    // 0x6efa64: SetupParameters()
    //     0x6efa64: mov             x0, x4
    //     0x6efa68: ldur            w1, [x0, #0xf]
    //     0x6efa6c: add             x1, x1, HEAP, lsl #32
    //     0x6efa70: cbnz            w1, #0x6efa7c
    //     0x6efa74: mov             x3, NULL
    //     0x6efa78: b               #0x6efa90
    //     0x6efa7c: ldur            w1, [x0, #0x17]
    //     0x6efa80: add             x1, x1, HEAP, lsl #32
    //     0x6efa84: add             x0, fp, w1, sxtw #2
    //     0x6efa88: ldr             x0, [x0, #0x10]
    //     0x6efa8c: mov             x3, x0
    //     0x6efa90: stur            x3, [fp, #-8]
    // 0x6efa94: CheckStackOverflow
    //     0x6efa94: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6efa98: cmp             SP, x16
    //     0x6efa9c: b.ls            #0x6efafc
    // 0x6efaa0: ldr             x0, [fp, #0x10]
    // 0x6efaa4: mov             x1, x3
    // 0x6efaa8: r2 = Null
    //     0x6efaa8: mov             x2, NULL
    // 0x6efaac: cmp             w1, NULL
    // 0x6efab0: b.eq            #0x6efad4
    // 0x6efab4: ArrayLoad: r4 = r1[0]  ; List_4
    //     0x6efab4: ldur            w4, [x1, #0x17]
    // 0x6efab8: DecompressPointer r4
    //     0x6efab8: add             x4, x4, HEAP, lsl #32
    // 0x6efabc: r8 = Y0
    //     0x6efabc: add             x8, PP, #0x1f, lsl #12  ; [pp+0x1f860] TypeParameter: Y0
    //     0x6efac0: ldr             x8, [x8, #0x860]
    // 0x6efac4: LoadField: r9 = r4->field_7
    //     0x6efac4: ldur            x9, [x4, #7]
    // 0x6efac8: r3 = Null
    //     0x6efac8: add             x3, PP, #0x1f, lsl #12  ; [pp+0x1f868] Null
    //     0x6efacc: ldr             x3, [x3, #0x868]
    // 0x6efad0: blr             x9
    // 0x6efad4: ldur            x16, [fp, #-8]
    // 0x6efad8: ldr             lr, [fp, #0x18]
    // 0x6efadc: stp             lr, x16, [SP, #8]
    // 0x6efae0: ldr             x16, [fp, #0x10]
    // 0x6efae4: str             x16, [SP]
    // 0x6efae8: r4 = const [0x1, 0x2, 0x2, 0x2, null]
    //     0x6efae8: ldr             x4, [PP, #0x58]  ; [pp+0x58] List(5) [0x1, 0x2, 0x2, 0x2, Null]
    // 0x6efaec: r0 = call 0x3785ec
    //     0x6efaec: bl              #0x3785ec
    // 0x6efaf0: LeaveFrame
    //     0x6efaf0: mov             SP, fp
    //     0x6efaf4: ldp             fp, lr, [SP], #0x10
    // 0x6efaf8: ret
    //     0x6efaf8: ret             
    // 0x6efafc: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6efafc: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6efb00: b               #0x6efaa0
  }
}

// class id: 3879, size: 0x14, field offset: 0x8
//   const constructor, 
class Lv<X0> extends Object {

  bool field_c;
  _OneByteString field_10;
}

// class id: 3880, size: 0xc, field offset: 0x8
//   const constructor, 
abstract class Kv<X0> extends Object
    implements Hv<X0> {
}

// class id: 3885, size: 0x8, field offset: 0x8
//   const constructor, 
abstract class Jv extends Object {
}

// class id: 3891, size: 0xc, field offset: 0x8
//   const constructor, 
abstract class Hv<X0> extends Object {
}
