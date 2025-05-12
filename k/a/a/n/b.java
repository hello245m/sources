package k.a.a.n;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class b implements Closeable {
    public final InputStream a;
    public final Charset b;
    public byte[] c;
    public int d;
    public int e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends ByteArrayOutputStream {
        public final /* synthetic */ b a;

        public a(b bVar, int i2) {
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
        }
    }

    public b(InputStream inputStream, Charset charset) {
    }

    public static /* synthetic */ Charset a(b bVar) {
    }

    public final void b() throws IOException {
    }

    public boolean c() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public String d() throws IOException {
    }

    public b(InputStream inputStream, int i2, Charset charset) {
    }
}
