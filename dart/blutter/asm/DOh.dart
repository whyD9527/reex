// lib: , url: DOh

// class id: 1049472, size: 0x8
class :: {
}

// class id: 363, size: 0xc, field offset: 0x8
//   const constructor, 
abstract class SRa extends Object {
}

// class id: 364, size: 0x10, field offset: 0xc
//   const constructor, 
class WRa extends SRa {
}

// class id: 365, size: 0x10, field offset: 0xc
//   const constructor, 
class VRa extends SRa {
}

// class id: 366, size: 0x10, field offset: 0xc
//   const constructor, 
class URa extends SRa {
}

// class id: 367, size: 0x18, field offset: 0xc
//   const constructor, 
class TRa extends SRa {
}

// class id: 368, size: 0x14, field offset: 0x8
class RRa extends Object {
}

// class id: 369, size: 0x20, field offset: 0x8
class QRa extends Object {
}

// class id: 370, size: 0x18, field offset: 0x8
class NRa extends Object {

  [closure] Future<QRa> <anonymous closure>(dynamic) async {
    // ** addr: 0x74516c, size: 0x214
    // 0x74516c: EnterFrame
    //     0x74516c: stp             fp, lr, [SP, #-0x10]!
    //     0x745170: mov             fp, SP
    // 0x745174: AllocStack(0xc0)
    //     0x745174: sub             SP, SP, #0xc0
    // 0x745178: SetupParameters(NRa this /* r1, fp-0x68 */)
    //     0x745178: stur            NULL, [fp, #-8]
    //     0x74517c: mov             x0, #0
    //     0x745180: add             x1, fp, w0, sxtw #2
    //     0x745184: ldr             x1, [x1, #0x10]
    //     0x745188: stur            x1, [fp, #-0x68]
    //     0x74518c: ldur            w2, [x1, #0x17]
    //     0x745190: add             x2, x2, HEAP, lsl #32
    //     0x745194: stur            x2, [fp, #-0x60]
    // 0x745198: CheckStackOverflow
    //     0x745198: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x74519c: cmp             SP, x16
    //     0x7451a0: b.ls            #0x745378
    // 0x7451a4: InitAsync() -> Future<QRa>
    //     0x7451a4: add             x0, PP, #0x15, lsl #12  ; [pp+0x157d8] TypeArguments: <QRa>
    //     0x7451a8: ldr             x0, [x0, #0x7d8]
    //     0x7451ac: bl              #0x6cb614  ; InitAsyncStub
    // 0x7451b0: ldur            x0, [fp, #-0x60]
    // 0x7451b4: LoadField: r1 = r0->field_f
    //     0x7451b4: ldur            w1, [x0, #0xf]
    // 0x7451b8: DecompressPointer r1
    //     0x7451b8: add             x1, x1, HEAP, lsl #32
    // 0x7451bc: LoadField: r2 = r1->field_7
    //     0x7451bc: ldur            w2, [x1, #7]
    // 0x7451c0: DecompressPointer r2
    //     0x7451c0: add             x2, x2, HEAP, lsl #32
    // 0x7451c4: str             x2, [SP]
    // 0x7451c8: r0 = call 0x384768
    //     0x7451c8: bl              #0x384768
    // 0x7451cc: stur            x0, [fp, #-0x68]
    // 0x7451d0: r16 = <yRa>
    //     0x7451d0: add             x16, PP, #0x15, lsl #12  ; [pp+0x157e0] TypeArguments: <yRa>
    //     0x7451d4: ldr             x16, [x16, #0x7e0]
    // 0x7451d8: r30 = Instance_Tx
    //     0x7451d8: add             lr, PP, #0x11, lsl #12  ; [pp+0x11180] Obj!Tx@4302c1
    //     0x7451dc: ldr             lr, [lr, #0x180]
    // 0x7451e0: stp             lr, x16, [SP, #8]
    // 0x7451e4: r1 = 88
    //     0x7451e4: mov             x1, #0x58
    // 0x7451e8: str             x1, [SP]
    // 0x7451ec: r4 = const [0x1, 0x2, 0x2, 0x2, null]
    //     0x7451ec: ldr             x4, [PP, #0x58]  ; [pp+0x58] List(5) [0x1, 0x2, 0x2, 0x2, Null]
    // 0x7451f0: r0 = call 0x5de744
    //     0x7451f0: bl              #0x5de744
    // 0x7451f4: stur            x0, [fp, #-0x70]
    // 0x7451f8: ldur            x1, [fp, #-0x60]
    // 0x7451fc: r0 = InitLateStaticField(0xfb0) // [AOh] ::BJf
    //     0x7451fc: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x745200: ldr             x0, [x0, #0x1f60]
    //     0x745204: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x745208: cmp             w0, w16
    //     0x74520c: b.ne            #0x74521c
    //     0x745210: add             x2, PP, #0x15, lsl #12  ; [pp+0x155c0] Field <::.BJf>: static late final (offset: 0xfb0)
    //     0x745214: ldr             x2, [x2, #0x5c0]
    //     0x745218: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x74521c: mov             x2, x0
    // 0x745220: ldur            x0, [fp, #-0x60]
    // 0x745224: stur            x2, [fp, #-0x88]
    // 0x745228: LoadField: r1 = r0->field_f
    //     0x745228: ldur            w1, [x0, #0xf]
    // 0x74522c: DecompressPointer r1
    //     0x74522c: add             x1, x1, HEAP, lsl #32
    // 0x745230: LoadField: r3 = r1->field_7
    //     0x745230: ldur            w3, [x1, #7]
    // 0x745234: DecompressPointer r3
    //     0x745234: add             x3, x3, HEAP, lsl #32
    // 0x745238: LoadField: r4 = r3->field_b
    //     0x745238: ldur            w4, [x3, #0xb]
    // 0x74523c: DecompressPointer r4
    //     0x74523c: add             x4, x4, HEAP, lsl #32
    // 0x745240: stur            x4, [fp, #-0x80]
    // 0x745244: LoadField: r3 = r1->field_b
    //     0x745244: ldur            w3, [x1, #0xb]
    // 0x745248: DecompressPointer r3
    //     0x745248: add             x3, x3, HEAP, lsl #32
    // 0x74524c: ldur            x1, [fp, #-0x68]
    // 0x745250: stur            x3, [fp, #-0x78]
    // 0x745254: LoadField: r0 = r1->field_7
    //     0x745254: ldur            w0, [x1, #7]
    // 0x745258: DecompressPointer r0
    //     0x745258: add             x0, x0, HEAP, lsl #32
    // 0x74525c: r16 = Sentinel
    //     0x74525c: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0x745260: cmp             w0, w16
    // 0x745264: b.ne            #0x745274
    // 0x745268: r2 = _rBf
    //     0x745268: add             x2, PP, #0x15, lsl #12  ; [pp+0x156e8] Field <_LRa@874187780._rBf@874187780>: late final (offset: 0x8)
    //     0x74526c: ldr             x2, [x2, #0x6e8]
    // 0x745270: r0 = InitLateFinalInstanceField()
    //     0x745270: bl              #0x74afb8  ; InitLateFinalInstanceFieldStub
    // 0x745274: str             x0, [SP]
    // 0x745278: r0 = call 0x3722d8
    //     0x745278: bl              #0x3722d8
    // 0x74527c: stur            x0, [fp, #-0x90]
    // 0x745280: r0 = InitLateStaticField(0x554) // [dart:ffi] ::Qdb
    //     0x745280: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x745284: ldr             x0, [x0, #0xaa8]
    //     0x745288: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x74528c: cmp             w0, w16
    //     0x745290: b.ne            #0x7452a0
    //     0x745294: add             x2, PP, #0x10, lsl #12  ; [pp+0x10eb8] Field <::.Qdb>: static late final (offset: 0x554)
    //     0x745298: ldr             x2, [x2, #0xeb8]
    //     0x74529c: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x7452a0: ldur            x16, [fp, #-0x88]
    // 0x7452a4: ldur            lr, [fp, #-0x80]
    // 0x7452a8: stp             lr, x16, [SP, #0x20]
    // 0x7452ac: ldur            x16, [fp, #-0x78]
    // 0x7452b0: ldur            lr, [fp, #-0x70]
    // 0x7452b4: stp             lr, x16, [SP, #0x10]
    // 0x7452b8: ldur            x16, [fp, #-0x90]
    // 0x7452bc: stp             x0, x16, [SP]
    // 0x7452c0: r0 = call 0x69d01c
    //     0x7452c0: bl              #0x69d01c
    // 0x7452c4: tbz             x0, #0x3f, #0x7452f4
    // 0x7452c8: ldur            x0, [fp, #-0x60]
    // 0x7452cc: ldur            x16, [fp, #-0x68]
    // 0x7452d0: str             x16, [SP]
    // 0x7452d4: r0 = call 0x384564
    //     0x7452d4: bl              #0x384564
    // 0x7452d8: ldur            x0, [fp, #-0x60]
    // 0x7452dc: LoadField: r1 = r0->field_f
    //     0x7452dc: ldur            w1, [x0, #0xf]
    // 0x7452e0: DecompressPointer r1
    //     0x7452e0: add             x1, x1, HEAP, lsl #32
    // 0x7452e4: LoadField: r0 = r1->field_7
    //     0x7452e4: ldur            w0, [x1, #7]
    // 0x7452e8: DecompressPointer r0
    //     0x7452e8: add             x0, x0, HEAP, lsl #32
    // 0x7452ec: str             x0, [SP]
    // 0x7452f0: r0 = call 0x384518
    //     0x7452f0: bl              #0x384518
    // 0x7452f4: ldur            x0, [fp, #-0x70]
    // 0x7452f8: ldur            x16, [fp, #-0x68]
    // 0x7452fc: str             x16, [SP]
    // 0x745300: r0 = __unknown_function__()
    //     0x745300: bl              #0x6f83a4  ; [] ::__unknown_function__
    // 0x745304: mov             x1, x0
    // 0x745308: stur            x1, [fp, #-0x60]
    // 0x74530c: r0 = Await()
    //     0x74530c: bl              #0x6cdaec  ; AwaitStub
    // 0x745310: r0 = yRa()
    //     0x745310: bl              #0x74538c  ; AllocateyRaStub -> yRa (size=0xc)
    // 0x745314: mov             x1, x0
    // 0x745318: ldur            x0, [fp, #-0x70]
    // 0x74531c: StoreField: r1->field_7 = r0
    //     0x74531c: stur            w0, [x1, #7]
    // 0x745320: stp             x1, NULL, [SP]
    // 0x745324: r0 = call 0x69ce3c
    //     0x745324: bl              #0x69ce3c
    // 0x745328: stur            x0, [fp, #-0x60]
    // 0x74532c: r16 = Instance_Tx
    //     0x74532c: add             x16, PP, #0x11, lsl #12  ; [pp+0x11180] Obj!Tx@4302c1
    //     0x745330: ldr             x16, [x16, #0x180]
    // 0x745334: ldur            lr, [fp, #-0x70]
    // 0x745338: stp             lr, x16, [SP]
    // 0x74533c: r0 = call 0x36a364
    //     0x74533c: bl              #0x36a364
    // 0x745340: ldur            x0, [fp, #-0x60]
    // 0x745344: r0 = ReturnAsyncNotFuture()
    //     0x745344: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x745348: sub             SP, fp, #0xc0
    // 0x74534c: stur            x0, [fp, #-0x60]
    // 0x745350: stur            x1, [fp, #-0x68]
    // 0x745354: r16 = Instance_Tx
    //     0x745354: add             x16, PP, #0x11, lsl #12  ; [pp+0x11180] Obj!Tx@4302c1
    //     0x745358: ldr             x16, [x16, #0x180]
    // 0x74535c: ldur            lr, [fp, #-0x50]
    // 0x745360: stp             lr, x16, [SP]
    // 0x745364: r0 = call 0x36a364
    //     0x745364: bl              #0x36a364
    // 0x745368: ldur            x0, [fp, #-0x60]
    // 0x74536c: ldur            x1, [fp, #-0x68]
    // 0x745370: r0 = ReThrow()
    //     0x745370: bl              #0x74b234  ; ReThrowStub
    // 0x745374: brk             #0
    // 0x745378: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x745378: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x74537c: b               #0x7451a4
  }
  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x745834, size: 0x70
    // 0x745834: EnterFrame
    //     0x745834: stp             fp, lr, [SP, #-0x10]!
    //     0x745838: mov             fp, SP
    // 0x74583c: AllocStack(0x10)
    //     0x74583c: sub             SP, SP, #0x10
    // 0x745840: SetupParameters(NRa this /* r1 */)
    //     0x745840: stur            NULL, [fp, #-8]
    //     0x745844: mov             x0, #0
    //     0x745848: add             x1, fp, w0, sxtw #2
    //     0x74584c: ldr             x1, [x1, #0x10]
    //     0x745850: ldur            w2, [x1, #0x17]
    //     0x745854: add             x2, x2, HEAP, lsl #32
    //     0x745858: stur            x2, [fp, #-0x10]
    // 0x74585c: CheckStackOverflow
    //     0x74585c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x745860: cmp             SP, x16
    //     0x745864: b.ls            #0x74589c
    // 0x745868: InitAsync() -> Future<void?>
    //     0x745868: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x74586c: bl              #0x6cb614  ; InitAsyncStub
    // 0x745870: ldur            x1, [fp, #-0x10]
    // 0x745874: LoadField: r2 = r1->field_f
    //     0x745874: ldur            w2, [x1, #0xf]
    // 0x745878: DecompressPointer r2
    //     0x745878: add             x2, x2, HEAP, lsl #32
    // 0x74587c: LoadField: r3 = r1->field_13
    //     0x74587c: ldur            w3, [x1, #0x13]
    // 0x745880: DecompressPointer r3
    //     0x745880: add             x3, x3, HEAP, lsl #32
    // 0x745884: r1 = LoadInt32Instr(r3)
    //     0x745884: sbfx            x1, x3, #1, #0x1f
    //     0x745888: tbz             w3, #0, #0x745890
    //     0x74588c: ldur            x1, [x3, #7]
    // 0x745890: StoreField: r2->field_f = r1
    //     0x745890: stur            x1, [x2, #0xf]
    // 0x745894: r0 = Null
    //     0x745894: mov             x0, NULL
    // 0x745898: r0 = ReturnAsyncNotFuture()
    //     0x745898: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x74589c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x74589c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x7458a0: b               #0x745868
  }
  [closure] Future<int> <anonymous closure>(dynamic) async {
    // ** addr: 0x745cf0, size: 0x1f0
    // 0x745cf0: EnterFrame
    //     0x745cf0: stp             fp, lr, [SP, #-0x10]!
    //     0x745cf4: mov             fp, SP
    // 0x745cf8: AllocStack(0x90)
    //     0x745cf8: sub             SP, SP, #0x90
    // 0x745cfc: SetupParameters(NRa this /* r1 */)
    //     0x745cfc: stur            NULL, [fp, #-8]
    //     0x745d00: mov             x0, #0
    //     0x745d04: add             x1, fp, w0, sxtw #2
    //     0x745d08: ldr             x1, [x1, #0x10]
    //     0x745d0c: ldur            w2, [x1, #0x17]
    //     0x745d10: add             x2, x2, HEAP, lsl #32
    //     0x745d14: stur            x2, [fp, #-0x10]
    // 0x745d18: CheckStackOverflow
    //     0x745d18: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x745d1c: cmp             SP, x16
    //     0x745d20: b.ls            #0x745ed8
    // 0x745d24: InitAsync() -> Future<int>
    //     0x745d24: ldr             x0, [PP, #0x878]  ; [pp+0x878] TypeArguments: <int>
    //     0x745d28: bl              #0x6cb614  ; InitAsyncStub
    // 0x745d2c: ldur            x0, [fp, #-0x10]
    // 0x745d30: LoadField: r1 = r0->field_f
    //     0x745d30: ldur            w1, [x0, #0xf]
    // 0x745d34: DecompressPointer r1
    //     0x745d34: add             x1, x1, HEAP, lsl #32
    // 0x745d38: LoadField: r2 = r1->field_7
    //     0x745d38: ldur            w2, [x1, #7]
    // 0x745d3c: DecompressPointer r2
    //     0x745d3c: add             x2, x2, HEAP, lsl #32
    // 0x745d40: str             x2, [SP]
    // 0x745d44: r0 = call 0x384768
    //     0x745d44: bl              #0x384768
    // 0x745d48: stur            x0, [fp, #-0x18]
    // 0x745d4c: r0 = InitLateStaticField(0xfb0) // [AOh] ::BJf
    //     0x745d4c: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x745d50: ldr             x0, [x0, #0x1f60]
    //     0x745d54: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x745d58: cmp             w0, w16
    //     0x745d5c: b.ne            #0x745d6c
    //     0x745d60: add             x2, PP, #0x15, lsl #12  ; [pp+0x155c0] Field <::.BJf>: static late final (offset: 0xfb0)
    //     0x745d64: ldr             x2, [x2, #0x5c0]
    //     0x745d68: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x745d6c: mov             x1, x0
    // 0x745d70: ldur            x0, [fp, #-0x10]
    // 0x745d74: stur            x1, [fp, #-0x48]
    // 0x745d78: LoadField: r2 = r0->field_f
    //     0x745d78: ldur            w2, [x0, #0xf]
    // 0x745d7c: DecompressPointer r2
    //     0x745d7c: add             x2, x2, HEAP, lsl #32
    // 0x745d80: LoadField: r3 = r2->field_7
    //     0x745d80: ldur            w3, [x2, #7]
    // 0x745d84: DecompressPointer r3
    //     0x745d84: add             x3, x3, HEAP, lsl #32
    // 0x745d88: LoadField: r4 = r3->field_b
    //     0x745d88: ldur            w4, [x3, #0xb]
    // 0x745d8c: DecompressPointer r4
    //     0x745d8c: add             x4, x4, HEAP, lsl #32
    // 0x745d90: stur            x4, [fp, #-0x40]
    // 0x745d94: LoadField: r3 = r2->field_b
    //     0x745d94: ldur            w3, [x2, #0xb]
    // 0x745d98: DecompressPointer r3
    //     0x745d98: add             x3, x3, HEAP, lsl #32
    // 0x745d9c: stur            x3, [fp, #-0x38]
    // 0x745da0: LoadField: r5 = r0->field_13
    //     0x745da0: ldur            w5, [x0, #0x13]
    // 0x745da4: DecompressPointer r5
    //     0x745da4: add             x5, x5, HEAP, lsl #32
    // 0x745da8: stur            x5, [fp, #-0x30]
    // 0x745dac: ArrayLoad: r6 = r0[0]  ; List_4
    //     0x745dac: ldur            w6, [x0, #0x17]
    // 0x745db0: DecompressPointer r6
    //     0x745db0: add             x6, x6, HEAP, lsl #32
    // 0x745db4: stur            x6, [fp, #-0x28]
    // 0x745db8: LoadField: r7 = r2->field_f
    //     0x745db8: ldur            x7, [x2, #0xf]
    // 0x745dbc: stur            x7, [fp, #-0x20]
    // 0x745dc0: ldur            x16, [fp, #-0x18]
    // 0x745dc4: str             x16, [SP]
    // 0x745dc8: r0 = call 0x69de98
    //     0x745dc8: bl              #0x69de98
    // 0x745dcc: stur            x0, [fp, #-0x50]
    // 0x745dd0: r0 = InitLateStaticField(0x554) // [dart:ffi] ::Qdb
    //     0x745dd0: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x745dd4: ldr             x0, [x0, #0xaa8]
    //     0x745dd8: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x745ddc: cmp             w0, w16
    //     0x745de0: b.ne            #0x745df0
    //     0x745de4: add             x2, PP, #0x10, lsl #12  ; [pp+0x10eb8] Field <::.Qdb>: static late final (offset: 0x554)
    //     0x745de8: ldr             x2, [x2, #0xeb8]
    //     0x745dec: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x745df0: mov             x1, x0
    // 0x745df4: ldur            x0, [fp, #-0x28]
    // 0x745df8: r2 = LoadInt32Instr(r0)
    //     0x745df8: sbfx            x2, x0, #1, #0x1f
    //     0x745dfc: tbz             w0, #0, #0x745e04
    //     0x745e00: ldur            x2, [x0, #7]
    // 0x745e04: ldur            x16, [fp, #-0x48]
    // 0x745e08: ldur            lr, [fp, #-0x40]
    // 0x745e0c: stp             lr, x16, [SP, #0x30]
    // 0x745e10: ldur            x16, [fp, #-0x38]
    // 0x745e14: ldur            lr, [fp, #-0x30]
    // 0x745e18: stp             lr, x16, [SP, #0x20]
    // 0x745e1c: str             x2, [SP, #0x18]
    // 0x745e20: ldur            x0, [fp, #-0x20]
    // 0x745e24: ldur            x16, [fp, #-0x50]
    // 0x745e28: stp             x16, x0, [SP, #8]
    // 0x745e2c: str             x1, [SP]
    // 0x745e30: r0 = call 0x69db84
    //     0x745e30: bl              #0x69db84
    // 0x745e34: tbz             x0, #0x3f, #0x745e64
    // 0x745e38: ldur            x0, [fp, #-0x10]
    // 0x745e3c: ldur            x16, [fp, #-0x18]
    // 0x745e40: str             x16, [SP]
    // 0x745e44: r0 = call 0x384564
    //     0x745e44: bl              #0x384564
    // 0x745e48: ldur            x0, [fp, #-0x10]
    // 0x745e4c: LoadField: r1 = r0->field_f
    //     0x745e4c: ldur            w1, [x0, #0xf]
    // 0x745e50: DecompressPointer r1
    //     0x745e50: add             x1, x1, HEAP, lsl #32
    // 0x745e54: LoadField: r2 = r1->field_7
    //     0x745e54: ldur            w2, [x1, #7]
    // 0x745e58: DecompressPointer r2
    //     0x745e58: add             x2, x2, HEAP, lsl #32
    // 0x745e5c: str             x2, [SP]
    // 0x745e60: r0 = call 0x384518
    //     0x745e60: bl              #0x384518
    // 0x745e64: ldur            x0, [fp, #-0x10]
    // 0x745e68: ldur            x16, [fp, #-0x18]
    // 0x745e6c: str             x16, [SP]
    // 0x745e70: r0 = __unknown_function__()
    //     0x745e70: bl              #0x6f83a4  ; [] ::__unknown_function__
    // 0x745e74: mov             x1, x0
    // 0x745e78: stur            x1, [fp, #-0x18]
    // 0x745e7c: r0 = Await()
    //     0x745e7c: bl              #0x6cdaec  ; AwaitStub
    // 0x745e80: LoadField: r2 = r0->field_f
    //     0x745e80: ldur            w2, [x0, #0xf]
    // 0x745e84: DecompressPointer r2
    //     0x745e84: add             x2, x2, HEAP, lsl #32
    // 0x745e88: ldur            x0, [fp, #-0x10]
    // 0x745e8c: stur            x2, [fp, #-0x28]
    // 0x745e90: LoadField: r3 = r0->field_f
    //     0x745e90: ldur            w3, [x0, #0xf]
    // 0x745e94: DecompressPointer r3
    //     0x745e94: add             x3, x3, HEAP, lsl #32
    // 0x745e98: stur            x3, [fp, #-0x18]
    // 0x745e9c: LoadField: r4 = r3->field_f
    //     0x745e9c: ldur            x4, [x3, #0xf]
    // 0x745ea0: r0 = BoxInt64Instr(r4)
    //     0x745ea0: sbfiz           x0, x4, #1, #0x1f
    //     0x745ea4: cmp             x4, x0, asr #1
    //     0x745ea8: b.eq            #0x745eb4
    //     0x745eac: bl              #0x74cee4  ; AllocateMintSharedWithoutFPURegsStub
    //     0x745eb0: stur            x4, [x0, #7]
    // 0x745eb4: stp             x2, x0, [SP]
    // 0x745eb8: r0 = call 0x6adea4
    //     0x745eb8: bl              #0x6adea4
    // 0x745ebc: r1 = LoadInt32Instr(r0)
    //     0x745ebc: sbfx            x1, x0, #1, #0x1f
    //     0x745ec0: tbz             w0, #0, #0x745ec8
    //     0x745ec4: ldur            x1, [x0, #7]
    // 0x745ec8: ldur            x2, [fp, #-0x18]
    // 0x745ecc: StoreField: r2->field_f = r1
    //     0x745ecc: stur            x1, [x2, #0xf]
    // 0x745ed0: ldur            x0, [fp, #-0x28]
    // 0x745ed4: r0 = ReturnAsync()
    //     0x745ed4: b               #0x6ca270  ; ReturnAsyncStub
    // 0x745ed8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x745ed8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x745edc: b               #0x745d24
  }
}

