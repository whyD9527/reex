// lib: , url: JCh

// class id: 1048890, size: 0x8
class :: {
}

// class id: 1859, size: 0x28, field offset: 0x8
//   const constructor, 
class QS extends Object {

  _Double field_8;
  _Mint field_10;
  _Double field_18;
  _Double field_20;
}

// class id: 1860, size: 0x28, field offset: 0x8
//   const constructor, 
class PS extends Object {

  _Mint field_8;
  _Mint field_10;
  _Mint field_18;
  _Mint field_20;
}

// class id: 4106, size: 0x18, field offset: 0x10
//   const constructor, 
abstract class tI<X0> extends cr {

  cr? [](tI<X0>, X0) {
    // ** addr: 0x6e17c0, size: 0x94
    // 0x6e17c0: EnterFrame
    //     0x6e17c0: stp             fp, lr, [SP, #-0x10]!
    //     0x6e17c4: mov             fp, SP
    // 0x6e17c8: AllocStack(0x10)
    //     0x6e17c8: sub             SP, SP, #0x10
    // 0x6e17cc: CheckStackOverflow
    //     0x6e17cc: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6e17d0: cmp             SP, x16
    //     0x6e17d4: b.ls            #0x6e1834
    // 0x6e17d8: ldr             x3, [fp, #0x18]
    // 0x6e17dc: LoadField: r2 = r3->field_f
    //     0x6e17dc: ldur            w2, [x3, #0xf]
    // 0x6e17e0: DecompressPointer r2
    //     0x6e17e0: add             x2, x2, HEAP, lsl #32
    // 0x6e17e4: ldr             x0, [fp, #0x10]
    // 0x6e17e8: r1 = Null
    //     0x6e17e8: mov             x1, NULL
    // 0x6e17ec: cmp             w2, NULL
    // 0x6e17f0: b.eq            #0x6e1810
    // 0x6e17f4: ArrayLoad: r4 = r2[0]  ; List_4
    //     0x6e17f4: ldur            w4, [x2, #0x17]
    // 0x6e17f8: DecompressPointer r4
    //     0x6e17f8: add             x4, x4, HEAP, lsl #32
    // 0x6e17fc: r8 = X0
    //     0x6e17fc: ldr             x8, [PP, #0x158]  ; [pp+0x158] TypeParameter: X0
    // 0x6e1800: LoadField: r9 = r4->field_7
    //     0x6e1800: ldur            x9, [x4, #7]
    // 0x6e1804: r3 = Null
    //     0x6e1804: add             x3, PP, #0xd, lsl #12  ; [pp+0xd7b8] Null
    //     0x6e1808: ldr             x3, [x3, #0x7b8]
    // 0x6e180c: blr             x9
    // 0x6e1810: ldr             x0, [fp, #0x18]
    // 0x6e1814: LoadField: r1 = r0->field_13
    //     0x6e1814: ldur            w1, [x0, #0x13]
    // 0x6e1818: DecompressPointer r1
    //     0x6e1818: add             x1, x1, HEAP, lsl #32
    // 0x6e181c: ldr             x16, [fp, #0x10]
    // 0x6e1820: stp             x16, x1, [SP]
    // 0x6e1824: r0 = []()
    //     0x6e1824: bl              #0x73a8a0  ; [dart:collection] _nd::[]
    // 0x6e1828: LeaveFrame
    //     0x6e1828: mov             SP, fp
    //     0x6e182c: ldp             fp, lr, [SP], #0x10
    // 0x6e1830: ret
    //     0x6e1830: ret             
    // 0x6e1834: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6e1834: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6e1838: b               #0x6e17d8
  }
}
