package k.d.a.a.o4;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import k.d.a.a.y2;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@SuppressLint({"InlinedApi"})
/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class w {
    public static final Pattern a = null;
    public static final HashMap<b, List<t>> b = null;
    public static int c;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends Exception {
        public /* synthetic */ c(Throwable th, a aVar) {
        }

        public c(Throwable th) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface d {
        MediaCodecInfo a(int i2);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class e implements d {
        public e() {
        }

        @Override // k.d.a.a.o4.w.d
        public MediaCodecInfo a(int i2) {
        }

        @Override // k.d.a.a.o4.w.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        }

        @Override // k.d.a.a.o4.w.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        }

        @Override // k.d.a.a.o4.w.d
        public int d() {
        }

        @Override // k.d.a.a.o4.w.d
        public boolean e() {
        }

        public /* synthetic */ e(a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class f implements d {
        public final int a;
        public MediaCodecInfo[] b;

        public f(boolean z, boolean z2) {
        }

        @Override // k.d.a.a.o4.w.d
        public MediaCodecInfo a(int i2) {
        }

        @Override // k.d.a.a.o4.w.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        }

        @Override // k.d.a.a.o4.w.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        }

        @Override // k.d.a.a.o4.w.d
        public int d() {
        }

        @Override // k.d.a.a.o4.w.d
        public boolean e() {
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        public final void f() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface g<T> {
        int a(T t2);
    }

    public static boolean A(MediaCodecInfo mediaCodecInfo) {
    }

    public static boolean B(MediaCodecInfo mediaCodecInfo, String str) {
    }

    public static boolean C(MediaCodecInfo mediaCodecInfo) {
    }

    public static boolean D(MediaCodecInfo mediaCodecInfo) {
    }

    public static boolean E(MediaCodecInfo mediaCodecInfo) {
    }

    public static /* synthetic */ int F(t tVar) {
    }

    public static /* synthetic */ int G(t tVar) {
    }

    public static /* synthetic */ int H(y2 y2Var, t tVar) {
    }

    public static /* synthetic */ int I(g gVar, Object obj, Object obj2) {
    }

    public static int J() throws c {
    }

    public static int K(int i2) {
    }

    public static <T> void L(List<T> list, g<T> gVar) {
    }

    public static int M(int i2) {
    }

    public static int N(int i2) {
    }

    public static void a(String str, List<t> list) {
    }

    public static int b(int i2) {
    }

    public static int c(int i2) {
    }

    public static int d(int i2) {
    }

    public static int e(int i2) {
    }

    public static Integer f(String str) {
    }

    public static Integer g(String str) {
    }

    public static Pair<Integer, Integer> h(String str, String[] strArr) {
    }

    public static String i(y2 y2Var) {
    }

    public static Pair<Integer, Integer> j(String str, String[] strArr, k.d.a.a.y4.o oVar) {
    }

    public static Pair<Integer, Integer> k(String str, String[] strArr) {
    }

    public static String l(MediaCodecInfo mediaCodecInfo, String str, String str2) {
    }

    public static Pair<Integer, Integer> m(y2 y2Var) {
    }

    public static t n(String str, boolean z, boolean z2) throws c {
    }

    public static synchronized List<t> o(String str, boolean z, boolean z2) throws c {
    }

    public static ArrayList<t> p(b bVar, d dVar) throws c {
    }

    public static List<t> q(List<t> list, y2 y2Var) {
    }

    public static t r() throws c {
    }

    public static Pair<Integer, Integer> s(String str, String[] strArr) {
    }

    public static Pair<Integer, Integer> t(String str, String[] strArr, k.d.a.a.y4.o oVar) {
    }

    public static Pair<Integer, Integer> u(String str, String[] strArr) {
    }

    public static Integer v(String str) {
    }

    public static boolean w(MediaCodecInfo mediaCodecInfo) {
    }

    public static boolean x(MediaCodecInfo mediaCodecInfo) {
    }

    public static boolean y(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
    }

    public static boolean z(MediaCodecInfo mediaCodecInfo, String str) {
    }
}
