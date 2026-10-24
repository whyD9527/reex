package i0;

import android.net.nsd.NsdServiceInfo;
import g1.j;
import g1.n;
import h1.a0;
import h1.z;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.k;
import w1.q;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final CharsetDecoder f2961a = b();

    private static final void a(String str, byte[] bArr) {
        if (j(bArr)) {
            return;
        }
        a aVar = a.ILLEGAL_ARGUMENT;
        StringBuilder sb = new StringBuilder();
        sb.append("TXT value is not valid UTF8: ");
        sb.append(str);
        sb.append(": ");
        String arrays = Arrays.toString(bArr);
        k.d(arrays, "toString(this)");
        sb.append(arrays);
        throw new e(aVar, sb.toString());
    }

    private static final CharsetDecoder b() {
        CharsetDecoder createUtf8Decoder = w1.c.f4366b.newDecoder();
        createUtf8Decoder.onMalformedInput(CodingErrorAction.REPORT);
        createUtf8Decoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        k.d(createUtf8Decoder, "createUtf8Decoder");
        return createUtf8Decoder;
    }

    public static final String c(Map<String, ? extends Object> map) {
        Object obj = map != null ? map.get(b.HANDLE.b()) : null;
        return (String) (obj instanceof String ? obj : null);
    }

    public static final String d(Map<String, ? extends Object> map) {
        Object obj = map != null ? map.get(b.SERVICE_HOST.b()) : null;
        return (String) (obj instanceof String ? obj : null);
    }

    public static final NsdServiceInfo e(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        String f2 = f(map);
        String i2 = i(map);
        Integer g2 = g(map);
        String d3 = d(map);
        Map<String, byte[]> h2 = h(map);
        if (f2 == null && i2 == null && d3 == null && g2 == null && h2 == null) {
            return null;
        }
        InetAddress byName = InetAddress.getByName(d3);
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceName(f2);
        nsdServiceInfo.setServiceType(i2);
        if (g2 != null) {
            g2.intValue();
            nsdServiceInfo.setPort(g2.intValue());
        }
        nsdServiceInfo.setHost(byName);
        r(nsdServiceInfo, h2);
        return nsdServiceInfo;
    }

    public static final String f(Map<String, ? extends Object> map) {
        Object obj = map != null ? map.get(b.SERVICE_NAME.b()) : null;
        return (String) (obj instanceof String ? obj : null);
    }

    public static final Integer g(Map<String, ? extends Object> map) {
        Object obj = map != null ? map.get(b.SERVICE_PORT.b()) : null;
        return (Integer) (obj instanceof Integer ? obj : null);
    }

    public static final Map<String, byte[]> h(Map<String, ? extends Object> map) {
        Object obj = map != null ? map.get(b.SERVICE_TXT.b()) : null;
        return (Map) (obj instanceof Map ? obj : null);
    }

    public static final String i(Map<String, ? extends Object> map) {
        Object obj = map != null ? map.get(b.SERVICE_TYPE.b()) : null;
        return (String) (obj instanceof String ? obj : null);
    }

    private static final boolean j(byte[] bArr) {
        try {
            f2961a.decode(ByteBuffer.wrap(bArr));
            return true;
        } catch (CharacterCodingException unused) {
            return false;
        }
    }

    private static final String k(String str) {
        char e02;
        String c02;
        char d02;
        if (str == null) {
            return str;
        }
        if (str.length() > 0) {
            d02 = q.d0(str);
            if (d02 == '.') {
                str = q.b0(str, 1);
            }
        }
        if (!(str.length() > 0)) {
            return str;
        }
        e02 = q.e0(str);
        if (e02 != '.') {
            return str;
        }
        c02 = q.c0(str, 1);
        return c02;
    }

    private static final <T> Map<String, Object> l(b bVar, T t2) {
        Map<String, Object> b3;
        b3 = z.b(n.a(bVar.b(), t2));
        return b3;
    }

    public static final Map<String, Object> m(String str) {
        return l(b.ERROR_CAUSE, str);
    }

    public static final Map<String, Object> n(String str) {
        return l(b.ERROR_MESSAGE, str);
    }

    public static final Map<String, Object> o(String str) {
        return l(b.HANDLE, str);
    }

    public static final Map<String, Object> p(NsdServiceInfo nsdServiceInfo) {
        Map<String, Object> f2;
        k.e(nsdServiceInfo, "nsdServiceInfo");
        j[] jVarArr = new j[5];
        jVarArr[0] = n.a(b.SERVICE_NAME.b(), nsdServiceInfo.getServiceName());
        jVarArr[1] = n.a(b.SERVICE_TYPE.b(), k(nsdServiceInfo.getServiceType()));
        String b3 = b.SERVICE_HOST.b();
        InetAddress host = nsdServiceInfo.getHost();
        jVarArr[2] = n.a(b3, host != null ? host.getCanonicalHostName() : null);
        jVarArr[3] = n.a(b.SERVICE_PORT.b(), nsdServiceInfo.getPort() != 0 ? Integer.valueOf(nsdServiceInfo.getPort()) : null);
        jVarArr[4] = n.a(b.SERVICE_TXT.b(), nsdServiceInfo.getAttributes());
        f2 = a0.f(jVarArr);
        return f2;
    }

    public static final Map<String, Object> q(String str) {
        return l(b.SERVICE_NAME, str);
    }

    public static final void r(NsdServiceInfo nsdServiceInfo, Map<String, byte[]> map) {
        k.e(nsdServiceInfo, "<this>");
        if (map != null) {
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                String key = entry.getKey();
                byte[] value = entry.getValue();
                if (value == null) {
                    nsdServiceInfo.setAttribute(key, null);
                } else {
                    a(key, value);
                    nsdServiceInfo.setAttribute(key, new String(value, w1.c.f4366b));
                }
            }
        }
    }
}
