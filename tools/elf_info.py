
#!/usr/bin/env python3
"""ELF(arm64) 元数据：SONAME / DT_NEEDED / .comment / 版本字符串 / AOT 快照符号。"""
import struct, sys, os, re

def parse(path):
    d = open(path, 'rb').read()
    assert d[:4] == b'\x7fELF'
    e_shoff, = struct.unpack_from('<Q', d, 0x28)
    e_shentsize, e_shnum, e_shstrndx = struct.unpack_from('<HHH', d, 0x3a)
    secs = []
    for i in range(e_shnum):
        o = e_shoff + i * e_shentsize
        name, typ, flags, addr, off, size, link, info, align, entsize = struct.unpack_from('<IIQQQQIIQQ', d, o)
        secs.append(dict(name_off=name, type=typ, addr=addr, off=off, size=size, link=link))
    shstr = secs[e_shstrndx]
    def sname(o):
        return d[shstr['off'] + o: d.index(b'\x00', shstr['off'] + o)].decode('latin-1')
    for s in secs:
        s['name'] = sname(s['name_off'])

    soname, needed, comment, syms = None, [], None, []
    dyn = next((s for s in secs if s['type'] == 6), None)
    if dyn:
        entries = [struct.unpack_from('<QQ', d, dyn['off'] + i * 16) for i in range(dyn['size'] // 16)]
        strtab_addr = next((v for t, v in entries if t == 5), None)
        stroff = next((s['off'] for s in secs if s['addr'] == strtab_addr), None)
        if stroff:
            for t, v in entries:
                if t == 14:
                    soname = d[stroff + v: d.index(b'\x00', stroff + v)].decode()
                if t == 1:
                    needed.append(d[stroff + v: d.index(b'\x00', stroff + v)].decode())
    for s in secs:
        if s['name'].startswith('.comment'):
            comment = d[s['off']:s['off'] + s['size']].replace(b'\x00', b' ').decode('latin-1').strip()
        if s['type'] == 11:
            strsec = secs[s['link']]
            for j in range(s['size'] // 24):
                nm, info, other, shndx, value, size = struct.unpack_from('<IBBHQQ', d, s['off'] + j * 24)
                if nm:
                    name = d[strsec['off'] + nm: d.index(b'\x00', strsec['off'] + nm)].decode()
                    syms.append((name, value, size))
    return d, soname, needed, comment, syms

def main(libdir):
    for f in sorted(os.listdir(libdir)):
        p = os.path.join(libdir, f)
        if not f.endswith('.so'):
            continue
        d, soname, needed, comment, syms = parse(p)
        print(f"== {f} ({len(d)} bytes)")
        print(f"   soname: {soname}")
        print(f"   needed: {needed}")
        print(f"   comment: {(comment or '')[:120]}")
        if syms:
            print(f"   exported: {[s[0] for s in syms][:20]}")
        ver = sorted(set(m.decode('latin-1') for m in re.findall(rb'FFmpeg version [^\x00\n]{0,40}', d)))
        if ver:
            print(f"   ffmpeg: {ver}")

if __name__ == '__main__':
    main(sys.argv[1] if len(sys.argv) > 1 else 'lib/arm64-v8a')
