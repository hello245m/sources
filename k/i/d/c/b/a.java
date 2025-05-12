package k.i.d.c.b;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class a {
    public static final a a = null;

    /* renamed from: k.i.d.c.b.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class C0302a {
        public String a;
        public int b;

        public final String a() {
        }

        public final int b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b {
        void a(Exception exc);

        void b(int i2, Map<String, ? extends List<String>> map) throws Exception;

        void c(Map<String, ? extends List<String>> map, InputStream inputStream, int i2) throws Exception;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c {
        public String a;
        public String b;

        public final String a() {
        }

        public final String b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface d {
        void a(InputStream inputStream, OutputStream outputStream) throws Exception;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class e implements b {
        public final /* synthetic */ ByteArrayOutputStream a;

        public e(ByteArrayOutputStream byteArrayOutputStream) {
        }

        @Override // k.i.d.c.b.a.b
        public void a(Exception exc) {
        }

        @Override // k.i.d.c.b.a.b
        public void b(int i2, Map<String, ? extends List<String>> map) throws Exception {
        }

        @Override // k.i.d.c.b.a.b
        public void c(Map<String, ? extends List<String>> map, InputStream inputStream, int i2) throws Exception {
        }
    }

    public final void a(String str, String str2, List<c> list, List<c> list2, byte[] bArr, InputStream inputStream, int i2, d dVar, C0302a c0302a, b bVar) {
    }

    public final void b(String str, List<c> list, List<c> list2, byte[] bArr, InputStream inputStream, int i2, d dVar, C0302a c0302a, b bVar) {
    }

    public final void c(String str, List<c> list, byte[] bArr, int i2, C0302a c0302a, b bVar) {
    }

    public final byte[] d(String str, List<c> list, byte[] bArr, int i2, C0302a c0302a) {
    }
}
