
#!/usr/bin/env python3
"""APK 清单/结构分析：条目分类、大小统计、DEX 头、ELF 版本。"""
import zipfile, sys, collections, struct, os, re

def main(apk):
    z = zipfile.ZipFile(apk)
    infos = z.infolist()
    print(f"APK: {apk}")
    print(f"size: {os.path.getsize(apk):,} bytes, entries: {len(infos)}")
    tot = collections.Counter()
    for i in infos:
        tot[i.filename.split('/')[0]] += i.file_size
    print("\n== top-level size ==")
    for k, v in tot.most_common():
        print(f"{k:30s} {v/1024:10.1f} KB")
    print("\n== libs ==")
    for i in infos:
        if i.filename.startswith('lib/'):
            print(f"{i.filename:60s} {i.file_size:10d}")
    print("\n== dex ==")
    for i in infos:
        if i.filename.endswith('.dex'):
            data = z.read(i.filename)
            n_str, n_type, n_proto, n_field, n_method, n_class = struct.unpack_from('<IIIIII', data, 56)
            print(f"{i.filename}: {i.file_size} bytes, strings={n_str}, types={n_type}, "
                  f"protos={n_proto}, fields={n_field}, methods={n_method}, classes={n_class}")

if __name__ == '__main__':
    main(sys.argv[1] if len(sys.argv) > 1 else 'app.apk')
