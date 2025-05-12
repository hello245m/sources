package k.d.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import k.d.a.a.d4;
import k.d.a.a.f2;
import k.d.a.a.f4;
import k.d.a.a.g2;
import k.d.a.a.k3;
import k.d.a.a.q3;
import k.d.a.a.s3;
import k.d.a.a.s4.p0;
import k.d.a.a.t2;
import k.d.a.a.v2;
import k.d.a.a.y4.c0.l;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class u2 extends h2 implements t2 {
    public final g2 A;
    public final d4 B;
    public final h4 C;
    public final i4 D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public b4 L;
    public k.d.a.a.s4.b1 M;
    public boolean N;
    public q3.b O;
    public f3 P;
    public y2 Q;
    public y2 R;
    public AudioTrack S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public k.d.a.a.y4.c0.l W;
    public boolean X;
    public TextureView Y;
    public int Z;
    public int a0;
    public final k.d.a.a.u4.d0 b;
    public k.d.a.a.x4.i0 b0;
    public final q3.b c;
    public k.d.a.a.l4.e c0;
    public final k.d.a.a.x4.k d;
    public k.d.a.a.l4.e d0;
    public final Context e;
    public int e0;
    public final q3 f;
    public k.d.a.a.k4.q f0;
    public final w3[] g;
    public float g0;
    public final k.d.a.a.u4.c0 h;
    public boolean h0;

    /* renamed from: i, reason: collision with root package name */
    public final k.d.a.a.x4.t f4944i;
    public k.d.a.a.t4.f i0;

    /* renamed from: j, reason: collision with root package name */
    public final v2.f f4945j;
    public boolean j0;

    /* renamed from: k, reason: collision with root package name */
    public final v2 f4946k;
    public boolean k0;

    /* renamed from: l, reason: collision with root package name */
    public final k.d.a.a.x4.u<q3.d> f4947l;
    public k.d.a.a.x4.g0 l0;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet<t2.a> f4948m;
    public boolean m0;

    /* renamed from: n, reason: collision with root package name */
    public final f4.b f4949n;
    public q2 n0;

    /* renamed from: o, reason: collision with root package name */
    public final List<e> f4950o;
    public k.d.a.a.y4.b0 o0;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4951p;
    public f3 p0;

    /* renamed from: q, reason: collision with root package name */
    public final p0.a f4952q;
    public o3 q0;

    /* renamed from: r, reason: collision with root package name */
    public final k.d.a.a.j4.m1 f4953r;
    public int r0;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f4954s;
    public int s0;

    /* renamed from: t, reason: collision with root package name */
    public final k.d.a.a.w4.l f4955t;
    public long t0;
    public final long u;
    public final long v;
    public final k.d.a.a.x4.h w;
    public final c x;
    public final d y;
    public final f2 z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b {
        public static k.d.a.a.j4.t1 a(Context context, u2 u2Var, boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class c implements k.d.a.a.y4.a0, k.d.a.a.k4.v, k.d.a.a.t4.p, k.d.a.a.p4.f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, g2.b, f2.b, d4.b, t2.a {
        public final /* synthetic */ u2 a;

        public c(u2 u2Var) {
        }

        public static /* synthetic */ void I(List list, q3.d dVar) {
        }

        public static /* synthetic */ void J(k.d.a.a.t4.f fVar, q3.d dVar) {
        }

        private /* synthetic */ void K(q3.d dVar) {
        }

        public static /* synthetic */ void M(k.d.a.a.p4.a aVar, q3.d dVar) {
        }

        public static /* synthetic */ void N(boolean z, q3.d dVar) {
        }

        public static /* synthetic */ void O(q2 q2Var, q3.d dVar) {
        }

        public static /* synthetic */ void P(int i2, boolean z, q3.d dVar) {
        }

        public static /* synthetic */ void Q(k.d.a.a.y4.b0 b0Var, q3.d dVar) {
        }

        @Override // k.d.a.a.y4.c0.l.b
        public void A(Surface surface) {
        }

        @Override // k.d.a.a.k4.v
        public void B(int i2, long j2, long j3) {
        }

        @Override // k.d.a.a.y4.a0
        public void C(long j2, int i2) {
        }

        @Override // k.d.a.a.y4.c0.l.b
        public void D(Surface surface) {
        }

        @Override // k.d.a.a.d4.b
        public void E(int i2, boolean z) {
        }

        @Override // k.d.a.a.y4.a0
        public /* synthetic */ void F(y2 y2Var) {
        }

        @Override // k.d.a.a.k4.v
        public /* synthetic */ void G(y2 y2Var) {
        }

        @Override // k.d.a.a.t2.a
        public /* synthetic */ void H(boolean z) {
        }

        public /* synthetic */ void L(q3.d dVar) {
        }

        @Override // k.d.a.a.k4.v
        public void a(boolean z) {
        }

        @Override // k.d.a.a.k4.v
        public void b(Exception exc) {
        }

        @Override // k.d.a.a.d4.b
        public void c(int i2) {
        }

        @Override // k.d.a.a.k4.v
        public void d(k.d.a.a.l4.e eVar) {
        }

        @Override // k.d.a.a.y4.a0
        public void e(String str) {
        }

        @Override // k.d.a.a.k4.v
        public void f(k.d.a.a.l4.e eVar) {
        }

        @Override // k.d.a.a.y4.a0
        public void g(String str, long j2, long j3) {
        }

        @Override // k.d.a.a.t4.p
        public void h(k.d.a.a.t4.f fVar) {
        }

        @Override // k.d.a.a.k4.v
        public void i(String str) {
        }

        @Override // k.d.a.a.k4.v
        public void j(String str, long j2, long j3) {
        }

        @Override // k.d.a.a.p4.f
        public void k(k.d.a.a.p4.a aVar) {
        }

        @Override // k.d.a.a.f2.b
        public void l() {
        }

        @Override // k.d.a.a.y4.a0
        public void m(int i2, long j2) {
        }

        @Override // k.d.a.a.t2.a
        public void n(boolean z) {
        }

        @Override // k.d.a.a.k4.v
        public void o(y2 y2Var, k.d.a.a.l4.i iVar) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // k.d.a.a.g2.b
        public void p(float f) {
        }

        @Override // k.d.a.a.y4.a0
        public void q(Object obj, long j2) {
        }

        @Override // k.d.a.a.g2.b
        public void r(int i2) {
        }

        @Override // k.d.a.a.t4.p
        public void s(List<k.d.a.a.t4.c> list) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }

        @Override // k.d.a.a.y4.a0
        public void t(k.d.a.a.l4.e eVar) {
        }

        @Override // k.d.a.a.y4.a0
        public void u(y2 y2Var, k.d.a.a.l4.i iVar) {
        }

        @Override // k.d.a.a.k4.v
        public void v(long j2) {
        }

        @Override // k.d.a.a.k4.v
        public void w(Exception exc) {
        }

        @Override // k.d.a.a.y4.a0
        public void x(Exception exc) {
        }

        @Override // k.d.a.a.y4.a0
        public void y(k.d.a.a.y4.b0 b0Var) {
        }

        @Override // k.d.a.a.y4.a0
        public void z(k.d.a.a.l4.e eVar) {
        }

        public /* synthetic */ c(u2 u2Var, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d implements k.d.a.a.y4.x, k.d.a.a.y4.c0.d, s3.b {
        public k.d.a.a.y4.x a;
        public k.d.a.a.y4.c0.d b;
        public k.d.a.a.y4.x c;
        public k.d.a.a.y4.c0.d d;

        public d() {
        }

        @Override // k.d.a.a.y4.c0.d
        public void b(long j2, float[] fArr) {
        }

        @Override // k.d.a.a.y4.c0.d
        public void f() {
        }

        @Override // k.d.a.a.y4.x
        public void h(long j2, long j3, y2 y2Var, MediaFormat mediaFormat) {
        }

        @Override // k.d.a.a.s3.b
        public void t(int i2, Object obj) {
        }

        public /* synthetic */ d(a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class e implements j3 {
        public final Object a;
        public f4 b;

        public e(Object obj, f4 f4Var) {
        }

        public static /* synthetic */ f4 b(e eVar, f4 f4Var) {
        }

        @Override // k.d.a.a.j3
        public f4 a() {
        }

        @Override // k.d.a.a.j3
        public Object getUid() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    public u2(t2.b bVar, q3 q3Var) {
    }

    public static /* synthetic */ void A0(u2 u2Var, Object obj) {
    }

    public static /* synthetic */ void B0(u2 u2Var, int i2, int i3) {
    }

    public static /* synthetic */ void B1(o3 o3Var, int i2, q3.d dVar) {
    }

    public static /* synthetic */ void C0(u2 u2Var, SurfaceTexture surfaceTexture) {
    }

    public static /* synthetic */ void C1(int i2, q3.e eVar, q3.e eVar2, q3.d dVar) {
    }

    public static /* synthetic */ void D0(u2 u2Var) {
    }

    public static /* synthetic */ void D1(e3 e3Var, int i2, q3.d dVar) {
    }

    public static /* synthetic */ int E0(boolean z, int i2) {
    }

    public static /* synthetic */ void E1(o3 o3Var, q3.d dVar) {
    }

    public static /* synthetic */ void F0(u2 u2Var, boolean z, int i2, int i3) {
    }

    public static /* synthetic */ void F1(o3 o3Var, q3.d dVar) {
    }

    public static /* synthetic */ d4 G0(u2 u2Var) {
    }

    public static /* synthetic */ void G1(o3 o3Var, q3.d dVar) {
    }

    public static /* synthetic */ q2 H0(d4 d4Var) {
    }

    public static /* synthetic */ void H1(f3 f3Var, q3.d dVar) {
    }

    public static /* synthetic */ q2 I0(u2 u2Var) {
    }

    public static /* synthetic */ void I1(o3 o3Var, q3.d dVar) {
    }

    public static /* synthetic */ q2 J0(u2 u2Var, q2 q2Var) {
    }

    public static /* synthetic */ void J1(o3 o3Var, q3.d dVar) {
    }

    public static /* synthetic */ void K0(u2 u2Var) {
    }

    public static /* synthetic */ void K1(o3 o3Var, q3.d dVar) {
    }

    public static /* synthetic */ k.d.a.a.l4.e L0(u2 u2Var, k.d.a.a.l4.e eVar) {
    }

    public static /* synthetic */ void L1(o3 o3Var, int i2, q3.d dVar) {
    }

    public static /* synthetic */ k.d.a.a.j4.m1 M0(u2 u2Var) {
    }

    public static /* synthetic */ void M1(o3 o3Var, q3.d dVar) {
    }

    public static /* synthetic */ y2 N0(u2 u2Var, y2 y2Var) {
    }

    public static /* synthetic */ void N1(o3 o3Var, q3.d dVar) {
    }

    public static /* synthetic */ k.d.a.a.y4.b0 O0(u2 u2Var, k.d.a.a.y4.b0 b0Var) {
    }

    public static /* synthetic */ void O1(o3 o3Var, q3.d dVar) {
    }

    public static /* synthetic */ k.d.a.a.x4.u P0(u2 u2Var) {
    }

    public static /* synthetic */ Object Q0(u2 u2Var) {
    }

    public static /* synthetic */ k.d.a.a.l4.e R0(u2 u2Var, k.d.a.a.l4.e eVar) {
    }

    public static q2 X0(d4 d4Var) {
    }

    public static int g1(boolean z, int i2) {
    }

    public static long k1(o3 o3Var) {
    }

    public static boolean n1(o3 o3Var) {
    }

    public static /* synthetic */ void o1(int i2, int i3, q3.d dVar) {
    }

    private /* synthetic */ void p1(q3.d dVar, k.d.a.a.x4.q qVar) {
    }

    public static /* synthetic */ y2 q0(u2 u2Var, y2 y2Var) {
    }

    public static /* synthetic */ boolean r0(u2 u2Var) {
    }

    private /* synthetic */ void r1(v2.e eVar) {
    }

    public static /* synthetic */ boolean s0(u2 u2Var, boolean z) {
    }

    public static /* synthetic */ k.d.a.a.t4.f t0(u2 u2Var, k.d.a.a.t4.f fVar) {
    }

    private /* synthetic */ void t1(v2.e eVar) {
    }

    public static /* synthetic */ f3 u0(u2 u2Var) {
    }

    public static /* synthetic */ f3 v0(u2 u2Var, f3 f3Var) {
    }

    public static /* synthetic */ void v1(q3.d dVar) {
    }

    public static /* synthetic */ f3 w0(u2 u2Var) {
    }

    public static /* synthetic */ void w1(int i2, q3.d dVar) {
    }

    public static /* synthetic */ f3 x0(u2 u2Var) {
    }

    public static /* synthetic */ void x1(boolean z, q3.d dVar) {
    }

    public static /* synthetic */ f3 y0(u2 u2Var, f3 f3Var) {
    }

    public static /* synthetic */ void y1(k.d.a.a.u4.a0 a0Var, q3.d dVar) {
    }

    public static /* synthetic */ boolean z0(u2 u2Var) {
    }

    private /* synthetic */ void z1(q3.d dVar) {
    }

    @Override // k.d.a.a.q3
    public /* bridge */ /* synthetic */ n3 A() {
    }

    public /* synthetic */ void A1(q3.d dVar) {
    }

    @Override // k.d.a.a.q3
    public void B(boolean z) {
    }

    @Override // k.d.a.a.q3
    public long C() {
    }

    @Override // k.d.a.a.q3
    public long D() {
    }

    @Override // k.d.a.a.q3
    public void E(q3.d dVar) {
    }

    @Override // k.d.a.a.q3
    public long F() {
    }

    @Override // k.d.a.a.q3
    public void H(k.d.a.a.u4.a0 a0Var) {
    }

    @Override // k.d.a.a.q3
    public int I() {
    }

    @Override // k.d.a.a.q3
    public g4 J() {
    }

    @Override // k.d.a.a.q3
    public k.d.a.a.t4.f L() {
    }

    @Override // k.d.a.a.q3
    public int M() {
    }

    @Override // k.d.a.a.q3
    public int N() {
    }

    @Override // k.d.a.a.q3
    public void P(int i2) {
    }

    public final o3 P1(o3 o3Var, f4 f4Var, Pair<Object, Long> pair) {
    }

    @Override // k.d.a.a.q3
    public void Q(SurfaceView surfaceView) {
    }

    public final Pair<Object, Long> Q1(f4 f4Var, int i2, long j2) {
    }

    public final void R1(int i2, int i3) {
    }

    @Override // k.d.a.a.q3
    public int S() {
    }

    public void S0(t2.a aVar) {
    }

    public final long S1(f4 f4Var, p0.b bVar, long j2) {
    }

    @Override // k.d.a.a.q3
    public int T() {
    }

    public final List<k3.c> T0(int i2, List<k.d.a.a.s4.p0> list) {
    }

    public final o3 T1(int i2, int i3) {
    }

    @Override // k.d.a.a.q3
    public f4 U() {
    }

    public final f3 U0() {
    }

    public final void U1(int i2, int i3) {
    }

    @Override // k.d.a.a.q3
    public Looper V() {
    }

    public void V0() {
    }

    public final void V1() {
    }

    @Override // k.d.a.a.q3
    public boolean W() {
    }

    public void W0(SurfaceHolder surfaceHolder) {
    }

    public final void W1(int i2, int i3, Object obj) {
    }

    @Override // k.d.a.a.q3
    public k.d.a.a.u4.a0 X() {
    }

    public final void X1() {
    }

    @Override // k.d.a.a.q3
    public long Y() {
    }

    public final f4 Y0() {
    }

    public void Y1(k.d.a.a.s4.p0 p0Var) {
    }

    public final List<k.d.a.a.s4.p0> Z0(List<e3> list) {
    }

    public void Z1(List<k.d.a.a.s4.p0> list) {
    }

    @Override // k.d.a.a.t2
    @Deprecated
    public void a(k.d.a.a.s4.p0 p0Var) {
    }

    public final s3 a1(s3.b bVar) {
    }

    public void a2(List<k.d.a.a.s4.p0> list, boolean z) {
    }

    @Override // k.d.a.a.t2
    public s3 b(s3.b bVar) {
    }

    @Override // k.d.a.a.q3
    public void b0(TextureView textureView) {
    }

    public final Pair<Boolean, Integer> b1(o3 o3Var, o3 o3Var2, boolean z, int i2, boolean z2, boolean z3) {
    }

    public final void b2(List<k.d.a.a.s4.p0> list, int i2, long j2, boolean z) {
    }

    @Override // k.d.a.a.t2
    public void c(k.d.a.a.j4.o1 o1Var) {
    }

    public boolean c1() {
    }

    public final void c2(SurfaceHolder surfaceHolder) {
    }

    @Override // k.d.a.a.q3
    public f3 d0() {
    }

    public final long d1(o3 o3Var) {
    }

    public final void d2(SurfaceTexture surfaceTexture) {
    }

    @Override // k.d.a.a.q3
    public long e0() {
    }

    public final int e1() {
    }

    public final void e2(Object obj) {
    }

    @Override // k.d.a.a.q3
    public p3 f() {
    }

    public final Pair<Object, Long> f1(f4 f4Var, f4 f4Var2) {
    }

    public void f2(SurfaceHolder surfaceHolder) {
    }

    public void g2(boolean z) {
    }

    @Override // k.d.a.a.q3
    public long getCurrentPosition() {
    }

    @Override // k.d.a.a.q3
    public long getDuration() {
    }

    @Override // k.d.a.a.q3
    public boolean h() {
    }

    public r2 h1() {
    }

    public final void h2(boolean z, r2 r2Var) {
    }

    @Override // k.d.a.a.q3
    public long i() {
    }

    public final q3.e i1(long j2) {
    }

    public final void i2() {
    }

    @Override // k.d.a.a.q3
    public boolean isLoading() {
    }

    @Override // k.d.a.a.h2
    public void j0(int i2, long j2, int i3, boolean z) {
    }

    public final q3.e j1(int i2, o3 o3Var, int i3) {
    }

    public final void j2(boolean z, int i2, int i3) {
    }

    @Override // k.d.a.a.q3
    public q3.b k() {
    }

    public final void k2(o3 o3Var, int i2, int i3, boolean z, boolean z2, int i4, long j2, int i5, boolean z3) {
    }

    public final void l1(v2.e eVar) {
    }

    public final void l2(boolean z) {
    }

    @Override // k.d.a.a.q3
    public boolean m() {
    }

    public final int m1(int i2) {
    }

    public final void m2() {
    }

    @Override // k.d.a.a.q3
    public void n(boolean z) {
    }

    public final void n2() {
    }

    @Override // k.d.a.a.q3
    public long p() {
    }

    @Override // k.d.a.a.q3
    public void prepare() {
    }

    @Override // k.d.a.a.q3
    public int q() {
    }

    public /* synthetic */ void q1(q3.d dVar, k.d.a.a.x4.q qVar) {
    }

    @Override // k.d.a.a.q3
    public void r(TextureView textureView) {
    }

    @Override // k.d.a.a.q3
    public void release() {
    }

    @Override // k.d.a.a.q3
    public k.d.a.a.y4.b0 s() {
    }

    public /* synthetic */ void s1(v2.e eVar) {
    }

    @Override // k.d.a.a.q3
    public void stop() {
    }

    @Override // k.d.a.a.q3
    public void t(q3.d dVar) {
    }

    @Override // k.d.a.a.q3
    public void u(List<e3> list, boolean z) {
    }

    public /* synthetic */ void u1(v2.e eVar) {
    }

    @Override // k.d.a.a.q3
    public int w() {
    }

    @Override // k.d.a.a.q3
    public void x(SurfaceView surfaceView) {
    }
}
