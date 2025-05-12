package k.d.a.a.k4;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Handler;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import k.d.a.a.j4.t1;
import k.d.a.a.k4.x;
import k.d.a.a.k4.z;
import k.d.a.a.p3;
import k.d.a.a.t2;
import k.d.a.a.y2;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class d0 implements x {
    public static boolean e0 = false;
    public static final Object f0 = null;
    public static ExecutorService g0;
    public static int h0;
    public ByteBuffer A;
    public int B;
    public long C;
    public long D;
    public long E;
    public long F;
    public int G;
    public boolean H;
    public boolean I;
    public long J;
    public float K;
    public s[] L;
    public ByteBuffer[] M;
    public ByteBuffer N;
    public int O;
    public ByteBuffer P;
    public byte[] Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public a0 Y;
    public d Z;
    public final r a;
    public boolean a0;
    public final t b;
    public long b0;
    public final boolean c;
    public boolean c0;
    public final c0 d;
    public boolean d0;
    public final o0 e;
    public final s[] f;
    public final s[] g;
    public final k.d.a.a.x4.k h;

    /* renamed from: i, reason: collision with root package name */
    public final z f4013i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque<j> f4014j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4015k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4016l;

    /* renamed from: m, reason: collision with root package name */
    public m f4017m;

    /* renamed from: n, reason: collision with root package name */
    public final k<x.b> f4018n;

    /* renamed from: o, reason: collision with root package name */
    public final k<x.e> f4019o;

    /* renamed from: p, reason: collision with root package name */
    public final e f4020p;

    /* renamed from: q, reason: collision with root package name */
    public final t2.a f4021q;

    /* renamed from: r, reason: collision with root package name */
    public t1 f4022r;

    /* renamed from: s, reason: collision with root package name */
    public x.c f4023s;

    /* renamed from: t, reason: collision with root package name */
    public g f4024t;
    public g u;
    public AudioTrack v;
    public q w;
    public j x;
    public j y;
    public p3 z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b {
        public static void a(AudioTrack audioTrack, d dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class c {
        public static void a(AudioTrack audioTrack, t1 t1Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d {
        public final AudioDeviceInfo a;

        public d(AudioDeviceInfo audioDeviceInfo) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface e {
        public static final e a = null;

        int a(int i2, int i3, int i4, int i5, int i6, int i7, double d);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class f {
        public r a;
        public t b;
        public boolean c;
        public boolean d;
        public int e;
        public e f;
        public t2.a g;

        public static /* synthetic */ r a(f fVar) {
        }

        public static /* synthetic */ t b(f fVar) {
        }

        public static /* synthetic */ boolean c(f fVar) {
        }

        public static /* synthetic */ boolean d(f fVar) {
        }

        public static /* synthetic */ int e(f fVar) {
        }

        public d0 f() {
        }

        @CanIgnoreReturnValue
        public f g(r rVar) {
        }

        @CanIgnoreReturnValue
        public f h(boolean z) {
        }

        @CanIgnoreReturnValue
        public f i(boolean z) {
        }

        @CanIgnoreReturnValue
        public f j(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class g {
        public final y2 a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;

        /* renamed from: i, reason: collision with root package name */
        public final s[] f4025i;

        public g(y2 y2Var, int i2, int i3, int i4, int i5, int i6, int i7, int i8, s[] sVarArr) {
        }

        public static AudioAttributes i(q qVar, boolean z) {
        }

        public static AudioAttributes j() {
        }

        public AudioTrack a(boolean z, q qVar, int i2) throws x.b {
        }

        public boolean b(g gVar) {
        }

        public g c(int i2) {
        }

        public final AudioTrack d(boolean z, q qVar, int i2) {
        }

        public final AudioTrack e(boolean z, q qVar, int i2) {
        }

        public final AudioTrack f(boolean z, q qVar, int i2) {
        }

        public final AudioTrack g(q qVar, int i2) {
        }

        public long h(long j2) {
        }

        public long k(long j2) {
        }

        public boolean l() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class h implements t {
        public final s[] a;
        public final l0 b;
        public final n0 c;

        public h(s... sVarArr) {
        }

        @Override // k.d.a.a.k4.t
        public p3 a(p3 p3Var) {
        }

        @Override // k.d.a.a.k4.t
        public long b(long j2) {
        }

        @Override // k.d.a.a.k4.t
        public long c() {
        }

        @Override // k.d.a.a.k4.t
        public boolean d(boolean z) {
        }

        @Override // k.d.a.a.k4.t
        public s[] e() {
        }

        public h(s[] sVarArr, l0 l0Var, n0 n0Var) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class i extends RuntimeException {
        public /* synthetic */ i(String str, a aVar) {
        }

        public i(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class j {
        public final p3 a;
        public final boolean b;
        public final long c;
        public final long d;

        public /* synthetic */ j(p3 p3Var, boolean z, long j2, long j3, a aVar) {
        }

        public j(p3 p3Var, boolean z, long j2, long j3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class k<T extends Exception> {
        public final long a;
        public T b;
        public long c;

        public k(long j2) {
        }

        public void a() {
        }

        public void b(T t2) throws Exception {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class l implements z.a {
        public final /* synthetic */ d0 a;

        public l(d0 d0Var) {
        }

        @Override // k.d.a.a.k4.z.a
        public void a(int i2, long j2) {
        }

        @Override // k.d.a.a.k4.z.a
        public void b(long j2) {
        }

        @Override // k.d.a.a.k4.z.a
        public void c(long j2) {
        }

        @Override // k.d.a.a.k4.z.a
        public void d(long j2, long j3, long j4, long j5) {
        }

        @Override // k.d.a.a.k4.z.a
        public void e(long j2, long j3, long j4, long j5) {
        }

        public /* synthetic */ l(d0 d0Var, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class m {
        public final Handler a;
        public final AudioTrack.StreamEventCallback b;
        public final /* synthetic */ d0 c;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
        public class a extends AudioTrack.StreamEventCallback {
            public final /* synthetic */ m a;

            public a(m mVar, d0 d0Var) {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i2) {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
            }
        }

        public m(d0 d0Var) {
        }

        public void a(AudioTrack audioTrack) {
        }

        public void b(AudioTrack audioTrack) {
        }
    }

    public /* synthetic */ d0(f fVar, a aVar) {
    }

    public static /* synthetic */ long B(d0 d0Var) {
    }

    public static /* synthetic */ long C(d0 d0Var) {
    }

    public static /* synthetic */ AudioFormat D(int i2, int i3, int i4) {
    }

    public static /* synthetic */ AudioTrack E(d0 d0Var) {
    }

    public static /* synthetic */ x.c F(d0 d0Var) {
    }

    public static AudioFormat N(int i2, int i3, int i4) {
    }

    public static int P(int i2, int i3, int i4) {
    }

    public static int Q(int i2, ByteBuffer byteBuffer) {
    }

    public static boolean X(int i2) {
    }

    public static boolean Z(AudioTrack audioTrack) {
    }

    public static /* synthetic */ void a0(AudioTrack audioTrack, k.d.a.a.x4.k kVar) {
    }

    public static /* synthetic */ boolean c(d0 d0Var) {
    }

    public static /* synthetic */ long d(d0 d0Var) {
    }

    public static void f0(AudioTrack audioTrack, k.d.a.a.x4.k kVar) {
    }

    public static void k0(AudioTrack audioTrack, float f2) {
    }

    public static void l0(AudioTrack audioTrack, float f2) {
    }

    public static int r0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
    }

    @Override // k.d.a.a.k4.x
    public void A(a0 a0Var) {
    }

    public final void G(long j2) {
    }

    public final long H(long j2) {
    }

    public final long I(long j2) {
    }

    public final AudioTrack J(g gVar) throws x.b {
    }

    public final AudioTrack K() throws x.b {
    }

    public final boolean L() throws x.e {
    }

    public final void M() {
    }

    public final p3 O() {
    }

    public final j R() {
    }

    @SuppressLint({"InlinedApi"})
    public final int S(AudioFormat audioFormat, AudioAttributes audioAttributes) {
    }

    public boolean T() {
    }

    public final long U() {
    }

    public final long V() {
    }

    public final boolean W() throws x.b {
    }

    public final boolean Y() {
    }

    @Override // k.d.a.a.k4.x
    public void a() {
    }

    @Override // k.d.a.a.k4.x
    public boolean b(y2 y2Var) {
    }

    public final void b0() {
    }

    public final void c0() {
    }

    public final void d0(long j2) throws x.e {
    }

    @Override // k.d.a.a.k4.x
    public boolean e() {
    }

    public final void e0(AudioTrack audioTrack) {
    }

    @Override // k.d.a.a.k4.x
    public p3 f() {
    }

    @Override // k.d.a.a.k4.x
    public void flush() {
    }

    @Override // k.d.a.a.k4.x
    public void g() {
    }

    public final void g0() {
    }

    @Override // k.d.a.a.k4.x
    public void h(p3 p3Var) {
    }

    public final void h0(p3 p3Var, boolean z) {
    }

    @Override // k.d.a.a.k4.x
    public void i(AudioDeviceInfo audioDeviceInfo) {
    }

    public final void i0(p3 p3Var) {
    }

    @Override // k.d.a.a.k4.x
    public void j() throws x.e {
    }

    public final void j0() {
    }

    @Override // k.d.a.a.k4.x
    public boolean k() {
    }

    @Override // k.d.a.a.k4.x
    public void l(int i2) {
    }

    @Override // k.d.a.a.k4.x
    public long m(boolean z) {
    }

    public final void m0() {
    }

    @Override // k.d.a.a.k4.x
    public void n() {
    }

    public final boolean n0() {
    }

    @Override // k.d.a.a.k4.x
    public void o(q qVar) {
    }

    public final boolean o0(int i2) {
    }

    @Override // k.d.a.a.k4.x
    public /* synthetic */ void p(long j2) {
    }

    public final boolean p0(y2 y2Var, q qVar) {
    }

    @Override // k.d.a.a.k4.x
    public void pause() {
    }

    @Override // k.d.a.a.k4.x
    public void q() {
    }

    public final void q0(ByteBuffer byteBuffer, long j2) throws x.e {
    }

    @Override // k.d.a.a.k4.x
    public void r(float f2) {
    }

    @Override // k.d.a.a.k4.x
    public void s() {
    }

    public final int s0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
    }

    @Override // k.d.a.a.k4.x
    public void t(t1 t1Var) {
    }

    @Override // k.d.a.a.k4.x
    public boolean u(ByteBuffer byteBuffer, long j2, int i2) throws x.b, x.e {
    }

    @Override // k.d.a.a.k4.x
    public void v(x.c cVar) {
    }

    @Override // k.d.a.a.k4.x
    public int w(y2 y2Var) {
    }

    @Override // k.d.a.a.k4.x
    public void x(y2 y2Var, int i2, int[] iArr) throws x.a {
    }

    @Override // k.d.a.a.k4.x
    public void y() {
    }

    @Override // k.d.a.a.k4.x
    public void z(boolean z) {
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    public d0(f fVar) {
    }
}
