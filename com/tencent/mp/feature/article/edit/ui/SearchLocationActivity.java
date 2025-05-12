package com.tencent.mp.feature.article.edit.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.tencent.mp.feature.base.ui.widget.SearchViewBar;
import java.util.Map;
import k.i.h.b.b.b.m.t;
import k.i.h.b.b.b.s.n3.m;
import n.d0.c.p;
import n.d0.c.q;
import n.d0.d.o;
import n.u;
import o.a.f2;
import o.a.t0;
import q.g5;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class SearchLocationActivity extends k.i.h.b.d.b1.b implements LocationListener {
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final n.d f1203i;

    /* renamed from: j, reason: collision with root package name */
    public final n.d f1204j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f1205k;

    /* renamed from: l, reason: collision with root package name */
    public final n.d f1206l;

    /* renamed from: m, reason: collision with root package name */
    public final n.d f1207m;

    /* renamed from: n, reason: collision with root package name */
    public final n.d f1208n;

    /* renamed from: o, reason: collision with root package name */
    public final n.d0.c.l<String, u> f1209o;

    /* renamed from: p, reason: collision with root package name */
    public final j.a.h.c<Intent> f1210p;

    /* renamed from: q, reason: collision with root package name */
    public Location f1211q;

    /* renamed from: r, reason: collision with root package name */
    public final j.a.h.c<String[]> f1212r;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends o implements n.d0.c.a<k.i.h.b.b.b.s.k3.d> {
        public final /* synthetic */ SearchLocationActivity a;

        /* renamed from: com.tencent.mp.feature.article.edit.ui.SearchLocationActivity$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class C0033a implements k.i.h.b.d.m0.n.d {
            public final /* synthetic */ SearchLocationActivity a;

            public C0033a(SearchLocationActivity searchLocationActivity) {
            }

            @Override // k.i.h.b.d.m0.n.d
            public void a(k.i.h.b.d.m0.k<?, ?> kVar, View view, int i2) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b implements k.i.h.b.d.m0.n.f {
            public final /* synthetic */ SearchLocationActivity a;

            public b(SearchLocationActivity searchLocationActivity) {
            }

            @Override // k.i.h.b.d.m0.n.f
            public void a() {
            }
        }

        public a(SearchLocationActivity searchLocationActivity) {
        }

        public final k.i.h.b.b.b.s.k3.d b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.b.s.k3.d invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends o implements n.d0.c.a<t> {
        public final /* synthetic */ SearchLocationActivity a;

        public b(SearchLocationActivity searchLocationActivity) {
        }

        public final t b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ t invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.SearchLocationActivity$debounceSearch$1", f = "SearchLocationActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.a0.k.a.l implements q<t0, String, n.a0.d<? super u>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ SearchLocationActivity c;

        public c(SearchLocationActivity searchLocationActivity, n.a0.d<? super c> dVar) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ Object a(t0 t0Var, String str, n.a0.d<? super u> dVar) {
        }

        public final Object g(t0 t0Var, String str, n.a0.d<? super u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.SearchLocationActivity$initObserver$1", f = "SearchLocationActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ SearchLocationActivity c;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.SearchLocationActivity$initObserver$1$1", f = "SearchLocationActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements p<k.i.h.b.d.w0.d.b<k.i.h.b.d.w0.d.d<g5>>, n.a0.d<? super u>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ SearchLocationActivity c;

            public a(SearchLocationActivity searchLocationActivity, n.a0.d<? super a> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
            }

            public final Object g(k.i.h.b.d.w0.d.b<k.i.h.b.d.w0.d.d<g5>> bVar, n.a0.d<? super u> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(k.i.h.b.d.w0.d.b<k.i.h.b.d.w0.d.d<g5>> bVar, n.a0.d<? super u> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        public d(SearchLocationActivity searchLocationActivity, n.a0.d<? super d> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<u> create(Object obj, n.a0.d<?> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super u> dVar) {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(t0 t0Var, n.a0.d<? super u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e implements SearchViewBar.b {
        public final /* synthetic */ SearchLocationActivity a;

        public e(SearchLocationActivity searchLocationActivity) {
        }

        @Override // com.tencent.mp.feature.base.ui.widget.SearchViewBar.b
        public void a(String str) {
        }

        @Override // com.tencent.mp.feature.base.ui.widget.SearchViewBar.b
        public void b(String str) {
        }

        @Override // com.tencent.mp.feature.base.ui.widget.SearchViewBar.b
        public void onCancel() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends o implements n.d0.c.a<LocationManager> {
        public final /* synthetic */ SearchLocationActivity a;

        public f(SearchLocationActivity searchLocationActivity) {
        }

        public final LocationManager b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ LocationManager invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends o implements n.d0.c.l<Dialog, u> {
        public final /* synthetic */ SearchLocationActivity a;

        public g(SearchLocationActivity searchLocationActivity) {
        }

        public final void b(Dialog dialog) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(Dialog dialog) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends o implements n.d0.c.l<Dialog, u> {
        public final /* synthetic */ SearchLocationActivity a;

        public h(SearchLocationActivity searchLocationActivity) {
        }

        public final void b(Dialog dialog) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(Dialog dialog) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends o implements n.d0.c.a<Integer> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public i(Activity activity, String str, Object obj) {
        }

        @Override // n.d0.c.a
        public final Integer invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends o implements n.d0.c.a<ViewModelStore> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public j(k.i.h.b.d.b1.b bVar) {
        }

        public final ViewModelStore b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k extends o implements n.d0.c.a<k.i.h.b.d.d1.c> {
        public final /* synthetic */ n.d0.c.a a;
        public final /* synthetic */ k.i.h.b.d.b1.b b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends o implements n.d0.c.a<ViewModelProvider.Factory> {
            public final /* synthetic */ k.i.h.b.d.b1.b a;

            public a(k.i.h.b.d.b1.b bVar) {
            }

            public final ViewModelProvider.Factory b() {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ ViewModelProvider.Factory invoke() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b extends o implements n.d0.c.l<ViewModel, u> {
            public final /* synthetic */ k.i.h.b.d.b1.b a;

            public b(k.i.h.b.d.b1.b bVar) {
            }

            public final void b(ViewModel viewModel) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ u invoke(ViewModel viewModel) {
            }
        }

        public k(n.d0.c.a aVar, k.i.h.b.d.b1.b bVar) {
        }

        public final k.i.h.b.d.d1.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.d.d1.c invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends o implements n.d0.c.l<m, u> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public l(k.i.h.b.d.b1.b bVar) {
        }

        public final void b(m mVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(m mVar) {
        }
    }

    public static final /* synthetic */ void G1(SearchLocationActivity searchLocationActivity, g5 g5Var) {
    }

    public static final /* synthetic */ t H1(SearchLocationActivity searchLocationActivity) {
    }

    public static final /* synthetic */ n.d0.c.l I1(SearchLocationActivity searchLocationActivity) {
    }

    public static final /* synthetic */ int J1(SearchLocationActivity searchLocationActivity) {
    }

    public static final /* synthetic */ m K1(SearchLocationActivity searchLocationActivity) {
    }

    public static final /* synthetic */ void L1(SearchLocationActivity searchLocationActivity, String str, boolean z) {
    }

    public static final /* synthetic */ void M1(SearchLocationActivity searchLocationActivity, boolean z) {
    }

    public static final /* synthetic */ void N1(SearchLocationActivity searchLocationActivity) {
    }

    public static final /* synthetic */ void O1(SearchLocationActivity searchLocationActivity) {
    }

    public static final /* synthetic */ void P1(SearchLocationActivity searchLocationActivity, boolean z) {
    }

    public static final /* synthetic */ void Q1(SearchLocationActivity searchLocationActivity, k.i.h.b.d.w0.d.d dVar) {
    }

    public static final void c2(SearchLocationActivity searchLocationActivity, View view) {
    }

    public static final void d2(SearchLocationActivity searchLocationActivity, View view) {
    }

    public static /* synthetic */ void e2(SearchLocationActivity searchLocationActivity, j.a.h.a aVar) {
    }

    public static /* synthetic */ void f2(SearchLocationActivity searchLocationActivity, View view) {
    }

    public static /* synthetic */ void g2(SearchLocationActivity searchLocationActivity, View view) {
    }

    public static /* synthetic */ void h2(SearchLocationActivity searchLocationActivity, Map map) {
    }

    public static final void i2(SearchLocationActivity searchLocationActivity, j.a.h.a aVar) {
    }

    public static final void j2(SearchLocationActivity searchLocationActivity, Map map) {
    }

    public static /* synthetic */ void l2(SearchLocationActivity searchLocationActivity, String str, boolean z, int i2, Object obj) {
    }

    public final void R1() {
    }

    public final void S1(g5 g5Var) {
    }

    public final k.i.h.b.b.b.s.k3.d T1() {
    }

    public final t U1() {
    }

    public t V1() {
    }

    public final LocationManager W1() {
    }

    @Override // k.i.h.b.d.b1.a
    public /* bridge */ /* synthetic */ j.z.a X0() {
    }

    public final int X1() {
    }

    public final m Y1() {
    }

    public final void Z1() {
    }

    public final f2 a2() {
    }

    public final void b2() {
    }

    public final void k2(String str, boolean z) {
    }

    public final void m2() {
    }

    public final void n2() {
    }

    public final void o2(boolean z) {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // k.i.h.b.d.b1.b, j.b.k.d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // j.b.k.d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }

    public final void p2() {
    }

    public final void q2(k.i.h.b.d.w0.d.d<g5> dVar) {
    }

    public final boolean r2() {
    }
}
