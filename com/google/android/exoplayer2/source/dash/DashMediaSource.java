package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;
import k.d.a.a.e3;
import k.d.a.a.f4;
import k.d.a.a.m4.b0;
import k.d.a.a.m4.d0;
import k.d.a.a.s4.c0;
import k.d.a.a.s4.m0;
import k.d.a.a.s4.m1.e;
import k.d.a.a.s4.m1.m;
import k.d.a.a.s4.m1.n.o;
import k.d.a.a.s4.p0;
import k.d.a.a.s4.q0;
import k.d.a.a.s4.r0;
import k.d.a.a.s4.v;
import k.d.a.a.w4.h0;
import k.d.a.a.w4.i;
import k.d.a.a.w4.i0;
import k.d.a.a.w4.j0;
import k.d.a.a.w4.k0;
import k.d.a.a.w4.o0;
import k.d.a.a.w4.r;
import k.d.a.a.x4.j0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public final class DashMediaSource extends v {
    public i0 A;
    public o0 B;
    public IOException C;
    public Handler D;
    public e3.g E;
    public Uri F;
    public Uri G;
    public k.d.a.a.s4.m1.n.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public final e3 h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f332i;

    /* renamed from: j, reason: collision with root package name */
    public final r.a f333j;

    /* renamed from: k, reason: collision with root package name */
    public final e.a f334k;

    /* renamed from: l, reason: collision with root package name */
    public final c0 f335l;

    /* renamed from: m, reason: collision with root package name */
    public final b0 f336m;

    /* renamed from: n, reason: collision with root package name */
    public final h0 f337n;

    /* renamed from: o, reason: collision with root package name */
    public final k.d.a.a.s4.m1.d f338o;

    /* renamed from: p, reason: collision with root package name */
    public final long f339p;

    /* renamed from: q, reason: collision with root package name */
    public final q0.a f340q;

    /* renamed from: r, reason: collision with root package name */
    public final k0.a<? extends k.d.a.a.s4.m1.n.c> f341r;

    /* renamed from: s, reason: collision with root package name */
    public final e f342s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f343t;
    public final SparseArray<k.d.a.a.s4.m1.g> u;
    public final Runnable v;
    public final Runnable w;
    public final m.b x;
    public final j0 y;
    public r z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class Factory implements r0 {
        public final e.a a;
        public final r.a b;
        public d0 c;
        public c0 d;
        public h0 e;
        public long f;
        public k0.a<? extends k.d.a.a.s4.m1.n.c> g;

        public Factory(r.a aVar) {
        }

        @Override // k.d.a.a.s4.p0.a
        public /* bridge */ /* synthetic */ p0 a(e3 e3Var) {
        }

        @Override // k.d.a.a.s4.p0.a
        public int[] b() {
        }

        @Override // k.d.a.a.s4.p0.a
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ p0.a c(d0 d0Var) {
        }

        @Override // k.d.a.a.s4.p0.a
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ p0.a d(h0 h0Var) {
        }

        public DashMediaSource e(e3 e3Var) {
        }

        @CanIgnoreReturnValue
        public Factory f(d0 d0Var) {
        }

        @CanIgnoreReturnValue
        public Factory g(h0 h0Var) {
        }

        public Factory(e.a aVar, r.a aVar2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a implements j0.b {
        public final /* synthetic */ DashMediaSource a;

        public a(DashMediaSource dashMediaSource) {
        }

        @Override // k.d.a.a.x4.j0.b
        public void a(IOException iOException) {
        }

        @Override // k.d.a.a.x4.j0.b
        public void b() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class b extends f4 {
        public final long e;
        public final long f;
        public final long g;
        public final int h;

        /* renamed from: i, reason: collision with root package name */
        public final long f344i;

        /* renamed from: j, reason: collision with root package name */
        public final long f345j;

        /* renamed from: k, reason: collision with root package name */
        public final long f346k;

        /* renamed from: l, reason: collision with root package name */
        public final k.d.a.a.s4.m1.n.c f347l;

        /* renamed from: m, reason: collision with root package name */
        public final e3 f348m;

        /* renamed from: n, reason: collision with root package name */
        public final e3.g f349n;

        public b(long j2, long j3, long j4, int i2, long j5, long j6, long j7, k.d.a.a.s4.m1.n.c cVar, e3 e3Var, e3.g gVar) {
        }

        public static boolean y(k.d.a.a.s4.m1.n.c cVar) {
        }

        @Override // k.d.a.a.f4
        public int f(Object obj) {
        }

        @Override // k.d.a.a.f4
        public f4.b k(int i2, f4.b bVar, boolean z) {
        }

        @Override // k.d.a.a.f4
        public int m() {
        }

        @Override // k.d.a.a.f4
        public Object q(int i2) {
        }

        @Override // k.d.a.a.f4
        public f4.d s(int i2, f4.d dVar, long j2) {
        }

        @Override // k.d.a.a.f4
        public int t() {
        }

        public final long x(long j2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class c implements m.b {
        public final /* synthetic */ DashMediaSource a;

        public c(DashMediaSource dashMediaSource) {
        }

        @Override // k.d.a.a.s4.m1.m.b
        public void a() {
        }

        @Override // k.d.a.a.s4.m1.m.b
        public void b(long j2) {
        }

        public /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class d implements k0.a<Long> {
        public static final Pattern a = null;

        @Override // k.d.a.a.w4.k0.a
        public /* bridge */ /* synthetic */ Long a(Uri uri, InputStream inputStream) throws IOException {
        }

        public Long b(Uri uri, InputStream inputStream) throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class e implements i0.b<k0<k.d.a.a.s4.m1.n.c>> {
        public final /* synthetic */ DashMediaSource a;

        public e(DashMediaSource dashMediaSource) {
        }

        public void a(k0<k.d.a.a.s4.m1.n.c> k0Var, long j2, long j3, boolean z) {
        }

        public void b(k0<k.d.a.a.s4.m1.n.c> k0Var, long j2, long j3) {
        }

        public i0.c c(k0<k.d.a.a.s4.m1.n.c> k0Var, long j2, long j3, IOException iOException, int i2) {
        }

        @Override // k.d.a.a.w4.i0.b
        public /* bridge */ /* synthetic */ void j(k0<k.d.a.a.s4.m1.n.c> k0Var, long j2, long j3, boolean z) {
        }

        @Override // k.d.a.a.w4.i0.b
        public /* bridge */ /* synthetic */ void k(k0<k.d.a.a.s4.m1.n.c> k0Var, long j2, long j3) {
        }

        @Override // k.d.a.a.w4.i0.b
        public /* bridge */ /* synthetic */ i0.c s(k0<k.d.a.a.s4.m1.n.c> k0Var, long j2, long j3, IOException iOException, int i2) {
        }

        public /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class f implements k.d.a.a.w4.j0 {
        public final /* synthetic */ DashMediaSource a;

        public f(DashMediaSource dashMediaSource) {
        }

        @Override // k.d.a.a.w4.j0
        public void a() throws IOException {
        }

        public final void b() throws IOException {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public final class g implements i0.b<k0<Long>> {
        public final /* synthetic */ DashMediaSource a;

        public g(DashMediaSource dashMediaSource) {
        }

        public void a(k0<Long> k0Var, long j2, long j3, boolean z) {
        }

        public void b(k0<Long> k0Var, long j2, long j3) {
        }

        public i0.c c(k0<Long> k0Var, long j2, long j3, IOException iOException, int i2) {
        }

        @Override // k.d.a.a.w4.i0.b
        public /* bridge */ /* synthetic */ void j(k0<Long> k0Var, long j2, long j3, boolean z) {
        }

        @Override // k.d.a.a.w4.i0.b
        public /* bridge */ /* synthetic */ void k(k0<Long> k0Var, long j2, long j3) {
        }

        @Override // k.d.a.a.w4.i0.b
        public /* bridge */ /* synthetic */ i0.c s(k0<Long> k0Var, long j2, long j3, IOException iOException, int i2) {
        }

        public /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static final class h implements k0.a<Long> {
        public h() {
        }

        @Override // k.d.a.a.w4.k0.a
        public /* bridge */ /* synthetic */ Long a(Uri uri, InputStream inputStream) throws IOException {
        }

        public Long b(Uri uri, InputStream inputStream) throws IOException {
        }

        public /* synthetic */ h(a aVar) {
        }
    }

    public /* synthetic */ DashMediaSource(e3 e3Var, k.d.a.a.s4.m1.n.c cVar, r.a aVar, k0.a aVar2, e.a aVar3, c0 c0Var, b0 b0Var, h0 h0Var, long j2, a aVar4) {
    }

    public static /* synthetic */ void F(DashMediaSource dashMediaSource, long j2) {
    }

    public static /* synthetic */ void G(DashMediaSource dashMediaSource, IOException iOException) {
    }

    public static /* synthetic */ i0 H(DashMediaSource dashMediaSource) {
    }

    public static /* synthetic */ IOException I(DashMediaSource dashMediaSource) {
    }

    public static long J(k.d.a.a.s4.m1.n.g gVar, long j2, long j3) {
    }

    public static long K(k.d.a.a.s4.m1.n.g gVar, long j2, long j3) {
    }

    public static long L(k.d.a.a.s4.m1.n.c cVar, long j2) {
    }

    public static boolean N(k.d.a.a.s4.m1.n.g gVar) {
    }

    public static boolean O(k.d.a.a.s4.m1.n.g gVar) {
    }

    public static /* synthetic */ void P(DashMediaSource dashMediaSource) {
    }

    private /* synthetic */ void Q() {
    }

    @Override // k.d.a.a.s4.v
    public void C(o0 o0Var) {
    }

    @Override // k.d.a.a.s4.v
    public void E() {
    }

    public final long M() {
    }

    public /* synthetic */ void R() {
    }

    public final void S() {
    }

    public void T(long j2) {
    }

    public void U() {
    }

    public void V(k0<?> k0Var, long j2, long j3) {
    }

    public void W(k0<k.d.a.a.s4.m1.n.c> k0Var, long j2, long j3) {
    }

    public i0.c X(k0<k.d.a.a.s4.m1.n.c> k0Var, long j2, long j3, IOException iOException, int i2) {
    }

    public void Y(k0<Long> k0Var, long j2, long j3) {
    }

    public i0.c Z(k0<Long> k0Var, long j2, long j3, IOException iOException) {
    }

    @Override // k.d.a.a.s4.p0
    public m0 a(p0.b bVar, i iVar, long j2) {
    }

    public final void a0(IOException iOException) {
    }

    public final void b0(long j2) {
    }

    public final void c0(boolean z) {
    }

    public final void d0(o oVar) {
    }

    public final void e0(o oVar) {
    }

    public final void f0(o oVar, k0.a<Long> aVar) {
    }

    public final void g0(long j2) {
    }

    public final <T> void h0(k0<T> k0Var, i0.b<k0<T>> bVar, int i2) {
    }

    @Override // k.d.a.a.s4.p0
    public e3 i() {
    }

    public final void i0() {
    }

    public final void j0(long j2, long j3) {
    }

    @Override // k.d.a.a.s4.p0
    public void n() throws IOException {
    }

    @Override // k.d.a.a.s4.p0
    public void p(m0 m0Var) {
    }

    public DashMediaSource(e3 e3Var, k.d.a.a.s4.m1.n.c cVar, r.a aVar, k0.a<? extends k.d.a.a.s4.m1.n.c> aVar2, e.a aVar3, c0 c0Var, b0 b0Var, h0 h0Var, long j2) {
    }
}
