#!/usr/bin/env python3
"""ARM64 ELF 函数级反汇编 + 交叉引用分析（自写库逆向用）。

用法:
    python disasm_arm64.py libmmr.so                      # 打印全部函数
    python disasm_arm64.py libmmr.so --func media_metadata_retriever_create
    python disasm_arm64.py libmpvclient.so --json out.json

能力:
  * 解析 .dynsym / .rela.plt / .rela.dyn，恢复 PLT 与 GOT 的符号名
  * 线性反汇编 .text，按符号/调用目标/函数序言切分函数
  * 解析 adrp+add / adrp+ldr 得到数据地址：字符串、GOT 槽（导入函数）、.data.rel.ro
  * 输出每个函数的调用列表、引用字符串、疑似结构体偏移
"""
import argparse, json, struct, sys, os

from elftools.elf.elffile import ELFFile
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM, CS_OP_IMM, CS_OP_REG, CS_OP_MEM
from capstone.arm64 import ARM64_OP_IMM, ARM64_OP_REG, ARM64_OP_MEM, ARM64_REG_X29, ARM64_REG_SP


def uleb(data, off):
    n = 0; shift = 0
    while True:
        b = data[off]; off += 1
        n |= (b & 0x7f) << shift
        if not (b & 0x80):
            return n, off
        shift += 7


