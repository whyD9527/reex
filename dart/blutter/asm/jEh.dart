// lib: , url: JEh

// class id: 1048995, size: 0x8
class :: {
}

// class id: 1360, size: 0x8, field offset: 0x8
//   const constructor, transformed mixin,
abstract class _uca extends Object
     with tca {
}

// class id: 1361, size: 0x8, field offset: 0x8
class _vca extends _uca {

  static late final _vca EPb; // offset: 0x88c
}

// class id: 1362, size: 0x8, field offset: 0x8
abstract class tca extends Object {
}

// class id: 1363, size: 0x28, field offset: 0x8
class sca extends Object {

  static late final sca _QOb; // offset: 0x888
  late naa _fnc; // offset: 0x18
  late MethodChannel _dnc; // offset: 0x10

  [closure] Future<dynamic> _lnc(dynamic, MethodCall) {
    // ** addr: 0x2a5b54, size: -0x1
  }
  [closure] List<xB> <anonymous closure>(dynamic) {
    // ** addr: 0x2b7260, size: -0x1
  }
  [closure] double <anonymous closure>(dynamic, num) {
    // ** addr: 0x2b720c, size: -0x1
  }
  [closure] bool <anonymous closure>(dynamic, String) {
    // ** addr: 0x2b6970, size: -0x1
  }
  [closure] List<dynamic> <anonymous closure>(dynamic, String) {
    // ** addr: 0x2b65e0, size: -0x1
  }
  [closure] void <anonymous closure>(dynamic) {
    // ** addr: 0x2ae124, size: -0x1
  }
}

// class id: 1364, size: 0x28, field offset: 0x8
class oaa extends Object {
}

// class id: 1365, size: 0x8, field offset: 0x8
abstract class rca extends Object
    implements maa {
}

// class id: 1366, size: 0x18, field offset: 0x8
//   const constructor, 
class qca extends Object {
}

// class id: 1367, size: 0x8, field offset: 0x8
abstract class pca extends Object {
}

// class id: 1368, size: 0x8, field offset: 0x8
abstract class maa extends Object {
}

// class id: 1369, size: 0x8, field offset: 0x8
abstract class oca extends Object {
}

// class id: 1370, size: 0x14, field offset: 0x8
//   const constructor, 
class laa extends Object {

  _OneByteString field_8;
  Uba field_c;
  Ms field_10;

  [closure] int jlg(dynamic, int) {
    // ** addr: 0x2bdaf0, size: -0x1
  }
}

// class id: 1371, size: 0x14, field offset: 0x8
class mca extends Object {
}

// class id: 1372, size: 0x48, field offset: 0x8
//   const constructor, 
class naa extends Object {

