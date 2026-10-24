// lib: , url: file:///G:/MyProject/Reex/re_player_ex/.dart_tool/flutter_build/dart_plugin_registrant.dart

// class id: 1048593, size: 0x8
class :: {
}

// class id: 4045, size: 0x8, field offset: 0x8
class _PluginRegistrant extends Object {

  static void register() {
    // ** addr: 0x74d980, size: 0xb8
    // 0x74d980: EnterFrame
    //     0x74d980: stp             fp, lr, [SP, #-0x10]!
    //     0x74d984: mov             fp, SP
    // 0x74d988: AllocStack(0x38)
    //     0x74d988: sub             SP, SP, #0x38
    // 0x74d98c: CheckStackOverflow
    //     0x74d98c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x74d990: cmp             SP, x16
    //     0x74d994: b.ls            #0x74da30
    // 0x74d998: r0 = call 0x6b1f88
    //     0x74d998: bl              #0x6b1f88
    // 0x74d99c: b               #0x74d9dc
    // 0x74d9a0: sub             SP, fp, #0x38
    // 0x74d9a4: stur            x0, [fp, #-0x30]
    // 0x74d9a8: r1 = Null
    //     0x74d9a8: mov             x1, NULL
    // 0x74d9ac: r2 = 6
    //     0x74d9ac: mov             x2, #6
    // 0x74d9b0: r0 = AllocateArray()
    //     0x74d9b0: bl              #0x74cc68  ; AllocateArrayStub
    // 0x74d9b4: r17 = "`path_provider_android` threw an error: "
    //     0x74d9b4: ldr             x17, [PP, #0x88]  ; [pp+0x88] "`path_provider_android` threw an error: "
    // 0x74d9b8: StoreField: r0->field_f = r17
    //     0x74d9b8: stur            w17, [x0, #0xf]
    // 0x74d9bc: ldur            x1, [fp, #-0x30]
    // 0x74d9c0: StoreField: r0->field_13 = r1
    //     0x74d9c0: stur            w1, [x0, #0x13]
    // 0x74d9c4: r17 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0x74d9c4: ldr             x17, [PP, #0x90]  ; [pp+0x90] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    // 0x74d9c8: ArrayStore: r0[0] = r17  ; List_4
    //     0x74d9c8: stur            w17, [x0, #0x17]
    // 0x74d9cc: str             x0, [SP]
    // 0x74d9d0: r0 = _interpolate()
    //     0x74d9d0: bl              #0x1fb13c  ; [dart:core] _StringBase::_interpolate
    // 0x74d9d4: str             x0, [SP]
    // 0x74d9d8: r0 = call 0x6b1f1c
    //     0x74d9d8: bl              #0x6b1f1c
    // 0x74d9dc: r0 = call 0x6b1d50
    //     0x74d9dc: bl              #0x6b1d50
    // 0x74d9e0: b               #0x74da20
    // 0x74d9e4: sub             SP, fp, #0x38
    // 0x74d9e8: stur            x0, [fp, #-0x30]
    // 0x74d9ec: r1 = Null
    //     0x74d9ec: mov             x1, NULL
    // 0x74d9f0: r2 = 6
    //     0x74d9f0: mov             x2, #6
    // 0x74d9f4: r0 = AllocateArray()
    //     0x74d9f4: bl              #0x74cc68  ; AllocateArrayStub
    // 0x74d9f8: r17 = "`url_launcher_android` threw an error: "
    //     0x74d9f8: ldr             x17, [PP, #0x98]  ; [pp+0x98] "`url_launcher_android` threw an error: "
    // 0x74d9fc: StoreField: r0->field_f = r17
    //     0x74d9fc: stur            w17, [x0, #0xf]
    // 0x74da00: ldur            x1, [fp, #-0x30]
    // 0x74da04: StoreField: r0->field_13 = r1
    //     0x74da04: stur            w1, [x0, #0x13]
    // 0x74da08: r17 = ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    //     0x74da08: ldr             x17, [PP, #0x90]  ; [pp+0x90] ". The app may not function as expected until you remove this plugin from pubspec.yaml"
    // 0x74da0c: ArrayStore: r0[0] = r17  ; List_4
    //     0x74da0c: stur            w17, [x0, #0x17]
    // 0x74da10: str             x0, [SP]
    // 0x74da14: r0 = _interpolate()
    //     0x74da14: bl              #0x1fb13c  ; [dart:core] _StringBase::_interpolate
    // 0x74da18: str             x0, [SP]
    // 0x74da1c: r0 = call 0x6b1f1c
    //     0x74da1c: bl              #0x6b1f1c
    // 0x74da20: r0 = Null
    //     0x74da20: mov             x0, NULL
    // 0x74da24: LeaveFrame
    //     0x74da24: mov             SP, fp
    //     0x74da28: ldp             fp, lr, [SP], #0x10
    // 0x74da2c: ret
    //     0x74da2c: ret             
    // 0x74da30: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x74da30: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x74da34: b               #0x74d998
  }
}
