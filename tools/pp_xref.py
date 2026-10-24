#!/usr/bin/env python3
"""pp_xref.py — 扫描 Dart AOT 机器码中的对象池（PP）引用，建立"代码 → 对象池条目"的映射。

Dart AOT (arm64, compressed pointers) 约定：
    x27 = PP  (object pool)
    x28 = 堆基址（压缩指针解码用）
    x15 = Dart 栈指针影子（prologue: stp x29, x30, [x15, #-N]!）

用法:
    python pp_xref.py libapp.so pp.txt asm_dir --out callgraph.json
    python pp_xref.py ... --filter strings.txt

输出:
    JSON: { "pp_offset": {"desc": ..., "refs": [{"func":..,"class":..,"name":..,"insn":..}] } }
"""
import argparse, json, os, re, bisect, sys

from elftools.elf.elffile import ELFFile
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM

PP_REG = 'x27'
STACK_SHADOW = 'x15'


def load_pool(pp_path):
    """解析 blutter 的 pp.txt：[pp+0xOFF] desc -> {off: desc}"""
    pool = {}
    pat = re.compile(r'\[pp\+0x([0-9a-f]+)\] (.*)')
    with open(pp_path, encoding='utf-8', errors='replace') as f:
        for line in f:
            m = pat.match(line)
            if m:
                pool[int(m.group(1), 16)] = m.group(2).rstrip('\n')
    return pool


def load_asm_index(asm_dir):
    """从 blutter 的 asm/*.dart 建立 addr -> (class, signature)"""
    index = {}
    addr_re = re.compile(r'// \*\* addr: 0x([0-9a-f]+)')
    class_re = re.compile(r'^class\s+([A-Za-z0-9_$]+)')
    for root, _dirs, files in os.walk(asm_dir):
        for fn in files:
            if not fn.endswith('.dart'):
                continue
            path = os.path.join(root, fn)
            cls = None
            last_line = ''
            for line in open(path, encoding='utf-8', errors='replace'):
                cm = class_re.match(line)
                if cm:
                    cls = cm.group(1)
                m = addr_re.search(line)
                if m:
                    index[int(m.group(1), 16)] = (cls, last_line.strip()[:120], fn)
                if line.strip():
                    last_line = line
    return index


def isolate_code_start(elf):
    """用 _kDartIsolateSnapshotInstructions 符号定位应用代码区（跳过段头）。"""
    text = elf.get_section_by_name('.text')
    base = text['sh_addr']
    data = text.data()
    sym_addr, sym_size = None, None
    dyn = elf.get_section_by_name('.dynsym')
    for s in dyn.iter_symbols():
        if s.name == '_kDartIsolateSnapshotInstructions':
            sym_addr, sym_size = s['st_value'], s['st_size']
            break
    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    start = sym_addr or base
    off = start - base
    for probe in range(off, min(off + 0x400, len(data)), 4):
        insns = list(md.disasm(data[probe:probe + 4], base + probe))
        if insns and insns[0].mnemonic == 'stp' and insns[0].op_str.startswith('x29, x30, [x15'):
            return data, base, base + probe, sym_size
    return data, base, base + off, sym_size


def sweep(md, data, base, start, end, on_insn):
    """带重同步的线性扫描：遇到非法指令跳过 4 字节继续。"""
    chunk = 1 << 16
    off = start - base
    end_off = min(len(data), end - base)
    n = 0
    while off < end_off:
        progressed = False
        for i in md.disasm(data[off:min(off + chunk, end_off)], base + off):
            on_insn(i)
            off = (i.address - base) + i.size
            n += 1
            progressed = True
        if not progressed:
            off += 4
        elif off < end_off and off % 4:
            off += 4 - (off % 4)
    return n


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('libapp')
    ap.add_argument('pp')
    ap.add_argument('asmdir')
    ap.add_argument('--out', default='callgraph.json')
    ap.add_argument('--filter', help='只输出描述中含这些子串的条目（每行一个）')
    args = ap.parse_args()

    pool = load_pool(args.pp)
    asm_index = load_asm_index(args.asmdir)
    print(f'pool entries: {len(pool)}, asm anchors: {len(asm_index)}', file=sys.stderr)

    elf = ELFFile(open(args.libapp, 'rb'))
    data, base, code_start, code_size = isolate_code_start(elf)
    text = elf.get_section_by_name('.text')
    code_end = base + len(data) if code_size is None else code_start + code_size
    print(f'code region 0x{code_start:x}..0x{code_end:x}', file=sys.stderr)

    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    md.detail = True

    refs = []
    pages = {}
    state = {'func': None}

    def on_insn(i):
        if i.mnemonic == 'stp' and (i.op_str.startswith('x29, x30, [x15')
                                    or i.op_str.startswith('x29, x30, [sp')):
            state['func'] = i.address
            pages.clear()
        if i.mnemonic == 'add' and len(i.operands) >= 3:
            o = i.operands
            if o[1].type == 1 and i.reg_name(o[1].reg) == PP_REG and o[2].type == 2 \
                    and 'lsl #12' in i.op_str:
                pages[i.reg_name(o[0].reg)] = o[2].imm << 12
        for o in i.operands:
            if o.type != 3:
                continue
            b = i.reg_name(o.mem.base) if o.mem.base else None
            off = None
            if b == PP_REG:
                off = o.mem.disp
            elif b in pages:
                off = pages[b] + o.mem.disp
            if off is not None and off in pool:
                refs.append(dict(func=state['func'], insn=i.address, off=off,
                                 desc=pool[off]))

    n_insn = sweep(md, data, base, code_start, code_end, on_insn)
    print(f'instructions: {n_insn}, refs resolved: {len(refs)}', file=sys.stderr)

    # 聚合
    out = {}
    for r in refs:
        e = out.setdefault(hex(r['off']), {'desc': r['desc'], 'refs': []})
        if len(e['refs']) < 32:
            anchor = asm_index.get(r['func']) if r['func'] else None
            e['refs'].append(dict(func=hex(r['func']) if r['func'] else None,
                                  insn=hex(r['insn']),
                                  cls=anchor[0] if anchor else None,
                                  sig=anchor[1] if anchor else None,
                                  file=anchor[2] if anchor else None))
    json.dump(out, open(args.out, 'w', encoding='utf-8'), ensure_ascii=False, indent=1)
    print(f'wrote {args.out}: {len(out)} pool entries referenced', file=sys.stderr)

    if args.filter:
        pats = [l.strip() for l in open(args.filter, encoding='utf-8') if l.strip()]
        for k, v in out.items():
            if any(p in v['desc'] for p in pats):
                cls = v['refs'][0].get('cls') if v['refs'] else None
                print(f"{k:>10s}  {v['desc'][:80]}  refs={len(v['refs'])}  cls={cls}")


if __name__ == '__main__':
    main()