  Map<String, dynamic> DDb(naa) {
    // ** addr: 0x6d9610, size: 0x408
    // 0x6d9610: EnterFrame
    //     0x6d9610: stp             fp, lr, [SP, #-0x10]!
    //     0x6d9614: mov             fp, SP
    // 0x6d9618: AllocStack(0x38)
    //     0x6d9618: sub             SP, SP, #0x38
    // 0x6d961c: CheckStackOverflow
    //     0x6d961c: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d9620: cmp             SP, x16
    //     0x6d9624: b.ls            #0x6d99f8
    // 0x6d9628: ldr             x0, [fp, #0x10]
    // 0x6d962c: ArrayLoad: r1 = r0[0]  ; List_4
    //     0x6d962c: ldur            w1, [x0, #0x17]
    // 0x6d9630: DecompressPointer r1
    //     0x6d9630: add             x1, x1, HEAP, lsl #32
    // 0x6d9634: str             x1, [SP]
    // 0x6d9638: r0 = DDb()
    //     0x6d9638: bl              #0x6d9ae4  ; [gEh] paa::DDb
    // 0x6d963c: stur            x0, [fp, #-8]
    // 0x6d9640: r16 = <String, dynamic>
    //     0x6d9640: ldr             x16, [PP, #0xc68]  ; [pp+0xc68] TypeArguments: <String, dynamic>
    // 0x6d9644: ldr             lr, [THR, #0x88]  ; THR::empty_array
    // 0x6d9648: stp             lr, x16, [SP]
    // 0x6d964c: r0 = Map._fromLiteral()
    //     0x6d964c: bl              #0x2002cc  ; [dart:core] Map::Map._fromLiteral
    // 0x6d9650: mov             x1, x0
    // 0x6d9654: ldr             x0, [fp, #0x10]
    // 0x6d9658: stur            x1, [fp, #-0x10]
    // 0x6d965c: LoadField: r2 = r0->field_7
    //     0x6d965c: ldur            w2, [x0, #7]
    // 0x6d9660: DecompressPointer r2
    //     0x6d9660: add             x2, x2, HEAP, lsl #32
    // 0x6d9664: str             x2, [SP]
    // 0x6d9668: r0 = DDb()
    //     0x6d9668: bl              #0x6d9a18  ; [JEh] ica::DDb
    // 0x6d966c: stur            x0, [fp, #-0x18]
    // 0x6d9670: r16 = "inputType"
    //     0x6d9670: ldr             x16, [PP, #0x66d8]  ; [pp+0x66d8] "inputType"
    // 0x6d9674: str             x16, [SP]
    // 0x6d9678: r0 = hashCode()
    //     0x6d9678: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d967c: r1 = LoadInt32Instr(r0)
    //     0x6d967c: sbfx            x1, x0, #1, #0x1f
    //     0x6d9680: tbz             w0, #0, #0x6d9688
    //     0x6d9684: ldur            x1, [x0, #7]
    // 0x6d9688: ldur            x16, [fp, #-0x10]
    // 0x6d968c: r30 = "inputType"
    //     0x6d968c: ldr             lr, [PP, #0x66d8]  ; [pp+0x66d8] "inputType"
    // 0x6d9690: stp             lr, x16, [SP, #0x10]
    // 0x6d9694: ldur            x16, [fp, #-0x18]
    // 0x6d9698: stp             x1, x16, [SP]
    // 0x6d969c: r0 = call 0x2004c0
    //     0x6d969c: bl              #0x2004c0
    // 0x6d96a0: r16 = "readOnly"
    //     0x6d96a0: ldr             x16, [PP, #0x6708]  ; [pp+0x6708] "readOnly"
    // 0x6d96a4: str             x16, [SP]
    // 0x6d96a8: r0 = hashCode()
    //     0x6d96a8: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d96ac: r1 = LoadInt32Instr(r0)
    //     0x6d96ac: sbfx            x1, x0, #1, #0x1f
    //     0x6d96b0: tbz             w0, #0, #0x6d96b8
    //     0x6d96b4: ldur            x1, [x0, #7]
    // 0x6d96b8: ldur            x16, [fp, #-0x10]
    // 0x6d96bc: r30 = "readOnly"
    //     0x6d96bc: ldr             lr, [PP, #0x6708]  ; [pp+0x6708] "readOnly"
    // 0x6d96c0: stp             lr, x16, [SP, #0x10]
    // 0x6d96c4: r16 = false
    //     0x6d96c4: add             x16, NULL, #0x30  ; false
    // 0x6d96c8: stp             x1, x16, [SP]
    // 0x6d96cc: r0 = call 0x2004c0
    //     0x6d96cc: bl              #0x2004c0
    // 0x6d96d0: r16 = "obscureText"
    //     0x6d96d0: ldr             x16, [PP, #0x6710]  ; [pp+0x6710] "obscureText"
    // 0x6d96d4: str             x16, [SP]
    // 0x6d96d8: r0 = hashCode()
    //     0x6d96d8: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d96dc: r1 = LoadInt32Instr(r0)
    //     0x6d96dc: sbfx            x1, x0, #1, #0x1f
    //     0x6d96e0: tbz             w0, #0, #0x6d96e8
    //     0x6d96e4: ldur            x1, [x0, #7]
    // 0x6d96e8: ldur            x16, [fp, #-0x10]
    // 0x6d96ec: r30 = "obscureText"
    //     0x6d96ec: ldr             lr, [PP, #0x6710]  ; [pp+0x6710] "obscureText"
    // 0x6d96f0: stp             lr, x16, [SP, #0x10]
    // 0x6d96f4: r16 = false
    //     0x6d96f4: add             x16, NULL, #0x30  ; false
    // 0x6d96f8: stp             x1, x16, [SP]
    // 0x6d96fc: r0 = call 0x2004c0
    //     0x6d96fc: bl              #0x2004c0
    // 0x6d9700: r16 = "autocorrect"
    //     0x6d9700: ldr             x16, [PP, #0x6718]  ; [pp+0x6718] "autocorrect"
    // 0x6d9704: str             x16, [SP]
    // 0x6d9708: r0 = hashCode()
    //     0x6d9708: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d970c: r1 = LoadInt32Instr(r0)
    //     0x6d970c: sbfx            x1, x0, #1, #0x1f
    //     0x6d9710: tbz             w0, #0, #0x6d9718
    //     0x6d9714: ldur            x1, [x0, #7]
    // 0x6d9718: ldur            x16, [fp, #-0x10]
    // 0x6d971c: r30 = "autocorrect"
    //     0x6d971c: ldr             lr, [PP, #0x6718]  ; [pp+0x6718] "autocorrect"
    // 0x6d9720: stp             lr, x16, [SP, #0x10]
    // 0x6d9724: r16 = true
    //     0x6d9724: add             x16, NULL, #0x20  ; true
    // 0x6d9728: stp             x1, x16, [SP]
    // 0x6d972c: r0 = call 0x2004c0
    //     0x6d972c: bl              #0x2004c0
    // 0x6d9730: r16 = 2
    //     0x6d9730: mov             x16, #2
    // 0x6d9734: str             x16, [SP]
    // 0x6d9738: r0 = call 0x51f148
    //     0x6d9738: bl              #0x51f148
    // 0x6d973c: stur            x0, [fp, #-0x18]
    // 0x6d9740: r16 = "smartDashesType"
    //     0x6d9740: ldr             x16, [PP, #0x6720]  ; [pp+0x6720] "smartDashesType"
    // 0x6d9744: str             x16, [SP]
    // 0x6d9748: r0 = hashCode()
    //     0x6d9748: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d974c: r1 = LoadInt32Instr(r0)
    //     0x6d974c: sbfx            x1, x0, #1, #0x1f
    //     0x6d9750: tbz             w0, #0, #0x6d9758
    //     0x6d9754: ldur            x1, [x0, #7]
    // 0x6d9758: ldur            x16, [fp, #-0x10]
    // 0x6d975c: r30 = "smartDashesType"
    //     0x6d975c: ldr             lr, [PP, #0x6720]  ; [pp+0x6720] "smartDashesType"
    // 0x6d9760: stp             lr, x16, [SP, #0x10]
    // 0x6d9764: ldur            x16, [fp, #-0x18]
    // 0x6d9768: stp             x1, x16, [SP]
    // 0x6d976c: r0 = call 0x2004c0
    //     0x6d976c: bl              #0x2004c0
    // 0x6d9770: ldr             x2, [fp, #0x10]
    // 0x6d9774: LoadField: r0 = r2->field_1f
    //     0x6d9774: ldur            w0, [x2, #0x1f]
    // 0x6d9778: DecompressPointer r0
    //     0x6d9778: add             x0, x0, HEAP, lsl #32
    // 0x6d977c: LoadField: r3 = r0->field_7
    //     0x6d977c: ldur            x3, [x0, #7]
    // 0x6d9780: r0 = BoxInt64Instr(r3)
    //     0x6d9780: sbfiz           x0, x3, #1, #0x1f
    //     0x6d9784: cmp             x3, x0, asr #1
    //     0x6d9788: b.eq            #0x6d9794
    //     0x6d978c: bl              #0x74cee4  ; AllocateMintSharedWithoutFPURegsStub
    //     0x6d9790: stur            x3, [x0, #7]
    // 0x6d9794: str             x0, [SP]
    // 0x6d9798: r0 = call 0x51f148
    //     0x6d9798: bl              #0x51f148
    // 0x6d979c: stur            x0, [fp, #-0x18]
    // 0x6d97a0: r16 = "smartQuotesType"
    //     0x6d97a0: ldr             x16, [PP, #0x6728]  ; [pp+0x6728] "smartQuotesType"
    // 0x6d97a4: str             x16, [SP]
    // 0x6d97a8: r0 = hashCode()
    //     0x6d97a8: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d97ac: r1 = LoadInt32Instr(r0)
    //     0x6d97ac: sbfx            x1, x0, #1, #0x1f
    //     0x6d97b0: tbz             w0, #0, #0x6d97b8
    //     0x6d97b4: ldur            x1, [x0, #7]
    // 0x6d97b8: ldur            x16, [fp, #-0x10]
    // 0x6d97bc: r30 = "smartQuotesType"
    //     0x6d97bc: ldr             lr, [PP, #0x6728]  ; [pp+0x6728] "smartQuotesType"
    // 0x6d97c0: stp             lr, x16, [SP, #0x10]
    // 0x6d97c4: ldur            x16, [fp, #-0x18]
    // 0x6d97c8: stp             x1, x16, [SP]
    // 0x6d97cc: r0 = call 0x2004c0
    //     0x6d97cc: bl              #0x2004c0
    // 0x6d97d0: r16 = "enableSuggestions"
    //     0x6d97d0: ldr             x16, [PP, #0x6730]  ; [pp+0x6730] "enableSuggestions"
    // 0x6d97d4: str             x16, [SP]
    // 0x6d97d8: r0 = hashCode()
    //     0x6d97d8: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d97dc: r1 = LoadInt32Instr(r0)
    //     0x6d97dc: sbfx            x1, x0, #1, #0x1f
    //     0x6d97e0: tbz             w0, #0, #0x6d97e8
    //     0x6d97e4: ldur            x1, [x0, #7]
    // 0x6d97e8: ldur            x16, [fp, #-0x10]
    // 0x6d97ec: r30 = "enableSuggestions"
    //     0x6d97ec: ldr             lr, [PP, #0x6730]  ; [pp+0x6730] "enableSuggestions"
    // 0x6d97f0: stp             lr, x16, [SP, #0x10]
    // 0x6d97f4: r16 = true
    //     0x6d97f4: add             x16, NULL, #0x20  ; true
    // 0x6d97f8: stp             x1, x16, [SP]
    // 0x6d97fc: r0 = call 0x2004c0
    //     0x6d97fc: bl              #0x2004c0
    // 0x6d9800: r16 = "enableInteractiveSelection"
    //     0x6d9800: ldr             x16, [PP, #0x6738]  ; [pp+0x6738] "enableInteractiveSelection"
    // 0x6d9804: str             x16, [SP]
    // 0x6d9808: r0 = hashCode()
    //     0x6d9808: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d980c: r1 = LoadInt32Instr(r0)
    //     0x6d980c: sbfx            x1, x0, #1, #0x1f
    //     0x6d9810: tbz             w0, #0, #0x6d9818
    //     0x6d9814: ldur            x1, [x0, #7]
    // 0x6d9818: ldur            x16, [fp, #-0x10]
    // 0x6d981c: r30 = "enableInteractiveSelection"
    //     0x6d981c: ldr             lr, [PP, #0x6738]  ; [pp+0x6738] "enableInteractiveSelection"
    // 0x6d9820: stp             lr, x16, [SP, #0x10]
    // 0x6d9824: r16 = true
    //     0x6d9824: add             x16, NULL, #0x20  ; true
    // 0x6d9828: stp             x1, x16, [SP]
    // 0x6d982c: r0 = call 0x2004c0
    //     0x6d982c: bl              #0x2004c0
    // 0x6d9830: r16 = "actionLabel"
    //     0x6d9830: ldr             x16, [PP, #0x6740]  ; [pp+0x6740] "actionLabel"
    // 0x6d9834: str             x16, [SP]
    // 0x6d9838: r0 = hashCode()
    //     0x6d9838: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d983c: r1 = LoadInt32Instr(r0)
    //     0x6d983c: sbfx            x1, x0, #1, #0x1f
    //     0x6d9840: tbz             w0, #0, #0x6d9848
    //     0x6d9844: ldur            x1, [x0, #7]
    // 0x6d9848: ldur            x16, [fp, #-0x10]
    // 0x6d984c: r30 = "actionLabel"
    //     0x6d984c: ldr             lr, [PP, #0x6740]  ; [pp+0x6740] "actionLabel"
    // 0x6d9850: stp             lr, x16, [SP, #0x10]
    // 0x6d9854: stp             x1, NULL, [SP]
    // 0x6d9858: r0 = call 0x2004c0
    //     0x6d9858: bl              #0x2004c0
    // 0x6d985c: ldr             x0, [fp, #0x10]
    // 0x6d9860: LoadField: r1 = r0->field_2f
    //     0x6d9860: ldur            w1, [x0, #0x2f]
    // 0x6d9864: DecompressPointer r1
    //     0x6d9864: add             x1, x1, HEAP, lsl #32
    // 0x6d9868: str             x1, [SP]
    // 0x6d986c: r0 = call 0x5424e4
    //     0x6d986c: bl              #0x5424e4
    // 0x6d9870: stur            x0, [fp, #-0x18]
    // 0x6d9874: r16 = "inputAction"
    //     0x6d9874: ldr             x16, [PP, #0x6748]  ; [pp+0x6748] "inputAction"
    // 0x6d9878: str             x16, [SP]
    // 0x6d987c: r0 = hashCode()
    //     0x6d987c: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d9880: r1 = LoadInt32Instr(r0)
    //     0x6d9880: sbfx            x1, x0, #1, #0x1f
    //     0x6d9884: tbz             w0, #0, #0x6d988c
    //     0x6d9888: ldur            x1, [x0, #7]
    // 0x6d988c: ldur            x16, [fp, #-0x10]
    // 0x6d9890: r30 = "inputAction"
    //     0x6d9890: ldr             lr, [PP, #0x6748]  ; [pp+0x6748] "inputAction"
    // 0x6d9894: stp             lr, x16, [SP, #0x10]
    // 0x6d9898: ldur            x16, [fp, #-0x18]
    // 0x6d989c: stp             x1, x16, [SP]
    // 0x6d98a0: r0 = call 0x2004c0
    //     0x6d98a0: bl              #0x2004c0
    // 0x6d98a4: r16 = "textCapitalization"
    //     0x6d98a4: ldr             x16, [PP, #0x6750]  ; [pp+0x6750] "textCapitalization"
    // 0x6d98a8: str             x16, [SP]
    // 0x6d98ac: r0 = hashCode()
    //     0x6d98ac: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d98b0: r1 = LoadInt32Instr(r0)
    //     0x6d98b0: sbfx            x1, x0, #1, #0x1f
    //     0x6d98b4: tbz             w0, #0, #0x6d98bc
    //     0x6d98b8: ldur            x1, [x0, #7]
    // 0x6d98bc: ldur            x16, [fp, #-0x10]
    // 0x6d98c0: r30 = "textCapitalization"
    //     0x6d98c0: ldr             lr, [PP, #0x6750]  ; [pp+0x6750] "textCapitalization"
    // 0x6d98c4: stp             lr, x16, [SP, #0x10]
    // 0x6d98c8: r16 = "TextCapitalization.none"
    //     0x6d98c8: ldr             x16, [PP, #0x6758]  ; [pp+0x6758] "TextCapitalization.none"
    // 0x6d98cc: stp             x1, x16, [SP]
    // 0x6d98d0: r0 = call 0x2004c0
    //     0x6d98d0: bl              #0x2004c0
    // 0x6d98d4: ldr             x0, [fp, #0x10]
    // 0x6d98d8: LoadField: r1 = r0->field_37
    //     0x6d98d8: ldur            w1, [x0, #0x37]
    // 0x6d98dc: DecompressPointer r1
    //     0x6d98dc: add             x1, x1, HEAP, lsl #32
    // 0x6d98e0: str             x1, [SP]
    // 0x6d98e4: r0 = call 0x540014
    //     0x6d98e4: bl              #0x540014
    // 0x6d98e8: stur            x0, [fp, #-0x18]
    // 0x6d98ec: r16 = "keyboardAppearance"
    //     0x6d98ec: ldr             x16, [PP, #0x6760]  ; [pp+0x6760] "keyboardAppearance"
    // 0x6d98f0: str             x16, [SP]
    // 0x6d98f4: r0 = hashCode()
    //     0x6d98f4: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d98f8: r1 = LoadInt32Instr(r0)
    //     0x6d98f8: sbfx            x1, x0, #1, #0x1f
    //     0x6d98fc: tbz             w0, #0, #0x6d9904
    //     0x6d9900: ldur            x1, [x0, #7]
    // 0x6d9904: ldur            x16, [fp, #-0x10]
    // 0x6d9908: r30 = "keyboardAppearance"
    //     0x6d9908: ldr             lr, [PP, #0x6760]  ; [pp+0x6760] "keyboardAppearance"
    // 0x6d990c: stp             lr, x16, [SP, #0x10]
    // 0x6d9910: ldur            x16, [fp, #-0x18]
    // 0x6d9914: stp             x1, x16, [SP]
    // 0x6d9918: r0 = call 0x2004c0
    //     0x6d9918: bl              #0x2004c0
    // 0x6d991c: r16 = "enableIMEPersonalizedLearning"
    //     0x6d991c: ldr             x16, [PP, #0x6768]  ; [pp+0x6768] "enableIMEPersonalizedLearning"
    // 0x6d9920: str             x16, [SP]
    // 0x6d9924: r0 = hashCode()
    //     0x6d9924: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d9928: r1 = LoadInt32Instr(r0)
    //     0x6d9928: sbfx            x1, x0, #1, #0x1f
    //     0x6d992c: tbz             w0, #0, #0x6d9934
    //     0x6d9930: ldur            x1, [x0, #7]
    // 0x6d9934: ldur            x16, [fp, #-0x10]
    // 0x6d9938: r30 = "enableIMEPersonalizedLearning"
    //     0x6d9938: ldr             lr, [PP, #0x6768]  ; [pp+0x6768] "enableIMEPersonalizedLearning"
    // 0x6d993c: stp             lr, x16, [SP, #0x10]
    // 0x6d9940: r16 = true
    //     0x6d9940: add             x16, NULL, #0x20  ; true
    // 0x6d9944: stp             x1, x16, [SP]
    // 0x6d9948: r0 = call 0x2004c0
    //     0x6d9948: bl              #0x2004c0
    // 0x6d994c: r16 = "contentCommitMimeTypes"
    //     0x6d994c: ldr             x16, [PP, #0x6770]  ; [pp+0x6770] "contentCommitMimeTypes"
    // 0x6d9950: str             x16, [SP]
    // 0x6d9954: r0 = hashCode()
    //     0x6d9954: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d9958: r1 = LoadInt32Instr(r0)
    //     0x6d9958: sbfx            x1, x0, #1, #0x1f
    //     0x6d995c: tbz             w0, #0, #0x6d9964
    //     0x6d9960: ldur            x1, [x0, #7]
    // 0x6d9964: ldur            x16, [fp, #-0x10]
    // 0x6d9968: r30 = "contentCommitMimeTypes"
    //     0x6d9968: ldr             lr, [PP, #0x6770]  ; [pp+0x6770] "contentCommitMimeTypes"
    // 0x6d996c: stp             lr, x16, [SP, #0x10]
    // 0x6d9970: r16 = const []
    //     0x6d9970: ldr             x16, [PP, #0x3c48]  ; [pp+0x3c48] List<String>(0)
    // 0x6d9974: stp             x1, x16, [SP]
    // 0x6d9978: r0 = call 0x2004c0
    //     0x6d9978: bl              #0x2004c0
    // 0x6d997c: ldur            x0, [fp, #-8]
    // 0x6d9980: cmp             w0, NULL
    // 0x6d9984: b.eq            #0x6d99b8
    // 0x6d9988: r16 = "autofill"
    //     0x6d9988: ldr             x16, [PP, #0x6778]  ; [pp+0x6778] "autofill"
    // 0x6d998c: str             x16, [SP]
    // 0x6d9990: r0 = hashCode()
    //     0x6d9990: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d9994: r1 = LoadInt32Instr(r0)
    //     0x6d9994: sbfx            x1, x0, #1, #0x1f
    //     0x6d9998: tbz             w0, #0, #0x6d99a0
    //     0x6d999c: ldur            x1, [x0, #7]
    // 0x6d99a0: ldur            x16, [fp, #-0x10]
    // 0x6d99a4: r30 = "autofill"
    //     0x6d99a4: ldr             lr, [PP, #0x6778]  ; [pp+0x6778] "autofill"
    // 0x6d99a8: stp             lr, x16, [SP, #0x10]
    // 0x6d99ac: ldur            x16, [fp, #-8]
    // 0x6d99b0: stp             x1, x16, [SP]
    // 0x6d99b4: r0 = call 0x2004c0
    //     0x6d99b4: bl              #0x2004c0
    // 0x6d99b8: r16 = "enableDeltaModel"
    //     0x6d99b8: ldr             x16, [PP, #0x6780]  ; [pp+0x6780] "enableDeltaModel"
    // 0x6d99bc: str             x16, [SP]
    // 0x6d99c0: r0 = hashCode()
    //     0x6d99c0: bl              #0x724b2c  ; [dart:core] _OneByteString::hashCode
    // 0x6d99c4: r1 = LoadInt32Instr(r0)
    //     0x6d99c4: sbfx            x1, x0, #1, #0x1f
    //     0x6d99c8: tbz             w0, #0, #0x6d99d0
    //     0x6d99cc: ldur            x1, [x0, #7]
    // 0x6d99d0: ldur            x16, [fp, #-0x10]
    // 0x6d99d4: r30 = "enableDeltaModel"
    //     0x6d99d4: ldr             lr, [PP, #0x6780]  ; [pp+0x6780] "enableDeltaModel"
    // 0x6d99d8: stp             lr, x16, [SP, #0x10]
    // 0x6d99dc: r16 = false
    //     0x6d99dc: add             x16, NULL, #0x30  ; false
    // 0x6d99e0: stp             x1, x16, [SP]
    // 0x6d99e4: r0 = call 0x2004c0
    //     0x6d99e4: bl              #0x2004c0
    // 0x6d99e8: ldur            x0, [fp, #-0x10]
    // 0x6d99ec: LeaveFrame
    //     0x6d99ec: mov             SP, fp
    //     0x6d99f0: ldp             fp, lr, [SP], #0x10
    // 0x6d99f4: ret
    //     0x6d99f4: ret             
    // 0x6d99f8: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d99f8: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d99fc: b               #0x6d9628
  }
}