class Image:
    def __init__(self, path):
        self.path = path
        self.data = open(path, 'rb').read()
        self.elf = ELFFile(open(path, 'rb'))
        self.sections = []
        for s in self.elf.iter_sections():
            if s.name and s.name != '.shstrtab':
                self.sections.append(dict(name=s.name, addr=s['sh_addr'], size=s['sh_size'],
                                          off=s['sh_offset'], flags=s['sh_flags']))
        self.text = self._sec('.text')
        self.symtab = self._symbols()
        self.plt = self._plt()
        self.got = self._got()
        self.strings = self._strings()

    def _sec(self, name):
        for s in self.sections:
            if s['name'] == name:
                return s
        return None

    def va_to_off(self, va):
        for s in self.sections:
            if s['flags'] & 0x4 and s['addr'] <= va < s['addr'] + s['size']:
                return s['off'] + (va - s['addr'])
        return None

    def read_va(self, va, n):
        off = self.va_to_off(va)
        return self.data[off:off + n] if off is not None else b''

    def cstr(self, va, maxlen=200):
        off = self.va_to_off(va)
        if off is None:
            return None
        end = self.data.find(b'\x00', off, off + maxlen)
        if end < 0:
            return None
        raw = self.data[off:end]
        if not raw or any(b < 0x20 or b > 0x7e for b in raw):
            return None
        return raw.decode('ascii')

    def _symbols(self):
        syms = {}
        dyn = self.elf.get_section_by_name('.dynsym')
        for s in dyn.iter_symbols():
            if not s.name:
                continue
            syms.setdefault(s['st_value'], []).append(dict(name=s.name,
                                                           type=s['st_info']['type'],
                                                           size=s['st_size']))
        self.dynsym_names = {s.name: s for s in dyn.iter_symbols() if s.name}
        return syms

    def _relocs(self, secname):
        out = []
        sec = self.elf.get_section_by_name(secname)
        if sec is None:
            return out
        for r in sec.iter_relocations():
            out.append(dict(off=r['r_offset'], type=r['r_info_type'],
                            sym=r['r_info_sym'], addend=r['r_addend'] if r.is_RELA() else 0))
        return out

    def _plt(self):
        """PLT 条目 -> 导入符号名。AArch64 PLT 每项 16 字节，顺序与 .rela.plt 一致。"""
        plt = self._sec('.plt')
        gotplt = self._sec('.got.plt')
        out = {}
        if not plt:
            return out
        rel = self._relocs('.rela.plt')
        # 前 2 项为 PLT0 保留
        base = plt['addr']
        entries = (plt['size'] // 16) - 2 if plt['size'] >= 32 else 0
        for i, r in enumerate(rel):
            if i >= entries:
                break
            sym = self.elf.get_section_by_name('.dynsym').get_symbol(r['sym'])
            out[base + 16 * (i + 2)] = sym.name
        return out

    def _got(self):
        out = {}
        for name in ('.rela.dyn', '.rela.plt'):
            for r in self._relocs(name):
                if r['type'] in (1025,):  # R_AARCH64_GLOB_DAT
                    pass
                if r['sym']:
                    sym = self.elf.get_section_by_name('.dynsym').get_symbol(r['sym'])
                    if sym.name:
                        out[r['off']] = sym.name
        return out

    def _strings(self):
        out = {}
        for s in self.sections:
            if s['name'] not in ('.rodata', '.dynstr', '.data.rel.ro', '.data'):
                continue
            i = s['off']
            end = s['off'] + s['size']
            while i < end:
                j = self.data.find(b'\x00', i, end)
                if j < 0:
                    break
                raw = self.data[i:j]
                if 2 <= len(raw) <= 200 and all(0x20 <= b <= 0x7e for b in raw):
                    out[s['addr'] + (i - s['off'])] = raw.decode('ascii')
                i = j + 1
        return out


def disasm_func(img, start, end, md):
    """反汇编 [start, end)，返回指令列表与注解。"""
    code = img.read_va(start, end - start)
    insns = []
    pages = {}
    for insn in md.disasm(code, start):
        if insn.address >= end:
            break
        note = None
        mnem = insn.mnemonic
        ops = insn.operands
        # adrp xN, page
        if mnem == 'adrp' and len(ops) == 2 and ops[0].type == ARM64_OP_REG and ops[1].type == ARM64_OP_IMM:
            pages[insn.reg_name(ops[0].reg)] = ops[1].imm
            note = img.cstr(ops[1].imm) or None
        # add xN, xM, #imm  (page + off)
        elif mnem in ('add', 'ldr', 'ldrb', 'ldrh', 'ldrsw', 'str', 'ldur', 'ldp') and ops:
            if ops[0].type == ARM64_OP_REG:
                pass
            # 内存引用: [xM, #imm]
            try:
                memop = None
                if mnem == 'add' and len(ops) == 3 and ops[2].type == ARM64_OP_IMM:
                    base = insn.reg_name(ops[1].reg) if ops[1].type == ARM64_OP_REG else None
                    if base in pages:
                        addr = (pages[base] + ops[2].imm) & 0xffffffffffffffff
                        s = img.cstr(addr)
                        note = ('-> 0x%x %r' % (addr, s)) if s else ('-> 0x%x' % addr)
                for op in ops:
                    if op.type == ARM64_OP_MEM:
                        memop = op
                        break
                if memop is not None:
                    base = insn.reg_name(memop.mem.base) if memop.mem.base else None
                    if base in pages:
                        addr = (pages[base] + memop.mem.disp) & 0xffffffffffffffff
                        s = img.cstr(addr)
                        if s:
                            note = ('-> 0x%x %r' % (addr, s))
                        elif addr in img.got:
                            note = ('-> GOT %s' % img.got[addr])
                        elif addr in img.strings:
                            note = ('-> 0x%x %r' % (addr, img.strings[addr]))
                        else:
                            note = ('-> 0x%x' % addr)
            except Exception:
                pass
        elif mnem in ('bl', 'b') and ops and ops[0].type == ARM64_OP_IMM:
            tgt = ops[0].imm
            name = None
            if tgt in img.plt:
                name = img.plt[tgt]
            elif tgt in img.symtab:
                name = img.symtab[tgt][0]['name']
            note = ('=> %s' % (name or ('sub_%x' % tgt)))
        insns.append(dict(addr=insn.address, bytes=insn.bytes.hex(), text=insn.mnemonic + ' ' + insn.op_str,
                          note=note))
    return insns


def find_functions(img, md):
    """函数边界：导出符号 + bl 目标 + 序言扫描。"""
    text = img.text
    starts = set()
    if not text:
        return []
    # 符号
    for va, syms in img.symtab.items():
        if text['addr'] <= va < text['addr'] + text['size']:
            for s in syms:
                if s['type'] in ('STT_FUNC', 'STT_GNU_IFUNC') or s['size'] > 0:
                    starts.add(va)
    # 线性扫一遍找 bl 目标与序言
    code = img.read_va(text['addr'], text['size'])
    for insn in md.disasm(code, text['addr']):
        if insn.mnemonic in ('bl', 'b') and insn.operands and insn.operands[0].type == ARM64_OP_IMM:
            t = insn.operands[0].imm
            if text['addr'] <= t < text['addr'] + text['size']:
                starts.add(t)
        if insn.mnemonic in ('stp', 'sub', 'pacibsp', 'bti'):
            pass
    # 常见序言: stp x29, x30, [sp, #-N]!
    for insn in md.disasm(code, text['addr']):
        if insn.mnemonic == 'stp' and 'x29, x30, [sp, #-' in insn.op_str:
            starts.add(insn.address)
        if insn.mnemonic == 'pacibsp':
            starts.add(insn.address)
    starts = sorted(starts)
    # 合并相邻（间隔 < 4 视为同一函数起点）
    merged = []
    for a in starts:
        if merged and a - merged[-1] < 8:
            continue
        merged.append(a)
    return merged


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('elf')
    ap.add_argument('--func')
    ap.add_argument('--json')
    ap.add_argument('--max-insn', type=int, default=4000)
    args = ap.parse_args()

    img = Image(args.elf)
    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    md.detail = True
    starts = find_functions(img, md)
    text_end = img.text['addr'] + img.text['size']
    funcs = []
    for i, s in enumerate(starts):
        e = starts[i + 1] if i + 1 < len(starts) else text_end
        insns = disasm_func(img, s, e, md)
        name = None
        if s in img.symtab:
            for sym in img.symtab[s]:
                if sym['type'] in ('STT_FUNC', 'STT_GNU_IFUNC'):
                    name = sym['name']
                    break
        funcs.append(dict(addr=s, end=e, name=name or ('sub_%x' % s), insns=insns))

    if args.json:
        json.dump(funcs, open(args.json, 'w'), indent=1)
        print('wrote', args.json, 'functions:', len(funcs))

    for f in funcs:
        if args.func and args.func not in f['name']:
            continue
        print('=' * 78)
        print(f"/* {f['name']}  0x{f['addr']:x} - 0x{f['end']:x}  ({f['end']-f['addr']} bytes) */")
        for ins in f['insns'][:args.max_insn]:
            note = ('  ; ' + ins['note']) if ins['note'] else ''
            print(f"  0x{ins['addr']:06x}  {ins['text']:<44s}{note}")
        print()


if __name__ == '__main__':
    main()
