package k.i.h.b.i0.m.i;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.tencent.ktx.libraries.charts.LineChart;
import com.tencent.mp.feature.statistics.ui.view.DashboardView;
import com.tencent.mp.feature.statistics.ui.view.DateRangePickerView;
import com.tencent.mp.feature.statistics.ui.view.DetailTableView;
import com.tencent.mp.feature.statistics.ui.view.DotTitleView;
import com.tencent.mp.feature.statistics.ui.view.PickerView;
import com.tencent.mp.feature.statistics.ui.view.RingChartWithLegend;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.a.f2;
import o.a.t0;
import q.p2;
import q.r0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class c0 extends Fragment {
    public List<String> A;
    public final MutableLiveData<k.i.h.b.d.w0.c.i<r0>> B;
    public final MutableLiveData<k.i.h.b.d.w0.c.i<p2>> C;
    public boolean D;
    public k.i.h.b.i0.i.b E;
    public final List<a> F;
    public final List<a> G;
    public final List<a> H;
    public Map<Integer, View> I;
    public final n.d a;
    public final n.d b;
    public final n.d c;
    public final n.d d;
    public final n.d e;
    public final n.d f;
    public final n.d g;
    public final n.d h;

    /* renamed from: i, reason: collision with root package name */
    public final n.d f6843i;

    /* renamed from: j, reason: collision with root package name */
    public final n.d f6844j;

    /* renamed from: k, reason: collision with root package name */
    public final n.d f6845k;

    /* renamed from: l, reason: collision with root package name */
    public final n.d f6846l;

    /* renamed from: m, reason: collision with root package name */
    public final n.d f6847m;

    /* renamed from: n, reason: collision with root package name */
    public final n.d f6848n;

    /* renamed from: o, reason: collision with root package name */
    public final n.d f6849o;

    /* renamed from: p, reason: collision with root package name */
    public final n.d f6850p;

    /* renamed from: q, reason: collision with root package name */
    public final n.d f6851q;

    /* renamed from: r, reason: collision with root package name */
    public final n.d f6852r;

    /* renamed from: s, reason: collision with root package name */
    public final n.d f6853s;

    /* renamed from: t, reason: collision with root package name */
    public final n.d f6854t;
    public n.i<? extends Date, ? extends Date> u;
    public String v;
    public int w;
    public final LinkedHashMap<String, LinkedHashMap<Integer, LinkedHashMap<String, Integer>>> x;
    public final LinkedHashMap<Integer, String> y;
    public List<String> z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a {
        public final String a;
        public final int b;
        public final float c;

        public a(String str, int i2, float f) {
        }

        public final String a() {
        }

        public final float b() {
        }

        public final int c() {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a0 extends n.d0.d.o implements n.d0.c.a<DotTitleView> {
        public final /* synthetic */ c0 a;

        public a0(c0 c0Var) {
        }

        public final DotTitleView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ DotTitleView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a = null;
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b0 extends n.d0.d.o implements n.d0.c.a<PickerView> {
        public final /* synthetic */ c0 a;

        public b0(c0 c0Var) {
        }

        public final PickerView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ PickerView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.d0.d.o implements n.d0.c.a<NestedScrollView> {
        public final /* synthetic */ c0 a;

        public c(c0 c0Var) {
        }

        public final NestedScrollView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ NestedScrollView invoke() {
        }
    }

    /* renamed from: k.i.h.b.i0.m.i.c0$c0, reason: collision with other inner class name */
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class C0528c0 extends n.d0.d.o implements n.d0.c.a<TextView> {
        public final /* synthetic */ c0 a;

        public C0528c0(c0 c0Var) {
        }

        public final TextView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.d0.d.o implements n.d0.c.a<DashboardView> {
        public final /* synthetic */ c0 a;

        public d(c0 c0Var) {
        }

        public final DashboardView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ DashboardView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends n.d0.d.o implements n.d0.c.a<DateRangePickerView> {
        public final /* synthetic */ c0 a;

        public e(c0 c0Var) {
        }

        public final DateRangePickerView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ DateRangePickerView invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.statistics.ui.fragment.SubscriberStatisticsFragment$fetchTrendData$1", f = "SubscriberStatisticsFragment.kt", l = {394}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ c0 b;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.statistics.ui.fragment.SubscriberStatisticsFragment$fetchTrendData$1$trendData$1", f = "SubscriberStatisticsFragment.kt", l = {395}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super k.i.h.b.d.w0.c.i<r0>>, Object> {
            public int a;
            public final /* synthetic */ k.i.h.b.i0.l.a b;
            public final /* synthetic */ Date c;
            public final /* synthetic */ Date d;

            public a(k.i.h.b.i0.l.a aVar, Date date, Date date2, n.a0.d<? super a> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super k.i.h.b.d.w0.c.i<r0>> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(t0 t0Var, n.a0.d<? super k.i.h.b.d.w0.c.i<r0>> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        public f(c0 c0Var, n.a0.d<? super f> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends n.d0.d.o implements n.d0.c.a<List<? extends ViewGroup>> {
        public final /* synthetic */ c0 a;

        public g(c0 c0Var) {
        }

        public final List<ViewGroup> b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ List<? extends ViewGroup> invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends n.d0.d.o implements n.d0.c.a<TextView[]> {
        public final /* synthetic */ c0 a;

        public h(c0 c0Var) {
        }

        public final TextView[] b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView[] invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends n.d0.d.o implements n.d0.c.a<LineChart> {
        public final /* synthetic */ c0 a;

        public i(c0 c0Var) {
        }

        public final LineChart b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ LineChart invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends n.d0.d.o implements n.d0.c.l<Integer, n.u> {
        public final /* synthetic */ c0 a;

        public j(c0 c0Var) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends n.d0.d.o implements n.d0.c.l<Integer, n.u> {
        public final /* synthetic */ c0 a;

        public k(c0 c0Var) {
        }

        public final void b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends n.d0.d.o implements n.d0.c.l<Integer, String> {
        public static final l a = null;

        public final String b(int i2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m extends n.d0.d.o implements n.d0.c.q<String, LineChart.d, Integer, String> {
        public static final m a = null;

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ String a(String str, LineChart.d dVar, Integer num) {
        }

        public final String b(String str, LineChart.d dVar, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n extends n.d0.d.o implements n.d0.c.l<k.i.h.b.i0.i.b, n.u> {
        public final /* synthetic */ c0 a;

        public n(c0 c0Var) {
        }

        public final void b(k.i.h.b.i0.i.b bVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.i0.i.b bVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o extends n.d0.d.o implements n.d0.c.a<TextView> {
        public final /* synthetic */ c0 a;

        public o(c0 c0Var) {
        }

        public final TextView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p extends n.d0.d.o implements n.d0.c.a<TextView> {
        public final /* synthetic */ c0 a;

        public p(c0 c0Var) {
        }

        public final TextView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class q extends n.d0.d.o implements n.d0.c.a<DetailTableView> {
        public final /* synthetic */ c0 a;

        public q(c0 c0Var) {
        }

        public final DetailTableView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ DetailTableView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class r extends n.d0.d.o implements n.d0.c.a<DotTitleView> {
        public final /* synthetic */ c0 a;

        public r(c0 c0Var) {
        }

        public final DotTitleView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ DotTitleView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class s extends n.d0.d.o implements n.d0.c.a<TextView> {
        public final /* synthetic */ c0 a;

        public s(c0 c0Var) {
        }

        public final TextView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class t extends n.d0.d.o implements n.d0.c.a<RingChartWithLegend> {
        public final /* synthetic */ c0 a;

        public t(c0 c0Var) {
        }

        public final RingChartWithLegend b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ RingChartWithLegend invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class u<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class v extends n.d0.d.o implements n.d0.c.a<TextView> {
        public final /* synthetic */ c0 a;

        public v(c0 c0Var) {
        }

        public final TextView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ TextView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class w extends n.d0.d.o implements n.d0.c.a<DetailTableView> {
        public final /* synthetic */ c0 a;

        public w(c0 c0Var) {
        }

        public final DetailTableView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ DetailTableView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class x extends n.d0.d.o implements n.d0.c.a<DotTitleView> {
        public final /* synthetic */ c0 a;

        public x(c0 c0Var) {
        }

        public final DotTitleView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ DotTitleView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class y extends n.d0.d.o implements n.d0.c.a<PickerView> {
        public final /* synthetic */ c0 a;

        public y(c0 c0Var) {
        }

        public final PickerView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ PickerView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class z extends n.d0.d.o implements n.d0.c.a<RingChartWithLegend> {
        public final /* synthetic */ c0 a;

        public z(c0 c0Var) {
        }

        public final RingChartWithLegend b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ RingChartWithLegend invoke() {
        }
    }

    public static final /* synthetic */ void A0(c0 c0Var, int i2) {
    }

    public static final void D1(c0 c0Var, k.i.h.b.d.w0.c.i iVar) {
    }

    public static final /* synthetic */ void E0(c0 c0Var, String str) {
    }

    public static final void E1(c0 c0Var, k.i.h.b.d.w0.c.i iVar) {
    }

    public static final /* synthetic */ void F0(c0 c0Var) {
    }

    public static final /* synthetic */ DashboardView g0(c0 c0Var) {
    }

    public static final /* synthetic */ LinkedHashMap i0(c0 c0Var) {
    }

    public static /* synthetic */ void i1(c0 c0Var, n.i iVar) {
    }

    public static /* synthetic */ void j1(c0 c0Var, k.i.h.b.d.w0.c.i iVar) {
    }

    public static /* synthetic */ void k1(c0 c0Var, int i2, View view) {
    }

    public static /* synthetic */ void l1(n.d0.c.l lVar, View view) {
    }

    public static final /* synthetic */ n.i m0(c0 c0Var) {
    }

    public static /* synthetic */ void m1(n.d0.c.l lVar, View view) {
    }

    public static final /* synthetic */ int n0(c0 c0Var) {
    }

    public static /* synthetic */ void n1(n.d0.c.l lVar, View view) {
    }

    public static /* synthetic */ void o1(c0 c0Var, k.i.h.b.d.w0.c.i iVar) {
    }

    public static /* synthetic */ void p1(c0 c0Var, NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
    }

    public static final /* synthetic */ LinkedHashMap q0(c0 c0Var) {
    }

    public static final void q1(c0 c0Var, NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
    }

    public static final /* synthetic */ String r0(c0 c0Var) {
    }

    public static final void r1(n.d0.c.l lVar, View view) {
    }

    public static final void s1(n.d0.c.l lVar, View view) {
    }

    public static final void t1(c0 c0Var, int i2, View view) {
    }

    public static final void u1(c0 c0Var, n.i iVar) {
    }

    public static final /* synthetic */ void v0(c0 c0Var) {
    }

    public static final void v1(n.d0.c.l lVar, View view) {
    }

    public static final /* synthetic */ void x0(c0 c0Var) {
    }

    public static final /* synthetic */ void y0(c0 c0Var, k.i.h.b.i0.i.b bVar) {
    }

    public final void A1(int i2) {
    }

    public final void B1(k.i.h.b.i0.i.b bVar) {
    }

    public final void C1() {
    }

    public final void F1() {
    }

    public final void G0() {
    }

    public final void G1() {
    }

    public final void I0() {
    }

    public final f2 L0() {
    }

    public final NestedScrollView M0() {
    }

    public final DashboardView O0() {
    }

    public final DateRangePickerView P0() {
    }

    public final List<View> Q0() {
    }

    public final TextView[] R0() {
    }

    public final int S0() {
    }

    public final LineChart T0() {
    }

    public final TextView U0() {
    }

    public final TextView V0() {
    }

    public final DetailTableView W0() {
    }

    public final DotTitleView X0() {
    }

    public final TextView Y0() {
    }

    public final RingChartWithLegend Z0() {
    }

    public final TextView a1() {
    }

    public final DetailTableView b1() {
    }

    public void c0() {
    }

    public final DotTitleView c1() {
    }

    public View d0(int i2) {
    }

    public final PickerView d1() {
    }

    public final RingChartWithLegend e1() {
    }

    public final DotTitleView f1() {
    }

    public final PickerView g1() {
    }

    public final TextView h1() {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
    }

    public final void w1() {
    }

    public final void x1() {
    }

    public final void y1() {
    }

    public final void z1() {
    }
}
