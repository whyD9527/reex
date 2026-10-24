
#!/usr/bin/env python3
"""生成原生库依赖图（Mermaid + JSON）。"""
import os, sys, struct, json

TICK = chr(96) * 3

def needed(path):
    d = open(path, 'rb').read()
    e_shoff, = struct.unpack_from('<Q', d, 0x28)
    e_shentsize, e_shnum, e_shstrndx = struct.unpack_from('<HHH', d, 0x3a)
    secs = []
    for i in range(e_shnum):
        o = e_shoff + i * e_shentsize
        name, typ, flags, addr, off, size, link, info, align, entsize = struct.unpack_from('<IIQQQQIIQQ', d, o)
        secs.append(dict(type=typ, addr=addr, off=off, size=size))
    dyn = next((s for s in secs if s['type'] == 6), None)
    if not dyn:
        return []
    entries = [struct.unpack_from('<QQ', d, dyn['off'] + i * 16) for i in range(dyn['size'] // 16)]
    strtab_addr = next((v for t, v in entries if t == 5), None)
    stroff = next((s['off'] for s in secs if s['addr'] == strtab_addr), None)
    out = []
    for t, v in entries:
        if t == 1 and stroff:
            out.append(d[stroff + v: d.index(b'\x00', stroff + v)].decode())
    return sorted(out)

def main(libdir, out):
    libs = sorted(f for f in os.listdir(libdir) if f.endswith('.so'))
    edges = {l: needed(os.path.join(libdir, l)) for l in libs}
    json.dump(edges, open(out + '.json', 'w'), indent=1)
    with open(out, 'w', encoding='utf-8') as f:
        f.write(TICK + 'mermaid\n')
        f.write('graph TD\n')
        for l, deps in edges.items():
            for d in deps:
                if d in libs:
                    f.write('  ' + l.replace('.so', '') + ' --> ' + d.replace('.so', '') + '\n')
        f.write(TICK + '\n')
    for k, v in edges.items():
        print(k + ': ' + ', '.join(v))

if __name__ == '__main__':
    main(sys.argv[1] if len(sys.argv) > 1 else 'lib/arm64-v8a', sys.argv[2] if len(sys.argv) > 2 else 'native/graph.md')