package com.tencent.mp.feature.interaction.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.tencent.mp.feature.interaction.ui.view.InteractionDetailHeaderBehavior;
import java.util.LinkedHashMap;
import java.util.Map;
import k.i.h.b.o.m.h0.i1;
import o.a.f2;
import o.a.t0;
import q.ec;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class InteractionDetailsActivity extends k.i.h.b.d.b1.b implements i1.a {
    public final n.d h;

    /* renamed from: i, reason: collision with root package name */
    public final n.d f1576i;

    /* renamed from: j, reason: collision with root package name */
    public final n.d f1577j;

    /* renamed from: k, reason: collision with root package name */
    public k.i.h.b.o.l.b.c f1578k;

    /* renamed from: l, reason: collision with root package name */
    public k.i.h.b.h.a.a.e.f.c f1579l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap<String, i1> f1580m;

    /* renamed from: n, reason: collision with root package name */
    public String f1581n;

    /* renamed from: o, reason: collision with root package name */
    public k.i.h.b.d.b1.f.c f1582o;

    /* renamed from: p, reason: collision with root package name */
    public k.i.h.b.o.m.i0.m f1583p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1584q;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f1585r;

    /* renamed from: s, reason: collision with root package name */
    public Rect f1586s;

    /* renamed from: t, reason: collision with root package name */
    public int f1587t;
    public Integer u;
    public boolean v;
    public final n.d w;
    public k.i.d.a.d.b<Boolean> x;
    public boolean y;
    public Map<Integer, View> z;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends n.d0.d.o implements n.d0.c.a<k.i.h.b.o.j.a> {
        public final /* synthetic */ InteractionDetailsActivity a;

        public a(InteractionDetailsActivity interactionDetailsActivity) {
        }

        public final k.i.h.b.o.j.a b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.o.j.a invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a0 extends n.d0.d.o implements n.d0.c.a<Boolean> {
        public final /* synthetic */ InteractionDetailsActivity a;

        public a0(InteractionDetailsActivity interactionDetailsActivity) {
        }

        public final Boolean b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.d0.d.o implements n.d0.c.a<k.i.h.d.d> {
        public final /* synthetic */ InteractionDetailsActivity a;

        public b(InteractionDetailsActivity interactionDetailsActivity) {
        }

        public final k.i.h.d.d b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.d.d invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b0 extends n.d0.d.o implements n.d0.c.a<Boolean> {
        public final /* synthetic */ InteractionDetailsActivity a;

        public b0(InteractionDetailsActivity interactionDetailsActivity) {
        }

        public final Boolean b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class c extends n.d0.d.l implements n.d0.c.a<Boolean> {
        public c(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }

        public final Boolean m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c0 extends n.d0.d.o implements n.d0.c.a<Boolean> {
        public final /* synthetic */ InteractionDetailsActivity a;

        public c0(InteractionDetailsActivity interactionDetailsActivity) {
        }

        public final Boolean b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class d extends n.d0.d.l implements n.d0.c.a<Boolean> {
        public d(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }

        public final Boolean m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d0 extends n.d0.d.o implements n.d0.c.a<Boolean> {
        public final /* synthetic */ InteractionDetailsActivity a;

        public d0(InteractionDetailsActivity interactionDetailsActivity) {
        }

        public final Boolean b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class e extends n.d0.d.l implements n.d0.c.a<Boolean> {
        public e(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }

        public final Boolean m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e0 extends n.d0.d.o implements n.d0.c.p<String, n.d0.c.a<? extends Boolean>, n.u> {
        public final /* synthetic */ String[] a;
        public final /* synthetic */ InteractionDetailsActivity b;

        public e0(String[] strArr, InteractionDetailsActivity interactionDetailsActivity) {
        }

        public final void b(String str, n.d0.c.a<Boolean> aVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(String str, n.d0.c.a<? extends Boolean> aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class f extends n.d0.d.l implements n.d0.c.a<Boolean> {
        public f(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }

        public final Boolean m() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionDetailsActivity$reloadDetailByComment$1", f = "InteractionDetailsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ InteractionDetailsActivity b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.l<k.i.h.b.h.a.a.e.f.c, n.u> {
            public final /* synthetic */ InteractionDetailsActivity a;

            public a(InteractionDetailsActivity interactionDetailsActivity) {
            }

            public final void b(k.i.h.b.h.a.a.e.f.c cVar) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.h.a.a.e.f.c cVar) {
            }
        }

        public f0(InteractionDetailsActivity interactionDetailsActivity, n.a0.d<? super f0> dVar) {
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
    public /* synthetic */ class g extends n.d0.d.l implements n.d0.c.a<Boolean> {
        public g(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }

        public final Boolean m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ InteractionDetailsActivity a;
        public final /* synthetic */ boolean b;

        public g0(InteractionDetailsActivity interactionDetailsActivity, boolean z) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class h extends n.d0.d.l implements n.d0.c.a<Boolean> {
        public h(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }

        public final Boolean m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i implements k.i.h.b.d.b1.p.r {
        public final /* synthetic */ InteractionDetailsActivity a;

        public i(InteractionDetailsActivity interactionDetailsActivity) {
        }

        @Override // k.i.h.b.d.b1.p.r
        public void a(boolean z) {
        }

        @Override // k.i.h.b.d.b1.p.r
        public void onHide() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends n.d0.d.o implements n.d0.c.l<k.i.h.b.h.a.a.e.f.c, n.u> {
        public final /* synthetic */ InteractionDetailsActivity a;

        public j(InteractionDetailsActivity interactionDetailsActivity) {
        }

        public final void b(k.i.h.b.h.a.a.e.f.c cVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.h.a.a.e.f.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k implements k.i.d.a.d.b<Boolean> {
        public final /* synthetic */ InteractionDetailsActivity a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.l<k.i.h.b.h.a.a.e.f.c, n.u> {
            public final /* synthetic */ InteractionDetailsActivity a;

            public a(InteractionDetailsActivity interactionDetailsActivity) {
            }

            public final void b(k.i.h.b.h.a.a.e.f.c cVar) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.h.a.a.e.f.c cVar) {
            }
        }

        public k(InteractionDetailsActivity interactionDetailsActivity) {
        }

        @Override // k.i.d.a.d.b
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
        }

        public void b(Boolean bool) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends ViewPager2.i {
        public final /* synthetic */ InteractionDetailsActivity a;

        public l(InteractionDetailsActivity interactionDetailsActivity) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m implements TabLayout.d {
        public final /* synthetic */ InteractionDetailsActivity a;

        public m(InteractionDetailsActivity interactionDetailsActivity) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ InteractionDetailsActivity a;

        public n(InteractionDetailsActivity interactionDetailsActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o extends n.d0.d.o implements n.d0.c.l<k.i.h.b.h.a.a.e.f.c, n.u> {
        public final /* synthetic */ InteractionDetailsActivity a;

        public o(InteractionDetailsActivity interactionDetailsActivity) {
        }

        public final void b(k.i.h.b.h.a.a.e.f.c cVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.h.a.a.e.f.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p implements InteractionDetailHeaderBehavior.a {
        public final /* synthetic */ InteractionDetailsActivity a;

        public p(InteractionDetailsActivity interactionDetailsActivity) {
        }

        @Override // com.tencent.mp.feature.interaction.ui.view.InteractionDetailHeaderBehavior.a
        public void a(View view, int i2) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionDetailsActivity$loadBizAccount$1", f = "InteractionDetailsActivity.kt", l = {913}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class q extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ InteractionDetailsActivity c;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionDetailsActivity$loadBizAccount$1$1", f = "InteractionDetailsActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ InteractionDetailsActivity b;

            public a(InteractionDetailsActivity interactionDetailsActivity, n.a0.d<? super a> dVar) {
            }

            @Override // n.a0.k.a.a
            public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ Object invoke(t0 t0Var, n.a0.d<? super Boolean> dVar) {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(t0 t0Var, n.a0.d<? super Boolean> dVar) {
            }

            @Override // n.a0.k.a.a
            public final Object invokeSuspend(Object obj) {
            }
        }

        public q(InteractionDetailsActivity interactionDetailsActivity, n.a0.d<? super q> dVar) {
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
    public static final class r extends n.d0.d.o implements n.d0.c.a<k.i.h.b.h.a.a.i.a> {
        public static final r a = null;

        public final k.i.h.b.h.a.a.i.a b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.h.a.a.i.a invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class s extends n.d0.d.o implements n.d0.c.a<k.i.h.b.o.l.a> {
        public static final s a = null;

        public final k.i.h.b.o.l.a b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.o.l.a invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class t extends n.d0.d.o implements n.d0.c.p<String, String, n.u> {
        public final /* synthetic */ InteractionDetailsActivity a;
        public final /* synthetic */ Intent b;

        public t(InteractionDetailsActivity interactionDetailsActivity, Intent intent) {
        }

        public final void b(String str, String str2) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(String str, String str2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class u implements k.i.d.b.c.a.a.h<k.i.h.b.d.w0.c.i<ec>> {
        public final /* synthetic */ InteractionDetailsActivity a;
        public final /* synthetic */ boolean b;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionDetailsActivity$onClickMenuSwitchComment$1$onTaskEnd$1", f = "InteractionDetailsActivity.kt", l = {1158}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
            public int a;
            public final /* synthetic */ InteractionDetailsActivity b;
            public final /* synthetic */ int c;

            public a(InteractionDetailsActivity interactionDetailsActivity, int i2, n.a0.d<? super a> dVar) {
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

        @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionDetailsActivity$onClickMenuSwitchComment$1$onTaskEnd$2", f = "InteractionDetailsActivity.kt", l = {1175}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
            public int a;
            public final /* synthetic */ InteractionDetailsActivity b;
            public final /* synthetic */ String c;

            public b(InteractionDetailsActivity interactionDetailsActivity, String str, n.a0.d<? super b> dVar) {
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

        public u(InteractionDetailsActivity interactionDetailsActivity, boolean z) {
        }

        @Override // k.i.d.b.c.a.a.h
        public /* bridge */ /* synthetic */ void a(k.i.h.b.d.w0.c.i<ec> iVar) {
        }

        public void b(k.i.h.b.d.w0.c.i<ec> iVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class v extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ InteractionDetailsActivity a;

        public v(InteractionDetailsActivity interactionDetailsActivity) {
        }

        public static final void b(InteractionDetailsActivity interactionDetailsActivity, View view) {
        }

        public static final void c(k.i.h.b.d.b1.p.u uVar, View view) {
        }

        public static final void d(InteractionDetailsActivity interactionDetailsActivity, k.i.h.b.d.b1.d.d dVar) {
        }

        public static final void f(InteractionDetailsActivity interactionDetailsActivity, MenuItem menuItem, int i2) {
        }

        public static /* synthetic */ void g(k.i.h.b.d.b1.p.u uVar, View view) {
        }

        public static /* synthetic */ void h(InteractionDetailsActivity interactionDetailsActivity, k.i.h.b.d.b1.d.d dVar) {
        }

        public static /* synthetic */ void i(InteractionDetailsActivity interactionDetailsActivity, MenuItem menuItem, int i2) {
        }

        public static /* synthetic */ void l(InteractionDetailsActivity interactionDetailsActivity, View view) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class w extends k.a.a.t.l.h<Bitmap> {
        public final /* synthetic */ InteractionDetailsActivity d;

        public w(InteractionDetailsActivity interactionDetailsActivity) {
        }

        @Override // k.a.a.t.l.j
        public /* bridge */ /* synthetic */ void b(Object obj, k.a.a.t.m.f fVar) {
        }

        public void m(Bitmap bitmap, k.a.a.t.m.f<? super Bitmap> fVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class x extends n.d0.d.o implements n.d0.c.l<TabLayout.g, n.u> {
        public final /* synthetic */ InteractionDetailsActivity a;
        public final /* synthetic */ Integer b;
        public final /* synthetic */ String c;

        public x(InteractionDetailsActivity interactionDetailsActivity, Integer num, String str) {
        }

        public final void b(TabLayout.g gVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(TabLayout.g gVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class y extends n.d0.d.o implements n.d0.c.p<String, Class<? extends i1>, n.u> {
        public final /* synthetic */ Map<String, n.i0.d<Boolean>> a;
        public final /* synthetic */ LinkedHashMap<String, i1> b;
        public final /* synthetic */ InteractionDetailsActivity c;

        public y(Map<String, ? extends n.i0.d<Boolean>> map, LinkedHashMap<String, i1> linkedHashMap, InteractionDetailsActivity interactionDetailsActivity) {
        }

        public final void b(String str, Class<? extends i1> cls) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(String str, Class<? extends i1> cls) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class z extends n.d0.d.o implements n.d0.c.a<Boolean> {
        public final /* synthetic */ InteractionDetailsActivity a;

        public z(InteractionDetailsActivity interactionDetailsActivity) {
        }

        public final Boolean b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Boolean invoke() {
        }
    }

    public static final void C2(InteractionDetailsActivity interactionDetailsActivity, View view) {
    }

    public static final void G2(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ i1 H1(InteractionDetailsActivity interactionDetailsActivity, Class cls) {
    }

    public static final boolean H2(InteractionDetailsActivity interactionDetailsActivity, View view, MotionEvent motionEvent) {
    }

    public static final /* synthetic */ void I1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ void J1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ Integer K1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ k.i.h.b.o.j.a L1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ String M1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ k.i.h.d.d N1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ k.i.h.b.h.a.a.i.a O1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static /* synthetic */ void O2(InteractionDetailsActivity interactionDetailsActivity, k.i.h.b.o.l.b.c cVar) {
    }

    public static final /* synthetic */ k.i.h.b.d.b1.f.c P1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static /* synthetic */ void P2(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ k.i.h.b.o.l.b.c Q1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static /* synthetic */ void Q2(InteractionDetailsActivity interactionDetailsActivity, boolean z2, n.d0.c.l lVar, k.i.h.b.d.w0.c.i iVar) {
    }

    public static final /* synthetic */ boolean R1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static /* synthetic */ void R2(InteractionDetailsActivity interactionDetailsActivity, k.i.h.a.a.a aVar) {
    }

    public static final /* synthetic */ LinkedHashMap S1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static /* synthetic */ void S2(InteractionDetailsActivity interactionDetailsActivity, View view) {
    }

    public static final /* synthetic */ boolean T1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static /* synthetic */ boolean T2(InteractionDetailsActivity interactionDetailsActivity, View view, MotionEvent motionEvent) {
    }

    public static final /* synthetic */ boolean U1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ boolean V1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ boolean W1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final void W2(InteractionDetailsActivity interactionDetailsActivity, k.i.h.b.o.l.b.c cVar) {
    }

    public static final /* synthetic */ boolean X1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ boolean Y1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static /* synthetic */ void Y2(InteractionDetailsActivity interactionDetailsActivity, boolean z2, n.d0.c.l lVar, int i2, Object obj) {
    }

    public static final /* synthetic */ boolean Z1(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final void Z2(InteractionDetailsActivity interactionDetailsActivity, boolean z2, n.d0.c.l lVar, k.i.h.b.d.w0.c.i iVar) {
    }

    public static final /* synthetic */ void a2(InteractionDetailsActivity interactionDetailsActivity, boolean z2, n.d0.c.l lVar) {
    }

    public static final /* synthetic */ void b2(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ void c2(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final void c3(InteractionDetailsActivity interactionDetailsActivity, k.i.h.a.a.a aVar) {
    }

    public static final /* synthetic */ void d2(InteractionDetailsActivity interactionDetailsActivity, boolean z2) {
    }

    public static final /* synthetic */ void e2(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ void f2(InteractionDetailsActivity interactionDetailsActivity, k.i.h.b.h.a.a.e.f.c cVar, String str) {
    }

    public static final /* synthetic */ void g2(InteractionDetailsActivity interactionDetailsActivity, k.i.h.b.h.a.a.e.f.c cVar) {
    }

    public static final /* synthetic */ void h2(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ void i2(InteractionDetailsActivity interactionDetailsActivity) {
    }

    public static final /* synthetic */ void j2(InteractionDetailsActivity interactionDetailsActivity, boolean z2) {
    }

    public static final /* synthetic */ void k2(InteractionDetailsActivity interactionDetailsActivity, String str) {
    }

    public static final /* synthetic */ void l2(InteractionDetailsActivity interactionDetailsActivity, int i2) {
    }

    public static final /* synthetic */ void m2(InteractionDetailsActivity interactionDetailsActivity, boolean z2) {
    }

    public static final /* synthetic */ void n2(InteractionDetailsActivity interactionDetailsActivity, String str) {
    }

    public final void A2(Bundle bundle) {
    }

    public final void B2() {
    }

    public final void D2() {
    }

    public final void E2() {
    }

    public final void F2() {
    }

    public View G1(int i2) {
    }

    @Override // k.i.h.b.o.m.h0.i1.a
    public void I0(k.i.h.b.h.a.a.e.f.c cVar) {
    }

    public final boolean I2() {
    }

    public final boolean J2() {
    }

    public final boolean K2() {
    }

    public final boolean L2() {
    }

    public final boolean M2() {
    }

    public final boolean N2() {
    }

    public final f2 U2() {
    }

    @Override // k.i.h.b.o.m.h0.i1.a
    public void V(boolean z2, n.d0.c.l<? super String, n.u> lVar) {
    }

    public final void V2() {
    }

    @Override // k.i.h.b.d.b1.a
    public j.z.a X0() {
    }

    public final void X2(boolean z2, n.d0.c.l<? super k.i.h.b.h.a.a.e.f.c, n.u> lVar) {
    }

    public final void a3(k.i.h.b.o.l.b.c cVar, k.i.h.b.h.a.a.e.f.c cVar2) {
    }

    public final void b3() {
    }

    @Override // k.i.h.b.o.m.h0.i1.a
    public void c() {
    }

    public final void d3() {
    }

    public final void e3() {
    }

    public final void f3(boolean z2) {
    }

    @Override // k.i.h.b.o.m.h0.i1.a
    public void g0() {
    }

    public final void g3() {
    }

    public final void h3() {
    }

    public final void i3(k.i.h.b.h.a.a.e.f.c cVar, String str) {
    }

    public final void j3(k.i.h.b.h.a.a.e.f.c cVar) {
    }

    public final void k3() {
    }

    public final void l3() {
    }

    public final void m3(int i2) {
    }

    @Override // k.i.h.b.o.m.h0.i1.a
    public void n0(View view, RecyclerView recyclerView) {
    }

    public final void n3() {
    }

    public final i1 o2(Class<? extends i1> cls) {
    }

    public final void o3(String str) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // k.i.h.b.d.b1.b, j.b.k.d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // k.i.h.b.d.b1.a, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
    }

    public final void p2() {
    }

    public final void p3(View view, RecyclerView recyclerView) {
    }

    public final void q2(String str) {
    }

    public final void r2() {
    }

    public final void s2() {
    }

    public final k.i.h.b.o.j.a t2() {
    }

    public final k.i.h.d.d u2() {
    }

    @Override // k.i.h.b.o.m.h0.i1.a
    public void v0(String str) {
    }

    public final k.i.h.b.h.a.a.i.a v2() {
    }

    public final k.i.h.b.o.l.a w2() {
    }

    public final Map<String, n.i0.d<Boolean>> x2() {
    }

    public final void y2() {
    }

    public final void z2() {
    }
}
