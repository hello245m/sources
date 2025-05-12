package k.i.m.e.a;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.zip.ZipException;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class i implements Closeable {
    public final String a;
    public final LinkedHashMap<String, h> b;
    public File c;
    public RandomAccessFile d;
    public String e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements Enumeration<h> {
        public final /* synthetic */ Iterator a;
        public final /* synthetic */ i b;

        public a(i iVar, Iterator it) {
        }

        public h a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
        }

        @Override // java.util.Enumeration
        public /* bridge */ /* synthetic */ h nextElement() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static class b extends InputStream {
        public final RandomAccessFile a;
        public long b;
        public long c;

        public b(RandomAccessFile randomAccessFile, long j2, long j3) {
        }

        public static /* synthetic */ long a(b bVar, long j2) {
        }

        public static /* synthetic */ long b(b bVar) {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }

        @Override // java.io.InputStream
        public long skip(long j2) throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
        }

        public b(RandomAccessFile randomAccessFile, long j2) throws IOException {
        }
    }

    public i(File file) throws ZipException, IOException {
    }

    public static /* synthetic */ void a(i iVar) {
    }

    public static void i(String str, long j2, String str2, long j3, String str3, int i2) throws ZipException {
    }

    public final void b() {
    }

    public Enumeration<? extends h> c() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public String d() {
    }

    public h e(String str) {
    }

    public InputStream g(h hVar) throws IOException {
    }

    public final void h() throws IOException {
    }

    public i(String str) throws IOException {
    }

    public i(File file, int i2) throws IOException {
    }
}
