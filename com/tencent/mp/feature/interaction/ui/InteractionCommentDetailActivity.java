package com.tencent.mp.feature.interaction.ui;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import com.tencent.mp.feature.base.ui.chat.ChatFooter;
import com.tencent.mp.framework.ui.widget.recyclerview.RefreshRecyclerView;
import java.util.List;
import java.util.Map;
import k.i.h.b.o.m.f0.w0;
import o.a.f2;
import o.a.t0;
import q.ec;
import q.ig;
import q.o7;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class InteractionCommentDetailActivity extends k.i.h.b.d.b1.e.c {
    public k.i.h.b.d.b1.f.c A;
    public final o.a.r3.f<String> B;
    public boolean C;
    public boolean D;
    public boolean E;
    public Rect F;
    public int G;
    public boolean H;
    public Map<Integer, View> I;

    /* renamed from: j, reason: collision with root package name */
    public final int f1565j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1566k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1567l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1568m;

    /* renamed from: n, reason: collision with root package name */
    public final n.d f1569n;

    /* renamed from: o, reason: collision with root package name */
    public final n.d f1570o;

    /* renamed from: p, reason: collision with root package name */
    public final n.d f1571p;

    /* renamed from: q, reason: collision with root package name */
    public final n.d f1572q;

    /* renamed from: r, reason: collision with root package name */
    public final n.d f1573r;

    /* renamed from: s, reason: collision with root package name */
    public final n.d f1574s;

    /* renamed from: t, reason: collision with root package name */
    public final n.d f1575t;
    public int u;
    public int v;
    public final List<k.i.h.b.o.m.i0.g> w;
    public ig x;
    public final n.d y;
    public w0 z;

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$deleteComment$1$1", f = "InteractionCommentDetailActivity.kt", l = {353}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ InteractionCommentDetailActivity c;
        public final /* synthetic */ k.i.h.b.o.m.i0.f d;

        public a(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, n.a0.d<? super a> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$onCommentTopSetup$1", f = "InteractionCommentDetailActivity.kt", l = {506}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ InteractionCommentDetailActivity b;
        public final /* synthetic */ k.i.h.b.o.m.i0.f c;

        public a0(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, n.a0.d<? super a0> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$deleteReply$1$1", f = "InteractionCommentDetailActivity.kt", l = {827}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ InteractionCommentDetailActivity c;
        public final /* synthetic */ k.i.h.b.o.m.i0.g d;
        public final /* synthetic */ int e;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.l<k.i.h.b.o.m.i0.g, Boolean> {
            public final /* synthetic */ k.i.h.b.o.m.i0.g a;

            public a(k.i.h.b.o.m.i0.g gVar) {
            }

            public final Boolean b(k.i.h.b.o.m.i0.g gVar) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ Boolean invoke(k.i.h.b.o.m.i0.g gVar) {
            }
        }

        public b(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, int i2, n.a0.d<? super b> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$onReplyElectedCancel$1", f = "InteractionCommentDetailActivity.kt", l = {612}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ View b;
        public final /* synthetic */ InteractionCommentDetailActivity c;
        public final /* synthetic */ k.i.h.b.o.m.i0.g d;

        public b0(View view, InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, n.a0.d<? super b0> dVar) {
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
    public static final class c implements k.i.d.b.c.a.a.h<k.i.h.b.d.w0.c.i<ec>> {
        public final /* synthetic */ InteractionCommentDetailActivity a;
        public final /* synthetic */ k.i.h.b.o.m.i0.g b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<n.u> {
            public final /* synthetic */ InteractionCommentDetailActivity a;

            public a(InteractionCommentDetailActivity interactionCommentDetailActivity) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public c(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar) {
        }

        @Override // k.i.d.b.c.a.a.h
        public /* bridge */ /* synthetic */ void a(k.i.h.b.d.w0.c.i<ec> iVar) {
        }

        public void b(k.i.h.b.d.w0.c.i<ec> iVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$onReplyElectedSetup$1", f = "InteractionCommentDetailActivity.kt", l = {566}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ View b;
        public final /* synthetic */ InteractionCommentDetailActivity c;
        public final /* synthetic */ k.i.h.b.o.m.i0.g d;

        public c0(View view, InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, n.a0.d<? super c0> dVar) {
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
    public static final class d implements k.i.d.b.c.a.a.h<k.i.h.b.d.w0.c.i<ec>> {
        public final /* synthetic */ n.a0.d<ec> a;
        public final /* synthetic */ InteractionCommentDetailActivity b;
        public final /* synthetic */ int c;

        public d(n.a0.d<? super ec> dVar, InteractionCommentDetailActivity interactionCommentDetailActivity, int i2) {
        }

        @Override // k.i.d.b.c.a.a.h
        public /* bridge */ /* synthetic */ void a(k.i.h.b.d.w0.c.i<ec> iVar) {
        }

        public void b(k.i.h.b.d.w0.c.i<ec> iVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$removeComment$1$1", f = "InteractionCommentDetailActivity.kt", l = {418}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ InteractionCommentDetailActivity c;
        public final /* synthetic */ k.i.h.b.o.m.i0.f d;

        public d0(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, n.a0.d<? super d0> dVar) {
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
    public static final class e implements k.i.d.b.c.a.a.h<k.i.h.b.d.w0.c.i<ec>> {
        public final /* synthetic */ InteractionCommentDetailActivity a;
        public final /* synthetic */ k.i.h.b.o.m.i0.g b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<n.u> {
            public final /* synthetic */ InteractionCommentDetailActivity a;

            public a(InteractionCommentDetailActivity interactionCommentDetailActivity) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public e(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar) {
        }

        @Override // k.i.d.b.c.a.a.h
        public /* bridge */ /* synthetic */ void a(k.i.h.b.d.w0.c.i<ec> iVar) {
        }

        public void b(k.i.h.b.d.w0.c.i<ec> iVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$removeReply$1$1", f = "InteractionCommentDetailActivity.kt", l = {906}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ InteractionCommentDetailActivity c;
        public final /* synthetic */ k.i.h.b.o.m.i0.g d;
        public final /* synthetic */ int e;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.l<k.i.h.b.o.m.i0.g, Boolean> {
            public final /* synthetic */ k.i.h.b.o.m.i0.g a;

            public a(k.i.h.b.o.m.i0.g gVar) {
            }

            public final Boolean b(k.i.h.b.o.m.i0.g gVar) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ Boolean invoke(k.i.h.b.o.m.i0.g gVar) {
            }
        }

        public e0(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, int i2, n.a0.d<? super e0> dVar) {
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
    public /* synthetic */ class f extends n.d0.d.l implements n.d0.c.q<k.i.h.b.o.m.i0.g, Integer, View, n.u> {
        public f(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(k.i.h.b.o.m.i0.g gVar, Integer num, View view) {
        }

        public final void m(k.i.h.b.o.m.i0.g gVar, int i2, View view) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$replyComment$1", f = "InteractionCommentDetailActivity.kt", l = {373, 380}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ InteractionCommentDetailActivity c;
        public final /* synthetic */ k.i.h.b.o.m.i0.f d;

        public f0(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, n.a0.d<? super f0> dVar) {
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
    public /* synthetic */ class g extends n.d0.d.l implements n.d0.c.q<k.i.h.b.o.m.i0.g, Integer, View, n.u> {
        public g(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(k.i.h.b.o.m.i0.g gVar, Integer num, View view) {
        }

        public final void m(k.i.h.b.o.m.i0.g gVar, int i2, View view) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$replyReply$1", f = "InteractionCommentDetailActivity.kt", l = {857, 864}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ InteractionCommentDetailActivity c;
        public final /* synthetic */ k.i.h.b.o.m.i0.g d;
        public final /* synthetic */ String e;

        public g0(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, String str, n.a0.d<? super g0> dVar) {
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
    public static final class h extends k.i.h.b.d.b1.f.h {
        public final /* synthetic */ InteractionCommentDetailActivity a;

        @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$initView$13$onKeyBack$1", f = "InteractionCommentDetailActivity.kt", l = {167}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
            public int a;
            public final /* synthetic */ InteractionCommentDetailActivity b;

            public a(InteractionCommentDetailActivity interactionCommentDetailActivity, n.a0.d<? super a> dVar) {
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

        @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$initView$13$onSendTextRequest$1", f = "InteractionCommentDetailActivity.kt", l = {161}, m = "invokeSuspend")
        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
            public int a;
            public final /* synthetic */ InteractionCommentDetailActivity b;
            public final /* synthetic */ String c;

            public b(InteractionCommentDetailActivity interactionCommentDetailActivity, String str, n.a0.d<? super b> dVar) {
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

        public h(InteractionCommentDetailActivity interactionCommentDetailActivity) {
        }

        @Override // k.i.h.b.d.b1.f.b
        public void a(boolean z) {
        }

        @Override // k.i.h.b.d.b1.f.h, k.i.h.b.d.b1.f.b
        public boolean d() {
        }

        @Override // k.i.h.b.d.b1.f.b
        public boolean e(String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final h0 a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class i extends n.d0.d.l implements n.d0.c.q<k.i.h.b.o.m.i0.h, Integer, View, n.u> {
        public i(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(k.i.h.b.o.m.i0.h hVar, Integer num, View view) {
        }

        public final void m(k.i.h.b.o.m.i0.h hVar, int i2, View view) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$showArticleDeletedDialog$1", f = "InteractionCommentDetailActivity.kt", l = {1076}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ InteractionCommentDetailActivity b;

        public i0(InteractionCommentDetailActivity interactionCommentDetailActivity, n.a0.d<? super i0> dVar) {
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
    public /* synthetic */ class j extends n.d0.d.l implements n.d0.c.q<k.i.h.b.o.m.i0.f, Integer, View, n.u> {
        public j(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(k.i.h.b.o.m.i0.f fVar, Integer num, View view) {
        }

        public final void m(k.i.h.b.o.m.i0.f fVar, int i2, View view) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$showFooterVKB$1", f = "InteractionCommentDetailActivity.kt", l = {954}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ InteractionCommentDetailActivity b;

        public j0(InteractionCommentDetailActivity interactionCommentDetailActivity, n.a0.d<? super j0> dVar) {
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
    public /* synthetic */ class k extends n.d0.d.l implements n.d0.c.q<k.i.h.b.o.m.i0.f, Integer, View, n.u> {
        public k(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(k.i.h.b.o.m.i0.f fVar, Integer num, View view) {
        }

        public final void m(k.i.h.b.o.m.i0.f fVar, int i2, View view) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$showOpCommentErrorDialog$1", f = "InteractionCommentDetailActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ InteractionCommentDetailActivity b;
        public final /* synthetic */ String c;

        public k0(InteractionCommentDetailActivity interactionCommentDetailActivity, String str, n.a0.d<? super k0> dVar) {
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
    public /* synthetic */ class l extends n.d0.d.l implements n.d0.c.q<k.i.h.b.o.m.i0.f, Integer, View, n.u> {
        public l(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(k.i.h.b.o.m.i0.f fVar, Integer num, View view) {
        }

        public final void m(k.i.h.b.o.m.i0.f fVar, int i2, View view) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$showOpCommentErrorDialog$2", f = "InteractionCommentDetailActivity.kt", l = {1066}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ InteractionCommentDetailActivity b;
        public final /* synthetic */ n.d0.d.b0<String> c;

        public l0(InteractionCommentDetailActivity interactionCommentDetailActivity, n.d0.d.b0<String> b0Var, n.a0.d<? super l0> dVar) {
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
    public /* synthetic */ class m extends n.d0.d.l implements n.d0.c.p<k.i.h.b.o.m.i0.f, Integer, n.u> {
        public m(Object obj) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.o.m.i0.f fVar, Integer num) {
        }

        public final void m(k.i.h.b.o.m.i0.f fVar, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m0 extends n.d0.d.o implements n.d0.c.a<Integer> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public m0(Activity activity, String str, Object obj) {
        }

        @Override // n.d0.c.a
        public final Integer invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class n extends n.d0.d.l implements n.d0.c.p<k.i.h.b.o.m.i0.f, Integer, n.u> {
        public n(Object obj) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.o.m.i0.f fVar, Integer num) {
        }

        public final void m(k.i.h.b.o.m.i0.f fVar, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n0 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.o.m.i0.f> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public n0(Activity activity, String str, Object obj) {
        }

        @Override // n.d0.c.a
        public final k.i.h.b.o.m.i0.f invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class o extends n.d0.d.l implements n.d0.c.q<k.i.h.b.o.m.i0.g, View, Integer, n.u> {
        public o(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(k.i.h.b.o.m.i0.g gVar, View view, Integer num) {
        }

        public final void m(k.i.h.b.o.m.i0.g gVar, View view, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o0 extends n.d0.d.o implements n.d0.c.a<Boolean> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public o0(Activity activity, String str, Object obj) {
        }

        @Override // n.d0.c.a
        public final Boolean invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class p extends n.d0.d.l implements n.d0.c.p<k.i.h.b.o.m.i0.g, Integer, n.u> {
        public p(Object obj) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.o.m.i0.g gVar, Integer num) {
        }

        public final void m(k.i.h.b.o.m.i0.g gVar, int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p0 extends n.d0.d.o implements n.d0.c.a<Integer> {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public p0(Activity activity, String str, Object obj) {
        }

        @Override // n.d0.c.a
        public final Integer invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class q extends n.d0.d.l implements n.d0.c.p<k.i.h.b.o.m.i0.g, Integer, n.u> {
        public q(Object obj) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.o.m.i0.g gVar, Integer num) {
        }

        public final void m(k.i.h.b.o.m.i0.g gVar, int i2) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$updateView$1", f = "InteractionCommentDetailActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class q0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ InteractionCommentDetailActivity b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends k.i.h.b.o.m.i0.c {
        }

        public q0(InteractionCommentDetailActivity interactionCommentDetailActivity, n.a0.d<? super q0> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$loadBizProfile$1", f = "InteractionCommentDetailActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class r extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ InteractionCommentDetailActivity b;

        public r(InteractionCommentDetailActivity interactionCommentDetailActivity, n.a0.d<? super r> dVar) {
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
    public static final class s implements k.i.d.b.c.a.a.h<k.i.h.b.d.w0.c.i<o7>> {
        public final /* synthetic */ InteractionCommentDetailActivity a;

        public s(InteractionCommentDetailActivity interactionCommentDetailActivity) {
        }

        @Override // k.i.d.b.c.a.a.h
        public /* bridge */ /* synthetic */ void a(k.i.h.b.d.w0.c.i<o7> iVar) {
        }

        public void b(k.i.h.b.d.w0.c.i<o7> iVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class t extends n.d0.d.o implements n.d0.c.a<RefreshRecyclerView> {
        public final /* synthetic */ InteractionCommentDetailActivity a;

        public t(InteractionCommentDetailActivity interactionCommentDetailActivity) {
        }

        public final RefreshRecyclerView b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ RefreshRecyclerView invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class u extends n.d0.d.o implements n.d0.c.a<ChatFooter> {
        public final /* synthetic */ InteractionCommentDetailActivity a;

        public u(InteractionCommentDetailActivity interactionCommentDetailActivity) {
        }

        public final ChatFooter b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ChatFooter invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class v extends n.d0.d.o implements n.d0.c.a<k.i.h.b.o.l.a> {
        public static final v a = null;

        public final k.i.h.b.o.l.a b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.o.l.a invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class w extends n.d0.d.o implements n.d0.c.a<ProgressBar> {
        public final /* synthetic */ InteractionCommentDetailActivity a;

        public w(InteractionCommentDetailActivity interactionCommentDetailActivity) {
        }

        public final ProgressBar b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ProgressBar invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$onCommentElectedCancel$1", f = "InteractionCommentDetailActivity.kt", l = {478}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class x extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ View b;
        public final /* synthetic */ InteractionCommentDetailActivity c;
        public final /* synthetic */ k.i.h.b.o.m.i0.f d;

        public x(View view, InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, n.a0.d<? super x> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$onCommentElectedSetup$1", f = "InteractionCommentDetailActivity.kt", l = {447}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class y extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ View b;
        public final /* synthetic */ InteractionCommentDetailActivity c;
        public final /* synthetic */ k.i.h.b.o.m.i0.f d;

        public y(View view, InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, n.a0.d<? super y> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.interaction.ui.InteractionCommentDetailActivity$onCommentTopCancel$1", f = "InteractionCommentDetailActivity.kt", l = {531}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class z extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ InteractionCommentDetailActivity b;
        public final /* synthetic */ k.i.h.b.o.m.i0.f c;

        public z(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, n.a0.d<? super z> dVar) {
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

    public static final /* synthetic */ void A2(InteractionCommentDetailActivity interactionCommentDetailActivity, ig igVar) {
    }

    public static final /* synthetic */ void B2(InteractionCommentDetailActivity interactionCommentDetailActivity, boolean z2) {
    }

    public static final /* synthetic */ void C2(InteractionCommentDetailActivity interactionCommentDetailActivity, boolean z2) {
    }

    public static final void C3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, boolean z2, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ void D2(InteractionCommentDetailActivity interactionCommentDetailActivity, boolean z2) {
    }

    public static final void D3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, View view, int i2, MenuItem menuItem, int i3) {
    }

    public static final /* synthetic */ void E2(InteractionCommentDetailActivity interactionCommentDetailActivity, int i2) {
    }

    public static final /* synthetic */ void F2(InteractionCommentDetailActivity interactionCommentDetailActivity, int i2) {
    }

    public static final /* synthetic */ void G2(InteractionCommentDetailActivity interactionCommentDetailActivity, boolean z2) {
    }

    public static final /* synthetic */ void H2(InteractionCommentDetailActivity interactionCommentDetailActivity, boolean z2) {
    }

    public static final /* synthetic */ void I2(InteractionCommentDetailActivity interactionCommentDetailActivity, int i2, int i3, String str) {
    }

    public static final /* synthetic */ f2 J2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static final void J3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, MenuItem menuItem, int i2) {
    }

    private final void K1() {
    }

    public static final void L2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, MenuItem menuItem, int i2) {
    }

    public static final void L3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, int i2, MenuItem menuItem, int i3) {
    }

    public static final void N2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, int i2, MenuItem menuItem, int i3) {
    }

    public static /* synthetic */ Object R2(InteractionCommentDetailActivity interactionCommentDetailActivity, int i2, k.i.h.b.o.m.i0.f fVar, k.i.h.b.o.m.i0.g gVar, String str, n.a0.d dVar, int i3, Object obj) {
    }

    public static final void R3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final void S3(k.i.h.b.d.b1.p.u uVar, View view) {
    }

    public static final void W3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ void X1(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static final void X3(k.i.h.b.d.b1.p.u uVar, View view) {
    }

    public static final /* synthetic */ Object Y1(InteractionCommentDetailActivity interactionCommentDetailActivity, int i2, k.i.h.b.o.m.i0.f fVar, k.i.h.b.o.m.i0.g gVar, String str, n.a0.d dVar) {
    }

    public static final /* synthetic */ ig Z1(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static final /* synthetic */ k.i.h.b.o.m.i0.f a2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static final /* synthetic */ w0 b2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static final void b3(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static final /* synthetic */ RefreshRecyclerView c2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static final /* synthetic */ k.i.h.b.d.b1.f.c d2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static /* synthetic */ void d3(k.i.h.b.d.b1.p.u uVar, View view) {
    }

    public static final /* synthetic */ o.a.r3.f e2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static /* synthetic */ void e3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, boolean z2, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ boolean f2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static /* synthetic */ void f3(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static final /* synthetic */ boolean g2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static /* synthetic */ void g3(k.i.h.b.d.b1.p.u uVar, View view) {
    }

    public static final /* synthetic */ ProgressBar h2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static /* synthetic */ void h3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, int i2, MenuItem menuItem, int i3) {
    }

    public static final /* synthetic */ int i2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static /* synthetic */ void i3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, View view, int i2, MenuItem menuItem, int i3) {
    }

    public static final /* synthetic */ int j2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static /* synthetic */ void j3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, MenuItem menuItem, int i2) {
    }

    public static final /* synthetic */ List k2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static /* synthetic */ void k3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ int l2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static /* synthetic */ void l3(k.i.h.b.o.m.i0.f fVar, InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ boolean m2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static /* synthetic */ void m3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, int i2, MenuItem menuItem, int i3) {
    }

    public static final /* synthetic */ boolean n2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public static /* synthetic */ void n3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, MenuItem menuItem, int i2) {
    }

    public static final /* synthetic */ void o2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.h hVar, int i2, View view) {
    }

    public static /* synthetic */ void o3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, View view, int i2, MenuItem menuItem, int i3) {
    }

    public static final /* synthetic */ void p2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, int i2, View view) {
    }

    public static /* synthetic */ void p3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ void q2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, int i2, View view) {
    }

    public static final /* synthetic */ void r2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, int i2, View view) {
    }

    public static final /* synthetic */ void s2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, int i2) {
    }

    public static /* synthetic */ void s3(InteractionCommentDetailActivity interactionCommentDetailActivity, boolean z2, int i2, Object obj) {
    }

    public static final /* synthetic */ void t2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, int i2) {
    }

    public static final /* synthetic */ void u2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, View view, int i2) {
    }

    public static final /* synthetic */ void v2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, int i2, View view) {
    }

    public static final void v3(k.i.h.b.o.m.i0.f fVar, InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ void w2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, int i2, View view) {
    }

    public static final void w3(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.f fVar, View view, int i2, MenuItem menuItem, int i3) {
    }

    public static final /* synthetic */ void x2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, int i2) {
    }

    public static final /* synthetic */ void y2(InteractionCommentDetailActivity interactionCommentDetailActivity, k.i.h.b.o.m.i0.g gVar, int i2) {
    }

    public static final /* synthetic */ void z2(InteractionCommentDetailActivity interactionCommentDetailActivity) {
    }

    public final void A3(k.i.h.b.o.m.i0.f fVar, int i2) {
    }

    public final void B3(k.i.h.b.o.m.i0.g gVar, View view, int i2) {
    }

    public final void E3(k.i.h.b.o.m.i0.g gVar, int i2, View view) {
    }

    public final void F3(k.i.h.b.o.m.i0.g gVar, int i2, View view) {
    }

    public final void G3(k.i.h.b.o.m.i0.g gVar, int i2) {
    }

    @Override // k.i.h.b.d.b1.e.c
    public int H1() {
    }

    public final void H3(k.i.h.b.o.m.i0.g gVar, int i2) {
    }

    public final void I3(k.i.h.b.o.m.i0.f fVar, View view, int i2) {
    }

    public final void K2(k.i.h.b.o.m.i0.f fVar, View view, int i2) {
    }

    public final void K3(k.i.h.b.o.m.i0.g gVar, View view, int i2) {
    }

    public final void M2(k.i.h.b.o.m.i0.g gVar, View view, int i2) {
    }

    public final void M3(k.i.h.b.o.m.i0.f fVar, View view, int i2) {
    }

    public final void N3(k.i.h.b.o.m.i0.g gVar, View view, int i2) {
    }

    public final void O2() {
    }

    public final void O3() {
    }

    public final void P2(long j2, int i2, k.i.h.b.o.m.i0.g gVar, int i3) {
    }

    public final void P3() {
    }

    public final Object Q2(int i2, k.i.h.b.o.m.i0.f fVar, k.i.h.b.o.m.i0.g gVar, String str, n.a0.d<? super ec> dVar) {
    }

    public final void Q3(k.i.h.b.d.b1.d.i iVar) {
    }

    public final void S2(long j2, int i2, k.i.h.b.o.m.i0.g gVar, int i3) {
    }

    public final boolean T2() {
    }

    public final void T3(boolean z2) {
    }

    public final int U2() {
    }

    public final void U3(int i2, int i3, String str) {
    }

    public final k.i.h.b.o.m.i0.f V2() {
    }

    public final void V3(int i2, k.i.h.b.d.b1.d.i iVar) {
    }

    public View W1(int i2) {
    }

    public final RefreshRecyclerView W2() {
    }

    public final ChatFooter X2() {
    }

    public final k.i.h.b.o.l.a Y2() {
    }

    public final f2 Y3() {
    }

    public final ProgressBar Z2() {
    }

    public final void Z3(View view) {
    }

    public final int a3() {
    }

    public final boolean c3() {
    }

    @Override // k.i.h.b.d.b1.e.c, k.i.h.b.d.b1.a, android.app.Activity
    public void finish() {
    }

    @Override // k.i.h.b.d.b1.e.c, k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    public final void q3() {
    }

    public final void r3(boolean z2) {
    }

    public final void t3(k.i.h.b.o.m.i0.h hVar, int i2, View view) {
    }

    public final void u3(k.i.h.b.o.m.i0.f fVar, int i2, View view) {
    }

    public final void x3(k.i.h.b.o.m.i0.f fVar, int i2, View view) {
    }

    public final void y3(k.i.h.b.o.m.i0.f fVar, int i2, View view) {
    }

    public final void z3(k.i.h.b.o.m.i0.f fVar, int i2) {
    }
}
