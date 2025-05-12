package k.d.c;

import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class b0 {
    public static final Charset a = null;
    public static final byte[] b = null;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface a extends i<Boolean> {
        @Override // k.d.c.b0.i, k.d.c.b0.g
        i<Boolean> a(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface b extends i<Double> {
        @Override // k.d.c.b0.i, k.d.c.b0.g
        i<Double> a(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface c {
        int H();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface d<T extends c> {
        T a(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e {
        boolean a(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f extends i<Float> {
        @Override // k.d.c.b0.i, k.d.c.b0.g
        i<Float> a(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface g extends i<Integer> {
        @Override // 
        i<Integer> a(int i2);

        int getInt(int i2);

        int h(int i2, int i3);

        void j(int i2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface h extends i<Long> {
        long G(int i2, long j2);

        @Override // k.d.c.b0.i, k.d.c.b0.g
        i<Long> a(int i2);

        long getLong(int i2);

        void p(long j2);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface i<E> extends List<E>, RandomAccess {
        boolean J();

        i<E> a(int i2);

        void d();
    }

    public static <T> T a(T t2) {
    }

    public static <T> T b(T t2, String str) {
    }

    public static int c(boolean z) {
    }

    public static int d(byte[] bArr) {
    }

    public static int e(byte[] bArr, int i2, int i3) {
    }

    public static int f(long j2) {
    }

    public static boolean g(byte[] bArr) {
    }

    public static Object h(Object obj, Object obj2) {
    }

    public static int i(int i2, byte[] bArr, int i3, int i4) {
    }

    public static String j(byte[] bArr) {
    }
}
