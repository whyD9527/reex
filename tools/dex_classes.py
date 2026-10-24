
#!/usr/bin/env python3
"""最小 DEX 解析器：列出全部类定义及包分布（无需 jadx）。"""
import struct, sys, json, collections

def u32(d, o): return struct.unpack_from('<I', d, o)[0]

def main(path):
    d = open(path, 'rb').read()
    assert d[:4] == b'dex'
    n_str, off_str, n_type, off_type = struct.unpack_from('<IIII', d, 56)
    n_class, off_class = struct.unpack_from('<II', d, 96)

    def get_string(i):
        o = u32(d, off_str + 4 * i)
        while d[o] & 0x80:
            o += 1
        o += 1
        return d[o:d.index(b'\x00', o)].decode('utf-8', 'replace')

    def get_type(i): return get_string(u32(d, off_type + 4 * i))

    classes = []
    for i in range(n_class):
        o = off_class + 32 * i
        cls = get_type(u32(d, o))
        sup = u32(d, o + 8)
        sup = get_type(sup) if sup != 0xffffffff else ''
        src = u32(d, o + 16)
        src = get_string(src) if src != 0xffffffff else ''
        classes.append((cls, sup, src))

    print(f"classes: {len(classes)}")
    pkgs = collections.Counter(c.rsplit('/', 1)[0].replace('/', '.') for c, _, _ in classes)
    for k, v in pkgs.most_common(30):
        print(f"{v:5d}  {k}")
    if len(sys.argv) > 2:
        json.dump(classes, open(sys.argv[2], 'w', encoding='utf-8'), ensure_ascii=False, indent=0)
        print("written", sys.argv[2])

if __name__ == '__main__':
    main(sys.argv[1] if len(sys.argv) > 1 else 'classes.dex')
