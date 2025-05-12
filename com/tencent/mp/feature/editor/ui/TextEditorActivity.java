package com.tencent.mp.feature.editor.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.tencent.mp.feature.data.biz.account.domain.article.WxaData;
import com.tencent.xweb.util.WXWebReporter;
import j.e.c.d;
import java.util.List;
import k.i.h.b.d.b1.f.d;
import o.a.f2;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class TextEditorActivity extends k.i.h.b.d.b1.b {
    public k.i.h.b.k.s.x h;

    /* renamed from: i, reason: collision with root package name */
    public k.i.h.b.b.a.q.i.d f1476i;

    /* renamed from: j, reason: collision with root package name */
    public final k.i.h.b.k.l.g f1477j;

    /* renamed from: k, reason: collision with root package name */
    public final n.d f1478k;

    /* renamed from: l, reason: collision with root package name */
    public final n.d f1479l;

    /* renamed from: m, reason: collision with root package name */
    public final n.d f1480m;

    /* renamed from: n, reason: collision with root package name */
    public String f1481n;

    /* renamed from: o, reason: collision with root package name */
    public String f1482o;

    /* renamed from: p, reason: collision with root package name */
    public k.i.h.b.k.s.y.b f1483p;

    /* renamed from: q, reason: collision with root package name */
    public k.i.h.b.b.a.o.i f1484q;

    /* renamed from: r, reason: collision with root package name */
    public final n.d f1485r;

    /* renamed from: s, reason: collision with root package name */
    public final n.d f1486s;

    /* renamed from: t, reason: collision with root package name */
    public final j.a.h.c<Intent> f1487t;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends n.d0.d.o implements n.d0.c.a<k.i.h.b.k.m.g> {
        public final /* synthetic */ TextEditorActivity a;

        public a(TextEditorActivity textEditorActivity) {
        }

        public final k.i.h.b.k.m.g b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.k.m.g invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ TextEditorActivity a;

        public a0(TextEditorActivity textEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.TextEditorActivity", f = "TextEditorActivity.kt", l = {467}, m = "check")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.a0.k.a.d {
        public /* synthetic */ Object a;
        public final /* synthetic */ TextEditorActivity b;
        public int c;

        public b(TextEditorActivity textEditorActivity, n.a0.d<? super b> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final b0 a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.TextEditorActivity$deleteStashFinish$1", f = "TextEditorActivity.kt", l = {WXWebReporter.WXWEB_IDKEY_ID}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ TextEditorActivity b;

        public c(TextEditorActivity textEditorActivity, n.a0.d<? super c> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.TextEditorActivity$insertMiniProgram$1", f = "TextEditorActivity.kt", l = {674}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ TextEditorActivity b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<n.u> {
            public static final a a = null;

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public c0(TextEditorActivity textEditorActivity, n.a0.d<? super c0> dVar) {
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
    public static final class d extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final d a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.TextEditorActivity$loadData$1", f = "TextEditorActivity.kt", l = {396, 421, 422}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ TextEditorActivity c;

        public d0(long j2, TextEditorActivity textEditorActivity, n.a0.d<? super d0> dVar) {
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
    public static final class e extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.a.i.a> {
        public final /* synthetic */ TextEditorActivity a;

        public e(TextEditorActivity textEditorActivity) {
        }

        public final k.i.h.b.b.a.i.a b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.a.i.a invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e0 extends n.d0.d.o implements n.d0.c.a<j.a.h.b<j.a.h.a>> {
        public final /* synthetic */ TextEditorActivity a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<n.u> {
            public static final a a = null;

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public e0(TextEditorActivity textEditorActivity) {
        }

        public static final void c(TextEditorActivity textEditorActivity, j.a.h.a aVar) {
        }

        public static /* synthetic */ void d(TextEditorActivity textEditorActivity, j.a.h.a aVar) {
        }

        public final j.a.h.b<j.a.h.a> b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ j.a.h.b<j.a.h.a> invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.a.i.b> {
        public static final f a = null;

        public final k.i.h.b.b.a.i.b b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.a.i.b invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final f0 a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.TextEditorActivity$goNext$1", f = "TextEditorActivity.kt", l = {459}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ TextEditorActivity b;

        public g(TextEditorActivity textEditorActivity, n.a0.d<? super g> dVar) {
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
    public static final class g0 extends n.d0.d.o implements n.d0.c.a<n.u> {
        public static final g0 a = null;

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h implements d.a {
        public final /* synthetic */ TextEditorActivity a;

        public h(TextEditorActivity textEditorActivity) {
        }

        @Override // k.i.h.b.d.b1.f.d.a
        public void a(String str) {
        }

        @Override // k.i.h.b.d.b1.f.d.a
        public void b() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.TextEditorActivity$onSaveMenu$1", f = "TextEditorActivity.kt", l = {433, 435}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ TextEditorActivity b;

        public h0(TextEditorActivity textEditorActivity, n.a0.d<? super h0> dVar) {
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
    public static final class i extends n.d0.d.o implements n.d0.c.l<String, n.u> {
        public final /* synthetic */ TextEditorActivity a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<n.u> {
            public static final a a = null;

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public i(TextEditorActivity textEditorActivity) {
        }

        public final void b(String str) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(String str) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.TextEditorActivity$saveMaterialAndFinish$1", f = "TextEditorActivity.kt", l = {559, 561}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ TextEditorActivity b;

        public i0(TextEditorActivity textEditorActivity, n.a0.d<? super i0> dVar) {
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
    public /* synthetic */ class j extends n.d0.d.l implements n.d0.c.q<Integer, Integer, String, n.u> {
        public j(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(Integer num, Integer num2, String str) {
        }

        public final void m(int i2, int i3, String str) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.editor.ui.TextEditorActivity$showKeyboardDelay$1", f = "TextEditorActivity.kt", l = {791}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ TextEditorActivity b;

        public j0(TextEditorActivity textEditorActivity, n.a0.d<? super j0> dVar) {
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
    public /* synthetic */ class k extends n.d0.d.l implements n.d0.c.l<Boolean, n.u> {
        public k(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Boolean bool) {
        }

        public final void m(boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class k0 extends n.d0.d.o implements n.d0.c.a<ViewModelStore> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public k0(k.i.h.b.d.b1.b bVar) {
        }

        public final ViewModelStore b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class l extends n.d0.d.l implements n.d0.c.u<Boolean, Boolean, Integer, Integer, Integer, String, String, n.u> {
        public l(Object obj) {
        }

        public final void m(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2) {
        }

        @Override // n.d0.c.u
        public /* bridge */ /* synthetic */ n.u x(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l0 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.d.d1.c> {
        public final /* synthetic */ n.d0.c.a a;
        public final /* synthetic */ k.i.h.b.d.b1.b b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<ViewModelProvider.Factory> {
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
        public static final class b extends n.d0.d.o implements n.d0.c.l<ViewModel, n.u> {
            public final /* synthetic */ k.i.h.b.d.b1.b a;

            public b(k.i.h.b.d.b1.b bVar) {
            }

            public final void b(ViewModel viewModel) {
            }

            @Override // n.d0.c.l
            public /* bridge */ /* synthetic */ n.u invoke(ViewModel viewModel) {
            }
        }

        public l0(n.d0.c.a aVar, k.i.h.b.d.b1.b bVar) {
        }

        public final k.i.h.b.d.d1.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.d.d1.c invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m extends n.d0.d.o implements n.d0.c.a<Long> {
        public final /* synthetic */ TextEditorActivity a;

        public m(TextEditorActivity textEditorActivity) {
        }

        public final Long b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ Long invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m0 extends n.d0.d.o implements n.d0.c.l<k.i.h.b.k.r.e, n.u> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public m0(k.i.h.b.d.b1.b bVar) {
        }

        public final void b(k.i.h.b.k.r.e eVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.k.r.e eVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class n extends n.d0.d.l implements n.d0.c.a<n.u> {
        public n(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        public final void m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class o extends n.d0.d.l implements n.d0.c.a<n.u> {
        public o(Object obj) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        public final void m() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ TextEditorActivity a;

        public p(TextEditorActivity textEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class q extends n.d0.d.l implements n.d0.c.l<Integer, n.u> {
        public q(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Integer num) {
        }

        public final void m(int i2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class r extends n.d0.d.l implements n.d0.c.q<String, String, String, n.u> {
        public r(Object obj) {
        }

        @Override // n.d0.c.q
        public /* bridge */ /* synthetic */ n.u a(String str, String str2, String str3) {
        }

        public final void m(String str, String str2, String str3) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class s extends n.d0.d.l implements n.d0.c.p<String, WxaData, n.u> {
        public s(Object obj) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(String str, WxaData wxaData) {
        }

        public final void m(String str, WxaData wxaData) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class t extends n.d0.d.l implements n.d0.c.l<k.i.h.b.b.a.k.c[], n.u> {
        public t(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.a.k.c[] cVarArr) {
        }

        public final void m(k.i.h.b.b.a.k.c[] cVarArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class u extends n.d0.d.l implements n.d0.c.t<Boolean, Double, Double, Double, Double, k.i.h.b.b.a.k.c[], n.u> {
        public u(Object obj) {
        }

        public final void m(Boolean bool, Double d, Double d2, Double d3, Double d4, k.i.h.b.b.a.k.c[] cVarArr) {
        }

        @Override // n.d0.c.t
        public /* bridge */ /* synthetic */ n.u n(Boolean bool, Double d, Double d2, Double d3, Double d4, k.i.h.b.b.a.k.c[] cVarArr) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public /* synthetic */ class v extends n.d0.d.l implements n.d0.c.l<List<? extends List<? extends k.i.h.b.b.a.k.a>>, n.u> {
        public v(Object obj) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(List<? extends List<? extends k.i.h.b.b.a.k.a>> list) {
        }

        public final void m(List<? extends List<k.i.h.b.b.a.k.a>> list) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class w extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.a.k.c, n.u> {
        public final /* synthetic */ TextEditorActivity a;

        public w(TextEditorActivity textEditorActivity) {
        }

        public final void b(k.i.h.b.b.a.k.c cVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.a.k.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class x extends n.d0.d.o implements n.d0.c.l<j.e.c.d, n.u> {
        public final /* synthetic */ n.d0.c.l<d.a, n.u> a;

        public x(n.d0.c.l<? super d.a, n.u> lVar) {
        }

        public final void b(j.e.c.d dVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(j.e.c.d dVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class y extends n.d0.d.o implements n.d0.c.l<d.a, n.u> {
        public final /* synthetic */ int a;

        public y(int i2) {
        }

        public final void b(d.a aVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(d.a aVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class z extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ TextEditorActivity a;

        public z(TextEditorActivity textEditorActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public static final void A2(TextEditorActivity textEditorActivity, View view) {
    }

    public static final void B2(TextEditorActivity textEditorActivity, View view) {
    }

    public static final void F2(TextEditorActivity textEditorActivity, int i2) {
    }

    public static final /* synthetic */ Object G1(TextEditorActivity textEditorActivity, n.a0.d dVar) {
    }

    public static final /* synthetic */ void H1(TextEditorActivity textEditorActivity) {
    }

    public static final /* synthetic */ void I1(TextEditorActivity textEditorActivity) {
    }

    public static final /* synthetic */ void J1(TextEditorActivity textEditorActivity, String str, String str2, String str3) {
    }

    public static final /* synthetic */ void K1(TextEditorActivity textEditorActivity, String str, WxaData wxaData) {
    }

    public static final void K2(TextEditorActivity textEditorActivity, View view) {
    }

    public static final /* synthetic */ void L1(TextEditorActivity textEditorActivity) {
    }

    public static final /* synthetic */ k.i.h.b.k.m.g M1(TextEditorActivity textEditorActivity) {
    }

    public static final /* synthetic */ k.i.h.b.k.l.g N1(TextEditorActivity textEditorActivity) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.i.a O1(TextEditorActivity textEditorActivity) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.i.b P1(TextEditorActivity textEditorActivity) {
    }

    public static /* synthetic */ void P2(TextEditorActivity textEditorActivity, View view) {
    }

    public static final /* synthetic */ k.i.h.b.k.r.e Q1(TextEditorActivity textEditorActivity) {
    }

    public static /* synthetic */ void Q2(TextEditorActivity textEditorActivity, View view) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.q.i.d R1(TextEditorActivity textEditorActivity) {
    }

    public static /* synthetic */ void R2(TextEditorActivity textEditorActivity, View view) {
    }

    public static final /* synthetic */ String S1(TextEditorActivity textEditorActivity) {
    }

    public static /* synthetic */ void S2(TextEditorActivity textEditorActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ j.a.h.c T1(TextEditorActivity textEditorActivity) {
    }

    public static /* synthetic */ void T2(TextEditorActivity textEditorActivity, MenuItem menuItem, int i2) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.o.i U1(TextEditorActivity textEditorActivity) {
    }

    public static /* synthetic */ void U2(TextEditorActivity textEditorActivity, int i2) {
    }

    public static final /* synthetic */ void V1(TextEditorActivity textEditorActivity, k.i.h.b.b.a.k.c[] cVarArr) {
    }

    public static /* synthetic */ void V2(TextEditorActivity textEditorActivity, View view) {
    }

    public static final /* synthetic */ void W1(TextEditorActivity textEditorActivity) {
    }

    public static /* synthetic */ void W2(TextEditorActivity textEditorActivity, View view) {
    }

    public static final /* synthetic */ void X1(TextEditorActivity textEditorActivity) {
    }

    public static final /* synthetic */ void Y1(TextEditorActivity textEditorActivity, boolean z2) {
    }

    public static final /* synthetic */ void Z1(TextEditorActivity textEditorActivity) {
    }

    public static final /* synthetic */ void a2(TextEditorActivity textEditorActivity, int i2) {
    }

    public static final /* synthetic */ void b2(TextEditorActivity textEditorActivity) {
    }

    public static final /* synthetic */ void c2(TextEditorActivity textEditorActivity) {
    }

    public static final /* synthetic */ void d2(TextEditorActivity textEditorActivity, String str) {
    }

    public static final /* synthetic */ void e2(TextEditorActivity textEditorActivity, Boolean bool, Double d2, Double d3, Double d4, Double d5, k.i.h.b.b.a.k.c[] cVarArr) {
    }

    public static final /* synthetic */ void f2(TextEditorActivity textEditorActivity) {
    }

    public static final /* synthetic */ void g2(TextEditorActivity textEditorActivity, int i2, int i3, String str) {
    }

    public static final /* synthetic */ void h2(TextEditorActivity textEditorActivity, List list) {
    }

    public static final void h3(TextEditorActivity textEditorActivity, k.i.h.b.d.b1.d.d dVar) {
    }

    public static final /* synthetic */ void i2(TextEditorActivity textEditorActivity, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2) {
    }

    public static final void i3(TextEditorActivity textEditorActivity, MenuItem menuItem, int i2) {
    }

    public static final void y2(TextEditorActivity textEditorActivity, View view) {
    }

    public static final void z2(TextEditorActivity textEditorActivity, View view) {
    }

    public final void C2() {
    }

    public final void D2() {
    }

    public final void E2() {
    }

    public final void G2() {
    }

    public final void H2(k.i.h.b.b.a.k.c[] cVarArr) {
    }

    public final void I2() {
    }

    public final void J2() {
    }

    public final void L2() {
    }

    public final void M2() {
    }

    public final f2 N2() {
    }

    public final void O2() {
    }

    @Override // k.i.h.b.d.b1.a
    public j.z.a X0() {
    }

    public final void X2() {
    }

    public final void Y2() {
    }

    public final void Z2(boolean z2) {
    }

    public final void a3() {
    }

    public final void b3() {
    }

    public final void c3(int i2) {
    }

    public final void d3() {
    }

    public final void e3() {
    }

    public final f2 f3() {
    }

    public final void g3() {
    }

    public final void init() {
    }

    public final Object j2(n.a0.d<? super Boolean> dVar) {
    }

    public final void j3(Boolean bool, Double d2, Double d3, Double d4, Double d5, k.i.h.b.b.a.k.c[] cVarArr) {
    }

    public final void k2() {
    }

    public final void k3() {
    }

    public final void l2() {
    }

    public final void l3(int i2, int i3, String str) {
    }

    public final void m2() {
    }

    public final void m3(List<? extends List<k.i.h.b.b.a.k.a>> list) {
    }

    public final void n2() {
    }

    public final void n3(boolean z2) {
    }

    public final void o2(String str, String str2, String str3) {
    }

    public final void o3(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str, String str2) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
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

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    public final void p2(String str, WxaData wxaData) {
    }

    public final void p3(boolean z2) {
    }

    public final void q2() {
    }

    public final k.i.h.b.k.m.g r2() {
    }

    public final k.i.h.b.b.a.i.a s2() {
    }

    public final k.i.h.b.b.a.i.b t2() {
    }

    public final k.i.h.b.k.r.e u2() {
    }

    public final j.a.h.b<j.a.h.a> v2() {
    }

    public final void w2() {
    }

    public final void x2() {
    }
}
