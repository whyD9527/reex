// lib: , url: AHh

// class id: 1049132, size: 0x8
class :: {
}

// class id: 793, size: 0x8, field offset: 0x8
//   const constructor, 
class bza extends Object {

  iza<Y0> call<Y0 extends UB?>(bza, (dynamic, fza<Y0>) => Y0, {String? name, Iterable<hPa>? zYc}) {
    // ** addr: 0x707d1c, size: 0x1f8
    // 0x707d1c: EnterFrame
    //     0x707d1c: stp             fp, lr, [SP, #-0x10]!
    //     0x707d20: mov             fp, SP
    // 0x707d24: AllocStack(0x50)
    //     0x707d24: sub             SP, SP, #0x50
    // 0x707d28: SetupParameters(bza this /* r4, fp-0x28 */, dynamic _ /* r5, fp-0x20 */, {dynamic name = Null /* r6, fp-0x18 */, dynamic zYc = Null /* r7, fp-0x10 */})
    //     0x707d28: mov             x0, x4
    //     0x707d2c: ldur            w1, [x0, #0x13]
    //     0x707d30: add             x1, x1, HEAP, lsl #32
    //     0x707d34: sub             x2, x1, #4
    //     0x707d38: add             x4, fp, w2, sxtw #2
    //     0x707d3c: ldr             x4, [x4, #0x18]
    //     0x707d40: stur            x4, [fp, #-0x28]
    //     0x707d44: add             x5, fp, w2, sxtw #2
    //     0x707d48: ldr             x5, [x5, #0x10]
    //     0x707d4c: stur            x5, [fp, #-0x20]
    //     0x707d50: ldur            w2, [x0, #0x1f]
    //     0x707d54: add             x2, x2, HEAP, lsl #32
    //     0x707d58: ldr             x16, [PP, #0x66e0]  ; [pp+0x66e0] "name"
    //     0x707d5c: cmp             w2, w16
    //     0x707d60: b.ne            #0x707d84
    //     0x707d64: ldur            w2, [x0, #0x23]
    //     0x707d68: add             x2, x2, HEAP, lsl #32
    //     0x707d6c: sub             w3, w1, w2
    //     0x707d70: add             x2, fp, w3, sxtw #2
    //     0x707d74: ldr             x2, [x2, #8]
    //     0x707d78: mov             x6, x2
    //     0x707d7c: mov             x2, #1
    //     0x707d80: b               #0x707d8c
    //     0x707d84: mov             x6, NULL
    //     0x707d88: mov             x2, #0
    //     0x707d8c: stur            x6, [fp, #-0x18]
    //     0x707d90: lsl             x3, x2, #1
    //     0x707d94: lsl             w2, w3, #1
    //     0x707d98: add             w3, w2, #8
    //     0x707d9c: add             x16, x0, w3, sxtw #1
    //     0x707da0: ldur            w7, [x16, #0xf]
    //     0x707da4: add             x7, x7, HEAP, lsl #32
    //     0x707da8: add             x16, PP, #0x19, lsl #12  ; [pp+0x19d08] "zYc"
    //     0x707dac: ldr             x16, [x16, #0xd08]
    //     0x707db0: cmp             w7, w16
    //     0x707db4: b.ne            #0x707ddc
    //     0x707db8: add             w3, w2, #0xa
    //     0x707dbc: add             x16, x0, w3, sxtw #1
    //     0x707dc0: ldur            w2, [x16, #0xf]
    //     0x707dc4: add             x2, x2, HEAP, lsl #32
    //     0x707dc8: sub             w3, w1, w2
    //     0x707dcc: add             x1, fp, w3, sxtw #2
    //     0x707dd0: ldr             x1, [x1, #8]
    //     0x707dd4: mov             x7, x1
    //     0x707dd8: b               #0x707de0
    //     0x707ddc: mov             x7, NULL
    //     0x707de0: stur            x7, [fp, #-0x10]
    //     0x707de4: ldur            w1, [x0, #0xf]
    //     0x707de8: add             x1, x1, HEAP, lsl #32
    //     0x707dec: cbnz            w1, #0x707df8
    //     0x707df0: mov             x0, NULL
    //     0x707df4: b               #0x707e08
    //     0x707df8: ldur            w2, [x0, #0x17]
    //     0x707dfc: add             x2, x2, HEAP, lsl #32
    //     0x707e00: add             x0, fp, w2, sxtw #2
    //     0x707e04: ldr             x0, [x0, #0x10]
    // 0x707e08: CheckStackOverflow
    //     0x707e08: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x707e0c: cmp             SP, x16
    //     0x707e10: b.ls            #0x707f0c
    // 0x707e14: cbnz            w1, #0x707e24
    // 0x707e18: r9 = <UB?>
    //     0x707e18: add             x9, PP, #0x10, lsl #12  ; [pp+0x10010] TypeArguments: <UB?>
    //     0x707e1c: ldr             x9, [x9, #0x10]
    // 0x707e20: b               #0x707e28
    // 0x707e24: mov             x9, x0
    // 0x707e28: mov             x1, x9
    // 0x707e2c: stur            x9, [fp, #-8]
    // 0x707e30: r2 = Null
    //     0x707e30: mov             x2, NULL
    // 0x707e34: r0 = Y0 bound UB?
    //     0x707e34: add             x0, PP, #0x19, lsl #12  ; [pp+0x19d10] TypeParameter: Y0 bound UB?
    //     0x707e38: ldr             x0, [x0, #0xd10]
    // 0x707e3c: r8 = UB?
    //     0x707e3c: add             x8, PP, #0x19, lsl #12  ; [pp+0x19d18] Type: UB?
    //     0x707e40: ldr             x8, [x8, #0xd18]
    // 0x707e44: r3 = "sUe"
    //     0x707e44: add             x3, PP, #0x19, lsl #12  ; [pp+0x19d20] "sUe"
    //     0x707e48: ldr             x3, [x3, #0xd20]
    // 0x707e4c: r30 = AssertSubtypeStub
    //     0x707e4c: ldr             lr, [PP, #0x328]  ; [pp+0x328] Stub: AssertSubtype (0x1f3248)
    // 0x707e50: LoadField: r30 = r30->field_7
    //     0x707e50: ldur            lr, [lr, #7]
    // 0x707e54: blr             lr
    // 0x707e58: ldur            x0, [fp, #-0x20]
    // 0x707e5c: ldur            x1, [fp, #-8]
    // 0x707e60: r2 = Null
    //     0x707e60: mov             x2, NULL
    // 0x707e64: r8 = (dynamic this, fza<Y0 bound UB?>) => Y0 bound UB?
    //     0x707e64: add             x8, PP, #0x19, lsl #12  ; [pp+0x19d28] FunctionType: (dynamic this, fza<Y0 bound UB?>) => Y0 bound UB?
    //     0x707e68: ldr             x8, [x8, #0xd28]
    // 0x707e6c: LoadField: r9 = r8->field_7
    //     0x707e6c: ldur            x9, [x8, #7]
    // 0x707e70: r3 = Null
    //     0x707e70: add             x3, PP, #0x19, lsl #12  ; [pp+0x19d30] Null
    //     0x707e74: ldr             x3, [x3, #0xd30]
    // 0x707e78: blr             x9
    // 0x707e7c: ldur            x0, [fp, #-0x18]
    // 0x707e80: r2 = Null
    //     0x707e80: mov             x2, NULL
    // 0x707e84: r1 = Null
    //     0x707e84: mov             x1, NULL
    // 0x707e88: r4 = 59
    //     0x707e88: mov             x4, #0x3b
    // 0x707e8c: branchIfSmi(r0, 0x707e98)
    //     0x707e8c: tbz             w0, #0, #0x707e98
    // 0x707e90: r4 = LoadClassIdInstr(r0)
    //     0x707e90: ldur            x4, [x0, #-1]
    //     0x707e94: ubfx            x4, x4, #0xc, #0x14
    // 0x707e98: sub             x4, x4, #0x5d
    // 0x707e9c: cmp             x4, #3
    // 0x707ea0: b.ls            #0x707eb4
    // 0x707ea4: r8 = String?
    //     0x707ea4: ldr             x8, [PP, #0xad0]  ; [pp+0xad0] Type: String?
    // 0x707ea8: r3 = Null
    //     0x707ea8: add             x3, PP, #0x19, lsl #12  ; [pp+0x19d40] Null
    //     0x707eac: ldr             x3, [x3, #0xd40]
    // 0x707eb0: r0 = String?()
    //     0x707eb0: bl              #0x6c8c00  ; IsType_String?_Stub
    // 0x707eb4: ldur            x0, [fp, #-0x10]
    // 0x707eb8: r2 = Null
    //     0x707eb8: mov             x2, NULL
    // 0x707ebc: r1 = Null
    //     0x707ebc: mov             x1, NULL
    // 0x707ec0: r8 = Iterable<hPa>?
    //     0x707ec0: add             x8, PP, #0x19, lsl #12  ; [pp+0x19d50] Type: Iterable<hPa>?
    //     0x707ec4: ldr             x8, [x8, #0xd50]
    // 0x707ec8: r3 = Null
    //     0x707ec8: add             x3, PP, #0x19, lsl #12  ; [pp+0x19d58] Null
    //     0x707ecc: ldr             x3, [x3, #0xd58]
    // 0x707ed0: r0 = Iterable<hPa>?()
    //     0x707ed0: bl              #0x707f14  ; IsType_Iterable<hPa>?_Stub
    // 0x707ed4: ldur            x16, [fp, #-8]
    // 0x707ed8: ldur            lr, [fp, #-0x28]
    // 0x707edc: stp             lr, x16, [SP, #0x18]
    // 0x707ee0: ldur            x16, [fp, #-0x20]
    // 0x707ee4: ldur            lr, [fp, #-0x18]
    // 0x707ee8: stp             lr, x16, [SP, #8]
    // 0x707eec: ldur            x16, [fp, #-0x10]
    // 0x707ef0: str             x16, [SP]
    // 0x707ef4: r4 = const [0x1, 0x4, 0x4, 0x2, name, 0x2, zYc, 0x3, null]
    //     0x707ef4: add             x4, PP, #0x19, lsl #12  ; [pp+0x19d68] List(9) [0x1, 0x4, 0x4, 0x2, "name", 0x2, "zYc", 0x3, Null]
    //     0x707ef8: ldr             x4, [x4, #0xd68]
    // 0x707efc: r0 = call 0x420cac
    //     0x707efc: bl              #0x420cac
    // 0x707f00: LeaveFrame
    //     0x707f00: mov             SP, fp
    //     0x707f04: ldp             fp, lr, [SP], #0x10
    // 0x707f08: ret
    //     0x707f08: ret             
    // 0x707f0c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x707f0c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x707f10: b               #0x707e14
  }
}
