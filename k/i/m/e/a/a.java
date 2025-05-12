package k.i.m.e.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.zip.CRC32;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.ZipEntry;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class a extends DeflaterOutputStream {

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f8337p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f8338q = null;
    public byte[] a;
    public final HashSet<String> b;
    public int c;
    public int d;
    public ByteArrayOutputStream e;
    public ZipEntry f;
    public final CRC32 g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public int f8339i;

    /* renamed from: j, reason: collision with root package name */
    public int f8340j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f8341k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8342l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8343m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8344n;

    /* renamed from: o, reason: collision with root package name */
    public int f8345o;

    public a(OutputStream outputStream) {
    }

    public final void a(int i2, int i3, int i4) {
    }

    public final void b() throws IOException {
    }

    public void c() throws IOException {
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public final int d(ZipEntry zipEntry, int i2) {
    }

    public final void e(OutputStream outputStream, int i2) throws IOException {
    }

    @Override // java.util.zip.DeflaterOutputStream
    public void finish() throws IOException {
    }

    public void g(ZipEntry zipEntry) throws IOException {
    }

    public final long h(OutputStream outputStream, long j2) throws IOException {
    }

    public final int i(OutputStream outputStream, int i2) throws IOException {
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i2) throws IOException {
    }

    public a(OutputStream outputStream, int i2) {
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
    }
}
