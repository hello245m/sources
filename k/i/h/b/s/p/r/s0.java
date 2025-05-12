package k.i.h.b.s.p.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mp.feature.base.adapter.BaseViewHolder;
import com.tencent.mp.framework.ui.widget.refreshlayout.CustomSwipeRefreshLayout;
import j.r.e.j;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import k.i.h.b.s.p.p.a;
import k.i.h.b.s.p.t.b;
import q.ib;
import q.ma;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public class s0 extends k.i.h.b.d.t0.a implements k.i.h.b.s.p.o {
    public static final int k0 = 0;
    public static Comparator<k.i.h.b.h.a.a.e.f.c> l0;
    public long A;
    public int B;
    public RecyclerView.a0 C;
    public k.i.h.b.s.l.h D;
    public k.i.h.b.s.p.u.a E;
    public k.i.d.a.d.b<Boolean> F;
    public boolean G;
    public List<q.h0> H;
    public int I;
    public q.h0 J;
    public int K;
    public q.h0 L;
    public q.h0 M;
    public q.c0 N;
    public int O;
    public boolean P;
    public PopupWindow Q;
    public ObjectAnimator R;
    public boolean S;
    public long T;
    public final k.i.h.b.s.l.g U;
    public final k.i.h.b.s.l.i V;
    public final CustomSwipeRefreshLayout.n W;
    public final k.i.h.b.d.m0.n.f X;
    public final a.InterfaceC0638a Y;
    public k.i.h.b.s.p.t.b Z;
    public boolean e;
    public RecyclerView f;
    public FrameLayout g;
    public b.AbstractC0640b g0;
    public CardView h;
    public int h0;

    /* renamed from: i, reason: collision with root package name */
    public CustomSwipeRefreshLayout f7680i;
    public float i0;

    /* renamed from: j, reason: collision with root package name */
    public LinearLayoutManager f7681j;
    public boolean j0;

    /* renamed from: k, reason: collision with root package name */
    public k.i.h.b.s.p.p.a f7682k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7683l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7684m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7685n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7686o;

    /* renamed from: p, reason: collision with root package name */
    public k.i.h.b.o.l.a f7687p;

    /* renamed from: q, reason: collision with root package name */
    public List<k.i.h.b.s.p.t.a> f7688q;

    /* renamed from: r, reason: collision with root package name */
    public List<k.i.h.b.h.a.a.e.f.c> f7689r;

    /* renamed from: s, reason: collision with root package name */
    public Map<String, k.i.h.b.h.a.a.e.f.c> f7690s;

    /* renamed from: t, reason: collision with root package name */
    public List<Integer> f7691t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public long y;
    public long z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class a implements k.i.d.a.d.b<Boolean> {
        public final /* synthetic */ s0 a;

        public a(s0 s0Var) {
        }

        @Override // k.i.d.a.d.b
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
        }

        public void b(Boolean bool) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ s0 a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class a implements Runnable {
            public final /* synthetic */ b a;

            public a(b bVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public b(s0 s0Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class c implements Observer<k.i.h.b.d.w0.c.i<ma>> {
        public final /* synthetic */ s0 a;

        public c(s0 s0Var) {
        }

        public void a(k.i.h.b.d.w0.c.i<ma> iVar) {
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(k.i.h.b.d.w0.c.i<ma> iVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class d implements Observer<k.i.h.a.a.a> {
        public final /* synthetic */ s0 a;

        public d(s0 s0Var) {
        }

        public void a(k.i.h.a.a.a aVar) {
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(k.i.h.a.a.a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class e implements Comparator<k.i.h.b.h.a.a.e.f.c> {
        public int a(k.i.h.b.h.a.a.e.f.c cVar, k.i.h.b.h.a.a.e.f.c cVar2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(k.i.h.b.h.a.a.e.f.c cVar, k.i.h.b.h.a.a.e.f.c cVar2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class f implements Observer<k.i.h.b.d.w0.c.i<q.e0>> {
        public final /* synthetic */ s0 a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class a implements n.d0.c.a<n.u> {
            public final /* synthetic */ f a;

            public a(f fVar) {
            }

            public n.u b() {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }
        }

        public f(s0 s0Var) {
        }

        private /* synthetic */ Object a(List list, n.a0.d dVar) {
        }

        public /* synthetic */ Object b(List list, n.a0.d dVar) {
        }

        public void c(k.i.h.b.d.w0.c.i<q.e0> iVar) {
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(k.i.h.b.d.w0.c.i<q.e0> iVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class g implements n.d0.c.a<n.u> {
        public final /* synthetic */ PopupWindow a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;
        public final /* synthetic */ s0 d;

        public g(s0 s0Var, PopupWindow popupWindow, View view, int i2) {
        }

        public n.u b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class h implements n.d0.c.a<n.u> {
        public final /* synthetic */ int a;
        public final /* synthetic */ s0 b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public class a extends AnimatorListenerAdapter {
            public final /* synthetic */ h a;

            public a(h hVar) {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        }

        public h(s0 s0Var, int i2) {
        }

        public n.u b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class i implements k.i.h.b.s.l.g {
        public final /* synthetic */ s0 a;

        public i(s0 s0Var) {
        }

        @Override // k.i.h.b.s.l.g
        public void a(ma maVar, boolean z) {
        }

        @Override // k.i.h.b.s.l.g
        public void b(ma maVar, boolean z) {
        }

        @Override // k.i.h.b.s.l.g
        public void c(k.i.h.b.o.l.b.b bVar, boolean z) {
        }

        @Override // k.i.h.b.s.l.g
        public void d(ma maVar, boolean z) {
        }

        @Override // k.i.h.b.s.l.g
        public void n(int i2, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class j implements k.i.h.b.s.l.i {
        public final /* synthetic */ s0 a;

        public j(s0 s0Var) {
        }

        private /* synthetic */ void d(DialogInterface dialogInterface, int i2) {
        }

        @Override // k.i.h.b.s.l.i
        public void a(int i2, boolean z) {
        }

        @Override // k.i.h.b.s.l.i
        public void b(int i2, boolean z) {
        }

        @Override // k.i.h.b.s.l.i
        public void c(int i2, String str, boolean z) {
        }

        public /* synthetic */ void e(DialogInterface dialogInterface, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class k implements CustomSwipeRefreshLayout.n {
        public final /* synthetic */ s0 a;

        public k(s0 s0Var) {
        }

        @Override // com.tencent.mp.framework.ui.widget.refreshlayout.CustomSwipeRefreshLayout.n
        public void a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class l implements k.i.h.b.d.m0.n.f {
        public final /* synthetic */ s0 a;

        public l(s0 s0Var) {
        }

        @Override // k.i.h.b.d.m0.n.f
        public void a() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class m implements a.InterfaceC0638a {
        public final /* synthetic */ s0 a;

        public m(s0 s0Var) {
        }

        @Override // k.i.h.b.s.p.p.a.InterfaceC0638a
        public void a(int i2) {
        }

        @Override // k.i.h.b.s.p.p.a.InterfaceC0638a
        public void b(BaseViewHolder baseViewHolder, View view, k.i.h.b.s.p.t.a aVar, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class n extends j.f<k.i.h.b.s.p.t.a> {
        public n(s0 s0Var) {
        }

        @Override // j.r.e.j.f
        public /* bridge */ /* synthetic */ boolean a(k.i.h.b.s.p.t.a aVar, k.i.h.b.s.p.t.a aVar2) {
        }

        @Override // j.r.e.j.f
        public /* bridge */ /* synthetic */ boolean b(k.i.h.b.s.p.t.a aVar, k.i.h.b.s.p.t.a aVar2) {
        }

        public boolean d(k.i.h.b.s.p.t.a aVar, k.i.h.b.s.p.t.a aVar2) {
        }

        public boolean e(k.i.h.b.s.p.t.a aVar, k.i.h.b.s.p.t.a aVar2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class o extends j.r.e.q {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ s0 f7692q;

        public o(s0 s0Var, Context context) {
        }

        @Override // j.r.e.q
        public int B() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0
        public PointF a(int i2) {
        }

        @Override // j.r.e.q
        public float v(DisplayMetrics displayMetrics) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class p extends RecyclerView.u {
        public final /* synthetic */ MotionLayout a;
        public final /* synthetic */ s0 b;

        public p(s0 s0Var, MotionLayout motionLayout) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public class q implements k.i.d.a.d.b<Boolean> {
        public final /* synthetic */ s0 a;

        public q(s0 s0Var) {
        }

        @Override // k.i.d.a.d.b
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
        }

        public void b(Boolean bool) {
        }
    }

    public static /* synthetic */ long A0(s0 s0Var) {
    }

    public static /* synthetic */ int E0(s0 s0Var) {
    }

    public static /* synthetic */ void F0(s0 s0Var) {
    }

    public static /* synthetic */ void G0(s0 s0Var) {
    }

    public static /* synthetic */ void I0(s0 s0Var, long j2) {
    }

    public static /* synthetic */ void L0(s0 s0Var) {
    }

    private /* synthetic */ void L1(Integer num) {
    }

    public static /* synthetic */ void M0(s0 s0Var, ma maVar, boolean z, boolean z2) {
    }

    private /* synthetic */ void N1(Integer num) {
    }

    public static /* synthetic */ void O0(s0 s0Var) {
    }

    public static /* synthetic */ boolean P0(s0 s0Var, boolean z) {
    }

    private /* synthetic */ void P1(Boolean bool) {
    }

    public static /* synthetic */ long Q0(s0 s0Var) {
    }

    public static /* synthetic */ void R0(s0 s0Var, long j2) {
    }

    private /* synthetic */ void R1() {
    }

    public static /* synthetic */ int S0(s0 s0Var, int i2) {
    }

    public static /* synthetic */ void T0(s0 s0Var, k.i.h.b.s.p.t.a aVar, int i2) {
    }

    private /* synthetic */ void T1(k.i.h.b.s.p.t.b bVar) {
    }

    public static /* synthetic */ void U0(s0 s0Var, k.i.h.b.s.p.t.a aVar, int i2) {
    }

    public static /* synthetic */ void V0(s0 s0Var, k.i.h.b.s.p.t.a aVar, int i2) {
    }

    private /* synthetic */ void V1(View view) {
    }

    public static /* synthetic */ RecyclerView W0(s0 s0Var) {
    }

    public static /* synthetic */ float X0(s0 s0Var) {
    }

    private /* synthetic */ void X1(View view) {
    }

    public static /* synthetic */ void Y0(s0 s0Var, int i2, String str) {
    }

    public static /* synthetic */ int Z0(s0 s0Var) {
    }

    private /* synthetic */ void Z1(View view) {
    }

    public static /* synthetic */ k.i.h.b.s.p.t.b a1(s0 s0Var) {
    }

    public static /* synthetic */ CardView b1(s0 s0Var) {
    }

    private /* synthetic */ void b2(CustomSwipeRefreshLayout.s sVar, CustomSwipeRefreshLayout.s sVar2) {
    }

    public static /* synthetic */ int c1() {
    }

    public static /* synthetic */ void d1(s0 s0Var) {
    }

    private /* synthetic */ n.u d2() {
    }

    public static /* synthetic */ CustomSwipeRefreshLayout e1(s0 s0Var) {
    }

    public static /* synthetic */ List f1(s0 s0Var) {
    }

    private /* synthetic */ void f2() {
    }

    public static /* synthetic */ Map g1(s0 s0Var) {
    }

    public static /* synthetic */ k.i.h.b.s.p.p.a h1(s0 s0Var) {
    }

    private /* synthetic */ void h2(ImageView imageView, ImageView imageView2, View view) {
    }

    public static /* synthetic */ q.c0 i1(s0 s0Var) {
    }

    public static /* synthetic */ q.c0 j1(s0 s0Var, q.c0 c0Var) {
    }

    public static /* synthetic */ boolean k1(s0 s0Var) {
    }

    public static /* synthetic */ boolean l1(s0 s0Var, boolean z) {
    }

    public static /* synthetic */ void m0(s0 s0Var, k.i.h.b.o.l.b.b bVar) {
    }

    public static /* synthetic */ boolean m1(s0 s0Var, boolean z) {
    }

    public static /* synthetic */ void n0(s0 s0Var) {
    }

    public static /* synthetic */ q.h0 n1(s0 s0Var) {
    }

    public static /* synthetic */ k.i.h.b.s.l.h o1(s0 s0Var) {
    }

    public static /* synthetic */ k.i.h.b.o.l.a p1(s0 s0Var) {
    }

    public static /* synthetic */ PopupWindow q0(s0 s0Var) {
    }

    public static /* synthetic */ q.h0 q1(s0 s0Var, q.h0 h0Var) {
    }

    public static /* synthetic */ PopupWindow r0(s0 s0Var, PopupWindow popupWindow) {
    }

    public static /* synthetic */ boolean r1(s0 s0Var) {
    }

    public static /* synthetic */ int s1(s0 s0Var) {
    }

    public static /* synthetic */ void t1(s0 s0Var, ma maVar, boolean z) {
    }

    public static /* synthetic */ void u1(s0 s0Var, int i2) {
    }

    public static /* synthetic */ void v0(s0 s0Var) {
    }

    public static /* synthetic */ FrameLayout v1(s0 s0Var) {
    }

    public static /* synthetic */ void w1(s0 s0Var) {
    }

    public static /* synthetic */ void x0(s0 s0Var) {
    }

    public static /* synthetic */ int x1(s0 s0Var) {
    }

    public static /* synthetic */ void y0(s0 s0Var) {
    }

    public final void A1() {
    }

    public final void A2(int i2) {
    }

    public final void B1() {
    }

    public final void B2() {
    }

    public final int C1() {
    }

    public final void C2() {
    }

    public final void D1(b.AbstractC0640b abstractC0640b, String str) {
    }

    public final void D2() {
    }

    public final void E1() {
    }

    public final void E2(int i2) {
    }

    public final void F1() {
    }

    public final void F2() {
    }

    public final void G1() {
    }

    public final void G2() {
    }

    public final void H1(View view) {
    }

    public final void H2() {
    }

    public final void I1(View view) {
    }

    public final void I2() {
    }

    public final boolean J1() {
    }

    public final void J2(ma maVar, boolean z) {
    }

    public final boolean K1() {
    }

    public final void K2(List<ib> list) {
    }

    public /* synthetic */ void M1(Integer num) {
    }

    public /* synthetic */ void O1(Integer num) {
    }

    public /* synthetic */ void Q1(Boolean bool) {
    }

    public /* synthetic */ void S1() {
    }

    public /* synthetic */ void U1(k.i.h.b.s.p.t.b bVar) {
    }

    public /* synthetic */ void W1(View view) {
    }

    public /* synthetic */ void Y1(View view) {
    }

    public /* synthetic */ void a2(View view) {
    }

    public /* synthetic */ void c2(CustomSwipeRefreshLayout.s sVar, CustomSwipeRefreshLayout.s sVar2) {
    }

    @Override // k.i.h.b.d.t0.a
    public String d0() {
    }

    public /* synthetic */ n.u e2() {
    }

    @Override // k.i.h.b.d.t0.a
    public int g0() {
    }

    public /* synthetic */ void g2() {
    }

    public /* synthetic */ void i2(ImageView imageView, ImageView imageView2, View view) {
    }

    public final void j2(long j2) {
    }

    public final void k2(long j2) {
    }

    public final void l2() {
    }

    public final void m2() {
    }

    public final void n(int i2, String str) {
    }

    public final void n2() {
    }

    public final void o2() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // k.i.h.b.d.t0.a, androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // k.i.h.b.d.t0.a, androidx.fragment.app.Fragment
    public void onPause() {
    }

    @Override // k.i.h.b.d.t0.a, androidx.fragment.app.Fragment
    public void onResume() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // k.i.h.b.d.t0.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
    }

    @Override // k.i.h.b.s.p.o
    public void p() {
    }

    public final void p2(k.i.h.b.o.l.b.b bVar) {
    }

    public final void q2(k.i.h.b.s.p.t.a aVar, int i2) {
    }

    public final void r2(k.i.h.b.s.p.t.a aVar, int i2) {
    }

    public final void s2(k.i.h.b.s.p.t.a aVar, int i2) {
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
    }

    public final void t2() {
    }

    public final void u2(ma maVar, boolean z, boolean z2) {
    }

    public void v2() {
    }

    public final void w2() {
    }

    public final void x2() {
    }

    public final void y1(ma maVar) {
    }

    public final void y2() {
    }

    public final void z1() {
    }

    public final void z2(k.i.h.b.s.p.t.b bVar, View view) {
    }
}
