package k.a.a.v;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class a {
    public static final AtomicReference<byte[]> a = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final byte[] c;

        public b(byte[] bArr, int i2, int i3) {
        }
    }

    public static ByteBuffer a(File file) throws IOException {
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
    }

    public static b c(ByteBuffer byteBuffer) {
    }

    public static byte[] d(ByteBuffer byteBuffer) {
    }

    public static void e(ByteBuffer byteBuffer, File file) throws IOException {
    }

    public static InputStream f(ByteBuffer byteBuffer) {
    }

    /* renamed from: k.a.a.v.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C0213a extends InputStream {
        public final ByteBuffer a;
        public int b;

        public C0213a(ByteBuffer byteBuffer) {
        }

        @Override // java.io.InputStream
        public int available() {
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i2) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
        }

        @Override // java.io.InputStream
        public int read() {
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
        }

        @Override // java.io.InputStream
        public long skip(long j2) throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
        }
    }
}