// class id: 371, size: 0x14, field offset: 0x8
class MRa extends Object {

  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x6f8258, size: 0x14c
    // 0x6f8258: EnterFrame
    //     0x6f8258: stp             fp, lr, [SP, #-0x10]!
    //     0x6f825c: mov             fp, SP
    // 0x6f8260: AllocStack(0x50)
    //     0x6f8260: sub             SP, SP, #0x50
    // 0x6f8264: SetupParameters(MRa this /* r1 */)
    //     0x6f8264: stur            NULL, [fp, #-8]
    //     0x6f8268: mov             x0, #0
    //     0x6f826c: add             x1, fp, w0, sxtw #2
    //     0x6f8270: ldr             x1, [x1, #0x10]
    //     0x6f8274: ldur            w2, [x1, #0x17]
    //     0x6f8278: add             x2, x2, HEAP, lsl #32
    //     0x6f827c: stur            x2, [fp, #-0x10]
    // 0x6f8280: CheckStackOverflow
    //     0x6f8280: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6f8284: cmp             SP, x16
    //     0x6f8288: b.ls            #0x6f839c
    // 0x6f828c: InitAsync() -> Future<void?>
    //     0x6f828c: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x6f8290: bl              #0x6cb614  ; InitAsyncStub
    // 0x6f8294: ldur            x0, [fp, #-0x10]
    // 0x6f8298: LoadField: r1 = r0->field_f
    //     0x6f8298: ldur            w1, [x0, #0xf]
    // 0x6f829c: DecompressPointer r1
    //     0x6f829c: add             x1, x1, HEAP, lsl #32
    // 0x6f82a0: str             x1, [SP]
    // 0x6f82a4: r0 = call 0x384768
    //     0x6f82a4: bl              #0x384768
    // 0x6f82a8: stur            x0, [fp, #-0x18]
    // 0x6f82ac: r0 = InitLateStaticField(0xfb0) // [AOh] ::BJf
    //     0x6f82ac: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f82b0: ldr             x0, [x0, #0x1f60]
    //     0x6f82b4: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f82b8: cmp             w0, w16
    //     0x6f82bc: b.ne            #0x6f82cc
    //     0x6f82c0: add             x2, PP, #0x15, lsl #12  ; [pp+0x155c0] Field <::.BJf>: static late final (offset: 0xfb0)
    //     0x6f82c4: ldr             x2, [x2, #0x5c0]
    //     0x6f82c8: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f82cc: mov             x2, x0
    // 0x6f82d0: ldur            x0, [fp, #-0x10]
    // 0x6f82d4: stur            x2, [fp, #-0x28]
    // 0x6f82d8: LoadField: r1 = r0->field_f
    //     0x6f82d8: ldur            w1, [x0, #0xf]
    // 0x6f82dc: DecompressPointer r1
    //     0x6f82dc: add             x1, x1, HEAP, lsl #32
    // 0x6f82e0: LoadField: r3 = r1->field_b
    //     0x6f82e0: ldur            w3, [x1, #0xb]
    // 0x6f82e4: DecompressPointer r3
    //     0x6f82e4: add             x3, x3, HEAP, lsl #32
    // 0x6f82e8: ldur            x1, [fp, #-0x18]
    // 0x6f82ec: stur            x3, [fp, #-0x20]
    // 0x6f82f0: LoadField: r0 = r1->field_7
    //     0x6f82f0: ldur            w0, [x1, #7]
    // 0x6f82f4: DecompressPointer r0
    //     0x6f82f4: add             x0, x0, HEAP, lsl #32
    // 0x6f82f8: r16 = Sentinel
    //     0x6f82f8: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0x6f82fc: cmp             w0, w16
    // 0x6f8300: b.ne            #0x6f8310
    // 0x6f8304: r2 = _rBf
    //     0x6f8304: add             x2, PP, #0x15, lsl #12  ; [pp+0x156e8] Field <_LRa@874187780._rBf@874187780>: late final (offset: 0x8)
    //     0x6f8308: ldr             x2, [x2, #0x6e8]
    // 0x6f830c: r0 = InitLateFinalInstanceField()
    //     0x6f830c: bl              #0x74afb8  ; InitLateFinalInstanceFieldStub
    // 0x6f8310: str             x0, [SP]
    // 0x6f8314: r0 = call 0x3722d8
    //     0x6f8314: bl              #0x3722d8
    // 0x6f8318: stur            x0, [fp, #-0x30]
    // 0x6f831c: r0 = InitLateStaticField(0x554) // [dart:ffi] ::Qdb
    //     0x6f831c: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f8320: ldr             x0, [x0, #0xaa8]
    //     0x6f8324: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f8328: cmp             w0, w16
    //     0x6f832c: b.ne            #0x6f833c
    //     0x6f8330: add             x2, PP, #0x10, lsl #12  ; [pp+0x10eb8] Field <::.Qdb>: static late final (offset: 0x554)
    //     0x6f8334: ldr             x2, [x2, #0xeb8]
    //     0x6f8338: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f833c: ldur            x16, [fp, #-0x28]
    // 0x6f8340: ldur            lr, [fp, #-0x20]
    // 0x6f8344: stp             lr, x16, [SP, #0x10]
    // 0x6f8348: ldur            x16, [fp, #-0x30]
    // 0x6f834c: stp             x0, x16, [SP]
    // 0x6f8350: r0 = call 0x384610
    //     0x6f8350: bl              #0x384610
    // 0x6f8354: tbz             x0, #0x3f, #0x6f837c
    // 0x6f8358: ldur            x0, [fp, #-0x10]
    // 0x6f835c: ldur            x16, [fp, #-0x18]
    // 0x6f8360: str             x16, [SP]
    // 0x6f8364: r0 = call 0x384564
    //     0x6f8364: bl              #0x384564
    // 0x6f8368: ldur            x0, [fp, #-0x10]
    // 0x6f836c: LoadField: r1 = r0->field_f
    //     0x6f836c: ldur            w1, [x0, #0xf]
    // 0x6f8370: DecompressPointer r1
    //     0x6f8370: add             x1, x1, HEAP, lsl #32
    // 0x6f8374: str             x1, [SP]
    // 0x6f8378: r0 = call 0x384518
    //     0x6f8378: bl              #0x384518
    // 0x6f837c: ldur            x16, [fp, #-0x18]
    // 0x6f8380: str             x16, [SP]
    // 0x6f8384: r0 = __unknown_function__()
    //     0x6f8384: bl              #0x6f83a4  ; [] ::__unknown_function__
    // 0x6f8388: mov             x1, x0
    // 0x6f838c: stur            x1, [fp, #-0x18]
    // 0x6f8390: r0 = Await()
    //     0x6f8390: bl              #0x6cdaec  ; AwaitStub
    // 0x6f8394: r0 = Null
    //     0x6f8394: mov             x0, NULL
    // 0x6f8398: r0 = ReturnAsyncNotFuture()
    //     0x6f8398: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x6f839c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6f839c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6f83a0: b               #0x6f828c
  }
  [closure] Future<List<RRa>> <anonymous closure>(dynamic) async {
    // ** addr: 0x6f8d30, size: 0x4f0
    // 0x6f8d30: EnterFrame
    //     0x6f8d30: stp             fp, lr, [SP, #-0x10]!
    //     0x6f8d34: mov             fp, SP
    // 0x6f8d38: AllocStack(0xe8)
    //     0x6f8d38: sub             SP, SP, #0xe8
    // 0x6f8d3c: SetupParameters(MRa this /* r1, fp-0x80 */)
    //     0x6f8d3c: stur            NULL, [fp, #-8]
    //     0x6f8d40: mov             x0, #0
    //     0x6f8d44: add             x1, fp, w0, sxtw #2
    //     0x6f8d48: ldr             x1, [x1, #0x10]
    //     0x6f8d4c: stur            x1, [fp, #-0x80]
    //     0x6f8d50: ldur            w2, [x1, #0x17]
    //     0x6f8d54: add             x2, x2, HEAP, lsl #32
    //     0x6f8d58: stur            x2, [fp, #-0x78]
    // 0x6f8d5c: CheckStackOverflow
    //     0x6f8d5c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6f8d60: cmp             SP, x16
    //     0x6f8d64: b.ls            #0x6f9208
    // 0x6f8d68: InitAsync() -> Future<List<RRa>>
    //     0x6f8d68: add             x0, PP, #0x27, lsl #12  ; [pp+0x27110] TypeArguments: <List<RRa>>
    //     0x6f8d6c: ldr             x0, [x0, #0x110]
    //     0x6f8d70: bl              #0x6cb614  ; InitAsyncStub
    // 0x6f8d74: ldur            x0, [fp, #-0x78]
    // 0x6f8d78: LoadField: r1 = r0->field_f
    //     0x6f8d78: ldur            w1, [x0, #0xf]
    // 0x6f8d7c: DecompressPointer r1
    //     0x6f8d7c: add             x1, x1, HEAP, lsl #32
    // 0x6f8d80: str             x1, [SP]
    // 0x6f8d84: r0 = call 0x384768
    //     0x6f8d84: bl              #0x384768
    // 0x6f8d88: stur            x0, [fp, #-0x88]
    // 0x6f8d8c: r0 = InitLateStaticField(0xfb0) // [AOh] ::BJf
    //     0x6f8d8c: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f8d90: ldr             x0, [x0, #0x1f60]
    //     0x6f8d94: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f8d98: cmp             w0, w16
    //     0x6f8d9c: b.ne            #0x6f8dac
    //     0x6f8da0: add             x2, PP, #0x15, lsl #12  ; [pp+0x155c0] Field <::.BJf>: static late final (offset: 0xfb0)
    //     0x6f8da4: ldr             x2, [x2, #0x5c0]
    //     0x6f8da8: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f8dac: mov             x2, x0
    // 0x6f8db0: ldur            x0, [fp, #-0x78]
    // 0x6f8db4: stur            x2, [fp, #-0x98]
    // 0x6f8db8: LoadField: r1 = r0->field_f
    //     0x6f8db8: ldur            w1, [x0, #0xf]
    // 0x6f8dbc: DecompressPointer r1
    //     0x6f8dbc: add             x1, x1, HEAP, lsl #32
    // 0x6f8dc0: LoadField: r3 = r1->field_b
    //     0x6f8dc0: ldur            w3, [x1, #0xb]
    // 0x6f8dc4: DecompressPointer r3
    //     0x6f8dc4: add             x3, x3, HEAP, lsl #32
    // 0x6f8dc8: ldur            x1, [fp, #-0x88]
    // 0x6f8dcc: stur            x3, [fp, #-0x90]
    // 0x6f8dd0: LoadField: r0 = r1->field_7
    //     0x6f8dd0: ldur            w0, [x1, #7]
    // 0x6f8dd4: DecompressPointer r0
    //     0x6f8dd4: add             x0, x0, HEAP, lsl #32
    // 0x6f8dd8: r16 = Sentinel
    //     0x6f8dd8: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0x6f8ddc: cmp             w0, w16
    // 0x6f8de0: b.ne            #0x6f8df0
    // 0x6f8de4: r2 = _rBf
    //     0x6f8de4: add             x2, PP, #0x15, lsl #12  ; [pp+0x156e8] Field <_LRa@874187780._rBf@874187780>: late final (offset: 0x8)
    //     0x6f8de8: ldr             x2, [x2, #0x6e8]
    // 0x6f8dec: r0 = InitLateFinalInstanceField()
    //     0x6f8dec: bl              #0x74afb8  ; InitLateFinalInstanceFieldStub
    // 0x6f8df0: str             x0, [SP]
    // 0x6f8df4: r0 = call 0x3722d8
    //     0x6f8df4: bl              #0x3722d8
    // 0x6f8df8: r16 = <NativeFunction<(dynamic this, Pointer<xRa>, qg, Pointer<Void>, Pointer<Void>) => Void>>
    //     0x6f8df8: add             x16, PP, #0x15, lsl #12  ; [pp+0x156f8] TypeArguments: <NativeFunction<(dynamic this, Pointer<xRa>, qg, Pointer<Void>, Pointer<Void>) => Void>>
    //     0x6f8dfc: ldr             x16, [x16, #0x6f8]
    // 0x6f8e00: stp             x0, x16, [SP]
    // 0x6f8e04: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x6f8e04: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x6f8e08: r0 = call 0x1ffa98
    //     0x6f8e08: bl              #0x1ffa98
    // 0x6f8e0c: stur            x0, [fp, #-0xa0]
    // 0x6f8e10: r0 = InitLateStaticField(0x554) // [dart:ffi] ::Qdb
    //     0x6f8e10: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f8e14: ldr             x0, [x0, #0xaa8]
    //     0x6f8e18: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f8e1c: cmp             w0, w16
    //     0x6f8e20: b.ne            #0x6f8e30
    //     0x6f8e24: add             x2, PP, #0x10, lsl #12  ; [pp+0x10eb8] Field <::.Qdb>: static late final (offset: 0x554)
    //     0x6f8e28: ldr             x2, [x2, #0xeb8]
    //     0x6f8e2c: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f8e30: ldur            x16, [fp, #-0x98]
    // 0x6f8e34: ldur            lr, [fp, #-0x90]
    // 0x6f8e38: stp             lr, x16, [SP, #0x10]
    // 0x6f8e3c: ldur            x16, [fp, #-0xa0]
    // 0x6f8e40: stp             x0, x16, [SP]
    // 0x6f8e44: r0 = call 0x384d64
    //     0x6f8e44: bl              #0x384d64
    // 0x6f8e48: stur            x0, [fp, #-0xa8]
    // 0x6f8e4c: tbz             x0, #0x3f, #0x6f8e74
    // 0x6f8e50: ldur            x1, [fp, #-0x78]
    // 0x6f8e54: ldur            x16, [fp, #-0x88]
    // 0x6f8e58: str             x16, [SP]
    // 0x6f8e5c: r0 = call 0x384564
    //     0x6f8e5c: bl              #0x384564
    // 0x6f8e60: ldur            x0, [fp, #-0x78]
    // 0x6f8e64: LoadField: r1 = r0->field_f
    //     0x6f8e64: ldur            w1, [x0, #0xf]
    // 0x6f8e68: DecompressPointer r1
    //     0x6f8e68: add             x1, x1, HEAP, lsl #32
    // 0x6f8e6c: str             x1, [SP]
    // 0x6f8e70: r0 = call 0x384518
    //     0x6f8e70: bl              #0x384518
    // 0x6f8e74: ldur            x16, [fp, #-0x88]
    // 0x6f8e78: str             x16, [SP]
    // 0x6f8e7c: r0 = __unknown_function__()
    //     0x6f8e7c: bl              #0x6f83a4  ; [] ::__unknown_function__
    // 0x6f8e80: mov             x1, x0
    // 0x6f8e84: stur            x1, [fp, #-0x90]
    // 0x6f8e88: r0 = Await()
    //     0x6f8e88: bl              #0x6cdaec  ; AwaitStub
    // 0x6f8e8c: LoadField: r1 = r0->field_13
    //     0x6f8e8c: ldur            w1, [x0, #0x13]
    // 0x6f8e90: DecompressPointer r1
    //     0x6f8e90: add             x1, x1, HEAP, lsl #32
    // 0x6f8e94: cmp             w1, NULL
    // 0x6f8e98: b.eq            #0x6f9210
    // 0x6f8e9c: r16 = <GRa>
    //     0x6f8e9c: add             x16, PP, #0x27, lsl #12  ; [pp+0x27118] TypeArguments: <GRa>
    //     0x6f8ea0: ldr             x16, [x16, #0x118]
    // 0x6f8ea4: stp             x1, x16, [SP]
    // 0x6f8ea8: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x6f8ea8: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x6f8eac: r0 = call 0x1ffa98
    //     0x6f8eac: bl              #0x1ffa98
    // 0x6f8eb0: stur            x0, [fp, #-0x80]
    // 0x6f8eb4: r16 = <RRa>
    //     0x6f8eb4: add             x16, PP, #0x22, lsl #12  ; [pp+0x22290] TypeArguments: <RRa>
    //     0x6f8eb8: ldr             x16, [x16, #0x290]
    // 0x6f8ebc: stp             xzr, x16, [SP]
    // 0x6f8ec0: r0 = call 0x1f95c4
    //     0x6f8ec0: bl              #0x1f95c4
    // 0x6f8ec4: stur            x0, [fp, #-0x88]
    // 0x6f8ec8: r2 = 0
    //     0x6f8ec8: mov             x2, #0
    // 0x6f8ecc: ldur            x1, [fp, #-0x80]
    // 0x6f8ed0: stur            x2, [fp, #-0xa8]
    // 0x6f8ed4: CheckStackOverflow
    //     0x6f8ed4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6f8ed8: cmp             SP, x16
    //     0x6f8edc: b.ls            #0x6f9214
    // 0x6f8ee0: r0 = ERa()
    //     0x6f8ee0: bl              #0x6f9250  ; AllocateERaStub -> ERa (size=0xc)
    // 0x6f8ee4: stur            x0, [fp, #-0x90]
    // 0x6f8ee8: r0 = GRa()
    //     0x6f8ee8: bl              #0x6f9244  ; AllocateGRaStub -> GRa (size=0xc)
    // 0x6f8eec: mov             x2, x0
    // 0x6f8ef0: ldur            x0, [fp, #-0x80]
    // 0x6f8ef4: stur            x2, [fp, #-0xa0]
    // 0x6f8ef8: StoreField: r2->field_7 = r0
    //     0x6f8ef8: stur            w0, [x2, #7]
    // 0x6f8efc: LoadField: r1 = r0->field_7
    //     0x6f8efc: ldur            x1, [x0, #7]
    // 0x6f8f00: ldr             x3, [x1, #8]
    // 0x6f8f04: stur            x3, [fp, #-0xb0]
    // 0x6f8f08: r1 = <Never>
    //     0x6f8f08: ldr             x1, [PP, #0x150]  ; [pp+0x150] TypeArguments: <Never>
    // 0x6f8f0c: r0 = Pointer()
    //     0x6f8f0c: bl              #0x6cba5c  ; AllocatePointerStub -> Pointer<X0 bound NativeType> (size=-0x8)
    // 0x6f8f10: ldur            x1, [fp, #-0xb0]
    // 0x6f8f14: stur            x0, [fp, #-0xa0]
    // 0x6f8f18: stur            x1, [fp, #-0xb8]
    // 0x6f8f1c: StoreField: r0->field_7 = r1
    //     0x6f8f1c: stur            x1, [x0, #7]
    // 0x6f8f20: ldur            x2, [fp, #-0x90]
    // 0x6f8f24: StoreField: r2->field_7 = r0
    //     0x6f8f24: stur            w0, [x2, #7]
    // 0x6f8f28: r0 = FRa()
    //     0x6f8f28: bl              #0x6f9238  ; AllocateFRaStub -> FRa (size=0xc)
    // 0x6f8f2c: mov             x2, x0
    // 0x6f8f30: ldur            x0, [fp, #-0xb0]
    // 0x6f8f34: stur            x2, [fp, #-0xc8]
    // 0x6f8f38: add             x3, x0, #8
    // 0x6f8f3c: stur            x3, [fp, #-0xc0]
    // 0x6f8f40: r1 = <Never>
    //     0x6f8f40: ldr             x1, [PP, #0x150]  ; [pp+0x150] TypeArguments: <Never>
    // 0x6f8f44: r0 = Pointer()
    //     0x6f8f44: bl              #0x6cba5c  ; AllocatePointerStub -> Pointer<X0 bound NativeType> (size=-0x8)
    // 0x6f8f48: ldur            x1, [fp, #-0xc0]
    // 0x6f8f4c: stur            x0, [fp, #-0x90]
    // 0x6f8f50: stur            x1, [fp, #-0xb0]
    // 0x6f8f54: StoreField: r0->field_7 = r1
    //     0x6f8f54: stur            x1, [x0, #7]
    // 0x6f8f58: ldur            x2, [fp, #-0xc8]
    // 0x6f8f5c: StoreField: r2->field_7 = r0
    //     0x6f8f5c: stur            w0, [x2, #7]
    // 0x6f8f60: r0 = DRa()
    //     0x6f8f60: bl              #0x6f922c  ; AllocateDRaStub -> DRa (size=0xc)
    // 0x6f8f64: r1 = <Never>
    //     0x6f8f64: ldr             x1, [PP, #0x150]  ; [pp+0x150] TypeArguments: <Never>
    // 0x6f8f68: stur            x0, [fp, #-0xa0]
    // 0x6f8f6c: r0 = Pointer()
    //     0x6f8f6c: bl              #0x6cba5c  ; AllocatePointerStub -> Pointer<X0 bound NativeType> (size=-0x8)
    // 0x6f8f70: mov             x1, x0
    // 0x6f8f74: ldur            x0, [fp, #-0xb0]
    // 0x6f8f78: StoreField: r1->field_7 = r0
    //     0x6f8f78: stur            x0, [x1, #7]
    // 0x6f8f7c: ldur            x2, [fp, #-0xa0]
    // 0x6f8f80: StoreField: r2->field_7 = r1
    //     0x6f8f80: stur            w1, [x2, #7]
    // 0x6f8f84: ldr             w1, [x0]
    // 0x6f8f88: ubfx            x1, x1, #0, #0x20
    // 0x6f8f8c: ldur            x2, [fp, #-0xa8]
    // 0x6f8f90: cmp             x2, x1
    // 0x6f8f94: b.ge            #0x6f9130
    // 0x6f8f98: ldur            x3, [fp, #-0x80]
    // 0x6f8f9c: ldur            x4, [fp, #-0x88]
    // 0x6f8fa0: ldur            x1, [fp, #-0xb8]
    // 0x6f8fa4: r0 = ERa()
    //     0x6f8fa4: bl              #0x6f9250  ; AllocateERaStub -> ERa (size=0xc)
    // 0x6f8fa8: stur            x0, [fp, #-0x90]
    // 0x6f8fac: r0 = GRa()
    //     0x6f8fac: bl              #0x6f9244  ; AllocateGRaStub -> GRa (size=0xc)
    // 0x6f8fb0: mov             x2, x0
    // 0x6f8fb4: ldur            x0, [fp, #-0x80]
    // 0x6f8fb8: stur            x2, [fp, #-0xa0]
    // 0x6f8fbc: StoreField: r2->field_7 = r0
    //     0x6f8fbc: stur            w0, [x2, #7]
    // 0x6f8fc0: r1 = <Never>
    //     0x6f8fc0: ldr             x1, [PP, #0x150]  ; [pp+0x150] TypeArguments: <Never>
    // 0x6f8fc4: r0 = Pointer()
    //     0x6f8fc4: bl              #0x6cba5c  ; AllocatePointerStub -> Pointer<X0 bound NativeType> (size=-0x8)
    // 0x6f8fc8: mov             x1, x0
    // 0x6f8fcc: ldur            x0, [fp, #-0xb8]
    // 0x6f8fd0: stur            x1, [fp, #-0xa0]
    // 0x6f8fd4: StoreField: r1->field_7 = r0
    //     0x6f8fd4: stur            x0, [x1, #7]
    // 0x6f8fd8: ldur            x0, [fp, #-0x90]
    // 0x6f8fdc: StoreField: r0->field_7 = r1
    //     0x6f8fdc: stur            w1, [x0, #7]
    // 0x6f8fe0: r0 = FRa()
    //     0x6f8fe0: bl              #0x6f9238  ; AllocateFRaStub -> FRa (size=0xc)
    // 0x6f8fe4: r1 = <Never>
    //     0x6f8fe4: ldr             x1, [PP, #0x150]  ; [pp+0x150] TypeArguments: <Never>
    // 0x6f8fe8: stur            x0, [fp, #-0xc8]
    // 0x6f8fec: r0 = Pointer()
    //     0x6f8fec: bl              #0x6cba5c  ; AllocatePointerStub -> Pointer<X0 bound NativeType> (size=-0x8)
    // 0x6f8ff0: mov             x1, x0
    // 0x6f8ff4: ldur            x0, [fp, #-0xb0]
    // 0x6f8ff8: stur            x1, [fp, #-0x90]
    // 0x6f8ffc: StoreField: r1->field_7 = r0
    //     0x6f8ffc: stur            x0, [x1, #7]
    // 0x6f9000: ldur            x2, [fp, #-0xc8]
    // 0x6f9004: StoreField: r2->field_7 = r1
    //     0x6f9004: stur            w1, [x2, #7]
    // 0x6f9008: r0 = DRa()
    //     0x6f9008: bl              #0x6f922c  ; AllocateDRaStub -> DRa (size=0xc)
    // 0x6f900c: r1 = <Never>
    //     0x6f900c: ldr             x1, [PP, #0x150]  ; [pp+0x150] TypeArguments: <Never>
    // 0x6f9010: stur            x0, [fp, #-0xa0]
    // 0x6f9014: r0 = Pointer()
    //     0x6f9014: bl              #0x6cba5c  ; AllocatePointerStub -> Pointer<X0 bound NativeType> (size=-0x8)
    // 0x6f9018: mov             x2, x0
    // 0x6f901c: ldur            x0, [fp, #-0xb0]
    // 0x6f9020: stur            x2, [fp, #-0x90]
    // 0x6f9024: StoreField: r2->field_7 = r0
    //     0x6f9024: stur            x0, [x2, #7]
    // 0x6f9028: ldur            x3, [fp, #-0xa0]
    // 0x6f902c: StoreField: r3->field_7 = r2
    //     0x6f902c: stur            w2, [x3, #7]
    // 0x6f9030: ldr             x4, [x0, #8]
    // 0x6f9034: stur            x4, [fp, #-0xb8]
    // 0x6f9038: r1 = <Never>
    //     0x6f9038: ldr             x1, [PP, #0x150]  ; [pp+0x150] TypeArguments: <Never>
    // 0x6f903c: r0 = Pointer()
    //     0x6f903c: bl              #0x6cba5c  ; AllocatePointerStub -> Pointer<X0 bound NativeType> (size=-0x8)
    // 0x6f9040: ldur            x1, [fp, #-0xb8]
    // 0x6f9044: stur            x0, [fp, #-0x90]
    // 0x6f9048: StoreField: r0->field_7 = r1
    //     0x6f9048: stur            x1, [x0, #7]
    // 0x6f904c: ldur            x2, [fp, #-0xa8]
    // 0x6f9050: r16 = 24
    //     0x6f9050: mov             x16, #0x18
    // 0x6f9054: mul             x3, x2, x16
    // 0x6f9058: ldur            x1, [fp, #-0xb8]
    // 0x6f905c: stur            x3, [fp, #-0xc0]
    // 0x6f9060: add             x4, x1, x3
    // 0x6f9064: stur            x4, [fp, #-0xb0]
    // 0x6f9068: r1 = <Never>
    //     0x6f9068: ldr             x1, [PP, #0x150]  ; [pp+0x150] TypeArguments: <Never>
    // 0x6f906c: r0 = Pointer()
    //     0x6f906c: bl              #0x6cba5c  ; AllocatePointerStub -> Pointer<X0 bound NativeType> (size=-0x8)
    // 0x6f9070: ldur            x1, [fp, #-0xb0]
    // 0x6f9074: stur            x0, [fp, #-0x90]
    // 0x6f9078: StoreField: r0->field_7 = r1
    //     0x6f9078: stur            x1, [x0, #7]
    // 0x6f907c: r0 = RRa()
    //     0x6f907c: bl              #0x6f9220  ; AllocateRRaStub -> RRa (size=0x14)
    // 0x6f9080: stur            x0, [fp, #-0xa0]
    // 0x6f9084: ldur            x16, [fp, #-0x90]
    // 0x6f9088: stp             x16, x0, [SP]
    // 0x6f908c: r0 = call 0x384b94
    //     0x6f908c: bl              #0x384b94
    // 0x6f9090: ldur            x0, [fp, #-0x88]
    // 0x6f9094: LoadField: r1 = r0->field_b
    //     0x6f9094: ldur            w1, [x0, #0xb]
    // 0x6f9098: DecompressPointer r1
    //     0x6f9098: add             x1, x1, HEAP, lsl #32
    // 0x6f909c: stur            x1, [fp, #-0x90]
    // 0x6f90a0: LoadField: r2 = r0->field_f
    //     0x6f90a0: ldur            w2, [x0, #0xf]
    // 0x6f90a4: DecompressPointer r2
    //     0x6f90a4: add             x2, x2, HEAP, lsl #32
    // 0x6f90a8: LoadField: r3 = r2->field_b
    //     0x6f90a8: ldur            w3, [x2, #0xb]
    // 0x6f90ac: DecompressPointer r3
    //     0x6f90ac: add             x3, x3, HEAP, lsl #32
    // 0x6f90b0: r2 = LoadInt32Instr(r1)
    //     0x6f90b0: sbfx            x2, x1, #1, #0x1f
    // 0x6f90b4: stur            x2, [fp, #-0xb0]
    // 0x6f90b8: r4 = LoadInt32Instr(r3)
    //     0x6f90b8: sbfx            x4, x3, #1, #0x1f
    // 0x6f90bc: cmp             x2, x4
    // 0x6f90c0: b.ne            #0x6f90cc
    // 0x6f90c4: str             x0, [SP]
    // 0x6f90c8: r0 = call 0x1f93c8
    //     0x6f90c8: bl              #0x1f93c8
    // 0x6f90cc: ldur            x3, [fp, #-0x88]
    // 0x6f90d0: ldur            x4, [fp, #-0xa8]
    // 0x6f90d4: ldur            x2, [fp, #-0xb0]
    // 0x6f90d8: add             x0, x2, #1
    // 0x6f90dc: lsl             x1, x0, #1
    // 0x6f90e0: StoreField: r3->field_b = r1
    //     0x6f90e0: stur            w1, [x3, #0xb]
    // 0x6f90e4: mov             x1, x2
    // 0x6f90e8: cmp             x1, x0
    // 0x6f90ec: b.hs            #0x6f921c
    // 0x6f90f0: LoadField: r1 = r3->field_f
    //     0x6f90f0: ldur            w1, [x3, #0xf]
    // 0x6f90f4: DecompressPointer r1
    //     0x6f90f4: add             x1, x1, HEAP, lsl #32
    // 0x6f90f8: ldur            x0, [fp, #-0xa0]
    // 0x6f90fc: ArrayStore: r1[r2] = r0  ; List_4
    //     0x6f90fc: add             x25, x1, x2, lsl #2
    //     0x6f9100: add             x25, x25, #0xf
    //     0x6f9104: str             w0, [x25]
    //     0x6f9108: tbz             w0, #0, #0x6f9124
    //     0x6f910c: ldurb           w16, [x1, #-1]
    //     0x6f9110: ldurb           w17, [x0, #-1]
    //     0x6f9114: and             x16, x17, x16, lsr #2
    //     0x6f9118: tst             x16, HEAP, lsr #32
    //     0x6f911c: b.eq            #0x6f9124
    //     0x6f9120: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x6f9124: add             x2, x4, #1
    // 0x6f9128: mov             x0, x3
    // 0x6f912c: b               #0x6f8ecc
    // 0x6f9130: ldur            x3, [fp, #-0x88]
    // 0x6f9134: ldur            x0, [fp, #-0x78]
    // 0x6f9138: LoadField: r1 = r0->field_f
    //     0x6f9138: ldur            w1, [x0, #0xf]
    // 0x6f913c: DecompressPointer r1
    //     0x6f913c: add             x1, x1, HEAP, lsl #32
    // 0x6f9140: LoadField: r0 = r1->field_b
    //     0x6f9140: ldur            w0, [x1, #0xb]
    // 0x6f9144: DecompressPointer r0
    //     0x6f9144: add             x0, x0, HEAP, lsl #32
    // 0x6f9148: stur            x0, [fp, #-0x78]
    // 0x6f914c: r16 = <Void>
    //     0x6f914c: add             x16, PP, #0x11, lsl #12  ; [pp+0x111f0] TypeArguments: <Void>
    //     0x6f9150: ldr             x16, [x16, #0x1f0]
    // 0x6f9154: ldur            lr, [fp, #-0x80]
    // 0x6f9158: stp             lr, x16, [SP]
    // 0x6f915c: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x6f915c: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x6f9160: r0 = call 0x1ffa98
    //     0x6f9160: bl              #0x1ffa98
    // 0x6f9164: ldur            x16, [fp, #-0x98]
    // 0x6f9168: ldur            lr, [fp, #-0x78]
    // 0x6f916c: stp             lr, x16, [SP, #8]
    // 0x6f9170: str             x0, [SP]
    // 0x6f9174: r0 = call 0x3849a8
    //     0x6f9174: bl              #0x3849a8
    // 0x6f9178: ldur            x0, [fp, #-0x88]
    // 0x6f917c: r0 = ReturnAsyncNotFuture()
    //     0x6f917c: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x6f9180: sub             SP, fp, #0xe8
    // 0x6f9184: stur            x0, [fp, #-0x78]
    // 0x6f9188: stur            x1, [fp, #-0x80]
    // 0x6f918c: r0 = InitLateStaticField(0xfb0) // [AOh] ::BJf
    //     0x6f918c: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f9190: ldr             x0, [x0, #0x1f60]
    //     0x6f9194: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f9198: cmp             w0, w16
    //     0x6f919c: b.ne            #0x6f91ac
    //     0x6f91a0: add             x2, PP, #0x15, lsl #12  ; [pp+0x155c0] Field <::.BJf>: static late final (offset: 0xfb0)
    //     0x6f91a4: ldr             x2, [x2, #0x5c0]
    //     0x6f91a8: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f91ac: mov             x1, x0
    // 0x6f91b0: ldur            x0, [fp, #-0x20]
    // 0x6f91b4: stur            x1, [fp, #-0x90]
    // 0x6f91b8: LoadField: r2 = r0->field_f
    //     0x6f91b8: ldur            w2, [x0, #0xf]
    // 0x6f91bc: DecompressPointer r2
    //     0x6f91bc: add             x2, x2, HEAP, lsl #32
    // 0x6f91c0: LoadField: r0 = r2->field_b
    //     0x6f91c0: ldur            w0, [x2, #0xb]
    // 0x6f91c4: DecompressPointer r0
    //     0x6f91c4: add             x0, x0, HEAP, lsl #32
    // 0x6f91c8: stur            x0, [fp, #-0x88]
    // 0x6f91cc: r16 = <Void>
    //     0x6f91cc: add             x16, PP, #0x11, lsl #12  ; [pp+0x111f0] TypeArguments: <Void>
    //     0x6f91d0: ldr             x16, [x16, #0x1f0]
    // 0x6f91d4: ldur            lr, [fp, #-0x58]
    // 0x6f91d8: stp             lr, x16, [SP]
    // 0x6f91dc: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x6f91dc: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x6f91e0: r0 = call 0x1ffa98
    //     0x6f91e0: bl              #0x1ffa98
    // 0x6f91e4: ldur            x16, [fp, #-0x90]
    // 0x6f91e8: ldur            lr, [fp, #-0x88]
    // 0x6f91ec: stp             lr, x16, [SP, #8]
    // 0x6f91f0: str             x0, [SP]
    // 0x6f91f4: r0 = call 0x3849a8
    //     0x6f91f4: bl              #0x3849a8
    // 0x6f91f8: ldur            x0, [fp, #-0x78]
    // 0x6f91fc: ldur            x1, [fp, #-0x80]
    // 0x6f9200: r0 = ReThrow()
    //     0x6f9200: bl              #0x74b234  ; ReThrowStub
    // 0x6f9204: brk             #0
    // 0x6f9208: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6f9208: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6f920c: b               #0x6f8d68
    // 0x6f9210: r0 = NullErrorSharedWithoutFPURegs()
    //     0x6f9210: bl              #0x74d4bc  ; NullErrorSharedWithoutFPURegsStub
    // 0x6f9214: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6f9214: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6f9218: b               #0x6f8ee0
    // 0x6f921c: r0 = RangeErrorSharedWithoutFPURegs()
    //     0x6f921c: bl              #0x74d1ac  ; RangeErrorSharedWithoutFPURegsStub
  }
  [closure] Future<void> <anonymous closure>(dynamic) async {
    // ** addr: 0x6f925c, size: 0x2dc
    // 0x6f925c: EnterFrame
    //     0x6f925c: stp             fp, lr, [SP, #-0x10]!
    //     0x6f9260: mov             fp, SP
    // 0x6f9264: AllocStack(0xf8)
    //     0x6f9264: sub             SP, SP, #0xf8
    // 0x6f9268: SetupParameters(MRa this /* r1, fp-0x78 */)
    //     0x6f9268: stur            NULL, [fp, #-8]
    //     0x6f926c: mov             x0, #0
    //     0x6f9270: add             x1, fp, w0, sxtw #2
    //     0x6f9274: ldr             x1, [x1, #0x10]
    //     0x6f9278: stur            x1, [fp, #-0x78]
    //     0x6f927c: ldur            w2, [x1, #0x17]
    //     0x6f9280: add             x2, x2, HEAP, lsl #32
    //     0x6f9284: stur            x2, [fp, #-0x70]
    // 0x6f9288: CheckStackOverflow
    //     0x6f9288: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6f928c: cmp             SP, x16
    //     0x6f9290: b.ls            #0x6f9530
    // 0x6f9294: InitAsync() -> Future<void?>
    //     0x6f9294: ldr             x0, [PP, #0x1680]  ; [pp+0x1680] TypeArguments: <void?>
    //     0x6f9298: bl              #0x6cb614  ; InitAsyncStub
    // 0x6f929c: ldur            x0, [fp, #-0x70]
    // 0x6f92a0: LoadField: r1 = r0->field_f
    //     0x6f92a0: ldur            w1, [x0, #0xf]
    // 0x6f92a4: DecompressPointer r1
    //     0x6f92a4: add             x1, x1, HEAP, lsl #32
    // 0x6f92a8: str             x1, [SP]
    // 0x6f92ac: r0 = call 0x384768
    //     0x6f92ac: bl              #0x384768
    // 0x6f92b0: mov             x1, x0
    // 0x6f92b4: ldur            x0, [fp, #-0x70]
    // 0x6f92b8: stur            x1, [fp, #-0x78]
    // 0x6f92bc: LoadField: r2 = r0->field_13
    //     0x6f92bc: ldur            w2, [x0, #0x13]
    // 0x6f92c0: DecompressPointer r2
    //     0x6f92c0: add             x2, x2, HEAP, lsl #32
    // 0x6f92c4: str             x2, [SP]
    // 0x6f92c8: r4 = const [0, 0x1, 0x1, 0x1, null]
    //     0x6f92c8: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    // 0x6f92cc: r0 = call 0x36be08
    //     0x6f92cc: bl              #0x36be08
    // 0x6f92d0: mov             x1, x0
    // 0x6f92d4: ldur            x0, [fp, #-0x70]
    // 0x6f92d8: stur            x1, [fp, #-0x80]
    // 0x6f92dc: ArrayLoad: r2 = r0[0]  ; List_4
    //     0x6f92dc: ldur            w2, [x0, #0x17]
    // 0x6f92e0: DecompressPointer r2
    //     0x6f92e0: add             x2, x2, HEAP, lsl #32
    // 0x6f92e4: str             x2, [SP]
    // 0x6f92e8: r4 = const [0, 0x1, 0x1, 0x1, null]
    //     0x6f92e8: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    // 0x6f92ec: r0 = call 0x36be08
    //     0x6f92ec: bl              #0x36be08
    // 0x6f92f0: mov             x1, x0
    // 0x6f92f4: ldur            x0, [fp, #-0x70]
    // 0x6f92f8: stur            x1, [fp, #-0x88]
    // 0x6f92fc: LoadField: r2 = r0->field_1b
    //     0x6f92fc: ldur            w2, [x0, #0x1b]
    // 0x6f9300: DecompressPointer r2
    //     0x6f9300: add             x2, x2, HEAP, lsl #32
    // 0x6f9304: cmp             w2, NULL
    // 0x6f9308: b.eq            #0x6f931c
    // 0x6f930c: str             x2, [SP]
    // 0x6f9310: r4 = const [0, 0x1, 0x1, 0x1, null]
    //     0x6f9310: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    // 0x6f9314: r0 = call 0x36be08
    //     0x6f9314: bl              #0x36be08
    // 0x6f9318: b               #0x6f933c
    // 0x6f931c: r0 = InitLateStaticField(0x554) // [dart:ffi] ::Qdb
    //     0x6f931c: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f9320: ldr             x0, [x0, #0xaa8]
    //     0x6f9324: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f9328: cmp             w0, w16
    //     0x6f932c: b.ne            #0x6f933c
    //     0x6f9330: add             x2, PP, #0x10, lsl #12  ; [pp+0x10eb8] Field <::.Qdb>: static late final (offset: 0x554)
    //     0x6f9334: ldr             x2, [x2, #0xeb8]
    //     0x6f9338: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f933c: stur            x0, [fp, #-0x90]
    // 0x6f9340: ldur            x1, [fp, #-0x70]
    // 0x6f9344: r0 = InitLateStaticField(0xfb0) // [AOh] ::BJf
    //     0x6f9344: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f9348: ldr             x0, [x0, #0x1f60]
    //     0x6f934c: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f9350: cmp             w0, w16
    //     0x6f9354: b.ne            #0x6f9364
    //     0x6f9358: add             x2, PP, #0x15, lsl #12  ; [pp+0x155c0] Field <::.BJf>: static late final (offset: 0xfb0)
    //     0x6f935c: ldr             x2, [x2, #0x5c0]
    //     0x6f9360: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f9364: mov             x1, x0
    // 0x6f9368: ldur            x0, [fp, #-0x70]
    // 0x6f936c: stur            x1, [fp, #-0xa0]
    // 0x6f9370: LoadField: r2 = r0->field_f
    //     0x6f9370: ldur            w2, [x0, #0xf]
    // 0x6f9374: DecompressPointer r2
    //     0x6f9374: add             x2, x2, HEAP, lsl #32
    // 0x6f9378: LoadField: r3 = r2->field_b
    //     0x6f9378: ldur            w3, [x2, #0xb]
    // 0x6f937c: DecompressPointer r3
    //     0x6f937c: add             x3, x3, HEAP, lsl #32
    // 0x6f9380: stur            x3, [fp, #-0x98]
    // 0x6f9384: r16 = <pg>
    //     0x6f9384: add             x16, PP, #0x11, lsl #12  ; [pp+0x11230] TypeArguments: <pg>
    //     0x6f9388: ldr             x16, [x16, #0x230]
    // 0x6f938c: ldur            lr, [fp, #-0x80]
    // 0x6f9390: stp             lr, x16, [SP]
    // 0x6f9394: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x6f9394: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x6f9398: r0 = call 0x1ffa98
    //     0x6f9398: bl              #0x1ffa98
    // 0x6f939c: stur            x0, [fp, #-0xa8]
    // 0x6f93a0: r16 = <pg>
    //     0x6f93a0: add             x16, PP, #0x11, lsl #12  ; [pp+0x11230] TypeArguments: <pg>
    //     0x6f93a4: ldr             x16, [x16, #0x230]
    // 0x6f93a8: ldur            lr, [fp, #-0x88]
    // 0x6f93ac: stp             lr, x16, [SP]
    // 0x6f93b0: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x6f93b0: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x6f93b4: r0 = call 0x1ffa98
    //     0x6f93b4: bl              #0x1ffa98
    // 0x6f93b8: stur            x0, [fp, #-0xb0]
    // 0x6f93bc: r16 = <pg>
    //     0x6f93bc: add             x16, PP, #0x11, lsl #12  ; [pp+0x11230] TypeArguments: <pg>
    //     0x6f93c0: ldr             x16, [x16, #0x230]
    // 0x6f93c4: ldur            lr, [fp, #-0x90]
    // 0x6f93c8: stp             lr, x16, [SP]
    // 0x6f93cc: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x6f93cc: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x6f93d0: r0 = call 0x1ffa98
    //     0x6f93d0: bl              #0x1ffa98
    // 0x6f93d4: ldur            x1, [fp, #-0x78]
    // 0x6f93d8: stur            x0, [fp, #-0xb8]
    // 0x6f93dc: LoadField: r0 = r1->field_7
    //     0x6f93dc: ldur            w0, [x1, #7]
    // 0x6f93e0: DecompressPointer r0
    //     0x6f93e0: add             x0, x0, HEAP, lsl #32
    // 0x6f93e4: r16 = Sentinel
    //     0x6f93e4: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0x6f93e8: cmp             w0, w16
    // 0x6f93ec: b.ne            #0x6f93fc
    // 0x6f93f0: r2 = _rBf
    //     0x6f93f0: add             x2, PP, #0x15, lsl #12  ; [pp+0x156e8] Field <_LRa@874187780._rBf@874187780>: late final (offset: 0x8)
    //     0x6f93f4: ldr             x2, [x2, #0x6e8]
    // 0x6f93f8: r0 = InitLateFinalInstanceField()
    //     0x6f93f8: bl              #0x74afb8  ; InitLateFinalInstanceFieldStub
    // 0x6f93fc: str             x0, [SP]
    // 0x6f9400: r0 = call 0x3722d8
    //     0x6f9400: bl              #0x3722d8
    // 0x6f9404: stur            x0, [fp, #-0xc0]
    // 0x6f9408: r0 = InitLateStaticField(0x554) // [dart:ffi] ::Qdb
    //     0x6f9408: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x6f940c: ldr             x0, [x0, #0xaa8]
    //     0x6f9410: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x6f9414: cmp             w0, w16
    //     0x6f9418: b.ne            #0x6f9428
    //     0x6f941c: add             x2, PP, #0x10, lsl #12  ; [pp+0x10eb8] Field <::.Qdb>: static late final (offset: 0x554)
    //     0x6f9420: ldr             x2, [x2, #0xeb8]
    //     0x6f9424: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x6f9428: ldur            x16, [fp, #-0xa0]
    // 0x6f942c: ldur            lr, [fp, #-0x98]
    // 0x6f9430: stp             lr, x16, [SP, #0x28]
    // 0x6f9434: ldur            x16, [fp, #-0xa8]
    // 0x6f9438: ldur            lr, [fp, #-0xb0]
    // 0x6f943c: stp             lr, x16, [SP, #0x18]
    // 0x6f9440: ldur            x16, [fp, #-0xb8]
    // 0x6f9444: ldur            lr, [fp, #-0xc0]
    // 0x6f9448: stp             lr, x16, [SP, #8]
    // 0x6f944c: str             x0, [SP]
    // 0x6f9450: r0 = call 0x384fb8
    //     0x6f9450: bl              #0x384fb8
    // 0x6f9454: tbz             x0, #0x3f, #0x6f947c
    // 0x6f9458: ldur            x0, [fp, #-0x70]
    // 0x6f945c: ldur            x16, [fp, #-0x78]
    // 0x6f9460: str             x16, [SP]
    // 0x6f9464: r0 = call 0x384564
    //     0x6f9464: bl              #0x384564
    // 0x6f9468: ldur            x0, [fp, #-0x70]
    // 0x6f946c: LoadField: r1 = r0->field_f
    //     0x6f946c: ldur            w1, [x0, #0xf]
    // 0x6f9470: DecompressPointer r1
    //     0x6f9470: add             x1, x1, HEAP, lsl #32
    // 0x6f9474: str             x1, [SP]
    // 0x6f9478: r0 = call 0x384518
    //     0x6f9478: bl              #0x384518
    // 0x6f947c: ldur            x16, [fp, #-0x78]
    // 0x6f9480: str             x16, [SP]
    // 0x6f9484: r0 = __unknown_function__()
    //     0x6f9484: bl              #0x6f83a4  ; [] ::__unknown_function__
    // 0x6f9488: mov             x1, x0
    // 0x6f948c: stur            x1, [fp, #-0x70]
    // 0x6f9490: r0 = Await()
    //     0x6f9490: bl              #0x6cdaec  ; AwaitStub
    // 0x6f9494: r16 = Instance_Tx
    //     0x6f9494: add             x16, PP, #0x11, lsl #12  ; [pp+0x11180] Obj!Tx@4302c1
    //     0x6f9498: ldr             x16, [x16, #0x180]
    // 0x6f949c: ldur            lr, [fp, #-0x80]
    // 0x6f94a0: stp             lr, x16, [SP]
    // 0x6f94a4: r0 = call 0x36a364
    //     0x6f94a4: bl              #0x36a364
    // 0x6f94a8: r16 = Instance_Tx
    //     0x6f94a8: add             x16, PP, #0x11, lsl #12  ; [pp+0x11180] Obj!Tx@4302c1
    //     0x6f94ac: ldr             x16, [x16, #0x180]
    // 0x6f94b0: ldur            lr, [fp, #-0x88]
    // 0x6f94b4: stp             lr, x16, [SP]
    // 0x6f94b8: r0 = call 0x36a364
    //     0x6f94b8: bl              #0x36a364
    // 0x6f94bc: r16 = Instance_Tx
    //     0x6f94bc: add             x16, PP, #0x11, lsl #12  ; [pp+0x11180] Obj!Tx@4302c1
    //     0x6f94c0: ldr             x16, [x16, #0x180]
    // 0x6f94c4: ldur            lr, [fp, #-0x90]
    // 0x6f94c8: stp             lr, x16, [SP]
    // 0x6f94cc: r0 = call 0x36a364
    //     0x6f94cc: bl              #0x36a364
    // 0x6f94d0: r0 = Null
    //     0x6f94d0: mov             x0, NULL
    // 0x6f94d4: r0 = ReturnAsyncNotFuture()
    //     0x6f94d4: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x6f94d8: sub             SP, fp, #0xf8
    // 0x6f94dc: stur            x0, [fp, #-0x70]
    // 0x6f94e0: stur            x1, [fp, #-0x78]
    // 0x6f94e4: r16 = Instance_Tx
    //     0x6f94e4: add             x16, PP, #0x11, lsl #12  ; [pp+0x11180] Obj!Tx@4302c1
    //     0x6f94e8: ldr             x16, [x16, #0x180]
    // 0x6f94ec: ldur            lr, [fp, #-0x50]
    // 0x6f94f0: stp             lr, x16, [SP]
    // 0x6f94f4: r0 = call 0x36a364
    //     0x6f94f4: bl              #0x36a364
    // 0x6f94f8: r16 = Instance_Tx
    //     0x6f94f8: add             x16, PP, #0x11, lsl #12  ; [pp+0x11180] Obj!Tx@4302c1
    //     0x6f94fc: ldr             x16, [x16, #0x180]
    // 0x6f9500: ldur            lr, [fp, #-0x58]
    // 0x6f9504: stp             lr, x16, [SP]
    // 0x6f9508: r0 = call 0x36a364
    //     0x6f9508: bl              #0x36a364
    // 0x6f950c: r16 = Instance_Tx
    //     0x6f950c: add             x16, PP, #0x11, lsl #12  ; [pp+0x11180] Obj!Tx@4302c1
    //     0x6f9510: ldr             x16, [x16, #0x180]
    // 0x6f9514: ldur            lr, [fp, #-0x60]
    // 0x6f9518: stp             lr, x16, [SP]
    // 0x6f951c: r0 = call 0x36a364
    //     0x6f951c: bl              #0x36a364
    // 0x6f9520: ldur            x0, [fp, #-0x70]
    // 0x6f9524: ldur            x1, [fp, #-0x78]
    // 0x6f9528: r0 = ReThrow()
    //     0x6f9528: bl              #0x74b234  ; ReThrowStub
    // 0x6f952c: brk             #0
    // 0x6f9530: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6f9530: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6f9534: b               #0x6f9294
  }
  [closure] Future<NRa> <anonymous closure>(dynamic) async {
    // ** addr: 0x745398, size: 0x280
    // 0x745398: EnterFrame
    //     0x745398: stp             fp, lr, [SP, #-0x10]!
    //     0x74539c: mov             fp, SP
    // 0x7453a0: AllocStack(0xf0)
    //     0x7453a0: sub             SP, SP, #0xf0
    // 0x7453a4: SetupParameters(MRa this /* r1, fp-0xa0 */)
    //     0x7453a4: stur            NULL, [fp, #-8]
    //     0x7453a8: mov             x0, #0
    //     0x7453ac: add             x1, fp, w0, sxtw #2
    //     0x7453b0: ldr             x1, [x1, #0x10]
    //     0x7453b4: stur            x1, [fp, #-0xa0]
    //     0x7453b8: ldur            w2, [x1, #0x17]
    //     0x7453bc: add             x2, x2, HEAP, lsl #32
    //     0x7453c0: stur            x2, [fp, #-0x98]
    // 0x7453c4: CheckStackOverflow
    //     0x7453c4: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x7453c8: cmp             SP, x16
    //     0x7453cc: b.ls            #0x74560c
    // 0x7453d0: InitAsync() -> Future<NRa>
    //     0x7453d0: add             x0, PP, #0x15, lsl #12  ; [pp+0x15838] TypeArguments: <NRa>
    //     0x7453d4: ldr             x0, [x0, #0x838]
    //     0x7453d8: bl              #0x6cb614  ; InitAsyncStub
    // 0x7453dc: ldur            x0, [fp, #-0x98]
    // 0x7453e0: LoadField: r1 = r0->field_13
    //     0x7453e0: ldur            w1, [x0, #0x13]
    // 0x7453e4: DecompressPointer r1
    //     0x7453e4: add             x1, x1, HEAP, lsl #32
    // 0x7453e8: str             x1, [SP]
    // 0x7453ec: r4 = const [0, 0x1, 0x1, 0x1, null]
    //     0x7453ec: ldr             x4, [PP, #0x380]  ; [pp+0x380] List(5) [0, 0x1, 0x1, 0x1, Null]
    // 0x7453f0: r0 = call 0x36be08
    //     0x7453f0: bl              #0x36be08
    // 0x7453f4: mov             x1, x0
    // 0x7453f8: ldur            x0, [fp, #-0x98]
    // 0x7453fc: stur            x1, [fp, #-0xa0]
    // 0x745400: LoadField: r2 = r0->field_f
    //     0x745400: ldur            w2, [x0, #0xf]
    // 0x745404: DecompressPointer r2
    //     0x745404: add             x2, x2, HEAP, lsl #32
    // 0x745408: str             x2, [SP]
    // 0x74540c: r0 = call 0x384768
    //     0x74540c: bl              #0x384768
    // 0x745410: stur            x0, [fp, #-0xa8]
    // 0x745414: ldur            x1, [fp, #-0x98]
    // 0x745418: r0 = InitLateStaticField(0xfb0) // [AOh] ::BJf
    //     0x745418: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x74541c: ldr             x0, [x0, #0x1f60]
    //     0x745420: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x745424: cmp             w0, w16
    //     0x745428: b.ne            #0x745438
    //     0x74542c: add             x2, PP, #0x15, lsl #12  ; [pp+0x155c0] Field <::.BJf>: static late final (offset: 0xfb0)
    //     0x745430: ldr             x2, [x2, #0x5c0]
    //     0x745434: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x745438: mov             x1, x0
    // 0x74543c: ldur            x0, [fp, #-0x98]
    // 0x745440: stur            x1, [fp, #-0xb8]
    // 0x745444: LoadField: r2 = r0->field_f
    //     0x745444: ldur            w2, [x0, #0xf]
    // 0x745448: DecompressPointer r2
    //     0x745448: add             x2, x2, HEAP, lsl #32
    // 0x74544c: LoadField: r3 = r2->field_b
    //     0x74544c: ldur            w3, [x2, #0xb]
    // 0x745450: DecompressPointer r3
    //     0x745450: add             x3, x3, HEAP, lsl #32
    // 0x745454: stur            x3, [fp, #-0xb0]
    // 0x745458: r16 = <pg>
    //     0x745458: add             x16, PP, #0x11, lsl #12  ; [pp+0x11230] TypeArguments: <pg>
    //     0x74545c: ldr             x16, [x16, #0x230]
    // 0x745460: ldur            lr, [fp, #-0xa0]
    // 0x745464: stp             lr, x16, [SP]
    // 0x745468: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x745468: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x74546c: r0 = call 0x1ffa98
    //     0x74546c: bl              #0x1ffa98
    // 0x745470: ldur            x1, [fp, #-0xa8]
    // 0x745474: stur            x0, [fp, #-0xc0]
    // 0x745478: LoadField: r0 = r1->field_7
    //     0x745478: ldur            w0, [x1, #7]
    // 0x74547c: DecompressPointer r0
    //     0x74547c: add             x0, x0, HEAP, lsl #32
    // 0x745480: r16 = Sentinel
    //     0x745480: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    // 0x745484: cmp             w0, w16
    // 0x745488: b.ne            #0x745498
    // 0x74548c: r2 = _rBf
    //     0x74548c: add             x2, PP, #0x15, lsl #12  ; [pp+0x156e8] Field <_LRa@874187780._rBf@874187780>: late final (offset: 0x8)
    //     0x745490: ldr             x2, [x2, #0x6e8]
    // 0x745494: r0 = InitLateFinalInstanceField()
    //     0x745494: bl              #0x74afb8  ; InitLateFinalInstanceFieldStub
    // 0x745498: str             x0, [SP]
    // 0x74549c: r0 = call 0x3722d8
    //     0x74549c: bl              #0x3722d8
    // 0x7454a0: stur            x0, [fp, #-0xc8]
    // 0x7454a4: r0 = InitLateStaticField(0x554) // [dart:ffi] ::Qdb
    //     0x7454a4: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x7454a8: ldr             x0, [x0, #0xaa8]
    //     0x7454ac: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x7454b0: cmp             w0, w16
    //     0x7454b4: b.ne            #0x7454c4
    //     0x7454b8: add             x2, PP, #0x10, lsl #12  ; [pp+0x10eb8] Field <::.Qdb>: static late final (offset: 0x554)
    //     0x7454bc: ldr             x2, [x2, #0xeb8]
    //     0x7454c0: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x7454c4: ldur            x16, [fp, #-0xb8]
    // 0x7454c8: ldur            lr, [fp, #-0xb0]
    // 0x7454cc: stp             lr, x16, [SP, #0x18]
    // 0x7454d0: ldur            x16, [fp, #-0xc0]
    // 0x7454d4: ldur            lr, [fp, #-0xc8]
    // 0x7454d8: stp             lr, x16, [SP, #8]
    // 0x7454dc: str             x0, [SP]
    // 0x7454e0: r0 = call 0x69d200
    //     0x7454e0: bl              #0x69d200
    // 0x7454e4: tbz             x0, #0x3f, #0x74550c
    // 0x7454e8: ldur            x0, [fp, #-0x98]
    // 0x7454ec: ldur            x16, [fp, #-0xa8]
    // 0x7454f0: str             x16, [SP]
    // 0x7454f4: r0 = call 0x384564
    //     0x7454f4: bl              #0x384564
    // 0x7454f8: ldur            x0, [fp, #-0x98]
    // 0x7454fc: LoadField: r1 = r0->field_f
    //     0x7454fc: ldur            w1, [x0, #0xf]
    // 0x745500: DecompressPointer r1
    //     0x745500: add             x1, x1, HEAP, lsl #32
    // 0x745504: str             x1, [SP]
    // 0x745508: r0 = call 0x384518
    //     0x745508: bl              #0x384518
    // 0x74550c: ldur            x0, [fp, #-0x98]
    // 0x745510: ldur            x16, [fp, #-0xa8]
    // 0x745514: str             x16, [SP]
    // 0x745518: r0 = __unknown_function__()
    //     0x745518: bl              #0x6f83a4  ; [] ::__unknown_function__
    // 0x74551c: mov             x1, x0
    // 0x745520: stur            x1, [fp, #-0xa8]
    // 0x745524: r0 = Await()
    //     0x745524: bl              #0x6cdaec  ; AwaitStub
    // 0x745528: LoadField: r1 = r0->field_13
    //     0x745528: ldur            w1, [x0, #0x13]
    // 0x74552c: DecompressPointer r1
    //     0x74552c: add             x1, x1, HEAP, lsl #32
    // 0x745530: stur            x1, [fp, #-0xa8]
    // 0x745534: r0 = NRa()
    //     0x745534: bl              #0x745618  ; AllocateNRaStub -> NRa (size=0x18)
    // 0x745538: mov             x1, x0
    // 0x74553c: ldur            x0, [fp, #-0x98]
    // 0x745540: stur            x1, [fp, #-0xb8]
    // 0x745544: LoadField: r2 = r0->field_f
    //     0x745544: ldur            w2, [x0, #0xf]
    // 0x745548: DecompressPointer r2
    //     0x745548: add             x2, x2, HEAP, lsl #32
    // 0x74554c: ldur            x0, [fp, #-0xa8]
    // 0x745550: stur            x2, [fp, #-0xb0]
    // 0x745554: cmp             w0, NULL
    // 0x745558: b.eq            #0x745614
    // 0x74555c: r16 = <BRa>
    //     0x74555c: add             x16, PP, #0x15, lsl #12  ; [pp+0x15840] TypeArguments: <BRa>
    //     0x745560: ldr             x16, [x16, #0x840]
    // 0x745564: stp             x0, x16, [SP]
    // 0x745568: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x745568: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x74556c: r0 = call 0x1ffa98
    //     0x74556c: bl              #0x1ffa98
    // 0x745570: mov             x2, x0
    // 0x745574: ldur            x1, [fp, #-0xb8]
    // 0x745578: r0 = 0
    //     0x745578: mov             x0, #0
    // 0x74557c: StoreField: r1->field_f = r0
    //     0x74557c: stur            x0, [x1, #0xf]
    // 0x745580: ldur            x0, [fp, #-0xb0]
    // 0x745584: StoreField: r1->field_7 = r0
    //     0x745584: stur            w0, [x1, #7]
    //     0x745588: ldurb           w16, [x1, #-1]
    //     0x74558c: ldurb           w17, [x0, #-1]
    //     0x745590: and             x16, x17, x16, lsr #2
    //     0x745594: tst             x16, HEAP, lsr #32
    //     0x745598: b.eq            #0x7455a0
    //     0x74559c: bl              #0x74b698  ; WriteBarrierWrappersStub
    // 0x7455a0: mov             x0, x2
    // 0x7455a4: StoreField: r1->field_b = r0
    //     0x7455a4: stur            w0, [x1, #0xb]
    //     0x7455a8: ldurb           w16, [x1, #-1]
    //     0x7455ac: ldurb           w17, [x0, #-1]
    //     0x7455b0: and             x16, x17, x16, lsr #2
    //     0x7455b4: tst             x16, HEAP, lsr #32
    //     0x7455b8: b.eq            #0x7455c0
    //     0x7455bc: bl              #0x74b698  ; WriteBarrierWrappersStub
    // 0x7455c0: r16 = Instance_Tx
    //     0x7455c0: add             x16, PP, #0x11, lsl #12  ; [pp+0x11180] Obj!Tx@4302c1
    //     0x7455c4: ldr             x16, [x16, #0x180]
    // 0x7455c8: ldur            lr, [fp, #-0xa0]
    // 0x7455cc: stp             lr, x16, [SP]
    // 0x7455d0: r0 = call 0x36a364
    //     0x7455d0: bl              #0x36a364
    // 0x7455d4: ldur            x0, [fp, #-0xb8]
    // 0x7455d8: r0 = ReturnAsyncNotFuture()
    //     0x7455d8: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x7455dc: sub             SP, fp, #0xf0
    // 0x7455e0: stur            x0, [fp, #-0x98]
    // 0x7455e4: stur            x1, [fp, #-0xa0]
    // 0x7455e8: r16 = Instance_Tx
    //     0x7455e8: add             x16, PP, #0x11, lsl #12  ; [pp+0x11180] Obj!Tx@4302c1
    //     0x7455ec: ldr             x16, [x16, #0x180]
    // 0x7455f0: ldur            lr, [fp, #-0x48]
    // 0x7455f4: stp             lr, x16, [SP]
    // 0x7455f8: r0 = call 0x36a364
    //     0x7455f8: bl              #0x36a364
    // 0x7455fc: ldur            x0, [fp, #-0x98]
    // 0x745600: ldur            x1, [fp, #-0xa0]
    // 0x745604: r0 = ReThrow()
    //     0x745604: bl              #0x74b234  ; ReThrowStub
    // 0x745608: brk             #0
    // 0x74560c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x74560c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x745610: b               #0x7453d0
    // 0x745614: r0 = NullErrorSharedWithoutFPURegs()
    //     0x745614: bl              #0x74d4bc  ; NullErrorSharedWithoutFPURegsStub
  }
  [closure] Future<List<SRa>> <anonymous closure>(dynamic) async {
    // ** addr: 0x746424, size: 0x200
    // 0x746424: EnterFrame
    //     0x746424: stp             fp, lr, [SP, #-0x10]!
    //     0x746428: mov             fp, SP
    // 0x74642c: AllocStack(0x40)
    //     0x74642c: sub             SP, SP, #0x40
    // 0x746430: SetupParameters(MRa this /* r1 */)
    //     0x746430: stur            NULL, [fp, #-8]
    //     0x746434: mov             x0, #0
    //     0x746438: add             x1, fp, w0, sxtw #2
    //     0x74643c: ldr             x1, [x1, #0x10]
    //     0x746440: ldur            w2, [x1, #0x17]
    //     0x746444: add             x2, x2, HEAP, lsl #32
    //     0x746448: stur            x2, [fp, #-0x10]
    // 0x74644c: CheckStackOverflow
    //     0x74644c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x746450: cmp             SP, x16
    //     0x746454: b.ls            #0x74661c
    // 0x746458: InitAsync() -> Future<List<SRa>>
    //     0x746458: add             x0, PP, #0x32, lsl #12  ; [pp+0x326b0] TypeArguments: <List<SRa>>
    //     0x74645c: ldr             x0, [x0, #0x6b0]
    //     0x746460: bl              #0x6cb614  ; InitAsyncStub
    // 0x746464: ldur            x0, [fp, #-0x10]
    // 0x746468: LoadField: r1 = r0->field_f
    //     0x746468: ldur            w1, [x0, #0xf]
    // 0x74646c: DecompressPointer r1
    //     0x74646c: add             x1, x1, HEAP, lsl #32
    // 0x746470: LoadField: r2 = r0->field_13
    //     0x746470: ldur            w2, [x0, #0x13]
    // 0x746474: DecompressPointer r2
    //     0x746474: add             x2, x2, HEAP, lsl #32
    // 0x746478: stp             x2, x1, [SP]
    // 0x74647c: r0 = __unknown_function__()
    //     0x74647c: bl              #0x746afc  ; [] ::__unknown_function__
    // 0x746480: mov             x1, x0
    // 0x746484: stur            x1, [fp, #-0x18]
    // 0x746488: r0 = Await()
    //     0x746488: bl              #0x6cdaec  ; AwaitStub
    // 0x74648c: mov             x1, x0
    // 0x746490: ldur            x0, [fp, #-0x10]
    // 0x746494: stur            x1, [fp, #-0x18]
    // 0x746498: LoadField: r2 = r0->field_f
    //     0x746498: ldur            w2, [x0, #0xf]
    // 0x74649c: DecompressPointer r2
    //     0x74649c: add             x2, x2, HEAP, lsl #32
    // 0x7464a0: LoadField: r3 = r2->field_b
    //     0x7464a0: ldur            w3, [x2, #0xb]
    // 0x7464a4: DecompressPointer r3
    //     0x7464a4: add             x3, x3, HEAP, lsl #32
    // 0x7464a8: LoadField: r2 = r0->field_13
    //     0x7464a8: ldur            w2, [x0, #0x13]
    // 0x7464ac: DecompressPointer r2
    //     0x7464ac: add             x2, x2, HEAP, lsl #32
    // 0x7464b0: stp             x3, x1, [SP, #8]
    // 0x7464b4: str             x2, [SP]
    // 0x7464b8: r0 = __unknown_function__()
    //     0x7464b8: bl              #0x746624  ; [] ::__unknown_function__
    // 0x7464bc: mov             x3, x0
    // 0x7464c0: stur            x3, [fp, #-0x28]
    // 0x7464c4: LoadField: r4 = r3->field_7
    //     0x7464c4: ldur            w4, [x3, #7]
    // 0x7464c8: DecompressPointer r4
    //     0x7464c8: add             x4, x4, HEAP, lsl #32
    // 0x7464cc: mov             x0, x3
    // 0x7464d0: stur            x4, [fp, #-0x20]
    // 0x7464d4: r2 = Null
    //     0x7464d4: mov             x2, NULL
    // 0x7464d8: r1 = Null
    //     0x7464d8: mov             x1, NULL
    // 0x7464dc: cmp             w0, NULL
    // 0x7464e0: b.eq            #0x746578
    // 0x7464e4: branchIfSmi(r0, 0x746578)
    //     0x7464e4: tbz             w0, #0, #0x746578
    // 0x7464e8: r3 = LoadClassIdInstr(r0)
    //     0x7464e8: ldur            x3, [x0, #-1]
    //     0x7464ec: ubfx            x3, x3, #0xc, #0x14
    // 0x7464f0: r17 = 5016
    //     0x7464f0: mov             x17, #0x1398
    // 0x7464f4: cmp             x3, x17
    // 0x7464f8: b.eq            #0x746580
    // 0x7464fc: r4 = LoadClassIdInstr(r0)
    //     0x7464fc: ldur            x4, [x0, #-1]
    //     0x746500: ubfx            x4, x4, #0xc, #0x14
    // 0x746504: ldr             x3, [THR, #0x6e8]  ; THR::isolate_group
    // 0x746508: ldr             x3, [x3, #0x18]
    // 0x74650c: ldr             x3, [x3, x4, lsl #3]
    // 0x746510: LoadField: r3 = r3->field_2b
    //     0x746510: ldur            w3, [x3, #0x2b]
    // 0x746514: DecompressPointer r3
    //     0x746514: add             x3, x3, HEAP, lsl #32
    // 0x746518: cmp             w3, NULL
    // 0x74651c: b.eq            #0x746578
    // 0x746520: LoadField: r3 = r3->field_f
    //     0x746520: ldur            w3, [x3, #0xf]
    // 0x746524: lsr             x3, x3, #4
    // 0x746528: r17 = 5016
    //     0x746528: mov             x17, #0x1398
    // 0x74652c: cmp             x3, x17
    // 0x746530: b.eq            #0x746580
    // 0x746534: r3 = SubtypeTestCache
    //     0x746534: add             x3, PP, #0x32, lsl #12  ; [pp+0x326b8] SubtypeTestCache
    //     0x746538: ldr             x3, [x3, #0x6b8]
    // 0x74653c: r30 = Subtype1TestCacheStub
    //     0x74653c: ldr             lr, [PP, #0x860]  ; [pp+0x860] Stub: Subtype1TestCache (0x1f2f98)
    // 0x746540: LoadField: r30 = r30->field_7
    //     0x746540: ldur            lr, [lr, #7]
    // 0x746544: blr             lr
    // 0x746548: cmp             w7, NULL
    // 0x74654c: b.eq            #0x746558
    // 0x746550: tbnz            w7, #4, #0x746578
    // 0x746554: b               #0x746580
    // 0x746558: r8 = d
    //     0x746558: add             x8, PP, #0x32, lsl #12  ; [pp+0x326c0] Type: d
    //     0x74655c: ldr             x8, [x8, #0x6c0]
    // 0x746560: r3 = SubtypeTestCache
    //     0x746560: add             x3, PP, #0x32, lsl #12  ; [pp+0x326c8] SubtypeTestCache
    //     0x746564: ldr             x3, [x3, #0x6c8]
    // 0x746568: r30 = InstanceOfStub
    //     0x746568: ldr             lr, [PP, #0x368]  ; [pp+0x368] Stub: InstanceOf (0x1e1284)
    // 0x74656c: LoadField: r30 = r30->field_7
    //     0x74656c: ldur            lr, [lr, #7]
    // 0x746570: blr             lr
    // 0x746574: b               #0x746584
    // 0x746578: r0 = false
    //     0x746578: add             x0, NULL, #0x30  ; false
    // 0x74657c: b               #0x746584
    // 0x746580: r0 = true
    //     0x746580: add             x0, NULL, #0x20  ; true
    // 0x746584: tbnz            w0, #4, #0x7465a0
    // 0x746588: ldur            x16, [fp, #-0x20]
    // 0x74658c: ldur            lr, [fp, #-0x28]
    // 0x746590: stp             lr, x16, [SP]
    // 0x746594: r0 = call 0x1fa9fc
    //     0x746594: bl              #0x1fa9fc
    // 0x746598: mov             x1, x0
    // 0x74659c: b               #0x7465c4
    // 0x7465a0: ldur            x16, [fp, #-0x20]
    // 0x7465a4: ldur            lr, [fp, #-0x28]
    // 0x7465a8: stp             lr, x16, [SP]
    // 0x7465ac: r0 = call 0x1f9238
    //     0x7465ac: bl              #0x1f9238
    // 0x7465b0: ldur            x16, [fp, #-0x20]
    // 0x7465b4: stp             x0, x16, [SP]
    // 0x7465b8: r4 = const [0x1, 0x1, 0x1, 0x1, null]
    //     0x7465b8: ldr             x4, [PP, #0x880]  ; [pp+0x880] List(5) [0x1, 0x1, 0x1, 0x1, Null]
    // 0x7465bc: r0 = o()
    //     0x7465bc: bl              #0x6c97b4  ; [dart:_internal] ::o
    // 0x7465c0: mov             x1, x0
    // 0x7465c4: ldur            x0, [fp, #-0x10]
    // 0x7465c8: stur            x1, [fp, #-0x20]
    // 0x7465cc: r0 = InitLateStaticField(0xfb0) // [AOh] ::BJf
    //     0x7465cc: ldr             x0, [THR, #0x68]  ; THR::field_table_values
    //     0x7465d0: ldr             x0, [x0, #0x1f60]
    //     0x7465d4: ldr             x16, [PP, #0x40]  ; [pp+0x40] Sentinel
    //     0x7465d8: cmp             w0, w16
    //     0x7465dc: b.ne            #0x7465ec
    //     0x7465e0: add             x2, PP, #0x15, lsl #12  ; [pp+0x155c0] Field <::.BJf>: static late final (offset: 0xfb0)
    //     0x7465e4: ldr             x2, [x2, #0x5c0]
    //     0x7465e8: bl              #0x74b0fc  ; InitLateFinalStaticFieldStub
    // 0x7465ec: mov             x1, x0
    // 0x7465f0: ldur            x0, [fp, #-0x10]
    // 0x7465f4: LoadField: r2 = r0->field_f
    //     0x7465f4: ldur            w2, [x0, #0xf]
    // 0x7465f8: DecompressPointer r2
    //     0x7465f8: add             x2, x2, HEAP, lsl #32
    // 0x7465fc: LoadField: r0 = r2->field_b
    //     0x7465fc: ldur            w0, [x2, #0xb]
    // 0x746600: DecompressPointer r0
    //     0x746600: add             x0, x0, HEAP, lsl #32
    // 0x746604: stp             x0, x1, [SP, #8]
    // 0x746608: ldur            x16, [fp, #-0x18]
    // 0x74660c: str             x16, [SP]
    // 0x746610: r0 = call 0x6a095c
    //     0x746610: bl              #0x6a095c
    // 0x746614: ldur            x0, [fp, #-0x20]
    // 0x746618: r0 = ReturnAsyncNotFuture()
    //     0x746618: b               #0x6cb5e8  ; ReturnAsyncNotFutureStub
    // 0x74661c: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x74661c: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x746620: b               #0x746458
  }
  [closure] Null <anonymous closure>(dynamic, Ux) {
    // ** addr: 0x385c6c, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, Ux) {
    // ** addr: 0x385e74, size: -0x1
  }
  [closure] Null <anonymous closure>(dynamic, Ux) {
    // ** addr: 0x385a64, size: -0x1
  }
}

// class id: 372, size: 0x20, field offset: 0x8
class _LRa extends Object {

  late final gg<(dynamic, Pointer<xRa>, qg, Pointer<Void>, Pointer<Void>) => Void> _rBf; // offset: 0x8

  [closure] void <anonymous closure>(dynamic, int, Pointer<Void>) {
    // ** addr: 0x384448, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x3843cc, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic, String) {
    // ** addr: 0x384364, size: -0x1
  }
  [closure] void _callback(dynamic, Pointer<xRa>, int, Pointer<Void>, Pointer<Void>) {
    // ** addr: 0x6a90fc, size: -0x1
  }
}

// class id: 373, size: 0xc, field offset: 0x8
class KRa extends Object
    implements Ia {
}

// class id: 4720, size: 0x14, field offset: 0x14
enum PRa extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 4721, size: 0x14, field offset: 0x14
enum ORa extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
