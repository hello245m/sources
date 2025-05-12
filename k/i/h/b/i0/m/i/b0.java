package k.i.h.b.i0.m.i;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.tencent.mp.feature.statistics.ui.view.ArticleTrendView;
import com.tencent.mp.feature.statistics.ui.view.DashboardView;
import com.tencent.mp.feature.statistics.ui.view.DateRangePickerView;
import com.tencent.mp.feature.statistics.ui.view.PickerView;
import com.tencent.mp.framework.ui.widget.recyclerview.RefreshRecyclerView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.i.h.c.d.a.h.e.b;
import q.r0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class b0 extends Fragment {
    public Date A;
    public Date B;
    public Date C;
    public boolean D;
    public int E;
    public Map<Integer, View> F;
    public final Integer[] a;
    public final k.i.h.d.b[] b;
    public final String[] c;
    public final LinkedHashMap<Integer, Integer> d;
    public final n.d e;
    public final n.d f;
    public final n.d g;
    public final n.d h;

    /* renamed from: i, reason: collision with root package name */
    public final n.d f6831i;

    /* renamed from: j, reason: collision with root package name */
    public final n.d f6832j;

    /* renamed from: k, reason: collision with root package name */
    public final n.d f6833k;

    /* renamed from: l, reason: collision with root package name */
    public final n.d f6834l;

    /* renamed from: m, reason: collision with root package name */
    public final n.d f6835m;

    /* renamed from: n, reason: collision with root package name */
    public final n.d f6836n;

    /* renamed from: o, reason: collision with root package name */
    public final n.d f6837o;

    /* renamed from: p, reason: collision with root package name */
    public final n.d f6838p;

    /* renamed from: q, reason: collision with root package name */
    public List<String> f6839q;

    /* renamed from: r, reason: collision with root package name */
    public List<String> f6840r;

    /* renamed from: s, reason: collision with root package name */
    public final MutableLiveData<k.i.h.b.d.w0.c.i<r0>> f6841s;

    /* renamed from: t, reason: collision with root package name */
    public final MutableLiveData<k.i.h.b.d.w0.c.i<r0>> f6842t;
    public final MutableLiveData<k.i.h.b.d.w0.c.i<r0>> u;
    public final k.i.h.b.i0.m.j.a v;
    public int w;
    public List<k.i.h.b.i0.l.b.a> x;
    public final SimpleDateFormat y;
    public Date z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends n.d0.d.o implements n.d0.c.a<TextView> {
        public final /* synthetic */ b0 a;

        public a(b0 b0Var) {
        }

        public final TextView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.d0.d.o implements n.d0.c.a<View> {
        public final /* synthetic */ b0 a;

        public b(b0 b0Var) {
        }

        public final View b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ View invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.d0.d.o implements n.d0.c.a<RefreshRecyclerView> {
        public final /* synthetic */ b0 a;

        public c(b0 b0Var) {
        }

        public final RefreshRecyclerView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ RefreshRecyclerView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.d0.d.o implements n.d0.c.a<NestedScrollView> {
        public final /* synthetic */ b0 a;

        public d(b0 b0Var) {
        }

        public final NestedScrollView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ NestedScrollView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends n.d0.d.o implements n.d0.c.a<DashboardView> {
        public final /* synthetic */ b0 a;

        public e(b0 b0Var) {
        }

        public final DashboardView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ DashboardView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends n.d0.d.o implements n.d0.c.a<DateRangePickerView> {
        public final /* synthetic */ b0 a;

        public f(b0 b0Var) {
        }

        public final DateRangePickerView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ DateRangePickerView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends n.d0.d.o implements n.d0.c.a<List<? extends ViewGroup>> {
        public final /* synthetic */ b0 a;

        public g(b0 b0Var) {
        }

        public final List<ViewGroup> b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ List<? extends ViewGroup> invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends n.d0.d.o implements n.d0.c.a<TextView[]> {
        public final /* synthetic */ b0 a;

        public h(b0 b0Var) {
        }

        public final TextView[] b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView[] invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends n.d0.d.o implements n.d0.c.a<LinearLayout> {
        public final /* synthetic */ b0 a;

        public i(b0 b0Var) {
        }

        public final LinearLayout b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ LinearLayout invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends b.a<k.i.h.b.i0.l.b.a, k.i.h.b.i0.m.j.b> {
        public final /* synthetic */ b0 a;

        public j(b0 b0Var) {
        }

        public static final void f(b0 b0Var, k.i.h.b.i0.l.b.a aVar, View view) {
        }

        public static /* synthetic */ void h(b0 b0Var, k.i.h.b.i0.l.b.a aVar, View view) {
        }

        @Override // k.i.h.c.d.a.h.e.b.a
        public /* bridge */ /* synthetic */ void a(k.i.h.b.i0.m.j.b bVar, int i2, k.i.h.b.i0.l.b.a aVar) {
        }

        @Override // k.i.h.c.d.a.h.e.b.a
        public /* bridge */ /* synthetic */ k.i.h.b.i0.m.j.b b(View view, int i2) {
        }

        @Override // k.i.h.c.d.a.h.e.b.a
        public int c(int i2) {
        }

        @SuppressLint({"SetTextI18n"})
        public void e(k.i.h.b.i0.m.j.b bVar, int i2, k.i.h.b.i0.l.b.a aVar) {
        }

        public k.i.h.b.i0.m.j.b g(View view, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends n.d0.d.o implements n.d0.c.l<Integer, n.u> {
        public final /* synthetic */ b0 a;

        public k(b0 b0Var) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends n.d0.d.o implements n.d0.c.l<n.i<? extends Date, ? extends Date>, n.u> {
        public final /* synthetic */ b0 a;

        public l(b0 b0Var) {
        }

        public final void b(n.i<? extends Date, ? extends Date> iVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(n.i<? extends Date, ? extends Date> iVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m extends n.d0.d.o implements n.d0.c.l<Integer, Boolean> {
        public final /* synthetic */ b0 a;

        public m(b0 b0Var) {
        }

        public final Boolean b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n extends n.d0.d.o implements n.d0.c.a<TextView> {
        public final /* synthetic */ b0 a;

        public n(b0 b0Var) {
        }

        public final TextView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o extends n.d0.d.o implements n.d0.c.a<PickerView> {
        public final /* synthetic */ b0 a;

        public o(b0 b0Var) {
        }

        public final PickerView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ PickerView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p extends n.d0.d.o implements n.d0.c.a<ArticleTrendView> {
        public final /* synthetic */ b0 a;

        public p(b0 b0Var) {
        }

        public final ArticleTrendView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ArticleTrendView invoke() {
        }
    }

    public static final /* synthetic */ Date A0(b0 b0Var) {
    }

    public static final /* synthetic */ String E0(b0 b0Var, int i2) {
    }

    public static final /* synthetic */ k.i.h.d.b[] F0(b0 b0Var) {
    }

    public static final /* synthetic */ int G0(b0 b0Var) {
    }

    public static final /* synthetic */ ArticleTrendView I0(b0 b0Var) {
    }

    public static final /* synthetic */ void L0(b0 b0Var, int i2) {
    }

    public static final /* synthetic */ void M0(b0 b0Var, int i2) {
    }

    public static final /* synthetic */ void O0(b0 b0Var, Date date) {
    }

    public static final /* synthetic */ void P0(b0 b0Var, Date date) {
    }

    public static final /* synthetic */ void Q0(b0 b0Var) {
    }

    public static final /* synthetic */ void g0(b0 b0Var) {
    }

    public static final /* synthetic */ void i0(b0 b0Var, Date date, Date date2, int i2, String str) {
    }

    public static /* synthetic */ void j1(b0 b0Var) {
    }

    public static /* synthetic */ void k1(b0 b0Var, n.i iVar) {
    }

    public static /* synthetic */ void l1(b0 b0Var, k.i.h.b.d.w0.c.i iVar) {
    }

    public static final /* synthetic */ int m0(b0 b0Var) {
    }

    public static /* synthetic */ void m1(b0 b0Var, NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
    }

    public static final /* synthetic */ List n0(b0 b0Var) {
    }

    public static /* synthetic */ void n1(b0 b0Var, k.i.h.b.d.w0.c.i iVar) {
    }

    public static /* synthetic */ void o1(b0 b0Var, int i2, View view) {
    }

    public static /* synthetic */ void p1(b0 b0Var, k.i.h.b.d.w0.c.i iVar) {
    }

    public static final /* synthetic */ k.i.h.b.i0.m.j.a q0(b0 b0Var) {
    }

    public static final void q1(b0 b0Var, NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
    }

    public static final /* synthetic */ RefreshRecyclerView r0(b0 b0Var) {
    }

    public static final void r1(b0 b0Var, int i2, View view) {
    }

    public static final void s1(b0 b0Var) {
    }

    public static final void t1(b0 b0Var, n.i iVar) {
    }

    public static final /* synthetic */ DashboardView v0(b0 b0Var) {
    }

    public static final void w1(b0 b0Var, k.i.h.b.d.w0.c.i iVar) {
    }

    public static final /* synthetic */ Date x0(b0 b0Var) {
    }

    public static final void x1(b0 b0Var, k.i.h.b.d.w0.c.i iVar) {
    }

    public static final /* synthetic */ LinearLayout y0(b0 b0Var) {
    }

    public static final void y1(b0 b0Var, k.i.h.b.d.w0.c.i iVar) {
    }

    public final void A1() {
    }

    public final k.i.h.b.i0.m.j.c R0(r0.c cVar, r0.b bVar) {
    }

    public final void S0() {
    }

    public final void T0(Date date, Date date2, int i2, String str) {
    }

    public final void U0() {
    }

    public final TextView V0() {
    }

    public final View W0() {
    }

    public final RefreshRecyclerView X0() {
    }

    public final NestedScrollView Y0() {
    }

    public final DashboardView Z0() {
    }

    public final DateRangePickerView a1() {
    }

    public final List<View> b1() {
    }

    public void c0() {
    }

    public final TextView[] c1() {
    }

    public View d0(int i2) {
    }

    public final LinearLayout d1() {
    }

    public final TextView e1() {
    }

    public final String f1(int i2) {
    }

    public final PickerView g1() {
    }

    public final ArticleTrendView h1() {
    }

    public final void i1() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
    }

    @SuppressLint({"SetTextI18n"})
    public final void u1(int i2) {
    }

    public final void v1() {
    }

    public final void z1() {
    }
}