// class id: 1373, size: 0x18, field offset: 0x8
//   const constructor, 
class ica extends Object {

  _Mint field_8;
  bool field_10;
  bool field_14;

  Map<String, dynamic> DDb(ica) {
    // ** addr: 0x6d9a18, size: 0xcc
    // 0x6d9a18: EnterFrame
    //     0x6d9a18: stp             fp, lr, [SP, #-0x10]!
    //     0x6d9a1c: mov             fp, SP
    // 0x6d9a20: AllocStack(0x18)
    //     0x6d9a20: sub             SP, SP, #0x18
    // 0x6d9a24: CheckStackOverflow
    //     0x6d9a24: ldr             x16, [THR, #0x38]  ; THR::stack_limit
    //     0x6d9a28: cmp             SP, x16
    //     0x6d9a2c: b.ls            #0x6d9ac4
    // 0x6d9a30: r1 = Null
    //     0x6d9a30: mov             x1, NULL
    // 0x6d9a34: r2 = 12
    //     0x6d9a34: mov             x2, #0xc
    // 0x6d9a38: r0 = AllocateArray()
    //     0x6d9a38: bl              #0x74cc68  ; AllocateArrayStub
    // 0x6d9a3c: stur            x0, [fp, #-8]
    // 0x6d9a40: r17 = "name"
    //     0x6d9a40: ldr             x17, [PP, #0x66e0]  ; [pp+0x66e0] "name"
    // 0x6d9a44: StoreField: r0->field_f = r17
    //     0x6d9a44: stur            w17, [x0, #0xf]
    // 0x6d9a48: ldr             x16, [fp, #0x10]
    // 0x6d9a4c: str             x16, [SP]
    // 0x6d9a50: r0 = call 0x2adb48
    //     0x6d9a50: bl              #0x2adb48
    // 0x6d9a54: ldur            x1, [fp, #-8]
    // 0x6d9a58: ArrayStore: r1[1] = r0  ; List_4
    //     0x6d9a58: add             x25, x1, #0x13
    //     0x6d9a5c: str             w0, [x25]
    //     0x6d9a60: tbz             w0, #0, #0x6d9a7c
    //     0x6d9a64: ldurb           w16, [x1, #-1]
    //     0x6d9a68: ldurb           w17, [x0, #-1]
    //     0x6d9a6c: and             x16, x17, x16, lsr #2
    //     0x6d9a70: tst             x16, HEAP, lsr #32
    //     0x6d9a74: b.eq            #0x6d9a7c
    //     0x6d9a78: bl              #0x74b27c  ; ArrayWriteBarrierStub
    // 0x6d9a7c: ldur            x0, [fp, #-8]
    // 0x6d9a80: r17 = "signed"
    //     0x6d9a80: ldr             x17, [PP, #0x66e8]  ; [pp+0x66e8] "signed"
    // 0x6d9a84: ArrayStore: r0[0] = r17  ; List_4
    //     0x6d9a84: stur            w17, [x0, #0x17]
    // 0x6d9a88: ldr             x1, [fp, #0x10]
    // 0x6d9a8c: LoadField: r2 = r1->field_f
    //     0x6d9a8c: ldur            w2, [x1, #0xf]
    // 0x6d9a90: DecompressPointer r2
    //     0x6d9a90: add             x2, x2, HEAP, lsl #32
    // 0x6d9a94: StoreField: r0->field_1b = r2
    //     0x6d9a94: stur            w2, [x0, #0x1b]
    // 0x6d9a98: r17 = "decimal"
    //     0x6d9a98: ldr             x17, [PP, #0x66f0]  ; [pp+0x66f0] "decimal"
    // 0x6d9a9c: StoreField: r0->field_1f = r17
    //     0x6d9a9c: stur            w17, [x0, #0x1f]
    // 0x6d9aa0: LoadField: r2 = r1->field_13
    //     0x6d9aa0: ldur            w2, [x1, #0x13]
    // 0x6d9aa4: DecompressPointer r2
    //     0x6d9aa4: add             x2, x2, HEAP, lsl #32
    // 0x6d9aa8: StoreField: r0->field_23 = r2
    //     0x6d9aa8: stur            w2, [x0, #0x23]
    // 0x6d9aac: r16 = <String, dynamic>
    //     0x6d9aac: ldr             x16, [PP, #0xc68]  ; [pp+0xc68] TypeArguments: <String, dynamic>
    // 0x6d9ab0: stp             x0, x16, [SP]
    // 0x6d9ab4: r0 = Map._fromLiteral()
    //     0x6d9ab4: bl              #0x2002cc  ; [dart:core] Map::Map._fromLiteral
    // 0x6d9ab8: LeaveFrame
    //     0x6d9ab8: mov             SP, fp
    //     0x6d9abc: ldp             fp, lr, [SP], #0x10
    // 0x6d9ac0: ret
    //     0x6d9ac0: ret             
    // 0x6d9ac4: r0 = StackOverflowSharedWithoutFPURegs()
    //     0x6d9ac4: bl              #0x74cd64  ; StackOverflowSharedWithoutFPURegsStub
    // 0x6d9ac8: b               #0x6d9a30
  }
}

// class id: 4802, size: 0x14, field offset: 0x14
enum nca extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 4803, size: 0x14, field offset: 0x14
enum lca extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 4804, size: 0x14, field offset: 0x14
enum kca extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 4805, size: 0x14, field offset: 0x14
enum jca extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 4806, size: 0x14, field offset: 0x14
enum hca extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}

// class id: 4807, size: 0x14, field offset: 0x14
enum gca extends _Enum {

  _Mint field_8;
  _OneByteString field_10;
}
