package k.a.a.p.r.d;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class m implements ImageHeaderParser {
    public static final byte[] a = null;
    public static final int[] b = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class a implements c {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
        }

        @Override // k.a.a.p.r.d.m.c
        public int a() throws c.a {
        }

        @Override // k.a.a.p.r.d.m.c
        public int b(byte[] bArr, int i2) {
        }

        @Override // k.a.a.p.r.d.m.c
        public short c() throws c.a {
        }

        @Override // k.a.a.p.r.d.m.c
        public long skip(long j2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b {
        public final ByteBuffer a;

        public b(byte[] bArr, int i2) {
        }

        public short a(int i2) {
        }

        public int b(int i2) {
        }

        public final boolean c(int i2, int i3) {
        }

        public int d() {
        }

        public void e(ByteOrder byteOrder) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public static final class a extends IOException {
        }

        int a() throws IOException;

        int b(byte[] bArr, int i2) throws IOException;

        short c() throws IOException;

        long skip(long j2) throws IOException;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d implements c {
        public final InputStream a;

        public d(InputStream inputStream) {
        }

        @Override // k.a.a.p.r.d.m.c
        public int a() throws IOException {
        }

        @Override // k.a.a.p.r.d.m.c
        public int b(byte[] bArr, int i2) throws IOException {
        }

        @Override // k.a.a.p.r.d.m.c
        public short c() throws IOException {
        }

        @Override // k.a.a.p.r.d.m.c
        public long skip(long j2) throws IOException {
        }
    }

    public static int d(int i2, int i3) {
    }

    public static boolean g(int i2) {
    }

    public static int j(b bVar) {
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(InputStream inputStream) throws IOException {
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) throws IOException {
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int c(InputStream inputStream, k.a.a.p.p.a0.b bVar) throws IOException {
    }

    public final int e(c cVar, k.a.a.p.p.a0.b bVar) throws IOException {
    }

    public final ImageHeaderParser.ImageType f(c cVar) throws IOException {
    }

    public final boolean h(byte[] bArr, int i2) {
    }

    public final int i(c cVar) throws IOException {
    }

    public final int k(c cVar, byte[] bArr, int i2) throws IOException {
    }
}
