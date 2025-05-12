package k.d.c;

import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public abstract class i implements Iterable<Byte>, Serializable {
    public static final i b = null;
    public static final e c = null;
    public int a;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends b {
        public int a;
        public final int b;
        public final /* synthetic */ i c;

        public a(i iVar) {
        }

        @Override // k.d.c.i.f
        public byte c() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class b implements f {
        public final Byte a() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Byte next() {
        }

        @Override // java.util.Iterator
        public final void remove() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c implements e {
        public c() {
        }

        @Override // k.d.c.i.e
        public byte[] a(byte[] bArr, int i2, int i3) {
        }

        public /* synthetic */ c(a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d extends C0279i {
        public final int e;
        public final int f;

        public d(byte[] bArr, int i2, int i3) {
        }

        @Override // k.d.c.i.C0279i
        public int O() {
        }

        @Override // k.d.c.i.C0279i, k.d.c.i
        public byte c(int i2) {
        }

        @Override // k.d.c.i.C0279i, k.d.c.i
        public void o(byte[] bArr, int i2, int i3, int i4) {
        }

        @Override // k.d.c.i.C0279i, k.d.c.i
        public byte q(int i2) {
        }

        @Override // k.d.c.i.C0279i, k.d.c.i
        public int size() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e {
        byte[] a(byte[] bArr, int i2, int i3);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f extends Iterator<Byte> {
        byte c();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class g {
        public final l a;
        public final byte[] b;

        public /* synthetic */ g(int i2, a aVar) {
        }

        public i a() {
        }

        public l b() {
        }

        public g(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static abstract class h extends i {
        @Override // k.d.c.i, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        }
    }

    /* renamed from: k.d.c.i$i, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class C0279i extends h {
        public final byte[] d;

        public C0279i(byte[] bArr) {
        }

        @Override // k.d.c.i
        public final String C(Charset charset) {
        }

        @Override // k.d.c.i
        public final void M(k.d.c.h hVar) throws IOException {
        }

        public final boolean N(i iVar, int i2, int i3) {
        }

        public int O() {
        }

        @Override // k.d.c.i
        public final ByteBuffer b() {
        }

        @Override // k.d.c.i
        public byte c(int i2) {
        }

        @Override // k.d.c.i
        public final boolean equals(Object obj) {
        }

        @Override // k.d.c.i
        public void o(byte[] bArr, int i2, int i3, int i4) {
        }

        @Override // k.d.c.i
        public byte q(int i2) {
        }

        @Override // k.d.c.i
        public final boolean r() {
        }

        @Override // k.d.c.i
        public int size() {
        }

        @Override // k.d.c.i
        public final k.d.c.j v() {
        }

        @Override // k.d.c.i
        public final int w(int i2, int i3, int i4) {
        }

        @Override // k.d.c.i
        public final i y(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class j implements e {
        public j() {
        }

        @Override // k.d.c.i.e
        public byte[] a(byte[] bArr, int i2, int i3) {
        }

        public /* synthetic */ j(a aVar) {
        }
    }

    public static i F(ByteBuffer byteBuffer) {
    }

    public static i K(byte[] bArr) {
    }

    public static i L(byte[] bArr, int i2, int i3) {
    }

    public static void f(int i2, int i3) {
    }

    public static int g(int i2, int i3, int i4) {
    }

    public static i k(String str, String str2) throws UnsupportedEncodingException {
    }

    public static i l(byte[] bArr) {
    }

    public static i m(byte[] bArr, int i2, int i3) {
    }

    public static i n(String str) {
    }

    public static g u(int i2) {
    }

    public final String A(String str) throws UnsupportedEncodingException {
    }

    public final String B(Charset charset) {
    }

    public abstract String C(Charset charset);

    public final String D() {
    }

    public final String E() {
    }

    public abstract void M(k.d.c.h hVar) throws IOException;

    public abstract ByteBuffer b();

    public abstract byte c(int i2);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
    }

    public final boolean isEmpty() {
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
    }

    public abstract void o(byte[] bArr, int i2, int i3, int i4);

    public abstract byte q(int i2);

    public abstract boolean r();

    public f s() {
    }

    public abstract int size();

    public final String toString() {
    }

    public abstract k.d.c.j v();

    public abstract int w(int i2, int i3, int i4);

    public final int x() {
    }

    public abstract i y(int i2, int i3);

    public final byte[] z() {
    }
}
