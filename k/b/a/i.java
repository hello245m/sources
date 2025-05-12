package k.b.a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import k.b.a.b;
import k.b.a.h;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class i {

    /* renamed from: i, reason: collision with root package name */
    public static HashSet<String> f3870i;
    public Canvas a;
    public float b;
    public k.b.a.h c;
    public h d;
    public Stack<h> e;
    public Stack<h.j0> f;
    public Stack<Matrix> g;
    public b.q h;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;
        public static final /* synthetic */ int[] b = null;
        public static final /* synthetic */ int[] c = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b implements h.x {
        public List<c> a;
        public float b;
        public float c;
        public c d;
        public boolean e;
        public boolean f;
        public int g;
        public boolean h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ i f3871i;

        public b(i iVar, h.w wVar) {
        }

        @Override // k.b.a.h.x
        public void a(float f, float f2, float f3, float f4) {
        }

        @Override // k.b.a.h.x
        public void b(float f, float f2) {
        }

        @Override // k.b.a.h.x
        public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        }

        @Override // k.b.a.h.x
        public void close() {
        }

        @Override // k.b.a.h.x
        public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        }

        @Override // k.b.a.h.x
        public void e(float f, float f2) {
        }

        public List<c> f() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class c {
        public float a;
        public float b;
        public float c;
        public float d;
        public boolean e;

        public c(i iVar, float f, float f2, float f3, float f4) {
        }

        public void a(float f, float f2) {
        }

        public void b(c cVar) {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements h.x {
        public Path a;
        public float b;
        public float c;

        public d(i iVar, h.w wVar) {
        }

        @Override // k.b.a.h.x
        public void a(float f, float f2, float f3, float f4) {
        }

        @Override // k.b.a.h.x
        public void b(float f, float f2) {
        }

        @Override // k.b.a.h.x
        public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        }

        @Override // k.b.a.h.x
        public void close() {
        }

        @Override // k.b.a.h.x
        public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        }

        @Override // k.b.a.h.x
        public void e(float f, float f2) {
        }

        public Path f() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e extends f {
        public Path d;
        public final /* synthetic */ i e;

        public e(i iVar, Path path, float f, float f2) {
        }

        @Override // k.b.a.i.f, k.b.a.i.j
        public void b(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class f extends j {
        public float a;
        public float b;
        public final /* synthetic */ i c;

        public f(i iVar, float f, float f2) {
        }

        @Override // k.b.a.i.j
        public void b(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class g extends j {
        public float a;
        public float b;
        public Path c;
        public final /* synthetic */ i d;

        public g(i iVar, float f, float f2, Path path) {
        }

        @Override // k.b.a.i.j
        public boolean a(h.y0 y0Var) {
        }

        @Override // k.b.a.i.j
        public void b(String str) {
        }
    }

    /* renamed from: k.b.a.i$i, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class C0218i extends j {
        public float a;
        public float b;
        public RectF c;
        public final /* synthetic */ i d;

        public C0218i(i iVar, float f, float f2) {
        }

        @Override // k.b.a.i.j
        public boolean a(h.y0 y0Var) {
        }

        @Override // k.b.a.i.j
        public void b(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public abstract class j {
        public j(i iVar) {
        }

        public boolean a(h.y0 y0Var) {
        }

        public abstract void b(String str);

        public /* synthetic */ j(i iVar, a aVar) {
        }
    }

    public i(Canvas canvas, float f2) {
    }

    public static double B(double d2) {
    }

    public static int C(float f2) {
    }

    public static int F(int i2, float f2) {
    }

    public static void G(String str, Object... objArr) {
    }

    public static void N(String str, Object... objArr) {
    }

    public static /* synthetic */ void a(String str, Object[] objArr) {
    }

    public static /* synthetic */ boolean b(i iVar) {
    }

    public static /* synthetic */ h c(i iVar) {
    }

    public static /* synthetic */ Canvas d(i iVar) {
    }

    public static synchronized void d0() {
    }

    public static /* synthetic */ void e(String str, Object[] objArr) {
    }

    public static /* synthetic */ void f(float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, float f7, float f8, h.x xVar) {
    }

    public static /* synthetic */ void g(String str, Object[] objArr) {
    }

    public static void h1(String str, Object... objArr) {
    }

    public static void m(float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, float f7, float f8, h.x xVar) {
    }

    public static float[] n(double d2, double d3) {
    }

    public final void A(h.n0 n0Var) {
    }

    public final void A0(h.q qVar) {
    }

    public final void B0(h.v vVar) {
    }

    public final void C0(h.z zVar) {
    }

    public final void D() {
    }

    public final void D0(h.a0 a0Var) {
    }

    public final void E() {
    }

    public final void E0(h.b0 b0Var) {
    }

    public final void F0(h.f0 f0Var) {
    }

    public final void G0(h.f0 f0Var, h.b bVar) {
    }

    public final void H(boolean z, h.b bVar, h.u uVar) {
    }

    public final void H0(h.f0 f0Var, h.b bVar, h.b bVar2, k.b.a.f fVar) {
    }

    public final boolean I() {
    }

    public final void I0(h.n0 n0Var) {
    }

    public final void J(h.k0 k0Var, Path path) {
    }

    public final void J0(h.s0 s0Var) {
    }

    public final void K(Path path) {
    }

    public final void K0(h.t0 t0Var, h.b bVar) {
    }

    public final float L(float f2, float f3, float f4, float f5) {
    }

    public final void L0(h.w0 w0Var) {
    }

    public final void M(h.y0 y0Var, j jVar) {
    }

    public final void M0(h.e1 e1Var) {
    }

    public final void N0(h.j0 j0Var, boolean z) {
    }

    public final void O(h.y0 y0Var, StringBuilder sb) {
    }

    public void O0(k.b.a.h hVar, k.b.a.g gVar) {
    }

    public final void P(h.j jVar, String str) {
    }

    public final void P0(h.r rVar, c cVar) {
    }

    public final void Q(h.m0 m0Var, h.m0 m0Var2) {
    }

    public final void Q0(h.l lVar) {
    }

    public final void R(h.q0 q0Var, h.q0 q0Var2) {
    }

    public final void R0(h.s sVar, h.k0 k0Var, h.b bVar) {
    }

    public final void S(h.y yVar, String str) {
    }

    public final void S0(h.s0 s0Var) {
    }

    public final void T(h.k0 k0Var, Path path, h.y yVar) {
    }

    public final void T0(h.z0 z0Var) {
    }

    public final h U(h.n0 n0Var) {
    }

    public final boolean U0() {
    }

    public final h V(h.n0 n0Var, h hVar) {
    }

    public final void V0() {
    }

    public final h.e0.f W() {
    }

    public final void W0(float f2, float f3, float f4, float f5) {
    }

    public final Path.FillType X() {
    }

    public final void X0(h hVar, boolean z, h.o0 o0Var) {
    }

    public float Y() {
    }

    public final void Y0(boolean z, h.c0 c0Var) {
    }

    public float Z() {
    }

    public final void Z0() {
    }

    public h.b a0() {
    }

    public final void a1() {
    }

    public float b0() {
    }

    public final String b1(String str, boolean z, boolean z2) {
    }

    public final Path.FillType c0() {
    }

    public final void c1(h.k0 k0Var) {
    }

    public final void d1(h hVar, h.e0 e0Var) {
    }

    public final boolean e0(h.e0 e0Var, long j2) {
    }

    public final void e1(h hVar, h.l0 l0Var) {
    }

    public final void f0(boolean z, h.b bVar, h.m0 m0Var) {
    }

    public final void f1() {
    }

    public final Path g0(h.d dVar) {
    }

    public final boolean g1() {
    }

    public final void h(h.l lVar, Path path, Matrix matrix) {
    }

    public final Path h0(h.i iVar) {
    }

    public final void i(h.v vVar, Path path, Matrix matrix) {
    }

    public final Path i0(h.q qVar) {
    }

    public final void j(h.n0 n0Var, boolean z, Path path, Matrix matrix) {
    }

    public final Path j0(h.z zVar) {
    }

    public final void k(h.w0 w0Var, Path path, Matrix matrix) {
    }

    public final Path k0(h.b0 b0Var) {
    }

    public final void l(h.e1 e1Var, Path path, Matrix matrix) {
    }

    public final Path l0(h.w0 w0Var) {
    }

    public final void m0(boolean z, h.b bVar, h.q0 q0Var) {
    }

    public final h.b n0(h.p pVar, h.p pVar2, h.p pVar3, h.p pVar4) {
    }

    @TargetApi(19)
    public final Path o(h.k0 k0Var, h.b bVar) {
    }

    @TargetApi(19)
    public final Path o0(h.k0 k0Var, boolean z) {
    }

    public final List<c> p(h.q qVar) {
    }

    public final void p0() {
    }

    public final List<c> q(h.z zVar) {
    }

    public final void q0(h.j0 j0Var) {
    }

    public final h.b r(Path path) {
    }

    public final void r0(h.k0 k0Var) {
    }

    public final float s(h.y0 y0Var) {
    }

    public final void s0(h.k0 k0Var, h.b bVar) {
    }

    public final Matrix t(h.b bVar, h.b bVar2, k.b.a.f fVar) {
    }

    public final void t0(h.n0 n0Var, j jVar) {
    }

    public final void u(h.k0 k0Var) {
    }

    public final boolean u0() {
    }

    public final void v(h.k0 k0Var, h.b bVar) {
    }

    public final c v0(c cVar, c cVar2, c cVar3) {
    }

    public final void w(h.k0 k0Var, h.b bVar) {
    }

    public final void w0(h.d dVar) {
    }

    public final void x(h.k0 k0Var) {
    }

    public final void x0(h.i iVar) {
    }

    public final Bitmap y(String str) {
    }

    public final void y0(h.m mVar) {
    }

    public final Typeface z(String str, Integer num, h.e0.b bVar) {
    }

    public final void z0(h.o oVar) {
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class k extends j {
        public float a;
        public final /* synthetic */ i b;

        public k(i iVar) {
        }

        @Override // k.b.a.i.j
        public void b(String str) {
        }

        public /* synthetic */ k(i iVar, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class h {
        public h.e0 a;
        public boolean b;
        public boolean c;
        public Paint d;
        public Paint e;
        public h.b f;
        public h.b g;
        public boolean h;

        public h(i iVar) {
        }

        public h(i iVar, h hVar) {
        }
    }
}
