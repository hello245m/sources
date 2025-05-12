package com.tencent.mp.feature.article.edit.ui;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.tencent.mp.feature.article.edit.ui.widget.SettingOriginalView;
import com.tencent.mp.feature.base.ui.widget.MMEditText;
import k.i.h.b.b.b.s.j3;
import o.a.f2;
import o.a.t0;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
public final class PublishArticleSettingActivity extends j3 {

    /* renamed from: o, reason: collision with root package name */
    public final n.d f1164o;

    /* renamed from: p, reason: collision with root package name */
    public final n.d f1165p;

    /* renamed from: q, reason: collision with root package name */
    public final n.d f1166q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1167r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1168s;

    /* renamed from: t, reason: collision with root package name */
    public final n.d f1169t;
    public k.i.h.b.b.b.s.m3.a u;
    public final n.d v;
    public final n.d0.c.a<n.u> w;
    public k.i.h.b.d.b1.f.c x;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.b.m.j> {
        public final /* synthetic */ PublishArticleSettingActivity a;

        public a(PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        public final k.i.h.b.b.b.m.j b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.b.m.j invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.PublishArticleSettingActivity$onClickRegularPublish$1", f = "PublishArticleSettingActivity.kt", l = {758, 771}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class a0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ PublishArticleSettingActivity b;

        public a0(PublishArticleSettingActivity publishArticleSettingActivity, n.a0.d<? super a0> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.PublishArticleSettingActivity", f = "PublishArticleSettingActivity.kt", l = {805, 814, 822}, m = "checkPublish")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b extends n.a0.k.a.d {
        public Object a;
        public /* synthetic */ Object b;
        public final /* synthetic */ PublishArticleSettingActivity c;
        public int d;

        public b(PublishArticleSettingActivity publishArticleSettingActivity, n.a0.d<? super b> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.PublishArticleSettingActivity$onPreview$1", f = "PublishArticleSettingActivity.kt", l = {673, 677, 681, 695}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class b0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ PublishArticleSettingActivity b;

        public b0(PublishArticleSettingActivity publishArticleSettingActivity, n.a0.d<? super b0> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.PublishArticleSettingActivity$debouncePreloadTopics$1", f = "PublishArticleSettingActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ PublishArticleSettingActivity b;

        public c(PublishArticleSettingActivity publishArticleSettingActivity, n.a0.d<? super c> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.PublishArticleSettingActivity$saveMaterial$1", f = "PublishArticleSettingActivity.kt", l = {649}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class c0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ PublishArticleSettingActivity b;

        public c0(PublishArticleSettingActivity publishArticleSettingActivity, n.a0.d<? super c0> dVar) {
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

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.PublishArticleSettingActivity$highLightRiskView$1", f = "PublishArticleSettingActivity.kt", l = {915}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class d extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ PublishArticleSettingActivity c;

        public d(PublishArticleSettingActivity publishArticleSettingActivity, n.a0.d<? super d> dVar) {
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
    public static final class d0 extends n.d0.d.o implements n.d0.c.a<ViewModelStore> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public d0(k.i.h.b.d.b1.b bVar) {
        }

        public final ViewModelStore b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.PublishArticleSettingActivity$highlightView$1", f = "PublishArticleSettingActivity.kt", l = {971}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class e extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ PublishArticleSettingActivity b;
        public final /* synthetic */ View c;

        public e(PublishArticleSettingActivity publishArticleSettingActivity, View view, n.a0.d<? super e> dVar) {
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
    public static final class e0 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.d.d1.c> {
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

        public e0(n.d0.c.a aVar, k.i.h.b.d.b1.b bVar) {
        }

        public final k.i.h.b.d.d1.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.d.d1.c invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.PublishArticleSettingActivity$initBottomToolbar$1", f = "PublishArticleSettingActivity.kt", l = {604}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class f extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ PublishArticleSettingActivity b;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.a<n.u> {
            public final /* synthetic */ PublishArticleSettingActivity a;

            public a(PublishArticleSettingActivity publishArticleSettingActivity) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b extends n.d0.d.o implements n.d0.c.a<n.u> {
            public final /* synthetic */ PublishArticleSettingActivity a;

            public b(PublishArticleSettingActivity publishArticleSettingActivity) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class c extends n.d0.d.o implements n.d0.c.a<n.u> {
            public final /* synthetic */ PublishArticleSettingActivity a;

            public c(PublishArticleSettingActivity publishArticleSettingActivity) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class d extends n.d0.d.o implements n.d0.c.a<n.u> {
            public final /* synthetic */ PublishArticleSettingActivity a;

            public d(PublishArticleSettingActivity publishArticleSettingActivity) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class e extends n.d0.d.o implements n.d0.c.a<n.u> {
            public final /* synthetic */ PublishArticleSettingActivity a;

            public e(PublishArticleSettingActivity publishArticleSettingActivity) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public f(PublishArticleSettingActivity publishArticleSettingActivity, n.a0.d<? super f> dVar) {
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
    public static final class f0 extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.b.s.n3.g, n.u> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public f0(k.i.h.b.d.b1.b bVar) {
        }

        public final void b(k.i.h.b.b.b.s.n3.g gVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.b.s.n3.g gVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g extends n.d0.d.o implements n.d0.c.p<Integer, Integer, n.u> {
        public final /* synthetic */ k.i.h.b.b.a.q.i.d a;
        public final /* synthetic */ PublishArticleSettingActivity b;

        public g(k.i.h.b.b.a.q.i.d dVar, PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        public final void b(int i2, int i3) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(Integer num, Integer num2) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class g0 extends n.d0.d.o implements n.d0.c.a<ViewModelStore> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public g0(k.i.h.b.d.b1.b bVar) {
        }

        public final ViewModelStore b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ ViewModelStore invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h extends n.d0.d.o implements n.d0.c.l<Boolean, n.u> {
        public final /* synthetic */ k.i.h.b.b.a.q.i.d a;
        public final /* synthetic */ PublishArticleSettingActivity b;

        public h(k.i.h.b.b.a.q.i.d dVar, PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        public final void b(boolean z) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(Boolean bool) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class h0 extends n.d0.d.o implements n.d0.c.a<k.i.h.b.d.d1.c> {
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

        public h0(n.d0.c.a aVar, k.i.h.b.d.b1.b bVar) {
        }

        public final k.i.h.b.d.d1.c b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.d.d1.c invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i extends n.d0.d.o implements n.d0.c.r<Integer, Integer, Integer, String, n.u> {
        public final /* synthetic */ PublishArticleSettingActivity a;

        public i(PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        public final void b(int i2, int i3, Integer num, String str) {
        }

        @Override // n.d0.c.r
        public /* bridge */ /* synthetic */ n.u j(Integer num, Integer num2, Integer num3, String str) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class i0 extends n.d0.d.o implements n.d0.c.l<k.i.h.b.k.r.c, n.u> {
        public final /* synthetic */ k.i.h.b.d.b1.b a;

        public i0(k.i.h.b.d.b1.b bVar) {
        }

        public final void b(k.i.h.b.k.r.c cVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.k.r.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j extends n.d0.d.o implements n.d0.c.p<Integer, Integer, n.u> {
        public final /* synthetic */ PublishArticleSettingActivity a;

        public j(PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        public final void b(int i2, int i3) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ n.u invoke(Integer num, Integer num2) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.PublishArticleSettingActivity$stashArticle$1", f = "PublishArticleSettingActivity.kt", l = {591}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class j0 extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ PublishArticleSettingActivity b;

        public j0(PublishArticleSettingActivity publishArticleSettingActivity, n.a0.d<? super j0> dVar) {
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
    public static final class k implements TextWatcher {
        public final /* synthetic */ PublishArticleSettingActivity a;

        public k(PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class l extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.b.l.e, n.u> {
        public final /* synthetic */ k.i.h.b.b.a.q.i.d a;
        public final /* synthetic */ PublishArticleSettingActivity b;

        public l(k.i.h.b.b.a.q.i.d dVar, PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        public final void b(k.i.h.b.b.b.l.e eVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.b.l.e eVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class m extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.b.l.c, n.u> {
        public final /* synthetic */ k.i.h.b.b.a.q.i.d a;
        public final /* synthetic */ PublishArticleSettingActivity b;

        public m(k.i.h.b.b.a.q.i.d dVar, PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        public final void b(k.i.h.b.b.b.l.c cVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.b.l.c cVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class n extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.b.l.i, n.u> {
        public final /* synthetic */ k.i.h.b.b.a.q.i.d a;
        public final /* synthetic */ PublishArticleSettingActivity b;

        public n(k.i.h.b.b.a.q.i.d dVar, PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        public final void b(k.i.h.b.b.b.l.i iVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.b.l.i iVar) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class o extends n.d0.d.o implements n.d0.c.l<k.i.h.b.b.b.l.g, n.u> {
        public final /* synthetic */ k.i.h.b.b.a.q.i.d a;
        public final /* synthetic */ PublishArticleSettingActivity b;

        public o(k.i.h.b.b.a.q.i.d dVar, PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        public final void b(k.i.h.b.b.b.l.g gVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ n.u invoke(k.i.h.b.b.b.l.g gVar) {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.PublishArticleSettingActivity$initOriginalView$1$5", f = "PublishArticleSettingActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class p extends n.a0.k.a.l implements n.d0.c.l<n.a0.d<? super String>, Object> {
        public int a;
        public final /* synthetic */ k.i.h.b.b.a.q.i.d b;
        public final /* synthetic */ SettingOriginalView c;

        public p(k.i.h.b.b.a.q.i.d dVar, SettingOriginalView settingOriginalView, n.a0.d<? super p> dVar2) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(n.a0.d<?> dVar) {
        }

        public final Object g(n.a0.d<? super String> dVar) {
        }

        @Override // n.d0.c.l
        public /* bridge */ /* synthetic */ Object invoke(n.a0.d<? super String> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class q extends n.d0.d.o implements n.d0.c.a<String> {
        public final /* synthetic */ k.i.h.b.b.a.q.i.d a;
        public final /* synthetic */ SettingOriginalView b;

        public q(k.i.h.b.b.a.q.i.d dVar, SettingOriginalView settingOriginalView) {
        }

        public final String b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ String invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class r extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ PublishArticleSettingActivity a;

        public r(PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class s extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ PublishArticleSettingActivity a;

        public s(PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class t implements TextWatcher {
        public final /* synthetic */ PublishArticleSettingActivity a;

        public t(PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class u extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ PublishArticleSettingActivity a;

        public u(PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.PublishArticleSettingActivity$initializeDataAndView$1", f = "PublishArticleSettingActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class v extends n.a0.k.a.l implements n.d0.c.p<String, n.a0.d<? super n.u>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ PublishArticleSettingActivity c;

        public v(PublishArticleSettingActivity publishArticleSettingActivity, n.a0.d<? super v> dVar) {
        }

        @Override // n.a0.k.a.a
        public final n.a0.d<n.u> create(Object obj, n.a0.d<?> dVar) {
        }

        public final Object g(String str, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.d0.c.p
        public /* bridge */ /* synthetic */ Object invoke(String str, n.a0.d<? super n.u> dVar) {
        }

        @Override // n.a0.k.a.a
        public final Object invokeSuspend(Object obj) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class w extends n.d0.d.o implements n.d0.c.a<n.u> {
        public final /* synthetic */ PublishArticleSettingActivity a;

        public w(PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ n.u invoke() {
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class x extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.b.p.u> {
        public final /* synthetic */ PublishArticleSettingActivity a;

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class a extends n.d0.d.o implements n.d0.c.p<k.i.h.d.b, Integer, n.u> {
            public final /* synthetic */ PublishArticleSettingActivity a;

            public a(PublishArticleSettingActivity publishArticleSettingActivity) {
            }

            public final void b(k.i.h.d.b bVar, int i2) {
            }

            @Override // n.d0.c.p
            public /* bridge */ /* synthetic */ n.u invoke(k.i.h.d.b bVar, Integer num) {
            }
        }

        /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
        public static final class b extends n.d0.d.o implements n.d0.c.a<n.u> {
            public final /* synthetic */ PublishArticleSettingActivity a;

            public b(PublishArticleSettingActivity publishArticleSettingActivity) {
            }

            @Override // n.d0.c.a
            public /* bridge */ /* synthetic */ n.u invoke() {
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public x(PublishArticleSettingActivity publishArticleSettingActivity) {
        }

        public final k.i.h.b.b.b.p.u b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.b.p.u invoke() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class y extends n.d0.d.o implements n.d0.c.a<k.i.h.b.b.a.q.f> {
        public static final y a = null;

        public final k.i.h.b.b.a.q.f b() {
        }

        @Override // n.d0.c.a
        public /* bridge */ /* synthetic */ k.i.h.b.b.a.q.f invoke() {
        }
    }

    @n.a0.k.a.f(c = "com.tencent.mp.feature.article.edit.ui.PublishArticleSettingActivity$onClickNormalPublish$1", f = "PublishArticleSettingActivity.kt", l = {721, 732}, m = "invokeSuspend")
    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_1.dex */
    public static final class z extends n.a0.k.a.l implements n.d0.c.p<t0, n.a0.d<? super n.u>, Object> {
        public int a;
        public final /* synthetic */ PublishArticleSettingActivity b;
        public final /* synthetic */ int c;

        public z(PublishArticleSettingActivity publishArticleSettingActivity, int i2, n.a0.d<? super z> dVar) {
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

    public static final void O2(PublishArticleSettingActivity publishArticleSettingActivity, MMEditText mMEditText, View view, boolean z2) {
    }

    public static final void Q2(PublishArticleSettingActivity publishArticleSettingActivity, int i2) {
    }

    public static final void U2(PublishArticleSettingActivity publishArticleSettingActivity, MMEditText mMEditText, View view, boolean z2) {
    }

    public static final boolean V2(View view, MotionEvent motionEvent) {
    }

    public static final /* synthetic */ Object W1(PublishArticleSettingActivity publishArticleSettingActivity, n.a0.d dVar) {
    }

    public static final boolean W2(PublishArticleSettingActivity publishArticleSettingActivity, View view, MotionEvent motionEvent) {
    }

    public static final /* synthetic */ void X1(PublishArticleSettingActivity publishArticleSettingActivity, boolean z2) {
    }

    public static final /* synthetic */ void Y1(PublishArticleSettingActivity publishArticleSettingActivity, EditText editText) {
    }

    public static final /* synthetic */ n.d0.c.a Z1(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static final /* synthetic */ k.i.h.b.k.r.c a2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static final void a3(PublishArticleSettingActivity publishArticleSettingActivity, k.i.h.b.h.a.a.d.a.b bVar) {
    }

    public static final /* synthetic */ k.i.h.b.b.b.s.n3.g b2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static final /* synthetic */ k.i.h.b.b.a.q.f c2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static /* synthetic */ void c3(k.i.h.b.b.b.m.f0 f0Var, View view) {
    }

    public static final /* synthetic */ void d2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static /* synthetic */ void d3(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static final /* synthetic */ void e2(PublishArticleSettingActivity publishArticleSettingActivity, k.i.h.b.b.a.o.f fVar) {
    }

    public static /* synthetic */ void e3(DialogInterface dialogInterface, int i2) {
    }

    public static final /* synthetic */ void f2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static /* synthetic */ boolean f3(View view, MotionEvent motionEvent) {
    }

    public static final /* synthetic */ void g2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static /* synthetic */ void g3(PublishArticleSettingActivity publishArticleSettingActivity, int i2) {
    }

    public static final /* synthetic */ f2 h2(PublishArticleSettingActivity publishArticleSettingActivity, int i2) {
    }

    public static /* synthetic */ boolean h3(PublishArticleSettingActivity publishArticleSettingActivity, View view, MotionEvent motionEvent) {
    }

    public static final /* synthetic */ f2 i2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static /* synthetic */ void i3(k.i.h.b.b.a.q.i.d dVar, PublishArticleSettingActivity publishArticleSettingActivity, boolean z2) {
    }

    public static final /* synthetic */ f2 j2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static /* synthetic */ void j3(PublishArticleSettingActivity publishArticleSettingActivity, MMEditText mMEditText, View view, boolean z2) {
    }

    public static final /* synthetic */ f2 k2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static /* synthetic */ void k3(PublishArticleSettingActivity publishArticleSettingActivity, k.i.h.b.h.a.a.d.a.b bVar) {
    }

    public static final /* synthetic */ void l2(PublishArticleSettingActivity publishArticleSettingActivity, boolean z2) {
    }

    public static /* synthetic */ void l3(PublishArticleSettingActivity publishArticleSettingActivity, MMEditText mMEditText, View view, boolean z2) {
    }

    public static final /* synthetic */ void m2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static /* synthetic */ void m3(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static final /* synthetic */ void n2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static final /* synthetic */ void o2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static final /* synthetic */ void p2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static final /* synthetic */ void q2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static final void s2(DialogInterface dialogInterface, int i2) {
    }

    public static /* synthetic */ void u2(PublishArticleSettingActivity publishArticleSettingActivity, boolean z2, int i2, Object obj) {
    }

    public static final void v3(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static final void w2(PublishArticleSettingActivity publishArticleSettingActivity) {
    }

    public static final void y3(k.i.h.b.b.b.m.f0 f0Var, View view) {
    }

    public static final void z3(k.i.h.b.b.a.q.i.d dVar, PublishArticleSettingActivity publishArticleSettingActivity, boolean z2) {
    }

    public final k.i.h.b.b.b.s.n3.g A2() {
    }

    public final void A3() {
    }

    public final k.i.h.b.b.a.q.f B2() {
    }

    public final void B3() {
    }

    public final void C2() {
    }

    public final void C3() {
    }

    public final void D2(k.i.h.b.b.a.o.f fVar) {
    }

    public final void E2() {
    }

    public final void F2() {
    }

    public final void G2() {
    }

    public final f2 H2(View view) {
    }

    public final void I2() {
    }

    public final f2 J2() {
    }

    public final void K2() {
    }

    public final void L2() {
    }

    public final void M2() {
    }

    public final void N2() {
    }

    public final void P2() {
    }

    public final void R2() {
    }

    public final void S2() {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void T2() {
    }

    public final void X2() {
    }

    public final void Y2() {
    }

    public final void Z2() {
    }

    public final void b3() {
    }

    public final f2 n3(int i2) {
    }

    public final f2 o3() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // k.i.h.b.b.b.s.j3, k.i.h.b.d.b1.b, k.i.h.b.d.b1.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, j.g.j.h, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // k.i.h.b.d.b1.b, j.b.k.d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // k.i.h.b.d.b1.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    public final void p3(int i2) {
    }

    public final f2 q3() {
    }

    public final Object r2(n.a0.d<? super Boolean> dVar) {
    }

    public final f2 r3() {
    }

    public final void s3() {
    }

    public final void t2(boolean z2) {
    }

    public final void t3(MMEditText mMEditText, int i2) {
    }

    public final void u3() {
    }

    public final void v2(EditText editText) {
    }

    public final void w3() {
    }

    public final k.i.h.b.b.b.m.j x2() {
    }

    public final void x3() {
    }

    public final k.i.h.b.b.b.p.u y2() {
    }

    public final k.i.h.b.k.r.c z2() {
    }
}
