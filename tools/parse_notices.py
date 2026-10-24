
#!/usr/bin/env python3
"""解析 Flutter 的 NOTICES(.Z)：解压并提取 pub 包名与许可段落。"""
import zlib, sys, re

def main(path):
    raw = open(path, 'rb').read()
    try:
        txt = zlib.decompress(raw, 16 + zlib.MAX_WBITS).decode('utf-8', 'replace')
    except Exception:
        txt = zlib.decompress(raw).decode('utf-8', 'replace')
    parts = re.split(r'-{20,}\n', txt)
    pkgs = []
    for p in parts:
        names = []
        for line in p.splitlines():
            s = line.strip()
            if re.fullmatch(r'[a-z][a-z0-9_]{1,44}', s):
                names.append(s)
            else:
                break
        pkgs.extend(names)
    pkgs = sorted(set(pkgs))
    print(f"license sections: {len(parts)}, packages: {len(pkgs)}")
    print(", ".join(pkgs))
    open(path + '.txt', 'w', encoding='utf-8').write(txt)

if __name__ == '__main__':
    main(sys.argv[1] if len(sys.argv) > 1 else 'NOTICES.Z')
