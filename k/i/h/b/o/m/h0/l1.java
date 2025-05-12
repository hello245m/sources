package k.i.h.b.o.m.h0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mp.framework.ui.widget.recyclerview.RefreshRecyclerView;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k.i.h.b.e0.e.a;
import q.gd;
import q.hd;
import q.ld;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class l1 extends i1 {
    public final ConcurrentHashMap<String, k.i.h.b.o.m.i0.r> e;
    public final List<k.i.h.b.o.m.i0.r> f;
    public k.i.h.b.o.m.f0.f1 g;
    public RefreshRecyclerView h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7518i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7519j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7520k;

    /* renamed from: l, reason: collision with root package name */
    public ProgressBar f7521l;

    /* renamed from: m, reason: collision with root package name */
    public k.i.h.b.h.a.a.e.f.c f7522m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f7523n;

    /* renamed from: o, reason: collision with root package name */
    public int f7524o;

    /* renamed from: p, reason: collision with root package name */
    public int f7525p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7526q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7527r;

    /* renamed from: s, reason: collision with root package name */
    public k.i.h.b.o.i.b0 f7528s;

    /* renamed from: t, reason: collision with root package name */
    public String f7529t;
    public boolean u;
    public k.i.h.b.o.l.a v;
    public final d w;
    public a x;
    public Map<Integer, View> y;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a implements Serializable {

        /* renamed from: n, reason: collision with root package name */
        public static final C0608a f7530n = null;
        public final long a;
        public final boolean b;
        public final boolean c;
        public final int d;
        public final long e;
        public final long f;
        public final int g;
        public final int h;

        /* renamed from: i, reason: collision with root package name */
        public final int f7531i;

        /* renamed from: j, reason: collision with root package name */
        public final int f7532j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f7533k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f7534l;

        /* renamed from: m, reason: collision with root package name */
        public final String f7535m;

        /* renamed from: k.i.h.b.o.m.h0.l1$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class C0608a {
            public C0608a() {
            }

            public /* synthetic */ C0608a(n.d0.d.h hVar) {
            }

            public final a a(k.i.h.b.o.l.b.c cVar) {
            }
        }

        public a(long j2, boolean z, boolean z2, int i2, long j3, long j4, int i3, int i4, int i5, int i6, boolean z3, boolean z4, String str) {
        }

        public final boolean a() {
        }

        public final long b() {
        }

        public final int c() {
        }

        public final boolean d() {
        }

        public final String e() {
        }

        public boolean equals(Object obj) {
        }

        public final long f() {
        }

        public final long g() {
        }

        public final boolean h() {
        }

        public int hashCode() {
        }

        public final boolean i() {
        }

        public final int j() {
        }

        public final int k() {
        }

        public final int l() {
        }

        public final int m() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.d0.d.o implements n.d0.c.l<Integer, n.u> {
        public final /* synthetic */ l1 a;
        public final /* synthetic */ List<a.C0486a> b;
        public final /* synthetic */ a.C0486a c;
        public final /* synthetic */ List<hd> d;
        public final /* synthetic */ hd e;

        public b(l1 l1Var, List<a.C0486a> list, a.C0486a c0486a, List<hd> list2, hd hdVar) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ l1 a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ n.d0.d.y c;
        public final /* synthetic */ n.d0.d.y d;

        public c(l1 l1Var, boolean z, n.d0.d.y yVar, n.d0.d.y yVar2) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d implements k.i.h.b.o.i.a0 {
        public final /* synthetic */ l1 a;

        public d(l1 l1Var) {
        }

        @Override // k.i.h.b.d.q0.a
        public /* bridge */ /* synthetic */ void S(k.i.h.b.e0.e.a aVar, boolean z) {
        }

        @Override // k.i.h.b.d.q0.a
        public /* bridge */ /* synthetic */ void V(ld ldVar, boolean z) {
        }

        public void a(k.i.h.b.e0.e.a aVar, boolean z) {
        }

        public void b(ld ldVar, boolean z) {
        }

        @Override // k.i.h.b.d.q0.a
        public void n(int i2, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends n.d0.d.o implements n.d0.c.l<String, n.u> {
        public final /* synthetic */ l1 a;
        public final /* synthetic */ k.i.h.b.o.m.i0.r b;

        public e(l1 l1Var, k.i.h.b.o.m.i0.r rVar) {
        }

        public final void b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f implements k.i.h.b.o.m.i0.n<k.i.h.b.o.m.i0.r> {
        public final /* synthetic */ l1 a;

        public f(l1 l1Var) {
        }

        @Override // k.i.h.b.o.m.i0.n
        public /* bridge */ /* synthetic */ void a(k.i.h.b.o.m.i0.r rVar, View view, int i2) {
        }

        public void b(k.i.h.b.o.m.i0.r rVar, View view, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends n.d0.d.o implements n.d0.c.l<Integer, n.u> {
        public final /* synthetic */ k.i.h.b.h.a.a.i.a a;
        public final /* synthetic */ l1 b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<n.u> {
            public final /* synthetic */ l1 a;

            public a(l1 l1Var) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public g(k.i.h.b.h.a.a.i.a aVar, l1 l1Var) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ PopupWindow a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;
        public final /* synthetic */ l1 d;

        public h(PopupWindow popupWindow, View view, int i2, l1 l1Var) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ l1 a;
        public final /* synthetic */ PopupWindow b;
        public final /* synthetic */ int c;

        public i(l1 l1Var, PopupWindow popupWindow, int i2) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    public static final /* synthetic */ k.i.h.b.o.m.f0.f1 A0(l1 l1Var) {
    }

    public static final /* synthetic */ List E0(l1 l1Var) {
    }

    public static final /* synthetic */ RefreshRecyclerView F0(l1 l1Var) {
    }

    public static final /* synthetic */ boolean G0(l1 l1Var) {
    }

    public static final /* synthetic */ boolean I0(l1 l1Var) {
    }

    public static final void K1(PopupWindow popupWindow, View view) {
    }

    public static final /* synthetic */ boolean L0(l1 l1Var) {
    }

    public static final /* synthetic */ void M0(l1 l1Var, boolean z) {
    }

    public static final /* synthetic */ void O0(l1 l1Var, View view, int i2, k.i.h.b.o.m.i0.r rVar) {
    }

    public static final /* synthetic */ void P0(l1 l1Var) {
    }

    public static final /* synthetic */ void Q0(l1 l1Var, boolean z) {
    }

    public static final /* synthetic */ void R0(l1 l1Var, boolean z) {
    }

    public static final /* synthetic */ void S0(l1 l1Var, boolean z) {
    }

    public static final /* synthetic */ void T0(l1 l1Var, String str) {
    }

    public static final /* synthetic */ void U0(l1 l1Var, boolean z) {
    }

    public static final /* synthetic */ void V0(l1 l1Var) {
    }

    public static final /* synthetic */ void W0(l1 l1Var, int i2) {
    }

    public static /* synthetic */ void Y0(l1 l1Var, List list, a.C0486a c0486a, List list2, hd hdVar, int i2, Object obj) {
    }

    public static /* synthetic */ void b1(l1 l1Var, PopupWindow popupWindow, float f2, int i2, Object obj) {
    }

    public static final int d1(k.i.h.b.o.m.i0.r rVar, k.i.h.b.o.m.i0.r rVar2) {
    }

    public static final int e1(k.i.h.b.o.m.i0.r rVar, k.i.h.b.o.m.i0.r rVar2) {
    }

    public static final void g1(l1 l1Var, k.i.h.b.o.m.i0.r rVar, k.i.h.b.d.w0.c.i iVar) {
    }

    public static final void l1(l1 l1Var) {
    }

    public static final boolean m1(l1 l1Var, View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ void n1(l1 l1Var, k.i.h.b.o.m.i0.r rVar, k.i.h.b.d.w0.c.i iVar) {
    }

    public static /* synthetic */ void o1(PopupWindow popupWindow, View view) {
    }

    public static /* synthetic */ boolean p1(l1 l1Var, View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ int q1(k.i.h.b.o.m.i0.r rVar, k.i.h.b.o.m.i0.r rVar2) {
    }

    public static /* synthetic */ void r1(l1 l1Var) {
    }

    public static /* synthetic */ int s1(k.i.h.b.o.m.i0.r rVar, k.i.h.b.o.m.i0.r rVar2) {
    }

    public static /* synthetic */ void t1(l1 l1Var) {
    }

    public static final /* synthetic */ void v0(l1 l1Var, List list, a.C0486a c0486a, List list2, hd hdVar) {
    }

    public static final /* synthetic */ void x0(l1 l1Var, k.i.h.b.o.m.i0.r rVar, String str) {
    }

    public static final /* synthetic */ a y0(l1 l1Var) {
    }

    public static final void y1(l1 l1Var) {
    }

    public final void A1(k.i.h.b.o.m.i0.r rVar, gd gdVar) {
    }

    public final void B1() {
    }

    public final void C1(View view) {
    }

    public final void D1(String str) {
    }

    public final void E1() {
    }

    public final void F1() {
    }

    public final void G1(boolean z) {
    }

    public final void H1() {
    }

    public final void I1(boolean z) {
    }

    public final void J1(int i2) {
    }

    public final void L1(a aVar) {
    }

    public final void X0(List<a.C0486a> list, a.C0486a c0486a, List<hd> list2, hd hdVar) {
    }

    public final boolean Z0() {
    }

    public final void a1(PopupWindow popupWindow, float f2) {
    }

    @Override // k.i.h.b.o.m.h0.i1
    public void c0() {
    }

    public final void c1(List<a.C0486a> list, a.C0486a c0486a, List<hd> list2, hd hdVar) {
    }

    @Override // k.i.h.b.o.m.h0.i1
    public void d0() {
    }

    public final void f1(k.i.h.b.o.m.i0.r rVar, String str) {
    }

    public final int h1(boolean z) {
    }

    public final String i1(int i2) {
    }

    public final int j1() {
    }

    public final void k1(View view) {
    }

    @Override // k.i.h.b.o.m.h0.i1
    public void m0(int i2) {
    }

    @Override // k.i.h.b.o.m.h0.i1, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // k.i.h.b.o.m.h0.i1, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // k.i.h.b.o.m.h0.i1, androidx.fragment.app.Fragment
    public void onResume() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
    }

    @Override // k.i.h.b.o.m.h0.i1
    public void r0(k.i.h.b.o.l.b.c cVar) {
    }

    public final void u1(boolean z) {
    }

    public final void v1(boolean z) {
    }

    public final void w1(View view, int i2, k.i.h.b.o.m.i0.r rVar) {
    }

    public final void x1() {
    }

    public final void z1(k.i.h.b.o.m.i0.r rVar, gd gdVar) {
    }
}
