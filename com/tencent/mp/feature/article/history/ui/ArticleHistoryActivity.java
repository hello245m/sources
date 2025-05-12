package com.tencent.mp.feature.article.history.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mp.framework.ui.widget.recyclerview.WrapperLinearLayoutManager;
import com.tencent.xweb.util.WXWebReporter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import n.d0.c.p;
import n.d0.d.o;
import n.u;
import o.a.f2;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class ArticleHistoryActivity extends k.i.h.b.d.b1.b {
    public final n.d h;

    /* renamed from: i, reason: collision with root package name */
    public final n.d f1275i;

    /* renamed from: j, reason: collision with root package name */
    public final n.d f1276j;

    /* renamed from: k, reason: collision with root package name */
    public int f1277k;

    /* renamed from: l, reason: collision with root package name */
    public final n.d f1278l;

    /* renamed from: m, reason: collision with root package name */
    public final n.d f1279m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1280n;

    /* renamed from: o, reason: collision with root package name */
    public long f1281o;

    /* renamed from: p, reason: collision with root package name */
    public f2 f1282p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1283q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1284r;

    /* renamed from: s, reason: collision with root package name */
    public Dialog f1285s;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends o implements n.d0.c.a<k.i.h.b.b.c.n.d0.a> {
        public final /* synthetic */ ArticleHistoryActivity a;

        /* renamed from: com.tencent.mp.feature.article.history.ui.ArticleHistoryActivity$a$a, reason: collision with other inner class name */
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class C0041a implements k.i.h.b.d.m0.n.b {
            public final /* synthetic */ ArticleHistoryActivity a;

            public C0041a(ArticleHistoryActivity articleHistoryActivity) {
            }

            @Override // k.i.h.b.d.m0.n.b
            public void d(k.i.h.b.d.m0.k<?, ?> kVar, View view, int i2) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b implements k.i.h.b.d.m0.n.f {
            public final /* synthetic */ ArticleHistoryActivity a;

            public b(ArticleHistoryActivity articleHistoryActivity) {
            }

            @Override // k.i.h.b.d.m0.n.f
            public void a() {
            }
        }

        public a(ArticleHistoryActivity articleHistoryActivity) {
        }

        public final k.i.h.b.b.c.n.d0.a b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.c.n.d0.a invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends o implements n.d0.c.a<k.i.h.b.b.c.j.a> {
        public final /* synthetic */ ArticleHistoryActivity a;

        public b(ArticleHistoryActivity articleHistoryActivity) {
        }

        public final k.i.h.b.b.c.j.a b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.c.j.a invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends o implements n.d0.c.a<SimpleDateFormat> {
        public final /* synthetic */ ArticleHistoryActivity a;

        public c(ArticleHistoryActivity articleHistoryActivity) {
        }

        public final SimpleDateFormat b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ SimpleDateFormat invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.history.ui.ArticleHistoryActivity$initData$1", f = "ArticleHistoryActivity.kt", l = {WXWebReporter.ID903KeyDef.SCHEDULE_REPLACED, 152}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ ArticleHistoryActivity b;

        public d(ArticleHistoryActivity articleHistoryActivity, n.a0.d<? super d> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.history.ui.ArticleHistoryActivity$initView$1$1$1", f = "ArticleHistoryActivity.kt", l = {WXWebReporter.LOAD_SO_LINK_ERR_OTHER}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
        public int a;
        public final /* synthetic */ ArticleHistoryActivity b;

        public e(ArticleHistoryActivity articleHistoryActivity, n.a0.d<? super e> dVar) {
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
    public static final class f extends o implements n.d0.c.l<Long, u> {
        public final /* synthetic */ ArticleHistoryActivity a;

        public f(ArticleHistoryActivity articleHistoryActivity) {
        }

        public final void b(long j2) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(Long l2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends RecyclerView.u {
        public final /* synthetic */ ArticleHistoryActivity a;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.article.history.ui.ArticleHistoryActivity$initView$3$onScrollStateChanged$1", f = "ArticleHistoryActivity.kt", l = {253}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements p<t0, n.a0.d<? super u>, Object> {
            public int a;
            public final /* synthetic */ ArticleHistoryActivity b;

            public a(ArticleHistoryActivity articleHistoryActivity, n.a0.d<? super a> dVar) {
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

        public g(ArticleHistoryActivity articleHistoryActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends o implements n.d0.c.a<WrapperLinearLayoutManager> {
        public final /* synthetic */ ArticleHistoryActivity a;

        public h(ArticleHistoryActivity articleHistoryActivity) {
        }

        public final WrapperLinearLayoutManager b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ WrapperLinearLayoutManager invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends o implements n.d0.c.l<k.i.h.b.b.c.k.a, u> {
        public final /* synthetic */ ArticleHistoryActivity a;

        public i(ArticleHistoryActivity articleHistoryActivity) {
        }

        public final void b(k.i.h.b.b.c.k.a aVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(k.i.h.b.b.c.k.a aVar) {
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
    public static final class l extends o implements n.d0.c.l<k.i.h.b.b.c.p.f, u> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public l(k.i.h.b.d.b1.b bVar) {
        }

        public final void b(k.i.h.b.b.c.p.f fVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ u invoke(k.i.h.b.b.c.p.f fVar) {
        }
    }

    public static final void B2(ArticleHistoryActivity articleHistoryActivity, List list) {
    }

    public static final void C2(ArticleHistoryActivity articleHistoryActivity, k.i.h.b.d.w0.d.b bVar) {
    }

    public static final void E2(ArticleHistoryActivity articleHistoryActivity, k.i.h.a.a.a aVar) {
    }

    public static final /* synthetic */ void G1(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final /* synthetic */ k.i.h.b.b.c.n.d0.a H1(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final /* synthetic */ k.i.h.b.b.c.j.a I1(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final void I2(ArticleHistoryActivity articleHistoryActivity, boolean z, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ int J1(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final void J2(k.i.h.b.d.b1.p.u uVar, View view) {
    }

    public static final /* synthetic */ SimpleDateFormat K1(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final void K2(ArticleHistoryActivity articleHistoryActivity, MenuItem menuItem, int i2) {
    }

    public static final /* synthetic */ WrapperLinearLayoutManager L1(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final /* synthetic */ k.i.h.b.b.c.p.f M1(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final void M2(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final /* synthetic */ void N1(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final /* synthetic */ void O1(ArticleHistoryActivity articleHistoryActivity, int i2) {
    }

    public static final /* synthetic */ void P1(ArticleHistoryActivity articleHistoryActivity, long j2) {
    }

    public static final /* synthetic */ void Q1(ArticleHistoryActivity articleHistoryActivity, boolean z) {
    }

    public static final /* synthetic */ void R1(ArticleHistoryActivity articleHistoryActivity, f2 f2Var) {
    }

    public static final /* synthetic */ void S1(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final /* synthetic */ void T1(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final void e2(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final void h2(ArticleHistoryActivity articleHistoryActivity, View view) {
    }

    public static final void i2(ArticleHistoryActivity articleHistoryActivity, DialogInterface dialogInterface) {
    }

    public static final void j2(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static final void k2(ArticleHistoryActivity articleHistoryActivity, View view) {
    }

    public static final void l2(ArticleHistoryActivity articleHistoryActivity, View view) {
    }

    public static /* synthetic */ void n2(ArticleHistoryActivity articleHistoryActivity, boolean z, k.i.h.b.d.b1.d.d dVar) {
    }

    public static /* synthetic */ void o2(k.i.h.b.d.b1.p.u uVar, View view) {
    }

    public static /* synthetic */ void p2(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static /* synthetic */ void q2(ArticleHistoryActivity articleHistoryActivity, View view) {
    }

    public static /* synthetic */ void r2(ArticleHistoryActivity articleHistoryActivity, MenuItem menuItem, int i2) {
    }

    public static /* synthetic */ void s2(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static /* synthetic */ void t2(ArticleHistoryActivity articleHistoryActivity, View view) {
    }

    public static /* synthetic */ void u2(ArticleHistoryActivity articleHistoryActivity) {
    }

    public static /* synthetic */ void v2(ArticleHistoryActivity articleHistoryActivity, k.i.h.b.d.w0.d.b bVar) {
    }

    public static /* synthetic */ void w2(ArticleHistoryActivity articleHistoryActivity, List list) {
    }

    public static /* synthetic */ void x2(ArticleHistoryActivity articleHistoryActivity, View view) {
    }

    public static /* synthetic */ void y2(ArticleHistoryActivity articleHistoryActivity, DialogInterface dialogInterface) {
    }

    public static /* synthetic */ void z2(ArticleHistoryActivity articleHistoryActivity, k.i.h.a.a.a aVar) {
    }

    public final void A2() {
    }

    public final void D2() {
    }

    public final void F2() {
    }

    public final void G2() {
    }

    public final void H2() {
    }

    public final void L2() {
    }

    public final void U1() {
    }

    public final void V1(k.i.h.b.b.c.m.b.c cVar) {
    }

    public final k.i.h.b.b.c.n.d0.a W1() {
    }

    @Override // k.i.h.b.d.b1.a
    public j.z.a X0() {
    }

    public final k.i.h.b.b.c.j.a X1() {
    }

    public final Date Y1() {
    }

    public final SimpleDateFormat Z1() {
    }

    public final WrapperLinearLayoutManager a2() {
    }

    public final k.i.h.b.b.c.p.f b2() {
    }

    public final void c2() {
    }

    public final void d2() {
    }

    public final void f2() {
    }

    public final void g2() {
    }

    public final void m2() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
