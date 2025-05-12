package k.d.a.a.m4;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k.d.a.a.j4.t1;
import k.d.a.a.m4.v;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public interface i0 {

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a {
        public final byte[] a;
        public final String b;

        public a(byte[] bArr, String str, int i2) {
        }

        public byte[] a() {
        }

        public String b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        void a(i0 i0Var, byte[] bArr, int i2, int i3, byte[] bArr2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        i0 a(UUID uuid);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d {
        public final byte[] a;
        public final String b;

        public d(byte[] bArr, String str) {
        }

        public byte[] a() {
        }

        public String b() {
        }
    }

    Map<String, String> a(byte[] bArr);

    void b(byte[] bArr, t1 t1Var);

    d c();

    k.d.a.a.l4.b d(byte[] bArr) throws MediaCryptoException;

    byte[] e() throws MediaDrmException;

    boolean f(byte[] bArr, String str);

    void g(byte[] bArr, byte[] bArr2);

    void h(byte[] bArr);

    void i(b bVar);

    byte[] j(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void k(byte[] bArr) throws DeniedByServerException;

    a l(byte[] bArr, List<v.b> list, int i2, HashMap<String, String> hashMap) throws NotProvisionedException;

    int m();

    void release();
}
