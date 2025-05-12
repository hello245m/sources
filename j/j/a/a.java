package j.j.a;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class a {
    public static final byte[] A = null;
    public static final byte[] B = null;
    public static final byte[] C = null;
    public static final byte[] D = null;
    public static final byte[] E = null;
    public static final byte[] F = null;
    public static final byte[] G = null;
    public static final byte[] H = null;
    public static final byte[] I = null;
    public static final byte[] J = null;
    public static final byte[] K = null;
    public static final byte[] L = null;
    public static final byte[] M = null;
    public static final byte[] N = null;
    public static final byte[] O = null;
    public static final byte[] P = null;
    public static final byte[] Q = null;
    public static SimpleDateFormat R;
    public static SimpleDateFormat S;
    public static final String[] T = null;
    public static final int[] U = null;
    public static final byte[] V = null;
    public static final e[] W = null;
    public static final e[] X = null;
    public static final e[] Y = null;
    public static final e[] Z = null;
    public static final e[] a0 = null;
    public static final e b0 = null;
    public static final e[] c0 = null;
    public static final e[] d0 = null;
    public static final e[] e0 = null;
    public static final e[] f0 = null;
    public static final e[][] g0 = null;
    public static final e[] h0 = null;
    public static final e i0 = null;
    public static final e j0 = null;
    public static final HashMap<Integer, e>[] k0 = null;
    public static final HashMap<String, e>[] l0 = null;
    public static final HashSet<String> m0 = null;
    public static final HashMap<Integer, Integer> n0 = null;
    public static final Charset o0 = null;
    public static final byte[] p0 = null;
    public static final byte[] q0 = null;
    public static final Pattern r0 = null;
    public static final Pattern s0 = null;

    /* renamed from: t, reason: collision with root package name */
    public static final boolean f3338t = false;
    public static final Pattern t0 = null;
    public static final List<Integer> u = null;
    public static final List<Integer> v = null;
    public static final int[] w = null;
    public static final int[] x = null;
    public static final byte[] y = null;
    public static final byte[] z = null;
    public String a;
    public FileDescriptor b;
    public AssetManager.AssetInputStream c;
    public int d;
    public boolean e;
    public final HashMap<String, d>[] f;
    public Set<Integer> g;
    public ByteOrder h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3339i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3340j;

    /* renamed from: k, reason: collision with root package name */
    public int f3341k;

    /* renamed from: l, reason: collision with root package name */
    public int f3342l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f3343m;

    /* renamed from: n, reason: collision with root package name */
    public int f3344n;

    /* renamed from: o, reason: collision with root package name */
    public int f3345o;

    /* renamed from: p, reason: collision with root package name */
    public int f3346p;

    /* renamed from: q, reason: collision with root package name */
    public int f3347q;

    /* renamed from: r, reason: collision with root package name */
    public int f3348r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3349s;

    /* renamed from: j.j.a.a$a, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0154a extends MediaDataSource {
        public long a;
        public final /* synthetic */ b b;

        public C0154a(a aVar, b bVar) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j2, byte[] bArr, int i2, int i3) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class b extends InputStream implements DataInput {
        public static final ByteOrder e = null;
        public static final ByteOrder f = null;
        public DataInputStream a;
        public ByteOrder b;
        public final int c;
        public int d;

        public b(InputStream inputStream) throws IOException {
        }

        public int a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
        }

        public int b() {
        }

        public long c() throws IOException {
        }

        public void d(long j2) throws IOException {
        }

        public void e(ByteOrder byteOrder) {
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i2) {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) throws IOException {
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
        }

        public b(byte[] bArr) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends FilterOutputStream {
        public final OutputStream a;
        public ByteOrder b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
        }

        public void a(ByteOrder byteOrder) {
        }

        public void b(int i2) throws IOException {
        }

        public void c(int i2) throws IOException {
        }

        public void d(short s2) throws IOException {
        }

        public void e(long j2) throws IOException {
        }

        public void g(int i2) throws IOException {
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class d {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        public d(int i2, int i3, byte[] bArr) {
        }

        public static d a(String str) {
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
        }

        public static d e(String str) {
        }

        public static d f(long j2, ByteOrder byteOrder) {
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
        }

        public static d h(f fVar, ByteOrder byteOrder) {
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
        }

        public static d j(int i2, ByteOrder byteOrder) {
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
        }

        public double l(ByteOrder byteOrder) {
        }

        public int m(ByteOrder byteOrder) {
        }

        public String n(ByteOrder byteOrder) {
        }

        public Object o(ByteOrder byteOrder) {
        }

        public int p() {
        }

        public String toString() {
        }

        public d(int i2, int i3, long j2, byte[] bArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class f {
        public final long a;
        public final long b;

        public f(double d) {
        }

        public double a() {
        }

        public String toString() {
        }

        public f(long j2, long j3) {
        }
    }

    public a(String str) throws IOException {
    }

    public static boolean C(BufferedInputStream bufferedInputStream) throws IOException {
    }

    public static boolean E(byte[] bArr) throws IOException {
    }

    public static boolean J(FileDescriptor fileDescriptor) {
    }

    public static String b(byte[] bArr) {
    }

    public static void c(FileDescriptor fileDescriptor) {
    }

    public static boolean c0(byte[] bArr, byte[] bArr2) {
    }

    public static void d(Closeable closeable) {
    }

    public static long[] e(Object obj) {
    }

    public static int f(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    public static void g(InputStream inputStream, OutputStream outputStream, int i2) throws IOException {
    }

    public static Pair<Integer, Integer> y(String str) {
    }

    public final void A(b bVar, HashMap hashMap) throws IOException {
    }

    public final void B(String str) throws IOException {
    }

    public final boolean D(byte[] bArr) throws IOException {
    }

    public final boolean F(byte[] bArr) throws IOException {
    }

    public final boolean G(byte[] bArr) throws IOException {
    }

    public final boolean H(byte[] bArr) throws IOException {
    }

    public final boolean I(byte[] bArr) throws IOException {
    }

    public final boolean K(HashMap hashMap) throws IOException {
    }

    public final boolean L() {
    }

    public final boolean M(HashMap hashMap) throws IOException {
    }

    public final boolean N(byte[] bArr) throws IOException {
    }

    public final void O(InputStream inputStream) {
    }

    public final void P(b bVar, int i2) throws IOException {
    }

    public final void Q() {
    }

    public final ByteOrder R(b bVar) throws IOException {
    }

    public final void S(byte[] bArr, int i2) throws IOException {
    }

    public final void T(b bVar, int i2) throws IOException {
    }

    public final void U(String str) {
    }

    public final void V(b bVar, int i2) throws IOException {
    }

    public void W() throws IOException {
    }

    public final void X(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    public final void Y(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    public final void Z(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    public final void a() {
    }

    public void a0(String str, String str2) {
    }

    public final void b0(b bVar) throws IOException {
    }

    public final void d0(int i2, int i3) throws IOException {
    }

    public final void e0(b bVar, int i2) throws IOException {
    }

    public final void f0() throws IOException {
    }

    public final int g0(c cVar) throws IOException {
    }

    public final void h(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
    }

    public final void i(b bVar, c cVar, byte[] bArr) throws IOException {
    }

    public String j(String str) {
    }

    public int k(String str, int i2) {
    }

    public final d l(String str) {
    }

    public final void m(b bVar) throws IOException {
    }

    public final void n(b bVar, int i2, int i3) throws IOException {
    }

    public final int o(BufferedInputStream bufferedInputStream) throws IOException {
    }

    public final void p(b bVar) throws IOException {
    }

    public final void q(b bVar) throws IOException {
    }

    public final void r(b bVar) throws IOException {
    }

    public final void s(b bVar) throws IOException {
    }

    public final void t(b bVar) throws IOException {
    }

    public final void u(b bVar) throws IOException {
    }

    public byte[] v() {
    }

    public byte[] w() {
    }

    public final void x(b bVar) throws IOException {
    }

    public final void z(b bVar, HashMap hashMap) throws IOException {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class e {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public e(String str, int i2, int i3) {
        }

        public boolean a(int i2) {
        }

        public e(String str, int i2, int i3, int i4) {
        }
    }

    public a(InputStream inputStream) throws IOException {
    }

    public a(InputStream inputStream, int i2) throws IOException {
    }
}
