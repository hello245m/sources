package k.d.a.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k.d.a.a.f4;
import k.d.a.a.k3;
import k.d.a.a.o2;
import k.d.a.a.s3;
import k.d.a.a.s4.m0;
import k.d.a.a.s4.p0;
import k.d.a.a.u4.c0;
import k.d.a.a.w3;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class v2 implements Handler.Callback, m0.a, c0.a, k3.d, o2.a, s3.a {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public h K;
    public long L;
    public int M;
    public boolean N;
    public r2 O;
    public long P;
    public final w3[] a;
    public final Set<w3> b;
    public final y3[] c;
    public final k.d.a.a.u4.c0 d;
    public final k.d.a.a.u4.d0 e;
    public final d3 f;
    public final k.d.a.a.w4.l g;
    public final k.d.a.a.x4.t h;

    /* renamed from: i, reason: collision with root package name */
    public final HandlerThread f5022i;

    /* renamed from: j, reason: collision with root package name */
    public final Looper f5023j;

    /* renamed from: k, reason: collision with root package name */
    public final f4.d f5024k;

    /* renamed from: l, reason: collision with root package name */
    public final f4.b f5025l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5026m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5027n;

    /* renamed from: o, reason: collision with root package name */
    public final o2 f5028o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList<d> f5029p;

    /* renamed from: q, reason: collision with root package name */
    public final k.d.a.a.x4.h f5030q;

    /* renamed from: r, reason: collision with root package name */
    public final f f5031r;

    /* renamed from: s, reason: collision with root package name */
    public final i3 f5032s;

    /* renamed from: t, reason: collision with root package name */
    public final k3 f5033t;
    public final c3 u;
    public final long v;
    public b4 w;
    public o3 x;
    public e y;
    public boolean z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements w3.a {
        public final /* synthetic */ v2 a;

        public a(v2 v2Var) {
        }

        @Override // k.d.a.a.w3.a
        public void a() {
        }

        @Override // k.d.a.a.w3.a
        public void b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b {
        public final List<k3.c> a;
        public final k.d.a.a.s4.b1 b;
        public final int c;
        public final long d;

        public /* synthetic */ b(List list, k.d.a.a.s4.b1 b1Var, int i2, long j2, a aVar) {
        }

        public static /* synthetic */ int a(b bVar) {
        }

        public static /* synthetic */ List b(b bVar) {
        }

        public static /* synthetic */ k.d.a.a.s4.b1 c(b bVar) {
        }

        public static /* synthetic */ long d(b bVar) {
        }

        public b(List<k3.c> list, k.d.a.a.s4.b1 b1Var, int i2, long j2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c {
        public final int a;
        public final int b;
        public final int c;
        public final k.d.a.a.s4.b1 d;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d implements Comparable<d> {
        public final s3 a;
        public int b;
        public long c;
        public Object d;

        public d(s3 s3Var) {
        }

        public int a(d dVar) {
        }

        public void b(int i2, long j2, Object obj) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(d dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class e {
        public boolean a;
        public o3 b;
        public int c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;

        public e(o3 o3Var) {
        }

        public static /* synthetic */ boolean a(e eVar) {
        }

        public void b(int i2) {
        }

        public void c(int i2) {
        }

        public void d(o3 o3Var) {
        }

        public void e(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public interface f {
        void a(e eVar);
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class g {
        public final p0.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public g(p0.b bVar, long j2, long j3, boolean z, boolean z2, boolean z3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class h {
        public final f4 a;
        public final int b;
        public final long c;

        public h(f4 f4Var, int i2, long j2) {
        }
    }

    public v2(w3[] w3VarArr, k.d.a.a.u4.c0 c0Var, k.d.a.a.u4.d0 d0Var, d3 d3Var, k.d.a.a.w4.l lVar, int i2, boolean z, k.d.a.a.j4.m1 m1Var, b4 b4Var, c3 c3Var, long j2, boolean z2, Looper looper, k.d.a.a.x4.h hVar, f fVar, k.d.a.a.j4.t1 t1Var, Looper looper2) {
    }

    public static boolean N(boolean z, p0.b bVar, long j2, p0.b bVar2, f4.b bVar3, long j3) {
    }

    public static boolean P(w3 w3Var) {
    }

    public static boolean R(o3 o3Var, f4.b bVar) {
    }

    private /* synthetic */ Boolean S() {
    }

    private /* synthetic */ void U(s3 s3Var) {
    }

    public static /* synthetic */ boolean f(v2 v2Var, boolean z) {
    }

    public static /* synthetic */ k.d.a.a.x4.t g(v2 v2Var) {
    }

    public static void u0(f4 f4Var, d dVar, f4.d dVar2, f4.b bVar) {
    }

    public static y2[] v(k.d.a.a.u4.v vVar) {
    }

    public static boolean v0(d dVar, f4 f4Var, f4 f4Var2, int i2, boolean z, f4.d dVar2, f4.b bVar) {
    }

    public static g x0(f4 f4Var, o3 o3Var, h hVar, i3 i3Var, int i2, boolean z, f4.d dVar, f4.b bVar) {
    }

    public static Pair<Object, Long> y0(f4 f4Var, h hVar, boolean z, int i2, boolean z2, f4.d dVar, f4.b bVar) {
    }

    public static Object z0(f4.d dVar, f4.b bVar, int i2, boolean z, Object obj, f4 f4Var, f4 f4Var2) {
    }

    @Override // k.d.a.a.o2.a
    public void A(p3 p3Var) {
    }

    public final void A0(long j2, long j3) {
    }

    public final long B() {
    }

    public void B0(f4 f4Var, int i2, long j2) {
    }

    public final long C(long j2) {
    }

    public final void C0(boolean z) throws r2 {
    }

    public final void D(k.d.a.a.s4.m0 m0Var) {
    }

    public final void D0(h hVar) throws r2 {
    }

    public final void E(IOException iOException, int i2) {
    }

    public final long E0(p0.b bVar, long j2, boolean z) throws r2 {
    }

    public final void F(boolean z) {
    }

    public final long F0(p0.b bVar, long j2, boolean z, boolean z2) throws r2 {
    }

    public final void G(f4 f4Var, boolean z) throws r2 {
    }

    public final void G0(s3 s3Var) throws r2 {
    }

    public final void H(k.d.a.a.s4.m0 m0Var) throws r2 {
    }

    public final void H0(s3 s3Var) throws r2 {
    }

    public final void I(p3 p3Var, float f2, boolean z, boolean z2) throws r2 {
    }

    public final void I0(s3 s3Var) {
    }

    public final void J(p3 p3Var, boolean z) throws r2 {
    }

    public final void J0(long j2) {
    }

    public final o3 K(p0.b bVar, long j2, long j3, long j4, boolean z, int i2) {
    }

    public final void K0(w3 w3Var, long j2) {
    }

    public final boolean L(w3 w3Var, g3 g3Var) {
    }

    public final void L0(boolean z, AtomicBoolean atomicBoolean) {
    }

    public final boolean M() {
    }

    public final void M0(p3 p3Var) {
    }

    public final void N0(b bVar) throws r2 {
    }

    public final boolean O() {
    }

    public void O0(List<k3.c> list, int i2, long j2, k.d.a.a.s4.b1 b1Var) {
    }

    public final void P0(boolean z) {
    }

    public final boolean Q() {
    }

    public final void Q0(boolean z) throws r2 {
    }

    public void R0(boolean z, int i2) {
    }

    public final void S0(boolean z, int i2, boolean z2, int i3) throws r2 {
    }

    public /* synthetic */ Boolean T() {
    }

    public final void T0(p3 p3Var) throws r2 {
    }

    public void U0(int i2) {
    }

    public /* synthetic */ void V(s3 s3Var) {
    }

    public final void V0(int i2) throws r2 {
    }

    public final void W() {
    }

    public final void W0(b4 b4Var) {
    }

    public final void X() {
    }

    public void X0(boolean z) {
    }

    public final void Y(long j2, long j3) throws r2 {
    }

    public final void Y0(boolean z) throws r2 {
    }

    public final void Z() throws r2 {
    }

    public final void Z0(k.d.a.a.s4.b1 b1Var) throws r2 {
    }

    public final void a0() throws r2 {
    }

    public final void a1(int i2) {
    }

    @Override // k.d.a.a.u4.c0.a
    public void b() {
    }

    public final void b0() throws r2 {
    }

    public final boolean b1() {
    }

    @Override // k.d.a.a.s3.a
    public synchronized void c(s3 s3Var) {
    }

    public final void c0() throws r2 {
    }

    public final boolean c1() {
    }

    @Override // k.d.a.a.s4.a1.a
    public /* bridge */ /* synthetic */ void d(k.d.a.a.s4.m0 m0Var) {
    }

    public final void d0() throws r2 {
    }

    public final boolean d1() {
    }

    @Override // k.d.a.a.k3.d
    public void e() {
    }

    public final void e0(c cVar) throws r2 {
    }

    public final boolean e1(boolean z) {
    }

    public final void f0() {
    }

    public final boolean f1(f4 f4Var, p0.b bVar) {
    }

    public final void g0(boolean z) {
    }

    public final void g1() throws r2 {
    }

    public final void h(b bVar, int i2) throws r2 {
    }

    public final void h0() {
    }

    public void h1() {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
    }

    public void i0(k.d.a.a.s4.m0 m0Var) {
    }

    public final void i1(boolean z, boolean z2) {
    }

    @Override // k.d.a.a.s4.m0.a
    public void j(k.d.a.a.s4.m0 m0Var) {
    }

    public void j0() {
    }

    public final void j1() throws r2 {
    }

    public final void k() throws r2 {
    }

    public final void k0() {
    }

    public final void k1() {
    }

    public final void l(s3 s3Var) throws r2 {
    }

    public synchronized boolean l0() {
    }

    public final void l1(k.d.a.a.s4.h1 h1Var, k.d.a.a.u4.d0 d0Var) {
    }

    public final void m(w3 w3Var) throws r2 {
    }

    public final void m0() {
    }

    public final void m1() throws r2 {
    }

    public final void n() throws r2, IOException {
    }

    public final void n0(int i2, int i3, k.d.a.a.s4.b1 b1Var) throws r2 {
    }

    public final void n1() throws r2 {
    }

    public final void o(int i2, boolean z) throws r2 {
    }

    public void o0(int i2, int i3, k.d.a.a.s4.b1 b1Var) {
    }

    public final void o1(f4 f4Var, p0.b bVar, f4 f4Var2, p0.b bVar2, long j2, boolean z) throws r2 {
    }

    public final void p() throws r2 {
    }

    public final boolean p0() throws r2 {
    }

    public final void p1(float f2) {
    }

    public final void q(boolean[] zArr) throws r2 {
    }

    public final void q0() throws r2 {
    }

    public final synchronized void q1(k.d.b.a.p<Boolean> pVar, long j2) {
    }

    public final void r(w3 w3Var) {
    }

    public final void r0(boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public void s(long j2) {
    }

    public final void s0() {
    }

    public final k.d.b.b.s<k.d.a.a.p4.a> t(k.d.a.a.u4.v[] vVarArr) {
    }

    public final void t0(long j2) throws r2 {
    }

    public final long u() {
    }

    public final long w(f4 f4Var, Object obj, long j2) {
    }

    public final void w0(f4 f4Var, f4 f4Var2) {
    }

    public final long x() {
    }

    public final Pair<p0.b, Long> y(f4 f4Var) {
    }

    public Looper z() {
    }
}
